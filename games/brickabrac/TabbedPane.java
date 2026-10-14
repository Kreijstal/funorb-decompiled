/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TabbedPane extends UiComponent {
    static long[][] whirlpoolRoundTables;
    private UiComponent body;
    static long[] whirlpoolRoundConstants;
    int selectedTab;
    private UiComponent[] tabButtons;
    private UiComponent[] panels;
    static String field_Pb;
    static int field_Ub;
    static BackgroundScene currentBackground;
    static String field_Tb;

    final static void a(String[] args, RgbSprite[][] param1, int param2, String[][] param3, byte[] param4, ResourceArchive param5, RgbSprite[][] param6, ResourceArchive param7, boolean param8, int param9, int[] param10, String[][] param11, ResourceArchive param12, byte[] param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        TextFont var16 = null;
        try {
          if (param14 != 22287) {
            var16 = (TextFont) null;
            TabbedPane.a(56, 101, -86, 51, -89, 7, -10, 119, -103, (RgbSprite[]) null, (TextFont) null, (RgbSprite[]) null, -32, 111, 0, true, -111, (RgbSprite[]) null, (TextFont) null, 2);
          }
          QuickChatMenu.a(args, (IndexedSprite[]) null, param13, param6, param4, param10, param14 - 22286, param1, param12, param9, param5, param3, param7, param2, (int[]) null, param11, param8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("oa.C(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param12 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param13 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param14).append(')').toString());
        }
    }

    private final void layoutTabs(int tabHeight, int panelInset, int obfuscationGuard) {
        UiComponent inactivePanel = null;
        int tabIndex;
        int tabLeft;
        int tabRight;
        int unusedGameFlag;
        int panelIndex;
        int guardDivision;
        int unusedPanelIndex;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        for (tabIndex = 0; this.tabButtons.length > tabIndex; tabIndex++) {
          tabLeft = tabIndex * this.width / this.tabButtons.length;
          tabRight = this.width * (1 + tabIndex) / this.tabButtons.length;
          this.tabButtons[tabIndex].localX = tabLeft;
          this.tabButtons[tabIndex].localY = 0;
          this.tabButtons[tabIndex].width = tabRight - tabLeft;
          this.tabButtons[tabIndex].height = tabHeight;
        }
        this.body.setBounds(-tabHeight + this.height, tabHeight, 0, this.width, (byte) 64);
        guardDivision = 65 / ((obfuscationGuard + 35) / 58);
        panelIndex = 0;
        unusedPanelIndex = panelIndex;
        while (this.panels.length > panelIndex) {
          this.panels[panelIndex].setBounds(this.body.height - panelInset * 2, panelInset, panelInset, this.body.width - panelInset * 2, (byte) 64);
          if (this.selectedTab != panelIndex) {
            inactivePanel = this.panels[panelIndex];
            inactivePanel.localX = inactivePanel.localX + 10000;
          }
          panelIndex++;
        }
    }

    final void setTabbedPaneBounds(int panelInset, int x, int width, int tabHeight, int height, int y, int obfuscationGuard) {
        this.width = width;
        this.localY = y;
        this.localX = x;
        if (obfuscationGuard < 44) {
          TextFont var9 = (TextFont) null;
          TabbedPane.a(23, 14, 2, 105, -34, -65, 67, 44, -119, (RgbSprite[]) null, (TextFont) null, (RgbSprite[]) null, -66, -50, -90, false, 92, (RgbSprite[]) null, (TextFont) null, -101);
        }
        this.height = height;
        this.layoutTabs(tabHeight, panelInset, -117);
    }

    public static void h(int param0) {
        currentBackground = null;
        field_Pb = null;
        field_Tb = null;
        int var1 = 120 / ((-3 - param0) / 47);
        whirlpoolRoundConstants = null;
        whirlpoolRoundTables = (long[][]) null;
    }

    final void processTabPresses(int firstTabIndex) {
        int tabIndex = 0;
        UiComponent previousPanel = null;
        UiComponent selectedPanel = null;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        for (tabIndex = firstTabIndex; tabIndex < this.tabButtons.length; tabIndex++) {
          if (tabIndex != this.selectedTab &&
            this.tabButtons[tabIndex].pressedButton != 0) {
            this.tabButtons[this.selectedTab].selected = false;
            previousPanel = this.panels[this.selectedTab];
            previousPanel.localX = previousPanel.localX + 10000;
            this.selectedTab = tabIndex;
            this.tabButtons[tabIndex].selected = true;
            selectedPanel = this.panels[tabIndex];
            selectedPanel.localX = selectedPanel.localX - 10000;
          }
        }
    }

    TabbedPane(long id, UiComponent tabStyle, String[] labels, UiComponent bodyStyle, UiComponent[] panels, int initialTab) {
        super(id, (UiComponent) null);
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
        int tabIndex = 0;
        RuntimeException var8 = null;
        UiComponent tab = null;
        int panelIndex = 0;
        int unusedPanelIndex;
        try {
          this.tabButtons = new UiComponent[labels.length];
          this.body = new UiComponent(0L, bodyStyle);
          this.panels = panels;
          for (tabIndex = 0; tabIndex < labels.length; tabIndex++) {
            tab = new UiComponent(0L, tabStyle);
            tab.text = labels[tabIndex];
            this.tabButtons[tabIndex] = tab;
            this.addChild(tab, 0);
          }
          this.addChild(this.body, 0);
          panelIndex = 0;
          unusedPanelIndex = panelIndex;
          while (panels.length > panelIndex) {
            this.body.addChild(panels[panelIndex], 0);
            panelIndex++;
          }
          this.selectedTab = initialTab;
          this.tabButtons[initialTab].selected = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("oa.<init>(").append(id).append(',');
          if (tabStyle == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (labels == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (bodyStyle == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (panels == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(initialTab).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, RgbSprite[] param9, TextFont param10, RgbSprite[] param11, int param12, int param13, int param14, boolean param15, int param16, RgbSprite[] param17, TextFont param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (param15) {
            whirlpoolRoundConstants = (long[]) null;
          }
          gh.a(param2, new NineSliceFrame(param11), param3, param0, param14, param7, param18, param10, 12, param6, new NineSliceFrame(param17), new NineSliceFrame(param9), param4, param19, param13, param8, param1, param12, param16, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("oa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param11 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        whirlpoolRoundTables = new long[8][256];
        whirlpoolRoundConstants = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (var0 & 1) ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            whirlpoolRoundTables[0][var0] = CacheIoWorker.a(var12, CacheIoWorker.a(CacheIoWorker.a(var8 << 16, CacheIoWorker.a(var10 << 24, CacheIoWorker.a(CacheIoWorker.a(var6 << 40, CacheIoWorker.a(var2 << 48, var2 << 56)), var2 << 32))), var4 << 8));
            for (var14 = 1; var14 < 8; var14++) {
                whirlpoolRoundTables[var14][var0] = CacheIoWorker.a(whirlpoolRoundTables[var14 - 1][var0] << 56, whirlpoolRoundTables[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        whirlpoolRoundConstants[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = var0 * 8 - 8;
            whirlpoolRoundConstants[var0] = RegistrationResponseDialog.a(ch.a(255L, whirlpoolRoundTables[7][7 + var1]), RegistrationResponseDialog.a(ch.a(65280L, whirlpoolRoundTables[6][var1 + 6]), RegistrationResponseDialog.a(ch.a(16711680L, whirlpoolRoundTables[5][var1 + 5]), RegistrationResponseDialog.a(RegistrationResponseDialog.a(ch.a(whirlpoolRoundTables[3][var1 + 3], 1095216660480L), RegistrationResponseDialog.a(RegistrationResponseDialog.a(ch.a(71776119061217280L, whirlpoolRoundTables[1][var1 + 1]), ch.a(whirlpoolRoundTables[0][var1], -72057594037927936L)), ch.a(whirlpoolRoundTables[2][var1 + 2], 280375465082880L))), ch.a(whirlpoolRoundTables[4][4 + var1], 4278190080L)))));
        }
        field_Pb = "Set up new unrated game";
        field_Ub = 0;
        field_Tb = "Retry";
    }
}
