/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc implements ml {
    static int field_e;
    static boolean field_f;
    private int field_c;
    static boolean field_d;
    static String field_h;
    private int field_a;
    static int[] field_b;
    private ta field_g;

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param4 < 19) {
            var12 = (java.applet.Applet) null;
            lc.a((java.applet.Applet) null, (byte) 96);
          }
          if (!param1.field_g &&
            !param1.b((byte) 127)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_g.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_s + "</u>", param3 + param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, var6_int, -1, this.field_a, this.field_c, this.field_g.field_C + this.field_g.field_D);
          if (param1.b((byte) 75)) {
            var7 = this.field_g.a(param1.field_s);
            var8 = this.field_g.field_C + this.field_g.field_D;
            var9 = param3 + param1.field_r;
            if (2 != this.field_a) {
              if (this.field_a == 1) {
                var9 = var9 + (-var7 + param1.field_l >> 1);
              }
            } else {
              var9 = var9 + (-var7 + param1.field_l);
            }
            var10 = param2 + param1.field_e;
            if (this.field_c == 2) {
              var10 = var10 + (param1.field_p - var8);
            } else {
              if (this.field_c == 1) {
                var10 = var10 + (-var8 + param1.field_p >> 1);
              }
            }
            hk.a(var9 - 2, var10 + 2, 117, 4 + var7, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_9_0 = null;
          String stackIn_17_0 = null;
          String stackIn_19_0 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (mf.a(-26159, "getcookies", param0));
              var5 = ma.a(param1 + 213, ';', var4);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (param1 != -89) {
              field_d = false;
            }
            if (null == e.field_c) {
              stackIn_19_0 = param0.getParameter("settings");
              return stackIn_19_0;
            }
            stackIn_17_0 = e.field_c;
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("lc.A(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ad param0, boolean param1, ad param2, int param3, ad param4) {
        try {
          if (param3 != 3249872) {
            field_b = (int[]) null;
          }
          bb.field_a = ia.a(-66, "");
          bb.field_a.b(16564, false);
          lh.a(param2, param0, param4, param3 - 3249767);
          oi.a(-2);
          ed.field_c = di.field_a;
          ch.field_d = di.field_a;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "lc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public lc() {
        this.field_a = 1;
        this.field_c = 1;
        this.field_g = t.field_z;
    }

    lc(ta param0, int param1, int param2) {
        try {
          this.field_c = param2;
          this.field_g = param0;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -112) {
          field_f = true;
        }
    }

    static {
        field_d = false;
    }
}
