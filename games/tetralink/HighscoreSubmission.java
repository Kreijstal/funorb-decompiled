/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreSubmission extends IntrusiveNode {
    static String field_p;
    static String field_o;
    static UiComponent field_r;
    int field_q;
    static String field_n;

    private HighscoreSubmission() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        if (param0 != -11961) {
          return;
        }
        field_r = null;
        field_o = null;
        field_n = null;
    }

    final static void computeCaptionColumnWidth(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 > 0) {
          field_p = (String) null;
          ReportAbuseDialog.field_Rb = SocialTabsPanel.field_b.textWidth(MenuLabelGlobals.field_c[14]);
          var1 = SocialTabsPanel.field_b.textWidth(MenuLabelGlobals.field_c[15]);
          if (ReportAbuseDialog.field_Rb < var1) {
            ReportAbuseDialog.field_Rb = var1;
            return;
          }
          return;
        }
        ReportAbuseDialog.field_Rb = SocialTabsPanel.field_b.textWidth(MenuLabelGlobals.field_c[14]);
        var1Lifetime1 = SocialTabsPanel.field_b.textWidth(MenuLabelGlobals.field_c[15]);
        if (ReportAbuseDialog.field_Rb >= var1Lifetime1) {
          return;
        }
        ReportAbuseDialog.field_Rb = var1Lifetime1;
    }

    static {
        field_o = "<%0> has not yet unlocked this option for use.";
        field_n = "Click";
        field_p = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
