/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetGroup extends Widget implements WidgetContainer {
    Widget[] children;
    static int[] field_M;
    static String field_I;
    static ResourceArchive field_G;
    static String[] buttonLabels;
    static String field_J;
    static int[] field_L;
    static int fireworkSpawnHeight;
    static NineSliceFrame textChoiceButtonFrame;
    static String field_C;
    static int[] decodedSpriteOffsetX;

    final static void f(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (ScorePopup.field_p > 32) {
          var1 = ScorePopup.field_p % 32;
          if (0 == var1) {
            var1 = 32;
          }
          SoundCache.a(1, -var1 + ScorePopup.field_p);
        } else {
          SoundCache.a(1, 0);
        }
        var1Lifetime1 = -4 % ((73 - param0) / 40);
    }

    private final boolean a(int param0, int param1, Widget param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Widget var5 = null;
        Widget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          if (param0 <= 99) {
            this.isFocused(-98);
          }
          var4_int = -1 + this.children.length;
          while (var4_int >= 0) {
            var5 = this.children[var4_int];
            if (var5 != null &&
              var5.isFocused(-106)) {
              for (var4_int = var4_int - param1; 0 <= var4_int; var4_int = var4_int - param1) {
                var6 = this.children[var4_int];
                if (var6 != null &&
                  var6.tryFocus(true, param2)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("ag.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var5 = 0;
        Widget var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -11) {
          return;
        }
        if (layer == 0 &&
          null != this.renderer) {
          this.renderer.paintWidget(true, obfuscationGuard - 20607, parentX, (Widget) (this), parentY);
        }
        if (this.children != null) {
          for (var5 = -1 + this.children.length; var5 >= 0; var5--) {
            var6 = this.children[var5];
            if (var6 != null) {
              var6.drawLayer(parentY + this.y, this.x + parentX, layer, (byte) -11);
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        buttonLabels = null;
        field_J = null;
        decodedSpriteOffsetX = null;
        field_C = null;
        textChoiceButtonFrame = null;
        if (param0) {
          ArrayWidgetGroup.c(true);
        }
        field_G = null;
    }

    private final boolean a(int param0, Widget param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = this.a(param0 ^ 125, 1, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ag.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        int var9 = 0;
        Widget[] var8 = null;
        RuntimeException var8_ref = null;
        Widget var10 = null;
        int var11 = 0;
        Widget[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = obfuscationGuard; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.handlePointerPress(focusRoot, pointerX, parentX + this.x, this.y + parentY, button, pointerY, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("ag.MA(");
          if (focusRoot == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        int var6 = 0;
        Widget[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        Widget var7 = null;
        int var8 = 0;
        Widget var9 = null;
        Widget[] var10 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          var10 = this.children;
          var5 = var10;
          if (obfuscationGuard != 110) {
            var9 = (Widget) null;
            this.handlePointerRelease(26, 34, 108, (Widget) null, -13, -79);
          }
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            if (var7 != null &&
              var7.isFocused(-58) &&
              var7.handleWidgetKey(keyCode, (byte) 110, focusRoot, character)) {
              return true;
            }
          }
          var5_int = keyCode;
          if (var5_int != 80) {
            return false;
          }
          if (IntArrayRequest.heldKeys[81]) {
            stackIn_20_0 = this.a(1, focusRoot);
          } else {
            stackIn_20_0 = this.b(true, focusRoot);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("ag.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(character).append(')').toString());
        }
    }

    private final boolean b(boolean param0, Widget param1) {
        RuntimeException var3 = null;
        Widget var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (Widget) null;
            this.handleWidgetKey(91, (byte) 97, (Widget) null, '<');
          }
          stackIn_3_0 = this.a(1, param1, (byte) 116);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ag.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        int var8 = 0;
        Widget[] var7 = null;
        Widget var9 = null;
        int var10 = 0;
        Widget var11 = null;
        Widget[] var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 19223) {
            var11 = (Widget) null;
            this.handleWidgetKey(78, (byte) -22, (Widget) null, '￻');
          }
          if (null == this.children) {
            return;
          }
          var12 = this.children;
          var7 = var12;
          for (var8 = 0; var12.length > var8; var8++) {
            var9 = var12[var8];
            if (var9 != null) {
              var9.handlePointerRelease(pointerY, pointerX, parentY + this.y, focusRoot, obfuscationGuard ^ 0, parentX + this.x);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("ag.GA(").append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(',');
          if (focusRoot == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        Widget var7 = null;
        int var9 = 0;
        Widget[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.children) {
            return;
          }
          var10 = this.children;
          var6 = 0;
          if (param0 <= 72) {
            ArrayWidgetGroup.c(true);
          }
          while (var6 < var10.length) {
            var7 = var10[var6];
            discarded$4 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$6 = param3.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param3.append("null");
            } else {
              var7.a(param1 + 1, param2, 24, param3);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ag.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean isFocused(int obfuscationGuard) {
        if (obfuscationGuard > -49) {
          this.children = (Widget[]) null;
        }
        return null != this.getFocusedChild((byte) -78) ? true : false;
    }

    ArrayWidgetGroup(int x, int y, int width, int height, WidgetRenderer renderer) {
        super(x, y, width, height, renderer, (WidgetListener) null);
    }

    final void clearFocus(boolean obfuscationGuard) {
        Widget discarded$1 = null;
        Widget[] var2;
        int var3;
        Widget var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = this.children;
        var3 = 0;
        if (obfuscationGuard) {
          discarded$1 = this.getFocusedChild((byte) 108);
        }
        while (var2.length > var3) {
          var4 = var2[var3];
          if (var4 != null) {
            var4.clearFocus(false);
          }
          var3++;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, Widget param5, int param6) {
        int var9 = 0;
        Widget[] var8 = null;
        RuntimeException var8_ref = null;
        Widget var10 = null;
        int var11 = 0;
        Widget[] var12 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          if (param3 >= -125) {
            return false;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.isFocused(-109) &&
              var10.a(param0, param1, param2, -126, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_21_0 = var8_ref;
          stackIn_21_1 = new StringBuilder().append("ag.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    abstract void layoutChildren(int obfuscationGuard);

    private final Widget getFocusedChild(byte obfuscationGuard) {
        int var3 = 0;
        Widget[] var2;
        Widget var4;
        int var5;
        Widget[] var6;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null == this.children) {
          return null;
        }
        if (obfuscationGuard != -78) {
          return (Widget) null;
        }
        var6 = this.children;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.isFocused(-88)) {
            return var4;
          }
        }
        return null;
    }

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.layoutChildren(obfuscationGuard ^ -251);
    }

    private final boolean a(int param0, Widget param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Widget var5 = null;
        Widget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          if (param2 != 116) {
            textChoiceButtonFrame = (NineSliceFrame) null;
          }
          var4_int = 0;
          while (this.children.length > var4_int) {
            var5 = this.children[var4_int];
            if (null != var5 &&
              var5.isFocused(-57)) {
              for (var4_int = var4_int + param0; this.children.length > var4_int; var4_int = var4_int + param0) {
                var6 = this.children[var4_int];
                if (null != var6 &&
                  var6.tryFocus(true, param1)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ag.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Brick.field_A.text = param1;
        RasterStackHelpers.field_c = true;
        int var2_int = BallPulseEffect.framebuffer.width;
        if (param0 != -83) {
          return;
        }
        try {
          var3 = BallPulseEffect.framebuffer.height;
          var4 = Brick.field_A.font.measureWrappedHeight(param1, 272, Brick.field_A.lineSpacing);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          PlayerBadgeHelpers.field_f.setBounds(-(2 * var5) + (-120 + var3), var5, (var2_int - 320) / 2, 320, (byte) 64);
          PlayerBadgeHelpers.field_f.frameSprites = DateFieldsWidget.a(false, 8421504, 3, 11579568, PlayerBadgeHelpers.field_f.height, 2105376);
          Brick.field_A.setBounds(-24 + (PlayerBadgeHelpers.field_f.height - 20), 16, 24, -24 + (-24 + PlayerBadgeHelpers.field_f.width), (byte) 64);
          LobbyUiHelpers.cancelCreateGameButton.setBounds(24, -24 + (-20 + PlayerBadgeHelpers.field_f.height), 120, 80, (byte) 64);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ag.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int var6 = 0;
        Widget[] var5 = null;
        Widget var7 = null;
        int var8 = 0;
        Widget[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          if (this.children == null) {
            return;
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.updatePointer(focusRoot, (byte) 0, this.x + parentX, parentY + this.y);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ag.WA(");
          if (focusRoot == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    final String getTooltip(int obfuscationGuard) {
        int var3 = 0;
        Widget[] var2;
        Widget var4;
        int var6;
        String var5;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.children == null) {
          return null;
        }
        var2 = this.children;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.getTooltip(21);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (obfuscationGuard >= 6) {
          return null;
        }
        buttonLabels = (String[]) null;
        return null;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        Widget var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2 ^ 1595638000, param0, param1)) {
            this.a(param1, param0, param2 ^ 24, param3);
            this.a((byte) 119, param0, param1, param3);
          }
          if (param2 != 24) {
            var6 = (Widget) null;
            discarded$1 = this.a(26, -76, (Widget) null);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        int var4 = 0;
        Widget[] var3 = null;
        RuntimeException var3_ref = null;
        Widget var5 = null;
        int var6 = 0;
        Widget var7 = null;
        Widget[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = this.children;
          var3 = var8;
          if (!obfuscationGuard) {
            var7 = (Widget) null;
            this.a(18, 61, 105, -29, 39, (Widget) null, -74);
          }
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null &&
              var5.tryFocus(true, focusRoot)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ag.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int e(byte param0) {
        int var5 = 0;
        int var2;
        Widget[] var3;
        int var4;
        Widget var6;
        int var8;
        int var7;
        var8 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var4 = -128 % ((-17 - param0) / 43);
        var3 = this.children;
        for (var5 = 0; var3.length > var5; var5++) {
          var6 = var3[var5];
          if (var6 != null) {
            var7 = var6.e((byte) 117);
            if (var7 > var2) {
              var2 = var7;
            }
          }
        }
        return var2;
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 != -16) {
          String var4 = (String) null;
          ArrayWidgetGroup.a((byte) 10, (String) null);
        }
        String var5 = (String) null;
        ToggleButtonWidget.a(param2, param1, -15947, (String) null);
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_M = new int[256];
        field_I = "Spectate";
        for (var0 = 0; var0 < 256; var0++) {
          var1 = var0;
          field_M[var0] = LevelSelectScreen.d(LevelSelectScreen.d(var1 << 16, var1 << 8), 0 * var1);
        }
        field_J = "Find opponents";
        field_L = new int[]{7, 40, 41};
        field_C = "Oh no!";
    }
}
