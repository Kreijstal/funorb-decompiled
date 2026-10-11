/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = StarCannon.field_A;
        try {
          var5_int = param0 + param4;
          var6 = param3 + param1;
          if (ki.field_l < param4) {
            stackIn_4_0 = param4;
          } else {
            stackIn_4_0 = ki.field_l;
          }
          var7 = stackIn_4_0;
          if (ki.field_e < param3) {
            stackIn_7_0 = param3;
          } else {
            stackIn_7_0 = ki.field_e;
          }
          var8 = stackIn_7_0;
          if (var5_int < ki.field_g) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = ki.field_g;
          }
          var9 = stackIn_10_0;
          if (var6 < ki.field_i) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = ki.field_i;
          }
          var10 = stackIn_13_0;
          if (param4 >= ki.field_l &&
            param4 < ki.field_g) {
            var11 = param4 + var8 * ki.field_j;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ki.field_a[var11] = 16777215;
              var11 = var11 + 2 * ki.field_j;
            }
          }
          if (param3 >= ki.field_e &&
            var6 < ki.field_i) {
            var11Lifetime1 = var7 + param3 * ki.field_j;
            var12Lifetime1 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ki.field_a[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (param2 != -140110815) {
            field_a = 57;
          }
          if (ki.field_l <= var5_int &&
            ki.field_g > var5_int) {
            var11Lifetime2 = ((-param4 + var5_int & 1) + var8) * ki.field_j + var5_int;
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              ki.field_a[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ki.field_j * 2;
            }
          }
          if (param3 >= ki.field_e &&
            var6 < ki.field_i) {
            var11Lifetime3 = (-param3 + var6 & 1) + (var7 + ki.field_j * var6);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              ki.field_a[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "ji.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static id[] a(boolean param0, ue param1, int param2, int param3) {
        RuntimeException var4 = null;
        id[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = (id[]) null;
            return stackIn_2_0;
          }
          if (qb.a((byte) 126, param3, param2, param1)) {
            return tj.h(126);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ji.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var12 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        try {
          if (param1 >= param5) {
            return;
          }
          if (param2 <= 1 + param1) {
            return;
          }
          if (param2 > 5 + param1 &&
            param0 != param6) {
            var7_int = (param6 >> 1) + (param0 >> 1) + (1 & (param6 & param0));
            var8 = param1;
            var9 = param0;
            var10 = 100 / ((-53 - param3) / 63);
            var11 = param6;
            for (var12 = param1; var12 < param2; var12++) {
              var13 = jk.field_c[var12];
              if (!param4) {
                stackIn_23_0 = fg.field_b[var13];
              } else {
                stackIn_23_0 = tk.field_f[var13];
              }
              var14 = stackIn_23_0;
              if (var7_int < var14) {
                jk.field_c[var12] = jk.field_c[var8];
                if (var9 > var14) {
                  var9 = var14;
                }
                incrementValue$0 = var8;
                var8++;
                jk.field_c[incrementValue$0] = var13;
              } else {
                if (var11 < var14) {
                  var11 = var14;
                }
              }
            }
            ji.a(param0, param1, var8, (byte) -124, param4, param5, var9);
            ji.a(var11, var8, param2, (byte) -128, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; param1 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param1; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = jk.field_c[var8Lifetime1];
              var10Lifetime1 = jk.field_c[1 + var8Lifetime1];
              if (mj.a(var9Lifetime1, param4, -24153, var10Lifetime1)) {
                jk.field_c[var8Lifetime1] = var10Lifetime1;
                jk.field_c[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var7), "ji.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
