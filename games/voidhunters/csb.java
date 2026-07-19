/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class csb implements dja {
    final static void a(boolean param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            if (!vba.f((byte) -124)) {
              L1: {
                if (null == psb.field_b) {
                  break L1;
                } else {
                  if (!psb.field_b.field_a) {
                    break L1;
                  } else {
                    spb.a((byte) -95);
                    qn.field_h.a(false, new mr(qn.field_h, bca.field_a));
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              discarded$15 = qn.field_h.a((byte) -5, ata.field_H, uo.field_o, param0);
              qn.field_h.h(19976);
              L2: while (true) {
                if (!ata.e(127)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = qn.field_h.a(-9445, pma.field_o, jl.field_r);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "csb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final tv a(byte param0) {
        int var2 = -98 % ((-64 - param0) / 50);
        return (tv) ((Object) new kc());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            csb.a(true);
            return (tv[]) ((Object) new kc[param1]);
        }
        return (tv[]) ((Object) new kc[param1]);
    }

    static {
    }
}
