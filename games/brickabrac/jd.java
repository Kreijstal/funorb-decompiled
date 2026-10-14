/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static UiComponent field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          CharSequence var2 = (CharSequence) null;
          jd.a((byte) -52, true, (CharSequence) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static byte[] computeWhirlpoolDigest(byte[] input, int offset, int obfuscationGuard, int length) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        WhirlpoolHasher var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -14970) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          if (0 < offset) {
            var8 = new byte[length];
            var4 = var8;
            for (var5_int = 0; length > var5_int; var5_int++) {
              var8[var5_int] = input[offset + var5_int];
            }
          } else {
            var4 = input;
          }
          var5 = new WhirlpoolHasher();
          var5.reset((byte) 99);
          var5.updateBits(var4, 540, (long)(length * 8));
          var6 = new byte[64];
          var5.finishDigest(var6, obfuscationGuard ^ -14860, 0);
          stackIn_10_0 = var6;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("jd.C(");
          if (input == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(offset).append(',').append(obfuscationGuard).append(',').append(length).append(')').toString());
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!CheckboxWidgetRenderer.hasValidPlayerNameShape(param2, 0, param1)) {
            return false;
          }
          for (var3_int = 0; param2.length() > var3_int; var3_int++) {
            if (!UiComponent.a(true, param2.charAt(var3_int))) {
              return false;
            }
          }
          if (param0 >= 111) {
            return true;
          }
          field_b = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("jd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
    }
}
