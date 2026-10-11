/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String[] field_h;
    static String field_f;
    static char[] field_a;
    static String field_b;
    static int field_d;
    static dd field_g;
    static dd field_e;
    static int field_c;

    final static String a(byte param0) {
        if (null == di.field_j) {
          return "";
        }
        if (param0 > -85) {
          field_d = 115;
          return di.field_j;
        }
        return di.field_j;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = null;
        if (param0) {
          return;
        }
        field_h = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (0 > param0) {
          throw new IllegalArgumentException("");
        }
        if (32768 > param0) {
          if (128 > param0) {
            if (param0 < 8) {
              if (2 > param0) {
                return 256;
              }
              var2 = 7;
            } else {
              var2 = (param0 < 32) ? 6 : 5;
            }
          } else {
            if (param0 < 2048) {
              var2 = (param0 < 512) ? 4 : 3;
            } else {
              var2 = (param0 >= 8192) ? 1 : 2;
            }
          }
          param0 = param0 << (var2 << 1);
          return ac.field_o[param0 - 32768] >> var2;
        }
        if (param0 < 131072) {
          if (param1 <= -119) {
            return ac.field_o[-32768 + param0];
          }
          field_f = (String) null;
          return ac.field_o[-32768 + param0];
        }
        if (param0 >= 33554432) {
          if (param0 >= 536870912) {
            var2Lifetime1 = 7;
          } else {
            var2Lifetime1 = (param0 >= 134217728) ? 6 : 5;
          }
        } else {
          if (param0 < 2097152) {
            var2Lifetime1 = (param0 >= 524288) ? 2 : 1;
          } else {
            var2Lifetime1 = (param0 < 8388608) ? 3 : 4;
          }
        }
        param0 = param0 >> (var2Lifetime1 << 1);
        return ac.field_o[param0 - 32768] << var2Lifetime1;
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 > -116) {
            field_g = (dd) null;
          }
          if (d.field_d != null) {
            d.field_d.k(17);
          }
          vj.field_j = new ui(param2, param0, false, true, true);
          tn.field_n.d(vj.field_j, 30);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "rf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_f = "You must play 1 more rated game before playing with the current options.";
        field_d = 64;
        field_b = "Your game";
    }
}
