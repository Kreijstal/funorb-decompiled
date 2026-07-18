/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends ana {
    private boolean field_v;
    private taa field_w;
    private tba field_x;

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((qr) this).field_x.field_l.a(8, ((qr) this).field_q.field_h);
        if (!(!var2.i(-79))) {
            return;
        }
        pp var3 = (pp) (Object) ((qr) this).field_x.field_o.b((byte) 90);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((qr) this).field_q);
            var4.b(-1, 6);
            var3.a(var2, ((qr) this).field_q.field_h, 12);
            if (!(!(var3 instanceof iv))) {
                ((qr) this).a(27799, (at) (Object) new ek(((qr) this).field_q, var4, var3.field_f));
            }
            var3 = (pp) (Object) ((qr) this).field_x.field_o.c(0);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (!((qr) this).field_m.a((byte) -106)) {
          if (!((qr) this).field_w.a((byte) -106)) {
            L0: {
              if (!((qr) this).field_v) {
                this.d(-1);
                ((qr) this).field_v = true;
                break L0;
              } else {
                break L0;
              }
            }
            var2 = 93 / ((71 - param0) / 47);
            int fieldTemp$2 = ((qr) this).field_l - 1;
            ((qr) this).field_l = ((qr) this).field_l - 1;
            if (fieldTemp$2 >= 0) {
              return false;
            } else {
              this.f(-1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    qr(gj param0, tba param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((qr) this).field_x = param1;
            ((qr) this).field_w = new taa(((qr) this).field_q, ((qr) this).field_x.field_q, ((qr) this).field_x.field_s);
            ((qr) this).a(27799, (at) (Object) ((qr) this).field_w);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        op var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        gf var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = ((qr) this).field_q.field_h;
        int[][] discarded$2 = ((qr) this).field_x.e(6);
        var3 = 0;
        L0: while (true) {
          if (((qr) this).field_x.field_t.length <= var3) {
            return;
          } else {
            var4 = ((qr) this).field_x.field_t[var3][0];
            var5 = ((qr) this).field_x.field_t[var3][1];
            if (var4 >= 0) {
              if (var4 < var2.field_z) {
                if (var5 >= 0) {
                  if (var2.field_B > var5) {
                    var6 = new gf(((qr) this).field_q, var4, var5);
                    ((kj) (Object) var6).a(0);
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                var3++;
                continue L0;
              }
            } else {
              var3++;
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void f(int param0) {
        this.e(75);
    }

    static {
    }
}
