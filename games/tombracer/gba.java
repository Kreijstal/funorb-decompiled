/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gba extends vg {
    String[] field_g;
    static int[] field_f;

    final static void a(int param0, int param1, int param2, ka param3, int param4, ka param5, int param6, int param7, int param8, int param9, int param10) {
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var11_int = param9 / param2 - 2;
            var12 = param6 + -(param2 * (var11_int - 1) / param0);
            var13 = var12 + param2 * var11_int;
            var14 = param1;
            gqa.a(param4, -83584144, -param2 + var12, var14, param3, param10);
            gqa.a(param8, -83584144, var13, var14, param3, param10);
            var15 = 0;
            L1: while (true) {
              if (var15 >= var11_int) {
                break L0;
              } else {
                gqa.a(dfa.a(param7, 2048, 96), -83584144, var12 + var15 * param2, var14, param5, param10);
                var15++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var11);

            stackIn_7_1 = new StringBuilder().append("gba.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static la a(int param0, boolean param1, g param2, int param3, dt param4) {
        la var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        la stackIn_3_0 = null;
        la stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5 = new la(param4, param2.field_f, param2.field_c, param0, param1);
                  var5.a((byte) 46, param2.field_e);
                  if (param3 == 21789) {
                    break L2;
                  } else {
                    field_f = (int[]) null;
                    break L2;
                  }
                }
                stackIn_3_0 = (la) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = (Exception) (Object) decompiledCaughtException;
              var5_ref.printStackTrace();
              stackIn_5_0 = mua.a(param4, param3 + -21678);
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref2);

            stackIn_8_1 = new StringBuilder().append("gba.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            field_f = (int[]) null;
        }
    }

    final static cn a(int param0, int param1) {
        if (param0 >= -83) {
            return (cn) null;
        }
        if (null != lga.field_B) {
            return lga.field_B;
        }
        if (0 == (param1 ^ -1)) {
            return lga.field_B;
        }
        return nt.a(param1, 1, 5200, false, true, true);
    }

    gba(String[] param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new int[2];
    }
}
