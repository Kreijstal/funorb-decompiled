/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoPreparationSupport {
    static Sprite boardOwnershipRaster;
    static Sprite logoFinalFrameTop;
    static String loginUsernameText;

    public static void releaseStaticReferences(boolean methodGuard) {
        if (methodGuard) {
            logoFinalFrameTop = null;
            loginUsernameText = null;
            boardOwnershipRaster = null;
            return;
        }
        logoFinalFrameTop = (Sprite) null;
        logoFinalFrameTop = null;
        loginUsernameText = null;
        boardOwnershipRaster = null;
    }

    final static void prepareLogoAnimation(ResourceArchive logoArchive, int startDelayMillis, int methodGuard, PcmStreamMixer unusedPcmMixer) {
        try {
            DiskCacheWorker.logoStartDelayTicks = startDelayMillis * ClientTimingSupport.getConfiguredUpdateRate(true) / 1000;
            EntityMotionSupport.decodeLogoAudio(99, logoArchive);
            MessageDialogContent.loadLogoMeshesAndMaterials(logoArchive, 0);
            if (methodGuard < 97) {
                LogoPreparationSupport.readSessionTextRecord(true, -54);
            }
            MatchCandidateSupport.prepareFinalFrameSlices(-21541, logoArchive);
            FullscreenSupport.prepareMeshSpecularResponse((byte) -91);
            MidiNoteMixer.prepareLogoGlowRaster((byte) -32);
            DequeCursor.logoAnimationTick = -DiskCacheWorker.logoStartDelayTicks + 0;
        } catch (RuntimeException logoPreparationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) logoPreparationFailure), "bk.B(" + (logoArchive != null ? "{...}" : "null") + ',' + startDelayMillis + ',' + methodGuard + ',' + (unusedPcmMixer != null ? "{...}" : "null") + ')');
        }
    }

    final static ReceivedTextRecord readSessionTextRecord(boolean useTextTemplate, int headerFlagMask) {
        boolean headerFlagSetSnapshot = false;
        int hasAlternateNameIntSnapshot = 0;
        int[] referencedTemplateIdsSnapshot = null;
        Throwable caughtTemplateFailure = null;
        int recordHeaderByte = 0;
        int hasAlternateNameInt = 0;
        int textTemplateId = 0;
        Exception templateFailureForReport = null;
        int clientControlFlowGuard = 0;
        PacketBuffer packet = null;
        TextTemplateDefinition textTemplate = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        packet = LogoCompositor.sessionPacketBuffer;
        recordHeaderByte = packet.readUnsignedByte((byte) 34);
        StrongCacheReference.receivedTextRecordKind = recordHeaderByte & 127;
        headerFlagSetSnapshot = !((headerFlagMask & recordHeaderByte) == 0);
        ReceivedTextRecord.receivedRecordHeaderFlagSet = headerFlagSetSnapshot;
        ArchiveIndex.receivedRecordMetadataByte = packet.readUnsignedByte((byte) 34);
        DiskCacheWorker.receivedRecordLongId = packet.readLongBE(2901);
        if (StrongCacheReference.receivedTextRecordKind != 2) {
          UsernameAvailabilityValidator.receivedRecordIdLow24 = 0;
          LoginUiSupport.receivedRecordIdHigh16 = 0;
        } else {
          LoginUiSupport.receivedRecordIdHigh16 = packet.readUnsignedShortBE(true);
          UsernameAvailabilityValidator.receivedRecordIdLow24 = packet.readUnsignedMediumBE(105);
        }
        hasAlternateNameIntSnapshot = (packet.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
        hasAlternateNameInt = hasAlternateNameIntSnapshot;
        FrameTimer.receivedRecordPrimaryName = packet.readNullTerminatedText((byte) 117);
        if (hasAlternateNameInt == 0) {
          AvatarFeedbackSupport.receivedRecordDisplayName = FrameTimer.receivedRecordPrimaryName;
        } else {
          AvatarFeedbackSupport.receivedRecordDisplayName = packet.readNullTerminatedText((byte) 124);
        }
        if (StrongCacheReference.receivedTextRecordKind == 1) {
          packet.readUnsignedShortBE(true);
          packet.readNullTerminatedText((byte) 112);
        } else {
          if (StrongCacheReference.receivedTextRecordKind == 4) {
            packet.readUnsignedShortBE(true);
            packet.readNullTerminatedText((byte) 112);
          }
        }
        if (!useTextTemplate) {
          RankedListQuery.receivedRecordText = PrefixCodeDecoder.readCompressedText(packet, 0, 80);
          SessionTextState.receivedTextTemplateReferences = null;
          return new ReceivedTextRecord(useTextTemplate);
        }
        textTemplateId = packet.readUnsignedShortBE(true);
        try {
          textTemplate = StatefulWidgetRenderer.field_r.getDefinition((byte) -14, textTemplateId);
          RankedListQuery.receivedRecordText = textTemplate.summarizeLiteralSegments((byte) -69);
          if (!AvatarFeedbackSupport.receivedRecordDisplayName.equals(SecondaryDeque.receivedSessionName)) {
            referencedTemplateIdsSnapshot = textTemplate.referencedTemplateIds;
          } else {
            referencedTemplateIdsSnapshot = null;
          }
          SessionTextState.receivedTextTemplateReferences = referencedTemplateIdsSnapshot;
        } catch (java.lang.Exception templateFailure) {
          caughtTemplateFailure = templateFailure;
          templateFailureForReport = (Exception) (Object) caughtTemplateFailure;
          IterableNodeHashTable.reportClientError((Throwable) ((Object) templateFailureForReport), "CC1", (byte) 125);
          SessionTextState.receivedTextTemplateReferences = null;
          RankedListQuery.receivedRecordText = null;
          return new ReceivedTextRecord(useTextTemplate);
        }
        return new ReceivedTextRecord(useTextTemplate);
    }

    static {
        boardOwnershipRaster = new Sprite(640, 640);
        loginUsernameText = "Username: ";
    }
}
