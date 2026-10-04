/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientFlowToken {
    final static void handleSessionAcknowledgement(int methodGuard) {
        int acknowledgementKind = 0;
        int acknowledgementCrc = 0;
        CrcAcknowledgedPacket pendingCrcPacket = null;
        int clientControlFlowGuard = 0;
        PacketBuffer inputPacket = null;
        RuntimeException caughtAcknowledgementFailure = null;
        RuntimeException acknowledgementFailureForContext = null;
        int responsePayloadLength = 0;
        Object unusedNullPayloadSnapshot = null;
        FifoResponseToken pendingFifoToken = null;
        byte[] discardedResponsePayload = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 26146) {
            return;
          }
          inputPacket = LogoCompositor.sessionPacketBuffer;
          acknowledgementKind = inputPacket.readUnsignedByte((byte) 34);
          if (acknowledgementKind == 0) {
            pendingFifoToken = (FifoResponseToken) ((Object) PrefixCodeDecoder.pendingFifoAcknowledgements.firstForIteration(0));
            if (pendingFifoToken == null) {
              Bzip2DecoderState.closeSessionSocket((byte) -124);
              return;
            }
            responsePayloadLength = inputPacket.readUnsignedByte((byte) 34);
            if (0 != responsePayloadLength) {
              discardedResponsePayload = new byte[responsePayloadLength];
              inputPacket.readBytes(29915, responsePayloadLength, discardedResponsePayload, 0);
            } else {
              unusedNullPayloadSnapshot = null;
            }
            inputPacket.position = inputPacket.position + 4;
            if (!inputPacket.verifyTrailingCrc32((byte) 20)) {
              Bzip2DecoderState.closeSessionSocket((byte) -121);
              return;
            }
            pendingFifoToken.unlinkNode(false);
          } else {
            if (1 == acknowledgementKind) {
              acknowledgementCrc = inputPacket.readIntBE((byte) -101);
              pendingCrcPacket = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.firstForIteration(0));
              while (pendingCrcPacket != null) {
                if (acknowledgementCrc != pendingCrcPacket.acknowledgementCrc) {
                  pendingCrcPacket = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.nextForIteration(1));
                  continue;
                }
                break;
              }
              if (pendingCrcPacket != null) {
                pendingCrcPacket.unlinkNode(false);
                return;
              }
              Bzip2DecoderState.closeSessionSocket((byte) -124);
              return;
            }
            IterableNodeHashTable.reportClientError((Throwable) null, "A1: " + TextTemplateDefinition.formatSessionPacketDiagnostic(55), (byte) 125);
            Bzip2DecoderState.closeSessionSocket((byte) -120);
          }
          return;
        } catch (java.lang.RuntimeException acknowledgementFailure) {
          caughtAcknowledgementFailure = acknowledgementFailure;
          acknowledgementFailureForContext = caughtAcknowledgementFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) acknowledgementFailureForContext), "al.B(" + methodGuard + ')');
        }
    }

    final static void playThemeEntitySound(int methodGuard, int themeId) {
        int soundVariantOffset;
        int themeSnapshot;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        soundVariantOffset = AchievementQuery.nextSpriteVariantIndex(3, methodGuard ^ 9667);
        if (methodGuard != 9666) {
          return;
        }
        themeSnapshot = themeId;
        if (themeSnapshot != 4) {
          if (themeSnapshot == 3) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[soundVariantOffset + 13]);
          } else {
            if (themeSnapshot != 1) {
              if (themeSnapshot != 0) {
                if (themeSnapshot == 6) {
                  ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[soundVariantOffset + 4]);
                } else {
                  if (5 == themeSnapshot) {
                    ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[16 + soundVariantOffset]);
                  } else {
                    if (themeSnapshot == 2) {
                      ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[soundVariantOffset + 19]);
                    }
                  }
                }
              } else {
                ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[soundVariantOffset + 1]);
              }
            } else {
              ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[7 + soundVariantOffset]);
            }
          }
        } else {
          ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[10 + soundVariantOffset]);
        }
    }

    final static boolean hasAccountIneligibilityMarker(byte methodGuard, java.applet.Applet applet) {
        try {
            int cookieIndex = 0;
            RuntimeException markerFailureForContext = null;
            String cookieText = null;
            String[] cookieEntries = null;
            int equalsOffset = 0;
            int clientControlFlowGuard = 0;
            String markerName = null;
            boolean appletMarkerBeforeReturn = false;
            RuntimeException markerFailureBeforeContext = null;
            StringBuilder markerMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtMarkerOrCookieFailure = null;
            Throwable ignoredCookieLookupFailure = null;
            clientControlFlowGuard = Geoblox.clientControlFlowFlag;
            try {
              if (ValidationIconWidget.clientCookieMarkerCreated) {
                return true;
              }
              try {
                markerName = "tuhstatbut";
                cookieText = (String) (AppletJavaScriptBridge.callWithoutArguments((byte) -6, applet, "getcookies"));
                cookieEntries = FullscreenFailureReason.splitAtCharacter(';', true, cookieText);
                for (cookieIndex = 0; cookieIndex < cookieEntries.length; cookieIndex++) {
                  equalsOffset = cookieEntries[cookieIndex].indexOf('=');
                  if ((equalsOffset >= 0) &&
                      (cookieEntries[cookieIndex].substring(0, equalsOffset).trim().equals(markerName))) {
                    return true;
                  }
                }
                if (methodGuard != -109) {
                  ClientFlowToken.playThemeEntitySound(114, -32);
                }
              } catch (java.lang.Throwable cookieLookupFailure) {
                caughtMarkerOrCookieFailure = cookieLookupFailure;
                ignoredCookieLookupFailure = caughtMarkerOrCookieFailure;
              }
              appletMarkerBeforeReturn = !(null == applet.getParameter("tuhstatbut"));
              return appletMarkerBeforeReturn;
            } catch (java.lang.RuntimeException markerFailure) {
              caughtMarkerOrCookieFailure = markerFailure;
              markerFailureForContext = (RuntimeException) (Object) caughtMarkerOrCookieFailure;
              markerFailureBeforeContext = markerFailureForContext;
              markerMessagePrefix = new StringBuilder().append("al.A(").append(methodGuard).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) markerFailureBeforeContext), ((StringBuilder) (Object) markerMessagePrefix).append(appletDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedMarkerFailure) {
            throw uncheckedMarkerFailure;
        } catch (Throwable checkedMarkerFailure) {
            throw new RuntimeException(checkedMarkerFailure);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String getActiveLoginIdentifier(int methodGuard) {
        if (!(IntrusiveDeque.pendingClientFlowToken != ClientFlowState.accountCreationFlowState)) {
            return SpriteCheckboxRenderer.accountCreationDisplayName;
        }
        if (IntrusiveDeque.pendingClientFlowToken == WidgetSkinState.usernameQueryFlowState) {
            return DelayedPcmStream.usernameQueryCandidate;
        }
        if (methodGuard != 0) {
            ClientFlowToken.getActiveLoginIdentifier(66);
        }
        if (!EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-91)) {
            return DelayedPcmStream.usernameQueryCandidate;
        }
        return TextTemplateLookupSupport.currentLoginIdentifier;
    }

    static {
    }
}
