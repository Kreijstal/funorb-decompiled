/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_c;
    static String field_d;
    static String field_a;
    static String[][] field_b;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (-1 >= (param1 ^ -1)) {
          if ((param1 ^ -1) >= -12) {
            if (param2 >= (param0 ^ -1)) {
              if (bo.a((byte) -57, param3, param1) < param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, og param2) {
        pc var5 = null;
        int var4 = 0;
        try {
            if (param1 != -18989) {
                field_c = (String) null;
            }
            var5 = aa.field_f;
            pc var3 = var5;
            var5.g(param0, 15514);
            var5.field_m = var5.field_m + 1;
            var4 = var5.field_m;
            var5.e(160, 1);
            if (param2.field_k != null) {
                var5.e(160, param2.field_k.length);
                var5.a(param2.field_k.length, 0, param1 + 15496, param2.field_k);
            } else {
                var5.e(160, 0);
            }
            var5.b(var4, (byte) 48);
            var5.field_m = var5.field_m - 4;
            param2.field_m = var5.k(param1 + 18989);
            var5.f(var5.field_m + -var4, param1 + 18988);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dq.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = (String[][]) null;
        field_c = null;
        field_a = null;
        field_d = null;
        int var1 = -55 % ((param0 - -67) / 53);
    }

    final static hh a(byte param0, String param1, String param2, fm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hh stackIn_2_0 = null;
        hh stackIn_4_0 = null;
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
            if (param0 == 31) {
              var4_int = param3.a(117, param2);
              var5 = param3.a((byte) -125, param1, var4_int);
              stackIn_4_0 = lh.a(var4_int, param3, var5, 119);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("dq.B(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_c = "Offer rematch";
        field_d = "Scamming";
        field_a = "The requirements for this Achievement are hidden.";
    }
}
