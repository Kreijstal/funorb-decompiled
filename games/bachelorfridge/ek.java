/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends at {
    private gj field_l;
    private int field_j;
    private int field_n;
    static String field_k;
    static String field_o;
    static String field_m;

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        mv.field_n = kca.field_c.a(lr.field_k[20]);
        var1 = kca.field_c.a(lr.field_k[21]);
        if (mv.field_n < var1) {
          mv.field_n = var1;
          mv.field_n = mv.field_n + 8;
          var2 = 0;
          return;
        } else {
          mv.field_n = mv.field_n + 8;
          var2 = 0;
          return;
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 16 % ((param3 - -74) / 52);
            L1: while (true) {
              param0--;
              if (0 > param0) {
                break L0;
              } else {
                var6 = param1;
                var7 = param4;
                var8 = param2;
                var6[var7] = var8 + dda.a(var6[var7] >> 1, 8355711);
                param4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ek.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var3 = via.a(param0, (byte) 73);
        int var4 = ft.a(param0, (byte) -128);
        int var5 = via.a(param1, (byte) 84);
        int var6 = ft.a(param1, (byte) -128);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    ek(gj param0, ad param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              ((ek) this).field_j = param2;
              ((ek) this).field_l = param0;
              ((ek) this).field_n = 64;
              if (param1.field_s.field_y != 3) {
                break L1;
              } else {
                ((ek) this).field_j = ((ek) this).field_j >> 1;
                break L1;
              }
            }
            L2: {
              if (((ek) this).field_j > 0) {
                param1.a(16711680, 61, Integer.toString(((ek) this).field_j));
                break L2;
              } else {
                param1.a(65280, 28, Integer.toString(-((ek) this).field_j));
                break L2;
              }
            }
            if (param1.field_s.field_I > 0) {
              break L0;
            } else {
              ((ek) this).a(27799, (at) (Object) new fl(((ek) this).field_l, param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ek.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = 102 % ((71 - param0) / 47);
        int fieldTemp$2 = ((ek) this).field_n - 1;
        ((ek) this).field_n = ((ek) this).field_n - 1;
        if (fieldTemp$2 > 0) {
          return false;
        } else {
          return true;
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != 8) {
            ek.d(-98);
            field_o = null;
            field_m = null;
            return;
        }
        field_o = null;
        field_m = null;
    }

    final static kv[] a(byte param0, int[] param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv[] var3 = null;
        kv[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new kv[14];
            var2 = var3;
            var3[1] = wo.field_k[1][param1[1]];
            var3[0] = wo.field_k[0][param1[0]];
            var3[2] = wo.field_k[2][param1[2]];
            var3[3] = wo.field_k[3][param1[3]];
            var3[5] = wo.field_k[5][param1[5]];
            var3[8] = wo.field_k[8][param1[8]];
            var3[4] = wo.field_k[4][param1[4]];
            var3[9] = wo.field_k[9][param1[9]];
            var3[10] = wo.field_k[10][param1[10]];
            var3[7] = wo.field_k[7][param1[7]];
            var3[6] = wo.field_k[6][param1[6]];
            var3[11] = wo.field_k[11][param1[8]];
            var3[12] = wo.field_k[12][param1[9]];
            var3[13] = wo.field_k[13][param1[10]];
            stackOut_0_0 = (kv[]) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ek.C(").append(-25).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Welcome to the Arena! This is where your creatures fight in brutal combat. Normally you would have arrived here through the multiplayer lobby. <br><col=BBFF00> Next</col>";
        field_o = "<%0> has withdrawn the request to join.";
        field_m = "Connecting to<br>friend server...";
    }
}
