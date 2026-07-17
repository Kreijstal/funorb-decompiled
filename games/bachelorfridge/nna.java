/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nna extends ana {
    static kv field_w;
    static kv field_v;
    private pba field_x;

    nna(gj param0, pba param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((nna) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nna.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void e() {
        iv var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((nna) this).field_x.field_l.a(54, ((nna) this).field_q.field_h);
        if (var6.i(119)) {
          return;
        } else {
          var3 = (iv) (Object) ((nna) this).field_x.field_o.b((byte) 90);
          oha discarded$1 = al.a(110, ((nna) this).field_x.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                var4 = var3.field_h.a(-27449, ((nna) this).field_q);
                if (var4 == null) {
                  break L1;
                } else {
                  ((nna) this).a(27799, (at) (Object) new taa(((nna) this).field_q, var4));
                  ((nna) this).a(27799, (at) (Object) new fha((kj) (Object) new nd(((nna) this).field_q, var4.field_s.field_x, var4.field_s.field_J)));
                  ((nna) this).a(27799, (at) (Object) new wn(var4, kna.field_g[3], 24831));
                  break L1;
                }
              }
              var3.a(var6, ((nna) this).field_q.field_h, 12);
              var3 = (iv) (Object) ((nna) this).field_x.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    final static eq a(byte param0, boolean param1) {
        int var3 = 10;
        eq var2 = new eq(true);
        var2.field_h = param1 ? true : false;
        return var2;
    }

    final static void a(lda param0, lda param1, int param2, int param3, int param4) {
        try {
            hi.field_a = param0;
            st.field_b = param1;
            cba.field_d = param2;
            int var6_int = 0;
            um.field_d = param4;
            vt.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nna.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 85 + 41);
        }
    }

    private final void b() {
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = ((nna) this).field_l - 1;
        ((nna) this).field_l = ((nna) this).field_l - 1;
        if (!(fieldTemp$0 < 0)) {
            if (((nna) this).field_l == 25) {
                jja.a(256, -1, 50);
                int discarded$1 = -68;
                this.e();
                return false;
            }
            return false;
        }
        int var2 = 100 / ((param0 - 71) / 47);
        int discarded$2 = 0;
        this.b();
        return true;
    }

    public static void f() {
        field_w = null;
        field_v = null;
        int var1 = -9;
    }

    static {
    }
}
