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
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        j.field_b[qn.field_e] = param0;
        qd.field_c[qn.field_e] = qn.field_e;
        dj.field_g[qn.field_e] = param1;
        if (param1 > ub.field_d) {
          L0: {
            me.field_Db = param1;
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
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L1;
            } else {
              stackOut_18_0 = 1000 * param4 / var6;
              stackIn_20_0 = stackOut_18_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_20_0;
            qp.field_b[qn.field_e] = var7;
            qn.field_e = qn.field_e + 1;
            if (var7 < sg.field_pb) {
              sg.field_pb = var7;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
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
            if (param1 < fe.field_O) {
              sg.field_pb = param1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            qo.field_r[qn.field_e] = param4;
            sg.field_kb[qn.field_e] = param5;
            jd.field_d[qn.field_e] = param2;
            var6 = param5 + (param4 + param2);
            if (0 == var6) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L5;
            } else {
              stackOut_5_0 = 1000 * param4 / var6;
              stackIn_7_0 = stackOut_5_0;
              break L5;
            }
          }
          L6: {
            var7 = stackIn_7_0;
            qp.field_b[qn.field_e] = var7;
            qn.field_e = qn.field_e + 1;
            if (var7 < sg.field_pb) {
              sg.field_pb = var7;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (me.field_Db < var7) {
              me.field_Db = var7;
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final static void a(int param0, String[] param1, int param2, String param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            tk.field_a = hm.field_H;
            if (param2 == 255) {
              L1: {
                stackOut_7_0 = 5;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (ae.field_a >= 13) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
              }
              r.field_G = fl.a(stackIn_10_0, stackIn_10_1 != 0);
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
                  var4 = param1;
                  hn.a(false, var4);
                  r.field_G = ao.a(param1, -120);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("mp.A(").append(1000).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    public static void a() {
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
