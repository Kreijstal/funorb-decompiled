/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hh {
    static ji field_D;
    static cn field_A;
    static cc field_y;
    private int field_F;
    private cn[] field_x;
    private int field_z;
    static tf field_w;
    private int field_E;
    static cn[] field_C;
    static int[] field_G;

    public static void c(int param0) {
        field_A = null;
        if (param0 >= -26) {
            return;
        }
        field_C = null;
        field_G = null;
        field_D = null;
        field_w = null;
        field_y = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        hd.a(param1 ^ 2599413, param2, (String) null, param0);
        if (param1 != 2591221) {
            field_A = (cn) null;
        }
    }

    public na() {
        this(2188450, 2591221, 9543);
    }

    private na(int param0, int param1, int param2) {
        this.field_x = field_C;
        this.field_E = param2;
        this.field_F = param1;
        this.field_z = param0;
        this.field_u = hc.field_f;
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param1.field_u) {
                if (param1.a((byte) 75)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param1 instanceof ck) {
                param4 = param4 & ((ck) ((Object) param1)).field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackIn_14_0 = this.field_F;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_z;
                  break L3;
                }
              } else {
                stackIn_14_0 = this.field_E;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              ad.a(param1.field_x, param3 + param1.field_v - -(-this.field_x[0].field_G + param1.field_s >> -689401247), param2 - -param1.field_q, (byte) -2, var7, this.field_x);
              if (!param4) {
                stackIn_17_0 = 7105644;
                break L4;
              } else {
                stackIn_17_0 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_17_0;
              if (param0 == 34) {
                break L5;
              } else {
                na.c(123);
                break L5;
              }
            }
            this.field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, this.field_u.field_H);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("na.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_G = new int[]{28, 234, 513, 709, 950, 1046, 1325, 1430, 1693};
    }
}
