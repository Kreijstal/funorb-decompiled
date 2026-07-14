/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static String field_g;
    static uj field_h;
    static java.math.BigInteger field_f;
    static String field_e;
    static int[] field_i;
    static int field_a;
    static int field_b;
    static int field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        field_i = null;
        field_c = null;
        if (param0 != 4) {
            boolean discarded$0 = q.a(125, (byte) -14, -93, -34, -5, -28, 57);
        }
        field_h = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (param2 <= 2) {
            q.a(-2);
        }
        if (!vg.a(param1, param0, (byte) 26)) {
            return false;
        }
        for (var3 = 0; var3 < param0.length(); var3++) {
            if (!bc.a(param0.charAt(var3), -161)) {
                return false;
            }
        }
        return true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 == 12) {
          L0: {
            L1: {
              if (param5 > param4) {
                break L1;
              } else {
                if (param4 >= param6 + param5) {
                  break L1;
                } else {
                  if (param2 > param0) {
                    break L1;
                  } else {
                    if (param0 >= param2 - -param3) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Password is valid";
        field_i = new int[4];
        field_e = "Summoning Monsters";
        field_f = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_c = "Unpacking sound effects";
    }
}
