/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static cg field_b;
    static vo field_g;
    static eo field_f;
    static int field_d;
    static boolean field_e;
    static long field_a;
    static boolean field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        j.field_b[qn.field_e] = param0;
        qd.field_c[qn.field_e] = qn.field_e;
        dj.field_g[qn.field_e] = param1;
        if (param1 <= ub.field_d) {
          L0: {
            if (param1 < fe.field_O) {
              sg.field_pb = param1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            qo.field_r[qn.field_e] = param4;
            sg.field_kb[qn.field_e] = param5;
            jd.field_d[qn.field_e] = param2;
            var6 = param5 + (param4 + param2);
            if (0 == var6) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L1;
            } else {
              stackOut_24_0 = 1000 * param4 / var6;
              stackIn_26_0 = stackOut_24_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_26_0;
            qp.field_b[qn.field_e] = var7;
            qn.field_e = qn.field_e + 1;
            if (var7 < sg.field_pb) {
              sg.field_pb = var7;
              break L2;
            } else {
              break L2;
            }
          }
          if (param3 != 1000) {
            L3: {
              field_c = false;
              if (me.field_Db < var7) {
                me.field_Db = var7;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (me.field_Db < var7) {
                me.field_Db = var7;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            me.field_Db = param1;
            if (param1 < fe.field_O) {
              sg.field_pb = param1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            qo.field_r[qn.field_e] = param4;
            sg.field_kb[qn.field_e] = param5;
            jd.field_d[qn.field_e] = param2;
            var6 = param5 + (param4 + param2);
            if (0 == var6) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L6;
            } else {
              stackOut_5_0 = 1000 * param4 / var6;
              stackIn_7_0 = stackOut_5_0;
              break L6;
            }
          }
          L7: {
            var7 = stackIn_7_0;
            qp.field_b[qn.field_e] = var7;
            qn.field_e = qn.field_e + 1;
            if (var7 < sg.field_pb) {
              sg.field_pb = var7;
              break L7;
            } else {
              break L7;
            }
          }
          if (param3 != 1000) {
            L8: {
              field_c = false;
              if (me.field_Db < var7) {
                me.field_Db = var7;
                break L8;
              } else {
                break L8;
              }
            }
            return;
          } else {
            L9: {
              if (me.field_Db < var7) {
                me.field_Db = var7;
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = ZombieDawn.field_J;
        if (param0 == 1000) {
          tk.field_a = hm.field_H;
          if (param2 != 255) {
            if (param2 >= 100) {
              if (105 >= param2) {
                var8 = param1;
                hn.a(false, var8);
                r.field_G = ao.a(param1, param0 ^ -928);
                return;
              } else {
                r.field_G = te.a(param3, -13466, param2);
                return;
              }
            } else {
              r.field_G = te.a(param3, -13466, param2);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 5;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (ae.field_a >= 13) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            r.field_G = fl.a(stackIn_16_0, stackIn_16_1 != 0);
            var6 = null;
            hn.a(false, (String[]) null);
            return;
          }
        } else {
          mp.a(60, 54, 115, 107, -9, 93);
          tk.field_a = hm.field_H;
          if (param2 != 255) {
            if (param2 >= 100) {
              if (105 >= param2) {
                var7 = param1;
                hn.a(false, var7);
                r.field_G = ao.a(param1, param0 ^ -928);
                return;
              } else {
                r.field_G = te.a(param3, -13466, param2);
                return;
              }
            } else {
              r.field_G = te.a(param3, -13466, param2);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 5;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (ae.field_a >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            r.field_G = fl.a(stackIn_5_0, stackIn_5_1 != 0);
            var6 = null;
            hn.a(false, (String[]) null);
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 13) {
          field_e = true;
          field_b = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new cg(14, 0, 4, 1);
        field_g = new vo();
        field_a = 0L;
    }
}
