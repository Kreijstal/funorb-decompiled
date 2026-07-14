/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends rk {
    static String field_u;
    byte[] field_q;
    static bi field_p;
    static String field_s;
    static int field_n;
    int field_o;
    static int field_m;
    static fh field_t;
    long field_r;

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
            return;
        }
        field_t = null;
        field_u = null;
        field_p = null;
    }

    final static boolean a(char param0, int param1) {
        if (param1 == -58) {
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_s = null;
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != -24682) {
            return null;
        }
        return tb.a(0, param1, false);
    }

    hc(long param0, int param1, byte[] param2) {
        ((hc) this).field_q = param2;
        ((hc) this).field_r = param0;
        ((hc) this).field_o = param1;
    }

    static {
    }
}
