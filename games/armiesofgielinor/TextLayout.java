/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static RgbSprite[][] field_a;
    TextLineLayout[] lines;
    static int[] field_c;

    final int getHeight(byte obfuscationGuard) {
        int guardQuotient;
        int height = 0;
        guardQuotient = -76 / ((obfuscationGuard - 74) / 32);
        if (this.lines != null &&
          0 < this.lines.length) {
          height = this.lines[-1 + this.lines.length].bottom - this.lines[0].top;
        } else {
          height = 0;
        }
        return height;
    }

    final int hitTestCharacter(int x, int y, int lastLineOffset) {
        int lineIndex = 0;
        TextLineLayout line = null;
        int localIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.lines == null ||
          0 == this.lines.length ||
          this.lines[0].top > y) {
          return -1;
        }
        if (y > this.lines[this.lines.length + lastLineOffset].bottom) {
          return -1;
        }
        if (this.lines.length == 1) {
          return this.lines[0].nearestCaret(x, (byte) 29);
        }
        int characterOffset = 0;
        for (lineIndex = 0; this.lines.length > lineIndex; lineIndex++) {
          line = this.lines[lineIndex];
          if (y >= line.top &&
            y <= line.bottom) {
            localIndex = line.nearestCaret(x, (byte) 29);
            if (localIndex == -1) {
              return -1;
            }
            return characterOffset + localIndex;
          }
          characterOffset = characterOffset + (-1 + line.caretXs.length);
        }
        return -1;
    }

    final static int a(CipherPacketBuffer param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        CipherPacketBuffer var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -121) {
            var7 = (CipherPacketBuffer) null;
            TextLayout.a((CipherPacketBuffer) null, 120, 29, -83, (byte) -93, 59);
          }
          var6_int = param0.readBits(-106, 1);
          if (0 != var6_int) {
            if (1 != var6_int) {
              throw new IllegalStateException();
            }
            stackIn_10_0 = param0.readBits(95, param3) + param1;
            return stackIn_10_0;
          }
          if (param5 > 0) {
            stackIn_6_0 = param0.readBits(-109, param5);
          } else {
            stackIn_6_0 = 0;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ju.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int parseRadixInt(int obfuscationGuard, int radix, CharSequence text) {
        RuntimeException failure = null;
        int result = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 0) {
            TextLayout.a(-112);
          }
          result = GridWidgetContainer.parseRadixInt(radix, true, text, 0);
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ju.C(").append(obfuscationGuard).append(',').append(radix).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(')').toString());
        }
    }

    final int getRightExtent(boolean obfuscationGuard) {
        int lineIndex = 0;
        int rightExtent;
        TextLineLayout[] linesAlias;
        TextLineLayout line;
        int obfuscationControl;
        int rightEdge;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        rightExtent = -1;
        if (this.lines != null) {
          linesAlias = this.lines;
          for (lineIndex = 0; linesAlias.length > lineIndex; lineIndex++) {
            line = linesAlias[lineIndex];
            if (line != null) {
              rightEdge = line.getRightEdge(0);
              if (rightExtent < rightEdge) {
                rightExtent = rightEdge;
              }
            }
          }
        }
        if (obfuscationGuard) {
          field_a = (RgbSprite[][]) null;
        }
        return rightExtent;
    }

    final int getCaretX(byte obfuscationGuard, int characterIndex) {
        int lineIndex = 0;
        TextLineLayout[] linesAlias;
        TextLineLayout line;
        int obfuscationControl;
        TextLineLayout[] linesSource;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        linesSource = this.lines;
        linesAlias = linesSource;
        for (lineIndex = 0; lineIndex < linesSource.length; lineIndex++) {
          line = linesSource[lineIndex];
          if (line.caretXs.length > characterIndex) {
            return line.caretXs[characterIndex];
          }
          characterIndex = characterIndex - (-1 + line.caretXs.length);
        }
        if (obfuscationGuard == -66) {
          return 0;
        }
        this.getRightExtent(true);
        return 0;
    }

    final int getLineIndex(int startLine, int characterIndex) {
        int lineIndex = 0;
        TextLineLayout line = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (lineIndex = startLine; this.lines.length > lineIndex; lineIndex++) {
          line = this.lines[lineIndex];
          if (!(line.caretXs.length <= characterIndex)) {
            return lineIndex;
          }
          characterIndex = characterIndex - (-1 + line.caretXs.length);
        }
        return this.lines.length;
    }

    public static void a(int param0) {
        if (param0 >= -111) {
          CharSequence var2 = (CharSequence) null;
          TextLayout.parseRadixInt(-42, 6, (CharSequence) null);
        }
        field_c = null;
        field_a = (RgbSprite[][]) null;
    }

    final int justificationStep(int startIndex, String text, int targetWidth, int measuredWidth) {
        int characterIndex = 0;
        int spaceCount = 0;
        int insideTag = 0;
        int textLength = 0;
        int character = 0;
        int obfuscationControl = 0;
        int step = 0;
        int noSpacesStep = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          spaceCount = 0;
          insideTag = 0;
          textLength = text.length();
          for (characterIndex = startIndex; textLength > characterIndex; characterIndex++) {
            character = text.charAt(characterIndex);
            if (character == 60) {
              insideTag = 1;
            } else {
              if (character == 62) {
                insideTag = 0;
              } else {
                if (insideTag == 0 &&
                  character == 32) {
                  spaceCount++;
                }
              }
            }
          }
          if (spaceCount > 0) {
            step = (-measuredWidth + targetWidth << 8) / spaceCount;
            return step;
          }
          noSpacesStep = 0;
          return noSpacesStep;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ju.A(").append(startIndex).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(targetWidth).append(',').append(measuredWidth).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
    }
}
