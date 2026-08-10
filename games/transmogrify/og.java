/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static ti field_b;
    static int field_e;
    static tf field_d;
    static hh field_a;
    static String[] field_c;

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var3 = Transmogrify.field_A ? 1 : 0;
        cl.field_A = 0;
        re.field_y = null;
        wj.field_j = null;
        int var2 = c.field_b;
        c.field_b = ne.field_b;
        if (-52 == (param1 ^ -1)) {
            oh.field_h.field_k = 2;
            ne.field_b = var2;
            oh.field_h.field_p = oh.field_h.field_p + 1;
            if (-3 < (oh.field_h.field_p ^ -1)) {
                if (oh.field_h.field_p < param0) {
                    if (4 > oh.field_h.field_p) {
                        return -1;
                    }
                    return 1;
                }
                if (param1 != 50) {
                    if (4 <= oh.field_h.field_p) {
                        return 1;
                    }
                    return -1;
                }
                return 5;
            }
            if (!((param1 ^ -1) != -52)) {
                return 2;
            }
            if (oh.field_h.field_p < param0) {
                if (4 <= oh.field_h.field_p) {
                    return 1;
                }
                return -1;
            }
            if (param1 == 50) {
                return 5;
            }
            if (4 <= oh.field_h.field_p) {
                return 1;
            }
            return -1;
        }
        if (-51 == (param1 ^ -1)) {
            oh.field_h.field_k = 5;
            ne.field_b = var2;
            oh.field_h.field_p = oh.field_h.field_p + 1;
            if (-3 >= (oh.field_h.field_p ^ -1)) {
                if ((param1 ^ -1) != -52) {
                    if (oh.field_h.field_p >= param0 && param1 == 50) {
                        return 5;
                    }
                    if (4 <= oh.field_h.field_p) {
                        return 1;
                    }
                    return -1;
                }
                return 2;
            }
            if (oh.field_h.field_p >= param0 && param1 == 50) {
                return 5;
            }
            if (4 <= oh.field_h.field_p) {
                return 1;
            }
            return -1;
        }
        oh.field_h.field_k = 1;
        ne.field_b = var2;
        oh.field_h.field_p = oh.field_h.field_p + 1;
        if (-3 >= (oh.field_h.field_p ^ -1)) {
            if ((param1 ^ -1) != -52) {
                if (oh.field_h.field_p >= param0 && param1 == 50) {
                    return 5;
                }
                if (4 <= oh.field_h.field_p) {
                    return 1;
                }
                return -1;
            }
            return 2;
        }
        if (oh.field_h.field_p >= param0 && param1 == 50) {
            return 5;
        }
        if (4 <= oh.field_h.field_p) {
            return 1;
        }
        return -1;
    }

    final static void a(byte param0) {
        ia var1;
        if (param0 <= 3) {
          return;
        } else {
          L0: {
            var1 = (ia) ((Object) kk.field_f.a(-9424));
            if (var1 == null) {
              var1 = new ia();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(sb.field_g, sb.field_b, sb.field_f, sb.field_d, sb.field_c, sb.field_e, 6, sb.field_h);
          uj.field_c.a(var1, -109);
          return;
        }
    }

    final static void b(boolean param0) {
        int var1;
        int var2;
        var1 = jk.l(-889);
        var2 = ba.a((byte) 101);
        kf.field_i.a(var1 - -(tj.field_y << -1335042783), qa.field_u - dg.field_b, -tj.field_y + ic.field_b, (byte) 110, (dg.field_b << -1731931423) + var2);
        hd.a((byte) 8);
        if (param0) {
          field_e = 33;
          return;
        } else {
          return;
        }
    }

    static {
        field_e = -1;
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_d = new tf(1, 2, 2, 0);
    }
}
