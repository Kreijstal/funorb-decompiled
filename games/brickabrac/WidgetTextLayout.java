/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class WidgetTextLayout {
    static int[] viewVertexY;
    static int repeatMessageId;
    TextLineLayout[] lines;
    static volatile int livePointerY;
    static String field_e;
    static int resultCounterTwo;
    static RgbSprite halfPaddleCenterSprite;
    static RgbSprite jungleCharacterSprite;
    static float field_a;
    static String field_d;
    static RgbSprite field_b;

    final int findLineIndex(int sourceOffset, boolean obfuscationGuard) {
        int lineIndex = 0;
        TextLineLayout line = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (!obfuscationGuard) {
          WidgetTextLayout.a(false);
        }
        for (lineIndex = 0; this.lines.length > lineIndex; lineIndex++) {
          line = this.lines[lineIndex];
          if (!(line.caretX.length <= sourceOffset)) {
            return lineIndex;
          }
          sourceOffset = sourceOffset - (line.caretX.length - 1);
        }
        return this.lines.length;
    }

    final int getHeight(int obfuscationGuard) {
        int stackIn_6_0 = 0;
        if (obfuscationGuard != 0) {
          this.findSourceOffset(-90, true, 49);
        }
        if (null != this.lines &&
          this.lines.length > 0) {
          stackIn_6_0 = -this.lines[0].top + this.lines[this.lines.length - 1].bottom;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int getCaretX(int sourceOffset, byte obfuscationGuard) {
        int lineIndex = 0;
        TextLineLayout line = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard >= -33) {
          return -38;
        }
        TextLineLayout[] lineArray = this.lines;
        TextLineLayout[] traversalLines = lineArray;
        for (lineIndex = 0; lineIndex < lineArray.length; lineIndex++) {
          line = lineArray[lineIndex];
          if (line.caretX.length > sourceOffset) {
            return line.caretX[sourceOffset];
          }
          sourceOffset = sourceOffset - (line.caretX.length - 1);
        }
        return 0;
    }

    final int findSourceOffset(int x, boolean obfuscationGuard, int y) {
        int lineIndex = 0;
        int priorSourceLength;
        TextLineLayout line;
        int caretIndex;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (this.lines != null &&
          0 != this.lines.length &&
          this.lines[0].top <= y) {
          if (this.lines[-1 + this.lines.length].bottom < y) {
            return -1;
          }
          if (this.lines.length == 1) {
            return this.lines[0].findCaretIndex((byte) -95, x);
          }
          if (obfuscationGuard) {
            field_d = (String) null;
          }
          priorSourceLength = 0;
          for (lineIndex = 0; lineIndex < this.lines.length; lineIndex++) {
            line = this.lines[lineIndex];
            if (y >= line.top &&
              line.bottom >= y) {
              caretIndex = line.findCaretIndex((byte) -95, x);
              if (caretIndex == -1) {
                return -1;
              }
              return caretIndex + priorSourceLength;
            }
            priorSourceLength = priorSourceLength + (-1 + line.caretX.length);
          }
          return -1;
        }
        return -1;
    }

    public static void a(boolean param0) {
        viewVertexY = null;
        if (!param0) {
          field_b = (RgbSprite) null;
        }
        field_b = null;
        field_e = null;
        jungleCharacterSprite = null;
        halfPaddleCenterSprite = null;
        field_d = null;
    }

    final int getRightEdge(int obfuscationGuard) {
        int lineIndex = 0;
        int rightEdge;
        TextLineLayout[] lineArray;
        TextLineLayout line;
        int unusedGameFlag;
        int lineRightEdge;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 31458) {
          return 12;
        }
        rightEdge = -1;
        if (null != this.lines) {
          lineArray = this.lines;
          for (lineIndex = 0; lineIndex < lineArray.length; lineIndex++) {
            line = lineArray[lineIndex];
            if (line != null) {
              lineRightEdge = line.getRightEdge((byte) 56);
              if (lineRightEdge > rightEdge) {
                rightEdge = lineRightEdge;
              }
            }
          }
        }
        return rightEdge;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = BytePayloadRequest.replaceCharacter(-1, param2, '_', "");
          if (param1 != 73) {
            WidgetTextLayout.a(true);
          }
          var3 = ScreenshotViewer.reverseUtf16CodeUnits(10, param2);
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ep.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, String param2, boolean param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param2.charAt(var8);
            if (60 == var9) {
              var6 = 1;
            } else {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            }
          }
          if (!param3) {
            repeatMessageId = 66;
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (param0 - param1 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ep.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        viewVertexY = new int[8192];
        livePointerY = -1;
        field_d = "Logging in...";
    }
}
