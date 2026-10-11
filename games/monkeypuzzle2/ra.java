/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends pc {
    static int[] field_ab;
    static le[] field_Z;

    final void c(byte param0, we param1) {
        try {
          if (param0 <= 25) {
            ra.f((byte) -87);
          }
          super.c((byte) 43, param1);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ra.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 71 % ((-67 - param1) / 44);
          stackIn_1_0 = pd.a(65, param0, 10, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ra.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 != -96) {
          return;
        }
        field_ab = null;
        field_Z = null;
    }

    ra(kj param0, we param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = m.a(1, param1.charAt(var4)) + (-var3 + (var3 << 5));
          }
          var4Lifetime1 = -36 % ((param0 - 50) / 47);
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ra.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
