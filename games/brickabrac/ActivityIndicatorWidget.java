/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ActivityIndicatorWidget extends Widget {
    int progressFraction65536;
    boolean animated;
    static NodeDeque backgroundSurfacePool1280;
    private int phaseTick;
    private int inactiveForegroundColor;
    private RgbSprite capWorkSurface;
    private RgbSprite[] stripeSprites;
    private int inactiveBackgroundColor;
    private int foregroundColor;
    static RgbSprite field_D;
    private RgbSprite leftCapMask;
    private RgbSprite rightCapMask;
    private int phaseSpan;
    private int backgroundColor;

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
          StatefulWidgetRenderer.field_z = param6;
          gd.field_a = param3;
          u.field_g = param1;
          SoftwareFramebuffer.field_a = param8;
          vd.field_f = (ArchiveFetchClient) ((Object) new ArchiveNetworkClient());
          Brick.field_x = new CacheIoWorker(param4);
          HalloweenBackground.archiveSourceManager = new ArchiveSourceManager(vd.field_f, Brick.field_x);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cr.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void drawStripedBar(int x, int y, RgbSprite stripes, int obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String stripesSummary = null;
        RuntimeException caughtFailure = null;
        int rightEdge = 0;
        RuntimeException failure = null;
        int tileX = 0;
        int rightCapPhase = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          rightEdge = x + this.width;
          MovingBody.a((byte) 107, rightEdge - this.rightCapMask.width, x + this.rightCapMask.width, y, y + this.height);
          tileX = x - this.phaseTick;
          if (obfuscationGuard > -56) {
            this.capWorkSurface = (RgbSprite) null;
          }
          while (rightEdge > tileX) {
            stripes.drawTransparent(tileX, y);
            tileX = tileX + stripes.width;
          }
          sc.popRaster(-103);
          if (x + this.rightCapMask.width >= Rasterizer2D.clipLeft) {
            IndexedSpriteGeometry.pushSpriteRaster(-112, this.capWorkSurface);
            stripes.drawTransparent(-this.phaseTick, 0);
            stripes.drawTransparent(this.phaseSpan * 2 - this.phaseTick, 0);
            this.leftCapMask.b(0, 0);
            sc.popRaster(-109);
            this.capWorkSurface.drawTransparent(x, y);
          }
          if (Rasterizer2D.clipRight >= rightEdge - this.rightCapMask.width) {
            IndexedSpriteGeometry.pushSpriteRaster(-51, this.capWorkSurface);
            for (rightCapPhase = this.width - this.rightCapMask.width + this.phaseTick; rightCapPhase > 2 * this.phaseSpan; rightCapPhase = rightCapPhase - this.phaseSpan * 2) {
            }
            stripes.drawTransparent(-rightCapPhase, 0);
            stripes.drawTransparent(-rightCapPhase + 2 * this.phaseSpan, 0);
            this.rightCapMask.b(0, 0);
            sc.popRaster(-117);
            this.capWorkSurface.drawTransparent(rightEdge - this.rightCapMask.width, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("cr.H(").append(x).append(',').append(y).append(',');
          if (stripes == null) {
            stripesSummary = "null";
          } else {
            stripesSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(stripesSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void setActivityColors(int foregroundColor, int backgroundColor, int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          this.setBounds(-106, -2, -16, (byte) 28, -96);
        }
        this.inactiveForegroundColor = (foregroundColor & 16711422) >> 1;
        this.foregroundColor = foregroundColor;
        this.inactiveBackgroundColor = 8355711 & backgroundColor >> 1;
        this.backgroundColor = backgroundColor;
        this.rebuildActivitySprites(-1847795903);
    }

    public static void a(byte param0) {
        field_D = null;
        backgroundSurfacePool1280 = null;
        if (param0 <= 36) {
          backgroundSurfacePool1280 = (NodeDeque) null;
        }
    }

    private final void rebuildActivitySprites(int obfuscationGuard) {
        this.stripeSprites = new RgbSprite[]{this.buildStripeSprite(this.backgroundColor, (byte) -41, this.foregroundColor), this.buildStripeSprite(this.inactiveBackgroundColor, (byte) 107, this.inactiveForegroundColor)};
        this.rightCapMask = this.buildRightCapMask(16711422);
        this.leftCapMask = this.rightCapMask.copyFlippedHorizontal();
        this.capWorkSurface = new RgbSprite(this.height >> 1, this.height);
        if (obfuscationGuard != -1847795903) {
          this.foregroundColor = 58;
        }
    }

    final static void f(byte param0) {
        if (null != GameRenderAudioHelpers.contextActions &&
          GameRenderAudioHelpers.contextActions.anchorComponent != null) {
          GameRenderAudioHelpers.contextActions.anchorComponent.selected = false;
        }
        if (param0 >= -39) {
          ActivityIndicatorWidget.a(0, 110);
        }
        o.field_b = null;
        GameRenderAudioHelpers.contextActions = null;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String focusSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
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
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("cr.WA(");
          if (focusRoot == null) {
            focusSummary = "null";
          } else {
            focusSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(focusSummary).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    private final RgbSprite buildRightCapMask(int obfuscationGuard) {
        int row = 0;
        int column = 0;
        double radiusRatioOrCoverage = 0.0;
        int intensity = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int halfHeight = this.height >> 1;
        if (obfuscationGuard != 16711422) {
          return (RgbSprite) null;
        }
        RgbSprite mask = new RgbSprite(halfHeight, this.height);
        IndexedSpriteGeometry.pushSpriteRaster(-67, mask);
        for (row = 0; this.height > row; row++) {
          for (column = 0; halfHeight > column; column++) {
            radiusRatioOrCoverage = (double)column * (double)column / (double)(row * (this.height - row));
            intensity = 1;
            if (1.0 > radiusRatioOrCoverage) {
              radiusRatioOrCoverage = Math.sqrt(-radiusRatioOrCoverage + 1.0);
              intensity = !(radiusRatioOrCoverage >= 1.0) ? (int)(255.0 * radiusRatioOrCoverage) : 255;
            }
            Rasterizer2D.setPixel(column, row, intensity << 16 | (intensity << 8 | intensity));
          }
        }
        sc.popRaster(-111);
        return mask;
    }

    private final RgbSprite buildStripeSprite(int backgroundColor, byte obfuscationGuard, int foregroundColor) {
        int row = 0;
        int stripeOffset = 0;
        int foregroundRedBlue = 0;
        int foregroundGreen = 0;
        int relativeY = 0;
        int brightness256 = 0;
        int litForeground = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int unusedGuardRemainder = 93 % ((11 - obfuscationGuard) / 37);
        RgbSprite stripes = new RgbSprite(2 * this.phaseSpan, this.height);
        int backgroundRedBlue;
        int backgroundGreen;
        int litBackground;
        IndexedSpriteGeometry.pushSpriteRaster(-102, stripes);
        int halfHeight = this.height >> 1;
        for (row = 0; row < this.height; row++) {
          stripeOffset = (row >> 1) * (-1 + this.phaseSpan * 2) % (this.phaseSpan * 2);
          foregroundRedBlue = foregroundColor & 16711935;
          foregroundGreen = foregroundColor & 65280;
          relativeY = row - halfHeight;
          brightness256 = 128 + (int)(128.0 * (Math.sqrt((double)(halfHeight * halfHeight - relativeY * relativeY)) / (double)halfHeight));
          litForeground = brightness256 < 256 ? (brightness256 * foregroundGreen & 16711680 | foregroundRedBlue * brightness256 & -16711936) >>> 8 : foregroundRedBlue | foregroundGreen;
          Rasterizer2D.drawHorizontalLine(stripeOffset, row, this.phaseSpan, litForeground);
          backgroundGreen = 65280 & backgroundColor;
          Rasterizer2D.drawHorizontalLine(-(2 * this.phaseSpan) + stripeOffset, row, this.phaseSpan, litForeground);
          backgroundRedBlue = 16711935 & backgroundColor;
          litBackground = brightness256 >= 256 ? backgroundRedBlue | backgroundGreen : (-16711936 & backgroundRedBlue * brightness256 | 16711680 & backgroundGreen * brightness256) >>> 8;
          Rasterizer2D.drawHorizontalLine(this.phaseSpan + stripeOffset, row, this.phaseSpan, litBackground);
          Rasterizer2D.drawHorizontalLine(stripeOffset - this.phaseSpan, row, this.phaseSpan, litBackground);
        }
        sc.popRaster(-110);
        return stripes;
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
            backgroundSurfacePool1280 = (NodeDeque) null;
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

    private ActivityIndicatorWidget(int x, int y, int width, int height, int phaseSpan, int foregroundColor, int backgroundColor, int inactiveForegroundColor, int inactiveBackgroundColor) {
        this.phaseSpan = phaseSpan;
        this.inactiveForegroundColor = inactiveForegroundColor;
        this.inactiveBackgroundColor = inactiveBackgroundColor;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
        this.setBounds(height, x, y, (byte) -119, width);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (layer != 0) {
          return;
        }
        int destinationX = this.x + parentX;
        int destinationY = parentY + this.y;
        this.drawStripedBar(destinationX, destinationY, this.stripeSprites[0], -63);
        if (65536 > this.progressFraction65536) {
          MovingBody.a((byte) 118, this.width + destinationX, destinationX + (this.progressFraction65536 * this.width >> 16), destinationY, this.height + destinationY);
          this.drawStripedBar(destinationX, destinationY, this.stripeSprites[1], obfuscationGuard ^ 92);
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
          if (WhirlpoolHasher.gameTransport != null) {
            if (0 <= param0) {
              decompiledFrameRemainder0 = (MenuButton.loggedInConnection == rf.connectionPhase);
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
                  WhirlpoolHasher.gameTransport.write(TextFieldValidator.outgoingPackets.data, true, TextFieldValidator.outgoingPackets.position, 0);
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
        backgroundSurfacePool1280 = new NodeDeque();
    }
}
