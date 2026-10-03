/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ClientProtocolStage {
    static Random field_d;
    static String createDisplayNameHintText;
    static int keyStateReadIndex;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, boolean param2, byte param3) {
        int var4 = -21 / ((param3 - 8) / 34);
        return DequeCursor.a(-1);
    }

    public static void a(int param0) {
        field_a = null;
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
        if (this == da.awaitingLoginResultStage) {
            return true;
        }
        if (da.awaitingLoginDetailsStage == this) {
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
