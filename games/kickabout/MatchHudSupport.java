/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchHudSupport {
    static ScrollPane field_f;
    static String field_e;
    static int field_g;
    static String field_b;
    static String field_i;
    static int field_c;
    static String field_k;
    static String field_h;
    static Sprite[] field_a;
    static int field_d;
    static String field_j;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_k = null;
        field_i = null;
        field_b = null;
        if (param0 != -13) {
          return;
        }
        field_j = null;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    final static void drawNumericRewardPanel(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var3Lifetime2Lifetime1;
        int var4Lifetime1Lifetime1;
        var5 = Kickabout.field_G;
        try {
          param0 = param0 >> 1;
          LoginDialog.field_cb.c(param0 + TextLayoutLine.field_e, ArchiveNetworkClient.field_i);
          AccountChoicePanel.field_C.c(param0 + TextLayoutLine.field_e, 18 + ArchiveNetworkClient.field_i);
          var2_int = 2;
          if (CachedArchiveSource.field_s > 1) {
            for (var3 = 1; var3 < CachedArchiveSource.field_s; var3++) {
              AccountChoicePanel.field_C.c(TextLayoutLine.field_e + param0, 18 + ArchiveNetworkClient.field_i + var2_int);
              var2_int += 2;
            }
          }
          MarkerSliderPainter.field_i.c(TextLayoutLine.field_e + param0, ArchiveNetworkClient.field_i + (18 + var2_int));
          ByteArrayPool.field_d.drawText(SharedChatLayoutSupport.field_c, 13 + TextLayoutLine.field_e + param0, var2_int / 2 + (20 + ArchiveNetworkClient.field_i), 16777215, -1);
          var3Lifetime1 = 0;
          if (param1 != -12452) {
            field_c = -16;
          }
          var4 = 0;
          if (0 != PortraitCacheOrder.field_d) {
            var3Lifetime2 = 0;
            AuctionListing.pushRasterClip(param0 + (TextLayoutLine.field_e + LoginDialog.field_cb.field_q), -22914, TextLayoutLine.field_e + param0, -14 + (ArchiveNetworkClient.field_i - (-LoginDialog.field_cb.field_w - 2 * CachedArchiveSource.field_s)), ArchiveNetworkClient.field_i + 8);
            var4Lifetime1 = RankingRowNode.field_Db;
            while (var4Lifetime1 > 0) {
              field_a[var4Lifetime1 % 10].c(TextLayoutLine.field_e + 140 + (-(var3Lifetime2 * field_a[0].field_q) + param0), 9 + (ArchiveNetworkClient.field_i - 2 * (-CachedArchiveSource.field_s + 18)));
              var3Lifetime2++;
              var4Lifetime1 = var4Lifetime1 / 10;
            }
            var4Lifetime1Lifetime1 = Math.abs(PortraitCacheOrder.field_d);
            var3Lifetime2Lifetime1 = 0;
            while (var4Lifetime1Lifetime1 > 0) {
              if (PortraitCacheOrder.field_d < 0) {
                ClubStateFactory.field_d[var4Lifetime1Lifetime1 % 10].c(param0 - ClubStateFactory.field_d[0].field_q * var3Lifetime2Lifetime1 + (140 + TextLayoutLine.field_e), -36 - (-(2 * CachedArchiveSource.field_s) - (24 + ArchiveNetworkClient.field_i)));
              } else {
                ValidationIndicator.field_G[var4Lifetime1Lifetime1 % 10].c(param0 + TextLayoutLine.field_e + (140 - ValidationIndicator.field_G[0].field_q * var3Lifetime2Lifetime1), 24 + ArchiveNetworkClient.field_i - (18 - CachedArchiveSource.field_s) * 2);
              }
              var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 / 10;
              var3Lifetime2Lifetime1++;
            }
            if (PortraitCacheOrder.field_d < 0) {
              ByteArrayPool.field_d.drawText(LoginMethod.field_b, TextLayoutLine.field_e + (140 - var3Lifetime2Lifetime1 * field_a[0].field_q + param0), ArchiveNetworkClient.field_i - (-35 + 2 * (-CachedArchiveSource.field_s + 18)), 16729156, -1);
            } else {
              ByteArrayPool.field_d.drawText(HuffmanCodec.field_b, -(var3Lifetime2Lifetime1 * field_a[0].field_q) + (TextLayoutLine.field_e + 140 + param0), 35 + ArchiveNetworkClient.field_i - 2 * (18 - CachedArchiveSource.field_s), 4521796, -1);
            }
            ByteArrayPool.field_d.drawText("-----------", 64 + TextLayoutLine.field_e, -(2 * (18 - CachedArchiveSource.field_s)) + 44 + ArchiveNetworkClient.field_i, 16777215, -1);
            TeamManagementScreen.e(param1 ^ -12506);
          }
          var4Lifetime2 = GoalStateAgent.field_l;
          var3Lifetime3 = 0;
          if (var4Lifetime2 == 0) {
            field_a[0].c(param0 + (140 + (TextLayoutLine.field_e - field_a[0].field_q * var3Lifetime3)), ArchiveNetworkClient.field_i + 7 + CachedArchiveSource.field_s * 2);
          }
          while (var4Lifetime2 > 0) {
            field_a[var4Lifetime2 % 10].c(TextLayoutLine.field_e + 140 - (var3Lifetime3 * field_a[0].field_q - param0), ArchiveNetworkClient.field_i + 7 + 2 * CachedArchiveSource.field_s);
            var3Lifetime3++;
            var4Lifetime2 = var4Lifetime2 / 10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "ig.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int screenToWorldY(int param0, int param1) {
        if (param1 != 4620) {
          field_h = (String) null;
        }
        return (int)(MyPitchScreen.field_G + (ReceivedAuctionItemRow.field_Gb + (double)((-240 + param0 << 8) / InstrumentNoteMask.field_i)));
    }

    final static void moveTutorialPlayerToLineup(boolean param0, byte param1, int param2, int param3) {
        if (param1 < 15) {
          return;
        }
        int var4 = LineupPositionSupport.lineupSlotX(70, param2);
        int var5 = AchievementsScreen.a((byte) -27, param3);
        RenderedFootballer var6 = (RenderedFootballer) (ThumbnailStateFactory.field_d.field_P[param3][param2]);
        int var7 = !param0 ? 80 + TextLayoutLine.screenToWorldY(-6779, 480) : TextLayoutLine.screenToWorldY(-6779, 0) - 50;
        if (var6.positionY != var5 &&
          QuickChatCategory.advanceToPoint(4, (byte) 106, var6.positionX, var6, var7 << 16)) {
          var6.setPosition(var4, false, 0, var5);
        }
    }

    final static void beginPrivateMessage(long param0, String param1, byte param2) {
        CharSequence var6 = null;
        try {
          NodeHashTableIterator.field_b = 2;
          TrinketTile.field_Kb = param1;
          if (param2 <= 46) {
            String var5 = (String) null;
            MatchHudSupport.beginPrivateMessage(127L, (String) null, (byte) 87);
          }
          var6 = (CharSequence) ((Object) param1);
          PlayerStatSortCriterion.field_o = MatchAgent.normalizeAccountName(0, var6);
          IntDoubleCommand.field_A = param0;
          TextFieldNode.field_Wb = true;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ig.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void drawControlLegend(boolean param0, int param1, int param2) {
        int var14 = 0;
        String stackIn_17_0 = null;
        String[] stackIn_20_0 = null;
        String[] stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        BinaryBitmapFont var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var5 = null;
        String var5_ref = null;
        int var6_int = 0;
        String[] var6 = null;
        String[] var7 = null;
        int var8 = 0;
        String[] var9_ref_String__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        String[] var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String[] var21 = null;
        String[] var5Lifetime1;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var3 = IsSixCommand.field_C;
          var4 = 0;
          var16 = SocialRowOrderSupport.field_a;
          var5 = var16;
          for (var6_int = 0; var16.length > var6_int; var6_int++) {
            var17 = var16[var6_int];
            var8 = ((BitmapFont) ((Object) var3)).stringWidth(var17);
            if (var4 < var8) {
              var4 = var8;
            }
          }
          var5Lifetime1 = DialogOverlay.field_g;
          for (var6_intLifetime1 = 0; var5Lifetime1.length > var6_intLifetime1; var6_intLifetime1++) {
            var18 = var5Lifetime1[var6_intLifetime1];
            var8Lifetime1 = ((BitmapFont) ((Object) var3)).stringWidth(var18);
            if (var4 < var8Lifetime1) {
              var4 = var8Lifetime1;
            }
          }
          if (param0) {
            stackIn_17_0 = PacketBuffer.field_k;
          } else {
            stackIn_17_0 = IndexedSpriteState.field_f;
          }
          var19 = stackIn_17_0;
          var5_ref = var19;
          if (!param0) {
            stackIn_20_0 = Trinket.field_j;
          } else {
            stackIn_20_0 = CaptionedContainer.field_G;
          }
          var6 = stackIn_20_0;
          var20 = "[" + var19 + "]";
          if (param0) {
            stackIn_23_0 = SocialRowOrderSupport.field_a;
          } else {
            stackIn_23_0 = DialogOverlay.field_g;
          }
          var21 = stackIn_23_0;
          var7 = var21;
          var8Lifetime2 = 0;
          var9_ref_String__ = var6;
          for (var10 = 0; var10 < var9_ref_String__.length; var10++) {
            var11_ref_String = var9_ref_String__[var10];
            var12 = ((BitmapFont) ((Object) var3)).stringWidth(var11_ref_String);
            if (var12 > var8Lifetime2) {
              var8Lifetime2 = var12;
            }
          }
          var9 = 20 + (var4 + var8Lifetime2 + 65);
          var10Lifetime1 = TextPromptDialog.field_yb * (var6.length + 1) + 20;
          var11 = -6 + (-var10Lifetime1 + (473 - VertexNormal.field_c * AsciiCharacterSupport.field_c.playerCount) - 22);
          SoftwareRasterizer.fillRoundedRectangleBlended(-var9 + 644, var11, var9, var10Lifetime1, 2, 0, param2);
          var12Lifetime1 = 619 - (var4 + 20);
          var13 = 6 + var11 + TextPromptDialog.field_yb;
          ((BitmapFont) ((Object) var3)).drawRightAligned(var20, 599, var13, param1, -1);
          var13 = var13 + (TextPromptDialog.field_yb + 6);
          for (var14 = 0; var6.length > var14; var14++) {
            ((BitmapFont) ((Object) var3)).drawCenteredCharacter(':', var12Lifetime1, var13, 16777215);
            ((BitmapFont) ((Object) var3)).drawRightAligned(var6[var14], -20 + var12Lifetime1, var13, 16777215, -1);
            ((BitmapFont) ((Object) var3)).drawText(var21[var14], 20 + var12Lifetime1, var13, 16777215, -1);
            var13 = var13 + (2 + TextPromptDialog.field_yb);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3_ref), "ig.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int ceilPowerOfTwo(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        if (param0 != 6) {
          return -2;
        }
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    static {
        field_b = "Show all lobby chat";
        field_i = "Report abuse";
        field_e = "<%0> (left)";
        field_h = "Elapsed time";
        field_j = "Waiting for players to choose the lineup...";
        field_k = "create new game";
    }
}
