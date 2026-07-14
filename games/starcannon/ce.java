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
        int var2 = 0;
        var2 = StarCannon.field_A;
        if (fl.d(897584976)) {
          if (param0 < -92) {
            boolean discarded$4 = ed.field_q.a((byte) -127, true, bg.field_e, ie.field_z);
            ed.field_q.h(-10597);
            L0: while (true) {
              if (!ad.e((byte) -123)) {
                return;
              } else {
                boolean discarded$5 = ed.field_q.a(lb.field_B, -125, StarCannon.field_E);
                continue L0;
              }
            }
          } else {
            field_a = null;
            boolean discarded$6 = ed.field_q.a((byte) -127, true, bg.field_e, ie.field_z);
            ed.field_q.h(-10597);
            L1: while (true) {
              if (!ad.e((byte) -123)) {
                return;
              } else {
                boolean discarded$7 = ed.field_q.a(lb.field_B, -125, StarCannon.field_E);
                continue L1;
              }
            }
          }
        } else {
          if (n.field_a != null) {
            if (!n.field_a.field_b) {
              return;
            } else {
              re.a(0);
              ed.field_q.a((byte) 85, (uj) (Object) new vj(ed.field_q, cb.field_d));
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        re var4 = null;
        vc var5 = null;
        var3 = StarCannon.field_A;
        if (param1 < -46) {
          var4 = (re) (Object) s.field_e.c(-3905);
          L0: while (true) {
            if (var4 == null) {
              var5 = (vc) (Object) ne.field_c.c(-3905);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ea.a((byte) 66, var5, param0);
                  var5 = (vc) (Object) ne.field_c.a(-16913);
                  continue L1;
                }
              }
            } else {
              vh.a(param0, var4, 0);
              var4 = (re) (Object) s.field_e.a(-16913);
              continue L0;
            }
          }
        } else {
          ce.a(55);
          var4 = (re) (Object) s.field_e.c(-3905);
          L2: while (true) {
            if (var4 == null) {
              var5 = (vc) (Object) ne.field_c.c(-3905);
              L3: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ea.a((byte) 66, var5, param0);
                  var5 = (vc) (Object) ne.field_c.a(-16913);
                  continue L3;
                }
              }
            } else {
              vh.a(param0, var4, 0);
              var4 = (re) (Object) s.field_e.a(-16913);
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new o(8, 0, 4, 1);
    }
}
