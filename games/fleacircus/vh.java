/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends lh {
    int field_m;
    static int field_o;
    static String field_k;
    static int[][] field_j;
    int field_n;
    static int field_l;
    static int[] field_i;

    public static void d(int param0) {
        if (param0 != -889323520) {
          vh.a(-16L, -34);
          field_j = null;
          field_k = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_i = null;
          return;
        }
    }

    private vh() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        td.field_k.field_c = param0;
        td.field_k.field_b = 0;
    }

    final static void a(long param0, int param1) {
        int var3 = 0;
        var3 = 9 % ((param1 - -45) / 39);
        if (param0 <= 0L) {
          return;
        } else {
          if (param0 % 10L == 0L) {
            df.a(-122, -1L + param0);
            df.a(71, 1L);
            return;
          } else {
            df.a(-119, param0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Passwords must be between 5 and 20 characters long";
        field_o = -889323520;
    }
}
