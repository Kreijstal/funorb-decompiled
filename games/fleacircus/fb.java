/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static String[] field_d;
    static mf field_a;
    static int[] field_e;
    static fc field_g;
    static volatile int field_b;
    static int field_c;
    static String field_f;

    final static int b(int param0) {
        int var1 = 0;
        int var2 = fleas.field_A ? 1 : 0;
        boolean discarded$8 = nb.field_a.a(gh.field_p, 91, true, mk.field_h);
        nb.field_a.d(true);
        while (wf.b(-111)) {
            boolean discarded$9 = nb.field_a.a(id.field_b, (byte) -37, ji.field_a);
        }
        if (!(-1 == cl.field_b)) {
            var1 = cl.field_b;
            cg.a((byte) -105, -1);
            return var1;
        }
        if (ah.field_c) {
            return 3;
        }
        if (!(wi.field_f != ui.field_kb)) {
            return 1;
        }
        if (!(uc.field_c.a(-45))) {
            return 1;
        }
        var1 = -26 / ((75 - param0) / 48);
        if (!(wi.field_f != cb.field_v)) {
            return 2;
        }
        return -1;
    }

    final static boolean a(byte param0, ih param1) {
        if (param0 != 98) {
            return false;
        }
        return 1 == param1.b(1, (byte) -87) ? true : false;
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_g = null;
        field_d = null;
        int var1 = 101 % ((param0 - -55) / 52);
    }

    final static bi[] a(rh param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(param2, (byte) -100);
        if (param1 != 45) {
          return null;
        } else {
          var5 = param0.a(param3, (byte) -15, var4);
          return be.a(var5, var4, -1, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_g = new fc();
        field_f = "Fleas: <%0>/<%1>";
    }
}
