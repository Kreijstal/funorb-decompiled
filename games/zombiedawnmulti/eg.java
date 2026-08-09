/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends kk {
    private Object field_A;
    static cd field_B;
    static byte[] field_E;
    static String field_z;
    static ja field_D;
    static int field_C;

    final boolean f(int param0) {
        if (param0 != 1000) {
            return false;
        }
        return false;
    }

    final static ic a(int param0, long param1, String param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        wn stackIn_6_0 = null;
        mn stackIn_8_0 = null;
        pp stackIn_12_0 = null;
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
              if (0L != param1) {
                break L1;
              } else {
                if (param2 != null) {
                  stackIn_8_0 = new mn(param2, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param3) {
              stackIn_6_0 = new wn(param1, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == 64) {
                  break L2;
                } else {
                  field_B = (cd) null;
                  break L2;
                }
              }
              stackIn_12_0 = new pp(param1, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("eg.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ic) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ic) ((Object) stackIn_8_0);
          } else {
            return (ic) ((Object) stackIn_12_0);
          }
        }
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_D = null;
        if (param0 != 5) {
            return;
        }
        field_B = null;
    }

    eg(Object param0, int param1) {
        super(param1);
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object e(int param0) {
        if (param0 > -32) {
            this.f(-36);
            return this.field_A;
        }
        return this.field_A;
    }

    static {
        field_E = new byte[]{(byte)5};
        field_z = "Email address is unavailable";
        field_C = 64;
    }
}
