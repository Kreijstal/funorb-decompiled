/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends wi {
    static String field_l;
    static int field_k;
    static int[] field_n;
    private qb field_o;
    private int field_m;

    final void o(int param0) {
        ((ii) this).field_m = ((ii) this).field_h * param0;
    }

    public static void l(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        od.field_f.a(param1, param0 - 1, param2, 0, 0);
        if (param4 != 8) {
            return;
        }
        od.field_f.a(param1, param0, -1 + param2, 0, 0);
        od.field_f.a(param1, param0, param2, param3, -1);
    }

    final static void n(int param0) {
        lg.field_b = new gh();
        if (param0 != 8) {
            Object var2 = null;
            ga discarded$0 = ii.a((Throwable) null, (String) null);
            ed.field_c.a(10768, (lk) (Object) lg.field_b);
            return;
        }
        ed.field_c.a(10768, (lk) (Object) lg.field_b);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = ((ii) this).field_h;
        ((ii) this).field_h = ((ii) this).field_h + 1;
        ((ii) this).field_i[fieldTemp$0] = (byte)(param1 + ((ii) this).field_o.b((byte) 123));
        if (param0) {
            return;
        }
        ((ii) this).field_m = 20;
    }

    final void m(int param0) {
        ((ii) this).field_h = (((ii) this).field_m + 7) / 8;
        if (param0 <= -36) {
            return;
        }
        Object var3 = null;
        ((ii) this).a(-77, -85, 1, (byte[]) null);
    }

    final void b(int[] param0, int param1) {
        ((ii) this).field_o = new qb(param0);
        if (param1 > 83) {
            return;
        }
        int discarded$0 = ((ii) this).f(60, 33);
    }

    final int h(byte param0) {
        if (param0 <= 1) {
            return -119;
        }
        int fieldTemp$0 = ((ii) this).field_h;
        ((ii) this).field_h = ((ii) this).field_h + 1;
        return ((ii) this).field_i[fieldTemp$0] + -((ii) this).field_o.b((byte) 123) & 255;
    }

    ii(int param0) {
        super(param0);
    }

    ii(byte[] param0) {
        super(param0);
    }

    final static ga a(Throwable param0, String param1) {
        ga var2 = null;
        if (!(param0 instanceof ga)) {
            var2 = new ga(param0, param1);
        } else {
            var2 = (ga) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Bounce.field_N;
        var5 = 0;
        if (param1 != 8) {
          return;
        } else {
          L0: while (true) {
            if (var5 < param0) {
              int fieldTemp$5 = ((ii) this).field_h;
              ((ii) this).field_h = ((ii) this).field_h + 1;
              param3[var5 - -param2] = (byte)(((ii) this).field_i[fieldTemp$5] + -((ii) this).field_o.b((byte) 123));
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final int f(int param0, int param1) {
        int var6 = Bounce.field_N;
        int var3 = ((ii) this).field_m >> 1238811907;
        int var4 = 8 - (((ii) this).field_m & param0);
        ((ii) this).field_m = ((ii) this).field_m + param1;
        int var5 = 0;
        while (var4 < param1) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((ii) this).field_i[incrementValue$0] & nh.field_N[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (nh.field_N[var4] & ((ii) this).field_i[var3]);
        } else {
            var5 = var5 + (((ii) this).field_i[var3] >> -param1 + var4 & nh.field_N[param1]);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
    }
}
