/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aca extends vg {
    int field_j;
    static String[] field_h;
    static byte[] field_i;
    static String field_g;
    int field_f;

    public static void a(boolean param0) {
        field_i = null;
        field_g = null;
        field_h = null;
        if (param0) {
            Object var2 = null;
            aca.a((sia) null, 1);
        }
    }

    final static void a(sia param0, int param1) {
        kra.field_c.insertElementAt((Object) (Object) param0, 0);
        if (param1 != 19711) {
            Object var3 = null;
            hea discarded$0 = aca.a((cn) null, 32, (cn) null, (byte) -47, 55);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 32768) {
            return false;
        }
        return -1 != (param0 & 32768 ^ -1) ? true : false;
    }

    final static hea a(cn param0, int param1, cn param2, byte param3, int param4) {
        if (param3 < -99) {
          if (!jna.a(false, param4, param1, param2)) {
            return null;
          } else {
            return fq.a(param0.a(false, param1, param4), (byte) 103);
          }
        } else {
          return null;
        }
    }

    private aca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "HOLD <img=10><img=11> TO SNEAK OVER SNAKES";
    }
}
