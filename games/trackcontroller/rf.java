/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static int[] field_a;
    static int field_b;
    static String field_d;
    static fj field_e;

    public static void a() {
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        aj var4 = null;
        ti var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (aj) (Object) ub.field_e.b(2);
            L1: while (true) {
              if (var4 == null) {
                field_d = null;
                var5 = (ti) (Object) ea.field_s.b(2);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    mc.a(false, 3, var5);
                    var5 = (ti) (Object) ea.field_s.a(10);
                    continue L2;
                  }
                }
              } else {
                we.a(3, var4, (byte) -47);
                var4 = (aj) (Object) ub.field_e.a(10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "rf.E(" + 3 + 44 + 0 + 41);
        }
    }

    final static boolean b() {
        int var1 = 70;
        if (null == tk.field_u) {
            return false;
        }
        if (!tk.field_u.a(32130)) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        r.field_j = -1;
        nl.field_f = null;
        cd.field_j = false;
        aj.field_m = -1;
        vl.field_H = 0;
    }

    final static ji[] a(uf param0) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ji[] var4 = null;
        int var5 = 0;
        ji var6 = null;
        int var7 = 0;
        ce var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ji[] stackIn_4_0 = null;
        ji[] stackIn_10_0 = null;
        ji[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji[] stackOut_3_0 = null;
        ji[] stackOut_14_0 = null;
        ji[] stackOut_9_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0.b(-4)) {
              stackOut_3_0 = new ji[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param0.a(75);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (var8.field_f != 2) {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new ji[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_14_0 = (ji[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new ji();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 2];
                        var6.field_c = var3[(var5 << 2) - -1];
                        var6.field_b = var3[2 + (var5 << 2)];
                        var6.field_g = var3[(var5 << 2) + 3];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_9_0 = new ji[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  int discarded$1 = 0;
                  wl.a(10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("rf.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 41);
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Password: ";
        field_a = new int[1024];
    }
}
