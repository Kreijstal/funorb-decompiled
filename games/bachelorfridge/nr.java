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
        int fieldTemp$2 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$2) {
          if ((this.field_l ^ -1) != -26) {
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
        int discarded$0 = 0;
        try {
            var6 = sja.field_fb;
            var6.c(param0, (byte) 116);
            var6.field_g = var6.field_g + 1;
            var4 = var6.field_g;
            var6.d(1, 0);
            var6.d(param1.field_g, 0);
            var6.d(param1.field_i, 0);
            var6.e(param1.field_j, -1615464796);
            var6.e(param1.field_h, -1615464796);
            var6.e(param1.field_k, -1615464796);
            var6.e(param1.field_f, -1615464796);
            discarded$0 = var6.a(var4, 19);
            var6.b((byte) 85, -var4 + var6.field_g);
            int var5 = 47 % ((1 - param2) / 47);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nr.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
            throw pe.a((Throwable) ((Object) runtimeException), "nr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != -26) {
            this.field_x = (pg) null;
        }
    }

    private final void f(int param0) {
        oha discarded$2 = null;
        rq discarded$3 = null;
        Object var3 = null;
        pp var3_ref = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        L0: {
          var3 = null;
          var5 = BachelorFridge.field_y;
          var6 = this.field_x.field_l.a(49, this.field_q.field_h);
          if (param0 >= 12) {
            break L0;
          } else {
            this.d(-101);
            break L0;
          }
        }
        this.a(27799, new taa(this.field_q, this.field_x.field_r.a(-27449, this.field_q)));
        if (var6.i(78)) {
          return;
        } else {
          var3_ref = (pp) ((Object) this.field_x.field_o.b((byte) 90));
          discarded$2 = al.a(-52, this.field_x.field_k);
          L1: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              var7 = var3_ref.field_h.a(-27449, this.field_q);
              discarded$3 = new rq(this.field_q, var7.field_s.field_x, var7.field_s.field_J);
              var3_ref.a(var6, this.field_q.field_h, 12);
              var3_ref = (pp) ((Object) this.field_x.field_o.c(0));
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
            bw var2 = (bw) null;
            nr.a((byte) 91, (bw) null, (bw) null);
        }
    }

    nr(gj param0, pg param1) {
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "Respect";
    }
}
