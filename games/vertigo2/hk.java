/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends da {
    static int field_m;
    private String field_l;
    static int[] field_q;
    private boolean field_p;
    static cr field_o;
    static String field_r;
    static int field_n;

    final ba a(int param0, String param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        ba stackIn_2_0 = null;
        ba stackIn_10_0 = null;
        ba stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!jc.a((byte) 82, var5)) {
            stackIn_2_0 = ir.field_a;
            return stackIn_2_0;
          }
          if (param0 != -1) {
            var4 = (String) null;
            this.a(86, (String) null);
          }
          if (!param1.equals(this.field_l)) {
            var3 = qe.a(param1, (byte) 54);
            if (var3 != null &&
              var3.field_j == null) {
              this.field_p = var3.field_a;
              this.field_l = param1;
            } else {
              stackIn_10_0 = dj.field_c;
              return stackIn_10_0;
            }
          }
          if (!this.field_p) {
            stackIn_15_0 = ir.field_a;
          } else {
            stackIn_15_0 = qm.field_G;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("hk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, param1 ^ 75);
        if (param1 == 60) {
          var3.f(3, 91);
          var3.f(8, param1 + 41);
          var3.d(param2, param1 ^ -1739);
          return;
        }
        field_r = (String) null;
        var3.f(3, 91);
        var3.f(8, param1 + 41);
        var3.d(param2, param1 ^ -1739);
    }

    final String b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ch var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3614) {
            field_o = (cr) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = gm.a((byte) 92, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_l)) {
            var4 = qe.a(param1, (byte) 61);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_j) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_p = var4.field_a;
            this.field_l = param1;
          }
          if (this.field_p) {
            stackIn_17_0 = sf.field_c;
            return stackIn_17_0;
          }
          stackIn_15_0 = wa.field_g;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_l = null;
        if (param0 != -1) {
          java.awt.Component var3 = (java.awt.Component) null;
          hk.a(-74, (java.awt.Component) null);
        }
    }

    hk(kp param0) {
        super(param0);
        this.field_p = false;
    }

    final static int a(boolean param0) {
        if (!param0) {
          field_m = 2;
          return jp.field_o;
        }
        return jp.field_o;
    }

    public static void c(byte param0) {
        field_o = null;
        field_r = null;
        if (param0 >= -61) {
          hk.a(true);
          field_q = null;
          return;
        }
        field_q = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          if (param0 != 3) {
            hk.g(98);
          }
          param1.addMouseListener(as.field_b);
          param1.addMouseMotionListener(as.field_b);
          param1.addFocusListener(as.field_b);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "hk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        CharSequence var3 = null;
        if (param0 == 3) {
          qe.field_V = id.field_f.f(param0 ^ 131);
          var3 = (CharSequence) ((Object) qe.field_V);
          Vertigo2.field_F = rc.a(var3, param0 + 317);
          return;
        }
        field_m = -23;
        qe.field_V = id.field_f.f(param0 ^ 131);
        CharSequence var2 = (CharSequence) ((Object) qe.field_V);
        Vertigo2.field_F = rc.a(var2, param0 + 317);
    }

    static {
        field_n = -1;
        field_r = "Paint-off";
    }
}
