// document.getElementById("studentLink").addEventListener('click', (event) =>{
//     event.preventDefault();
//
//     fetch(
//         "/main/page/students", {
//             method:"GET",
//             headers: {
//                 'Content-type': 'application/json'
//             },
//         })
//         .then(res => res.json())
//         .then(data =>{
//             updateTable(data);
//         })
//         .catch(err =>{
//             console.error("Failed to get students", err);
//         });
// });
//
// let updateTable = (data) =>{
//     let tableBody = document.getElementById('studentsTable').getElementsByTagName('tbody')[0];
//
//     // Clear existing rows
//     tableBody.innerHTML = '';
//
//     data.forEach(function(student) {
//         var row = tableBody.insertRow(tableBody.rows.length);
//         var cell1 = row.insertCell(0);
//         var cell2 = row.insertCell(1);
//
//         cell1.innerHTML = student.id;
//         cell2.innerHTML = student.name;
//     });
// }