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
        int discarded$0 = 0;
        if (param0 != 24178) {
            discarded$0 = jg.c(61);
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
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (!(param1 instanceof byte[])) {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    jg.a(-40);
                    break L1;
                  }
                }
                if (param1 instanceof hd) {
                  var4 = (hd) (param1);
                  stackOut_13_0 = var4.b(256);
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) (param1);
                if (!param2) {
                  stackOut_7_0 = (byte[]) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_5_0 = rl.a(1, var3);
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("jg.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_14_0;
            }
          }
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
        field_a = "Loading...";
        field_e = 0;
        field_c = "<%0>Anti-Gravity:<%1> when a flea touches one of these, the gravity is reversed and all the fleas fly upwards. Everything now works upside down, including balloons and springs. Touching it again turns the gravity back to normal.";
        field_b = new int[8192];
    }
}
