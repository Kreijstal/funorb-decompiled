/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetGroup extends Widget implements WidgetContainer {
    static int[] rankingLosses;
    static RgbSprite field_E;
    static String field_F;
    static String field_C;
    NodeDeque children;

    final boolean a(Widget param0, byte param1) {
        NodeDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        Widget var4 = null;
        NodeDequeCursor var5 = null;
        Widget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.children.isEmpty(false)) {
            return false;
          }
          var3 = new NodeDequeCursor(this.children);
          if (param1 > -115) {
            return false;
          }
          var4 = (Widget) (var3.first(240));
          while (var4 != null) {
            if (var4.isFocused(-128)) {
              var5 = new NodeDequeCursor(this.children);
              var5.firstFrom(122, var4);
              var6 = (Widget) (var5.next(7));
              while (var6 != null) {
                if (!var6.tryFocus(true, param0)) {
                  var6 = (Widget) (var5.next(7));
                  continue;
                }
                return true;
              }
            }
            var4 = (Widget) (var3.next(7));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ib.FB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(Widget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDequeCursor var4 = null;
        Widget var5 = null;
        NodeDequeCursor var6 = null;
        Widget var7 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -60 % ((param1 - 51) / 34);
          if (this.children.isEmpty(false)) {
            return false;
          }
          var4 = new NodeDequeCursor(this.children);
          var5 = (Widget) (var4.last(true));
          while (var5 != null) {
            if (var5.isFocused(-57)) {
              var6 = new NodeDequeCursor(this.children);
              var6.lastFrom(16802, var5);
              var7 = (Widget) (var6.previous(-24706));
              while (var7 != null) {
                if (var7.tryFocus(true, param0)) {
                  return true;
                }
                var7 = (Widget) (var6.previous(-24706));
              }
            }
            var5 = (Widget) (var4.previous(-24706));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ib.JB(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (layer == 0 &&
          this.renderer != null) {
          this.renderer.paintWidget(true, obfuscationGuard - 20607, parentX, (Widget) (this), parentY);
        }
        NodeDequeCursor var5 = new NodeDequeCursor(this.children);
        if (obfuscationGuard != -11) {
          this.children = (NodeDeque) null;
        }
        Widget var6 = (Widget) (var5.last(true));
        while (var6 != null) {
          var6.drawLayer(this.y + parentY, this.x + parentX, layer, (byte) -11);
          var6 = (Widget) (var5.previous(obfuscationGuard - 24695));
        }
    }

    final void addChild(Widget child, boolean obfuscationGuard) {
        try {
          this.children.addLast(child, (byte) 3);
          if (!obfuscationGuard) {
            field_F = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ib.IB(" + (child != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final void g(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.children);
        int var3 = -77 % ((param0 - 69) / 46);
        Widget var4 = (Widget) (var2.first(240));
        while (var4 != null) {
          var4.relayout(1);
          var4 = (Widget) (var2.next(7));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, Widget param5, int param6) {
        NodeDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        Widget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = new NodeDequeCursor(this.children);
          var9 = (Widget) (var8.first(240));
          while (var9 != null) {
            if (var9.isLinked(0)) {
              if (var9.isFocused(-65) &&
                var9.a(param0, param1, param2, -126, param4, param5, param6)) {
                return true;
              }
              var9 = (Widget) (var8.next(7));
              continue;
            }
            break;
          }
          if (param3 < -125) {
            return false;
          }
          this.children = (NodeDeque) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ib.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_F = null;
        int var1 = -92 / ((param0 + 2) / 38);
        rankingLosses = null;
        field_C = null;
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        NodeDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        Widget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = new NodeDequeCursor(this.children);
          if (obfuscationGuard != 0) {
            return true;
          }
          var9 = (Widget) (var8.first(240));
          while (var9 != null) {
            if (var9.isLinked(obfuscationGuard ^ 0)) {
              if (!var9.handlePointerPress(focusRoot, pointerX, parentX + this.x, this.y + parentY, button, pointerY, 0)) {
                var9 = (Widget) (var8.next(7));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ib.MA(");
          if (focusRoot == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        RuntimeException runtimeException = null;
        NodeDequeCursor var7 = null;
        Widget var8 = null;
        int var9 = 0;
        StringBuilder var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = new NodeDequeCursor(this.children);
          var8 = (Widget) (var7.first(240));
          if (obfuscationGuard != 19223) {
            var10 = (StringBuilder) null;
            this.a(-102, (Hashtable) null, 23, (StringBuilder) null);
          }
          while (var8 != null) {
            if (var8.isLinked(0)) {
              var8.handlePointerRelease(pointerY, pointerX, parentY + this.y, focusRoot, 19223, parentX + this.x);
              var8 = (Widget) (var7.next(7));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ib.GA(").append(pointerY).append(',').append(pointerX).append(',').append(parentY).append(',');
          if (focusRoot == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 8; var2_int++) {
            if (param0[var2_int] != 0) {
              return true;
            }
          }
          if (param1 != -1) {
            WidgetGroup.a(89, false, 71, 122, false, 9, -88);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ib.KB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(StringBuilder param0, int param1, byte param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        NodeDequeCursor var5 = null;
        Widget var6 = null;
        int var8 = 0;
        Widget var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = new NodeDequeCursor(this.children);
          var6 = (Widget) (var5.first(240));
          while (var6 != null) {
            discarded$2 = param0.append('\n');
            for (var7 = 0; param1 >= var7; var7++) {
              discarded$3 = param0.append(' ');
            }
            var6.a(param1 + 1, param3, 24, param0);
            var6 = (Widget) (var5.next(7));
          }
          if (param2 <= 52) {
            var9 = (Widget) null;
            this.a((Widget) null, (byte) -19);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ib.MB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7;
        int var8;
        int var9_int;
        RgbSprite var9;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var7 = 0;
        param3 = (1414 + param3) % 1414;
        var8 = 0;
        if (284 >= param3) {
          var8 = 5;
          var7 = 11 + param3;
        }
        param3 -= 284;
        if (param3 > 0 &&
          param3 <= 5) {
          var9_int = 2048 * param3 / 5;
          var7 = 295 + (3 * InteractiveGameClient.sine8192(var9_int, -4097) >> 16);
          var8 = -(3 * BrickABrac.cosine8192(2048, var9_int) >> 16) + 8;
        }
        if (param1) {
          return;
        }
        param3 -= 5;
        if (param3 > 0 &&
          param3 <= 413) {
          var7 = 298;
          var8 = param3 + 8;
        }
        param3 -= 413;
        if (param3 > 0 &&
          param3 <= 5) {
          var9_intLifetime1 = param3 * 2048 / 5;
          var7 = 295 + (3 * BrickABrac.cosine8192(2048, var9_intLifetime1) >> 16);
          var8 = (InteractiveGameClient.sine8192(var9_intLifetime1, -4097) * 3 >> 16) + 421;
        }
        param3 -= 5;
        if (0 < param3 &&
          param3 <= 284) {
          var7 = 295 - param3;
          var8 = 424;
        }
        param3 -= 284;
        if (0 < param3 &&
          param3 <= 5) {
          var9_intLifetime2 = param3 * 2048 / 5;
          var7 = -(3 * InteractiveGameClient.sine8192(var9_intLifetime2, -4097) >> 16) + 11;
          var8 = 421 + (BrickABrac.cosine8192(2048, var9_intLifetime2) * 3 >> 16);
        }
        param3 -= 5;
        if (param3 > 0 &&
          param3 <= 413) {
          var7 = 8;
          var8 = 421 - param3;
        }
        param3 -= 413;
        if (param3 > 0) {
          var9_intLifetime3 = 2048 * param3 / 5;
          var7 = 11 - (3 * BrickABrac.cosine8192(2048, var9_intLifetime3) >> 16);
          var8 = 8 - (InteractiveGameClient.sine8192(var9_intLifetime3, -4097) * 3 >> 16);
        }
        var9 = tf.trackHeads[param0];
        param6 = param6 + (-(var9.canvasWidth / 2) + var7);
        param5 = param5 + (-(var9.canvasHeight / 2) + var8);
        if (param4) {
          SoftwareFramebuffer.a(-111, param5, param6, MusicVoiceMixer.field_n[param0]);
          BoundedFile.field_a[param0].f(param6, param5, 256);
        }
        var9.drawTransparent(param6, param5);
        return;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2 + 1595637968, param0, param1)) {
            this.a(param1, param0, 0, param3);
            this.a(param3, param0, (byte) 104, param1);
          }
          if (param2 != 24) {
            this.children = (NodeDeque) null;
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ib.UA(").append(param0).append(',');
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

    final boolean isFocused(int obfuscationGuard) {
        if (obfuscationGuard > -49) {
          this.g(4);
        }
        return this.g((byte) -3) != null ? true : false;
    }

    WidgetGroup(int x, int y, int width, int height, WidgetRenderer renderer) {
        super(x, y, width, height, renderer, (WidgetListener) null);
        this.children = new NodeDeque();
    }

    Widget g(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.children);
        Widget var3 = (Widget) (var2.first(240));
        while (var3 != null) {
          if (var3.isFocused(-83)) {
            return var3;
          }
          var3 = (Widget) (var2.next(7));
        }
        if (param0 == -3) {
          return null;
        }
        Widget var5 = (Widget) null;
        this.updatePointer((Widget) null, (byte) -16, -70, 95);
        return null;
    }

    String getTooltip(int obfuscationGuard) {
        NodeDequeCursor var2;
        Widget var3;
        String var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = new NodeDequeCursor(this.children);
        if (obfuscationGuard < 6) {
          return (String) null;
        }
        var3 = (Widget) (var2.first(240));
        while (var3 != null) {
          var4 = var3.getTooltip(37);
          if (var4 != null) {
            return var4;
          }
          var3 = (Widget) (var2.next(7));
        }
        return null;
    }

    boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        Widget var9 = null;
        NodeDequeCursor var10 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = new NodeDequeCursor(this.children);
          var9 = (Widget) (var10.first(obfuscationGuard + 130));
          while (var9 != null) {
            if (var9.isLinked(0)) {
              if (var9.isFocused(-118) &&
                var9.handleWidgetKey(keyCode, (byte) 110, focusRoot, character)) {
                return true;
              }
              var9 = (Widget) (var10.next(obfuscationGuard ^ 105));
              continue;
            }
            break;
          }
          if (obfuscationGuard != 110) {
            var8 = (StringBuilder) null;
            this.a(87, (Hashtable) null, -4, (StringBuilder) null);
          }
          var6 = keyCode;
          if (var6 != 80) {
            return false;
          }
          if (IntArrayRequest.heldKeys[81]) {
            stackIn_17_0 = this.b(focusRoot, (byte) -118);
          } else {
            stackIn_17_0 = this.a(focusRoot, (byte) -128);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ib.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(character).append(')').toString());
        }
    }

    final void clearFocus(boolean obfuscationGuard) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard) {
          WidgetGroup.f((byte) 29);
        }
        NodeDequeCursor var2 = new NodeDequeCursor(this.children);
        Widget var3 = (Widget) (var2.first(240));
        while (var3 != null) {
          var3.clearFocus(false);
          var3 = (Widget) (var2.next(7));
        }
    }

    void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.g(116);
    }

    final int e(byte param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = -70 % ((-17 - param0) / 43);
        int var2 = 0;
        NodeDequeCursor var4 = new NodeDequeCursor(this.children);
        Widget var5 = (Widget) (var4.first(240));
        while (var5 != null) {
          var6 = var5.e((byte) -86);
          if (var6 > var2) {
            var2 = var6;
          }
          var5 = (Widget) (var4.next(7));
        }
        return var2;
    }

    final boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        NodeDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        Widget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = new NodeDequeCursor(this.children);
          if (!obfuscationGuard) {
            return true;
          }
          var4 = (Widget) (var3.first(240));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.tryFocus(obfuscationGuard, focusRoot)) {
              var4 = (Widget) (var3.next(7));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ib.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        RuntimeException runtimeException = null;
        NodeDequeCursor var5 = null;
        Widget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          var5 = new NodeDequeCursor(this.children);
          var6 = (Widget) (var5.first(240));
          while (var6 != null) {
            if (var6.isLinked(obfuscationGuard + 0)) {
              var6.updatePointer(focusRoot, (byte) 0, this.x + parentX, this.y + parentY);
              var6 = (Widget) (var5.next(7));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ib.WA(");
          if (focusRoot == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    static {
        field_C = "You have 1 unread message!";
        field_F = "Loading graphics";
    }
}
