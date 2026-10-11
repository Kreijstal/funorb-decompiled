/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    private rk[] field_d;
    private int field_a;
    String field_g;
    float field_b;
    private int field_c;
    static String field_h;
    static int[] field_f;
    private int field_i;
    static String field_e;

    final boolean a(int param0) {
        int var3;
        rk var4;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 28296) {
          return true;
        }
        while (this.field_a > this.field_c) {
          var4 = this.field_d[this.field_c];
          if (!var4.field_e.a(-72)) {
            this.a(1, 0, var4);
            return false;
          }
          if (var4.field_c >= 0 &&
            !var4.field_e.a(false, var4.field_c)) {
            this.a(1, var4.field_e.b(var4.field_c, 11619), var4);
            return false;
          }
          if (var4.field_i != null &&
            !var4.field_e.a(0, var4.field_i)) {
            this.a(1, var4.field_e.a(var4.field_i, (byte) -81), var4);
            return false;
          }
          if (var4.field_c < 0 &&
            var4.field_i == null &&
            null != var4.field_b &&
            !var4.field_e.b(0)) {
            this.a(1, var4.field_e.b(true), var4);
            return false;
          }
          this.field_c = this.field_c + 1;
        }
        return true;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param2 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param2 * var6;
                if (var10 / param2 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (param0 != 65) {
              field_f = (int[]) null;
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("pd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!qb.field_b) {
          return;
        }
        if (ck.field_b < 0) {
          return;
        }
        int var1 = jk.field_u * th.field_o[ck.field_b] / 30;
        if (var1 > th.field_o[ck.field_b]) {
          var1 = th.field_o[ck.field_b];
        }
        if (!param0) {
          return;
        }
        vh.field_E[ck.field_b].b(sl.field_k[ck.field_b], -((var1 - th.field_o[ck.field_b]) / 2) + si.field_v[ck.field_b], m.field_e[ck.field_b], var1);
    }

    private final void a(int param0, int param1, rk param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(param0 + this.field_c);
          this.field_b = var4_float * (float)this.field_i / (float)(1 + this.field_a);
          if (0 == param1) {
            this.field_g = param2.field_f;
          } else {
            this.field_g = param2.field_b + " - " + param1 + "%";
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        int var1 = 71 % ((38 - param0) / 62);
        field_e = null;
    }

    private pd() throws Throwable {
        throw new Error();
    }

    final static java.awt.Frame a(int param0, int param1, md param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        eg[] var10 = null;
        ic var11 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!param2.a(2)) {
            return null;
          }
          if (param4 == param0) {
            var10 = eg.a(param2, true);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_a == param3 &&
                var10[var8].field_b == param5 && ((param1 == 0 ||
                param1 == var10[var8].field_g) &&
                (var7_int == 0 ||
                !(var10[var8].field_e <= param4)))) {
                var7_int = 1;
                param4 = var10[var8].field_e;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param2.a(param3, param5, false, param1, param4);
          while (var11.field_g == 0) {
            em.a(10L, false);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            return null;
          }
          if (var11.field_g != 2) {
            stackIn_39_0 = var7;
            return stackIn_39_0;
          }
          rk.a(param2, var7, false);
          stackIn_37_0 = null;
          return (java.awt.Frame) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("pd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_h = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
