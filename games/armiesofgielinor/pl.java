/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends bd {
    static boolean field_A;
    static String field_t;
    static wk[] field_x;
    static String field_z;
    private jd field_u;
    static String[] field_y;
    static String field_C;
    static int[] field_s;
    static wk[] field_D;
    static String field_v;
    private int field_w;

    public static void a(boolean param0) {
        field_y = null;
        field_s = null;
        field_v = null;
        field_x = null;
        field_C = null;
        field_t = null;
        field_D = null;
        field_z = null;
        if (!param0) {
            wj discarded$0 = pl.a(-31, -19, 87, -24, -42);
        }
    }

    final void a(int param0, ha param1) {
        Object var4 = null;
        L0: {
          if ((((pl) this).field_u.field_N ^ -1) == -40) {
            param1.field_l.a((byte) -119, (tc) (Object) new hp(((pl) this).field_u));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 64) {
          if (34 != ((pl) this).field_u.field_N) {
            if (-8 != (((pl) this).field_u.field_N ^ -1)) {
              if (17 == ((pl) this).field_u.field_N) {
                param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
                return;
              } else {
                return;
              }
            } else {
              param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
              return;
            }
          } else {
            param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
            return;
          }
        } else {
          var4 = null;
          ((pl) this).a(10, (ha) null);
          if (34 != ((pl) this).field_u.field_N) {
            if (-8 != (((pl) this).field_u.field_N ^ -1)) {
              if (17 == ((pl) this).field_u.field_N) {
                param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
                return;
              } else {
                return;
              }
            } else {
              param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
              return;
            }
          } else {
            param1.field_l.a((byte) -119, (tc) (Object) new tr(((pl) this).field_u.field_J, ((pl) this).field_u.field_w, ((pl) this).field_w));
            return;
          }
        }
    }

    final static wj a(int param0, int param1, int param2, int param3, int param4) {
        wj var5 = null;
        wj var5_ref = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = (wj) (Object) lf.field_c.e((byte) 114);
        L0: while (true) {
          if (var5 == null) {
            var5_ref = new wj();
            var5_ref.field_p = param4;
            var5_ref.field_k = param3;
            var5_ref.field_r = param1;
            lf.field_c.a((byte) -119, (tc) (Object) var5_ref);
            gn.a(param2, var5_ref, 0);
            if (param0 != 34) {
              field_s = null;
              return var5_ref;
            } else {
              return var5_ref;
            }
          } else {
            if (param1 == var5.field_r) {
              return var5;
            } else {
              var5 = (wj) (Object) lf.field_c.a((byte) 123);
              continue L0;
            }
          }
        }
    }

    pl(int param0, jd param1, int param2) {
        ((pl) this).field_u = param1;
        ((pl) this).field_w = param2;
        ((pl) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Email: ";
        field_y = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_z = "Show tutorial";
        field_s = new int[]{316};
        field_C = "Defeat all enemy units to win this battle.";
        field_v = "Return to lobby";
    }
}
