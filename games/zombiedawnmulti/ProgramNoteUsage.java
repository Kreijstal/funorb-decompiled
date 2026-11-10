/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgramNoteUsage extends IntrusiveNode {
    static String field_i;
    static String field_f;
    static String field_m;
    static Sprite field_j;
    static String field_l;
    byte[] field_h;
    static int field_g;
    static String field_k;

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 == 360) {
          field_f = null;
          field_l = null;
          field_i = null;
          field_k = null;
          field_m = null;
          return;
        }
        ProgramNoteUsage.drawChatComposerOverlay(false, (byte) 79);
        field_f = null;
        field_l = null;
        field_i = null;
        field_k = null;
        field_m = null;
    }

    final static void drawChatComposerOverlay(boolean param0, byte param1) {
        PacketBuffer.drawChatComposerAndTooltip((byte) 122, param0);
        if (param1 < 97) {
          field_l = (String) null;
        }
    }

    ProgramNoteUsage(byte[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Who can join";
        field_l = "Macroing or use of bots";
        field_g = 360;
        field_k = null;
        field_i = "Add name";
        field_m = "You are on <%0>";
    }
}
