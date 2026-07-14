/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends nt {
    private int field_z;
    private int field_s;
    static String field_x;
    private int field_t;
    static int[] field_y;
    static pl field_v;
    private int field_u;
    static ns field_w;

    final static void f(int param0) {
        ct var1 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        if (null == pd.field_n) {
            var1 = new ct();
            var3 = var1.a(128, 128, false, 16);
            pd.field_n = aj.a((byte) -125, var3, false);
        }
        if (!(mk.field_d != null)) {
            var1 = (ct) (Object) new ks();
            var4 = ((ks) (Object) var1).b(1, 128, 128, 16);
            mk.field_d = aj.a((byte) -120, var4, false);
        }
        if (param0 != 23369) {
            field_x = null;
        }
    }

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = -34 % ((param0 - -2) / 42);
    }

    final void a(ha param0, int param1) {
        if (param1 > -121) {
            boolean discarded$0 = ((as) this).a(-59);
        }
        if (0 == ((as) this).field_t) {
            uc.field_a.a((float)(((as) this).field_k >> 1538054664), (float)(((as) this).field_o >> 1016533960), 1024, 0, 0, (((as) this).field_p * (128 / ((as) this).field_s) << 1199849944) + ((as) this).field_q, 1);
        } else {
            im.field_a.a((float)(((as) this).field_k >> 1988628584), (float)(((as) this).field_o >> 1218913224), 4096, 0, 0, (((as) this).field_p * (128 / ((as) this).field_s) << 677098712) + ((as) this).field_q, 1);
        }
    }

    as(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((as) this).field_z = param5;
        ((as) this).field_t = param6;
        ((as) this).field_s = param0;
        ((as) this).field_u = param4;
    }

    final static void a(int param0, String[] param1) {
        if (ce.field_o != null) {
            ce.field_o.field_B.a(param1, false);
        }
        if (ro.field_a != null) {
            ro.field_a.field_E.a(param1, false);
        }
        if (param0 != 256) {
            field_y = null;
        }
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((as) this).field_s > ((as) this).field_p) {
            ((as) this).field_k = ((as) this).field_k + ((as) this).field_u;
            ((as) this).field_o = ((as) this).field_o + ((as) this).field_z;
            ((as) this).field_u = ((as) this).field_u * 251 / 285;
            ((as) this).field_z = ((as) this).field_z * 251 / 285;
            if (-1 < (((as) this).field_u ^ -1)) {
                ((as) this).field_u = ((as) this).field_u - 1;
            } else {
                ((as) this).field_u = ((as) this).field_u + 1;
            }
            if ((((as) this).field_z ^ -1) > -1) {
                ((as) this).field_z = ((as) this).field_z - 1;
            } else {
                ((as) this).field_z = ((as) this).field_z + 1;
            }
        }
        if (param0 != -2567) {
            as.e(-88);
        }
        return super.a(param0 + 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_x = "lives: ";
        field_y = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_y[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0 ^ -1) == -2) {
                  var0 = var0 >>> -1832820543 ^ -306674912;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
