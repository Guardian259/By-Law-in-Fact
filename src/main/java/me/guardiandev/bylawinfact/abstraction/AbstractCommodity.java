package me.guardiandev.bylawinfact.abstraction;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public interface AbstractCommodity {

    int getType();

    int getInventorySize();

    ArrayList getArray(@Nullable ArrayList list);

    String getName();

    boolean isExotic();

}
