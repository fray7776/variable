/**
 * 
 */

function showPage1() {
	let doc = xhtp.responseXML;
	console.log(doc);
	let data = doc.getElementsByTagName('record');
	console.log(data);
	let tableTag = document.createElement('table');
	tableTag.setAttribute('border', '1');

	//title tr
	//data tr => [배열]을 사용
	let headerTr = titleRow(data);
	let dataTrs = contentRow(data);
	tableTag.appendChild(headerTr);
	for (let i = 0; i < dataTrs.length; i++) {
		tableTag.appendChild(dataTrs[i]);
	}
	document.getElementById('show').appendChild(tableTag);
}

function titleRow(result) {
	console.log(result[1].childNodes[0].nodeName)
	let trTag = document.createElement('tr');
	
	for (let i = 0; i < result[0].childNodes.length; i++) {
		let tdTag = document.createElement('th');
		let textNode = document.createTextNode(result[0].childNodes[i].nodeName.toUpperCase());
		tdTag.appendChild(textNode);
		trTag.appendChild(tdTag);
	}
	trTag.appendChild(tdTag);
	return trTag;

}

function contentRow(result) {
	let trTags = [];
	
	for (let j = 0; j < result.length; j++) {
		let trTag = document.createElement('tr');
		
		trTag.onmouseover = function() {
			this.style.background = 'purple';
		}
		trTag.onmouseout = function() {
			this.style.background = 'none';
		}

		for (let i = 0; i < result[j].childNodes.length; i++) {
			let tdTag = document.createElement('td');
			let textNode = document.createTextNode(result[j].childNodes[i].firstChild.nodeValue);
			tdTag.appendChild(textNode);
			trTag.appendChild(tdTag);
		}
		let button = document.createElement('button');
		button.innerHTML = '삭제';
		button.onclick = function() {
			console.log(this.parentNode.parentNode.remove());
			let id = this.parentNode.parentNode.childNodes[0].firstChild.nodeValue;
			let req = new XMLHttpRequest();
			req.open('get', '../DeleteEmpServ?empId=' + id);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
			}
		}
		button.onmouseover = function() {
			this.style.background='yellow';
		}
		button.onmouseout = function() {
			this.style.background='none';
		}
		/*mouseover*/

		let tdTag = document.createElement('td');
		tdTag.appendChild(button);
		trTag.appendChild(tdTag);

		trTags.push(trTag);
	}
	return trTags;


}