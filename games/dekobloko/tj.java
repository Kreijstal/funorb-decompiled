/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends w {
    long field_Nb;
    static String field_ac;
    boolean field_ec;
    int field_dc;
    w field_Ob;
    boolean field_fc;
    static boolean field_Vb;
    static int[][] field_jc;
    String field_Rb;
    w field_Tb;
    int field_Ub;
    int field_Sb;
    static int field_Pb;
    boolean field_bc;
    w field_Zb;
    long field_cc;
    int field_Xb;
    int field_Qb;
    w field_gc;
    w field_Wb;
    static String field_ic;
    String field_Yb;
    int field_hc;

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = pe.a(param2, param0, param1 - 112, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -27;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0, tj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_fc) ? 0 : 1;
          if (stackIn_3_0 == (this.field_fc ? 1 : 0)) {
            stackIn_6_0 = this.field_fc;
            return stackIn_6_0;
          }
          if (param0 != -985) {
            this.field_fc = false;
          }
          stackIn_11_0 = param1.field_bc;
          if (this.field_bc) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = 1;
          }
          if ((stackIn_11_0 ? 1 : 0) != stackIn_12_1) {
            stackIn_18_0 = !(this.field_Nb >= param1.field_Nb);
            return stackIn_18_0;
          }
          stackIn_14_0 = this.field_bc;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        sc.field_n = 0;
        if (param1 >= 97) {
          rb.field_b = 0;
          ac.field_F = dk.field_i;
          wh.field_a = 0;
          rg.field_a = new sk(2);
          rg.field_a.a(-1, 0, ak.a(bh.field_g, pm.field_f, (byte) 7), param0);
          return;
        }
        tj.e(-61);
        rb.field_b = 0;
        ac.field_F = dk.field_i;
        wh.field_a = 0;
        rg.field_a = new sk(2);
        rg.field_a.a(-1, 0, ak.a(bh.field_g, pm.field_f, (byte) 7), param0);
    }

    final boolean g(byte param0) {
        if (param0 > 29) {
          return !this.d((byte) -68) ? true : false;
        }
        this.field_Xb = 50;
        return !this.d((byte) -68) ? true : false;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        rf.a(12, (java.awt.Component) ((Object) param1));
        if (param0) {
          return;
        }
        try {
          qf.a((byte) -35, (java.awt.Component) ((Object) param1));
          if (uc.field_e != null) {
            uc.field_e.a(68, (java.awt.Component) ((Object) param1));
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "tj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_jc = (int[][]) null;
        if (param0 != -18263) {
          return;
        }
        field_ic = null;
        field_ac = null;
    }

    final static void h(byte param0) {
        if (param0 > -22) {
          return;
        }
        aj.field_a = new w(0L, (w) null);
        if (!pd.field_a) {
          aj.field_a.a(gg.field_y, -16834);
          dc.field_e = new ak(uc.field_b, aj.field_a);
          g.field_R = new w(0L, (w) null);
          g.field_R.a(dc.field_e.field_h, -16834);
          g.field_R.a(uh.field_c, -16834);
          mf.h(5);
          return;
        }
        aj.field_a.a(fn.field_g, -16834);
        aj.field_a.a(gg.field_y, -16834);
        dc.field_e = new ak(uc.field_b, aj.field_a);
        g.field_R = new w(0L, (w) null);
        g.field_R.a(dc.field_e.field_h, -16834);
        g.field_R.a(uh.field_c, -16834);
        mf.h(5);
    }

    tj(String param0, String param1, long param2) {
        super(0L, (w) null);
        CharSequence var6 = null;
        try {
          this.field_Rb = param0;
          this.field_Yb = param1;
          this.field_cc = param2;
          var6 = (CharSequence) ((Object) this.field_Rb);
          kf.a(var6, (byte) 2);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_Rb = param2;
          if (param0 < 10) {
            this.field_Wb = (w) null;
          }
          this.field_Yb = param1;
          var5 = (CharSequence) ((Object) this.field_Rb);
          kf.a(var5, (byte) 2);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "tj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ac = "Show chat";
        field_ic = "Unfortunately we are unable to create an account for you at this time.";
    }
}
