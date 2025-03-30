document.addEventListener("DOMContentLoaded", function() {
    $("#form1").hide();

    const form1 = document.getElementById("form1");
    const form2 = document.getElementById("form2");
    
    let formData = {};

    form1.addEventListener("submit", function(event) {
        event.preventDefault();
    
        formData.firstName = document.getElementById("firstName").value;
        formData.lastName = document.getElementById("lastName").value;
    
        $("#form1").hide();
        $("#form2").show();
    })
    
    form2.addEventListener("submit", function(event) {
    
    })

    const fileInputs = document.querySelectorAll('input[type="file"]');
    fileInputs.forEach(function(fileInput) {
        const fileNameSpan = document.getElementById(fileInput.id + "Name");

        fileInput.addEventListener("change", function() {
            fileNameSpan.textContent = this.files.length > 0 ? this.files[0].name : "No file chosen";
        })
    })
})