/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static ci[] field_a;

    final static void a(int param0, int param1, int param2, int param3, ci[] param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        try {
          if (param4 != null &&
            0 < param3) {
            var6_int = param4[param5].field_q;
            var7 = param4[2].field_q;
            var8 = param4[1].field_q;
            param4[0].e(param2, param0, param1);
            param4[2].e(-var7 + param2 + param3, param0, param1);
            l.b(vl.field_e);
            l.i(param2 + var6_int, param0, param3 + (param2 - var7), param0 + param4[1].field_u);
            var9 = var6_int + param2;
            var10 = param3 + (param2 - var7);
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param4[1].e(param2, param0, param1);
            }
            l.a(vl.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("bk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int d(int param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          if (param0 != 23196) {
            field_a = (ci[]) null;
          }
          var1_int = 0;
          for (var2 = 0; 9 > var2; var2++) {
            if (rf.field_B[var2].field_c) {
              if (var1_int == ea.field_o) {
                stackIn_9_0 = var2;
                return stackIn_9_0;
              }
              var1_int++;
            }
          }
          stackIn_13_0 = 0;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "bk.G(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        Terraphoenix.field_O = 0;
        if (param0 <= 9) {
          field_a = (ci[]) null;
        }
    }

    final static boolean c(int param0) {
        if (param0 != -25704) {
          return true;
        }
        return ei.field_R;
    }

    final static boolean a(byte param0, boolean param1, int param2, CharSequence param3) {
        int var9 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var7 = 106 % ((29 - param0) / 60);
            var6 = 0;
            var8 = param3.length();
            for (var9 = 0; var9 < var8; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param3.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (43 != var10 ||
                !param1))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  90 >= var10) {
                  var10 -= 55;
                } else {
                  if (var10 < 97) {
                    return false;
                  }
                  if (var10 > 122) {
                    return false;
                  }
                  var10 -= 87;
                }
                if (var10 >= param2) {
                  return false;
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var10 + param2 * var6;
                if (var6 != var11 / param2) {
                  return false;
                }
                var5 = 1;
                var6 = var11;
              }
            }
            stackIn_38_0 = var5;
            return stackIn_38_0 != 0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("bk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6144) {
          field_a = (ci[]) null;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != 92) {
          bk.c(62);
        }
        param1 = param1 & 8191;
        if (param1 < 4096) {
          return param1 >= 2048 ? va.field_d[4096 - param1] : va.field_d[param1];
        }
        return 6144 <= param1 ? -va.field_d[-param1 + 8192] : -va.field_d[param1 - 4096];
    }

    static {
    }
}
