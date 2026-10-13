/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimedSplashScreen extends MenuScreen {
    static mm field_u;
    static String field_s;
    static char[] field_r;
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
          if (cb.field_q != 0) {
            ng.requestScreen(true, 120, 0);
            return;
          }
          if (0 == ki.field_e) {
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
        if (cb.field_q != 0) {
          ng.requestScreen(true, 120, 0);
          return;
        }
        if (0 == ki.field_e) {
          return;
        }
        ng.requestScreen(true, 120, 0);
    }

    final void onExit(byte obfuscationGuard) {
        if (obfuscationGuard != 79) {
          field_s = (String) null;
          lf.field_t = null;
          return;
        }
        lf.field_t = null;
    }

    TimedSplashScreen() {
        super(21, 0, 0, 0, 0, (int[]) null);
        this.remainingTicks = 250;
    }

    final static l a(int param0, oe param1) {
        RuntimeException var2 = null;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 75) {
            field_u = (mm) null;
          }
          stackIn_3_0 = sk.a((byte) 117, kl.b(param1, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 == 0) {
          field_s = null;
          field_r = null;
          return;
        }
        oe var2 = (oe) null;
        TimedSplashScreen.a(-53, (oe) null);
        field_s = null;
        field_r = null;
    }

    final void drawScreen(byte obfuscationGuard) {
        if (obfuscationGuard >= -14) {
          return;
        }
        lf.field_t.b(0, 0);
        pg.d(0);
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

    final boolean handleKey(char character, int keyCode, int obfuscationGuard) {
        if (keyCode >= 98) {
          if (obfuscationGuard >= 0) {
            ng.requestScreen(false, 99, 0);
          }
          return true;
        }
        this.remainingTicks = -100;
        if (obfuscationGuard >= 0) {
          ng.requestScreen(false, 99, 0);
          return true;
        }
        return true;
    }

    static {
        field_s = "Speed down: decreases the speed of any ball in play.";
        field_r = new char[128];
    }
}
