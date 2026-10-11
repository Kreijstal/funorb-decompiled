/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ThemeTips {
    static String[] themeTips;
    static String[] stringArrayState0018;
    static MixedSupport124 mixedSupport124State0001;
    static ResourceArchive resourceArchiveState0009;
    static IndexedSprite[] indexedSpriteArrayState0004;
    static int integerState0351;

    static long computeLong0929(long longArgument1, long longArgument2) {
        return longArgument1 | longArgument2;
    }

    final static int computeInteger0928(int integerArgument1) {
        int integerLocal1 = -122 / ((integerArgument1 + 40) / 55);
        return new Date().getYear() + 1900;
    }

    public static void performAction0930(boolean booleanArgument1) {
        resourceArchiveState0009 = null;
        indexedSpriteArrayState0004 = null;
        if (!booleanArgument1) {
          mixedSupport124State0001 = null;
          stringArrayState0018 = null;
          themeTips = null;
          return;
        }
        mixedSupport124State0001 = (MixedSupport124) null;
        mixedSupport124State0001 = null;
        stringArrayState0018 = null;
        themeTips = null;
    }

    static {
        themeTips = new String[]{"Match shapes and try to keep your bucket clear.", "Use wildcards to match multiple shapes for big points!", "Keep solid shapes under control by repeatedly popping them.", "Have you noticed the special items? Make two or more shapes at the same time to get them!", "Solid shapes will now come back with a vengeance, getting larger each time. Use special items to keep your bucket under control!", "Danger looms! Try to empty your bucket as much as possible before this next theme ends...", "Special items will no longer save you. Try to hold on and grab as many points as possible!", "Congratulations, this is the last theme! Hint: get the best highscores by choosing and perfecting a different strategy for each theme..."};
    }
}
