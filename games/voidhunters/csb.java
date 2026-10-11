/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class csb implements dja {
    final static void a(boolean param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = VoidHunters.field_G;
        try {
          if (!vba.f((byte) -124)) {
            if (null != psb.field_b &&
              psb.field_b.field_a) {
              spb.a((byte) -95);
              qn.field_h.a(false, new mr(qn.field_h, bca.field_a));
            }
            return;
          }
          qn.field_h.a((byte) -5, ata.field_H, uo.field_o, param0);
          qn.field_h.h(19976);
          while (ata.e(127)) {
            qn.field_h.a(-9445, pma.field_o, jl.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "csb.C(" + param0 + ')');
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
