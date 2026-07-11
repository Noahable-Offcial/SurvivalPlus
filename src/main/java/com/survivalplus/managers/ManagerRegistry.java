package com.survivalplus.managers;

import java.util.ArrayList;
import java.util.List;

public class ManagerRegistry {

    private final List<Manager> managers = new ArrayList<>();

    /**
     * Register a manager
     */
    public void register(Manager manager) {
        managers.add(manager);
    }

    /**
     * Enable all managers
     */
    public void enableAll() {
        for (Manager manager : managers) {
            manager.enable();
        }
    }

    /**
     * Disable all managers
     */
    public void disableAll() {
        for (Manager manager : managers) {
            manager.disable();
        }
    }

    /**
     * Number of registered managers
     */
    public int getManagerCount() {
        return managers.size();
    }
}
