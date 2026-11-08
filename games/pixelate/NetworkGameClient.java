/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    private boolean field_A;
    private long field_s;
    private int field_u;
    static wm field_r;
    String field_w;
    private int field_y;
    private int field_z;
    private boolean field_v;
    private int field_B;
    private int field_t;
    static wm field_C;
    private boolean field_F;
    private int field_q;
    static int field_D;
    static ModalStack field_x;

    final int runAccountUiActions(boolean param0, byte param1) {
        if (param1 != 96) {
          this.handleOpenUrlPacket((byte) 41);
        }
        return this.processAccountUiActions(param1 ^ 96, param0, true);
    }

    private final void enablePacketHandler(int param0) {
        Checkbox.field_P[param0] = true;
    }

    private final void enablePacketHandler6(int param0) {
        if (param0 < 125) {
          this.handlePacketSevenMessage(-53);
        }
        Checkbox.field_P[6] = true;
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
          var8 = Pixelate.field_H ? 1 : 0;
          var4 = TwistedLogicBackground.a(param0 + 6388, DriftingParticle.field_i, wo.field_d, param1);
          if (param0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = LobbyPlayer.submitDetailsValidationRequest((byte) -127, BoundedRandomAccessFile.createValidationStatusValue((byte) 108), MusicPatchPcmStream.createAccountStatusValue(100));
            if (var5_int != -1) {
              DebouncedValidator.handleAccountRequestResult((byte) -97, MatchController.field_y, var5_int, gi.field_b);
              gi.field_b = null;
              MatchController.field_y = null;
            }
            var11 = ContextActionMenu.takePendingFlag((byte) 104);
            if (var11 != null) {
              nk.completePendingValidation(param0 + 0, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = dn.a(BlastFromThePastBackground.getAccountStatusText(param0 + 0), (byte) 5, this.field_t, Js5ArchiveManager.getLoginStatusText(-13565), MusicCrossfadeStream.getRegistrationAge((byte) 127), ScrollPaneWithFooter.getRegistrationNewsletterOptIn(0), ProxySocketConnector.getAccountRequestStatusText(8192));
            if (-1 != var5_intLifetime1) {
              rh.handleRegistrationResult(true, gi.field_b, MatchController.field_y, var5_intLifetime1);
              gi.field_b = null;
              MatchController.field_y = null;
            }
          }
          if (var4 == 3) {
            if (ScoreMarkerDemo.field_b != -1 &&
              ScoreMarkerDemo.field_b != 0) {
              ScoreMarkerDemo.field_b = -1;
              OptionsScreen.g((byte) 68);
            }
            if (param2) {
              PauseMenuScreen.field_o = false;
            } else {
              var5_intLifetime2 = mi.performLoginRequest(this.field_A, (byte) 28, Js5ArchiveManager.getLoginStatusText(-13565), this.field_t, false, ProxySocketConnector.getAccountRequestStatusText(8192));
              if (-1 != var5_intLifetime2) {
                if (0 == var5_intLifetime2) {
                  ff.field_d = RisingBubble.field_b;
                  GreenGrowTheRushesBackground.onLoginSucceeded(123);
                  el.field_b = 10;
                  IconTextComponent.field_Nb = false;
                } else {
                  ScrollContainer.showLoginResultMessage(true, gi.field_b, var5_intLifetime2);
                  gi.field_b = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (LobbyPlayer.field_Lb) {
              MusicCrossfadeStream.clearSessionAndReload(AudioService.getApplet(param0 ^ 13867), 22770);
            } else {
              el.field_b = 10;
              IconTextComponent.field_Nb = true;
            }
          }
          if (5 == var4) {
            d.openQuitPage(0, AudioService.getApplet(13867));
          }
          if (var4 == 6 &&
            AlphaContainer.field_I) {
            el.field_b = 10;
          }
          if (var4 == 7) {
            PasswordFieldPainter.a((byte) 93, AudioService.getApplet(param0 + 13867));
          }
          if (var4 == 8) {
            MusicCrossfadeStream.clearSessionAndReload(AudioService.getApplet(13867), 22770);
          }
          if (var4 == 9) {
            fc.openSupportPage(AudioService.getApplet(param0 + 13867), (byte) 19);
          }
          if (var4 == 10) {
            ChatMessage.field_f.writeOpcode(17, 15514);
          }
          if (var4 == 11) {
            vf.reloadPage(AudioService.getApplet(13867), 3279);
          }
          if (12 == var4) {
            Vector3.openRelativeUrl((byte) 71, AudioService.getApplet(13867), MusicPatch.getPendingNoticeText((byte) 11));
          }
          if (13 == var4) {
            try {
              if (null == QuickChatCategory.field_w) {
                QuickChatCategory.field_w = new JaggrabDownloader(mc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (QuickChatCategory.field_w.poll((byte) -87)) {
                var12 = QuickChatCategory.field_w.getDownloadedBuffer(3);
                if (var12 == null) {
                  var9 = (String) null;
                  ri.ignoreText((String) null, true);
                } else {
                  var7 = ui.decodeText(true, var12.payload, 0, var12.position);
                  ri.ignoreText(var7, true);
                }
                QuickChatCategory.field_w = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              CheckboxPainter.reportClientError(1, "S1", (Throwable) ((Object) var5));
              var10 = (String) null;
              ri.ignoreText((String) null, true);
              QuickChatCategory.field_w = null;
            }
          }
          if (var4 == 15) {
            el.field_b = 10;
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

    final void serviceFramework(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_101_1 = false;
        boolean stackIn_104_2 = false;
        int stackIn_129_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null != GzipDecoder.field_c) {
          if (null == ib.field_f) {
            var6 = GameApplet.getTopContainer((byte) 99);
            var4 = var6.getSize();
            GzipDecoder.field_c.setRequestedSize(var4.width, 13756, var4.height);
          }
          GzipDecoder.field_c.tick(85);
        }
        LoadingStepTracker.pollKeyboardState((byte) 85);
        cm.snapshotMouseState(-118);
        if (!bd.shouldShowBootstrapLoadingScreen(true) &&
          el.field_b != 11) {
          DualLinkDeque.processUiLayerInput(param0 ^ 49661);
        }
        if (null != ScrollContainer.field_Lb) {
          DriftingParticle.field_i = ScrollContainer.field_Lb.pollRotation(true);
        }
        if (PauseMenuScreen.isGameConnectionOpen(true)) {
          var3 = MenuInputState.getTargetFrameRate(true) * 1200;
          if (this.field_F ||
            !(QuickChatCategoryCache.getInputFrameCount(-115) <= var3) &&
            !(var3 >= GreenGrowTheRushesBackground.getIdleTimeoutLimit(13428))) {
            this.field_F = false;
            na.closeGameSocket(true);
            MainMenuScreen.g((byte) 81);
            ScrollContainer.showLoginResultMessage(true, hm.field_c, 2);
            fe.a(false);
            PauseMenuScreen.field_o = true;
            mc.field_q = 15000L + hm.monotonicMillis(64);
          }
        }
        if (ScoreMarkerDemo.field_b == -1 ||
          ScoreMarkerDemo.field_b == 0) {
          stackIn_26_0 = (ScoreMarkerDemo.field_b != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          ScoreMarkerDemo.field_b = qn.serviceArchiveConnection(59);
          if (var3Lifetime1 != 0 &&
            0 == ScoreMarkerDemo.field_b &&
            el.field_b == 11 &&
            !PlayerController.canPollServerConnection((byte) -59)) {
            GreenGrowTheRushesBackground.onLoginSucceeded(param0 ^ 47);
          }
          if (ScoreMarkerDemo.field_b != -1 &&
            ScoreMarkerDemo.field_b != 0) {
            mc.field_q = 15000L + hm.monotonicMillis(64);
          }
        }
        if (ScoreMarkerDemo.field_b != -1 &&
          0 != ScoreMarkerDemo.field_b) {
          if (10 > hf.field_q) {
            if (ScoreMarkerDemo.field_b == 3) {
              this.redirectToErrorPage(-18310, "js5crc");
            } else {
              if (ScoreMarkerDemo.field_b != 4) {
                if (ScoreMarkerDemo.field_b != 2) {
                  if (ScoreMarkerDemo.field_b == 5) {
                    this.redirectToErrorPage(-18310, "outofdate");
                  } else {
                    this.redirectToErrorPage(param0 - 18310, "js5connect");
                  }
                } else {
                  this.redirectToErrorPage(param0 - 18310, "js5connect_full");
                }
              } else {
                this.redirectToErrorPage(-18310, "js5io");
              }
            }
          } else {
            if (el.field_b >= 10) {
              MainMenuScreen.g((byte) 106);
              if (ScoreMarkerDemo.field_b == 3) {
                ScrollContainer.showLoginResultMessage(true, wo.field_e, 256);
              } else {
                if (ScoreMarkerDemo.field_b == 4) {
                  ScrollContainer.showLoginResultMessage(true, TabbedPanel.field_Ib, 256);
                } else {
                  if (ScoreMarkerDemo.field_b != 2) {
                    if (ScoreMarkerDemo.field_b == 5) {
                      ScrollContainer.showLoginResultMessage(true, aq.field_b, 5);
                    } else {
                      ScrollContainer.showLoginResultMessage(true, JaggrabDownloader.field_k, 256);
                    }
                  } else {
                    ScrollContainer.showLoginResultMessage(true, SectorCacheStore.field_g, 256);
                  }
                }
              }
              PauseMenuScreen.field_o = true;
            }
          }
        }
        if ((param0 != ~ScoreMarkerDemo.field_b &&
          ScoreMarkerDemo.field_b != 0 ||
          PlayerController.canPollServerConnection((byte) -59)) &&
          mc.field_q <= hm.monotonicMillis(64)) {
          PauseMenuScreen.field_o = false;
          if (ScoreMarkerDemo.field_b != -1 &&
            ScoreMarkerDemo.field_b != 0) {
            ScoreMarkerDemo.field_b = -1;
            OptionsScreen.g((byte) 68);
          }
        }
        if (0 == ScoreMarkerDemo.field_b &&
          !PlayerController.canPollServerConnection((byte) -59)) {
          EmailCredentials.field_f = false;
        }
        if (hf.field_q == 0 &&
          SecondaryNodeDeque.pollMasterIndex(param0 ^ 916440577)) {
          hf.field_q = 1;
        }
        if (hf.field_q == 1) {
          if (0 != wo.field_d) {
            DebouncedValidator.field_e = MouseInputHandler.createLocalArchive(QuickChatCategoryCache.field_f, (byte) 124);
          }
          wk.field_j = vm.createArchive(true, (byte) 22, false, Matrix3.field_e, 1);
          LoginMethod.field_g = vm.createArchive(true, (byte) 22, false, IconTextComponent.field_Hb, 1);
          MatchingTextValidator.field_u = vm.createArchive(true, (byte) 22, false, SocketJs5Transport.field_r, 1);
          qn.field_l = wk.field_j;
          dg.field_d = LoginMethod.field_g;
          hf.field_q = 2;
        }
        if (hf.field_q == 2) {
          if (DebouncedValidator.field_e != null &&
            DebouncedValidator.field_e.ensureIndex(-3)) {
            if (!DebouncedValidator.field_e.hasGroupName(param0 + 125, "")) {
              DebouncedValidator.field_e = null;
            } else {
              if (DebouncedValidator.field_e.ensureGroupAvailableByName("", ~param0)) {
                GameModeSelectScreen.loadTextTable(param0 + 31873, DebouncedValidator.field_e);
                DebouncedValidator.field_e = null;
                sf.a(param0 + 0);
              }
            }
          }
          if (null == DebouncedValidator.field_e) {
            hf.field_q = 3;
          }
        }
        if (hf.field_q == 3 &&
          ByteStorage.areCommonUiArchivesReady(LoginMethod.field_g, -123, wk.field_j, MatchingTextValidator.field_u) &&
          pe.areAllGroupsAvailable(MatchingTextValidator.field_u, (byte) -91)) {
          CachedArchiveProvider.clearCachedLobbyPanels((byte) 24);
          SectorCacheStore.serviceNoop((byte) 119);
          ThreeSliceButtonPainter.field_r = FullscreenFocusCanvas.field_c;
          AlphaContainer.field_I = false;
          DebouncedValidator.initializeFrontEnd(LoginMethod.field_g, param0 + 27848, wk.field_j, MatchingTextValidator.field_u, LobbyPlayer.field_Lb);
          if (ri.field_b ||
            null != LobbyGame.field_fc) {
            stackIn_100_0 = param0 - 20;
            stackIn_101_1 = !(ri.field_b);
            stackIn_104_2 = !(ri.field_b);
            RisingBubble.showLoginDialog(stackIn_100_0, stackIn_101_1, stackIn_104_2, LobbyGame.field_fc);
          }
          if (NightToRememberBackground.field_n) {
            CheckboxPainter.a(-22218);
          }
          if (null == QuickChatPhraseDefinition.field_t) {
            QuickChatPhraseDefinition.field_t = VerticalScrollbar.getEffectsMixer((byte) -58);
            DebouncedValidator.field_a = QuickChatMenu.getAudioSampleRate(0);
          }
          em.prepareLogoIntro(QuickChatPhraseDefinition.field_t, 74, DebouncedValidator.field_a, MatchingTextValidator.field_u);
          LoginMethod.field_g = null;
          MatchingTextValidator.field_u = null;
          wk.field_j = null;
          StatusBar.readUsernameParameter(param0 + 125, (java.applet.Applet) (this));
          sf.a(0);
          hf.field_q = 10;
        }
        if (hf.field_q == 10) {
          if (wo.field_d != 0) {
            WidgetStyleLayer.field_f = MouseInputHandler.createLocalArchive(ro.field_c, (byte) 124);
          }
          hf.field_q = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (hf.field_q == 11) {
          if (null != WidgetStyleLayer.field_f && (!WidgetStyleLayer.field_f.ensureIndex(-3) ||
            !WidgetStyleLayer.field_f.ensureAllGroupsAvailable((byte) 92))) {
            FireworkDisplay.setLoadingStatus(0.0f, -1, dk.formatArchiveProgressLabel(wa.field_a, 0, hm.field_a, WidgetStyleLayer.field_f));
            decompiledFrameRemainder0 = false;
          }
          else {
            MatchHud.field_i = true;
            hf.field_q = 12;
          }
        }
        if (hf.field_q == 12 &&
          !MatchHud.field_i) {
          hf.field_q = 13;
        }
        if (hf.field_q == 13) {
          var3Lifetime2 = 1;
          if (gd.field_a != null) {
            stackIn_129_0 = (!gd.field_a.pollLoadSteps(4567)) ? 0 : 1;
            var3Lifetime2 = stackIn_129_0;
            FireworkDisplay.setLoadingStatus(gd.field_a.field_f, -1, gd.field_a.field_e);
          }
          if (var3Lifetime2 != 0) {
            hf.field_q = 20;
          }
        }
        if (!param1 &&
          FireworkSpark.field_i) {
          MenuInputState.removeCanvasInputListeners(NameAvailabilityValidator.field_u, param0 ^ 0);
          this.recreateCanvas(-27106);
          he.attachCanvasInput(0, NameAvailabilityValidator.field_u);
        }
        if (Checkbox.field_P[8]) {
          GradientOutlineTextPainter.writeReflectionCheckResponses(8);
        }
    }

    final void initializeFramework(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        wo.field_d = this.field_z;
        if (!param4) {
          return;
        }
        MenuInputState.selectLanguageStrings(wo.field_d, -31383);
        l.initialisePacketBuffers(false, wo.field_d, 5000, this.field_v, this.field_u, this.field_s, this.field_w, param0, 5000, param1, this.field_y, this.field_q, this.field_B, mc.field_k);
        KeyboardInputHandler.initializeArchiveServices(this.field_u, param0, wo.field_d, this.field_y, mc.field_k, this.field_q, this.field_w, -21462, this.field_B);
        qf.initialiseKeyMap(31171);
        ScrollContainer.field_Lb = bl.createMouseWheelHandler(71);
        he.attachCanvasInput(0, NameAvailabilityValidator.field_u);
        Matrix3.field_e = param6;
        SocketJs5Transport.field_r = param5;
        QuickChatCategoryCache.field_f = param7;
        IconTextComponent.field_Hb = param3;
        ro.field_c = param2;
        this.initializeAccountPacketLengths(-2);
        an.noOperation(0);
    }

    final void dispatchServerPacket(int param0) {
        boolean stackIn_33_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = TextLayoutLine.field_e;
        if (64 > var2 &&
          Checkbox.field_P[var2]) {
          if (param0 != -12) {
            return;
          }
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              ef.readHighscorePacket(false);
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  HighscoresScreen.readHighscoresPacket(-84);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      LoginMethod.readRankingPacket(-123);
                    } else {
                      if (var2 == 7) {
                        this.handlePacketSevenMessage(param0 + 21049);
                      } else {
                        if (8 != var2) {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                InputQueue.readFriendListPacket(-123);
                                return;
                              }
                              if (var2 == 17) {
                                this.handleOpenUrlPacket((byte) 59);
                                return;
                              }
                              if (18 == var2) {
                                cl.readChatAvailabilityPacket(param0 ^ -8237);
                                return;
                              }
                              CheckboxPainter.reportClientError(1, "MGS1: " + Cloud.describePacketHistory(-106), (Throwable) null);
                              na.closeGameSocket(true);
                              return;
                            }
                            stackIn_33_0 = (var2 == 12);
                            var3 = LobbyPlayer.readChatMessage(stackIn_33_0, (byte) 122);
                            fq.acceptChatMessage(var3, (byte) 64);
                          } else {
                            nk.readLocalDisplayName(16711935);
                          }
                        } else {
                          TabbedPanel.readReflectionCheckRequest(-5, MusicCrossfadeStream.field_o, BackgroundScene.field_b, mc.field_k);
                        }
                      }
                    }
                  } else {
                    KiteTailSegment.readSavedDataPacket(107);
                  }
                }
              } else {
                la.readGameOptionsPacket(126);
              }
            }
          } else {
            ef.readListAcknowledgement(-14439);
          }
          return;
        }
        CheckboxPainter.reportClientError(1, "MGS2: " + Cloud.describePacketHistory(param0 - 55), (Throwable) null);
        na.closeGameSocket(true);
    }

    final void updateAccountOrLobbyUi(byte param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 20) {
          this.enablePacketHandler6(-126);
        }
        if (LoadingStepTracker.isLobbyUiReady(122)) {
          discarded$1 = this.processAccountUiActions(0, ib.field_f != null ? true : false, false);
        } else {
          if (hf.field_q < 10) {
          } else {
            if (!RegistrationRequestDialog.isLogoAnimationFinished(22452)) {
              PictureStrip.advanceCardAnimationCounter(124);
            } else {
              if (el.field_b != 0) {
                NameSuggestionsPanel.processWidgetInput((byte) -104, DriftingParticle.field_i);
              } else {
                discarded$2 = this.processAccountUiActions(0, false, false);
              }
            }
          }
        }
    }

    private final void readAppletParameters(byte param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
            if (!this.isHostAllowed((byte) -112)) {
              return;
            }
            this.field_w = this.getCodeBase().getHost();
            var6 = this.field_w.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_A = stackIn_7_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_q = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_B = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_v = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_t = Integer.parseInt(var9);
            }
            NightToRememberBackground.field_n = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletThread(param1, (byte) -104, param2, param3, this.field_u, param4, 32);
            if (param0 != -128) {
              this.enablePacketHandler(-94);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            CheckboxPainter.reportClientError(1, (String) null, (Throwable) ((Object) var6_ref));
            this.redirectToErrorPage(-18310, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_C = null;
        if (!param0) {
          field_C = (wm) null;
        }
        field_r = null;
        field_x = null;
    }

    final void startClientApplet(String param0, int param1, int param2) {
        try {
          this.readAppletParameters((byte) -128, 480, param1, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "lb.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void initializeAccountPacketLengths(int param0) {
        GrowableIntList.field_d[17] = -1;
        GrowableIntList.field_d[18] = 1;
        GrowableIntList.field_d[10] = -1;
        GrowableIntList.field_d[3] = -1;
        GrowableIntList.field_d[1] = 16;
        GrowableIntList.field_d[12] = -1;
        GrowableIntList.field_d[9] = -1;
        GrowableIntList.field_d[7] = -1;
        GrowableIntList.field_d[6] = param0;
        GrowableIntList.field_d[13] = -1;
        GrowableIntList.field_d[2] = -2;
        GrowableIntList.field_d[4] = -1;
        GrowableIntList.field_d[5] = -1;
        GrowableIntList.field_d[8] = -2;
        GrowableIntList.field_d[16] = -1;
        GrowableIntList.field_d[11] = -1;
    }

    private final void handlePacketSevenMessage(int param0) {
        String var2 = MatchingTextValidator.e(480);
        if (param0 != 21037) {
          this.enablePacketHandlerGroups(false, false, true, true, true, false, -110);
        }
        NumericDateInputWidget.setSessionCookie(var2, AudioService.getApplet(param0 ^ 25606), true);
    }

    final int pollLoginResult(int param0) {
        if (param0 != 1272) {
          this.enablePacketHandler6(-20);
        }
        int var2 = this.pollLoginConnection(-85);
        if (0 == var2 ||
          var2 == 1) {
          if (Checkbox.field_P[1]) {
            LoginMethod.resendQueuedListRequests(2, -20304);
          }
          if (Checkbox.field_P[2]) {
            KiteBackground.resendPendingRequests((byte) 32, 3);
          }
          if (Checkbox.field_P[3]) {
            RankingTableRequest.resendProgressRecords(4, (byte) 42);
          }
          if (Checkbox.field_P[4]) {
            VerticalScrollbar.resendQueuedRequests(0, 5);
          }
          if (Checkbox.field_P[5]) {
            bo.resendSaveDataRequests(6, 7);
          }
          if (Checkbox.field_P[6]) {
            AgeValidator.resendRankingQueries((byte) -116, 7);
          }
          if (Checkbox.field_P[8]) {
            MatchHud.resetReflectionCheckQueue(true);
          }
        }
        return var2;
    }

    private final void enablePacketHandler5(byte param0) {
        int var2 = -121 / ((12 - param0) / 42);
        Checkbox.field_P[5] = true;
    }

    final void enablePacketHandlerGroups(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6) {
        this.enableLobbyPacketHandlers((byte) -53, true);
        if (param4) {
          this.enablePacketHandler(1);
        }
        if (param3) {
          this.enablePacketHandler2(17);
        }
        if (param5) {
          this.enablePacketHandler4(61);
        }
        if (param1) {
          this.enablePacketHandler5((byte) 107);
        }
        if (param0) {
          this.enablePacketHandler6(126);
        }
        if (param2) {
          this.enablePacketHandlers11To13((byte) -103);
        }
        if (param6 > -30) {
          this.field_s = -38L;
        }
    }

    private final int pollLoginConnection(int param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!PlayerController.canPollServerConnection((byte) -59)) {
          return -1;
        }
        if (param0 >= -73) {
          this.field_w = (String) null;
        }
        if (PauseMenuScreen.field_o) {
          return -1;
        }
        var2 = mi.performLoginRequest(this.field_A, (byte) 91, Js5ArchiveManager.getLoginStatusText(-13565), this.field_t, true, ProxySocketConnector.getAccountRequestStatusText(8192));
        if (-1 == var2) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!Js5ArchiveManager.field_e) {
            this.redirectToErrorPage(-18310, "reconnect");
          }
          MainMenuScreen.g((byte) 47);
          ScrollContainer.showLoginResultMessage(true, gi.field_b, var2);
          PauseMenuScreen.field_o = true;
          mc.field_q = 15000L + hm.monotonicMillis(64);
          return var2;
        }
        if (el.field_b == 11 &&
          ScoreMarkerDemo.field_b == 0) {
          GreenGrowTheRushesBackground.onLoginSucceeded(44);
        }
        return var2;
    }

    private final void enablePacketHandlers11To13(byte param0) {
        Checkbox.field_P[11] = true;
        Checkbox.field_P[12] = true;
        Checkbox.field_P[13] = true;
        if (param0 >= -61) {
          NetworkGameClient.integerSquareRoot((byte) -22, 47);
        }
    }

    private final void enablePacketHandler4(int param0) {
        Checkbox.field_P[4] = true;
        if (param0 < 24) {
          this.field_t = -8;
        }
    }

    private final void handleOpenUrlPacket(byte param0) {
        int var2 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
        if (param0 != 59) {
          this.field_B = -116;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = BackgroundScene.field_b - 1;
        byte[] var5 = new byte[var4];
        MusicCrossfadeStream.field_o.readCipheredBytes(var5, 0, 88, var4);
        LinkButtonPainter.openUrlInNewWindow(var3 != 0, of.a(var5, 1), -33, AudioService.getApplet(param0 ^ 13840));
    }

    final static IndexedSprite[] loadIndexedSpritesByName(ResourceArchive param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(127, param2);
          var6 = 95 % ((param1 + 53) / 49);
          var5 = param0.getFileId((byte) -126, param3, var4_int);
          stackIn_1_0 = ff.loadIndexedSprites(param0, var5, var4_int, (byte) 18);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lb.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int integerSquareRoot(byte param0, int param1) {
        String var3;
        if (param0 > -88) {
          var3 = (String) null;
          NetworkGameClient.loadIndexedSpritesByName((ResourceArchive) null, 29, (String) null, (String) null);
        }
        if (65536L > (long)param1) {
          if (256L > (long)param1) {
            if (param1 >= 0) {
              return DualLinkDeque.field_e[param1] >> 12;
            }
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if (16384L <= (long)param1) {
              return DualLinkDeque.field_e[param1 >> 8] >> 8;
            }
            return DualLinkDeque.field_e[param1 >> 6] >> 9;
          }
          if ((long)param1 < 1024L) {
            return DualLinkDeque.field_e[param1 >> 2] >> 11;
          }
          return DualLinkDeque.field_e[param1 >> 4] >> 10;
        }
        if ((long)param1 >= 16777216L) {
          if (268435456L <= (long)param1) {
            if ((long)param1 < 1073741824L) {
              return DualLinkDeque.field_e[param1 >> 22] >> 1;
            }
            return DualLinkDeque.field_e[param1 >> 24];
          }
          if ((long)param1 >= 67108864L) {
            return DualLinkDeque.field_e[param1 >> 20] >> 2;
          }
          return DualLinkDeque.field_e[param1 >> 18] >> 3;
        }
        if ((long)param1 < 1048576L) {
          if ((long)param1 < 262144L) {
            return DualLinkDeque.field_e[param1 >> 10] >> 7;
          }
          return DualLinkDeque.field_e[param1 >> 12] >> 6;
        }
        if ((long)param1 >= 4194304L) {
          return DualLinkDeque.field_e[param1 >> 16] >> 4;
        }
        return DualLinkDeque.field_e[param1 >> 14] >> 5;
    }

    private final void enablePacketHandler2(int param0) {
        Checkbox.field_P[2] = true;
        int var2 = 1 / ((-44 - param0) / 49);
    }

    protected NetworkGameClient() {
    }

    private final void enableLobbyPacketHandlers(byte param0, boolean param1) {
        Checkbox.field_P[7] = true;
        Checkbox.field_P[16] = true;
        Checkbox.field_P[17] = true;
        Checkbox.field_P[18] = true;
        if (param0 >= -49) {
          String var4 = (String) null;
          this.startClientApplet((String) null, 31, 95);
        }
        Checkbox.field_P[3] = true;
        Checkbox.field_P[0] = true;
        Checkbox.field_P[8] = param1;
    }

    static {
        field_r = new wm(6, 0, 4, 2);
        field_C = new wm(8, 0, 4, 1);
    }
}
