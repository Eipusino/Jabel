package lib;

import java.util.Objects;

import arc.util.Time;
import lib.ui.dialogs.LibResearchDialog;
import lib.world.LibClassMap;
import mindustry.Vars;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.ResearchDialog;

public class LibMod extends Mod {
    public LibMod(){}

    @Override
    public void loadContent(){
        LibClassMap.load();
    }

    @Override
    public void init(){
        super.init();
        LibResearchDialog dialog = new LibResearchDialog();
        ResearchDialog research = Vars.ui.research;
        research.shown(() -> {
            dialog.show();
            Objects.requireNonNull(research);
            Time.runTask(1f, research::hide);
        });
    }
}
