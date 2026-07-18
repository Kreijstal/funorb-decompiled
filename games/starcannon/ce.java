/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static o field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 30518) {
            field_a = null;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = StarCannon.field_A;
        try {
          L0: {
            if (fl.d(897584976)) {
              boolean discarded$15 = ed.field_q.a((byte) -127, true, bg.field_e, ie.field_z);
              ed.field_q.h(-10597);
              L1: while (true) {
                if (!ad.e((byte) -123)) {
                  break L0;
                } else {
                  boolean discarded$16 = ed.field_q.a(lb.field_B, -125, StarCannon.field_E);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (n.field_a == null) {
                  break L2;
                } else {
                  if (n.field_a.field_b) {
                    re.a(0);
                    ed.field_q.a((byte) 85, (uj) (Object) new vj(ed.field_q, cb.field_d));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ce.C(" + -100 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        vc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1 < -46) {
                break L1;
              } else {
                ce.a(55);
                break L1;
              }
            }
            var4 = (re) (Object) s.field_e.c(-3905);
            L2: while (true) {
              if (var4 == null) {
                var5 = (vc) (Object) ne.field_c.c(-3905);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ea.a((byte) 66, var5, 3);
                    var5 = (vc) (Object) ne.field_c.a(-16913);
                    continue L3;
                  }
                }
              } else {
                vh.a(3, var4, 0);
                var4 = (re) (Object) s.field_e.a(-16913);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "ce.B(" + 3 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new o(8, 0, 4, 1);
    }
}
