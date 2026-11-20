/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameAppletShell {
    private long instanceId;
    private boolean member;
    private int gameCrc;
    private int languageId;
    private int affiliateId;
    static String field_r;
    private boolean officialCodebase;
    static Sprite field_m;
    static int[] field_s;
    private int secondaryGamePort;
    private int serverId;
    private int primaryGamePort;
    private boolean field_o;
    String serverHost;

    final void configurePacketHandlers(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.enableCommonPackets(98, false);
        if (param1) {
          this.enableArchiveKeyPackets(param4 - 657);
        }
        if (param3) {
          this.setLeaderboardPacketsEnabled(true);
        }
        if (param4 != 640) {
          this.languageId = -90;
        }
        if (param0) {
          this.enableIntDataPackets(-6);
        }
        if (param2) {
          this.enablePacketHandler(param4 ^ 645);
        }
    }

    private final void initializeServerPacketLengths(int param0) {
        AppletNavigation.field_e[3] = -1;
        AppletNavigation.field_e[11] = -1;
        AppletNavigation.field_e[7] = -1;
        AppletNavigation.field_e[18] = 1;
        AppletNavigation.field_e[10] = -1;
        AppletNavigation.field_e[17] = -1;
        AppletNavigation.field_e[13] = -1;
        AppletNavigation.field_e[8] = -2;
        AppletNavigation.field_e[2] = -2;
        AppletNavigation.field_e[1] = 16;
        AppletNavigation.field_e[4] = -1;
        AppletNavigation.field_e[12] = -1;
        AppletNavigation.field_e[9] = -1;
        AppletNavigation.field_e[16] = -1;
        AppletNavigation.field_e[5] = -1;
        if (param0 != 29385) {
          String var3 = (String) null;
          this.initializeApplet(-53, 124, (String) null);
        }
        AppletNavigation.field_e[6] = -2;
    }

    private final void setLeaderboardPacketsEnabled(boolean param0) {
        PathWaypoint.field_j[2] = param0;
    }

    private final void enablePacketHandler(int param0) {
        PathWaypoint.field_j[param0] = true;
    }

    final void initializeClientServices(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param4 != 63) {
          field_m = (Sprite) null;
        }
        WidgetContainer.field_C = this.languageId;
        AccountProgressDialog.selectLocalizedLoadingText(WidgetContainer.field_C, (byte) 89);
        WidgetContainer.initializeNetworkState(this.gameCrc, this.member, 5000, 5000, this.secondaryGamePort, this.primaryGamePort, LoginCredentialsFactory.field_b, param1, this.instanceId, this.serverHost, WidgetContainer.field_C, param0, true, this.serverId);
        HuffmanDecoder.initializeArchiveLoading(this.gameCrc, 24, WidgetContainer.field_C, LoginCredentialsFactory.field_b, this.primaryGamePort, this.serverHost, param0, this.secondaryGamePort, this.serverId);
        BoundaryIntersection.configurePunctuationKeyCodes(false);
        TrackBoundary.field_u = HoldTheLine.createMouseWheelInput((byte) -87);
        LinkWidgetRenderer.attachInputListeners(MouseInputHandler.field_b, 114);
        GameKeyHandler.field_a = param6;
        RoadSegment.field_n = param2;
        PasswordValidator.field_k = param7;
        DiskCacheWorker.field_i = param5;
        LayeredButtonRenderer.field_v = param3;
        this.initializeServerPacketLengths(29385);
        WidgetStyleNode.setFeatureFlags(0);
    }

    private final void enableIntDataPackets(int param0) {
        PathWaypoint.field_j[4] = true;
        if (param0 != -6) {
          this.instanceId = 25L;
        }
    }

    final void dispatchServerPacket(int param0) {
        boolean stackIn_22_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 != -6) {
          return;
        }
        var2 = NineSlicePanel.field_c;
        if (var2 < 64 &&
          PathWaypoint.field_j[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 == 1) {
            WhirlpoolHasher.readArchiveKeyReply((byte) 79);
          } else {
            if (var2 == 2) {
              Js5Transport.readLeaderboardReply((byte) 68);
            } else {
              if (3 == var2) {
                ArchiveCatalog.readAchievementReply((byte) -128);
              } else {
                if (4 == var2) {
                  PlayerDataProtocol.readIntDataReply((byte) -24);
                } else {
                  if (var2 == 5) {
                    HoverTargetTracker.readBlobReply(param0 ^ -56);
                  } else {
                    if (var2 == 6) {
                      BufferedSocket.readPlayerStatsReply((byte) -126);
                    } else {
                      if (var2 == 7) {
                        this.readNavigationPacket((byte) -15);
                      } else {
                        if (var2 == 8) {
                          GrowableStringList.readReflectionCheck((byte) -107, LoginCredentialsFactory.field_b, RoadStripRenderer.field_e, ReflectionCheckSupport.field_c);
                        } else {
                          if (var2 == 16) {
                            TutorialCondition.readDisplayNameUpdate((byte) 3);
                          } else {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (var2 == 13) {
                                SocialListProtocol.readSocialListPacket(param0 + 16);
                                return;
                              }
                              if (var2 == 17) {
                                this.readCipheredNavigationPacket(-1);
                                return;
                              }
                              if (var2 == 18) {
                                QuickChatPhraseCache.readAccountStatusAcknowledgement(param0 ^ 41);
                                return;
                              }
                              MusicPatchPcmStream.reportClientError((Throwable) null, (byte) -119, "MGS1: " + AgeValidator.describeServerPacket(false));
                              ServerConnectionState.closeServerConnection(-28036);
                              return;
                            }
                            stackIn_22_0 = (var2 == 12);
                            var3 = PasswordValidator.readChatMessage(stackIn_22_0, false);
                            LoginMethodPreference.receiveChatMessage(var3, false);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
        MusicPatchPcmStream.reportClientError((Throwable) null, (byte) 70, "MGS2: " + AgeValidator.describeServerPacket(false));
        ServerConnectionState.closeServerConnection(-28036);
        return;
    }

    private final int processAccountScreens(boolean param0, boolean param1, boolean param2) {
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
          var8 = HoldTheLine.field_D;
          var4 = DelayedServerPacket.processAccountUi(param1, LoginForm.field_T, 1, WidgetContainer.field_C);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = LoginCredentials.checkAccountAvailability((byte) -124, NameSuggestionsPanel.getAccountFormText(-80), TextWidgetStyle.getDisplayNameFormText(8790));
            if (var5_int != -1) {
              LayeredWidgetStyle.handleNameAvailabilityResponse(256, var5_int, IsaacRandom.field_h, Cp1252CharacterRules.field_b);
              IsaacRandom.field_h = null;
              Cp1252CharacterRules.field_b = null;
            }
            var11 = UsernameLoginCredentials.pollEmailValidationReply((byte) -29);
            if (var11 != null) {
              IntegerTextParser.completeEmailValidation(0, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = SpriteAsset.createAccount(HoverTooltipController.getRequestedAge((byte) 31), TimedValidator.getPendingEmail((byte) -116), (byte) 80, MidiNote.isMarketingConsentSelected((byte) -27), this.affiliateId, GrowableStringList.getPendingDisplayName(0), FullscreenFocusCanvas.getPendingPassword(4));
            if (var5_intLifetime1 != -1) {
              StandardContentTransitionDialog.completeNameRequest(Cp1252CharacterRules.field_b, IsaacRandom.field_h, -98, var5_intLifetime1);
              IsaacRandom.field_h = null;
              Cp1252CharacterRules.field_b = null;
            }
          }
          if (var4 == 3) {
            if (BoundaryLoopClipper.field_a != -1 &&
              BoundaryLoopClipper.field_a != 0) {
              BoundaryLoopClipper.field_a = -1;
              GameMenu.clearJs5Errors(-87);
            }
            if (!param0) {
              var5_intLifetime2 = WidgetContainer.processLogin(this.officialCodebase, 1, GrowableStringList.getPendingDisplayName(0), FullscreenFocusCanvas.getPendingPassword(4), false, this.affiliateId);
              if (var5_intLifetime2 != -1) {
                if (0 != var5_intLifetime2) {
                  NanoTickClock.showAccountResponse(var5_intLifetime2, Cp1252CharacterRules.field_b, -2698);
                  Cp1252CharacterRules.field_b = null;
                } else {
                  TutorialCalloutAnchor.field_e = RoadFillRenderer.field_a;
                  DisplayNameForm.showLoginSuccess((byte) 121);
                  DiskCacheRequest.field_w = 10;
                  SessionCookieWriter.guestMode = false;
                }
              }
            } else {
              RoadShadowRenderer.field_n = false;
            }
          }
          if (4 == var4) {
            if (FixedAngleMath.field_b) {
              ClientLifecycleUtilities.resetBrowserSession(GameKeyHandler.getApplet(126), 237);
            } else {
              SessionCookieWriter.guestMode = true;
              DiskCacheRequest.field_w = 10;
            }
          }
          if (var4 == 5) {
            MouseInputHandler.openQuitPage(GameKeyHandler.getApplet(116), true);
          }
          if (var4 == 6 &&
            AlternateUsernameLoginCredentials.field_j) {
            DiskCacheRequest.field_w = 10;
          }
          if (7 == var4) {
            NamedSoundEffect.openServerList(true, GameKeyHandler.getApplet(92));
          }
          if (var4 == 8) {
            ClientLifecycleUtilities.resetBrowserSession(GameKeyHandler.getApplet(120), 237);
          }
          if (var4 == 9) {
            WidgetContainer.openSupportPage(GameKeyHandler.getApplet(93), 102);
          }
          if (var4 == 10) {
            IsaacPacketBuffer.field_p.writeCipheredOpcode((byte) 33, 17);
          }
          if (var4 == 11) {
            AppletNavigation.reloadApplet(-16666, GameKeyHandler.getApplet(106));
          }
          if (!param2) {
            return -101;
          }
          if (var4 == 12) {
            InputValidationError.openAppletPage((byte) -68, GameKeyHandler.getApplet(116), RoadSegment.getNavigationUrl(-14));
          }
          if (var4 == 13) {
            try {
              if (SpriteSheetAsset.field_a == null) {
                SpriteSheetAsset.field_a = new UrlPacketDownloader(LoginCredentialsFactory.field_b, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (SpriteSheetAsset.field_a.pollDownload((byte) 90)) {
                var12 = SpriteSheetAsset.field_a.getDownloadedPacket((byte) 85);
                if (var12 != null) {
                  var7 = Cp1252Decoder.decodeCp1252(var12.position, 0, -129, var12.payload);
                  IntArrayReadRequest.onCountryListResponse(var7, (byte) -55);
                } else {
                  var9 = (String) null;
                  IntArrayReadRequest.onCountryListResponse((String) null, (byte) -64);
                }
                SpriteSheetAsset.field_a = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              MusicPatchPcmStream.reportClientError((Throwable) ((Object) var5), (byte) 87, "S1");
              var10 = (String) null;
              IntArrayReadRequest.onCountryListResponse((String) null, (byte) -87);
              SpriteSheetAsset.field_a = null;
            }
          }
          if (var4 == 15) {
            DiskCacheRequest.field_w = 10;
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

    private final void readAppletParameters(String param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        boolean stackIn_7_1 = false;
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
            if (!this.isCodebaseAllowed(-11)) {
              return;
            }
            this.serverHost = this.getCodeBase().getHost();
            var6 = this.serverHost.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.officialCodebase = stackIn_7_1;
            this.primaryGamePort = Integer.parseInt(this.getParameter("gameport1"));
            this.secondaryGamePort = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.serverId = Integer.parseInt(var7);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            if (param2 < 125) {
              discarded$0 = this.processAccountScreens(false, true, false);
            }
            this.member = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.languageId = Integer.parseInt(var8);
            }
            if (this.languageId >= 5) {
              this.languageId = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.affiliateId = Integer.parseInt(var9);
            }
            JagexLogoRenderer.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletClient(param0, param1, param4, param3, (byte) -101, this.gameCrc, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            MusicPatchPcmStream.reportClientError((Throwable) ((Object) var6_ref), (byte) 113, (String) null);
            this.showGameError("crash", 221);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("oh.N(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void updateClientServices(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        boolean stackIn_103_3;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = HoldTheLine.field_D;
        if (HoverTargetState.field_c != null) {
          if (null == NetworkArchiveRequest.field_w) {
            var6 = MusicCrossfadeStream.getGameContainer(param0 ^ 1051);
            var4 = var6.getSize();
            HoverTargetState.field_c.setRequestedSize(var4.width, var4.height, (byte) -117);
          }
          HoverTargetState.field_c.update((byte) -9);
        }
        StripedProgressBar.pollKeyState(false);
        TutorialAction.pollMouseInput(1983);
        if (!BufferedSocket.isClientUiLoading((byte) -128) &&
          DiskCacheRequest.field_w != 11) {
          DualLinkNode.processServerDialogs(param0 ^ 1142);
        }
        if (null != TrackBoundary.field_u) {
          LoginForm.field_T = TrackBoundary.field_u.pollRotation((byte) 119);
        }
        if (TextFieldValidator.isServerSessionReady((byte) 15)) {
          var3 = NodeHashTableIterator.getTickRate(855) * 1200;
          if (this.field_o ||
            !(ClientLifecycleUtilities.getKeyboardIdleTicks(0) <= var3) &&
            !(ClientMenuBootstrap.getMouseIdleTicks((byte) 65) <= var3)) {
            this.field_o = false;
            ServerConnectionState.closeServerConnection(param0 - 29087);
            EmailConfirmationValidator.handleConnectionLost(false);
            NanoTickClock.showAccountResponse(2, PlayerStatsRequest.field_n, -2698);
            PackedClientOptions.clearCredentialTypeOnGuardMismatch(param0 ^ 1127);
            RoadShadowRenderer.field_n = true;
            AlternateUsernameLoginCredentials.field_k = BoundaryLoopTracer.monotonicTimeMillis(-1) + 15000L;
          }
        }
        if (BoundaryLoopClipper.field_a == -1 ||
          BoundaryLoopClipper.field_a == 0) {
          stackIn_23_0 = (BoundaryLoopClipper.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          BoundaryLoopClipper.field_a = TrackCurve.processArchiveTransport(-17204);
          if (var3Lifetime1 != 0 &&
            BoundaryLoopClipper.field_a == 0 &&
            11 == DiskCacheRequest.field_w &&
            !NamedSoundEffect.isReconnectRequired((byte) 103)) {
            DisplayNameForm.showLoginSuccess((byte) 92);
          }
          if (BoundaryLoopClipper.field_a != -1 &&
            BoundaryLoopClipper.field_a != 0) {
            AlternateUsernameLoginCredentials.field_k = BoundaryLoopTracer.monotonicTimeMillis(-1) + 15000L;
          }
        }
        if (BoundaryLoopClipper.field_a != -1 &&
          BoundaryLoopClipper.field_a != 0) {
          if (10 > PolarSortVector.field_d) {
            if (BoundaryLoopClipper.field_a != 3) {
              if (BoundaryLoopClipper.field_a == 4) {
                this.showGameError("js5io", 221);
              } else {
                if (2 != BoundaryLoopClipper.field_a) {
                  if (BoundaryLoopClipper.field_a == 5) {
                    this.showGameError("outofdate", 221);
                  } else {
                    this.showGameError("js5connect", 221);
                  }
                } else {
                  this.showGameError("js5connect_full", 221);
                }
              }
            } else {
              this.showGameError("js5crc", param0 - 830);
            }
          } else {
            if (DiskCacheRequest.field_w >= 10) {
              EmailConfirmationValidator.handleConnectionLost(false);
              if (3 != BoundaryLoopClipper.field_a) {
                if (4 != BoundaryLoopClipper.field_a) {
                  if (BoundaryLoopClipper.field_a == 2) {
                    NanoTickClock.showAccountResponse(256, Vector2i.field_f, param0 - 3749);
                  } else {
                    if (BoundaryLoopClipper.field_a == 5) {
                      NanoTickClock.showAccountResponse(5, FullscreenFocusCanvas.field_e, -2698);
                    } else {
                      NanoTickClock.showAccountResponse(256, NameCheckProgressDialog.field_ub, -2698);
                    }
                  }
                } else {
                  NanoTickClock.showAccountResponse(256, AccountProtocolState.field_b, -2698);
                }
              } else {
                NanoTickClock.showAccountResponse(256, IntArrayReadRequest.field_k, -2698);
              }
              RoadShadowRenderer.field_n = true;
            }
          }
        }
        if ((BoundaryLoopClipper.field_a != -1 &&
          BoundaryLoopClipper.field_a != 0 ||
          NamedSoundEffect.isReconnectRequired((byte) 103)) &&
          BoundaryLoopTracer.monotonicTimeMillis(-1) >= AlternateUsernameLoginCredentials.field_k) {
          RoadShadowRenderer.field_n = false;
          if (BoundaryLoopClipper.field_a != -1 &&
            BoundaryLoopClipper.field_a != 0) {
            BoundaryLoopClipper.field_a = -1;
            GameMenu.clearJs5Errors(-112);
          }
        }
        if (BoundaryLoopClipper.field_a == 0 &&
          !NamedSoundEffect.isReconnectRequired((byte) 103)) {
          DisplayNameForm.field_K = false;
        }
        if (PolarSortVector.field_d == 0 &&
          SecondaryNodeDeque.pollMasterIndex((byte) 38)) {
          PolarSortVector.field_d = 1;
        }
        if (PolarSortVector.field_d == 1) {
          if (WidgetContainer.field_C != 0) {
            MenuLayoutState.field_a = WeightedLruCache.createResourceArchive(param0 ^ 1134, PasswordValidator.field_k);
          }
          IntrusiveDeque.field_d = ResourceArchiveFactory.createResourceArchive(true, LayeredButtonRenderer.field_v, -115, false, 1);
          LinkWidgetRenderer.field_d = ResourceArchiveFactory.createResourceArchive(true, RoadSegment.field_n, -84, false, 1);
          ArchiveRequest.field_p = ResourceArchiveFactory.createResourceArchive(true, GameKeyHandler.field_a, -94, false, 1);
          LinearPointPath.field_p = LinkWidgetRenderer.field_d;
          PolarSortVector.field_d = 2;
          StandardContentTransitionDialog.field_lb = IntrusiveDeque.field_d;
        }
        if (PolarSortVector.field_d == 2) {
          if (null != MenuLayoutState.field_a &&
            MenuLayoutState.field_a.ensureIndexLoaded((byte) -115)) {
            if (!MenuLayoutState.field_a.containsGroup("", true)) {
              MenuLayoutState.field_a = null;
            } else {
              if (MenuLayoutState.field_a.tryLoadNamedGroup("", param0 - 1135)) {
                ClientTextResources.loadInterfaceText(1, MenuLayoutState.field_a);
                MenuLayoutState.field_a = null;
                TexturedRoadFillRenderer.resetFrameTiming(42);
              }
            }
          }
          if (MenuLayoutState.field_a == null) {
            PolarSortVector.field_d = 3;
          }
        }
        if (PolarSortVector.field_d == 3 &&
          ByteStorage.pollCommonUiLoaded(IntrusiveDeque.field_d, LinkWidgetRenderer.field_d, param0 ^ 1125, ArchiveRequest.field_p) &&
          StereoMusicSample.pollAllArchiveGroups((byte) -83, ArchiveRequest.field_p)) {
          ArchiveLoadStage.clearLoadingBarResources((byte) 10);
          MenuLayoutState.clearArchiveOnGuardMismatch(param0 + 25668);
          AlternateUsernameLoginCredentials.field_j = false;
          DelayedServerPacket.field_m = MarkerSliderRenderer.field_f;
          TextHotspotWidget.initializeAccountUi(LinkWidgetRenderer.field_d, ArchiveRequest.field_p, IntrusiveDeque.field_d, param0 - 946, FixedAngleMath.field_b);
          if (DisplayNameValidator.field_i ||
            EmailConfirmationValidator.field_i != null) {
            stackIn_100_0 = !(DisplayNameValidator.field_i);
            stackIn_102_1 = 85;
            stackIn_102_2 = EmailConfirmationValidator.field_i;
            stackIn_103_3 = !(DisplayNameValidator.field_i);
            DropTargetWidget.showLoginFormWithIntGuard(stackIn_100_0, stackIn_102_1, stackIn_102_2, stackIn_103_3);
          }
          if (JagexLogoRenderer.field_b) {
            FadingDialog.continueAsGuest(0);
          }
          if (null == BoundaryLoopClipper.field_f) {
            BoundaryLoopClipper.field_f = KeyboardEventQueue.getSoundMixer(124);
            CheckboxRenderer.field_l = ContentTransitionDialog.getSoundBufferSize(param0 + 28624);
          }
          SocialListEntry.initializeLogoResources(CheckboxRenderer.field_l, ArchiveRequest.field_p, param0 ^ 1051, BoundaryLoopClipper.field_f);
          LinkWidgetRenderer.field_d = null;
          IntrusiveDeque.field_d = null;
          ArchiveRequest.field_p = null;
          DraggableWidget.checkUsernameParameter((java.applet.Applet) (this), (byte) 92);
          TexturedRoadFillRenderer.resetFrameTiming(71);
          PolarSortVector.field_d = 10;
        }
        if (10 == PolarSortVector.field_d) {
          if (WidgetContainer.field_C != 0) {
            GameAppletShell.field_i = WeightedLruCache.createResourceArchive(-110, DiskCacheWorker.field_i);
          }
          PolarSortVector.field_d = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (PolarSortVector.field_d == 11) {
          if (null != GameAppletShell.field_i && (!GameAppletShell.field_i.ensureIndexLoaded((byte) -76) ||
            !GameAppletShell.field_i.tryLoadAllGroups((byte) -60))) {
            CacheEntry.setAccountStatus(85, MeshMaterial.formatArchiveLoadingStatus(-115, GameAppletShell.field_i, StraightRoadSlicer.field_d, DualNodeHashTable.field_f), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            EditableTextField.field_R = true;
            PolarSortVector.field_d = 12;
          }
        }
        if (param0 != 1051) {
          this.secondaryGamePort = 95;
        }
        if (12 == PolarSortVector.field_d &&
          !EditableTextField.field_R) {
          PolarSortVector.field_d = 13;
        }
        if (PolarSortVector.field_d == 13) {
          var3Lifetime2 = 1;
          if (WhirlpoolTables.field_e != null) {
            stackIn_134_0 = (!WhirlpoolTables.field_e.pollLoaded(-1)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            CacheEntry.setAccountStatus(116, WhirlpoolTables.field_e.field_b, WhirlpoolTables.field_e.field_j);
          }
          if (var3Lifetime2 != 0) {
            PolarSortVector.field_d = 20;
          }
        }
        if (!param1 &&
          BufferedRandomAccessFile.field_n) {
          TrackObjectDefinition.detachInputListeners(param0 - 47393, MouseInputHandler.field_b);
          this.recreateCanvas((byte) 91);
          LinkWidgetRenderer.attachInputListeners(MouseInputHandler.field_b, 114);
        }
        if (PathWaypoint.field_j[8]) {
          PathWaypoint.sendReflectionReplies(-74);
        }
    }

    private final void enableCommonPackets(int param0, boolean param1) {
        if (param0 <= 96) {
          this.field_o = true;
        }
        PathWaypoint.field_j[0] = true;
        PathWaypoint.field_j[17] = true;
        PathWaypoint.field_j[16] = true;
        PathWaypoint.field_j[18] = true;
        PathWaypoint.field_j[3] = true;
        PathWaypoint.field_j[8] = param1;
        PathWaypoint.field_j[7] = true;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 8) {
          NetworkGameClient.clearSharedReferences(46);
        }
        field_r = null;
        field_s = null;
        field_m = null;
    }

    final int processReconnect(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!NamedSoundEffect.isReconnectRequired((byte) 103)) {
          return -1;
        }
        if (RoadShadowRenderer.field_n) {
          return -1;
        }
        int var2 = WidgetContainer.processLogin(this.officialCodebase, 1, GrowableStringList.getPendingDisplayName(0), FullscreenFocusCanvas.getPendingPassword(4), true, this.affiliateId);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (11 == DiskCacheRequest.field_w &&
            BoundaryLoopClipper.field_a == 0) {
            DisplayNameForm.showLoginSuccess((byte) 78);
          }
          return var2;
        }
        if (!RotatedSpriteAsset.field_n) {
          this.showGameError("reconnect", param0 + 132);
        }
        EmailConfirmationValidator.handleConnectionLost(false);
        NanoTickClock.showAccountResponse(var2, Cp1252CharacterRules.field_b, -2698);
        RoadShadowRenderer.field_n = true;
        AlternateUsernameLoginCredentials.field_k = 15000L + BoundaryLoopTracer.monotonicTimeMillis(-1);
        if (param0 == 89) {
          return var2;
        }
        return 54;
    }

    final static int sampleFramesForMillis(PcmSample param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 76) {
            field_s = (int[]) null;
          }
          stackIn_3_0 = param0.field_j * param1 / 1000;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oh.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void initializeAccountScreenSelection(boolean param0, boolean param1) {
        AccountFormText.field_b = 0;
        RoadControlPathBuilder.field_e = BoundedRandomAccessFile.field_g;
        SpriteSheetAsset.field_e = 0;
        UrlPacketDownloader.field_i = 0;
        DualLinkNode.field_k = new MenuSelectionController(2);
        if (!param1) {
          field_s = (int[]) null;
        }
        DualLinkNode.field_k.setSelectionState(PasswordValidator.hitTestBenefitsButton(125, FullscreenErrorDialog.field_X, NodeHashTableIterator.field_g), 0, param0, -1);
    }

    private final void enableArchiveKeyPackets(int param0) {
        if (param0 != -17) {
          this.instanceId = 71L;
        }
        PathWaypoint.field_j[1] = true;
    }

    final void updateAccountScreens(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = HoldTheLine.field_D;
        if (MenuSelectionController.isAccountUiReady((byte) -30)) {
          discarded$1 = this.processAccountScreens(false, null != NetworkArchiveRequest.field_w ? true : false, true);
        } else {
          if (PolarSortVector.field_d >= 10) {
            if (!ContentTransitionState.isLogoAnimationComplete(true)) {
              ClientLifecycleUtilities.advanceLogoAnimation(0);
            } else {
              if (0 != DiskCacheRequest.field_w) {
                DiskCacheWorker.processAccountUiFrame(LoginForm.field_T, (byte) -97);
              } else {
                discarded$2 = this.processAccountScreens(false, false, true);
              }
            }
          }
        }
        if (param0 != 0) {
          this.setLeaderboardPacketsEnabled(false);
        }
    }

    final void initializeApplet(int param0, int param1, String param2) {
        try {
          this.readAppletParameters(param2, 640, 127, 480, param0);
          if (param1 != 6165) {
            NetworkGameClient.initializeAccountScreenSelection(true, false);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "oh.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int processAccountScreens(int param0, boolean param1) {
        if (param0 != -1) {
          this.field_o = false;
        }
        return this.processAccountScreens(true, param1, true);
    }

    private final void readNavigationPacket(byte param0) {
        String var2 = RoadFillRenderer.readServerString(-1);
        if (param0 != -15) {
          NetworkGameClient.initializeAccountScreenSelection(false, false);
        }
        SessionCookieWriter.writeSessionCookie(var2, GameKeyHandler.getApplet(104), -1);
    }

    final static FullscreenDisplayMode[] listFullscreenDisplayModes(PlatformTaskDispatcher param0, byte param1) {
        int var5 = 0;
        FullscreenDisplayMode[] stackIn_3_0 = null;
        FullscreenDisplayMode[] stackIn_9_0 = null;
        FullscreenDisplayMode[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        FullscreenDisplayMode[] var4 = null;
        FullscreenDisplayMode var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = HoldTheLine.field_D;
        try {
          if (!param0.isFullscreenSupported(true)) {
            stackIn_3_0 = new FullscreenDisplayMode[]{};
            return stackIn_3_0;
          }
          var8 = param0.listDisplayModes(2);
          while (0 == var8.field_d) {
            SocketConnector.sleepMillis(10L, (byte) 45);
          }
          if (var8.field_d == 2) {
            stackIn_9_0 = new FullscreenDisplayMode[]{};
            return stackIn_9_0;
          }
          var10 = (int[]) (var8.field_b);
          var9 = var10;
          var3 = var9;
          var4 = new FullscreenDisplayMode[var10.length >> 2];
          if (param1 <= 108) {
            field_s = (int[]) null;
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new FullscreenDisplayMode();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[(var5 << 2) + 1];
            var6.bitDepth = var3[2 + (var5 << 2)];
            var6.refreshRate = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("oh.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void readCipheredNavigationPacket(int param0) {
        int var2 = RoadStripRenderer.field_e.readUnsignedByte((byte) -97);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = param0 + ReflectionCheckSupport.field_c;
        byte[] var5 = new byte[var4];
        RoadStripRenderer.field_e.readCipheredBytes(var5, var4, 0, true);
        AccountNameNormalizer.openExternalUrl(-7235, RoadLayerMaskRenderer.decodeCp1252((byte) 80, var5), var3 != 0, GameKeyHandler.getApplet(109));
    }

    protected NetworkGameClient() {
    }

    static {
        field_r = "Waiting for sound effects";
    }
}
