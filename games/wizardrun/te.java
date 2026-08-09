/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wl {
    boolean field_i;
    int field_j;
    int[] field_l;
    static o[] field_k;

    public static void a(int param0) {
        if (param0 != 10615) {
            return;
        }
        field_k = null;
    }

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 < -91) {
                break L1;
              } else {
                var8 = (int[]) null;
                te.a((byte) 19, (byte[]) null, (int[]) null, 2, 7);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= id.field_b.length) {
                break L0;
              } else {
                param4 = id.field_b[var5_int];
                var6 = var5_int << 976761508;
                L3: while (true) {
                  incrementValue$5 = param4;
                  param4--;
                  if (-1 == (incrementValue$5 ^ -1)) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param3 = cb.field_e[incrementValue$6];
                    dupTemp$7 = param1[param3];
                    dupTemp$8 = param2[dupTemp$7];
                    param2[dupTemp$7] = dupTemp$8 + 1;
                    cb.field_e[dupTemp$8] = param3;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("te.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    te() {
        this.field_i = false;
    }

    static {
    }
}
