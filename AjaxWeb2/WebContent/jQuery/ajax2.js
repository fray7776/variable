$(document).ready(function () {
    $.ajax({
        url: '../data/MOCK_DATA.json',
        dataType: 'json',
        success: showContent,
        error: function (result) {
            console.log('에러: ' + result.statusText);
        }
    });
    //button 클릭 이벤트
    $('#btn').on('click', function () {
        $('input:checked').parent().parent().remove(); //$('input : checked').parent()-->td   
        //$('input : checked').parent().parent();->tr
        //'input :checked -->input을 뛰우면 input의 하위요소를 말함. 띄어쓰기 주의!
    });
    //all check 클릭 이벤트.(라이브 이벤트방식)
    $('body').on('click', '#all_check', function () {
        console.log('checked');
        if ($('#all_check').is(":checked"))
            $('td>input').prop('checked', true);
        else ('td>input').prop('checked', false);
    })

});


function showContent(result) {
    let headers = ['chkbox', 'id', 'first_name', 'last_name', 'email'];
    let data = result;
    let table = $('<table id="tbl" />').attr('border', '1');
    let titles = $('<tr />');
    for (field of headers) {
        let td = $('<th />').html(field.replace('_', ' ').toUpperCase());
        titles.append(td);
    }
    table.append(titles);

    $(data).each(function (idx, obj) {
        if (idx < 5) {
            let tr = $('<tr />');
            
            $(tr).attr('id', obj.id);
            console.log(obj)
            $(tr).on({
                'mouseover': function () {
                    $(this).css('background-color', 'yellow')
                },
                'mouseout': function () {
                    $(this).css('background-color', '')
                }
            });

            for (field of headers) {
                console.log(field+val);
                let td = $('<td />');
                if (field == 'chkbox') {  //field값이 chkbox를 만나면...
                    let checkbox = $('<input />').attr('type', 'checkbox');
                    td.attr('align', 'center');
                    td.append(checkbox);
                } else {
                    td = $('<th />').html(field.replace('_', ' ').toUpperCase());
                };
                tr.append(td);
            }
            table.append(tr);
        }
    });
    $('#show').append(table);
    }