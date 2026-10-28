/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterRestoreSupport {
    static boolean field_a;
    static BitmapFont field_b;

    final static void popRasterState(byte guard) {
        RasterSnapshot var1 = (RasterSnapshot) (GradientOutlineTextPainter.field_q.removeLast(-8980));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.bind(var1.field_p, var1.field_q, var1.field_i);
        SoftwareRasterizer.setClip(var1.field_o, var1.field_n, var1.field_r, var1.field_h);
        var1.field_p = null;
        TextWidgetPainter.field_d.addLast(-12328, var1);
        int var2 = 108 % ((guard - 69) / 38);
    }

    final static void resetTooltipState(boolean disabled) {
        PasswordFieldPainter.field_u = disabled ? true : false;
        SavedDataQuery.field_j = 0;
        DraggableWidget.field_O = -1;
        on.field_b = null;
        AchievementDefinition.field_g = -1;
    }

    final static boolean openWindowsUrl(byte guard, String url) {
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          try {
            if (!SystemTaskService.field_e.startsWith("win")) {
              return false;
            }
            if (!url.startsWith("http://") &&
              !url.startsWith("https://")) {
              return false;
            }
            String var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (guard <= 26) {
              return true;
            }
            for (int var3 = 0; var3 < url.length(); var3++) {
              if (var2.indexOf((int) url.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_26_0 = var2_ref2;
          StringBuilder stackIn_26_1 = new StringBuilder().append("dl.C(").append(guard).append(',');
          if (url == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_b = null;
        if (guard != -96) {
          field_b = (BitmapFont) null;
        }
    }

    static {
        field_a = true;
    }
}
