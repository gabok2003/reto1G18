function validarexistencia(){
var datos={
        email:$("#correo").val(),
        name:$("#nombre").val(),
        password:$("#contrasena").val(),
    }

    // Convertimos a JSON
    let datosPeticion=JSON.stringify(datos);
    let correo = $("#correo").val;
    //Hacemos petición Ajax
    $.ajax({
        url:"http://localhost:8080/api/user/"+$("#correo").val(),
        type:'GET',
        dataType:'json',
        
        success:function(respuesta){
            console.log("Actualizado");
            if(respuesta){alert("No fue posible crear la cuenta"); alert("El correo ya existe")}
            else{agregar();}
        },
        error:function(xhr, status){
            console.log(status);
        }

    });

}

function agregar(){
    //capturar valores de los campos en el documento html 
let contrasena=$("#contrasena").val();
let contrasena2=$("#contrasena2").val();
var datos
if(contrasena==contrasena2){
    datos={
        email:$("#correo").val(),
        name:$("#nombre").val(),
        password:$("#contrasena").val(),       
    }

    // Convertimos a JSON
    let datosPeticion=JSON.stringify(datos);

    //Hacemos petición Ajax
    $.ajax({
        url:"http://localhost:8080/api/user/new",
        data: datosPeticion,
        type:'POST',
        contentType:"application/JSON",

        success:function(respuesta){
            console.log("Insertado");
            alert("Cuenta creada correctamente")
        },
        error:function(xhr, status){
            console.log(status);
        }

    });
}else { alert("Las contraseñas no coinciden")}

}

function validacionAgregar(){
    
    

}