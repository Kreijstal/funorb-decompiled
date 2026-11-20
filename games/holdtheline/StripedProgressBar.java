/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressBar extends UiWidget {
    private Sprite field_E;
    int progress;
    private int field_F;
    private int field_C;
    private Sprite field_I;
    private int field_G;
    private int field_A;
    private Sprite[] field_D;
    private Sprite field_L;
    private int field_H;
    private int field_M;
    boolean animating;

    private final void rebuildSprites(byte param0) {
        this.field_D = new Sprite[]{this.createStripeTile(127, this.field_C, this.field_A), this.createStripeTile(127, this.field_M, this.field_G)};
        this.field_I = this.createEndMask(-127);
        this.field_E = this.field_I.flippedHorizontally();
        this.field_L = new Sprite(this.height >> 1, this.height);
        int var2 = 22 % ((param0 - 6) / 63);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (0 != param3) {
          return;
        }
        if (param0 != -9532) {
          this.field_M = -82;
        }
        int var5 = this.x + param2;
        int var6 = this.y + param1;
        this.drawStripeRegion(2, var6, this.field_D[0], var5);
        if (65536 > this.progress) {
          StereoMusicSample.a(this.width + var5, (this.width * this.progress >> 16) + var5, this.height + var6, true, var6);
          this.drawStripeRegion(param0 ^ -9530, var6, this.field_D[1], var5);
          dm.b((byte) -10);
        }
    }

    private final void drawStripeRegion(int param0, int param1, Sprite param2, int param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          var5_int = this.width + param3;
          StereoMusicSample.a(-this.field_I.width + var5_int, this.field_I.width + param3, this.height + param1, true, param1);
          var6 = -this.field_H + param3;
          if (param0 != 2) {
            this.field_I = (Sprite) null;
          }
          while (var5_int > var6) {
            param2.draw(var6, param1);
            var6 = var6 + param2.width;
          }
          dm.b((byte) -10);
          if (SoftwareRasterizer.clipLeft <= param3 + this.field_I.width) {
            ProxySocketConnector.a(this.field_L, -1);
            param2.draw(-this.field_H, 0);
            param2.draw(this.field_F * 2 - this.field_H, 0);
            this.field_E.drawMultiply(0, 0);
            dm.b((byte) -10);
            this.field_L.draw(param3, param1);
          }
          if (-this.field_I.width + var5_int <= SoftwareRasterizer.clipRight) {
            ProxySocketConnector.a(this.field_L, param0 ^ -3);
            for (var7 = this.width + (-this.field_I.width + this.field_H); var7 > this.field_F * 2; var7 = var7 - this.field_F * 2) {
            }
            param2.draw(-var7, 0);
            param2.draw(-var7 + this.field_F * 2, 0);
            this.field_I.drawMultiply(0, 0);
            dm.b((byte) -10);
            this.field_L.draw(var5_int - this.field_I.width, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ea.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final Sprite createStripeTile(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = HoldTheLine.field_D;
        Sprite var14 = new Sprite(this.field_F * 2, this.height);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param0 <= 120) {
          return (Sprite) null;
        }
        ProxySocketConnector.a(var14, -1);
        int var5 = this.height >> 1;
        for (var6 = 0; this.height > var6; var6++) {
          var7 = (var6 >> 1) * (-1 + this.field_F * 2) % (this.field_F * 2);
          var8 = param1 & 16711935;
          var9 = 65280 & param1;
          var10 = -var5 + var6;
          var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
          var12 = var11 < 256 ? (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 8 : var8 | var9;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_F, var12);
          var9Lifetime1 = 65280 & param2;
          var8Lifetime1 = param2 & 16711935;
          SoftwareRasterizer.drawHorizontalLine(-(this.field_F * 2) + var7, var6, this.field_F, var12);
          var12Lifetime1 = var11 < 256 ? (var11 * var9Lifetime1 & 16711680 | -16711936 & var11 * var8Lifetime1) >>> 8 : var8Lifetime1 | var9Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(var7 + this.field_F, var6, this.field_F, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(var7 - this.field_F, var6, this.field_F, var12Lifetime1);
        }
        dm.b((byte) -10);
        return var14;
    }

    private final Sprite createEndMask(int param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = HoldTheLine.field_D;
        int var2 = 2 / ((-72 - param0) / 48);
        int var3 = this.height >> 1;
        Sprite var4 = new Sprite(var3, this.height);
        ProxySocketConnector.a(var4, -1);
        for (var5 = 0; this.height > var5; var5++) {
          for (var6 = 0; var6 < var3; var6++) {
            var7 = (double)var6 * (double)var6 / (double)((-var5 + this.height) * var5);
            var9 = 1;
            if (1.0 > var7) {
              var7 = Math.sqrt(1.0 - var7);
              var9 = var7 >= 1.0 ? 255 : (int)(var7 * 255.0);
            }
            SoftwareRasterizer.setPixel(var6, var5, var9 << 16 | (var9 | var9 << 8));
          }
        }
        dm.b((byte) -10);
        return var4;
    }

    final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildSprites((byte) -96);
    }

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    final void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        Sprite discarded$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.animating) {
            this.field_H = this.field_H + 1;
            if (this.field_F * 2 < this.field_H) {
              this.field_H = this.field_H - this.field_F * 2;
            }
          }
          if (param3 != -3) {
            discarded$1 = this.createStripeTile(-85, 81, -16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ea.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void pollKeyState(boolean param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = HoldTheLine.field_D;
        try {
          var1 = MusicCrossfadeStream.field_n;
          synchronized (var1) {
            DisplayNameValidator.field_j = DisplayNameValidator.field_j + 1;
            if (param0) {
              return;
            }
            BoundaryCurve.field_l = qd.field_i;
            if (DraggableWidget.field_J < 0) {
              var5 = 0;
              var2 = var5;
              while (112 > var5) {
                IterableSecondaryNodeDeque.field_g[var5] = false;
                var5++;
              }
              DraggableWidget.field_J = PacketBuffer.field_j;
            } else {
              while (PacketBuffer.field_j != DraggableWidget.field_J) {
                var2 = na.field_r[PacketBuffer.field_j];
                PacketBuffer.field_j = 127 & PacketBuffer.field_j + 1;
                if (var2 >= 0) {
                  IterableSecondaryNodeDeque.field_g[var2] = true;
                  continue;
                }
                IterableSecondaryNodeDeque.field_g[~var2] = false;
              }
            }
            qd.field_i = lj.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "ea.I(" + param0 + ')');
        }
    }

    final void setColors(int param0, int param1, boolean param2) {
        this.field_G = param1 >> 1 & 8355711;
        this.field_A = param1;
        this.field_M = 8355711 & param0 >> 1;
        this.field_C = param0;
        if (param2) {
          UiWidget var5 = (UiWidget) null;
          this.updateHover(-23, (UiWidget) null, 66, (byte) -6);
        }
        this.rebuildSprites((byte) 70);
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_F = param4;
        this.field_C = param5;
        this.field_M = param7;
        this.field_A = param6;
        this.field_G = param8;
        this.setBounds(param0, (byte) 122, param1, param3, param2);
    }

    static {
    }
}
