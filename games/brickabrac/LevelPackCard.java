/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelPackCard {
    static int[] field_a;
    private int focusStartTick;
    static int[] viewFacePointTwoX;
    static int projectionShift;
    private MenuButton viewport;
    static int[] field_n;
    private boolean focused;
    static RgbSprite farmNearSprite;
    private int packIndex;
    private MenuScreen owner;
    private int buttonIndex;
    private RgbSprite icon;
    static int field_i;
    private String caption;

    final static boolean hasFeatureBit(int featureId, int obfuscationGuard) {
        if (obfuscationGuard >= -26) {
          field_n = (int[]) null;
          if (-1 == featureId) {
            return true;
          }
          return (1 << featureId & o.enabledFeatureMask) != 0 ? true : false;
        }
        if (-1 == featureId) {
          return true;
        }
        return (1 << featureId & o.enabledFeatureMask) != 0 ? true : false;
    }

    final static void a(String[][] param0, IndexedSprite[] param1, byte param2, String[] param3, int param4, String[] param5, String[][] param6, ResourceArchive param7, ResourceArchive param8, ResourceArchive param9, int[] param10, RgbSprite[][] param11, int param12, boolean param13, RgbSprite[][] param14, byte[] param15, byte[] param16, int[] param17, int param18) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        int[] var20 = null;
        String[] var21 = null;
        try {
          var21 = (String[]) null;
          pf.a(param18, param15, param8, param3, -27460, param13, param14, param7, param12, param10, (String[]) null, param11, param1, 1, param16, param0, param5, param6, param17, param9);
          if (param2 != 47) {
            var20 = (int[]) null;
            LevelPackCard.a((String[][]) null, (IndexedSprite[]) null, (byte) -33, (String[]) null, 104, (String[]) null, (String[][]) null, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, (int[]) null, (RgbSprite[][]) null, 5, true, (RgbSprite[][]) null, (byte[]) null, (byte[]) null, (int[]) null, -25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_5_0 = var19;
          stackIn_5_1 = new StringBuilder().append("lc.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param10 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param11 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param17 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param18).append(')').toString());
        }
    }

    final void draw(byte obfuscationGuard) {
        int var2 = 0;
        int var2Lifetime1;
        if (obfuscationGuard > 89) {
          var2 = InteractiveGameClient.sine8192(100 * (-this.focusStartTick + MembershipBenefitsScreen.clientTick), -4097) + 65536 >> 12;
          Rasterizer2D.a(this.viewport.x - 2, -2 + this.viewport.y, 4 + this.viewport.width, this.viewport.height + 4, 20, 16777215, (this.focused ? var2 : 0) + 32);
          Rasterizer2D.b(this.viewport.x, this.viewport.y, this.viewport.width, this.viewport.height, 20, 0);
          this.icon.drawTransparent(this.viewport.x + 30, this.viewport.y + 20);
          ContextActionController.field_g.drawCentered(this.caption, (this.viewport.width + this.viewport.x * 2) / 2, this.viewport.y - (-this.viewport.height + 13), !this.focused ? 0 : 1, -1);
          return;
        }
        this.viewport = (MenuButton) null;
        var2Lifetime1 = InteractiveGameClient.sine8192(100 * (-this.focusStartTick + MembershipBenefitsScreen.clientTick), -4097) + 65536 >> 12;
        Rasterizer2D.a(this.viewport.x - 2, -2 + this.viewport.y, 4 + this.viewport.width, this.viewport.height + 4, 20, 16777215, (this.focused ? var2Lifetime1 : 0) + 32);
        Rasterizer2D.b(this.viewport.x, this.viewport.y, this.viewport.width, this.viewport.height, 20, 0);
        this.icon.drawTransparent(this.viewport.x + 30, this.viewport.y + 20);
        ContextActionController.field_g.drawCentered(this.caption, (this.viewport.width + this.viewport.x * 2) / 2, this.viewport.y - (-this.viewport.height + 13), !this.focused ? 0 : 1, -1);
    }

    public static void a(int param0) {
        field_n = null;
        field_a = null;
        if (param0 == 32156) {
          viewFacePointTwoX = null;
          farmNearSprite = null;
          return;
        }
        LevelPackCard.a(-115);
        viewFacePointTwoX = null;
        farmNearSprite = null;
    }

    final void updateFocus(byte obfuscationGuard) {
        if (obfuscationGuard != -75) {
          return;
        }
        if (this.owner.selection.selectedIndex != this.buttonIndex) {
          this.focused = false;
          return;
        }
        if (this.focused) {
          this.focused = true;
          return;
        }
        this.focusStartTick = MembershipBenefitsScreen.clientTick;
        this.focused = true;
    }

    LevelPackCard(MenuScreen owner, MenuButton viewport, int buttonIndex, int packIndex) {
        try {
          this.packIndex = packIndex;
          this.buttonIndex = buttonIndex;
          this.viewport = viewport;
          this.owner = owner;
          this.caption = qn.packNames[this.packIndex].toLowerCase();
          this.icon = SaveResultsPromptScreen.packCardIcons[this.packIndex];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lc.<init>(" + (owner != null ? "{...}" : "null") + ',' + (viewport != null ? "{...}" : "null") + ',' + buttonIndex + ',' + packIndex + ')');
        }
    }

    static {
        viewFacePointTwoX = new int[8192];
        field_n = new int[]{25, 8, 26, 37};
        field_a = new int[4];
        projectionShift = 9;
    }
}
