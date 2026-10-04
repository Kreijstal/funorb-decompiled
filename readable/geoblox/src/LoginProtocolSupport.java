/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginProtocolSupport {
    static String waitingForBootstrapText;
    static String[] achievementDescriptions;
    static boolean field_a;

    final static int advanceLoginHandshake(boolean useLongLoginPayload, String primaryLoginText, int affiliateId, boolean enableLoginFlagBitEight, String secondaryLoginText, int methodGuard) {
        try {
            int connectionPendingResult = 0;
            int closedResponseResult = 0;
            boolean responseFlagFourSet = false;
            boolean responseFlagEightSet = false;
            int connectedResponseResult = 0;
            int retryPendingResult = 0;
            int failedResponseResult = 0;
            int retryFailureResult = 0;
            int pendingHandshakeResult = 0;
            RuntimeException loginFailureCause = null;
            StringBuilder loginFailurePrefix = null;
            String primaryTextDescription = null;
            StringBuilder messageBeforeSecondaryTextDescription = null;
            String secondaryTextDescription = null;
            Throwable caughtLoginOrScriptFailure = null;
            int responseByteThenPortSwapValue = 0;
            String settingsCookieValue = null;
            RuntimeException loginFailureForContext = null;
            int loginResponseFlags = 0;
            int extensionByteIndexThenCipherSeedIndex = 0;
            Throwable ignoredScriptFailure = null;
            int unusedClientControlSnapshot = 0;
            String unusedNullPrimaryTextSnapshot = null;
            String unusedNullLongPayloadTextSnapshot = null;
            CharSequence receivedNameCharacters = null;
            unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              if ((null == SpriteCheckboxRenderer.sessionSocket) &&
                  (!SessionSocketSupport.pollSessionSocketOpening(useLongLoginPayload, 52))) {
                connectionPendingResult = -1;
                return connectionPendingResult;
              }
              if (PacketBuffer.currentProtocolStage == IterableNodeHashTable.requestReadyStage) {
                if (!useLongLoginPayload) {
                  EntityContactSupport.pendingLoginPayload = HotspotTextWidget.a(false, primaryLoginText, secondaryLoginText, false);
                } else {
                  unusedNullLongPayloadTextSnapshot = (String) null;
                  EntityContactSupport.pendingLoginPayload = SecondaryDeque.createLoginPayload(true, ClientClockSupport.field_c, (String) null, primaryLoginText, false);
                }
                CacheReference.outgoingSessionBuffer.position = 0;
                CacheReference.outgoingSessionBuffer.writeByte((byte) -102, 14);
                CacheReference.outgoingSessionBuffer.writeByte((byte) -78, EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32).wireId);
                NanoFrameTimer.a(-1, -1);
                PacketBuffer.currentProtocolStage = ResizableDialog.awaitingInitialLoginReplyStage;
              }
              if ((ResizableDialog.awaitingInitialLoginReplyStage == PacketBuffer.currentProtocolStage) &&
                  (UiWidget.readSessionBytesIfAvailable(30000, 1))) {
                responseByteThenPortSwapValue = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                LogoCompositor.sessionPacketBuffer.position = 0;
                if (responseByteThenPortSwapValue != 0) {
                  AchievementSubmission.sessionPacketPayloadLength = -1;
                  PacketBuffer.currentProtocolStage = TextInputRenderer.awaitingLoginFailureTextStage;
                  ScorePopup.currentPacketOpcode = responseByteThenPortSwapValue;
                } else {
                  PacketBuffer.currentProtocolStage = MessageDialog.awaitingLoginLongState;
                }
              }
              if ((MessageDialog.awaitingLoginLongState == PacketBuffer.currentProtocolStage) &&
                  (UiWidget.readSessionBytesIfAvailable(30000, 8))) {
                TextValidationSupport.field_a = LogoCompositor.sessionPacketBuffer.readLongBE(2901);
                LogoCompositor.sessionPacketBuffer.position = 0;
                UsernameAvailabilityValidator.a(26, affiliateId, useLongLoginPayload, EntityContactSupport.pendingLoginPayload, enableLoginFlagBitEight);
                PacketBuffer.currentProtocolStage = ClientOptionSupport.awaitingLoginResultStage;
              }
              if (methodGuard != 0) {
                unusedNullPrimaryTextSnapshot = (String) null;
                LoginProtocolSupport.advanceLoginHandshake(false, (String) null, 95, false, (String) null, 13);
              }
              L6: {
                if ((ClientOptionSupport.awaitingLoginResultStage == PacketBuffer.currentProtocolStage) &&
                    (UiWidget.readSessionBytesIfAvailable(30000, 1))) {
                  responseByteThenPortSwapValue = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.position = 0;
                  GameSoundResources.optionalLoginText = null;
                  ScorePopup.currentPacketOpcode = responseByteThenPortSwapValue;
                  if ((responseByteThenPortSwapValue != 0) &&
                      (responseByteThenPortSwapValue != 1)) {
                    if (responseByteThenPortSwapValue != 8) {
                      PacketBuffer.currentProtocolStage = TextInputRenderer.awaitingLoginFailureTextStage;
                      AchievementSubmission.sessionPacketPayloadLength = -1;
                      break L6;
                    }
                    Bzip2DecoderState.closeSessionSocket((byte) -116);
                    TextTemplateArgumentType.field_e = false;
                    closedResponseResult = responseByteThenPortSwapValue;
                    return closedResponseResult;
                  }
                  AchievementSubmission.sessionPacketPayloadLength = -1;
                  PacketBuffer.currentProtocolStage = ClientOptionSupport.awaitingLoginDetailsStage;
                }
              }
              if ((ClientOptionSupport.awaitingLoginDetailsStage == PacketBuffer.currentProtocolStage) &&
                  (TriangleMesh.readSessionPacketPayload(false))) {
                ClientClockSupport.field_c = LogoCompositor.sessionPacketBuffer.readLongBE(2901);
                SpriteCheckboxRenderer.field_f = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                TextTemplateDefinition.field_n = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
                settingsCookieValue = LogoCompositor.sessionPacketBuffer.readNullableNullTerminatedText((byte) 53);
                loginResponseFlags = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                if ((1 & loginResponseFlags) != 0) {
                  SessionBootstrapSupport.persistSessionSeedBytes((byte) 65);
                }
                if (!useLongLoginPayload) {
                  responseFlagFourSet = !((loginResponseFlags & 4) == 0);
                  GzipInflater.field_b = responseFlagFourSet;
                  responseFlagEightSet = !((loginResponseFlags & 8) == 0);
                  TextHotspotBounds.field_l = responseFlagEightSet;
                  if (!TextHotspotBounds.field_l) {
                  }
                }
                if (GameGraphicsResources.loginResponseExtensionEnabled) {
                  LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                  LogoCompositor.sessionPacketBuffer.readIntBE((byte) -48);
                  PacketBuffer.field_n = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
                  ValidatedTextInputWidget.field_K = new byte[PacketBuffer.field_n];
                  for (extensionByteIndexThenCipherSeedIndex = 0; PacketBuffer.field_n > extensionByteIndexThenCipherSeedIndex; extensionByteIndexThenCipherSeedIndex++) {
                    ValidatedTextInputWidget.field_K[extensionByteIndexThenCipherSeedIndex] = LogoCompositor.sessionPacketBuffer.readSignedByte((byte) 72);
                  }
                }
                SecondaryDeque.receivedSessionName = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 105);
                receivedNameCharacters = (CharSequence) ((Object) SecondaryDeque.receivedSessionName);
                SecondaryNodeHashTable.normalizedSessionName = ResizableDialog.normalizeSessionName(receivedNameCharacters, 12);
                EntityLinkSupport.sessionAccessLevelByte = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
                PacketBuffer.currentProtocolStage = LogoCompositor.connectedSessionStage;
                if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) != RatingPresentationResources.loginPayloadKindThree) {
                  if (EntityContactSupport.pendingLoginPayload.payloadKind((byte) -32) == Geoblox.longAndNameLoginType) {
                    ProgressDialog.field_W.rememberMethod(NodeHashTableIterator.getActiveApplet(108), 0);
                  }
                } else {
                  LoginTextValue.field_b.rememberMethod(NodeHashTableIterator.getActiveApplet(122), 0);
                }
                TextTemplateArgumentType.field_e = false;
                if (settingsCookieValue != null) {
                  SettingsCookieSupport.storeSettingsCookie(100, settingsCookieValue, NodeHashTableIterator.getActiveApplet(112));
                }
                if ((TextTemplateDefinition.field_n <= 0) &&
                    (!GzipInflater.field_b)) {
                  try {
                    AppletJavaScriptBridge.callWithoutArguments((byte) -6, NodeHashTableIterator.getActiveApplet(107), "unzap");
                  } catch (java.lang.Throwable unzapScriptFailure) {
                    caughtLoginOrScriptFailure = unzapScriptFailure;
                    ignoredScriptFailure = caughtLoginOrScriptFailure;
                  }
                } else {
                  try {
                    AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{UnderlinedButtonRenderer.a(ClientClockSupport.field_c, methodGuard + 97)}, NodeHashTableIterator.getActiveApplet(methodGuard + 119), "zap");
                  } catch (java.lang.Throwable zapScriptFailure) {
                    caughtLoginOrScriptFailure = zapScriptFailure;
                    ignoredScriptFailure = caughtLoginOrScriptFailure;
                  }
                }
                if (TextTemplateDefinition.field_n > 0) {
                  FontLoadingSupport.memberAccountMode = true;
                }
                CacheReference.outgoingSessionBuffer.initializeCipher(ProgressBarWidget.field_D, false);
                for (extensionByteIndexThenCipherSeedIndex = 0; extensionByteIndexThenCipherSeedIndex < 4; extensionByteIndexThenCipherSeedIndex++) {
                  ProgressBarWidget.field_D[extensionByteIndexThenCipherSeedIndex] = ProgressBarWidget.field_D[extensionByteIndexThenCipherSeedIndex] + 50;
                }
                LogoCompositor.sessionPacketBuffer.initializeCipher(ProgressBarWidget.field_D, false);
                connectedResponseResult = ScorePopup.currentPacketOpcode;
                return connectedResponseResult;
              }
              if ((PacketBuffer.currentProtocolStage == TextInputRenderer.awaitingLoginFailureTextStage) &&
                  (TriangleMesh.readSessionPacketPayload(false))) {
                Bzip2DecoderState.closeSessionSocket((byte) -118);
                if ((ScorePopup.currentPacketOpcode == 7) &&
                    (!TextTemplateArgumentType.field_e)) {
                  TextTemplateArgumentType.field_e = true;
                  retryPendingResult = -1;
                  return retryPendingResult;
                }
                if (ScorePopup.currentPacketOpcode == 7) {
                  ScorePopup.currentPacketOpcode = 3;
                }
                AudioService.sessionResponseText = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 101);
                TextTemplateArgumentType.field_e = false;
                failedResponseResult = ScorePopup.currentPacketOpcode;
                return failedResponseResult;
              }
              if (null == SpriteCheckboxRenderer.sessionSocket) {
                if (TextTemplateArgumentType.field_e) {
                  if (30000L >= GameGraphicsResources.elapsedSinceSessionActivity((byte) 12)) {
                    AudioService.sessionResponseText = FullscreenFailureReason.loginMessage2Text;
                  } else {
                    AudioService.sessionResponseText = IntrusiveNode.loginMessage3Text;
                  }
                  TextTemplateArgumentType.field_e = false;
                  retryFailureResult = 3;
                  return retryFailureResult;
                }
                responseByteThenPortSwapValue = NetworkArchiveRequest.sessionServerPort;
                NetworkArchiveRequest.sessionServerPort = TextInputRenderer.alternateSessionServerPort;
                TextInputRenderer.alternateSessionServerPort = responseByteThenPortSwapValue;
                TextTemplateArgumentType.field_e = true;
              }
              pendingHandshakeResult = -1;
              return pendingHandshakeResult;
            } catch (java.lang.RuntimeException loginFailure) {
              caughtLoginOrScriptFailure = loginFailure;
              loginFailureForContext = (RuntimeException) (Object) caughtLoginOrScriptFailure;
              loginFailureCause = loginFailureForContext;
              loginFailurePrefix = new StringBuilder().append("ri.B(").append(useLongLoginPayload).append(',');
              if (primaryLoginText == null) {
                primaryTextDescription = "null";
              } else {
                primaryTextDescription = "{...}";
              }
              messageBeforeSecondaryTextDescription = ((StringBuilder) (Object) loginFailurePrefix).append(primaryTextDescription).append(',').append(affiliateId).append(',').append(enableLoginFlagBitEight).append(',');
              if (secondaryLoginText == null) {
                secondaryTextDescription = "null";
              } else {
                secondaryTextDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFailureCause), ((StringBuilder) (Object) messageBeforeSecondaryTextDescription).append(secondaryTextDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedLoginFailure) {
            throw uncheckedLoginFailure;
        } catch (Throwable checkedLoginFailure) {
            throw new RuntimeException(checkedLoginFailure);
        }
    }

    final static void drawAvatarFaceLayers(int avatarX, int avatarY, int methodGuard) {
        int faceOriginOffsetX = 2 + (MeshDepthSupport.avatarMaskRaster.fullWidth >> 1);
        if (methodGuard != 29497) {
            return;
        }
        int faceOriginOffsetY = (MeshDepthSupport.avatarMaskRaster.fullHeight >> 1) + 2;
        EndingAnimationSupport.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarX - faceOriginOffsetX, avatarY - faceOriginOffsetY, DisplayModeInfo.avatarTintColor);
        UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(-faceOriginOffsetX + avatarX, -faceOriginOffsetY + avatarY, DisplayModeInfo.avatarTintColor);
    }

    public static void releaseStaticReferences(int methodGuard) {
        waitingForBootstrapText = null;
        if (methodGuard != 5366) {
            achievementDescriptions = (String[]) null;
        }
        achievementDescriptions = null;
    }

    static {
        field_a = false;
        achievementDescriptions = new String[]{"Clear 3 geoblox of the same colour and shape", "Clear the geoblox avatar", "Finish a stage with the avatar clear of geoblox", "Achieve a 6x bonus multiplier", "Achieve a 7x bonus multiplier", "Achieve an 8x bonus multiplier", "Destroy 5 black orbs", "Destroy 3 black orbs with one shock", "Pass the sun stage", "Pass the sweet stage", "Pass the jewellery stage", "Pass the germ stage", "Pass the space stage", "Pass the sport stage", "Pass the bakery stage", "Get past all stages twice!", "Score 7,000 points during Halloween"};
    }
}
