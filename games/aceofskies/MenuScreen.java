/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuScreen {
    private MenuInputState input;
    static IntrusiveDeque field_g;
    private int screenId;
    private int pendingClickX;
    private int pendingClickY;
    private int previousActionId;
    private int selectedAchievementId;
    private int soundPreviewCooldown;
    static String[] field_f;

    private final String formatGroupedInteger(int value, boolean obfuscationGuard) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!obfuscationGuard) {
          boolean discarded$1 = this.isItemEnabled(-107, (byte) -6);
        }
        String var3 = "";
        while (value >= 1000) {
          int var4 = value % 1000;
          String var6 = var4 + var3;
          value = value / 1000;
          if (var4 < 10) {
            var3 = IntrusiveDeque.thousandsSeparator + "00" + var6;
            continue;
          }
          if (var4 >= 100) {
            var3 = IntrusiveDeque.thousandsSeparator + var6;
            continue;
          }
          var3 = IntrusiveDeque.thousandsSeparator + "0" + var6;
        }
        return value + var3;
    }

    public static void c(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 < 82) {
          MenuScreen.c((byte) 16);
        }
    }

    private final void a(int param0, int param1, int param2, GraphicsRenderer param3, int param4, byte param5) {
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          param1 = param1 * param4 >> 8;
          int var7_int = 15;
          param3.d(10, param1 + 1, 8 + param2, -5782, -861274112, param0 - 2);
          param0 = param0 - var7_int;
          param4 = param4 + (var7_int << 1);
          CipherPacketBuffer.brassSliderSprites[0].a(param0, param2);
          CipherPacketBuffer.brassSliderSprites[2].a(-CipherPacketBuffer.brassSliderSprites[2].d() + (param0 + param4), param2);
          bo var8 = fa.a(param3, true);
          param4 = param4 + param0 - CipherPacketBuffer.brassSliderSprites[2].d();
          int var9 = param0;
          param0 = param0 + CipherPacketBuffer.brassSliderSprites[0].d();
          var8.a(param4, param0, CipherPacketBuffer.brassSliderSprites[2].c() + param2, param2, 126);
          while (param4 > param0) {
            CipherPacketBuffer.brassSliderSprites[1].a(param0, param2);
            param0 = param0 + CipherPacketBuffer.brassSliderSprites[1].d();
          }
          if (param5 >= -11) {
            this.handleNavigationKey(-86);
          }
          var8.a(true);
          CipherPacketBuffer.brassSliderSprites[3].a(var9 + param1, param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int getItemTop(int itemIndex, boolean obfuscationGuard) {
        if (this.screenId == 2 &&
          !cn.b(true)) {
          if (3 > itemIndex) {
            return -6 + bk.menuTop[this.screenId];
          }
          return -6 + (bk.menuTop[this.screenId] + oo.menuRowSpacing[this.screenId]);
        }
        if (2 == this.screenId &&
          cn.b(true)) {
          return -6 + (oo.menuRowSpacing[this.screenId] * itemIndex + bk.menuTop[this.screenId]);
        }
        if (3 == this.screenId) {
          return bk.menuTop[this.screenId] - 32;
        }
        if (4 != this.screenId &&
          this.screenId != 5) {
          if (!obfuscationGuard) {
            this.handleAction(true, -26, -69);
          }
          return oo.menuRowSpacing[this.screenId] * itemIndex + bk.menuTop[this.screenId];
        }
        if (ua.menuActions[this.screenId].length > 1) {
          return 382 + itemIndex * (12 + oo.menuRowSpacing[this.screenId]) - 4;
        }
        return -4 + (oo.menuRowSpacing[this.screenId] * itemIndex + 430);
    }

    private final void drawItem(int verticalOffset, int itemIndex, int obfuscationGuard, boolean selected, GraphicsRenderer renderer) {
        int stackIn_12_0 = 0;
        int stackIn_19_4 = 0;
        Object stackIn_22_0;
        int stackIn_22_5;
        String stackIn_31_2 = null;
        int var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var6_int = verticalOffset + this.getItemTop(itemIndex, true);
          int var7 = this.getItemLeft(itemIndex, 200);
          int discarded$0 = this.getItemRight(obfuscationGuard + 116, itemIndex);
          int var8 = ua.menuActions[this.screenId][itemIndex];
          String var9 = du.menuActionLabels[var8];
          if (var9 == null) {
            var9 = "ERROR: missing text";
          }
          int var10 = this.getItemRight(118, itemIndex) - var7;
          int discarded$1 = this.getItemHeight(true, itemIndex);
          int stackIn_6_0 = (!selected) ? -12046068 : -7247318;
          int var11 = stackIn_6_0;
          int var12 = -16;
          if (var8 != 12 &&
            var8 != 13) {
            if (20 != var8 &&
              var8 != 21) {
              this.a(var6_int, renderer, obfuscationGuard ^ -103, var10, var7);
            } else {
              Object stackIn_18_0 = this;
              int stackIn_18_1 = var10;
              int stackIn_18_2 = var7;
              GraphicsRenderer stackIn_18_3 = (GraphicsRenderer) (renderer);
              stackIn_19_4 = (var8 != 20) ? (0) : (1);
              Object stackIn_21_0 = this;
              if (cs.highscoreMode != 0) {
                stackIn_22_0 = this;
                stackIn_22_5 = 0;
              } else {
                stackIn_22_0 = this;
                stackIn_22_5 = 1;
              }
              this.a(stackIn_18_1, stackIn_18_2, stackIn_18_3, (stackIn_19_4 ^ stackIn_22_5) != 0, var6_int, 24063);
            }
            se.bigGameFont.drawCenteredText(obfuscationGuard + 95, var11, -1, (var12 >> 1) + (var6_int + kn.bigFontMetrics.maxAscent + 11), (var10 >> 1) + var7, var9.toLowerCase());
          } else {
            this.a(var6_int, renderer, -86, var10, var7);
            int var13 = oq.field_K + 137;
            var7 -= 8;
            int var14 = var7 + (-var13 + var10 >> 1);
            se.bigGameFont.drawRightAlignedText(var9.toLowerCase(), var11, -1, (var10 >> 1) + (var7 - 15), 11 + ((var12 >> 1) + (kn.bigFontMetrics.maxAscent + var6_int)), (byte) 92);
            var14 = var14 + (16 + oq.field_K);
            if (var8 != 12) {
              stackIn_12_0 = RendererManager.field_c;
            } else {
              stackIn_12_0 = gn.field_a;
            }
            int var15 = stackIn_12_0;
            this.a(var14, var15, 3 + var6_int, renderer, 130, (byte) -55);
          }
          if (obfuscationGuard != 4) {
            field_f = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var6;
          StringBuilder stackIn_30_1 = new StringBuilder().append("nk.K(").append(verticalOffset).append(',').append(itemIndex).append(',').append(obfuscationGuard).append(',').append(selected).append(',');
          if (renderer == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final int findItemAt(int obfuscationGuard, int pointerX, int pointerY) {
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > -56) {
          return 82;
        }
        for (int var4 = 0; ua.menuActions[this.screenId].length > var4; var4++) {
          int var5 = this.getItemTop(var4, true);
          if (this.isItemEnabled(var4, (byte) -17) &&
            pointerX >= this.getItemLeft(var4, 200) &&
            this.getItemRight(123, var4) > pointerX &&
            var5 <= pointerY &&
            pointerY < var5 + this.getItemHeight(true, var4)) {
            return var4;
          }
        }
        return -1;
    }

    private final void drawHighscores(int obfuscationGuard, int verticalOffset) {
        String stackIn_39_0 = null;
        String var12Lifetime1;
        int var28 = AceOfSkies.obfuscationControl ? 1 : 0;
        GraphicsRenderer var30 = FlightSession.rendererManager.a((byte) 90);
        int var4 = 0;
        if (obfuscationGuard != -9621) {
          field_f = (String[]) null;
        }
        int var5 = -1;
        int var6 = -16777216;
        int var7 = 120;
        int var8 = 108 + verticalOffset;
        int var9 = 400;
        int var10 = 280;
        if (2 == fb.field_e) {
          var7 -= 10;
          var9 += 20;
        }
        if (fb.field_e == 3) {
          var9 += 20;
          var7 -= 10;
        }
        this.a(40 + var10, (byte) 86, var7 - 20, 40 + var9, var30, -20 + var8);
        String var11 = mf.field_a;
        if (oc.highscoreView == 1) {
          var11 = wl.field_zc;
        }
        if (2 == oc.highscoreView) {
          var11 = jo.field_l;
          String var12 = var11;
          String var12Lifetime3 = var11;
        }
        regionExit1: {
          this.a(verticalOffset, (byte) -122, var11);
          if (!cn.b(true)) {
            if (null == ql.activeHighscoreQuery) {
              ql.activeHighscoreQuery = vo.requestHighscores((byte) 127, 3, 10, 1, cs.highscoreMode);
            }
            HighscoreQuery var13_ref_uc = ql.activeHighscoreQuery;
            if (var13_ref_uc.completed) {
              if (null != var13_ref_uc.namesByView) {
                var12Lifetime1 = IndexedSpriteState.field_g;
                String[] var14 = var13_ref_uc.namesByView[oc.highscoreView];
                int[] var35 = var13_ref_uc.valuesByView[oc.highscoreView];
                int var16 = ca.findSubmittedScoreRow(var13_ref_uc, (byte) 113, oc.highscoreView, to.lastScoreSubmission);
                kn.bigFontMetrics.measureTextWidth((byte) 94, "10. ");
                int var17 = verticalOffset + (hi.gameFontMetrics.maxAscent + 140);
                int var18 = 310;
                var17 -= 20;
                int var19 = 128;
                int var20 = 512;
                int var21 = var5;
                PacketBuffer.gameFont.drawText(var21, -1, 20 + var19, SoundCache.field_f, 18731, var17);
                PacketBuffer.gameFont.drawCenteredText(101, var21, -1, var17, var18 + (var20 - 320) / 4, ao.field_a);
                PacketBuffer.gameFont.drawRightAlignedText(fd.field_c, var21, -1, var20, var17, (byte) 92);
                var17 += 20;
                int var29 = 0;
                int var4Lifetime1 = var29;
                while (var29 < 10) {
                  int var19Lifetime1 = 128;
                  int var20Lifetime1 = 512;
                  if (var14[var29] != null) {
                    int var21Lifetime1 = -12046068;
                    int var22_int = var35[var29] / 100;
                    int var21Lifetime1Lifetime1 = -2250240;
                    int var23_int = var35[var29] % 100;
                    String var24 = var14[var29];
                    if (var16 == var29) {
                      var30.d(16, var20Lifetime1 + (20 - var19Lifetime1), -12 + var17, obfuscationGuard ^ 13057, -7247318, var19Lifetime1 - 10);
                      var21Lifetime1Lifetime1 = -256;
                    }
                    PacketBuffer.gameFont.drawText(var5, var5, -1 + (20 + var19Lifetime1), var24, 18731, var17);
                    String var25 = var29 + 1 + ". ";
                    PacketBuffer.gameFont.drawText(var6, var6, 20 + var19Lifetime1, var24, obfuscationGuard ^ -27840, -1 + var17);
                    PacketBuffer.gameFont.drawText(var21Lifetime1Lifetime1, -1, var19Lifetime1 + 20, var24, obfuscationGuard + 28352, var17);
                    PacketBuffer.gameFont.drawRightAlignedText(var25, var5, var5, 20 + (var19Lifetime1 - 1), var17, (byte) 92);
                    PacketBuffer.gameFont.drawRightAlignedText(var25, var6, var6, var19Lifetime1 + 20, -1 + var17, (byte) 92);
                    PacketBuffer.gameFont.drawRightAlignedText(var25, var21Lifetime1Lifetime1, -1, 20 + var19Lifetime1, var17, (byte) 92);
                    String var26 = this.formatGroupedInteger(var22_int, true);
                    PacketBuffer.gameFont.drawRightAlignedText(var26, var5, var5, var20Lifetime1 - 1, var17, (byte) 92);
                    PacketBuffer.gameFont.drawRightAlignedText(var26, var6, var6, var20Lifetime1, var17 - 1, (byte) 92);
                    PacketBuffer.gameFont.drawRightAlignedText(var26, var21Lifetime1Lifetime1, -1, var20Lifetime1, var17, (byte) 92);
                    String var27 = Integer.toString(var23_int) + "%";
                    PacketBuffer.gameFont.drawCenteredText(121, var5, var5, var17, -1 + ((var19Lifetime1 + var20Lifetime1 >> 1) + 35), var27);
                    PacketBuffer.gameFont.drawCenteredText(obfuscationGuard ^ -9704, var6, var6, -1 + var17, (var19Lifetime1 + var20Lifetime1 >> 1) + 35, var27);
                    var12Lifetime1 = "";
                    PacketBuffer.gameFont.drawCenteredText(124, var21Lifetime1Lifetime1, -1, var17, 35 + (var19Lifetime1 + var20Lifetime1 >> 1), var27);
                  }
                  var17 += 20;
                  var29++;
                }
                if (sg.flightSession != null &&
                  !(sg.flightSession.finalScore <= 0) &&
                  var16 == -1) {
                  int var19Lifetime2 = 128;
                  int var20Lifetime2 = 512;
                  var30.d(16, 20 + var20Lifetime2 - var19Lifetime2, var17 - 12, -5782, -7247318, var19Lifetime2 - 10);
                  int var21Lifetime2 = -256;
                  PacketBuffer.gameFont.drawText(var5, var5, 19 + var19Lifetime2, fj.playerDisplayName, 18731, var17);
                  PacketBuffer.gameFont.drawText(var6, var6, 20 + var19Lifetime2, fj.playerDisplayName, 18731, -1 + var17);
                  PacketBuffer.gameFont.drawText(var21Lifetime2, -1, 20 + var19Lifetime2, fj.playerDisplayName, 18731, var17);
                  String var22 = this.formatGroupedInteger(sg.flightSession.finalScore, true);
                  PacketBuffer.gameFont.drawRightAlignedText(var22, var5, var5, -1 + var20Lifetime2, var17, (byte) 92);
                  PacketBuffer.gameFont.drawRightAlignedText(var22, var6, var6, var20Lifetime2, -1 + var17, (byte) 92);
                  PacketBuffer.gameFont.drawRightAlignedText(var22, var21Lifetime2, -1, var20Lifetime2, var17, (byte) 92);
                  String var23 = Integer.toString(sg.flightSession.finalAccuracyPercent) + "%";
                  PacketBuffer.gameFont.drawCenteredText(121, var5, var5, var17, -1 + (var20Lifetime2 + var19Lifetime2 >> 1) + 35, var23);
                  PacketBuffer.gameFont.drawCenteredText(obfuscationGuard + 9746, var6, var6, var17 - 1, 35 + (var19Lifetime2 + var20Lifetime2 >> 1), var23);
                  PacketBuffer.gameFont.drawCenteredText(111, var21Lifetime2, -1, var17, (var20Lifetime2 + var19Lifetime2 >> 1) + 35, var23);
                }
                break regionExit1;
              }
              var12Lifetime1 = ul.field_t;
            } else {
              var12Lifetime1 = jr.field_r;
            }
          } else {
            var12Lifetime1 = IndexedSpriteState.field_g;
          }
        }
        int var13 = kn.bigFontMetrics.maxAscent + (verticalOffset + 140 + 100);
        PacketBuffer.gameFont.drawCenteredText(117, var5, -1, var13, 320, var12Lifetime1);
        if (!cn.b(true)) {
          stackIn_39_0 = fs.field_f;
        } else {
          stackIn_39_0 = bt.field_c;
        }
        String var32 = stackIn_39_0;
        String var12Lifetime2 = var32;
        PacketBuffer.gameFont.drawCenteredText(113, var5, -1, 220 + verticalOffset - (-140 - hi.gameFontMetrics.maxAscent), 320, var32);
    }

    private final boolean isItemEnabled(int itemIndex, byte obfuscationGuard) {
        if (this.screenId == 3) {
          if (0 == itemIndex &&
            0 == vq.instructionPage) {
            return false;
          }
          if (itemIndex == 2 &&
            vq.instructionPage == -1 + io.field_a.length) {
            return false;
          }
        }
        if (obfuscationGuard != -17) {
          return false;
        }
        if (this.screenId == 2) {
          if (!(2 > ln.field_d)) {
            return true;
          }
          if ((itemIndex == 5 || itemIndex == 3) &&
            !kh.field_a) {
            return false;
          }
        }
        return true;
    }

    final static java.awt.Container b(byte param0) {
        if (null != si.field_d) {
          return (java.awt.Container) ((Object) si.field_d);
        }
        if (param0 < 126) {
          String var2 = (String) null;
          MenuScreen.a((byte) 67, -122, (wl) null, (String) null);
        }
        return (java.awt.Container) ((Object) bm.m(118));
    }

    final void open(boolean pointerSelection, int obfuscationGuard) {
        int var3 = 0;
        if (this.screenId == 0 &&
          this.input.selectedIndex != -1) {
          var3 = this.input.selectedIndex;
        }
        if (obfuscationGuard != 1) {
          return;
        }
        if (this.screenId == 1 &&
          -1 != this.input.selectedIndex &&
          po.activeMenuId != -1) {
          var3 = this.input.selectedIndex;
        }
        if (this.screenId == 3) {
          var3 = 2;
        }
        this.input.resetSelection(pointerSelection, this.findItemAt(obfuscationGuard - 77, ic.field_b, cf.field_g), 0, var3);
        this.selectedAchievementId = -1;
    }

    private final void a(int param0, byte param1, int param2, int param3, GraphicsRenderer param4, int param5) {
        int var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          bo var16 = fa.a(param4, true);
          var16.a(param3 + (param2 - 5), 5 + param2, -5 + (param5 + param0), param5 + 5, -71);
          for (int var8 = 0; var8 < param0 - 10; var8 = var8 + qk.woodenTileSprite.c()) {
            qk.woodenTileSprite.b(param2 + 5, var8 + (param5 + 5), -10 + param3, qk.woodenTileSprite.c());
          }
          var16.a(true);
          GraphicsRenderer var9 = param4;
          int var10 = param2;
          int var11 = param5;
          int var12 = param3;
          if (param1 != 86) {
            this.handleNavigationKey(-92);
          }
          int var13 = param0;
          RenderSprite[] var14 = ko.brassFrameSprites;
          hb.a(var11, 0, var10, 1, 1, var12, var13, var9, (byte) 104, var14);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private final void handleAction(boolean pointerSelection, int obfuscationGuard, int itemIndex) {
        int stackIn_128_2 = 0;
        int var6;
        int var7;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var4 = ua.menuActions[this.screenId][itemIndex];
        if (this.input.isActivated((byte) 125)) {
          bm.a((byte) -70, gg.field_a);
        } else if (var4 != this.previousActionId) {
          this.previousActionId = var4;
          bm.a((byte) -70, kq.field_b);
        }
        if (obfuscationGuard != 3) {
          return;
        }
        {
          int var5 = var4;
          switch (var5) {
            case 0: {
                if (this.input.isActivated((byte) 84)) {
                  sg.flightSession.startGame(101, false);
                  Bullet.requestMenu((byte) -96, -1, pointerSelection);
                  co.returnMenuId = this.screenId;
                }
              }
              break;

            case 1:
              if (this.input.isActivated((byte) 114)) {
                Bullet.requestMenu((byte) 33, -1, pointerSelection);
                sg.flightSession.resumeGame(-112);
                co.returnMenuId = 0;
              }
              break;
            case 16:
              if (this.input.isActivated((byte) 120)) {
                Bullet.requestMenu((byte) -117, 0, pointerSelection);
                r.field_n = 0;
                hg.field_D = 0;
                sb.field_c.clear(268435455);
              }
              break;
            case 14:
              if (this.input.isActivated((byte) 127)) {
                Bullet.requestMenu((byte) 98, 4, pointerSelection);
                co.returnMenuId = this.screenId;
              }
              break;
            case 3:
              if (this.input.isActivated((byte) 82)) {
                vq.instructionPage = 0;
                Bullet.requestMenu((byte) -94, 3, pointerSelection);
                co.returnMenuId = this.screenId;
              }
              break;
            case 6:
              if (this.input.isActivated((byte) 104)) {
                Bullet.requestMenu((byte) -80, co.returnMenuId, pointerSelection);
              }
              break;
            case 12:
              if (this.input.isHomePressed(55)) {
                rt.b(0, (byte) -117);
                lq.a(fd.field_b[3], 110);
              }
              if (this.input.isEndPressed(-99)) {
                rt.b(256, (byte) 59);
                lq.a(fd.field_b[3], obfuscationGuard ^ -10);
              }
              if (this.input.isLeftPressed(-78)) {
                r.e(obfuscationGuard - 14601);
                lq.a(fd.field_b[3], 70);
              }
              if (this.input.isRightPressed((byte) -102)) {
                dq.a((byte) -2);
                lq.a(fd.field_b[3], -126);
              }
              if (this.input.isPointerHeld((byte) 98)) {
                var5 = 137 + oq.field_K;
                var6 = (this.getItemLeft(itemIndex, obfuscationGuard + 197) + this.getItemRight(obfuscationGuard + 121, itemIndex) - var5 >> 1) + oq.field_K + 8;
                var7 = ic.field_b - var6 << 1;
                if (var7 <= 0) {
                  rt.b(0, (byte) 70);
                } else if (256 <= var7) {
                  rt.b(256, (byte) -114);
                } else {
                  rt.b(var7, (byte) -123);
                }
                if (!(this.soundPreviewCooldown > 0)) {
                  lq.a(fd.field_b[3], 81);
                  this.soundPreviewCooldown = 10;
                }
              }
              break;
            case 13:
              if (this.input.isHomePressed(obfuscationGuard + 50)) {
                ve.a((byte) 43, 0);
              }
              if (this.input.isEndPressed(-39)) {
                ve.a((byte) 43, 256);
              }
              if (this.input.isLeftPressed(obfuscationGuard - 11)) {
                lj.a(100);
              }
              if (this.input.isRightPressed((byte) -102)) {
                wk.c((byte) -118);
              }
              if (this.input.isPointerHeld((byte) 119)) {
                var5 = 128 + oq.field_K + 9;
                var6 = (-var5 + this.getItemLeft(itemIndex, 200) + this.getItemRight(obfuscationGuard ^ 124, itemIndex) >> 1) - (-oq.field_K - 8);
                var7 = ic.field_b - var6 << 1;
                if (var7 <= 0) {
                  ve.a((byte) 43, 0);
                } else if (var7 < 256) {
                  ve.a((byte) 43, var7);
                } else {
                  ve.a((byte) 43, 256);
                }
              }
              break;
            case 4:
              if (!this.input.isActivated((byte) 126)) {
                break;
              }
              if (jf.field_a != null) {
                tt.b(-32546);
                break;
              }
              ql.a((byte) -103, pointerSelection);
              break;
            case 8:
              if (!this.input.isActivated((byte) 124)) {
                break;
              }
              oc.highscoreView = 0;
              break;
            case 9:
              if (!this.input.isActivated((byte) 88)) {
                break;
              }
              oc.highscoreView = 1;
              break;
            case 10:
              if (!this.input.isActivated((byte) 87)) {
                break;
              }
              oc.highscoreView = 2;
              break;
            case 15:
              if (this.input.isActivated((byte) 97)) {
                if (this.screenId != 4 &&
                  this.screenId != 2) {
                  if (this.screenId != 6) {
                    break;
                  }
                  int stackIn_127_0 = obfuscationGuard + 25365;
                  int stackIn_127_1 = 6;
                  stackIn_128_2 = (0 == r.field_n) ? (2) : (5);
                  nf.a(stackIn_127_0, stackIn_127_1, stackIn_128_2);
                  break;
                }
                nf.a(25368, this.screenId, this.screenId);
              }
              break;
            case 11:
              if (!this.input.isActivated((byte) 113)) {
                break;
              }
              if (jf.field_a != null) {
                tt.b(-32546);
              }
              rr.a((byte) -56, bm.m(obfuscationGuard + 106));
              break;
            case 20:
              if (!this.input.isActivated((byte) 106)) {
                break;
              }
              ql.activeHighscoreQuery = null;
              cs.highscoreMode = 1;
              break;
            default:
              break;
            case 21:
              if (this.input.isActivated((byte) 110)) {
                cs.highscoreMode = 0;
                ql.activeHighscoreQuery = null;
              }
              break;
            case 17:
              if (this.input.isActivated((byte) 112) &&
                this.isItemEnabled(itemIndex, (byte) -17)) {
                vq.instructionPage = vq.instructionPage + 1;
                if (this.isItemEnabled(itemIndex, (byte) -17)) {
                  break;
                }
                this.input.selectedIndex = 0;
              }
              break;
            case 18:
              if (this.input.isActivated((byte) 101)) {
                if (!this.isItemEnabled(itemIndex, (byte) -17)) {
                  break;
                }
                vq.instructionPage = vq.instructionPage - 1;
                if (!this.isItemEnabled(itemIndex, (byte) -17)) {
                  this.input.selectedIndex = 2;
                }
              }
              break;
            case 7:
              if (this.input.isActivated((byte) 82)) {
                sg.flightSession.finishGame(pointerSelection, false, 100);
              }
              break;
            case 2:
              if (this.input.isActivated((byte) 98)) {
                Bullet.requestMenu((byte) 90, 2, pointerSelection);
              }
              break;
            case 5:
              if (this.input.isActivated((byte) 86)) {
                Bullet.requestMenu((byte) 115, 0, pointerSelection);
              }
              break;
            case 22:
              if (this.input.isActivated((byte) 81)) {
                Bullet.requestMenu((byte) 122, 7, pointerSelection);
                co.returnMenuId = 0;
              }
              break;
            case 19:
              if (this.input.isActivated((byte) 104)) {
                sg.flightSession.startGame(61, true);
                Bullet.requestMenu((byte) 78, -1, pointerSelection);
                co.returnMenuId = this.screenId;
              }
              break;
          }
        }
    }

    private final int getItemLeft(int itemIndex, int obfuscationGuard) {
        if (obfuscationGuard != 200) {
          int discarded$1 = this.getItemHeight(false, -104);
        }
        if (this.screenId == 2 &&
          !cn.b(true)) {
          return dt.menuLeft[this.screenId] + 200 * (itemIndex % 3);
        }
        if (this.screenId == 2 &&
          cn.b(true)) {
          return dt.menuLeft[this.screenId] - 100;
        }
        if (this.screenId == 3) {
          return 200 * itemIndex + 20;
        }
        if (this.screenId != 4 &&
          5 != this.screenId) {
          return dt.menuLeft[this.screenId];
        }
        return 120;
    }

    private final void a(int param0, int param1, GraphicsRenderer param2, boolean param3, int param4, int param5) {
        String stackIn_13_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param5 != 24063) {
            return;
          }
          mb.brassButtonSprites[0].a(param1, param4);
          mb.brassButtonSprites[2].a(-mb.brassButtonSprites[2].d() + (param0 + param1), param4);
          bo var11 = fa.a(param2, true);
          bo var12 = var11;
          int var8 = param0 + param1 - mb.brassButtonSprites[2].d();
          param1 = param1 + mb.brassButtonSprites[0].d();
          var12.a(var8, param1, param4 + mb.brassButtonSprites[2].c(), param4, 102);
          while (var8 > param1) {
            mb.brassButtonSprites[1].a(param1, param4);
            param1 = param1 + mb.brassButtonSprites[1].d();
          }
          var12.a(true);
          jm.levelRingSprites[21].b(param1 + 3, 9 + param4, 16, 16);
          jm.levelRingSprites[21].b(-param0 + (20 + param1), 9 + param4, 16, 16);
          HighscoreQuery.powerBulbSprites[0].b(param1 + 3, 9 + param4, 16, 16);
          HighscoreQuery.powerBulbSprites[0].b(-param0 + param1 + 20, 9 + param4, 16, 16);
          if (param3) {
            HighscoreQuery.powerBulbSprites[1].a(-15 + param1, -12 + param4, 1, 0, 2);
            HighscoreQuery.powerBulbSprites[1].a(-param0 + param1 + 1, -12 + param4, 1, 0, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var7;
          StringBuilder stackIn_12_1 = new StringBuilder().append("nk.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void advanceMenu(int obfuscationGuard) {
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (cd.field_f < 100) {
          cd.field_f = cd.field_f + 1;
        }
        if (this.soundPreviewCooldown > 0) {
          this.soundPreviewCooldown = this.soundPreviewCooldown - 1;
        }
        while (ek.a((byte) -126)) {
          if (bk.lastKeyCode == 50 &&
            lp.heldKeys[81] &&
            ln.field_d >= 2) {
            mj.field_b = mj.field_b ^ true;
          }
          if (bk.lastKeyCode != 13) {
            this.handleNavigationKey(obfuscationGuard + 29185);
            if (this.input.selectedIndex == -1) {
              continue;
            }
            this.handleAction(false, 3, this.input.selectedIndex);
            continue;
          }
          if (1 == this.screenId) {
            Bullet.requestMenu((byte) -126, -1, false);
            sg.flightSession.resumeGame(obfuscationGuard ^ 24995);
            co.returnMenuId = 0;
            continue;
          }
          if (this.screenId == 6) {
            continue;
          }
          Bullet.requestMenu((byte) 37, co.returnMenuId, false);
        }
        if (obfuscationGuard != -25039) {
          this.pendingClickX = 31;
        }
        this.input.updatePointer(this.findItemAt(-66, ln.field_c, lq.field_a), this.findItemAt(obfuscationGuard + 24945, ic.field_b, cf.field_g), -24702);
        if (this.input.selectedIndex != -1) {
          this.handleAction(true, 3, this.input.selectedIndex);
        }
        if (vj.pressedMouseButton != 0) {
          this.pendingClickX = ln.field_c;
          this.pendingClickY = lq.field_a;
        }
    }

    private final int getItemHeight(boolean obfuscationGuard, int itemIndex) {
        if (!obfuscationGuard) {
          return 39;
        }
        return 30;
    }

    final static uf a(byte param0, int param1, wl param2, String param3) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4_int);
          jaggl.OpenGL.glProgramStringARB(param1, 34933, param3);
          jaggl.OpenGL.glGetIntegerv(34379, ik.field_m, 0);
          if (param0 <= 22) {
            MenuScreen.a((byte) -82, 1, false);
          }
          if (ik.field_m[0] == -1) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            uf stackIn_6_0 = new uf(param2, param1, var4_int);
            return stackIn_6_0;
          }
          jaggl.OpenGL.glBindProgramARB(param1, 0);
          Object stackIn_4_0 = null;
          return (uf) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("nk.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void decodeMenuResources(byte obfuscationGuard, ResourceArchive spriteArchive, ResourceArchive fontMetricsArchive) {
        try {
          ka.field_a = qg.a((byte) 3, spriteArchive, "", "frame");
          rg.field_F = qg.a((byte) 3, spriteArchive, "", "button_raised");
          DualLinkNode.field_h = qg.a((byte) 3, spriteArchive, "", "button_frame");
          bo.menuBitmapFont = (BitmapFont) ((Object) HighscoreNameEntry.a(spriteArchive, "b12", "", fontMetricsArchive, obfuscationGuard ^ -48));
          if (obfuscationGuard != -56) {
            field_g = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.S(" + obfuscationGuard + ',' + (spriteArchive != null ? "{...}" : "null") + ',' + (fontMetricsArchive != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, GraphicsRenderer param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          bo var18 = fa.a(param1, true);
          var18.a(-5 + (param3 + param2), 5 + param2, param5 + param4 - 5, param4 + 5, -21);
          for (int var9 = 0; param5 - 10 > var9; var9 = var9 + qk.woodenTileSprite.c()) {
            qk.woodenTileSprite.a(5 + param2, param4 + var9 + 5, -10 + param3, qk.woodenTileSprite.c(), 2, param6, 0);
          }
          var18.a(true);
          GraphicsRenderer var10 = param1;
          int var11 = param2;
          int var12 = param4;
          int var13 = param3;
          int var14 = param5;
          int var16 = -25 % ((-20 - param0) / 40);
          RenderSprite[] var15 = ko.brassFrameSprites;
          hb.a(var12, 0, var11, 1, 1, var13, var14, var10, (byte) 98, var15);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void drawMenu(int verticalOffset, GraphicsRenderer renderer, int obfuscationGuard) {
        Object stackIn_55_0;
        boolean stackIn_55_4;
        String stackIn_63_2 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = 25;
          int var5 = 12;
          if (this.screenId == 0 ||
            1 == this.screenId ||
            this.screenId == 7) {
            this.a(oo.menuRowSpacing[this.screenId] * ua.menuActions[this.screenId].length + 2 * var5, (byte) 86, -var4_int + dt.menuLeft[this.screenId], ClientException.menuRight[this.screenId] - (dt.menuLeft[this.screenId] - var4_int * 2), renderer, bk.menuTop[this.screenId] + (-var5 + verticalOffset));
          }
          int stackIn_9_0 = (ln.field_d < 2) ? 0 : 1;
          int var6 = stackIn_9_0;
          if (obfuscationGuard != -4) {
            this.pendingClickY = -36;
          }
          if (this.screenId == 1) {
            this.a(verticalOffset, (byte) 81, kg.field_c);
          } else if (this.screenId == 7) {
            this.a(verticalOffset, (byte) -89, sd.field_m);
          } else if (this.screenId == 2) {
            this.drawHighscores(-9621, verticalOffset);
          } else if (this.screenId == 3) {
            this.drawInstructions(197427713, verticalOffset);
          } else if (this.screenId == 4) {
            this.drawAchievements(false, verticalOffset, obfuscationGuard - 123);
          } else if (this.screenId == 5) {
            this.drawAchievements(true, verticalOffset, obfuscationGuard - 120);
          } else if (this.screenId == 6) {
            bk.menuTop[this.screenId] = 230;
            int var7 = verticalOffset - 40 + (kn.bigFontMetrics.maxAscent + 200);
            int var8 = 255;
            int var9 = kn.bigFontMetrics.maxDescent + kn.bigFontMetrics.field_a + 4;
            PacketBuffer.gameFont.drawCenteredText(112, var8 << 24 | 16777215, -1, var7, 320, gg.field_i);
            RendererBitmapFont stackIn_23_0 = PacketBuffer.gameFont;
            int stackIn_23_1 = 126;
            int stackIn_23_2 = var8 << 24 | 16777215;
            int stackIn_23_3 = -1;
            int stackIn_23_4 = var7 + var9;
            int stackIn_23_5 = 320;
            boolean stackIn_24_6 = (r.field_n != 0);
            boolean stackIn_26_7 = true;
            boolean stackIn_27_8 = (0 != or.score);
            ((RendererBitmapFont) (Object) stackIn_23_0).drawCenteredText(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, st.a(stackIn_24_6, stackIn_26_7, stackIn_27_8, false));
            RendererBitmapFont stackIn_29_0 = PacketBuffer.gameFont;
            int stackIn_29_1 = obfuscationGuard + 121;
            int stackIn_29_2 = 16777215 | var8 << 24;
            int stackIn_29_3 = -1;
            int stackIn_29_4 = 30 + var7 + var9 * 5;
            int stackIn_29_5 = 320;
            boolean stackIn_30_6 = (r.field_n != 0);
            int stackIn_32_7 = 121;
            boolean stackIn_33_8 = (or.score != 0);
            ((RendererBitmapFont) (Object) stackIn_29_0).drawCenteredText(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, ci.$cfr$intArgs$a$feb7e63b59d8(stackIn_30_6, stackIn_32_7, stackIn_33_8, false));
            RendererBitmapFont stackIn_35_0 = PacketBuffer.gameFont;
            int stackIn_35_1 = 119;
            int stackIn_35_2 = 16777215 | var8 << 24;
            int stackIn_35_3 = -1;
            int stackIn_35_4 = 60 + (var9 * 8 + var7);
            int stackIn_35_5 = 320;
            int stackIn_35_6 = -93;
            boolean stackIn_36_7 = (r.field_n != 0);
            boolean stackIn_39_8 = (or.score != 0);
            ((RendererBitmapFont) (Object) stackIn_35_0).drawCenteredText(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, stackIn_35_5, av.$cfr$intArgs$a$c7de0d339b2a(stackIn_35_6, stackIn_36_7, stackIn_39_8, false));
          }
          if (var6 == 0 ||
            !lp.heldKeys[70] &&
            !lp.heldKeys[69]) {
            for (int var7Lifetime1 = 0; this.input.itemCount > var7Lifetime1; var7Lifetime1++) {
              if (this.isItemEnabled(var7Lifetime1, (byte) -17)) {
                Object stackIn_54_0 = this;
                int stackIn_54_1 = verticalOffset;
                int stackIn_54_2 = var7Lifetime1;
                int stackIn_54_3 = 4;
                if (var7Lifetime1 != this.input.selectedIndex) {
                  stackIn_55_0 = this;
                  stackIn_55_4 = false;
                } else {
                  stackIn_55_0 = this;
                  stackIn_55_4 = true;
                }
                this.drawItem(stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_55_4, renderer);
              }
            }
          }
          if (this.screenId == 0) {
            mp.titleImage.a(44, 30 + verticalOffset);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_62_0 = var4;
          StringBuilder stackIn_62_1 = new StringBuilder().append("nk.D(").append(verticalOffset).append(',');
          if (renderer == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void drawAchievements(boolean alternateView, int verticalOffset, int obfuscationGuard) {
        int stackIn_7_0 = 0;
        RenderSprite var19_ref_pa;
        int var23 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (obfuscationGuard >= -121) {
          GraphicsRenderer var24 = (GraphicsRenderer) null;
          this.drawItem(-106, 49, 71, false, (GraphicsRenderer) null);
        }
        GraphicsRenderer var25 = FlightSession.rendererManager.a((byte) 84);
        int var5 = -1;
        int var6 = 0;
        int var7 = 50;
        int var8 = verticalOffset + 108;
        int var9 = 540;
        int var10 = 312;
        this.a(var10, (byte) 86, var7, var9, var25, var8);
        String var11 = ro.field_p;
        if (alternateView) {
          var11 = pm.field_d;
        }
        this.a(verticalOffset, (byte) 75, var11);
        boolean[] var12 = new boolean[]{false, false, false, false, false, false, false, false, false};
        boolean[] var13 = new boolean[]{false, false, false, false, false, false, true, true, true};
        boolean[] var14 = new boolean[]{false, false, false, false, false, false, true, true, true};
        int var7Lifetime1 = 75;
        int var15 = verticalOffset + 127;
        if (!alternateView) {
          stackIn_7_0 = hg.field_D;
        } else {
          stackIn_7_0 = r.field_n;
        }
        int var16 = stackIn_7_0;
        int var17 = -1;
        for (int var18 = 0; -1 + lb.field_a.length > var18; var18++) {
          regionExit1: {
            Object var19_ref = null;
            if ((var16 & 1 << var18) != 0) {
              var19_ref_pa = aa.achievementSprites[var18];
            } else {
              if (alternateView) {
                break regionExit1;
              }
              if (var14[var18]) {
                break regionExit1;
              }
              if (qr.field_a <= 0 &&
                var12[var18]) {
                var19_ref_pa = ut.lockedSprite;
              } else {
                var19_ref_pa = dh.unachievedSprite;
              }
            }
            int var20 = var7Lifetime1;
            int var21 = var15;
            if (var20 <= ic.field_b &&
              var20 + 48 >= ic.field_b &&
              cf.field_g >= var21 &&
              cf.field_g <= var21 + 48) {
              HighscoreQuery.powerBulbSprites[1].a(-28 + var20, var21 - 30, 108, 108, 0, 2004318071, 2);
              var17 = var18;
            }
            if (this.selectedAchievementId == var18) {
              HighscoreQuery.powerBulbSprites[1].a(-28 + var20, -30 + var21, 108, 108, 1, 0, 2);
            }
            var19_ref_pa.a(var20, var21, 48, 48, 0, var5, 1);
            if (this.pendingClickX >= var20 &&
              this.pendingClickX <= 48 + var20 &&
              var21 <= this.pendingClickY &&
              var21 + 48 >= this.pendingClickY) {
              this.pendingClickX = -1;
              if (this.selectedAchievementId != var18) {
                this.selectedAchievementId = var18;
              } else {
                this.selectedAchievementId = -1;
              }
            }
            if (!var14[var18]) {
              var7Lifetime1 += 55;
            } else if ((1 << var18 & var16) != 0) {
              var7Lifetime1 += 55;
            }
          }
        }
        if (verticalOffset != 0) {
          var17 = -1;
        }
        if (0 <= this.selectedAchievementId) {
          var17 = this.selectedAchievementId;
        }
        if (-1 == var17) {
          int var18Lifetime1 = verticalOffset + 264;
          PacketBuffer.gameFont.drawCenteredText(96, var5, -1, var18Lifetime1, 320, sl.field_q);
          PacketBuffer.gameFont.drawCenteredText(126, var5, -1, var18Lifetime1 + (kn.bigFontMetrics.maxAscent * 3 >> 1), 320, ef.field_g);
          if (cn.b(true)) {
            PacketBuffer.gameFont.drawCenteredText(112, var5, -1, var18Lifetime1 + 6 * kn.bigFontMetrics.maxAscent, 320, bt.field_c);
          }
        } else {
          int var7Lifetime2 = 470;
          int var15Lifetime1 = verticalOffset + 220;
          PacketBuffer.gameFont.drawCenteredText(101, -5622785, -16777216, var15Lifetime1, var7Lifetime2, jk.field_c);
          var15Lifetime1 += 24;
          String var18_ref_String = Integer.toString(100 * qe.field_f[var17]);
          if (var13[var17] &&
            (1 << var17 & var16) == 0) {
            var18_ref_String = fh.field_g;
          }
          PacketBuffer.gameFont.drawCenteredText(124, var5, var6, var15Lifetime1, var7Lifetime2, var18_ref_String);
          int var15Lifetime1Lifetime1 = 280 + verticalOffset;
          int var7Lifetime2Lifetime1 = 470;
          PacketBuffer.gameFont.drawCenteredText(127, -5622785, -16777216, var15Lifetime1Lifetime1, var7Lifetime2Lifetime1, sd.field_e);
          if (var13[var17] &&
            0 == (1 << var17 & var16)) {
            var15Lifetime1Lifetime1 += 32;
            PacketBuffer.gameFont.drawCenteredText(111, -1, -16777216, var15Lifetime1Lifetime1, var7Lifetime2Lifetime1, var18_ref_String);
          } else {
            var7Lifetime2Lifetime1 = var7Lifetime2Lifetime1 - ((qe.field_f[var17] - 1) * lg.coinSprite.d() / 6 + lg.coinSprite.d() / 2 >> 2);
            for (int var19 = 0; qe.field_f[var17] > var19; var19++) {
              lg.coinSprite.b(var7Lifetime2Lifetime1, 12 + var15Lifetime1Lifetime1, 32, 32);
              var7Lifetime2Lifetime1 = var7Lifetime2Lifetime1 + (lg.coinSprite.d() / 3 >> 2);
            }
          }
          int stackIn_65_0 = (0 == (var16 & 1 << var17)) ? 0 : 1;
          int var19Lifetime1 = stackIn_65_0;
          int var7Lifetime2Lifetime2 = 170;
          int var15Lifetime1Lifetime2 = 220 + verticalOffset;
          if (var19Lifetime1 != 0) {
            PacketBuffer.gameFont.drawCenteredText(111, -14483644, var6, var15Lifetime1Lifetime2, var7Lifetime2Lifetime2, sk.field_d);
          } else {
            PacketBuffer.gameFont.drawCenteredText(114, -56764, var6, var15Lifetime1Lifetime2, var7Lifetime2Lifetime2, jm.field_b);
          }
          int var20Lifetime1 = 160;
          String var18_ref_StringLifetime1 = hn.field_b[var17];
          var15Lifetime1Lifetime2 += 10;
          if (var13[var17] &&
            (var16 & 1 << var17) == 0) {
            var18_ref_StringLifetime1 = pe.field_c;
          }
          PacketBuffer.gameFont.drawParagraph(0, -(var20Lifetime1 / 2) + var7Lifetime2Lifetime2, var5, true, var6, 1, 8 + var15Lifetime1Lifetime2, hi.gameFontMetrics.maxAscent, 0, (RenderSprite[]) null, (aa) null, 0, (int[]) null, var20Lifetime1, 480, var18_ref_StringLifetime1);
          int var7Lifetime2Lifetime3 = 320;
          int var15Lifetime1Lifetime3 = 350 + verticalOffset;
          PacketBuffer.gameFont.drawCenteredText(118, var5, var6, var15Lifetime1Lifetime3, var7Lifetime2Lifetime3, lb.field_a[var17]);
          int var21Lifetime1 = verticalOffset + 200;
          if (var19Lifetime1 != 0) {
            aa.achievementSprites[var17].a(256, var21Lifetime1, 0, var5, 1);
          } else if (qr.field_a <= 0 &&
            var12[var17]) {
            ut.lockedSprite.a(256, var21Lifetime1, 0, var5, 1);
          } else {
            dh.unachievedSprite.a(256, var21Lifetime1, 0, var5, 1);
          }
          int var22 = 360 + verticalOffset;
          if (cn.b(true) ||
            alternateView) {
            var22 -= 20;
          }
          PacketBuffer.gameFont.drawCenteredText(123, var5, -1, var22 + (kn.bigFontMetrics.maxAscent * 3 >> 1), 320, ef.field_g);
        }
    }

    final static int a(byte param0) {
        if (bl.field_c < 2) {
          return 0;
        }
        if (param0 != 68) {
          return 56;
        }
        if (0 != fb.field_e) {
          if (ij.field_h != null) {
            if (!ij.field_h.b((byte) -105)) {
              return 14;
            }
            if (!ij.field_h.a("", param0 - 168)) {
              return 29;
            }
            if (!ij.field_h.c("", -14012)) {
              return 29;
            }
          }
          if (!oi.field_a.b((byte) 83)) {
            return 43;
          }
          if (!oi.field_a.c("commonui", param0 - 14080)) {
            return 57;
          }
          if (!uj.field_b.b((byte) 89)) {
            return 71;
          }
          if (!uj.field_b.c("commonui", -14012)) {
            return 80;
          }
          if (!cf.field_f.b((byte) -13)) {
            return 82;
          }
          if (!cf.field_f.b(param0 - 68)) {
            return 86;
          }
        } else {
          if (!oi.field_a.b((byte) 82)) {
            return 20;
          }
          if (!oi.field_a.c("commonui", -14012)) {
            return 40;
          }
          if (!uj.field_b.b((byte) 93)) {
            return 50;
          }
          if (!uj.field_b.c("commonui", param0 - 14080)) {
            return 60;
          }
          if (!cf.field_f.b((byte) -63)) {
            return 70;
          }
          if (!cf.field_f.b(0)) {
            return 80;
          }
        }
        return 100;
    }

    private final void drawInstructions(int obfuscationGuard, int verticalOffset) {
        int stackIn_20_4;
        int var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        GraphicsRenderer var16 = FlightSession.rendererManager.a((byte) 77);
        int var4 = -1;
        int var5 = 50;
        int var6 = 90 + verticalOffset;
        int var7 = 540;
        if (obfuscationGuard != 197427713) {
          this.previousActionId = 4;
        }
        int var8 = 284;
        this.a(40 + var8, (byte) 86, -20 + var5, var7 + 40, var16, var6 - 20);
        this.a(verticalOffset, (byte) 76, bt.field_b);
        int var9 = 20;
        String[] var10 = new String[50];
        int[] var18 = new int[ac.keySprites.length];
        int[] var17 = var18;
        int[] var11 = var17;
        for (int var12_int = 0; var12_int < ac.keySprites.length; var12_int++) {
          var18[var12_int] = 10;
        }
        int[] var12 = new int[50];
        for (int var13 = 0; var13 < 50; var13++) {
          var12[var13] = -24 + var7;
          if (vq.instructionPage == 5) {
            var12[var13] = var12[var13] - 64;
          }
        }
        int var13Lifetime1 = hi.gameFontMetrics.wrapText(-102, ac.keySprites, var12, var10, sn.a(io.field_a[vq.instructionPage], 120, new String[]{"          "}));
        for (int var14 = 0; var14 < var13Lifetime1; var14++) {
          if (!var10[var14].startsWith("<b>")) {
            RendererBitmapFont stackIn_19_0 = PacketBuffer.gameFont;
            int stackIn_19_1 = var4;
            int stackIn_19_2 = 0;
            RenderSprite[] stackIn_19_3 = ac.keySprites;
            stackIn_20_4 = (vq.instructionPage != 5) ? (0) : (64);
            ((RendererBitmapFont) (Object) stackIn_19_0).drawTextWithImages(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_20_4 + (12 + var5), 0, var10[var14], var6 + var8 / 2 + var9 * (var14 - var13Lifetime1 / 2), var18);
          } else {
            se.bigGameFont.drawTextWithImages(var4, 0, ac.keySprites, var5 + 12, 0, var10[var14], var9 * (var14 - var13Lifetime1 / 2) + (10 - (-var6 - var8 / 2)), var18);
          }
        }
        se.bigGameFont.drawRightAlignedTextWithImages(0, var4, var11, (byte) -110, -10 + (var8 + var6), om.a(io.field_a.length, 1 + vq.instructionPage, (byte) 66), var7 + var5 - 10, ac.keySprites);
    }

    final static void a(byte param0, int param1, boolean param2) {
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String stackIn_76_2 = null;
        String stackIn_83_2 = null;
        int stackIn_116_1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          cu.field_r = true;
          ol.field_c = param1;
          if (ol.field_c == 0) {
            var3_int = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
            var4 = 3 + var3_int;
            ne.field_g = new String[var4];
            rn.field_a = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              rn.field_a[var5] = -1;
            }
            rm.field_g = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              ne.field_g[var5] = st.field_b[var5];
            }
            ne.field_g[var4 - 3] = "";
            ne.field_g[-2 + var4] = rj.field_a;
            rn.field_a[-2 + var4] = 0;
            rm.field_g[0] = 4;
            ne.field_g[-1 + var4] = ne.field_e;
            rn.field_a[-1 + var4] = 1;
            rm.field_g[1] = 5;
          } else if (ol.field_c == 1) {
            var3_int = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
            var4 = 2 + var3_int;
            ne.field_g = new String[var4];
            rn.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              rn.field_a[var5] = -1;
            }
            rm.field_g = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              ne.field_g[var5] = st.field_b[var5];
            }
            ne.field_g[var4 - 2] = "";
            ne.field_g[-1 + var4] = ne.field_e;
            rn.field_a[var4 - 1] = 0;
            rm.field_g[0] = 5;
          } else if (ol.field_c != 2) {
            if (ol.field_c == 3) {
              if (pt.field_b.field_q) {
                var3_int = ff.a(qk.field_g, jm.field_c, st.field_b, -3, nh.field_c);
              } else {
                var3_int = ff.a(qk.field_g, ht.field_h, st.field_b, -3, nh.field_c);
              }
              var4 = var3_int + 2;
              ne.field_g = new String[var4];
              rn.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                rn.field_a[var5] = -1;
              }
              rm.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                ne.field_g[var5] = st.field_b[var5];
              }
              ne.field_g[var4 - 2] = "";
              ne.field_g[var4 - 1] = ne.field_e;
              rn.field_a[var4 - 1] = 0;
              rm.field_g[0] = 5;
            } else if (4 == ol.field_c) {
              var3_int = ff.a(qk.field_g, tt.field_b, st.field_b, -3, nh.field_c);
              var4 = 2 + var3_int;
              rn.field_a = new int[var4];
              ne.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                rn.field_a[var5] = -1;
              }
              rm.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                ne.field_g[var5] = st.field_b[var5];
              }
              ne.field_g[-2 + var4] = "";
              ne.field_g[-1 + var4] = ne.field_e;
              rn.field_a[var4 - 1] = 0;
              rm.field_g[0] = 5;
            } else {
              if (ol.field_c != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ff.a(qk.field_g, ur.field_c, st.field_b, -3, nh.field_c);
              var4 = 3 + var3_int;
              rn.field_a = new int[var4];
              ne.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                rn.field_a[var5] = -1;
              }
              rm.field_g = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                ne.field_g[var5] = st.field_b[var5];
              }
              ne.field_g[-3 + var4] = "";
              ne.field_g[var4 - 2] = lj.field_a;
              rn.field_a[var4 - 2] = 0;
              rm.field_g[0] = 3;
              ne.field_g[var4 - 1] = ne.field_e;
              rn.field_a[var4 - 1] = 1;
              rm.field_g[1] = 5;
            }
          } else {
            var3_int = ff.a(qk.field_g, sn.a(ij.field_i, 123, new String[]{"<br><%0><br>"}), st.field_b, -3, nh.field_c);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(st.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            es.field_a = new String[var4];
            au.a(st.field_b, 0, es.field_a, 0, var4);
            cc.field_b = new String[-var4 + (var3_int - 1)];
            au.a(st.field_b, 1 + var4, cc.field_b, 0, -1 - var4 + var3_int);
            var3_int = ff.a(qk.field_g, sn.a(dh.field_d, 105, new String[]{"<br><%0><br>"}), st.field_b, -3, nh.field_c);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(st.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            cn.field_z = new String[var4];
            au.a(st.field_b, 0, cn.field_z, 0, var4);
            gp.field_v = new String[-1 + var3_int - var4];
            au.a(st.field_b, var4 + 1, gp.field_v, 0, -1 + var3_int - var4);
            if (es.field_a.length >= cn.field_z.length) {
              stackIn_65_0 = es.field_a.length;
            } else {
              stackIn_65_0 = cn.field_z.length;
            }
            var5 = stackIn_65_0;
            if (gp.field_v.length <= cc.field_b.length) {
              stackIn_68_0 = cc.field_b.length;
            } else {
              stackIn_68_0 = gp.field_v.length;
            }
            int var6 = stackIn_68_0;
            int var7 = 7 + var5 + var6;
            ne.field_g = new String[var7];
            rn.field_a = new int[var7];
            for (int var8 = 0; var7 > var8; var8++) {
              rn.field_a[var8] = -1;
            }
            ne.field_g[1] = du.field_n;
            ne.field_g[0] = qg.field_b;
            rm.field_g = new int[2];
            rn.field_a[1] = 0;
            rm.field_g[1] = 2;
            ne.field_g[5] = "";
            rm.field_g[0] = 5;
            rn.field_a[3] = 1;
            ne.field_g[2] = dk.field_a;
            ne.field_g[4] = li.field_b;
            ne.field_g[3] = vl.field_a;
            for (int var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              String[] stackIn_75_0 = ne.field_g;
              int stackIn_75_1 = 6 + var8Lifetime2;
              if (-var5 + (cn.field_z.length + var8Lifetime2) < 0) {
                stackIn_76_2 = "";
              } else {
                stackIn_76_2 = cn.field_z[-var5 + (var8Lifetime2 + cn.field_z.length)];
              }
              stackIn_75_0[stackIn_75_1] = stackIn_76_2;
            }
            ne.field_g[6 + var5] = null;
            rn.field_a[var5 + 6] = -2;
            for (int var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              String[] stackIn_80_0 = ne.field_g;
              int stackIn_80_1 = var5 + (7 + var8Lifetime3);
              int stackIn_80_2 = ~gp.field_v.length;
              int stackIn_80_3 = ~var8Lifetime3;
              if (stackIn_80_2 >= stackIn_80_3) {
                stackIn_83_2 = "";
              } else {
                stackIn_83_2 = gp.field_v[var8Lifetime3];
              }
              stackIn_80_0[stackIn_80_1] = stackIn_83_2;
            }
            PacketBuffer.field_e = kh.a(-115);
          }
          pr.field_b.itemCount = rm.field_g.length;
          if (param0 != -119) {
            return;
          }
          int var3_intLifetime1 = 0;
          for (int var4Lifetime1 = 0; var4Lifetime1 < ne.field_g.length; var4Lifetime1++) {
            boolean stackIn_91_0 = true;
            String stackIn_91_1 = ne.field_g[var4Lifetime1];
            boolean stackIn_92_2 = !(rn.field_a[var4Lifetime1] < 0);
            int var5Lifetime1 = IntrusiveDeque.a(stackIn_91_0, stackIn_91_1, stackIn_92_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ol.field_c == 2) {
            String[] var10 = es.field_a;
            String[] var4_ref_String__ = var10;
            for (int var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              String var11 = var10[var5Lifetime2];
              int var7Lifetime1 = IntrusiveDeque.a(true, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            String[] var4_ref_String__Lifetime1 = cc.field_b;
            for (int var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              String var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              int var7Lifetime1Lifetime1 = IntrusiveDeque.a(true, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ac.field_c = ri.field_a - (var3_intLifetime1 >> 1);
          ro.field_q = (pp.field_a + as.field_c << 1) * pr.field_b.itemCount;
          je.field_a = -(var3_intLifetime1 >> 1) + (ri.field_a + var3_intLifetime1);
          for (int var4Lifetime2 = 0; var4Lifetime2 < ne.field_g.length; var4Lifetime2++) {
            int stackIn_115_0 = ro.field_q;
            if (0 > rn.field_a[var4Lifetime2]) {
              stackIn_116_1 = ce.field_u;
            } else {
              stackIn_116_1 = lp.field_h;
            }
            ro.field_q = stackIn_115_0 + stackIn_116_1;
          }
          pt.field_a = -(ro.field_q >> 1) + Aircraft.field_o;
          nb.field_b = new int[ne.field_g.length][];
          int var4Lifetime3 = 0;
          int var5Lifetime3 = pt.field_a;
          while (ne.field_g.length > var4Lifetime3) {
            int var6Lifetime1 = rn.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              int var7Lifetime2 = IntrusiveDeque.a(true, ne.field_g[var4Lifetime3], true);
              int var8Lifetime1 = -(var7Lifetime2 >> 1) + ri.field_a;
              var5Lifetime3 = var5Lifetime3 + pp.field_a;
              nb.field_b[var4Lifetime3] = new int[4];
              nb.field_b[var4Lifetime3][0] = var8Lifetime1 - ud.field_g;
              nb.field_b[var4Lifetime3][1] = var5Lifetime3;
              nb.field_b[var4Lifetime3][2] = var7Lifetime2 + (ud.field_g << 1);
              var5Lifetime3 = var5Lifetime3 + (lp.field_h + (as.field_c << 1) + pp.field_a);
              nb.field_b[var4Lifetime3][3] = lp.field_h + (as.field_c << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + ce.field_u;
            }
            var4Lifetime3++;
          }
          if (ol.field_c == 2) {
            pr.field_b.resetSelection(param2, -1, 0, -1);
          } else {
            pr.field_b.resetSelection(param2, rc.b((byte) -80, ic.field_b, cf.field_g), 0, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "nk.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, String param2) {
        try {
          int var4_int = 104 % ((param1 - 5) / 54);
          int var5 = 90 + dp.titleFontMetrics.measureTextWidth((byte) 94, param2);
          this.a(82, FlightSession.rendererManager.a((byte) 75), -(var5 >> 1) + 320, var5, param0 + 26, 60, 1442840524);
          kn.titleFont.drawCenteredText(111, -12046068, -1, 67 + param0, 320, param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, GraphicsRenderer param1, int param2, int param3, int param4) {
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          mb.brassButtonSprites[0].a(param4, param0);
          mb.brassButtonSprites[2].a(-mb.brassButtonSprites[2].d() + (param4 + param3), param0);
          bo var10 = fa.a(param1, true);
          bo var11 = var10;
          param3 = param4 + param3 - mb.brassButtonSprites[2].d();
          param4 = param4 + mb.brassButtonSprites[0].d();
          var11.a(param3, param4, param0 + mb.brassButtonSprites[2].c(), param0, 120);
          while (param4 < param3) {
            mb.brassButtonSprites[1].a(param4, param0);
            param4 = param4 + mb.brassButtonSprites[1].d();
          }
          var11.a(true);
          int var7 = -128 % ((param2 + 32) / 50);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    MenuScreen(int screenId) {
        this.pendingClickX = -1;
        this.selectedAchievementId = -1;
        this.screenId = screenId;
        this.input = new MenuInputState(ua.menuActions[screenId].length);
    }

    private final void handleNavigationKey(int obfuscationGuard) {
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.screenId == 2 &&
          !cn.b(true)) {
          if (!kh.field_a &&
            ln.field_d < 2) {
            if (bk.lastKeyCode == 96) {
              if (this.input.selectedIndex >= 0 &&
                this.input.selectedIndex != 4) {
                if (this.input.selectedIndex == 0) {
                  this.input.setSelectedIndex((byte) -102, 2);
                } else if (this.input.selectedIndex != 4) {
                  this.input.setSelectedIndex((byte) -125, this.input.selectedIndex - 1);
                }
                boolean decompiledFrameRemainder1 = false;
              }
              else {
                this.input.setSelectedIndex((byte) -101, 0);
              }
            }
            if (bk.lastKeyCode == 97) {
              if (this.input.selectedIndex >= 0 &&
                this.input.selectedIndex != 4) {
                if (this.input.selectedIndex < 2) {
                  this.input.setSelectedIndex((byte) -100, 1 + this.input.selectedIndex);
                } else if (this.input.selectedIndex == 2) {
                  this.input.setSelectedIndex((byte) -102, 0);
                }
                boolean decompiledFrameRemainder0 = false;
              }
              else {
                this.input.setSelectedIndex((byte) -128, 2);
              }
            }
            if (99 == bk.lastKeyCode) {
              if (0 <= this.input.selectedIndex &&
                this.input.selectedIndex <= 2) {
                this.input.setSelectedIndex((byte) -119, 4);
              } else {
                this.input.setSelectedIndex((byte) -122, oc.highscoreView);
              }
            }
            if (bk.lastKeyCode == 98) {
              if (this.input.selectedIndex == 4) {
                this.input.setSelectedIndex((byte) -108, oc.highscoreView);
              } else {
                this.input.setSelectedIndex((byte) -100, 4);
              }
            }
            this.input.captureKey((byte) 126);
            return;
          }
          if (bk.lastKeyCode == 96) {
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -117, 3);
            } else {
              this.input.setSelectedIndex((byte) -101, qg.a((byte) -60, 3, this.input.selectedIndex - 1) + this.input.selectedIndex / 3 * 3);
            }
          }
          if (bk.lastKeyCode == 97) {
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -114, 5);
            }
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -107, 4);
            }
            this.input.setSelectedIndex((byte) -126, qg.a((byte) -98, 3, 1 + this.input.selectedIndex) + this.input.selectedIndex / 3 * 3);
          }
          if (99 == bk.lastKeyCode) {
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -99, 1);
            }
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -121, 4);
            }
            this.input.setSelectedIndex((byte) -113, qg.a((byte) 118, 6, this.input.selectedIndex + 3));
          }
          if (bk.lastKeyCode == 98) {
            if (0 > this.input.selectedIndex) {
              this.input.setSelectedIndex((byte) -121, 4);
            }
            if (this.input.selectedIndex < 0) {
              this.input.setSelectedIndex((byte) -100, 4);
            }
            this.input.setSelectedIndex((byte) -101, qg.a((byte) -78, 6, -3 + this.input.selectedIndex));
          }
          this.input.captureKey((byte) 124);
          return;
        }
        if (this.screenId == 3) {
          this.input.handleHorizontalKey((byte) -74);
          if (bk.lastKeyCode != 96 &&
            bk.lastKeyCode != 97) {
            return;
          }
          while (!this.isItemEnabled(this.input.selectedIndex, (byte) -17)) {
            this.input.handleHorizontalKey((byte) -85);
          }
          return;
        }
        this.input.handleVerticalKey(true);
        if (obfuscationGuard != 4146) {
          int discarded$0 = this.getItemLeft(-33, 41);
        }
        if (bk.lastKeyCode == 98 ||
          bk.lastKeyCode == 99) {
          while (!this.isItemEnabled(this.input.selectedIndex, (byte) -17)) {
            this.input.handleVerticalKey(true);
          }
        }
    }

    private final int getItemRight(int obfuscationGuard, int itemIndex) {
        if (this.screenId == 2 &&
          !cn.b(true)) {
          return 180 + this.getItemLeft(itemIndex, 200);
        }
        if (this.screenId == 2 &&
          cn.b(true)) {
          return 100 + ClientException.menuRight[this.screenId];
        }
        if (this.screenId == 3) {
          return this.getItemLeft(itemIndex, 200) + 200;
        }
        if (obfuscationGuard <= 108) {
          GraphicsRenderer var4 = (GraphicsRenderer) null;
          this.drawItem(31, -24, -94, false, (GraphicsRenderer) null);
        }
        if (this.screenId == 4 ||
          5 == this.screenId) {
          return this.getItemLeft(itemIndex, 200) + 400;
        }
        return ClientException.menuRight[this.screenId];
    }

    static {
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new IntrusiveDeque();
    }
}
