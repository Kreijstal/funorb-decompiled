/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static long field_a;
    static rh field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
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
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param2 <= -67) {
              var3 = bj.a(32, param1);
              if ((param0.indexOf(param1) ^ -1) == 0) {
                if (-1 == param0.indexOf(var3)) {
                  L2: {
                    if (!param0.startsWith(param1)) {
                      if (!param0.startsWith(var3)) {
                        if (!param0.endsWith(param1)) {
                          if (!param0.endsWith(var3)) {
                            stackIn_15_0 = 0;
                            break L2;
                          }
                        }
                      }
                    }
                    stackIn_15_0 = 1;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var3_ref);

          stackIn_18_1 = new StringBuilder().append("ak.A(");

          if (param0 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }


          stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

          if (param1 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -30635) {
            field_b = (rh) null;
        }
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            for (var2_int = 0; var2_int < param0.length(); var2_int++) {
              var3 = param0.charAt(var2_int);
              if (!em.a((char) var3, 97)) {
                if (!DualLinkNode.a(-58, (char) var3)) {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param1 < -33) {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              field_a = -33L;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var2);

          stackIn_15_1 = new StringBuilder().append("ak.B(");

          if (param0 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static od[] a(boolean param0) {
        if (param0) {
            ak.a(false);
        }
        return new od[]{mb.field_b, rl.field_W, td.field_I};
    }

    static {
    }
}
