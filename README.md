# Unidad C4 Ex2
Ejercicio EX2 de la unidad C4 - Desarrollo Back-End realizada el 2023-04-20 en el BootCamp de T-Systems.

# API Spring
![image](https://user-images.githubusercontent.com/89463715/233834968-0472d156-8a5c-44f0-95cf-17cbe1699ac6.png)

Se crea una API para una aplicación de odontología dónde los clientes se pueden registrar y solicitar citas con especialistas.

# Requisitos
Desde el departamento de producto nos piden crear el backend correspondiente al sistema de gestión de citas para una Clínica Dental.

Para ello el cliente deberá ser capaz de registrarse en la aplicación, hacer login & logout y acceder a su área de cliente, todo ello visualmente desde el navegador.(*** en este punto el registro y login no son necesarios) En su área de cliente deberá poder ver una lista de las citas que tiene a futuro, crear citas, modificarlas y anularlas.

También existirá una zona de usuario con sus datos personales, que solo podrá ver él mismo. Además, los dentistas deberán poder registrarse como profesionales, hacer login y logout y ver todas las citas y clientes registrados.

Teniendo en cuenta los requisitos, llegamos a la conclusión de que este sería el mínimo de endpoints convenientes:

- Perfil de usuario
- Modificación de datos del perfil
- Creación de citas
- Modificación de citas
- Anulación de citas
- Ver todas las citas que tengo como cliente (solo las propias)
- Ver todas las citas existentes (como dentista)
- Ver todos los clientes registrados (como dentista)

## EXTRAS
- Ver una cita en detalle
- Elegir médico en la cita
- Como médico, poder ver solo mis citas
- Añadir tipos de intervención / consulta a las citas

