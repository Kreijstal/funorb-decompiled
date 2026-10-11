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
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param1.field_u) {
            stackIn_6_0 = (param1.a((byte) 75)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof ck) {
            param4 = param4 & ((ck) (param1)).field_B;
          }
          if (param4) {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_F;
            } else {
              stackIn_14_0 = this.field_z;
            }
          } else {
            stackIn_14_0 = this.field_E;
          }
          var7 = stackIn_14_0;
          ad.a(param1.field_x, param3 + param1.field_v + (-this.field_x[0].field_G + param1.field_s >> 1), param2 + param1.field_q, (byte) -2, var7, this.field_x);
          stackIn_17_0 = (!param4) ? 7105644 : 16777215;
          var8 = stackIn_17_0;
          if (param0 != 34) {
            na.c(123);
          }
          this.field_u.a(param1.field_w, param2 + param1.field_q, param3 - (-param1.field_v + 2), param1.field_x, param1.field_s, var8, -1, 1, 1, this.field_u.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("na.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_G = new int[]{28, 234, 513, 709, 950, 1046, 1325, 1430, 1693};
    }
}
