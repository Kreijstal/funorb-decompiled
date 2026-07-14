/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends dk {
    static bd[] field_u;
    static String field_r;
    static bd field_t;
    static bd[] field_q;
    static int field_s;

    final static void a(boolean param0, boolean param1, byte param2) {
        L0: {
          if (!param0) {
            si.d();
            si.d();
            si.d();
            break L0;
          } else {
            si.a(0, 0, si.field_e, si.field_k, 0, 192);
            break L0;
          }
        }
        if (param2 <= 5) {
          field_u = null;
          lf.a((byte) 84, param0);
          return;
        } else {
          lf.a((byte) 84, param0);
          return;
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        field_q = null;
        field_t = null;
        field_u = null;
        if (param0) {
            Object var2 = null;
            cf.a((oc) null, (byte) 67, -84, (oc) null);
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        if (uh.field_m == null) {
          var1 = -33 % ((param0 - -22) / 61);
          ul.field_P = qm.b(1, 1);
          ph.field_F = qm.b(1, 2);
          ej.field_h = qm.b(1, 7);
          tk.field_a = qm.b(1, 3);
          vd.field_C = qm.b(1, 4);
          gi.field_h = qm.b(1, 5);
          bi.field_h = qm.b(1, 6);
          he.field_t = qm.b(1, 12);
          te.field_J = qm.b(1, 8);
          if (nl.field_c == 0) {
            L0: {
              sc.a((byte) 118);
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          ib.a(uh.field_m, (byte) 35);
          uh.field_m = null;
          ql.f(8036);
          var1 = -33 % ((param0 - -22) / 61);
          ul.field_P = qm.b(1, 1);
          ph.field_F = qm.b(1, 2);
          ej.field_h = qm.b(1, 7);
          tk.field_a = qm.b(1, 3);
          vd.field_C = qm.b(1, 4);
          gi.field_h = qm.b(1, 5);
          bi.field_h = qm.b(1, 6);
          he.field_t = qm.b(1, 12);
          te.field_J = qm.b(1, 8);
          if (nl.field_c != 0) {
            L2: {
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              sc.a((byte) 118);
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    cf() {
    }

    final static void b(boolean param0) {
        if ((fa.field_c ^ -1) != -11) {
          if (wa.b(0)) {
            tf.field_d = param0;
            return;
          } else {
            pf.b((byte) -64);
            fa.field_c = 11;
            tf.field_d = param0;
            return;
          }
        } else {
          pf.b((byte) -64);
          fa.field_c = 11;
          tf.field_d = param0;
          return;
        }
    }

    final static void a(oc param0, byte param1, int param2, oc param3) {
        int var5 = 0;
        oj var6 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var6 = mm.field_m[param2];
        if (var6.field_w == 5) {
          var6.field_p = var6.field_p + 1;
          if (var6.field_p < 8) {
            if (-3 > (var6.field_z ^ -1)) {
              var6.c((byte) 74);
              bn.a(3, var6);
              if (param1 < 42) {
                field_u = null;
                return;
              } else {
                return;
              }
            } else {
              if (param1 < 42) {
                field_u = null;
                return;
              } else {
                return;
              }
            }
          } else {
            L0: {
              var6.field_p = 0;
              var6.field_z = var6.field_z + 1;
              if (-3 > (var6.field_z ^ -1)) {
                var6.c((byte) 74);
                bn.a(3, var6);
                break L0;
              } else {
                break L0;
              }
            }
            if (param1 < 42) {
              field_u = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (var6.field_I <= 0) {
            var6.field_z = 0;
            var6.field_w = 5;
            var6.e((byte) -49);
            if (param1 < 42) {
              field_u = null;
              return;
            } else {
              return;
            }
          } else {
            var6.field_p = var6.field_p + 2;
            if (var6.field_p >= var6.field_C) {
              var6.field_z = var6.field_z + 1;
              var6.field_p = 0;
              if (param1 >= 42) {
                return;
              } else {
                field_u = null;
                return;
              }
            } else {
              if (param1 >= 42) {
                return;
              } else {
                field_u = null;
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Waiting for fonts";
        field_s = 0;
    }
}
