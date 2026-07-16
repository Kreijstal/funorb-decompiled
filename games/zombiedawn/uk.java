/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static vo field_a;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -21) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 != -44) {
            uk.a(31);
            if ((ld.field_j ^ -1) > -21) {
                return true;
            }
            if (!bj.d(param0 ^ -18868)) {
                return true;
            }
            if (-1 <= (sd.field_b ^ -1)) {
                return false;
            }
            if (nm.c(-23022)) {
                return false;
            }
            return true;
        }
        if ((ld.field_j ^ -1) > -21) {
            return true;
        }
        if (!bj.d(param0 ^ -18868)) {
            return true;
        }
        if (-1 <= (sd.field_b ^ -1)) {
            return false;
        }
        if (nm.c(-23022)) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        ce.field_r = fj.field_g.a(true);
        if (param0) {
          field_b = null;
          var2 = (CharSequence) (Object) ce.field_r;
          kf.field_T = fm.a(var2, -122);
          return;
        } else {
          var3 = (CharSequence) (Object) ce.field_r;
          kf.field_T = fm.a(var3, -122);
          return;
        }
    }

    final static String a(int param0, byte param1, int param2) {
        int var3 = -37 % ((param1 - -79) / 44);
        return param0 + "/" + param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vo();
        field_b = "Instructions";
        field_c = "Discard";
    }
}
