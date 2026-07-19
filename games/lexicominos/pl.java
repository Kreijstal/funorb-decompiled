/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static int[] field_c;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            field_a = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        if (!qg.field_d) {
          throw new IllegalStateException();
        } else {
          u.field_tb = true;
          if (param0 > -73) {
            return;
          } else {
            q.a((byte) 110, false);
            ta.field_g = 0;
            return;
          }
        }
    }

    static {
        field_c = new int[8192];
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = "Unpacking music";
    }
}
