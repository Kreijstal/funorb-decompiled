/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub extends wj {
    private int field_F;
    static int field_B;
    static kg[] field_G;
    static int field_E;
    boolean field_C;
    private se field_H;
    static hd field_D;

    final static kg h(byte param0) {
        kg var1 = new kg(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], pq.field_O[0], lt.field_a);
        int var2 = -103;
        tk.h((byte) -98);
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((ub) this).field_F != 0) {
          if (((ub) this).field_F >= 256) {
            if (param0 != 0) {
              return;
            } else {
              ((ub) this).a(((ub) this).field_t + param2, (byte) 64, param3 - -((ub) this).field_g);
              super.a(param0, 65, param2, param3);
              return;
            }
          } else {
            if (null != d.field_a) {
              if (d.field_a.field_q >= ((ub) this).field_n) {
                if (((ub) this).field_i <= d.field_a.field_w) {
                  iw.a(param1 + -190, d.field_a);
                  on.b();
                  ((ub) this).a(0, (byte) 125, 0);
                  super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                  ta.e(127);
                  d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                  return;
                } else {
                  d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
                  iw.a(param1 + -190, d.field_a);
                  on.b();
                  ((ub) this).a(0, (byte) 125, 0);
                  super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                  ta.e(127);
                  d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                  return;
                }
              } else {
                d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
                iw.a(param1 + -190, d.field_a);
                on.b();
                ((ub) this).a(0, (byte) 125, 0);
                super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
                ta.e(127);
                d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
                return;
              }
            } else {
              d.field_a = new ut(((ub) this).field_n, ((ub) this).field_i);
              iw.a(param1 + -190, d.field_a);
              on.b();
              ((ub) this).a(0, (byte) 125, 0);
              super.a(param0, (int) (char)param1, -param2 + -((ub) this).field_t, -((ub) this).field_g + -param3);
              ta.e(127);
              d.field_a.b(((ub) this).field_t + param2, ((ub) this).field_g + param3, ((ub) this).field_F);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static ut[] i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        ut[] var1 = new ut[io.field_l];
        for (var2 = 0; io.field_l > var2; var2++) {
            var3 = ku.field_c[var2] * lo.field_j[var2];
            var4 = pq.field_O[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = lt.field_a[qj.b((int) var4[var6], 255)];
            }
            var1[var2] = new ut(kw.field_i, ai.field_J, aq.field_f[var2], fc.field_g[var2], ku.field_c[var2], lo.field_j[var2], var5);
        }
        tk.h((byte) -70);
        return var1;
    }

    final static void a(int param0, byte param1) {
        hn var2 = null;
        int var3 = Kickabout.field_G;
        try {
            var2 = (hn) (Object) da.field_h.g(24009);
            while (var2 != null) {
                if (!(var2.field_i != 4)) {
                    var2.c((byte) -109);
                }
                var2 = (hn) (Object) da.field_h.c(33);
            }
            var2 = new hn(4, new int[1]);
            ii.a(var2, 102);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ub.BC(" + param0 + ',' + -38 + ')');
        }
    }

    public static void a(byte param0) {
        field_G = null;
        int var1 = 0;
        field_D = null;
    }

    private final int b(boolean param0) {
        return !((ub) this).field_C ? 0 : this == (Object) (Object) ((ub) this).field_H.h((byte) 18) ? 256 : 0;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 90) {
          return;
        } else {
          ((ub) this).a(param1, 1, il.field_b - param2 >> 1, param2, -param1 + im.field_Ab >> 1);
          return;
        }
    }

    final fd a(boolean param0) {
        fd var2 = super.a(param0);
        if (var2 != null) {
            return var2;
        }
        return (fd) this;
    }

    boolean k(int param0) {
        int var2 = this.b(true);
        int var3 = -((ub) this).field_F + var2;
        if (var3 > 0) {
            ((ub) this).field_F = ((ub) this).field_F + (var3 + 7) / 8;
            if (!(param0 >= ~var3)) {
                ((ub) this).field_F = ((ub) this).field_F + (1 + (var3 - 16)) / 16;
            }
            if (0 != ((ub) this).field_F) {
                return false;
            }
            if (var2 != 0) {
                return false;
            }
            return !((ub) this).field_C ? true : false;
        }
        if (!(param0 >= ~var3)) {
            ((ub) this).field_F = ((ub) this).field_F + (1 + (var3 - 16)) / 16;
        }
        if (0 != ((ub) this).field_F) {
            return false;
        }
        if (var2 != 0) {
            return false;
        }
        return !((ub) this).field_C ? true : false;
    }

    ub(se param0, int param1, int param2) {
        super(il.field_b - param1 >> 1, -param2 + im.field_Ab >> 1, param1, param2, (gj) null);
        try {
            ((ub) this).field_F = 0;
            ((ub) this).field_H = param0;
            ((ub) this).field_C = false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, byte param1, int param2);

    boolean a(int param0) {
        ((ub) this).field_F = this.b(true);
        if (param0 < -11) {
          if (((ub) this).field_F == 0) {
            if (((ub) this).field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static long a(int param0, byte param1, long param2) {
        int var4 = 32 % ((-15 - param1) / 62);
        return param2 << 4 | param2 >>> 60;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
    }
}
