/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mwa extends rqa {
    static String field_o;
    static jra field_p;

    mwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          int discarded$2 = mwa.a('A', 38);
          si.a(177, 62, param0[0].a(9));
          return new nc((Object) (Object) "void");
        } else {
          si.a(177, 62, param0[0].a(9));
          return new nc((Object) (Object) "void");
        }
    }

    final static int a(char param0, int param1) {
        if (0 <= param0) {
          if (param0 >= si.field_q.length) {
            if (param1 > -20) {
              int discarded$4 = mwa.a('', 79);
              return -1;
            } else {
              return -1;
            }
          } else {
            return si.field_q[param0];
          }
        } else {
          if (param1 > -20) {
            int discarded$5 = mwa.a('', 79);
            return -1;
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        if (param0 < 126) {
            return;
        }
        field_p = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Scores";
        field_p = new jra();
    }
}
