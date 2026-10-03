/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_c;
    static String[] field_b;
    static boolean field_a;

    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_33_0 = 0;
            boolean stackIn_45_0 = false;
            boolean stackIn_48_0 = false;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_102_0 = 0;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            String stackIn_106_2 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_109_2 = null;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            var9 = Geoblox.clientControlFlowFlag;
            try {
              if ((null == SpriteCheckboxRenderer.field_e) &&
                  (!w.a(param0, 52))) {
                stackIn_5_0 = -1;
                return stackIn_5_0;
              }
              if (PacketBuffer.currentProtocolStage == IterableNodeHashTable.field_d) {
                if (!param0) {
                  EntityContactSupport.pendingLoginPayload = HotspotTextWidget.a(false, param1, param4, false);
                } else {
                  var11 = (String) null;
                  EntityContactSupport.pendingLoginPayload = SecondaryDeque.a(true, oa.field_c, (String) null, param1, false);
                }
                CacheReference.field_q.position = 0;
                CacheReference.field_q.writeByte((byte) -102, 14);
                CacheReference.field_q.writeByte((byte) -78, EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32).wireId);
                NanoFrameTimer.a(-1, -1);
                PacketBuffer.currentProtocolStage = ResizableDialog.field_T;
              }
              if ((ResizableDialog.field_T == PacketBuffer.currentProtocolStage) &&
                  (UiWidget.b(30000, 1))) {
                var6_int = eh.field_d.readUnsignedByte((byte) 34);
                eh.field_d.position = 0;
                if (var6_int != 0) {
                  AchievementSubmission.field_k = -1;
                  PacketBuffer.currentProtocolStage = TextInputRenderer.field_v;
                  ScorePopup.field_l = var6_int;
                } else {
                  PacketBuffer.currentProtocolStage = MessageDialog.awaitingLoginLongState;
                }
              }
              if ((MessageDialog.awaitingLoginLongState == PacketBuffer.currentProtocolStage) &&
                  (UiWidget.b(30000, 8))) {
                ak.field_a = eh.field_d.readLongBE(2901);
                eh.field_d.position = 0;
                UsernameAvailabilityValidator.a(26, param2, param0, EntityContactSupport.pendingLoginPayload, param3);
                PacketBuffer.currentProtocolStage = da.field_g;
              }
              if (param5 != 0) {
                var10 = (String) null;
                ri.a(false, (String) null, 95, false, (String) null, 13);
              }
              L6: {
                if ((da.field_g == PacketBuffer.currentProtocolStage) &&
                    (UiWidget.b(30000, 1))) {
                  var6_int = eh.field_d.readUnsignedByte((byte) 34);
                  eh.field_d.position = 0;
                  fl.field_b = null;
                  ScorePopup.field_l = var6_int;
                  if ((var6_int != 0) &&
                      (var6_int != 1)) {
                    if (var6_int != 8) {
                      PacketBuffer.currentProtocolStage = TextInputRenderer.field_v;
                      AchievementSubmission.field_k = -1;
                      break L6;
                    }
                    Bzip2DecoderState.closeSessionSocket((byte) -116);
                    TextTemplateArgumentType.field_e = false;
                    stackIn_33_0 = var6_int;
                    return stackIn_33_0;
                  }
                  AchievementSubmission.field_k = -1;
                  PacketBuffer.currentProtocolStage = da.field_f;
                }
              }
              if ((da.field_f == PacketBuffer.currentProtocolStage) &&
                  (TriangleMesh.a(false))) {
                oa.field_c = eh.field_d.readLongBE(2901);
                SpriteCheckboxRenderer.field_f = eh.field_d.readUnsignedByte((byte) 34);
                eh.field_d.readUnsignedByte((byte) 34);
                TextTemplateDefinition.field_n = eh.field_d.readUnsignedShortBE(true);
                var6 = eh.field_d.readNullableNullTerminatedText((byte) 53);
                var7 = eh.field_d.readUnsignedByte((byte) 34);
                if ((1 & var7) != 0) {
                  ic.a((byte) 65);
                }
                if (!param0) {
                  stackIn_45_0 = !((var7 & 4) == 0);
                  GzipInflater.field_b = stackIn_45_0;
                  stackIn_48_0 = !((var7 & 8) == 0);
                  TextHotspotBounds.field_l = stackIn_48_0;
                  if (!TextHotspotBounds.field_l) {
                  }
                }
                if (ll.field_e) {
                  eh.field_d.readUnsignedByte((byte) 34);
                  eh.field_d.readUnsignedByte((byte) 34);
                  eh.field_d.readIntBE((byte) -48);
                  PacketBuffer.field_n = eh.field_d.readUnsignedShortBE(true);
                  ValidatedTextInputWidget.field_K = new byte[PacketBuffer.field_n];
                  for (var8 = 0; PacketBuffer.field_n > var8; var8++) {
                    ValidatedTextInputWidget.field_K[var8] = eh.field_d.readSignedByte((byte) 72);
                  }
                }
                SecondaryDeque.field_f = eh.field_d.readNullTerminatedText((byte) 105);
                var12 = (CharSequence) ((Object) SecondaryDeque.field_f);
                SecondaryNodeHashTable.field_b = ResizableDialog.a(var12, 12);
                EntityLinkSupport.field_a = eh.field_d.readUnsignedByte((byte) 34);
                PacketBuffer.currentProtocolStage = eh.field_b;
                if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) != ej.field_b) {
                  if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) == Geoblox.longAndNameLoginType) {
                    ProgressDialog.field_W.rememberMethod(NodeHashTableIterator.c(108), 0);
                  }
                } else {
                  LoginTextValue.field_b.rememberMethod(NodeHashTableIterator.c(122), 0);
                }
                TextTemplateArgumentType.field_e = false;
                if (var6 != null) {
                  tc.a(100, var6, NodeHashTableIterator.c(112));
                }
                if ((TextTemplateDefinition.field_n <= 0) &&
                    (!GzipInflater.field_b)) {
                  try {
                    AppletJavaScriptBridge.callWithoutArguments((byte) -6, NodeHashTableIterator.c(107), "unzap");
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8_ref_Throwable = decompiledCaughtException;
                  }
                } else {
                  try {
                    AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{UnderlinedButtonRenderer.a(oa.field_c, param5 + 97)}, NodeHashTableIterator.c(param5 + 119), "zap");
                  } catch (java.lang.Throwable decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var8_ref_Throwable = decompiledCaughtException;
                  }
                }
                if (TextTemplateDefinition.field_n > 0) {
                  rb.field_c = true;
                }
                CacheReference.field_q.initializeCipher(ProgressBarWidget.field_D, false);
                for (var8 = 0; var8 < 4; var8++) {
                  ProgressBarWidget.field_D[var8] = ProgressBarWidget.field_D[var8] + 50;
                }
                eh.field_d.initializeCipher(ProgressBarWidget.field_D, false);
                stackIn_78_0 = ScorePopup.field_l;
                return stackIn_78_0;
              }
              if ((PacketBuffer.currentProtocolStage == TextInputRenderer.field_v) &&
                  (TriangleMesh.a(false))) {
                Bzip2DecoderState.closeSessionSocket((byte) -118);
                if ((ScorePopup.field_l == 7) &&
                    (!TextTemplateArgumentType.field_e)) {
                  TextTemplateArgumentType.field_e = true;
                  stackIn_86_0 = -1;
                  return stackIn_86_0;
                }
                if (ScorePopup.field_l == 7) {
                  ScorePopup.field_l = 3;
                }
                AudioService.field_a = eh.field_d.readNullTerminatedText((byte) 101);
                TextTemplateArgumentType.field_e = false;
                stackIn_91_0 = ScorePopup.field_l;
                return stackIn_91_0;
              }
              if (null == SpriteCheckboxRenderer.field_e) {
                if (TextTemplateArgumentType.field_e) {
                  if (30000L >= ll.a((byte) 12)) {
                    AudioService.field_a = FullscreenFailureReason.loginMessage2Text;
                  } else {
                    AudioService.field_a = IntrusiveNode.loginMessage3Text;
                  }
                  TextTemplateArgumentType.field_e = false;
                  stackIn_99_0 = 3;
                  return stackIn_99_0;
                }
                var6_int = NetworkArchiveRequest.field_x;
                NetworkArchiveRequest.field_x = TextInputRenderer.field_s;
                TextInputRenderer.field_s = var6_int;
                TextTemplateArgumentType.field_e = true;
              }
              stackIn_102_0 = -1;
              return stackIn_102_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_105_0 = var6_ref;
              stackIn_105_1 = new StringBuilder().append("ri.B(").append(param0).append(',');
              if (param1 == null) {
                stackIn_106_2 = "null";
              } else {
                stackIn_106_2 = "{...}";
              }
              stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param2).append(',').append(param3).append(',');
              if (param4 == null) {
                stackIn_109_2 = "null";
              } else {
                stackIn_109_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param5).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 2 + (i.avatarMaskRaster.fullWidth >> 1);
        if (param2 != 29497) {
            return;
        }
        int var4 = (i.avatarMaskRaster.fullHeight >> 1) + 2;
        fc.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(param0 - var3, param1 - var4, DisplayModeInfo.avatarTintColor);
        UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(-var3 + param0, -var4 + param1, DisplayModeInfo.avatarTintColor);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 5366) {
            field_b = (String[]) null;
        }
        field_b = null;
    }

    static {
        field_a = false;
        field_b = new String[]{"Clear 3 geoblox of the same colour and shape", "Clear the geoblox avatar", "Finish a stage with the avatar clear of geoblox", "Achieve a 6x bonus multiplier", "Achieve a 7x bonus multiplier", "Achieve an 8x bonus multiplier", "Destroy 5 black orbs", "Destroy 3 black orbs with one shock", "Pass the sun stage", "Pass the sweet stage", "Pass the jewellery stage", "Pass the germ stage", "Pass the space stage", "Pass the sport stage", "Pass the bakery stage", "Get past all stages twice!", "Score 7,000 points during Halloween"};
    }
}
