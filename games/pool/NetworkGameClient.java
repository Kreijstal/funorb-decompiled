/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    private int field_q;
    static IntrusiveDeque field_A;
    private int field_E;
    static ResourceArchive field_F;
    static String thisisrunescapeclanNotowner;
    private int field_B;
    static String tutorialTitleNineBall;
    String field_t;
    private long field_o;
    private int field_w;
    private boolean field_x;
    private int field_u;
    static Sprite field_s;
    private boolean field_r;
    static boolean field_z;
    private boolean field_C;
    private int field_D;
    static String reportXForAbuse;
    static int[] field_H;
    static String loginCreateaccount;

    private final void enableChatAndSocialResponses(int obfuscationGuard) {
        int var2 = -25 / ((obfuscationGuard - 25) / 53);
        ButtonWidget.field_H[12] = true;
        ButtonWidget.field_H[11] = true;
        ButtonWidget.field_H[13] = true;
    }

    final void startApplet(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.canStartApplet(param3 ^ -26164)) {
              return;
            }
            this.field_t = this.getCodeBase().getHost();
            var10 = this.field_t.toLowerCase();
            stackIn_7_1 = (var10.equals("jagex.com")) || (var10.endsWith(".jagex.com"));
            this.field_x = stackIn_7_1;
            this.field_u = Integer.parseInt(this.getParameter("gameport1"));
            this.field_B = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_q = Integer.parseInt(var7);
            }
            this.field_D = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_o = Long.parseLong(this.getParameter("instanceid"));
            this.field_r = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_E = Integer.parseInt(var8);
            }
            if (this.field_E >= 5) {
              this.field_E = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_w = Integer.parseInt(var9);
            }
            Under13NoticePanel.field_T = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletThread(this.field_D, param2, param1, (byte) 115, 32, param4, param0);
            if (param3 != 0) {
              this.initializeFramework(-57, 27, 54, 110, 115, false, -63, 23);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            GrowableIntList.reportClientError((Throwable) ((Object) var6), (String) null, param3 - 8555);
            this.redirectToErrorPage((byte) 100, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("ep.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void configureAccountResponses(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.enableBaseResponses(0, true);
        if (param3) {
          this.enableArchiveKeyResponses(param0 ^ -42);
        }
        if (param6) {
          this.enableScoreResponses(7);
        }
        if (param1) {
          this.enableProgressResponses(-22045);
        }
        if (param0 == -1) {
          if (param5) {
            this.enableSavedDataResponses((byte) -98);
          }
          if (param4) {
            this.setRankingsResponsesEnabled(true);
          }
          if (param2) {
            this.enableChatAndSocialResponses(-55);
          }
          return;
        }
    }

    private final void setRankingsResponsesEnabled(boolean enabled) {
        ButtonWidget.field_H[6] = enabled;
    }

    private final int serviceAccountActions(boolean param0, boolean param1, int param2) {
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
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Pool.field_O;
          var4 = MenuSelectionSupport.pollAccountDialogResult((byte) -88, param1, CompressedContainerSupport.field_d, ProgressBarWidget.field_S);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = TickClock.pollAccountLookup(9539, StatefulTextPainter.createAccountNameValue(5), HighScoreRequest.createLoginTextValue(8388));
            if (-1 != var5_int) {
              GameRules.handleLoginResponse(LoginPayloadFactory.field_b, false, var5_int, LoginTextValue.field_g);
              LoginPayloadFactory.field_b = null;
              LoginTextValue.field_g = null;
            }
            var11 = SpriteResourceSupport.pollLoginBooleanResponse(118);
            if (var11 != null) {
              TutorialFactory.completeTextValidation(var11.booleanValue(), 68);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = QuickChatHelpDialog.pollAccountCreationRequest(LoginTextSupport.getAccountName(true), this.field_w, CollisionContact.getAccountUsername(false), 50, DelegatingCanvas.getAccountCreationRequestFlag((byte) 108), ByteRecordSubmission.getAccountPassword((byte) 64), ThreeSliceButtonPainter.getAccountAge(12854));
            if (-1 != var5_intLifetime1) {
              LoginTextValue.completeAccountCreationRequest(LoginTextValue.field_g, var5_intLifetime1, LoginPayloadFactory.field_b, (byte) -16);
              LoginPayloadFactory.field_b = null;
              LoginTextValue.field_g = null;
            }
          }
          if (var4 == 3) {
            if (PaletteFontLoader.field_a != -1 &&
              0 != PaletteFontLoader.field_a) {
              PaletteFontLoader.field_a = -1;
              ProgressDialog.resetArchiveConnectionFailures((byte) 72);
            }
            if (!param0) {
              var5_intLifetime2 = SectorCacheStore.pollLoginRequest(false, CollisionContact.getAccountUsername(false), false, this.field_x, this.field_w, ByteRecordSubmission.getAccountPassword((byte) 54));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 == 0) {
                  ChatReplacementSupport.field_e = Quaternion.field_a;
                  LobbyGame.finishLoginInterface((byte) 121);
                  FullscreenErrorDialog.field_kb = false;
                  PlasmaTableScene.field_ab = 10;
                } else {
                  LoginPayload.showLoginError(true, LoginTextValue.field_g, var5_intLifetime2);
                  LoginTextValue.field_g = null;
                }
              }
            } else {
              DualLinkNode.field_v = false;
            }
          }
          if (4 == var4) {
            if (CushionSegment.field_g) {
              RankingsProtocolSupport.resetAppletPreferences(false, NanoTickClock.getApplet(76));
            } else {
              PlasmaTableScene.field_ab = 10;
              FullscreenErrorDialog.field_kb = true;
            }
          }
          if (5 == var4) {
            DualLinkNodeHashTable.openQuitPage(-1, NanoTickClock.getApplet(79));
          }
          if (var4 == 6 &&
            ClassicBallSkin.field_o) {
            PlasmaTableScene.field_ab = 10;
          }
          if (var4 == 7) {
            ServerListLauncher.openServerList((byte) 112, NanoTickClock.getApplet(99));
          }
          if (8 == var4) {
            RankingsProtocolSupport.resetAppletPreferences(false, NanoTickClock.getApplet(104));
          }
          if (var4 == 9) {
            SupportPageLauncher.openSupportPage((byte) 83, NanoTickClock.getApplet(60));
          }
          if (var4 == 10) {
            JaggrabDownloader.field_j.writeCipheredOpcode(false, 17);
          }
          if (var4 == 11) {
            DebouncedValidationProvider.reloadApplet(NanoTickClock.getApplet(114), (byte) -121);
          }
          if (param2 >= -96) {
            this.dispatchAccountPacket(91);
          }
          if (var4 == 12) {
            LoginForm.openAppletRelativeUrl(AccountTextSupport.getAccountStatusMessage(true), NanoTickClock.getApplet(109), false);
          }
          if (13 == var4) {
            try {
              if (null == ClientUiResourceState.field_d) {
                ClientUiResourceState.field_d = new JaggrabDownloader(StatefulTextPainter.field_s, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ClientUiResourceState.field_d.pollComplete((byte) -118)) {
                var12 = ClientUiResourceState.field_d.getResult(-25955);
                if (var12 != null) {
                  var7 = RankingsScreen.decodeWindows1252(var12.position, -7510, var12.payload, 0);
                  AppletContainerSupport.validateAppletContainerGuard(var7, true);
                } else {
                  var9 = (String) null;
                  AppletContainerSupport.validateAppletContainerGuard((String) null, true);
                }
                ClientUiResourceState.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              GrowableIntList.reportClientError((Throwable) ((Object) var5), "S1", -8555);
              var10 = (String) null;
              AppletContainerSupport.validateAppletContainerGuard((String) null, true);
              ClientUiResourceState.field_d = null;
            }
          }
          if (var4 == 15) {
            PlasmaTableScene.field_ab = 10;
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

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          NetworkGameClient.releaseStatics(false);
        }
        reportXForAbuse = null;
        field_H = null;
        thisisrunescapeclanNotowner = null;
        field_F = null;
        loginCreateaccount = null;
        field_A = null;
        tutorialTitleNineBall = null;
        field_s = null;
    }

    private final void enableSavedDataResponses(byte param0) {
        ButtonWidget.field_H[5] = true;
        if (param0 != -98) {
          this.enableSavedDataResponses((byte) -122);
        }
    }

    final void dispatchAccountPacket(int param0) {
        int stackIn_29_0 = 0;
        boolean stackIn_30_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Pool.field_O;
        var2 = Bzip2DecoderState.field_c;
        if (var2 < 64 &&
          ButtonWidget.field_H[var2]) {
          if (var2 == 0) {
            return;
          }
          regionExit1: {
            switch (var2) {
              case 1:
                LocalGameSetupScreen.readLookupAcknowledgement(80);
                break;
              case 2:
                MouseWheelInput.readHighScoreResponse(param0 - 14873);
                break;
              case 4:
                IntKeyLookup.readIntegerRecordResponse(199);
                break;
              case 6:
                MenuLabelSupport.readRankingsResponse((byte) 106);
                break;
              case 8:
                ReflectionRequestSupport.readReflectionCheckRequest((byte) 34, ScrollPane.field_Pb, StatefulTextPainter.field_s, PlayerContextMenu.field_e);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      MaxLengthTextInputWidget.readSocialListUpdate(29769);
                      break regionExit1;
                    case 17:
                      this.readBrowserUrlResponse(70);
                      break regionExit1;
                    case 18:
                      HalloweenBallSkin.readChatPermission(3);
                      break regionExit1;
                    default:
                      GrowableIntList.reportClientError((Throwable) null, "MGS1: " + PacketDiagnosticsSupport.formatPacketDump(127), param0 - 23555);
                      ShotEvent.closeClientSocket(-75);
                      break regionExit1;
                  }
                }
                stackIn_29_0 = -31;
                stackIn_30_1 = (var2 == 12);
                var3 = QuickChatCategoryCache.readChatMessageIntArgs(stackIn_29_0, stackIn_30_1);
                QuickChatCategoryCache.displayChatMessageIfNew(var3, 101);
                break;
              case 16:
                RankingsRequest.readAccountDisplayName((byte) -56);
                break;
              case 7:
                this.readSessionCookieResponse(6);
                break;
              case 5:
                TranslatedUiText.readByteRecordResponse(param0 - 14874);
                break;
              case 3:
                AlignedIconLabel.readAccountStateResponse(-104);
                break;
            }
          }
          if (param0 != 15000) {
            this.pollAccountActions(true, true);
          }
          return;
        }
        GrowableIntList.reportClientError((Throwable) null, "MGS2: " + PacketDiagnosticsSupport.formatPacketDump(param0 - 14914), -8555);
        ShotEvent.closeClientSocket(-108);
    }

    private final void enableScoreResponses(int param0) {
        if (param0 != 7) {
          field_F = (ResourceArchive) null;
        }
        ButtonWidget.field_H[2] = true;
    }

    final void initializeFramework(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ProgressBarWidget.field_S = this.field_E;
        ChatInputSupport.selectLoadingLanguage((byte) -94, ProgressBarWidget.field_S);
        TimeTrialRules.configureClientConnection(this.field_u, this.field_D, (byte) 86, this.field_r, ProgressBarWidget.field_S, this.field_B, param5, this.field_t, StatefulTextPainter.field_s, 5000, this.field_q, 5000, param6, this.field_o);
        ArchiveBootstrapSupport.initializeArchiveInfrastructure(StatefulTextPainter.field_s, param6, this.field_D, this.field_B, this.field_t, (byte) -96, this.field_u, ProgressBarWidget.field_S, this.field_q);
        IntLookupQuery.registerPunctuationKeyCodes(true);
        ClientException.field_a = BrowserCookieWriter.createMouseWheelInput(96);
        CanvasInputAttachmentSupport.attachInputListeners(TimeTrialSelectScreen.field_K, param4 + param4);
        Atan2Support.field_d = param2;
        SharedWidgetLayoutSupport.field_c = param0;
        MeshColorSupport.field_a = param7;
        TikiTableScene.field_eb = param1;
        BrowserCookieSupport.field_g = param3;
        this.initializeAccountPacketLengths((byte) -81);
        ScrollPaneWithFooter.clearClientOptionMask(false);
    }

    final static void advanceNotifications(byte obfuscationGuard, PoolMatchController session) {
        AnimatedNotification dupTemp$0 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        AnimatedNotification var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        PoolMatchController var5 = null;
        AnimatedNotification var6 = null;
        var4 = Pool.field_O;
        try {
          if (!MarkerSliderPainter.field_i.isEmpty(0)) {
            ByteRecordSubmission.field_m = ByteRecordSubmission.field_m + 1;
            if (GameApplet.field_l != null) {
              GameApplet.field_l.rotateAroundZStep(false, 50, ByteRecordSubmission.field_m);
            }
            if (null != ServerListLauncher.field_b) {
              ServerListLauncher.field_b.rotateAroundZStep(false, 50, ByteRecordSubmission.field_m);
            }
            var6 = (AnimatedNotification) (MarkerSliderPainter.field_i.last((byte) 80));
            var2 = var6;
            if (var6.field_H + var6.field_B + var6.field_y <= ByteRecordSubmission.field_m) {
              dupTemp$0 = (AnimatedNotification) (MarkerSliderPainter.field_i.removeLast((byte) -41));
              var2 = dupTemp$0;
              stackIn_14_0 = (dupTemp$0 != null) ? 0 : -1;
              ByteRecordSubmission.field_m = stackIn_14_0;
              var2 = (AnimatedNotification) (MarkerSliderPainter.field_i.last((byte) -27));
            }
            if (var2 == null) {
              return;
            }
            if (var2.field_I != null) {
              var2.field_L[1] = (var2.field_I.height >> 1) + var2.field_I.screenY;
              var2.field_L[0] = (var2.field_I.width >> 1) + var2.field_I.screenX;
            }
            if (null != var2.field_l) {
              var2.field_z[0] = (var2.field_l.width >> 1) + var2.field_l.screenX;
              var2.field_z[1] = (var2.field_l.height >> 1) + var2.field_l.screenY;
            }
            if (null != var2.field_q) {
              var2.field_x[1] = var2.field_q.screenY + (var2.field_q.height >> 1);
              var2.field_x[0] = var2.field_q.screenX + (var2.field_q.width >> 1);
            }
            if (null != var2.field_p) {
              WorldPointProjectionSupport.projectWorldPointToScreen(session, var2, var2.field_L, var2.field_p, 1);
            }
            if (var2.field_F != null) {
              WorldPointProjectionSupport.projectWorldPointToScreen(session, var2, var2.field_z, var2.field_F, 1);
            }
            if (var2.field_D != null) {
              WorldPointProjectionSupport.projectWorldPointToScreen(session, var2, var2.field_x, var2.field_D, 1);
            }
            if (ByteRecordSubmission.field_m < var2.field_H) {
              if ((1 & var2.field_v) != 0) {
                var2.field_J = var2.field_L[0] + FontPaletteSupport.cubicEaseOut(-var2.field_L[0] + var2.field_z[0], ByteRecordSubmission.field_m, var2.field_H, obfuscationGuard + 13849);
                var2.field_C = var2.field_L[1] + FontPaletteSupport.cubicEaseOut(-var2.field_L[1] + var2.field_z[1], ByteRecordSubmission.field_m, var2.field_H, 13776);
              } else {
                var2.field_J = var2.field_z[0];
                var2.field_C = var2.field_z[1];
              }
              if (0 != (var2.field_v & 8)) {
                var2.field_w = FontPaletteSupport.cubicEaseOut(256, ByteRecordSubmission.field_m, var2.field_H, 13776);
              } else {
                var2.field_w = 256;
              }
              if ((4 & var2.field_v) != 0) {
                var2.field_E = ValidationMessageWidget.easeOutQuadratic((byte) -127, 4000, var2.field_y, ByteRecordSubmission.field_m) + 96;
              } else {
                if (0 != (var2.field_v & 2)) {
                  var2.field_E = 4096 + FontPaletteSupport.cubicEaseOut(2048, ByteRecordSubmission.field_m, var2.field_H, 13776);
                } else {
                  var2.field_E = 0;
                }
              }
            } else {
              if (ByteRecordSubmission.field_m >= var2.field_H + var2.field_B) {
                if (var2.field_y + var2.field_H + var2.field_B > ByteRecordSubmission.field_m) {
                  var3 = -var2.field_B - var2.field_H + ByteRecordSubmission.field_m;
                  if ((var2.field_r & 1) != 0) {
                    var2.field_J = var2.field_z[0] + FontPaletteSupport.cubicEaseOut(-var2.field_z[0] + var2.field_x[0], var3, var2.field_y, 13776);
                    var2.field_C = var2.field_z[1] + FontPaletteSupport.cubicEaseOut(-var2.field_z[1] + var2.field_x[1], var3, var2.field_y, 13776);
                  } else {
                    var2.field_C = var2.field_x[1];
                    var2.field_J = var2.field_x[0];
                  }
                  if ((8 & var2.field_r) != 0) {
                    var2.field_w = BallDebugOverlay.cubicEaseIn(32635, var2.field_y, -var3 + var2.field_y, 256);
                  } else {
                    var2.field_w = 256;
                  }
                  if ((4 & var2.field_r) == 0) {
                    if ((var2.field_r & 2) == 0) {
                      var2.field_E = 0;
                    } else {
                      var2.field_E = FontPaletteSupport.cubicEaseOut(2048, var3, var2.field_y, obfuscationGuard + 13849) + 4096;
                    }
                  } else {
                    var2.field_E = 96 + ValidationMessageWidget.easeOutQuadratic((byte) -126, 4000, var2.field_y, -var3 + var2.field_y);
                  }
                }
              } else {
                var2.field_E = 0;
                var2.field_J = var2.field_z[0];
                var2.field_C = var2.field_z[1];
              }
            }
          } else {
            if (-1 != ByteRecordSubmission.field_m) {
              ByteRecordSubmission.field_m = -1;
            }
          }
          if (obfuscationGuard != -73) {
            var5 = (PoolMatchController) null;
            NetworkGameClient.advanceNotifications((byte) -7, (PoolMatchController) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_63_0 = var2_ref;
          stackIn_63_1 = new StringBuilder().append("ep.HA(").append(obfuscationGuard).append(',');
          if (session == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    private final void enableProgressResponses(int param0) {
        ButtonWidget.field_H[4] = true;
        if (param0 != -22045) {
          this.field_D = 101;
        }
    }

    final void serviceStartupAndAccountFlow(byte obfuscationGuard) {
        int discarded$42 = 0;
        int discarded$43 = 0;
        int var3;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        var3 = Pool.field_O;
        if (obfuscationGuard > -64) {
          return;
        }
        if (DebouncedValidationProvider.isAccountFlowReady(true)) {
          stackIn_10_1 = false;
          stackIn_11_2 = (MatchingTextValidator.field_u != null);
          discarded$42 = this.serviceAccountActions(stackIn_10_1, stackIn_11_2, -114);
        } else {
          if (QuickChatCategoryDefinition.field_y >= 10) {
            if (!MeshRenderSupport.isIntroComplete(77)) {
              LookupProtocolSupport.advanceIntroTick(121);
            } else {
              if (PlasmaTableScene.field_ab != 0) {
                ModelOriginSupport.processAccountDialogInput(0, CompressedContainerSupport.field_d);
              } else {
                discarded$43 = this.serviceAccountActions(false, false, -124);
              }
            }
          }
        }
    }

    private final void readSessionCookieResponse(int param0) {
        if (param0 != 6) {
          this.serviceStartupAndAccountFlow((byte) -16);
        }
        String var2 = BallDebugOverlay.readPacketString(false);
        NameEntryPopup.setSessionCookie(NanoTickClock.getApplet(115), -18788, var2);
    }

    final int pollAccountActions(boolean param0, boolean param1) {
        if (param1) {
          return -1;
        }
        return this.serviceAccountActions(true, param0, -105);
    }

    private final void readBrowserUrlResponse(int param0) {
        int var4 = 122 % ((-11 - param0) / 50);
        int var2 = PlayerContextMenu.field_e.readUnsignedByte(-74);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = -1 + ScrollPane.field_Pb;
        byte[] var6 = new byte[var5];
        PlayerContextMenu.field_e.readCipheredBytes(0, -109, var6, var5);
        AppletUrlSupport.openUrl(-10553, NanoTickClock.getApplet(70), Cp1252DecodingSupport.decodeBytesToString(var6, -99), var3 != 0);
    }

    private final int pollReconnect(int param0) {
        int var2;
        if (this.field_n) {
          return -1;
        }
        if (!NameNormalizationSupport.canAttemptLogin((byte) 109)) {
          return -1;
        }
        if (DualLinkNode.field_v) {
          return -1;
        }
        var2 = SectorCacheStore.pollLoginRequest(false, CollisionContact.getAccountUsername(false), true, this.field_x, this.field_w, ByteRecordSubmission.getAccountPassword((byte) 121));
        if (param0 == ~var2) {
          return -1;
        }
        if (var2 == 0) {
          if (PlasmaTableScene.field_ab == 11 &&
            0 == PaletteFontLoader.field_a) {
            LobbyGame.finishLoginInterface((byte) -50);
          }
        } else {
          if (1 == var2) {
            if (PlasmaTableScene.field_ab == 11 &&
              0 == PaletteFontLoader.field_a) {
              LobbyGame.finishLoginInterface((byte) -50);
            }
          } else {
            if (!LoginPayloadFactory.field_f) {
              this.redirectToErrorPage((byte) 22, "reconnect");
            }
            DebugTuningSupport.requestAccountInterface(param0 + 11);
            LoginPayload.showLoginError(true, LoginTextValue.field_g, var2);
            DualLinkNode.field_v = true;
            MenuSelection.field_k = MonotonicClock.monotonicTimeMillis((byte) -93) + 15000L;
          }
        }
        return var2;
    }

    private final void enableArchiveKeyResponses(int param0) {
        if (param0 < 27) {
          field_s = (Sprite) null;
        }
        ButtonWidget.field_H[1] = true;
    }

    final void serviceFramework(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        int stackIn_102_0 = 0;
        boolean stackIn_103_1 = false;
        boolean stackIn_106_2 = false;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Pool.field_O;
        if (PlasmaTableScene.field_gb != null) {
          if (MatchingTextValidator.field_u == null) {
            var6 = AppletContainerSupport.getTopLevelContainer(false);
            var4 = var6.getSize();
            PlasmaTableScene.field_gb.setAvailableSize(var4.width, 51, var4.height);
          }
          PlasmaTableScene.field_gb.updateViewportSize(true);
        }
        MouseWheelInput.snapshotKeyboardState(127);
        FixedAngleSupport.snapshotPointerInput((byte) 123);
        if (!StartupInterfaceSupport.requiresStartupScreen((byte) -124) &&
          PlasmaTableScene.field_ab != 11) {
          PacketDiagnosticsSupport.updateAccountOverlay(-11);
        }
        if (null != ClientException.field_a) {
          CompressedContainerSupport.field_d = ClientException.field_a.takeRotation(2);
        }
        if (LobbyPlayerLookupSupport.isLoginComplete(-66)) {
          var3 = CachedArchiveSource.getTargetFramesPerSecond(-21282) * 1200;
          if (this.field_C ||
            !(var3 >= LogoMaterial.getKeyboardSnapshotCount(-21055)) &&
            !(PaletteFontLoader.getMouseIdleTicks((byte) 119) <= var3)) {
            this.field_C = false;
            ShotEvent.closeClientSocket(-80);
            DebugTuningSupport.requestAccountInterface(param0 + 15);
            LoginPayload.showLoginError(true, IterableNodeHashTable.idlemessage20min, 2);
            AvailabilityQueryResult.validateQueryGuard(640);
            DualLinkNode.field_v = true;
            MenuSelection.field_k = 15000L + MonotonicClock.monotonicTimeMillis((byte) -101);
          }
        }
        if (param0 != -4) {
          this.pollAccountActions(true, false);
        }
        if (PaletteFontLoader.field_a == -1 ||
          PaletteFontLoader.field_a == 0) {
          stackIn_26_0 = (PaletteFontLoader.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          PaletteFontLoader.field_a = TextureCache.pollArchiveLoading(-69);
          if (var3Lifetime1 != 0 &&
            PaletteFontLoader.field_a == 0 &&
            11 == PlasmaTableScene.field_ab &&
            !NameNormalizationSupport.canAttemptLogin((byte) 109)) {
            LobbyGame.finishLoginInterface((byte) 124);
          }
          if (-1 != PaletteFontLoader.field_a &&
            PaletteFontLoader.field_a != 0) {
            MenuSelection.field_k = MonotonicClock.monotonicTimeMillis((byte) -99) + 15000L;
          }
        }
        if (PaletteFontLoader.field_a != -1 &&
          PaletteFontLoader.field_a != 0) {
          if (10 <= QuickChatCategoryDefinition.field_y) {
            if (PlasmaTableScene.field_ab >= 10) {
              DebugTuningSupport.requestAccountInterface(11);
              if (3 != PaletteFontLoader.field_a) {
                if (PaletteFontLoader.field_a != 4) {
                  if (PaletteFontLoader.field_a == 2) {
                    LoginPayload.showLoginError(true, PackedColorSupport.errorJs5connectFull, 256);
                  } else {
                    if (PaletteFontLoader.field_a == 5) {
                      LoginPayload.showLoginError(true, GlowParticle.loginGameupdated, 5);
                    } else {
                      LoginPayload.showLoginError(true, FontPaletteSupport.errorJs5connect, 256);
                    }
                  }
                } else {
                  LoginPayload.showLoginError(true, LocalGameSetupScreen.errorJs5io, 256);
                }
              } else {
                LoginPayload.showLoginError(true, LoginRequiredScreen.errorJs5crc, 256);
              }
              DualLinkNode.field_v = true;
            }
          } else {
            if (PaletteFontLoader.field_a != 3) {
              if (PaletteFontLoader.field_a != 4) {
                if (PaletteFontLoader.field_a != 2) {
                  if (5 != PaletteFontLoader.field_a) {
                    this.redirectToErrorPage((byte) -93, "js5connect");
                  } else {
                    this.redirectToErrorPage((byte) 103, "outofdate");
                  }
                } else {
                  this.redirectToErrorPage((byte) -30, "js5connect_full");
                }
              } else {
                this.redirectToErrorPage((byte) -2, "js5io");
              }
            } else {
              this.redirectToErrorPage((byte) -117, "js5crc");
            }
          }
        }
        if ((-1 != PaletteFontLoader.field_a &&
          PaletteFontLoader.field_a != 0 ||
          NameNormalizationSupport.canAttemptLogin((byte) 109)) &&
          MenuSelection.field_k <= MonotonicClock.monotonicTimeMillis((byte) -126)) {
          DualLinkNode.field_v = false;
          if (-1 != PaletteFontLoader.field_a &&
            0 != PaletteFontLoader.field_a) {
            PaletteFontLoader.field_a = -1;
            ProgressDialog.resetArchiveConnectionFailures((byte) 72);
          }
        }
        if (PaletteFontLoader.field_a == 0 &&
          !NameNormalizationSupport.canAttemptLogin((byte) 109)) {
          PasswordValidator.field_o = false;
        }
        if (QuickChatCategoryDefinition.field_y == 0 &&
          DirectByteStorage.ensureMasterIndex(-11071)) {
          QuickChatCategoryDefinition.field_y = 1;
        }
        if (1 == QuickChatCategoryDefinition.field_y) {
          if (ProgressBarWidget.field_S != 0) {
            QuickChatPhraseRegistry.field_a = ArchiveFactory.createResourceArchive(Atan2Support.field_d, (byte) 103);
          }
          WorldPointProjectionSupport.field_d = CipherPacketBuffer.createCachedArchive(false, -4, 1, MeshColorSupport.field_a, true);
          PolarTableScene.field_nb = CipherPacketBuffer.createCachedArchive(false, -49, 1, BrowserCookieSupport.field_g, true);
          DualLinkNode.field_r = CipherPacketBuffer.createCachedArchive(false, -40, 1, TikiTableScene.field_eb, true);
          QuickChatMenu.field_Zb = PolarTableScene.field_nb;
          QuickChatCategoryDefinition.field_y = 2;
          Under13NoticePanel.field_R = WorldPointProjectionSupport.field_d;
        }
        if (QuickChatCategoryDefinition.field_y == 2) {
          if (QuickChatPhraseRegistry.field_a != null &&
            QuickChatPhraseRegistry.field_a.isIndexReady(85)) {
            if (!QuickChatPhraseRegistry.field_a.hasGroupNamed((byte) -122, "")) {
              QuickChatPhraseRegistry.field_a = null;
            } else {
              if (QuickChatPhraseRegistry.field_a.ensureGroupAvailableByName("", param0 ^ -4)) {
                TranslatedUiText.loadLocalizedStrings(QuickChatPhraseRegistry.field_a, -21013);
                QuickChatPhraseRegistry.field_a = null;
                ArrayWidgetGroup.resetFrameTiming(0);
              }
            }
          }
          if (QuickChatPhraseRegistry.field_a == null) {
            QuickChatCategoryDefinition.field_y = 3;
          }
        }
        if (QuickChatCategoryDefinition.field_y == 3 &&
          DropTargetWidget.ensureCommonUiResources(WorldPointProjectionSupport.field_d, PolarTableScene.field_nb, DualLinkNode.field_r, true) &&
          ArchiveAvailabilitySupport.isArchiveFullyAvailable(DualLinkNode.field_r, true)) {
          ShotEvent.releaseAwtLoadingResources(8192);
          MenuSelection.validateSelectionGuard((byte) 98);
          TextWidgetPainter.field_n = UiComponentNode.loading;
          ClassicBallSkin.field_o = false;
          PoolMatchController.loadInterfaceAssets(param0 ^ 11934, CushionSegment.field_g, WorldPointProjectionSupport.field_d, DualLinkNode.field_r, PolarTableScene.field_nb);
          if (LinkButtonPainter.field_g ||
            null != InstructionsScreen.field_J) {
            stackIn_102_0 = -122;
            stackIn_103_1 = !(LinkButtonPainter.field_g);
            stackIn_106_2 = !(LinkButtonPainter.field_g);
            ScoreboardNameRecord.initializeLoginDialog(stackIn_102_0, stackIn_103_1, stackIn_106_2, InstructionsScreen.field_J);
          }
          if (Under13NoticePanel.field_T) {
            PoolGameModel.showAccountProgressForResult(4);
          }
          if (null == GzipDecoder.field_c) {
            GzipDecoder.field_c = BufferedSocket.getSoundEffectMixer(105);
            MeshRenderSupport.field_a = GameRules.getAudioBufferMillis(108);
          }
          DraggableWidget.initializeLogoIntro(DualLinkNode.field_r, MeshRenderSupport.field_a, false, GzipDecoder.field_c);
          DualLinkNode.field_r = null;
          PolarTableScene.field_nb = null;
          WorldPointProjectionSupport.field_d = null;
          MusicVoice.readUsernameParameter(-23989, (java.applet.Applet) (this));
          ArrayWidgetGroup.resetFrameTiming(0);
          QuickChatCategoryDefinition.field_y = 10;
        }
        if (QuickChatCategoryDefinition.field_y == 10) {
          if (ProgressBarWidget.field_S != 0) {
            GameApplet.field_m = ArchiveFactory.createResourceArchive(SharedWidgetLayoutSupport.field_c, (byte) 103);
          }
          QuickChatCategoryDefinition.field_y = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (QuickChatCategoryDefinition.field_y == 11) {
          if (GameApplet.field_m != null && (!GameApplet.field_m.isIndexReady(param0 ^ -52) ||
            !GameApplet.field_m.ensureAllGroupsAvailable(param0 ^ 61))) {
            KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(GameApplet.field_m, BufferedFile.field_b, -641, SingleChildWidget.field_F), 0.0f, false);
            decompiledFrameRemainder0 = false;
          }
          else {
            FullscreenFocusCanvas.field_c = true;
            QuickChatCategoryDefinition.field_y = 12;
          }
        }
        if (QuickChatCategoryDefinition.field_y == 12 &&
          !FullscreenFocusCanvas.field_c) {
          QuickChatCategoryDefinition.field_y = 13;
        }
        if (QuickChatCategoryDefinition.field_y == 13) {
          var3Lifetime2 = 1;
          if (SpriteSheetLoadSupport.field_e != null) {
            stackIn_138_0 = (!SpriteSheetLoadSupport.field_e.pollLoaded((byte) -51)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            KeyHandler.setLoadingProgress(SpriteSheetLoadSupport.field_e.statusText, SpriteSheetLoadSupport.field_e.scaledProgress, false);
          }
          if (var3Lifetime2 != 0) {
            QuickChatCategoryDefinition.field_y = 20;
          }
        }
        if (!param1 &&
          TabbedPane.field_Sb) {
          CanvasInputSupport.detachInputListeners(TimeTrialSelectScreen.field_K, 0);
          this.recreateCanvas((byte) 86);
          CanvasInputAttachmentSupport.attachInputListeners(TimeTrialSelectScreen.field_K, 2);
        }
        if (ButtonWidget.field_H[8]) {
          StrongCacheEntry.flushReflectionReplies(119);
        }
    }

    private final void enableBaseResponses(int param0, boolean param1) {
        ButtonWidget.field_H[18] = true;
        ButtonWidget.field_H[3] = true;
        ButtonWidget.field_H[17] = true;
        ButtonWidget.field_H[param0] = true;
        ButtonWidget.field_H[7] = true;
        ButtonWidget.field_H[16] = true;
        ButtonWidget.field_H[8] = param1;
    }

    private final void initializeAccountPacketLengths(byte param0) {
        EmailValidator.field_m[4] = -1;
        EmailValidator.field_m[2] = -2;
        EmailValidator.field_m[16] = -1;
        EmailValidator.field_m[8] = -2;
        EmailValidator.field_m[13] = -1;
        EmailValidator.field_m[3] = -1;
        EmailValidator.field_m[9] = -1;
        EmailValidator.field_m[18] = 1;
        EmailValidator.field_m[12] = -1;
        EmailValidator.field_m[17] = -1;
        EmailValidator.field_m[1] = 16;
        EmailValidator.field_m[6] = -2;
        EmailValidator.field_m[5] = -1;
        EmailValidator.field_m[7] = -1;
        EmailValidator.field_m[10] = -1;
        EmailValidator.field_m[11] = -1;
        if (param0 != -81) {
          this.field_u = 93;
        }
    }

    final static Sprite[] loadSpriteSheetByName(int obfuscationGuard, ResourceArchive archive, String fileName, String groupName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        PoolMatchController var6 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 36) {
            var6 = (PoolMatchController) null;
            NetworkGameClient.advanceNotifications((byte) -107, (PoolMatchController) null);
          }
          var4_int = archive.getGroupId(groupName, -1);
          var5 = archive.getFileId(var4_int, 0, fileName);
          stackIn_3_0 = LobbyPlayer.loadSpriteSheet(var4_int, var5, 0, archive);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ep.DA(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (fileName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    protected NetworkGameClient() {
    }

    final int serviceAccountFlow(byte param0) {
        int var2;
        int var3;
        var2 = -86 % ((param0 + 81) / 39);
        var3 = this.pollReconnect(0);
        if (var3 == 0 ||
          var3 == 1) {
          if (ButtonWidget.field_H[1]) {
            LookupRetrySupport.resendLookupQueries(true, 2);
          }
          if (ButtonWidget.field_H[2]) {
            HighScoreRequest.resendHighScoreOperations(3, true);
          }
          if (ButtonWidget.field_H[3]) {
            VerticalScrollbar.resendAchievementAndAccountQueries((byte) 58, 4);
          }
          if (ButtonWidget.field_H[4]) {
            EightBallRules.resendIntegerRecordOperations(5, true);
          }
          if (ButtonWidget.field_H[5]) {
            MeshBase.resendByteRecordOperations(10, 6);
          }
          if (ButtonWidget.field_H[6]) {
            TranslatedUiText.resendRankingsRequests(7, (byte) -91);
          }
          if (ButtonWidget.field_H[8]) {
            MusicCrossfadeStream.initializeReflectionCheckQueue(946);
          }
        }
        return var3;
    }

    static {
        tutorialTitleNineBall = "Nine-ball Tutorial";
        thisisrunescapeclanNotowner = "This is <%0>'s RuneScape clan if they have one.";
        field_z = false;
        reportXForAbuse = "Report <%0> for abuse";
        field_s = new Sprite(360, 240);
        loginCreateaccount = "Log in / Create account";
    }
}
