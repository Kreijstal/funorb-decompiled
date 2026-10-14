/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ActivityIndicatorWidget extends Widget {
    int field_L;
    boolean animated;
    static NodeDeque field_N;
    private int phaseTick;
    private int field_M;
    private RgbSprite field_C;
    private RgbSprite[] field_P;
    private int field_I;
    private int field_F;
    static RgbSprite field_D;
    private RgbSprite field_O;
    private RgbSprite field_G;
    private int phaseSpan;
    private int field_E;

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.rebuildActivitySprites(-1847795903);
    }

    ActivityIndicatorWidget(int x, int y, int width, int height, int phaseSpan, int foregroundColor, int backgroundColor) {
        this(x, y, width, height, phaseSpan, foregroundColor, backgroundColor, 8355711 & foregroundColor >> 1, (backgroundColor & 16711422) >> 1);
    }

    final static void a(int param0, int param1, int param2, int param3, PlatformServices param4, String param5, int param6, int param7, int param8) {
        DialogMessagePanel.field_P = param4;
        ArcticBackground.field_t = param7;
        TextFieldWidget.field_S = param0;
        LevelMetadata.field_k = param5;
        if (param2 <= 17) {
          return;
        }
        try {
          up.field_z = param6;
          gd.field_a = param3;
          u.field_g = param1;
          SoftwareFramebuffer.field_a = param8;
          vd.field_f = (ArchiveFetchClient) ((Object) new ArchiveNetworkClient());
          Brick.field_x = new CacheIoWorker(param4);
          HalloweenBackground.field_v = new co(vd.field_f, Brick.field_x);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cr.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(int param0, int param1, RgbSprite param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = param0 + this.width;
          MovingBody.a((byte) 107, var5_int - this.field_G.width, param0 + this.field_G.width, param1, param1 + this.height);
          var6 = param0 - this.phaseTick;
          if (param3 > -56) {
            this.field_C = (RgbSprite) null;
          }
          while (var5_int > var6) {
            param2.drawTransparent(var6, param1);
            var6 = var6 + param2.width;
          }
          sc.popRaster(-103);
          if (param0 + this.field_G.width >= Rasterizer2D.clipLeft) {
            IndexedSpriteGeometry.pushSpriteRaster(-112, this.field_C);
            param2.drawTransparent(-this.phaseTick, 0);
            param2.drawTransparent(this.phaseSpan * 2 - this.phaseTick, 0);
            this.field_O.b(0, 0);
            sc.popRaster(-109);
            this.field_C.drawTransparent(param0, param1);
          }
          if (Rasterizer2D.clipRight >= var5_int - this.field_G.width) {
            IndexedSpriteGeometry.pushSpriteRaster(-51, this.field_C);
            for (var7 = this.width - this.field_G.width + this.phaseTick; var7 > 2 * this.phaseSpan; var7 = var7 - this.phaseSpan * 2) {
            }
            param2.drawTransparent(-var7, 0);
            param2.drawTransparent(-var7 + 2 * this.phaseSpan, 0);
            this.field_G.b(0, 0);
            sc.popRaster(-117);
            this.field_C.drawTransparent(var5_int - this.field_G.width, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("cr.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setActivityColors(int foregroundColor, int backgroundColor, int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          this.setBounds(-106, -2, -16, (byte) 28, -96);
        }
        this.field_M = (foregroundColor & 16711422) >> 1;
        this.field_F = foregroundColor;
        this.field_I = 8355711 & backgroundColor >> 1;
        this.field_E = backgroundColor;
        this.rebuildActivitySprites(-1847795903);
    }

    public static void a(byte param0) {
        field_D = null;
        field_N = null;
        if (param0 <= 36) {
          field_N = (NodeDeque) null;
        }
    }

    private final void rebuildActivitySprites(int obfuscationGuard) {
        this.field_P = new RgbSprite[]{this.a(this.field_E, (byte) -41, this.field_F), this.a(this.field_I, (byte) 107, this.field_M)};
        this.field_G = this.a(16711422);
        this.field_O = this.field_G.copyFlippedHorizontal();
        this.field_C = new RgbSprite(this.height >> 1, this.height);
        if (obfuscationGuard != -1847795903) {
          this.field_F = 58;
        }
    }

    final static void f(byte param0) {
        if (null != bm.contextActions &&
          bm.contextActions.anchorComponent != null) {
          bm.contextActions.anchorComponent.selected = false;
        }
        if (param0 >= -39) {
          ActivityIndicatorWidget.a(0, 110);
        }
        o.field_b = null;
        bm.contextActions = null;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (obfuscationGuard != 0) {
            return;
          }
          if (this.animated) {
            this.phaseTick = this.phaseTick + 1;
            if (2 * this.phaseSpan >= this.phaseTick) {
              return;
            }
            this.phaseTick = this.phaseTick - this.phaseSpan * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("cr.WA(");
          if (focusRoot == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    private final RgbSprite a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var2 = this.height >> 1;
        if (param0 != 16711422) {
          return (RgbSprite) null;
        }
        RgbSprite var3 = new RgbSprite(var2, this.height);
        IndexedSpriteGeometry.pushSpriteRaster(-67, var3);
        for (var4 = 0; this.height > var4; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.height - var4));
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(255.0 * var6) : 255;
            }
            Rasterizer2D.setPixel(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        sc.popRaster(-111);
        return var3;
    }

    private final RgbSprite a(int param0, byte param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = BrickABrac.field_J ? 1 : 0;
        int var4 = 93 % ((11 - param1) / 37);
        RgbSprite var5 = new RgbSprite(2 * this.phaseSpan, this.height);
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        IndexedSpriteGeometry.pushSpriteRaster(-102, var5);
        int var6 = this.height >> 1;
        for (var7 = 0; var7 < this.height; var7++) {
          var8 = (var7 >> 1) * (-1 + this.phaseSpan * 2) % (this.phaseSpan * 2);
          var9 = param2 & 16711935;
          var10 = param2 & 65280;
          var11 = var7 - var6;
          var12 = 128 + (int)(128.0 * (Math.sqrt((double)(var6 * var6 - var11 * var11)) / (double)var6));
          var13 = var12 < 256 ? (var12 * var10 & 16711680 | var9 * var12 & -16711936) >>> 8 : var9 | var10;
          Rasterizer2D.drawHorizontalLine(var8, var7, this.phaseSpan, var13);
          var10Lifetime1 = 65280 & param0;
          Rasterizer2D.drawHorizontalLine(-(2 * this.phaseSpan) + var8, var7, this.phaseSpan, var13);
          var9Lifetime1 = 16711935 & param0;
          var13Lifetime1 = var12 >= 256 ? var9Lifetime1 | var10Lifetime1 : (-16711936 & var9Lifetime1 * var12 | 16711680 & var10Lifetime1 * var12) >>> 8;
          Rasterizer2D.drawHorizontalLine(this.phaseSpan + var8, var7, this.phaseSpan, var13Lifetime1);
          Rasterizer2D.drawHorizontalLine(var8 - this.phaseSpan, var7, this.phaseSpan, var13Lifetime1);
        }
        sc.popRaster(-110);
        return var5;
    }

    final static RgbSprite[] loadRgbSpritesByName(String groupName, ResourceArchive archive, String fileName, int obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 2) {
            field_N = (NodeDeque) null;
          }
          var4_int = archive.getGroupId(groupName, false);
          var5 = archive.getFileId(var4_int, obfuscationGuard ^ -31, fileName);
          stackIn_3_0 = DualLinkIterator.loadRgbSprites(var5, obfuscationGuard ^ -23174, var4_int, archive);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cr.B(");
          if (groupName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private ActivityIndicatorWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.phaseSpan = param4;
        this.field_M = param7;
        this.field_I = param8;
        this.field_F = param5;
        this.field_E = param6;
        this.setBounds(param3, param0, param1, (byte) -119, param2);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (layer != 0) {
          return;
        }
        int var5 = this.x + parentX;
        int var6 = parentY + this.y;
        this.a(var5, var6, this.field_P[0], -63);
        if (65536 > this.field_L) {
          MovingBody.a((byte) 118, this.width + var5, var5 + (this.field_L * this.width >> 16), var6, this.height + var6);
          this.a(var5, var6, this.field_P[1], obfuscationGuard ^ 92);
          sc.popRaster(-102);
        }
        if (obfuscationGuard != -11) {
          this.animated = true;
        }
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (eq.gameTransport != null) {
            if (0 <= param0) {
              decompiledFrameRemainder0 = (MenuButton.field_i == rf.field_b);
              if ((decompiledFrameRemainder0) && (TextFieldValidator.outgoingPackets.position == 0 &&
                BrickMotionPath.field_q + 10000L < MonotonicTime.nowMillis(false))) {
                TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, param0);
              }
            } else {
              if (TextFieldValidator.outgoingPackets.position == 0 &&
                BrickMotionPath.field_q + 10000L < MonotonicTime.nowMillis(false)) {
                TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, param0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param1 != 10000) {
                return;
              }
              if (0 < TextFieldValidator.outgoingPackets.position) {
                try {
                  eq.gameTransport.write(TextFieldValidator.outgoingPackets.data, true, TextFieldValidator.outgoingPackets.position, 0);
                  BrickMotionPath.field_q = MonotonicTime.nowMillis(false);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  hn.a((byte) 92);
                }
                TextFieldValidator.outgoingPackets.position = 0;
              }
              return;
            }
          }
          TextFieldValidator.outgoingPackets.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_N = new NodeDeque();
    }
}
