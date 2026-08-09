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
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        int var6;
        int var7;
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
              stackIn_26_0 = 0;
              break L1;
            } else {
              stackIn_26_0 = 1000 * param4 / var6;
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
              stackIn_7_0 = 0;
              break L6;
            } else {
              stackIn_7_0 = 1000 * param4 / var6;
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
        String[] var6 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var7 = null;
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
                stackIn_11_0 = 5;

                if (ae.field_a >= 13) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 1;
                  break L2;
                }
              }
              r.field_G = fl.a(stackIn_12_0, stackIn_12_1 != 0);
              var6 = (String[]) null;
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
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("mp.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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
        field_b = new cg(14, 0, 4, 1);
        field_g = new vo();
        field_a = 0L;
    }
}
