package me.guardiandev.bylawinfact.abstraction.lists;

import java.util.ArrayList;
import java.util.List;

public class AbstractsList {


    /**
     * note: Precincts(specific commodities) , Provence(Specific * Generic Commodities), Regions(Generic & Abstract Commodities)
     */

    protected static final List<String> abstracts = new ArrayList<>();
    protected static final List<String> generics = new ArrayList<>();
    protected static final List<String> specifics = new ArrayList<>();


    public static void init(){
        abstracts.add("foodstuffs");
        abstracts.add("ore");
        abstracts.add("lumber");
        generics.add("staple-foodstuffs");
        generics.add("exotic-foodstuffs");
        generics.add("feed");
        generics.add("raw-ores");
        generics.add("exotic-ores");
        generics.add("dusts");
        generics.add("bulk-lumber");
        generics.add("exotic-lumber");
        specifics.add("meat-products");
        specifics.add("cooked-meet-products");
        specifics.add("fungi");
        specifics.add("seafood");
        specifics.add("cooked-seafood");
        specifics.add("exotic-seafood");
        specifics.add("fruits");
        specifics.add("exotic-fruits");
        specifics.add("produce");
        specifics.add("golden-produce");
        specifics.add("sugars");
        specifics.add("liquor");
        specifics.add("baked-goods");
        specifics.add("seeds");
        specifics.add("rock");
        specifics.add("alloys");
        specifics.add("burnable-ores");
        specifics.add("raw-iron");
        specifics.add("raw-copper");
        specifics.add("gold-ore");
        specifics.add("diamond-ore");
        specifics.add("geode-ore");
        specifics.add("");
        specifics.add("redstone-dust");
        specifics.add("glowing-dusts");
        specifics.add("nether-geode-ore");
        specifics.add("exotic-nether-alloys");
        specifics.add("netherite-ore");
        specifics.add("raw-lumber");
        specifics.add("refined-lumber");
        specifics.add("raw-exotic-lumber");
        specifics.add("raw-refined-lumber");
        specifics.add("foliage");
    }
}
