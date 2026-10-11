/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends RuntimeException {
    static int[] field_e;
    Throwable field_f;
    String field_a;
    static int field_c;
    static int[] field_d;
    static String[] field_b;

    final static boolean a(byte param0) {
        if (param0 >= -112) {
          field_b = (String[]) null;
          if (null == r.field_a) {
            return false;
          }
          if (null != r.field_a.i((byte) -127)) {
            return true;
          }
          return false;
        }
        if (null == r.field_a) {
          return false;
        }
        if (null != r.field_a.i((byte) -127)) {
          return true;
        }
        return false;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 48) {
          field_e = (int[]) null;
          if (48 > param1) {
            return false;
          }
          if (57 >= param1) {
            return true;
          }
          return false;
        }
        if (48 > param1) {
          return false;
        }
        if (57 >= param1) {
          return true;
        }
        return false;
    }

    ii(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_f = param0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != 8388479) {
          field_c = 23;
        }
    }

    static {
        field_d = new int[]{16744319, 8388479, 16777087, 8421631};
    }
}
