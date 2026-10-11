/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static tm field_a;
    static boolean field_d;
    int field_c;
    static String field_b;

    final static dd a(int param0, int param1) {
        if (param0 != -17104) {
          field_a = (tm) null;
          if (mp.field_V > 0) {
            return ua.field_r;
          }
          if (ap.field_w[param1]) {
            return mm.field_j;
          }
          return ua.field_r;
        }
        if (mp.field_V > 0) {
          return ua.field_r;
        }
        if (ap.field_w[param1]) {
          return mm.field_j;
        }
        return ua.field_r;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (qi.field_a == 13) {
          th.b(-1);
          return true;
        }
        if (qi.field_a == 102) {
          im.field_Ub.f(param0 ^ 30860);
          return true;
        }
        if (param0 != 15585) {
          return true;
        }
        if (null == im.field_Ub) {
          return false;
        }
        if (im.field_Ub.a(param2, param1, 85)) {
          return true;
        }
        return false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -29 / ((param0 - 26) / 35);
    }

    tf(int param0) {
        this.field_c = param0;
    }

    static {
        field_b = "Player";
    }
}
