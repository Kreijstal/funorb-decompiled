/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int[] field_a;
    static String field_b;

    final static void a(boolean param0, String param1) {
        try {
            lh.field_A = param1;
            if (!param0) {
                te.a(-69, -48, -126, true, -8);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "te.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = (String) null;
        }
    }

    final static void a(int param0, ii param1, byte param2) {
        ml var5 = null;
        int var4 = 0;
        try {
            var5 = or.field_d;
            var5.b(param0, (byte) 114);
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.a(107, 1);
            var5.a(param2 ^ -4, param1.field_g);
            var5.a(param2 ^ -22, param1.field_f);
            var5.b(-121, param1.field_e);
            var5.b(-40, param1.field_k);
            var5.b(-62, param1.field_i);
            var5.b(-91, param1.field_j);
            if (param2 != -112) {
                field_b = (String) null;
            }
            var5.a(var4, false);
            var5.c(62, var5.field_n - var4);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "te.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ut[] a(int param0, int param1, int param2, boolean param3, int param4) {
        ut[] var6 = new ut[9];
        ut[] var5 = var6;
        if (param3) {
            return (ut[]) null;
        }
        ut dupTemp$0 = lh.a(param4, (byte) -96, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        ut dupTemp$1 = lh.a(param2, (byte) -96, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param1 == 0)) {
            var6[4] = lh.a(param1, (byte) -96, 64);
        }
        return var5;
    }

    final static bb a(int param0, hd param1, int[] param2, hd param3, hd param4) {
        Object stackIn_7_0 = null;
        bb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        bb[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        bg var11 = null;
        int var12 = 0;
        hd var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var5_int = param2.length;
            var6 = new String[var5_int];
            var15 = new char[var5_int];
            var14 = var15;
            var7 = var14;
            var8 = new bb[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= var5_int) {
                    break L1;
                  } else {
                    var11 = lm.field_j.a(119, param2[var10_int]);
                    var6[var10_int] = var11.g((byte) -79);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = null;
              return (bb) ((Object) stackIn_7_0);
            }
            L3: {
              if (param0 < -91) {
                break L3;
              } else {
                var13 = (hd) null;
                te.a(-59, (hd) null, (int[]) null, (hd) null, (hd) null);
                break L3;
              }
            }
            stackIn_11_0 = new bb(0L, param1, param4, param3, var8, param2, var6, var15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("te.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, boolean param5, int param6, boolean param7, int param8, boolean param9, int param10, boolean param11) {
        if (param1 > -64) {
            ii var13 = (ii) null;
            te.a(80, (ii) null, (byte) -28);
        }
        gm.a(-79, param4, param5, 16777215, param2, param8, param9, 16777215, param6, param3, param11, param7, param10, param0);
    }

    static {
        field_a = new int[]{250, 660, 1050, 1050};
        field_b = "Waiting for fonts";
    }
}
