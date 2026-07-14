/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dob extends rqa {
    static String field_o;
    static String field_q;
    static String field_p;

    dob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        int var1 = -111 / ((param0 - -5) / 49);
    }

    final static int[] a(int[] param0, byte param1, int[] param2) {
        if (param1 < -24) {
          if (param2 != null) {
            if (param0 != null) {
              if (param2.length != param0.length) {
                param0 = new int[param2.length];
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              } else {
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              }
            } else {
              param0 = new int[param2.length];
              cua.a(param2, 0, param0, 0, param2.length);
              return param0;
            }
          } else {
            return null;
          }
        } else {
          dob.e((byte) -70);
          if (param2 != null) {
            if (param0 != null) {
              if (param2.length == param0.length) {
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              } else {
                param0 = new int[param2.length];
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              }
            } else {
              param0 = new int[param2.length];
              cua.a(param2, 0, param0, 0, param2.length);
              return param0;
            }
          } else {
            return null;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(4, 62, param0[0].a(106));
        if (param1 > -119) {
          field_q = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Hull plate 2";
        field_o = "<teamname> <objective>";
        field_p = "Chat";
    }
}
