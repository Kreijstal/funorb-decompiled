/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeOptionPainter extends BitmapTextWidgetPainter {
    static ResourceArchive field_u;
    static int field_E;
    static RgbSprite[] field_w;
    static String field_x;
    private IndexedSprite[] stateIcons;
    static int[] field_D;
    static LoginMethod usernameLoginMethod;
    static String field_A;
    static boolean field_v;
    static String field_z;
    static int[] field_C;

    final static QuickChatCategory findQuickChatRootCategory(byte obfuscationGuard) {
        int var1 = 0;
        int var2_int = 0;
        QuickChatCategory var3 = null;
        int var4 = 0;
        QuickChatCategory stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var1 = 55 / ((obfuscationGuard - 21) / 34);
        try {
          var2_int = 0;
          while (true) {
            var3 = SocialListPanel.quickChatCategories.getCategory(var2_int, true);
            if (!var3.isRootCategory) {
              var2_int++;
              continue;
            }
            break;
          }
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public static void c(boolean param0) {
        usernameLoginMethod = null;
        field_w = null;
        field_A = null;
        if (!param0) {
          field_x = null;
          field_z = null;
          field_u = null;
          field_C = null;
          field_D = null;
          return;
        }
        DisplayModeOptionPainter.a(-117, false);
        field_x = null;
        field_z = null;
        field_u = null;
        field_C = null;
        field_D = null;
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        int activeStateFlag = 0;
        int focusStateFlag = 0;
        int captionColourValue = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int activeState = 0;
        RuntimeException var6 = null;
        int focusedState = 0;
        int iconState = 0;
        int captionColour = 0;
        IndexedSprite icon = null;
        int iconX = 0;
        int iconY = 0;
        int captionCenterX = 0;
        try {
          SoftwareRaster.b(widget.x + originX, originY + widget.y, widget.width, widget.height, 10197915);
          if (obfuscationGuard > -79) {
            field_A = (String) null;
          }
          if (renderFlag) {
            activeStateFlag = (((InteractiveWidget) (widget)).active) ? 1 : 0;
          } else {
            activeStateFlag = 0;
          }
          activeState = activeStateFlag;
          if (renderFlag) {
            focusStateFlag = (widget.isFocused(false)) ? 1 : 0;
          } else {
            focusStateFlag = 0;
          }
          focusedState = focusStateFlag;
          iconState = 0;
          if (focusedState != 0) {
            iconState = iconState | 2;
          }
          captionColourValue = (activeState == 0) ? 16777215 : 2394342;
          captionColour = captionColourValue;
          if (activeState != 0) {
            iconState = iconState | 1;
          }
          icon = this.stateIcons[iconState];
          iconX = originX + widget.x + (-icon.pixelWidth + widget.width) / 2;
          iconY = (-icon.pixelHeight + widget.height) / 2 + originY + widget.y;
          captionCenterX = widget.x + (originX + widget.width / 2);
          icon.draw(iconX, iconY);
          this.font.drawCentered(this.getDisplayText(0, widget), captionCenterX, originY, captionColour, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("ps.C(");
          if (widget == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        UnitAnimationPreview.field_l = param0;
        if (TurnTimerDial.field_d != mj.field_c) {
          var2 = mj.field_c * mj.field_c;
          var3 = var2 - TurnTimerDial.field_d * TurnTimerDial.field_d;
          param0 = param0 + var3 * (EquipmentBattleTutorial.field_y - param0) / var2;
        }
        CombatEvent.field_I.setBounds(120, -20500, 640, param0, QuickChatCategory.field_u);
        PlayerProfile.a(-1, MusicPatchNode.field_l, 0, MusicPatch.field_n, 5, EquipmentBattleTutorial.field_y - 24, 640);
        if (param1) {
          return;
        }
        field_z = (String) null;
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2) {
        try {
          if (param0 < 30) {
            DisplayModeOptionPainter.c(false);
          }
          iw.field_p = param2;
          AlphaWidgetContainer.field_H = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ps.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    DisplayModeOptionPainter(IndexedSprite[] stateIcons) {
        try {
          this.stateIcons = stateIcons;
          this.font = ArmiesOfGielinor.field_J;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ps.<init>(" + (stateIcons != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new RgbSprite[3];
        field_D = new int[]{100, 100, 200, 100, 100, 100, 200, 200, 200, 200, 300, 200, 200, 200, 300, 500, 100, 100, 100, 200, 300, 300, 100, 100, 100, 100, 100, 100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 200, 300, 500, 300, 300, 500, 200, 300, 500, 300, 300, 500, 200, 300, 500, 200, 300, 500};
        field_E = 250;
        field_x = "This ground produces no Mana";
        usernameLoginMethod = new LoginMethod("usename");
        field_A = "You are on <%0>";
        field_z = "Click or press F10 to open Quick Chat";
        field_C = new int[]{2, 2, 2, 2, 2};
    }
}
