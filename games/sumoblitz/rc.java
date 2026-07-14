/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends bp implements ef {
    static int field_j;
    static qp[] field_l;
    static ri field_i;
    static jn field_m;
    static int field_k;

    public final void a(int param0) {
        if (param0 != 8905) {
            field_i = null;
            super.a(param0 ^ 0);
            return;
        }
        super.a(param0 ^ 0);
    }

    public static void b(int param0) {
        if (param0 < 115) {
            return;
        }
        field_m = null;
        field_l = null;
        field_i = null;
    }

    public final void a(ji param0, int param1) {
        super.a(param0, param1);
    }

    rc(on param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, nl.field_p, io.field_g, param1 * (param1 * 6), param2);
        int var5 = 0;
        int var7 = 0;
        ((rc) this).field_e.a((ed) this, 100);
        if (!param2) {
          var7 = 0;
          var5 = var7;
          L0: while (true) {
            if (var7 < 6) {
              jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, ((rc) this).e(19), param1, param1, 0, te.a(-21339, ((rc) this).field_c), ((rc) this).field_e.field_Ec, param3[var7], 0);
              var7++;
              continue L0;
            } else {
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (6 > var5) {
              ((rc) this).a(param1, param1, param3[var5], 34069 - -var5, -1);
              var5++;
              continue L1;
            } else {
            }
          }
        }
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 != -23) {
            return null;
        }
        return ce.field_q.a(param0, "", -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new qp[38];
    }
}
