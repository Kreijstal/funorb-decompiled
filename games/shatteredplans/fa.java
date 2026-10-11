/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends go implements ki {
    static String field_T;
    static String field_J;
    static String field_Y;
    static qb field_W;
    static String field_S;
    static int[][] field_Z;
    private gk field_V;
    private int field_U;
    static qr field_X;

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_U = pd.field_k - (this.field_m + param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fa.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    fa(String param0, ko param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(boolean param0) {
        if (!this.field_k) {
          return null;
        }
        if (this.field_v == null) {
          return null;
        }
        ur.a(bb.field_b, !param0 ? true : false, this.field_x - this.field_U + pd.field_k);
        if (param0) {
          return this.field_v;
        }
        return (String) null;
    }

    final void i(int param0) {
        super.i(param0);
        if (this.field_V != null) {
          this.field_V.b(-72);
        }
    }

    final void a(gk param0, int param1) {
        try {
          if (param1 != 8945) {
            field_T = (String) null;
          }
          this.field_V = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final gk a(byte param0) {
        if (param0 <= 58) {
          this.a((byte) -52);
          return this.field_V;
        }
        return this.field_V;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        fl.field_f = param0;
        if (pg.field_J != ed.field_f) {
          var2 = ed.field_f * ed.field_f;
          var3 = -(pg.field_J * pg.field_J) + var2;
          param0 = param0 + (-param0 + pc.field_m) * var3 / var2;
        }
        tg.field_c.a(640, 120, (byte) 66, param0, tm.field_h);
        if (param1 <= -35) {
          qc.a(pc.field_m - 24, 0, tg.field_a, 3, 640, 5, qo.field_b);
          return;
        }
        fa.a(-2, (byte) -122);
        qc.a(pc.field_m - 24, 0, tg.field_a, 3, 640, 5, qo.field_b);
    }

    public static void l(int param0) {
        field_T = null;
        field_W = null;
        field_Y = null;
        field_X = null;
        field_Z = (int[][]) null;
        field_S = null;
        field_J = null;
        if (param0 != 5) {
          fa.a(-11, (byte) -25);
        }
    }

    static {
        field_Y = "<%0> has entered another game.";
        field_T = "Average rating";
        field_S = "<%0> points, 1 point per turn.";
        field_J = "Waiting for graphics";
    }
}
