/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerRecordProtocolSupport {
    static String tabHidechattemporarily;
    static SpaceObject[] field_f;
    static String muChatGameShowAll;
    static String createtouse;
    static AccountProtocolStage field_e;
    static int[][] field_b;

    public static void releaseStatics(boolean param0) {
        field_e = null;
        muChatGameShowAll = null;
        if (!param0) {
          tabHidechattemporarily = null;
          createtouse = null;
          field_b = (int[][]) null;
          field_f = null;
          return;
        }
        IntegerRecordProtocolSupport.releaseStatics(false);
        tabHidechattemporarily = null;
        createtouse = null;
        field_b = (int[][]) null;
        field_f = null;
    }

    final static void hideLoginRequiredPrompt(byte obfuscationGuard) {
        LoginPayload.field_b = false;
        if (obfuscationGuard != -108) {
          IntegerRecordProtocolSupport.hideLoginRequiredPrompt((byte) -36);
        }
    }

    final static void sendIntegerRecordSubmission(int opcode, IntegerRecordSubmission submission, int obfuscationGuard) {
        CipherPacketBuffer var5 = JaggrabDownloader.field_j;
        var5.writeCipheredOpcode(false, opcode);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.writeByte(1, false);
        var5.writeByte(submission.field_t, false);
        var5.writeSignedSmart(-128, submission.field_l);
        var5.writeInt(true, submission.field_u);
        var5.writeInt(true, submission.field_m);
        var5.writeInt(true, submission.field_s);
        var5.writeInt(true, submission.field_p);
        var5.appendChecksum(-1, var4);
        if (obfuscationGuard > -23) {
          return;
        }
        try {
          var5.writeByteLengthPrefix(var5.position - var4, true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ra.A(" + opcode + ',' + (submission != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        muChatGameShowAll = "Show all game chat";
        tabHidechattemporarily = "TAB - hide chat temporarily";
        createtouse = "Create a free account to start using this feature";
        field_e = new AccountProtocolStage();
    }
}
