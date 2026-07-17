/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;
    static String field_c;

    final static void a(int param0, int param1) {
        L0: {
          L1: {
            if (bd.field_Q == null) {
              break L1;
            } else {
              if (null != i.field_k[param1]) {
                lc.field_d = i.field_k[param1];
                gn.a(false, i.field_k[param1], (byte) 69, 30);
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (ab.field_jb != -1) {
            break L0;
          } else {
            bi.field_e = 2;
            ab.field_jb = param1;
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
    }

    final static boolean a(byte param0, ei param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = qh.a((byte) -114, (ei) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= param1.field_e) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (((vj) param1.field_b[var2_int]).field_q) {
                  var2_int++;
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("qh.E(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static fg a(int param0) {
        if (param0 < 80) {
            fg discarded$0 = qh.a(67);
        }
        return pk.field_H;
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) tf.field_n;
        synchronized (var1_ref) {
          L0: {
            if (qd.field_i != vj.field_l) {
              aa.field_n = p.field_a[vj.field_l];
              pk.field_M = d.field_b[vj.field_l];
              if (param0 < -23) {
                vj.field_l = 127 & 1 + vj.field_l;
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Touring Car";
        field_d = null;
        field_e = "Leaderboard";
        field_c = "Log in";
    }
}
