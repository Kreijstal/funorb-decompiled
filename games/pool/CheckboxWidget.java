/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends ButtonWidget {
    static String createEmailTooltip;
    static long field_S;
    static String connectingToFriendServerTwoline;
    static UiComponent field_P;
    static String orbcoinsColon;
    static DiskCacheWorker field_U;
    static String field_N;
    static String rule03;

    public static void releaseStatics(int param0) {
        if (param0 > 65) {
          field_U = null;
          connectingToFriendServerTwoline = null;
          orbcoinsColon = null;
          rule03 = null;
          field_P = null;
          createEmailTooltip = null;
          field_N = null;
          return;
        }
    }

    private CheckboxWidget(String param0, WidgetListener param1) {
        this(param0, VerticalScrollbar.field_Sb.field_l, param1);
        try {
          this.renderer = VerticalScrollbar.field_Sb.field_o;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void activateButton(int param0, int param1, int param2, int param3) {
        if (param0 == 16) {
          this.active = !this.active ? true : false;
          super.activateButton(param0 + 0, param1, param2, param3);
          return;
        }
        this.activateButton(126, 56, 57, 116);
        this.active = !this.active ? true : false;
        super.activateButton(param0 + 0, param1, param2, param3);
    }

    private CheckboxWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = VerticalScrollbar.field_Sb.field_o;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    CheckboxWidget(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.active = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        createEmailTooltip = "Your email address is used to identify this account";
        connectingToFriendServerTwoline = "Connecting to<br>friend server...";
        orbcoinsColon = "Orb coins: ";
        rule03 = "Macroing or use of bots";
    }
}
