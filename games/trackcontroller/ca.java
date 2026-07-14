/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static ba field_b;
    static int[] field_c;
    static String[] field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 < 116) {
            field_b = null;
        }
    }

    final static j a(String param0, int param1) {
        if (param1 == 647) {
          if (sa.field_Q.b((byte) 86)) {
            if (param0.equals((Object) (Object) sa.field_Q.a((byte) 63))) {
              return sa.field_Q;
            } else {
              sa.field_Q = c.a(param0, 30692);
              return sa.field_Q;
            }
          } else {
            return sa.field_Q;
          }
        } else {
          field_d = null;
          if (!sa.field_Q.b((byte) 86)) {
            return sa.field_Q;
          } else {
            L0: {
              if (!param0.equals((Object) (Object) sa.field_Q.a((byte) 63))) {
                sa.field_Q = c.a(param0, 30692);
                break L0;
              } else {
                break L0;
              }
            }
            return sa.field_Q;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ba();
        field_d = "Restart Level";
    }
}
