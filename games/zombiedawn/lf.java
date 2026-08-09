/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends le {
    int field_y;
    int field_w;
    static boolean field_n;
    static vn field_h;
    int field_C;
    ma field_u;
    int field_A;
    int field_D;
    int field_l;
    fn field_E;
    int field_q;
    int field_p;
    int field_r;
    nf field_t;
    int field_k;
    gi field_s;
    static volatile int field_m;
    int field_v;
    int field_z;
    int field_B;
    int field_o;
    int field_j;
    int field_x;
    int field_i;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2 == -7235) {
                break L1;
              } else {
                lf.a(-15);
                break L1;
              }
            }
            L2: {
              var3 = am.a(param0, 1);
              if (0 != (param1.indexOf(param0) ^ -1)) {
                break L2;
              } else {
                if ((param1.indexOf(var3) ^ -1) != 0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param1.startsWith(param0)) {
                        break L4;
                      } else {
                        if (param1.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param1.endsWith(param0)) {
                            break L4;
                          } else {
                            if (!param1.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("lf.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    public static void a(int param0) {
        if (param0 != -9742) {
            field_m = 16;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2) {
        cn.field_f = null;
        kj.field_c = param0;
        id.field_D = param0;
        rl.field_f = true;
        te.field_eb = param1;
        ul.field_d = param1;
        int[] var4 = (int[]) null;
        bi.a((int[]) null, 0, 0);
        cn.field_f = l.a(-1, param0, (java.awt.Component) ((Object) cj.field_d), param1);
        cn.field_f.b(param2 + -129);
        ba.a(18002, param0 / 2, param1 / 2);
        pl.a(param1, param0, (byte) 50);
        ep.a(param0, param1, -21141);
        hn.a(param1 / 2, (byte) -91, param0 / param2);
    }

    final void c(byte param0) {
        String var3;
        this.field_s = null;
        this.field_u = null;
        if (param0 <= 122) {
          var3 = (String) null;
          lf.a((String) null, (String) null, -37);
          this.field_t = null;
          this.field_E = null;
          return;
        } else {
          this.field_t = null;
          this.field_E = null;
          return;
        }
    }

    lf() {
    }

    static {
        field_m = -1;
        field_h = new vn(640, 480);
    }
}
