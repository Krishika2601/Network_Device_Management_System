# Network Device Management System

The Network Device Management System allows users to add, view, update, and delete network devices. It also provides various statistics related to the device data.

## Description
Description: Developed a network device management system using Java Spring Boot. Used Mysql for the database connectivity.


## Features
- Create APIs for adding and fetching list of devices with basic
  information (name, brand, deviceType).
- Create an API for fetching the entire information about a selected
   device.
- Include API for users to update existing device information.
- Include API for users to delete devices.
- Create APIs to fetch statistics related to the device data.
  

## Postman APIs:

*List All Devices*
![Screenshot 1](/images/List_All_Devices.jpeg)

*List Devices by name*
![Screenshot 1](/images/List_Details_by_Name.jpeg)
*List Devices by ID*
![Screenshot 1](/images/List_Details_by_ID.jpeg)
*List Devices by deviceType*
![Screenshot 1](/images/List_Details_By_DeviceType.jpeg)
*List All Devices by Brand*
![Screenshot 1](/images/List_Details_BY_Brand.jpeg)
*Statics: Total Devices*
![Screenshot 1](/images/Total_Number_of_count.jpeg)


*Statics: Count By Brand*
![Screenshot 1](/images/Count_By_Brand.jpeg)


*Post:Create a device*
![Screenshot 1](/images/Create_A_Device.jpeg)


*PUT: Update a Device*
![Screenshot 1](/images/Update_A_Device.jpeg)


*Delete: Delete a Device by ID*
![Screenshot 1](/images/Delete_A_Device.jpeg)




## Installation

1. Clone this repository.
2. Open the project in your favorite IDE.
3. Configure MySQL at port 3306, and update application.properties with your database value
4. Build and run the project.

## Usage

1. Access the application at `http://localhost:9090/device`.
2. Use the provided APIs to interact with the application.


