/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimedSplashScreen extends MenuScreen {
    static mm field_u;
    static String field_s;
    static char[] keyEventCharacters;
    private int remainingTicks;

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard >= -52) {
          TimedSplashScreen.a(true, (byte) -10, 12, -97, -36, false);
          if (!inputEnabled) {
            return;
          }
          fieldTemp$0 = this.remainingTicks - 1;
          this.remainingTicks = this.remainingTicks - 1;
          if (fieldTemp$0 == 0) {
            ng.requestScreen(true, 120, 0);
            return;
          }
          if (cb.heldButton != 0) {
            ng.requestScreen(true, 120, 0);
            return;
          }
          if (0 == ki.pressedButton) {
            return;
          }
          ng.requestScreen(true, 120, 0);
          return;
        }
        if (!inputEnabled) {
          return;
        }
        int fieldTemp$1 = this.remainingTicks - 1;
        this.remainingTicks = this.remainingTicks - 1;
        if (fieldTemp$1 == 0) {
          ng.requestScreen(true, 120, 0);
          return;
        }
        if (cb.heldButton != 0) {
          ng.requestScreen(true, 120, 0);
          return;
        }
        if (0 == ki.pressedButton) {
          return;
        }
        ng.requestScreen(true, 120, 0);
    }

    final void onExit(byte obfuscationGuard) {
        if (obfuscationGuard != 79) {
          field_s = (String) null;
          RankingsScreen.field_t = null;
          return;
        }
        RankingsScreen.field_t = null;
    }

    TimedSplashScreen() {
        super(21, 0, 0, 0, 0, (int[]) null);
        this.remainingTicks = 250;
    }

    final static SoundPlayback playSound(int obfuscationGuard, PcmSound sound) {
        RuntimeException var2 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 75) {
            field_u = (mm) null;
          }
          stackIn_3_0 = sk.queueSoundPlayback((byte) 117, PcmStream.createAtRate(sound, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vp.B(").append(obfuscationGuard).append(',');
          if (sound == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 == 0) {
          field_s = null;
          keyEventCharacters = null;
          return;
        }
        PcmSound var2 = (PcmSound) null;
        TimedSplashScreen.playSound(-53, (PcmSound) null);
        field_s = null;
        keyEventCharacters = null;
    }

    final void drawScreen(byte obfuscationGuard) {
        if (obfuscationGuard >= -14) {
          return;
        }
        RankingsScreen.field_t.drawOpaque(0, 0);
        DelayedPacket.d(0);
        MovingBody.a((byte) -115);
    }

    final static RgbSprite[] a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5) {
        RgbSprite var13 = null;
        RgbSprite var14 = null;
        int[] var16 = Rasterizer2D.pixels;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = Rasterizer2D.width;
        int var8 = Rasterizer2D.height;
        RgbSprite var9 = new RgbSprite(16, param3);
        var9.bindRasterTarget();
        Rasterizer2D.fillVerticalGradient(0, 0, 16, param3, param2, param4);
        Object var10 = null;
        if (param0) {
          var13 = var9.copy();
          var10 = var13;
          var13.bindRasterTarget();
          Rasterizer2D.drawHorizontalLine(0, 0, 5, 0);
          Rasterizer2D.drawHorizontalLine(0, 1, 3, 0);
          Rasterizer2D.drawHorizontalLine(0, 2, 2, 0);
          Rasterizer2D.drawHorizontalLine(0, 3, 1, 0);
          Rasterizer2D.drawHorizontalLine(0, 4, 1, 0);
        }
        Object var11 = null;
        if (param5) {
          var14 = var9.copy();
          var11 = var14;
          var14.bindRasterTarget();
          Rasterizer2D.drawHorizontalLine(11, 0, 5, 0);
          Rasterizer2D.drawHorizontalLine(13, 1, 3, 0);
          Rasterizer2D.drawHorizontalLine(14, 2, 2, 0);
          Rasterizer2D.drawHorizontalLine(15, 3, 1, 0);
          Rasterizer2D.drawHorizontalLine(15, 4, 1, 0);
        }
        if (param1 >= 32) {
          Rasterizer2D.bind(var16, var7, var8);
          return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
        }
        return (RgbSprite[]) null;
    }

    final boolean handleKey(char character, int obfuscationGuard, int keyCode) {
        if (obfuscationGuard >= 98) {
          if (keyCode >= 0) {
            ng.requestScreen(false, 99, 0);
          }
          return true;
        }
        this.remainingTicks = -100;
        if (keyCode >= 0) {
          ng.requestScreen(false, 99, 0);
          return true;
        }
        return true;
    }

    static {
        field_s = "Speed down: decreases the speed of any ball in play.";
        keyEventCharacters = new char[128];
    }
}
