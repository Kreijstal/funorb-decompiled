/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoftwareDrawingSupport {
    static ArgbSprite[] field_k;
    static Sprite[] field_p;
    private static Sprite field_d;
    static Sprite field_q;
    static ArgbSprite field_b;
    static ArgbSprite field_a;
    static Sprite[] field_l;
    static ArgbSprite[][] field_r;
    private static Sprite[][] field_h;
    private static Sprite[] field_n;
    static Sprite[] field_j;
    static Sprite[] field_m;
    static ArgbSprite[][] field_c;
    static ArgbSprite[] field_i;
    private static Sprite field_g;
    static IndexedSprite[] field_f;
    private static int field_e;
    private static int[] field_o;

    final static void drawRectangleOutline(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareDrawingSupport.drawDashedHorizontalLineAlpha(param0, param1, param2, param4, param5);
        SoftwareDrawingSupport.drawDashedHorizontalLineAlpha(param0, param1 + param3 - 1, param2, param4, param5);
        SoftwareDrawingSupport.drawDashedVerticalLineAlpha(param0 + param2 - 1, param1, param3, param4, param5);
        SoftwareDrawingSupport.drawDashedVerticalLineAlpha(param0, param1, param3, param4, param5);
    }

    private final static void setCircleAlphaNoise(int param0, int param1, int param2, boolean param3) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int incrementValue$4 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var4 = param1 - param2;
        if (var4 < SoftwareRasterizer.field_e) {
          var4 = SoftwareRasterizer.field_e;
        }
        var5 = param1 + param2 + 1;
        if (var5 > SoftwareRasterizer.field_h) {
          var5 = SoftwareRasterizer.field_h;
        }
        var6 = var4;
        var7 = param2 * param2;
        var8 = 0;
        var9 = param1 - var6;
        var10 = var9 * var9;
        var11 = var10 - var9;
        if (param1 > var5) {
          param1 = var5;
        }
        while (var6 < param1) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              var12 = param0 - var8 + 1;
              if (var12 < SoftwareRasterizer.field_b) {
                var12 = SoftwareRasterizer.field_b;
              }
              var13 = param0 + var8;
              if (var13 > SoftwareRasterizer.field_c) {
                var13 = SoftwareRasterizer.field_c;
              }
              var14 = var12 + var6 * SoftwareRasterizer.field_g;
              if (!param3) {
                for (var15 = var12; var15 < var13; var15++) {
                  incrementValue$5 = var14;
                  var14++;
                  SoftwareRasterizer.field_a[incrementValue$5] = SoftwareRasterizer.field_a[incrementValue$5] & 16777215;
                }
              } else {
                for (var15 = var12; var15 < var13; var15++) {
                  incrementValue$6 = var14;
                  var14++;
                  fieldTemp$7 = field_e;
                  field_e = field_e + 1;
                  SoftwareRasterizer.field_a[incrementValue$6] = SoftwareRasterizer.field_a[incrementValue$6] | field_o[fieldTemp$7 % 307];
                }
              }
              var6++;
              incrementValue$8 = var9;
              var9--;
              var10 = var10 - (incrementValue$8 + var9);
              var11 = var11 - (var9 + var9);
              break;
            }
            var10 = var10 + (var8 + var8);
            incrementValue$9 = var8;
            var8++;
            var11 = var11 + (incrementValue$9 + var8);
          }
        }
        var8Lifetime1 = param2;
        var9Lifetime1 = var6 - param1;
        var11Lifetime1 = var9Lifetime1 * var9Lifetime1 + var7;
        var10Lifetime1 = var11Lifetime1 - var8Lifetime1;
        var11Lifetime1 = var11Lifetime1 - var9Lifetime1;
        while (var6 < var5) {
          while (var11Lifetime1 > var7) {
            if (var10Lifetime1 > var7) {
              incrementValue$0 = var8Lifetime1;
              var8Lifetime1--;
              var11Lifetime1 = var11Lifetime1 - (incrementValue$0 + var8Lifetime1);
              var10Lifetime1 = var10Lifetime1 - (var8Lifetime1 + var8Lifetime1);
              continue;
            }
            break;
          }
          var12Lifetime1 = param0 - var8Lifetime1;
          if (var12Lifetime1 < SoftwareRasterizer.field_b) {
            var12Lifetime1 = SoftwareRasterizer.field_b;
          }
          var13Lifetime1 = param0 + var8Lifetime1;
          if (var13Lifetime1 > SoftwareRasterizer.field_c - 1) {
            var13Lifetime1 = SoftwareRasterizer.field_c - 1;
          }
          var14Lifetime1 = var12Lifetime1 + var6 * SoftwareRasterizer.field_g;
          if (!param3) {
            for (var15Lifetime1 = var12Lifetime1; var15Lifetime1 < var13Lifetime1; var15Lifetime1++) {
              incrementValue$1 = var14Lifetime1;
              var14Lifetime1++;
              SoftwareRasterizer.field_a[incrementValue$1] = SoftwareRasterizer.field_a[incrementValue$1] & 16777215;
            }
          } else {
            for (var15Lifetime1 = var12Lifetime1; var15Lifetime1 < var13Lifetime1; var15Lifetime1++) {
              incrementValue$2 = var14Lifetime1;
              var14Lifetime1++;
              fieldTemp$3 = field_e;
              field_e = field_e + 1;
              SoftwareRasterizer.field_a[incrementValue$2] = SoftwareRasterizer.field_a[incrementValue$2] | field_o[fieldTemp$3 % 307];
            }
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          incrementValue$4 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$4 + var9Lifetime1);
        }
        return;
    }

    public static void releaseStatics() {
        field_q = null;
        field_p = null;
        field_j = null;
        field_m = null;
        field_f = null;
        field_k = null;
        field_i = null;
        field_a = null;
        field_b = null;
        field_c = (ArgbSprite[][]) null;
        field_r = (ArgbSprite[][]) null;
        field_l = null;
        field_n = null;
        field_h = (Sprite[][]) null;
        field_g = null;
        field_d = null;
        field_o = null;
    }

    private final static void fillRowsFromColorTable(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param7; var8 < 0; var8++) {
          param2 = param1[param3++];
          for (var9 = -param6; var9 < 0; var9++) {
            param0[param4++] = param2;
          }
          param4 = param4 + param5;
        }
    }

    final static void downscaleByHalf(Sprite param0, ArgbSprite param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int var2 = param0.field_q;
        int var3 = param0.field_w;
        int[] var4 = param0.field_y;
        int[] var5 = param1.field_y;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        while (var8 < var3) {
          for (var9 = 0; var9 < var2; var9 += 2) {
            var10 = var4[var6 + var9];
            var11 = var4[var6 + var9 + 1];
            var12 = var4[var6 + var2 + var9];
            var13 = var4[var6 + var2 + var9 + 1];
            var14 = (-var10 >>> 31) + (-var11 >>> 31) + (-var12 >>> 31) + (-var13 >>> 31) << 6;
            var15 = var14 & 256;
            incrementValue$0 = var7;
            var7++;
            var5[incrementValue$0] = ((var14 | var15 - (var15 >> 8)) << 24) + ((var10 & 16711935) + (var11 & 16711935) + (var12 & 16711935) + (var13 & 16711935) >> 2 & 16711935) + (((var10 & 65280) >>> 2) + ((var11 & 65280) >>> 2) + ((var12 & 65280) >>> 2) + ((var13 & 65280) >>> 2) & 65280);
          }
          var8 += 2;
          var6 = var6 + (param0.field_q << 1);
        }
        param1.field_s = param0.field_s >> 1;
        param1.field_n = param0.field_s >> 1;
        param1.field_o = param0.field_o >> 1;
        param1.field_v = param0.field_v >> 1;
    }

    final static void addRectangleBorderAlphaNoise(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        int incrementValue$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int incrementValue$0 = 0;
        int fieldTemp$1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        var5 = SoftwareRasterizer.field_g * param1 + param0;
        var6 = SoftwareRasterizer.field_g - param2;
        for (var7 = 0; var7 < param4; var7++) {
          for (var8 = 0; var8 < param2; var8++) {
            incrementValue$6 = var5;
            var5++;
            fieldTemp$7 = field_e;
            field_e = field_e + 1;
            SoftwareRasterizer.field_a[incrementValue$6] = SoftwareRasterizer.field_a[incrementValue$6] | field_o[fieldTemp$7 % 307];
          }
          var5 = var5 + var6;
        }
        var7Lifetime1 = param3 - (param4 << 1);
        var8Lifetime1 = param2 - (param4 << 1);
        for (var9 = 0; var9 < var7Lifetime1; var9++) {
          for (var10 = 0; var10 < param4; var10++) {
            incrementValue$4 = var5;
            var5++;
            fieldTemp$5 = field_e;
            field_e = field_e + 1;
            SoftwareRasterizer.field_a[incrementValue$4] = SoftwareRasterizer.field_a[incrementValue$4] | field_o[fieldTemp$5 % 307];
          }
          var5 = var5 + var8Lifetime1;
          for (var10Lifetime2 = 0; var10Lifetime2 < param4; var10Lifetime2++) {
            incrementValue$2 = var5;
            var5++;
            fieldTemp$3 = field_e;
            field_e = field_e + 1;
            SoftwareRasterizer.field_a[incrementValue$2] = SoftwareRasterizer.field_a[incrementValue$2] | field_o[fieldTemp$3 % 307];
          }
          var5 = var5 + var6;
        }
        for (var9Lifetime1 = 0; var9Lifetime1 < param4; var9Lifetime1++) {
          for (var10Lifetime1 = 0; var10Lifetime1 < param2; var10Lifetime1++) {
            incrementValue$0 = var5;
            var5++;
            fieldTemp$1 = field_e;
            field_e = field_e + 1;
            SoftwareRasterizer.field_a[incrementValue$0] = SoftwareRasterizer.field_a[incrementValue$0] | field_o[fieldTemp$1 % 307];
          }
          var5 = var5 + var6;
        }
    }

    final static void darkenRectangle(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var10 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var11;
        var4 = 65793;
        if (param0 < SoftwareRasterizer.field_b) {
          param2 = param2 - (SoftwareRasterizer.field_b - param0);
          param0 = SoftwareRasterizer.field_b;
        }
        if (param1 < SoftwareRasterizer.field_e) {
          param3 = param3 - (SoftwareRasterizer.field_e - param1);
          param1 = SoftwareRasterizer.field_e;
        }
        if (param0 + param2 > SoftwareRasterizer.field_c) {
          param2 = SoftwareRasterizer.field_c - param0;
        }
        if (param1 + param3 > SoftwareRasterizer.field_h) {
          param3 = SoftwareRasterizer.field_h - param1;
        }
        var4 = ((var4 & 16711935) * 150 >> 8 & 16711935) + ((var4 & 65280) * 150 >> 8 & 65280);
        var5 = 106;
        var6 = SoftwareRasterizer.field_g - param2;
        var7 = param0 + param1 * SoftwareRasterizer.field_g;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = var8 & 1;
          for (var10 = (-param2 >> 1) + (param2 & 1); var10 < 0; var10++) {
            var11 = SoftwareRasterizer.field_a[var7 + var9];
            var11 = ((var11 & 16711935) * var5 >> 8 & 16711935) + ((var11 & 65280) * var5 >> 8 & 65280);
            SoftwareRasterizer.field_a[var7 + var9] = var4 + var11;
            var7 += 2;
          }
          var7 = var7 + (var6 + (param2 & 1));
        }
    }

    final static void drawSpriteClipped(Sprite param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 > 640) {
          param3 = 640;
        }
        if (param4 > 480) {
          param4 = 480;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 < 0) {
          param2 = 0;
        }
        int var7 = 640 - param3;
        int var8 = param2 * 640;
        if (param5 == 256) {
          SoftwareDrawingSupport.fillRowsFromColorTable(SoftwareRasterizer.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4);
        } else {
          if (param5 == 240) {
            SoftwareDrawingSupport.blendRowsFifteenSixteenths(SoftwareRasterizer.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4);
          } else {
            SoftwareDrawingSupport.blendRowsFromColorTable(SoftwareRasterizer.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4, param5);
          }
        }
    }

    private final static void drawRotatedParagraph(String param0, BitmapFont param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Sprite var8 = new Sprite(param4, param5);
        PacketBuffer.pushSpriteRaster(-79, var8);
        param1.drawParagraph(param0, 0, 0, param4, param5, param6, -1, 1, 1, 0);
        TeamManagementScreen.e(126);
        var8.drawRotatedBilinear(param2, param3, param7, 4096);
    }

    private final static boolean isAngleInRange(int param0, int param1, int param2) {
        int var3;
        boolean stackIn_7_0 = false;
        boolean decompiledFrameRemainder0 = true;
        param0 = param0 & 8191;
        param1 = param1 & 8191;
        var3 = param1 + param2;
        if ((param0 <= param1 ||
          param0 >= var3) && (param0 >= param1 ||
          var3 < 8192 ||
          param0 >= (var3 & 8191))) {
          stackIn_7_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    private final static void blitBrightnessPixels(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var12 = (param2 & 16711935) * param9 & -16711936;
              var13 = (param2 & 65280) * param9 & 16711680;
              var14 = (var12 | var13) >>> 8;
              if (var14 != 0) {
                param0[param4++] = var14;
              } else {
                param0[param4++] = 65793;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final static void drawMatchScoreSummary(LobbyGameRecord param0, String param1, String param2, int param3, int param4, int param5, int param6) {
        double var12 = 0.0;
        int var14 = 0;
        double var7 = (double)MonotonicClock.monotonicMillis(120);
        double var12Lifetime1;
        int var14Lifetime1;
        param1 = TrinketIcon.a(param1, false);
        param2 = TrinketIcon.a(param2, false);
        int var9 = param0.field_o;
        if (var9 < 0 &&
          param0.field_f >= 5) {
          var9 = param0.field_d ? 1 - param0.field_k : param0.field_k;
        }
        int var10 = var9 == 1 ? 5592405 : 16777215;
        int var11 = var9 == 0 ? 5592405 : 16777215;
        SoftwareRasterizer.fillRectangleAlpha(param3, param4, param5 - 20, param6 - 2 >> 1, 65793, 128);
        SoftwareRasterizer.fillRectangleAlpha(param3 + param5 - 19, param4, 20, param6 - 2 >> 1, 65793, 128);
        AuctionListing.pushRasterClip(param3 + param5 - 20, -22914, param3, param4 + param6, param4);
        if (ByteArrayPool.field_d.stringWidth(param2) > param5 - 20) {
          var12 = (double)(IsSixCommand.field_C.stringWidth(param2) - (param5 - 30));
          var14 = -(int)(Math.sin(var7 / 1000.0) * var12 + var12 / 2.0);
          IsSixCommand.field_C.drawText(param2, param3 + 8 + var14, param4 + (param6 >> 1) - 3, var11, -1);
        } else {
          IsSixCommand.field_C.drawText(param2, param3 + 8, param4 + (param6 >> 1) - 3, var11, -1);
        }
        TeamManagementScreen.e(125);
        IsSixCommand.field_C.drawCentered(Integer.toString(param0.field_b), param3 + param5 - 8, param4 + (param6 >> 1) - 3, var11, -1);
        if (var9 == 0) {
          SoftwareRasterizer.drawLineBlendedInclusive(param3 + 2, param4 + (param6 >> 2), param3 + param5 - 1, param4 + (param6 >> 2), 11141377, 196);
          SoftwareRasterizer.drawLineBlendedInclusive(param3 + 2, param4 + (param6 >> 2) - 1, param3 + param5 - 1, param4 + (param6 >> 2) - 1, 11141377, 196);
        }
        SoftwareRasterizer.fillRectangleAlpha(param3, param4 + (param6 >> 1), param5 - 20, param6 - 2 >> 1, 65793, 128);
        SoftwareRasterizer.fillRectangleAlpha(param3 + param5 - 19, param4 + (param6 >> 1), 20, param6 - 2 >> 1, 65793, 128);
        AuctionListing.pushRasterClip(param3 + param5 - 20, -22914, param3, param4 + param6, param4);
        if (ByteArrayPool.field_d.stringWidth(param1) > param5 - 20) {
          var12Lifetime1 = (double)(IsSixCommand.field_C.stringWidth(param1) - (param5 - 30));
          var14Lifetime1 = -(int)(Math.sin(var7 / 1000.0) * var12Lifetime1 + var12Lifetime1 / 2.0);
          IsSixCommand.field_C.drawText(param1, param3 + 8 + var14Lifetime1, param4 + param6 - 3, var10, -1);
        } else {
          IsSixCommand.field_C.drawText(param1, param3 + 8, param4 + param6 - 3, var10, -1);
        }
        TeamManagementScreen.e(124);
        IsSixCommand.field_C.drawCentered(Integer.toString(param0.field_j), param3 + param5 - 8, param4 + param6 - 3, var10, -1);
        if (var9 == 1) {
          SoftwareRasterizer.drawLineBlendedInclusive(param3 + 2, param4 + 3 * (param6 >> 2), param3 + param5 - 1, param4 + 3 * (param6 >> 2), 11141377, 196);
          SoftwareRasterizer.drawLineBlendedInclusive(param3 + 2, param4 + 3 * (param6 >> 2) - 1, param3 + param5 - 1, param4 + 3 * (param6 >> 2) - 1, 11141377, 196);
          return;
        }
    }

    private final static void blendWhiteMaskPixels(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var8;
        int var11;
        int var12;
        int var13;
        var8 = -param4;
        for (var9 = -param5; var9 < 0; var9++) {
          for (var10 = var8; var10 < 0; var10++) {
            incrementValue$11 = param2;
            param2++;
            var11 = param1[incrementValue$11] & 255;
            if (var11 == 0) {
              param3++;
            } else {
              var12 = 256 - var11;
              var13 = param0[param3];
              incrementValue$12 = param3;
              param3++;
              param0[incrementValue$12] = (16711935 * var11 + (var13 & 16711935) * var12 & -16711936) + (65280 * var11 + (var13 & 65280) * var12 & 16711680) >>> 8;
            }
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    final static void drawCircleCrosshair(int param0, int param1, int param2, int param3) {
        SoftwareRasterizer.drawCircle(param0, param1, param2, param3);
        SoftwareRasterizer.drawHorizontalLine(param0 - param2, param1, param2 << 1, param3);
        SoftwareRasterizer.drawVerticalLine(param0, param1 - param2, param2 << 1, param3);
    }

    final static UiLayoutNode createButtonNode(boolean param0, int param1) {
        ArgbSprite[] var2 = param0 ? field_c[param1] : field_r[param1];
        UiLayoutNode var3 = new UiLayoutNode();
        var3.field_N = (Sprite) ((Object) var2[0].copyArgb());
        var3.field_vb = (Sprite) ((Object) var2[1].copyArgb());
        var3.field_r = (Sprite) ((Object) var2[2].copyArgb());
        var3.field_t = (Sprite) ((Object) var2[3].copyArgb());
        var3.field_q = var2[0].field_o;
        var3.field_mb = var2[0].field_v;
        return var3;
    }

    final static void addRingAlphaNoise(int param0, int param1, int param2, int param3) {
        SoftwareDrawingSupport.setCircleAlphaNoise(param0, param1, param2, true);
        SoftwareDrawingSupport.setCircleAlphaNoise(param0, param1, param2 - param3, false);
    }

    private final static void drawStatBarStrip(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var7 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        for (var7 = 0; var7 < 100; var7++) {
          var8 = (var7 & 3) == param3 ? param6 : 256;
          var9 = ((param2 & 16711935) * var8 & -16711936 | (param2 & 65280) * var8 & 16711680) >> 8;
          SoftwareRasterizer.drawVerticalLine(param0 + var7, param1, 11, var9);
        }
        for (var7Lifetime1 = 0; var7Lifetime1 < 3; var7Lifetime1++) {
          SoftwareRasterizer.drawRectangleAlpha(param0 + var7Lifetime1 - 1, param1 + var7Lifetime1 - 1, 100 - var7Lifetime1 - var7Lifetime1 + 1, 11 - var7Lifetime1 - var7Lifetime1 + 1, 65793, (3 - var7Lifetime1) * param4);
        }
        var7Lifetime2 = param5 * 65793;
        SoftwareRasterizer.fillVerticalGradientAdditive(param0, param1, 100, 2, 0, var7Lifetime2);
        SoftwareRasterizer.fillVerticalGradientAdditive(param0, param1 + 2, 100, 4, var7Lifetime2, 0);
    }

    private final static void blendRowsFifteenSixteenths(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$1 = 0;
        for (var8 = -param7; var8 < 0; var8++) {
          param2 = param1[param3++];
          for (var9 = -param6; var9 < 0; var9++) {
            var10 = param0[param4];
            incrementValue$1 = param4;
            param4++;
            param0[incrementValue$1] = ((param2 & 16711935) * 15 + (var10 & 16711935) & 267390960) + ((param2 & 65280) * 15 + (var10 & 65280) & 1044480) >> 4;
          }
          param4 = param4 + param5;
        }
    }

    final static void buildSharedControlSprites() {
        int var6 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_23_0 = null;
        int stackIn_26_0 = 0;
        int var0_int;
        String var0;
        int var1;
        Object var2;
        int var3;
        int var4;
        int var5;
        Sprite var7;
        int var0_intLifetime1;
        int var0_intLifetime2;
        int var1Lifetime1;
        int var5Lifetime1;
        field_r = new ArgbSprite[3][4];
        field_c = new ArgbSprite[3][4];
        for (var0_int = 0; var0_int < 3; var0_int++) {
          field_r[var0_int][0] = field_k[var0_int];
          field_r[var0_int][1] = SoftwareDrawingSupport.createHighlightedArgbCopy((Sprite) (field_r[var0_int][0]));
          field_r[var0_int][2] = field_i[var0_int];
          field_r[var0_int][3] = field_k[var0_int].copyArgb();
          SpritePixelSupport.adjustSpriteHsv(field_r[var0_int][3], 0.0, 0.0, 0.7);
        }
        for (var0_intLifetime1 = 0; var0_intLifetime1 < 3; var0_intLifetime1++) {
          for (var1 = 0; var1 < 4; var1++) {
            field_c[var0_intLifetime1][var1] = field_r[var0_intLifetime1][var1].copyArgb();
            field_c[var0_intLifetime1][var1].flipHorizontalInPlace();
          }
        }
        field_l = new Sprite[3];
        for (var0_intLifetime2 = 0; var0_intLifetime2 < 3; var0_intLifetime2++) {
          field_l[var0_intLifetime2] = (Sprite) ((Object) field_a.copyArgb());
          field_l[var0_intLifetime2].flipVertically();
        }
        SpritePixelSupport.adjustSpriteHsv(field_l[0], 0.321875, 1.0, 1.0);
        SpritePixelSupport.adjustSpriteHsv(field_l[2], 0.74375, 1.0, 1.0);
        var0 = TickClock.field_f.toLowerCase();
        if (ArchiveRequest.field_r != 3) {
          if (ArchiveRequest.field_r != 2) {
            stackIn_20_0 = (ArchiveRequest.field_r == 1) ? 1 : 0;
          } else {
            stackIn_20_0 = 1;
          }
        } else {
          stackIn_20_0 = 1;
        }
        var1Lifetime1 = stackIn_20_0;
        if (var1Lifetime1 == 0) {
          stackIn_23_0 = ByteArrayPool.field_d;
        } else {
          stackIn_23_0 = ConsoleTokenCursor.field_d;
        }
        var2 = stackIn_23_0;
        stackIn_26_0 = (var1Lifetime1 == 0) ? 24 : 12;
        var3 = stackIn_26_0;
        var4 = ((BitmapFont) (var2)).stringWidth(var0) + var3;
        field_n = new Sprite[4];
        for (var5 = 0; var5 < 4; var5++) {
          field_n[var5] = AccountRegistrationPanel.createButtonStateSprite(true, (byte) -52, var5, var4, 7126504);
          PacketBuffer.pushSpriteRaster(-41, field_n[var5]);
          ((BitmapFont) (var2)).drawCentered(var0, SoftwareRasterizer.field_g >> 1, SoftwareRasterizer.field_f - 8, 16777215, -1);
          TeamManagementScreen.e(127);
        }
        field_g = new Sprite(102, 13);
        PacketBuffer.pushSpriteRaster(-67, field_g);
        SoftwareDrawingSupport.drawStatBarStrip(1, 1, 10066329, 2, 20, 0, 200);
        SoftwareRasterizer.drawRectangle(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, 65793);
        TeamManagementScreen.e(124);
        field_h = new Sprite[4][4];
        for (var5Lifetime1 = 0; var5Lifetime1 < 4; var5Lifetime1++) {
          for (var6 = 0; var6 < 4; var6++) {
            var7 = new Sprite(100, 11);
            PacketBuffer.pushSpriteRaster(81, var7);
            SoftwareDrawingSupport.drawStatBarStrip(0, 0, LoginForm.field_B[var5Lifetime1], var6, 40, 90, 160);
            TeamManagementScreen.e(120);
            field_h[var5Lifetime1][var6] = var7;
          }
        }
    }

    private final static UiLayoutNode createTextButton(String param0, int param1, BitmapFont param2) {
        int var3 = param2.stringWidth(param0) + 24;
        return SoftwareDrawingSupport.createRenderedButton(param0, param1, param2, var3, true);
    }

    private final static void darkenScaledPackedMaskPixels(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        int var12 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
          var15 = (param4 >> 16) * param11;
          for (var16 = -param7; var16 < 0; var16++) {
            var17 = param3 >> 16;
            param2 = param1[(var17 >> 3) + var15];
            if ((param2 & 1 << (var17 & 7)) != 0) {
              var13 = param0[param5];
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((var13 & 16711935) * 7 & 133695480 | (var13 & 65280) * 7 & 522240) >> 3;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var12;
          param5 = param5 + param6;
        }
    }

    final static UiLayoutNode createDefaultButtonNode() {
        UiLayoutNode var0 = new UiLayoutNode();
        var0.field_N = field_n[0];
        var0.field_vb = field_n[1];
        var0.field_r = field_n[2];
        var0.field_t = field_n[3];
        var0.field_q = var0.field_N.field_o;
        var0.field_mb = var0.field_N.field_v;
        return var0;
    }

    final static void drawSpriteWithBrightness(Sprite param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param3 == 256) {
          param0.draw(param1, param2);
          return;
        }
        param1 = param1 + param0.field_s;
        param2 = param2 + param0.field_n;
        int var4 = param1 + param2 * SoftwareRasterizer.field_g;
        int var5 = 0;
        int var6 = param0.field_w;
        int var7 = param0.field_q;
        int var8 = SoftwareRasterizer.field_g - var7;
        int var9 = 0;
        if (param2 < SoftwareRasterizer.field_e) {
          var10 = SoftwareRasterizer.field_e - param2;
          var6 = var6 - var10;
          param2 = SoftwareRasterizer.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.field_g;
        }
        if (param2 + var6 > SoftwareRasterizer.field_h) {
          var6 = var6 - (param2 + var6 - SoftwareRasterizer.field_h);
        }
        if (param1 < SoftwareRasterizer.field_b) {
          var10Lifetime1 = SoftwareRasterizer.field_b - param1;
          var7 = var7 - var10Lifetime1;
          param1 = SoftwareRasterizer.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > SoftwareRasterizer.field_c) {
          var10Lifetime2 = param1 + var7 - SoftwareRasterizer.field_c;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          SoftwareDrawingSupport.blitBrightnessPixels(SoftwareRasterizer.field_a, param0.field_y, 0, var5, var4, var7, var6, var8, var9, param3);
          return;
        }
    }

    final static IndexedSprite toIndexedSprite(Sprite param0) {
        int var3 = 0;
        IndexedSprite var1;
        int[] var2;
        int var4;
        int var5;
        AccountNameAvailabilityValidator.quantizeColors(true, param0.field_y, 255);
        var1 = new IndexedSprite(param0.field_q, param0.field_w, 256);
        var2 = var1.field_l;
        for (var3 = 0; var3 < param0.field_y.length; var3++) {
          var4 = param0.field_y[var3];
          if (var4 != 0) {
            for (var5 = 1; var5 < 256; var5++) {
              if (var2[var5] != 0 &&
                var4 != var2[var5]) {
                continue;
              }
              break;
            }
            var2[var5] = var4;
            var1.field_m[var3] = (byte)var5;
          }
        }
        return var1;
    }

    private final static ArgbSprite createHighlightedArgbCopy(Sprite param0) {
        ArgbSprite var1 = ((ArgbSprite) (param0)).copyArgb();
        PacketBuffer.pushSpriteRaster(-112, var1);
        param0.drawAdditive(0, 0, 90);
        TeamManagementScreen.e(117);
        return var1;
    }

    final static void drawPackedShadowMask(byte[] param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var5 = param1 + param2 * SoftwareRasterizer.field_g;
        int var6 = 0;
        int var7 = SoftwareRasterizer.field_g - param3;
        int var8 = 0;
        int var9 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param2 < SoftwareRasterizer.field_e) {
          var10 = SoftwareRasterizer.field_e - param2;
          param4 = param4 - var10;
          param2 = SoftwareRasterizer.field_e;
          var6 = var6 + var10 * (param3 >> 3);
          var5 = var5 + var10 * SoftwareRasterizer.field_g;
        }
        if (param2 + param4 > SoftwareRasterizer.field_h) {
          param4 = param4 - (param2 + param4 - SoftwareRasterizer.field_h);
        }
        if (param1 < SoftwareRasterizer.field_b) {
          var10Lifetime1 = SoftwareRasterizer.field_b - param1;
          param3 = param3 - var10Lifetime1;
          param1 = SoftwareRasterizer.field_b;
          var6 = var6 + (var10Lifetime1 >> 3);
          var9 = (byte)(1 << (var10Lifetime1 & 7));
          var5 = var5 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
          var7 = var7 + var10Lifetime1;
        }
        if (param1 + param3 > SoftwareRasterizer.field_c) {
          var10Lifetime2 = param1 + param3 - SoftwareRasterizer.field_c;
          param3 = param3 - var10Lifetime2;
          var8 = var8 + var10Lifetime2;
          var7 = var7 + var10Lifetime2;
        }
        if (param3 > 0) {
          if (param4 <= 0) {
            return;
          }
          SoftwareDrawingSupport.darkenPackedMaskPixels(SoftwareRasterizer.field_a, param0, (byte) 0, (byte) var9, var6, var5, param3, param4, var7, var8 >> 3);
          return;
        }
    }

    private final static void drawDashedVerticalLineAlpha(int param0, int param1, int param2, int param3, int param4) {
        int var13 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        if (param0 < SoftwareRasterizer.field_b) {
          return;
        }
        if (param0 >= SoftwareRasterizer.field_c) {
          return;
        }
        if (param1 < SoftwareRasterizer.field_e) {
          param2 = param2 - (SoftwareRasterizer.field_e - param1);
          param1 = SoftwareRasterizer.field_e;
        }
        if (param1 + param2 > SoftwareRasterizer.field_h) {
          param2 = SoftwareRasterizer.field_h - param1;
        }
        var5 = 256 - param4;
        var6 = (param3 >> 16 & 255) * param4;
        var7 = (param3 >> 8 & 255) * param4;
        var8 = (param3 & 255) * param4;
        var12 = param0 + param1 * SoftwareRasterizer.field_g;
        for (var13 = 0; var13 < param2; var13++) {
          if ((var13 & 2) != 0) {
            var9 = (SoftwareRasterizer.field_a[var12] >> 16 & 255) * var5;
            var10 = (SoftwareRasterizer.field_a[var12] >> 8 & 255) * var5;
            var11 = (SoftwareRasterizer.field_a[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            SoftwareRasterizer.field_a[var12] = var14;
            var12 = var12 + SoftwareRasterizer.field_g;
          } else {
            var12 = var12 + SoftwareRasterizer.field_g;
          }
        }
        return;
    }

    final static UiLayoutNode createRenderedButton(String param0, int param1, BitmapFont param2, int param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        param0 = param0.toLowerCase();
        Sprite[] var5 = new Sprite[4];
        for (var6_int = 0; var6_int < 4; var6_int++) {
          var5[var6_int] = AccountRegistrationPanel.createButtonStateSprite(param4, (byte) -52, var6_int, param3, param1);
          PacketBuffer.pushSpriteRaster(-52, var5[var6_int]);
          var7 = param4 ? 8 : 9;
          param2.drawCentered(param0, SoftwareRasterizer.field_g >> 1, SoftwareRasterizer.field_f - var7, 16777215, -1);
          TeamManagementScreen.e(122);
        }
        UiLayoutNode var6 = new UiLayoutNode();
        var6.field_N = var5[0];
        var6.field_vb = var5[1];
        var6.field_r = var5[2];
        var6.field_t = var5[3];
        var6.field_q = var6.field_N.field_o;
        var6.field_mb = var6.field_N.field_v;
        return var6;
    }

    final static byte[] createFadingRadialMask(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var4 = 256 - (param2 - param1 << 8) / param2;
        ArgbSprite var5 = new ArgbSprite(param3, param3);
        PacketBuffer.pushSpriteRaster(-38, var5);
        SoftwareRasterizer.drawRadialGlow(SoftwareRasterizer.field_g << 3, SoftwareRasterizer.field_f << 3, SoftwareRasterizer.field_g << 3, param0.length - 1, param0);
        TeamManagementScreen.e(122);
        byte[] var6 = new byte[var5.field_y.length];
        for (var7 = 0; var7 < var6.length; var7++) {
          var8 = var5.field_y[var7];
          for (var9 = 0; var9 < 3 - (var4 >> 6); var9++) {
            var8 = var8 * var8 >> 8;
          }
          var6[var7] = (byte)(var8 * var4 >> 8);
        }
        return var6;
    }

    final static ArgbSprite mirrorVertically(ArgbSprite param0) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        int var1 = param0.field_o;
        int var2 = param0.field_v;
        ArgbSprite var3 = new ArgbSprite(var1, var2);
        int var4 = 0;
        for (var5 = 0; var5 < var2; var5++) {
          for (var6 = 0; var6 < var1; var6++) {
            incrementValue$0 = var4;
            var4++;
            var3.field_y[(var2 - var5 - 1) * var1 + var6] = param0.field_y[incrementValue$0];
          }
        }
        return var3;
    }

    final static void drawScaledPackedShadowMask(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var13 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = (param3 << 16) / param5;
        int var10 = (param4 << 16) / param6;
        int var11 = param1 + param2 * SoftwareRasterizer.field_g;
        int var12 = SoftwareRasterizer.field_g - param5;
        int var13Lifetime1;
        int var13Lifetime2;
        if (param2 + param6 > SoftwareRasterizer.field_h) {
          param6 = param6 - (param2 + param6 - SoftwareRasterizer.field_h);
        }
        if (param2 < SoftwareRasterizer.field_e) {
          var13 = SoftwareRasterizer.field_e - param2;
          param6 = param6 - var13;
          var11 = var11 + var13 * SoftwareRasterizer.field_g;
          var8 = var8 + var10 * var13;
        }
        if (param1 + param5 > SoftwareRasterizer.field_c) {
          var13Lifetime1 = param1 + param5 - SoftwareRasterizer.field_c;
          param5 = param5 - var13Lifetime1;
          var12 = var12 + var13Lifetime1;
        }
        if (param1 < SoftwareRasterizer.field_b) {
          var13Lifetime2 = SoftwareRasterizer.field_b - param1;
          param5 = param5 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var7 = var7 + var9 * var13Lifetime2;
          var12 = var12 + var13Lifetime2;
        }
        SoftwareDrawingSupport.darkenScaledPackedMaskPixels(SoftwareRasterizer.field_a, param0, 0, var7, var8, var11, var12, param5, param6, var9, var10, param3 >> 3);
    }

    final static void addRectangleAlphaNoise(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int fieldTemp$1 = 0;
        int var4 = SoftwareRasterizer.field_g * param1 + param0;
        int var5 = SoftwareRasterizer.field_g - param2;
        for (var6 = 0; var6 < param3; var6++) {
          for (var7 = 0; var7 < param2; var7++) {
            incrementValue$0 = var4;
            var4++;
            fieldTemp$1 = field_e;
            field_e = field_e + 1;
            SoftwareRasterizer.field_a[incrementValue$0] = SoftwareRasterizer.field_a[incrementValue$0] | field_o[fieldTemp$1 % 307];
          }
          var4 = var4 + var5;
        }
    }

    final static void drawStatBar(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        Sprite var6_ref_ut = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$38 = null;
        StringBuilder discarded$39 = null;
        StringBuilder discarded$40 = null;
        StringBuilder discarded$41 = null;
        StringBuilder discarded$42 = null;
        if (param2 > 100) {
          var6_ref_ut = new Sprite(102, 13);
          PacketBuffer.pushSpriteRaster(73, var6_ref_ut);
          SoftwareDrawingSupport.drawStatBar(0, 0, param2 - 100, param3, false, 0);
          TeamManagementScreen.e(126);
          var6_ref_ut.drawAlpha(param0 + 3, param1 + 7, 128);
          param5 = param5 + (param2 - 100);
          param2 = 100;
        }
        int var6 = (int)(MonotonicClock.monotonicMillis(74) % 220L);
        var6 = (var6 << 2) / 220;
        field_g.drawOpaque(param0 - 1, param1 - 1);
        AuctionListing.pushRasterClip(param0 + param2, -22914, param0, param1 + 11, param1);
        field_h[param3][var6].drawOpaque(param0, param1);
        TeamManagementScreen.e(127);
        SoftwareRasterizer.drawRectangle(param0 - 1, param1 - 1, 102, 13, 65793);
        if (param4) {
          PacketBuffer.pushSpriteRaster(-38, field_d);
          SoftwareRasterizer.clearFramebuffer();
          var7 = 131586;
          var8 = 10;
          var9 = 54 - (param5 != 0 ? var8 : 0);
          ConsoleTokenCursor.field_d.drawRightAligned(AccountChoicePanel.field_G[param3], var9, 10, 16777215, var7);
          var10 = new StringBuilder(Integer.toString(param2));
          if (param5 != 0) {
            discarded$12 = var10.append("<col=");
            discarded$25 = var10.append(param5 < 0 ? "ffaaaa" : "ccff99");
            discarded$38 = var10.append('>');
            discarded$39 = var10.append(param5 < 0 ? '-' : '+');
            discarded$40 = var10.append(Math.abs(param5));
            discarded$41 = var10.append("</col>");
          }
          discarded$42 = var10.append('%');
          ConsoleTokenCursor.field_d.drawText(var10.toString(), var9 + 4, 10, 16777215, var7);
          TeamManagementScreen.e(127);
          SoftwareDrawingSupport.outlineSpriteInPlace(field_d, 65793);
          field_d.draw(param0, param1);
          return;
        }
    }

    final static void initializeAlphaNoise(int param0, int param1) {
        int var3 = 0;
        Random var2 = new Random();
        for (var3 = 0; var3 < field_o.length; var3++) {
          field_o[var3] = param0 + ProxySocketConnector.nextBoundedInt(113, param1, var2) << 24;
        }
    }

    final static int drawStatisticsTable(int param0, int param1, String[] param2, int[][] param3, String[] param4, int param5, int param6, int param7, String[] param8, int param9) {
        int var22 = 0;
        CoverageBitmapFont stackIn_12_0;
        String stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        int stackIn_13_4;
        int stackIn_18_0 = 0;
        CoverageBitmapFont stackIn_22_0;
        String stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_4;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        String var21;
        int var23;
        String var24;
        String var25;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        var10 = param0;
        var11 = 64;
        var12 = 60;
        var13 = 60;
        var14 = param2.length;
        var15 = 128;
        var16 = 65793;
        var17 = 4;
        for (var18 = 0; var18 < var14; var18++) {
          for (var19 = 0; var19 < var11; var19++) {
            SoftwareRasterizer.drawLineBlendedInclusive(param0, param1, param0 + var13, param1 - var12, var16, var15);
            param0++;
          }
          SoftwareDrawingSupport.drawRotatedParagraph(param2[var18], ByteArrayPool.field_d, param0, param1 - (var12 >> 1), var11, var12, 16777215, 8192);
          param0 = param0 + var17;
        }
        param0 = var10;
        var18Lifetime1 = param5;
        param1 = param1 + var17;
        for (var19Lifetime1 = 0; var19Lifetime1 < param7; var19Lifetime1++) {
          var20 = var16;
          if (var19Lifetime1 == param9) {
            var20 = 11184810;
          }
          SoftwareRasterizer.fillRectangleAlpha(param0 - var18Lifetime1 - var17, param1 + var19Lifetime1 * (param6 + var17), var18Lifetime1, param6, var20, var15);
          var21 = param8[var19Lifetime1].toLowerCase();
          stackIn_12_0 = ByteArrayPool.field_d;
          stackIn_12_1 = var21;
          stackIn_12_2 = param0 - (var18Lifetime1 >> 1);
          stackIn_12_3 = param1 + var19Lifetime1 * (param6 + var17) + (param6 + var17 + 5 >> 1);
          if (var19Lifetime1 != param9) {
            stackIn_13_4 = 11184810;
          } else {
            stackIn_13_4 = 16777215;
          }
          ((CoverageBitmapFont) (Object) stackIn_12_0).drawCentered(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_13_4, -1);
          for (var22 = 0; var22 < var14; var22++) {
            SoftwareRasterizer.fillRectangleAlpha(param0 + var22 * (var11 + var17), param1 + var19Lifetime1 * (param6 + var17), var11, param6, var20, var15);
            if (param3 != null) {
              stackIn_18_0 = param3[var19Lifetime1][var22];
            } else {
              stackIn_18_0 = -1;
            }
            var23 = stackIn_18_0;
            var25 = Integer.toString(var23);
            var24 = var25;
            if (param4 != null) {
              var24 = var25 + param4[var22];
            }
            stackIn_22_0 = ByteArrayPool.field_d;
            stackIn_22_1 = var24;
            stackIn_22_2 = param0 + (var22 + 1) * (var11 + var17) - (var11 + var17 >> 1);
            stackIn_22_3 = param1 + var19Lifetime1 * (param6 + var17) + (param6 + var17 + 5 >> 1);
            if (var19Lifetime1 != param9) {
              stackIn_23_4 = 11184810;
            } else {
              stackIn_23_4 = 16777215;
            }
            ((CoverageBitmapFont) (Object) stackIn_22_0).drawCentered(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_23_4, -1);
          }
        }
        for (var19Lifetime2 = 0; var19Lifetime2 < 16; var19Lifetime2++) {
          for (var20Lifetime1 = 0; var20Lifetime1 < var14; var20Lifetime1++) {
            SoftwareRasterizer.drawHorizontalLineAlpha(param0 + var20Lifetime1 * (var11 + var17), param1 + param7 * (param6 + var17) + var19Lifetime2, var11, 65793, 128 - (var19Lifetime2 << 3));
          }
          SoftwareRasterizer.drawHorizontalLineAlpha(param0 - var18Lifetime1 - var17, param1 + param7 * (param6 + var17) + var19Lifetime2, var18Lifetime1, 65793, 128 - (var19Lifetime2 << 3));
        }
        return param1;
    }

    final static UiLayoutNode createTextButton(String param0, int param1) {
        return SoftwareDrawingSupport.createTextButton(param0, param1, ByteArrayPool.field_d);
    }

    private final static void blendRowsFromColorTable(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$1 = 0;
        int var9 = 256 - param8;
        for (var10 = -param7; var10 < 0; var10++) {
          param2 = param1[param3++];
          for (var11 = -param6; var11 < 0; var11++) {
            var12 = param0[param4];
            incrementValue$1 = param4;
            param4++;
            param0[incrementValue$1] = ((param2 & 16711935) * param8 + (var12 & 16711935) * var9 & -16711936) + ((param2 & 65280) * param8 + (var12 & 65280) * var9 & 16711680) >> 8;
          }
          param4 = param4 + param5;
        }
    }

    private final static void darkenPackedMaskPixels(int[] param0, byte[] param1, byte param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var11 = 0;
        int var10 = param3;
        if (var10 == 0) {
          var10 = 1;
        }
        for (var12 = -param7; var12 < 0; var12++) {
          incrementValue$0 = param4;
          param4++;
          param2 = param1[incrementValue$0];
          param3 = (byte) var10;
          for (var13 = -param6; var13 < 0; var13++) {
            if (param3 == 0) {
              param3 = (byte) 1;
              incrementValue$1 = param4;
              param4++;
              param2 = param1[incrementValue$1];
            }
            if ((param2 & param3) != 0) {
              var11 = param0[param5];
              incrementValue$2 = param5;
              param5++;
              param0[incrementValue$2] = ((var11 & 16711935) * 7 & 133695480 | (var11 & 65280) * 7 & 522240) >> 3;
            } else {
              param5++;
            }
            param3 = (byte)(param3 << 1);
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final static void drawWhiteAlphaMask(byte[] param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var4 = param1 + param2 * SoftwareRasterizer.field_g;
        int var5 = 0;
        int var6 = param3;
        int var7 = param3;
        int var8 = SoftwareRasterizer.field_g - var7;
        int var9 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param2 < SoftwareRasterizer.field_e) {
          var10 = SoftwareRasterizer.field_e - param2;
          var6 = var6 - var10;
          param2 = SoftwareRasterizer.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.field_g;
        }
        if (param2 + var6 > SoftwareRasterizer.field_h) {
          var6 = var6 - (param2 + var6 - SoftwareRasterizer.field_h);
        }
        if (param1 < SoftwareRasterizer.field_b) {
          var10Lifetime1 = SoftwareRasterizer.field_b - param1;
          var7 = var7 - var10Lifetime1;
          param1 = SoftwareRasterizer.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > SoftwareRasterizer.field_c) {
          var10Lifetime2 = param1 + var7 - SoftwareRasterizer.field_c;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          SoftwareDrawingSupport.blendWhiteMaskPixels(SoftwareRasterizer.field_a, param0, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    private final static void drawDashedHorizontalLineAlpha(int param0, int param1, int param2, int param3, int param4) {
        int var13 = 0;
        int incrementValue$0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        if (param1 < SoftwareRasterizer.field_e) {
          return;
        }
        if (param1 >= SoftwareRasterizer.field_h) {
          return;
        }
        if (param0 < SoftwareRasterizer.field_b) {
          param2 = param2 - (SoftwareRasterizer.field_b - param0);
          param0 = SoftwareRasterizer.field_b;
        }
        if (param0 + param2 > SoftwareRasterizer.field_c) {
          param2 = SoftwareRasterizer.field_c - param0;
        }
        var5 = 256 - param4;
        var6 = (param3 >> 16 & 255) * param4;
        var7 = (param3 >> 8 & 255) * param4;
        var8 = (param3 & 255) * param4;
        var12 = param0 + param1 * SoftwareRasterizer.field_g;
        for (var13 = 0; var13 < param2; var13++) {
          if ((var13 & 2) != 0) {
            var9 = (SoftwareRasterizer.field_a[var12] >> 16 & 255) * var5;
            var10 = (SoftwareRasterizer.field_a[var12] >> 8 & 255) * var5;
            var11 = (SoftwareRasterizer.field_a[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            incrementValue$0 = var12;
            var12++;
            SoftwareRasterizer.field_a[incrementValue$0] = var14;
          } else {
            var12++;
          }
        }
        return;
    }

    private final static void multiplyScaledPixels(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        long var17 = 0L;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int incrementValue$0 = 0;
        int var16 = param3;
        while (param8 < 0) {
          param7 = (param9 >> 16) * param15;
          for (param6 = -param12; param6 < 0; param6++) {
            param0 = param4[(param3 >> 16) + param7];
            if (param0 != 0) {
              param1 = param5[param10];
              var17 = (long)(param0 & 16711935) * (long)(param1 & 16711935);
              var19 = (int)(var17 >> 24) & 16711680;
              var20 = ((param0 & 65280) >> 8) * (param1 & 65280) & 16711680;
              var21 = (int)var17 & 65280;
              incrementValue$0 = param10;
              param10++;
              param5[incrementValue$0] = var19 | (var20 | var21) >>> 8;
            } else {
              param10++;
            }
            param3 = param3 + param13;
          }
          param9 = param9 + param14;
          param3 = var16;
          param10 = param10 + param11;
          param8++;
        }
    }

    private final static void blendScaledWhiteMaskPixels(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var16 = 0;
        int var11 = param2;
        for (var12 = -param7; var12 < 0; var12++) {
          var13 = (param3 >> 16) * param10;
          for (var14 = -param6; var14 < 0; var14++) {
            var15 = param1[(param2 >> 16) + var13] & 255;
            if (var15 != 0) {
              var16 = 256 - var15;
              var17 = param0[param4];
              incrementValue$0 = param4;
              param4++;
              param0[incrementValue$0] = (16711935 * var15 + (var17 & 16711935) * var16 & -16711936) + (65280 * var15 + (var17 & 65280) * var16 & 16711680) >>> 8;
            } else {
              param4++;
            }
            param2 = param2 + param8;
          }
          param3 = param3 + param9;
          param2 = var11;
          param4 = param4 + param5;
        }
    }

    final static void drawScaledMultiplySprite(Sprite param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (param3 > 0) {
          if (param4 <= 0) {
            return;
          }
          var5 = param0.field_q;
          var6 = param0.field_w;
          var7 = 0;
          var8 = 0;
          var9 = param0.field_o;
          var10 = param0.field_v;
          var11 = (var9 << 16) / param3;
          var12 = (var10 << 16) / param4;
          if (param0.field_s > 0) {
            var13 = ((param0.field_s << 16) + var11 - 1) / var11;
            param1 = param1 + var13;
            var7 = var7 + (var13 * var11 - (param0.field_s << 16));
          }
          if (param0.field_n > 0) {
            var13Lifetime1 = ((param0.field_n << 16) + var12 - 1) / var12;
            param2 = param2 + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (param0.field_n << 16));
          }
          if (var5 < var9) {
            param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          var13Lifetime2 = param1 + param2 * SoftwareRasterizer.field_g;
          var14 = SoftwareRasterizer.field_g - param3;
          if (param2 + param4 > SoftwareRasterizer.field_h) {
            param4 = param4 - (param2 + param4 - SoftwareRasterizer.field_h);
          }
          if (param2 < SoftwareRasterizer.field_e) {
            var15 = SoftwareRasterizer.field_e - param2;
            param4 = param4 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * SoftwareRasterizer.field_g;
            var8 = var8 + var12 * var15;
          }
          if (param1 + param3 > SoftwareRasterizer.field_c) {
            var15Lifetime1 = param1 + param3 - SoftwareRasterizer.field_c;
            param3 = param3 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param1 < SoftwareRasterizer.field_b) {
            var15Lifetime2 = SoftwareRasterizer.field_b - param1;
            param3 = param3 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          SoftwareDrawingSupport.multiplyScaledPixels(0, 0, 0, var7, param0.field_y, SoftwareRasterizer.field_a, 0, 0, -param4, var8, var13Lifetime2, var14, param3, var11, var12, var5);
          return;
        }
    }

    final static byte[] createRotatingArcMask(int[] param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var3;
        int var4;
        int var5;
        ArgbSprite var6;
        byte[] var7;
        int var8;
        int var11;
        int var12;
        int var13;
        var3 = (param2 - param1) * 3000 / param2 + 1092;
        var4 = var3 * var3 >> 8;
        var5 = var3 * var3 >> 12;
        var6 = new ArgbSprite(72, 72);
        PacketBuffer.pushSpriteRaster(-115, var6);
        SoftwareRasterizer.drawRadialGlow(SoftwareRasterizer.field_g << 3, SoftwareRasterizer.field_f << 3, SoftwareRasterizer.field_g << 3, param0.length - 1, param0);
        TeamManagementScreen.e(119);
        var7 = new byte[var6.field_y.length];
        var8 = 0;
        for (var9 = -36; var9 < 36; var9++) {
          for (var10 = -36; var10 < 36; var10++) {
            var11 = var6.field_y[var8];
            if (var11 != 0) {
              var12 = PlayerContextMenu.angleFromVector(var9, var10, (byte) 2) + 8192 + 2048 & 8191;
              if (SoftwareDrawingSupport.isAngleInRange(var12, var4, var5) ||
                SoftwareDrawingSupport.isAngleInRange(var12, var4 + 4096, var5)) {
                var13 = Math.min(255, Math.min(Math.min(Math.abs((var4 + 4096 & 8191) - var12), Math.abs((var4 + var5 + 4096 & 8191) - var12)), Math.min(Math.abs((var4 & 8191) - var12), Math.abs((var4 + var5 & 8191) - var12))));
                var7[var8] = (byte)(var11 * var13 >> 8);
              }
            }
            var8++;
          }
        }
        return var7;
    }

    final static void captureRasterThroughSpriteMask(Sprite param0, Sprite param1, int param2) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        var3 = param2;
        var4 = 0;
        var5 = param0.field_v;
        var6 = param0.field_o;
        var7 = 640 - var6;
        var8 = 0;
        if (param2 < SoftwareRasterizer.field_b) {
          var9 = SoftwareRasterizer.field_b - param2;
          var6 = var6 - var9;
          param2 = SoftwareRasterizer.field_b;
          var4 = var4 + var9;
          var3 = var3 + var9;
          var8 = var8 + var9;
          var7 = var7 + var9;
        }
        if (param2 + var6 > SoftwareRasterizer.field_c) {
          var9Lifetime1 = param2 + var6 - SoftwareRasterizer.field_c;
          var6 = var6 - var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (var6 <= 0) {
          return;
        }
        if (var5 <= 0) {
          return;
        }
        for (var9Lifetime2 = -var5; var9Lifetime2 < 0; var9Lifetime2++) {
          for (var10 = -var6; var10 < 0; var10++) {
            if (param1.field_y[var4] == 0) {
              incrementValue$0 = var4;
              var4++;
              param0.field_y[incrementValue$0] = 0;
              var3++;
            } else {
              incrementValue$1 = var4;
              var4++;
              incrementValue$2 = var3;
              var3++;
              param0.field_y[incrementValue$1] = SoftwareRasterizer.field_a[incrementValue$2];
            }
          }
          var3 = var3 + var7;
          var4 = var4 + var8;
        }
    }

    final static ArgbSprite mirrorHorizontally(ArgbSprite param0) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        int var1 = param0.field_o;
        int var2 = param0.field_v;
        ArgbSprite var3 = new ArgbSprite(var1, var2);
        int var4 = 0;
        for (var5 = 0; var5 < var2; var5++) {
          for (var6 = 0; var6 < var1; var6++) {
            incrementValue$0 = var4;
            var4++;
            var3.field_y[var5 * var1 + (var1 - var6 - 1)] = param0.field_y[incrementValue$0];
          }
        }
        return var3;
    }

    final static void outlineSpriteInPlace(Sprite param0, int param1) {
        int var6 = 0;
        int var7 = 0;
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int[] var9;
        int[] var10;
        var2 = 0;
        var10 = param0.field_y;
        var9 = var10;
        var3 = var9;
        var4 = param0.field_w;
        var5 = param0.field_q;
        for (var6 = 0; var6 < var4; var6++) {
          for (var7 = 0; var7 < var5; var7++) {
            var8 = var10[var2];
            if (var8 == 0) {
              if (var7 > 0 &&
                var3[var2 - 1] != 0 &&
                var3[var2 - 1] != param1) {
                var8 = param1;
              } else {
                if (var6 > 0 &&
                  var3[var2 - var5] != 0 &&
                  var3[var2 - var5] != param1) {
                  var8 = param1;
                } else {
                  if (var7 < var5 - 1 &&
                    var3[var2 + 1] != 0 &&
                    var3[var2 + 1] != param1) {
                    var8 = param1;
                  } else {
                    if (var6 < var4 - 1 &&
                      var3[var2 + var5] != 0 &&
                      var3[var2 + var5] != param1) {
                      var8 = param1;
                    }
                  }
                }
              }
            }
            var3[var2++] = var8;
          }
        }
    }

    final static void drawScaledWhiteAlphaMask(byte[] param0, int param1, int param2, int param3, int param4) {
        int var19 = 0;
        int var5 = param4;
        int var6 = param4;
        int var7 = param3;
        int var8 = param3;
        int var9 = param3;
        int var10 = param3;
        int var11 = 0;
        int var12 = 0;
        int var13 = var7;
        int var14 = var8;
        int var15 = (var13 << 16) / var5;
        int var16 = (var14 << 16) / var6;
        int var19Lifetime1;
        int var19Lifetime2;
        if (var9 < var13) {
          var5 = ((var9 << 16) - var11 + var15 - 1) / var15;
        }
        if (var10 < var14) {
          var6 = ((var10 << 16) - var12 + var16 - 1) / var16;
        }
        int var17 = param1 + param2 * SoftwareRasterizer.field_g;
        int var18 = SoftwareRasterizer.field_g - var5;
        if (param2 + var6 > SoftwareRasterizer.field_h) {
          var6 = var6 - (param2 + var6 - SoftwareRasterizer.field_h);
        }
        if (param2 < SoftwareRasterizer.field_e) {
          var19 = SoftwareRasterizer.field_e - param2;
          var6 = var6 - var19;
          var17 = var17 + var19 * SoftwareRasterizer.field_g;
          var12 = var12 + var16 * var19;
        }
        if (param1 + var5 > SoftwareRasterizer.field_c) {
          var19Lifetime1 = param1 + var5 - SoftwareRasterizer.field_c;
          var5 = var5 - var19Lifetime1;
          var18 = var18 + var19Lifetime1;
        }
        if (param1 < SoftwareRasterizer.field_b) {
          var19Lifetime2 = SoftwareRasterizer.field_b - param1;
          var5 = var5 - var19Lifetime2;
          var17 = var17 + var19Lifetime2;
          var11 = var11 + var15 * var19Lifetime2;
          var18 = var18 + var19Lifetime2;
        }
        SoftwareDrawingSupport.blendScaledWhiteMaskPixels(SoftwareRasterizer.field_a, param0, var11, var12, var17, var18, var5, var6, var15, var16, var9);
    }

    final static UiLayoutNode createDefaultButtonNode(boolean param0) {
        return SoftwareDrawingSupport.createButtonNode(param0, 0);
    }

    static {
        field_d = new Sprite(100, 11);
        field_e = 0;
        field_o = new int[307];
    }
}
