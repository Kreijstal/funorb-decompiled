/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static cj field_a;
    static boolean field_b;

    final static void a(boolean param0) {
        CharSequence var2;
        CharSequence var3;
        ta.field_lb = s.field_e.f((byte) -107);
        if (param0) {
          field_a = (cj) null;
          var2 = (CharSequence) ((Object) ta.field_lb);
          kf.field_k = tg.a(var2, param0);
          return;
        } else {
          var3 = (CharSequence) ((Object) ta.field_lb);
          kf.field_k = tg.a(var3, param0);
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 > -110) {
            byte[] var2 = (byte[]) null;
            re.a((byte[]) null, 41, (byte) -96);
            return true;
        }
        return true;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              if (param0 == 255) {
                break L1;
              } else {
                re.a(80);
                break L1;
              }
            }
            var3 = new byte[var2_int];
            d.a(param1, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("re.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte[] param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 0;
            var4 = 255;
            if (param2 >= 47) {
              var3_int = var3_int | (var4 & param0[param1 * 4]) << -2128226600;
              var3_int = var3_int | (var4 & param0[1 + 4 * param1]) << 550961680;
              var3_int = var3_int | (var4 & param0[4 * param1 + 2]) << -337687576;
              var3_int = var3_int | var4 & param0[3 + 4 * param1];
              stackIn_4_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 63;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("re.C(");

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        int var1 = 102 % ((param0 - -29) / 54);
        field_a = null;
    }

    static {
        field_b = true;
    }
}
