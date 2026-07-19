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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = m.a(param1, (byte) -89);
        var4 = nb.a(-117, param1);
        var5 = m.a(param2, (byte) -125);
        var6 = nb.a(-60, param2);
        if (param0) {
          return (int[]) null;
        } else {
          var7 = (int)((long)var5 * (long)var3 >> 1821388688);
          var8 = (int)((long)var6 * (long)var3 >> -1422335856);
          var9 = (int)((long)var4 * (long)var5 >> -1873163888);
          var10 = (int)((long)var4 * (long)var6 >> 2049016272);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    static {
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
