/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int field_D;
    private int field_F;
    private boolean field_G;
    static HiscorePlayerName[] field_B;
    private int field_H;
    static String closeText;
    private int field_J;
    private boolean field_C;
    static String[] achievementDescriptions;
    static String backText;
    static AccountServiceResult field_z;

    final StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            this.field_C = true;
          }
          if (this.beginDebugDescription(indent, visited, 115, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
            this.appendChildDebugTree(indent, output, visited, (byte) -43);
            discarded$64 = output.append(" revert=").append(this.field_G);
            if (this.field_F != 2147483647 &&
              2147483647 != this.field_D) {
              discarded$65 = output.append(" to ").append(this.field_F).append(',').append(this.field_D);
            }
          }
          stackIn_7_0 = (StringBuilder) (output);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("jh.S(").append(indent).append(',');
          if (visited == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (output == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        try {
          super.onPointerReleased(root, guard, parentX, pointerY, pointerX, parentY);
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jh.T(" + (root != null ? "{...}" : "null") + ',' + guard + ',' + parentX + ',' + pointerY + ',' + pointerX + ',' + parentY + ')');
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        int stackIn_13_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        try {
          if ((!(this.child instanceof InteractiveWidget) ||
            ((InteractiveWidget) (this.child)).enabled) &&
            this.pressedButton == 1) {
            var5_int = -parentX - this.field_H + PointLight.mouseX;
            var6 = -parentY - this.field_J + ArenaDefinitionCodec.field_e;
            if (var5_int != this.x ||
              this.y != var6) {
              this.x = var5_int;
              this.y = var6;
              if (this.listener instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.listener)).onDrag(this, parentX, -18285, parentY);
              }
            }
          } else {
            if (this.field_G) {
              if (this.field_F != this.x) {
                var5_int = this.field_F - this.x;
                stackIn_13_1 = this.x;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_16_2 = -1;
                  } else {
                    stackIn_16_2 = 1;
                  }
                } else {
                  stackIn_16_2 = var5_int >> 1;
                }
                this.x = stackIn_13_1 + stackIn_16_2;
              }
              if (this.field_D != this.y) {
                var5_int = -this.y + this.field_D;
                stackIn_23_1 = this.y;
                if (2 < Math.abs(var5_int)) {
                  stackIn_24_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_24_2 = -1;
                  } else {
                    stackIn_24_2 = 1;
                  }
                }
                this.y = stackIn_23_1 + stackIn_24_2;
              }
            }
          }
          var5_intLifetime1 = -5 % ((-25 - guard) / 45);
          super.update(parentX, 89, root, parentY);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("jh.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(parentY).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_B = null;
        if (param0 == -1) {
          field_z = null;
          closeText = null;
          achievementDescriptions = null;
          backText = null;
          return;
        }
        field_z = (AccountServiceResult) null;
        field_z = null;
        closeText = null;
        achievementDescriptions = null;
        backText = null;
    }

    DraggableWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_F = 2147483647;
        this.field_D = 2147483647;
        try {
          this.field_C = param8 ? true : false;
          this.field_G = param7 ? true : false;
          this.child = param6;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.onPointerPressed(root, -79, pointerY, button, parentX, pointerX, parentY) ? 1 : 0;
          if (guard >= -42) {
            this.field_H = 88;
          }
          if (var8_int != 0 &&
            this.field_C) {
            return true;
          }
          if (!this.containsPoint(pointerX, -1, parentX, pointerY, parentY)) {
            stackIn_8_0 = var8_int;
            return stackIn_8_0 != 0;
          }
          if (button == 1) {
            MessageDialog.field_gb = this;
            this.field_H = -parentX + (-this.x + pointerX);
            this.field_J = -parentY + (pointerY - this.y);
          }
          this.pressedButton = button;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("jh.R(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final void layoutChild(boolean guard) {
        super.layoutChild(guard);
        this.child.setBounds(-111, 0, 0, this.height, this.width);
        this.field_F = this.x;
        this.field_D = this.y;
        if (guard) {
          UiWidget var3 = (UiWidget) null;
          this.onPointerPressed((UiWidget) null, 44, -30, 20, 44, -100, 90);
        }
    }

    static {
        int var0 = 0;
        field_B = new HiscorePlayerName[255];
        closeText = "Close";
        for (var0 = 0; field_B.length > var0; var0++) {
          field_B[var0] = new HiscorePlayerName();
        }
        backText = "Back";
        achievementDescriptions = new String[]{"Complete the final level with the highest level of speed", "Complete the final level with the highest level of traction", "Complete the final level with the highest level of bounce", "Complete the game without restarting a level", "Complete 10 levels without using any temporary powerups", "Complete 5 levels without using any speed powerups", "Complete 5 levels without using any traction powerups", "Complete 5 levels without using any bounce powerups", "Last 30 seconds without bumping into anything", "Destroy at least 10 enemies by using the Energy Blast to knock them into a hazard", "On a level where there are Zap Traps, defeat all enemies by pushing them into a wall", "On a level where there are Pinball Bouncers, bounce over 15 times in 5 seconds", "Get to the maximum multiplier 5 times during the course of a game", "Kill 5 different enemies in a row", "Earn 50,000 points during one level", "On level 8, burst big enemies before little enemies", "Complete the first 10 levels", "Complete the first 10 levels without dying", "Complete the full game", "Complete the full game without dying", "Complete Easy mode with 1,000,000 points", "Complete the full game on hard mode", "Last for 1 minute in Challenge Mode", "Last for 3 minutes in Challenge Mode", "Last for 5 minutes in Challenge Mode", "Last for 1 minute in Hard Challenge Mode", "Last for 3 minutes in Hard Challenge Mode", "Last for 5 minutes in Hard Challenge Mode"};
    }
}
