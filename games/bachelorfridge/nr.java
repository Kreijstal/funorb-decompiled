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
        ((nr) this).field_l = ((nr) this).field_l - 1;
        if (0 <= ((nr) this).field_l - 1) {
          if ((((nr) this).field_l ^ -1) != -26) {
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
        pf var6 = sja.field_fb;
        var6.c(param0, (byte) 116);
        var6.field_g = var6.field_g + 1;
        int var4 = var6.field_g;
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
    }

    final static void a(byte param0, bw param1, bw param2) {
        int var3 = 0;
        if (param2.field_e != null) {
          param2.a(false);
          param2.field_b = param1;
          param2.field_e = param1.field_e;
          param2.field_e.field_b = param2;
          param2.field_b.field_e = param2;
          var3 = 33 / ((42 - param0) / 63);
          return;
        } else {
          param2.field_b = param1;
          param2.field_e = param1.field_e;
          param2.field_e.field_b = param2;
          param2.field_b.field_e = param2;
          var3 = 33 / ((42 - param0) / 63);
          return;
        }
    }

    private final void d(int param0) {
        if (param0 != -26) {
            ((nr) this).field_x = null;
        }
    }

    private final void f(int param0) {
        Object var3 = null;
        pp var3_ref = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        L0: {
          var3 = null;
          var5 = BachelorFridge.field_y;
          var6 = ((nr) this).field_x.field_l.a(49, ((nr) this).field_q.field_h);
          if (param0 >= 12) {
            break L0;
          } else {
            this.d(-101);
            break L0;
          }
        }
        ((nr) this).a(27799, (at) (Object) new taa(((nr) this).field_q, ((nr) this).field_x.field_r.a(-27449, ((nr) this).field_q)));
        if (var6.i(78)) {
          return;
        } else {
          var3_ref = (pp) (Object) ((nr) this).field_x.field_o.b((byte) 90);
          oha discarded$2 = al.a(-52, ((nr) this).field_x.field_k);
          L1: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              var7 = var3_ref.field_h.a(-27449, ((nr) this).field_q);
              rq discarded$3 = new rq(((nr) this).field_q, var7.field_s.field_x, var7.field_s.field_J);
              var3_ref.a(var6, ((nr) this).field_q.field_h, 12);
              var3_ref = (pp) (Object) ((nr) this).field_x.field_o.c(0);
              continue L1;
            }
          }
        }
    }

    public static void e(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 1) {
            Object var2 = null;
            nr.a((byte) 91, (bw) null, (bw) null);
        }
    }

    nr(gj param0, pg param1) {
        super(param0, (bca) (Object) param1);
        ((nr) this).field_x = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Respect";
    }
}
