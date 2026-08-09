/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends jm {
    private int field_x;
    static String field_v;
    static String field_s;
    private int field_q;
    private int field_w;
    static String field_y;
    private qb[] field_u;
    static String field_r;
    static int field_p;
    static String field_t;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param0.field_w) {
                if (param0.d(-2116)) {
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
              if (!(param0 instanceof ag)) {
                break L2;
              } else {
                param4 = param4 & ((ag) ((Object) param0)).field_B;
                break L2;
              }
            }
            L3: {
              if (param4) {
                if (var6_int != 0) {
                  stackIn_13_0 = this.field_q;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_x;
                  break L3;
                }
              } else {
                stackIn_13_0 = this.field_w;
                break L3;
              }
            }
            var7 = stackIn_13_0;
            if (param1 == 5592405) {
              L4: {
                if (!param4) {
                  stackIn_18_0 = 7105644;
                  break L4;
                } else {
                  stackIn_18_0 = 16777215;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              ne.a(-52, param0.field_v, this.field_u, param0.field_j + (param3 - -(-this.field_u[0].field_w + param0.field_k >> -54344703)), param0.field_n + param2, var7);
              this.field_g.a(param0.field_g, param2 - -param0.field_n, -2 + param3 - -param0.field_j, param0.field_v, param0.field_k, var8, -1, 1, 1, this.field_g.field_C);
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
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("mm.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public mm() {
        this(2188450, 2591221, 9543);
    }

    private mm(int param0, int param1, int param2) {
        this.field_q = param1;
        this.field_g = go.field_k;
        this.field_u = af.field_Jb;
        this.field_w = param2;
        this.field_x = param0;
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        field_v = null;
        if (param0 != 2188450) {
          field_p = -108;
          field_s = null;
          field_y = null;
          return;
        } else {
          field_s = null;
          field_y = null;
          return;
        }
    }

    static {
        field_s = "Open in popup window";
        field_v = "This game has started.";
        field_y = "(<%0> players want to join)";
        field_r = "Become a member to get this expansion and...";
        field_t = "Loading extra data";
    }
}
