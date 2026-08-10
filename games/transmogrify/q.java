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
            q.a(125, (byte) -14, -93, -34, -5, -28, 57);
        }
        field_h = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 2) {
                break L1;
              } else {
                q.a(-2);
                break L1;
              }
            }
            if (vg.a(param1, param0, (byte) 26)) {
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= param0.length()) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (bc.a(param0.charAt(var3_int), -161)) {
                    var3_int++;
                    continue L2;
                  } else {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("q.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
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
                      stackIn_8_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = 0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    static {
        field_g = "Password is valid";
        field_i = new int[4];
        field_e = "Summoning Monsters";
        field_f = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_c = "Unpacking sound effects";
    }
}
