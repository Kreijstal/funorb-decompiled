/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh implements uj {
    static double field_a;
    static rc[] field_b;
    static boolean field_f;
    static ea field_d;
    static int field_c;
    static je[][] field_e;

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == -1) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = mh.a((int[]) null, -37);
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= 8) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (param0[var2_int] == 0) {
                  var2_int++;
                  continue L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("mh.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0 != 0;
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 1;
        if (param0) {
            field_c = -35;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1 = (Object) (Object) di.field_O;
            synchronized (var1) {
              L1: {
                L2: {
                  dn.field_w = ll.field_d;
                  hb.field_b = hb.field_b + 1;
                  if (cg.field_H >= 0) {
                    L3: while (true) {
                      if (dm.field_b == cg.field_H) {
                        break L2;
                      } else {
                        var2 = ib.field_b[dm.field_b];
                        dm.field_b = dm.field_b - -1 & 127;
                        if (var2 < 0) {
                          qd.field_O[~var2] = false;
                          continue L3;
                        } else {
                          qd.field_O[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        cg.field_H = dm.field_b;
                        break L2;
                      } else {
                        qd.field_O[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                var2 = 0;
                ll.field_d = qf.field_n;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1_ref, "mh.C(" + 114 + 41);
        }
    }

    public final String a(byte param0) {
        int var2 = -104 / ((param0 - -33) / 62);
        return "Make Ore Silver";
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rc[5];
        field_a = Math.atan2(1.0, 0.0);
    }
}
