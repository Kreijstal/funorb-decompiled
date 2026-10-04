/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateDefinitionLoader {
    static int releasedInDifficultyStep;
    static String createText;
    static int field_a;
    private WeightedObjectCache definitionsCache;
    static IntrusiveDeque field_e;
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
            if (!(encodedDefinition == null)) {
                definition.decode(0, new ByteArrayBuffer(encodedDefinition));
            }
            if (!(templateId < 32768)) {
                definition.markAlternateReferences((byte) 119);
            }
            this.definitionsCache.put(-126, (long)templateId, definition);
            return definition;
        }
        return definition;
    }

    public static void a(byte param0) {
        int var1 = 52 / ((25 - param0) / 54);
        field_e = null;
        createText = null;
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        CrcAcknowledgedPacket var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          var4 = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.firstForIteration(param1 ^ param1));
          while (var4 != null) {
            DiskArchiveRequest.a(param0, var4, param1 - 21718);
            var4 = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.pendingCrcAcknowledgements.nextForIteration(1));
          }
          var2 = PrefixCodeDecoder.pendingFifoAcknowledgements.firstForIteration(0);
          while (var2 != null) {
            EntityCollisionSupport.writeOpcodeWithOneZeroPayload(param0, 125);
            var2 = PrefixCodeDecoder.pendingFifoAcknowledgements.nextForIteration(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2_ref), "di.B(" + param0 + ',' + param1 + ')');
        }
    }

    private TextTemplateDefinitionLoader() throws Throwable {
        throw new Error();
    }

    static {
        field_a = 0;
        createText = "Create";
    }
}
