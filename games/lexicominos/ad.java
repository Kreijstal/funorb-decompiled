/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ad {
    static Calendar field_b;
    static String[] field_a;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -108) {
            ad.a((byte) 70);
        }
    }

    final static int[] a(boolean param0, int param1, int param2) {
        int var3 = m.a(param1, (byte) -89);
        int var4 = nb.a(-117, param1);
        int var5 = m.a(param2, (byte) -125);
        int var6 = nb.a(-60, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
