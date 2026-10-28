/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static int field_d;
    static String field_e;
    static boolean field_b;
    static String field_f;
    TextLayoutLine[] lines;
    static BufferedSocket field_c;

    final int lineForCharacter(int characterIndex, int firstLine) {
        int var5 = EscapeVector.obfuscationControl;
        for (int var3 = firstLine; var3 < this.lines.length; var3++) {
          TextLayoutLine var4 = this.lines[var3];
          if (characterIndex < var4.insertionX.length) {
            return var3;
          }
          characterIndex = characterIndex - (var4.insertionX.length - 1);
        }
        return this.lines.length;
    }

    final int height(int guard) {
        int stackIn_7_0 = 0;
        if (guard != 0) {
          return -63;
        }
        if (this.lines != null &&
          this.lines.length > 0) {
          stackIn_7_0 = this.lines[-1 + this.lines.length].bottom - this.lines[0].top;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int maximumLineWidth(byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (guard != -112) {
          TextLayout.gameContainer(72);
        }
        int var2 = -1;
        if (this.lines != null) {
          TextLayoutLine[] var3 = this.lines;
          for (int var4 = 0; var4 < var3.length; var4++) {
            TextLayoutLine var5 = var3[var4];
            if (var5 != null) {
              int var6 = var5.width(119);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int justificationSpacingQ8(int guard, int textWidth, String text, int targetWidth) {
        String stackIn_24_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (guard != -21446) {
            this.lines = (TextLayoutLine[]) null;
          }
          int var5_int = 0;
          boolean var6 = false;
          int var7 = text.length();
          for (int var8 = 0; var7 > var8; var8++) {
            int var9 = text.charAt(var8);
            if (var9 == 60) {
              var6 = true;
            } else if (62 == var9) {
              var6 = false;
            } else if (!var6 &&
              var9 == 32) {
              var5_int++;
            }
          }
          if (var5_int <= 0) {
            return 0;
          }
          int stackIn_20_0 = (targetWidth - textWidth << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var5;
          StringBuilder stackIn_23_1 = new StringBuilder().append("pg.K(").append(guard).append(',').append(textWidth).append(',');
          if (text == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(targetWidth).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          field_d = -128;
        }
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static java.awt.Container gameContainer(int guard) {
        if (guard != -1) {
          return (java.awt.Container) null;
        }
        if (PathPoint.field_i != null) {
          return (java.awt.Container) ((Object) PathPoint.field_i);
        }
        return (java.awt.Container) ((Object) PointCloudEffect.activeApplet((byte) -119));
    }

    final int characterX(byte guard, int characterIndex) {
        int var6 = EscapeVector.obfuscationControl;
        TextLayoutLine[] var7 = this.lines;
        TextLayoutLine[] var3 = var7;
        for (int var4 = 0; var4 < var7.length; var4++) {
          TextLayoutLine var5 = var7[var4];
          if (characterIndex < var5.insertionX.length) {
            return var5.insertionX[characterIndex];
          }
          characterIndex = characterIndex - (var5.insertionX.length - 1);
        }
        int var4Lifetime1 = 79 % ((60 - guard) / 62);
        return 0;
    }

    final int characterIndexAt(byte guard, int x, int y) {
        int var8 = EscapeVector.obfuscationControl;
        if (null != this.lines &&
          this.lines.length != 0 &&
          this.lines[0].top <= y) {
          if (this.lines[this.lines.length - 1].bottom < y) {
            return -1;
          }
          if (1 == this.lines.length) {
            return this.lines[0].characterIndexAtX((byte) 52, x);
          }
          int var4 = 0;
          if (guard < 8) {
            this.characterIndexAt((byte) 53, -122, 65);
          }
          for (int var5 = 0; this.lines.length > var5; var5++) {
            TextLayoutLine var6 = this.lines[var5];
            if (y >= var6.top &&
              y <= var6.bottom) {
              int var7 = var6.characterIndexAtX((byte) 52, x);
              if (-1 == var7) {
                return -1;
              }
              return var7 + var4;
            }
            var4 = var4 + (-1 + var6.insertionX.length);
          }
          return -1;
        }
        return -1;
    }

    static {
        field_f = "Unpacking graphics";
        field_e = null;
    }
}
