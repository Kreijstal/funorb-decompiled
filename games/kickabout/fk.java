/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends hs {
    private boolean field_l;
    static String[] field_j;
    static int[] field_k;

    final static int b(int param0, int param1, int param2) {
        int var4 = Kickabout.field_G;
        int var3 = 1;
        while (param2 > 1) {
            if ((1 & param2) != 0) {
                var3 = var3 * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
        }
        if (param1 != -11934) {
            fk.f(-39);
            if (!(-2 != param2)) {
                return var3 * param0;
            }
            return var3;
        }
        if (!(-2 != param2)) {
            return var3 * param0;
        }
        return var3;
    }

    final void f(int param0, int param1) {
        if (param0 < 98) {
            ((fk) this).field_l = true;
        }
    }

    final void e(int param0) {
        ((fk) this).c(112);
        ((fk) this).a(false, vo.a((byte) -18, mc.field_e, new String[1]));
        ((fk) this).b(param0 + -2352, ((fk) this).field_a.field_v);
        ((fk) this).a(150, 17709);
        if (param0 == 1) {
          if (((fk) this).field_a.field_f) {
            un.field_d.a("FB", 5, 17, 16777215, -1);
            return;
          } else {
            return;
          }
        } else {
          ((fk) this).e(-98);
          if (!((fk) this).field_a.field_f) {
            return;
          } else {
            un.field_d.a("FB", 5, 17, 16777215, -1);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
            int discarded$0 = fk.b(76, -73, -121);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        if (param0 < -92) {
          if (param1) {
            if (((fk) this).field_l) {
              return;
            } else {
              or.field_d.b(75, (byte) 74);
              or.field_d.a(121, 4);
              ((fk) this).field_l = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    fk(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        ((fk) this).field_l = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Current Bid:", "Buyout", "Time Left:"};
        field_k = new int[8192];
    }
}
