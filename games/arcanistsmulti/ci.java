/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_b;
    static gd field_c;
    static kc field_a;
    static qb field_e;
    static pb field_d;

    final static void a(byte param0) {
        io.field_n = oo.d(-9685);
        p.field_b = new h();
        if (param0 <= 49) {
          field_b = (String) null;
          sc.a(true, false, true);
          return;
        } else {
          sc.a(true, false, true);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static bd a(boolean param0, String param1, int param2, long param3, String param4) {
        RuntimeException var6 = null;
        ld stackIn_6_0 = null;
        an stackIn_8_0 = null;
        im stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1L != (param3 ^ -1L)) {
                break L1;
              } else {
                if (param1 != null) {
                  stackIn_8_0 = new an(param1, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              stackIn_6_0 = new ld(param3, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 < -49) {
                  break L2;
                } else {
                  field_e = (qb) null;
                  break L2;
                }
              }
              stackIn_12_0 = new im(param3, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ci.A(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bd) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd) ((Object) stackIn_8_0);
          } else {
            return (bd) ((Object) stackIn_12_0);
          }
        }
    }

    static {
        field_b = "Classic";
    }
}
