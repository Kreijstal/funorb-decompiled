/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_g;
    static boolean field_a;
    static int field_b;
    static String field_e;
    static ci field_f;
    static String field_d;
    static String[] field_c;

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        f var4 = null;
        if (param2 != null) {
          if (param2 instanceof byte[]) {
            var3 = (byte[]) param2;
            if (param0) {
              return tj.a(-117, var3);
            } else {
              return var3;
            }
          } else {
            if (!param1) {
              if (param2 instanceof f) {
                var4 = (f) param2;
                return var4.b(438);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        field_c = null;
        int var1 = 48 / ((-57 - param0) / 38);
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_e = "Hotseat multiplayer game";
        field_d = "Tips";
        field_g = "This game has started.";
        field_c = new String[]{"", "", "N", "B", "R", "Q", "K"};
    }
}
