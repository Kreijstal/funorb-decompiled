/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static cj field_a;
    static boolean field_b;

    final static void a(boolean param0) {
        CharSequence var3 = null;
        ta.field_lb = s.field_e.f((byte) -107);
        if (!param0) {
          var3 = (CharSequence) ((Object) ta.field_lb);
          kf.field_k = tg.a(var3, param0);
          return;
        }
        field_a = (cj) null;
        CharSequence var2 = (CharSequence) ((Object) ta.field_lb);
        kf.field_k = tg.a(var2, param0);
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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != 255) {
            re.a(80);
          }
          var3 = new byte[var2_int];
          d.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("re.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = 255;
          if (param2 < 47) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          var3_int = var3_int | (var4 & param0[param1 * 4]) << 24;
          var3_int = var3_int | (var4 & param0[1 + 4 * param1]) << 16;
          var3_int = var3_int | (var4 & param0[4 * param1 + 2]) << 8;
          var3_int = var3_int | var4 & param0[3 + 4 * param1];
          stackIn_4_0 = var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("re.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 102 % ((param0 + 29) / 54);
        field_a = null;
    }

    static {
        field_b = true;
    }
}
