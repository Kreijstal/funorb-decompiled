/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends ana {
    private pg field_x;
    static daa field_v;
    static ok field_w;
    static String field_y;

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$2 = ((nr) this).field_l - 1;
        ((nr) this).field_l = ((nr) this).field_l - 1;
        if (0 <= fieldTemp$2) {
          if (((nr) this).field_l != 25) {
            return false;
          } else {
            this.f(121);
            return false;
          }
        } else {
          this.d(-26);
          var2 = -71 / ((param0 - 71) / 47);
          return true;
        }
    }

    final static void a(int param0, cfa param1, byte param2) {
        pf var6 = null;
        int var4 = 0;
        try {
            var6 = sja.field_fb;
            var6.c(4, (byte) 116);
            var6.field_g = var6.field_g + 1;
            var4 = var6.field_g;
            var6.d(1, 0);
            var6.d(param1.field_g, 0);
            var6.d(param1.field_i, 0);
            var6.e(param1.field_j, -1615464796);
            var6.e(param1.field_h, -1615464796);
            var6.e(param1.field_k, -1615464796);
            var6.e(param1.field_f, -1615464796);
            int discarded$0 = var6.a(var4, 19);
            var6.b((byte) 85, -var4 + var6.field_g);
            int var5 = 47 % ((1 - param2) / 47);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nr.E(" + 4 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, bw param1, bw param2) {
        try {
            if (param2.field_e != null) {
                param2.a(false);
            }
            param2.field_b = param1;
            param2.field_e = param1.field_e;
            param2.field_e.field_b = param2;
            param2.field_b.field_e = param2;
            int var3_int = 33 / ((42 - param0) / 63);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
    }

    private final void f(int param0) {
        pp var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((nr) this).field_x.field_l.a(49, ((nr) this).field_q.field_h);
        ((nr) this).a(27799, (at) (Object) new taa(((nr) this).field_q, ((nr) this).field_x.field_r.a(-27449, ((nr) this).field_q)));
        if (var6.i(78)) {
          return;
        } else {
          var3 = (pp) (Object) ((nr) this).field_x.field_o.b((byte) 90);
          oha discarded$2 = al.a(-52, ((nr) this).field_x.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              var4 = var3.field_h.a(-27449, ((nr) this).field_q);
              rq discarded$3 = new rq(((nr) this).field_q, var4.field_s.field_x, var4.field_s.field_J);
              var3.a(var6, ((nr) this).field_q.field_h, 12);
              var3 = (pp) (Object) ((nr) this).field_x.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    public static void e(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
    }

    nr(gj param0, pg param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((nr) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Respect";
    }
}
