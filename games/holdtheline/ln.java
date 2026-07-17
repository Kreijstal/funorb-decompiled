/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ln extends hl {
    static jn field_k;
    long field_i;
    ln field_n;
    static String field_j;
    static String field_m;
    ln field_l;

    final static float a(int param0, float param1) {
        if (param0 != -29407) {
            return -0.6477053165435791f;
        }
        if (param1 > 0.0f) {
            return 1.0f;
        }
        if (param1 < 0.0f) {
            return -1.0f;
        }
        return 0.0f;
    }

    final static e a(int param0, byte param1) {
        e[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        e[] var5 = null;
        var4 = HoldTheLine.field_D;
        int discarded$2 = 4;
        var5 = wg.a();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param0 == var5[var3].field_f) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = tl.field_w.a(param0, false, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ln.DB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        if (((ln) this).field_l == null) {
            return;
        }
        if (param0 != -42) {
            field_j = null;
        }
        ((ln) this).field_l.field_n = ((ln) this).field_n;
        ((ln) this).field_n.field_l = ((ln) this).field_l;
        ((ln) this).field_n = null;
        ((ln) this).field_l = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 >= 92) {
                break L1;
              } else {
                float discarded$21 = ln.a(11, -0.14343492686748505f);
                break L1;
              }
            }
            int discarded$22 = -118;
            if (ii.a()) {
              boolean discarded$23 = r.field_a.a(ab.field_lb, di.field_r, true, false);
              r.field_a.g((byte) -59);
              L2: while (true) {
                if (!qh.c(-44)) {
                  break L0;
                } else {
                  boolean discarded$24 = r.field_a.a(aa.field_n, pk.field_M, (byte) 117);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (null == cc.field_w) {
                  break L3;
                } else {
                  if (!cc.field_w.field_a) {
                    break L3;
                  } else {
                    ij.c(4);
                    r.field_a.a((n) (Object) new rf(r.field_a, sk.field_a), false);
                    break L3;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "ln.EB(" + param0 + 41);
        }
    }

    protected ln() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Achieved";
        field_m = "DNF";
    }
}
