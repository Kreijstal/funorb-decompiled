/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffectInstance extends IntrusiveNode {
    static LoginDialog field_i;
    static String field_h;
    static boolean field_n;
    static String field_j;
    static boolean[] field_l;
    static String field_k;
    PcmSampleStream field_m;
    static int field_g;
    static String field_f;

    final static SocketConnector createProxyConnector(byte param0, int param1, String param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_f = (String) null;
          }
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).port = param1;
          ((SocketConnector) ((Object) var3)).host = param2;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -6298) {
          field_h = null;
          field_k = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        }
        field_i = (LoginDialog) null;
        field_h = null;
        field_k = null;
        field_l = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void drawDialogLayer(boolean param0, int param1) {
        DialogLayerHolder.field_a.renderWidgetPassesAndTooltip(39, 0, 0);
        if (param1 >= -109) {
          String var3 = (String) null;
          SoundEffectInstance.createProxyConnector((byte) 68, -37, (String) null);
        }
    }

    SoundEffectInstance(int param0) {
        if (FadingDialog.field_H) {
          this.field_m = PcmSampleStream.createAtRatePercent(LayoutCenterHelpers.field_a[param0], 100, 256);
          AccountCreationDialog.playStream(this.field_m, (byte) -93);
        }
        if (93 == param0) {
        }
    }

    static {
        field_h = "to return to the normal view.";
        field_k = "Show all lobby chat";
        field_n = false;
        field_j = "Get extra bang for your buck - or, in this case, extra zombie for your brain - with more zombies at the start of each match.";
        field_l = new boolean[64];
        field_f = "Spectate <%0>'s game";
    }
}
