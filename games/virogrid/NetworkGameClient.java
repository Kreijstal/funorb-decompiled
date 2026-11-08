/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    private int field_r;
    static String[] field_n;
    String field_v;
    private int field_w;
    static String field_t;
    static int[] field_m;
    static String field_l;
    private int field_o;
    private boolean field_q;
    private int field_p;
    private long field_s;
    private int field_z;
    private boolean field_x;
    private boolean field_u;
    static SpriteWidget field_y;
    private int field_k;

    final void initializeFramework(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        int var10 = -93 / ((2 - param7) / 60);
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        FullscreenState.field_c = this.field_o;
        StripedProgressBar.selectLanguageStrings((byte) -53, FullscreenState.field_c);
        FrameSkin.initializeConnectionState(FullscreenState.field_c, 5000, this.field_p, this.field_s, MusicPlaybackHelpers.field_c, this.field_x, 64, param6, 5000, this.field_r, param0, this.field_v, this.field_w, this.field_z);
        DisplayModeInfo.initializeArchiveServices(this.field_p, MusicPlaybackHelpers.field_c, this.field_z, param0, this.field_v, FullscreenState.field_c, 86, this.field_r, this.field_w);
        LobbyAndTextHelpers.initializeKeyCodeMap(42);
        DiskCacheWorker.field_d = InputSetupHelpers.createMouseWheelHandler((byte) -110);
        ChatSettingsHelpers.detachInputListeners(UiWidget.field_v, (byte) -128);
        CheckboxTickPainter.field_a = param1;
        AccountRequestReply.field_c = param2;
        PendingRequest.field_j = param5;
        LabeledChildWidget.field_P = param3;
        ProxyAuthenticationRequiredException.field_h = param4;
        this.initializePacketLengths((byte) 116);
        FadeLayer.clearFeatureFlags(20128);
    }

    private final void enableChatResponses(int param0) {
        UsernameAvailabilityValidator.field_r[13] = true;
        UsernameAvailabilityValidator.field_r[param0] = true;
        UsernameAvailabilityValidator.field_r[11] = true;
    }

    private final void handleSessionCookiePacket(int param0) {
        if (param0 > -10) {
          return;
        }
        String var2 = LinkTextPainter.readIncomingString(-47);
        DualLinkDeque.setSessionCookie(var2, ContentTransitionDialog.getApplet((byte) 24), -1);
    }

    private final int processAccountMenu(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          PacketBuffer var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = Virogrid.field_F ? 1 : 0;
          var4 = TextFieldPainter.pollLoginDialogResult(FullscreenState.field_c, BoundedUrlRequest.field_b, false, param1);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = HuffmanCodec.pollLoginRequest(LogoAndLoginHelpers.createLoginIdentifierValue(-30890), WidgetLayerStack.createLoginUsernameField(true), 27984);
            if (-1 != var5) {
              DateOfBirthValidator.handleAccountRequestResult(GameKeyHandler.field_g, var5, GameOptions.field_b, 100);
              GameOptions.field_b = null;
              GameKeyHandler.field_g = null;
            }
            var12 = UiWidget.takePendingLoginFlag(true);
            if (var12 != null) {
              StrongCacheReference.completeLoginCheck(0, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = GameKeyHandler.submitAccountCreation((byte) 2, DelegatingCanvas.getEnteredAge(true), AccountChoicePanel.getAccountCreationOptIn(-127), StatusAndUrlHelpers.getStatusMessage((byte) -52), Js5Archive.getActiveLoginIdentifier(86), DualLinkDequeIterator.getActiveLoginIdentifier(8), this.field_k);
            if (-1 != var5Lifetime1) {
              LobbySessionHelpers.handleRegistrationReply(var5Lifetime1, 105, GameOptions.field_b, GameKeyHandler.field_g);
              GameOptions.field_b = null;
              GameKeyHandler.field_g = null;
            }
          }
          if (var4 == 3) {
            if (BufferedFile.field_o != -1 &&
              0 != BufferedFile.field_o) {
              BufferedFile.field_o = -1;
              SpriteState.resetConnectionState(true);
            }
            if (!param2) {
              var5Lifetime2 = MusicVoiceMixer.performLogin(DualLinkDequeIterator.getActiveLoginIdentifier(8), false, this.field_k, (byte) -57, this.field_u, StatusAndUrlHelpers.getStatusMessage((byte) -52));
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 != 0) {
                  PasswordFieldPainter.handleLoginResult(GameKeyHandler.field_g, var5Lifetime2, false);
                  GameKeyHandler.field_g = null;
                } else {
                  CheckboxTickPainter.field_d = IntKeyLookup.field_a;
                  PatchNoteUsage.handleLoginSuccess(-2);
                  NodeHashTableIterator.field_l = 10;
                  MenuScreen.field_d = false;
                }
              }
            } else {
              TextLayoutLine.field_f = false;
            }
          }
          if (4 == var4) {
            if (!FrameSkin.field_c) {
              NodeHashTableIterator.field_l = 10;
              MenuScreen.field_d = true;
            } else {
              ChatFilterHelpers.logoutAndReload(5, ContentTransitionDialog.getApplet((byte) -86));
            }
          }
          if (5 == var4) {
            Js5ArchiveManager.openQuitPage((byte) 39, ContentTransitionDialog.getApplet((byte) -117));
          }
          if (var4 == 6 &&
            LobbySortHelpers.field_h) {
            NodeHashTableIterator.field_l = 10;
          }
          if (var4 == 7) {
            DialogMessagePane.openServerList(true, ContentTransitionDialog.getApplet((byte) 79));
          }
          var5Lifetime3 = -46 / ((param0 + 49) / 63);
          if (var4 == 8) {
            ChatFilterHelpers.logoutAndReload(5, ContentTransitionDialog.getApplet((byte) 48));
          }
          if (var4 == 9) {
            CachedArchiveSource.openSupportPage(ContentTransitionDialog.getApplet((byte) -107), 0);
          }
          if (var4 == 10) {
            IterableNodeHashTable.field_g.writeCipheredOpcode(17, 8);
          }
          if (var4 == 11) {
            ResizableDialog.reloadPage(-11670, ContentTransitionDialog.getApplet((byte) -103));
          }
          if (12 == var4) {
            LobbyGameListHelpers.openRelativePage(LobbySortHelpers.getPendingResultMessage(-1), -17713, ContentTransitionDialog.getApplet((byte) 8));
          }
          if (var4 == 13) {
            try {
              if (ArchiveRequest.field_p == null) {
                ArchiveRequest.field_p = new BoundedUrlRequest(MusicPlaybackHelpers.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ArchiveRequest.field_p.poll(5038)) {
                var7 = ArchiveRequest.field_p.getResponse(18240);
                if (var7 == null) {
                  var10 = (String) null;
                  EmailAvailabilityValidator.discardServerMessage((byte) 92, (String) null);
                } else {
                  var8 = TextDecodeHelpers.decodeWindowsCodePageText(var7.position, (byte) -122, 0, var7.payload);
                  EmailAvailabilityValidator.discardServerMessage((byte) 78, var8);
                }
                ArchiveRequest.field_p = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              IconLabelWidget.reportClientError("S1", (Throwable) ((Object) var6), 1);
              var11 = (String) null;
              EmailAvailabilityValidator.discardServerMessage((byte) -114, (String) null);
              ArchiveRequest.field_p = null;
            }
          }
          if (var4 == 15) {
            NodeHashTableIterator.field_l = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 != 17) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void readAppletParameters(int param0, int param1, String param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.isHostAllowed((byte) 99)) {
              return;
            }
            this.field_v = this.getCodeBase().getHost();
            var6 = this.field_v.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_u = stackIn_8_1;
            this.field_w = Integer.parseInt(this.getParameter("gameport1"));
            this.field_z = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_r = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_x = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_k = Integer.parseInt(var9);
            }
            if (param1 != 0) {
              return;
            }
            ViewportController.field_i = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletShell(62, param0, param4, 32, this.field_p, param3, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            IconLabelWidget.reportClientError((String) null, (Throwable) ((Object) var6_ref), 1);
            this.redirectToErrorPage(-25296, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("od.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int pollReconnect(int param0) {
        int var2;
        if (this.field_i) {
          return -1;
        }
        if (!MusicCrossfadeStream.isLobbyReady((byte) -107)) {
          return -1;
        }
        if (param0 < 19) {
          field_t = (String) null;
        }
        if (TextLayoutLine.field_f) {
          return -1;
        }
        var2 = MusicVoiceMixer.performLogin(DualLinkDequeIterator.getActiveLoginIdentifier(8), true, this.field_k, (byte) -57, this.field_u, StatusAndUrlHelpers.getStatusMessage((byte) -52));
        if (-1 == var2) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!PendingScoreQuery.field_l) {
            this.redirectToErrorPage(-25296, "reconnect");
          }
          EmailValidator.beginReconnect((byte) -105);
          PasswordFieldPainter.handleLoginResult(GameKeyHandler.field_g, var2, false);
          TextLayoutLine.field_f = true;
          ClockAndTextHelpers.field_a = ClockAndTextHelpers.monotonicMillis(-9986) + 15000L;
          return var2;
        }
        if (11 == NodeHashTableIterator.field_l &&
          BufferedFile.field_o == 0) {
          PatchNoteUsage.handleLoginSuccess(-2);
        }
        return var2;
    }

    private final void initializePacketLengths(byte param0) {
        PacketBuffer.field_i[7] = -1;
        PacketBuffer.field_i[4] = -1;
        PacketBuffer.field_i[16] = -1;
        PacketBuffer.field_i[8] = -2;
        PacketBuffer.field_i[2] = -2;
        PacketBuffer.field_i[12] = -1;
        PacketBuffer.field_i[9] = -1;
        PacketBuffer.field_i[5] = -1;
        PacketBuffer.field_i[13] = -1;
        if (param0 <= 75) {
          this.serviceFramework(false, -38);
        }
        PacketBuffer.field_i[18] = 1;
        PacketBuffer.field_i[6] = -2;
        PacketBuffer.field_i[3] = -1;
        PacketBuffer.field_i[17] = -1;
        PacketBuffer.field_i[10] = -1;
        PacketBuffer.field_i[11] = -1;
        PacketBuffer.field_i[1] = 16;
    }

    private final void enableScoreResponses(int param0) {
        UsernameAvailabilityValidator.field_r[2] = true;
        if (param0 != 25745) {
          field_t = (String) null;
        }
    }

    final void initializeApplet(String param0, int param1, byte param2) {
        try {
          this.readAppletParameters(480, 0, param0, param1, 640);
          if (param2 < 99) {
            field_t = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "od.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int pollReconnectAndResend(int param0) {
        int var2;
        var2 = this.pollReconnect(80);
        if (var2 == param0 ||
          1 == var2) {
          if (UsernameAvailabilityValidator.field_r[1]) {
            DebouncedValidator.resendPendingRequests(2, 12);
          }
          if (UsernameAvailabilityValidator.field_r[2]) {
            RequestResendSupport.resendQueuedRequests(3, (byte) 109);
          }
          if (UsernameAvailabilityValidator.field_r[3]) {
            RenderTargetHelpers.resendQueuedListRequests(4, param0 - 11513);
          }
          if (UsernameAvailabilityValidator.field_r[4]) {
            PlayerContextMenu.resendPendingRequests(2, 5);
          }
          if (UsernameAvailabilityValidator.field_r[5]) {
            StatusAndUrlHelpers.resendAchievementMessages((byte) 19, 6);
          }
          if (UsernameAvailabilityValidator.field_r[6]) {
            UsernameSuggestionPanel.resendQueuedRequests((byte) -52, 7);
          }
          if (UsernameAvailabilityValidator.field_r[8]) {
            LinkTextPainter.resetReflectionCheckQueue(param0 ^ -128);
          }
        }
        return var2;
    }

    private final void enableSavedDataResponses(int param0) {
        if (param0 <= 110) {
          return;
        }
        UsernameAvailabilityValidator.field_r[5] = true;
    }

    final void serviceFramework(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        String stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        boolean stackIn_111_2 = false;
        int stackIn_140_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Virogrid.field_F ? 1 : 0;
        if (AgeValidator.field_q != null) {
          if (null == FullscreenState.field_b) {
            var6 = ReflectionCheck.getTopContainer(0);
            var4 = var6.getSize();
            AgeValidator.field_q.setDesiredSize(var4.width, var4.height, (byte) -107);
          }
          AgeValidator.field_q.updateViewport(-7927);
        }
        QuickChatPhraseDefinition.updateKeyboardState((byte) 112);
        LoadingProgressDialog.snapshotMouseInput((byte) -47);
        if (!NodeHashTableIterator.shouldShowBootstrapLoadingScreen(-1) &&
          NodeHashTableIterator.field_l != 11) {
          UiLayerInputHelpers.processUiLayerInput((byte) -119);
        }
        if (null != DiskCacheWorker.field_d) {
          BoundedUrlRequest.field_b = DiskCacheWorker.field_d.pollRotation(-23273);
        }
        if (AudioSetupHelpers.isConnectedToLobby((byte) -70)) {
          var3 = 1200 * ByteStorage.getFramesPerSecond((byte) 5);
          if (this.field_q ||
            !(CheckboxPainter.getKeyIdleTicks(-28791807) <= var3) &&
            !(SpriteWidget.getIdleTicks(-87) <= var3)) {
            this.field_q = false;
            MenuInputState.closeGameConnection(false);
            EmailValidator.beginReconnect((byte) -50);
            PasswordFieldPainter.handleLoginResult(WidgetLayerStack.field_H, 2, false);
            StatSubmission.evaluateGuardResidue(-76);
            TextLayoutLine.field_f = true;
            ClockAndTextHelpers.field_a = 15000L + ClockAndTextHelpers.monotonicMillis(-9986);
          }
        }
        if (-1 == BufferedFile.field_o ||
          BufferedFile.field_o == 0) {
          stackIn_24_0 = (BufferedFile.field_o != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          BufferedFile.field_o = CellAnimator.pollArchiveLoading(true);
          if (var3Lifetime1 != 0 &&
            BufferedFile.field_o == 0 &&
            NodeHashTableIterator.field_l == 11 &&
            !MusicCrossfadeStream.isLobbyReady((byte) -81)) {
            PatchNoteUsage.handleLoginSuccess(-2);
          }
          if (BufferedFile.field_o != -1 &&
            0 != BufferedFile.field_o) {
            ClockAndTextHelpers.field_a = 15000L + ClockAndTextHelpers.monotonicMillis(-9986);
          }
        }
        if (param1 < 32) {
          this.field_w = 59;
        }
        if (BufferedFile.field_o != -1 &&
          BufferedFile.field_o != 0) {
          if (10 > PlayerContextMenu.field_n) {
            if (BufferedFile.field_o != 3) {
              if (BufferedFile.field_o != 4) {
                if (BufferedFile.field_o == 2) {
                  this.redirectToErrorPage(-25296, "js5connect_full");
                } else {
                  if (BufferedFile.field_o == 5) {
                    this.redirectToErrorPage(-25296, "outofdate");
                  } else {
                    this.redirectToErrorPage(-25296, "js5connect");
                  }
                }
              } else {
                this.redirectToErrorPage(-25296, "js5io");
              }
            } else {
              this.redirectToErrorPage(-25296, "js5crc");
            }
          } else {
            if (NodeHashTableIterator.field_l >= 10) {
              EmailValidator.beginReconnect((byte) 90);
              if (BufferedFile.field_o != 3) {
                if (4 == BufferedFile.field_o) {
                  PasswordFieldPainter.handleLoginResult(MidiPcmStream.field_v, 256, false);
                } else {
                  if (2 == BufferedFile.field_o) {
                    PasswordFieldPainter.handleLoginResult(MarkerSlider.field_L, 256, false);
                  } else {
                    if (BufferedFile.field_o != 5) {
                      PasswordFieldPainter.handleLoginResult(ViewportController.field_b, 256, false);
                    } else {
                      PasswordFieldPainter.handleLoginResult(CachedTextLayout.field_g, 5, false);
                    }
                  }
                }
              } else {
                PasswordFieldPainter.handleLoginResult(ArchiveIndex.field_k, 256, false);
              }
              TextLayoutLine.field_f = true;
            }
          }
        }
        if ((-1 != BufferedFile.field_o &&
          BufferedFile.field_o != 0 ||
          MusicCrossfadeStream.isLobbyReady((byte) -79)) &&
          ClockAndTextHelpers.field_a <= ClockAndTextHelpers.monotonicMillis(-9986)) {
          TextLayoutLine.field_f = false;
          if (BufferedFile.field_o != -1 &&
            0 != BufferedFile.field_o) {
            BufferedFile.field_o = -1;
            SpriteState.resetConnectionState(true);
          }
        }
        if (0 == BufferedFile.field_o &&
          !MusicCrossfadeStream.isLobbyReady((byte) -82)) {
          NodeHashTableIterator.field_g = false;
        }
        if (PlayerContextMenu.field_n == 0 &&
          ContextMenu.loadMasterIndex(-20940)) {
          PlayerContextMenu.field_n = 1;
        }
        if (PlayerContextMenu.field_n == 1) {
          if (0 != FullscreenState.field_c) {
            ArchiveIndex.field_l = IntrusiveDeque.createArchive(76, LabeledChildWidget.field_P);
          }
          CanvasPresentHelpers.field_a = MusicPatchEnvelope.createArchive(false, 1, true, PendingRequest.field_j, (byte) 70);
          GameOptions.field_j = MusicPatchEnvelope.createArchive(false, 1, true, ProxyAuthenticationRequiredException.field_h, (byte) 81);
          DialWidget.field_I = MusicPatchEnvelope.createArchive(false, 1, true, CheckboxTickPainter.field_a, (byte) 82);
          InputSetupHelpers.field_a = GameOptions.field_j;
          PlayerContextMenu.field_n = 2;
          AccountDialogHelpers.field_c = CanvasPresentHelpers.field_a;
        }
        if (PlayerContextMenu.field_n == 2) {
          if (ArchiveIndex.field_l != null &&
            ArchiveIndex.field_l.ensureIndexLoaded(0)) {
            if (!ArchiveIndex.field_l.hasGroupName("", true)) {
              ArchiveIndex.field_l = null;
            } else {
              if (ArchiveIndex.field_l.ensureGroupAvailableByName((byte) -102, "")) {
                LobbyAndTextHelpers.loadTextTable(-1, ArchiveIndex.field_l);
                ArchiveIndex.field_l = null;
                DiskCacheWorker.resetFrameTimingHistory(-122);
              }
            }
          }
          if (null == ArchiveIndex.field_l) {
            PlayerContextMenu.field_n = 3;
          }
        }
        if (PlayerContextMenu.field_n == 3 &&
          NodeHashTable.areCommonUiArchivesReady((byte) 127, GameOptions.field_j, CanvasPresentHelpers.field_a, DialWidget.field_I) &&
          MidiPcmStream.areAllGroupsAvailable((byte) 110, DialWidget.field_I)) {
          PasswordConfirmationValidator.releaseConfirmationStatics((byte) 45);
          ArchiveProvider.emptyStaticHook(14);
          StatusAndUrlHelpers.field_g = LoginCredentialType.field_e;
          LobbySortHelpers.field_h = false;
          GameOptions.initializeAccountUi(FrameSkin.field_c, GameOptions.field_j, CanvasPresentHelpers.field_a, DialWidget.field_I, -1);
          if (AccountCreationSupport.field_b ||
            QuickChatPhraseRegistry.field_j != null) {
            stackIn_107_0 = QuickChatPhraseRegistry.field_j;
            stackIn_108_1 = !(AccountCreationSupport.field_b);
            stackIn_111_2 = !(AccountCreationSupport.field_b);
            DebouncedValidator.openLoginDialog(stackIn_107_0, stackIn_108_1, stackIn_111_2, true);
          }
          if (ViewportController.field_i) {
            BitCountAndDialogHelpers.openAccountMessageDialog(-26700);
          }
          if (TooltipAndOptionsHelpers.field_a == null) {
            TooltipAndOptionsHelpers.field_a = GameClock.getSoundEffectMixer(-94);
            CanvasPresentHelpers.field_f = MathAndCookieHelpers.getAudioBufferMillis((byte) 88);
          }
          LogoIntroHelpers.prepareLogoAnimation(false, TooltipAndOptionsHelpers.field_a, DialWidget.field_I, CanvasPresentHelpers.field_f);
          CanvasPresentHelpers.field_a = null;
          GameOptions.field_j = null;
          DialWidget.field_I = null;
          StatefulWidgetPainter.readUsernameParameter((java.applet.Applet) (this), 17574);
          DiskCacheWorker.resetFrameTimingHistory(-78);
          PlayerContextMenu.field_n = 10;
        }
        if (10 == PlayerContextMenu.field_n) {
          if (FullscreenState.field_c != 0) {
            ConditionalTextValue.field_e = IntrusiveDeque.createArchive(34, AccountRequestReply.field_c);
          }
          PlayerContextMenu.field_n = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (PlayerContextMenu.field_n == 11) {
          if (null != ConditionalTextValue.field_e && (!ConditionalTextValue.field_e.ensureIndexLoaded(0) ||
            !ConditionalTextValue.field_e.areAllGroupsAvailable(25867))) {
            DateOfBirthValidator.setLoadingProgress(Bzip2State.formatLoadingProgress(ConditionalTextValue.field_e, GzipDecompressor.field_b, (byte) -90, QuickChatHelpHelpers.field_d), 13, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            MidiPcmStream.field_w = true;
            PlayerContextMenu.field_n = 12;
          }
        }
        if (PlayerContextMenu.field_n == 12 &&
          !MidiPcmStream.field_w) {
          PlayerContextMenu.field_n = 13;
        }
        if (13 == PlayerContextMenu.field_n) {
          var3Lifetime2 = 1;
          if (LobbyAndTextHelpers.field_c != null) {
            stackIn_140_0 = (!LobbyAndTextHelpers.field_c.pollLoading(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_140_0;
            DateOfBirthValidator.setLoadingProgress(LobbyAndTextHelpers.field_c.field_j, 13, LobbyAndTextHelpers.field_c.field_a);
          }
          if (var3Lifetime2 != 0) {
            PlayerContextMenu.field_n = 20;
          }
        }
        if (!param0 &&
          SpriteWidget.field_Db) {
          AccountCreationSupport.attachCanvasInput((byte) -116, UiWidget.field_v);
          this.recreateCanvas(21616);
          ChatSettingsHelpers.detachInputListeners(UiWidget.field_v, (byte) -124);
        }
        if (UsernameAvailabilityValidator.field_r[8]) {
          MusicPatch.sendReflectionCheckReplies(-1);
        }
    }

    private final void enableRankingResponses(byte param0) {
        if (param0 <= 59) {
          field_m = (int[]) null;
        }
        UsernameAvailabilityValidator.field_r[6] = true;
    }

    final static void pumpPlatformEvents(PlatformTaskDispatcher param0, Object param1, byte param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (null == param0.field_w) {
            return;
          }
          var3_int = 0;
          if (param2 > -95) {
            field_t = (String) null;
          }
          while (var3_int < 50) {
            if (null != param0.field_w.peekEvent()) {
              IsaacRandom.sleepMillis(-118, 1L);
              var3_int++;
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param0.field_w.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("od.HA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void enableArchiveKeyResponses(int param0) {
        if (param0 <= 97) {
          return;
        }
        UsernameAvailabilityValidator.field_r[1] = true;
    }

    final static void setInterfaceColours(int param0, int param1, boolean param2, int param3) {
        QueuedRequest.field_k = param0;
        if (param2) {
          Object var5 = (Object) null;
          NetworkGameClient.pumpPlatformEvents((PlatformTaskDispatcher) null, (Object) null, (byte) -5);
        }
        DialogMessagePane.field_I = param3;
        HelpPopup.field_Hb = param1;
    }

    private final void enableProgressResponses(byte param0) {
        if (param0 != 12) {
          this.enableArchiveKeyResponses(-69);
        }
        UsernameAvailabilityValidator.field_r[4] = true;
    }

    final void updateLoginFlow(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != 1) {
          NetworkGameClient.setInterfaceColours(36, 8, true, 93);
        }
        if (MouseInputHandler.isPostLoginStage(param0 ^ 102)) {
          stackIn_11_1 = 30;
          stackIn_12_2 = (null != FullscreenState.field_b);
          discarded$4 = this.processAccountMenu(stackIn_11_1, stackIn_12_2, false);
        } else {
          if (PlayerContextMenu.field_n >= 10) {
            if (PopupMenuHelpers.isIntroAnimationFinished(2)) {
              if (NodeHashTableIterator.field_l != 0) {
                BirthDateInputWidget.updateLoginUi(BoundedUrlRequest.field_b, 45);
              } else {
                discarded$5 = this.processAccountMenu(-118, false, false);
              }
            } else {
              GuestPlayHelpers.advanceIntroClock(true);
            }
          }
        }
    }

    private final void handleOpenUrlPacket(int param0) {
        int var2 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 != -6731) {
          this.field_w = 83;
        }
        int var4 = ArchiveProvider.field_a - 1;
        byte[] var5 = new byte[var4];
        ProgressMessageDialog.field_qb.readCipheredBytes(-121, 0, var5, var4);
        Js5Archive.openExternalUrl(MidiPcmStream.decodeText(param0 + 4709, var5), ContentTransitionDialog.getApplet((byte) -95), (byte) -25, var3 != 0);
    }

    final int runAccountMenu(boolean param0, int param1) {
        int var3 = -78 / ((param1 + 20) / 63);
        return this.processAccountMenu(-114, param0, true);
    }

    final void dispatchServerPacket(int param0) {
        boolean stackIn_28_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = PasswordConfirmationValidator.field_q;
        if (var2 < 64 &&
          UsernameAvailabilityValidator.field_r[var2]) {
          if (param0 >= -100) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 == 3) {
                StateToken.readAchievementResponse((byte) 97);
              } else {
                if (var2 != 4) {
                  if (var2 == 5) {
                    CellFlip.readSubmissionAcknowledgement(26360);
                  } else {
                    if (var2 == 6) {
                      PlayingSound.handleRankingsResponse(-1);
                    } else {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (16 == var2) {
                            ContentTransitionDialog.readLocalPlayerName((byte) 115);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                TextLayoutLine.handleSocialListResponse((byte) 126);
                                return;
                              }
                              if (var2 == 17) {
                                this.handleOpenUrlPacket(-6731);
                                return;
                              }
                              if (18 == var2) {
                                LobbyGame.applyChatRestrictionPacket(-532);
                                return;
                              }
                              IconLabelWidget.reportClientError("MGS1: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
                              MenuInputState.closeGameConnection(false);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = BufferedSocket.readChatMessage(stackIn_28_0, 0);
                            CommonUiHelpers.acceptChatMessage(var3, (byte) 78);
                          }
                        } else {
                          NodeHashTable.readReflectionCheckRequest(84, ArchiveProvider.field_a, MusicPlaybackHelpers.field_c, ProgressMessageDialog.field_qb);
                        }
                      } else {
                        this.handleSessionCookiePacket(-50);
                      }
                    }
                  }
                } else {
                  DiskCacheWorker.readQueuedListResponse((byte) -61);
                }
              }
            } else {
              SpriteWidget.handleRankingResponse((byte) 76);
            }
          } else {
            BufferedSocket.skipPendingRequestReply(-2);
          }
          return;
        }
        IconLabelWidget.reportClientError("MGS2: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
        MenuInputState.closeGameConnection(false);
    }

    public static void releaseStatics(boolean param0) {
        field_t = null;
        if (param0) {
          return;
        }
        field_m = null;
        field_l = null;
        field_n = null;
        field_y = null;
    }

    final static String reverseString(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = param0; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param1.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("od.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void enableBaseResponses(boolean param0, int param1) {
        int discarded$0 = 0;
        UsernameAvailabilityValidator.field_r[3] = true;
        UsernameAvailabilityValidator.field_r[0] = true;
        UsernameAvailabilityValidator.field_r[8] = param0;
        UsernameAvailabilityValidator.field_r[18] = true;
        UsernameAvailabilityValidator.field_r[7] = true;
        UsernameAvailabilityValidator.field_r[17] = true;
        if (param1 < 31) {
          discarded$0 = this.processAccountMenu(-36, true, true);
        }
        UsernameAvailabilityValidator.field_r[16] = true;
    }

    final void configureResponseHandlers(boolean param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.enableBaseResponses(true, 53);
        if (param2 >= -115) {
          this.field_p = 9;
        }
        if (param0) {
          this.enableArchiveKeyResponses(102);
        }
        if (param6) {
          this.enableScoreResponses(25745);
        }
        if (param5) {
          this.enableProgressResponses((byte) 12);
        }
        if (param4) {
          this.enableSavedDataResponses(116);
        }
        if (param1) {
          this.enableRankingResponses((byte) 113);
        }
        if (param3) {
          this.enableChatResponses(12);
        }
    }

    protected NetworkGameClient() {
    }

    static {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_t = "This entry doesn't match";
        field_m = new int[4];
        field_l = null;
    }
}
