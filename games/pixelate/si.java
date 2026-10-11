/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends qm {
    int field_O;
    static boolean field_U;
    int field_T;
    int field_N;
    int field_V;
    static boolean field_P;
    int field_R;
    int field_Q;
    static String field_S;

    final static void a(int param0, java.awt.Canvas param1) {
        try {
          if (11 == el.field_b) {
            am.b(98);
          }
          if (param0 != -1913) {
            si.a((byte) -51);
          }
          mi.a(go.field_f, bf.field_o, -1, ad.field_r);
          fj.a(0, 0, (byte) 113, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "si.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static double a(double param0, boolean param1) {
        if (param1) {
          return -0.8130049379793588;
        }
        return rl.field_f[(int)(param0 * 32768.0 / 3.141592653589793) & 65535];
    }

    final static void a(int param0, byte[] param1, int param2, int param3, boolean param4, byte param5) {
        pc var6 = aa.field_f;
        var6.g(param0, 15514);
        var6.field_m = var6.field_m + 1;
        int var7 = var6.field_m;
        var6.e(160, 4);
        var6.e(160, param2);
        int var8 = param3;
        if (param4) {
          var8 += 128;
        }
        if (param5 != -76) {
          return;
        }
        try {
          var6.e(160, var8);
          var6.a(param1.length, 0, -3493, param1);
          var6.f(var6.field_m - var7, param5 + 75);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "si.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_S = null;
        if (param0 == 95) {
          return;
        }
        si.a((byte) 28);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param5 - (this.field_z + this.field_O) + param4;
          var9 = param6 + (-this.field_R + (-param3 - this.field_p));
          if (var8_int * var8_int + var9 * var9 < this.field_N * this.field_N) {
            var10 = Math.atan2((double)var9, (double)var8_int) - of.field_f;
            if (!(0.0 > var10)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_V;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_V;
            }
            this.field_T = (int)((double)this.field_V * var10 / 6.283185307179586);
            while (this.field_V <= this.field_T) {
              this.field_T = this.field_T - this.field_V;
            }
            while (0 > this.field_T) {
              this.field_T = this.field_T + this.field_V;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("si.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private si() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            if (param0 != -26629) {
              var12 = (CharSequence) null;
              si.a(30, 48, (CharSequence) null, false);
            }
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param1 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param1 * var6 + var9;
                if (var10 / param1 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_U = false;
        field_P = true;
        field_S = "Email (Login):";
    }
}
