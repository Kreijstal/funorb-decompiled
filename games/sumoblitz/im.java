/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static ha field_c;
    static hr field_a;
    static jn field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static an a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        an stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -23) {
                break L1;
              } else {
                field_c = (ha) null;
                break L1;
              }
            }
            if (ad.field_p != vm.field_c) {
              L2: {
                if (st.field_z != vm.field_c) {
                  break L2;
                } else {
                  if (!param1.equals(tl.field_s)) {
                    break L2;
                  } else {
                    vm.field_c = hm.field_a;
                    stackIn_8_0 = jh.field_z;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              jh.field_z = null;
              vm.field_c = ad.field_p;
              tl.field_s = param1;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("im.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (an) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (an) ((Object) stackIn_10_0);
          }
        }
    }

    static {
        field_c = null;
    }
}
