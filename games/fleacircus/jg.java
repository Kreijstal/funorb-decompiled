/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jg {
    static int[] field_b;
    static String field_a;
    static int field_e;
    static boolean field_d;
    static dd field_f;
    static String field_c;

    abstract int b(int param0);

    final static int c(int param0) {
        if (param0 != 24178) {
            int discarded$0 = jg.c(61);
            return em.field_d;
        }
        return em.field_d;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        hd var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          if (param1 != null) {
            if (!(param1 instanceof byte[])) {
              jg.a(-40);
              if (param1 instanceof hd) {
                var4 = (hd) param1;
                stackOut_11_0 = var4.b(256);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param1;
              if (!param2) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = rl.a(1, var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("jg.E(").append(0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L0;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L0;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -9) {
          jg.a(-122);
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading...";
        field_e = 0;
        field_c = "<%0>Anti-Gravity:<%1> when a flea touches one of these, the gravity is reversed and all the fleas fly upwards. Everything now works upside down, including balloons and springs. Touching it again turns the gravity back to normal.";
        field_b = new int[8192];
    }
}
