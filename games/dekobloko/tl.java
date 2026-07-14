/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends wm {
    private boolean field_p;
    static ck[] field_u;
    static String field_x;
    static String field_s;
    static ck[] field_w;
    static int[] field_q;
    static String field_r;
    private String field_t;
    private re field_v;

    final static boolean b(int param0, int param1, int param2) {
        if (13 != wh.field_c) {
          if (wh.field_c != param1) {
            if (null != mg.field_bc) {
              if (!mg.field_bc.b(param2, 15028, param0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            mg.field_bc.e(0);
            return true;
          }
        } else {
          qn.l(param1 + -89);
          return true;
        }
    }

    final tb b(String param0, byte param1) {
        if (((tl) this).field_v.b(param0, param1) == vm.field_u) {
            return vm.field_u;
        }
        if (param0.equals((Object) (Object) ((tl) this).field_t)) {
            return !((tl) this).field_p ? vm.field_u : dc.field_b;
        }
        ta var3 = ik.a(103, param0);
        if (!(var3.a(103))) {
            return jb.field_j;
        }
        ((tl) this).field_t = param0;
        ((tl) this).field_p = var3.b(-3348);
        return !((tl) this).field_p ? vm.field_u : dc.field_b;
    }

    public static void g(byte param0) {
        field_w = null;
        field_r = null;
        if (param0 >= -59) {
          field_w = null;
          field_s = null;
          field_x = null;
          field_q = null;
          field_u = null;
          return;
        } else {
          field_s = null;
          field_x = null;
          field_q = null;
          field_u = null;
          return;
        }
    }

    tl(rk param0, rk param1) {
        super(param0);
        ((tl) this).field_t = "";
        ((tl) this).field_p = false;
        ((tl) this).field_v = new re(param0, param1);
    }

    final String a(String param0, byte param1) {
        if (param1 != -11) {
            field_s = null;
            if (!(((tl) this).field_v.b(param0, (byte) -40) != vm.field_u)) {
                return ((tl) this).field_v.a(param0, (byte) -11);
            }
            if (!(((tl) this).b(param0, (byte) -40) != vm.field_u)) {
                return dd.field_m;
            }
            return li.field_a;
        }
        if (!(((tl) this).field_v.b(param0, (byte) -40) != vm.field_u)) {
            return ((tl) this).field_v.a(param0, (byte) -11);
        }
        if (!(((tl) this).b(param0, (byte) -40) != vm.field_u)) {
            return dd.field_m;
        }
        return li.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "This option cannot be combined with the current settings for:  ";
        field_q = new int[5];
        field_s = "Ignore";
        field_r = "You can spectate this game";
    }
}
