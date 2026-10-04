/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SessionGameApplet extends GameApplet {
    private int field_x;
    private long field_k;
    private int field_r;
    static MusicScore spaceMusicTrack;
    private boolean field_t;
    private boolean field_v;
    String field_n;
    private boolean field_m;
    private int field_u;
    static String fullscreenText;
    private int field_w;
    private int field_l;
    private int field_s;
    static int field_p;

    private final int k(int param0) {
        int var2;
        if (this.field_a) {
          return -1;
        }
        if (!ClientTimingSupport.isClientReadyForSessionActions(75)) {
          return -1;
        }
        if (ArchiveLoadStep.field_e) {
          return -1;
        }
        var2 = LoginProtocolSupport.advanceLoginHandshake(true, ContextualRuntimeException.a(true), this.field_r, this.field_v, ClientFlowToken.getActiveLoginIdentifier(param0 + 1), 0);
        if (var2 == param0) {
          return -1;
        }
        if ((var2 != 0) &&
            (var2 != 1)) {
          if (!TextWidgetRenderer.field_k) {
            this.a((byte) 79, "reconnect");
          }
          ClientFlowState.requestSessionExit((byte) 103);
          TextInputValidator.a((byte) 124, var2, AudioService.field_a);
          ArchiveLoadStep.field_e = true;
          DisplayNamePanel.field_G = ClientClockSupport.correctedCurrentTimeMillis(-12520) + 15000L;
          return var2;
        }
        if (SpriteConstructionSupport.clientScreenStage != 11) {
          return var2;
        }
        if (DebouncedValidationProvider.archiveLoadStatus != 0) {
          return var2;
        }
        IterableNodeHashTable.b(param0 - 12617);
        return var2;
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -16 / ((param1 + 4) / 62);
          var3 = null;
          var5 = null;
          if ((null != NetworkArchiveRequest.settingsCookieValue) &&
              (!NetworkArchiveRequest.settingsCookieValue.equals(param2.getParameter("settings")))) {
            var3 = NetworkArchiveRequest.settingsCookieValue;
            var5 = var3;
            var5 = var3;
          }
          if ((ScorePopup.field_j != null) &&
              (!ScorePopup.field_j.equals(param2.getParameter("session")))) {
            var5 = ScorePopup.field_j;
          }
          stackIn_9_0 = ScoreSubmission.a((String) (var5), (String) (var3), param0, -1, true);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wf.KA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        MeshPrioritySupport.field_a = this.field_u;
        ClientOptionSupport.selectBootstrapLanguageText(true, MeshPrioritySupport.field_a);
        if (param0 == -70) {
            SessionBootstrapSupport.initializeSessionServices(this.field_s, this.field_k, 5000, param7, this.field_m, param5, MeshPrioritySupport.field_a, this.field_w, 5000, this.field_n, this.field_x, MenuScreen.platformTaskDispatcher, 64, this.field_l);
            TextInputValidator.initializeArchiveServices(param7, MeshPrioritySupport.field_a, this.field_l, this.field_x, -23949, MenuScreen.platformTaskDispatcher, this.field_n, this.field_s, this.field_w);
            StatefulWidgetRenderer.b(28);
            CachedTextLayout.mouseWheelInput = TextValidationFailure.createMouseWheelInput(param0 + 113);
            UsernameAvailabilityQuery.a(MessageDialog.gameCanvas, 57);
            TextLayoutLine.field_e = param2;
            DebouncedValidationProvider.field_c = param4;
            ArchiveRequest.field_r = param6;
            ClientTimingSupport.field_d = param3;
            TextWidgetSupport.field_a = param1;
            this.e(123);
            PacketBuffer.k((byte) -13);
            return;
        }
    }

    private final void f(int param0) {
        if (param0 != -11) {
            return;
        }
        String var2 = HotspotTextWidget.i(1000);
        MeshPrioritySupport.updateSessionCookie(var2, NodeHashTableIterator.c(111), param0 + 10);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, (byte) -91);
        if (!(!param3)) {
            this.f((byte) 32);
        }
        if (param2) {
            this.i(16072);
        }
        if (param4 > -87) {
            this.field_w = -34;
        }
        if (!(!param0)) {
            this.e((byte) -19);
        }
        if (param1) {
            this.d(true);
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.a(480, param1, param0, (byte) 81, param2);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "wf.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int d(byte param0) {
        int var2;
        java.applet.Applet var3;
        if (param0 != -67) {
          var3 = (java.applet.Applet) null;
          SessionGameApplet.a((java.net.URL) null, 48, (java.applet.Applet) null);
        }
        var2 = this.k(-1);
        if (!((var2 != 0) &&
            (1 != var2))) {
          if (OpacityWidget.field_G[1]) {
            ByteArrayBuffer.resendByteShortQueries(true, 2);
          }
          if (OpacityWidget.field_G[2]) {
            MatchScoringSupport.resendScoreAndHighscoreRequests(param0 ^ 76, 3);
          }
          if (OpacityWidget.field_G[3]) {
            AchievementProtocolSupport.resendAchievementMessages((byte) -125, 4);
          }
          if (OpacityWidget.field_G[4]) {
            ByteArrayPoolSupport.resendIntRecordRequests(5, 116);
          }
          if (OpacityWidget.field_G[5]) {
            TextTemplateDefinitionLoader.a(6, param0 + 21789);
          }
          if (OpacityWidget.field_G[6]) {
            SecondaryDeque.resendRankedListQueries(true, 7);
          }
          if (OpacityWidget.field_G[8]) {
            DialogLayer.g(-13912);
          }
        }
        return var2;
    }

    private final void a(boolean param0, byte param1) {
        OpacityWidget.field_G[18] = true;
        OpacityWidget.field_G[17] = true;
        OpacityWidget.field_G[8] = param0;
        OpacityWidget.field_G[0] = true;
        OpacityWidget.field_G[3] = true;
        if (param1 != -91) {
            this.e((byte) 55);
        }
        OpacityWidget.field_G[7] = true;
        OpacityWidget.field_G[16] = true;
    }

    private final void e(int param0) {
        ArchiveRequest.field_m[11] = -1;
        ArchiveRequest.field_m[3] = -1;
        ArchiveRequest.field_m[10] = -1;
        ArchiveRequest.field_m[17] = -1;
        ArchiveRequest.field_m[5] = -1;
        ArchiveRequest.field_m[16] = -1;
        ArchiveRequest.field_m[6] = -2;
        ArchiveRequest.field_m[1] = 16;
        ArchiveRequest.field_m[9] = -1;
        ArchiveRequest.field_m[13] = -1;
        int var2 = -13 / ((param0 - 56) / 60);
        ArchiveRequest.field_m[7] = -1;
        ArchiveRequest.field_m[2] = -2;
        ArchiveRequest.field_m[4] = -1;
        ArchiveRequest.field_m[8] = -2;
        ArchiveRequest.field_m[18] = 1;
        ArchiveRequest.field_m[12] = -1;
    }

    final void b(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        String stackIn_100_1 = null;
        boolean stackIn_101_2 = false;
        boolean stackIn_104_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        var5 = Geoblox.clientControlFlowFlag;
        if (null != FontLoadingSupport.field_d) {
          if (InstrumentPatch.field_n == null) {
            var6 = MultiHandleSliderRenderer.a(true);
            var4 = var6.getSize();
            FontLoadingSupport.field_d.setRequestedSize((byte) 126, var4.height, var4.width);
          }
          FontLoadingSupport.field_d.updateResize((byte) -126);
        }
        RankedListQuery.updateKeyboardStateForFrame(true);
        AccountCreationSupport.snapshotPointerInput((byte) -128);
        if ((!BootstrapUiSupport.shouldShowBootstrapLoadingScreen(255)) &&
            (SpriteConstructionSupport.clientScreenStage != 11)) {
          TextTemplateArgumentType.c(1);
        }
        if (null != CachedTextLayout.mouseWheelInput) {
          CachedTextLayout.wheelRotationSnapshot = CachedTextLayout.mouseWheelInput.drainWheelRotation(true);
        }
        if (InstrumentEnvelope.b(param1 ^ 19649)) {
          var3 = 1200 * ClientTimingSupport.getConfiguredUpdateRate(true);
          if ((!(!this.field_t) ||
              (!(~var3 <= ~IndexedSpriteState.a(-76)) &&
                !(var3 >= FullscreenSupport.getPointerIdleTicks(false))))) {
            this.field_t = false;
            Bzip2DecoderState.closeSessionSocket((byte) -115);
            ClientFlowState.requestSessionExit((byte) 81);
            TextInputValidator.a((byte) 124, 2, MessageDialogSupport.idleMessage20MinText);
            BootstrapUiSupport.clearAchievementsTextWhenGuardAllows(-113);
            ArchiveLoadStep.field_e = true;
            DisplayNamePanel.field_G = ClientClockSupport.correctedCurrentTimeMillis(-12520) + 15000L;
          }
        }
        if (!((DebouncedValidationProvider.archiveLoadStatus != -1) &&
              (DebouncedValidationProvider.archiveLoadStatus != 0))) {
          stackIn_24_0 = (-1 != DebouncedValidationProvider.archiveLoadStatus) ? 0 : 1;
          var3 = stackIn_24_0;
          DebouncedValidationProvider.archiveLoadStatus = DelayedIncomingPacket.tickArchiveLoading(15869);
          if ((var3 != 0) &&
              (DebouncedValidationProvider.archiveLoadStatus == 0) &&
              (11 == SpriteConstructionSupport.clientScreenStage) &&
              (!ClientTimingSupport.isClientReadyForSessionActions(73))) {
            IterableNodeHashTable.b(-12618);
          }
          if ((-1 != DebouncedValidationProvider.archiveLoadStatus) &&
              (DebouncedValidationProvider.archiveLoadStatus != 0)) {
            DisplayNamePanel.field_G = 15000L + ClientClockSupport.correctedCurrentTimeMillis(-12520);
          }
        }
        if ((DebouncedValidationProvider.archiveLoadStatus != -1) &&
            (DebouncedValidationProvider.archiveLoadStatus != 0)) {
          if (VisualPropertyOverrides.clientBootstrapStage >= 10) {
            if (SpriteConstructionSupport.clientScreenStage >= 10) {
              ClientFlowState.requestSessionExit((byte) 114);
              if (DebouncedValidationProvider.archiveLoadStatus != 3) {
                if (4 != DebouncedValidationProvider.archiveLoadStatus) {
                  if (2 == DebouncedValidationProvider.archiveLoadStatus) {
                    TextInputValidator.a((byte) 124, 256, DualLinkNode.js5ConnectFullErrorText);
                  } else {
                    if (DebouncedValidationProvider.archiveLoadStatus != 5) {
                      TextInputValidator.a((byte) 124, 256, SessionSnapshotSupport.js5ConnectErrorText);
                    } else {
                      TextInputValidator.a((byte) 124, 5, SocketConnector.loginGameUpdatedText);
                    }
                  }
                } else {
                  TextInputValidator.a((byte) 124, 256, DialWidget.js5IoErrorText);
                }
              } else {
                TextInputValidator.a((byte) 124, 256, LoginPanel.js5CrcErrorText);
              }
              ArchiveLoadStep.field_e = true;
            }
          } else {
            if (DebouncedValidationProvider.archiveLoadStatus != 3) {
              if (DebouncedValidationProvider.archiveLoadStatus != 4) {
                if (2 == DebouncedValidationProvider.archiveLoadStatus) {
                  this.a((byte) 79, "js5connect_full");
                } else {
                  if (DebouncedValidationProvider.archiveLoadStatus != 5) {
                    this.a((byte) 79, "js5connect");
                  } else {
                    this.a((byte) 79, "outofdate");
                  }
                }
              } else {
                this.a((byte) 79, "js5io");
              }
            } else {
              this.a((byte) 79, "js5crc");
            }
          }
        }
        if ((!((!((DebouncedValidationProvider.archiveLoadStatus != -1) &&
                (DebouncedValidationProvider.archiveLoadStatus != 0))) &&
              (!ClientTimingSupport.isClientReadyForSessionActions(param1 - 19585)))) &&
            (~DisplayNamePanel.field_G >= ~ClientClockSupport.correctedCurrentTimeMillis(param1 - 32180))) {
          ArchiveLoadStep.field_e = false;
          if ((-1 != DebouncedValidationProvider.archiveLoadStatus) &&
              (DebouncedValidationProvider.archiveLoadStatus != 0)) {
            DebouncedValidationProvider.archiveLoadStatus = -1;
            SocialListEntry.e(-21754);
          }
        }
        if ((DebouncedValidationProvider.archiveLoadStatus == 0) &&
            (!ClientTimingSupport.isClientReadyForSessionActions(93))) {
          SessionInstanceState.sessionExitRequested = false;
        }
        if ((VisualPropertyOverrides.clientBootstrapStage == 0) &&
            (AchievementQuery.ensureArchiveCatalogLoaded(108))) {
          VisualPropertyOverrides.clientBootstrapStage = 1;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 1) {
          if (MeshPrioritySupport.field_a != 0) {
            FadingDialog.field_J = SocketArchiveNetworkClient.createResourceArchive(TextLayoutLine.field_e, (byte) -62);
          }
          DirectByteStorage.field_h = DisplayModeInfo.a(DebouncedValidationProvider.field_c, (byte) -18, true, false, 1);
          AttachedEntityRenderer.field_c = DisplayModeInfo.a(ArchiveRequest.field_r, (byte) -124, true, false, 1);
          DialRenderer.field_n = DisplayModeInfo.a(ClientTimingSupport.field_d, (byte) -41, true, false, 1);
          SessionSnapshotSupport.basicUiGraphicsArchive = DirectByteStorage.field_h;
          VisualPropertyOverrides.clientBootstrapStage = 2;
          RankedListQuery.field_i = AttachedEntityRenderer.field_c;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 2) {
          if ((FadingDialog.field_J != null) &&
              (FadingDialog.field_J.ensureIndexLoaded(0))) {
            if (!FadingDialog.field_J.hasGroupName((byte) -116, "")) {
              FadingDialog.field_J = null;
            } else {
              if (FadingDialog.field_J.loadGroupByName("", (byte) -126)) {
                AccountWelcomePanel.loadInterfaceText((byte) 74, FadingDialog.field_J);
                FadingDialog.field_J = null;
                EntityContactSupport.resetFrameTimingHistory(-50);
              }
            }
          }
          if (null == FadingDialog.field_J) {
            VisualPropertyOverrides.clientBootstrapStage = 3;
          }
        }
        if ((3 == VisualPropertyOverrides.clientBootstrapStage) &&
            (DelayedIncomingPacket.a(DialRenderer.field_n, AttachedEntityRenderer.field_c, DirectByteStorage.field_h, -11652)) &&
            (DisplayModeInfo.a((byte) -127, DialRenderer.field_n))) {
          LoginUiSupport.releaseAwtLoadingFonts((byte) -105);
          ConnectionHeaderSupport.evaluateConnectionHeaderGuard((byte) 120);
          ByteArrayPoolSupport.field_e = ArchiveSource.loadingText;
          AccountEligibilitySupport.loginReturnAllowed = false;
          CacheReference.a((byte) 114, DialRenderer.field_n, FontLoadingSupport.memberAccountMode, AttachedEntityRenderer.field_c, DirectByteStorage.field_h);
          if (!((!LoginProtocolSupport.field_a) &&
              (SocketConnector.field_d == null))) {
            stackIn_100_0 = 2274;
            stackIn_100_1 = SocketConnector.field_d;
            if (LoginProtocolSupport.field_a) {
              stackIn_101_2 = false;
            } else {
              stackIn_101_2 = true;
            }
            if (LoginProtocolSupport.field_a) {
              stackIn_104_3 = false;
            } else {
              stackIn_104_3 = true;
            }
            TextTemplateDefinition.a(stackIn_100_0, stackIn_100_1, stackIn_101_2, stackIn_104_3);
          }
          if (AchievementSubmission.field_m) {
            ButtonWidget.e(83);
          }
          if (null == DelegatingCanvas.field_a) {
            DelegatingCanvas.field_a = LoginPayload.b((byte) 72);
            ValidatedTextInputWidget.field_R = GzipInflater.b(110);
          }
          LogoPreparationSupport.prepareLogoAnimation(DialRenderer.field_n, ValidatedTextInputWidget.field_R, 111, DelegatingCanvas.field_a);
          DialRenderer.field_n = null;
          AttachedEntityRenderer.field_c = null;
          DirectByteStorage.field_h = null;
          MeshMaterial.a((java.applet.Applet) (this), -82);
          EntityContactSupport.resetFrameTimingHistory(-69);
          VisualPropertyOverrides.clientBootstrapStage = 10;
        }
        if (10 == VisualPropertyOverrides.clientBootstrapStage) {
          if (MeshPrioritySupport.field_a != 0) {
            TextValidationSupport.field_b = SocketArchiveNetworkClient.createResourceArchive(TextWidgetSupport.field_a, (byte) -62);
          }
          VisualPropertyOverrides.clientBootstrapStage = 11;
        }
        L30: {
          if (VisualPropertyOverrides.clientBootstrapStage == 11) {
            if (null != TextValidationSupport.field_b) {
              if (!((TextValidationSupport.field_b.ensureIndexLoaded(0)) &&
                  (TextValidationSupport.field_b.loadAllGroups(true)))) {
                HighscoreNameEntry.a(WidgetSkinState.a(LoginProtocolSupport.field_c, 2147483647, CachedTextLayout.field_g, TextValidationSupport.field_b), -2, 0.0f);
                break L30;
              }
            }
            AgeValidator.field_k = true;
            VisualPropertyOverrides.clientBootstrapStage = 12;
          }
        }
        if (param1 != 19660) {
          return;
        }
        if ((VisualPropertyOverrides.clientBootstrapStage == 12) &&
            (!AgeValidator.field_k)) {
          VisualPropertyOverrides.clientBootstrapStage = 13;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 13) {
          var3 = 1;
          if (null != TextTemplateLookupSupport.bootstrapArchiveLoadSequence) {
            stackIn_135_0 = (!TextTemplateLookupSupport.bootstrapArchiveLoadSequence.pollLoaded(true)) ? 0 : 1;
            var3 = stackIn_135_0;
            HighscoreNameEntry.a(TextTemplateLookupSupport.bootstrapArchiveLoadSequence.statusText, -2, TextTemplateLookupSupport.bootstrapArchiveLoadSequence.scaledProgress);
          }
          if (var3 != 0) {
            VisualPropertyOverrides.clientBootstrapStage = 20;
          }
        }
        if ((!param0) &&
            (EntityMotionSupport.field_a)) {
          EntitySpawnSupport.detachCanvasInputListeners(-2, MessageDialog.gameCanvas);
          this.b(true);
          UsernameAvailabilityQuery.a(MessageDialog.gameCanvas, 57);
        }
        if (OpacityWidget.field_G[8]) {
          ArchiveNetworkClient.f(-102);
        }
    }

    final void h(int param0) {
        int discarded$55 = 0;
        int discarded$56 = 0;
        int var3;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        var3 = Geoblox.clientControlFlowFlag;
        if (!CacheReference.f(-31456)) {
          if (VisualPropertyOverrides.clientBootstrapStage >= 10) {
            if (!OpacityWidget.isLogoAnimationComplete(7426)) {
              ValidationIconWidget.advanceLogoAnimationTick((byte) 88);
            } else {
              if (SpriteConstructionSupport.clientScreenStage != 0) {
                ByteStorage.a(CachedTextLayout.wheelRotationSnapshot, (byte) -96);
              } else {
                discarded$55 = this.a(false, false, -1);
              }
            }
          }
        } else {
          stackIn_3_1 = false;
          if (InstrumentPatch.field_n == null) {
            stackIn_4_2 = false;
          } else {
            stackIn_4_2 = true;
          }
          discarded$56 = this.a(stackIn_3_1, stackIn_4_2, -1);
        }
        if (param0 < 104) {
          this.f(80);
        }
    }

    public static void g(int param0) {
        spaceMusicTrack = null;
        fullscreenText = null;
        if (param0 != 30344) {
            SessionGameApplet.createAchievementStateValues(-29);
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            Throwable decompiledCaughtException = null;
            int var4 = 0;
            int var5_int = 0;
            Exception var5 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            ByteArrayBuffer var12 = null;
            var8 = Geoblox.clientControlFlowFlag;
            var4 = ClientProtocolStage.a(MeshPrioritySupport.field_a, CachedTextLayout.wheelRotationSnapshot, param1, (byte) -117);
            if (param2 == ~var4) {
              throw new IllegalStateException();
            }
            if (var4 == 1) {
              var5_int = ByteArrayBuffer.a(AccountCreationForm.i(param2 ^ -26), LoginPanel.h((byte) -42), -121);
              if (var5_int != -1) {
                UsernameResponseSupport.handleUsernameResponse(var5_int, 6568, WidgetSkinState.field_i, AudioService.field_a);
                AudioService.field_a = null;
                WidgetSkinState.field_i = null;
              }
              var11 = HotspotTextWidget.a((byte) 111);
              if (var11 != null) {
                EmailAvailabilityValidator.a(param2 ^ 110, var11.booleanValue());
              }
            }
            if (var4 == 2) {
              var5_int = DiskCacheWorker.a((byte) -94, ContextualRuntimeException.a(true), CharacterReplacementSupport.getAccountAgeYears((byte) 81), this.field_r, UsernameSuggestionsPanel.f(100), ClientFlowToken.getActiveLoginIdentifier(0), DelayedPcmStream.a((byte) 27));
              if (var5_int != -1) {
                StrongCacheReference.a(AudioService.field_a, var5_int, (byte) 30, WidgetSkinState.field_i);
                AudioService.field_a = null;
                WidgetSkinState.field_i = null;
              }
            }
            if (var4 == 3) {
              if ((-1 != DebouncedValidationProvider.archiveLoadStatus) &&
                  (DebouncedValidationProvider.archiveLoadStatus != 0)) {
                DebouncedValidationProvider.archiveLoadStatus = -1;
                SocialListEntry.e(-21754);
              }
              if (!param0) {
                var5_int = LoginProtocolSupport.advanceLoginHandshake(false, ContextualRuntimeException.a(true), this.field_r, this.field_v, ClientFlowToken.getActiveLoginIdentifier(~param2), ~param2);
                if (var5_int != -1) {
                  if (var5_int == 0) {
                    CheckboxWidget.field_H = ClientClockSupport.field_c;
                    IterableNodeHashTable.b(-12618);
                    ProgressBarWidget.field_G = false;
                    SpriteConstructionSupport.clientScreenStage = 10;
                  } else {
                    TextInputValidator.a((byte) 124, var5_int, AudioService.field_a);
                    AudioService.field_a = null;
                  }
                }
              } else {
                ArchiveLoadStep.field_e = false;
              }
            }
            if (var4 == 4) {
              if (!FontLoadingSupport.memberAccountMode) {
                ProgressBarWidget.field_G = true;
                SpriteConstructionSupport.clientScreenStage = 10;
              } else {
                BufferedSocket.clearSessionAndReload((byte) 116, NodeHashTableIterator.c(param2 ^ -122));
              }
            }
            if (5 == var4) {
              EntityCollisionSupport.openQuitPage(NodeHashTableIterator.c(120), 62);
            }
            if ((var4 == 6) &&
                (AccountEligibilitySupport.loginReturnAllowed)) {
              SpriteConstructionSupport.clientScreenStage = 10;
            }
            if (var4 == 7) {
              TrackedPcmStream.a((byte) 114, NodeHashTableIterator.c(107));
            }
            if (var4 == 8) {
              BufferedSocket.clearSessionAndReload((byte) 116, NodeHashTableIterator.c(119));
            }
            if (9 == var4) {
              RasterTargetSnapshot.a(NodeHashTableIterator.c(115), (byte) -91);
            }
            if (var4 == 10) {
              CacheReference.outgoingSessionBuffer.writeCipherByte(17, (byte) -21);
            }
            if (var4 == 11) {
              EmailAvailabilityQuery.a(NodeHashTableIterator.c(110), false);
            }
            if (var4 == 12) {
              ArchiveLoadSequence.a(NodeHashTableIterator.c(121), (byte) 117, EntityCollisionSupport.getSharedNavigationTarget(param2 ^ -241));
            }
            if (var4 == 13) {
              try {
                if (null == EmailAvailabilityValidator.field_n) {
                  EmailAvailabilityValidator.field_n = new AsyncResourceDownloader(MenuScreen.platformTaskDispatcher, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                if (EmailAvailabilityValidator.field_n.a((byte) 45)) {
                  var12 = EmailAvailabilityValidator.field_n.b((byte) 91);
                  if (var12 == null) {
                    var9 = (String) null;
                    SecondaryDeque.a((byte) 69, (String) null);
                  } else {
                    var7 = ByteTextDecodingSupport.decodeTextSlice(-46, var12.bytes, 0, var12.position);
                    SecondaryDeque.a((byte) 69, var7);
                  }
                  EmailAvailabilityValidator.field_n = null;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (Exception) (Object) decompiledCaughtException;
                IterableNodeHashTable.a((Throwable) ((Object) var5), "S1", (byte) 125);
                var10 = (String) null;
                SecondaryDeque.a((byte) 69, (String) null);
                EmailAvailabilityValidator.field_n = null;
              }
            }
            if (var4 == 15) {
              SpriteConstructionSupport.clientScreenStage = 10;
            }
            if (16 == var4) {
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

    private final void e(byte param0) {
        OpacityWidget.field_G[4] = true;
        int var2 = 10 % ((-61 - param0) / 32);
    }

    private final void a(int param0, String param1, int param2, byte param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
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
            if (!this.a(false)) {
              return;
            }
            this.field_n = this.getCodeBase().getHost();
            var6 = this.field_n.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            ((SessionGameApplet) (this)).field_v = stackIn_7_1;
            this.field_l = Integer.parseInt(this.getParameter("gameport1"));
            this.field_w = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_s = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_k = Long.parseLong(this.getParameter("instanceid"));
            this.field_m = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            AchievementSubmission.field_m = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, -14948, this.field_s, param0, param4, param1, param2);
            if (param3 != 81) {
              this.a((byte) -103, -111, -55, -20, 80, false, -81, 86);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            IterableNodeHashTable.a((Throwable) ((Object) var6_ref), (String) null, (byte) 125);
            this.a((byte) 79, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("wf.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int[] createAchievementStateValues(int methodGuard) {
        if (methodGuard < 81) {
            field_p = -43;
        }
        return new int[8];
    }

    final void l(int param0) {
        boolean stackIn_30_0 = false;
        int var2;
        ClientSessionSnapshot var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        if (param0 < 119) {
          this.field_m = true;
        }
        var2 = ScorePopup.currentPacketOpcode;
        if ((var2 < 64) &&
            (OpacityWidget.field_G[var2])) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            MatchScoringSupport.handleByteShortReply(-1073741824);
          } else {
            if (var2 == 2) {
              NanoFrameTimer.handleRankingResponse(-24839);
            } else {
              if (3 == var2) {
                AchievementProtocolSupport.handleAchievementResponse(119);
              } else {
                if (var2 != 4) {
                  if (5 == var2) {
                    ClientFlowToken.handleSessionAcknowledgement(26146);
                  } else {
                    if (var2 == 6) {
                      DelegatingCanvas.handleRankedListResponse(2);
                    } else {
                      if (var2 != 7) {
                        if (8 == var2) {
                          GameplaySetupSupport.readReflectionCheckRequest(-4, MenuScreen.platformTaskDispatcher, AchievementSubmission.field_k, LogoCompositor.sessionPacketBuffer);
                        } else {
                          if (var2 == 16) {
                            DualLinkNode.b(1);
                          } else {
                            if ((11 != var2) &&
                                (12 != var2)) {
                              if (var2 == 13) {
                                HighscoreNameEntry.handleSocialListResponse((byte) 104);
                                return;
                              }
                              if (17 == var2) {
                                this.g((byte) 12);
                                return;
                              }
                              if (var2 == 18) {
                                UsernameQueryState.handleSessionFlagReset(11560);
                                return;
                              }
                              IterableNodeHashTable.a((Throwable) null, "MGS1: " + TextTemplateDefinition.e(55), (byte) 125);
                              Bzip2DecoderState.closeSessionSocket((byte) -122);
                              return;
                            }
                            stackIn_30_0 = !(var2 != 12);
                            var3 = LogoPreparationSupport.readSessionSnapshot(stackIn_30_0, 128);
                            Under13TermsPanel.a(var3, 0);
                          }
                        }
                      } else {
                        this.f(-11);
                      }
                    }
                  }
                } else {
                  LoginPanel.handleIntRecordReply(-103);
                }
              }
            }
          }
          return;
        }
        IterableNodeHashTable.a((Throwable) null, "MGS2: " + TextTemplateDefinition.e(55), (byte) 125);
        Bzip2DecoderState.closeSessionSocket((byte) -118);
    }

    private final void g(byte param0) {
        int var2 = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        if (param0 != 12) {
            this.h(106);
        }
        int var4 = -1 + AchievementSubmission.field_k;
        byte[] var5 = new byte[var4];
        LogoCompositor.sessionPacketBuffer.readCipherBytes(96, 0, var5, var4);
        LimitedRandomAccessFile.a(EmailValidator.decodeTextBytes(1, var5), (byte) -128, var3 != 0, NodeHashTableIterator.c(112));
    }

    private final void i(int param0) {
        OpacityWidget.field_G[2] = true;
        if (param0 != 16072) {
            SessionGameApplet.g(124);
        }
    }

    private final void d(boolean param0) {
        OpacityWidget.field_G[5] = param0;
    }

    private final void f(byte param0) {
        if (param0 != 32) {
            this.field_u = 72;
        }
        OpacityWidget.field_G[1] = true;
    }

    final void h(byte param0) {
        this.field_t = true;
        int var2 = -21 / ((-82 - param0) / 37);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -17978) {
            this.e(-61);
        }
        return this.a(true, param0, -1);
    }

    protected SessionGameApplet() {
    }

    static {
        fullscreenText = "Fullscreen";
    }
}
