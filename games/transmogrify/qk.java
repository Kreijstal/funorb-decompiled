/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static ti field_c;
    String field_d;
    ci field_a;
    String field_g;
    String field_b;
    static int[] field_e;
    int field_f;

    final static boolean a(char param0, byte param1) {
        boolean stackIn_27_0 = false;
        if (param1 != -110) {
          return true;
        }
        if (param0 < 48) {
          if (65 > param0) {
            if (param0 >= 97 &&
              122 >= param0) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (122 >= param0);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (65 <= param0 &&
          param0 <= 90) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (122 < param0) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -39 / ((2 - param0) / 42);
        field_e = null;
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
    }
}
