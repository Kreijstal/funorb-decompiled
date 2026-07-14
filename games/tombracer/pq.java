/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq implements os {
    static int field_f;
    static int[] field_e;
    static jea field_g;
    static iu[] field_b;
    static nh field_a;
    static String field_d;
    static jea field_c;

    public final mva[] a(int param0, int param1) {
        if (param1 != -26955) {
            return null;
        }
        return (mva[]) (Object) new wd[param0];
    }

    public final mva a(byte param0) {
        if (param0 > -17) {
            return null;
        }
        return (mva) (Object) new wd();
    }

    final static void a(byte[] param0, boolean param1, int param2, int param3, int param4, int param5) {
        kh var10 = ql.field_k;
        var10.k(param5, -2988);
        var10.field_h = var10.field_h + 1;
        int var7 = var10.field_h;
        var10.i(4, 0);
        var10.i(param4, 0);
        int var8 = param2;
        if (!(!param1)) {
            // wide iinc 8 128
        }
        int var9 = -69 / ((-65 - param3) / 34);
        var10.i(var8, 0);
        var10.a(0, param0, param0.length, 91);
        var10.d(-var7 + var10.field_h, (byte) -1);
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
            pq.a(-39);
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        ki.a(-18520, (java.awt.Component) (Object) param0);
        tia.a(0, (java.awt.Component) (Object) param0);
        if (param1) {
            return;
        }
        if (!(tja.field_q == null)) {
            tja.field_q.b(116, (java.awt.Component) (Object) param0);
        }
    }

    final static void b(int param0) {
        afa.field_c = qk.h(-57);
        ej.field_a = new jta();
        if (param0 <= 112) {
            return;
        }
        gl.a(true, true, (byte) 97);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = fqa.e(true);
        field_d = "Solicitation";
    }
}
