/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextPairLoginPayload extends LoginPayload {
    static int field_h;
    static boolean[][] field_j;
    static int field_l;
    static String tutorialNineBallStartPlaceCueball;
    static PlayingSound[] field_g;
    private String base38Text;
    static int field_i;
    private String loginText;

    public static void releaseStatics(int param0) {
        if (param0 == 17518) {
          field_j = (boolean[][]) null;
          tutorialNineBallStartPlaceCueball = null;
          field_g = null;
          return;
        }
        TextPairLoginPayload.releaseStatics(8);
        field_j = (boolean[][]) null;
        tutorialNineBallStartPlaceCueball = null;
        field_g = null;
    }

    final LoginPayloadKind payloadKind(byte param0) {
        int var2 = -73 % ((param0 + 54) / 43);
        return DiskArchiveRequest.field_L;
    }

    final void writePayload(byte param0, PacketBuffer param1) {
        try {
          int var3_int = -92 / ((22 - param0) / 51);
          param1.writeNullCircumfixedString(false, this.loginText);
          param1.writeBase38Name(this.base38Text, 109);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TextPairLoginPayload(String param0, String param1) {
        try {
          this.base38Text = param1;
          this.loginText = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 128;
        tutorialNineBallStartPlaceCueball = "The objective of nine-ball pool is to legally \"pot\" the 9 ball. Before we get to that, we \"break\", but the first thing you might want to do is <u=ffffff>move the cue ball</u>. <col=99ff99>Hold</col> down the <img=0> <col=99ff99>left mouse button over the cue ball and drag</col> it to where you would like to place it.";
        field_i = -1;
        field_g = new PlayingSound[2];
    }
}
