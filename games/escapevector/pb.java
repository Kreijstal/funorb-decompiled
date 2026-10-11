/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static char[] field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_c;
    static wl field_e;

    final static int a(byte param0, dk[] param1) {
        int var4 = 0;
        int var2_int = 0;
        dk[] var3 = null;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = EscapeVector.field_A;
        try {
          if (param0 != 2) {
            stackIn_3_0 = 20;
            return stackIn_3_0;
          }
          var2_int = -2147483648;
          var3 = param1;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var6 = var5.field_i + var5.field_l;
            if (var2_int < var6) {
              var2_int = var6;
            }
          }
          if (var2_int == -2147483648) {
            stackIn_15_0 = 0;
            return stackIn_15_0;
          }
          stackIn_17_0 = var2_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("pb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0) {
          field_c = (int[]) null;
        }
    }

    final static void a(int param0) {
        ll.a(70, 8, param0 ^ 12, am.field_k);
        if (am.field_k >= 95) {
          if (am.field_k < 110) {
            mf.a(fg.field_b, (-dg.field_t.field_A + 640) / 2, -(am.field_k * 4) + 440, dg.field_t, -122);
            if (param0 != 4) {
              field_b = -65;
              return;
            }
            return;
          }
          dg.field_t.e((640 - dg.field_t.field_A) / 2, fg.field_b);
          if (param0 != 4) {
            field_b = -65;
            return;
          }
          return;
        }
        if (param0 == 4) {
          return;
        }
        field_b = -65;
    }

    static {
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_b = 0;
    }
}
