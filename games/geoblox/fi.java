/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static String field_h;
    private hf[] field_e;
    static Boolean field_b;
    private hf field_a;
    private int field_c;
    private int field_f;
    private hf field_g;
    static bg field_d;

    final hf a(long param0, byte param1) {
        hf var5 = null;
        hf var4 = ((fi) this).field_e[(int)((long)(-1 + ((fi) this).field_c) & param0)];
        ((fi) this).field_g = var4.field_b;
        while (var4 != ((fi) this).field_g) {
            if (!((((fi) this).field_g.field_a ^ -1L) != (param0 ^ -1L))) {
                var5 = ((fi) this).field_g;
                ((fi) this).field_g = ((fi) this).field_g.field_b;
                return var5;
            }
            ((fi) this).field_g = ((fi) this).field_g.field_b;
        }
        if (param1 >= -73) {
            hf discarded$0 = ((fi) this).a((byte) -38);
            ((fi) this).field_g = null;
            return null;
        }
        ((fi) this).field_g = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 2048) {
            field_h = null;
            param0 = param0 & 8191;
            if (-4097 >= param0) {
                return -6145 <= param0 ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
            }
            return 2048 <= param0 ? -ai.field_l[param0 + -2048] : ai.field_l[-param0 + 2048];
        }
        param0 = param0 & 8191;
        if (-4097 >= param0) {
            return -6145 <= param0 ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
        }
        return 2048 <= param0 ? -ai.field_l[param0 + -2048] : ai.field_l[-param0 + 2048];
    }

    final void a(byte param0, hf param1, long param2) {
        if (!(null == param1.field_c)) {
            param1.a(false);
        }
        hf var5 = ((fi) this).field_e[(int)((long)(((fi) this).field_c + -1) & param2)];
        param1.field_b = var5;
        param1.field_c = var5.field_c;
        param1.field_c.field_b = param1;
        param1.field_a = param2;
        if (param0 != 102) {
            field_d = null;
            param1.field_b.field_c = param1;
            return;
        }
        param1.field_b.field_c = param1;
    }

    final static void a(int param0, rf param1) {
        if (param0 != 0) {
            field_h = null;
            if (param1 != null) {
                if (!(param1 != fe.field_e)) {
                    return;
                }
                uh.field_y.d(-9268);
                fj.field_p.a();
                fe.field_e = param1;
                uh.field_y.a(true, fe.field_e, -1706);
                return;
            }
            return;
        }
        if (param1 != null) {
            if (!(param1 != fe.field_e)) {
                return;
            }
            uh.field_y.d(-9268);
            fj.field_p.a();
            fe.field_e = param1;
            uh.field_y.a(true, fe.field_e, -1706);
            return;
        }
    }

    final hf a(byte param0) {
        if (param0 != 125) {
            fi.a(103);
            ((fi) this).field_f = 0;
            return ((fi) this).b(param0 + -195);
        }
        ((fi) this).field_f = 0;
        return ((fi) this).b(param0 + -195);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 >= -113) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    fi(int param0) {
        int var2 = 0;
        hf var3 = null;
        ((fi) this).field_f = 0;
        ((fi) this).field_c = param0;
        ((fi) this).field_e = new hf[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new hf();
            ((fi) this).field_e[var2] = new hf();
            var3.field_b = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final hf b(int param0) {
        int var2 = 0;
        hf var3 = null;
        hf var4 = null;
        hf var7 = null;
        if (-1 > (((fi) this).field_f ^ -1)) {
          if (((fi) this).field_a != ((fi) this).field_e[((fi) this).field_f + -1]) {
            var7 = ((fi) this).field_a;
            ((fi) this).field_a = var7.field_b;
            return var7;
          } else {
            L0: while (true) {
              if (((fi) this).field_c <= ((fi) this).field_f) {
                var2 = 47 % ((param0 - 28) / 38);
                return null;
              } else {
                ((fi) this).field_f = ((fi) this).field_f + 1;
                var4 = ((fi) this).field_e[((fi) this).field_f].field_b;
                if (((fi) this).field_e[-1 + ((fi) this).field_f] != var4) {
                  ((fi) this).field_a = var4.field_b;
                  return var4;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((fi) this).field_c <= ((fi) this).field_f) {
              var2 = 47 % ((param0 - 28) / 38);
              return null;
            } else {
              ((fi) this).field_f = ((fi) this).field_f + 1;
              var3 = ((fi) this).field_e[((fi) this).field_f].field_b;
              if (((fi) this).field_e[-1 + ((fi) this).field_f] != var3) {
                ((fi) this).field_a = var3.field_b;
                return var3;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Change display name";
    }
}
