/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static boolean field_a;
    static String field_c;
    static int field_d;
    static int[] field_b;

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        Object var5 = null;
        if (param3 != 0) {
          var5 = null;
          jb.a((byte) -108, true, (nb) null, -51, (java.awt.Component) null, 84, (uf) null, 73);
          jf.e(640);
          gl.field_E.l(24910);
          ra.field_y = new rl(qg.field_c, (String) null, vg.field_o, param2, param1);
          re.field_g = new pj(gl.field_E, (al) (Object) ra.field_y);
          gl.field_E.d((byte) -70, (al) (Object) re.field_g);
          return;
        } else {
          jf.e(640);
          gl.field_E.l(24910);
          ra.field_y = new rl(qg.field_c, (String) null, vg.field_o, param2, param1);
          re.field_g = new pj(gl.field_E, (al) (Object) ra.field_y);
          gl.field_E.d((byte) -70, (al) (Object) re.field_g);
          return;
        }
    }

    final static void a(byte param0, boolean param1, nb param2, int param3, java.awt.Component param4, int param5, uf param6, int param7) {
        oa.a(param7, param1, 10);
        sb.field_b = oa.a(param6, param4, 0, param3);
        g.field_x = oa.a(param6, param4, 1, param5);
        qc.field_e = new k();
        kk.field_h = param5 * 1000 / param7;
        g.field_x.a((wh) (Object) qc.field_e);
        fj.field_P = param2;
        if (param0 >= -99) {
            field_d = -37;
        } else {
            fj.field_P.d(16384, kc.field_b);
            sb.field_b.a((wh) (Object) fj.field_P);
            return;
        }
        fj.field_P.d(16384, kc.field_b);
        sb.field_b.a((wh) (Object) fj.field_P);
    }

    final static void a(boolean param0) {
        Object var2 = null;
        rj.field_d.field_e = 0;
        if (!param0) {
          var2 = null;
          jb.a((byte) -13, true, (nb) null, 60, (java.awt.Component) null, 58, (uf) null, -3);
          rj.field_d.field_b = 0;
          return;
        } else {
          rj.field_d.field_b = 0;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -104) {
            field_b = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
