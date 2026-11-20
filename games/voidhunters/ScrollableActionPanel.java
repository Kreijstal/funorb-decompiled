/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollableActionPanel extends Widget {
    static Widget field_Ab;
    Widget secondButton;
    static int argumentStartTokenType;
    ScrollPaneWidget scrollPane;
    Widget firstButton;
    Widget content;

    ScrollableActionPanel(long param0, ScrollableActionPanel param1, String param2, String param3) {
        this(param0, param1, param1.scrollPane.viewport, param1.scrollPane.scrollbar, param1.firstButton, param2, param3);
    }

    ScrollableActionPanel(long param0, Widget param1, Widget param2, ScrollBarWidget param3, Widget param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.content = new Widget(0L, (Widget) null);
          this.scrollPane = new ScrollPaneWidget(0L, this.content, param2, param3);
          this.firstButton = new Widget(0L, param4);
          this.secondButton = new Widget(0L, param4);
          this.firstButton.text = param5;
          this.secondButton.text = param6;
          this.addChild(-561, this.scrollPane);
          this.addChild(-561, this.firstButton);
          this.addChild(-561, this.secondButton);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "wdb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_Ab = null;
        if (param0 < 126) {
          argumentStartTokenType = 24;
        }
    }

    final void layoutContents(int param0, int param1, int param2, byte param3) {
        int var5 = (this.width + param0) / 2;
        int var6 = -param1 + this.height;
        this.scrollPane.setBoundsAndLayout(this.width, param0, -1, -param0 + var6, 0, 0, param2);
        this.firstButton.y = var6;
        this.firstButton.x = 0;
        this.firstButton.width = -param0 + var5;
        if (param3 == 63) {
          this.firstButton.height = param1;
          this.secondButton.y = var6;
          this.secondButton.x = var5;
          this.secondButton.width = this.width - var5;
          this.secondButton.height = param1;
          return;
        }
        this.setBoundsAndLayout(84, -31, 113, -108, 43, -89, 51, 115);
        this.firstButton.height = param1;
        this.secondButton.y = var6;
        this.secondButton.x = var5;
        this.secondButton.width = this.width - var5;
        this.secondButton.height = param1;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param4;
        this.y = param1;
        this.width = param5;
        if (param6 == 0) {
          this.x = param0;
          this.layoutContents(param7, param2, param3, (byte) 63);
          return;
        }
        this.layoutContents(-108, 59, -20, (byte) -43);
        this.x = param0;
        this.layoutContents(param7, param2, param3, (byte) 63);
    }

    static {
        argumentStartTokenType = 0;
    }
}
