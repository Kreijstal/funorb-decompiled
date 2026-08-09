/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static rk field_e;
    boolean field_g;
    static String field_f;
    String field_h;
    static String field_c;
    String field_d;
    static String field_i;
    static ci field_b;
    static String field_j;
    static ci field_a;

    final static km[] a(um param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        km[] stackIn_2_0 = null;
        km[] stackIn_4_0 = null;
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
            var4_int = param0.a(param3, 0);
            if (param2 == 2993) {
              var5 = param0.a(param1, 7, var4_int);
              stackIn_4_0 = qj.a(var5, var4_int, (byte) 108, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (km[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ao.B(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 - -param0 <= wb.field_h) {
            return param2;
        }
        if (!param1) {
            ao.a(5);
            if (!(param2 - (-param3 - -param0) < 0)) {
                return param2 - (-param3 + param0);
            }
            return wb.field_h + -param0;
        }
        if (!(param2 - (-param3 - -param0) < 0)) {
            return param2 - (-param3 + param0);
        }
        return wb.field_h + -param0;
    }

    final static void b(int param0) {
        L0: {
          b.a(true);
          if (ja.field_h != null) {
            kl.a(ja.field_h, (byte) -114);
            break L0;
          } else {
            break L0;
          }
        }
        rl.a(76);
        if (param0 == -25220) {
          uc.a((byte) -72);
          jd.a((byte) -91);
          if (m.a(param0 ^ 25329)) {
            qn.field_U.f(1, param0 ^ 25285);
            vh.a(0, (byte) -58);
            si.d(65280);
            return;
          } else {
            si.d(65280);
            return;
          }
        } else {
          field_i = (String) null;
          uc.a((byte) -72);
          jd.a((byte) -91);
          if (!m.a(param0 ^ 25329)) {
            si.d(65280);
            return;
          } else {
            qn.field_U.f(1, param0 ^ 25285);
            vh.a(0, (byte) -58);
            si.d(65280);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_j = null;
        field_i = null;
        field_b = null;
        if (param0 != 1) {
          return;
        } else {
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        field_i = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_f = "Password is valid";
        field_j = "Player";
        field_c = "Sound: ";
    }
}
