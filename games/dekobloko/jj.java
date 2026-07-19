/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jj {
    static String[] field_d;
    static String[] field_a;
    static ta field_f;
    static ji field_c;
    static pi[] field_e;
    static int field_b;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static int a(int param0) {
        int var1 = -122 / ((param0 - -40) / 55);
        return new Date().getYear() + 1900;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        if (param0) {
          field_f = (ta) null;
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        field_d = new String[]{"Match shapes and try to keep your bucket clear.", "Use wildcards to match multiple shapes for big points!", "Keep solid shapes under control by repeatedly popping them.", "Have you noticed the special items? Make two or more shapes at the same time to get them!", "Solid shapes will now come back with a vengeance, getting larger each time. Use special items to keep your bucket under control!", "Danger looms! Try to empty your bucket as much as possible before this next theme ends...", "Special items will no longer save you. Try to hold on and grab as many points as possible!", "Congratulations, this is the last theme! Hint: get the best highscores by choosing and perfecting a different strategy for each theme..."};
    }
}
