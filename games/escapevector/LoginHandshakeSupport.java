/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginHandshakeSupport {
    static Sprite field_b;
    static String field_a;
    static int field_d;
    static String field_c;
    static Sprite field_f;
    static String[] field_e;

    final static int pollLogin(int guard, int clientValue, String password, String identifier, boolean reconnect, boolean option) {
        try {
          String stackIn_108_2 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var8_ref_Throwable = null;
          int var9 = EscapeVector.obfuscationControl;
          try {
            if (null == TextLayout.field_c &&
              !ChatMessageDecoder.pollAccountConnection(reconnect, (byte) 0)) {
              int stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (guard != 1) {
              int stackIn_8_0 = 2;
              return stackIn_8_0;
            }
            if (SessionCounterState.field_d == AccountFormStage.field_d) {
              if (!reconnect) {
                ArchiveIndex.field_m = Checkbox.createLoginCredentials(identifier, false, 24564, password);
              } else {
                ArchiveIndex.field_m = SavedDataQuery.createCredentials(guard - 1, false, KeyboardIdleSupport.field_d, (String) null, password);
              }
              QuickChatDynamicCommand.outgoingPackets.position = 0;
              QuickChatDynamicCommand.outgoingPackets.writeByte(14, -123);
              QuickChatDynamicCommand.outgoingPackets.writeByte(ArchiveIndex.field_m.type((byte) 32).wireId, -123);
              ClientException.flushAccountPackets(-1, 30785);
              AccountFormStage.field_d = SpriteStrip.field_p;
            }
            if (AccountFormStage.field_d == SpriteStrip.field_p &&
              Checkbox.readIncomingBytes(30000, 1)) {
              int var6_int = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (0 == var6_int) {
                AccountFormStage.field_d = LinkButtonPainter.field_c;
              } else {
                AccountFormStage.field_d = CheckboxPainter.field_q;
                LegacyStyleNode.field_v = var6_int;
                EmailSyntaxValidator.field_r = -1;
              }
            }
            if (AccountFormStage.field_d == LinkButtonPainter.field_c &&
              Checkbox.readIncomingBytes(30000, 8)) {
              SecondaryIntrusiveDeque.field_b = QuickChatDynamicCommand.incomingPackets.readLong(guard - 800509814);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              MenuEdgeSegment.writeLoginRequest(ArchiveIndex.field_m, reconnect, clientValue, option, (byte) -99);
              AccountFormStage.field_d = LoginHandshakeState.awaitingLoginReplyStage;
            }
            boolean decompiledFrameRemainder0 = true;
            if (LoginHandshakeState.awaitingLoginReplyStage == AccountFormStage.field_d &&
              Checkbox.readIncomingBytes(30000, 1)) {
              int var6_intLifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              LegacyStyleNode.field_v = var6_intLifetime1;
              SimulatorSpriteAssets.pendingDisplayName = null;
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  AccountFormStage.field_d = CheckboxPainter.field_q;
                  EmailSyntaxValidator.field_r = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ConnectionSupport.closeTransport(16);
                  RegistrationFlowSupport.field_c = false;
                  int stackIn_36_0 = var6_intLifetime1;
                  return stackIn_36_0;
                }
              }
              if (decompiledFrameRemainder0) {
                AccountFormStage.field_d = ClientException.field_c;
                EmailSyntaxValidator.field_r = -1;
              }
            }
            if (AccountFormStage.field_d == ClientException.field_c &&
              ArchiveKeyRequest.hasCompletePacket(guard + 10549)) {
              KeyboardIdleSupport.field_d = QuickChatDynamicCommand.incomingPackets.readLong(-800509813);
              KeyboardIdleSupport.field_b = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              Js5NetworkRequest.field_x = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(1952);
              String var6 = QuickChatDynamicCommand.incomingPackets.readNullableString(-15208);
              int var7 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              if ((1 & var7) != 0) {
                NameAvailabilityResult.readAndStoreInstallationSeed((byte) -63);
              }
              if (!reconnect) {
                boolean stackIn_48_0 = ((8 & var7) != 0);
                RasterRestoreSupport.field_a = stackIn_48_0;
                boolean stackIn_51_0 = ((4 & var7) != 0);
                QuickChatPhraseCache.field_g = stackIn_51_0;
                if (RasterRestoreSupport.field_a) {
                }
              }
              if (KeyCodeSupport.field_b) {
                QuickChatDynamicCommand.incomingPackets.readUnsignedByte(guard ^ 1);
                QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
                QuickChatDynamicCommand.incomingPackets.readInt(guard - 5054);
                SocketConnector.field_e = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(1952);
                ValidationHelpWidget.field_K = new byte[SocketConnector.field_e];
                for (int var8 = 0; var8 < SocketConnector.field_e; var8++) {
                  ValidationHelpWidget.field_K[var8] = QuickChatDynamicCommand.incomingPackets.readByte(false);
                }
              }
              ThreeSliceButtonPainter.field_r = QuickChatDynamicCommand.incomingPackets.readString(false);
              CharSequence var11 = (CharSequence) ((Object) ThreeSliceButtonPainter.field_r);
              ProgressRecord.field_k = SessionCounterState.normalizeAccountName(-83, var11);
              LaserGateSpan.field_g = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(guard - 1);
              AccountFormStage.field_d = ThreeSliceButtonPainter.field_t;
              if (ArchiveIndex.field_m.type((byte) 32) == AlphaContainer.field_E) {
                NameAvailabilityValidator.field_q.rememberLoginMethod(27002, PointCloudEffect.activeApplet((byte) -114));
              } else if (ArchiveIndex.field_m.type((byte) 32) == DisplayModeInfo.field_a) {
                MenuEdgeSegment.field_n.rememberLoginMethod(27002, PointCloudEffect.activeApplet((byte) -71));
              }
              RegistrationFlowSupport.field_c = false;
              if (var6 != null) {
                GameKeyHandler.setSettingsCookie(var6, (byte) 30, PointCloudEffect.activeApplet((byte) -119));
              }
              if (Js5NetworkRequest.field_x <= 0 &&
                !QuickChatPhraseCache.field_g) {
                try {
                  JavaScriptBridge.callWindowFunction(PointCloudEffect.activeApplet((byte) -107), "unzap", guard - 29156);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWindowFunctionWithArguments((byte) 116, PointCloudEffect.activeApplet((byte) -128), new Object[]{ProxySocketConnector.decodeBase37Name(KeyboardIdleSupport.field_d, (byte) 29)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (Js5NetworkRequest.field_x > 0) {
                BitCountSupport.field_d = true;
              }
              QuickChatDynamicCommand.outgoingPackets.initializeCipher(NameSuggestionsPanel.field_O, (byte) 107);
              for (int var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                NameSuggestionsPanel.field_O[var8Lifetime1] = NameSuggestionsPanel.field_O[var8Lifetime1] + 50;
              }
              QuickChatDynamicCommand.incomingPackets.initializeCipher(NameSuggestionsPanel.field_O, (byte) 85);
              int stackIn_81_0 = LegacyStyleNode.field_v;
              return stackIn_81_0;
            }
            if (CheckboxPainter.field_q == AccountFormStage.field_d &&
              ArchiveKeyRequest.hasCompletePacket(guard + 10549)) {
              ConnectionSupport.closeTransport(16);
              if (LegacyStyleNode.field_v == 7 &&
                !RegistrationFlowSupport.field_c) {
                RegistrationFlowSupport.field_c = true;
                int stackIn_88_0 = -1;
                return stackIn_88_0;
              }
              if (LegacyStyleNode.field_v == 7) {
                LegacyStyleNode.field_v = 3;
              }
              MouseWheelInput.field_a = QuickChatDynamicCommand.incomingPackets.readString(false);
              RegistrationFlowSupport.field_c = false;
              int stackIn_93_0 = LegacyStyleNode.field_v;
              return stackIn_93_0;
            }
            if (null == TextLayout.field_c) {
              if (RegistrationFlowSupport.field_c) {
                if (PasswordFieldPainter.millisecondsSinceLastReceive(64655) > 30000L) {
                  MouseWheelInput.field_a = DualLinkNode.field_l;
                } else {
                  MouseWheelInput.field_a = IntegerParseSupport.field_a;
                }
                RegistrationFlowSupport.field_c = false;
                int stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              int var6_intLifetime2 = BitCountSupport.field_b;
              BitCountSupport.field_b = StringNode.field_i;
              RegistrationFlowSupport.field_c = true;
              StringNode.field_i = var6_intLifetime2;
            }
            int stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_107_0 = var6_ref;
            StringBuilder stackIn_107_1 = new StringBuilder().append("mj.B(").append(guard).append(',').append(clientValue).append(',');
            if (password == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            StringBuilder stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',');
            if (identifier == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(reconnect).append(',').append(option).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(boolean guard) {
        field_a = null;
        field_b = null;
        field_f = null;
        if (!guard) {
          field_e = (String[]) null;
        }
        field_e = null;
        field_c = null;
    }

    final static ResourceArchive createDefaultArchive(int archiveId, int guard) {
        if (guard >= -122) {
          LoginHandshakeSupport.isLegacyMenuVisible((byte) 58);
        }
        return ArchiveFactorySupport.createArchive(false, archiveId, false, 1, true, (byte) 114);
    }

    final static boolean isLegacyMenuVisible(byte guard) {
        if (guard < 54) {
          String var2 = (String) null;
          LoginHandshakeSupport.pollLogin(100, -96, (String) null, (String) null, false, true);
        }
        return ModalStack.field_D;
    }

    static {
        field_b = new Sprite(320, 24);
        field_a = "Unfortunately you are not eligible to create an account.";
        field_c = " - thrust";
    }
}
