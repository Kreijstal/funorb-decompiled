/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionsHelpScreen extends PagedHelpScreen {
    static int field_E;
    static int field_H;
    static PacketBuffer field_I;
    static String[] field_F;
    static UiLayoutNode field_G;

    final static void d(boolean param0) {
        FootballerAgent var1 = null;
        FootballerAgent var2 = null;
        if (!param0) {
          AuctionsHelpScreen.g(57);
        }
        if (0 != ThumbnailStateFactory.field_d.participantStatus[1].controlledSlot) {
          if (ThumbnailStateFactory.field_d.field_V.possessorTeam == 1) {
            var1 = ThumbnailStateFactory.field_d.getControlledFootballer((byte) 104, 0);
            var2 = ThumbnailStateFactory.field_d.getControlledFootballer((byte) -71, 1);
            SelectableAchievementIcon.b(var1.pixelX(-121) - var2.pixelX(-99), -2, var1.pixelY(true) - var2.pixelY(true), 10);
          }
          ThumbnailStateFactory.field_d.participantStatus[1].controlledSlot = 0;
        }
    }

    final static MeshData createKitMesh(int param0, int param1, boolean param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        boolean[][] var4;
        boolean[][] var5;
        int var6;
        int var7;
        MeshData var8;
        int var9;
        int var10;
        short[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        boolean[][] var20;
        int var21;
        boolean[][] var22;
        boolean[][] var24;
        boolean[][] var25;
        boolean[][] var27;
        short[] var29;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        boolean[][] var27Lifetime1;
        var19 = Kickabout.field_G;
        var25 = AnimationSkeleton.field_g[param0].patternMasks[0];
        var22 = var25;
        var20 = var22;
        var4 = var20;
        var27 = AnimationSkeleton.field_g[param0].patternMasks[1];
        var24 = var27;
        var5 = var24;
        var6 = (short)param3;
        var7 = (short)param1;
        var8 = new MeshData(FriendRemovalSupport.field_f, param2, false, true, true);
        var29 = FriendRemovalSupport.field_f.field_p;
        var12 = var8.field_p;
        var13 = 0;
        for (var14 = 0; var14 < var25.length; var14++) {
          var15 = 20;
          for (var16 = 0; var16 < var25[0].length; var16++) {
            var17 = var16;
            stackIn_7_0 = (!var20[-var14 + 12][var17]) ? var6 : var7;
            var10 = stackIn_7_0;
            var9 = HuffmanCodec.packHslColor(var15, var13, 120, 7);
            for (var18 = 0; var18 < var29.length; var18++) {
              if (var29[var18] == var9) {
                var12[var18] = (short)var10;
              }
            }
            var15 += 5;
          }
          var13 += 3;
        }
        var27Lifetime1 = var24;
        var13Lifetime1 = 0;
        for (var14Lifetime1 = 0; var27Lifetime1.length > var14Lifetime1; var14Lifetime1++) {
          var15Lifetime1 = 20;
          for (var16Lifetime1 = 0; var16Lifetime1 < var27Lifetime1[0].length; var16Lifetime1++) {
            var17Lifetime1 = 9 - var16Lifetime1;
            stackIn_24_0 = (var5[-var14Lifetime1 + 12][var17Lifetime1]) ? var7 : var6;
            var10Lifetime1 = stackIn_24_0;
            var9Lifetime1 = HuffmanCodec.packHslColor(var15Lifetime1, var13Lifetime1, 119, 6);
            var15Lifetime1 += 5;
            var21 = 0;
            var18Lifetime1 = var21;
            while (var29.length > var21) {
              if (var29[var21] == var9Lifetime1) {
                var12[var21] = (short)var10Lifetime1;
              }
              var21++;
            }
          }
          var13Lifetime1 += 3;
        }
        return var8;
    }

    AuctionsHelpScreen() {
    }

    final void drawScreen(int param0, boolean param1) {
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        ArgbSprite stackIn_23_0 = null;
        int var3;
        ArgbSprite var4;
        int var4_int;
        int var5;
        int var6;
        String var8;
        int var9;
        var9 = Kickabout.field_G;
        super.drawScreen(param0, param1);
        if (this.pageIndex == 0) {
          SoftwareRasterizer.fillRoundedRectangleBlended(this.slideOffsetX + 40, 198, 560, 200, 10, 65793, 128);
          MusicVolumeSupport.drawMessagePanel(SpriteResourceSupport.field_b, this.slideOffsetX + 40, 560, false, 0, 126);
          ByteArrayPool.field_d.drawText(ClientPacketFlushSupport.field_h.toLowerCase(), 56 + this.slideOffsetX, 222, 16777215, -1);
          for (var3 = 0; var3 < 3; var3++) {
            IsSixCommand.field_C.drawRightAligned(CipherPacketBuffer.field_t[var3], 150 + this.slideOffsetX, 256 + 50 * var3, 16777215, -1);
            IsSixCommand.field_C.drawParagraph(AuctionHelpResources.field_a[var3], this.slideOffsetX + 170, 243 + var3 * 50, 420, 300, 16777215, -1, 0, 0, 16);
          }
        } else {
          if (this.pageIndex == 1) {
            for (var3 = 0; var3 < 2; var3++) {
              stackIn_9_0 = (var3 == 1) ? 1 : 0;
              var4_int = stackIn_9_0;
              stackIn_12_0 = (var4_int != 0) ? 345 : 50;
              var5 = stackIn_12_0;
              var5 = var5 + this.slideOffsetX;
              var6 = 146;
              SoftwareRasterizer.fillRoundedRectangleBlended(-10 + var5, 126, 265, 270, 10, 65793, 140);
              if (var3 == 1) {
                var6 += 50;
              }
              for (var7 = 0; var7 < BallAgent.field_w[var3].length; var7++) {
                var8 = BallAgent.field_w[var3][var7];
                var6 = var6 + (20 + IsSixCommand.field_C.drawParagraph(var8, var5, var6, 245, 999, 16777215, -1, 0, 0, 16) * 16);
              }
            }
            for (var3 = 0; var3 < 4; var3++) {
              if (0 == (var3 & 1)) {
                stackIn_23_0 = WeightedLruCache.field_h;
              } else {
                stackIn_23_0 = CipherPacketBuffer.field_q;
              }
              var4 = stackIn_23_0;
              ((Sprite) ((Object) var4)).draw(var3 * 45 + 380 + this.slideOffsetX, 145);
            }
          }
        }
    }

    public static void releaseStatics(boolean param0) {
        field_F = null;
        if (param0) {
          field_H = 29;
        }
        field_I = null;
        field_G = null;
    }

    final static int g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          var1_int = 0;
          while (TexturedPanelPainter.pollKeyEvent(-59)) {
            CheckboxPainter.field_c.handleVerticalArrowKeys(105);
            if (!CheckboxPainter.field_c.isActivated(-1)) {
              continue;
            }
            var1_int = 1;
          }
          if (param0 >= -35) {
            AuctionsHelpScreen.releaseStatics(true);
          }
          CheckboxPainter.field_c.updatePointerSelection(-21174, PitchCoordinateSupport.hitTestMenuRows(ArchiveManager.field_m, BytePlusOneCommand.field_A, 16756), PitchCoordinateSupport.hitTestMenuRows(ReceivedAuctionItem.field_y, HighScoreSubmission.field_q, 16756));
          if (CheckboxPainter.field_c.isActivated(-1)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            CheckboxPainter.field_c.selectedIndex >= 0) {
            var2 = InstrumentEnvelope.field_d[CheckboxPainter.field_c.selectedIndex];
            if (2 == var2) {
              ImageProducerRasterBuffer.c((byte) -77);
            }
          }
          stackIn_16_0 = var2;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "df.K(" + param0 + ')');
        }
    }

    static {
        field_H = 0;
    }
}
