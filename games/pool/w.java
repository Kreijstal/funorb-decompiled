/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static int[] field_i;
    static String field_c;
    static int field_h;
    static String field_l;
    static String field_m;
    static String[] field_k;
    static int[] field_d;
    static qp field_b;
    static eb[] field_a;
    static String field_e;
    static String field_g;
    static int[][] field_j;
    static dd field_f;

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_m = null;
        field_d = null;
        field_f = null;
        field_l = null;
        if (param0 < 9) {
            return;
        }
        field_j = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_k = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param1 & 7) == 0)) {
            var2 = 8 - (param1 & 7);
        }
        int var3 = param1 - -var2;
        if (param0 != 8) {
            return -16;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_u = param0;
        m.field_f = param2;
        int var3 = 62 % ((59 - param1) / 59);
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = Pool.field_O;
        if (!p.a(param1, (byte) -113, param0)) {
            return false;
        }
        if (param2 != -37) {
            return true;
        }
        for (var3 = 0; var3 < param1.length(); var3++) {
            if (!(uc.a(param1.charAt(var3), (byte) -51))) {
                return false;
            }
        }
        return true;
    }

    final static tc a(boolean param0, int param1) {
        tc var2 = new tc(param1, param0);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> are <%2>.";
        field_i = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 32, 32, 34, 53, 68, 69, 69, 69, 73, 73, 83, 83, 83, 92, 97, 99};
        field_l = "Cancel unrated rematch";
        field_d = new int[]{12, 20, 21, 49, 6, 7};
        field_m = "Quick Chat Help";
        field_e = "<%0> and <%1> have resigned!";
        field_g = "<%0><br>versus<br><%1>";
    }
}
