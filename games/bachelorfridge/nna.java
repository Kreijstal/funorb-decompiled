/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nna extends ana {
    static kv field_w;
    static kv field_v;
    private pba field_x;

    nna(gj param0, pba param1) {
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        oha discarded$2 = null;
        oha discarded$3 = null;
        iv var3 = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        ad var8 = null;
        var5 = BachelorFridge.field_y;
        var6 = this.field_x.field_l.a(54, this.field_q.field_h);
        if (!var6.i(119)) {
          var3 = (iv) ((Object) this.field_x.field_o.b((byte) 90));
          if (param0 < -11) {
            discarded$2 = al.a(110, this.field_x.field_k);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                L1: {
                  var7 = var3.field_h.a(-27449, this.field_q);
                  if (var7 == null) {
                    break L1;
                  } else {
                    this.a(27799, new taa(this.field_q, var7));
                    this.a(27799, new fha(new nd(this.field_q, var7.field_s.field_x, var7.field_s.field_J)));
                    this.a(27799, new wn(var7, kna.field_g[3], 24831));
                    break L1;
                  }
                }
                var3.a(var6, this.field_q.field_h, 12);
                var3 = (iv) ((Object) this.field_x.field_o.c(0));
                continue L0;
              }
            }
          } else {
            field_v = (kv) null;
            discarded$3 = al.a(110, this.field_x.field_k);
            L2: while (true) {
              if (var3 == null) {
                return;
              } else {
                L3: {
                  var8 = var3.field_h.a(-27449, this.field_q);
                  if (var8 == null) {
                    break L3;
                  } else {
                    this.a(27799, new taa(this.field_q, var8));
                    this.a(27799, new fha(new nd(this.field_q, var8.field_s.field_x, var8.field_s.field_J)));
                    this.a(27799, new wn(var8, kna.field_g[3], 24831));
                    break L3;
                  }
                }
                var3.a(var6, this.field_q.field_h, 12);
                var3 = (iv) ((Object) this.field_x.field_o.c(0));
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    final static eq a(byte param0, boolean param1) {
        int var3 = 31 / ((param0 - -55) / 54);
        eq var2 = new eq(true);
        var2.field_h = param1 ? true : false;
        return var2;
    }

    final static void a(lda param0, lda param1, int param2, int param3, int param4, byte param5) {
        try {
            hi.field_a = param0;
            st.field_b = param1;
            cba.field_d = param2;
            int var6_int = 68 % ((param5 - 1) / 47);
            um.field_d = param4;
            vt.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nna.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(boolean param0) {
        if (param0) {
            this.field_x = (pba) null;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!(fieldTemp$0 < 0)) {
            if ((this.field_l ^ -1) == -26) {
                jja.a(256, -1, 50);
                this.e((byte) -68);
                return false;
            }
            return false;
        }
        int var2 = 100 / ((param0 - 71) / 47);
        this.b(false);
        return true;
    }

    public static void f(byte param0) {
        field_w = null;
        field_v = null;
        int var1 = -9 / ((param0 - 75) / 38);
    }

    static {
    }
}
