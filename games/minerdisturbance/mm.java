/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm implements uj {
    static vm field_a;
    static vf field_b;

    final static boolean b(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 >= 32) {
            break L0;
          } else {
            field_b = (vf) null;
            break L0;
          }
        }
        var1_ref = di.field_O;
        synchronized (var1_ref) {
          L1: {
            if (dn.field_w != ll.field_d) {
              lj.field_t = jk.field_ib[dn.field_w];
              ud.field_c = hj.field_n[dn.field_w];
              dn.field_w = 127 & 1 + dn.field_w;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void a(boolean param0) {
        je.l();
        if (param0) {
            field_a = (vm) null;
        }
    }

    final static void a(boolean param0, wh param1, int param2, int param3, boolean param4, int param5) {
        Object var6 = null;
        Throwable var7 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          var6 = mj.field_o;
          synchronized (var6) {
            L0: {
              if (de.field_b != param1) {
                L1: {
                  if (param3 == 1) {
                    break L1;
                  } else {
                    mm.a(-97);
                    break L1;
                  }
                }
                L2: {
                  de.field_b = param1;
                  if (null != de.field_b) {
                    km.field_a.a(de.field_b, param4, param0, param5, param2, -22604);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = var6;
            stackOut_14_1 = new StringBuilder().append("mm.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final String a(byte param0) {
        int var2 = 104 % ((param0 - -33) / 62);
        return "Print Total Volcano Points";
    }

    static {
    }
}
