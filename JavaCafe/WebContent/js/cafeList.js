

$(function(){

	$.ajax({
		url:'../GetProdList',
		dataType: 'json',
		success: showContents,
		error: showErrors
	});
})


function showErrors(result) {
	console.log(result);
}

function showContents(result) {
	console.log(result); //product table의 배열!!
	let data = result;
	for(val of data) {
		console.log(val.item_no, val.price);
		//let db_value;
	let div1 = $('<div />').addClass("col-lg-4 col-md-6 mb-4");
	let div2 = $('<div />').addClass("card h-100");
	let elem_1, elem_2, elem_3;
	// 첫번째 자식요소
	elem_1 = $('<a />').attr('href', val.link);
	let e1_img = $('<img />').attr('src', '../images/' + val.image).attr('alt', val.alt);
	e1_img.addClass("card-img-top");
	elem_1.append(e1_img);
	div2.append(elem_1);

	//두번째 자식요소
	elem_2 = $('<div />').addClass("card-body");
	let e2_h4 = $('<h4 />').addClass("card-title").html(val.item);
	let e2_a = $('<a />').attr('href', val.item_no).html(val.item_no);
	e2_h4.append(e2_a);
	elem_2.append(e2_h4);
	let e2_h5 = $('<h5 />').html(val.price);
	elem_2.append(e2_h5);
	let e_p = $('<p />').addClass("card-text").html(val.content);
	elem_2.append(e_p);
	div2.append(elem_2);

	//세번째 자식요소
	elem_3 = $('<div />').addClass("card-footer");
	let star = '';
	for (let i=0; i<val.like_it; i++){
		star += '&#9733;';
	}
	let e3_small = $('<small />').addClass("text-muted").html(star);
	elem_3.append(e3_small);
	div2.append(elem_3);

	div1.append(div2);

	$(".col-lg-9 .row").append(div1);
	}
	
}