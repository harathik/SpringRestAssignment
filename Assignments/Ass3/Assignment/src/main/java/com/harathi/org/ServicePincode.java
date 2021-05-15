package com.harathi.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.harathiii.Pincode;
@Service
public class ServicePincode implements ServicePin {
	
	List<Pincode> pin;

	public ServicePincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(385534,"wg","Jawahar","India"));
		pin.add(new Pincode(354568,"gtr","guntur","India"));
		pin.add(new Pincode(567887,"vzngm","palasa","India"));
		pin.add(new Pincode(677898,"sklm","rajam","India"));
		pin.add(new Pincode(754787,"vz","gajuwaka","India"));
		pin.add(new Pincode(768874,"Vij","Benzcircle","India"));
		pin.add(new Pincode(798746,"Tirupathi","patelpuram","India"));
		pin.add(new Pincode(895634,"RJ","Poojanagar","India"));
		pin.add(new Pincode(686767,"MH","tulasai nagar","India"));
		pin.add(new Pincode(787766,"HP","kabela","India"));
		pin.add(new Pincode(520007,"BI","autonagar","India"));		
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
