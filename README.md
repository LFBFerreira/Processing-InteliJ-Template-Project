# Processing InteliJ Template Project

This project contains the boilerplate code to create a Processing Sketch on Intelij. It only requires the machine has Java installed, but Processing itself is not necessary, since all libraries are included in the project

There are two ways to start the sketch:
 - StandardSketch: basic sketch launched using PApplet.main(...)
 - AdvancedSketch: static launcher using runSketch(...) that allows you to have several input parameters of any type

## How To Use

### Save the Template
 - Clone or download the project
 - Open the project with InteliJ
 - Tools > Save Project As Template
 - Name: "Processing InteliJ Template"
 
### Use the Template
 - File > New > Project...
 - User Defined
 - "Processing InteliJ Template"
 
## Support Libraries

The P2D renderer only needs the Processing Core library, but the P3D renderer also needs the OpenGL libraries. All necessary libraries for all Processing compatible OSs are in the *lib/* folder and have all been added to the PATH. Remove the ones that not necessary for your OS. For example, for Windows x64 you will need: 
 - core.jar
 - gluegen-rt.jar
 - gluegen-rt-natives-windows-amd64.jar
 - jogl-all.jar
 - jogl-all-natives-windows-amd64.jar

### Processing version: 3.5.3
