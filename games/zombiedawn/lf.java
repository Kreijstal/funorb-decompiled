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
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param2 == -7235) {
                break L1;
              } else {
                lf.a(-15);
                break L1;
              }
            }
            L2: {
              var3 = am.a(param0, 1);
              if (param1.indexOf(param0) != -1) {
                break L2;
              } else {
                if (param1.indexOf(var3) != -1) {
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
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                  break L0;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("lf.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != -9742) {
            field_m = 16;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static void a(int param0, int param1) {
        cn.field_f = null;
        kj.field_c = param0;
        id.field_D = param0;
        rl.field_f = true;
        te.field_eb = param1;
        ul.field_d = param1;
        Object var4 = null;
        bi.a((int[]) null, 0, 0);
        cn.field_f = l.a(-1, param0, (java.awt.Component) (Object) cj.field_d, param1);
        cn.field_f.b(-127);
        ba.a(18002, param0 / 2, param1 / 2);
        pl.a(param1, param0, (byte) 50);
        int discarded$0 = -21141;
        ep.a(param0, param1);
        hn.a(param1 / 2, (byte) -91, param0 / 2);
    }

    final void c(byte param0) {
        Object var3 = null;
        ((lf) this).field_s = null;
        ((lf) this).field_u = null;
        if (param0 <= 122) {
          var3 = null;
          boolean discarded$2 = lf.a((String) null, (String) null, -37);
          ((lf) this).field_t = null;
          ((lf) this).field_E = null;
          return;
        } else {
          ((lf) this).field_t = null;
          ((lf) this).field_E = null;
          return;
        }
    }

    lf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_h = new vn(640, 480);
    }
}
