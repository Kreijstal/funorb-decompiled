/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static o field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 30518) {
          field_a = (o) null;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = StarCannon.field_A;
        try {
          if (!fl.d(897584976)) {
            if (n.field_a != null &&
              n.field_a.field_b) {
              re.a(0);
              ed.field_q.a((byte) 85, (uj) (new vj(ed.field_q, cb.field_d)));
            }
            return;
          }
          if (param0 >= -92) {
            field_a = (o) null;
          }
          ed.field_q.a((byte) -127, true, bg.field_e, ie.field_z);
          ed.field_q.h(-10597);
          while (ad.e((byte) -123)) {
            ed.field_q.a(lb.field_B, -125, StarCannon.field_E);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ce.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        re var4 = null;
        vc var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = StarCannon.field_A;
        try {
          if (param1 >= -46) {
            ce.a(55);
          }
          var4 = (re) (s.field_e.c(-3905));
          while (var4 != null) {
            vh.a(param0, var4, 0);
            var4 = (re) (s.field_e.a(-16913));
          }
          var5 = (vc) (ne.field_c.c(-3905));
          while (var5 != null) {
            ea.a((byte) 66, var5, param0);
            var5 = (vc) (ne.field_c.a(-16913));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "ce.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new o(8, 0, 4, 1);
    }
}
