package me.guardiandev.bylawinfact.abstraction;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class EconomyAbstract implements AbstractCommodity{

    private final String name;
    private final @Nullable ArrayList contents;
    private final int type;
    private final boolean exotic;
    private final int invSize;

    public EconomyAbstract(String name, int type, boolean exotic,@Nullable ArrayList contents, int invSize) {
        //Name of this Economy Abstract
        this.name=name;
        //Type, or Tier, of economy abstract between 0-2; {Specifics, Generics, or Abstracts}
        this.type=type;
        //Defines whether this abstract is an exotic, or scarce, commodity; Exotics are given special requirements and limitations
        this.exotic=exotic;
        //An array of this abstract's contents
        this.contents=contents;
        //raw max size of this abstract's array
        this.invSize=invSize;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getInventorySize() {
        return invSize;
    }

    public ArrayList getArray(@Nullable ArrayList list) {
        return this.contents;
    }

    public boolean isExotic() {
        return this.exotic;
    }
}
