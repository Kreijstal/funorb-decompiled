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

    final static int a(int param0, int param1, boolean param2, byte param3) {
        int var4 = -21 / ((param3 - 8) / 34);
        return DequeCursor.a(-1);
    }

    public static void a(int param0) {
        rankedEntryKeyOne = null;
        createDisplayNameHintText = null;
        if (param0 != 0) {
            ClientProtocolStage.a(103, 65, true, (byte) -104);
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
