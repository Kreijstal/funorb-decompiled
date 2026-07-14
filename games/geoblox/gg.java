/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_a;
    static String field_d;
    static String field_c;
    static int field_b;

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 87 / ((param0 - 25) / 53);
        if (param1 != 160) {
          if (param1 != 32) {
            if (param1 != 95) {
              if (param1 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        Object var4 = null;
        if (param1 < 56) {
          var4 = null;
          int discarded$2 = gg.a((byte[]) null, -123, -57);
          return oe.a(param2, param0, -40, 0);
        } else {
          return oe.a(param2, param0, -40, 0);
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 45) {
          var2 = null;
          int discarded$2 = gg.a((byte[]) null, 124, 46);
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != -11455) {
            return null;
        }
        return mj.a(0, param1.length, param1, (byte) 96);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_b = 0;
        field_d = "Names should contain a maximum of 12 characters";
    }
}
