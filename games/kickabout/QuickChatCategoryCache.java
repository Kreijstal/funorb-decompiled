/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryCache {
    private WeightedLruCache cache;
    static java.awt.Image field_i;
    static String field_d;
    private ResourceArchive globalArchive;
    static UiLayoutNode field_b;
    private ResourceArchive localArchive;
    static String field_c;
    static boolean field_e;
    static int[] field_a;

    final static void returnToLobby(int param0) {
        int var2;
        var2 = Kickabout.field_G;
        if (SortCriterion.field_l != null) {
          if (SortCriterion.field_l.c(0)) {
            ContextMenu.sendGameWithdrawalRequest(PlayerContextMenu.field_i.getGameId((byte) -77), (byte) -88, 11);
          } else {
            GameLoopApplet.b(15848, 11, 0);
          }
        } else {
          if (MachineTokenStorageSupport.field_e.isSpectator(param0 - 2) &&
            !MachineTokenStorageSupport.field_e.usesTournamentSpectatorControls(-21660)) {
            GameLoopApplet.b(param0 + 15848, 11, 0);
          } else {
            ContextMenu.sendGameWithdrawalRequest(PlayerContextMenu.field_i.getGameId((byte) 74), (byte) -114, 11);
            QuickChatPhraseCache.field_d = true;
          }
        }
        if (param0 != 0) {
          QuickChatCategoryCache.buildStadiumSeatColumn(-48, true, 12);
        }
    }

    final static Sprite buildStadiumSeatColumn(int param0, boolean param1, int param2) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var3 = AuctionPriceLimits.field_b[param1 ? 0 : 1];
        int[] var4 = HighScoreSubmission.field_o[param1 ? 0 : 1];
        IndexedSprite[] var5 = AudioOutputSupport.field_e[param1 ? 0 : 2];
        if (param0 > -125) {
          return (Sprite) null;
        }
        Sprite var6 = new Sprite(var3, param2 * var4[1] + var4[2] + var4[0]);
        PacketBuffer.pushSpriteRaster(83, var6);
        int var7 = 0;
        var5[0].a(0, var7);
        var7 = var7 + var4[0];
        for (var8 = 0; var8 < param2; var8++) {
          var5[1].a(0, var7);
          var7 = var7 + var4[1];
        }
        var5[2].a(0, var7);
        TeamManagementScreen.e(118);
        LoginForm.tintSpriteForSurface(var6, 20684);
        return var6;
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_i = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static boolean advanceScriptedTutorialPlayers(int param0) {
        int var3 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        boolean stackIn_44_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        RenderedFootballer stackIn_60_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_68_0 = false;
        int stackIn_70_0 = 0;
        boolean stackIn_72_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        FootballerAgent var2_ref_nl = null;
        RenderedFootballer var4 = null;
        int var5 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var2Lifetime3Lifetime1;
        int var2Lifetime3Lifetime2;
        int var2Lifetime5Lifetime1;
        var5 = Kickabout.field_G;
        try {
          var1_int = 73 % ((param0 + 65) / 33);
          if (HuffmanCodec.field_e == 1) {
            stackIn_72_0 = QuickChatCategory.advanceToPoint(4, (byte) 97, 29360128, EmailAvailabilityValidator.field_k, 74973184);
            return stackIn_72_0;
          }
          if (HuffmanCodec.field_e == 2) {
            stackIn_4_0 = QuickChatCategory.advanceToPoint(4, (byte) 82, 29360128, EmailAvailabilityValidator.field_k, 44040192);
            return stackIn_4_0;
          }
          if (HuffmanCodec.field_e == 3) {
            stackIn_7_0 = QuickChatCategory.advanceToPoint(8, (byte) 116, 29360128, EmailAvailabilityValidator.field_k, 18481152);
            return stackIn_7_0;
          }
          if (HuffmanCodec.field_e == 4) {
            var2 = 1;
            var2 = var2 != 0 & QuickChatCategory.advanceToPoint(4, (byte) 121, 53084160, EmailAvailabilityValidator.field_k, 72744960) ? 1 : 0;
            var2 = var2 != 0 & QuickChatCategory.advanceToPoint(1, (byte) 93, 49152000, AccountInputValidationResult.field_f, 55050240) ? 1 : 0;
            stackIn_70_0 = var2;
            return stackIn_70_0 != 0;
          }
          if (HuffmanCodec.field_e == 5) {
            var2Lifetime1 = 1;
            var2Lifetime1 = var2Lifetime1 != 0 & QuickChatCategory.advanceToPoint(1, (byte) 122, 53084160, EmailAvailabilityValidator.field_k, 55050240) ? 1 : 0;
            var2Lifetime1 = var2Lifetime1 != 0 & QuickChatCategory.advanceToPoint(4, (byte) 89, 49152000, AccountInputValidationResult.field_f, 72744960) ? 1 : 0;
            stackIn_11_0 = var2Lifetime1;
            return stackIn_11_0 != 0;
          }
          if (6 == HuffmanCodec.field_e) {
            var2Lifetime2 = 1;
            var2Lifetime2 = var2Lifetime2 != 0 & QuickChatCategory.advanceToPoint(2, (byte) 116, 52428800, EmailAvailabilityValidator.field_k, 43909120) ? 1 : 0;
            var2Lifetime2 = var2Lifetime2 != 0 & QuickChatCategory.advanceToPoint(8, (byte) 84, 13107200, AccountInputValidationResult.field_f, 43909120) ? 1 : 0;
            stackIn_14_0 = var2Lifetime2;
            return stackIn_14_0 != 0;
          }
          if (HuffmanCodec.field_e == 7) {
            var2_ref_nl = ThumbnailStateFactory.field_d.field_P[1][4];
            stackIn_68_0 = (var2_ref_nl.pixelX(-107) == 180) && (var2_ref_nl.pixelY(true) == 550);
            return stackIn_68_0;
          }
          if (HuffmanCodec.field_e == 8) {
            var2Lifetime3 = 1;
            stackIn_50_0 = var2Lifetime3;
            if (AccountInputValidationResult.field_f.action == 0 &&
              QuickChatCategory.advanceToPoint(8, (byte) 114, 3932160, AccountInputValidationResult.field_f, 16384000)) {
              stackIn_51_1 = 1;
            } else {
              stackIn_51_1 = 0;
            }
            var2Lifetime3Lifetime1 = stackIn_50_0 & stackIn_51_1;
            stackIn_53_0 = var2Lifetime3Lifetime1;
            if (ThumbnailStateFactory.field_d.field_P[1][4].positionY != AchievementsScreen.a((byte) -27, 1)) {
              stackIn_54_1 = 0;
            } else {
              stackIn_54_1 = 1;
            }
            var2Lifetime3Lifetime2 = stackIn_53_0 & stackIn_54_1;
            if (var2Lifetime3Lifetime2 != 0) {
              for (var3 = 0; var3 < 4; var3++) {
                var4 = (RenderedFootballer) (ThumbnailStateFactory.field_d.field_P[1][1 + var3]);
                var4.setPosition(FadingSoundSupport.field_c[var3] << 16, false, 0, QuickChatMenuFactory.field_a[var3] << 16);
                var4.directionMask = 0;
                stackIn_60_0 = var4;
                if (var3 == 1) {
                  stackIn_61_1 = 8;
                } else {
                  stackIn_61_1 = 2;
                }
                ((RenderedFootballer) (Object) stackIn_60_0).setDirectionFromMask(stackIn_61_1, 26214);
              }
            }
            stackIn_63_0 = var2Lifetime3Lifetime2;
            return stackIn_63_0 != 0;
          }
          if (HuffmanCodec.field_e == 9) {
            var2Lifetime4 = 1;
            var2Lifetime4 = var2Lifetime4 != 0 & QuickChatCategory.advanceToPoint(2, (byte) 119, 49152000, AccountInputValidationResult.field_f, 55050240) ? 1 : 0;
            var2Lifetime4 = var2Lifetime4 != 0 & QuickChatCategory.advanceToPoint(8, (byte) 82, 20971520, EmailAvailabilityValidator.field_k, 55050240) ? 1 : 0;
            var2Lifetime4 = var2Lifetime4 != 0 & QuickChatCategory.advanceToPoint(1, (byte) 119, 31457280, ThumbnailStateFactory.field_d.field_P[1][3], 54067200) ? 1 : 0;
            var2Lifetime4 = var2Lifetime4 != 0 & QuickChatCategory.advanceToPoint(1, (byte) 123, 31457280, ThumbnailStateFactory.field_d.field_P[1][4], 56033280) ? 1 : 0;
            stackIn_46_0 = var2Lifetime4;
            return stackIn_46_0 != 0;
          }
          if (HuffmanCodec.field_e != 10) {
            if (11 == HuffmanCodec.field_e) {
              return true;
            }
            if (HuffmanCodec.field_e == 12) {
              stackIn_44_0 = QuickChatCategory.advanceToPoint(4, (byte) 107, 29360128, LoginResponseUiSupport.field_c, 19660800);
              return stackIn_44_0;
            }
            if (HuffmanCodec.field_e != 13) {
              return true;
            }
            var2Lifetime5 = 1;
            var2Lifetime5 = var2Lifetime5 != 0 & QuickChatCategory.advanceToPoint(4, (byte) 96, 29360128, LoginResponseUiSupport.field_c, 19660800) ? 1 : 0;
            var2Lifetime5 = var2Lifetime5 != 0 & QuickChatCategory.advanceToPoint(1, (byte) 84, 29360128, ThumbnailStateFactory.field_d.field_P[1][0], 1310720) ? 1 : 0;
            stackIn_40_0 = var2Lifetime5;
            if (-1 != ThumbnailStateFactory.field_d.field_V.possessorTeam) {
              stackIn_41_1 = 0;
            } else {
              stackIn_41_1 = 1;
            }
            var2Lifetime5Lifetime1 = stackIn_40_0 & stackIn_41_1;
            stackIn_42_0 = var2Lifetime5Lifetime1;
            return stackIn_42_0 != 0;
          }
          var2Lifetime6 = 1;
          var2Lifetime6 = var2Lifetime6 != 0 & QuickChatCategory.advanceToPoint(12, (byte) 113, 3276800, EmailAvailabilityValidator.field_k, 58982400) ? 1 : 0;
          if (var2Lifetime6 != 0 &&
            EmailAvailabilityValidator.field_k.action == 0 &&
            0 == ThumbnailStateFactory.field_d.field_V.possessorTeam) {
            SelectableTrinketIcon.b(200, -2, -100, 30);
          }
          var2Lifetime6 = var2Lifetime6 != 0 & QuickChatCategory.advanceToPoint(8, (byte) 86, 29360128, LoginResponseUiSupport.field_c, 36438016) ? 1 : 0;
          stackIn_26_0 = var2Lifetime6;
          if (-1 != ThumbnailStateFactory.field_d.field_V.possessorTeam) {
            stackIn_27_1 = 0;
          } else {
            stackIn_27_1 = 1;
          }
          var2Lifetime7 = stackIn_26_0 & stackIn_27_1;
          stackIn_29_0 = var2Lifetime7;
          if (ThumbnailStateFactory.field_d.field_V.horizontalSpeedSquared(-105) >= 131072) {
            stackIn_30_1 = 0;
          } else {
            stackIn_30_1 = 1;
          }
          var2Lifetime8 = stackIn_29_0 & stackIn_30_1;
          stackIn_31_0 = var2Lifetime8;
          return stackIn_31_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "bt.C(" + param0 + ')');
        }
    }

    final QuickChatCategory getCategory(int param0, int param1) {
        byte[] var4 = null;
        QuickChatCategory var3 = (QuickChatCategory) (this.cache.get((long)param1, (byte) 43));
        if (param0 != 200) {
          return (QuickChatCategory) null;
        }
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.globalArchive.takeFile(0, -32669, param1 & 32767);
        } else {
          var4 = this.localArchive.takeFile(0, -32669, param1);
        }
        var3 = new QuickChatCategory();
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 0);
        }
        if (32768 <= param1) {
          var3.markGlobalIds(-104);
        }
        this.cache.put((long)param1, var3, (byte) -110);
        return var3;
    }

    QuickChatCategoryCache(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.cache = new WeightedLruCache(64);
        try {
          this.localArchive = param1;
          this.globalArchive = param2;
          if (null != this.localArchive) {
            this.localArchive.getFileIdCapacity(true, 0);
          }
          if (this.globalArchive != null) {
            this.globalArchive.getFileIdCapacity(true, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bt.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_c = "League points: ";
        field_d = "Retry";
        field_e = false;
        field_a = new int[128];
    }
}
