/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextValidationFailure {
    static int field_d;
    static CipherPacketBuffer field_a;
    static AlignedIconLabel[][] field_b;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_b = (AlignedIconLabel[][]) null;
        field_a = null;
        field_c = null;
        if (param0 != 64) {
          TextValidationFailure.releaseStatics(-89);
        }
    }

    final static void initializeSocialLists(UiComponent param0, UiComponent param1, boolean param2) {
        if (param0.field_Cb == null) {
          param0.field_Cb = new IntrusiveDeque();
        }
        if (null == param1.field_Cb) {
          param1.field_Cb = new IntrusiveDeque();
        }
        if (InstructionsScreen.field_o == null) {
          InstructionsScreen.field_o = new DualLinkNodeHashTable(64);
        }
        if (null == ChatAndOptionHelpers.field_f) {
          ChatAndOptionHelpers.field_f = new DualLinkNodeHashTable(64);
        }
        if (!param2) {
          return;
        }
        try {
          ReportDialogGlobals.field_d = param1.field_Cb;
          LocalGameWorld.field_M = param0.field_Cb;
          UiWidget.resetLobbyLists(-8328);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Show chat (1 unread message)";
    }
}
