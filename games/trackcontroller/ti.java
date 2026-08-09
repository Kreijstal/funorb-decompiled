/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends fc {
    long[][] field_q;
    int[][] field_n;
    String[][] field_m;
    static String field_p;
    static String field_r;
    int field_i;
    boolean field_o;
    int field_l;
    int field_k;
    static int[] field_j;

    final static void a(int param0, int param1) {
        ba.field_f = 1000000000L / (long)param1;
        if (param0 > -103) {
            cf var3 = (cf) null;
            ti.a(-55, (byte) 107, (cf) null);
        }
    }

    public static void c(byte param0) {
        int var1 = -100 % ((-71 - param0) / 39);
        field_p = null;
        field_j = null;
        field_r = null;
    }

    final static void a(int param0, byte param1, cf param2) {
        try {
            if (param1 < 17) {
                ti.a(-51, -77);
            }
            kd.field_b.a((byte) -120, param2);
            md.a(param0, param2, 118);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ti.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ng a(String param0, kk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ng stackIn_2_0 = null;
        ng stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 17) {
              var4_int = param1.a(true, param2);
              var5 = param1.a(param0, var4_int, -1);
              stackIn_4_0 = pj.a(param1, var5, -127, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ng) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ti.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        String var2;
        if (param0 != -58) {
          var2 = (String) null;
          ti.a((String) null, (kk) null, (String) null, -73);
          qc.b(17, (byte) -42);
          return;
        } else {
          qc.b(17, (byte) -42);
          return;
        }
    }

    ti() {
    }

    static {
        field_r = "Confirm Password: ";
        field_p = "Type your age in years";
    }
}
