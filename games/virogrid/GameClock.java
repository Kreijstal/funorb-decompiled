/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static int field_c;
    static String field_b;
    static String field_a;

    abstract long getMillisUntilNextTick(byte param0);

    final static PcmStreamMixer getSoundEffectMixer(int param0) {
        if (param0 >= -88) {
          return (PcmStreamMixer) null;
        }
        return ReflectionCheckHelpers.field_g;
    }

    final static boolean isFriendOrGameMember(String param0, long param1, int param2) {
        SocialListEntry var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = NodeHashTableIterator.findListEntryByName(0, param0);
          if (param2 != -24236) {
            GameClock.layoutLobbyComponents(false, false);
          }
          if (var4 != null &&
            null != var4.field_Pb) {
            return true;
          }
          stackIn_11_0 = (AudioSetupHelpers.field_d != null) && (null != GameSession.findLobbyPlayer(param1, (byte) -127));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("hm.N(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void showLoginPanelWithoutMessage(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
        }
        String var2 = (String) null;
        GrowableIntList.openLoginPanelWithMessage((byte) 40, LoginDialog.field_sb, (String) null);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        int var1 = 0 / ((param0 + 49) / 54);
        field_b = null;
    }

    abstract void resetTiming(int param0);

    final static void layoutLobbyComponents(boolean param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        SpriteWidget stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_9_4 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        SpriteWidget var7 = null;
        int var7_int = 0;
        int var8 = 0;
        SpriteWidget var8_ref_km = null;
        IconTextComponent var9 = null;
        int var9_int = 0;
        int var10 = 0;
        IconTextComponent var10_ref_hk = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          DualLinkDequeIterator.field_b = Rasterizer.field_f;
          if (!param1) {
            GameClock.isFriendOrGameMember((String) null, 18L, 31);
          }
          IterableDualLinkDeque.field_f = Rasterizer.field_e;
          if (param0) {
            stackIn_6_0 = PendingHighscoreRequest.field_h;
          } else {
            stackIn_6_0 = QuickChatPhraseDefinition.field_z;
          }
          TriangleSortHelpers.positionSlidingPanels(stackIn_6_0, -4);
          LobbyGame.field_pc.layoutLobbyPanels(36, 0, 0, -2 + ScrollPaneWithFooter.field_Eb.field_ub - 40, ScrollPaneWithFooter.field_Eb.field_K);
          AccountCreationForm.field_R.setGeometry(0, LobbySortHelpers.field_e, ViewControlStrings.field_d.field_K, (byte) -52, 0);
          stackIn_8_0 = ClientServiceHelpers.field_g;
          stackIn_8_1 = 0;
          stackIn_8_2 = 18;
          stackIn_8_3 = ViewControlStrings.field_d.field_K;
          if (!DialWidgetPainter.field_d) {
            stackIn_9_4 = 0;
          } else {
            stackIn_9_4 = 4 + (PendingScoreQuery.field_k + 40);
          }
          ((SpriteWidget) (Object) stackIn_8_0).setGeometry(stackIn_8_1, stackIn_8_2, stackIn_8_3 - stackIn_9_4, (byte) -105, 2 + LobbySortHelpers.field_e);
          CheckboxButton.field_F.setGeometry(-PendingScoreQuery.field_k + (ViewControlStrings.field_d.field_K - 42), 18, 42 + PendingScoreQuery.field_k, (byte) -107, 2 + LobbySortHelpers.field_e);
          TriangleMesh.field_r.setScrollPaneBounds(2 + LobbySortHelpers.field_e + 20, -114, ViewControlStrings.field_d.field_K, 2, -LobbySortHelpers.field_e + (ViewControlStrings.field_d.field_ub - 2 - 20), 0, PendingScoreQuery.field_k);
          CellFlip.field_o.setGeometry(0, 40, ScrollPaneWithFooter.field_Eb.field_K, (byte) -120, -40 + ScrollPaneWithFooter.field_Eb.field_ub);
          PopupMenuDrawHelpers.field_e.setGeometry(0, 30, CacheReference.field_r.field_K, (byte) -57, 0);
          ChatSettingsHelpers.field_b.setGeometry(0, -30 + CacheReference.field_r.field_ub - 42, CacheReference.field_r.field_K, (byte) -118, 30);
          var2_int = TextMetricsGlobals.field_h + 3;
          if (UiLayerInputHelpers.field_b.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = ((var2_int + 1) / 2 + (-13 + (ChatSettingsHelpers.field_b.field_ub - 5))) / (1 + var2_int) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (ChatSettingsHelpers.field_b.field_ub - 5 - var2_int * (var3 + 2));
          if (var4 > 40) {
            var4 = 40;
          }
          PacketRequestHelpers.field_c.setGeometry(5, var4, -5 + ChatSettingsHelpers.field_b.field_K - 5, (byte) -92, 5);
          var5 = 2 + var4 + 5;
          for (var6 = 0; var6 < TextMetricsGlobals.field_h + 4; var6++) {
            if ((var6 != 1 ||
              !(UiLayerInputHelpers.field_b.length < 2)) && (var6 != 3 ||
              !(PopupMenuDrawHelpers.field_f <= 1))) {
              if (!param0 &&
                3 == var6) {
                var7 = DualLinkDequeIterator.field_f[var6];
                DualLinkDequeIterator.field_f[var6].field_ub = 0;
                var7.field_K = 0;
                for (var8 = 0; var8 < SessionSeedHelpers.field_b[var6].length; var8++) {
                  if (null != SessionSeedHelpers.field_b[var6][var8]) {
                    var9 = SessionSeedHelpers.field_b[var6][var8];
                    SessionSeedHelpers.field_b[var6][var8].field_ub = 0;
                    var9.field_K = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var7 = DualLinkDequeIterator.field_f[var6];
                DualLinkDequeIterator.field_f[var6].field_ub = 0;
                var7.field_K = 0;
                for (var8 = 0; var8 < SessionSeedHelpers.field_b[var6].length; var8++) {
                  if (SessionSeedHelpers.field_b[var6][var8] != null) {
                    var9 = SessionSeedHelpers.field_b[var6][var8];
                    SessionSeedHelpers.field_b[var6][var8].field_ub = 0;
                    var9.field_K = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != WidgetLayerStack.field_J) {
                      stackIn_50_0 = (WidgetLayerStack.field_J[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_50_0 = 0;
                    }
                  } else {
                    stackIn_50_0 = 0;
                  }
                } else {
                  stackIn_50_0 = 0;
                }
                var7_int = stackIn_50_0;
                if (var7_int != 0) {
                  var8_ref_km = DualLinkDequeIterator.field_f[var6];
                  DualLinkDequeIterator.field_f[var6].field_ub = 0;
                  var8_ref_km.field_K = 0;
                  for (var9_int = 0; var9_int < SessionSeedHelpers.field_b[var6].length; var9_int++) {
                    if (null != SessionSeedHelpers.field_b[var6][var9_int]) {
                      var10_ref_hk = SessionSeedHelpers.field_b[var6][var9_int];
                      SessionSeedHelpers.field_b[var6][var9_int].field_ub = 0;
                      var10_ref_hk.field_K = 0;
                    }
                  }
                } else {
                  DualLinkDequeIterator.field_f[var6].setGeometry(5, var3, 103, (byte) -58, var5);
                  var8 = 110;
                  if (!param0) {
                    if (SessionSeedHelpers.field_b[var6][0] != null) {
                      var9 = SessionSeedHelpers.field_b[var6][0];
                      SessionSeedHelpers.field_b[var6][0].field_ub = 0;
                      var9.field_K = 0;
                    }
                  } else {
                    SessionSeedHelpers.field_b[var6][0].setBoundsAndLayout(38, var8, 2, var5, ConnectionStage.field_b, var3, 2);
                    var8 += 40;
                  }
                  var9_int = -5 + CacheReference.field_r.field_K + (-var8 + 2);
                  var10 = SessionSeedHelpers.field_b[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    SessionSeedHelpers.field_b[var6][1 + var11].setBoundsAndLayout(var9_int * (var11 + 1) / var10 + (-2 - var12), var8 + var12, 2, var5, ConnectionStage.field_b, var3, 2);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          MouseTrailPoint.field_n.setGeometry(Rasterizer.field_e - 360 >> 1, -130 + (Rasterizer.field_f - 14), 360, (byte) -97, 10);
          WidgetStyleLayer.field_m.setGeometry(0, 24, MouseTrailPoint.field_n.field_K, (byte) -69, 0);
          BirthDateInputWidget.field_J.setGeometry(0, -24 + MouseTrailPoint.field_n.field_ub, MouseTrailPoint.field_n.field_K, (byte) -77, 24);
          BirthDateInputWidget.field_J.field_vb = StatusAndUrlHelpers.createGradientFrameSprites(BirthDateInputWidget.field_J.field_ub, 3, 1, (byte) 106, 8421504, 11579568);
          BackgroundParticle.field_m.setGeometry(5, BirthDateInputWidget.field_J.field_ub - 34 - 2, -10 + BirthDateInputWidget.field_J.field_K, (byte) -120, 5);
          HelpPopup.field_Ib.setGeometry((-80 + BirthDateInputWidget.field_J.field_K) / 2, 24, 80, (byte) -117, -24 + BirthDateInputWidget.field_J.field_ub - 5);
          MusicPatch.layoutTopBar(-20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "hm.L(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int advanceTicks(byte param0, long param1);

    final int waitAndAdvance(int param0, long param1) {
        long var4 = this.getMillisUntilNextTick((byte) -84);
        if (var4 > 0L) {
          IsaacRandom.sleepMillis(-17, var4);
        }
        if (param0 != 16680) {
          return 113;
        }
        return this.advanceTicks((byte) -103, param1);
    }

    static {
        field_b = "Password: ";
        field_a = "Remove friend";
    }
}
