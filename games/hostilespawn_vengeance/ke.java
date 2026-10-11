/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends cn {
    private int field_t;
    static ta field_s;
    static String field_w;
    private bd[] field_u;
    private int field_y;
    private int field_A;
    static int[] field_z;
    static vl field_B;
    static int[] field_v;
    static String field_x;

    public ke() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param3.field_u) {
            stackIn_6_0 = (param3.g(param2 - 24445)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof ph) {
            param4 = param4 & ((ph) (param3)).field_D;
          }
          if (param4) {
            if (var6_int == 0) {
              stackIn_13_0 = this.field_y;
            } else {
              stackIn_13_0 = this.field_A;
            }
          } else {
            stackIn_13_0 = this.field_t;
          }
          var7 = stackIn_13_0;
          stackIn_16_0 = (!param4) ? 7105644 : 16777215;
          var8 = stackIn_16_0;
          if (param2 != 15430) {
            field_x = (String) null;
          }
          km.a(param0 + param3.field_m + (-this.field_u[0].field_r + param3.field_x >> 1), param3.field_v + param1, param3.field_s, this.field_u, var7, param2 ^ 15415);
          this.field_g.a(param3.field_n, param1 + param3.field_v, -2 + (param0 + param3.field_m), param3.field_s, param3.field_x, var8, -1, 1, 1, this.field_g.field_y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ke.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    private ke(int param0, int param1, int param2) {
        this.field_t = param2;
        this.field_u = km.field_y;
        this.field_A = param1;
        this.field_y = param0;
        this.field_g = pe.field_eb;
    }

    public static void b(boolean param0) {
        field_B = null;
        field_w = null;
        if (param0) {
          field_s = null;
          field_v = null;
          field_x = null;
          field_z = null;
          return;
        }
        ke.b(true);
        field_s = null;
        field_v = null;
        field_x = null;
        field_z = null;
    }

    static {
        field_z = new int[128];
        field_w = "Night is falling. I'd better hurry.";
        field_B = new vl();
        field_v = new int[8192];
        field_x = "Type your password again to make sure it's correct";
    }
}
