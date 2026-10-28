/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildContainer {
    private int field_J;
    static PcmSample field_M;
    private int field_L;
    static int[] field_D;
    static TrackerMusicPlayer field_N;
    private int field_I;
    private boolean field_P;
    static String field_K;
    static int field_O;
    private int field_H;
    static boolean field_F;
    static String field_G;
    private boolean field_E;

    final void onPointerReleased(int pointerY, int offsetY, int pointerX, int offsetX, UiComponent root, byte guard) {
        try {
          super.onPointerReleased(pointerY, offsetY, pointerX, offsetX, root, (byte) -96);
          this.field_t = 0;
          int var7_int = 58 % ((-39 - guard) / 45);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ni.MA(" + pointerY + ',' + offsetY + ',' + pointerX + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard < -90) {
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        }
        field_F = false;
        field_M = null;
        field_K = null;
        field_D = null;
        field_G = null;
        field_N = null;
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5, UiComponent param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_I = 2147483647;
        try {
          this.field_P = param8 ? true : false;
          this.child = param6;
          this.field_E = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder appendDebugTree(int guard, Hashtable visited, StringBuilder output, int depth) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (guard != 0) {
            field_O = 81;
          }
          if (this.beginDebugDescription(depth, visited, output, false)) {
            this.appendDebugBody(visited, output, depth, 1);
            this.appendChildDebugTree(depth, (byte) 95, visited, output);
            StringBuilder discarded$62 = output.append(" revert=").append(this.field_E);
            if (this.field_H != 2147483647 &&
              2147483647 != this.field_I) {
              StringBuilder discarded$63 = output.append(" to ").append(this.field_H).append(',').append(this.field_I);
            }
          }
          StringBuilder stackIn_9_0 = (StringBuilder) (output);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ni.AA(").append(guard).append(',');
          if (visited == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (output == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(depth).append(')').toString());
        }
    }

    final void layoutChild(int guard) {
        if (guard == -6844) {
          super.layoutChild(guard + 0);
          this.child.setBounds(this.width, 0, 0, true, this.height);
          this.field_I = this.y;
          this.field_H = this.x;
          return;
        }
    }

    final boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_14_2 = null;
        try {
          boolean var8_int = (super.onPointerPressed(offsetY, pointerX, guard, pointerY, offsetX, root, button));
          if (var8_int &&
            this.field_P) {
            return true;
          }
          if (!this.hitTest(pointerX, pointerY, offsetX, (byte) 97, offsetY)) {
            boolean stackIn_6_0 = var8_int;
            return (stackIn_6_0);
          }
          this.field_t = button;
          if (button != 1) {
            return true;
          }
          this.field_J = -this.x + (pointerX - offsetX);
          this.field_L = -this.y + (pointerY - offsetY);
          gf.field_b = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var8;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ni.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(button).append(')').toString());
        }
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        int stackIn_16_2 = 0;
        int stackIn_24_2 = 0;
        String stackIn_30_2 = null;
        int var5_int = 0;
        try {
          if ((!(this.child instanceof TextButton) ||
            ((TextButton) (this.child)).enabled) &&
            this.field_t == 1) {
            var5_int = -this.field_J + dh.field_d - offsetX;
            int var6 = -offsetY - this.field_L + UiContainer.field_y;
            if (var5_int != this.x ||
              this.y != var6) {
              this.y = var6;
              this.x = var5_int;
              if (this.listener instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.listener)).onDragged(this, offsetY, offsetX, 32468);
              }
            }
          } else if (this.field_E) {
            if (this.x != this.field_H) {
              var5_int = -this.x + this.field_H;
              int stackIn_13_1 = this.x;
              if (!(Math.abs(var5_int) <= 2)) {
                stackIn_16_2 = var5_int >> 1;
              } else if (var5_int <= 0) {
                stackIn_16_2 = -1;
              } else {
                stackIn_16_2 = 1;
              }
              this.x = stackIn_13_1 + stackIn_16_2;
            }
            if (this.y != this.field_I) {
              var5_int = -this.y + this.field_I;
              int stackIn_21_1 = this.y;
              if (!(Math.abs(var5_int) <= 2)) {
                stackIn_24_2 = var5_int >> 1;
              } else if (var5_int <= 0) {
                stackIn_24_2 = -1;
              } else {
                stackIn_24_2 = 1;
              }
              this.y = stackIn_21_1 + stackIn_24_2;
            }
          }
          super.updateHover(guard, offsetY, offsetX, root);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_29_0 = var5;
          StringBuilder stackIn_29_1 = new StringBuilder().append("ni.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, int[] param3) {
        String stackIn_15_2 = null;
        try {
          if (0 > param1) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param2) {
            field_O = 75;
          }
          if (param3.length <= param1) {
            int stackIn_9_0 = 0;
            return stackIn_9_0;
          }
          int var4_int = param3[param1];
          int stackIn_11_0 = EditableTextWidget.a(var4_int, param0, 112);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_K = "Connection restored.";
        field_O = -1;
        field_D = new int[8192];
        field_G = "Account created successfully!";
    }
}
