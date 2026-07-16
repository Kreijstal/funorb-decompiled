/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm implements uj {
    static vm field_a;
    static vf field_b;

    final static boolean b(byte param0) {
        Object var1 = null;
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
            field_b = null;
            break L0;
          }
        }
        var1 = (Object) (Object) di.field_O;
        synchronized (var1) {
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
            field_a = null;
        }
    }

    final static void a(boolean param0, wh param1, int param2, int param3, boolean param4, int param5) {
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        var6_ref = (Object) (Object) mj.field_o;
        synchronized (var6_ref) {
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
    }

    public final String a(byte param0) {
        int var2 = 104 % ((param0 - -33) / 62);
        return "Print Total Volcano Points";
    }

    static {
    }
}
