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
                LogoPreparationSupport.readSessionSnapshot(true, -54);
            }
            MatchCandidateSupport.prepareFinalFrameSlices(-21541, logoArchive);
            FullscreenSupport.prepareMeshSpecularResponse((byte) -91);
            MidiNoteMixer.prepareLogoGlowRaster((byte) -32);
            DequeCursor.logoAnimationTick = -DiskCacheWorker.logoStartDelayTicks + 0;
        } catch (RuntimeException logoPreparationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) logoPreparationFailure), "bk.B(" + (logoArchive != null ? "{...}" : "null") + ',' + startDelayMillis + ',' + methodGuard + ',' + (unusedPcmMixer != null ? "{...}" : "null") + ')');
        }
    }

    final static ClientSessionSnapshot readSessionSnapshot(boolean useTextTemplate, int headerFlagMask) {
        boolean headerFlagSetSnapshot = false;
        int hasAlternateNameIntSnapshot = 0;
        int[] referencedTemplateIdsSnapshot = null;
        Throwable caughtTemplateFailure = null;
        int snapshotHeaderByte = 0;
        int hasAlternateNameInt = 0;
        int textTemplateId = 0;
        Exception templateFailureForReport = null;
        int clientControlFlowGuard = 0;
        PacketBuffer packet = null;
        TextTemplateDefinition textTemplate = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        packet = LogoCompositor.sessionPacketBuffer;
        snapshotHeaderByte = packet.readUnsignedByte((byte) 34);
        StrongCacheReference.field_u = snapshotHeaderByte & 127;
        headerFlagSetSnapshot = !((headerFlagMask & snapshotHeaderByte) == 0);
        ClientSessionSnapshot.field_l = headerFlagSetSnapshot;
        ArchiveIndex.field_s = packet.readUnsignedByte((byte) 34);
        DiskCacheWorker.field_c = packet.readLongBE(2901);
        if (StrongCacheReference.field_u != 2) {
          UsernameAvailabilityValidator.field_o = 0;
          LoginUiSupport.field_b = 0;
        } else {
          LoginUiSupport.field_b = packet.readUnsignedShortBE(true);
          UsernameAvailabilityValidator.field_o = packet.readUnsignedMediumBE(105);
        }
        hasAlternateNameIntSnapshot = (packet.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
        hasAlternateNameInt = hasAlternateNameIntSnapshot;
        FrameTimer.field_a = packet.readNullTerminatedText((byte) 117);
        if (hasAlternateNameInt == 0) {
          AvatarFeedbackSupport.field_b = FrameTimer.field_a;
        } else {
          AvatarFeedbackSupport.field_b = packet.readNullTerminatedText((byte) 124);
        }
        if (StrongCacheReference.field_u == 1) {
          packet.readUnsignedShortBE(true);
          packet.readNullTerminatedText((byte) 112);
        } else {
          if (StrongCacheReference.field_u == 4) {
            packet.readUnsignedShortBE(true);
            packet.readNullTerminatedText((byte) 112);
          }
        }
        if (!useTextTemplate) {
          RankedListQuery.field_f = PrefixCodeDecoder.readCompressedText(packet, 0, 80);
          SessionTextState.receivedTextTemplateReferences = null;
          return new ClientSessionSnapshot(useTextTemplate);
        }
        textTemplateId = packet.readUnsignedShortBE(true);
        try {
          textTemplate = StatefulWidgetRenderer.field_r.getDefinition((byte) -14, textTemplateId);
          RankedListQuery.field_f = textTemplate.summarizeLiteralSegments((byte) -69);
          if (!AvatarFeedbackSupport.field_b.equals(SecondaryDeque.field_f)) {
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
          RankedListQuery.field_f = null;
          return new ClientSessionSnapshot(useTextTemplate);
        }
        return new ClientSessionSnapshot(useTextTemplate);
    }

    static {
        boardOwnershipRaster = new Sprite(640, 640);
        loginUsernameText = "Username: ";
    }
}
