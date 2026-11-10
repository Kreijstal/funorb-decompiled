/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspot extends IntrusiveNode {
    int field_k;
    int field_f;
    static String field_o;
    int field_n;
    int field_l;
    static LoginMethod field_h;
    static Sprite[] field_g;
    TextHotspot field_i;
    static String field_p;
    int field_j;
    static String field_m;

    final static String joinCharSequences(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 2) {
            field_h = (LoginMethod) null;
          }
          stackIn_3_0 = Js5ArchiveManager.joinCharSequenceRange(param0, 0, 4, param0.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wi.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_m = null;
        field_h = null;
        field_p = null;
        if (param0 == 0) {
          field_g = null;
          return;
        }
        field_m = (String) null;
        field_g = null;
    }

    final static void showQuickChatMenu(byte param0, QuickChatMenu param1) {
        if (param1 == null) {
          return;
        }
        try {
          ScrollBar.field_Ib = param1;
          PlayerProfile.field_l.field_Cb.clear(-30986);
          PlayerProfile.field_l.addChild((byte) 50, ScrollBar.field_Ib);
          LobbyScreenHelpers.field_b = true;
          if (param0 != 4) {
            TextHotspot.releaseStatics(-50);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TextHotspot(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param2;
        this.field_j = param3;
        this.field_n = param4;
        this.field_l = param0;
        this.field_k = param1;
    }

    static {
        field_o = "Time elapsed: <%0>";
        field_p = "Mastery of technology is not far away.";
        field_m = "Quake";
        field_h = new LoginMethod("");
    }
}
