/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_b;
    static int field_c;
    static String field_d;
    static lk field_a;

    final static boolean a(ad param0, ad param1, ad param2, byte param3) {
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        if (param0.a(92)) {
          if (param0.a(0, "commonui")) {
            if (param1.a(-33)) {
              if (param1.a(0, "commonui")) {
                if (param3 < 100) {
                  return true;
                } else {
                  L0: {
                    L1: {
                      if (!param2.a(-82)) {
                        break L1;
                      } else {
                        if (!param2.a(0, "button.gif")) {
                          break L1;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L0;
                        }
                      }
                    }
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  }
                  return stackIn_15_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static d a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, byte param8) {
        int var10 = -126 % ((param8 - -23) / 61);
        d var9 = new d(param5, param1, param6, param3, param0, param2, param4);
        wk.field_b.a(-8212, (ug) (Object) var9);
        pj.a(param7, var9, true);
        return var9;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0) {
            field_a = null;
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (param0.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param0.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param0.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param0.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        int var2 = -5 / ((param1 - 0) / 59);
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = am.a((char)param0, param1, "", -23026);
        var3 = ki.a((byte) 55, param1);
        if (0 == (param2.indexOf(param1) ^ -1)) {
          if ((param2.indexOf(var3) ^ -1) != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
        field_a = new lk();
    }
}
