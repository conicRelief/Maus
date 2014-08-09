Maus
====
Use your Android phone as a wireless mouse for your PC.  
#### How it works  
Maus uses a combination of accellerometer readings and camera input to interpret the movement of your android device.
A python script running on your personal computer assumes the role of a peripheral/slave under BLE blue-tooth protocol and listens for mouse action data streaming from an Android device.  
Informed by the data streamed from the android device,the script updates the cursor's position, and clicks when appropriate.
#### Where the project is now.  
☑ Basic UI  
☐ Basic Android Device to Script Communication    
☐ Scaffolding for mouse-events. Able to send fake data to control mouse.  
☐ Accelerometer data is read from device and filtered.  
☐ Image feed can be read from device and interpreted.    
