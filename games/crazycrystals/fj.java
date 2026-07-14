/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String[] field_b;
    static qa field_c;
    static String field_a;
    static boolean field_d;

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        af var3 = null;
        if (param1) {
          if (param2 != null) {
            if (param2.length > 136) {
              var3 = new af();
              ((qb) (Object) var3).a(param2, 98);
              return (Object) (Object) var3;
            } else {
              if (!param0) {
                return (Object) (Object) param2;
              } else {
                return (Object) (Object) sm.a(-128, param2);
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 136) {
            field_d = false;
            return rd.field_h;
        }
        return rd.field_h;
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = -70 % ((param0 - 53) / 58);
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "to over <%0> great games";
        field_b = new String[]{"By rating", "By win percentage"};
    }
}
