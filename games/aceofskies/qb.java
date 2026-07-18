/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends qm {
    private int field_q;
    private int field_p;
    private ll[] field_r;
    static char[] field_o;
    private int field_n;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            L2: {
              if (!param3.field_g) {
                if (param3.e(28660)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param3 instanceof mi) {
                param0 = param0 & ((mi) (Object) param3).field_u;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0) {
                stackOut_15_0 = ((qb) this).field_n;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_14_0 = ((qb) this).field_p;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ((qb) this).field_q;
                  stackIn_16_0 = stackOut_13_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_16_0;
              kg.a(107, param2 + param3.field_p, var7, (-((qb) this).field_r[0].field_q + param3.field_n >> 1) + param3.field_h + param4, param3.field_q, ((qb) this).field_r);
              if (param0) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 7105644;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$1 = ((qb) this).field_i.a(param3.field_f, param2 + param3.field_p, -2 + (param3.field_h + param4), param3.field_q, param3.field_n, var8, -1, 1, 1, ((qb) this).field_i.field_I);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("qb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ')');
        }
    }

    public qb() {
        this(2188450, 2591221, 9543);
    }

    private qb(int param0, int param1, int param2) {
        ((qb) this).field_q = param0;
        ((qb) this).field_n = param2;
        ((qb) this).field_r = u.field_i;
        ((qb) this).field_p = param1;
        ((qb) this).field_i = b.field_c;
    }

    public static void a() {
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[128];
    }
}
