/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AchievementBrowserScreen extends MenuScreen {
    static char[] field_B;
    static int field_u;
    static Boolean field_r;
    static RgbSprite[] field_A;
    private String[] descriptionLines;
    static String[] field_s;
    private NodeDeque visibleIcons;
    int[] achievementMask;
    private NodeDeque departingIcons;
    static RgbSprite constructionMidSprite;
    private int[] descriptionWidths;
    private NodeDeque[] achievementPages;
    private int pageCount;
    private int pageIndex;

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.advanceScreen(updateFlag, inputEnabled, -89);
        nf.hoveredAchievementId = -1;
        AchievementIcon var4 = (AchievementIcon) (this.visibleIcons.first(-117));
        if (obfuscationGuard > -52) {
          field_u = 41;
        }
        while (var4 != null) {
          var4.update(-127);
          var4 = (AchievementIcon) (this.visibleIcons.next((byte) 116));
        }
        var4 = (AchievementIcon) (this.departingIcons.first(-113));
        while (var4 != null) {
          var4.update(-128);
          if (var4.remainingOffset == 0) {
            var4.recycle(1);
          }
          var4 = (AchievementIcon) (this.departingIcons.next((byte) 116));
        }
    }

    final void drawScreen(byte obfuscationGuard) {
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        PaletteFont stackIn_19_0 = null;
        String stackIn_20_1 = null;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        AchievementIcon var15;
        Object var16;
        AchievementIcon var17;
        int var11Lifetime1;
        var16 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -104);
        GzipInflater.a(550, 5, 88, 5, 140, (byte) -72, 45);
        MovingBody.a((byte) 98, 560, 80, 140, 228);
        var17 = (AchievementIcon) (this.visibleIcons.first(-94));
        while (var17 != null) {
          var17.draw((byte) 103);
          var17 = (AchievementIcon) (this.visibleIcons.next((byte) 116));
        }
        var15 = (AchievementIcon) (this.departingIcons.first(-43));
        while (var15 != null) {
          var15.draw((byte) 107);
          var15 = (AchievementIcon) (this.departingIcons.next((byte) 116));
        }
        sc.popRaster(-81);
        GzipInflater.a(146, 5, 146, 5, 233, (byte) -87, 45);
        GzipInflater.a(399, 5, 146, 5, 233, (byte) -107, 196);
        if (nf.selectedAchievementId != -1) {
          stackIn_9_0 = nf.selectedAchievementId;
        } else {
          stackIn_9_0 = nf.hoveredAchievementId;
        }
        var3 = stackIn_9_0;
        if (obfuscationGuard >= -14) {
          return;
        }
        var4 = ob.field_D.descent + ob.field_D.capHeight;
        var5 = nn.field_g.capHeight + nn.field_g.descent;
        if (-1 != var3) {
          stackIn_17_0 = (!DirectByteStorage.isBitSet(this.achievementMask, var3, (byte) -75)) ? 0 : 1;
          var6 = stackIn_17_0;
          nn.field_g.drawLeft(field_s[var3], 209, nn.field_g.capHeight + 246, 1, -1);
          stackIn_19_0 = nn.field_g;
          if (var6 == 0) {
            stackIn_20_1 = po.field_c;
          } else {
            stackIn_20_1 = DesertBackground.field_s;
          }
          ((PaletteFont) (Object) stackIn_19_0).drawLeft(stackIn_20_1, 209, 2 * var5 + 246 + 2, 2, -1);
          if (var6 != 0) {
            IntrusiveHashTable.achievementSourceIcons[var3].drawTransparent(54, 242);
          } else {
            LevelCompleteScreen.field_F.drawTransparent(54, 242);
          }
          var7 = 246 + 5 * var5 / 2;
          var8 = var7 + var5;
          var9 = var7 - (-(7 * var4) + ob.field_D.ascent);
          var10 = ob.field_D.wrapText(rd.a(mp.field_bc[var3], new String[]{nl.a(true, true, 0, (long)HalloweenBackground.field_r[var3], cd.field_e)}, (byte) 103), this.descriptionWidths, this.descriptionLines);
          for (var11 = 0; var11 < var10; var11++) {
            ob.field_D.drawLeft(this.descriptionLines[var11], 209, var8, 2, -1);
            var8 = var8 + var4;
          }
          ob.field_D.drawLeft(LevelPackLoader.field_c + Brick.field_D[var3], 209, var9 + (-(2 * ob.field_D.descent) - nj.field_z.height / 2), 2, -1);
          ob.field_D.drawLeft(fl.field_m, 209, -nn.field_g.descent + var9, 2, -1);
          var11Lifetime1 = ob.field_D.measureText(fl.field_m) + 209;
          var12 = -(nj.field_z.canvasHeight / 2) + var9;
          for (var13 = 0; fq.field_e[var3] > var13; var13++) {
            nj.field_z.a(var11Lifetime1, var12);
            var11Lifetime1 = var11Lifetime1 + nj.field_z.width / 3;
          }
        } else {
          nn.field_g.drawLeft(ProducerFramebuffer.field_h, 209, 246 + nn.field_g.capHeight, 2, -1);
          if (og.h(-26090)) {
            var6 = 246 + var5 * 3;
            ob.field_D.drawLeft(na.field_N, 209, var6, 2, -1);
          }
        }
        AchievementMaskRequest.a(this.screenId, 19);
        this.a(0);
    }

    final static String buildSavePrompt(boolean hasAchievements, boolean hasScore, boolean hasProgress, int obfuscationGuard) {
        int var4 = 0;
        if (hasAchievements) {
          var4 += 4;
        }
        int var5 = 66 % ((38 - obfuscationGuard) / 57);
        if (hasScore) {
          var4 += 2;
        }
        if (hasProgress) {
          var4++;
        }
        return MultiplayerExitScreen.savePrompts[var4];
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        RgbSprite var6;
        boolean decompiledFrameRemainder0 = true;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.selection.selectedIndex < 0) {
          this.selection.setSelectedIndex(false, 2);
        } else {
          if (0 == this.selection.selectedIndex) {
            if (keyCode != 98 &&
              99 != keyCode) {
              if (((keyCode == 96 ||
                keyCode == 97)) && (!(!this.isButtonEnabled((byte) 106, 1)))) {
                this.selection.setSelectedIndex(false, 1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.selection.setSelectedIndex(false, 2);
            }
          } else {
            if (this.selection.selectedIndex == 1) {
              if (keyCode != 98 &&
                keyCode != 99) {
                if (((keyCode == 96 ||
                  keyCode == 97)) && (!(!this.isButtonEnabled((byte) 121, 0)))) {
                  this.selection.setSelectedIndex(false, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.selection.setSelectedIndex(false, 2);
              }
            } else {
              if (this.selection.selectedIndex != 2) {
                if (this.selection.selectedIndex == 3) {
                  if (keyCode != 97 &&
                    96 != keyCode) {
                    if ((98 == keyCode ||
                      keyCode == 99)) {
                      if (!this.isButtonEnabled((byte) 124, 0)) {
                        this.selection.setSelectedIndex(false, 1);
                      } else {
                        this.selection.setSelectedIndex(false, 0);
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.selection.setSelectedIndex(false, 2);
                  }
                }
              } else {
                if (keyCode != 97 &&
                  keyCode != 96) {
                  if ((keyCode == 98 ||
                    keyCode == 99)) {
                    if (!this.isButtonEnabled((byte) 103, 0)) {
                      this.selection.setSelectedIndex(false, 1);
                    } else {
                      this.selection.setSelectedIndex(false, 0);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (this.buttons.length == 4) {
                    this.selection.setSelectedIndex(false, 3);
                  }
                }
              }
            }
          }
        }
        if (obfuscationGuard != -120) {
          var6 = (RgbSprite) null;
          AchievementBrowserScreen.a((RgbSprite) null, -23, 26, 101, 46, -121, -33, (RgbSprite) null, 118, (RgbSprite) null, -100);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 118) {
            field_B = (char[]) null;
          }
          stackIn_5_0 = (HighscorePackSelector.a(0, param1) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("af.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    abstract boolean isAchievementExcluded(int achievementId, byte obfuscationGuard);

    public static void f(byte param0) {
        field_A = null;
        if (param0 >= -92) {
          return;
        }
        constructionMidSprite = null;
        field_r = null;
        field_s = null;
        field_B = null;
    }

    final static void a(RgbSprite param0, int param1, int param2, int param3, int param4, int param5, int param6, RgbSprite param7, int param8, RgbSprite param9, int param10) {
        if (param5 != 0) {
          return;
        }
        try {
          param7.drawAt((5 * param2 >> 16) + param1 + (param4 - param7.canvasWidth) / 2, param10);
          if (param8 == 1) {
            Rasterizer2D.a(100 / param8 << 4, 1600, 64, 128, sq.field_b);
            Rasterizer2D.a(200 / param8 << 4, 800, 48, 192, sq.field_b);
            Rasterizer2D.a(300 / param8 << 4, 1920, 64, 128, sq.field_b);
            Rasterizer2D.a(370 / param8 << 4, 2720, 48, 128, sq.field_b);
            Rasterizer2D.a(480 / param8 << 4, 1120, 48, 192, sq.field_b);
          }
          param9.drawTransparent(-(220 / param8) + (10 * param2 >> 16) + (param1 + (param4 - param9.canvasWidth) / 2), -param9.canvasHeight + (480 + 37 / param8));
          param0.drawTransparent(param1 + ((param4 - param0.canvasWidth) / 2 + (20 * param2 >> 16)) - 5 / param8, 480 - param0.canvasHeight);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "af.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    AchievementBrowserScreen(int screenId, int[] actionIds) {
        super(screenId, 38, 460, 402, 35, actionIds);
        int var3_int = 0;
        this.descriptionLines = new String[24];
        this.visibleIcons = new NodeDeque();
        this.departingIcons = new NodeDeque();
        try {
          this.achievementPages = new NodeDeque[1 + field_s.length / 16];
          for (var3_int = 0; this.achievementPages.length > var3_int; var3_int++) {
            this.achievementPages[var3_int] = new NodeDeque();
          }
          this.descriptionWidths = new int[]{373};
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "af.<init>(" + screenId + ',' + (actionIds != null ? "{...}" : "null") + ')');
        }
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          constructionMidSprite = (RgbSprite) null;
        }
        return this.buttonTop;
    }

    final void onExit(byte obfuscationGuard) {
        this.clearIconQueues((byte) -121);
        if (obfuscationGuard != 79) {
          this.descriptionLines = (String[]) null;
        }
    }

    private final void clearIconQueues(byte obfuscationGuard) {
        if (obfuscationGuard > -42) {
          return;
        }
        this.clearIcons(32367, this.visibleIcons);
        this.clearIcons(32367, this.departingIcons);
    }

    final boolean isButtonEnabled(byte obfuscationGuard, int buttonIndex) {
        int var3 = this.buttons[buttonIndex].actionId;
        if (var3 == 44 &&
          this.pageIndex == 0) {
          return false;
        }
        if (var3 == 45 &&
          this.pageCount - 1 <= this.pageIndex) {
          return false;
        }
        if (obfuscationGuard < 80) {
          field_u = -122;
          return true;
        }
        return true;
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var4;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        super.onEnter(usePointer, 2, 110);
        this.pageIndex = 0;
        this.pageCount = 0;
        nf.hoveredAchievementId = -1;
        nf.selectedAchievementId = -1;
        this.achievementPages[this.pageCount].clear((byte) -114);
        if (obfuscationGuard <= 96) {
          return;
        }
        var4 = 0;
        for (var5 = 0; var5 < field_s.length; var5++) {
          if (!this.isAchievementExcluded(var5, (byte) 38)) {
            this.achievementPages[this.pageCount].addLast(new IntNode(var5), (byte) 3);
            var4++;
            if (var4 == 16) {
              var4 = 0;
              fieldTemp$0 = this.pageCount + 1;
              this.pageCount = this.pageCount + 1;
              this.achievementPages[fieldTemp$0].clear((byte) -46);
            }
          }
        }
        if (!this.achievementPages[this.pageCount].isEmpty(false)) {
          this.pageCount = this.pageCount + 1;
        }
        this.showAchievementPage(2, 0, this.achievementPages[this.pageIndex]);
        return;
    }

    private final void showAchievementPage(int columnDivisor, int transitionDirection, NodeDeque achievementIds) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        AchievementIcon var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        IntNode var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          nf.selectedAchievementId = -1;
          var4_int = 640 * transitionDirection;
          this.clearIcons(32367, this.departingIcons);
          var5 = (AchievementIcon) (this.visibleIcons.removeFirst(3));
          while (var5 != null) {
            var5.transitionKeepMask = -1;
            var5.remainingOffset = -var4_int;
            this.departingIcons.addLast(var5, (byte) 3);
            var5 = (AchievementIcon) (this.visibleIcons.removeFirst(3));
          }
          var6 = 82;
          var7 = (24 + var6 * 2) / columnDivisor;
          var8 = 150;
          var9 = (IntNode) (achievementIds.first(-74));
          var10 = 0;
          while (var9 != null) {
            this.visibleIcons.addLast(cn.acquireAchievementIcon(-var4_int, var8, 32, this, 32, var10, var4_int + var7, var9.value, columnDivisor - 1), (byte) 3);
            rk.achievementTransitionMask = rk.achievementTransitionMask | 1 << var10;
            var9 = (IntNode) (achievementIds.next((byte) 116));
            var10++;
            if (var10 != 8) {
              var7 += 56;
              continue;
            }
            var8 += 35;
            var7 = (80 + var6 * 2) / 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("af.RA(").append(columnDivisor).append(',').append(transitionDirection).append(',');
          if (achievementIds == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void clearIcons(int obfuscationGuard, NodeDeque icons) {
        int var4 = 0;
        AchievementIcon icon = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 32367) {
            this.visibleIcons = (NodeDeque) null;
          }
          icon = (AchievementIcon) (icons.removeFirst(obfuscationGuard - 32364));
          while (icon != null) {
            icon.recycle(1);
            icon = (AchievementIcon) (icons.removeFirst(3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("af.G(").append(obfuscationGuard).append(',');
          if (icons == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5;
        int var6;
        int var7;
        MenuButton var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 123) {
          return false;
        }
        var8 = this.buttons[buttonIndex];
        var5 = var8.actionId;
        var6 = var5;
        if (var6 != 44) {
          if (45 != var6) {
            return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
          }
          if (this.selection.isActivated((byte) 113) &&
            this.isButtonEnabled((byte) 90, buttonIndex) &&
            rk.achievementTransitionMask == 0) {
            fieldTemp$0 = this.pageIndex + 1;
            this.pageIndex = this.pageIndex + 1;
            if (fieldTemp$0 >= this.pageCount) {
              this.pageIndex = this.pageCount - 1;
            }
            this.showAchievementPage(2, 1, this.achievementPages[this.pageIndex]);
            if (!this.isButtonEnabled((byte) 86, 1)) {
              this.selection.setSelectedIndex(false, 0);
            }
            return true;
          }
        } else {
          if (this.selection.isActivated((byte) 113) &&
            this.isButtonEnabled((byte) 86, buttonIndex)) {
            if (rk.achievementTransitionMask != 0) {
              return false;
            }
            fieldTemp$1 = this.pageIndex - 1;
            this.pageIndex = this.pageIndex - 1;
            if (fieldTemp$1 < 0) {
              this.pageIndex = 0;
            }
            this.showAchievementPage(2, -1, this.achievementPages[this.pageIndex]);
            if (!this.isButtonEnabled((byte) 83, 0)) {
              this.selection.setSelectedIndex(false, 1);
            }
            return true;
          }
        }
        return false;
    }

    final void layoutButtons(boolean obfuscationGuard) {
        int dupTemp$0 = 0;
        int var6 = 0;
        String stackIn_7_0 = null;
        MenuButton var3;
        int var4;
        int var5;
        MenuButton var6_ref_q;
        String var7;
        int var8;
        MenuButton var9;
        String var10;
        MenuButton var11;
        int var5Lifetime1;
        var8 = BrickABrac.field_J ? 1 : 0;
        var9 = this.buttons[0];
        var9.y = 145;
        var9.x = 50;
        var9.width = 25;
        var9.height = 78;
        if (!obfuscationGuard) {
          this.isButtonEnabled((byte) 110, 75);
        }
        var3 = this.buttons[1];
        var3.x = -5 - (var9.width - 595);
        var3.y = var9.y;
        var3.height = var9.height;
        var3.width = var9.width;
        var4 = 0;
        for (var5 = 2; this.buttons.length > var5; var5++) {
          var6_ref_q = this.buttons[var5];
          if (var6_ref_q.actionId == 8) {
            stackIn_7_0 = this.e((byte) 105);
          } else {
            stackIn_7_0 = ag.buttonLabels[var6_ref_q.actionId];
          }
          var10 = stackIn_7_0;
          var7 = var10;
          dupTemp$0 = 30 + nn.field_g.measureText(var10);
          var6_ref_q.width = dupTemp$0;
          var4 = var4 + dupTemp$0;
          if (var5 > 3) {
            var4 += 10;
          }
        }
        var5Lifetime1 = (640 - var4) / 2;
        for (var6 = 2; var6 < this.buttons.length; var6++) {
          var11 = this.buttons[var6];
          var11.x = var5Lifetime1;
          var11.y = this.getButtonTop(var6, 1);
          var11.height = this.getButtonHeight((byte) -7, var6);
          var5Lifetime1 = var5Lifetime1 + (10 + var11.width);
        }
    }

    static {
        field_B = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_s = new String[]{"Brick Destroyer", "Brick Assassin", "Brick Slayer", "Chip Away at the Stone", "Stone Idol", "Stone Circle", "Stone Mason", "Another Brick in the Wall", "Follow the Yellow Brick Road", "Bounce Master Junior", "Bounce Master Senior", "Master Builder", "Bricking It", "Chip Off the Old Brick", "Brick Me (Baby) One More Time", "Gone with the Brick", "Rentabrick", "The House That Jack Built", "Blow Our House Down", "Stone Cold Crazy", "Dry Stone Wall", "Stone Destroyer", "Somewhere Over the Rainbow", "Fierce Brickster", "Expert Brickster", "Master Brickster", "Comeback Kid", "Reluctant Charger", "Crazy Fool", "Brickicide", "Glutton for Punishment", "And Still You Did Not Learn", "It's So Easy", "Too Much of a Good Thing", "Covent Garden", "Marble Arch", "Nelson's Column", "Tower of London", "Buckingham Palace", "Brick Crusher", "Romancing the Brick", "Ghost in the Brick"};
    }
}
