/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsa extends qr {
    private int field_G;
    static String field_F;
    private String field_C;
    private int field_D;
    static String field_z;
    private boolean field_E;
    private int field_A;
    private il field_B;
    static String field_y;

    final String d(byte param0) {
        int var3 = 114 % ((param0 - -58) / 60);
        int var2 = ((jsa) this).field_x.field_f ? 1 : 0;
        ((jsa) this).field_x.field_f = ((jsa) this).field_f;
        String var4 = ((jsa) this).field_x.d((byte) 56);
        ((jsa) this).field_x.field_f = var2 != 0 ? true : false;
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((jsa) this).field_i + param0;
        int var6 = ((jsa) this).field_n - -param1;
        super.a(param0, param1, param2 ^ param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        int var7 = ((jsa) this).field_E ? ((jsa) this).field_m - ((jsa) this).field_D - ((jsa) this).field_G * 2 : 0;
        int discarded$0 = ((jsa) this).field_B.a(((jsa) this).field_C, ((jsa) this).field_G + var5 - -var7, ((jsa) this).field_G + var6, ((jsa) this).field_D + -((jsa) this).field_G, -(((jsa) this).field_G * 2) + ((jsa) this).field_p, ((jsa) this).field_A, -1, !((jsa) this).field_E ? 2 : 0, 1, ((jsa) this).field_B.field_w);
    }

    jsa(int param0, int param1, int param2, int param3, ae param4, boolean param5, int param6, int param7, il param8, int param9, String param10) {
        super(param0, param1, param2, param3, (isa) null, (qc) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((jsa) this).field_D = param6;
              ((jsa) this).field_A = param9;
              ((jsa) this).field_C = param10;
              ((jsa) this).field_B = param8;
              ((jsa) this).field_x = param4;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((jsa) this).field_E = stackIn_4_1 != 0;
              ((jsa) this).field_G = param7;
              var12_int = -((jsa) this).field_G + ((jsa) this).field_D;
              var13 = ((jsa) this).field_B.a(param10, var12_int, ((jsa) this).field_B.field_w) - -(((jsa) this).field_G * 2);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                ((jsa) this).a((byte) -31, param2, var13, param0, param1);
                break L2;
              }
            }
            L3: {
              if (((jsa) this).field_E) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 2 * ((jsa) this).field_G + ((jsa) this).field_D;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((jsa) this).field_x.a((byte) -31, -((jsa) this).field_D + param2 + -(((jsa) this).field_G * 3), -(((jsa) this).field_G * 2) + param3, var14, ((jsa) this).field_G - -(var13 - param3 >> 1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("jsa.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static iu[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 2) {
          field_z = null;
          return hi.a(param0, 1, param3, 1, 0, 1, 3, true, param2);
        } else {
          return hi.a(param0, 1, param3, 1, 0, 1, 3, true, param2);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        bf.field_a = param1;
    }

    public static void e(int param0) {
        field_z = null;
        field_F = null;
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Show all private chat";
        field_F = "Waiting for Other Players";
        field_y = "This is your RuneScape clan if you have one.";
    }
}
