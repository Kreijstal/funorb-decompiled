/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends gj {
    static String field_u;
    vh field_r;
    int field_p;
    byte[] field_s;
    static int field_w;
    static bc field_t;
    static String field_v;
    static mk field_q;

    final static boolean a(int param0, char param1) {
        boolean stackIn_25_0 = false;
        int var2;
        var2 = 92 % ((param0 - 32) / 39);
        if (param1 < 48) {
          if (65 > param1) {
            if (param1 >= 97 &&
              param1 <= 122) {
              return true;
            }
            return false;
          }
          if (90 >= param1) {
            return true;
          }
          stackIn_25_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_25_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (65 <= param1 &&
          90 >= param1) {
          return true;
        }
        if (param1 < 97) {
          return false;
        }
        if (param1 > 122) {
          return false;
        }
        return true;
    }

    public static void d(int param0) {
        field_q = null;
        field_v = null;
        if (param0 <= -50) {
          field_u = null;
          field_t = null;
          return;
        }
        field_u = (String) null;
        field_u = null;
        field_t = null;
    }

    final int c(byte param0) {
        if (param0 > -100) {
          this.field_s = (byte[]) null;
          if (!this.field_n) {
            return 100;
          }
          return 0;
        }
        if (!this.field_n) {
          return 100;
        }
        return 0;
    }

    final byte[] d(byte param0) {
        if (param0 >= -106) {
          field_w = 85;
          if (this.field_n) {
            throw new RuntimeException();
          }
          return this.field_s;
        }
        if (this.field_n) {
          throw new RuntimeException();
        }
        return this.field_s;
    }

    md() {
    }

    static {
        field_u = "Sound ";
        field_w = 256;
        field_t = new bc();
        field_v = "You have <%0> unread messages!";
    }
}
