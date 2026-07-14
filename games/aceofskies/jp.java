/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static ke field_a;
    static int field_b;

    final static void a(int param0, rh param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (null != ((rh) param1).field_g) {
              if (param0 != 50) {
                field_b = -46;
                ud.a(param1, -98);
                return;
              } else {
                ud.a(param1, -98);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = (ke) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ke();
        field_b = 50;
    }
}
