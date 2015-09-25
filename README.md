Maus
====
Use your Android phone as a wireless mouse for your PC.  
#### How it works  
Maus uses a combination of accellerometer readings and camera input to interpret the movement of your android device.
A python script running on your personal computer assumes the role of a peripheral/slave under BLE blue-tooth protocol and listens for mouse action data streaming from an Android device.  
Informed by the data streamed from the android device,the script updates the cursor's position, and clicks when appropriate.

#### How Sensor Data is Mapped to Mouse movements.  
Maus uses an RNN model to map accelerometer data to mouse x deltas and y deltas. 

#### Phase 1 : Collecting Training Data. Collecting testing Data  
A rig will be set up that collects accelerometer data and pairs it with a timestamp. A rig will be set up that collects mouse positions and pairs them with with a timestamp. The mouse and phone will be connected via 3d printed case I'm developing.  
The two training data-sets will then match XYZ accellerometer readings with mouse pointer position information(Z is necessary for mouse lifts).   

#### Phase 2: Defining RNN architecture  
This phase is dependent on my knowledge of RNN systems. Since I've only read about gradient descent algorithms for RNNs, as well various architectures for RNN's but have never implemented any....  This phase will involve the iterative development of my architecture. There is no clear plan for implementation here.  Bayesian model averaging would be kind of cool to play around with.  

#### Phase 3: Testing RNN architecture.  
I test indivual architectures against recorded data. Repeat step 2 as necessary.  

#### Phase 4: Streaming accelerometer data to PC
This is an excersize best left to the open source community or a future version of myself

#### Phase 5: Creating a generalized platform for training.  
See title.
