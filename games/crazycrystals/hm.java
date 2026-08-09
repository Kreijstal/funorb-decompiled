/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_c;
    static String field_a;
    int field_b;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void b(int param0) {
        if (param0 != -2) {
            hm.a(102);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        ng var2;
        pi.field_j = rl.c(-9918);
        if (param0 != -3121) {
          var2 = (ng) null;
          hm.a((ng) null, -93);
          qe.field_g = new ol();
          vk.a(param0 ^ 3095, true, true);
          return;
        } else {
          qe.field_g = new ol();
          vk.a(param0 ^ 3095, true, true);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        ng var4;
        if (param1 < 23) {
          var4 = (ng) null;
          hm.a((ng) null, 46);
          var3 = param2 >>> -935292001;
          return -var3 + (param2 - -var3) / param0;
        } else {
          var3 = param2 >>> -935292001;
          return -var3 + (param2 - -var3) / param0;
        }
    }

    final static boolean a(ng param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.h(255);
              if (param1 != (var2_int ^ -1)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackIn_4_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("hm.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        field_a = "Click on the spider to find out about it. Many hints are hidden this way.";
    }
}
