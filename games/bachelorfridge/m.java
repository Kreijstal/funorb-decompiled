/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class m {
    static String field_c;
    static Random field_a;
    static je field_b;

    final static int a(int param0, byte param1, int param2) {
        String var3 = lka.field_E[param0][param2];
        var3 = var3.trim();
        int var4 = -84 % ((-28 - param1) / 46);
        var3 = var3.toLowerCase();
        if (!(!var3.equals("anything"))) {
            return -1;
        }
        return ((ji) ((Object) cw.field_zb.a(true, (long)var3.hashCode()))).field_h;
    }

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 67) {
            discarded$0 = m.a(65, (byte) -106, 41);
        }
    }

    static {
        field_c = "***Disarmed!***";
        field_a = new Random();
    }
}
