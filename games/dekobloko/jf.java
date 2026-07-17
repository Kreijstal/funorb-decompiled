/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_f;
    static lf field_g;
    static int field_c;
    static String field_b;
    static String field_a;
    static long field_d;
    static w field_e;

    final static void a(java.awt.Canvas param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (ca.field_vb >= 10) {
            int discarded$13 = 480;
            if (!dl.a()) {
              hk.b();
              int discarded$14 = 19759;
              int discarded$15 = 320;
              int discarded$16 = 240;
              qc.a();
              mf.a(1, 0, 0, param0);
              return;
            } else {
              if (hc.field_d != 0) {
                cn.a(true, param0);
                return;
              } else {
                uc.a(false, param1, 78);
                mf.a(1, 0, 0, param0);
                return;
              }
            }
          } else {
            L0: {
              var3_int = 0;
              if (cd.field_g) {
                var3_int = 1;
                cd.field_g = false;
                break L0;
              } else {
                break L0;
              }
            }
            int discarded$17 = 1;
            bf.a(cn.b(), var3_int != 0, 6, cf.a(-11777), fb.field_g);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("jf.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + -6351 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_f = null;
        int var1 = 0;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Your game";
        field_a = "Invite more players, or alternatively try changing the following settings:  ";
        field_b = "<%0> might change the options - wait and see.";
        field_c = 0;
        field_g = new lf();
    }
}
