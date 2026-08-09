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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (param2 != null) {
                if (param2.length > 136) {
                  var3 = new af();
                  ((qb) ((Object) var3)).a(param2, 98);
                  stackIn_9_0 = (af) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (param0) {
                    stackIn_14_0 = sm.a(-128, param2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_12_0 = (byte[]) (param2);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (Object) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
