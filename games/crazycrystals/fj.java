/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String[] field_b;
    static qa field_c;
    static String field_a;
    static boolean field_d;

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        af var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        af stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        af stackOut_8_0 = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1) {
              if (param2 != null) {
                if (param2.length > 136) {
                  var3 = new af();
                  ((qb) ((Object) var3)).a(param2, 98);
                  stackOut_8_0 = (af) (var3);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (param0) {
                    stackOut_13_0 = sm.a(-128, param2);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackOut_11_0 = (byte[]) (param2);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (Object) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 136) {
            field_d = false;
            return rd.field_h;
        }
        return rd.field_h;
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = -70 % ((param0 - 53) / 58);
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "to over <%0> great games";
        field_b = new String[]{"By rating", "By win percentage"};
    }
}
