/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke {
    static int field_b;
    static pi field_f;
    static UiComponent field_j;
    static BitmapFont field_h;
    static String field_k;
    static String field_d;
    static String field_e;
    static ra field_g;
    static String field_a;
    static String field_c;
    static Sprite[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int[] array$1 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          array$1 = new int[TranslatedUiText.field_e.colorPalettes[0].length];
          TranslatedUiText.field_e.colorPalettes[param1] = array$1;
          TranslatedUiText.field_e.colorPalettes[param1][PasswordValidator.field_s] = param0;
          TranslatedUiText.field_e.colorPalettes[param1][rj.field_F] = param3;
          TranslatedUiText.field_e.colorPalettes[param1][wm.field_Q[0]] = param4;
          if (param2 != -17895) {
            ke.formatCookieDate(92, -5L);
          }
          for (var5_int = 1; wm.field_Q.length > var5_int; var5_int++) {
            TranslatedUiText.field_e.colorPalettes[param1][wm.field_Q[var5_int]] = ui.a(TranslatedUiText.field_e.colorPalettes[param1][wm.field_Q[var5_int - 1]], false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "ke.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String formatCookieDate(int param0, long param1) {
        int var9 = 0;
        int var9Lifetime1;
        DisplayNamePanel.field_U.setTime(new Date(param1));
        int var3 = DisplayNamePanel.field_U.get(7);
        int var4 = DisplayNamePanel.field_U.get(5);
        int var5 = DisplayNamePanel.field_U.get(2);
        int var6 = DisplayNamePanel.field_U.get(1);
        int var7 = DisplayNamePanel.field_U.get(11);
        int var8 = DisplayNamePanel.field_U.get(12);
        if (param0 == -29971) {
          var9 = DisplayNamePanel.field_U.get(13);
          return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + EmailValidator.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        field_b = -87;
        var9Lifetime1 = DisplayNamePanel.field_U.get(13);
        return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + EmailValidator.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9Lifetime1 / 10 + var9Lifetime1 % 10 + " GMT";
    }

    public static void releaseStatics(boolean param0) {
        field_i = null;
        field_c = null;
        if (!param0) {
          field_h = null;
          field_f = null;
          field_j = null;
          field_k = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = new pi(0);
        field_d = "Accept invitation to <%0>'s game";
        field_k = "There are no valid types of game that match your preferences.";
        field_c = "Concluded";
        field_e = "Played";
        field_a = "Inviting <%0>";
    }
}
