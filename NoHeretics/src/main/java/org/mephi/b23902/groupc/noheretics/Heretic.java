package org.mephi.b23902.groupc.noheretics;

public class Heretic {
    private String name;
    private String crimes;
    private String lastSeen;
    private String id;
    private String threatLevel;

    public Heretic(String name, String crimes, String lastSeen, String id, String threatLevel) {
        this.name = name;
        this.crimes = crimes;
        this.lastSeen = lastSeen;
        this.id = id;
        this.threatLevel = threatLevel;
    }

    public String getName() { 
        return name; 
    }
    
    public String getCrimes() { 
        return crimes; 
    }
    
    public String getLastSeen() { 
        return lastSeen; 
    }
    
    public String getId() {
        return id; 
    }
    
    public String getThreatLevel() {
        return threatLevel; 
    }
    
    @Override
    public String toString() {
        return name + " (" + threatLevel + ")";
    }
}

