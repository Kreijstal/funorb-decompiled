/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends ne {
    static fd field_j;
    static String field_k;
    static String field_n;
    static String field_i;
    static rk field_l;
    static String field_o;
    static String[] field_m;

    public static void a(int param0) {
        if (param0 != 9) {
          pe.a(39);
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4) {
        cn dupTemp$4 = null;
        cn dupTemp$5 = null;
        cn[] var5;
        cn[] var6;
        var6 = new cn[9];
        var5 = var6;
        cn dupTemp$3 = bl.a(false, param0, param4);
        var6[6] = dupTemp$3;
        var5[3] = dupTemp$3;
        var5[2] = dupTemp$3;
        var5[1] = dupTemp$3;
        var5[0] = dupTemp$3;
        if (param2 > 3) {
          dupTemp$4 = bl.a(false, param3, param4);
          var6[8] = dupTemp$4;
          var5[7] = dupTemp$4;
          var5[5] = dupTemp$4;
          if (-1 != (param1 ^ -1)) {
            var6[4] = bl.a(false, param1, 64);
            return var5;
          } else {
            return var5;
          }
        } else {
          field_l = (rk) null;
          dupTemp$5 = bl.a(false, param3, param4);
          var6[8] = dupTemp$5;
          var5[7] = dupTemp$5;
          var5[5] = dupTemp$5;
          if (-1 == (param1 ^ -1)) {
            return var5;
          } else {
            var6[4] = bl.a(false, param1, 64);
            return var5;
          }
        }
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (il.a(true, param1)) {
              if (param0 == null) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = param0.length();
                if (-13 < (var3_int ^ -1)) {
                  var4 = -116 % ((param2 - 21) / 53);
                  if (!jc.a(param1, -101)) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (0 == var3_int) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("pe.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "A large, wolf-like creature with brown-black hair and horns.";
        field_j = new fd(3);
        field_n = "ACCEPT";
        field_i = "Select a raider to enchant with additional Defence";
    }
}
