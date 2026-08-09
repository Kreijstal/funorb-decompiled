/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static ed field_a;
    static hh field_b;
    static String field_e;
    static String field_f;
    static int[] field_c;

    final static ed[] a(int param0, int param1, mf param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ed[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 8192) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            if (uc.a(param2, param3 ^ -8272, param0, param1)) {
              stackIn_6_0 = g.e(15556);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ed[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static boolean b(int param0) {
        if (param0 != 8192) {
            field_d = (String) null;
            return eb.field_H;
        }
        return eb.field_H;
    }

    public static void a(int param0) {
        mf var2;
        field_b = null;
        field_d = null;
        field_f = null;
        if (param0 != 8192) {
          var2 = (mf) null;
          gm.a(13, 47, (mf) null, 3);
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_d = "Loading sound effects";
        field_c = new int[8192];
    }
}
