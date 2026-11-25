/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuTransitionSupport {
    static AnimatedPanel field_d;
    static IntrusiveDeque field_b;
    static Sprite field_a;
    static String field_c;
    static String field_e;

    final static void fillCharacterPositions(String param0, TextLayoutLine param1, int param2, int param3, BitmapFont param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != 27329) {
            MenuTransitionSupport.findLobbyPlayer(62, -55L);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param0.length() > var7; var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param1.field_b[0] + param4.stringWidth(param0.substring(0, var7)));
            }
            if (var6 != -1) {
              param1.field_b[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param1.field_b[var7] = (var5_int >> 8) - (-param1.field_b[0] + (-param4.stringWidth(param0.substring(0, var7 + 1)) + param4.charWidth((char) var8)));
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ta.G(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void drawClientInterface(boolean param0, int param1) {
        if (WeightedLruCache.a(-104)) {
          param0 = false;
        }
        FleetTrailPoint.a(false, param0);
        if (WidgetContainer.field_C) {
          SoftwareRasterizer.clearRect(DiplomacyNotice.field_h.field_d.field_hb, DiplomacyNotice.field_h.field_d.field_db, DiplomacyNotice.field_h.field_d.field_K, DiplomacyNotice.field_h.field_d.field_mb);
          DiplomacyNotice.field_h.field_d.drawFullRaster(param0, -68);
          TextFieldValidator.a((byte) 99, param0);
          if (param1 < 38) {
            field_c = (String) null;
            return;
          }
          return;
        }
        TextFieldValidator.a((byte) 99, param0);
        if (param1 >= 38) {
          return;
        }
        field_c = (String) null;
    }

    final static IndexedSprite createDecodedIndexedSprite(byte param0) {
        IndexedSprite var1 = new IndexedSprite(NetworkArchiveRequest.field_y, BattleEvent.field_t, StatusMessagePanel.field_H[0], SocialListSetupSupport.field_a[0], WeightedCacheEntry.field_s[0], IntHashIndex.field_g[0], IntroTextLine.field_q[0], ProgressDialog.field_fb);
        TertiaryListSequence.clearDecodedSpriteData(0);
        if (param0 > 82) {
          return var1;
        }
        MenuTransitionSupport.isAccountNameRequestPending(113);
        return var1;
    }

    public static void clearStatics(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 < 110) {
          field_c = (String) null;
        }
    }

    final static boolean isAccountNameRequestPending(int param0) {
        int var1 = 94 / ((param0 + 29) / 49);
        return MatchingTextValidator.field_s == ExternalLinkSupport.field_a ? true : false;
    }

    final static void queueAnimationPreferences(byte param0) {
        byte[] var1;
        byte[] var2;
        byte[] var1Lifetime1;
        byte[] var2Lifetime1;
        if (param0 == -69) {
          if (Dialog.d(true)) {
            return;
          }
          if (StringNode.field_j == -1) {
            return;
          }
          if (StringNode.field_j == HorizontalGradientComponent.field_A) {
            return;
          }
          var2 = new byte[2];
          var1 = var2;
          var2[0] = (byte) 0;
          var2[1] = (byte)StringNode.field_j;
          UrlLoader.a(var2, (byte) -78, 6);
          HorizontalGradientComponent.field_A = StringNode.field_j;
          return;
        }
        MenuTransitionSupport.drawClientInterface(true, -56);
        if (Dialog.d(true)) {
          return;
        }
        if (StringNode.field_j == -1) {
          return;
        }
        if (StringNode.field_j == HorizontalGradientComponent.field_A) {
          return;
        }
        var2Lifetime1 = new byte[2];
        var1Lifetime1 = var2Lifetime1;
        var2Lifetime1[0] = (byte) 0;
        var2Lifetime1[1] = (byte)StringNode.field_j;
        UrlLoader.a(var2Lifetime1, (byte) -78, 6);
        HorizontalGradientComponent.field_A = StringNode.field_j;
    }

    final static LobbyPlayerEntry findLobbyPlayer(int param0, long param1) {
        int var3 = -91 % ((59 - param0) / 56);
        return (LobbyPlayerEntry) (ShatteredPlansClient.field_H.get(65280, param1));
    }

    final static void beginMenuTransition(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param1 == PlayerRankingRequest.field_o) {
          return;
        }
        PlayerRankingRequest.field_o = param1;
        MusicPatch.field_m = param0;
        if (PointsVictoryChecker.a((byte) -94, GameRules.field_c)) {
          LobbyPlayerEntry.field_Hb[GameRules.field_c].clearMenuActivation(-30492, PlayerRankingRequest.field_o);
          if (PointsVictoryChecker.a((byte) -73, PlayerRankingRequest.field_o)) {
            var4 = 0;
            if (11 == PlayerRankingRequest.field_o) {
              var4 = -1;
            }
            LobbyPlayerEntry.field_Hb[PlayerRankingRequest.field_o].resetMenuInput(var4, (byte) 27, param3);
          }
          BirthDateConfirmationForm.field_Q = 0;
          if (param2 != 96) {
            MenuTransitionSupport.queueAnimationPreferences((byte) 9);
            return;
          }
          return;
        }
        if (PointsVictoryChecker.a((byte) -73, PlayerRankingRequest.field_o)) {
          var4Lifetime1 = 0;
          if (11 == PlayerRankingRequest.field_o) {
            var4Lifetime1 = -1;
          }
          LobbyPlayerEntry.field_Hb[PlayerRankingRequest.field_o].resetMenuInput(var4Lifetime1, (byte) 27, param3);
        }
        BirthDateConfirmationForm.field_Q = 0;
        if (param2 == 96) {
          return;
        }
        MenuTransitionSupport.queueAnimationPreferences((byte) 9);
    }

    static {
        field_b = new IntrusiveDeque();
        field_e = "Percentage of battles won in friendly space.";
        field_c = "Join <%0>'s game";
    }
}
