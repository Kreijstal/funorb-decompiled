/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class GameShell extends GameApplet {
    private boolean field_B;
    String field_y;
    private int field_w;
    private int field_r;
    private int field_p;
    static String field_u;
    static Sprite field_x;
    private int field_C;
    static String field_o;
    private boolean field_n;
    static DialogLayer field_A;
    private long field_s;
    private int field_q;
    private boolean field_t;
    static String field_v;
    private static boolean[] field_z;
    static int[] field_m;
    private int field_l;

    private final int pollReconnect(int param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!MusicPatch.isGuestSessionActive(true)) {
          return -1;
        }
        if (param0 != -1) {
          return 31;
        }
        if (KeyboardQueueConsumer.field_c) {
          return -1;
        }
        var2 = GridActor.advanceLoginHandshake(TextButton.getAccountPassword(param0 + 1), this.field_r, this.field_B, -9, AccountFormTextHelpers.getAccountLoginIdentifier((byte) 125), true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!BoundedRandomAccessFile.field_b) {
            this.showFatalError("reconnect", (byte) 126);
          }
          RankingStatsDecoder.beginAccountReconnect((byte) -128);
          HighscoreRequest.handleAccountResult(10, QuickChatDynamicCommand.field_g, var2);
          KeyboardQueueConsumer.field_c = true;
          Base37Codec.field_c = MonotonicClockHelpers.monotonicMillis((byte) 49) + 15000L;
          return var2;
        }
        if (ArchiveRequest.field_t == 11 &&
          SpriteState.field_r == 0) {
          MessagePanel.updateAccountProgressResult(260);
        }
        return var2;
    }

    final void configurePacketFeatures(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.configureBasePacketHandlers(false, (byte) -124);
        if (!param2) {
          this.field_p = -29;
        }
        if (param4) {
          this.enableRankingStatsPackets(110);
        }
        if (param3) {
          this.enableHighscorePackets((byte) 0);
        }
        if (param1) {
          this.enableProgressPackets(28135);
        }
        if (param0) {
          this.enableSavedDataPackets(-120);
        }
    }

    final static EmailValidationError validateEmailTopLevelDomain(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        EmailValidationError stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          if (param1 > -117) {
            field_o = (String) null;
          }
          var2_int = param0.length();
          var3 = 0;
          while (true) {
            if (var2_int <= var3) {
              stackIn_12_0 = FriendOrderingHelpers.field_d;
              return stackIn_12_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_9_0 = null;
          return (EmailValidationError) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("u.SA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void enableHighscorePackets(byte param0) {
        field_z[2] = true;
        if (param0 != 0) {
          this.reconnectAndResendRequests(46);
        }
    }

    private final void initializePacketLengths(int param0) {
        ValidationIndicator.field_G[17] = -1;
        ValidationIndicator.field_G[3] = -1;
        ValidationIndicator.field_G[16] = param0;
        ValidationIndicator.field_G[7] = -1;
        ValidationIndicator.field_G[18] = 1;
        ValidationIndicator.field_G[2] = -2;
        ValidationIndicator.field_G[10] = -1;
        ValidationIndicator.field_G[5] = -1;
        ValidationIndicator.field_G[8] = -2;
        ValidationIndicator.field_G[13] = -1;
        ValidationIndicator.field_G[11] = -1;
        ValidationIndicator.field_G[1] = 16;
        ValidationIndicator.field_G[4] = -1;
        ValidationIndicator.field_G[9] = -1;
        ValidationIndicator.field_G[6] = -2;
        ValidationIndicator.field_G[12] = -1;
    }

    final void serviceClientTick(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        boolean stackIn_106_0 = false;
        int stackIn_108_1 = 0;
        String stackIn_108_2 = null;
        boolean stackIn_109_3;
        int stackIn_139_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = wizardrun.field_H;
        if (null != StringPaddingHelpers.field_c) {
          if (null == LoginChoicePanel.field_E) {
            var6 = WidgetContainer.getAppletContainer(152);
            var4 = var6.getSize();
            StringPaddingHelpers.field_c.setAvailableSize((byte) -64, var4.height, var4.width);
          }
          StringPaddingHelpers.field_c.updateResponsiveSize(true);
        }
        KeyboardQueueConsumer.consumeKeyboardQueue(-1);
        DualLinkDeque.pollMouseState((byte) -21);
        if (!MouseWheelInput.isIntroOrAccountScreenActive((byte) 60) &&
          ArchiveRequest.field_t != 11) {
          IsaacRandom.processFullscreenDialogs(param0 + 4122);
        }
        if (null != MessagePanel.field_K) {
          LoginPacketBuilder.field_c = MessagePanel.field_K.pollRotation(-1);
        }
        if (param0 != -4114) {
          this.updateIntroAndAccountInput((byte) 27);
        }
        if (NameSuggestionsPanel.isAccountLoggedIn(0)) {
          var3 = NameCheckHelpers.getTickRate((byte) -95) * 1200;
          if (this.field_n ||
            !(AccountFormText.getKeyIdleTime((byte) 28) <= var3) &&
            !(var3 >= ThrowableFormattingHelpers.getMouseIdleTime((byte) 53))) {
            this.field_n = false;
            HuffmanDecoder.closeAccountConnection(-92);
            RankingStatsDecoder.beginAccountReconnect((byte) -124);
            HighscoreRequest.handleAccountResult(param0 ^ -4124, RasterBuffer.field_e, 2);
            GridActor.refreshScreenshotPreview(false);
            KeyboardQueueConsumer.field_c = true;
            Base37Codec.field_c = 15000L + MonotonicClockHelpers.monotonicMillis((byte) 25);
          }
        }
        if (SpriteState.field_r == -1 ||
          SpriteState.field_r == 0) {
          stackIn_26_0 = (-1 != SpriteState.field_r) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          SpriteState.field_r = IntrusiveNodeHashTable.serviceArchiveTransport(14326);
          if (var3Lifetime1 != 0 &&
            0 == SpriteState.field_r &&
            11 == ArchiveRequest.field_t &&
            !MusicPatch.isGuestSessionActive(true)) {
            MessagePanel.updateAccountProgressResult(260);
          }
          if (SpriteState.field_r != -1 &&
            0 != SpriteState.field_r) {
            Base37Codec.field_c = MonotonicClockHelpers.monotonicMillis((byte) 36) + 15000L;
          }
        }
        if (SpriteState.field_r != -1 &&
          SpriteState.field_r != 0) {
          if (BoundedRandomAccessFile.field_a < 10) {
            if (3 != SpriteState.field_r) {
              if (SpriteState.field_r != 4) {
                if (SpriteState.field_r != 2) {
                  if (SpriteState.field_r != 5) {
                    this.showFatalError("js5connect", (byte) 126);
                  } else {
                    this.showFatalError("outofdate", (byte) 126);
                  }
                } else {
                  this.showFatalError("js5connect_full", (byte) 126);
                }
              } else {
                this.showFatalError("js5io", (byte) 127);
              }
            } else {
              this.showFatalError("js5crc", (byte) 127);
            }
          } else {
            if (ArchiveRequest.field_t >= 10) {
              RankingStatsDecoder.beginAccountReconnect((byte) -125);
              if (SpriteState.field_r == 3) {
                HighscoreRequest.handleAccountResult(10, ScoreSubmission.field_r, 256);
              } else {
                if (SpriteState.field_r == 4) {
                  HighscoreRequest.handleAccountResult(10, MusicPatchLoader.field_f, 256);
                } else {
                  if (SpriteState.field_r == 2) {
                    HighscoreRequest.handleAccountResult(param0 ^ -4124, AccountFormText.field_d, 256);
                  } else {
                    if (SpriteState.field_r == 5) {
                      HighscoreRequest.handleAccountResult(10, LoginChoicePanel.field_L, 5);
                    } else {
                      HighscoreRequest.handleAccountResult(param0 + 4124, SingleChildWidget.field_C, 256);
                    }
                  }
                }
              }
              KeyboardQueueConsumer.field_c = true;
            }
          }
        }
        if ((SpriteState.field_r != -1 &&
          SpriteState.field_r != 0 ||
          MusicPatch.isGuestSessionActive(true)) &&
          Base37Codec.field_c <= MonotonicClockHelpers.monotonicMillis((byte) 22)) {
          KeyboardQueueConsumer.field_c = false;
          if (-1 != SpriteState.field_r &&
            SpriteState.field_r != 0) {
            SpriteState.field_r = -1;
            SpriteFilterHelpers.resetJs5RetryState((byte) -117);
          }
        }
        if (SpriteState.field_r == 0 &&
          !MusicPatch.isGuestSessionActive(true)) {
          BeveledFrameFactory.field_c = false;
        }
        if (BoundedRandomAccessFile.field_a == 0 &&
          IntrusiveNodeHashTable.ensureMasterIndex(param0 + 3988)) {
          BoundedRandomAccessFile.field_a = 1;
        }
        if (BoundedRandomAccessFile.field_a == 1) {
          if (0 != AccountProgressDialog.field_tb) {
            GridActor.field_c = BufferedRandomAccessFile.createDefaultArchive(46, IndexedSpriteArrayFactory.field_a);
          }
          UiWidget.field_x = ValidationHelpWidget.createUiArchive(EmailCheckRequest.field_g, param0 ^ 1784758027, false, 1, true);
          LevelActorSpawner.field_b = ValidationHelpWidget.createUiArchive(DisplayNameValidator.field_o, -1784753947, false, 1, true);
          IconButtonPainter.field_a = ValidationHelpWidget.createUiArchive(DualLinkNode.field_n, param0 - 1784749833, false, 1, true);
          UsernameLoginCredentials.field_h = UiWidget.field_x;
          BoundedRandomAccessFile.field_a = 2;
          TickClock.field_c = LevelActorSpawner.field_b;
        }
        if (BoundedRandomAccessFile.field_a == 2) {
          if (GridActor.field_c != null &&
            GridActor.field_c.ensureIndex(17820)) {
            if (!GridActor.field_c.hasNamedGroup(-1, "")) {
              GridActor.field_c = null;
            } else {
              if (GridActor.field_c.ensureNamedGroupLoaded((byte) 29, "")) {
                ProxySocketConnector.loadClientText(0, GridActor.field_c);
                GridActor.field_c = null;
                GameGraphicsResources.resetFrameTiming(param0 + 4114);
              }
            }
          }
          if (null == GridActor.field_c) {
            BoundedRandomAccessFile.field_a = 3;
          }
        }
        if (3 == BoundedRandomAccessFile.field_a &&
          RankingRequest.areCommonUiArchivesReady(UiWidget.field_x, IconButtonPainter.field_a, (byte) -1, LevelActorSpawner.field_b) &&
          ArchiveReadinessHelpers.areAllGroupsAvailable(param0 + 4114, IconButtonPainter.field_a)) {
          AchievementSubmission.clearLoginDialogs(-382);
          SingleChildWidget.releaseSoundArchiveWithGuard(3);
          MessagePanel.field_M = false;
          ArchiveContainerHelpers.loadingMessage = NameSuggestionsPanel.field_G;
          ByteStorage.loadAccountUi(param0 ^ -6284, IconButtonPainter.field_a, UiWidget.field_x, LevelActorSpawner.field_b, IntrusiveDequeCursor.field_g);
          if (ProgressRefreshState.field_c ||
            null != ValidationHelpWidget.field_K) {
            stackIn_106_0 = !(ProgressRefreshState.field_c);
            stackIn_108_1 = 126;
            stackIn_108_2 = ValidationHelpWidget.field_K;
            stackIn_109_3 = !(ProgressRefreshState.field_c);
            ScoreSubmission.openLoginDialogWithIntGuard(stackIn_106_0, stackIn_108_1, stackIn_108_2, stackIn_109_3);
          }
          if (ThrowableFormattingHelpers.field_c) {
            IndexedSpriteState.showLoginWorkflow(param0 ^ -4158);
          }
          if (null == ReflectionCheck.field_n) {
            ReflectionCheck.field_n = SocketJs5Transport.getAudioMixer((byte) 126);
            AccountValidationHelpers.field_f = GameShell.getLogoDurationMillis(8300);
          }
          LogoAnimationLoader.loadLogoAnimation(IconButtonPainter.field_a, (byte) -82, AccountValidationHelpers.field_f, ReflectionCheck.field_n);
          LevelActorSpawner.field_b = null;
          IconButtonPainter.field_a = null;
          UiWidget.field_x = null;
          EmailValidationError.checkAppletUsernameParameter((java.applet.Applet) (this), param0 ^ -4213);
          GameGraphicsResources.resetFrameTiming(0);
          BoundedRandomAccessFile.field_a = 10;
        }
        if (10 == BoundedRandomAccessFile.field_a) {
          if (AccountProgressDialog.field_tb != 0) {
            SpriteFilterHelpers.field_b = BufferedRandomAccessFile.createDefaultArchive(90, LevelDecodingHelpers.field_b);
          }
          BoundedRandomAccessFile.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (BoundedRandomAccessFile.field_a == 11) {
          if (null != SpriteFilterHelpers.field_b && (!SpriteFilterHelpers.field_b.ensureIndex(17820) ||
            !SpriteFilterHelpers.field_b.areAllGroupsAvailable(-111))) {
            ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(param0 ^ 4150, KeyboardShutdownHelpers.field_e, SpriteFilterHelpers.field_b, TextWrappingHelpers.field_c), 0.0f, 0);
            decompiledFrameRemainder0 = false;
          }
          else {
            HighscorePlayerState.field_c = true;
            BoundedRandomAccessFile.field_a = 12;
          }
        }
        if (BoundedRandomAccessFile.field_a == 12 &&
          !HighscorePlayerState.field_c) {
          BoundedRandomAccessFile.field_a = 13;
        }
        if (13 == BoundedRandomAccessFile.field_a) {
          var3Lifetime2 = 1;
          if (null != NameCheckHelpers.field_b) {
            stackIn_139_0 = (!NameCheckHelpers.field_b.advanceLoading(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_139_0;
            ValidationState.showLoadingProgress(NameCheckHelpers.field_b.statusMessage, NameCheckHelpers.field_b.progress, 0);
          }
          if (var3Lifetime2 != 0) {
            BoundedRandomAccessFile.field_a = 20;
          }
        }
        if (!param1 &&
          FadingDialog.field_F) {
          EmailLoginCredentials.detachCanvasInput(wizardrun.field_G, 8053);
          this.replaceCanvas(88);
          IndexedSpriteState.attachCanvasInput(false, wizardrun.field_G);
        }
        if (field_z[8]) {
          WeightedLruCache.sendReadyReflectionChecks(8);
        }
    }

    final static void insertNodeBefore(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (null != param2.previous) {
            param2.unlink(false);
          }
          param2.previous = param1.previous;
          param2.next = param1;
          if (param0 != 74) {
            GameShell.releaseStatics(-127);
          }
          param2.previous.next = param2;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "u.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void enableSavedDataPackets(int param0) {
        field_z[5] = true;
        if (param0 > -77) {
          GameShell.releaseStatics(111);
        }
    }

    private final void configureBasePacketHandlers(boolean param0, byte param1) {
        field_z[8] = param0;
        field_z[0] = true;
        field_z[17] = true;
        field_z[16] = true;
        field_z[18] = true;
        int var3 = 92 % ((param1 + 62) / 56);
        field_z[3] = true;
        field_z[7] = true;
    }

    private final void readBrowserUrlPacket(int param0) {
        int var2 = AccountCreationForm.field_N.readUnsignedByte(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + DelegatingCanvas.field_c;
        byte[] var5 = new byte[var4];
        if (param0 <= 3) {
          return;
        }
        AccountCreationForm.field_N.readCipheredBytes(0, var4, 0, var5);
        BrowserUrlLauncher.openExternalUrl(var3 != 0, 122, AccountFormTextHelpers.decodeCp1252Bytes((byte) 113, var5), DisplayNameValidator.getActiveApplet(1));
    }

    final static void writeRandomSeed(PacketBuffer param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = wizardrun.field_H;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (UiWidget.randomSeedFile != null) {
              try {
                UiWidget.randomSeedFile.seek(0L, (byte) 113);
                UiWidget.randomSeedFile.readAll(var6, 9350);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var2[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param0.writeBytes(var2, 0, 24, -99);
            if (param1 != -18) {
              GameShell.getLogoDurationMillis(5);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("u.HA(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void initializeApplet(int param0, byte param1, String param2) {
        try {
          int var4_int = -125 / ((param1 + 9) / 49);
          this.initializeAppletAtSize(param0, 480, param2, (byte) 19, 640);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "u.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void enableProgressPackets(int param0) {
        field_z[4] = true;
        if (param0 != 28135) {
          field_m = (int[]) null;
        }
    }

    private final static int getLogoDurationMillis(int param0) {
        if (param0 != 8300) {
          IntrusiveNode var2 = (IntrusiveNode) null;
          GameShell.insertNodeBeforeWithIntGuard(86, (IntrusiveNode) null, (IntrusiveNode) null);
        }
        return DiskCacheRequest.field_v;
    }

    private final void readSessionCookiePacket(byte param0) {
        int var3 = -90 / ((-61 - param0) / 53);
        String var2 = CheckboxPainter.readAccountResponseString(-106);
        IntrusiveNode.writeSessionCookie(var2, DisplayNameValidator.getActiveApplet(1), (byte) -107);
    }

    private final int processAccountWorkflow(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = wizardrun.field_H;
          var4 = ArchiveCatalog.processAccountInput(AccountProgressDialog.field_tb, LoginPacketBuilder.field_c, param1, param0 - 6426);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = AccountValidationHelpers.validateAccountText(RankingStatsRequest.getEmailPrefill((byte) -68), -124, AccountPacketState.getLoginNamePrefill((byte) 12));
            if (var5_int != -1) {
              LevelDecodingHelpers.handleNameAvailabilityResult(QuickChatDynamicCommand.field_g, -101, DropTargetWidget.field_I, var5_int);
              DropTargetWidget.field_I = null;
              QuickChatDynamicCommand.field_g = null;
            }
            var11 = RasterBuffer.takeAccountResponseFlag((byte) -52);
            if (var11 != null) {
              FullscreenFailureDialog.completeEmailCheck(var11.booleanValue(), 3289);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = WhirlpoolHasher.advanceAccountCreation(TextButton.getAccountPassword(param0 - 6498), this.field_r, AccountFormTextHelpers.getAccountLoginIdentifier((byte) 123), ArchiveContainerHelpers.getAccountEmail(-21), ProgressQuery.getAccountAge(0), param0 - 6498, UiThemeSetupHelpers.getAccountCreationConsent(-126));
            if (var5_intLifetime1 != -1) {
              ErrorReportingHelpers.completeNameCheck(QuickChatDynamicCommand.field_g, DropTargetWidget.field_I, (byte) -112, var5_intLifetime1);
              QuickChatDynamicCommand.field_g = null;
              DropTargetWidget.field_I = null;
            }
          }
          if (var4 == 3) {
            if (-1 != SpriteState.field_r &&
              SpriteState.field_r != 0) {
              SpriteState.field_r = -1;
              SpriteFilterHelpers.resetJs5RetryState((byte) -128);
            }
            if (!param2) {
              var5_intLifetime2 = GridActor.advanceLoginHandshake(TextButton.getAccountPassword(0), this.field_r, this.field_B, -9, AccountFormTextHelpers.getAccountLoginIdentifier((byte) 124), false);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  MusicPatch.field_m = WidgetContainer.field_D;
                  MessagePanel.updateAccountProgressResult(260);
                  ArchiveRequest.field_t = 10;
                  FramedButtonPainter.field_p = false;
                } else {
                  HighscoreRequest.handleAccountResult(param0 - 6488, QuickChatDynamicCommand.field_g, var5_intLifetime2);
                  QuickChatDynamicCommand.field_g = null;
                }
              }
            } else {
              KeyboardQueueConsumer.field_c = false;
            }
          }
          if (var4 == 4) {
            if (IntrusiveDequeCursor.field_g) {
              DiskCacheWorker.clearSessionAndReload(DisplayNameValidator.getActiveApplet(param0 - 6497), (byte) -113);
            } else {
              FramedButtonPainter.field_p = true;
              ArchiveRequest.field_t = 10;
            }
          }
          if (5 == var4) {
            RankingWorkspaceHelpers.openQuitPage(125, DisplayNameValidator.getActiveApplet(1));
          }
          if (var4 == 6 &&
            MessagePanel.field_M) {
            ArchiveRequest.field_t = 10;
          }
          if (var4 == 7) {
            GrowableIntList.openServerList(param0 - 6438, DisplayNameValidator.getActiveApplet(1));
          }
          if (var4 == 8) {
            DiskCacheWorker.clearSessionAndReload(DisplayNameValidator.getActiveApplet(1), (byte) -113);
          }
          if (var4 == 9) {
            HighscorePlayer.openSupportPage(param0 ^ 7600, DisplayNameValidator.getActiveApplet(1));
          }
          if (var4 == 10) {
            AccountPacketState.field_b.writeCipheredOpcode((byte) -118, 17);
          }
          if (var4 == 11) {
            IntegerSyntaxHelpers.openReloadPage(DisplayNameValidator.getActiveApplet(1), (byte) -40);
          }
          if (param0 != 6498) {
            this.enableRankingStatsPackets(-45);
          }
          if (var4 == 12) {
            DisplayModeInfo.openRelativeBrowserPage(GameGraphicsResources.getAccountWorkflowResult(true), -1926289535, DisplayNameValidator.getActiveApplet(1));
          }
          if (var4 == 13) {
            try {
              if (null == BeveledFrameFactory.field_b) {
                BeveledFrameFactory.field_b = new UrlPacketDownloader(MusicPatchLoader.field_g, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (BeveledFrameFactory.field_b.pollDownload(81)) {
                var12 = BeveledFrameFactory.field_b.getDownloadedPacket(-4);
                if (var12 == null) {
                  ContentTransitionDialog.ignoreCountryListResponse(param0 ^ 6507, (String) null);
                } else {
                  var7 = Cp1252DecodingHelpers.decodeCp1252(0, var12.position, var12.payload, false);
                  ContentTransitionDialog.ignoreCountryListResponse(9, var7);
                }
                BeveledFrameFactory.field_b = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ResizableDialog.reportClientError((Throwable) ((Object) var5), "S1", param0 ^ -6996);
              var10 = (String) null;
              ContentTransitionDialog.ignoreCountryListResponse(9, (String) null);
              BeveledFrameFactory.field_b = null;
            }
          }
          if (var4 == 15) {
            ArchiveRequest.field_t = 10;
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

    final void dispatchAccountPacket(boolean param0) {
        int stackIn_33_0 = 0;
        boolean stackIn_34_1 = false;
        ChatMessage stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = wizardrun.field_H;
        if (!param0) {
          field_m = (int[]) null;
        }
        var2 = AchievementUnlock.field_k;
        if (var2 < 64 &&
          field_z[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 == 4) {
                  DraggableWidget.readProgressResponse(-17144);
                } else {
                  if (var2 == 5) {
                    DualLinkNode.readSavedDataResponse(-2);
                  } else {
                    if (var2 == 6) {
                      NameCheckProgressDialog.readRankingResponse(-114);
                    } else {
                      if (7 != var2) {
                        if (8 == var2) {
                          SingleChildWidget.readReflectionCheck(-21284, AccountCreationForm.field_N, MusicPatchLoader.field_g, DelegatingCanvas.field_c);
                        } else {
                          if (16 != var2) {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (var2 == 13) {
                                FriendsListState.readSocialListUpdate(true);
                                return;
                              }
                              if (var2 == 17) {
                                this.readBrowserUrlPacket(108);
                                return;
                              }
                              if (var2 == 18) {
                                ClientShutdownHelpers.readLoginFlagResetPacket(2046877441);
                                return;
                              }
                              ResizableDialog.reportClientError((Throwable) null, "MGS1: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
                              HuffmanDecoder.closeAccountConnection(-42);
                              return;
                            }
                            stackIn_33_0 = -2;
                            stackIn_34_1 = (var2 == 12);
                            var3 = WrappedTextLayout.readChatMessage(stackIn_33_0, stackIn_34_1);
                            stackIn_36_0 = var3;
                            stackIn_37_1 = !(param0);
                            ProgressQuery.acceptChatMessage(stackIn_36_0, stackIn_37_1);
                          } else {
                            FullscreenController.readAccountNamePacket(12582);
                          }
                        }
                      } else {
                        this.readSessionCookiePacket((byte) -117);
                      }
                    }
                  }
                }
              } else {
                DropTargetWidget.readAchievementResponse(false);
              }
            } else {
              TextLayoutLine.readHighscoreResponse((byte) 112);
            }
          } else {
            AudioServiceThread.readRankingStatsReply(124);
          }
          return;
        }
        ResizableDialog.reportClientError((Throwable) null, "MGS2: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
        HuffmanDecoder.closeAccountConnection(-79);
    }

    final int processAccountScreen(byte param0, boolean param1) {
        if (param0 <= 0) {
          return -74;
        }
        return this.processAccountWorkflow(6498, param1, true);
    }

    final void initializeClientServices(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        AccountProgressDialog.field_tb = this.field_p;
        LoadingMessageHelpers.selectLoadingLanguage(AccountProgressDialog.field_tb, !param4 ? true : false);
        PcmResampler.configureClientNetwork(AccountProgressDialog.field_tb, this.field_l, param6, param1, this.field_q, this.field_s, this.field_w, this.field_y, 5000, 5000, this.field_t, this.field_C, 64, MusicPatchLoader.field_g);
        LoginForm.configureArchiveConnection(this.field_w, param6, this.field_C, MusicPatchLoader.field_g, this.field_l, this.field_y, true, this.field_q, AccountProgressDialog.field_tb);
        RankingRequest.initializeExtendedKeyMap(0);
        MessagePanel.field_K = NineSliceFrame.createMouseWheelHandler(param4);
        IndexedSpriteState.attachCanvasInput(param4, wizardrun.field_G);
        EmailCheckRequest.field_g = param7;
        DisplayNameValidator.field_o = param2;
        LevelDecodingHelpers.field_b = param3;
        DualLinkNode.field_n = param0;
        IndexedSpriteArrayFactory.field_a = param5;
        this.initializePacketLengths(-1);
        MenuOverlayHelpers.clearClientFlags(-19);
    }

    protected GameShell() {
    }

    public static void releaseStatics(int param0) {
        field_u = null;
        field_A = null;
        field_x = null;
        field_z = null;
        field_v = null;
        if (param0 != -18084) {
          field_v = (String) null;
        }
        field_m = null;
        field_o = null;
    }

    final int reconnectAndResendRequests(int param0) {
        if (param0 != -10618) {
          this.serviceClientTick(88, true);
        }
        int var2 = this.pollReconnect(-1);
        if (var2 == 0 ||
          var2 == 1) {
          if (field_z[1]) {
            DisplayModeInfo.resendRankingStatsRequests(2, (byte) -85);
          }
          if (field_z[2]) {
            CachedArchiveProvider.resendHighscoreRequests(-28323, 3);
          }
          if (field_z[3]) {
            RasterSnapshot.resendAchievementRequests((byte) 51, 4);
          }
          if (field_z[4]) {
            UrlPacketDownloader.resendProgressRequests(5, param0 ^ 10496);
          }
          if (field_z[5]) {
            IntHashTable.resendSavedDataRequests((byte) -86, 6);
          }
          if (field_z[6]) {
            CachedArchiveProvider.resendRankingRequests(7, param0 + 10618);
          }
          if (field_z[8]) {
            Crc32Helpers.initializeReflectionQueue((byte) 99);
          }
        }
        return var2;
    }

    private final void initializeAppletAtSize(int param0, int param1, String param2, byte param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
            if (!this.canInitializeApplet(param3 ^ -36)) {
              return;
            }
            this.field_y = this.getCodeBase().getHost();
            var6 = this.field_y.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_B = stackIn_8_1;
            this.field_C = Integer.parseInt(this.getParameter("gameport1"));
            this.field_w = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (param3 != 19) {
              field_m = (int[]) null;
            }
            if (var7 != null) {
              this.field_l = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_t = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_p = Integer.parseInt(var8);
            }
            if (this.field_p >= 5) {
              this.field_p = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            ThrowableFormattingHelpers.field_c = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletThread(this.field_q, param0, (byte) -100, param2, param1, param4, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ResizableDialog.reportClientError((Throwable) ((Object) var6_ref), (String) null, -562);
            this.showFatalError("crash", (byte) 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("u.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void enableRankingStatsPackets(int param0) {
        field_z[1] = true;
        if (param0 < 88) {
          GameShell.releaseStatics(63);
        }
    }

    final void updateIntroAndAccountInput(byte param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int var2;
        int var3;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        int var2Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var3 = wizardrun.field_H;
        if (!GameMenu.canLoadGameResources((byte) 89)) {
          if (BoundedRandomAccessFile.field_a < 10) {
            var2 = 95 / ((param0 + 52) / 50);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (UiThemeSetupHelpers.isLogoAnimationComplete((byte) -117)) {
              if (ArchiveRequest.field_t != 0) {
                QuickChatPhraseDefinition.processAccountUiInputWithIntGuard(0, LoginPacketBuilder.field_c);
              } else {
                discarded$5 = this.processAccountWorkflow(6498, false, false);
              }
            } else {
              StatefulWidgetPainter.advanceLogoAnimation(250);
            }
          }
        } else {
          stackIn_3_1 = 6498;
          stackIn_4_2 = (null != LoginChoicePanel.field_E);
          discarded$6 = this.processAccountWorkflow(stackIn_3_1, stackIn_4_2, false);
        }
        if (decompiledFrameRemainder0) {
          var2Lifetime1 = 95 / ((param0 + 52) / 50);
        }

    }

    static {
        field_o = "The Beach";
        field_m = new int[]{500, 100, 100, 300, 500, 100, 200, 200, 300, 500, 1000, 200};
        field_v = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_z = new boolean[64];
        field_u = "Please wait...";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void insertNodeBeforeWithIntGuard(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (null != param2.previous) {
            param2.unlink(false);
          }
          param2.previous = param1.previous;
          param2.next = param1;
          if (param0 != 74) {
            GameShell.releaseStatics(-127);
          }
          param2.previous.next = param2;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "u.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
