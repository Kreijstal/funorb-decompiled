/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class AwtRasterBuffer {
    int width;
    int[] pixels;
    int height;
    static int primaryAchievementTrackingCounter;
    java.awt.Image image;
    static GzipInflater archiveGzipInflater;

    abstract void drawImage(int drawY, java.awt.Graphics graphics, int drawX, int methodGuard);

    abstract void initialize(int height, java.awt.Component component, int width, byte methodGuard);

    final static Sprite buildFirstRgbSpriteFromDecodedSheet(byte methodGuard) {
        int pixelIndex = 0;
        int pixelCount = DualLinkNode.decodedSpriteWidths[0] * ProgressBarWidget.decodedSpriteHeights[0];
        byte[] paletteIndices = mj.decodedSpriteIndices[0];
        int[] rgbPixels = new int[pixelCount];
        if (methodGuard != -60) {
            Random unusedNullRandomSnapshot = (Random) null;
            AwtRasterBuffer.a((byte) 50, (Random) null, 37);
        }
        for (pixelIndex = 0; pixelIndex < pixelCount; pixelIndex++) {
            rgbPixels[pixelIndex] = NanoFrameTimer.decodedSpritePalette[ProxySocketConnector.andInt(255, (int) paletteIndices[pixelIndex])];
        }
        Sprite sprite = new Sprite(pg.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[0], md.decodedSpriteYOffsets[0], DualLinkNode.decodedSpriteWidths[0], ProgressBarWidget.decodedSpriteHeights[0], rgbPixels);
        MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
        return sprite;
    }

    public static void b(byte param0) {
        archiveGzipInflater = null;
        if (param0 != 58) {
            Random var2 = (Random) null;
            AwtRasterBuffer.a((byte) 47, (Random) null, -73);
        }
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -75) {
            stackIn_2_0 = 102;
            return stackIn_2_0;
          }
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (uj.a(true, param2)) {
            stackIn_7_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> 32);
            return stackIn_7_0;
          }
          var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
          while (true) {
            var4 = param1.nextInt();
            if (var3_int <= var4) {
              continue;
            }
            stackIn_12_0 = jc.a(var4, param2, param0 ^ 121);
            return stackIn_12_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("sc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setAsRasterTarget(int methodGuard) {
        SoftwareRasterizer.setRasterTarget(this.pixels, this.width, this.height);
        if (methodGuard != 255) {
            Random nullRandomForInvalidGuard = (Random) null;
            AwtRasterBuffer.a((byte) -94, (Random) null, 54);
        }
    }

    static {
        archiveGzipInflater = new GzipInflater();
    }
}
