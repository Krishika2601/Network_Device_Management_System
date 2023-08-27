package com.network_device.device;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class Device_Controller {
@Autowired    
private DeviceRepository deviceRepository;     
@GetMapping
public Iterable<NetworkDevice> getAllDevices() {
    return deviceRepository.findAll();
}     
@PostMapping("/add-device")    
public void addDevices(@RequestBody NetworkDevice networkDevice)  
{    
	deviceRepository.save(networkDevice);    
}  
@GetMapping("/by_device_Type/{deviceType}")
public List<NetworkDevice> findDevicesByDeviceType(@PathVariable String deviceType) {
    return deviceRepository.findByDeviceType(deviceType);
}
@GetMapping("/by_name/{name}")
public List<NetworkDevice> findDevicesByName(@PathVariable String name) {
    return deviceRepository.findByName(name);
}
@GetMapping("/by_brand_name/{brand}")
public List<NetworkDevice> findDevicesByBrandName(@PathVariable String brand){
	return deviceRepository.findByBrand(brand);
}
@GetMapping("/{id}")
public ResponseEntity<NetworkDevice> getDeviceById(@PathVariable Integer id) {
    Optional<NetworkDevice> deviceOptional = deviceRepository.findById(id);
    if (deviceOptional.isPresent()) {
        return ResponseEntity.ok(deviceOptional.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDeviceById(@PathVariable Integer id) {
        Optional<NetworkDevice> deviceOptional = deviceRepository.findById(id);
        
        if (deviceOptional.isPresent()) {
            deviceRepository.deleteById(id);
            return ResponseEntity.ok( id + " deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
     @PutMapping("/update/{id}")
        public ResponseEntity<NetworkDevice> updateDevice(@PathVariable Integer id, @RequestBody NetworkDevice updatedDevice) {
            Optional<NetworkDevice> deviceOptional = deviceRepository.findById(id);
            
            if (deviceOptional.isPresent()) {
                NetworkDevice device = deviceOptional.get();
                device.setDeviceType(updatedDevice.getDeviceType());
                device.setName(updatedDevice.getName());
                device.setPrice(updatedDevice.getPrice());
                device.setVersion(updatedDevice.getVersion());
                device.setBrand(updatedDevice.getBrand());
                
                deviceRepository.save(device);
                
                return ResponseEntity.ok(device);
            } else {
                return ResponseEntity.notFound().build();
            }
     }
 @GetMapping("/statistics")
     public Map<String, Object> getStatistics() {
       long totalDevices = deviceRepository.count();
         Map<String, Object> statistics = new HashMap<>();
          statistics.put("totalDevices", totalDevices);
           return statistics;
 }
 
 @GetMapping("/countByBrand/{brandName}")
 public ResponseEntity<Long> getDeviceCountByBrand(@PathVariable String brandName) {
     long count = deviceRepository.countByBrand(brandName);
     return ResponseEntity.ok(count);
 }

  

}


