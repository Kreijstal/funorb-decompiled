/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mpa extends ContentTransitionDialog {
    static int[] field_W;
    static apa field_V;
    static boolean field_X;

    mpa(DialogStack param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String validateNameLengthAndSeparators(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = ClipStack.field_d;
            return stackIn_3_0;
          }
          if (param0 >= -66) {
            mpa.hasAnyMask1048832(true, -28, -59);
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = OpenGlTexture3D.normalizeDisplayName(1, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!PlayerModel.isNameSeparator(-85, var4.charAt(0)) &&
                !PlayerModel.isNameSeparator(-99, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; param2.length() > var6; var6++) {
                  var7 = param2.charAt(var6);
                  if (!PlayerModel.isNameSeparator(124, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_29_0 = GasVentModel.field_r;
                    return stackIn_29_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_34_0 = gta.field_e;
                return stackIn_34_0;
              }
              stackIn_20_0 = gta.field_e;
              return stackIn_20_0;
            }
            stackIn_15_0 = ClipStack.field_d;
            return stackIn_15_0;
          }
          stackIn_10_0 = ClipStack.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("mpa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static boolean hasAnyMask1048832(boolean param0, int param1, int param2) {
        if (!param0) {
          return (param2 & 1048832) != 0 ? true : false;
        }
        field_X = false;
        return (param2 & 1048832) != 0 ? true : false;
    }

    final void transitionToContent(int param0, UiWidget param1) {
        try {
          if (param0 <= 67) {
            field_W = (int[]) null;
          }
          super.transitionToContent(75, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mpa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_V = null;
        if (param0 != 0) {
          return;
        }
        field_W = null;
    }

    static {
        field_W = new int[]{0, 512, 0};
    }
}
