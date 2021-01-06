/**
 * 
 */

function showPage() {
	let doc = xhtp.responseXML;
	console.log(doc);
	let data = doc.getElementsByTagName('record');
	console.log(data);
	let tableTag= document.createElement('table');
	tableTag.setAttribute('border','1');
	
	//title tr
	//data tr => [배열]을 사용
	let headerTr = titleRow(data);
	let dataTrs= contentRow(data);
	tableTag.appendChild(headerTr);
	for(let i=0; i<dataTrs.length; i++){
		tableTag.appendChild(dataTrs[i]);
	} 
	document.getElementById('show').appendChild(tableTag);
}

function titleRow(data) {
console.log(data[1].childNodes[0].nodeName)
	let trTag = document.createElement('tr');
	for(let i=0; i<data[0].childNodes.length; i++){
		let tdTag = document.createElement('td');
		let textNode = document.createTextNode(data[0].childNodes[i].nodeName.toUpperCase());
		tdTag.appendChild(textNode);
		trTag.appendChild(tdTag);
	}
	
	return trTag;
	
}

function contentRow(result) {
	let trTags = [];
    for(let j=0; j<result.length; j++){
	    let trTag = document.createElement('tr');
	for(let i=0; i<result[j].childNodes.length; i++){
		let tdTag = document.createElement('td');
		let textNode = document.createTextNode(result[j].childNodes[i].firstChild.nodeValue);
		tdTag.appendChild(textNode);
		trTag.appendChild(tdTag);
	}
	trTags.push(trTag);
	}
	return trTags;
	
	 
}