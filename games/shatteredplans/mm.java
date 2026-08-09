/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ml {
    static String field_p;
    static bi field_o;
    static boolean field_n;
    static String field_q;

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(-11196, param1) != tj.field_b) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(true, (String) null);
                  break L1;
                }
              }
              stackIn_6_0 = dn.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = ig.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("mm.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 >= -67) {
            field_p = (String) null;
        }
    }

    mm(go param0) {
        super(param0);
    }

    final static void f(int param0) {
        L0: {
          if (ji.field_G != null) {
            ji.field_G.i((byte) -104);
            break L0;
          } else {
            break L0;
          }
        }
        sj.field_b = new ir();
        if (param0 != -26049) {
          field_o = (bi) null;
          ae.field_f.b(sj.field_b, -54);
          return;
        } else {
          ae.field_f.b(sj.field_b, -54);
          return;
        }
    }

    final static void d(int param0) {
        if (param0 != -16705) {
          field_n = false;
          bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w);
          return;
        } else {
          bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w);
          return;
        }
    }

    final u b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        u stackIn_5_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (vn.a(64, param1) != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (param0 == -11196) {
              if (var3_int == 0) {
                stackIn_9_0 = tj.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return p.field_g;
              }
            } else {
              stackIn_5_0 = (u) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("mm.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_q = "Project is complete. Click to place.";
        field_p = "Invite only";
    }
}
