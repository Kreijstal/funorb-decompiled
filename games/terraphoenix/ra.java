/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends uf {
    static pk field_l;
    int field_n;
    static String field_m;
    static String field_j;
    static String field_h;
    static dc[] field_i;
    long field_o;
    byte[] field_k;

    final static boolean c(byte param0) {
        if (param0 >= 26) {
          if (null != ig.field_e) {
            if (mh.field_a != od.field_g) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_j = null;
          if (null != ig.field_e) {
            if (mh.field_a != od.field_g) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_h = null;
        if (param0 != 7876) {
            return;
        }
        field_m = null;
        field_l = null;
    }

    ra(long param0, int param1, byte[] param2) {
        ((ra) this).field_o = param0;
        ((ra) this).field_k = param2;
        ((ra) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_j = "Achievements";
    }
}
