/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MatchPhaseView {
    static String field_b;
    static IconLabel field_d;
    int field_g;
    CommonGame field_a;
    static int field_e;
    boolean field_f;
    private MenuSelection field_i;
    MenuButton[] field_c;
    int field_h;

    private final int hitTestButton(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        if (param2 > -48) {
          this.isButtonEnabled(38, -6);
        }
        for (var4 = 0; var4 < this.field_i.itemCount; var4++) {
          var5 = this.field_c[var4].width;
          var6 = this.field_c[var4].height;
          var7 = -(var5 >> 1) + this.buttonX(111, var4);
          var8 = this.buttonY(342, var4) - (var6 >> 1);
          if (this.isButtonEnabled(var4, 50) &&
            var7 <= param0 &&
            var7 + var5 > param0 &&
            param1 >= var8 &&
            param1 < var8 + var6) {
            return var4;
          }
        }
        return -1;
    }

    boolean isButtonEnabled(int param0, int param1) {
        if (param1 != 50) {
          this.drawCountdown(2, 47);
        }
        return true;
    }

    int buttonX(int param0, int param1) {
        if (param0 <= 106) {
          return 15;
        }
        return 544;
    }

    final boolean isLocalParticipantActive(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 13) {
          this.positionButtons(-24);
        }
        stackIn_6_0 = (this.field_g != -2) && (this.field_a.participantStatus[this.field_g].isActive(3511));
        return stackIn_6_0;
    }

    final static MeshData createFootballerMesh(boolean param0, int param1, int param2, int param3, boolean[][] param4, int param5, boolean[][] param6, byte param7, int param8, boolean param9, int param10) {
        MeshData stackIn_4_0 = null;
        MeshData stackIn_13_0 = null;
        int stackIn_57_0 = 0;
        int stackIn_72_0 = 0;
        MeshData stackIn_80_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        int var12_int = 0;
        MeshData var12 = null;
        int var13 = 0;
        int var14 = 0;
        MeshData var15 = null;
        int var16 = 0;
        int var17 = 0;
        short[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        MeshData var27 = null;
        int var28 = 0;
        MeshData var29 = null;
        short[] var33 = null;
        int var13Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var20Lifetime3;
        int var20Lifetime4;
        int var21Lifetime3;
        int var21Lifetime4;
        int var21Lifetime5;
        int var22Lifetime3;
        var26 = Kickabout.field_G;
        try {
          if (param0) {
            stackIn_4_0 = TrinketSlot.a(param9, param2, param4, (byte) -103, param6, param3, param10);
            return stackIn_4_0;
          }
          var27 = new MeshData(new MeshData[]{WidgetContainer.field_v[param2][param8]}, 1);
          var29 = var27;
          if (param9) {
            var12_int = WidgetTheme.field_e[param2];
            for (var13 = 0; var13 < var29.field_H.length; var13++) {
              var27.field_H[var13] = var27.field_H[var13] * 3;
              var29.field_l[var13] = 3 * (var27.field_l[var13] - var12_int) + var12_int;
            }
          }
          var12 = new MeshData(new MeshData[]{var29, PacketBuffer.field_m[param2]}, 2);
          var13Lifetime1 = (short)param3;
          var14 = (short)param10;
          var15 = new MeshData(var12, true, false, true, true);
          if (param4 == null &&
            param6 == null) {
            stackIn_13_0 = var15;
            return stackIn_13_0;
          }
          if (param7 >= -39) {
            field_b = (String) null;
          }
          var33 = var12.field_p;
          var19 = var15.field_p;
          if (param2 != 4) {
            var16 = -9284;
            var20 = ParticipantStatus.field_h[param2][param8][param5].length;
            for (var21 = 0; var33.length > var21; var21++) {
              if (var33[var21] == var16) {
                var19[var21] = (short)ParticipantStatus.field_h[param2][param8][param5][0];
              }
            }
            var20Lifetime3 = ParticipantStatus.field_h[param2][param8][param5].length;
            for (var21Lifetime3 = 0; var21Lifetime3 < var20Lifetime3; var21Lifetime3++) {
              var16Lifetime3 = (short)ParticipantStatus.field_h[param2][param8][0][var21Lifetime3];
              for (var22 = 0; var22 < var33.length; var22++) {
                if (var16Lifetime3 == var33[var22]) {
                  var19[var22] = (short)ParticipantStatus.field_h[param2][param8][param5][var21Lifetime3];
                }
              }
            }
            var20Lifetime4 = LookupRecordUpdate.field_m[param2][param8][param1].length;
            for (var21Lifetime4 = 0; var21Lifetime4 < var20Lifetime4; var21Lifetime4++) {
              var16Lifetime4 = (short)LookupRecordUpdate.field_m[param2][param8][0][var21Lifetime4];
              for (var22Lifetime3 = 0; var33.length > var22Lifetime3; var22Lifetime3++) {
                if (~var33[var22Lifetime3] == ~var16Lifetime4) {
                  var19[var22Lifetime3] = (short)LookupRecordUpdate.field_m[param2][param8][param1][var21Lifetime4];
                }
              }
            }
            if (param2 == 2) {
              var16Lifetime5 = (short)LocalizedTextLoader.field_e[param8][0];
              for (var21Lifetime5 = 0; var21Lifetime5 < var33.length; var21Lifetime5++) {
                if (~var33[var21Lifetime5] == ~var16Lifetime5) {
                  var19[var21Lifetime5] = (short)LocalizedTextLoader.field_e[param8][param5];
                }
              }
            }
          }
          if (param4 != null) {
            var20Lifetime1 = 0;
            for (var21Lifetime1 = 0; param4.length > var21Lifetime1; var21Lifetime1++) {
              var22Lifetime1 = 20;
              for (var23 = 0; var23 < param4[0].length; var23++) {
                var24 = var23;
                stackIn_57_0 = (!param4[-var21Lifetime1 + 12][var24]) ? var13Lifetime1 : var14;
                var17 = stackIn_57_0;
                var16Lifetime1 = HuffmanCodec.packHslColor(var22Lifetime1, var20Lifetime1, 114, 7);
                for (var25 = 0; var25 < var33.length; var25++) {
                  if (~var16Lifetime1 == ~var33[var25]) {
                    var19[var25] = (short)var17;
                  }
                }
                var22Lifetime1 += 5;
              }
              var20Lifetime1 += 3;
            }
          }
          if (param6 != null) {
            var20Lifetime2 = 0;
            for (var21Lifetime2 = 0; param6.length > var21Lifetime2; var21Lifetime2++) {
              var22Lifetime2 = 20;
              for (var23Lifetime1 = 0; var23Lifetime1 < param6[0].length; var23Lifetime1++) {
                var24Lifetime1 = 9 - var23Lifetime1;
                stackIn_72_0 = (!param6[-var21Lifetime2 + 12][var24Lifetime1]) ? var13Lifetime1 : var14;
                var17Lifetime1 = stackIn_72_0;
                var16Lifetime2 = HuffmanCodec.packHslColor(var22Lifetime2, var20Lifetime2, 110, 6);
                var28 = 0;
                var25Lifetime1 = var28;
                while (var33.length > var28) {
                  if (var16Lifetime2 == var33[var28]) {
                    var19[var28] = (short)var17Lifetime1;
                  }
                  var28++;
                }
                var22Lifetime2 += 5;
              }
              var20Lifetime2 += 3;
            }
          }
          stackIn_80_0 = var15;
          return stackIn_80_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_83_0 = var11;
          stackIn_83_1 = new StringBuilder().append("hs.LB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    void update(int param0, boolean param1) {
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        if (null == this.field_c) {
          return;
        }
        if (param1) {
          this.field_i.updatePointerSelection(-21174, this.hitTestButton(ArrayWidgetContainer.field_x, TutorialCaptionSupport.field_j, -74), this.hitTestButton(TrinketIcon.field_yb, TabStrip.field_Eb, -106));
          if (this.field_i.selectedIndex >= 0 &&
            this.field_i.isActivated(-1)) {
            this.onButtonClick(111, this.field_c[this.field_i.selectedIndex].kind);
          }
        }
        for (var3 = 0; this.field_c.length > var3; var3++) {
          if (param1) {
            stackIn_16_0 = (var3 == this.field_i.selectedIndex) ? 1 : 0;
          } else {
            stackIn_16_0 = 0;
          }
          var4 = stackIn_16_0;
          if (param1) {
            if (var4 != 0) {
              stackIn_24_0 = (this.field_i.isActivated(-1)) ? 1 : 0;
            } else {
              stackIn_24_0 = 0;
            }
          } else {
            stackIn_24_0 = 0;
          }
          var5 = stackIn_24_0;
          if (var4 != 0) {
            stackIn_30_0 = (this.field_i.isPointerHeld(0)) ? 1 : 0;
          } else {
            stackIn_30_0 = 0;
          }
          var6 = stackIn_30_0;
          var7 = ArrayWidgetContainer.field_x - this.buttonX(124, var3);
          this.field_c[var3].updateButtonInput(var4 != 0, var5 != 0, var6 != 0, 16, var7);
        }
        if (param0 >= -92) {
          field_b = (String) null;
        }
        return;
    }

    final void initializeButtonSelection(int param0) {
        if (param0 != -26254) {
          field_d = (IconLabel) null;
        }
        this.field_i = new MenuSelection(this.field_c.length);
        this.field_i.resetPointerSelection(true, this.hitTestButton(ArrayWidgetContainer.field_x, TutorialCaptionSupport.field_j, -93), (byte) -127);
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 45 % ((22 - param0) / 38);
    }

    abstract void drawContent(int param0);

    final void drawPanelBackground(int param0) {
        SoftwareRasterizer.fillRoundedRectangleBlended(10, 50, 620, 320, 20, 65793, 128);
        if (param0 < 43) {
          this.buttonY(-47, -123);
        }
    }

    boolean handleKey(char param0, int param1, int param2) {
        int incrementValue$3 = 0;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (param1 != 1670) {
          this.field_i = (MenuSelection) null;
        }
        if (null == this.field_i) {
          return false;
        }
        this.field_i.handleArrowKeys(0, true);
        if (this.field_i.selectedIndex >= 0) {
          var4 = 0;
          while (!this.isButtonEnabled(this.field_i.selectedIndex, 50)) {
            incrementValue$3 = var4;
            var4++;
            if (this.field_i.itemCount < incrementValue$3) {
              break;
            }
            if (96 == param2) {
              this.field_i.selectedIndex = (this.field_i.itemCount + this.field_i.selectedIndex - 1) % this.field_i.itemCount;
              continue;
            }
            this.field_i.selectedIndex = (1 + this.field_i.selectedIndex) % this.field_i.itemCount;
          }
        }
        if (this.field_i.selectedIndex >= 0) {
          if (!this.field_i.isActivated(-1)) {
            return true;
          }
          this.onButtonClick(101, this.field_c[this.field_i.selectedIndex].kind);
        }
        return true;
    }

    void updateCamera(boolean param0) {
        PitchAppearanceSupport.setProjectionTarget(140.0, 60, 448.0, 672.0);
        if (!param0) {
          this.positionButtons(69);
        }
    }

    final void drawCountdown(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (param1 == -1) {
          return;
        }
        var3 = 47;
        var4 = 83;
        var5 = Integer.toString(param1 / 50);
        PacketBuffer.pushSpriteRaster(-45, PromotionDialog.field_G);
        SoftwareRasterizer.clearFramebuffer();
        var6 = SoftwareRasterizer.field_g >> 1;
        var7 = SoftwareRasterizer.field_f >> 1;
        ByteArrayPool.field_d.drawCentered(var5, var6, var7, 16777215, -1);
        AuctionSettingsDialog.field_H.draw(-16 + var6, var7 - 31);
        TeamManagementScreen.popRasterState(124);
        var8 = 256;
        if (param0 != -2351) {
          this.field_c = (MenuButton[]) null;
        }
        if (param1 / 50 <= 10) {
          var8 = var8 + (-200 + 4 * (this.field_a.phaseTime % 50) + 128);
          if (256 > var8) {
            var8 = 256;
          }
        }
        var9 = PromotionDialog.field_G.field_o;
        var10 = PromotionDialog.field_G.field_v;
        if (256 == var8) {
          PromotionDialog.field_G.draw(var3 - (var9 >> 1), -(var10 >> 1) + var4);
        } else {
          var10 = var10 * var8 >> 8;
          var9 = var8 * var9 >> 8;
          PromotionDialog.field_G.drawScaledAdditive(var3 + (-(var9 >> 1) - 1), -1 + (var4 - (var10 >> 1)), var9, var10, 256);
        }
        return;
    }

    final void drawTeamParticipantRows(int param0, int param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        String stackIn_14_2 = null;
        int stackIn_24_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var7Lifetime1;
        var13 = Kickabout.field_G;
        if (this.field_g != -2) {
          stackIn_3_0 = this.field_a.field_g[this.field_g].team;
        } else {
          stackIn_3_0 = 0;
        }
        var5 = stackIn_3_0;
        var6 = -1;
        if (param0 == var5) {
          var6 = 0;
          for (var7 = 0; this.field_g > var7; var7++) {
            if (~this.field_a.field_g[var7].team == ~param0) {
              var6++;
            }
          }
        }
        stackIn_13_0 = var6;
        stackIn_13_1 = 4;
        if (param0 != 0) {
          stackIn_14_2 = CommonGame.field_a;
        } else {
          stackIn_14_2 = LobbyPlayerRow.field_Ub;
        }
        WidgetContainer.drawParticipantPanelBackground(stackIn_13_0, stackIn_13_1, stackIn_14_2, param3, param1, 114);
        param1 += 39;
        if (param2 >= -43) {
          return;
        }
        var14 = 0;
        var7Lifetime1 = var14;
        while (var14 < this.field_a.playerCount) {
          if (param0 == this.field_a.field_g[var14].team) {
            MySquadScreen.field_U[this.field_a.field_g[var14].field_f].draw(param3, -16 + param1);
            stackIn_24_0 = (this.field_a.participantStatus[var14].isActive(3511)) ? 16777215 : 11184810;
            var8 = stackIn_24_0;
            var9 = this.field_a.field_S[var14].toLowerCase();
            ByteArrayPool.field_d.drawCentered(var9, param3 + 80, param1, var8, -1);
            if (!this.field_a.participantStatus[var14].isActive(3511)) {
              var10 = ByteArrayPool.field_d.stringWidth(var9);
              var11 = param3 + (-var10 + 160 >> 1);
              var12 = 10;
              SoftwareRasterizer.drawLine(var11, -2 + param1 - var12, var10 + var11, param1 - 1, 13382451);
              SoftwareRasterizer.drawLine(var11, param1 - 1, var10 + var11, -var12 + (param1 - 2), 13382451);
            }
            param1 += 23;
          }
          var14++;
        }
        return;
    }

    final void drawTitle(boolean param0, String param1) {
        try {
          SoftwareRasterizer.fillRoundedRectangleBlended(22, 62, 596, 28, 10, 65793, 128);
          if (param0) {
            this.field_a = (CommonGame) null;
          }
          ByteArrayPool.field_d.drawCentered(param1.toUpperCase(), 320, 83, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "hs.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int buttonY(int param0, int param1) {
        if (param0 != 342) {
          return -91;
        }
        return 342 - param1 * 29;
    }

    MatchPhaseView(CommonGame param0, int param1, boolean param2, int[] param3) {
        int var5_int = 0;
        try {
          this.field_g = param1;
          this.field_a = param0;
          this.field_h = -2 != this.field_g ? this.field_a.field_g[this.field_g].team : 0;
          this.field_f = param2 ? true : false;
          if (param3 != null) {
            this.field_c = new MenuButton[param3.length];
            for (var5_int = 0; param3.length > var5_int; var5_int++) {
              this.field_c[var5_int] = new MenuButton(-3, 7126504, param3[var5_int]);
            }
            this.initializeButtonSelection(-26254);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "hs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void onButtonClick(int param0, int param1);

    final void positionButtons(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Kickabout.field_G;
        if (null == this.field_c) {
          return;
        }
        var2 = 90 / ((param0 - 78) / 38);
        for (var3 = 0; var3 < this.field_c.length; var3++) {
          if (this.isButtonEnabled(var3, 50)) {
            this.field_c[var3].drawButton(this.buttonY(342, var3), this.buttonX(124, var3), 13800);
          }
        }
    }

    final void drawTeamParticipantPanels(int param0, int param1) {
        int stackIn_8_0 = 0;
        int var3;
        int[] var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        var9 = Kickabout.field_G;
        if (param1 != 17709) {
          this.drawTeamParticipantPanels(-84, 57);
        }
        var3 = 210;
        var4 = new int[]{-160 - var3 + 640 >> 1, -160 + (640 + var3) >> 1};
        var5 = new int[]{23 + param0, param0 + 23};
        if (this.field_g != -2) {
          stackIn_8_0 = (1 == this.field_a.field_g[this.field_g].team) ? 1 : 0;
        } else {
          stackIn_8_0 = 0;
        }
        var6 = stackIn_8_0;
        if (var6 != 0) {
          var7 = var4[0];
          var4[0] = var4[1];
          var4[1] = var7;
        }
        this.drawTeamParticipantRows(0, param0, (byte) -62, var4[0]);
        this.drawTeamParticipantRows(1, param0, (byte) -72, var4[1]);
        var10 = 0;
        var7Lifetime1 = var10;
        while (this.field_a.playerCount > var10) {
          var8 = this.field_a.field_g[var10].team;
          AuctionListing.pushRasterClip(640, -22914, 2 + (var4[var8] + 160), 480, 0);
          SoftwareRasterizer.fillRoundedRectangleBlended(var4[var8], var5[var8], 186, 21, 7, 65793, 128);
          TeamManagementScreen.popRasterState(123);
          if (this.field_a.participantStatus[var10].loadedPitch) {
            PitchDecorationSupport.field_l.draw(2 + (160 + var4[var8]), -4 + var5[var8]);
          }
          var5[var8] = var5[var8] + 23;
          var10++;
        }
    }

    static {
        field_b = "£";
    }
}
