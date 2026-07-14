/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ae field_l;
    static th field_j;
    static ea field_i;
    private int field_a;
    private boolean field_k;
    private int field_g;
    static wh field_e;
    static String field_f;
    static me[] field_h;
    private int[] field_c;
    static int field_b;
    static int field_d;

    final static void a(int param0, ac param1, int param2, int param3, ac param4, int param5) {
        s.field_O = param1;
        sn.field_d = param5;
        mf.field_j = param4;
        if (param2 != -1) {
            Object var7 = null;
            aa.a(-42, (ac) null, -120, -123, (ac) null, -33);
        }
        ka.field_a = param3;
        hi.field_z = param0;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          if (param0 == -32676) {
            break L0;
          } else {
            ((aa) this).field_c = null;
            break L0;
          }
        }
        var3 = ((aa) this).field_c.length;
        L1: while (true) {
          if (var3 > param1) {
            return var3;
          } else {
            if (!((aa) this).field_k) {
              var3 = var3 + ((aa) this).field_a;
              continue L1;
            } else {
              if (0 == var3) {
                var3 = 1;
                continue L1;
              } else {
                var3 = var3 * ((aa) this).field_a;
                continue L1;
              }
            }
          }
        }
    }

    final static ln[] a(int param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        ln[] var1 = new ln[sc.field_d];
        if (param0 >= -104) {
            return null;
        }
        for (var2 = 0; var2 < sc.field_d; var2++) {
            var1[var2] = new ln(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], db.field_b[var2], af.field_p);
        }
        ec.a((byte) -76);
        return var1;
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(-32676, param1)];
        int[] var3 = var4;
        ai.a(((aa) this).field_c, 0, var4, 0, ((aa) this).field_c.length);
        if (param0 > -27) {
            ((aa) this).field_k = false;
        }
        ((aa) this).field_c = var4;
    }

    final void c(int param0, int param1) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            int discarded$2 = ((aa) this).a(121, (byte) 110);
            break L0;
          }
        }
        L1: {
          if (-1 < (param0 ^ -1)) {
            break L1;
          } else {
            if (param0 <= ((aa) this).field_g) {
              L2: {
                if (((aa) this).field_g != param0) {
                  ai.a(((aa) this).field_c, param0 - -1, ((aa) this).field_c, param0, -param0 + ((aa) this).field_g);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((aa) this).field_g = ((aa) this).field_g - 1;
              return;
            } else {
              break L1;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final void d(int param0, int param1) {
        if (param0 != 6524) {
            return;
        }
        this.a(1 + ((aa) this).field_g, param1, param0 + -6632);
    }

    public static void a(byte param0) {
        if (param0 > -117) {
            return;
        }
        field_h = null;
        field_l = null;
        field_e = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    private final void a(int param0, int param1, int param2) {
        if (((aa) this).field_g < param0) {
            ((aa) this).field_g = param0;
        }
        if (param0 >= ((aa) this).field_c.length) {
            this.b(-121, param0);
        }
        if (param2 >= 0) {
            return;
        }
        ((aa) this).field_c[param0] = param1;
    }

    final int a(int param0, byte param1) {
        if (((aa) this).field_g < param0) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        int var3 = 17 % ((param1 - -65) / 47);
        return ((aa) this).field_c[param0];
    }

    final int b(int param0) {
        if (param0 != 5717) {
            field_l = null;
        }
        return ((aa) this).field_g - -1;
    }

    private aa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ae();
    }
}
