
# Componente MyNavigableLabel para Java Swing

## Descripción
Este componente de Java Swing proporciona un `JLabel` mejorado con capacidades de navegación entre imágenes y zoom interactivo. Está diseñado para ser fácilmente integrado en cualquier aplicación Java Swing, como parte de un `JFrame` o `JDialog`.

El componente incluye principalmente dos clases, `MyLabel` para manejar las funcionalidades de la etiqueta y `MyNavigableLabel` para la navegación y el zoom de imágenes.

## Usos
1. **Galerías de Imágenes**: Ideal para aplicaciones que requieren navegación interactiva entre imágenes.
2. **Educación**: Utilizado en aplicaciones educativas para explorar detalles de imágenes o gráficos.
3. **Interfaces Interactivas**: Aumenta la interactividad en aplicaciones que requieren manipulación dinámica de elementos visuales.

## Características
- Navegación y zoom sobre imágenes.
- Interacción mediante botones para avanzar o retroceder entre imágenes.
- Efectos visuales al interactuar con el mouse.

## Requisitos
- Java JDK 8 o superior.
- IDE con soporte para Swing (ejemplo, NetBeans o IntelliJ IDEA).

## API
### MyLabel
#### Descripción
`MyLabel` extiende `JLabel` añadiendo funcionalidad de zoom y eventos de mouse para cambiar dinámicamente su apariencia y tamaño.
#### Métodos
- `setZoomFactor(double)`: Ajusta el factor de zoom del label.
- `updateSize()`: Actualiza el tamaño del label según el zoom.

### MyNavigableLabel
#### Descripción
`MyNavigableLabel` gestiona un conjunto de imágenes con botones para navegar entre ellas y aplicar zoom.
#### Métodos
- `setImages(List<ImageIcon>)`: Establece las imágenes a mostrar.
- `showNextImage()`: Muestra la siguiente imagen.
- `showPreviousImage()`: Muestra la imagen anterior.

## Instalación
Para utilizar este componente en tu proyecto, sigue estos pasos:
1. Clona el repositorio con el siguiente comando:
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
   ```
2. Importa el proyecto en tu IDE preferido y asegúrate de que se compila sin errores.

## Uso
Añade el componente a tu paleta de componentes en el IDE y úsalo arrastrando a tus formularios Swing. Configura los botones y las imágenes según tu necesidad.

## Contribuir
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama para tu característica o corrección de errores.
3. Haz tus cambios.
4. Envía un pull request.

## Video en YouTube

https://www.youtube.com/watch?v=p3q0atKoeZQ&t=287s

## Autores
- [Emmanuel Jesus Ramirez Martinez] - *Desarrollador del proyecto* - [Contacto]((https://github.com/Emmanuel548))
- [Alexander Juárez Pacheco] - *Desarrollador del proyecto* - [Contacto]((https://github.com/jsbdvsdbvhsdvjh))

## Agradecimientos
- Gracias a todos los que contribuyeron a este proyecto.
- A nuestros profesores por su guía y apoyo.

---
