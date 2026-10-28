/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static Sprite field_b;
    static String field_a;
    static int field_d;
    static String field_c;
    static Sprite field_f;
    static String[] field_e;

    final static int a(int param0, int param1, String param2, String param3, boolean param4, boolean param5) {
        try {
          String stackIn_108_2 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var8_ref_Throwable = null;
          int var9 = EscapeVector.obfuscationControl;
          try {
            if (null == TextLayout.field_c &&
              !ChatMessageDecoder.a(param4, (byte) 0)) {
              int stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (param0 != 1) {
              int stackIn_8_0 = 2;
              return stackIn_8_0;
            }
            if (sf.field_d == AccountFormStage.field_d) {
              if (!param4) {
                ArchiveIndex.field_m = Checkbox.createLoginCredentials(param3, false, 24564, param2);
              } else {
                ArchiveIndex.field_m = SavedDataQuery.createCredentials(param0 - 1, false, mg.field_d, (String) null, param2);
              }
              QuickChatDynamicCommand.outgoingPackets.position = 0;
              QuickChatDynamicCommand.outgoingPackets.writeByte(14, -123);
              QuickChatDynamicCommand.outgoingPackets.writeByte(ArchiveIndex.field_m.type((byte) 32).wireId, -123);
              ClientException.a(-1, 30785);
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
              SecondaryIntrusiveDeque.field_b = QuickChatDynamicCommand.incomingPackets.readLong(param0 - 800509814);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              MenuEdgeSegment.writeLoginRequest(ArchiveIndex.field_m, param4, param1, param5, (byte) -99);
              AccountFormStage.field_d = mc.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (mc.field_b == AccountFormStage.field_d &&
              Checkbox.readIncomingBytes(30000, 1)) {
              int var6_intLifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              LegacyStyleNode.field_v = var6_intLifetime1;
              p.field_i = null;
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  AccountFormStage.field_d = CheckboxPainter.field_q;
                  EmailSyntaxValidator.field_r = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  nm.a(16);
                  e.field_c = false;
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
              ArchiveKeyRequest.hasCompletePacket(param0 + 10549)) {
              mg.field_d = QuickChatDynamicCommand.incomingPackets.readLong(-800509813);
              mg.field_b = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              Js5NetworkRequest.field_x = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(1952);
              String var6 = QuickChatDynamicCommand.incomingPackets.readNullableString(-15208);
              int var7 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
              if ((1 & var7) != 0) {
                NameAvailabilityResult.a((byte) -63);
              }
              if (!param4) {
                boolean stackIn_48_0 = ((8 & var7) != 0);
                RasterRestoreSupport.field_a = stackIn_48_0;
                boolean stackIn_51_0 = ((4 & var7) != 0);
                QuickChatPhraseCache.field_g = stackIn_51_0;
                if (RasterRestoreSupport.field_a) {
                }
              }
              if (KeyCodeSupport.field_b) {
                QuickChatDynamicCommand.incomingPackets.readUnsignedByte(param0 ^ 1);
                QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
                QuickChatDynamicCommand.incomingPackets.readInt(param0 - 5054);
                SocketConnector.field_e = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(1952);
                ValidationHelpWidget.field_K = new byte[SocketConnector.field_e];
                for (int var8 = 0; var8 < SocketConnector.field_e; var8++) {
                  ValidationHelpWidget.field_K[var8] = QuickChatDynamicCommand.incomingPackets.readByte(false);
                }
              }
              ThreeSliceButtonPainter.field_r = QuickChatDynamicCommand.incomingPackets.readString(false);
              CharSequence var11 = (CharSequence) ((Object) ThreeSliceButtonPainter.field_r);
              ProgressRecord.field_k = sf.a(-83, var11);
              LaserGateSpan.field_g = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(param0 - 1);
              AccountFormStage.field_d = ThreeSliceButtonPainter.field_t;
              if (ArchiveIndex.field_m.type((byte) 32) == AlphaContainer.field_E) {
                NameAvailabilityValidator.field_q.a(27002, PointCloudEffect.activeApplet((byte) -114));
              } else if (ArchiveIndex.field_m.type((byte) 32) == DisplayModeInfo.field_a) {
                MenuEdgeSegment.field_n.a(27002, PointCloudEffect.activeApplet((byte) -71));
              }
              e.field_c = false;
              if (var6 != null) {
                GameKeyHandler.a(var6, (byte) 30, PointCloudEffect.activeApplet((byte) -119));
              }
              if (Js5NetworkRequest.field_x <= 0 &&
                !QuickChatPhraseCache.field_g) {
                try {
                  JavaScriptBridge.callWindowFunction(PointCloudEffect.activeApplet((byte) -107), "unzap", param0 - 29156);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWindowFunctionWithArguments((byte) 116, PointCloudEffect.activeApplet((byte) -128), new Object[]{ProxySocketConnector.decodeBase37Name(mg.field_d, (byte) 29)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (Js5NetworkRequest.field_x > 0) {
                ej.field_d = true;
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
              ArchiveKeyRequest.hasCompletePacket(param0 + 10549)) {
              nm.a(16);
              if (LegacyStyleNode.field_v == 7 &&
                !e.field_c) {
                e.field_c = true;
                int stackIn_88_0 = -1;
                return stackIn_88_0;
              }
              if (LegacyStyleNode.field_v == 7) {
                LegacyStyleNode.field_v = 3;
              }
              MouseWheelInput.field_a = QuickChatDynamicCommand.incomingPackets.readString(false);
              e.field_c = false;
              int stackIn_93_0 = LegacyStyleNode.field_v;
              return stackIn_93_0;
            }
            if (null == TextLayout.field_c) {
              if (e.field_c) {
                if (PasswordFieldPainter.millisecondsSinceLastReceive(64655) > 30000L) {
                  MouseWheelInput.field_a = DualLinkNode.field_l;
                } else {
                  MouseWheelInput.field_a = wk.field_a;
                }
                e.field_c = false;
                int stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              int var6_intLifetime2 = ej.field_b;
              ej.field_b = StringNode.field_i;
              e.field_c = true;
              StringNode.field_i = var6_intLifetime2;
            }
            int stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_107_0 = var6_ref;
            StringBuilder stackIn_107_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            StringBuilder stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',');
            if (param3 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param4).append(',').append(param5).append(')').toString());
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

    final static ResourceArchive a(int param0, int param1) {
        if (param1 >= -122) {
          mj.a((byte) 58);
        }
        return ji.a(false, param0, false, 1, true, (byte) 114);
    }

    final static boolean a(byte param0) {
        if (param0 < 54) {
          String var2 = (String) null;
          mj.a(100, -96, (String) null, (String) null, false, true);
        }
        return ModalStack.field_D;
    }

    static {
        field_b = new Sprite(320, 24);
        field_a = "Unfortunately you are not eligible to create an account.";
        field_c = " - thrust";
    }
}
