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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param3.field_u) {
                if (param3.g(param2 + -24445)) {
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
              if (!(param3 instanceof ph)) {
                break L2;
              } else {
                param4 = param4 & ((ph) ((Object) param3)).field_D;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int == 0) {
                  stackIn_13_0 = this.field_y;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_A;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_t;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (!param4) {
                stackIn_16_0 = 7105644;
                break L4;
              } else {
                stackIn_16_0 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 == 15430) {
                break L5;
              } else {
                field_x = (String) null;
                break L5;
              }
            }
            km.a(param0 - -param3.field_m + (-this.field_u[0].field_r + param3.field_x >> -1441869631), param3.field_v + param1, param3.field_s, this.field_u, var7, param2 ^ 15415);
            this.field_g.a(param3.field_n, param1 + param3.field_v, -2 + (param0 + param3.field_m), param3.field_s, param3.field_x, var8, -1, 1, 1, this.field_g.field_y);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ke.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
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
        if (!param0) {
          ke.b(true);
          field_s = null;
          field_v = null;
          field_x = null;
          field_z = null;
          return;
        } else {
          field_s = null;
          field_v = null;
          field_x = null;
          field_z = null;
          return;
        }
    }

    static {
        field_z = new int[128];
        field_w = "Night is falling. I'd better hurry.";
        field_B = new vl();
        field_v = new int[8192];
        field_x = "Type your password again to make sure it's correct";
    }
}
