/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends nm {
    long[][] field_r;
    boolean field_o;
    int[][] field_n;
    int field_l;
    static String field_j;
    static int field_m;
    static boolean field_k;
    int field_q;
    String[][] field_i;
    int field_p;

    final static void a(boolean param0, int param1) {
        uo.a(param0, false);
        cq.a(param0, (byte) -125);
        if (param1 < 10) {
            Object var3 = null;
            Object discarded$0 = eg.a(38, (byte[]) null, true);
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        eo var3 = null;
        if (param1 != null) {
          if (param1.length > 136) {
            var3 = new eo();
            ((tl) (Object) var3).a(67, param1);
            return (Object) (Object) var3;
          } else {
            if (param0 < -103) {
              if (param2) {
                return (Object) (Object) ke.a(false, param1);
              } else {
                return (Object) (Object) param1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 136) {
            field_k = false;
        }
    }

    eg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Enter name of friend to delete from list";
    }
}
