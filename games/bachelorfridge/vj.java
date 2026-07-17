/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vj extends pu {
    static kv field_p;
    static String field_q;
    static Random field_o;
    static String[] field_r;
    static int field_n;
    static String field_l;
    static kv field_m;

    final static int a(int param0, int param1) {
        int var3 = 0;
        if (param0 == 1) {
          if (!ad.a(30, param1)) {
            var3 = -80;
            return tj.field_e[param0];
          } else {
            return 29;
          }
        } else {
          var3 = -80;
          return tj.field_e[param0];
        }
    }

    public static void b() {
        field_p = null;
        field_m = null;
        int var1 = -1;
        field_o = null;
        field_q = null;
        field_l = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Tomato Sauce", "Cheese", "Ice Cream", "Wafer", "Curry Sauce", "Naan", "Stamina up", "Stamina down", "Speed up", "Speed down", "Fisticuffs up", "Fisticuffs down", "Flingstuff up", "Flingstuff down", "Regen", "Damage over time", "Random status", "Explosion", "Invincible", "Limited Exits", "Objective", "Pit", "Impossible", "Player 1 flag", "Player 2 flag", "Player 3 flag", "Player 4 flag", "Snow", "Ice block", "Milk", "Jam", "Sauce", "Radiation", "Radiation", "Nuke", "Time bomb", "Vending machine", "Clam", "Fun-size Pizza", "Combat Dummy"};
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_l = "Yes";
    }
}
