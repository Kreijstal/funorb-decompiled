/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MeshBase {
    static int field_c;
    static int field_d;
    static String ratingDrawn;
    private static int field_b;
    static boolean field_e;

    final static void resendByteRecordOperations(int obfuscationGuard, int opcode) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ByteRecordSubmission var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pool.field_O;
        try {
          var4 = (ByteRecordSubmission) (ArchiveLoadStep.field_c.last((byte) 65));
          while (var4 != null) {
            DelayedServerPacket.sendByteRecordSubmission(98, var4, opcode);
            var4 = (ByteRecordSubmission) (ArchiveLoadStep.field_c.previous((byte) -5));
          }
          if (obfuscationGuard != 10) {
            field_e = false;
          }
          var2 = LoginTextValue.field_f.last((byte) -34);
          while (var2 != null) {
            DirectByteStorage.sendByteRecordQuery(1, opcode);
            var2 = LoginTextValue.field_f.previous((byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "um.T(" + obfuscationGuard + ',' + opcode + ')');
        }
    }

    public static void releaseStatics(int param0) {
        ratingDrawn = null;
        if (param0 <= 107) {
          MeshBase.releaseStatics(-2);
        }
    }

    static {
        field_b = 10;
        field_c = 1 << field_b;
        ratingDrawn = "Drawn";
    }
}
