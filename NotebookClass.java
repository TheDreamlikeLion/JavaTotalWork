private String name;
private double screenSize;
private int ramCap;
private String driveType;
private int driveCap;
private String os;
private String other;

public NotebookClass(String name, double screenSize, int ramCap, String driveType, int driveCap, String os, String other) {
    this.name = name;
    this.screenSize = screenSize;
    this.ramCap = ramCap;
    this.driveType = driveType;
    this.driveCap = driveCap;
    this.os = os;
    this.other = other;
}

@Override
public String toString() {
    return String.format("Название: %s \n, Диагональ экрана: %.1f \n, RAM: %d Гб \n, Память: %s \n %d Гб \n, ОС %s \n, %s", this.name, this.screenSize, this.ramCap, this.driveType, this.driveCap, this.os, this.other);
}

@Override
public boolean equals(Object obj) {
    if (obj instanceof NotebookClass) {
        return this.name.equals(((NotebookClass) obj).name) && this.screenSize == ((NotebookClass) obj).screenSize
                && this.ramCap == ((NotebookClass) obj).ramCap && this.driveType.equals == ((NotebookClass) obj).driveType
                && this.driveCap == ((NotebookClass) obj).driveCap && this.os.equals(((NotebookClass) obj).os)
                && this.other.equals(((NotebookClass) obj).other);
    }
    return false;
}

public String getName(){
    return this.name;
}

public double getScreenSize(){
    return this.screenSize;
}

public int getRam(){
    return this.ramCap;
}

public String getDriveType(){
    return this.driveType;
}

public int getDriveCap(){
    return this.driveCap;
}

public String getOS(){
    return this.os;
}

public String getOther(){
    return this.other;
}