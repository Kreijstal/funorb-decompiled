/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ana {
    static af field_w;
    private iba field_v;

    private final void f(int param0) {
        hd var4 = null;
        hd var4_ref = null;
        var4 = (hd) (Object) al.a(103, ((ki) this).field_v.field_k);
        var4_ref = var4;
        aga discarded$7 = ((ki) this).field_v.field_l.a(19, ((ki) this).field_q.field_h);
        int[][] discarded$8 = ((ki) this).field_v.d((byte) 2);
        uea discarded$9 = new uea(((ki) this).field_q, ((ki) this).field_v.field_q, ((ki) this).field_v.field_r, gma.field_e[var4_ref.field_q].field_a);
        ((ki) this).field_v.a(((ki) this).field_q.field_h, false);
        if (param0 != -1) {
          ki.e(80);
          return;
        } else {
          return;
        }
    }

    ki(gj param0, iba param1) {
        super(param0, (bca) (Object) param1);
        ((ki) this).field_v = param1;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        ((ki) this).field_l = ((ki) this).field_l - 1;
        if (((ki) this).field_l - 1 <= -1) {
          if (-26 != ((ki) this).field_l) {
            return false;
          } else {
            this.f(-1);
            return false;
          }
        } else {
          var2 = -41 % ((71 - param0) / 47);
          this.d(-26);
          return true;
        }
    }

    final static void g(int param0) {
        gm.field_k = false;
        if (da.field_d == null) {
          if (param0 != -26) {
            return;
          } else {
            L0: {
              if (gk.field_d != 0) {
                bea.d(param0 + -96);
                break L0;
              } else {
                break L0;
              }
            }
            uga.field_x = 0;
            return;
          }
        } else {
          da.field_d.f((byte) -118);
          if (param0 != -26) {
            return;
          } else {
            L1: {
              if (gk.field_d != 0) {
                bea.d(param0 + -96);
                break L1;
              } else {
                break L1;
              }
            }
            uga.field_x = 0;
            return;
          }
        }
    }

    private final void d(int param0) {
        if (param0 != -26) {
            ((ki) this).field_v = null;
        }
    }

    public static void e(int param0) {
        field_w = null;
        if (param0 != -1) {
            field_w = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new af();
    }
}
