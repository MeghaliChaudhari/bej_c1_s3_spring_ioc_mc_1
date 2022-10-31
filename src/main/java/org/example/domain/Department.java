package org.example.domain;

public class Department {
    private int deptId;
    private String depyName;

    public Department(int deptId, String depyName) {
        this.deptId = deptId;
        this.depyName = depyName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", depyName='" + depyName + '\'' +
                '}';
    }
}
