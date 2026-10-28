/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_a;
    static BitmapFont field_b;

    final static void a(byte param0) {
        RasterSnapshot var1 = (RasterSnapshot) (GradientOutlineTextPainter.field_q.removeLast(-8980));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.a(var1.field_p, var1.field_q, var1.field_i);
        SoftwareRasterizer.setClip(var1.field_o, var1.field_n, var1.field_r, var1.field_h);
        var1.field_p = null;
        TextWidgetPainter.field_d.addLast(-12328, var1);
        int var2 = 108 % ((param0 - 69) / 38);
    }

    final static void a(boolean param0) {
        un.field_u = param0 ? true : false;
        ei.field_j = 0;
        DraggableWidget.field_O = -1;
        on.field_b = null;
        ci.field_g = -1;
    }

    final static boolean a(byte param0, String param1) {
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          try {
            if (!SystemTaskService.field_e.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            String var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param0 <= 26) {
              return true;
            }
            for (int var3 = 0; var3 < param1.length(); var3++) {
              if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
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
          StringBuilder stackIn_26_1 = new StringBuilder().append("dl.C(").append(param0).append(',');
          if (param1 == null) {
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
