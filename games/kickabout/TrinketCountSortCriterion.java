/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TrinketCountSortCriterion extends SortCriterion {
    static NineSlicePanelPainter field_p;
    static int[] field_q;
    static TriangleMesh[] field_n;
    static String field_o;

    final int compare(int param0, Object param1, Object param2) {
        int var8 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        PlayerStats var5 = null;
        int var6 = 0;
        int var7 = 0;
        Trinket var8_ref_fn = null;
        Trinket var9 = null;
        int var10 = 0;
        PlayerStats var11 = null;
        PlayerStats var12 = null;
        int var7Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var11 = ((ShopPlayerSlot) (param1)).field_Sb;
          var12 = var11;
          var5 = ((ShopPlayerSlot) (param2)).field_Sb;
          var6 = var12.trinketIds.length;
          for (var7 = 0; var7 < var12.trinketIds.length; var7++) {
            var8_ref_fn = GeneratedPanelPainter.field_g[var11.trinketIds[var7]];
            var6 = var6 + (var8_ref_fn.field_h + var8_ref_fn.field_k);
          }
          var7Lifetime1 = var5.trinketIds.length;
          if (param0 != 2) {
            field_n = (TriangleMesh[]) null;
          }
          for (var8 = 0; var5.trinketIds.length > var8; var8++) {
            var9 = GeneratedPanelPainter.field_g[var5.trinketIds[var8]];
            var7Lifetime1 = var7Lifetime1 + (var9.field_k + var9.field_h);
          }
          stackIn_10_0 = this.field_i << 31 ^ var6 - var7Lifetime1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static Sprite[] createPanelSprites(int param0, int param1, int param2, byte param3) {
        int var4 = -62 / ((param3 + 13) / 55);
        return QuickChatMenuFactory.createSolidPanelSprites(1, param2, param0, false, param1);
    }

    final int directionCount(int param0) {
        if (param0 >= -69) {
          field_o = (String) null;
        }
        return 2;
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String stackIn_33_2 = null;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        String stackIn_40_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Kickabout.field_G;
        try {
          AccountChoicePanel.field_D = true;
          TextPromptState.field_a = param2;
          if (TextPromptState.field_a == 0) {
            var3_int = SpriteState.a(MeshObject.field_f, SocialListProtocolSupport.field_a, -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
            var4 = 3 + var3_int;
            AchievementQuery.field_g = new int[var4];
            WeightedLruCache.field_c = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              AchievementQuery.field_g[var5] = -1;
            }
            LineupPositionSupport.field_f = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              WeightedLruCache.field_c[var5] = TeamManagementScreen.field_C[var5];
            }
            WeightedLruCache.field_c[-3 + var4] = "";
            WeightedLruCache.field_c[var4 - 2] = ScrollContainer.field_Jb;
            AchievementQuery.field_g[-2 + var4] = 0;
            LineupPositionSupport.field_f[0] = 4;
            WeightedLruCache.field_c[var4 - 1] = SharedPanelFactory.field_c;
            AchievementQuery.field_g[-1 + var4] = 1;
            LineupPositionSupport.field_f[1] = 5;
          } else if (TextPromptState.field_a == 1) {
            var3_int = SpriteState.a(MeshObject.field_f, SocialListProtocolSupport.field_a, param1 ^ -44, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
            var4 = 2 + var3_int;
            WeightedLruCache.field_c = new String[var4];
            AchievementQuery.field_g = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              AchievementQuery.field_g[var5] = -1;
            }
            LineupPositionSupport.field_f = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              WeightedLruCache.field_c[var5] = TeamManagementScreen.field_C[var5];
            }
            WeightedLruCache.field_c[-2 + var4] = "";
            WeightedLruCache.field_c[var4 - 1] = SharedPanelFactory.field_c;
            AchievementQuery.field_g[-1 + var4] = 0;
            LineupPositionSupport.field_f[0] = 5;
          } else if (2 != TextPromptState.field_a) {
            if (TextPromptState.field_a == 3) {
              if (!PlatformTaskState.field_c.field_l) {
                var3_int = SpriteState.a(MeshObject.field_f, ValidatedTextWidget.field_bb, -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
              } else {
                var3_int = SpriteState.a(MeshObject.field_f, GrowableIntList.field_a, param1 - 52, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
              }
              var4 = 2 + var3_int;
              WeightedLruCache.field_c = new String[var4];
              AchievementQuery.field_g = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                AchievementQuery.field_g[var5] = -1;
              }
              LineupPositionSupport.field_f = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                WeightedLruCache.field_c[var5] = TeamManagementScreen.field_C[var5];
              }
              WeightedLruCache.field_c[-2 + var4] = "";
              WeightedLruCache.field_c[var4 - 1] = SharedPanelFactory.field_c;
              AchievementQuery.field_g[-1 + var4] = 0;
              LineupPositionSupport.field_f[0] = 5;
            } else if (TextPromptState.field_a == 4) {
              var3_int = SpriteState.a(MeshObject.field_f, AnimationSkeleton.field_n, -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
              var4 = var3_int + 2;
              AchievementQuery.field_g = new int[var4];
              WeightedLruCache.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                AchievementQuery.field_g[var5] = -1;
              }
              LineupPositionSupport.field_f = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                WeightedLruCache.field_c[var5] = TeamManagementScreen.field_C[var5];
              }
              WeightedLruCache.field_c[var4 - 2] = "";
              WeightedLruCache.field_c[var4 - 1] = SharedPanelFactory.field_c;
              AchievementQuery.field_g[-1 + var4] = 0;
              LineupPositionSupport.field_f[0] = 5;
            } else {
              if (TextPromptState.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = SpriteState.a(MeshObject.field_f, ClassNameSupport.field_b, -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
              var4 = 3 + var3_int;
              WeightedLruCache.field_c = new String[var4];
              AchievementQuery.field_g = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                AchievementQuery.field_g[var5] = -1;
              }
              LineupPositionSupport.field_f = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                WeightedLruCache.field_c[var5] = TeamManagementScreen.field_C[var5];
              }
              WeightedLruCache.field_c[-3 + var4] = "";
              WeightedLruCache.field_c[var4 - 2] = ConsoleArgumentSupport.field_c;
              AchievementQuery.field_g[var4 - 2] = 0;
              LineupPositionSupport.field_f[0] = 3;
              WeightedLruCache.field_c[-1 + var4] = SharedPanelFactory.field_c;
              AchievementQuery.field_g[-1 + var4] = 1;
              LineupPositionSupport.field_f[1] = 5;
            }
          } else {
            var3_int = SpriteState.a(MeshObject.field_f, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TextFieldNode.field_Kb, new String[]{"<br><%0><br>"}), -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(TeamManagementScreen.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            TrinketIcon.field_Eb = new String[var4];
            ArrayOperations.copyReferences(TeamManagementScreen.field_C, 0, TrinketIcon.field_Eb, 0, var4);
            SharedPanelFactory.field_a = new String[-1 + (-var4 + var3_int)];
            ArrayOperations.copyReferences(TeamManagementScreen.field_C, var4 + 1, SharedPanelFactory.field_a, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = SpriteState.a(MeshObject.field_f, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, FormationView.field_o, new String[]{"<br><%0><br>"}), -46, TeamManagementScreen.field_C, MatchTextInputOverlay.field_k);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(TeamManagementScreen.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            StrongCacheEntry.field_D = new String[var4];
            ArrayOperations.copyReferences(TeamManagementScreen.field_C, 0, StrongCacheEntry.field_D, 0, var4);
            CaptionedContainer.field_E = new String[var3_int - var4 - 1];
            ArrayOperations.copyReferences(TeamManagementScreen.field_C, 1 + var4, CaptionedContainer.field_E, 0, -var4 + (var3_int - 1));
            if (StrongCacheEntry.field_D.length > TrinketIcon.field_Eb.length) {
              stackIn_22_0 = StrongCacheEntry.field_D.length;
            } else {
              stackIn_22_0 = TrinketIcon.field_Eb.length;
            }
            var5 = stackIn_22_0;
            if (SharedPanelFactory.field_a.length >= CaptionedContainer.field_E.length) {
              stackIn_25_0 = SharedPanelFactory.field_a.length;
            } else {
              stackIn_25_0 = CaptionedContainer.field_E.length;
            }
            var6 = stackIn_25_0;
            var7 = var6 + 7 + var5;
            AchievementQuery.field_g = new int[var7];
            WeightedLruCache.field_c = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              AchievementQuery.field_g[var8] = -1;
            }
            LineupPositionSupport.field_f = new int[2];
            WeightedLruCache.field_c[1] = IconButtonPainter.field_f;
            WeightedLruCache.field_c[0] = LoginText.field_a;
            AchievementQuery.field_g[1] = 0;
            AchievementQuery.field_g[3] = 1;
            WeightedLruCache.field_c[5] = "";
            WeightedLruCache.field_c[2] = RasterGlowSupport.field_d;
            WeightedLruCache.field_c[4] = ChatMessage.field_k;
            LineupPositionSupport.field_f[1] = 2;
            LineupPositionSupport.field_f[0] = 5;
            WeightedLruCache.field_c[3] = LinkTextPainter.field_g;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_32_0 = WeightedLruCache.field_c;
              stackIn_32_1 = var8Lifetime2 + 6;
              if (StrongCacheEntry.field_D.length + var8Lifetime2 - var5 < 0) {
                stackIn_33_2 = "";
              } else {
                stackIn_33_2 = StrongCacheEntry.field_D[-var5 + (var8Lifetime2 + StrongCacheEntry.field_D.length)];
              }
              stackIn_32_0[stackIn_32_1] = stackIn_33_2;
            }
            WeightedLruCache.field_c[var5 + 6] = null;
            AchievementQuery.field_g[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_37_0 = WeightedLruCache.field_c;
              stackIn_37_1 = var8Lifetime3 + var5 + 7;
              stackIn_37_2 = var8Lifetime3;
              stackIn_37_3 = CaptionedContainer.field_E.length;
              if (stackIn_37_2 < stackIn_37_3) {
                stackIn_40_2 = CaptionedContainer.field_E[var8Lifetime3];
              } else {
                stackIn_40_2 = "";
              }
              stackIn_37_0[stackIn_37_1] = stackIn_40_2;
            }
            PlayingView.field_o = MonotonicClock.monotonicMillis(90);
          }
          DirectByteStorage.field_k.itemCount = LineupPositionSupport.field_f.length;
          var3_intLifetime1 = 0;
          if (param1 != 6) {
            return;
          }
          for (var4Lifetime1 = 0; WeightedLruCache.field_c.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_90_0 = 10;
            stackIn_90_1 = WeightedLruCache.field_c[var4Lifetime1];
            stackIn_91_2 = !(AchievementQuery.field_g[var4Lifetime1] < 0);
            var5Lifetime1 = MatchTransitionScreen.a(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == TextPromptState.field_a) {
            var10 = TrinketIcon.field_Eb;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = MatchTransitionScreen.a(10, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = SharedPanelFactory.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = MatchTransitionScreen.a(10, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          BufferedSocket.field_j = DirectByteStorage.field_k.itemCount * (LeagueRatingRequirements.field_d + ThreadSleepSupport.field_a << 1);
          GameQuickChatResolver.field_a = -(var3_intLifetime1 >> 1) + TeamManagementScreen.field_A;
          BufferedSocket.field_l = var3_intLifetime1 + (TeamManagementScreen.field_A - (var3_intLifetime1 >> 1));
          for (var4Lifetime2 = 0; var4Lifetime2 < WeightedLruCache.field_c.length; var4Lifetime2++) {
            stackIn_114_0 = BufferedSocket.field_j;
            if (AchievementQuery.field_g[var4Lifetime2] >= 0) {
              stackIn_115_1 = PlayerModelPreview.field_j;
            } else {
              stackIn_115_1 = PlayArea.field_c;
            }
            BufferedSocket.field_j = stackIn_114_0 + stackIn_115_1;
          }
          ChatInputState.field_c = -(BufferedSocket.field_j >> 1) + SocketArchiveNetworkClient.field_s;
          AccountInputValidationResult.field_j = new int[WeightedLruCache.field_c.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = ChatInputState.field_c;
          while (WeightedLruCache.field_c.length > var4Lifetime3) {
            var6Lifetime1 = AchievementQuery.field_g[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + PlayArea.field_c;
            } else {
              var7Lifetime2 = MatchTransitionScreen.a(10, WeightedLruCache.field_c[var4Lifetime3], true);
              var8Lifetime1 = TeamManagementScreen.field_A - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + ThreadSleepSupport.field_a;
              AccountInputValidationResult.field_j[var4Lifetime3] = new int[4];
              AccountInputValidationResult.field_j[var4Lifetime3][0] = -DiskCacheWorker.field_d + var8Lifetime1;
              AccountInputValidationResult.field_j[var4Lifetime3][1] = var5Lifetime3;
              AccountInputValidationResult.field_j[var4Lifetime3][2] = (DiskCacheWorker.field_d << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (PlayerModelPreview.field_j + ((LeagueRatingRequirements.field_d << 1) + ThreadSleepSupport.field_a));
              AccountInputValidationResult.field_j[var4Lifetime3][3] = PlayerModelPreview.field_j + (LeagueRatingRequirements.field_d << 1);
            }
            var4Lifetime3++;
          }
          if (TextPromptState.field_a == 2) {
            DirectByteStorage.field_k.a(-1, 0, -1, param0);
          } else {
            DirectByteStorage.field_k.a(ResourceArchive.a(BytePlusOneCommand.field_A, ArchiveManager.field_m, (byte) -127), param1 ^ 6, 0, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "ba.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    TrinketCountSortCriterion() {
    }

    final static void drawModalOverlay(int param0, boolean param1) {
        if (!ArchiveManager.a(false)) {
          return;
        }
        if (param1) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, 0, 192);
        }
        ValidatedTextWidget.field_Z.renderWidgetPassesAndTooltip(0, 0, (byte) -103);
        if (param0 <= 108) {
          field_n = (TriangleMesh[]) null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_n = null;
        field_q = null;
        field_p = null;
        if (param0 != -35) {
          TrinketCountSortCriterion.createPanelSprites(27, -30, 62, (byte) -107);
        }
        field_o = null;
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Kickabout.field_G;
          try {
            if (null != ParticipantStatus.field_t) {
              ParticipantStatus.field_t.closeSocket((byte) 109);
            }
            if (null != SplashScreen.field_i) {
              SplashScreen.field_i.shutdown(109);
            }
            if (RandomAccessCacheFile.field_h != null) {
              try {
                RandomAccessCacheFile.field_h.close(1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (JaggrabDownloader.field_j != null) {
              for (var1_int = 0; JaggrabDownloader.field_j.length > var1_int; var1_int++) {
                if (JaggrabDownloader.field_j[var1_int] != null) {
                  try {
                    JaggrabDownloader.field_j[var1_int].close(param0 - 43);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (param0 != 44) {
              field_n = (TriangleMesh[]) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ba.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_q = new int[8192];
        field_o = "Just play";
    }
}
