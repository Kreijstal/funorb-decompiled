/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String field_e;
    static al[][] field_b;
    static pt field_a;
    static ep field_f;
    static String field_c;
    static int field_d;

    public static void a() {
        int var1 = 0;
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static void a(int param0) {
        lr var1 = null;
        byte[] var3 = null;
        ah var1_ref = null;
        byte[] var4 = null;
        if (wl.field_r == null) {
            var1 = new lr();
            var3 = var1.a(128, 128, (byte) -120, 16);
            wl.field_r = sf.a(false, -137, var3);
        }
        if (null == lg.field_l) {
            var1_ref = new ah();
            var4 = var1_ref.a(128, 16, 128, (byte) 118);
            lg.field_l = sf.a(false, -137, var4);
        }
    }

    final static boolean a(String param0) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = cf.field_h.equals((Object) (Object) vu.a(127, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fd.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -6 + 41);
        }
        return stackIn_1_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param2 <= 1) {
                if (param2 != 1) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = var3_int * param1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                L2: {
                  if ((param2 & 1) != 0) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 * param1;
                param2 = param2 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "fd.B(" + 1 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please check if address is correct";
        field_a = new pt();
        field_c = "Score";
    }
}
