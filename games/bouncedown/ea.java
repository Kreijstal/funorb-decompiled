/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private bc field_d;
    static int field_b;
    static boolean field_f;
    private ai field_a;
    static String field_c;
    static gk field_e;

    final ai a(byte param0) {
        ai var2 = null;
        if (param0 == 33) {
          var2 = ((ea) this).field_a;
          if (var2 == ((ea) this).field_d.field_b) {
            ((ea) this).field_a = null;
            return null;
          } else {
            ((ea) this).field_a = var2.field_f;
            return var2;
          }
        } else {
          ((ea) this).field_d = null;
          var2 = ((ea) this).field_a;
          if (var2 == ((ea) this).field_d.field_b) {
            ((ea) this).field_a = null;
            return null;
          } else {
            ((ea) this).field_a = var2.field_f;
            return var2;
          }
        }
    }

    final ai a(int param0) {
        ai var2 = null;
        if (param0 != 22092) {
            ((ea) this).field_d = null;
            var2 = ((ea) this).field_d.field_b.field_c;
            if (!(((ea) this).field_d.field_b != var2)) {
                ((ea) this).field_a = null;
                return null;
            }
            ((ea) this).field_a = var2.field_c;
            return var2;
        }
        var2 = ((ea) this).field_d.field_b.field_c;
        if (!(((ea) this).field_d.field_b != var2)) {
            ((ea) this).field_a = null;
            return null;
        }
        ((ea) this).field_a = var2.field_c;
        return var2;
    }

    final ai b(ai param0, int param1) {
        ai var3 = null;
        if (param0 == null) {
            var3 = ((ea) this).field_d.field_b.field_c;
        } else {
            var3 = param0;
        }
        if (!(var3 != ((ea) this).field_d.field_b)) {
            ((ea) this).field_a = null;
            return null;
        }
        ((ea) this).field_a = var3.field_c;
        int var4 = -84 % ((3 - param1) / 63);
        return var3;
    }

    final ai e(int param0) {
        if (param0 != 50) {
            return null;
        }
        ai var2 = ((ea) this).field_d.field_b.field_f;
        if (!(var2 != ((ea) this).field_d.field_b)) {
            ((ea) this).field_a = null;
            return null;
        }
        ((ea) this).field_a = var2.field_f;
        return var2;
    }

    final static void a(int param0, int param1) {
        ii var2 = hh.field_p;
        var2.a(true, param1);
        var2.a(1, (byte) 65);
        var2.a(param0, (byte) 71);
    }

    final ai c(int param0) {
        ai var2 = ((ea) this).field_a;
        if (param0 >= -82) {
            field_c = null;
            if (!(((ea) this).field_d.field_b != var2)) {
                ((ea) this).field_a = null;
                return null;
            }
            ((ea) this).field_a = var2.field_c;
            return var2;
        }
        if (!(((ea) this).field_d.field_b != var2)) {
            ((ea) this).field_a = null;
            return null;
        }
        ((ea) this).field_a = var2.field_c;
        return var2;
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 17695) {
            Object var2 = null;
            ie discarded$0 = ea.a((byte[]) null, (byte) -62);
        }
    }

    final ai a(ai param0, int param1) {
        ai var3 = null;
        int var4 = 0;
        L0: {
          if (param0 != null) {
            var3 = param0;
            break L0;
          } else {
            var3 = ((ea) this).field_d.field_b.field_f;
            break L0;
          }
        }
        if (((ea) this).field_d.field_b == var3) {
          ((ea) this).field_a = null;
          return null;
        } else {
          ((ea) this).field_a = var3.field_f;
          var4 = -55 % ((59 - param1) / 37);
          return var3;
        }
    }

    final static void d(int param0) {
        tb.field_p.field_l = 0;
        tb.field_p.field_d = param0;
    }

    final static ie a(byte[] param0, byte param1) {
        ie var2 = null;
        if (param0 != null) {
          var2 = new ie(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, ph.field_c);
          vb.a((byte) 122);
          if (param1 < 47) {
            field_b = 93;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    ea(bc param0) {
        ((ea) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 50;
        field_f = false;
    }
}
