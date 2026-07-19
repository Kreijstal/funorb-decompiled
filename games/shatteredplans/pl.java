/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_a;
    static String field_b;

    final static void a(boolean param0, byte param1) {
        if (param1 == -26) {
          if (bq.field_h != null) {
            if (!bq.field_h.c(param0, -1)) {
              return;
            } else {
              bq.field_h = null;
              return;
            }
          } else {
            return;
          }
        } else {
          field_a = (String) null;
          if (bq.field_h != null) {
            if (!bq.field_h.c(param0, -1)) {
              return;
            } else {
              bq.field_h = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7526) {
            pl.a(false, (byte) -123);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "You are offering to draw.";
        field_a = "Offensive account name";
    }
}
