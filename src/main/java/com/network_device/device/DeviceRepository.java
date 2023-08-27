package com.network_device.device;
import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviceRepository extends CrudRepository<NetworkDevice,Integer> {
List <NetworkDevice> findByName(String name);
List<NetworkDevice> findByBrand(String brand);
List<NetworkDevice> findByDeviceType(String deviceType);
long countByBrand(String brandName);
}
