/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qe extends oh {
    static String field_l;
    ln field_h;
    gm field_i;
    static fg field_k;
    static bi field_j;

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != 93) {
          return;
        }
        field_k = null;
    }

    qe() {
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -65) {
          return true;
        }
        if (param1 < 0) {
          return (1 + param1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return 0 == param1 % 4 ? true : false;
        }
        if (0 != param1 % 4) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (0 != param1 % 400) {
          return false;
        }
        return true;
    }

    final static boolean a(int param0) {
        if (param0 < 89) {
          return true;
        }
        if (rp.field_I == null) {
          return false;
        }
        if (rp.field_I.g((byte) 105) == null) {
          return false;
        }
        return true;
    }

    static {
        field_l = "Failed defences";
        field_k = new fg();
    }
}
