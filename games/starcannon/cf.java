/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends qf {
    private boolean field_l;
    private vb field_o;
    static hl field_q;
    static String field_p;
    private String field_n;
    static String field_j;
    static String field_k;
    static String field_m;
    static boolean field_r;
    static String field_s;

    public static void f(int param0) {
        field_p = null;
        field_k = null;
        if (param0 != 1) {
          return;
        }
        field_j = null;
        field_s = null;
        field_q = null;
        field_m = null;
    }

    final static ig a(boolean param0, boolean param1) {
        ig var2 = null;
        ig var2Lifetime1;
        if (!param1) {
          var2 = new ig(true);
          var2.field_g = param0 ? true : false;
          return var2;
        }
        field_q = (hl) null;
        var2Lifetime1 = new ig(true);
        var2Lifetime1.field_g = param0 ? true : false;
        return var2Lifetime1;
    }

    cf(fe param0, fe param1) {
        super(param0);
        this.field_l = false;
        this.field_n = "";
        try {
          this.field_o = new vb(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final p a(String param0, int param1) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        p stackIn_5_0 = null;
        p stackIn_9_0 = null;
        p stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -26188) {
            var4 = (String) null;
            this.a((String) null, 74);
          }
          if (this.field_o.a(param0, param1 ^ 0) == sb.field_n) {
            stackIn_5_0 = sb.field_n;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_n)) {
            var3 = ij.a(param0, (byte) -51);
            if (!var3.b(false)) {
              stackIn_9_0 = cd.field_a;
              return stackIn_9_0;
            }
            this.field_n = param0;
            this.field_l = var3.b((byte) -72);
          }
          if (this.field_l) {
            stackIn_14_0 = bf.field_x;
          } else {
            stackIn_14_0 = sb.field_n;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(byte param0) {
        jh.field_c[4] = new int[]{5};
        if (param0 >= -64) {
          field_s = (String) null;
          fg.field_a[4] = new jl(4);
          ad.a(2, new int[]{8, 9, 10, 6}, true);
          fg.field_a[2] = new jl(2);
          if (0 >= u.field_d) {
            if (u.field_d <= 0) {
              return;
            }
            if (7 == lf.field_cb) {
              lf.field_cb = 0;
              return;
            }
            return;
          }
          if (!ha.a(100, nb.field_e)) {
            if (u.field_d <= 0) {
              return;
            }
            if (7 == lf.field_cb) {
              lf.field_cb = 0;
              return;
            }
            return;
          }
          ad.a(1, new int[]{1, 12, 13, 20, 4, 3, 7}, true);
          fg.field_a[1] = new jl(1);
          if (u.field_d <= 0) {
            return;
          }
          if (7 == lf.field_cb) {
            lf.field_cb = 0;
            return;
          }
          return;
        }
        fg.field_a[4] = new jl(4);
        ad.a(2, new int[]{8, 9, 10, 6}, true);
        fg.field_a[2] = new jl(2);
        if (0 < u.field_d &&
          ha.a(100, nb.field_e)) {
          ad.a(1, new int[]{1, 12, 13, 20, 4, 3, 7}, true);
          fg.field_a[1] = new jl(1);
          if (u.field_d <= 0) {
            return;
          }
          if (7 == lf.field_cb) {
            lf.field_cb = 0;
            return;
          }
          return;
        }
        if (u.field_d <= 0) {
          return;
        }
        if (7 == lf.field_cb) {
          lf.field_cb = 0;
          return;
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_o.a(param0, -26188) == sb.field_n) {
            stackIn_6_0 = this.field_o.a(param0, false);
            return stackIn_6_0;
          }
          if (this.a(param0, -26188) != sb.field_n) {
            stackIn_11_0 = wi.field_a;
            return stackIn_11_0;
          }
          stackIn_9_0 = hi.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cf.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Connection restored.";
        field_j = "Quit";
        field_k = "Difficulty - EASY";
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_s = "That name is not available";
    }
}
