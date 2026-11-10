/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitStateEvent extends GameEvent {
    private int field_n;
    private int field_i;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_u;
    static int field_r;
    static Sprite field_l;
    static IntrusiveDeque field_j;
    static TextValidationFailure field_t;
    static PacketBuffer field_k;
    private int field_v;
    static QuickChatCommandType field_o;
    static long field_s;

    final void removeFromQueue(byte param0) {
        super.removeFromQueue((byte) -111);
        if (param0 >= -47) {
          UnitStateEvent.validateNameText(true, -39, (CharSequence) null);
        }
        RankingsScreen.field_n.addFirst((IntrusiveNode) (this), false);
    }

    final static boolean containsFilterText(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == LevelFileList.field_f) {
            return false;
          }
          if (param0 > -69) {
            field_t = (TextValidationFailure) null;
          }
          stackIn_8_0 = !(param1.toLowerCase().indexOf(LevelFileList.field_f.toLowerCase()) < 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("so.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        field_j = null;
        field_t = null;
        field_k = null;
        field_o = null;
        int var1 = -125 / ((param0 + 13) / 41);
    }

    final static void attachMouseInput(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(ValidatedTextInputWidget.field_Z);
          int var2_int = 51 % ((param1 - 75) / 47);
          param0.addMouseMotionListener(ValidatedTextInputWidget.field_Z);
          param0.addFocusListener(ValidatedTextInputWidget.field_Z);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "so.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void initializeUiStringTables(int param0) {
        if (null != PlayingSound.field_g) {
          return;
        }
        FlaggedTextValue.field_b = new String[4];
        FlaggedTextValue.field_b[2] = DateInputWidget.field_K;
        FlaggedTextValue.field_b[3] = DelayedPacket.field_h;
        FlaggedTextValue.field_b[0] = Camera.field_b;
        PlayingSound.field_g = new String[51];
        FlaggedTextValue.field_b[1] = SupportPageHelpers.field_a;
        PlayingSound.field_g[4] = ScrollPaneWithFooter.field_Lb;
        PlayingSound.field_g[14] = FightEvent.field_p;
        PlayingSound.field_g[21] = MusicPatchLoadHelpers.field_d;
        PlayingSound.field_g[1] = DraggableWidget.field_K;
        PlayingSound.field_g[12] = ScrollPaneWithFooter.field_Fb;
        PlayingSound.field_g[16] = FriendListHelpers.field_s;
        PlayingSound.field_g[18] = LevelFileList.field_h;
        PlayingSound.field_g[13] = DialogLayer.field_K;
        PlayingSound.field_g[6] = UiComponentNode.field_t;
        PlayingSound.field_g[0] = Waypoint.field_f;
        PlayingSound.field_g[19] = TranslatedUiText.field_b;
        PlayingSound.field_g[5] = UiComponentNode.field_t;
        PlayingSound.field_g[15] = PowerupEvent.field_n;
        PlayingSound.field_g[45] = ZombieDawnMulti.field_F;
        PlayingSound.field_g[20] = StatusAndMeshHelpers.field_g;
        PlayingSound.field_g[3] = ScoreUpdateEvent.field_l;
        PlayingSound.field_g[17] = NetworkGameClient.field_r;
        PlayingSound.field_g[11] = PendingIntArrayReply.field_i;
        PlayingSound.field_g[7] = TextPopupHelpers.field_d;
        PlayingSound.field_g[2] = MusicPatchLoadHelpers.field_b;
        PlayingSound.field_g[36] = WhirlpoolHasher.field_i;
        PlayingSound.field_g[39] = "Shouldn't See Me";
        PlayingSound.field_g[35] = DualLinkDeque.field_a;
        PlayingSound.field_g[49] = QueuedListRequest.field_j[1];
        PlayingSound.field_g[50] = FadingDialog.field_L;
        PlayingSound.field_g[48] = QueuedListRequest.field_j[0];
        PlayingSound.field_g[40] = HuffmanCodec.field_c;
        PlayingSound.field_g[46] = ClickMarker.field_m;
        PlayingSound.field_g[41] = LoginCredentials.field_l;
        PlayingSound.field_g[38] = UiWidget.field_m;
        PlayingSound.field_g[42] = PendingIntArrayRequest.field_j;
        PlayingSound.field_g[47] = MenuFrameHelpers.field_d[0];
        PlayingSound.field_g[37] = TerrainEffectZone.field_g[0];
        AccountServerResult.field_f = new String[63];
        PlayingSound.field_g[44] = RankingsRequest.field_f;
        PlayingSound.field_g[43] = CookieHelpers.field_a;
        PlayingSound.field_g[34] = LobbyGameListHelpers.field_a[0];
        AccountServerResult.field_f[46] = PlayingSound.field_i;
        AccountServerResult.field_f[53] = EffectAudioHelpers.field_c;
        AccountServerResult.field_f[54] = ViewportController.field_t;
        AccountServerResult.field_f[47] = ZombieDrop.field_S;
        AccountServerResult.field_f[48] = SleepAndNameHelpers.field_b;
        AccountServerResult.field_f[52] = PulseEffect.field_i;
        AccountServerResult.field_f[0] = SimEntity.field_F;
        MenuStyleHelpers.field_g = new String[63][2];
        AccountServerResult.field_f[11] = LevelFileCatalog.field_e;
        AccountServerResult.field_f[45] = AudioStartupHelpers.field_d;
        AccountServerResult.field_f[3] = TransitionPhase.field_b;
        AccountServerResult.field_f[55] = AlternateUsernameCredentials.field_s;
        AccountServerResult.field_f[50] = MusicCrossfadeStream.field_n;
        AccountServerResult.field_f[16] = DisplayNamePanel.field_L;
        AccountServerResult.field_f[15] = SharedTransportGlobals.field_c;
        AccountServerResult.field_f[12] = TextHotspot.field_m;
        AccountServerResult.field_f[5] = MarkerSliderPainter.field_j;
        AccountServerResult.field_f[14] = FullscreenErrorDialog.field_jb;
        AccountServerResult.field_f[38] = LoginCredentials.field_b;
        AccountServerResult.field_f[51] = PopupMenuBuilder.field_e;
        AccountServerResult.field_f[34] = LoginCredentials.field_i;
        AccountServerResult.field_f[18] = QuickChatCategoryDefinition.field_u;
        AccountServerResult.field_f[59] = TextInputValidator.field_o;
        AccountServerResult.field_f[7] = ScrollPaneWithFooter.field_Mb;
        AccountServerResult.field_f[60] = FlaggedTextValue.field_c;
        AccountServerResult.field_f[49] = PlayModeChoiceDialog.field_O;
        AccountServerResult.field_f[2] = EmailAvailabilityValidator.field_t;
        AccountServerResult.field_f[4] = ResourceArchive.field_d;
        AccountServerResult.field_f[9] = IterableNodeHashTable.field_b;
        AccountServerResult.field_f[32] = ZombieDawnMulti.field_M;
        AccountServerResult.field_f[58] = SoundCache.field_j;
        AccountServerResult.field_f[8] = UiComponent.field_B;
        AccountServerResult.field_f[35] = SoundStopHelpers.field_c;
        AccountServerResult.field_f[56] = FullscreenSupport.field_c;
        AccountServerResult.field_f[10] = SimArmedHuman.field_Eb;
        AccountServerResult.field_f[61] = ArchiveRequest.field_w;
        AccountServerResult.field_f[17] = PacketBuffer.field_h;
        AccountServerResult.field_f[37] = FadingDialog.field_G;
        AccountServerResult.field_f[36] = RankingsScreen.field_l;
        AccountServerResult.field_f[13] = ConditionalTextValue.field_a;
        AccountServerResult.field_f[44] = LoginStartHelpers.field_e;
        AccountServerResult.field_f[57] = MatchingTextValidator.field_r;
        AccountServerResult.field_f[1] = PlayerProfile.field_b;
        AccountServerResult.field_f[6] = AntialiasedFontHelpers.field_a;
        AccountServerResult.field_f[33] = QuitPageHelpers.field_b;
        MenuStyleHelpers.field_g[0][0] = ContainerUnpackHelpers.field_a;
        MenuStyleHelpers.field_g[1][0] = FeatureSupportHelpers.field_a;
        MenuStyleHelpers.field_g[2][0] = AlphaChildWidget.field_F;
        MenuStyleHelpers.field_g[3][0] = SimHuman.field_jb;
        MenuStyleHelpers.field_g[4][0] = TextPopupHelpers.field_e;
        MenuStyleHelpers.field_g[5][0] = ChatMessage.field_c;
        MenuStyleHelpers.field_g[6][0] = PopupMenuBuilder.field_i;
        MenuStyleHelpers.field_g[7][0] = StatusAndMeshHelpers.field_d;
        MenuStyleHelpers.field_g[8][0] = SimPortal.field_P;
        MenuStyleHelpers.field_g[9][0] = SoundCache.field_c;
        MenuStyleHelpers.field_g[10][0] = ClientException.field_j;
        MenuStyleHelpers.field_g[11][0] = AudioServiceHelpers.field_a;
        MenuStyleHelpers.field_g[12][0] = QuickChatHelpDialog.field_Kb;
        MenuStyleHelpers.field_g[13][0] = SecondaryNodeDeque.field_f;
        MenuStyleHelpers.field_g[14][0] = TextInputValidator.field_n;
        MenuStyleHelpers.field_g[15][0] = LinkButtonPainter.field_c;
        MenuStyleHelpers.field_g[16][0] = DetonationTarget.field_h;
        MenuStyleHelpers.field_g[17][0] = DelayedPacket.field_i;
        MenuStyleHelpers.field_g[18][0] = UnitView.field_Z;
        MenuStyleHelpers.field_g[61][0] = RankingsScreen.field_o;
        MenuStyleHelpers.field_g[60][0] = ZombieDrop.field_P;
        MenuStyleHelpers.field_g[59][0] = TextWidgetPainter.field_k;
        MenuStyleHelpers.field_g[58][0] = MusicPatch.field_i;
        MenuStyleHelpers.field_g[57][0] = TextHotspot.field_p;
        MenuStyleHelpers.field_g[56][0] = BirthDateInputWidget.field_V;
        MenuStyleHelpers.field_g[55][0] = PortalView.field_F;
        MenuStyleHelpers.field_g[54][0] = FadingDialog.field_O;
        MenuStyleHelpers.field_g[53][0] = PasswordValidator.field_u;
        MenuStyleHelpers.field_g[52][0] = DelayedPacket.field_m;
        MenuStyleHelpers.field_g[51][0] = ZombieDetonation.field_f;
        MenuStyleHelpers.field_g[50][0] = SocketConnector.field_d;
        MenuStyleHelpers.field_g[49][0] = ContextMenu.field_Sb;
        MenuStyleHelpers.field_g[48][0] = MoveOrderMarker.field_d;
        MenuStyleHelpers.field_g[47][0] = CachedArchiveSource.field_u;
        MenuStyleHelpers.field_g[46][0] = SimHuman.field_ob;
        MenuStyleHelpers.field_g[45][0] = SoundCache.field_m;
        MenuStyleHelpers.field_g[44][0] = FrameCycleAnimation.field_b;
        MenuStyleHelpers.field_g[32][0] = LoginCredentials.field_j;
        MenuStyleHelpers.field_g[33][0] = ResizableDialog.field_U;
        MenuStyleHelpers.field_g[34][0] = ReportAbuseDialog.field_Ob;
        MenuStyleHelpers.field_g[35][0] = DefaultQuickChatContext.field_c;
        MenuStyleHelpers.field_g[36][0] = EmailLoginCredentials.field_s;
        MenuStyleHelpers.field_g[37][0] = MoveOrderMarker.field_c;
        MenuStyleHelpers.field_g[38][0] = InflaterDecompressor.field_g;
        MenuStyleHelpers.field_g[0][1] = UiComponent.field_db;
        MenuStyleHelpers.field_g[1][1] = PortalEntryEvent.field_j;
        MenuStyleHelpers.field_g[2][1] = UiWidget.field_t;
        MenuStyleHelpers.field_g[3][1] = VerticalScrollbar.field_Nb;
        MenuStyleHelpers.field_g[4][1] = DetonationTarget.field_n;
        MenuStyleHelpers.field_g[5][1] = ClockAndScreenHelpers.field_d;
        MenuStyleHelpers.field_g[6][1] = BitPackedArrayHelpers.field_e;
        MenuStyleHelpers.field_g[7][1] = SimUnit.field_bb;
        MenuStyleHelpers.field_g[8][1] = TertiaryLinkDeque.field_d;
        MenuStyleHelpers.field_g[9][1] = SimZombie.field_ib;
        MenuStyleHelpers.field_g[10][1] = KeyboardListenerHelpers.field_c;
        MenuStyleHelpers.field_g[11][1] = PendingRankingRequest.field_j;
        MenuStyleHelpers.field_g[12][1] = FlaggedTextValue.field_d;
        MenuStyleHelpers.field_g[13][1] = MiasmaPuff.field_n;
        MenuStyleHelpers.field_g[14][1] = AccountCreationHelpers.field_d;
        MenuStyleHelpers.field_g[15][1] = UsernameCredentials.field_o;
        MenuStyleHelpers.field_g[16][1] = ArrayWidgetGroup.field_D;
        MenuStyleHelpers.field_g[17][1] = NavigationGrid.field_e;
        MenuStyleHelpers.field_g[18][1] = SpriteAlphaBuffers.field_a;
        MenuStyleHelpers.field_g[61][1] = ClickMarker.field_q;
        MenuStyleHelpers.field_g[60][1] = StatSubmissionHelpers.field_b;
        MenuStyleHelpers.field_g[59][1] = KeyMapHelpers.field_f;
        MenuStyleHelpers.field_g[58][1] = ViewportController.field_i;
        MenuStyleHelpers.field_g[57][1] = UsernameAvailabilityValidator.field_u;
        MenuStyleHelpers.field_g[56][1] = ArchiveLoadSequence.field_a;
        MenuStyleHelpers.field_g[55][1] = ResourceArchive.field_c;
        if (param0 != -6445) {
          UnitStateEvent.releaseStatics(-95);
        }
        MenuStyleHelpers.field_g[54][1] = ResourceArchive.field_h;
        MenuStyleHelpers.field_g[53][1] = PendingStatusRequest.field_g;
        MenuStyleHelpers.field_g[52][1] = SoundEffectInstance.field_j;
        MenuStyleHelpers.field_g[51][1] = PowerupCommand.field_l;
        MenuStyleHelpers.field_g[50][1] = DefaultQuickChatContext.field_b;
        MenuStyleHelpers.field_g[49][1] = PowerupButton.field_g;
        MenuStyleHelpers.field_g[48][1] = BirthDateEntryPanel.field_O;
        MenuStyleHelpers.field_g[47][1] = ResourceArchive.field_i;
        MenuStyleHelpers.field_g[46][1] = AccountCreationForm.field_X;
        MenuStyleHelpers.field_g[45][1] = ClientProtocolStage.field_d;
        MenuStyleHelpers.field_g[44][1] = TertiaryLinkNode.field_q;
        MenuStyleHelpers.field_g[32][1] = UiWidget.field_o;
        MenuStyleHelpers.field_g[33][1] = WhirlpoolHasher.field_g;
        MenuStyleHelpers.field_g[34][1] = RankingsRequest.field_q;
        MenuStyleHelpers.field_g[35][1] = MenuStyleHelpers.field_e;
        MenuStyleHelpers.field_g[36][1] = UrlLaunchHelpers.field_b;
        MenuStyleHelpers.field_g[37][1] = PowerupProgressCard.field_r;
        MenuStyleHelpers.field_g[38][1] = UiTheme.field_q;
    }

    final static String validateNameText(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = QuickChatHelpDialog.validatePlayerNameFormat(param0, -107, param2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = 61 / ((param1 - 14) / 63);
          var5 = 0;
          do {
            if (param2.length() <= var5) {
              return null;
            }
            if (!ByteArrayPool.isNameCharacter(-82, param2.charAt(var5))) {
              stackIn_11_0 = ClickMarkerParticle.field_i;
              return stackIn_11_0;
            }
            var5++;
          } while (var6 == 0);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("so.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void sendPlayerIdCommand(int param0, long param1, int param2) {
        CipherPacketBuffer var4 = TextValidationFailure.field_a;
        var4.writeCipheredOpcode((byte) -35, param2);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        if (param0 != -21148) {
          return;
        }
        var4.writeByte(param0 + 21034, 6);
        var4.writeLong(param1, true);
        var4.backpatchByteLength(44, var4.position - var5);
    }

    final static void updateGameRoomPanel(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        UiComponent stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_88_0 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_151_0 = 0;
        UiComponent stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        boolean stackIn_177_2 = false;
        UiComponent stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        boolean stackIn_182_2 = false;
        UiComponent stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        boolean stackIn_187_2 = false;
        Object stackIn_188_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_80_0;
        boolean stackOut_134_0;
        RuntimeException var5 = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        UiComponent var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        IntrusiveDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        LobbyPlayer var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        UiComponent var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        UiComponent var26 = null;
        int stackIn_56_0Lifetime1;
        int stackIn_56_1Lifetime1;
        int stackIn_65_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          MouseWheelInput.layoutLobbySlidePanels(InflaterDecompressor.field_a, false);
          if (null != JaggrabDownloader.field_c) {
            ChatPromptHelpers.field_b.field_Z = true;
            ChatPanelSetupHelpers.field_b.field_z = 0;
            var22 = ChatPanelSetupHelpers.field_b;
            var26 = var22;
            var26.field_zb = 0;
            var6 = GameKeyHandler.field_a;
            GameKeyHandler.field_a.field_z = 0;
            var6.field_zb = 0;
            PopupMenuBuilder.field_B.field_z = 0;
            var7 = PopupMenuBuilder.field_B;
            var7.field_zb = 0;
            if (LobbyStateHelpers.isLocalPlayerGameHost(0)) {
              ArchiveLoadStep.field_m.field_wb = ClientException.field_l.toUpperCase();
              var9 = (2 + LevelData.field_a.field_zb) / 2;
              ChatPanelSetupHelpers.field_b.setBounds(40, LevelData.field_a.field_z - 40, var9 - 2, 0, -3344);
              if (JaggrabDownloader.field_c.field_mc > JaggrabDownloader.field_c.field_cc) {
                ChatPanelSetupHelpers.field_b.field_wb = ObjectFactoryHelpers.field_c.toUpperCase();
                ChatPanelSetupHelpers.field_b.field_Z = true;
                if (var19 != 0) {
                  ChatPanelSetupHelpers.field_b.field_wb = ChatMessage.field_p.toUpperCase();
                  ChatPanelSetupHelpers.field_b.field_Z = false;
                }
              } else {
                ChatPanelSetupHelpers.field_b.field_wb = ChatMessage.field_p.toUpperCase();
                ChatPanelSetupHelpers.field_b.field_Z = false;
              }
              ChatPanelSetupHelpers.field_b.field_ab = LinkButtonPainter.field_i.field_ab;
              if (PowerupProgressCard.field_i > 0) {
                boolean decompiledSharedTail2 = (PowerupProgressCard.field_i != 1);
                if (!decompiledSharedTail2) {
                  var10_ref_String = PendingIntArrayRequest.field_k;
                  decompiledSharedTail2 = (var19 != 0);
                }
                if (decompiledSharedTail2) {
                  var10_ref_String = QueuedListRequest.substituteTemplateArguments(ValidationIconWidget.field_R, new String[]{Integer.toString(PowerupProgressCard.field_i)}, 2);
                }
                ChatPanelSetupHelpers.field_b.field_wb = ChatPanelSetupHelpers.field_b.field_wb + "<br>" + var10_ref_String;
                if ((PowerupCommand.field_i & 16) == 0 &&
                  !WeightedLruCache.field_b) {
                  ChatPanelSetupHelpers.field_b.field_ab = LinkButtonPainter.field_i.field_X;
                }
              }
              GameKeyHandler.field_a.setBounds(40, -40 + LevelData.field_a.field_z, LevelData.field_a.field_zb - var9, var9, -3344);
              GameKeyHandler.field_a.field_wb = Waypoint.field_f.toUpperCase();
              var8 = GameKeyHandler.field_a;
              stackIn_20_0 = GameKeyHandler.field_a;
              stackIn_21_1 = (param3) && (0L == LoginPacketHelpers.field_c);
              stackIn_20_0.field_Z = stackIn_21_1;
              var10 = 2;
              if (TutorialAndMenuHelpers.field_b != null) {
                if (null == GameSimulation.field_v) {
                  GameSimulation.field_v = new byte[FriendListHelpers.field_h];
                  FullscreenFocusCanvas.field_c = new boolean[FriendListHelpers.field_h];
                }
                var11 = 0;
                do {
                  if (!(var11 < FriendListHelpers.field_h)) {
                    var10 = 0;
                    break;
                  }
                  FullscreenFocusCanvas.field_c[var11] = false;
                  var11++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_71_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_71_0;
                    while (true) {
                      stackIn_35_0 = TutorialAndMenuHelpers.field_b.length;
                      stackIn_35_1 = var12;
                      if (stackIn_35_0 > stackIn_35_1) {
                        var25 = TutorialAndMenuHelpers.field_b[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_65_0 = 0;
                        var14 = stackIn_65_0;
                        scanLoop2: while (true) {
                          if (var14 < var25.length) {
                            var15 = var25[var14];
                            var16 = var20[var14 + 1];
                            stackIn_56_0 = var15;
                            stackIn_56_1 = -1;
                            if (stackIn_56_0 == stackIn_56_1) {
                              if (var10 == 0) {
                                stackIn_44_0 = JaggrabDownloader.field_c.field_mc;
                              } else {
                                stackIn_44_0 = JaggrabDownloader.field_c.field_cc;
                              }
                              var17_int = stackIn_44_0;
                              if (var17_int != var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            } else {
                              if (~(JaggrabDownloader.field_c.field_Zb[var15] & 255) != ~var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_56_0Lifetime1 = ~var25.length;
                            stackIn_56_1Lifetime1 = ~var15;
                            if (stackIn_56_0Lifetime1 >= stackIn_56_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_35_0 = var16;
                            stackIn_35_1 = var14;
                            if (stackIn_35_0 > stackIn_35_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          FullscreenFocusCanvas.field_c[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_65_0Lifetime1 = var11;
                    if (stackIn_65_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_71_0 = FriendListHelpers.field_q;
                  break;
                }
                if (stackIn_71_0 >= 2 &&
                  PulseEffect.field_m[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                GameKeyHandler.field_a.field_Z = false;
                decompiledFrameRemainder0 = !(!GameKeyHandler.field_a.field_pb);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (FriendListHelpers.field_h > var13) {
                      stackOut_80_0 = FullscreenFocusCanvas.field_c[var13];
                      stackIn_88_0 = stackOut_80_0 ? 1 : 0;
                      stackIn_81_0 = stackOut_80_0;
                      if (var19 == 0) {
                        if (stackIn_81_0) {
                          var24 = "<col=A00000>" + UiWidget.field_f[var13] + "</col>";
                          if (var11_ref != null) {
                            var12 = 1;
                            var11_ref = (String) (var11_ref) + ", " + var24;
                          } else {
                            var11_ref = var24;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_88_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_88_0 == ~var10) {
                    var13_ref_String = DiskCacheWorker.field_d;
                    boolean decompiledSharedTail1 = (var12 == 0);
                    if (!decompiledSharedTail1) {
                      var14_ref_String = NetworkGameClient.field_n + (String) (var11_ref);
                      decompiledSharedTail1 = (var19 != 0);
                    }
                    if (decompiledSharedTail1) {
                      var14_ref_String = QueuedListRequest.substituteTemplateArguments(MenuStyleHelpers.field_f, new String[]{(String) (var11_ref)}, 2);
                    }
                  } else {
                    var13_ref_String = LobbyUiSetupHelpers.field_e;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = ClickMarker.field_k + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = QueuedListRequest.substituteTemplateArguments(LoginStartHelpers.field_d, new String[]{(String) (var11_ref)}, param0 - 48);
                    }
                  }
                  MeltdownPuddleCell.field_j = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != IntrusiveDequeCursor.field_g ||
                DropTargetWidget.field_G != null ||
                MusicPatchLoadHelpers.field_c != null ||
                AlphaChildWidget.field_J != null)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                while (FriendListHelpers.field_h > var16) {
                  var17_int = 255 & JaggrabDownloader.field_c.field_Zb[var16];
                  stackIn_188_0 = null;
                  if (var19 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_188_0 != IntrusiveDequeCursor.field_g &&
                    IntrusiveDequeCursor.field_g[var16] != null &&
                    IntrusiveDequeCursor.field_g[var16][var17_int]) {
                    var11 = 1;
                  }
                  if (null != DropTargetWidget.field_G &&
                    DropTargetWidget.field_G[var16] != null) {
                    var18_int = DropTargetWidget.field_G[var16][var17_int];
                    if (var18_int > var13Lifetime1) {
                      var13Lifetime1 = var18_int;
                    }
                    if (var18_int != 0 &&
                      !LoginMethod.field_e) {
                      var11 = 1;
                    }
                  }
                  if (AlphaChildWidget.field_J != null &&
                    AlphaChildWidget.field_J[var16] != null) {
                    var15 = var15 | AlphaChildWidget.field_J[var16][var17_int];
                  }
                  if (null != MusicPatchLoadHelpers.field_c &&
                    MusicPatchLoadHelpers.field_c[var16] != null) {
                    var18_intLifetime1 = MusicPatchLoadHelpers.field_c[var16][var17_int];
                    if (var18_intLifetime1 != 0 &&
                      !LoginMethod.field_e) {
                      var11 = 1;
                    }
                    if (var14 < var18_intLifetime1) {
                      var14 = var18_intLifetime1;
                    }
                  }
                  var16++;
                }
                if (decompiledFrameCompleted0) {
                  var16 = 0;
                  var17 = MeltdownPuddle.field_n.field_Gb.field_Cb;
                  var18_ref = (LobbyPlayer) (var17.last(81));
                  while (true) {
                    boolean decompiledFrameRemainder1 = true;
                    boolean decompiledFrameRemainder2 = true;
                    if (var18_ref != null) {
                      stackOut_134_0 = var18_ref.isUnindexed((byte) 15);
                      stackIn_151_0 = stackOut_134_0 ? 1 : 0;
                      stackIn_135_0 = stackOut_134_0;
                      decompiledFrameRemainder1 = (var19 == 0);
                      if (decompiledFrameRemainder1) {
                        if (!stackIn_135_0) {
                          if (var11 != 0 &&
                            !var18_ref.field_Nb) {
                            var16 = 1;
                            decompiledFrameRemainder2 = false;
                          }
                          else {
                            if (var13Lifetime1 > var18_ref.field_Mb) {
                              var16 = 1;
                              decompiledFrameRemainder2 = false;
                            }
                            else {
                              if (var14 > var18_ref.field_Sb) {
                                var16 = 1;
                                decompiledFrameRemainder2 = false;
                              }
                              else {
                                if ((~var18_ref.field_Vb & var15) > 0) {
                                  var16 = 1;
                                  decompiledFrameRemainder2 = false;
                                }
                                else {
                                  if (var12 != 0) {
                                    var16 = 1;
                                    decompiledFrameRemainder2 = false;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder2) {
                          var18_ref = (LobbyPlayer) (var17.previous(6));
                          continue;
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      stackIn_151_0 = ~FriendListHelpers.field_q;
                    }
                    if (stackIn_151_0 <= -3 &&
                      PulseEffect.field_m[12]) {
                      var16 = 0;
                    }
                    if (var16 == 0) {
                      break;
                    }
                    GameKeyHandler.field_a.field_Z = false;
                    if (!GameKeyHandler.field_a.field_pb) {
                      break;
                    }
                    if (BirthDateInputWidget.field_U.field_c.field_Kb != 0) {
                      MeltdownPuddleCell.field_j = QueuedListRequest.substituteTemplateArguments(FullscreenSupport.field_b, new String[]{RasterBuffer.field_d}, 2);
                      if (var19 == 0) {
                        break;
                      }
                    }
                    MeltdownPuddleCell.field_j = ChatMessage.field_s;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var19 != 0)) {
                var9_ref_String = JaggrabDownloader.field_c.field_Nb;
                ArchiveLoadStep.field_m.field_wb = QueuedListRequest.substituteTemplateArguments(GameEvent.field_g, new String[]{var9_ref_String}, 2).toUpperCase();
                PopupMenuBuilder.field_B.setBounds(40, LevelData.field_a.field_z - 40, LevelData.field_a.field_zb, 0, -3344);
                PopupMenuBuilder.field_B.field_wb = QueuedListRequest.substituteTemplateArguments(TextLayout.field_a, new String[]{var9_ref_String}, 2);
                var8 = PopupMenuBuilder.field_B;
              }
            } else {
              var9_ref_String = JaggrabDownloader.field_c.field_Nb;
              ArchiveLoadStep.field_m.field_wb = QueuedListRequest.substituteTemplateArguments(GameEvent.field_g, new String[]{var9_ref_String}, 2).toUpperCase();
              PopupMenuBuilder.field_B.setBounds(40, LevelData.field_a.field_z - 40, LevelData.field_a.field_zb, 0, -3344);
              PopupMenuBuilder.field_B.field_wb = QueuedListRequest.substituteTemplateArguments(TextLayout.field_a, new String[]{var9_ref_String}, 2);
              var8 = PopupMenuBuilder.field_B;
            }
            if (decompiledFrameCompleted0) {
              if (LoginPacketHelpers.field_c != 0L) {
                var9 = (int)(-ClockAndScreenHelpers.monotonicMillis((byte) 97) + LoginPacketHelpers.field_c);
                var9 = (var9 + 999) / 1000;
                if (var9 < 1) {
                  var9 = 1;
                }
                var8.field_wb = QueuedListRequest.substituteTemplateArguments(SimZombie.field_pb, new String[]{Integer.toString(var9)}, param0 ^ 48);
              }
              ClientException.field_h.field_wb = QueuedListRequest.substituteTemplateArguments(EffectAudioHelpers.field_g, new String[]{Integer.toString(JaggrabDownloader.field_c.field_cc), Integer.toString(JaggrabDownloader.field_c.field_mc)}, 2);
            }
          }
          if (decompiledFrameCompleted0) {
            if (param0 != 50) {
              field_t = (TextValidationFailure) null;
            }
            stackIn_176_0 = JaggrabDownloader.field_i;
            stackIn_176_1 = -11838;
            stackIn_177_2 = (param1) && (!param2) && (!WeightedLruCache.field_b);
            ((UiComponent) (Object) stackIn_176_0).updateRoot(stackIn_176_1, stackIn_177_2);
            stackIn_181_0 = LevelData.field_a;
            stackIn_181_1 = -11838;
            stackIn_182_2 = (param1) && (!param2) && (!WeightedLruCache.field_b);
            ((UiComponent) (Object) stackIn_181_0).updateRoot(stackIn_181_1, stackIn_182_2);
            stackIn_186_0 = TextPopupHelpers.field_b;
            stackIn_186_1 = -11838;
            stackIn_187_2 = (param1) && (!param2) && (WeightedLruCache.field_b);
            ((UiComponent) (Object) stackIn_186_0).updateRoot(stackIn_186_1, stackIn_187_2);
            BirthDateInputWidget.field_U.field_c.processTabPresses(-40);
            stackIn_188_0 = null;
          }
          if (stackIn_188_0 != JaggrabDownloader.field_c) {
            if (ChatPromptHelpers.field_b.field_T != 0) {
              SocialListRow.sendPlayerActionRequest(JaggrabDownloader.field_c.getGameId(6), param4, -76);
            }
            if (0 != ChatPanelSetupHelpers.field_b.field_T) {
              WeightedLruCache.field_b = true;
            }
            if (0 != GameKeyHandler.field_a.field_T) {
              UiWidget.field_r = true;
            }
            if (ViewFactoryHelpers.field_a.field_T != 0) {
              WeightedLruCache.field_b = false;
            }
            QuickChatMenu.updateGameOptionControls(JaggrabDownloader.field_c, false, param4, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "so.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean isReflectionCheckReady(int param0) {
        ReflectionCheckRequest var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ReflectionCheckRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4 = (ReflectionCheckRequest) (PlayingSound.field_k.last(74));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2 < var1.field_n)))) {
            if (var3 == 0) {
              if (var4.field_m[var2] != null &&
                0 == var4.field_m[var2].field_f) {
                return false;
              }
              if (var4.field_l[var2] != null &&
                var4.field_l[var2].field_f == 0) {
                return false;
              }
              var2++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 != 1)) {
            field_k = (PacketBuffer) null;
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "so.P(" + param0 + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (this.field_p == 1) {
          return;
        }
        EffectAudioHelpers.field_e.drawLeft(Integer.toString(this.field_f - param3), this.field_q >> -param2 + 16, this.field_u >> 16 - param0, 4, -1);
        EffectAudioHelpers.field_e.drawLeft(Integer.toString(-param3 + this.field_f), -param2 + this.field_i, -param0 + this.field_m, 0, -1);
        if (!param1) {
          field_k = (PacketBuffer) null;
        }
        SoftwareRasterizer.drawThickLine(this.field_q >> 16 - param2, this.field_u >> 16 - param0, this.field_i - param2, -param0 + this.field_m, 16711680, 10);
    }

    final static void blendHalfSpan(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (param3 >= 0) {
              var9 = param0;
              var5 = var9;
              var6 = param2;
              var7 = param4;
              var9[var6] = var7 + ScrollPane.bitAnd(8355711, var9[var6] >> 1);
              param2++;
              if (var8 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (!param1) {
            field_k = (PacketBuffer) null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("so.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void apply(int param0, GameScreen param1) {
        try {
          param1.applyUnitState(this.field_v, this.field_q, false, this.field_m, this.field_n, this.field_u, this.field_p, this.field_i);
          if (param0 != 0) {
            UnitStateEvent.containsFilterText(-46, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "so.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void initialize(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        if (param7) {
          this.removeFromQueue((byte) 113);
        }
        super.setTick(0, param2);
        this.field_p = param8;
        this.field_n = param3;
        this.field_v = param0;
        this.field_q = param1;
        this.field_u = param4;
        this.field_m = param5;
        this.field_i = param6;
    }

    UnitStateEvent() {
    }

    static {
        field_j = new IntrusiveDeque();
        field_t = new TextValidationFailure();
        field_o = new QuickChatCommandType(2, 4, 4, 0);
    }
}
