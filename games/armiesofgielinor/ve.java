/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static int[][] field_a;
    static boolean field_b;

    final static String a(byte param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_3_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 13) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2_int = param1.length();
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          var4 = 2;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param1.charAt(var5);
            if (var4 == 0) {
              var6 = Character.toLowerCase((char) var6);
            } else {
              if (var4 == 2) {
                var6 = hc.a(98, (char) var6);
              } else {
                if (Character.isUpperCase((char) var6)) {
                  var6 = hc.a(98, (char) var6);
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (!Character.isLetter((char) var6)) {
              if (var6 != 46 &&
                var6 != 63 &&
                33 != var6) {
                if (!Character.isSpaceChar((char) var6)) {
                  var4 = 1;
                } else {
                  if ((var4 != 2)) {
                    var4 = 1;
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var4 = 2;
              }
            } else {
              var4 = 0;
            }
            var3[var5] = (char)var6;
          }
          stackIn_26_0 = new String(var9);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("ve.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 1) {
          field_a = (int[][]) null;
        }
    }

    static {
        field_a = new int[][]{new int[]{0, 0, 0, 0, 2, 4, 32768, 512, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 8, 16, 16512, 128, 32, 16400, 16416, 32768, 1, 1, 2, 2, 2, 2, 4, 4, 16392, 8, 256, 256, 16392, 16, 128, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 8, 16, 16512, 128, 32, 16400, 16416, 32768, 1, 1, 2, 2, 2, 2, 4, 4, 16392, 8, 256, 256, 16392, 16, 128, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 1, 2, 4, 504, 16384, 16384, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{64, 8, 64, 8, 8, 64, 16, 16, 16, 16, 16, 16, 16, 128, 8, 2048, 32, 504, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 1, 1, 256, 128, 8, 1, 64, 64, 32, 32, 8192, 8192, 2048, 8, 1024, 1024, 1024, 1024, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 2048, 2048, 64, 8, 512, 512, 512, 512, 512, 512, 512, 512, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    }
}
