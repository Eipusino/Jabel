package lib.world;

import lib.world.blocks.distribution.TubeConveyor;
import mindustry.mod.ClassMap;

public class LibClassMap {
    public static void load(){
        ClassMap.classes.put("TubeConveyor", TubeConveyor.class);
        ClassMap.classes.put("TubeConveyorBuild", TubeConveyor.TubeConveyorBuild.class);
    }
}
