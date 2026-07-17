/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends ag {
    private qm field_J;
    static int field_H;
    static long field_K;
    static String field_I;

    final static void i(byte param0) {
        L0: {
          rk.field_O.q(-256);
          if (mj.field_p >= 6) {
            if (7 != mj.field_p) {
              gj.a(true, true, 14, mn.field_r);
              df.a((byte) 120, mj.field_p - -1);
              break L0;
            } else {
              if (param0 != 74) {
                mh.g((byte) 11);
                return;
              } else {
                return;
              }
            }
          } else {
            int discarded$2 = -20675;
            if (co.a() != 0) {
              break L0;
            } else {
              L1: {
                if (7 != mj.field_p) {
                  gj.a(true, true, 14, mn.field_r);
                  df.a((byte) 120, mj.field_p - -1);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 != 74) {
                mh.g((byte) 11);
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param0 == 74) {
          return;
        } else {
          mh.g((byte) 11);
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((mh) this).field_J = null;
                break L1;
              }
            }
            stackOut_2_0 = ((mh) this).field_J.a(param0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mh.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    mh(qm param0) {
        try {
            ((mh) this).field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void h() {
        int var1 = 0;
        field_I = null;
    }

    final static void g(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 45) {
            break L0;
          } else {
            mh.i((byte) -22);
            break L0;
          }
        }
        if (null == ch.field_a) {
          return;
        } else {
          var1 = (Object) (Object) ch.field_a;
          synchronized (var1) {
            L1: {
              ch.field_a = null;
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Wands ";
    }
}
