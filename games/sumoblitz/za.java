/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends ms {
    static int field_k;
    static int[] field_l;

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param3;
            L1: while (true) {
              if (rg.field_C.length <= var5_int) {
                break L0;
              } else {
                param2 = rg.field_C[var5_int];
                var6 = var5_int << 428529956;
                L2: while (true) {
                  incrementValue$5 = param2;
                  param2--;
                  if (incrementValue$5 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param4 = Sumoblitz.field_G[incrementValue$6];
                    dupTemp$7 = param0[param4];
                    dupTemp$8 = param1[dupTemp$7];
                    param1[dupTemp$7] = dupTemp$8 + 1;
                    Sumoblitz.field_G[dupTemp$8] = param4;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("za.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -93) {
            field_l = (int[]) null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static int c(boolean param0) {
        if (param0) {
            field_l = (int[]) null;
            return ht.field_h;
        }
        return ht.field_h;
    }

    protected za() {
    }

    static {
        field_k = -1;
        field_l = new int[13];
    }
}
