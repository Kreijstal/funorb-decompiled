/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementProtocolSupport {
    static int keycodeDefaultUp1;
    static IntegerSyntaxSupport field_d;
    static int field_c;
    static String createAlertNamelength;
    static int[] field_e;

    public static void releaseStatics(int param0) {
        createAlertNamelength = null;
        field_e = null;
        if (param0 != 63) {
          return;
        }
        field_d = null;
    }

    final static void setUnknownQuickChatPhrase(byte obfuscationGuard, QuickChatCategoryDefinition category) {
        try {
          category.phraseShortcuts = new char[]{(char)63};
          if (obfuscationGuard < 9) {
            field_d = (IntegerSyntaxSupport) null;
          }
          category.phraseIds = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gp.C(" + obfuscationGuard + ',' + (category != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendAchievementSubmission(int opcode, AchievementSubmission submission, int obfuscationGuard) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = JaggrabDownloader.field_j;
          var6.writeCipheredOpcode(false, opcode);
          var6.position = var6.position + 1;
          if (obfuscationGuard != -6725) {
            AchievementSubmission var5 = (AchievementSubmission) null;
            AchievementProtocolSupport.sendAchievementSubmission(80, (AchievementSubmission) null, -101);
          }
          var4 = var6.position;
          var6.writeByte(1, false);
          var6.writeByte(submission.field_r, false);
          var6.writeByte(submission.field_n, false);
          var6.writeInt(true, submission.field_p);
          var6.writeInt(true, submission.field_s);
          var6.writeInt(true, submission.field_t);
          var6.writeInt(true, submission.field_q);
          var6.appendChecksum(-1, var4);
          var6.writeByteLengthPrefix(-var4 + var6.position, true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gp.B(" + opcode + ',' + (submission != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        keycodeDefaultUp1 = 33;
        createAlertNamelength = "Names should contain a maximum of 12 characters";
        field_d = new IntegerSyntaxSupport();
    }
}
