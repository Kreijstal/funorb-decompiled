/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidgetContainer extends SingleChildWidgetContainer {
    private int returnX;
    private boolean returnAfterDrag;
    static String field_R;
    static String field_K;
    private int pressOffsetY;
    private boolean childPressPreventsDrag;
    private int pressOffsetX;
    static RgbSprite[] field_Q;
    static RgbSprite field_J;
    private int returnY;

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.pointerPressed(pointerX, originX, originY, 108, rootWidget, pointerY, button) ? 1 : 0;
          if (obfuscationGuard < 103) {
            this.pressOffsetX = 62;
          }
          if (var8_int != 0 &&
            this.childPressPreventsDrag) {
            return true;
          }
          if (!this.containsPointer(1, originX, pointerY, pointerX, originY)) {
            stackIn_8_0 = var8_int;
            return stackIn_8_0 != 0;
          }
          if (1 == button) {
            this.pressOffsetY = -this.y + (pointerY - originY);
            bn.draggedWidget = this;
            this.pressOffsetX = -originX - this.x + pointerX;
          }
          this.pressedButton = button;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("wc.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        int previousX = 0;
        int returnStepX = 0;
        int previousY = 0;
        int returnStepY = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int pointerXOrReturnDelta = 0;
        RuntimeException failure = null;
        int pointerY = 0;
        try {
          if ((!(this.child instanceof InteractiveWidget) ||
            ((InteractiveWidget) (this.child)).enabled) &&
            this.pressedButton == 1) {
            pointerXOrReturnDelta = -originX + (AiPlanningStrategy.pointerX - this.pressOffsetX);
            pointerY = -this.pressOffsetY + (ko.pointerY - originY);
            if (this.x != pointerXOrReturnDelta ||
              this.y != pointerY) {
              this.x = pointerXOrReturnDelta;
              this.y = pointerY;
              if (this.listener instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.listener)).widgetDragged(this, originY, obfuscationGuard ^ -32678, originX);
              }
            }
          } else {
            if (!this.returnAfterDrag) {
              super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
              return;
            }
            if (this.returnX != this.x) {
              pointerXOrReturnDelta = -this.x + this.returnX;
              previousX = this.x;
              if (2 < Math.abs(pointerXOrReturnDelta)) {
                returnStepX = pointerXOrReturnDelta >> 1;
              } else {
                if (pointerXOrReturnDelta > 0) {
                  returnStepX = 1;
                } else {
                  returnStepX = -1;
                }
              }
              this.x = previousX + returnStepX;
            }
            if (this.y != this.returnY) {
              pointerXOrReturnDelta = -this.y + this.returnY;
              previousY = this.y;
              if (2 < Math.abs(pointerXOrReturnDelta)) {
                returnStepY = pointerXOrReturnDelta >> 1;
              } else {
                if (pointerXOrReturnDelta <= 0) {
                  returnStepY = -1;
                } else {
                  returnStepY = 1;
                }
              }
              this.y = previousY + returnStepY;
            }
          }
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_31_0 = failure;
          stackIn_31_1 = new StringBuilder().append("wc.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_R = null;
        field_K = null;
        field_J = null;
        if (param0 != 0) {
          field_K = (String) null;
        }
        field_Q = null;
    }

    final static void a(boolean param0, int param1) {
        LinkButtonPainter.a(param0, false, 108);
        if (param1 != -49) {
          field_J = (RgbSprite) null;
        }
    }

    final static GameClock createGameClock(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          field_R = (String) null;
        }
        return (GameClock) ((Object) new NanoGameClock());
    }

    final void layoutChild(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.returnX = -119;
        }
        super.layoutChild(obfuscationGuard);
        this.child.setBounds(0, this.width, 0, 8192, this.height);
        this.returnY = this.y;
        this.returnX = this.x;
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        try {
          int var7_int = -116 / ((-58 - obfuscationGuard) / 53);
          super.pointerReleased(originY, rootWidget, pointerX, (byte) 73, pointerY, originX);
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wc.JA(" + originY + ',' + (rootWidget != null ? "{...}" : "null") + ',' + pointerX + ',' + obfuscationGuard + ',' + pointerY + ',' + originX + ')');
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 26477) {
            this.returnAfterDrag = false;
          }
          if (this.a(param3, param0, (byte) 61, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, param0, -56, param1);
            discarded$62 = param1.append(" revert=").append(this.returnAfterDrag);
            if (2147483647 != this.returnX &&
              this.returnY != 2147483647) {
              discarded$63 = param1.append(" to ").append(this.returnX).append(',').append(this.returnY);
            }
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wc.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          return;
        }
        if (null != DialogMessagePane.field_I) {
          op.a(-116, DialogMessagePane.field_I);
        }
        if (null != tn.activeContextMenu) {
          tn.activeContextMenu.draw((byte) -108, param0);
        }
        SummonRequest.a(param0, (byte) -89);
        if (Spell.field_b != null) {
          Spell.field_b.draw(param0, 20);
        }
        qh.a(param0, 0);
    }

    DraggableWidgetContainer(int x, int y, int width, int height, WidgetPainter painter, WidgetListener listener, Widget child, boolean returnAfterDrag, boolean childPressPreventsDrag) {
        super(x, y, width, height, painter, listener);
        this.returnX = 2147483647;
        this.returnY = 2147483647;
        try {
          this.returnAfterDrag = returnAfterDrag ? true : false;
          this.childPressPreventsDrag = childPressPreventsDrag ? true : false;
          this.child = child;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wc.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (painter != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ',' + returnAfterDrag + ',' + childPressPreventsDrag + ')');
        }
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_long = (long)param1;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + (var6 - 65));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + (var6 - 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("wc.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_K = "Public chat is unavailable while setting up a rated game.";
        field_R = "Kick <%0> from this game";
    }
}
