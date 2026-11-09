/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static byte[][] field_d;
    static float[] field_c;
    TextLayoutLine[] lines;
    static int field_b;

    final int lineForCharacter(int param0, int param1) {
        int var3 = 0;
        TextLayoutLine var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        for (var3 = 0; var3 < this.lines.length; var3++) {
          var4 = this.lines[var3];
          if (param0 < var4.caretX.length) {
            return var3;
          }
          param0 = param0 - (var4.caretX.length - 1);
        }
        if (param1 != -17500) {
          TextLayout.releaseStatics(-10);
        }
        return this.lines.length;
    }

    final int justificationSpaceQ8(int param0, int param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = 0;
          if (param0 != -292767736) {
            TextLayout.b(3);
          }
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (0 < var5_int) {
            stackIn_21_0 = (-param3 + param1 << 8) / var5_int;
            return stackIn_21_0;
          }
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ag.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final int characterAtPoint(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        TextLayoutLine var6;
        int var7;
        int var8;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (this.lines != null &&
          this.lines.length != 0 &&
          param0 >= this.lines[0].top) {
          if (this.lines[this.lines.length - 1].bottom < param0) {
            return -1;
          }
          if (this.lines.length == 1) {
            return this.lines[0].nearestCaret(param1, (byte) 117);
          }
          var4 = 0;
          if (param2 < 97) {
            return -92;
          }
          for (var5 = 0; this.lines.length > var5; var5++) {
            var6 = this.lines[var5];
            if (var6.top <= param0 &&
              param0 <= var6.bottom) {
              var7 = var6.nearestCaret(param1, (byte) -126);
              if (var7 != -1) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (var6.caretX.length - 1);
          }
          return -1;
        }
        return -1;
    }

    final static void a(int param0) {
        if (!ReconnectState.reconnecting) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          field_c = (float[]) null;
        }
        if (hc.field_c != null) {
          hc.field_c.n(-7);
        }
        String var1 = LegacyOpenGlPbuffer.playerLabel((byte) -72);
        no.field_a = new LoginForm(var1, (String) null, true, false, false);
        RenderPresentationException.field_a.pushDialog((byte) 114, SlowBurstParticle.field_y);
        SlowBurstParticle.field_y.transitionToContent((byte) -118, no.field_a);
        SlowBurstParticle.field_y.finishResize((byte) -128);
    }

    final static void a(int param0, int param1) {
        LegacyOpenGlSpecularEffect.a(param1, (byte) 105);
        if (param0 != 0) {
          TextLayout.releaseStatics(-74);
        }
    }

    final int caretX(byte param0, int param1) {
        int var4 = 0;
        TextLayoutLine var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        TextLayoutLine[] var8 = this.lines;
        TextLayoutLine[] var3 = var8;
        if (param0 <= 104) {
          String var7 = (String) null;
          this.justificationSpaceQ8(-96, -70, (String) null, 123);
        }
        for (var4 = 0; var8.length > var4; var4++) {
          var5 = var8[var4];
          if (!(var5.caretX.length <= param1)) {
            return var5.caretX[param1];
          }
          param1 = param1 - (-1 + var5.caretX.length);
        }
        return 0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (TextureGeneratorNode.musicVolume <= 32) {
          lf.setMusicVolume(0, 0);
        } else {
          var1 = TextureGeneratorNode.musicVolume % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          lf.setMusicVolume(0, TextureGeneratorNode.musicVolume - var1);
        }
        if (param0 != 0) {
          field_b = -64;
        }
    }

    final int height(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          return 73;
        }
        if (this.lines != null &&
          this.lines.length > 0) {
          stackIn_6_0 = this.lines[-1 + this.lines.length].bottom - this.lines[0].top;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void releaseStatics(int param0) {
        int var1 = 104 / ((param0 + 8) / 42);
        field_c = null;
        field_d = (byte[][]) null;
    }

    final int maximumRightEdge(byte param0) {
        int var4 = 0;
        int var2;
        TextLayoutLine[] var3;
        TextLayoutLine var5;
        int var7;
        String var8;
        int var6;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > -6) {
          var8 = (String) null;
          this.justificationSpaceQ8(84, 121, (String) null, -67);
        }
        var2 = -1;
        if (null != this.lines) {
          var3 = this.lines;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.rightEdge(1);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    static {
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
    }
}
