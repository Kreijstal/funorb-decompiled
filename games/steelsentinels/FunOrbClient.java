/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FunOrbClient extends GameApplet {
    private int field_D;
    private boolean field_C;
    private boolean field_E;
    static ReportAbuseDialog field_x;
    static int field_u;
    static String field_o;
    static int[] field_z;
    private long field_r;
    private int field_v;
    private int field_q;
    private int field_n;
    static CoverageBitmapFont field_w;
    private int field_F;
    static int[] field_p;
    private int field_B;
    private boolean field_A;
    static boolean[][] field_s;
    String field_t;
    static String field_y;

    private final int processAccountUiActions(boolean param0, boolean param1, int param2) {
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
          var8 = SteelSentinels.obfuscationControl;
          var4 = LoginActionHelpers.pollLoginScreenAction(SceneWidgetNode.field_D, param1, (byte) -66, MeshMaterial.field_d);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = GameApplet.submitCredentialLogin(NameValidationHelpers.createLoginNameValue((byte) -89), CachedTextLayout.createRememberedUsername(64), -121);
            if (var5_int != -1) {
              MouseWheelInput.handleUsernameResponse(OptionMaskHelpers.field_e, (byte) 118, var5_int, KeyRoutingHelpers.field_d);
              KeyRoutingHelpers.field_d = null;
              OptionMaskHelpers.field_e = null;
            }
            var11 = RasterSnapshot.takePendingLoginFlag(true);
            if (var11 != null) {
              TeamColourTinter.resolvePendingCheck((byte) 97, var11.booleanValue());
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = IconLabelControl.submitAccountCreation(TextHotspotWidget.getPendingPassword(false), 0, MeshMaterial.getAccountStatusText(true), this.field_q, PendingIntArrayRequest.getCurrentAccountName(91), TextHotspotRegion.getNewsletterOptIn(37), DiskCacheRequest.getRegistrationAge(82));
            if (var5_intLifetime1 != -1) {
              FullscreenFocusCanvas.handleRegistrationResult(KeyRoutingHelpers.field_d, var5_intLifetime1, OptionMaskHelpers.field_e, (byte) -128);
              OptionMaskHelpers.field_e = null;
              KeyRoutingHelpers.field_d = null;
            }
          }
          if (3 == var4) {
            if (TeamColourTinter.field_d != -1 &&
              TeamColourTinter.field_d != 0) {
              TeamColourTinter.field_d = -1;
              TextAndBitHelpers.resetTransferCounters(param2 ^ 7004);
            }
            if (!param0) {
              var5_intLifetime2 = MeshMaterial.performLogin(-108, this.field_q, MeshMaterial.getAccountStatusText(true), this.field_A, false, TextHotspotWidget.getPendingPassword(false));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  LoginResultHelpers.handleLoginResult(OptionMaskHelpers.field_e, var5_intLifetime2, 1);
                  OptionMaskHelpers.field_e = null;
                } else {
                  TextButton.field_P = PasswordFieldPainter.field_w;
                  CombatWorld.updateNoticeText(11828);
                  QuickChatMenu.field_ac = false;
                  ReflectionCheckHelpers.field_d = 10;
                }
              }
            } else {
              ChatHistoryHelpers.field_b = false;
            }
          }
          if (4 == var4) {
            if (!LoadingProgressDialog.field_ib) {
              QuickChatMenu.field_ac = true;
              ReflectionCheckHelpers.field_d = 10;
            } else {
              NameAvailabilityValidator.clearSessionAndReload(param2 + 7014, Projectile.getApplet((byte) -21));
            }
          }
          if (5 == var4) {
            NameTable.openQuitPage(true, Projectile.getApplet((byte) -21));
          }
          if (var4 == 6 &&
            IntrusiveNode.field_a) {
            ReflectionCheckHelpers.field_d = 10;
          }
          if (param2 != -7014) {
            return 20;
          }
          if (7 == var4) {
            WeightedLruCache.openServerListPage((byte) -81, Projectile.getApplet((byte) -21));
          }
          if (var4 == 8) {
            NameAvailabilityValidator.clearSessionAndReload(0, Projectile.getApplet((byte) -21));
          }
          if (9 == var4) {
            TabbedPanel.openSupportPage((byte) 49, Projectile.getApplet((byte) -21));
          }
          if (var4 == 10) {
            ClockAndCookieHelpers.field_g.writeCipheredOpcode(17, (byte) -117);
          }
          if (var4 == 11) {
            CheckboxPainter.reloadPage(Projectile.getApplet((byte) -21), 63);
          }
          if (12 == var4) {
            BufferedRandomAccessFile.openRelativeUrl(SocketConnector.getPendingUrlPath(param2 + 7014), Projectile.getApplet((byte) -21), (byte) -47);
          }
          if (var4 == 13) {
            try {
              if (DelayedServerPacket.field_s == null) {
                DelayedServerPacket.field_s = new BoundedUrlRequest(IterableDualNodeDeque.field_i, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (DelayedServerPacket.field_s.poll(-2)) {
                var12 = DelayedServerPacket.field_s.getResponseBuffer(param2 + 7017);
                if (var12 == null) {
                  var9 = (String) null;
                  ChatMessage.discardText((String) null, (byte) -126);
                } else {
                  var7 = SoundCache.decodeWindowsCodePageText((byte) 37, 0, var12.payload, var12.position);
                  ChatMessage.discardText(var7, (byte) -105);
                }
                DelayedServerPacket.field_s = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              MusicCrossfadeStream.reportClientError("S1", -100, (Throwable) ((Object) var5));
              var10 = (String) null;
              ChatMessage.discardText((String) null, (byte) -104);
              DelayedServerPacket.field_s = null;
            }
          }
          if (var4 == 15) {
            ReflectionCheckHelpers.field_d = 10;
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

    private final void enablePacketFive(byte param0) {
        int var2 = -57 / ((param0 - 47) / 53);
        dg.field_h[5] = true;
    }

    private final void readAppletParameters(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
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
            if (!this.isHostAllowed((byte) 110)) {
              return;
            }
            this.field_t = this.getCodeBase().getHost();
            var6 = this.field_t.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_A = stackIn_8_1;
            this.field_D = Integer.parseInt(this.getParameter("gameport1"));
            this.field_B = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_v = Integer.parseInt(var7);
            }
            this.field_F = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_r = Long.parseLong(this.getParameter("instanceid"));
            this.field_C = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_n = Integer.parseInt(var8);
            }
            if (~this.field_n <= param2) {
              this.field_n = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            RankingQuery.field_q = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startApplet(param3, param0, 32, (byte) 103, param1, this.field_F, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            MusicCrossfadeStream.reportClientError((String) null, -41, (Throwable) ((Object) var6_ref));
            this.showErrorPage("crash", param2 ^ 16948);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("n.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int pollGameConnection(byte param0) {
        int var2;
        int var3;
        if (this.field_m) {
          return -1;
        }
        if (!LoginStateQueries.isLoginFormActive(16731221)) {
          return -1;
        }
        if (ChatHistoryHelpers.field_b) {
          return -1;
        }
        var2 = MeshMaterial.performLogin(-119, this.field_q, MeshMaterial.getAccountStatusText(true), this.field_A, true, TextHotspotWidget.getPendingPassword(false));
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!DesignerPageSetup.field_b) {
            this.showErrorPage("reconnect", -16946);
          }
          SessionExitHelpers.requestSessionExit(10);
          var3 = 102 / ((param0 + 32) / 54);
          LoginResultHelpers.handleLoginResult(OptionMaskHelpers.field_e, var2, 1);
          ChatHistoryHelpers.field_b = true;
          ProxySocketConnector.field_l = 15000L + ClockAndCookieHelpers.monotonicMillis(42);
          return var2;
        }
        if (ReflectionCheckHelpers.field_d == 11 &&
          TeamColourTinter.field_d == 0) {
          CombatWorld.updateNoticeText(11828);
        }
        return var2;
    }

    final void initializeFramework(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        SceneWidgetNode.field_D = this.field_n;
        ViewportController.selectLanguageStrings(SceneWidgetNode.field_D, param2 ^ 4192);
        ValidationIndicator.configureConnection(IterableDualNodeDeque.field_i, this.field_t, param1, this.field_v, param3, this.field_C, this.field_B, SceneWidgetNode.field_D, 5000, this.field_r, (byte) 120, param2, this.field_F, this.field_D);
        GrowableIntList.initializeArchiveServices(this.field_F, this.field_D, param3, this.field_B, IterableDualNodeDeque.field_i, (byte) -95, SceneWidgetNode.field_D, this.field_v, this.field_t);
        ArchiveProvider.initializeKeyCodeMap((byte) 127);
        WeightedLruCache.field_j = DelegatingCanvas.createMouseWheelInput((byte) 68);
        HighscoreColumnHeader.attachCanvasInput((byte) -93, ArchiveLoadStep.field_n);
        Sprite.field_h = param5;
        ArchiveIndex.field_r = param7;
        SessionSeedHelpers.field_h = param4;
        DualNode.field_p = param6;
        LoginConnectionStage.field_c = param0;
        this.initializePacketLengths(true);
        OptionMaskHelpers.clearOptionMask((byte) -128);
    }

    final int pollAccountUiActions(boolean param0, int param1) {
        if (param1 != -3836) {
          field_o = (String) null;
        }
        return this.processAccountUiActions(true, param0, param1 ^ 5534);
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_w = null;
        field_o = null;
        field_x = null;
        field_s = (boolean[][]) null;
        if (param0 >= -101) {
          return;
        }
        field_z = null;
        field_y = null;
    }

    private final void enablePacketFour(byte param0) {
        if (param0 >= -86) {
          return;
        }
        dg.field_h[4] = true;
    }

    private final void enablePacketsElevenToThirteen(boolean param0) {
        dg.field_h[12] = true;
        dg.field_h[11] = true;
        if (param0) {
          return;
        }
        dg.field_h[13] = true;
    }

    final void startWithDefaultSize(int param0, int param1, String param2) {
        try {
          if (param1 != -28233) {
            this.enablePacketsElevenToThirteen(true);
          }
          this.readAppletParameters(480, param2, -6, 640, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "n.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void configureOptionalPacketHandlers(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.configureCommonPacketHandlers(true, true);
        if (param3) {
          this.enablePacketOne((byte) -17);
        }
        if (param1) {
          this.enablePacketTwo(-17573);
        }
        if (param0 != 1) {
          return;
        }
        if (param6) {
          this.enablePacketFour((byte) -91);
        }
        if (param2) {
          this.enablePacketFive((byte) -107);
        }
        if (param4) {
          this.enablePacketSix(118);
        }
        if (param5) {
          this.enablePacketsElevenToThirteen(false);
        }
    }

    private final void enablePacketTwo(int param0) {
        if (param0 != -17573) {
          this.field_q = 102;
        }
        dg.field_h[2] = true;
    }

    final void updateLoginFlow(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = SteelSentinels.obfuscationControl;
        if (LoginStateQueries.isLoginComplete(6995)) {
          discarded$1 = this.processAccountUiActions(false, RewardValueHelpers.field_c != null ? true : false, -7014);
        } else {
          if (AccountTermsPanel.field_Q >= 10) {
            if (!ClientGlobals.isIntroFinished(-104)) {
              ReflectionCheckHelpers.advanceIntroTimer(29);
            } else {
              if (ReflectionCheckHelpers.field_d == 0) {
                discarded$3 = this.processAccountUiActions(false, false, -7014);
              } else {
                ProxySocketConnector.serviceAccountInput(MeshMaterial.field_d, (byte) 104);
              }
            }
          }
        }
        int var2 = -84 % ((30 - param0) / 55);
    }

    private final void enablePacketOne(byte param0) {
        if (param0 != -17) {
          this.field_E = false;
        }
        dg.field_h[1] = true;
    }

    private final void handleOpenUrlPacket(int param0) {
        int var2 = LoginConnectionStage.field_d.readUnsignedByte((byte) -86);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + ViewportController.field_f;
        byte[] var5 = new byte[var4];
        LoginConnectionStage.field_d.readCipheredBytes(0, var4, var5, 103);
        UrlAndReplyHelpers.openUrl(var3 != 0, (byte) 99, IntKeyLookup.decodeWindowsCodePageString(13, var5), Projectile.getApplet((byte) -21));
        if (param0 != 3894) {
          this.enablePacketOne((byte) -96);
        }
    }

    final void serviceFramework(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        String stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        boolean stackIn_117_2 = false;
        int stackIn_147_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = SteelSentinels.obfuscationControl;
        if (null != AssetDecoders.field_a) {
          if (null == RewardValueHelpers.field_c) {
            var6 = BirthDateEntryPanel.getGameContainer(param0 - 45);
            var4 = var6.getSize();
            AssetDecoders.field_a.setDesiredSize(var4.height, (byte) -114, var4.width);
          }
          AssetDecoders.field_a.updateViewport(false);
        }
        GameApplet.snapshotKeyboardInput(-27983);
        PacketLoopHelpers.pollMouseInput(param0 ^ param0);
        if (!QuickChatHelpDialog.shouldShowBootstrapLoadingScreen(0) &&
          ReflectionCheckHelpers.field_d != 11) {
          BoundedRandomAccessFile.showPendingAccountNotice(-51);
        }
        if (WeightedLruCache.field_j != null) {
          MeshMaterial.field_d = WeightedLruCache.field_j.pollRotation(-1);
        }
        if (RankingQuery.isLoggedIn(-116)) {
          var3 = MusicCrossfadeStream.getTargetFrameRate((byte) -123) * 1200;
          if (this.field_E ||
            !(var3 >= SoundCache.getInputFrameCount(-102)) &&
            !(DateInputWidget.getPointerIdleTicks((byte) -64) <= var3)) {
            this.field_E = false;
            LoginForm.closeConnection(127);
            SessionExitHelpers.requestSessionExit(10);
            LoginResultHelpers.handleLoginResult(ChatHistoryAllocator.field_g, 2, param0 ^ 4);
            MatchingTextValidator.clearSpriteArray((byte) 82);
            ChatHistoryHelpers.field_b = true;
            ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(-94) + 15000L;
          }
        }
        if (-1 == TeamColourTinter.field_d ||
          TeamColourTinter.field_d == 0) {
          stackIn_24_0 = (TeamColourTinter.field_d != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          TeamColourTinter.field_d = CipherPacketBuffer.serviceArchiveConnection(param0 + 16);
          if (var3Lifetime1 != 0) {
            if (TeamColourTinter.field_d == 0) {
              if (11 == ReflectionCheckHelpers.field_d) {
                if (!LoginStateQueries.isLoginFormActive(param0 ^ 16731216)) {
                  CombatWorld.updateNoticeText(11828);
                  if (TeamColourTinter.field_d != -1 &&
                    TeamColourTinter.field_d != 0) {
                    ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(127) + 15000L;
                  }
                } else {
                  if (TeamColourTinter.field_d != -1 &&
                    TeamColourTinter.field_d != 0) {
                    ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(127) + 15000L;
                  }
                }
              } else {
                if (TeamColourTinter.field_d != -1 &&
                  TeamColourTinter.field_d != 0) {
                  ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(127) + 15000L;
                }
              }
            } else {
              if (TeamColourTinter.field_d != -1 &&
                TeamColourTinter.field_d != 0) {
                ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(127) + 15000L;
              }
            }
          } else {
            if (TeamColourTinter.field_d != -1 &&
              TeamColourTinter.field_d != 0) {
              ProxySocketConnector.field_l = ClockAndCookieHelpers.monotonicMillis(127) + 15000L;
            }
          }
        }
        if (TeamColourTinter.field_d != -1 &&
          TeamColourTinter.field_d != 0) {
          if (10 <= AccountTermsPanel.field_Q) {
            if (ReflectionCheckHelpers.field_d >= 10) {
              SessionExitHelpers.requestSessionExit(10);
              if (TeamColourTinter.field_d == 3) {
                LoginResultHelpers.handleLoginResult(Bzip2State.field_F, 256, 1);
              } else {
                if (TeamColourTinter.field_d == 4) {
                  LoginResultHelpers.handleLoginResult(ChatHistoryAllocator.field_c, 256, 1);
                } else {
                  if (2 != TeamColourTinter.field_d) {
                    if (TeamColourTinter.field_d != 5) {
                      LoginResultHelpers.handleLoginResult(AlternateUsernameCredentials.field_s, 256, 1);
                    } else {
                      LoginResultHelpers.handleLoginResult(Projectile.field_R, 5, 1);
                    }
                  } else {
                    LoginResultHelpers.handleLoginResult(RankingAndRasterHelpers.field_j, 256, 1);
                  }
                }
              }
              ChatHistoryHelpers.field_b = true;
            }
          } else {
            if (TeamColourTinter.field_d == 3) {
              this.showErrorPage("js5crc", -16946);
            } else {
              if (TeamColourTinter.field_d == 4) {
                this.showErrorPage("js5io", -16946);
              } else {
                if (TeamColourTinter.field_d != 2) {
                  if (TeamColourTinter.field_d == 5) {
                    this.showErrorPage("outofdate", -16946);
                  } else {
                    this.showErrorPage("js5connect", param0 ^ -16949);
                  }
                } else {
                  this.showErrorPage("js5connect_full", -16946);
                }
              }
            }
          }
        }
        if ((TeamColourTinter.field_d != -1 &&
          TeamColourTinter.field_d != 0 ||
          LoginStateQueries.isLoginFormActive(16731221)) &&
          ProxySocketConnector.field_l <= ClockAndCookieHelpers.monotonicMillis(-111)) {
          ChatHistoryHelpers.field_b = false;
          if (TeamColourTinter.field_d != -1 &&
            TeamColourTinter.field_d != 0) {
            TeamColourTinter.field_d = -1;
            TextAndBitHelpers.resetTransferCounters(-102);
          }
        }
        if (TeamColourTinter.field_d == 0 &&
          !LoginStateQueries.isLoginFormActive(param0 ^ 16731216)) {
          PopupMenuHelpers.field_h = false;
        }
        if (AccountTermsPanel.field_Q == 0 &&
          MeshMaterial.pollArchiveManager(-1)) {
          AccountTermsPanel.field_Q = 1;
        }
        if (AccountTermsPanel.field_Q == 1) {
          if (SceneWidgetNode.field_D != 0) {
            ChecksumAndFrameHelpers.field_f = SceneWidgetNode.openResourceArchive(73, Sprite.field_h);
          }
          WidgetStyleLayer.field_k = GameplayController.openResourceArchive(true, SessionSeedHelpers.field_h, param0 + 251, 1, false);
          QuickChatPhraseCache.field_d = GameplayController.openResourceArchive(true, ArchiveIndex.field_r, param0 ^ 261, 1, false);
          IconLabelControl.field_bc = GameplayController.openResourceArchive(true, LoginConnectionStage.field_c, 256, 1, false);
          AccountTermsPanel.field_Q = 2;
          SessionUiHelpers.field_d = WidgetStyleLayer.field_k;
          MusicPatchPcmStream.field_t = QuickChatPhraseCache.field_d;
        }
        if (AccountTermsPanel.field_Q == 2) {
          if (null != ChecksumAndFrameHelpers.field_f &&
            ChecksumAndFrameHelpers.field_f.ensureIndex(true)) {
            if (!ChecksumAndFrameHelpers.field_f.ensureGroupAvailableByName(12145, "")) {
              ChecksumAndFrameHelpers.field_f = null;
            } else {
              if (ChecksumAndFrameHelpers.field_f.isGroupLoadedByName("", (byte) 90)) {
                ContextMenu.loadInterfaceText(ChecksumAndFrameHelpers.field_f, -128);
                ChecksumAndFrameHelpers.field_f = null;
                LobbyPlayer.resetFrameTimingHistory(0);
              }
            }
          }
          if (ChecksumAndFrameHelpers.field_f == null) {
            AccountTermsPanel.field_Q = 3;
          }
        }
        if (AccountTermsPanel.field_Q == 3 &&
          TextLayout.areCommonUiArchivesReady(WidgetStyleLayer.field_k, IconLabelControl.field_bc, param0 ^ -6, QuickChatPhraseCache.field_d) &&
          SoundAndUrlHelpers.areAllGroupsAvailable(IconLabelControl.field_bc, param0 - 58)) {
          ClientGlobals.releaseInputReferences(false);
          RegistrationRequestDialog.emptyGuardStub(-6);
          ClientException.field_i = AgeValidator.field_q;
          IntrusiveNode.field_a = false;
          AccountRegistrationPanel.initializeAccountUiResources((byte) -127, LoadingProgressDialog.field_ib, IconLabelControl.field_bc, WidgetStyleLayer.field_k, QuickChatPhraseCache.field_d);
          if (SoundCache.field_j ||
            null != ReflectionCheckHelpers.field_k) {
            stackIn_113_0 = ReflectionCheckHelpers.field_k;
            stackIn_114_1 = !(SoundCache.field_j);
            stackIn_117_2 = !(SoundCache.field_j);
            EmailAvailabilityValidator.openLoginDialog(stackIn_113_0, stackIn_114_1, stackIn_117_2, param0 + 7);
          }
          if (RankingQuery.field_q) {
            MarkerSliderPainter.showLoadingDialog((byte) 120);
          }
          if (null == ValidationIndicator.field_cb) {
            ValidationIndicator.field_cb = DateOfBirthValidator.getSoundMixer((byte) 83);
            SentinelDesigner.field_e = LoginHandshakeHelpers.getSoundBufferMillis((byte) 62);
          }
          TextLayout.prepareLogoAnimation(IconLabelControl.field_bc, 73, SentinelDesigner.field_e, ValidationIndicator.field_cb);
          QuickChatPhraseCache.field_d = null;
          WidgetStyleLayer.field_k = null;
          IconLabelControl.field_bc = null;
          AccountRequestResult.readUsernameParameter((java.applet.Applet) (this), false);
          LobbyPlayer.resetFrameTimingHistory(param0 - 5);
          AccountTermsPanel.field_Q = 10;
        }
        if (AccountTermsPanel.field_Q == 10) {
          if (SceneWidgetNode.field_D != 0) {
            BirthDateEntryPanel.field_S = SceneWidgetNode.openResourceArchive(param0 - 99, DualNode.field_p);
          }
          AccountTermsPanel.field_Q = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (AccountTermsPanel.field_Q == 11) {
          if (BirthDateEntryPanel.field_S != null && (!BirthDateEntryPanel.field_S.ensureIndex(true) ||
            !BirthDateEntryPanel.field_S.ensureAllGroupsAvailable(25))) {
            LoadingCaptionHelpers.setLoadingProgress(ModalStack.formatArchiveLoadingProgress((byte) -119, EmailAvailabilityValidator.field_t, IntKeyLookup.field_g, BirthDateEntryPanel.field_S), 0.0f, -21801);
            decompiledFrameRemainder0 = false;
          }
          else {
            AccountTermsPanel.field_Q = 12;
            MenuInputState.field_f = true;
          }
        }
        if (AccountTermsPanel.field_Q == 12 &&
          !MenuInputState.field_f) {
          AccountTermsPanel.field_Q = 13;
        }
        if (AccountTermsPanel.field_Q == 13) {
          var3Lifetime2 = 1;
          if (PendingDataRequest.field_q != null) {
            stackIn_147_0 = (!PendingDataRequest.field_q.pollLoading(-2)) ? 0 : 1;
            var3Lifetime2 = stackIn_147_0;
            LoadingCaptionHelpers.setLoadingProgress(PendingDataRequest.field_q.field_i, PendingDataRequest.field_q.field_g, -21801);
          }
          if (var3Lifetime2 != 0) {
            AccountTermsPanel.field_Q = 20;
          }
        }
        if (!param1 &&
          ImageProducerRasterBuffer.field_x) {
          TutorialStepTable.detachInputListeners(ArchiveLoadStep.field_n, 9174);
          this.recreateCanvas(false);
          HighscoreColumnHeader.attachCanvasInput((byte) -93, ArchiveLoadStep.field_n);
        }
        if (dg.field_h[8]) {
          LoadingStatusHelpers.sendReflectionCheckReplies((byte) -110);
        }
    }

    private final void handleSessionCookiePacket(byte param0) {
        if (param0 != -112) {
          this.enablePacketSix(67);
        }
        String var2 = IconTextComponent.readIncomingString(8347);
        MidiPcmStream.setSessionCookie(param0 - 14, var2, Projectile.getApplet((byte) -21));
    }

    final void dispatchCommonPacket(int param0) {
        int stackIn_31_0 = 0;
        boolean stackIn_32_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (param0 <= 40) {
          this.handleOpenUrlPacket(8);
        }
        var2 = ArrayWidgetContainer.field_N;
        if (var2 < 64 &&
          dg.field_h[var2]) {
          if (0 == var2) {
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              GrowableIntList.handleHighscoreResponse(-116);
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  ChatMessage.readQueuedListResponse(true);
                } else {
                  if (var2 == 5) {
                    UrlAndReplyHelpers.readPendingDataReply(-16786);
                  } else {
                    if (var2 == 6) {
                      LoginForm.handleRankingsResponse(113);
                    } else {
                      if (var2 != 7) {
                        if (var2 == 8) {
                          TickClock.readReflectionCheckRequest(IterableDualNodeDeque.field_i, false, LoginConnectionStage.field_d, ViewportController.field_f);
                        } else {
                          if (var2 == 16) {
                            StatefulTextPainter.readLocalPlayerName(-76);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                FriendListHelpers.handleFriendListPacket(2);
                                return;
                              }
                              if (var2 == 17) {
                                this.handleOpenUrlPacket(3894);
                                return;
                              }
                              if (var2 == 18) {
                                MessageMenuHelpers.readChatAvailability(false);
                                return;
                              }
                              MusicCrossfadeStream.reportClientError("MGS1: " + ClientErrorSupport.describePacketHistory((byte) 94), -27, (Throwable) null);
                              LoginForm.closeConnection(-93);
                              return;
                            }
                            stackIn_31_0 = -98;
                            stackIn_32_1 = (12 == var2);
                            var3 = AgeValidator.readLoginReplyWithIntGuard(stackIn_31_0, stackIn_32_1);
                            WeightedCacheEntry.acceptChatMessage(var3, -69);
                          }
                        }
                      } else {
                        this.handleSessionCookiePacket((byte) -112);
                      }
                    }
                  }
                }
              } else {
                QuickChatPacketHelpers.handlePendingRequestReply(0);
              }
            }
          } else {
            TextAndBitHelpers.consumeIntReply(2158);
          }
          return;
        }
        MusicCrossfadeStream.reportClientError("MGS2: " + ClientErrorSupport.describePacketHistory((byte) 94), -85, (Throwable) null);
        LoginForm.closeConnection(-94);
    }

    private final void enablePacketSix(int param0) {
        dg.field_h[6] = true;
        if (param0 <= 11) {
          String var3 = (String) null;
          this.readAppletParameters(12, (String) null, -17, -112, 117);
        }
    }

    private final void configureCommonPacketHandlers(boolean param0, boolean param1) {
        dg.field_h[3] = true;
        dg.field_h[8] = param1;
        dg.field_h[7] = true;
        dg.field_h[16] = true;
        dg.field_h[18] = true;
        dg.field_h[0] = param0;
        dg.field_h[17] = true;
    }

    protected FunOrbClient() {
    }

    private final void initializePacketLengths(boolean param0) {
        SocketJs5Transport.field_B[18] = 1;
        SocketJs5Transport.field_B[3] = -1;
        SocketJs5Transport.field_B[2] = -2;
        SocketJs5Transport.field_B[11] = -1;
        SocketJs5Transport.field_B[6] = -2;
        if (!param0) {
          return;
        }
        SocketJs5Transport.field_B[12] = -1;
        SocketJs5Transport.field_B[13] = -1;
        SocketJs5Transport.field_B[7] = -1;
        SocketJs5Transport.field_B[17] = -1;
        SocketJs5Transport.field_B[1] = 16;
        SocketJs5Transport.field_B[16] = -1;
        SocketJs5Transport.field_B[4] = -1;
        SocketJs5Transport.field_B[5] = -1;
        SocketJs5Transport.field_B[10] = -1;
        SocketJs5Transport.field_B[8] = -2;
        SocketJs5Transport.field_B[9] = -1;
    }

    static {
        field_o = "Spectating <%0>'s game";
        field_z = new int[]{0, 55, 57, 62, 65, 69, 72, 75, 79, 84, 88, 92};
        field_p = new int[8192];
        field_s = new boolean[][]{null, null, new boolean[]{false, false, false, false, false, true}};
        field_y = "<%0> has withdrawn the request to join.";
    }
}
