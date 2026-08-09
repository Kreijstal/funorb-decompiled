/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_a;
    static int[] field_e;
    static boolean field_c;
    static int field_b;
    static int field_d;

    final static boolean a(int param0, boolean param1, int param2, String param3, String param4, String param5, mj param6) {
        RuntimeException var7 = null;
        jg var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ok.field_a == o.field_l) {
              L1: {
                var8 = new jg(na.field_d, param6);
                na.field_d.a((byte) 84, (rj) (var8));
                if (param2 == 5) {
                  break L1;
                } else {
                  field_d = -43;
                  break L1;
                }
              }
              if (!ah.d(-12171)) {
                L2: {
                  sb.field_a = param3;
                  o.field_l = dj.field_a;
                  u.field_k = param0;
                  lc.field_p = param5;
                  hi.field_d = null;
                  if (!param1) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
                qe.field_o = stackIn_10_0 != 0;
                kc.field_c = param4;
                return true;
              } else {
                var8.p(87);
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(byte param0) {
        mj var2;
        if (param0 <= 75) {
          var2 = (mj) null;
          wd.a(70, true, -68, (String) null, (String) null, (String) null, (mj) null);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        field_e = new int[]{0, 5, 1, 2, 3, 0};
        field_c = true;
    }
}
