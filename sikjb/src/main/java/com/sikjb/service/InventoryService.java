package com.sikjb.service;

import com.sikjb.model.*;
import java.util.List;

public interface InventoryService {
		
		List<Inventory> listInventory();
		
		Inventory saveOrUpdate(Inventory inventory);
		
		Inventory getInventoryById(Long inventoryId);

		void deleteInventoryById(Long inventoryId);
		
	}


