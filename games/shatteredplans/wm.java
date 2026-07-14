/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static int field_b;
    static String field_a;
    static String field_f;
    static int field_c;
    static nf[] field_d;
    static String field_e;

    final static bi a(int param0, int param1) {
        bi var2 = new bi(dc.field_F.field_z, dc.field_F.field_w);
        ra.a(param1 ^ -110);
        var2.e();
        dc.field_F.b(0, 0, param0 < param1 ? 2105376 : param0);
        cg.i(0);
        return var2;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    final static int a(CharSequence param0, int param1, byte param2) {
        if (param2 != 11) {
            field_e = null;
            return fc.a(param1, param0, (byte) 124, true);
        }
        return fc.a(param1, param0, (byte) 124, true);
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        nj.b(-120);
    }

    final static double a(int param0, byte param1, int param2) {
        if (param1 <= 90) {
          return 0.18024758453966921;
        } else {
          return (double)(param0 * param0) * (double)(param2 * 3 - param0 * 2) / (double)(param2 * (param2 * param2));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 256;
        field_f = "Single-player Skirmish";
        field_a = "Click to show the Fleet Info window.";
        field_e = "Press <col=2F5FBF>'ENTER'</col> to continue.";
    }
}
