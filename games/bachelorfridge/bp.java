/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends ana {
    static int field_x;
    static ee[] field_y;
    static String field_w;
    static int field_z;
    private kk field_v;

    private final void g(int param0) {
        if (param0 > -41) {
            bp.d(112);
        }
    }

    bp(gj param0, kk param1) {
        super(param0, (bca) (Object) param1);
        ((bp) this).field_v = param1;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((bp) this).field_m.a((byte) -106)) {
            return false;
        }
        if (-76 > (((bp) this).field_l ^ -1)) {
            if (((bp) this).field_l % 10 != 0) {
                ((bp) this).field_l = ((bp) this).field_l - 1;
                if (!((((bp) this).field_l - 1 ^ -1) > -1)) {
                    if (((bp) this).field_l == 75) {
                        this.f(-2602);
                        return false;
                    }
                    return false;
                }
                var2 = 89 / ((71 - param0) / 47);
                this.g(-114);
                return true;
            }
            wf.a(3, (byte) 126);
        }
        ((bp) this).field_l = ((bp) this).field_l - 1;
        if (!((((bp) this).field_l - 1 ^ -1) > -1)) {
            if (!(((bp) this).field_l != 75)) {
                this.f(-2602);
            }
            return false;
        }
        var2 = 89 / ((71 - param0) / 47);
        this.g(-114);
        return true;
    }

    private final void f(int param0) {
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var7 = null;
        ad var8 = null;
        aga var9 = null;
        ad var10 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == -2602) {
          var9 = ((bp) this).field_v.field_l.a(63, ((bp) this).field_q.field_h);
          if (var9.i(-100)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((bp) this).field_v.field_o.b((byte) 90);
            oha discarded$2 = al.a(106, ((bp) this).field_v.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                L1: {
                  var3_ref.a(var9, ((bp) this).field_q.field_h, 12);
                  var10 = var3_ref.field_h.a(param0 ^ 24849, ((bp) this).field_q);
                  if (var10 != null) {
                    ((bp) this).a(27799, (at) (Object) new taa(((bp) this).field_q, var10));
                    ((bp) this).a(27799, (at) (Object) new iu(3));
                    ((bp) this).a(27799, (at) (Object) new cb(var10, 7));
                    ((bp) this).a(27799, (at) (Object) new wn(var10, kna.field_g[18], 24831));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3_ref = (iv) (Object) ((bp) this).field_v.field_o.c(0);
                continue L0;
              }
            }
          }
        } else {
          field_x = -4;
          var7 = ((bp) this).field_v.field_l.a(63, ((bp) this).field_q.field_h);
          if (var7.i(-100)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((bp) this).field_v.field_o.b((byte) 90);
            oha discarded$3 = al.a(106, ((bp) this).field_v.field_k);
            L2: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                L3: {
                  var3_ref.a(var7, ((bp) this).field_q.field_h, 12);
                  var8 = var3_ref.field_h.a(param0 ^ 24849, ((bp) this).field_q);
                  if (var8 != null) {
                    ((bp) this).a(27799, (at) (Object) new taa(((bp) this).field_q, var8));
                    ((bp) this).a(27799, (at) (Object) new iu(3));
                    ((bp) this).a(27799, (at) (Object) new cb(var8, 7));
                    ((bp) this).a(27799, (at) (Object) new wn(var8, kna.field_g[18], 24831));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3_ref = (iv) (Object) ((bp) this).field_v.field_o.c(0);
                continue L2;
              }
            }
          }
        }
    }

    final static void d(int param0) {
        if (null == gja.field_m) {
          if (param0 == 18) {
            if (null != hp.field_d) {
              hp.field_d.d((byte) 47);
              va.a((byte) 75);
              return;
            } else {
              va.a((byte) 75);
              return;
            }
          } else {
            return;
          }
        } else {
          gja.field_m.g((byte) 127);
          if (param0 == 18) {
            if (null == hp.field_d) {
              va.a((byte) 75);
              return;
            } else {
              hp.field_d.d((byte) 47);
              va.a((byte) 75);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 < 90) {
            return;
        }
        field_w = null;
    }

    final static boolean e(int param0) {
        if (param0 != -29919) {
            return false;
        }
        return qo.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Food. Have a look at your first food in the fridge.";
        field_z = 5;
    }
}
