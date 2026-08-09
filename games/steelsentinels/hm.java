/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_b;
    static gh field_a;
    static String field_e;
    static int[] field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 40) {
            nk var2 = (nk) null;
            hm.a((byte) 75, (int[]) null, (nk) null);
        }
    }

    final static int a(byte param0, int[] param1, nk param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 > 116) {
              var3_int = param2.e((byte) -120);
              var4 = param2.i(-121);
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  stackIn_15_0 = var3_int;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-35 != (param1[var5] ^ -1)) {
                    if ((param1[var5] ^ -1) <= -1) {
                      if (param1[var5] < dn.field_Sb.length) {
                        var3_int = var3_int + dn.field_Sb[param1[var5]];
                        var5++;
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    stackIn_8_0 = 6100;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 49;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("hm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    static {
        field_b = "Rockets and missiles reload faster.";
        field_d = "Set up new game";
        field_e = "SHIFT";
        field_c = new int[8192];
        field_a = null;
    }
}
