/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static gj field_c;
    static boolean field_a;
    static boolean[][] field_b;

    final static int a(int param0, aba param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8448) {
                break L1;
              } else {
                field_b = (boolean[][]) null;
                break L1;
              }
            }
            if (param1 != et.field_c) {
              if (param1 != asa.field_a) {
                if (param1 != df.field_o) {
                  if (param1 != je.field_c) {
                    if (feb.field_a != param1) {
                      throw new IllegalArgumentException();
                    } else {
                      stackIn_16_0 = 34023;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 260;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 34165;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = 8448;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = 7681;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("tc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = new be();
        var3.field_a = param1;
        var3.field_b = 31 + param2;
        rkb.a(0, var3, dpa.field_p, param0);
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = (boolean[][]) null;
        if (param0 != 40) {
            field_c = (gj) null;
        }
    }

    static {
        field_b = new boolean[][]{new boolean[]{false, true, true}};
    }
}
