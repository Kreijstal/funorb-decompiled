/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    String field_f;
    static int field_e;
    boolean field_d;
    String field_c;
    static wk field_g;
    static int field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
            Object var2 = null;
            byte[] discarded$0 = ko.a(false, -124, (Object) null);
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        Object var4 = null;
        mg var5 = null;
        if (param2 != null) {
          if (!(param2 instanceof byte[])) {
            if (param2 instanceof mg) {
              var5 = (mg) param2;
              return var5.a(0);
            } else {
              if (param1 < 30) {
                var4 = null;
                byte[] discarded$2 = ko.a(false, 22, (Object) null);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            var3 = (byte[]) param2;
            if (!param0) {
              return var3;
            } else {
              return kj.a(var3, 31732);
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new wk(56, 56);
        field_b = 0;
        field_a = "Player";
    }
}
