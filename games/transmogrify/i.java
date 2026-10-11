/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static java.applet.Applet field_f;
    static String field_e;
    static java.security.SecureRandom field_a;
    static String field_d;
    static int[] field_b;
    static String field_c;

    final static boolean a(char param0, int param1) {
        if (32 <= param0) {
          if (param0 <= 126) {
            return true;
          }
          if (param0 >= param1 &&
            255 >= param0) {
            return true;
          }
          if (param0 != 8364 &&
            param0 != 338 &&
            param0 != 8212 &&
            param0 != 339) {
            if (376 != param0) {
              return false;
            }
            return true;
          }
          return true;
        }
        if (param0 >= param1) {
          if (255 >= param0) {
            return true;
          }
          if (param0 != 8364 &&
            param0 != 338 &&
            param0 != 8212 &&
            param0 != 339) {
            if (376 != param0) {
              return false;
            }
            return true;
          }
          return true;
        }
        if (param0 == 8364) {
          return true;
        }
        if (param0 == 338) {
          return true;
        }
        if (param0 == 8212) {
          return true;
        }
        if (param0 == 339) {
          return true;
        }
        if (376 != param0) {
          return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        ng.field_i = null;
        ej.field_n = param0 ? true : false;
        ne.field_a = null;
        th.field_d = null;
        bd.field_p = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_c = (String) null;
          if (null == nk.field_b) {
            return false;
          }
          if (lj.field_z == ll.field_Q) {
            return true;
          }
          return false;
        }
        if (null == nk.field_b) {
          return false;
        }
        if (lj.field_z == ll.field_Q) {
          return true;
        }
        return false;
    }

    public static void c(boolean param0) {
        field_f = null;
        if (param0) {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_e = (String) null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_e = "End Tutorial";
        field_d = "Waiting for music";
        field_b = new int[16384];
        field_c = "Loading fonts";
    }
}
