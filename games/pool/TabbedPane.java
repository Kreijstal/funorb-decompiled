/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TabbedPane extends UiComponent {
    static volatile boolean field_Sb;
    static int[] field_Qb;
    int selectedTab;
    private UiComponent[] panels;
    private UiComponent[] tabButtons;
    static ph field_Lb;
    static String loginm3;
    static String fullscreen;
    private UiComponent body;
    static DialogLayer field_Ub;

    private final void layoutTabs(byte param0, int param1, int param2) {
        UiComponent dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = Pool.field_O;
        for (var4 = 0; this.tabButtons.length > var4; var4++) {
          var5 = var4 * this.width / this.tabButtons.length;
          var6 = this.width * (var4 + 1) / this.tabButtons.length;
          this.tabButtons[var4].localX = var5;
          this.tabButtons[var4].localY = 0;
          this.tabButtons[var4].width = var6 - var5;
          this.tabButtons[var4].height = param2;
        }
        this.body.setBounds(param2, 2147483647, 0, this.width, this.height - param2);
        if (param0 > -99) {
          loginm3 = (String) null;
        }
        var8 = 0;
        var4Lifetime1 = var8;
        while (this.panels.length > var8) {
          this.panels[var8].setBounds(param1, 2147483647, param1, -(param1 * 2) + this.body.width, -(param1 * 2) + this.body.height);
          if (var8 != this.selectedTab) {
            dupTemp$0 = this.panels[var8];
            dupTemp$0.localX = dupTemp$0.localX + 10000;
          }
          var8++;
        }
    }

    public static void releaseStatics(int param0) {
        field_Lb = null;
        fullscreen = null;
        loginm3 = null;
        if (param0 != -1) {
          loginm3 = (String) null;
        }
        field_Qb = null;
        field_Ub = null;
    }

    final static String b(int param0, int param1) {
        if (param1 <= 51) {
          return (String) null;
        }
        return ((param0 & MarkerSliderPainter.field_j) == 0 ? "" : "cont vis|") + ((ThemeSelectScreen.field_O & param0) == 0 ? "" : "gv visit+1|") + ((OptionsScreen.field_I & param0) == 0 ? "" : "gv shot+1|") + (0 == (param0 & AccountWelcomePanel.field_Q) ? "" : "gv BiH anywhere|") + (0 != (AccountWelcomePanel.field_R & param0) ? "gv BiH kitchen|" : "") + ((AccountWelcomePanel.field_V & param0) == 0 ? "" : "gv BiH in D|") + ((ag.field_e & param0) != 0 ? "wins|" : "") + ((Quaternion.field_e & param0) == 0 ? "" : "loses|") + ((param0 & ClientException.field_b) == 0 ? "" : "group choice|") + (0 != (param0 & um.field_c) ? "respot white|" : "") + ((param0 & MenuScreen.field_F) == 0 ? "" : "rerack|") + (0 != (ll.field_f & param0) ? "ends turn|" : "");
    }

    TabbedPane(long param0, UiComponent param1, String[] param2, UiComponent param3, UiComponent[] param4, int param5) {
        super(param0, (UiComponent) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        UiComponent var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.tabButtons = new UiComponent[param2.length];
          this.body = new UiComponent(0L, param3);
          this.panels = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new UiComponent(0L, param1);
            var9.text = param2[var8_int];
            this.tabButtons[var8_int] = var9;
            this.addChild(42, var9);
          }
          this.addChild(91, this.body);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.body.addChild(126, param4[var11]);
            var11++;
          }
          this.selectedTab = param5;
          this.tabButtons[param5].selected = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("wd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final void processTabPresses(boolean param0) {
        int var2 = 0;
        UiComponent dupTemp$0 = null;
        UiComponent dupTemp$1 = null;
        if (!param0) {
          return;
        }
        for (var2 = 0; var2 < this.tabButtons.length; var2++) {
          if (this.selectedTab != var2 &&
            this.tabButtons[var2].pressedButton != 0) {
            this.tabButtons[this.selectedTab].selected = false;
            dupTemp$0 = this.panels[this.selectedTab];
            dupTemp$0.localX = dupTemp$0.localX + 10000;
            this.selectedTab = var2;
            this.tabButtons[var2].selected = true;
            dupTemp$1 = this.panels[var2];
            dupTemp$1.localX = dupTemp$1.localX - 10000;
          }
        }
    }

    final void setTabbedPaneBounds(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -37 % ((-50 - param2) / 32);
        this.width = param1;
        this.localX = param0;
        this.height = param3;
        this.localY = param4;
        this.layoutTabs((byte) -125, param5, param6);
    }

    static {
        field_Qb = new int[64];
        field_Sb = false;
        loginm3 = "Connection timed out. Please try using a different server.";
        fullscreen = "Fullscreen";
    }
}
