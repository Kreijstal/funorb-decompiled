/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static String field_a;
    static String field_f;
    static String field_b;
    static int[] field_e;
    static boolean field_c;
    static String field_d;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        int var1 = 14 / ((17 - param0) / 45);
    }

    final static boolean a(int param0, byte param1) {
        int var2 = -3 % ((23 - param1) / 60);
        if (bw.unitDefinitions[param0][0] == 4) {
          return true;
        }
        if (bw.unitDefinitions[param0][0] == 3) {
          return true;
        }
        if (2 == bw.unitDefinitions[param0][0]) {
          return true;
        }
        if ((2048 & bw.unitDefinitions[param0][10]) == 0) {
          return false;
        }
        return true;
    }

    static {
        field_f = "This unit has been tainted with vampyric blood and will gain health for every point of damage it deals in melee combat, and loses one point of health every turn.";
        field_b = "Tonics";
        field_a = "Visit the Account Management section on the main site to view.";
        field_d = "Click";
    }
}
