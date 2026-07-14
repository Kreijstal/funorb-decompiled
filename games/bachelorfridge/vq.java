/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends ana {
    static sna field_v;
    static int field_w;
    private sm field_x;

    public static void e(byte param0) {
        if (param0 < 53) {
            vq.a((byte) 89, false);
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static void a(byte param0, boolean param1) {
        ut.field_m.a(param1, param0 + 1537025669);
        if (param0 != -64) {
            vq.e((byte) -127);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != -60) {
            return true;
        }
        return dj.a(false, -15437, param1);
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((vq) this).field_m.a((byte) -106)) {
          return false;
        } else {
          if (100 != ((vq) this).field_l) {
            ((vq) this).field_l = ((vq) this).field_l - 1;
            if (-1 >= (((vq) this).field_l - 1 ^ -1)) {
              L0: {
                if (75 == ((vq) this).field_l) {
                  this.c(false);
                  break L0;
                } else {
                  break L0;
                }
              }
              return false;
            } else {
              this.b(false);
              var2 = -79 / ((71 - param0) / 47);
              return true;
            }
          } else {
            wf.a(53, (byte) 126);
            ((vq) this).field_l = ((vq) this).field_l - 1;
            if (-1 >= (((vq) this).field_l - 1 ^ -1)) {
              if (75 != ((vq) this).field_l) {
                return false;
              } else {
                this.c(false);
                return false;
              }
            } else {
              this.b(false);
              var2 = -79 / ((71 - param0) / 47);
              return true;
            }
          }
        }
    }

    private final void c(boolean param0) {
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var7 = null;
        ad var8 = null;
        aga var9 = null;
        ad var10 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (!param0) {
          var9 = ((vq) this).field_x.field_l.a(25, ((vq) this).field_q.field_h);
          if (var9.i(-97)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((vq) this).field_x.field_o.b((byte) 90);
            oha discarded$2 = al.a(118, ((vq) this).field_x.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var9, ((vq) this).field_q.field_h, 12);
                var10 = var3_ref.field_h.a(-27449, ((vq) this).field_q);
                ((vq) this).a(27799, (at) (Object) new taa(((vq) this).field_q, var10));
                ((vq) this).a(27799, (at) (Object) new cb(var10, 6));
                ((vq) this).a(27799, (at) (Object) new wn(var10, kna.field_g[5], 24831));
                var3_ref = (iv) (Object) ((vq) this).field_x.field_o.c(0);
                continue L0;
              }
            }
          }
        } else {
          ((vq) this).field_x = null;
          var7 = ((vq) this).field_x.field_l.a(25, ((vq) this).field_q.field_h);
          if (var7.i(-97)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((vq) this).field_x.field_o.b((byte) 90);
            oha discarded$3 = al.a(118, ((vq) this).field_x.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var7, ((vq) this).field_q.field_h, 12);
                var8 = var3_ref.field_h.a(-27449, ((vq) this).field_q);
                ((vq) this).a(27799, (at) (Object) new taa(((vq) this).field_q, var8));
                ((vq) this).a(27799, (at) (Object) new cb(var8, 6));
                ((vq) this).a(27799, (at) (Object) new wn(var8, kna.field_g[5], 24831));
                var3_ref = (iv) (Object) ((vq) this).field_x.field_o.c(0);
                continue L1;
              }
            }
          }
        }
    }

    vq(gj param0, sm param1) {
        super(param0, (bca) (Object) param1);
        ((vq) this).field_x = param1;
    }

    private final void b(boolean param0) {
        if (param0) {
            field_w = 77;
        }
    }

    static {
    }
}
