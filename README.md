# Processing InteliJ Template Project

This project contains the boilerplate code to create a Processing Sketch on Intelij. It only requires the machine has Java installed, but Processing is not necessary, since all necessary libraries are included in the project

There are two examples:
 - StandardSketch: basic sketch launched using PApplet.main(...)
 - AdvancedSketch: sketch with input parameters and static launcher using runSketch(...)

## How To Use

 - Clone or download the project
 - Open the project with InteliJ
 - Tools > Save Project As Template
 - File > New > Project...
 - User Defined
 
## Support Libraries

The P2D renderer only needs the Process Core library, but the P3D renderer needs OpenGL libraries. All necessary libraries for all Processing compatible OSs are in the *lib/* and have all been to the PATH. Remove the ones not necessary for your OS.
For example, for Windows x64 you will need: 
 - core.jar
 - gluegen-rt.jar
 - gluegen-rt-natives-windows-amd64.jar
 - jogl-all.jar
 - jogl-all-natives-windows-amd64.jar
