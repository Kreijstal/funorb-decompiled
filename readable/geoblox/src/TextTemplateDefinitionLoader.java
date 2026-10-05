/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateDefinitionLoader {
    static int releasedInDifficultyStep;
    static String createText;
    static int menuPointerPressDebounceTicks;
    private WeightedObjectCache definitionsCache;
    static IntrusiveDeque secondarySocialEntriesInOrder;
    private ResourceArchive primaryArchive;
    private ResourceArchive alternateArchive;

    final TextTemplateDefinition getDefinition(byte methodGuard, int templateId) {
        byte[] encodedDefinition = null;
        TextTemplateDefinition definition = (TextTemplateDefinition) (this.definitionsCache.getByKey((byte) 106, (long)templateId));
        if (definition == null) {
            int guardResidue = 3 % ((methodGuard - 57) / 42);
            if (templateId < 32768) {
                encodedDefinition = this.primaryArchive.getFile(1, -28153, templateId);
            } else {
                encodedDefinition = this.alternateArchive.getFile(1, -28153, 32767 & templateId);
            }
            definition = new TextTemplateDefinition();
            if (encodedDefinition != null) {
                definition.decode(0, new ByteArrayBuffer(encodedDefinition));
            }
            if (templateId >= 32768) {
                definition.markAlternateReferences((byte) 119);
            }
            this.definitionsCache.put(-126, (long)templateId, definition);
            return definition;
        }
        return definition;
    }

    public static void releaseStaticReferences(byte methodGuard) {
        int guardQuotient = 52 / ((25 - methodGuard) / 54);
        secondarySocialEntriesInOrder = null;
        createText = null;
    }

    final static void sendPendingAcknowledgementPackets(int opcode, int methodGuard) {
        IntrusiveNode fifoAcknowledgement = null;
        int unusedClientControlSnapshot = 0;
        CrcAcknowledgedPacket crcAcknowledgement = null;
        RuntimeException caughtSendFailure = null;
        RuntimeException sendFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          crcAcknowledgement = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.firstForIteration(methodGuard ^ methodGuard));
          while (crcAcknowledgement != null) {
            DiskArchiveRequest.writeCrcAcknowledgementPacket(opcode, crcAcknowledgement, methodGuard - 21718);
            crcAcknowledgement = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.nextForIteration(1));
          }
          fifoAcknowledgement = PrefixCodeDecoder.pendingFifoAcknowledgements.firstForIteration(0);
          while (fifoAcknowledgement != null) {
            EntityCollisionSupport.writeOpcodeWithOneZeroPayload(opcode, 125);
            fifoAcknowledgement = PrefixCodeDecoder.pendingFifoAcknowledgements.nextForIteration(1);
          }
          return;
        } catch (java.lang.RuntimeException sendFailure) {
          caughtSendFailure = sendFailure;
          sendFailureForContext = caughtSendFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) sendFailureForContext), "di.B(" + opcode + ',' + methodGuard + ')');
        }
    }

    private TextTemplateDefinitionLoader() throws Throwable {
        throw new Error();
    }

    static {
        menuPointerPressDebounceTicks = 0;
        createText = "Create";
    }
}
