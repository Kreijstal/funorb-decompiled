/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static int field_f;
    String field_e;
    boolean field_a;
    static int field_c;
    String[] field_b;
    boolean field_d;
    int field_g;

    final static boolean a(char param0, int param1) {
        if (param1 != -46) {
          field_c = 22;
          if (param0 == 160) {
            return true;
          }
          if (param0 == 32) {
            return true;
          }
          if (param0 == 95) {
            return true;
          }
          if (param0 != 45) {
            return false;
          }
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    ck(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_f = 0;
    }
}
