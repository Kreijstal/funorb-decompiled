/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LoginPanel extends WidgetContainer implements TextInputListener, ButtonActivationListener {
    private String messageText;
    static ResourceArchive field_O;
    private TextInputWidget passwordInput;
    private boolean showCreateAccount;
    private ButtonWidget alternateButton;
    private static ClientProtocolStage field_K;
    static boolean endingEntityScanClear;
    private boolean allowJustPlay;
    private ButtonWidget createAccountButton;
    private TextInputWidget loginIdentifierInput;
    private ButtonWidget loginOrRetryButton;
    static String js5CrcErrorText;
    private boolean retryMode;

    final static boolean isAsciiLetterOrDigit(int methodGuard, char character) {
        PacketBuffer unusedNullReplyBuffer;
        boolean isAsciiLetterOrDigitResult = false;
        if (methodGuard != -123) {
          unusedNullReplyBuffer = (PacketBuffer) null;
          LoginPanel.writeReflectionCheckReply(-108, (PacketBuffer) null);
        }
        if (!((character >= 48) &&
              (character <= 57)) &&
            !((character >= 65) &&
              (character <= 90)) &&
            !((character >= 97) &&
              (character <= 122))) {
          isAsciiLetterOrDigitResult = false;
        } else {
          isAsciiLetterOrDigitResult = true;
        }
        return isAsciiLetterOrDigitResult;
    }

    final static void handleIntRecordReply(int methodGuard) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        IntArrayQuery var4_ref_ea = null;
        KeyedIntRecordSubmission var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        PacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            var9 = LogoCompositor.sessionPacketBuffer;
            var2 = var9.readUnsignedByte((byte) 34);
            var3 = var9.readUnsignedByte((byte) 34);
            if (0 == var2) {
              var4_ref_ea = (IntArrayQuery) ((Object) IntArrayQuery.pendingIntArrayQueries.firstForIteration(0));
              if (var4_ref_ea == null) {
                Bzip2DecoderState.closeSessionSocket((byte) -116);
                return;
              }
              var5_int = -var9.position + AchievementSubmission.sessionPacketPayloadLength;
              var11 = var4_ref_ea.responseWords;
              var10 = var11;
              var6 = var10;
              if (var5_int > var11.length << 2) {
                var5_int = var11.length << 2;
              }
              for (var7 = 0; var5_int > var7; var7++) {
                var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte((byte) 34) << ProxySocketConnector.andInt(var7 << 8, 768));
              }
              var4_ref_ea.unlinkNode(false);
            } else {
              if (var2 == 1) {
                var4 = var9.readSignedSmart(76);
                var5 = (KeyedIntRecordSubmission) ((Object) GrowableIntList.pendingIntRecordSubmissions.firstForIteration(0));
                while (var5 != null) {
                  if (!((var5.byteKey == var3) &&
                      (var5.signedSmartKey == var4))) {
                    var5 = (KeyedIntRecordSubmission) ((Object) GrowableIntList.pendingIntRecordSubmissions.nextForIteration(1));
                    continue;
                  }
                  break;
                }
                if (var5 != null) {
                  var5.unlinkNode(false);
                  break L0;
                }
                Bzip2DecoderState.closeSessionSocket((byte) -116);
                return;
              }
              IterableNodeHashTable.reportClientError((Throwable) null, "LR1: " + TextTemplateDefinition.e(55), (byte) 125);
              Bzip2DecoderState.closeSessionSocket((byte) -123);
            }
          }
          if (methodGuard >= -95) {
            field_O = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "pf.K(" + methodGuard + ')');
        }
    }

    public static void a(byte param0) {
        js5CrcErrorText = null;
        field_K = null;
        field_O = null;
        if (param0 >= -18) {
            LoginPanel.a((byte) -108);
        }
    }

    public final void onTextInputSubmitted(TextInputWidget input, int methodGuard) {
        RuntimeException submissionFailureForContext = null;
        StringBuilder submissionContextBuilder = null;
        String inputDescription = null;
        RuntimeException caughtSubmissionFailure = null;
        RuntimeException textSubmissionFailure = null;
        try {
          if (input == this.loginIdentifierInput) {
            this.passwordInput.requestKeyboardFocus((byte) -69, (UiWidget) (this));
          }
          if (this.passwordInput == input) {
            this.g(methodGuard ^ -18649);
          }
          if (methodGuard != -18649) {
            field_O = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException submissionFailure) {
          caughtSubmissionFailure = submissionFailure;
          textSubmissionFailure = caughtSubmissionFailure;
          submissionFailureForContext = textSubmissionFailure;
          submissionContextBuilder = new StringBuilder().append("pf.S(");
          if (input == null) {
            inputDescription = "null";
          } else {
            inputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionFailureForContext), ((StringBuilder) (Object) submissionContextBuilder).append(inputDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        try {
            var3 = this.loginIdentifierInput;
            var4 = param0;
            var3.setInputText(param1 ^ 2, var4, false);
            if (param1 != 0) {
                this.i(114);
            }
            this.passwordInput.clearInputText((byte) 110);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        if (!(this.messageText == null)) {
            DialogLayer.sharedUiFont.drawParagraph(this.messageText, this.widgetX + parentX + 20, 15 + this.widgetY + parentY, -40 + this.widgetWidth, this.widgetHeight, 16777215, -1, 1, 0, DialogLayer.sharedUiFont.maxAscent);
        }
        if (null != this.createAccountButton) {
            SoftwareRasterizer.drawHorizontalLine(10 + parentX, 134 + parentY, -20 + this.widgetWidth, 4210752);
        }
        int var5 = 20 / ((methodGuard - 1) / 43);
        super.renderWidget(parentX, parentY, (byte) -48, renderPass);
    }

    public final void onTextInputChanged(TextInputWidget input, byte methodGuard) {
        try {
            if (methodGuard != 74) {
                js5CrcErrorText = (String) null;
            }
        } catch (RuntimeException textChangeFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textChangeFailure), "pf.J(" + (input != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.requestPreviousChildFocus(7305, param3);
            return stackIn_5_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.requestNextChildFocus(param3, -109);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String h(int param0) {
        if (null == this.loginIdentifierInput.widgetText) {
            return "";
        }
        if (param0 < 62) {
            UiWidget var3 = (UiWidget) null;
            this.handleKeyInput(28, 70, '"', (UiWidget) null);
        }
        return this.loginIdentifierInput.widgetText;
    }

    final static int a(int param0, int param1, LoginTextValue param2, LoginTextValue param3, String param4, boolean param5, int param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        ByteArrayBuffer stackIn_9_0 = null;
        String stackIn_10_1 = null;
        ByteArrayBuffer stackIn_12_0 = null;
        String stackIn_13_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        String var13 = null;
        CharSequence var14 = null;
        try {
          var13 = param2.getText(16925);
          var8 = param3.getText(16925);
          if ((SpriteCheckboxRenderer.sessionSocket == null) &&
              (!SessionSocketSupport.pollSessionSocketOpening(false, 52))) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (IterableNodeHashTable.requestReadyStage == PacketBuffer.currentProtocolStage) {
            CacheReference.outgoingSessionBuffer.position = 0;
            IntrusiveNodeHashTable.pendingLoginBooleanReply = null;
            if (param4 != null) {
              var9 = 0;
              EndingAnimationSupport.loginPayloadBuffer.position = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(var13, (byte) -126);
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(var8, (byte) -126);
              var14 = (CharSequence) ((Object) param4);
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(UsernameAvailabilityQuery.a(var14, 48), (byte) -126);
              EndingAnimationSupport.loginPayloadBuffer.writeShortBE(param0, 28695);
              EndingAnimationSupport.loginPayloadBuffer.writeByte((byte) -94, param1);
              EndingAnimationSupport.loginPayloadBuffer.writeByte((byte) 123, var9);
              CacheReference.outgoingSessionBuffer.writeByte((byte) 127, 18);
              CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 2;
              var10 = CacheReference.outgoingSessionBuffer.position;
              var11_ref_String = Under13TermsPanel.a(-1, NodeHashTableIterator.getActiveApplet(105));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              CacheReference.outgoingSessionBuffer.writeNullTerminatedText(var11_ref_String, 0);
              UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.field_l);
              CacheReference.outgoingSessionBuffer.backpatchLengthShortBE(-var10 + CacheReference.outgoingSessionBuffer.position, true);
            } else {
              EndingAnimationSupport.loginPayloadBuffer.position = 0;
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              stackIn_9_0 = EndingAnimationSupport.loginPayloadBuffer;
              if (!param2.isIncludedInLookupRequest((byte) 97)) {
                stackIn_10_1 = "";
              } else {
                stackIn_10_1 = var13;
              }
              ((ByteArrayBuffer) (Object) stackIn_9_0).writeZeroPrefixedNullTerminatedText(stackIn_10_1, (byte) -126);
              stackIn_12_0 = EndingAnimationSupport.loginPayloadBuffer;
              if (!param3.isIncludedInLookupRequest((byte) 126)) {
                stackIn_13_1 = "";
              } else {
                stackIn_13_1 = var8;
              }
              ((ByteArrayBuffer) (Object) stackIn_12_0).writeZeroPrefixedNullTerminatedText(stackIn_13_1, (byte) -126);
              CacheReference.outgoingSessionBuffer.writeByte((byte) 124, 16);
              CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 1;
              var9 = CacheReference.outgoingSessionBuffer.position;
              UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.field_l);
              CacheReference.outgoingSessionBuffer.backpatchLengthByte(11700, CacheReference.outgoingSessionBuffer.position - var9);
            }
            NanoFrameTimer.a(-1, -1);
            PacketBuffer.currentProtocolStage = field_K;
          }
          if ((field_K == PacketBuffer.currentProtocolStage) &&
              (UiWidget.readSessionBytesIfAvailable(30000, 1))) {
            var9 = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            LogoCompositor.sessionPacketBuffer.position = 0;
            if ((var9 >= 100) &&
                (var9 <= 105)) {
              PacketBuffer.currentProtocolStage = CanvasResizeController.field_l;
              WidgetSkinState.field_i = new String[var9 - 100];
            } else {
              if (var9 == 248) {
                GrowableIntList.a(NodeHashTableIterator.getActiveApplet(124), (byte) 123);
                AudioService.sessionResponseText = ByteShortQuery.createUnableText;
                Bzip2DecoderState.closeSessionSocket((byte) -124);
                TextTemplateArgumentType.field_e = false;
                stackIn_31_0 = var9;
                return stackIn_31_0;
              }
              if (99 != var9) {
                PacketBuffer.currentProtocolStage = AccountCreationForm.field_F;
                AchievementSubmission.sessionPacketPayloadLength = -1;
                ScorePopup.currentPacketOpcode = var9;
              } else {
                UiWidget.readSessionBytesIfAvailable(30000, DualLinkNode.getLoginBooleanReplyLength(112));
                IntrusiveNodeHashTable.pendingLoginBooleanReply = new Boolean(Bzip2DecoderState.a(LogoCompositor.sessionPacketBuffer, 0));
                LogoCompositor.sessionPacketBuffer.position = 0;
              }
            }
          }
          if (PacketBuffer.currentProtocolStage == CanvasResizeController.field_l) {
            var9 = 2;
            if (UiWidget.readSessionBytesIfAvailable(30000, var9)) {
              var10 = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
              LogoCompositor.sessionPacketBuffer.position = 0;
              if (UiWidget.readSessionBytesIfAvailable(30000, var10)) {
                var11 = WidgetSkinState.field_i.length;
                for (var12 = 0; var12 < var11; var12++) {
                  WidgetSkinState.field_i[var12] = LogoCompositor.sessionPacketBuffer.readZeroPrefixedNullTerminatedText(27425);
                }
                Bzip2DecoderState.closeSessionSocket((byte) -114);
                TextTemplateArgumentType.field_e = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if ((PacketBuffer.currentProtocolStage == AccountCreationForm.field_F) &&
              (TriangleMesh.readSessionPacketPayload(false))) {
            if (ScorePopup.currentPacketOpcode != 255) {
              AudioService.sessionResponseText = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 98);
            } else {
              var9_ref_String = LogoCompositor.sessionPacketBuffer.readNullableNullTerminatedText((byte) 53);
              if (var9_ref_String != null) {
                SettingsCookieSupport.storeSettingsCookie(-128, var9_ref_String, NodeHashTableIterator.getActiveApplet(106));
              }
            }
            Bzip2DecoderState.closeSessionSocket((byte) -114);
            TextTemplateArgumentType.field_e = false;
            stackIn_54_0 = ScorePopup.currentPacketOpcode;
            return stackIn_54_0;
          }
          if (param6 < 56) {
            field_K = (ClientProtocolStage) null;
          }
          if (SpriteCheckboxRenderer.sessionSocket == null) {
            if (TextTemplateArgumentType.field_e) {
              if (GameGraphicsResources.elapsedSinceSessionActivity((byte) 12) <= 30000L) {
                AudioService.sessionResponseText = FullscreenFailureReason.loginMessage2Text;
              } else {
                AudioService.sessionResponseText = IntrusiveNode.loginMessage3Text;
              }
              TextTemplateArgumentType.field_e = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9 = NetworkArchiveRequest.sessionServerPort;
            NetworkArchiveRequest.sessionServerPort = TextInputRenderer.alternateSessionServerPort;
            TextTemplateArgumentType.field_e = true;
            TextInputRenderer.alternateSessionServerPort = var9;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("pf.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 != -20) {
            this.loginOrRetryButton = (ButtonWidget) null;
          }
          if (this.loginOrRetryButton == param4) {
            this.g(0);
          } else {
            if (this.createAccountButton == param4) {
              MultiHandleSliderRenderer.a((byte) 108);
            } else {
              if (this.alternateButton == param4) {
                if (!this.retryMode) {
                  if (!this.allowJustPlay) {
                    LoginPasswordSupport.requestLoginUiActionFour(param1 - 23718);
                  } else {
                    ByteArrayBuffer.g(0);
                  }
                } else {
                  NetworkArchiveRequest.h(param1 ^ -60);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("pf.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void writeReflectionCheckReply(int methodGuard, PacketBuffer buffer) {
        try {
            int var6 = 0;
            int var11_int = 0;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_68_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            Object var11 = null;
            ObjectInputStream var12 = null;
            ReflectionCheckRequest var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            ReflectionCheckRequest var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            try {
              var13 = (ReflectionCheckRequest) ((Object) UsernameAvailabilityQuery.field_k.firstForIteration(0));
              var17 = var13;
              if (var17 == null) {
                return;
              }
              var4 = 2 % ((methodGuard + 26) / 62);
              var3 = 0;
              for (var5 = 0; var5 < var17.operationCount; var5++) {
                if (var13.fieldLookupTasks[var5] != null) {
                  if (var13.fieldLookupTasks[var5].status == 2) {
                    var13.operationErrors[var5] = -5;
                  }
                  if (var13.fieldLookupTasks[var5].status == 0) {
                    var3 = 1;
                  }
                }
                if (var13.methodLookupTasks[var5] != null) {
                  if (2 == var13.methodLookupTasks[var5].status) {
                    var13.operationErrors[var5] = -6;
                  }
                  if (var13.methodLookupTasks[var5].status == 0) {
                    var3 = 1;
                  }
                }
              }
              if (var3 != 0) {
                return;
              }
              var5 = buffer.position;
              buffer.writeIntBE((byte) 95, var17.requestId);
              for (var6 = 0; var6 < var17.operationCount; var6++) {
                if (var13.operationErrors[var6] != 0) {
                  buffer.writeByte((byte) 6, var13.operationErrors[var6]);
                } else {
                  try {
                    var7_int = var13.operationTypes[var6];
                    if (var7_int == 0) {
                      var15 = (java.lang.reflect.Field) (var13.fieldLookupTasks[var6].result);
                      var9 = var15.getInt((Object) null);
                      buffer.writeByte((byte) 3, 0);
                      buffer.writeIntBE((byte) 95, var9);
                    } else {
                      if (var7_int == 1) {
                        var14 = (java.lang.reflect.Field) (var13.fieldLookupTasks[var6].result);
                        var8 = var14;
                        var14.setInt((Object) null, var13.integerWriteValues[var6]);
                        buffer.writeByte((byte) 124, 0);
                      } else {
                        if (2 == var7_int) {
                          var25 = (java.lang.reflect.Field) (var13.fieldLookupTasks[var6].result);
                          var9 = var25.getModifiers();
                          buffer.writeByte((byte) 126, 0);
                          buffer.writeIntBE((byte) 95, var9);
                        }
                      }
                    }
                    if (var7_int == 3) {
                      var27 = (java.lang.reflect.Method) (var13.methodLookupTasks[var6].result);
                      var24 = var13.serializedArguments[var6];
                      var10 = new Object[var24.length];
                      for (var11_int = 0; var11_int < var24.length; var11_int++) {
                        var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var11_int])));
                        var10[var11_int] = var12.readObject();
                      }
                      var11 = var27.invoke((Object) null, var10);
                      if (var11 == null) {
                        buffer.writeByte((byte) -88, 0);
                      } else if (var11 instanceof Number) {
                        buffer.writeByte((byte) 126, 1);
                        buffer.writeLongBE((byte) 116, ((Number) (var11)).longValue());
                      } else if (!(var11 instanceof String)) {
                        buffer.writeByte((byte) -86, 4);
                      } else {
                        buffer.writeByte((byte) 121, 2);
                        buffer.writeNullTerminatedText((String) (var11), 0);
                      }
                    } else {
                      if (var7_int == 4) {
                        var26 = (java.lang.reflect.Method) (var13.methodLookupTasks[var6].result);
                        var9 = var26.getModifiers();
                        buffer.writeByte((byte) 123, 0);
                        buffer.writeIntBE((byte) 95, var9);
                      }
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 122, -10);
                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) -101, -11);
                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 124, -12);
                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) -78, -13);
                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 4, -14);
                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                    decompiledCaughtException = decompiledCaughtParameter5;
                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 11, -15);
                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                    decompiledCaughtException = decompiledCaughtParameter6;
                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) -127, -16);
                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                    decompiledCaughtException = decompiledCaughtParameter7;
                    var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 126, -17);
                  } catch (java.io.IOException decompiledCaughtParameter8) {
                    decompiledCaughtException = decompiledCaughtParameter8;
                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) 121, -18);
                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                    decompiledCaughtException = decompiledCaughtParameter9;
                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) -100, -19);
                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                    decompiledCaughtException = decompiledCaughtParameter10;
                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                    buffer.writeByte((byte) -74, -20);
                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                    decompiledCaughtException = decompiledCaughtParameter11;
                    var7_ref11 = decompiledCaughtException;
                    buffer.writeByte((byte) -37, -21);
                  }
                }
              }
              buffer.appendCrc32(8, var5);
              var17.unlinkNode(false);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_67_0 = var2;
              stackIn_67_1 = new StringBuilder().append("pf.M(").append(methodGuard).append(',');
              if (buffer == null) {
                stackIn_68_2 = "null";
              } else {
                stackIn_68_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        if ((!(!SpriteState.e(param0)) ||
            (!(this.loginIdentifierInput.widgetText.length() <= 0) &&
              !(0 >= this.passwordInput.widgetText.length())))) {
          SecondaryNodeDequeIterator.startLogin(this.passwordInput.widgetText, (byte) 66, this.loginIdentifierInput.widgetText);
        }
    }

    LoginPanel(String loginIdentifier, String message, boolean retryMode, boolean showCreateAccount, boolean allowJustPlay) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledChildWidget dupTemp$0 = null;
        LabeledChildWidget dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ButtonWidget stackIn_18_1 = null;
        ButtonWidget stackIn_18_2 = null;
        ButtonWidget stackIn_19_1 = null;
        ButtonWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpriteButtonRenderer var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledChildWidget var12 = null;
        LabeledChildWidget var13 = null;
        try {
          if (!showCreateAccount) {
            stackIn_4_1 = false;
          } else {
            stackIn_4_1 = true;
          }
          ((LoginPanel) (this)).showCreateAccount = stackIn_4_1;
          this.messageText = message;
          if (!retryMode) {
            stackIn_7_1 = false;
          } else {
            stackIn_7_1 = true;
          }
          ((LoginPanel) (this)).retryMode = stackIn_7_1;
          if (!allowJustPlay) {
            stackIn_10_1 = false;
          } else {
            stackIn_10_1 = true;
          }
          ((LoginPanel) (this)).allowJustPlay = stackIn_10_1;
          if (this.retryMode) {
            if (!((!this.showCreateAccount) &&
                (!this.allowJustPlay))) {
              throw new IllegalStateException();
            }
          }
          this.loginIdentifierInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget(loginIdentifier, (WidgetListener) (this), 100));
          this.passwordInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) (this), 20));
          if (!this.retryMode) {
            this.loginOrRetryButton = new ButtonWidget(NodeHashTableIterator.loginText, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.allowJustPlay) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ClientRenderingState.justPlayText;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = GameGraphicsResources.backText;
            }
            ((LoginPanel) (this)).alternateButton = new ButtonWidget(stackIn_19_3, (WidgetListener) null);
            if (this.showCreateAccount) {
              this.createAccountButton = new ButtonWidget(KeyedIntRecordSubmission.createAnAccountText, (WidgetListener) (this));
            }
          } else {
            this.loginOrRetryButton = new ButtonWidget(BoardEntityState.retryText, (WidgetListener) null);
            this.alternateButton = new ButtonWidget(DisplayModeInfo.quitToWebsiteText, (WidgetListener) null);
            this.loginIdentifierInput.enabled = false;
          }
          this.loginIdentifierInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
          this.passwordInput.renderer = (WidgetRenderer) ((Object) new PasswordWidgetRenderer(10000536));
          var6 = new SpriteButtonRenderer();
          this.loginOrRetryButton.renderer = (WidgetRenderer) ((Object) var6);
          if (this.alternateButton != null) {
            this.alternateButton.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.loginIdentifierInput.hoverText = SocketArchiveNetworkClient.loginUsernameTooltipText;
          if (null != this.createAccountButton) {
            this.createAccountButton.hoverText = SessionBootstrapSupport.loginCreateTooltipText;
          }
          if (this.retryMode) {
            this.alternateButton.hoverText = SocialListEntry.quitWarningText;
          } else {
            if (!this.allowJustPlay) {
              this.alternateButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
            } else {
              this.alternateButton.hoverText = CheckboxWidget.loginJustPlayTooltipText;
              this.alternateButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
            }
          }
          this.widgetY = 15;
          var7 = DialogLayer.sharedUiFont;
          if (this.messageText != null) {
            this.widgetY = this.widgetY + (var7.measureWrappedHeight(this.messageText, this.widgetWidth - 40, var7.maxAscent) + 5);
          }
          var8 = WeightedObjectCache.loginUsernameEmailText;
          var9 = AlternateLongAndTextLoginPayload.readRememberedMethod(NodeHashTableIterator.getActiveApplet(120), 200);
          if (var9 != LoginTextValue.field_b) {
            if (var9 == ProgressDialog.field_W) {
              var8 = LogoPreparationSupport.loginUsernameText;
            }
          } else {
            var8 = UsernameAvailabilityQuery.loginEmailText;
          }
          dupTemp$0 = new LabeledChildWidget(10, this.widgetY, -20 + this.widgetWidth, 25, this.loginIdentifierInput, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild((byte) -110, dupTemp$0);
          this.widgetY = this.widgetY + (((UiWidget) ((Object) var12)).widgetHeight + 5);
          dupTemp$1 = new LabeledChildWidget(10, this.widgetY, this.widgetWidth - 20, 25, this.passwordInput, false, 80, 3, var7, 16777215, LoginPayloadKind.createPasswordText);
          var13 = dupTemp$1;
          this.addChild((byte) -120, dupTemp$1);
          this.loginOrRetryButton.listener = (WidgetListener) (this);
          this.widgetY = this.widgetY + (((UiWidget) ((Object) var13)).widgetHeight + 5);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (WidgetListener) (this);
          }
          if (this.alternateButton != null) {
            this.alternateButton.listener = (WidgetListener) (this);
          }
          if (this.createAccountButton != null) {
            this.loginOrRetryButton.setWidgetBounds(30, this.widgetWidth - 95, (byte) -92, this.widgetY, 85);
            this.widgetY = this.widgetY + 60;
          } else {
            this.loginOrRetryButton.setWidgetBounds(30, -10 + this.widgetWidth - 6, (byte) -33, this.widgetY, 8);
            this.widgetY = this.widgetY + 35;
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.setWidgetBounds(30, -10 + this.widgetWidth - 6, (byte) -42, this.widgetY, 8);
            this.widgetY = this.widgetY + 35;
          }
          if (this.alternateButton != null) {
            if ((!this.retryMode) &&
                (!this.allowJustPlay)) {
              this.alternateButton.setWidgetBounds(20, 40, (byte) -55, this.widgetY, 8);
              this.widgetY = this.widgetY + 25;
            } else {
              this.alternateButton.setWidgetBounds(30, -10 + (this.widgetWidth - 6), (byte) -64, this.widgetY, 8);
              this.widgetY = this.widgetY + 35;
            }
          }
          this.setWidgetBounds(3 + this.widgetY, this.widgetWidth, (byte) -17, 0, 0);
          this.addChild((byte) -83, this.loginOrRetryButton);
          if (null != this.createAccountButton) {
            this.addChild((byte) -111, this.createAccountButton);
          }
          if (this.alternateButton != null) {
            this.addChild((byte) -127, this.alternateButton);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("pf.<init>(");
          if (loginIdentifier == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (message == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(retryMode).append(',').append(showCreateAccount).append(',').append(allowJustPlay).append(')').toString());
        }
    }

    final static LoginTextValue h(byte param0) {
        if (param0 != -42) {
            LoginPanel.h((byte) -98);
        }
        return new LoginTextValue(UsernameSuggestionsPanel.f(100), SocketConnector.d(7));
    }

    final void i(int param0) {
        this.loginIdentifierInput.clearInputText((byte) 48);
        this.passwordInput.clearInputText((byte) 116);
        int var2 = 40 % ((param0 - 17) / 38);
    }

    static {
        endingEntityScanClear = false;
        js5CrcErrorText = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_K = new ClientProtocolStage();
    }
}
