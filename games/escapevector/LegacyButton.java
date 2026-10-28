/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyButton {
    private int textOffsetX;
    int y;
    private int[] scaledWidths;
    static int[] field_h;
    int height;
    int revealUntilTick;
    private int[] foregroundColors;
    private BinaryBitmapFont font;
    private int style;
    int x;
    private String text;
    private int[] backgroundColors;
    private int prefixNumber;
    int width;
    private int[] textColors;
    private int field_g;
    private int[] scaledHeights;
    private Sprite sprite;
    int actionId;

    final void drawState(boolean highlighted, boolean alternateState, byte guard) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int var9_int;
        int var8Lifetime1;
        int var12 = EscapeVector.obfuscationControl;
        int var4 = this.x + this.width;
        if (guard <= 16) {
          return;
        }
        int var5 = this.y + this.height;
        int var6 = 0;
        if (alternateState) {
          var6 = 2;
        }
        if (highlighted) {
          var6 = 1;
        }
        int var7 = this.revealOffset((byte) -102);
        if (this.style == 2) {
          if (!highlighted) {
            int var8 = 1;
            SoftwareRasterizer.fillRectangle(1 + this.x, 1 + this.sprite.fullHeight + this.y, -2 + this.width, -2 + this.height - this.sprite.fullHeight, var8);
          } else {
            AccountNoticeKind.drawAnimatedPanelFrame(var7, this.x - 2, var4 + 2, 2 + var5, true, 29788, false, this.foregroundColors[1], this.backgroundColors[1], this.field_g, -2 + this.y, false);
          }
          this.sprite.drawOpaque(this.x, this.y);
        }
        if (this.style == 3) {
          AccountNoticeKind.drawAnimatedPanelFrame(var7, this.x, var4, var5, true, 29788, false, this.foregroundColors[var6], this.backgroundColors[var6], this.field_g, this.y, false);
        }
        if (this.style == 0) {
          var8Lifetime1 = 1;
          SoftwareRasterizer.fillVerticalGradient(this.x, this.y, this.sprite.fullWidth, this.sprite.fullHeight, this.backgroundColors[var6], var8Lifetime1);
          this.sprite.drawTinted(this.x, this.y, this.foregroundColors[var6]);
        } else if (this.style == 1) {
          if (highlighted) {
            stackIn_19_0 = this.scaledWidths[1];
          } else {
            stackIn_19_0 = this.scaledWidths[0];
          }
          var8Lifetime1 = stackIn_19_0;
          if (highlighted) {
            stackIn_22_0 = this.scaledHeights[1];
          } else {
            stackIn_22_0 = this.scaledHeights[0];
          }
          var9_int = stackIn_22_0;
          int var10 = this.x + (this.width - var8Lifetime1) / 2;
          int var11 = this.y + (-var9_int + this.height) / 2;
          this.sprite.drawDownscaled(var10, var11, var8Lifetime1, var9_int);
        } else if (this.style == 4) {
          var8Lifetime1 = this.labelBaseline(-18641);
          String var9 = this.prefixNumber + " - ";
          this.font.drawRight(var9, this.x + this.textOffsetX, var8Lifetime1, this.textColors[1], -1);
          this.font.drawLeft(this.text, this.x + this.textOffsetX, var8Lifetime1, this.textColors[var6], -1);
          if (this.sprite != null) {
            this.sprite.drawTransparent(var4 - this.sprite.fullWidth, this.y);
          }
        } else {
          var8Lifetime1 = this.labelBaseline(-18641);
          var9_int = this.width / 2 + this.x;
          MatchingTextValidator.a(var8Lifetime1, this.text, this.textColors[var6], -128, var9_int);
        }
        return;
    }

    private final void truncateLabel(int guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.style != 4) {
          return;
        }
        int var2 = this.x + this.textOffsetX;
        int var3 = this.width + this.x;
        int var4 = 1 + var3 - var2;
        int var5 = this.font.stringWidth(this.text);
        if (var5 <= var4) {
          return;
        }
        for (int var6_int = this.text.length(); var6_int >= 0; var6_int--) {
          this.text = this.text.substring(0, var6_int);
          int var5Lifetime1 = this.font.stringWidth(this.text);
          if (var4 < var5Lifetime1) {
            continue;
          }
          break;
        }
        String var6 = GameplaySession.field_cc;
        if (this.text.length() <= var6.length()) {
          return;
        }
        this.text = this.text.substring(0, this.text.length() - var6.length()) + var6;
        if (guard != 160) {
          this.drawState(true, false, (byte) 77);
        }
    }

    LegacyButton(int param0, int param1, String param2, int param3, Sprite param4, int param5, BinaryBitmapFont param6) {
        this(param0, param1, param2, param3, param6);
        try {
          this.sprite = param4;
          this.field_g = param5;
          this.width = this.preferredWidth(-1);
          this.height = this.preferredHeight((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final int spriteWidth(boolean guard) {
        if (guard) {
          return -31;
        }
        if (this.sprite == null) {
          return 0;
        }
        return this.sprite.fullWidth;
    }

    private final int preferredWidth(int guard) {
        if (guard != -1) {
          int[] var4 = (int[]) null;
          this.setBackgroundColors((int[]) null, (int[]) null, -13);
        }
        int var2 = this.textWidthWithPadding(0);
        int var3 = this.spriteWidth(false);
        return var3 > var2 ? var3 : var2;
    }

    final void setBackgroundColors(int[] backgroundColors, int[] foregroundColors, int guard) {
        try {
          if (guard != -2) {
            this.style = -77;
          }
          this.backgroundColors = backgroundColors;
          this.foregroundColors = foregroundColors;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.I(" + (backgroundColors != null ? "{...}" : "null") + ',' + (foregroundColors != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static byte[] encodeCp1252(byte guard, CharSequence text) {
        String stackIn_73_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = text.length();
          byte[] var3 = new byte[var2_int];
          if (guard != -14) {
            field_h = (int[]) null;
          }
          for (int var4 = 0; var4 < var2_int; var4++) {
            {
              int var5 = text.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (160 > var5 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          byte[] stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_72_0 = var2;
          StringBuilder stackIn_72_1 = new StringBuilder().append("dk.K(").append(guard).append(',');
          if (text == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final void setColors(int[] foregroundColors, int[] backgroundColors, byte guard, int[] textColors) {
        this.setBackgroundColors(backgroundColors, foregroundColors, -2);
        if (guard > -120) {
          return;
        }
        try {
          this.textColors = textColors;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.L(" + (foregroundColors != null ? "{...}" : "null") + ',' + (backgroundColors != null ? "{...}" : "null") + ',' + guard + ',' + (textColors != null ? "{...}" : "null") + ')');
        }
    }

    private final int preferredHeight(byte guard) {
        if (this.style == 1) {
          return 0;
        }
        int var2 = this.textHeightWithPadding(-95);
        if (guard != -16) {
          this.revealUntilTick = 0;
        }
        int var3 = this.spriteHeight(guard + 16);
        return var3 + var2;
    }

    LegacyButton(int param0, int param1, String param2, int param3, int param4, BinaryBitmapFont param5) {
        this(param0, param1, param2, param3, param5);
        try {
          this.field_g = param4;
          this.width = this.preferredWidth(-1);
          this.height = this.preferredHeight((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final int labelBaseline(int guard) {
        int var2 = this.height + this.y;
        if (guard != -18641) {
          this.foregroundColors = (int[]) null;
        }
        int var3 = -3 + var2 - this.font.maxDescent;
        return var3;
    }

    final static void decodeProgressResponse(int guard) {
        int var8 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var10 = QuickChatDynamicCommand.incomingPackets;
          int var2 = var10.readUnsignedByte(0);
          int var3 = var10.readUnsignedByte(0);
          if (guard != 108457410) {
            return;
          }
          if (var2 == 0) {
            ProgressQuery var4 = (ProgressQuery) (AchievementTracker.field_i.first(false));
            if (var4 == null) {
              nm.a(16);
              return;
            }
            int var5 = -var10.position + EmailSyntaxValidator.field_r;
            int[] var12 = var4.progressWords;
            int[] var11 = var12;
            int[] var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (int var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(0) << (SpriteCheckboxPainter.bitwiseAnd(3, var7) << 8));
            }
            var4.complete = true;
            var4.unlink((byte) -105);
            return;
          }
          if (var2 == 1) {
            int var4_int = var10.readSignedSmart((byte) 106);
            ProgressRecord var5_ref_cc = (ProgressRecord) (RasterBuffer.field_e.first(false));
            while (var5_ref_cc != null) {
              if (var5_ref_cc.campaignId != var3 ||
                var4_int != var5_ref_cc.levelIndex) {
                var5_ref_cc = (ProgressRecord) (RasterBuffer.field_e.next((byte) 70));
                continue;
              }
              break;
            }
            if (var5_ref_cc != null) {
              var5_ref_cc.unlink((byte) -62);
              return;
            }
            int stackIn_13_0 = guard;
            int stackIn_13_1 = 108457426;
            nm.a(stackIn_13_0 ^ stackIn_13_1);
            return;
          }
          pf.a(false, "LR1: " + LoginStage.formatPacketDiagnostic((byte) 36), (Throwable) null);
          nm.a(16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "dk.H(" + guard + ')');
        }
    }

    final boolean hitTest(byte guard, int x, int y) {
        int var4 = this.width + this.x;
        if (this.x <= x &&
          x < var4) {
          if (guard != 65) {
            return true;
          }
          int var5 = this.y + this.height;
          if (this.y <= y &&
            y < var5) {
            return true;
          }
          return false;
        }
        return false;
    }

    private final int textHeightWithPadding(int guard) {
        int var2 = this.font.maxAscent + this.font.maxDescent;
        int var3 = var2 + 3 + 3;
        int var4 = -101 / ((guard - 47) / 63);
        return var3;
    }

    private final int textWidthWithPadding(int guard) {
        if (this.style == 1) {
          return 0;
        }
        String var2 = " ";
        if (guard != 0) {
          this.truncateLabel(-121);
        }
        int var3 = this.font.stringWidth(var2);
        int var4 = this.font.stringWidth(this.text);
        var4 = var4 + 4 * var3;
        return var4;
    }

    private final int spriteHeight(int guard) {
        if (null == this.sprite) {
          return 0;
        }
        if (guard != 0) {
          int discarded$0 = this.spriteWidth(true);
        }
        return this.sprite.fullHeight;
    }

    final void setPosition(byte guard, int x, int y) {
        int var4 = 126 / ((78 - guard) / 36);
        this.y = y;
        this.x = x;
    }

    private final int revealOffset(byte guard) {
        int var2 = 87 % ((-24 - guard) / 41);
        if (1 == this.style) {
          return 0;
        }
        return mj.field_d < this.revealUntilTick ? (this.revealUntilTick - mj.field_d) * 2 : 0;
    }

    public static void releaseStatics(int guard) {
        if (guard != 1) {
          return;
        }
        field_h = null;
    }

    final void draw(int guard, boolean highlighted) {
        if (guard != -16383) {
          this.font = (BinaryBitmapFont) null;
        }
        boolean var3 = false;
        this.drawState(highlighted, (var3), (byte) 27);
    }

    final void setSize(int height, int guard, int width) {
        this.height = height;
        if (guard != 0) {
          this.style = -53;
        }
        this.width = width;
        this.truncateLabel(160);
    }

    LegacyButton(int param0, int param1, int param2, String param3, int param4, Sprite param5, int param6, BinaryBitmapFont param7) {
        this(param0, param1, param3, param6, param7);
        try {
          this.sprite = param5;
          this.prefixNumber = param2;
          this.textOffsetX = param4;
          this.width = this.preferredWidth(-1);
          this.height = this.preferredHeight((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private LegacyButton(int param0, int param1, String param2, int param3, BinaryBitmapFont param4) {
        try {
          this.font = param4;
          this.style = param0;
          this.actionId = param1;
          this.revealUntilTick = param3;
          this.text = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    LegacyButton(int param0, int param1, Sprite param2, int[] param3, int[] param4) {
        try {
          this.style = param0;
          this.actionId = param1;
          this.scaledHeights = param4;
          this.scaledWidths = param3;
          this.sprite = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    LegacyButton(int param0, int param1, Sprite param2) {
        try {
          this.style = param0;
          this.sprite = param2;
          this.actionId = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[32768];
        for (int var0 = 0; 32768 > var0; var0++) {
          field_h[var0] = (int)(16384.0 * Math.sin((double)var0 / 5215.1903));
        }
    }
}
