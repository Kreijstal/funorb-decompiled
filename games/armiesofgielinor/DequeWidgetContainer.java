/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class DequeWidgetContainer extends Widget implements WidgetContainerMarker {
    static AccountNameSelectionForm field_C;
    NodeDeque children;

    final int getMaximumRenderLayer(int obfuscationGuard) {
        int childLayer = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int maximumLayer = 0;
        NodeIterator iterator = new NodeIterator(this.children);
        if (obfuscationGuard != -31989) {
          this.isFocused(false);
        }
        Widget child = (Widget) (iterator.first(obfuscationGuard ^ -31943));
        while (child != null) {
          childLayer = child.getMaximumRenderLayer(-31989);
          if (childLayer > maximumLayer) {
            maximumLayer = childLayer;
          }
          child = (Widget) (iterator.next(50));
        }
        return maximumLayer;
    }

    final boolean focusNextChild(byte obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        Widget var4 = null;
        NodeIterator var5 = null;
        Widget var6 = null;
        int var7 = 0;
        NodeIterator var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children.isEmpty(false)) {
            return false;
          }
          var8 = new NodeIterator(this.children);
          if (obfuscationGuard >= -121) {
            DequeWidgetContainer.d((byte) 127);
          }
          var4 = (Widget) (var8.first(50));
          while (var4 != null) {
            if (var4.isFocused(false)) {
              var5 = new NodeIterator(this.children);
              var5.startForwardAt(var4, true);
              var6 = (Widget) (var5.next(50));
              while (var6 != null) {
                if (!var6.takeFocus(11, rootWidget)) {
                  var6 = (Widget) (var5.next(50));
                  continue;
                }
                return true;
              }
            }
            var4 = (Widget) (var8.next(50));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tj.BC(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    void blur(int obfuscationGuard) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.children);
        if (obfuscationGuard != 1) {
          field_C = (AccountNameSelectionForm) null;
        }
        Widget var3 = (Widget) (var2.first(50));
        while (var3 != null) {
          var3.blur(obfuscationGuard + 0);
          var3 = (Widget) (var2.next(50));
        }
    }

    Widget getFocusedChild(byte obfuscationGuard) {
        NodeIterator iterator;
        Widget child;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        iterator = new NodeIterator(this.children);
        if (obfuscationGuard < 24) {
          this.children = (NodeDeque) null;
        }
        child = (Widget) (iterator.first(50));
        while (child != null) {
          if (child.isFocused(false)) {
            return child;
          }
          child = (Widget) (iterator.next(50));
        }
        return null;
    }

    boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        NodeIterator var3 = null;
        RuntimeException var3_ref = null;
        Widget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = new NodeIterator(this.children);
          if (obfuscationGuard != 11) {
            return true;
          }
          var4 = (Widget) (var3.first(obfuscationGuard + 39));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.takeFocus(obfuscationGuard ^ 0, rootWidget)) {
              var4 = (Widget) (var3.next(obfuscationGuard + 39));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tj.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean focusPreviousChild(boolean obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        Widget var4 = null;
        NodeIterator var5 = null;
        Widget var6 = null;
        int var7 = 0;
        Widget var8 = null;
        NodeIterator var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard) {
            var8 = (Widget) null;
            this.handleKey((Widget) null, 21, '￘', -49);
          }
          if (this.children.isEmpty(obfuscationGuard)) {
            return false;
          }
          var9 = new NodeIterator(this.children);
          var4 = (Widget) (var9.last(50));
          while (var4 != null) {
            if (var4.isFocused(false)) {
              var5 = new NodeIterator(this.children);
              var5.startReverseAt(false, var4);
              var6 = (Widget) (var5.previous((byte) -112));
              while (var6 != null) {
                if (var6.takeFocus(11, rootWidget)) {
                  return true;
                }
                var6 = (Widget) (var5.previous((byte) -112));
              }
            }
            var4 = (Widget) (var9.previous((byte) -112));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tj.WB(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean handleWheel(int pointerX, int originX, int originY, int pointerY, int wheelDelta, int obfuscationGuard, Widget rootWidget) {
        NodeIterator iterator = null;
        RuntimeException failure = null;
        Widget child = null;
        int obfuscationControl = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          iterator = new NodeIterator(this.children);
          child = (Widget) (iterator.first(50));
          while (child != null) {
            if (child.isLinked(65280)) {
              if (child.isFocused(false) &&
                child.handleWheel(pointerX, originX, originY, pointerY, wheelDelta, 94, rootWidget)) {
                return true;
              }
              child = (Widget) (iterator.next(50));
              continue;
            }
            break;
          }
          if (obfuscationGuard > 93) {
            return false;
          }
          this.getMaximumRenderLayer(116);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_15_0 = failure;
          stackIn_15_1 = new StringBuilder().append("tj.RA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(pointerY).append(',').append(wheelDelta).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void addChild(byte obfuscationGuard, Widget child) {
        try {
          this.children.addLast((byte) -119, (IntrusiveNode) (child));
          if (obfuscationGuard != 10) {
            this.blur(-101);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tj.CC(" + obfuscationGuard + ',' + (child != null ? "{...}" : "null") + ')');
        }
    }

    String getTooltipText(int obfuscationGuard) {
        String var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.children);
        Widget var3 = (Widget) (var2.first(obfuscationGuard ^ 21434));
        while (var3 != null) {
          var4 = var3.getTooltipText(21384);
          if (var4 != null) {
            return var4;
          }
          var3 = (Widget) (var2.next(50));
        }
        if (obfuscationGuard == 21384) {
          return null;
        }
        this.children = (NodeDeque) null;
        return null;
    }

    boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        NodeIterator iterator = null;
        RuntimeException failure = null;
        Widget child = null;
        int obfuscationControl = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 103) {
            field_C = (AccountNameSelectionForm) null;
          }
          iterator = new NodeIterator(this.children);
          child = (Widget) (iterator.first(50));
          while (child != null) {
            if (child.isLinked(65280)) {
              if (child.pointerPressed(pointerX, this.x + originX, this.y + originY, 107, rootWidget, pointerY, button)) {
                return true;
              }
              child = (Widget) (iterator.next(50));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_15_0 = failure;
          stackIn_15_1 = new StringBuilder().append("tj.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    boolean isFocused(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.children = (NodeDeque) null;
        }
        return null != this.getFocusedChild((byte) 94) ? true : false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 26477) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, param0, (byte) 96, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, 81, param1, param0);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tj.OA(").append(param0).append(',');
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, obfuscationGuard ^ 0, height);
        if (obfuscationGuard != 8192) {
          field_C = (AccountNameSelectionForm) null;
        }
        this.refreshChildLayouts(0);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        NodeIterator var5 = null;
        Widget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = new NodeIterator(this.children);
          var6 = (Widget) (var5.first(50));
          if (param1 != 81) {
            return;
          }
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(1 + param3, param2, 26477, param0);
            var6 = (Widget) (var5.next(50));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("tj.UB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        RuntimeException runtimeException = null;
        NodeIterator var7 = null;
        int var8 = 0;
        Widget var9 = null;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = new NodeIterator(this.children);
          var8 = -73 / ((-58 - obfuscationGuard) / 53);
          var9 = (Widget) (var7.first(50));
          while (var9 != null) {
            if (var9.isLinked(65280)) {
              var9.pointerReleased(this.y + originY, rootWidget, pointerX, (byte) -112, pointerY, originX + this.x);
              var9 = (Widget) (var7.next(50));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("tj.JA(").append(originY).append(',');
          if (rootWidget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(pointerX).append(',').append(obfuscationGuard).append(',').append(pointerY).append(',').append(originX).append(')').toString());
        }
    }

    boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Widget var8 = null;
        NodeIterator var9 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = new NodeIterator(this.children);
          var8 = (Widget) (var9.first(50));
          while (var8 != null) {
            if (var8.isLinked(65280)) {
              if (var8.isFocused(false) &&
                var8.handleKey(rootWidget, keyCode, character, -12215)) {
                return true;
              }
              var8 = (Widget) (var9.next(50));
              continue;
            }
            break;
          }
          var6 = keyCode;
          if (var6 != 80) {
            if (obfuscationGuard == -12215) {
              return false;
            }
            this.children = (NodeDeque) null;
            return false;
          }
          if (!br.heldKeys[81]) {
            stackIn_13_0 = this.focusNextChild((byte) -123, rootWidget);
          } else {
            stackIn_13_0 = this.focusPreviousChild(false, rootWidget);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("tj.F(");
          if (rootWidget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        RuntimeException runtimeException = null;
        NodeIterator var5 = null;
        Widget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          var5 = new NodeIterator(this.children);
          var6 = (Widget) (var5.first(50));
          while (var6 != null) {
            if (var6.isLinked(obfuscationGuard + 32558)) {
              var6.updatePointer(32722, this.x + originX, originY + this.y, rootWidget);
              var6 = (Widget) (var5.next(50));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("tj.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void refreshChildLayouts(int obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator iterator = new NodeIterator(this.children);
        Widget child = (Widget) (iterator.first(50));
        if (obfuscationGuard != 0) {
          return;
        }
        while (child != null) {
          child.refreshLayout(0);
          child = (Widget) (iterator.next(50));
        }
    }

    DequeWidgetContainer(int x, int y, int width, int height, WidgetPainter painter) {
        super(x, y, width, height, painter, (WidgetListener) null);
        this.children = new NodeDeque();
    }

    public static void d(byte param0) {
        if (param0 != -89) {
          DequeWidgetContainer.j(114);
        }
        field_C = null;
    }

    void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 == renderLayer &&
          null != this.painter) {
          this.painter.paintWidget((Widget) (this), originX, -94, true, originY);
        }
        NodeIterator iterator = new NodeIterator(this.children);
        Widget child = (Widget) (iterator.last(50));
        while (child != null) {
          child.drawWidget(originX + this.x, this.y + originY, (byte) -101, renderLayer);
          child = (Widget) (iterator.previous((byte) -112));
        }
        if (obfuscationGuard >= -82) {
          this.refreshChildLayouts(108);
        }
    }

    final static void j(int param0) {
        try {
          int var2 = 0;
          IOException iOException = null;
          int var1_int = 0;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var3 = null;
          var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (ScrollWidgetContainer.field_T != null) {
              ScrollWidgetContainer.field_T.close(-5758);
            }
            if (MapRepository.field_h != null) {
              MapRepository.field_h.stop((byte) -117);
            }
            if (null != SpellMenuGroup.field_b) {
              try {
                SpellMenuGroup.field_b.close((byte) 81);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            var1_int = -99 % ((param0 + 48) / 58);
            if (null != mu.field_b) {
              for (var2 = 0; var2 < mu.field_b.length; var2++) {
                if (null != mu.field_b[var2]) {
                  try {
                    mu.field_b[var2].close((byte) 81);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "tj.AC(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
