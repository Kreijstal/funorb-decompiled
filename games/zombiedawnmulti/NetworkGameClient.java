/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    static String field_r;
    private boolean field_m;
    static Sprite field_u;
    private int field_y;
    private int field_C;
    static String field_n;
    private boolean field_z;
    private int field_p;
    static MenuInputState field_B;
    private long field_D;
    private boolean field_s;
    static int field_x;
    static boolean field_t;
    private int field_A;
    static java.applet.Applet field_w;
    static String[] field_l;
    String field_v;
    private int field_q;
    private int field_o;

    private final void enableRequestReplyPackets(byte param0) {
        if (param0 < 116) {
          field_w = (java.applet.Applet) null;
        }
        SoundEffectInstance.field_l[1] = true;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 10) {
          NetworkGameClient.releaseStatics(-41);
        }
        field_u = null;
        field_r = null;
        field_B = null;
        field_w = null;
        field_l = null;
        field_n = null;
    }

    private final int pollReconnect(int param0) {
        int var2;
        if (this.field_f) {
          return -1;
        }
        if (!AccountServerResult.isLoggedInWithAccount(100)) {
          return -1;
        }
        if (AccountTextGlobals.field_a) {
          return -1;
        }
        var2 = PropObject.performLoginRequest(14, true, this.field_s, DelayedPacket.getPendingPassword(-19385), StatusAndMeshHelpers.getStatusMessage((byte) 32), this.field_q);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!SineTableHelpers.field_e) {
            this.reportError(param0 + 13654, "reconnect");
          }
          TickButtonPainter.advanceToLoginRequest(-114);
          MeltdownPuddle.showLoginResponse(true, var2, InstructionsScreen.field_q);
          if (param0 != 13546) {
            field_B = (MenuInputState) null;
          }
          AccountTextGlobals.field_a = true;
          SocketConnector.field_e = ClockAndScreenHelpers.monotonicMillis((byte) 39) + 15000L;
          return var2;
        }
        if (LoginSuccessHelpers.field_b == 11 &&
          AccountServerResult.field_a == 0) {
          LoginSuccessHelpers.handleLoginSuccess(-1);
        }
        return var2;
    }

    final void initializeFramework(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ObjectFactoryHelpers.field_e = this.field_C;
        HumanView.selectLanguageStrings(-7733, ObjectFactoryHelpers.field_e);
        TransitionPhase.configureConnection(param1, -5989, this.field_D, this.field_A, this.field_p, ObjectFactoryHelpers.field_e, ArrayWidgetGroup.field_J, param5, this.field_m, this.field_o, 5000, 5000, this.field_v, this.field_y);
        PhantomDecoy.initializeArchiveServices(this.field_p, this.field_y, this.field_v, ObjectFactoryHelpers.field_e, this.field_A, ArrayWidgetGroup.field_J, param5, this.field_o, (byte) -106);
        KeyMapHelpers.configurePunctuationKeys((byte) 116);
        FullscreenFocusCanvas.field_a = LabeledChildWidget.createMouseWheelInput(false);
        LoginPacketHelpers.attachCanvasInput(100, NameEntryPopup.field_Ib);
        PasswordTextPainter.field_z = param3;
        ContextMenu.field_Lb = param2;
        PortalView.field_G = param0;
        if (param7 > -35) {
          this.enableRequestReplyPackets((byte) 2);
        }
        HotspotTextWidget.field_R = param6;
        PasswordTextPainter.field_y = param4;
        this.initializeAccountPacketLengths((byte) 27);
        FeatureSupportHelpers.resetFeatureMask((byte) 81);
    }

    private final void enableChatResponses(int param0) {
        if (param0 != -26837) {
          this.updateLoginFlow(-7);
        }
        SoundEffectInstance.field_l[13] = true;
        SoundEffectInstance.field_l[12] = true;
        SoundEffectInstance.field_l[11] = true;
    }

    final static UiComponent getPlayerListContent(int param0) {
        if (param0 >= -45) {
          return (UiComponent) null;
        }
        return StrongCacheEntry.field_B.field_Ib;
    }

    final static ChaseEvent obtainChaseEvent(int param0, boolean param1, int param2, int param3) {
        ChaseEvent var4 = (ChaseEvent) (LoginSuccessHelpers.field_c.removeLast(69));
        if (var4 == null) {
          var4 = new ChaseEvent();
        }
        if (!param1) {
          var4.setEventData(param3, param2, param1, param0);
          return var4;
        }
        return (ChaseEvent) null;
    }

    private final void enableBaseResponses(boolean param0, int param1) {
        SoundEffectInstance.field_l[3] = true;
        if (param1 != -7793) {
          NetworkGameClient.getPlayerListContent(-38);
        }
        SoundEffectInstance.field_l[16] = true;
        SoundEffectInstance.field_l[0] = true;
        SoundEffectInstance.field_l[18] = true;
        SoundEffectInstance.field_l[7] = true;
        SoundEffectInstance.field_l[8] = param0;
        SoundEffectInstance.field_l[17] = true;
    }

    private final void readAppletParameters(String param0, int param1, int param2, int param3, byte param4) {
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
            if (!this.isHostAllowed(0)) {
              return;
            }
            this.field_v = this.getCodeBase().getHost();
            var6 = this.field_v.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_s = stackIn_7_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_o = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_A = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_D = Long.parseLong(this.getParameter("instanceid"));
            this.field_m = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_C = Integer.parseInt(var8);
            }
            if (this.field_C >= 5) {
              this.field_C = 0;
            }
            var9 = this.getParameter("affid");
            if (param4 >= -125) {
              field_w = (java.applet.Applet) null;
            }
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            TickClock.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletShell(this.field_p, param1, 32, 32000, param2, param0, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            MouseInputHandler.reportClientError((String) null, (Throwable) ((Object) var6_ref), false);
            this.reportError(27200, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("aq.V(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void enableQueuedRequestPackets(int param0) {
        SoundEffectInstance.field_l[2] = true;
        if (param0 > -36) {
          this.field_q = -11;
        }
    }

    private final void readSessionCookieResponse(boolean param0) {
        if (param0) {
          return;
        }
        String var2 = ResizableDialog.readPacketString(103);
        PendingIntArrayReply.setSessionCookie(StatefulTextPainter.getHostApplet(0), -44, var2);
    }

    private final void readBrowserUrlResponse(int param0) {
        int var2 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var5 = 84 % ((param0 - 53) / 42);
        int var4 = -1 + EmailAvailabilityValidator.field_q;
        byte[] var6 = new byte[var4];
        StatusAndMeshHelpers.field_e.readCipheredBytes(var4, 0, 0, var6);
        NodeHashTable.openUrlInNewWindow(StatefulTextPainter.getHostApplet(0), var3 != 0, (byte) -45, GameHud.decodeText(-2739, var6));
    }

    final void startWithDefaultSize(String param0, int param1, byte param2) {
        try {
          int var4_int = 121 % ((-11 - param2) / 51);
          this.readAppletParameters(param0, 640, 480, param1, (byte) -126);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aq.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void initializeAccountPacketLengths(byte param0) {
        HotspotTextWidget.field_U[3] = -1;
        HotspotTextWidget.field_U[10] = -1;
        HotspotTextWidget.field_U[5] = -1;
        HotspotTextWidget.field_U[6] = -2;
        HotspotTextWidget.field_U[7] = -1;
        HotspotTextWidget.field_U[8] = -2;
        HotspotTextWidget.field_U[11] = -1;
        HotspotTextWidget.field_U[2] = -2;
        HotspotTextWidget.field_U[1] = 16;
        HotspotTextWidget.field_U[17] = -1;
        HotspotTextWidget.field_U[13] = -1;
        HotspotTextWidget.field_U[16] = -1;
        HotspotTextWidget.field_U[18] = 1;
        if (param0 == 27) {
          HotspotTextWidget.field_U[12] = -1;
          HotspotTextWidget.field_U[9] = -1;
          HotspotTextWidget.field_U[4] = -1;
          return;
        }
    }

    private final void enableListResponsePackets(byte param0) {
        if (param0 != 40) {
          this.field_m = true;
        }
        SoundEffectInstance.field_l[4] = true;
    }

    final void dispatchServerPacket(int param0) {
        boolean stackIn_33_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -13) {
          this.readBrowserUrlResponse(-72);
        }
        var2 = PortalEntryEvent.field_i;
        if (var2 < 64 &&
          SoundEffectInstance.field_l[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            JaggrabDownloader.consumeQueuedRequestReply(0);
          } else {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 == 4) {
                  LoginPacketHelpers.handleQueuedEntryReply((byte) 126);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      CipherPacketBuffer.readRankingsResponse((byte) 104);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            ValidationState.readLocalPlayerName(false);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                PlayerProfile.handleFriendListPacket((byte) 96);
                                return;
                              }
                              if (var2 == 17) {
                                this.readBrowserUrlResponse(110);
                                return;
                              }
                              if (var2 == 18) {
                                ArchiveAvailabilityHelpers.readQuickChatOnlyFlag((byte) 124);
                                return;
                              }
                              MouseInputHandler.reportClientError("MGS1: " + LevelFileList.describeCurrentPacket(0), (Throwable) null, false);
                              ClientShellHelpers.closeGameSocket((byte) -114);
                              return;
                            }
                            stackIn_33_0 = (var2 == 12);
                            var3 = MusicPatchEnvelope.readChatMessage(stackIn_33_0, (byte) 107);
                            MeltdownPuddle.acceptChatMessage(var3, -53);
                          }
                        } else {
                          AgeValidator.handleReflectionCheck(EmailAvailabilityValidator.field_q, StatusAndMeshHelpers.field_e, ArrayWidgetGroup.field_J, -4);
                        }
                      } else {
                        this.readSessionCookieResponse(false);
                      }
                    }
                  } else {
                    LinkButtonPainter.readSavedDataReply(param0 ^ 9350);
                  }
                }
              } else {
                NavigationGrid.handlePendingRequestReply(1);
              }
            } else {
              RubbleChunk.handleRankingResponse(3);
            }
          }
          return;
        }
        MouseInputHandler.reportClientError("MGS2: " + LevelFileList.describeCurrentPacket(0), (Throwable) null, false);
        ClientShellHelpers.closeGameSocket((byte) -125);
    }

    private final void enableSavedDataResponses(int param0) {
        SoundEffectInstance.field_l[5] = true;
        if (param0 < 120) {
          this.field_y = 46;
        }
    }

    private final int processAccountUiActions(int param0, boolean param1, boolean param2) {
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
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = ClientShellHelpers.pollAccountDialogResult(ObjectFactoryHelpers.field_e, -5, param2, ByteStorage.field_d);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = PowerupEvent.pollLoginRequest(RasterBuffer.createAccountNameValue((byte) -118), QuickChatPhraseRegistry.createLoginCredentials(param0 ^ -2198), 32475);
            if (var5_int != -1) {
              DefaultQuickChatContext.handleAccountRequestResult(0, ContainerUnpackHelpers.field_b, InstructionsScreen.field_q, var5_int);
              InstructionsScreen.field_q = null;
              ContainerUnpackHelpers.field_b = null;
            }
            var11 = SocketConnector.takePendingBooleanResult((byte) -125);
            if (var11 != null) {
              FlaggedTextValue.setLoginNameEnabled(16772, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = SimEntity.pollRegistrationRequest(PendingRankingRequest.getNewsletterOptIn((byte) -98), this.field_q, ArchiveLoadStep.getPendingEmail(param0 ^ -2218), -125, DelayedPacket.getPendingPassword(-19385), StatusAndMeshHelpers.getStatusMessage((byte) 32), GameCharacter.getRegistrationAge((byte) -80));
            if (var5_intLifetime1 != -1) {
              InfectionEvent.handleAccountCreationResult(ContainerUnpackHelpers.field_b, 31407, var5_intLifetime1, InstructionsScreen.field_q);
              ContainerUnpackHelpers.field_b = null;
              InstructionsScreen.field_q = null;
            }
          }
          if (3 == var4) {
            if (AccountServerResult.field_a != -1 &&
              AccountServerResult.field_a != 0) {
              AccountServerResult.field_a = -1;
              KeyMapHelpers.resetTransferErrorCounters((byte) -98);
            }
            if (param1) {
              AccountTextGlobals.field_a = false;
            } else {
              var5_intLifetime2 = PropObject.performLoginRequest(param0 + 2211, false, this.field_s, DelayedPacket.getPendingPassword(param0 ^ 17196), StatusAndMeshHelpers.getStatusMessage((byte) 32), this.field_q);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  MeltdownPuddle.showLoginResponse(true, var5_intLifetime2, InstructionsScreen.field_q);
                  InstructionsScreen.field_q = null;
                } else {
                  LobbyRequestHelpers.field_d = TickClock.field_d;
                  LoginSuccessHelpers.handleLoginSuccess(-1);
                  LoginSuccessHelpers.field_b = 10;
                  ZombieDrop.field_N = false;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!LobbyRequestHelpers.field_e) {
              LoginSuccessHelpers.field_b = 10;
              ZombieDrop.field_N = true;
            } else {
              MarkerSliderWidget.logoutAndReload(-1, StatefulTextPainter.getHostApplet(0));
            }
          }
          if (5 == var4) {
            QuitPageHelpers.openQuitPage(StatefulTextPainter.getHostApplet(param0 ^ -2197), false);
          }
          if (var4 == 6 &&
            MenuInputState.field_m) {
            LoginSuccessHelpers.field_b = 10;
          }
          if (var4 == 7) {
            BrowserPageHelpers.openServerListPage(StatefulTextPainter.getHostApplet(param0 ^ -2197), 3);
          }
          if (var4 == 8) {
            MarkerSliderWidget.logoutAndReload(param0 + 2196, StatefulTextPainter.getHostApplet(0));
          }
          if (var4 == 9) {
            SupportPageHelpers.openSupportPage(8355711, StatefulTextPainter.getHostApplet(0));
          }
          if (var4 == 10) {
            TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 17);
          }
          if (var4 == 11) {
            BirthDateInputWidget.reloadPage(false, StatefulTextPainter.getHostApplet(0));
          }
          if (var4 == 12) {
            LoginCredentials.openRelativeUrl(StatefulTextPainter.getHostApplet(0), GameHud.getPendingUrl(6958), 49);
          }
          if (13 == var4) {
            try {
              if (null == DateInputWidget.field_I) {
                DateInputWidget.field_I = new JaggrabDownloader(ArrayWidgetGroup.field_J, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (DateInputWidget.field_I.poll(-90)) {
                var12 = DateInputWidget.field_I.getResponse((byte) 21);
                if (var12 != null) {
                  var7 = TextDecodeHelpers.decodeSingleByteText(var12.position, var12.payload, false, 0);
                  ProgressDialog.receiveCountryList((byte) 126, var7);
                } else {
                  var9 = (String) null;
                  ProgressDialog.receiveCountryList((byte) -110, (String) null);
                }
                DateInputWidget.field_I = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              MouseInputHandler.reportClientError("S1", (Throwable) ((Object) var5), false);
              var10 = (String) null;
              ProgressDialog.receiveCountryList((byte) -69, (String) null);
              DateInputWidget.field_I = null;
            }
          }
          if (var4 == 15) {
            LoginSuccessHelpers.field_b = 10;
          }
          if (param0 != -2197) {
            this.field_z = false;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 != var4) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enableRankingsPackets(byte param0) {
        SoundEffectInstance.field_l[6] = true;
        if (param0 > -35) {
          field_t = false;
        }
    }

    final void serviceFramework(byte param0, boolean param1) {
        int stackIn_23_0 = 0;
        String stackIn_103_0 = null;
        boolean stackIn_104_1 = false;
        int stackIn_106_2 = 0;
        boolean stackIn_107_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ArchiveProvider.field_g != null) {
          if (FullscreenSupport.field_f == null) {
            var6 = LevelEncodingHelpers.getTopLevelContainer(30);
            var4 = var6.getSize();
            ArchiveProvider.field_g.setDesiredSize(var4.width, (byte) -119, var4.height);
          }
          ArchiveProvider.field_g.updateViewport(-12371);
        }
        KeyboardStateHelpers.pollKeyboardState(param0 ^ 50);
        ArmedHumanView.latchInputState((byte) -126);
        if (!DialogLayer.canShowAdvert((byte) -126) &&
          11 != LoginSuccessHelpers.field_b) {
          PortalEntryEvent.updateDialogLayer(param0 - 93);
        }
        if (FullscreenFocusCanvas.field_a != null) {
          ByteStorage.field_d = FullscreenFocusCanvas.field_a.takeRotation(param0 - 216);
        }
        if (IntroScreen.isLoggedInTransportActive(1)) {
          var3 = MenuStyleHelpers.getFramesPerSecond((byte) 63) * 1200;
          if (this.field_z ||
            !(var3 >= ByteStorage.getKeyboardIdleTicks(param0 - 220)) &&
            !(IdleTickHelpers.getIdleTicks(true) <= var3)) {
            this.field_z = false;
            ClientShellHelpers.closeGameSocket((byte) -113);
            TickButtonPainter.advanceToLoginRequest(-107);
            MeltdownPuddle.showLoginResponse(true, 2, LayoutCenterHelpers.field_c);
            AudioServiceHelpers.onIdleTimeout(param0 ^ 8287);
            AccountTextGlobals.field_a = true;
            SocketConnector.field_e = ClockAndScreenHelpers.monotonicMillis((byte) 102) + 15000L;
          }
        }
        if (AccountServerResult.field_a == -1 ||
          0 == AccountServerResult.field_a) {
          stackIn_23_0 = (AccountServerResult.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          AccountServerResult.field_a = DraggableWidget.pollClientConnections(param0 - 104);
          if (var3Lifetime1 != 0 &&
            AccountServerResult.field_a == 0 &&
            11 == LoginSuccessHelpers.field_b &&
            !AccountServerResult.isLoggedInWithAccount(111)) {
            LoginSuccessHelpers.handleLoginSuccess(param0 - 96);
          }
          if (-1 != AccountServerResult.field_a &&
            0 != AccountServerResult.field_a) {
            SocketConnector.field_e = 15000L + ClockAndScreenHelpers.monotonicMillis((byte) 113);
          }
        }
        if (AccountServerResult.field_a != -1 &&
          AccountServerResult.field_a != 0) {
          if (10 > ClientException.field_i) {
            if (AccountServerResult.field_a == 3) {
              this.reportError(27200, "js5crc");
            } else {
              if (AccountServerResult.field_a == 4) {
                this.reportError(27200, "js5io");
              } else {
                if (AccountServerResult.field_a != 2) {
                  if (5 == AccountServerResult.field_a) {
                    this.reportError(27200, "outofdate");
                  } else {
                    this.reportError(param0 + 27105, "js5connect");
                  }
                } else {
                  this.reportError(27200, "js5connect_full");
                }
              }
            }
          } else {
            if (LoginSuccessHelpers.field_b >= 10) {
              TickButtonPainter.advanceToLoginRequest(-69);
              if (AccountServerResult.field_a == 3) {
                MeltdownPuddle.showLoginResponse(true, 256, IndexedSpriteState.field_d);
              } else {
                if (AccountServerResult.field_a == 4) {
                  MeltdownPuddle.showLoginResponse(true, 256, MenuStyleHelpers.field_b);
                } else {
                  if (AccountServerResult.field_a != 2) {
                    if (5 == AccountServerResult.field_a) {
                      MeltdownPuddle.showLoginResponse(true, 5, MouseInputHandler.field_a);
                    } else {
                      MeltdownPuddle.showLoginResponse(true, 256, PowerupBar.field_j);
                    }
                  } else {
                    MeltdownPuddle.showLoginResponse(true, 256, IntHashIndex.field_g);
                  }
                }
              }
              AccountTextGlobals.field_a = true;
            }
          }
        }
        if (param0 != 95) {
          return;
        }
        if ((AccountServerResult.field_a != -1 &&
          AccountServerResult.field_a != 0 ||
          AccountServerResult.isLoggedInWithAccount(86)) &&
          ClockAndScreenHelpers.monotonicMillis((byte) 79) >= SocketConnector.field_e) {
          AccountTextGlobals.field_a = false;
          if (AccountServerResult.field_a != -1 &&
            AccountServerResult.field_a != 0) {
            AccountServerResult.field_a = -1;
            KeyMapHelpers.resetTransferErrorCounters((byte) -111);
          }
        }
        if (AccountServerResult.field_a == 0 &&
          !AccountServerResult.isLoggedInWithAccount(119)) {
          PopupMenuBuilder.field_p = false;
        }
        if (ClientException.field_i == 0 &&
          TertiaryLinkDeque.pollMasterIndex((byte) 98)) {
          ClientException.field_i = 1;
        }
        if (ClientException.field_i == 1) {
          if (ObjectFactoryHelpers.field_e != 0) {
            DisplayNamePanel.field_P = PendingIntArrayRequest.createResourceArchive(5, ContextMenu.field_Lb);
          }
          PendingIntArrayReply.field_l = BirthDateEntryPanel.openArchive(false, PortalView.field_G, 1, -24285, true);
          AccountCreationForm.field_L = BirthDateEntryPanel.openArchive(false, PasswordTextPainter.field_y, 1, -24285, true);
          MarkerSliderWidget.field_V = BirthDateEntryPanel.openArchive(false, PasswordTextPainter.field_z, 1, -24285, true);
          ClientException.field_i = 2;
          LinkButtonPainter.field_f = AccountCreationForm.field_L;
          ResizableDialog.field_eb = PendingIntArrayReply.field_l;
        }
        if (ClientException.field_i == 2) {
          if (DisplayNamePanel.field_P != null &&
            DisplayNamePanel.field_P.ensureIndex((byte) -126)) {
            if (DisplayNamePanel.field_P.hasGroupName("", 2)) {
              if (DisplayNamePanel.field_P.isGroupAvailableByName(false, "")) {
                TranslatedUiText.loadTranslatedStrings(true, DisplayNamePanel.field_P);
                DisplayNamePanel.field_P = null;
                IsaacRandom.resetFrameTimingHistory(26673);
              }
            } else {
              DisplayNamePanel.field_P = null;
            }
          }
          if (null == DisplayNamePanel.field_P) {
            ClientException.field_i = 3;
          }
        }
        if (ClientException.field_i == 3 &&
          PortalView.areGraphicsArchivesReady(AccountCreationForm.field_L, param0 ^ -3795, PendingIntArrayReply.field_l, MarkerSliderWidget.field_V) &&
          FeatureSupportHelpers.hasPlatformFullscreenSupport(MarkerSliderWidget.field_V, 0)) {
          DualLinkNodeHashTable.clearPhaseImageAndCharacterFont(1);
          PulseEffect.noOperation(62);
          MenuInputState.field_m = false;
          SimArmedHuman.field_Bb = SpriteDecodeGlobals.field_e;
          GameResultsScreen.initializeLoginUi(false, LobbyRequestHelpers.field_e, MarkerSliderWidget.field_V, PendingIntArrayReply.field_l, AccountCreationForm.field_L);
          if (SoundStopHelpers.field_f ||
            null != FriendListHelpers.field_g) {
            stackIn_103_0 = FriendListHelpers.field_g;
            stackIn_104_1 = !(SoundStopHelpers.field_f);
            stackIn_106_2 = 127;
            stackIn_107_3 = !(SoundStopHelpers.field_f);
            RankingEntry.openLoginDialog(stackIn_103_0, stackIn_104_1, stackIn_106_2, stackIn_107_3);
          }
          if (TickClock.field_e) {
            LoginMethod.requestPlayAsGuest(4);
          }
          if (null == PacketBuffer.field_l) {
            PacketBuffer.field_l = PlayModeChoiceDialog.getSoundMixer(30);
            TertiaryLinkDeque.field_e = ColourPickerWidget.getAudioBufferMillis(32);
          }
          DialSelectorWidget.prepareLogoAnimation(-3758, TertiaryLinkDeque.field_e, MarkerSliderWidget.field_V, PacketBuffer.field_l);
          MarkerSliderWidget.field_V = null;
          AccountCreationForm.field_L = null;
          PendingIntArrayReply.field_l = null;
          DirectByteStorage.readUsernameParameter((java.applet.Applet) (this), -17708);
          IsaacRandom.resetFrameTimingHistory(26673);
          ClientException.field_i = 10;
        }
        if (ClientException.field_i == 10) {
          if (ObjectFactoryHelpers.field_e != 0) {
            ArchiveRequest.field_s = PendingIntArrayRequest.createResourceArchive(5, HotspotTextWidget.field_R);
          }
          ClientException.field_i = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == ClientException.field_i) {
          if (null != ArchiveRequest.field_s && (!ArchiveRequest.field_s.ensureIndex((byte) -120) ||
            !ArchiveRequest.field_s.areAllGroupsAvailable(param0 - 95))) {
            LoginForm.setLoadingProgress(0.0f, 80, PhantomDecoy.formatArchiveProgress(PendingRankingRequest.field_n, (byte) 121, ArchiveRequest.field_s, DialSelectorWidget.field_Y));
            decompiledFrameRemainder0 = false;
          }
          else {
            ClientException.field_i = 12;
            LoginStartHelpers.field_f = true;
          }
        }
        if (ClientException.field_i == 12 &&
          !LoginStartHelpers.field_f) {
          ClientException.field_i = 13;
        }
        if (13 == ClientException.field_i) {
          var3Lifetime2 = 1;
          if (null != DialWidgetPainter.field_k) {
            stackIn_135_0 = (!DialWidgetPainter.field_k.pollLoading(-94)) ? 0 : 1;
            var3Lifetime2 = stackIn_135_0;
            LoginForm.setLoadingProgress(DialWidgetPainter.field_k.field_d, 80, DialWidgetPainter.field_k.field_j);
          }
          if (var3Lifetime2 != 0) {
            ClientException.field_i = 20;
          }
        }
        if (!param1 &&
          FrameCycleAnimation.field_h) {
          SpriteState.detachCanvasInput(95, NameEntryPopup.field_Ib);
          this.recreateCanvas(-58);
          LoginPacketHelpers.attachCanvasInput(100, NameEntryPopup.field_Ib);
        }
        if (SoundEffectInstance.field_l[8]) {
          AudioServiceHelpers.sendReflectionCheckReplies(param0 ^ -10926);
        }
    }

    protected NetworkGameClient() {
    }

    final int updateAccountUi(boolean param0, int param1) {
        int var3 = -56 / ((6 - param1) / 38);
        return this.processAccountUiActions(-2197, true, param0);
    }

    final void updateLoginFlow(int param0) {
        int discarded$10 = 0;
        int discarded$11 = 0;
        int var3;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        Object stackIn_5_0;
        boolean stackIn_5_3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 17) {
          return;
        }
        if (!SimZombie.isSessionReady(-86)) {
          if (10 <= ClientException.field_i) {
            if (!GameKeyHandler.isTitleAnimationComplete(250)) {
              LevelData.advanceLogoTimer((byte) -9);
            } else {
              if (LoginSuccessHelpers.field_b == 0) {
                discarded$10 = this.processAccountUiActions(-2197, false, false);
              } else {
                DialSelectorWidget.updateLoginDialog(ByteStorage.field_d, 1000);
              }
            }
          }
        } else {
          stackIn_4_1 = -2197;
          stackIn_4_2 = false;
          if (FullscreenSupport.field_f == null) {
            stackIn_5_0 = this;
            stackIn_5_3 = false;
          } else {
            stackIn_5_0 = this;
            stackIn_5_3 = true;
          }
          discarded$11 = this.processAccountUiActions(stackIn_4_1, stackIn_4_2, stackIn_5_3);
        }
    }

    final void enableOptionalPacketHandlers(boolean param0, byte param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.enableBaseResponses(true, -7793);
        if (param1 != -27) {
          NetworkGameClient.obtainChaseEvent(-38, false, -82, 45);
        }
        if (param5) {
          this.enableRequestReplyPackets((byte) 119);
        }
        if (param3) {
          this.enableQueuedRequestPackets(-105);
        }
        if (param2) {
          this.enableListResponsePackets((byte) 40);
        }
        if (param4) {
          this.enableSavedDataResponses(param1 + 154);
        }
        if (param0) {
          this.enableRankingsPackets((byte) -128);
        }
        if (param6) {
          this.enableChatResponses(param1 ^ 26830);
        }
    }

    final int pollReconnectAndResend(int param0) {
        int var2 = this.pollReconnect(13546);
        if (var2 == 0 ||
          1 == var2) {
          if (SoundEffectInstance.field_l[1]) {
            DisplayNameRequestHelpers.resendQueuedListRequests((byte) 80, 2);
          }
          if (SoundEffectInstance.field_l[2]) {
            BrowserPageHelpers.resendQueuedRequests(3, -79);
          }
          if (SoundEffectInstance.field_l[3]) {
            ValidationMessageWidget.resendPendingSubmissions(4, (byte) 73);
          }
          if (SoundEffectInstance.field_l[4]) {
            UsernameSuggestionsPanel.resendPendingRequests(true, 5);
          }
          if (SoundEffectInstance.field_l[5]) {
            AccountCreationForm.resendSavedDataRequests((byte) -121, 6);
          }
          if (SoundEffectInstance.field_l[6]) {
            TertiaryLinkNode.resendRankingsRequests((byte) 126, 7);
          }
          if (SoundEffectInstance.field_l[8]) {
            BufferedFile.clearReflectionChecks((byte) 105);
          }
        }
        if (param0 == 10) {
          return var2;
        }
        return 98;
    }

    static {
        field_r = "Previous";
        field_n = "Please select options in the following rows:  ";
        field_l = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_t = false;
        field_B = new MenuInputState(1);
    }
}
