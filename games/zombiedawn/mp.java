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
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 1000) {
                break L1;
              } else {
                mp.a(60, 54, 115, 107, -9, 93);
                break L1;
              }
            }
            tk.field_a = hm.field_H;
            if (param2 == 255) {
              L2: {
                stackOut_9_0 = 5;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (ae.field_a >= 13) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L2;
                }
              }
              r.field_G = fl.a(stackIn_12_0, stackIn_12_1 != 0);
              var6 = null;
              hn.a(false, (String[]) null);
              break L0;
            } else {
              if (param2 < 100) {
                r.field_G = te.a(param3, -13466, param2);
                return;
              } else {
                if (105 < param2) {
                  r.field_G = te.a(param3, -13466, param2);
                  return;
                } else {
                  var7 = param1;
                  hn.a(false, var7);
                  r.field_G = ao.a(param1, param0 ^ -928);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("mp.A(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_g = null;
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
