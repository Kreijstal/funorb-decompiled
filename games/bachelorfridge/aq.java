/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static int[] field_a;
    static sna field_b;

    final static void a(int param0, byte param1) {
        pf var2 = null;
        if (param1 < 42) {
          aq.a(121, (byte) 73);
          var2 = sja.field_fb;
          var2.c(param0, (byte) 115);
          var2.d(1, 0);
          var2.d(0, 0);
          return;
        } else {
          var2 = sja.field_fb;
          var2.c(param0, (byte) 115);
          var2.d(1, 0);
          var2.d(0, 0);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        tla.d(param1 ^ 92);
        if (0 == param0) {
          cr.field_c = je.a(wt.field_m[0], 256, 96);
          cr.field_c.d(-1);
          ofa.a(0, cr.field_c);
          if (param1 != -1) {
            aq.a(-13, (byte) 0);
            return;
          } else {
            return;
          }
        } else {
          if ((param0 ^ -1) != -2) {
            if (2 == param0) {
              cr.field_c = je.a(wt.field_m[1], 256, 96);
              sla.field_a = je.a(wt.field_m[3], 256, 96);
              cr.field_c.d(-1);
              sla.field_a.d(-1);
              ofa.a(param1 + 1, cr.field_c);
              ofa.a(0, sla.field_a);
              if (param1 != -1) {
                aq.a(-13, (byte) 0);
                return;
              } else {
                return;
              }
            } else {
              if (3 == param0) {
                cr.field_c = je.a(wt.field_m[1], 256, 96);
                sla.field_a = je.a(wt.field_m[5], 256, 96);
                m.field_b = je.a(wt.field_m[4], 256, 96);
                cr.field_c.d(-1);
                sla.field_a.d(-1);
                m.field_b.d(-1);
                ofa.a(0, cr.field_c);
                ofa.a(param1 ^ -1, sla.field_a);
                ofa.a(0, m.field_b);
                if (param1 != -1) {
                  aq.a(-13, (byte) 0);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 == -1) {
                  return;
                } else {
                  aq.a(-13, (byte) 0);
                  return;
                }
              }
            }
          } else {
            cr.field_c = je.a(wt.field_m[1], 256, 96);
            sla.field_a = je.a(wt.field_m[2], 256, 96);
            cr.field_c.d(-1);
            sla.field_a.d(-1);
            ofa.a(0, cr.field_c);
            ofa.a(0, sla.field_a);
            if (param1 == -1) {
              return;
            } else {
              aq.a(-13, (byte) 0);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -123) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[128];
    }
}
