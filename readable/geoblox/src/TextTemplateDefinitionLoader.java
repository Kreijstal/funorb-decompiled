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
        byte[] var5 = null;
        TextTemplateDefinition var3 = (TextTemplateDefinition) (this.definitionsCache.a((byte) 106, (long)templateId));
        if (var3 == null) {
            int var4 = 3 % ((methodGuard - 57) / 42);
            if (templateId < 32768) {
                var5 = this.primaryArchive.getFile(1, -28153, templateId);
            } else {
                var5 = this.alternateArchive.getFile(1, -28153, 32767 & templateId);
            }
            var3 = new TextTemplateDefinition();
            if (!(var5 == null)) {
                var3.decode(0, new ByteArrayBuffer(var5));
            }
            if (!(templateId < 32768)) {
                var3.markAlternateReferences((byte) 119);
            }
            this.definitionsCache.a(-126, (long)templateId, var3);
            return var3;
        }
        return var3;
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
          var4 = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.field_g.firstForIteration(param1 ^ param1));
          while (var4 != null) {
            DiskArchiveRequest.a(param0, var4, param1 - 21718);
            var4 = (CrcAcknowledgedPacket) ((Object) DirectByteStorage.field_g.nextForIteration(1));
          }
          var2 = PrefixCodeDecoder.field_e.firstForIteration(0);
          while (var2 != null) {
            gf.a(param0, 125);
            var2 = PrefixCodeDecoder.field_e.nextForIteration(1);
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
