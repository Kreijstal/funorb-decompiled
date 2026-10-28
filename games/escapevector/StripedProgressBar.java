/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class StripedProgressBar extends UiComponent {
    static int field_L;
    private int stripeWidth;
    private int stripeOffset;
    private Sprite[] stripeSprites;
    static String field_M;
    int progressQ16;
    private Sprite rightCapMask;
    private int field_y;
    static Sprite[] objectGlowSprites;
    private int field_A;
    static ResourceArchive field_I;
    private int field_H;
    boolean animateStripes;
    private Sprite leftCapMask;
    private int field_F;
    private Sprite capScratch;

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final static int[] scoreSubmissionWords(int guard) {
        if (SocketJs5Transport.field_r != null) {
          return SocketJs5Transport.field_r.scoreSubmissionWords(37);
        }
        if (guard == -3282) {
          return null;
        }
        return (int[]) null;
    }

    final void setColors(int secondColor, int firstColor, int guard) {
        this.field_y = (16711422 & firstColor) >> 1;
        this.field_A = secondColor;
        this.field_H = firstColor;
        if (guard >= -124) {
          this.capScratch = (Sprite) null;
        }
        this.field_F = (16711422 & secondColor) >> 1;
        this.rebuildSprites(-27800);
    }

    private final Sprite createCapMask(byte guard) {
        int var9 = EscapeVector.obfuscationControl;
        int var2 = this.height >> 1;
        Sprite var3 = new Sprite(var2, this.height);
        TickClock.pushSpriteRaster(var3, (byte) -8);
        for (int var4 = 0; var4 < this.height; var4++) {
          for (int var5 = 0; var2 > var5; var5++) {
            double var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.height));
            int var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        RasterRestoreSupport.popRasterState((byte) 127);
        if (guard >= -112) {
          return (Sprite) null;
        }
        return var3;
    }

    public static void releaseStatics(byte guard) {
        field_I = null;
        field_M = null;
        if (guard != 127) {
          return;
        }
        objectGlowSprites = null;
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        String stackIn_9_2 = null;
        try {
          if (this.animateStripes) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeOffset > 2 * this.stripeWidth) {
              this.stripeOffset = this.stripeOffset - 2 * this.stripeWidth;
            }
          }
          if (guard != -14472) {
            Sprite discarded$1 = this.createCapMask((byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("jm.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void drawStripedBar(int guard, int y, Sprite stripes, int x) {
        String stackIn_18_2 = null;
        int var7 = 0;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (guard > -23) {
            objectGlowSprites = (Sprite[]) null;
          }
          int var5_int = this.width + x;
          SpaceCompactionSupport.pushIntersectedClip(var5_int - this.rightCapMask.width, x + this.rightCapMask.width, y + this.height, 19807, y);
          for (int var6 = -this.stripeOffset + x; var6 < var5_int; var6 = var6 + stripes.width) {
            stripes.drawTransparent(var6, y);
          }
          RasterRestoreSupport.popRasterState((byte) -125);
          if (x + this.rightCapMask.width >= SoftwareRasterizer.clipLeft) {
            TickClock.pushSpriteRaster(this.capScratch, (byte) -35);
            stripes.drawTransparent(-this.stripeOffset, 0);
            stripes.drawTransparent(-this.stripeOffset + this.stripeWidth * 2, 0);
            this.leftCapMask.drawMultiply(0, 0);
            RasterRestoreSupport.popRasterState((byte) 124);
            this.capScratch.drawTransparent(x, y);
          }
          if (SoftwareRasterizer.clipRight >= -this.rightCapMask.width + var5_int) {
            TickClock.pushSpriteRaster(this.capScratch, (byte) -29);
            for (var7 = this.stripeOffset + (this.width - this.rightCapMask.width); 2 * this.stripeWidth < var7; var7 = var7 - this.stripeWidth * 2) {
            }
            stripes.drawTransparent(-var7, 0);
            stripes.drawTransparent(2 * this.stripeWidth - var7, 0);
            this.rightCapMask.drawMultiply(0, 0);
            RasterRestoreSupport.popRasterState((byte) -65);
            this.capScratch.drawTransparent(var5_int - this.rightCapMask.width, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("jm.C(").append(guard).append(',').append(y).append(',');
          if (stripes == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(x).append(')').toString());
        }
    }

    private final void rebuildSprites(int guard) {
        this.stripeSprites = new Sprite[]{this.createStripeSprite(true, this.field_H, this.field_A), this.createStripeSprite(true, this.field_y, this.field_F)};
        this.rightCapMask = this.createCapMask((byte) -122);
        this.leftCapMask = this.rightCapMask.copyMirroredHorizontally();
        if (guard != -27800) {
          return;
        }
        this.capScratch = new Sprite(this.height >> 1, this.height);
    }

    final static void writeInstallationSeed(int sourceOffset, PacketBuffer buffer) {
        try {
          int var3_int = 0;
          String stackIn_19_2 = null;
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var5 = EscapeVector.obfuscationControl;
          try {
            byte[] var6 = new byte[24];
            byte[] var2 = var6;
            if (SavedDataWrite.field_h != null) {
              try {
                SavedDataWrite.field_h.seek(0, 0L);
                SavedDataWrite.field_h.readFully((byte) 94, var6);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var6[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                buffer.writeBytes(24, (byte) 21, sourceOffset, var2);
                decompiledRegionSelector0 = false;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
                for (int var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = true;
              }
              if (!decompiledRegionSelector0) {
                return;
              }
            }
            buffer.writeBytes(24, (byte) 21, sourceOffset, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_18_0 = var2_ref;
            StringBuilder stackIn_18_1 = new StringBuilder().append("jm.I(").append(sourceOffset).append(',');
            if (buffer == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setBounds(int width, int y, int x, boolean guard, int height) {
        super.setBounds(width, y, x, guard, height);
        this.rebuildSprites(-27800);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (layer != 0) {
          return;
        }
        int var5 = this.x + screenX;
        int var6 = screenY + this.y;
        this.drawStripedBar(-32, var6, this.stripeSprites[0], var5);
        if (65536 > this.progressQ16) {
          SpaceCompactionSupport.pushIntersectedClip(this.width + var5, var5 + (this.progressQ16 * this.width >> 16), var6 + this.height, 19807, var6);
          this.drawStripedBar(-81, var6, this.stripeSprites[1], var5);
          RasterRestoreSupport.popRasterState((byte) 119);
        }
        if (guard <= 85) {
          this.leftCapMask = (Sprite) null;
        }
    }

    private final Sprite createStripeSprite(boolean guard, int firstColor, int secondColor) {
        int var13 = EscapeVector.obfuscationControl;
        Sprite var14 = new Sprite(2 * this.stripeWidth, this.height);
        TickClock.pushSpriteRaster(var14, (byte) -90);
        int var5 = this.height >> 1;
        int var6 = 0;
        if (!guard) {
          this.progressQ16 = 60;
        }
        while (var6 < this.height) {
          int var7 = (var6 >> 1) * (2 * this.stripeWidth - 1) % (this.stripeWidth * 2);
          int var8 = 16711935 & firstColor;
          int var9 = 65280 & firstColor;
          int var10 = -var5 + var6;
          int var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
          int var12 = var11 >= 256 ? var9 | var8 : (var11 * var8 & -16711936 | 16711680 & var11 * var9) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.stripeWidth, var12);
          SoftwareRasterizer.drawHorizontalLine(var7 - this.stripeWidth * 2, var6, this.stripeWidth, var12);
          int var8Lifetime1 = secondColor & 16711935;
          int var9Lifetime1 = 65280 & secondColor;
          int var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var11 * var9Lifetime1) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          var6++;
        }
        RasterRestoreSupport.popRasterState((byte) 127);
        return var14;
    }

    final static byte[] readPackedByteArray(int lengthBits, int guard, CipherPacketBuffer buffer, byte[] destination) {
        int var7 = 0;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = buffer.readBits(lengthBits, 8);
          if (0 == var4_int) {
            Object stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (destination == null ||
            var4_int != destination.length) {
            destination = new byte[var4_int];
          }
          if (guard <= 113) {
            field_I = (ResourceArchive) null;
          }
          int var5 = buffer.readBits(3, 8);
          int var6 = (byte)buffer.readBits(8, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              destination[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              destination[var7] = (byte)(var6 + buffer.readBits(var5, 8));
            }
          }
          byte[] stackIn_18_0 = (byte[]) (destination);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4;
          StringBuilder stackIn_21_1 = new StringBuilder().append("jm.A(").append(lengthBits).append(',').append(guard).append(',');
          if (buffer == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (destination == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.stripeWidth = param4;
        this.field_A = param6;
        this.field_H = param5;
        this.field_F = param8;
        this.field_y = param7;
        this.setBounds(param2, param1, param0, true, param3);
    }

    static {
        field_M = "?";
        objectGlowSprites = new Sprite[17];
    }
}
