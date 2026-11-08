/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenSupport {
    static String field_c;
    static String field_a;
    static String field_d;
    static String field_b;
    static PacketBuffer field_e;

    final static boolean isPowerOfTwo(byte param0, int param1) {
        if (param0 == -56) {
          return param1 == (-param1 & param1) ? true : false;
        }
        field_d = (String) null;
        return param1 == (-param1 & param1) ? true : false;
    }

    final static void exitFullscreen(byte param0) {
        if (FullscreenState.field_b == null) {
          return;
        }
        AccountCreationSupport.attachCanvasInput((byte) -67, FullscreenState.field_b);
        FullscreenState.field_b.closeFrame(109, MusicPlaybackHelpers.field_c);
        FullscreenState.field_b = null;
        if (null != AgeValidator.field_q) {
          AgeValidator.field_q.restoreWindowedSize((byte) -122);
        }
        UiWidget.field_v.requestFocus();
        if (param0 == -16) {
          return;
        }
        FullscreenSupport.isPowerOfTwo((byte) -28, 121);
    }

    public static void releaseStatics(byte param0) {
        int var1 = 106 % ((51 - param0) / 33);
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_c = "Unable to delete friend - system busy";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_d = "You appear to be telling someone your password - please don't!";
        field_b = "OFF";
    }
}
