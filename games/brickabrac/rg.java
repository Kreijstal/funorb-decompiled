/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    private mf field_d;
    static tf field_i;
    static String[] field_b;
    private to field_h;
    static String[] field_k;
    static int field_a;
    static mh field_e;
    private mf field_j;
    static jp field_f;
    static int[] field_g;
    static mh field_c;

    final wd a(int param0, boolean param1) {
        wd var3 = null;
        wd var3_ref = null;
        byte[] var4 = null;
        var3 = (wd) ((rg) this).field_h.a((long)param0, param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param0 >= 32768) {
              var4 = ((rg) this).field_d.a(param0 & 32767, 1, 4);
              break L0;
            } else {
              var4 = ((rg) this).field_j.a(param0, 1, 4);
              break L0;
            }
          }
          L1: {
            var3_ref = new wd();
            if (var4 != null) {
              var3_ref.a(new wq(var4), -3);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 < 32768) {
            ((rg) this).field_h.a(84, (Object) (Object) var3_ref, (long)param0);
            if (!param1) {
              wd discarded$4 = ((rg) this).a(120, false);
              return var3_ref;
            } else {
              return var3_ref;
            }
          } else {
            var3_ref.g(-126);
            ((rg) this).field_h.a(84, (Object) (Object) var3_ref, (long)param0);
            if (param1) {
              return var3_ref;
            } else {
              wd discarded$5 = ((rg) this).a(120, false);
              return var3_ref;
            }
          }
        }
    }

    final static boolean a(mf param0, byte param1) {
        if (param1 <= 45) {
            field_i = null;
            return param0.a(96);
        }
        return param0.a(96);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_k = null;
        if (param0 != 64) {
            rg.a(-104);
        }
    }

    rg(int param0, mf param1, mf param2, bp param3) {
        ((rg) this).field_h = new to(64);
        ((rg) this).field_j = param1;
        ((rg) this).field_d = param2;
        if (((rg) this).field_j != null) {
            int discarded$0 = ((rg) this).field_j.c(-123, 1);
        }
        if (((rg) this).field_d != null) {
            int discarded$1 = ((rg) this).field_d.c(-124, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 22;
        field_i = new tf();
        field_g = new int[4];
    }
}
