/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static llb field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0, byte param1, int param2) {
        faa var3;
        asb var4;
        if (param1 >= -82) {
          var4 = (asb) null;
          pa.a(-92, -5, (asb) null, 15);
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        } else {
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + sh.a("\n", "%0a", param0, 0));
        if (param1 != 3) {
            pa.a(111);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
            field_a = (llb) null;
        }
    }

    final static boolean a(int param0, int param1, asb param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
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
              if (param1 == 2) {
                break L1;
              } else {
                pa.a(36);
                break L1;
              }
            }
            var5 = param2.a(param0, param3, (byte) 13);
            var4 = var5;
            if (var5 != null) {
              wab.a(0, var5);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
        lob discarded$0 = new lob();
        field_c = "Hull piece";
    }
}
