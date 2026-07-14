/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends rl {
    static String field_x;
    static int field_q;
    static String[] field_u;
    static String field_s;
    static gi field_w;
    static String field_z;
    static String field_v;
    static kc field_y;
    static kc field_r;
    static String field_t;

    final static boolean e(boolean param0) {
        if (param0) {
            return false;
        }
        if (null == tc.field_A) {
            return false;
        }
        if (!tc.field_A.e(81)) {
            return false;
        }
        return true;
    }

    lo(rn param0) {
        super(param0);
    }

    final eh a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var5 = (CharSequence) (Object) param0;
        if (fi.a(var5, 10)) {
          var6 = (CharSequence) (Object) param0;
          var3 = dc.a(var6, 127);
          var4 = 27 / ((-50 - param1) / 36);
          if (-1 > var3) {
            if (-131 < var3) {
              return ra.field_k;
            } else {
              return nn.field_s;
            }
          } else {
            return ra.field_k;
          }
        } else {
          return ra.field_k;
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_r = null;
        field_y = null;
        field_s = null;
        field_z = null;
        if (param0 != 15672) {
          boolean discarded$2 = lo.e(false);
          field_x = null;
          field_w = null;
          field_v = null;
          field_u = null;
          return;
        } else {
          field_x = null;
          field_w = null;
          field_v = null;
          field_u = null;
          return;
        }
    }

    final String a(String param0, byte param1) {
        if (param1 >= -114) {
            return null;
        }
        if (((lo) this).a(param0, -93) != ra.field_k) {
            return null;
        }
        return gf.field_V;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Reading Book of Seas";
        field_z = "Full";
        field_x = "Orb points: <%0>";
        field_v = "MOST DAMAGE - ";
        field_t = "Gameplay tips:";
    }
}
