/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextCaretLayout {
    static LegacyBitmapFont field_b;
    static AccountConnectionPhase accountPhase;
    static ToolkitSprite field_a;

    final static void pushClip(int bottom, int top, int guard, int left, int right) {
        GameApplet.pushRasterState(125);
        SoftwareRasterizer.intersectClip(left, top, right, bottom);
        if (guard != 1) {
          field_b = (LegacyBitmapFont) null;
        }
    }

    final static void computeCaretPositions(byte guard, TextLayoutLine line, int extraSpaceQ8, LegacyBitmapFont font, String text) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 90) {
            field_b = (LegacyBitmapFont) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; text.length() > var7; var7++) {
            var8 = text.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + line.caretX[0] + font.stringWidth(text.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + extraSpaceQ8;
              }
              line.caretX[var7] = line.caretX[0] + ((var5_int >> 8) + (font.stringWidth(text.substring(0, 1 + var7)) - font.charWidth((char) var8)));
            } else {
              line.caretX[var7] = var6;
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kw.A(").append(guard).append(',');
          if (line == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(extraSpaceQ8).append(',');
          if (font == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (text == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        accountPhase = null;
        if (param0 >= -86) {
          field_b = (LegacyBitmapFont) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void computeCaretPositions(int guard, TextLayoutLine line, int extraSpaceQ8, LegacyBitmapFont font, String text) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 90) {
            field_b = (LegacyBitmapFont) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; text.length() > var7; var7++) {
            var8 = text.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + line.caretX[0] + font.stringWidth(text.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + extraSpaceQ8;
              }
              line.caretX[var7] = line.caretX[0] + ((var5_int >> 8) + (font.stringWidth(text.substring(0, 1 + var7)) - font.charWidth((char) var8)));
            } else {
              line.caretX[var7] = var6;
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kw.A(").append(guard).append(',');
          if (line == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(extraSpaceQ8).append(',');
          if (font == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (text == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }
}
