/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends ld {
    private static long[] field_l;
    static float field_t;
    static hj field_n;
    static om field_m;
    static mf field_j;
    static int field_r;
    static t field_q;
    static String[] field_s;
    static hh field_o;
    static String field_i;
    static String[] field_k;
    static String field_p;

    public static void c(int param0) {
        field_q = null;
        field_p = null;
        field_k = null;
        field_n = null;
        field_o = null;
        field_m = null;
        field_i = null;
        if (param0 != 256) {
            return;
        }
        field_s = null;
        field_j = null;
        field_l = null;
    }

    final fk a(byte param0) {
        if (param0 != 32) {
            return null;
        }
        return ui.field_a;
    }

    pl(long param0, String param1) {
        super(param0, param1);
    }

    final static int[] d(int param0) {
        if (!(null == bk.field_r)) {
            return bk.field_r.c(0);
        }
        int var1 = -48 % ((param0 - 76) / 47);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_l = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_s = new String[]{"Retrieval - Normal", "Retrieval - Hard", "Retribution", "Simulator"};
            field_m = new om(4, 1, 1, 1);
            field_i = "Type your password again to make sure it's correct";
            field_k = new String[]{"fuel", "crate", "turret", "magnet", "repeller", "tnt", "laser_left", "laser_right", "barrier", "powerup_shield", "powerup_triple_shot", "powerup_thrust", "powerup_one_rockbuster", "powerup_five_rockbusters"};
            field_p = "Simulator objectives";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_l[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L ^ -1L) == -2L) {
                  var0 = var0 >>> 541030913 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
