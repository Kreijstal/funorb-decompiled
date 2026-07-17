/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au {
    static boolean field_b;
    static int field_c;
    static String field_a;

    final static ne a(int param0, int param1, int param2, int param3) {
        ne var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = (ne) (Object) rg.field_f.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            var4 = new ne();
            var4.field_o = param2;
            var4.field_i = 10;
            rg.field_f.a((bw) (Object) var4, true);
            kja.a(param0, (byte) 21, var4);
            if (param1 != 16757) {
              field_b = true;
              return var4;
            } else {
              return var4;
            }
          } else {
            if (param2 == var4.field_o) {
              return var4;
            } else {
              var4 = (ne) (Object) rg.field_f.c(0);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    final static void a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ha.field_k = bt.field_s;
          taa.field_l = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("au.A(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Welcome. Click the tooltips to continue.";
    }
}
