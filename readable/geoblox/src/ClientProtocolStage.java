/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ClientProtocolStage {
    static Random field_d;
    static String createDisplayNameHintText;
    static int keyStateReadIndex;
    static int[] rankedEntryKeyOne;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int pollAccountUiAction(int unusedLanguageId, int unusedWheelRotation, boolean unusedFullscreenActive, byte methodGuard) {
        int guardResidue = -21 / ((methodGuard - 8) / 34);
        return DequeCursor.pollAccountDialogAction(-1);
    }

    public static void a(int param0) {
        rankedEntryKeyOne = null;
        createDisplayNameHintText = null;
        if (param0 != 0) {
            ClientProtocolStage.pollAccountUiAction(103, 65, true, (byte) -104);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean isPostRequestStage(boolean checkEnabled) {
        if (!checkEnabled) {
            return true;
        }
        if (this == ClientOptionSupport.awaitingLoginResultStage) {
            return true;
        }
        if (ClientOptionSupport.awaitingLoginDetailsStage == this) {
            return true;
        }
        if (LogoCompositor.connectedSessionStage != this) {
            return false;
        }
        return true;
    }

    static {
        field_d = new Random();
        createDisplayNameHintText = "Player names can be up to 12 letters, numbers and underscores";
        keyStateReadIndex = 0;
    }
}
