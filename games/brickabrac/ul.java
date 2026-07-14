/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nm {
    static String field_j;
    String field_o;
    int field_n;
    static jp[] field_r;
    int field_i;
    static mf field_l;
    static hl field_m;
    static int field_p;
    static jp[] field_k;
    int field_q;

    final static void a(int param0) {
        int var1 = 0;
        double var3 = 0.0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        mg.c();
        lc.field_k = 11;
        v.field_a = new int[260];
        int var2 = -120 / ((param0 - 32) / 49);
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var3 = 15.0;
            v.field_a[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var3) * 255.0);
        }
        int var6 = 256;
        var1 = var6;
        while (v.field_a.length > var6) {
            v.field_a[var6] = 255;
            var6++;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_k = null;
        field_m = null;
        if (param0 >= -41) {
            return;
        }
        field_r = null;
        field_j = null;
    }

    final static jp[] a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 34) {
            ul.a(19);
        }
        return hj.a(1, (byte) -110, param1, param3, param0);
    }

    final static void a(int param0, vm param1, int param2, boolean param3, int param4) {
        dc.field_e.a(param2, !param3 ? true : false, param0, (byte) 22, 1000000, param1);
        int var5 = 88 / ((-16 - param4) / 38);
    }

    final static int a(int param0, int param1) {
        if (param0 != 255) {
            field_k = null;
        }
        return la.a(param1, 255, 255);
    }

    final boolean b(boolean param0) {
        ((ul) this).field_n = ((ul) this).field_n - 256;
        if (param0) {
            return false;
        }
        ((ul) this).field_q = ((ul) this).field_q - 1;
        return ((ul) this).field_q - 1 != 0 ? true : false;
    }

    ul(int param0, int param1, int param2) {
        ((ul) this).field_n = param2;
        ((ul) this).field_q = 50;
        ((ul) this).field_i = param1;
        ((ul) this).field_o = Integer.toString(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_p = 256;
    }
}
