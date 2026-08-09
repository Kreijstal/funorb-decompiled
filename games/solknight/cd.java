/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static String field_a;
    static String field_c;
    static int[] field_b;

    final static ol a(da param0, int param1, int param2, boolean param3, da param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ol stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (l.a(71, param1, param2, param0)) {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  cd.a(75);
                  break L1;
                }
              }
              stackIn_6_0 = ua.a(true, param4.b(param2, 12257, param1));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("cd.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ol) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 8192) {
            da var2 = (da) null;
            cd.a((da) null, 73, -128, false, (da) null);
        }
    }

    static {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = new int[8192];
    }
}
