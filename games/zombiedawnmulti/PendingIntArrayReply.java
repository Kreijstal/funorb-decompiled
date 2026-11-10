/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingIntArrayReply extends IntrusiveNode {
    static ResourceArchive field_l;
    int[] field_h;
    static String field_i;
    static int[] field_n;
    static MusicCrossfadeStream field_m;
    static String field_g;
    static BirthDateEntryPanel field_f;
    static UiComponent field_j;
    boolean field_k;
    static UiTheme field_o;

    final static void renderLoadingScreen(java.awt.Canvas param0, int param1) {
        if (param1 > -82) {
          return;
        }
        try {
          if (11 == LoginSuccessHelpers.field_b) {
            ScoreUpdateEvent.emptyStaticHook(-29956);
          }
          TertiaryLinkDeque.showLoadingProgress(PopupMenuBuilder.field_p, (byte) -100, ArchiveLoadSequence.field_i, SimArmedHuman.field_Bb);
          ByteStorage.drawRasterToCanvas(false, 0, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ra.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void setSessionCookie(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            TextInputValidator.field_p = param2;
            if (param1 > -29) {
              field_o = (UiTheme) null;
            }
            try {
              var3 = param0.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (0 == param2.length()) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              JavaScriptBridge.evaluateScript(param0, 14575, "document.cookie=\"" + var5Lifetime4 + "\"");
            } catch (Throwable throwable) {
            }
            ClientShellHelpers.updatePageLinks(14158, param0);
          } catch (RuntimeException runtimeException) {
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ra.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_f = null;
        field_n = null;
        field_m = null;
        field_l = null;
        field_o = null;
        field_i = null;
        field_j = null;
        if (!param0) {
          String var2 = (String) null;
          PendingIntArrayReply.setSessionCookie((java.applet.Applet) null, 1, (String) null);
        }
    }

    PendingIntArrayReply() {
        this.field_k = false;
    }

    static {
        field_n = new int[]{1, 2, 3, 5, 2, 5, 5, 5, 5, 5, 2, 3, 5, 1, 5, 5, 3};
        field_g = "<%0>/<%1>";
        field_i = "Quit";
    }
}
