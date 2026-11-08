/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbySetupHelpers {
    static String field_b;
    static String field_c;
    static boolean field_e;
    static String field_d;
    static int[] field_h;
    static ResourceArchive field_a;
    static int field_f;
    static String field_g;

    final static boolean meetsSlotRequirement(int param0, boolean param1, int param2, int param3) {
        ResourceArchive var5;
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (param2 >= 1 &&
          ArticulatedPart.getDaysInMonth(-14487, param3, param0) >= param2) {
          if (!param1) {
            var5 = (ResourceArchive) null;
            LobbySetupHelpers.initializeGameOptions(-54, (int[]) null, (String[]) null, (String[][]) null, (String[]) null, 77, (String[][]) null, -51, (RgbSprite[][]) null, (RgbSprite[][]) null, 31, (String[]) null, (byte[]) null, (byte[]) null, (ResourceArchive) null);
          }
          return true;
        }
        return false;
    }

    final static void initializeGameOptions(int param0, int[] param1, String[] param2, String[][] param3, String[] param4, int param5, String[][] param6, int param7, RgbSprite[][] param8, RgbSprite[][] param9, int param10, String[] param11, byte[] param12, byte[] param13, ResourceArchive param14) {
        IconTextComponent[] array$0 = null;
        IconTextComponent[] array$1 = null;
        IconTextComponent[] array$2 = null;
        int var19 = 0;
        SceneWidget stackIn_5_0;
        SceneWidget stackIn_5_1;
        long stackIn_5_2;
        SceneWidget stackIn_5_3;
        SceneWidget stackIn_6_0 = null;
        SceneWidget stackIn_6_1 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        SceneWidget var16 = null;
        int var17_int = 0;
        SceneWidget var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        SceneWidget var23 = null;
        SceneWidget var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = SteelSentinels.obfuscationControl;
        try {
          LinkButtonPainter.field_h = param3;
          AccountRequestResult.field_g = param4;
          PasswordFieldPainter.field_D = param8;
          TableColumns.field_b = param9;
          ChecksumAndFrameHelpers.field_a = param7;
          TickClock.field_a = param2;
          IntrusiveNode.field_b = param11;
          HighscoreSubmission.field_z = param0;
          SocialListUiHelpers.field_e = param12;
          PasswordRuleHelpers.field_b = param6;
          SoundCache.field_f = param13;
          ViewportController.field_l = param1;
          HighscoreColumnHeader.field_i = StatSubmission.loadSpritesByName("gameprivacy", "lobby", (byte) -19, param14);
          DateInputWidget.field_Q = StatSubmission.loadSpritesByName("ratedgame", "lobby", (byte) -98, param14);
          MusicTrackHelpers.field_d = StatSubmission.loadSpritesByName("opentome", "lobby", (byte) -57, param14);
          AccountMessagePanel.field_Z = StatSubmission.loadSpritesByName("allowspectators", "lobby", (byte) -51, param14);
          HuffmanDecoder.field_j = new String[5];
          HuffmanDecoder.field_j[3] = GrowableIntList.field_a;
          HuffmanDecoder.field_j[2] = NameCheckResult.field_d;
          HuffmanDecoder.field_j[4] = QuickChatParameterType.field_g;
          HuffmanDecoder.field_j[0] = NameAvailabilityValidator.field_x;
          HuffmanDecoder.field_j[1] = DateOfBirthValidator.field_l;
          TeamColourTinter.field_c = new SceneWidget(0L, (SceneWidget) null);
          PacketBuffer.field_o = new SceneWidget(0L, MusicCrossfadeStream.field_J, ReflectionCheckHelpers.field_g);
          ReflectionCheckHelpers.field_j = new SceneWidget((long)param5, DefaultQuickChatCacheHook.field_b, TutorialStep.field_l);
          TabbedPanel.field_Sb = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          TeamColourTinter.field_c.addChild(PacketBuffer.field_o, 119);
          if (MenuInputState.field_p) {
            TeamColourTinter.field_c.addChild(ReflectionCheckHelpers.field_j, 122);
          }
          TeamColourTinter.field_c.addChild(TabbedPanel.field_Sb, 123);
          TabbedPanel.field_Sb.field_Tb.applyStyle(SolidSpriteHelpers.field_f, 6402);
          TabbedPanel.field_Sb.field_Tb.field_Fb = 1;
          var23 = TabbedPanel.field_Sb.field_Tb;
          var24 = var23;
          var24.field_Kb = 1;
          Explosion.field_C = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          Explosion.field_C.field_Kb = 1;
          BufferedSocket.field_i = new SceneWidget(0L, EmailValidationHelpers.field_c, NodeIterator.field_i.toUpperCase());
          LoginCredentialHelpers.field_c = new SceneWidget(0L, ParticleEffect.field_E, ProxySocketConnector.field_q.toUpperCase());
          IterableNodeHashTable.field_d = new SceneWidget(0L, PatchNoteUsage.field_o);
          ReportAbuseDialog.field_bc = new SceneWidget(0L, MusicCrossfadeStream.field_J, StatSubmission.field_p);
          NumberParsingHelpers.field_d = new SceneWidget(0L, LobbyStateHelpers.field_f, field_c);
          BattleTerrain.field_q = new SceneWidget(0L, LobbyStateHelpers.field_f, RequestResendHelpers.field_f);
          TriangleMesh.field_v = new SceneWidget(0L, LobbyStateHelpers.field_f, NameSuggestionsPanel.field_Q);
          SocialListPanel.field_Vb = new SceneWidget(0L, LobbyStateHelpers.field_f, StrongCacheEntry.field_B);
          StatSubmission.field_w = new SceneWidget(0L, DefaultQuickChatCacheHook.field_b, LoginDialog.field_Bb);
          PendingAckRequest.field_y = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          DisplayNameAndAudioHelpers.field_b = new SceneWidget(0L, MenuInputState.field_j, SoundAndUrlHelpers.field_f.toUpperCase());
          DisplayNameAndAudioHelpers.field_b.field_T = MenuInputState.field_p;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = MenuInputState.field_j;
          if (MenuInputState.field_p) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = IterableNodeHashTable.field_c;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = DelayedServerPacket.field_C;
          }
          DesignerPageTables.field_j = new SceneWidget(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          PlayingSound.field_q = new SceneWidget(0L, (SceneWidget) null);
          PlayingSound.field_q.addChild(LoginCredentialHelpers.field_c, 118);
          PlayingSound.field_q.addChild(IterableNodeHashTable.field_d, 119);
          IterableNodeHashTable.field_d.addChild(ReportAbuseDialog.field_bc, 120);
          IterableNodeHashTable.field_d.addChild(NumberParsingHelpers.field_d, param5 ^ 124);
          IterableNodeHashTable.field_d.addChild(BattleTerrain.field_q, param5 ^ 120);
          if (MenuInputState.field_p) {
            IterableNodeHashTable.field_d.addChild(TriangleMesh.field_v, 120);
          }
          IterableNodeHashTable.field_d.addChild(SocialListPanel.field_Vb, 126);
          IterableNodeHashTable.field_d.addChild(StatSubmission.field_w, 121);
          IterableNodeHashTable.field_d.addChild(PendingAckRequest.field_y, param5 + 124);
          if (MenuInputState.field_p) {
            PlayingSound.field_q.addChild(DisplayNameAndAudioHelpers.field_b, 122);
          }
          PlayingSound.field_q.addChild(DesignerPageTables.field_j, param5 + 121);
          MusicCrossfadeStream.field_z = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          MusicCrossfadeStream.field_z.field_Kb = 1;
          MusicCrossfadeStream.field_z.field_Fb = 0;
          LoginForm.field_gb = new SceneWidget(0L, DialWidgetPainter.field_e, Sentinel.field_D.toUpperCase());
          TeamColourTinter.field_b = new SceneWidget(0L, AudioService.field_a);
          TeamColourTinter.field_b.addChild(MusicCrossfadeStream.field_z, 122);
          TeamColourTinter.field_b.addChild(LoginForm.field_gb, 122);
          Projectile.field_J = new SceneWidget(0L, IntKeyLookup.field_h);
          Projectile.field_J.applyStyle(SolidSpriteHelpers.field_f, param5 ^ 6402);
          var16 = Projectile.field_J;
          Projectile.field_J.field_Fb = 1;
          var16.field_Kb = 1;
          HuffmanDecoder.field_i = new SceneWidget(0L, (SceneWidget) null);
          ReflectionCheckHelpers.field_e = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          ReflectionCheckHelpers.field_e.field_Kb = 1;
          NanoTickClock.field_u = new SceneWidget(0L, MusicCrossfadeStream.field_J, ReflectionCheckHelpers.field_g);
          NameAvailabilityValidator.field_p = new SceneWidget(0L, DefaultQuickChatCacheHook.field_b, TutorialStep.field_l);
          NanoTickClock.field_t = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          HuffmanDecoder.field_i.addChild(ReflectionCheckHelpers.field_e, 120);
          HuffmanDecoder.field_i.addChild(NanoTickClock.field_u, 127);
          if (MenuInputState.field_p) {
            HuffmanDecoder.field_i.addChild(NameAvailabilityValidator.field_p, param5 + 118);
          }
          HuffmanDecoder.field_i.addChild(NanoTickClock.field_t, 124);
          QuickChatCategory.field_E = new SceneWidget(0L, EmailValidationHelpers.field_c, TextAndBitHelpers.field_c.toUpperCase());
          EmailAvailabilityValidator.field_q = new SceneWidget(0L, ParticleEffect.field_E);
          Js5NetworkRequest.field_L = new SceneWidget(0L, PatchNoteUsage.field_o);
          MusicPatchEnvelope.field_d = new SceneWidget(0L, PendingByteArrayRequest.field_p, SpriteFrame.field_b.toUpperCase());
          ChatHistoryAllocator.field_h = new IconTextComponent[4 + param10][];
          ArchiveLoadStep.field_k = new SceneWidget[4 + param10];
          ArchiveLoadStep.field_k[0] = new SceneWidget(0L, NumberParsingHelpers.field_b, SessionUiHelpers.field_c);
          ChatHistoryAllocator.field_h[0] = new IconTextComponent[6];
          for (var17_int = 0; 5 > var17_int; var17_int++) {
            ChatHistoryAllocator.field_h[0][var17_int + 1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, HighscoreColumnHeader.field_i[var17_int], HuffmanDecoder.field_j[var17_int]);
          }
          if (ViewportController.field_l.length >= 2) {
            ArchiveLoadStep.field_k[1] = new SceneWidget(0L, NumberParsingHelpers.field_b, AngleHelpers.field_d);
            array$0 = new IconTextComponent[ViewportController.field_l.length + 1];
            ChatHistoryAllocator.field_h[1] = array$0;
            ChatHistoryAllocator.field_h[1][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var17_intLifetime1 = 0; ViewportController.field_l.length > var17_intLifetime1; var17_intLifetime1++) {
              ChatHistoryAllocator.field_h[1][1 + var17_intLifetime1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, Integer.toString(ViewportController.field_l[var17_intLifetime1]));
            }
          }
          ArchiveLoadStep.field_k[2] = new SceneWidget(0L, NumberParsingHelpers.field_b, SteelSentinels.field_H);
          ChatHistoryAllocator.field_h[2] = new IconTextComponent[]{new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e), new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, AccountMessagePanel.field_Z[0], IconLabelControl.field_Sb), new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, AccountMessagePanel.field_Z[1], HuffmanDecoder.field_g)};
          if (HighscoreSubmission.field_z > 1) {
            ArchiveLoadStep.field_k[3] = new SceneWidget(0L, NumberParsingHelpers.field_b, PlayingSound.field_o);
            array$1 = new IconTextComponent[1 + HighscoreSubmission.field_z];
            ChatHistoryAllocator.field_h[3] = array$1;
            ChatHistoryAllocator.field_h[3][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var17_intLifetime2 = 0; HighscoreSubmission.field_z > var17_intLifetime2; var17_intLifetime2++) {
              ChatHistoryAllocator.field_h[3][var17_intLifetime2 + 1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, IntrusiveNode.field_b[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param10 > var17_intLifetime3; var17_intLifetime3++) {
            ArchiveLoadStep.field_k[var17_intLifetime3 + 4] = new SceneWidget(0L, NumberParsingHelpers.field_b, TickClock.field_a[var17_intLifetime3]);
            array$2 = new IconTextComponent[ClientUiHelpers.bitAnd((int) SoundCache.field_f[var17_intLifetime3], 255) + 1];
            ChatHistoryAllocator.field_h[var17_intLifetime3 + 4] = array$2;
            ChatHistoryAllocator.field_h[4 + var17_intLifetime3][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var18 = 0; (255 & SoundCache.field_f[var17_intLifetime3]) > var18; var18++) {
              if (null != TableColumns.field_b) {
                if (TableColumns.field_b[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = TableColumns.field_b[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (LinkButtonPainter.field_h == null) {
                var20 = null;
              } else {
                if (null == LinkButtonPainter.field_h[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = LinkButtonPainter.field_h[var17_intLifetime3][var18];
                }
              }
              ChatHistoryAllocator.field_h[4 + var17_intLifetime3][1 + var18] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param10 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (ArchiveLoadStep.field_k[var17_intLifetime4] != null) {
              ArchiveLoadStep.field_k[var17_intLifetime4].field_Ib = 11;
            }
            if (null != ChatHistoryAllocator.field_h[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < ChatHistoryAllocator.field_h[var17_intLifetime4].length; var18Lifetime1++) {
                if (ChatHistoryAllocator.field_h[var17_intLifetime4][var18Lifetime1] != null &&
                  ChatHistoryAllocator.field_h[var17_intLifetime4][var18Lifetime1].field_Tb != null) {
                  ChatHistoryAllocator.field_h[var17_intLifetime4][var18Lifetime1].field_Tb.field_Ib = 11;
                }
              }
            }
          }
          PendingAckRequest.field_C = new SceneWidget(0L, MenuInputState.field_j);
          BoundedUrlRequest.field_q = new SceneWidget(0L, MenuInputState.field_j);
          PendingDataRequest.field_w = new SceneWidget(0L, SceneWidget.field_ib);
          PendingDataRequest.field_w.applyStyle(SolidSpriteHelpers.field_f, 6402);
          var17 = PendingDataRequest.field_w;
          PendingDataRequest.field_w.field_Fb = 1;
          var17.field_Kb = 1;
          NanoTickClock.field_y = new SceneWidget(0L, (SceneWidget) null);
          NanoTickClock.field_y.addChild(EmailAvailabilityValidator.field_q, 127);
          NanoTickClock.field_y.addChild(Js5NetworkRequest.field_L, 125);
          Js5NetworkRequest.field_L.addChild(MusicPatchEnvelope.field_d, 118);
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param10; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(2 > ViewportController.field_l.length)) && (3 != var18Lifetime2 ||
              !(HighscoreSubmission.field_z <= 1))) {
              Js5NetworkRequest.field_L.addChild(ArchiveLoadStep.field_k[var18Lifetime2], 122);
              for (var19 = 0; ChatHistoryAllocator.field_h[var18Lifetime2].length > var19; var19++) {
                if (null != ChatHistoryAllocator.field_h[var18Lifetime2][var19]) {
                  Js5NetworkRequest.field_L.addChild(ChatHistoryAllocator.field_h[var18Lifetime2][var19], 122);
                }
              }
            }
          }
          NanoTickClock.field_y.addChild(PendingAckRequest.field_C, 123);
          NanoTickClock.field_y.addChild(BoundedUrlRequest.field_q, 120);
          NanoTickClock.field_y.addChild(PendingDataRequest.field_w, 120);
          ChatHistoryHelpers.field_a = new SceneWidget(0L, ClientException.field_g, RasterBuffer.field_j.toUpperCase());
          Js5ArchiveManager.field_i = new SceneWidget(0L, DialWidgetPainter.field_e, NodeHashTable.field_f.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_73_0 = var15;
          stackIn_73_1 = new StringBuilder().append("oh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param9 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param12 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param13 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param14 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final static void initializeLobbyUi(int param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, int param12, int param13) {
        UiTheme.field_i = null;
        GameplayController.showPendingNameMessage((byte) 108);
        param10 = NodeDeque.handleOverlayPointerInput(11, param1, param12, param6, param10, param3, param4);
        DropTargetWidget.updateLobbyPanels(param10, param1, param7, param0, param13, param2, param8, (byte) -6, param11, param9);
        if (param5 > -121) {
          java.applet.Applet var15 = (java.applet.Applet) null;
          LobbySetupHelpers.updatePageLinks((java.applet.Applet) null, (byte) -9);
        }
        PartInstruction.openFriendContextMenu(param7, (byte) 70, param11);
        SingleChildContainer.updateChatPanel(-1, param10, param6, param7);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 1) {
          ResourceArchive var2 = (ResourceArchive) null;
          LobbySetupHelpers.loadLobbyTheme((int[]) null, false, (ResourceArchive) null, (IndexedSprite[]) null, (ResourceArchive) null);
        }
    }

    final static void loadLobbyTheme(int[] param0, boolean param1, ResourceArchive param2, IndexedSprite[] param3, ResourceArchive param4) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[] dupTemp$1 = null;
        RgbSprite[] dupTemp$2 = null;
        RgbSprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        SceneWidget var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        SceneWidget var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = SteelSentinels.obfuscationControl;
        try {
          var20 = ArchiveLoadSequence.loadIndexedSpritesByName(-115, "lobby", param2, "crowns");
          var5 = var20;
          DesignerPageTables.field_l = var20.length;
          if (param3 != null) {
            var6 = new IndexedSprite[param3.length + DesignerPageTables.field_l];
            for (var7_int = 0; var7_int < DesignerPageTables.field_l; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; param3.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[DesignerPageTables.field_l + var7_intLifetime3] = param3[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; DesignerPageTables.field_l > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param3 != null) {
            if (param0 != null) {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + DesignerPageTables.field_l] = param0[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[DesignerPageTables.field_l + var7_intLifetime2] = param3[var7_intLifetime2].field_d;
              }
            }
          }
          FriendListHelpers.field_b = 2;
          SocketConnector.field_b = 15;
          LoginDialogHelpers.field_e = 2;
          TextLayout.field_g = 4;
          ClientGlobals.field_g = 11;
          var7 = TransitionTimerHelpers.loadBinaryFontByName(param4, "lobby", param2, -1, "largefont");
          ContentTransitionDialog.field_kb = TransitionTimerHelpers.loadBinaryFontByName(param4, "lobby", param2, -1, "generalfont");
          Bzip2State.field_d = TransitionTimerHelpers.loadBinaryFontByName(param4, "lobby", param2, -1, "chatfont");
          var7.setInlineSprites(var5, var24);
          ContentTransitionDialog.field_kb.setInlineSprites(var5, var24);
          Bzip2State.field_d.setInlineSprites(var5, var24);
          var8 = new SceneWidget(0L, (SceneWidget) null);
          var8.field_Ib = SocketConnector.field_b;
          var8.field_nb = 16777215;
          var8.field_L = (BitmapFont) ((Object) var7);
          var9 = var8;
          var8.field_Fb = 1;
          var9.field_Kb = 1;
          var10 = new SceneWidget(0L, (SceneWidget) null);
          var10.field_Ib = SocketConnector.field_b;
          var10.field_nb = 16777215;
          var10.field_L = (BitmapFont) ((Object) ContentTransitionDialog.field_kb);
          var10.field_Fb = 1;
          var11 = var10;
          var11.field_Kb = 1;
          ParticleEffect.field_E = new SceneWidget(0L, var8);
          ParticleEffect.field_E.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("heading", "lobby", (byte) -30, param2));
          CipherPacketBuffer.field_H = new SceneWidget(0L, (SceneWidget) null);
          CipherPacketBuffer.field_H.field_I = DialWidget.createGradientTabSprites(param1, 8421504, false, -22, 120, 4210752);
          WeightedLruCache.field_n = new SceneWidget(0L, (SceneWidget) null);
          WeightedLruCache.field_n.field_I = PopupMenuSupport.buildSolidFrameSprites(3, 1, 6316128, 114, 6316128, 13574);
          HighscoreTable.field_y = new SceneWidget(0L, (SceneWidget) null);
          HighscoreTable.field_y.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("popup", "lobby", (byte) -94, param2));
          var12 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("popup_mouseover", "lobby", (byte) -110, param2));
          var13 = StatSubmission.loadSpritesByName("button", "lobby", (byte) -97, param2);
          var14 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("tab_active", "lobby", (byte) -125, param2));
          ClientException.field_g = new SceneWidget(0L, var8);
          ClientException.field_g.field_I = var14;
          HighscoreColumnHeader.field_e = new SceneWidget(0L, (SceneWidget) null);
          HighscoreColumnHeader.field_e.field_Pb = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "closebutton", false);
          HighscoreColumnHeader.field_e.field_db = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "closebutton_mouseover", param1);
          PendingByteArrayRequest.field_p = new SceneWidget(0L, var8);
          PendingByteArrayRequest.field_p.field_I = DialWidget.createGradientTabSprites(true, 3815994, true, -100, 40, 2039583);
          MusicCrossfadeStream.field_J = new SceneWidget(0L, var10);
          MusicCrossfadeStream.field_J.field_ub = 2;
          MusicCrossfadeStream.field_J.field_I = DialWidget.createGradientTabSprites(true, 3815994, false, -15, 30, 2039583);
          LobbyStateHelpers.field_f = new SceneWidget(0L, var10);
          LobbyStateHelpers.field_f.field_ub = 2;
          LobbyStateHelpers.field_f.field_I = DialWidget.createGradientTabSprites(false, 3815994, false, -52, 30, 2039583);
          DefaultQuickChatCacheHook.field_b = new SceneWidget(0L, var10);
          DefaultQuickChatCacheHook.field_b.field_ub = 2;
          DefaultQuickChatCacheHook.field_b.field_I = DialWidget.createGradientTabSprites(false, 3815994, true, -47, 30, 2039583);
          SolidSpriteHelpers.field_f = new SceneWidget(0L, (SceneWidget) null);
          SolidSpriteHelpers.field_f.field_L = (BitmapFont) ((Object) ContentTransitionDialog.field_kb);
          SolidSpriteHelpers.field_f.field_nb = 13421772;
          SolidSpriteHelpers.field_f.field_Fb = 1;
          SolidSpriteHelpers.field_f.field_Ib = SocketConnector.field_b;
          ParticleEffect.field_K = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          ParticleEffect.field_K.field_xb = 16777215;
          ParticleEffect.field_K.field_Mb = 16777215;
          ParticleEffect.field_K.field_nb = 16764006;
          ParticleEffect.field_K.field_rb = 16777215;
          ParticleEffect.field_K.field_yb = 8421504;
          var15 = new SceneWidget(0L, ParticleEffect.field_K);
          var15.field_Ib = SocketConnector.field_b;
          var15.field_L = (BitmapFont) ((Object) var7);
          var15.field_nb = 16777215;
          SceneWidget.field_ib = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          SceneWidget.field_ib.field_I = DialWidget.createGradientTabSprites(false, 2236962, false, -54, 16, 2236962);
          SceneWidget.field_ib.field_ub = 2;
          NumberParsingHelpers.field_b = new SceneWidget(0L, SolidSpriteHelpers.field_f);
          NumberParsingHelpers.field_b.field_I = DialWidget.createGradientTabSprites(false, 1513239, false, -75, 16, 1513239);
          NumberParsingHelpers.field_b.field_ub = 2;
          SteelSentinels.field_J = new SceneWidget(0L, SceneWidget.field_ib);
          SteelSentinels.field_J.applyStyle(ParticleEffect.field_K, 6402);
          ModalPanel.field_W = new SceneWidget(0L, NumberParsingHelpers.field_b);
          ModalPanel.field_W.applyStyle(ParticleEffect.field_K, 6402);
          var16 = StatSubmission.loadSpritesByName("button_mouseover", "lobby", (byte) -114, param2);
          MusicTrackHelpers.field_h = new ContextMenu(HighscoreTable.field_y, var12, SolidSpriteHelpers.field_f, ParticleEffect.field_K, 3, 2, LoginDialogHelpers.field_e, 3, SocketConnector.field_b);
          TeamColourTinter.field_e = new SceneWidget(0L, ParticleEffect.field_K);
          TeamColourTinter.field_e.field_I = var13;
          TeamColourTinter.field_e.field_Qb = 1;
          TeamColourTinter.field_e.field_Z = 1;
          TeamColourTinter.field_e.field_ob = 1;
          TeamColourTinter.field_e.field_Ab = var16;
          TeamColourTinter.field_e.field_ab = 1;
          TeamColourTinter.field_e.field_mb = StatSubmission.loadSpritesByName("button_mouseheld", "lobby", (byte) -51, param2);
          TeamColourTinter.field_e.field_bb = StatSubmission.loadSpritesByName("button_active", "lobby", (byte) -107, param2);
          TeamColourTinter.field_e.field_H = StatSubmission.loadSpritesByName("button_disabled", "lobby", (byte) -104, param2);
          TeamColourTinter.field_e.field_Kb = 1;
          ModalStack.field_U = new SceneWidget(0L, ParticleEffect.field_K);
          ModalStack.field_U.field_Kb = 1;
          ModalStack.field_U.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("tab_inactive", "lobby", (byte) -115, param2));
          ModalStack.field_U.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("tab_mouseover", "lobby", (byte) -29, param2));
          ModalStack.field_U.field_bb = var14;
          UrlAndReplyHelpers.field_c = new SceneWidget(0L, (SceneWidget) null);
          UrlAndReplyHelpers.field_c.field_I = PopupMenuSupport.buildSolidFrameSprites(3, -1, 1856141, 206, 1127256, 13574);
          PatchNoteUsage.field_o = new SceneWidget(0L, (SceneWidget) null);
          PatchNoteUsage.field_o.field_I = PopupMenuSupport.buildSolidFrameSprites(3, -1, 11579568, 290, 6052956, 13574);
          MenuInputState.field_j = new SceneWidget(0L, var15);
          MenuInputState.field_j.field_Kb = 1;
          MenuInputState.field_j.field_Qb = 1;
          MenuInputState.field_j.field_Z = 1;
          MenuInputState.field_j.field_ab = 1;
          MenuInputState.field_j.field_ob = 1;
          DialWidgetPainter.field_e = new SceneWidget(0L, MenuInputState.field_j);
          ContentTransitionDialog.field_wb = new SceneWidget(0L, ParticleEffect.field_K);
          ContentTransitionDialog.field_wb.field_Z = 1;
          ContentTransitionDialog.field_wb.field_Kb = 1;
          ContentTransitionDialog.field_wb.field_ob = 1;
          ContentTransitionDialog.field_wb.field_Qb = 1;
          ContentTransitionDialog.field_wb.field_ab = 1;
          ArchiveProvider.field_f = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          QuickChatCategoryCache.field_c = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          EmailValidationHelpers.field_c = new SceneWidget(0L, MenuInputState.field_j);
          NameAvailabilityValidator.field_o = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          ArchiveIndex.field_s = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          LoginDialog.field_Ab = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          ContentTransitionDialog.field_wb.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("smallbutton", "lobby", (byte) -39, param2));
          ContentTransitionDialog.field_wb.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("smallbutton_mouseover", "lobby", (byte) -72, param2));
          dupTemp$0 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("smallbutton_active", "lobby", (byte) -79, param2));
          ContentTransitionDialog.field_wb.field_bb = dupTemp$0;
          ContentTransitionDialog.field_wb.field_mb = dupTemp$0;
          ContentTransitionDialog.field_wb.field_H = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("smallbutton_disabled", "lobby", (byte) -95, param2));
          DialWidgetPainter.field_e.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("mediumbutton", "lobby", (byte) -84, param2));
          DialWidgetPainter.field_e.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("mediumbutton_mouseover", "lobby", (byte) -30, param2));
          DialWidgetPainter.field_e.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("mediumbutton_mouseheld", "lobby", (byte) -92, param2));
          MenuInputState.field_j.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("bigbutton", "lobby", (byte) -68, param2));
          MenuInputState.field_j.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("bigbutton_mouseover", "lobby", (byte) -23, param2));
          MenuInputState.field_j.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("bigbutton_mouseheld", "lobby", (byte) -66, param2));
          MenuInputState.field_j.field_H = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("bigbutton_disabled", "lobby", (byte) -71, param2));
          ArchiveProvider.field_f.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("greenbutton", "lobby", (byte) -84, param2));
          ArchiveProvider.field_f.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("greenbutton_mouseover", "lobby", (byte) -50, param2));
          ArchiveProvider.field_f.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("greenbutton_mouseheld", "lobby", (byte) -68, param2));
          QuickChatCategoryCache.field_c.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("redbutton", "lobby", (byte) -105, param2));
          QuickChatCategoryCache.field_c.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("redbutton_mouseover", "lobby", (byte) -24, param2));
          QuickChatCategoryCache.field_c.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("redbutton_mouseheld", "lobby", (byte) -99, param2));
          EmailValidationHelpers.field_c.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("backbutton", "lobby", (byte) -109, param2));
          EmailValidationHelpers.field_c.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("backbutton_mouseover", "lobby", (byte) -31, param2));
          EmailValidationHelpers.field_c.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("backbutton_mouseheld", "lobby", (byte) -62, param2));
          EmailValidationHelpers.field_c.field_H = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("backbutton_disabled", "lobby", (byte) -53, param2));
          LoginDialog.field_Ab.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("gameoptionbutton", "lobby", (byte) -58, param2));
          LoginDialog.field_Ab.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("gameoptionbutton_mouseover", "lobby", (byte) -53, param2));
          dupTemp$1 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("gameoptionbutton_active", "lobby", (byte) -52, param2));
          LoginDialog.field_Ab.field_bb = dupTemp$1;
          LoginDialog.field_Ab.field_mb = dupTemp$1;
          LoginDialog.field_Ab.field_H = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("gameoptionbutton_disabled", "lobby", (byte) -127, param2));
          NameAvailabilityValidator.field_o.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatbutton", "lobby", (byte) -110, param2));
          NameAvailabilityValidator.field_o.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatbutton_mouseover", "lobby", (byte) -42, param2));
          dupTemp$2 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatbutton_active", "lobby", (byte) -107, param2));
          NameAvailabilityValidator.field_o.field_bb = dupTemp$2;
          NameAvailabilityValidator.field_o.field_mb = dupTemp$2;
          ArchiveIndex.field_s.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatfilterbutton", "lobby", (byte) -101, param2));
          ArchiveIndex.field_s.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatfilterbutton_mouseover", "lobby", (byte) -61, param2));
          dupTemp$3 = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("chatfilterbutton_active", "lobby", (byte) -64, param2));
          ArchiveIndex.field_s.field_bb = dupTemp$3;
          ArchiveIndex.field_s.field_mb = dupTemp$3;
          var17 = StatSubmission.loadSpritesByName("checkbox", "lobby", (byte) -92, param2);
          QuickChatHelpDialog.field_Tb = new IconLabelControl(0L, var17[1], var17[0], 1, ParticleEffect.field_K, (String) null);
          HuffmanDecoder.field_d = new SceneWidget(0L, (SceneWidget) null);
          HuffmanDecoder.field_d.field_I = MusicPatchNode.createCentreOnlyFrame((byte) 26, PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "slideregion", param1));
          HuffmanDecoder.field_d.field_Ab = MusicPatchNode.createCentreOnlyFrame((byte) 26, PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "slideregion_mouseover", false));
          HuffmanDecoder.field_d.field_mb = MusicPatchNode.createCentreOnlyFrame((byte) 26, PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "slideregion_mouseheld", false));
          HuffmanDecoder.field_d.field_H = MusicPatchNode.createCentreOnlyFrame((byte) 26, PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "slideregion_disabled", false));
          TabbedPanel.field_Zb = new SceneWidget(0L, (SceneWidget) null);
          TabbedPanel.field_Zb.field_I = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("dragbar", "lobby", (byte) -108, param2));
          TabbedPanel.field_Zb.field_Ab = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("dragbar_mouseover", "lobby", (byte) -126, param2));
          TabbedPanel.field_Zb.field_mb = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("dragbar_mouseheld", "lobby", (byte) -78, param2));
          TabbedPanel.field_Zb.field_H = NameAvailabilityValidator.resetSpriteOffsets(0, StatSubmission.loadSpritesByName("dragbar_disabled", "lobby", (byte) -14, param2));
          LoginHandshakeHelpers.field_f = new SceneWidget(0L, (SceneWidget) null);
          LoginHandshakeHelpers.field_f.field_Pb = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "upbutton", param1);
          LoginHandshakeHelpers.field_f.field_db = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "upbutton_mouseover", false);
          LoginHandshakeHelpers.field_f.field_fb = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "upbutton_mouseheld", false);
          LoginHandshakeHelpers.field_f.field_Ob = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "upbutton_disabled", false);
          ResourceArchive.field_h = new SceneWidget(0L, (SceneWidget) null);
          ResourceArchive.field_h.field_Pb = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "downbutton", param1);
          ResourceArchive.field_h.field_db = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "downbutton_mouseover", false);
          ResourceArchive.field_h.field_fb = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "downbutton_mouseheld", false);
          ResourceArchive.field_h.field_Ob = PacketLoopHelpers.loadRgbSpriteByName(param2, "lobby", "downbutton_disabled", false);
          NodeHashTable.field_j = new VerticalScrollbar(0L, LoginHandshakeHelpers.field_f, ResourceArchive.field_h, HuffmanDecoder.field_d, TabbedPanel.field_Zb);
          NodeHashTableIterator.field_e = new SocialListPanel(0L, (SceneWidget) null, IntKeyLookup.field_h, NodeHashTable.field_j, ContentTransitionDialog.field_wb, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("oh.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void updatePageLinks(java.applet.Applet param0, byte param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = DirectByteStorage.appendSessionParameters(0, var4, param0).getFile();
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"gamelist", var3 + "togamelist.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              if (param1 <= 115) {
                field_a = (ResourceArchive) null;
              }
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"terms", var3 + "terms.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("oh.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 34, 4, -1, -1};
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_d = "Buying or selling an account";
        field_c = "Owner";
        field_g = "Please check if address is correct";
        field_f = 0;
    }
}
