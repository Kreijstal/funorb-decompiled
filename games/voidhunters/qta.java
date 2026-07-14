/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qta extends rqa {
    static int[] field_o;

    final static boolean a(int param0, int param1) {
        if (param1 == 9) {
          if (4 <= param0) {
            if (13 == param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          qta.b(false);
          if (4 <= param0) {
            if (13 == param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    qta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          qta.b(true);
          return new nc((Object) (Object) frb.a(9, 111));
        } else {
          return new nc((Object) (Object) frb.a(9, 111));
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            boolean discarded$0 = qta.a(-80, 94);
        }
    }

    static {
    }
}
