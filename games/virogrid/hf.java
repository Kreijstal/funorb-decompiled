/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends aj {
    private int field_u;
    private int field_B;
    private mg[] field_x;
    private int field_y;
    static java.awt.Color field_v;
    static int field_C;
    static int[] field_D;
    static int[] field_A;
    static sh field_w;
    static int[] field_z;

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param1.field_p) {
                if (param1.f(true)) {
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
              if (param1 instanceof tg) {
                param2 = param2 & ((tg) ((Object) param1)).field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param2) {
                stackIn_14_0 = this.field_u;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackIn_14_0 = this.field_B;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_y;
                  break L3;
                }
              }
            }
            var7 = stackIn_14_0;
            if (param4 == -23294) {
              L4: {
                if (param2) {
                  stackIn_19_0 = 16777215;
                  break L4;
                } else {
                  stackIn_19_0 = 7105644;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              kd.a(this.field_x, param1.field_u + param3 + (param1.field_m + -this.field_x[0].field_z >> 1149084929), false, param1.field_g, param1.field_l + param0, var7);
              this.field_i.a(param1.field_n, param0 - -param1.field_l, param3 + param1.field_u - 2, param1.field_g, param1.field_m, var8, -1, 1, 1, this.field_i.field_H);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("hf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_w = null;
        field_A = null;
        if (param0 >= -79) {
            return;
        }
        field_v = null;
        field_z = null;
        field_D = null;
    }

    private hf(int param0, int param1, int param2) {
        this.field_u = param2;
        this.field_x = td.field_g;
        this.field_B = param0;
        this.field_y = param1;
        this.field_i = on.field_b;
    }

    public hf() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_v = new java.awt.Color(10040319);
        field_A = new int[8192];
        field_z = new int[8192];
    }
}
