/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PropObject extends SceneObject {
    static int field_F;
    boolean field_K;
    static UiComponent field_O;
    static BinaryBitmapFont field_G;
    boolean field_H;
    static IntrusiveDeque field_M;
    private boolean field_J;
    private int field_P;
    static java.applet.Applet field_L;
    static String field_N;
    static String field_I;

    PropObject(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int var5 = 0;
        int[] var4;
        int var6;
        int[] var8;
        int[] var9;
        int[] var10;
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        this.field_J = false;
        stackIn_3_1 = ((this.field_C & 1073741824) != 0);
        this.field_H = stackIn_3_1;
        stackIn_6_1 = ((this.field_C & 536870912) != 0);
        this.field_K = stackIn_6_1;
        this.field_P = this.field_C;
        this.field_P = this.field_P & -1610612737;
        this.field_P = this.field_P - 1;
        var10 = HudSpriteStore.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        for (var5 = 0; var5 < var10.length; var5++) {
          var6 = var10[var5];
          if (this.field_P == var6) {
            this.field_J = true;
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_G = null;
        field_M = null;
        field_L = null;
        if (param0 != 97) {
          return;
        }
        field_I = null;
        field_N = null;
        field_O = null;
    }

    final void draw(int param0, Camera param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -10136) {
            field_M = (IntrusiveDeque) null;
          }
          var3_int = param1.worldToScreenX(this.getX(param0 ^ 10195), -20126);
          var4 = -24 + param1.worldToScreenY(this.getY(param0 ^ -10230), 127);
          if (!WeightedLruCache.isOnScreen(var3_int, var4, (byte) -110, param1)) {
            return;
          }
          if (this.field_J &&
            !WeightedLruCache.isOnScreen(var3_int, -24 + var4, (byte) -114, param1)) {
            return;
          }
          var5 = this.getX(-128) / 24;
          var6 = this.getY(-51) / 24;
          if (!LinkButtonPainter.field_a &&
            var5 >= 0 &&
            var5 < PowerupButton.field_e.navigation.field_k[0].length &&
            var6 >= 0 &&
            var6 < PowerupButton.field_e.navigation.field_k.length &&
            PowerupButton.field_e.navigation.field_k[var6][var5]) {
            return;
          }
          if (this.field_H &&
            this.field_K) {
            SimArmedHuman.field_Ab[this.field_P].drawRotatedHalfTurn(var3_int, var4);
          } else {
            if (this.field_H) {
              SimArmedHuman.field_Ab[this.field_P].drawHorizontalFlip(var3_int, var4);
            } else {
              if (!this.field_K) {
                SimArmedHuman.field_Ab[this.field_P].drawTransparent(var3_int, var4);
              } else {
                SimArmedHuman.field_Ab[this.field_P].drawVerticalFlip(var3_int, var4);
              }
            }
          }
          if (this.field_J) {
            if (!this.field_H) {
              if (!this.field_K) {
                SimArmedHuman.field_Ab[-8 + this.field_P].drawTransparent(var3_int, -24 + var4);
              } else {
                SimArmedHuman.field_Ab[-8 + this.field_P].drawVerticalFlip(var3_int, -24 + var4);
              }
            } else {
              SimArmedHuman.field_Ab[-8 + this.field_P].drawHorizontalFlip(var3_int, var4 - 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("fd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void tick(byte param0) {
        if (param0 > -79) {
          this.tick((byte) 89);
        }
    }

    final static void clearSpriteDecodeBuffers(byte param0) {
        ThreeSliceButtonPainter.field_w = null;
        MatchingTextValidator.field_t = (byte[][]) null;
        PowerupCommand.field_o = null;
        AppearanceScreen.field_p = null;
        PacketBuffer.field_i = null;
        if (param0 <= 124) {
          field_G = (BinaryBitmapFont) null;
        }
        UsernameAvailabilityValidator.field_t = null;
    }

    final static int performLoginRequest(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_14_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          boolean stackIn_58_0 = false;
          boolean stackIn_63_0 = false;
          int stackIn_90_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          int stackIn_113_0 = 0;
          int stackIn_115_0 = 0;
          RuntimeException stackIn_118_0 = null;
          StringBuilder stackIn_118_1 = null;
          String stackIn_119_2 = null;
          StringBuilder stackIn_121_1 = null;
          String stackIn_122_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            if (SpriteHotspot.field_h == null &&
              !LobbyScreenHelpers.pollStatusSocket(param1, false)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (DialSelectorWidget.field_cb == IntroScreen.field_l) {
              if (!param1) {
                SpriteHotspot.field_a = CachedArchiveSource.createLoginCredentials((byte) 125, param4, param3, false);
              } else {
                var10 = (String) null;
                SpriteHotspot.field_a = StrongCacheEntry.createLoginCredentials(64, TickClock.field_d, (String) null, false, param3);
              }
              TextValidationFailure.field_a.position = 0;
              TextValidationFailure.field_a.writeByte(-94, 14);
              TextValidationFailure.field_a.writeByte(126, SpriteHotspot.field_a.getCredentialKind(param0 - 7).field_d);
              PowerupProgressCard.flushPackets(-1, false);
              IntroScreen.field_l = AwtEventPumpHelpers.field_h;
            }
            if (param0 != 14) {
              stackIn_14_0 = -97;
              return stackIn_14_0;
            }
            if (AwtEventPumpHelpers.field_h == IntroScreen.field_l &&
              ReportAbuseDialog.fillIncomingBuffer(10, 1)) {
              var6_int = StatusAndMeshHelpers.field_e.readUnsignedByte(param0 ^ 31371);
              StatusAndMeshHelpers.field_e.position = 0;
              if (var6_int == 0) {
                IntroScreen.field_l = ResourceArchive.field_n;
              } else {
                EmailAvailabilityValidator.field_q = -1;
                IntroScreen.field_l = ButtonWidget.field_K;
                PortalEntryEvent.field_i = var6_int;
              }
            }
            if (ResourceArchive.field_n == IntroScreen.field_l &&
              ReportAbuseDialog.fillIncomingBuffer(10, 8)) {
              Camera.field_c = StatusAndMeshHelpers.field_e.readLong((byte) -30);
              StatusAndMeshHelpers.field_e.position = 0;
              CredentialKind.sendLoginPacket((byte) -59, param2, param1, SpriteHotspot.field_a, param5);
              IntroScreen.field_l = PulseEffect.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (IntroScreen.field_l == PulseEffect.field_l &&
              ReportAbuseDialog.fillIncomingBuffer(10, 1)) {
              var6_intLifetime1 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
              StatusAndMeshHelpers.field_e.position = 0;
              TextDecodeHelpers.field_f = null;
              PortalEntryEvent.field_i = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  EmailAvailabilityValidator.field_q = -1;
                  IntroScreen.field_l = ButtonWidget.field_K;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ClientShellHelpers.closeGameSocket((byte) -111);
                  UiTheme.field_j = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                EmailAvailabilityValidator.field_q = -1;
                IntroScreen.field_l = Js5Transport.field_e;
              }
            }
            if (IntroScreen.field_l == Js5Transport.field_e &&
              DefaultQuickChatContext.isPacketPayloadReady(0)) {
              TickClock.field_d = StatusAndMeshHelpers.field_e.readLong((byte) -30);
              LevelFileList.field_f = param3;
              FriendListHelpers.field_q = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
              TeamSpriteHelpers.field_b = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
              QueuedListRequest.field_h = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
              var11 = StatusAndMeshHelpers.field_e.readNullableString((byte) -89);
              var7 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
              if ((var7 & 1) != 0) {
                CheckboxWidget.saveRandomData((byte) 85);
              }
              if (!param1) {
                stackIn_52_0 = (0 != (4 & var7));
                CheckboxWidget.field_M = stackIn_52_0;
                stackIn_55_0 = ((2 & var7) != 0);
                SimPortal.field_L = stackIn_55_0;
                stackIn_58_0 = ((var7 & 8) != 0);
                PendingRankingRequest.field_m = stackIn_58_0;
                if (PendingRankingRequest.field_m) {
                  SimPortal.field_L = true;
                }
                stackIn_63_0 = ((var7 & 16) != 0);
                LobbyDrawHelpers.field_b = stackIn_63_0;
                if (SoundStopHelpers.field_e) {
                  StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  StatusAndMeshHelpers.field_e.readUnsignedByte(param0 + 31351);
                  StatusAndMeshHelpers.field_e.readInt(-1478490344);
                  MenuFrameHelpers.field_f = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                  DelegatingCanvas.field_b = new byte[MenuFrameHelpers.field_f];
                  for (var8 = 0; var8 < MenuFrameHelpers.field_f; var8++) {
                    DelegatingCanvas.field_b[var8] = StatusAndMeshHelpers.field_e.readByte(RankingsRequest.bitXor(param0, -249699574));
                  }
                }
              } else {
                stackIn_45_0 = ((var7 & 16) != 0);
                LobbyDrawHelpers.field_b = stackIn_45_0;
                if (SoundStopHelpers.field_e) {
                  StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  StatusAndMeshHelpers.field_e.readUnsignedByte(param0 + 31351);
                  StatusAndMeshHelpers.field_e.readInt(-1478490344);
                  MenuFrameHelpers.field_f = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                  DelegatingCanvas.field_b = new byte[MenuFrameHelpers.field_f];
                  for (var8 = 0; var8 < MenuFrameHelpers.field_f; var8++) {
                    DelegatingCanvas.field_b[var8] = StatusAndMeshHelpers.field_e.readByte(RankingsRequest.bitXor(param0, -249699574));
                  }
                }
              }
              ProgressDialog.field_lb = StatusAndMeshHelpers.field_e.readString((byte) -48);
              var12 = (CharSequence) ((Object) ProgressDialog.field_lb);
              ProxySocketConnector.field_k = AudioPumpThread.normalizePlayerName(var12, false);
              IntHashIndex.field_a = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
              IntroScreen.field_l = CredentialKind.field_a;
              if (SpriteHotspot.field_a.getCredentialKind(7) != BrowserPageHelpers.field_b) {
                if (SpriteHotspot.field_a.getCredentialKind(7) == ArrayWidgetGroup.field_G) {
                  RasterBuffer.field_c.saveAsLastLoginMethod(-100, StatefulTextPainter.getHostApplet(0));
                }
              } else {
                AudioServiceHelpers.field_b.saveAsLastLoginMethod(-108, StatefulTextPainter.getHostApplet(0));
              }
              UiTheme.field_j = false;
              if (var11 != null) {
                LobbyGame.setSettingsCookie(StatefulTextPainter.getHostApplet(0), param0 ^ -15, var11);
              }
              if (QueuedListRequest.field_h <= 0 &&
                !CheckboxWidget.field_M) {
                try {
                  JavaScriptBridge.callJavaScript(StatefulTextPainter.getHostApplet(0), 13093, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callFunctionWithArgs(StatefulTextPainter.getHostApplet(0), "zap", (byte) 23, new Object[]{RandomAccessCacheFile.decodeBase37(TickClock.field_d, (byte) 26)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (QueuedListRequest.field_h > 0) {
                LobbyRequestHelpers.field_e = true;
              }
              TextValidationFailure.field_a.installCipher((byte) -77, ScrollBar.field_Fb);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                ScrollBar.field_Fb[var8Lifetime1] = ScrollBar.field_Fb[var8Lifetime1] + 50;
              }
              StatusAndMeshHelpers.field_e.installCipher((byte) -116, ScrollBar.field_Fb);
              stackIn_90_0 = PortalEntryEvent.field_i;
              return stackIn_90_0;
            }
            if (IntroScreen.field_l == ButtonWidget.field_K &&
              DefaultQuickChatContext.isPacketPayloadReady(0)) {
              ClientShellHelpers.closeGameSocket((byte) -124);
              if (PortalEntryEvent.field_i == 7 &&
                !UiTheme.field_j) {
                UiTheme.field_j = true;
                stackIn_104_0 = -1;
                return stackIn_104_0;
              }
              if (PortalEntryEvent.field_i == 7) {
                PortalEntryEvent.field_i = 3;
              }
              InstructionsScreen.field_q = StatusAndMeshHelpers.field_e.readString((byte) -31);
              UiTheme.field_j = false;
              stackIn_102_0 = PortalEntryEvent.field_i;
              return stackIn_102_0;
            }
            if (SpriteHotspot.field_h == null) {
              if (UiTheme.field_j) {
                if (LinkButtonPainter.millisSinceLastReceive((byte) -22) > 30000L) {
                  InstructionsScreen.field_q = EffectResistedEvent.field_l;
                } else {
                  InstructionsScreen.field_q = CipherPacketBuffer.field_w;
                }
                UiTheme.field_j = false;
                stackIn_113_0 = 3;
                return stackIn_113_0;
              }
              var6_intLifetime2 = FeatureSupportHelpers.field_b;
              FeatureSupportHelpers.field_b = TertiaryLinkNode.field_s;
              UiTheme.field_j = true;
              TertiaryLinkNode.field_s = var6_intLifetime2;
            }
            stackIn_115_0 = -1;
            return stackIn_115_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_118_0 = var6;
            stackIn_118_1 = new StringBuilder().append("fd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_119_2 = "null";
            } else {
              stackIn_119_2 = "{...}";
            }
            stackIn_121_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',');
            if (param4 == null) {
              stackIn_122_2 = "null";
            } else {
              stackIn_122_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_118_0), ((StringBuilder) (Object) stackIn_121_1).append(stackIn_122_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_F = -1;
        field_M = new IntrusiveDeque();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
