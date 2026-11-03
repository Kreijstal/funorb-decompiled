/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends UiComponent {
    static String rule12;
    private Sprite[] hoverFrameSprites;
    static Sprite field_Yb;
    private int iconLabelGap;
    private int itemCount;
    static int[] field_Ub;
    private UiComponent emptyItemStyle;
    static String youPlayer;
    static String field_Xb;
    private int keyboardResult;
    static boolean field_Sb;
    static int field_Ob;
    private AlignedIconLabel[] items;
    private int itemHeight;
    private int borderInsetY;
    private UiComponent itemStyle;
    private int borderInsetX;
    private int[] actionIds;
    private int itemInsetX;

    public static void releaseStatics(int param0) {
        rule12 = null;
        if (param0 < 109) {
          field_Yb = (Sprite) null;
        }
        youPlayer = null;
        field_Ub = null;
        field_Xb = null;
        field_Yb = null;
    }

    final boolean handleCancelKey(byte param0) {
        if (-2 != this.keyboardResult) {
          return false;
        }
        if (IterableDualLinkDeque.field_a == 13) {
          this.keyboardResult = -1;
        }
        int var2 = -37 % ((7 - param0) / 56);
        return true;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != 22987) {
          field_Xb = (String) null;
        }
        stackIn_10_0 = ((!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_10_0;
    }

    final void addAction(String param0, int param1, int param2) {
        try {
          this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.itemStyle, (Sprite) null, param0);
          this.items[this.itemCount].activeFrameSprites = this.hoverFrameSprites;
          this.items[this.itemCount].useParentFrameBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(-103, this.items[this.itemCount]);
          this.actionIds[this.itemCount] = param2;
          this.itemCount = this.itemCount + 1;
          if (param1 != 17130) {
            String var5 = (String) null;
            this.addIconAction(-100, (byte) -124, (Sprite) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void layoutAtAnchor(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var8Lifetime1;
        if (this.itemCount == 0) {
          this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.emptyItemStyle, (Sprite) null, SectorCacheStore.noOptionsAvailable);
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(76, this.items[this.itemCount]);
          this.actionIds[this.itemCount] = -1;
          this.itemCount = this.itemCount + 1;
        }
        var6 = 0;
        for (var7 = 0; var7 < this.itemCount; var7++) {
          var8 = this.items[var7].measureIconLabelWidth(0, this.iconLabelGap, this.itemInsetX);
          if (var6 < var8) {
            var6 = var8;
          }
        }
        var6 = var6 + 2 * this.borderInsetX;
        var7Lifetime1 = this.itemCount * this.itemHeight + this.borderInsetY + this.borderInsetY;
        var8Lifetime1 = de.a(var6, param0, param2, 0);
        var9 = OpacityWidget.a(var7Lifetime1, param4, param3 - 1, param1);
        this.setBounds(var9, 2147483647, var8Lifetime1, var6, var7Lifetime1);
        for (var10 = param3; this.itemCount > var10; var10++) {
          this.items[var10].setIconLabelBounds(this.borderInsetX, true, this.itemInsetX, this.itemHeight, this.iconLabelGap, var6 - this.borderInsetX * 2, this.borderInsetY + this.itemHeight * var10);
        }
    }

    ContextMenu(UiComponent param0, Sprite[] param1, UiComponent param2, UiComponent param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.keyboardResult = -2;
        this.items = new AlignedIconLabel[256];
        this.actionIds = new int[256];
        try {
          this.itemHeight = param8;
          this.borderInsetY = param7;
          this.borderInsetX = param4;
          this.itemStyle = param3;
          this.iconLabelGap = param6;
          this.emptyItemStyle = param2;
          this.itemInsetX = param5;
          this.hoverFrameSprites = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int updateAndPollAction(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        this.updateRoot(param1, false);
        if (!param1) {
          return -2;
        }
        if (param0 < 8) {
          return -81;
        }
        for (var3 = 0; var3 < this.itemCount; var3++) {
          if (this.items[var3].pressedButton != 0) {
            return this.actionIds[var3];
          }
        }
        if (MatchingTextValidator.field_s != 0) {
          return -1;
        }
        return this.keyboardResult;
    }

    final void addIconAction(int param0, byte param1, Sprite param2, String param3) {
        try {
          this.items[this.itemCount] = new AlignedIconLabel(0L, (UiComponent) null, (UiComponent) null, this.itemStyle, param2, param3);
          this.items[this.itemCount].activeFrameSprites = this.hoverFrameSprites;
          this.items[this.itemCount].useParentFrameBounds = true;
          this.items[this.itemCount].verticalAlignment = 1;
          this.addChild(73, this.items[this.itemCount]);
          int var5_int = -81 / ((20 - param1) / 60);
          this.actionIds[this.itemCount] = param0;
          this.itemCount = this.itemCount + 1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vq.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ContextMenu(ContextMenu param0) {
        this(param0, param0.hoverFrameSprites, param0.emptyItemStyle, param0.itemStyle, param0.borderInsetX, param0.itemInsetX, param0.iconLabelGap, param0.borderInsetY, param0.itemHeight);
    }

    static {
        youPlayer = "You";
        field_Ub = new int[3];
        rule12 = "Disruptive behaviour";
    }
}
