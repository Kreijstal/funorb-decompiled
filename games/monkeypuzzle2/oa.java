/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a(boolean param0) {
        if (!param0) {
          field_J = null;
          field_E = null;
          field_D = null;
          field_F = null;
          return;
        }
        oa.a(false);
        field_J = null;
        field_E = null;
        field_D = null;
        field_F = null;
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_v = param6;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "oa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String var8 = null;
          boolean stackIn_22_0 = false;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            if (field_I) {
              return true;
            }
            try {
              var8 = "tuhstatbut";
              var3 = (String) (mf.a(-26159, "getcookies", param1));
              var4 = ma.a(126, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var8)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (param0 >= -120) {
              field_D = (ai[]) null;
            }
            stackIn_22_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_22_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var2_ref;
            stackIn_25_1 = new StringBuilder().append("oa.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4 ^ param4, param5);
          var7 = od.field_n;
          if (var7 != null &&
            this.a(param1, param0, param5, param3, (byte) 45)) {
            if (this.field_o instanceof tc) {
              ((tc) (this.field_o)).a(this, (byte) -27, var7);
              od.field_n = null;
              return;
            }
            if (var7.field_o instanceof tc) {
              ((tc) (var7.field_o)).a(this, (byte) -27, var7);
              od.field_n = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_9_0 = var7_ref;
          stackIn_9_1 = new StringBuilder().append("oa.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        try {
          param1[1] = param1[1] * param0;
          if (param2 <= 104) {
            field_F = (String) null;
          }
          param1[0] = param1[0] * param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void j(int param0) {
        int var5 = 0;
        int var2_int = 0;
        int stackIn_21_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        ki var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        il var7 = null;
        ki var2_refLifetime1;
        ki var2_refLifetime2;
        int var3Lifetime1;
        var2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = 0;
          var2_ref = (ki) (ok.field_a.a((byte) -117));
          while (var2_ref != null) {
            if (qb.field_b) {
              if (2 != var2_ref.field_w) {
                if (var2_ref.field_w == 3) {
                  h.a(4, true);
                } else {
                  if (var2_ref.field_w != 5) {
                    if (6 == var2_ref.field_w) {
                      h.a(1, true);
                    }
                  } else {
                    h.a(2, true);
                  }
                }
              } else {
                h.a(3, true);
              }
            }
            if (var2_ref.field_w == 6) {
              if (!var2_ref.field_j) {
                stackIn_21_0 = (!var2_ref.field_x) ? 1 : 0;
              } else {
                stackIn_21_0 = 0;
              }
            } else {
              stackIn_21_0 = 0;
            }
            var3 = stackIn_21_0;
            var2_ref.g(122);
            if (var3 != 0 &&
              !var2_ref.field_j &&
              var2_ref.field_m > 0) {
              var4 = 0;
              for (var5 = 0; var2_ref.field_m > var5; var5++) {
                if (var2_ref.field_o[var5].field_w == 4) {
                  continue;
                }
                var4 = 1;
                break;
              }
              if (var4 != 0) {
                var2_ref.field_q = var2_ref.field_q + 2.0f;
              } else {
                var2_ref.field_t = hd.field_u;
              }
            } else {
              if (var2_ref.field_x &&
                var2_ref.field_w == 6 &&
                var2_ref.field_m == 0) {
                var2_ref.field_t = hd.field_u;
              }
            }
            var2_ref = (ki) (ok.field_a.d((byte) 63));
          }
          for (var2_int = 0; var2_int < 3; var2_int++) {
            var7 = (il) (rf.field_a.a((byte) -117));
            while (var7 != null) {
              var7.e(5);
              var7 = (il) (rf.field_a.d((byte) 63));
            }
          }
          var2_refLifetime1 = (ki) (ok.field_a.a((byte) -117));
          if (param0 > -79) {
            oa.a(true);
          }
          while (var2_refLifetime1 != null) {
            var2_refLifetime1.d((byte) 116);
            var2_refLifetime1 = (ki) (ok.field_a.d((byte) 63));
          }
          var2_refLifetime2 = (ki) (ok.field_a.a((byte) -117));
          while (var2_refLifetime2 != null) {
            var2_refLifetime2.f(-7);
            if (var2_refLifetime2.field_q - (float)var2_refLifetime2.field_y > (float)(hf.field_f.field_k - 90)) {
              if (vl.field_j) {
                hf.field_f.d(-115);
                vl.field_j = false;
              }
              var1_int = 1;
            }
            if ((var2_refLifetime2.field_w == 1 ||
              6 == var2_refLifetime2.field_w ||
              var2_refLifetime2.field_w == 5 ||
              var2_refLifetime2.field_w == 0) &&
              pa.a(var2_refLifetime2.field_I, (int)(var2_refLifetime2.field_B + (float)var2_refLifetime2.field_G), (int)var2_refLifetime2.field_q + var2_refLifetime2.field_y, sb.field_m, 80, 0)) {
              stackIn_69_0 = (!jj.a(-32680, var2_refLifetime2, -80 + (var2_refLifetime2.field_G + (int)var2_refLifetime2.field_B), var2_refLifetime2.field_y + (int)var2_refLifetime2.field_q)) ? 0 : 1;
              var3Lifetime1 = stackIn_69_0;
              var2_refLifetime2.field_x = var2_refLifetime2.field_x | var3Lifetime1 != 0;
              var2_refLifetime2.c((byte) -114);
              var2_refLifetime2 = (ki) (ok.field_a.d((byte) 63));
              continue;
            }
            if (var2_refLifetime2.field_w != 3) {
              var2_refLifetime2.c((byte) -114);
              var2_refLifetime2 = (ki) (ok.field_a.d((byte) 63));
              continue;
            }
            if (var2_refLifetime2.field_n != 1) {
              var2_refLifetime2.c((byte) -114);
              var2_refLifetime2 = (ki) (ok.field_a.d((byte) 63));
              continue;
            }
            if (var2_refLifetime2.field_C <= 4) {
              var2_refLifetime2.c((byte) -114);
              var2_refLifetime2 = (ki) (ok.field_a.d((byte) 63));
              continue;
            }
            var2_refLifetime2.field_t = ri.field_b;
            var2_refLifetime2.c((byte) -114);
            var2_refLifetime2 = (ki) (ok.field_a.d((byte) 63));
          }
          vl.field_j = var1_int != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oa.D(" + param0 + ')');
        }
    }

    static {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
