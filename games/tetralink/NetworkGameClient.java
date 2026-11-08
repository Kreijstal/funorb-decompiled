/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    static boolean field_s;
    static String field_A;
    private int field_q;
    private boolean field_H;
    private int field_B;
    private int field_u;
    private boolean field_o;
    private int field_p;
    String field_y;
    private int field_G;
    private boolean field_r;
    private int field_v;
    private long field_E;
    static IntrusiveDeque field_F;
    static int field_z;
    static String field_D;
    static ScrollPane field_t;
    static String field_w;
    static String field_x;
    static String[] field_C;

    private final void readAppletParameters(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        try {
          try {
            if (!this.isHostAllowed((byte) -128)) {
              return;
            }
            this.field_y = this.getCodeBase().getHost();
            var11 = this.field_y.toLowerCase();
            stackIn_8_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_r = stackIn_8_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_G = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_B = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_E = Long.parseLong(this.getParameter("instanceid"));
            this.field_H = this.getParameter("member").equals("yes");
            if (param4 <= 41) {
              this.field_E = 51L;
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_p = Integer.parseInt(var9);
            }
            ViewportController.field_w = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletServices(param3, (byte) 124, param1, param0, 32, param2, this.field_q);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            HotspotTextWidget.reportClientError(-95, (Throwable) ((Object) var6), (String) null);
            this.redirectToErrorPage(24044, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("ph.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void handleOpenUrlPacket(boolean param0) {
        int var2 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
        if (param0) {
          this.field_o = true;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = KeyHandlerHelpers.field_d - 1;
        byte[] var5 = new byte[var4];
        BackgroundSparkle.field_q.readCipheredBytes(116, var5, 0, var4);
        IndexedSpriteState.openUrl((byte) -60, SocialListEntry.decodeExtendedString(var5, -107), var3 != 0, ProgressMessageDialog.getHostApplet(13));
    }

    final void startApplet(String param0, int param1, int param2) {
        try {
          this.readAppletParameters(param1, param0, 480, param2, 124);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ph.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void setHighscorePacketsEnabled(boolean param0) {
        PacketDiagnosticsHelpers.field_u[2] = param0;
    }

    final void enableOptionalPacketHandlers(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6) {
        this.configureCommonPackets(param6 + 24, true);
        if (param2) {
          this.enableRequestReplyPackets(-7);
        }
        if (param6 != -6) {
          this.handleSessionCookiePacket(-86);
        }
        if (param4) {
          this.setHighscorePacketsEnabled(true);
        }
        if (param5) {
          this.enableListResponsePackets(29668);
        }
        if (param0) {
          this.setSubmissionAcknowledgementsEnabled(true);
        }
        if (param3) {
          this.enableRankingsPackets(27840);
        }
        if (param1) {
          this.enableSocialListPackets((byte) 30);
        }
    }

    final void initializeFramework(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        Js5Transport.field_l = this.field_u;
        TriangleSpanHelpers.selectLoadingMessages(Js5Transport.field_l, true);
        ArchiveIndex.configureClientConnection(this.field_H, QuickChatHelpDialog.field_Pb, this.field_E, Js5Transport.field_l, 5000, this.field_G, this.field_B, 5000, this.field_v, (byte) 118, param0, this.field_y, param4, this.field_q);
        InterfaceTextLoader.initializeSessionServices(this.field_B, this.field_q, 1, Js5Transport.field_l, QuickChatHelpDialog.field_Pb, this.field_v, this.field_y, this.field_G, param0);
        RasterBuffer.initializeKeyCodeMap(false);
        ReflectionCheckHelpers.field_k = DraggableWidget.createMouseWheelInput((byte) 124);
        CanvasAndErrorHelpers.attachCanvasInput((byte) -70, GameClock.field_b);
        RsaKeyAndTextGlobals.field_a = param1;
        DualLinkNodeHashTable.field_l = param7;
        OpacityWidget.field_R = param2;
        BufferedSocket.field_g = param6;
        ArchiveFactoryHelpers.field_b = param5;
        this.configureSharedPacketLengths(-6848);
        BoardAnimator.setFeatureFlagMask(param3 ^ param3);
    }

    private final void enableSocialListPackets(byte param0) {
        PacketDiagnosticsHelpers.field_u[11] = true;
        int var2 = 22 / ((param0 + 56) / 55);
        PacketDiagnosticsHelpers.field_u[13] = true;
        PacketDiagnosticsHelpers.field_u[12] = true;
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
          var9 = TetraLink.field_J;
          var4 = WidgetTheme.pollMenuAction(15658734, param1, PacketDiagnosticsHelpers.field_p, Js5Transport.field_l);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5 = ClientProtocolStage.beginLogin(PendingStatQuery.createLoginCredentials(113), BufferedSocket.createRememberedUsername(1), (byte) -62);
            if (var5 != -1) {
              MidiPcmStream.handleAccountRequestResult(CheckboxPainter.field_h, IntrusiveDequeCursor.field_d, var5, (byte) 3);
              IntrusiveDequeCursor.field_d = null;
              CheckboxPainter.field_h = null;
            }
            var12 = PopupAndStripHelpers.takePendingLoginFlag((byte) 116);
            if (var12 != null) {
              WeightedLruCache.setSharedFlaggedTextEnabled(var12.booleanValue(), 124);
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = QuickChatHelpDialog.submitAccountCreation(this.field_p, ScrollPane.isAccountCreationFlagged(false), RandomAccessCacheFile.getStatusMessage((byte) -68), ViewportController.getCurrentAccountName(122), LongAndTextCredentials.getLocalPlayerNameOrEmpty((byte) -114), QuickChatCategory.getSelectedOption((byte) -97), -8769);
            if (var5Lifetime1 != -1) {
              AccountCreationResultHelpers.handleAccountCreationResult(var5Lifetime1, IntrusiveDequeCursor.field_d, CheckboxPainter.field_h, -106);
              IntrusiveDequeCursor.field_d = null;
              CheckboxPainter.field_h = null;
            }
          }
          if (3 == var4) {
            if (ClientProtocolStage.field_h != -1 &&
              ClientProtocolStage.field_h != 0) {
              ClientProtocolStage.field_h = -1;
              ContentTransitionDialog.resetJs5Errors(0);
            }
            if (param2) {
              AccountTextGlobals.field_b = false;
            } else {
              var5Lifetime2 = DateInputWidget.advanceLoginHandshake(this.field_r, LongAndTextCredentials.getLocalPlayerNameOrEmpty((byte) 22), -2472, false, this.field_p, RandomAccessCacheFile.getStatusMessage((byte) -107));
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 == 0) {
                  MarkerSlider.field_U = CommonUiHelpers.field_g;
                  TextLayoutLine.showUnreadMessagesNotice(1);
                  PacketBuffer.field_r = false;
                  DisplayNameForm.field_R = 10;
                } else {
                  AccountCreationDialog.handleLoginResult(IntrusiveDequeCursor.field_d, var5Lifetime2, (byte) 20);
                  IntrusiveDequeCursor.field_d = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (AudioPumpThread.field_m) {
              AccountTermsPanel.logoutAndReload(ProgressMessageDialog.getHostApplet(13), false);
            } else {
              DisplayNameForm.field_R = 10;
              PacketBuffer.field_r = true;
            }
          }
          if (var4 == 5) {
            AnimationPlayer.openQuitPage(ProgressMessageDialog.getHostApplet(13), (byte) 34);
          }
          if (var4 == 6 &&
            ClockAndTextHelpers.field_c) {
            DisplayNameForm.field_R = 10;
          }
          if (var4 == 7) {
            ByteStorage.openSupportPage(ProgressMessageDialog.getHostApplet(13), (byte) -126);
          }
          var5Lifetime3 = 77 / ((81 - param0) / 34);
          if (var4 == 8) {
            AccountTermsPanel.logoutAndReload(ProgressMessageDialog.getHostApplet(13), false);
          }
          if (var4 == 9) {
            LobbyGame.openSupportPage(16, ProgressMessageDialog.getHostApplet(13));
          }
          if (var4 == 10) {
            QuickChatHelpDialog.field_Lb.writeCipheredByte(17, (byte) -92);
          }
          if (11 == var4) {
            PageReloadHelpers.reloadPage(ProgressMessageDialog.getHostApplet(13), 63);
          }
          if (12 == var4) {
            MouseInputHandler.openRelativeUrl(-119, ErrorPrintHelpers.getStatusText(11137), ProgressMessageDialog.getHostApplet(13));
          }
          if (var4 == 13) {
            try {
              if (null == JoinStatusTextHelpers.field_g) {
                JoinStatusTextHelpers.field_g = new UrlFetchTask(QuickChatHelpDialog.field_Pb, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (JoinStatusTextHelpers.field_g.poll((byte) -75)) {
                var7 = JoinStatusTextHelpers.field_g.getCompletedResponse((byte) 79);
                if (var7 != null) {
                  var8 = MenuScreen.decodeWindowsCodePageText(-1095, var7.position, var7.payload, 0);
                  PasswordFieldPainter.onCountryListLoaded(var8, -14710);
                } else {
                  var10 = (String) null;
                  PasswordFieldPainter.onCountryListLoaded((String) null, -14710);
                }
                JoinStatusTextHelpers.field_g = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              HotspotTextWidget.reportClientError(-54, (Throwable) ((Object) var6), "S1");
              var11 = (String) null;
              PasswordFieldPainter.onCountryListLoaded((String) null, -14710);
              JoinStatusTextHelpers.field_g = null;
            }
          }
          if (var4 == 15) {
            DisplayNameForm.field_R = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_D = null;
        field_t = null;
        field_C = null;
        field_w = null;
        if (param0 != -6) {
          field_w = (String) null;
        }
        field_A = null;
        field_x = null;
        field_F = null;
    }

    final int pollReconnect(int param0) {
        int var2;
        if (this.field_b) {
          return -1;
        }
        if (!SocketConnector.isSessionDisconnected(-25945)) {
          return -1;
        }
        if (AccountTextGlobals.field_b) {
          return -1;
        }
        var2 = DateInputWidget.advanceLoginHandshake(this.field_r, LongAndTextCredentials.getLocalPlayerNameOrEmpty((byte) -80), -2472, true, this.field_p, RandomAccessCacheFile.getStatusMessage((byte) -94));
        if (var2 == -1) {
          return -1;
        }
        if (param0 != ~var2 &&
          var2 != 1) {
          if (!SoundEffectLibrary.field_e) {
            this.redirectToErrorPage(24044, "reconnect");
          }
          LoginDialog.advanceToLoginRequest(param0 + 27113);
          AccountCreationDialog.handleLoginResult(IntrusiveDequeCursor.field_d, var2, (byte) 20);
          AccountTextGlobals.field_b = true;
          ArchiveProvider.field_c = 15000L + ClockAndTextHelpers.monotonicMillis(0);
          return var2;
        }
        if (DisplayNameForm.field_R != 11) {
          return var2;
        }
        if (ClientProtocolStage.field_h != 0) {
          return var2;
        }
        TextLayoutLine.showUnreadMessagesNotice(1);
        return var2;
    }

    final int serviceAccountActions(boolean param0, byte param1) {
        if (param1 != -108) {
          this.serviceFramework(-79, true);
        }
        return this.processAccountMenu(param1 + 111, param0, true);
    }

    private final void enableRankingsPackets(int param0) {
        PacketDiagnosticsHelpers.field_u[6] = true;
        if (param0 != 27840) {
          this.enableRequestReplyPackets(63);
        }
    }

    private final void setSubmissionAcknowledgementsEnabled(boolean param0) {
        PacketDiagnosticsHelpers.field_u[5] = param0;
    }

    final void updateLoginFlow(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        var3 = TetraLink.field_J;
        if (!ScreenSwitchHelpers.haveRequiredClientStages(-19403)) {
          if (GrowableIntList.field_a >= 10) {
            if (!RasterStackHelpers.isLogoIntroFinished((byte) -99)) {
              Renderable.advanceIntroTimer(-57);
            } else {
              if (DisplayNameForm.field_R == 0) {
                discarded$6 = this.processAccountMenu(-37, false, false);
              } else {
                ArchiveIndex.updateMenuWidgets(PacketDiagnosticsHelpers.field_p, -21901);
              }
            }
          }
        } else {
          stackIn_3_1 = 116;
          stackIn_4_2 = (null != EmailAvailabilityValidator.field_u);
          discarded$7 = this.processAccountMenu(stackIn_3_1, stackIn_4_2, false);
        }
        if (param0 > -19) {
          this.pollReconnect(2);
        }
    }

    private final void enableListResponsePackets(int param0) {
        PacketDiagnosticsHelpers.field_u[4] = true;
        if (param0 != 29668) {
          this.field_G = -48;
        }
    }

    private final void configureSharedPacketLengths(int param0) {
        if (param0 == -6848) {
          IntrusiveDeque.field_b[18] = 1;
          IntrusiveDeque.field_b[8] = -2;
          IntrusiveDeque.field_b[3] = -1;
          IntrusiveDeque.field_b[9] = -1;
          IntrusiveDeque.field_b[2] = -2;
          IntrusiveDeque.field_b[5] = -1;
          IntrusiveDeque.field_b[17] = -1;
          IntrusiveDeque.field_b[4] = -1;
          IntrusiveDeque.field_b[1] = 16;
          IntrusiveDeque.field_b[11] = -1;
          IntrusiveDeque.field_b[12] = -1;
          IntrusiveDeque.field_b[13] = -1;
          IntrusiveDeque.field_b[7] = -1;
          IntrusiveDeque.field_b[6] = -2;
          IntrusiveDeque.field_b[10] = -1;
          IntrusiveDeque.field_b[16] = -1;
          return;
        }
    }

    final void dispatchSharedPacket(boolean param0) {
        boolean stackIn_26_1 = false;
        int stackIn_30_0 = 0;
        Object stackIn_30_1 = null;
        StringBuilder stackIn_30_2 = null;
        boolean stackIn_31_3;
        int stackIn_36_0 = 0;
        boolean stackIn_37_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = CommonUiHelpers.field_c;
        if (var2 < 64 &&
          PacketDiagnosticsHelpers.field_u[var2]) {
          if (var2 == 0) {
            return;
          }
          regionExit1: {
            switch (var2) {
              case 1:
                DisplayNameForm.consumeQueuedRequestReply(-1);
                break;
              case 2:
                ViewportController.handleRankingResponse(1);
                break;
              case 3:
                WidgetStyleLayer.handleAchievementResponse(-1);
                break;
              case 8:
                ReflectionCheckHelpers.handleReflectionCheck(KeyHandlerHelpers.field_d, 4, BackgroundSparkle.field_q, QuickChatHelpDialog.field_Pb);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      StrongCacheEntry.handleFriendListPacket(1);
                      break regionExit1;
                    case 17:
                      stackIn_26_1 = !(param0);
                      this.handleOpenUrlPacket(stackIn_26_1);
                      break regionExit1;
                    case 18:
                      CommonUiHelpers.readChatAvailability(-1);
                      break regionExit1;
                    default:
                      stackIn_30_0 = -111;
                      stackIn_30_1 = null;
                      stackIn_30_2 = new StringBuilder().append("MGS1: ");
                      stackIn_31_3 = !(param0);
                      HotspotTextWidget.reportClientError(stackIn_30_0, (Throwable) (stackIn_30_1), ((StringBuilder) (Object) stackIn_30_2).append(PacketDiagnosticsHelpers.describeCurrentPacket(stackIn_31_3)).toString());
                      SocialTabsPanel.closeGameSocket(false);
                      break regionExit1;
                  }
                }
                stackIn_36_0 = 85;
                stackIn_37_1 = (var2 == 12);
                var3 = ChatMessageReader.readChatMessage(stackIn_36_0, stackIn_37_1);
                ChatReceiveHelpers.acceptChatMessage(var3, -127);
                break;
              case 16:
                ByteArrayPool.readLocalPlayerName((byte) 58);
                break;
              case 7:
                this.handleSessionCookiePacket(92);
                break;
              case 6:
                IsaacCipher.handleRankingsResponse((byte) -122);
                break;
              case 5:
                MouseWheelInput.handleSubmissionAcknowledgement(false);
                break;
              case 4:
                NameEntryPopup.readQueuedListResponse((byte) 78);
                break;
            }
          }
          if (!param0) {
            field_A = (String) null;
          }
          return;
        }
        HotspotTextWidget.reportClientError(-72, (Throwable) null, "MGS2: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
        SocialTabsPanel.closeGameSocket(false);
    }

    protected NetworkGameClient() {
    }

    private final void handleSessionCookiePacket(int param0) {
        String var2 = ArchiveRequest.readPacketString(0);
        FadingModalPanel.setSessionCookie(var2, ProgressMessageDialog.getHostApplet(13), -1);
        if (param0 < 40) {
          this.enableOptionalPacketHandlers(false, true, false, true, false, true, (byte) 49);
        }
    }

    final void serviceFramework(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        boolean stackIn_105_0 = false;
        String stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        boolean stackIn_108_3;
        int stackIn_139_0 = 0;
        int var3;
        java.awt.Dimension var4_ref_java_awt_Dimension;
        int var4;
        int var5;
        java.awt.Container var6;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = TetraLink.field_J;
        if (null != DateInputWidget.field_M) {
          if (EmailAvailabilityValidator.field_u == null) {
            var6 = TopLevelContainerHelpers.getTopLevelContainer((byte) -26);
            var4_ref_java_awt_Dimension = var6.getSize();
            DateInputWidget.field_M.setDesiredSize(var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width, (byte) 37);
          }
          DateInputWidget.field_M.updateViewport(29768);
        }
        IntrusiveDeque.snapshotKeyState(13397);
        AccountWelcomePanel.pollMouseInput(false);
        var3 = -117 / ((param0 - 84) / 32);
        if (!LoadingScreenHelpers.shouldShowLoadingScreen(false) &&
          11 != DisplayNameForm.field_R) {
          InsetTextPainter.updateFullscreenModals(0);
        }
        if (ReflectionCheckHelpers.field_k != null) {
          PacketDiagnosticsHelpers.field_p = ReflectionCheckHelpers.field_k.takeRotation(12224);
        }
        if (MusicCrossfadeStream.isLoginReplyPending(0)) {
          var4 = TextHighlightSpan.getFramesPerSecond(-1) * 1200;
          if (this.field_o ||
            !(var4 >= FontAndBrightnessHelpers.getKeyboardIdleTicks((byte) 26)) &&
            !(EditableTextWidget.getMouseIdleTicks(78) <= var4)) {
            this.field_o = false;
            SocialTabsPanel.closeGameSocket(false);
            LoginDialog.advanceToLoginRequest(27112);
            AccountCreationDialog.handleLoginResult(LruTextureCache.field_c, 2, (byte) 20);
            RasterSnapshot.onIdleTimeout(18278);
            AccountTextGlobals.field_b = true;
            ArchiveProvider.field_c = 15000L + ClockAndTextHelpers.monotonicMillis(0);
          }
        }
        boolean decompiledFrameRemainder1 = true;
        if (ClientProtocolStage.field_h == -1 ||
          ClientProtocolStage.field_h == 0) {
          stackIn_24_0 = (ClientProtocolStage.field_h != -1) ? 0 : 1;
          var4Lifetime1 = stackIn_24_0;
          ClientProtocolStage.field_h = HighscoreRowName.pollArchiveLoading(true);
          if (var4Lifetime1 != 0) {
            if (0 == ClientProtocolStage.field_h) {
              if (DisplayNameForm.field_R != 11) {
                if (((-1 != ClientProtocolStage.field_h)) &&
                  ((ClientProtocolStage.field_h != 0))) {
                  ArchiveProvider.field_c = ClockAndTextHelpers.monotonicMillis(0) + 15000L;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (!SocketConnector.isSessionDisconnected(-25945)) {
                  TextLayoutLine.showUnreadMessagesNotice(1);
                }
              }
            }
            if ((decompiledFrameRemainder1) && (-1 != ClientProtocolStage.field_h &&
              ClientProtocolStage.field_h != 0)) {
              ArchiveProvider.field_c = ClockAndTextHelpers.monotonicMillis(0) + 15000L;
            }
          } else {
            if (-1 != ClientProtocolStage.field_h &&
              ClientProtocolStage.field_h != 0) {
              ArchiveProvider.field_c = ClockAndTextHelpers.monotonicMillis(0) + 15000L;
            }
          }
        }
        if (-1 != ClientProtocolStage.field_h &&
          ClientProtocolStage.field_h != 0) {
          if (GrowableIntList.field_a < 10) {
            if (ClientProtocolStage.field_h != 3) {
              if (4 != ClientProtocolStage.field_h) {
                if (ClientProtocolStage.field_h != 2) {
                  if (5 == ClientProtocolStage.field_h) {
                    this.redirectToErrorPage(24044, "outofdate");
                  } else {
                    this.redirectToErrorPage(24044, "js5connect");
                  }
                } else {
                  this.redirectToErrorPage(24044, "js5connect_full");
                }
              } else {
                this.redirectToErrorPage(24044, "js5io");
              }
            } else {
              this.redirectToErrorPage(24044, "js5crc");
            }
          } else {
            if (DisplayNameForm.field_R >= 10) {
              LoginDialog.advanceToLoginRequest(27112);
              if (ClientProtocolStage.field_h != 3) {
                if (4 != ClientProtocolStage.field_h) {
                  if (ClientProtocolStage.field_h == 2) {
                    AccountCreationDialog.handleLoginResult(IntrusiveDeque.field_g, 256, (byte) 20);
                  } else {
                    if (ClientProtocolStage.field_h != 5) {
                      AccountCreationDialog.handleLoginResult(SpriteCheckboxPainter.field_a, 256, (byte) 20);
                    } else {
                      AccountCreationDialog.handleLoginResult(AccountTermsPanel.field_O, 5, (byte) 20);
                    }
                  }
                } else {
                  AccountCreationDialog.handleLoginResult(PieceDropAnimation.field_p, 256, (byte) 20);
                }
              } else {
                AccountCreationDialog.handleLoginResult(IterableNodeHashTable.field_c, 256, (byte) 20);
              }
              AccountTextGlobals.field_b = true;
            }
          }
        }
        if ((-1 != ClientProtocolStage.field_h &&
          ClientProtocolStage.field_h != 0 ||
          SocketConnector.isSessionDisconnected(-25945)) &&
          ClockAndTextHelpers.monotonicMillis(0) >= ArchiveProvider.field_c) {
          AccountTextGlobals.field_b = false;
          if (ClientProtocolStage.field_h != -1 &&
            0 != ClientProtocolStage.field_h) {
            ClientProtocolStage.field_h = -1;
            ContentTransitionDialog.resetJs5Errors(0);
          }
        }
        if (ClientProtocolStage.field_h == 0 &&
          !SocketConnector.isSessionDisconnected(-25945)) {
          NameSuggestionsPanel.field_Q = false;
        }
        if (GrowableIntList.field_a == 0 &&
          ProxyAuthenticationRequiredException.isMasterIndexLoaded(21747)) {
          GrowableIntList.field_a = 1;
        }
        if (1 == GrowableIntList.field_a) {
          if (Js5Transport.field_l != 0) {
            DebouncedValidator.field_i = NineSliceFrame.createArchive(57, OpacityWidget.field_R);
          }
          LoadingScreenHelpers.field_i = StatusRequestHelpers.createArchive(BufferedSocket.field_g, true, false, 1, (byte) -85);
          ConnectionTimingHelpers.field_a = StatusRequestHelpers.createArchive(RsaKeyAndTextGlobals.field_a, true, false, 1, (byte) -100);
          LinkTextPainter.field_b = StatusRequestHelpers.createArchive(DualLinkNodeHashTable.field_l, true, false, 1, (byte) -93);
          ArchiveGroupHelpers.field_a = ConnectionTimingHelpers.field_a;
          QueuedListRequest.field_v = LoadingScreenHelpers.field_i;
          GrowableIntList.field_a = 2;
        }
        if (2 == GrowableIntList.field_a) {
          if (DebouncedValidator.field_i != null &&
            DebouncedValidator.field_i.ensureIndexLoaded(120)) {
            if (!DebouncedValidator.field_i.hasGroupName("", 0)) {
              DebouncedValidator.field_i = null;
            } else {
              if (DebouncedValidator.field_i.loadGroupByName("", (byte) -76)) {
                InterfaceTextLoader.loadInterfaceText(1, DebouncedValidator.field_i);
                DebouncedValidator.field_i = null;
                SecondaryNodeDeque.resetFrameTimingHistory(-8243);
              }
            }
          }
          if (DebouncedValidator.field_i == null) {
            GrowableIntList.field_a = 3;
          }
        }
        if (GrowableIntList.field_a == 3 &&
          CanvasAndErrorHelpers.areCommonUiArchivesReady(LoadingScreenHelpers.field_i, ConnectionTimingHelpers.field_a, 97, LinkTextPainter.field_b) &&
          LoginDialog.isArchiveReady((byte) -68, LinkTextPainter.field_b)) {
          LoadingResourceHelpers.releaseLoadingScreenResources(1);
          GameApplet.unusedGuardHook(67);
          ProxyAuthenticationRequiredException.field_a = FullscreenFocusCanvas.field_f;
          ClockAndTextHelpers.field_c = false;
          SoundEffectLibrary.loadCommonUiResources(LoadingScreenHelpers.field_i, AudioPumpThread.field_m, LinkTextPainter.field_b, ConnectionTimingHelpers.field_a, (byte) 91);
          if (DisplayMode.field_j ||
            null != NameEntryPopup.field_Pb) {
            stackIn_105_0 = !(DisplayMode.field_j);
            stackIn_107_1 = NameEntryPopup.field_Pb;
            stackIn_107_2 = 93;
            stackIn_108_3 = !(DisplayMode.field_j);
            DateInputWidget.openLoginPanel(stackIn_105_0, stackIn_107_1, stackIn_107_2, stackIn_108_3);
          }
          if (ViewportController.field_w) {
            NameEntryPopup.openLoadingDialog(5959);
          }
          if (null == KeyHandlerHelpers.field_f) {
            KeyHandlerHelpers.field_f = SoundMixerHelpers.getSoundMixer(28357);
            PasswordFieldPainter.field_z = SoundEffectLibrary.getAudioBufferMillis(-116);
          }
          Js5ArchiveManager.prepareLogoAnimation(LinkTextPainter.field_b, KeyHandlerHelpers.field_f, PasswordFieldPainter.field_z, (byte) -5);
          LoadingScreenHelpers.field_i = null;
          LinkTextPainter.field_b = null;
          ConnectionTimingHelpers.field_a = null;
          WidgetContainer.readUsernameParameter(-73, (java.applet.Applet) (this));
          SecondaryNodeDeque.resetFrameTimingHistory(-8243);
          GrowableIntList.field_a = 10;
        }
        if (10 == GrowableIntList.field_a) {
          if (0 != Js5Transport.field_l) {
            TextFieldValidator.field_k = NineSliceFrame.createArchive(118, ArchiveFactoryHelpers.field_b);
          }
          GrowableIntList.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == GrowableIntList.field_a) {
          if (null != TextFieldValidator.field_k && (!TextFieldValidator.field_k.ensureIndexLoaded(124) ||
            !TextFieldValidator.field_k.areAllGroupsLoaded(false))) {
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, DisplayNameForm.formatArchiveProgress(0, TextFieldValidator.field_k, ArrayWidgetContainer.field_N, KeyEventHelpers.field_e), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            HighscoreQuery.field_w = true;
            GrowableIntList.field_a = 12;
          }
        }
        if (GrowableIntList.field_a == 12 &&
          !HighscoreQuery.field_w) {
          GrowableIntList.field_a = 13;
        }
        if (GrowableIntList.field_a == 13) {
          var4Lifetime2 = 1;
          if (SingleChildWidget.field_L != null) {
            stackIn_139_0 = (!SingleChildWidget.field_L.pollLoading(-1210)) ? 0 : 1;
            var4Lifetime2 = stackIn_139_0;
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, SingleChildWidget.field_L.field_e, SingleChildWidget.field_L.field_f);
          }
          if (var4Lifetime2 != 0) {
            GrowableIntList.field_a = 20;
          }
        }
        if (!param1 &&
          MouseInputHandler.field_h) {
          HighscoreQuery.attachCanvasInput((byte) -117, GameClock.field_b);
          this.replaceCanvas(-66);
          CanvasAndErrorHelpers.attachCanvasInput((byte) -118, GameClock.field_b);
        }
        if (PacketDiagnosticsHelpers.field_u[8]) {
          LruTextureCache.sendReflectionCheckReplies(true);
        }
    }

    private final void configureCommonPackets(int param0, boolean param1) {
        PacketDiagnosticsHelpers.field_u[16] = true;
        PacketDiagnosticsHelpers.field_u[8] = param1;
        PacketDiagnosticsHelpers.field_u[17] = true;
        PacketDiagnosticsHelpers.field_u[7] = true;
        PacketDiagnosticsHelpers.field_u[0] = true;
        PacketDiagnosticsHelpers.field_u[3] = true;
        PacketDiagnosticsHelpers.field_u[param0] = true;
    }

    private final void enableRequestReplyPackets(int param0) {
        if (param0 != -7) {
          return;
        }
        PacketDiagnosticsHelpers.field_u[1] = true;
    }

    static {
        field_A = "Wins";
        field_F = new IntrusiveDeque();
        field_D = "Not yet achieved";
        field_z = -1;
        field_x = "Achievements";
        field_C = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
