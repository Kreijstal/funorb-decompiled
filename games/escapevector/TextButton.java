/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class TextButton extends UiComponent {
    static int[] field_C;
    boolean selected;
    private boolean focused;
    boolean enabled;
    private boolean tabStop;

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          int var7 = EscapeVector.obfuscationControl;
          try {
            if (an.field_a) {
              return true;
            }
            try {
              String var2 = "tuhstatbut";
              if (param0) {
                return false;
              }
              String var3 = (String) (JavaScriptBridge.callWindowFunction(param1, "getcookies", -29155));
              String[] var4 = ModalPanel.splitString(-128, var3, ';');
              for (int var5 = 0; var4.length > var5; var5++) {
                int var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2_ref = decompiledCaughtException;
            }
            boolean stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_22_0 = var2_ref2;
            StringBuilder stackIn_22_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_13_2 = null;
        try {
          if (guard <= 0) {
            this.isFocused(-2);
          }
          if (this.isFocused(0) && (keyCode == 84 ||
            83 == keyCode)) {
            this.notifyAction(-19646, -1, -1, 1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("hc.G(");
          if (root == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          if (guard != -14472) {
            field_C = (int[]) null;
          }
          super.updateHover(guard ^ 0, offsetY, offsetX, root);
          if (this.field_t != 0) {
            if (DialWidget.field_K == this.field_t) {
              return;
            }
            if (this.hitTest(dh.field_d, UiContainer.field_y, offsetX, (byte) 97, offsetY) &&
              DialWidget.field_K == 0) {
              this.notifyAction(-19646, UiContainer.field_y - offsetY, -offsetX + dh.field_d, this.field_t);
            }
            this.onPointerReleased(UiContainer.field_y, offsetX, dh.field_d, offsetY, root, (byte) 15);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hc.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    final void onPointerReleased(int pointerY, int offsetY, int pointerX, int offsetX, UiComponent root, byte guard) {
        try {
          int var7_int = -18 % ((guard + 39) / 45);
          if (this.listener != null &&
            this.listener instanceof ButtonPointerListener) {
            ((ButtonPointerListener) (this.listener)).onPointerReleased(pointerX, this, offsetX, (byte) 114, offsetY, pointerY);
          }
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hc.MA(" + pointerY + ',' + offsetY + ',' + pointerX + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    boolean focusNext(int guard, UiComponent root) {
        String stackIn_15_2 = null;
        try {
          if (this.enabled &&
            this.tabStop) {
            root.clearFocus(93);
            this.focused = true;
            if (guard != -4659) {
              this.selected = true;
            }
            if (this.listener != null &&
              this.listener instanceof WidgetFocusListener) {
              ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, guard ^ -4679, (UiComponent) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var3;
          StringBuilder stackIn_14_1 = new StringBuilder().append("hc.M(").append(guard).append(',');
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    TextButton(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        this.focused = false;
        this.tabStop = true;
        this.enabled = true;
    }

    final void clearFocus(int guard) {
        if (!this.focused) {
          if (guard > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        this.focused = false;
        if (null == this.listener) {
          if (guard > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        if (!(this.listener instanceof WidgetFocusListener)) {
          if (guard > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, 117, (UiComponent) (this));
        if (guard > 46) {
          return;
        }
        field_C = (int[]) null;
    }

    final StringBuilder appendDebugTree(int guard, Hashtable visited, StringBuilder output, int depth) {
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (guard != 0) {
            UiComponent var6 = (UiComponent) null;
            this.onPointerPressed(-48, 8, (byte) 115, -28, 107, (UiComponent) null, -53);
          }
          if (this.beginDebugDescription(depth, visited, output, false)) {
            this.appendDebugBody(visited, output, depth, 1);
            if (this.selected) {
              StringBuilder discarded$2 = output.append(" active");
            }
            if (!this.enabled) {
              StringBuilder discarded$3 = output.append(" disabled");
            }
          }
          StringBuilder stackIn_10_0 = (StringBuilder) (output);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("hc.AA(").append(guard).append(',');
          if (visited == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (output == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(depth).append(')').toString());
        }
    }

    TextButton(String param0, UiListener param1) {
        this(param0, mb.field_g.buttonPainter, param1);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 64) {
          TextButton.releaseStatics(54);
          return EditableTextWidget.a(500, param0, 123);
        }
        return EditableTextWidget.a(500, param0, 123);
    }

    void notifyAction(int guard, int localY, int localX, int buttonCode) {
        if (guard != -19646) {
          this.tabStop = false;
          if (null == this.listener) {
            return;
          }
          if (this.listener instanceof ButtonListener) {
            ((ButtonListener) (this.listener)).onAction(this, buttonCode, localY, 1, localX);
            return;
          }
          return;
        }
        if (null == this.listener) {
          return;
        }
        if (this.listener instanceof ButtonListener) {
          ((ButtonListener) (this.listener)).onAction(this, buttonCode, localY, 1, localX);
          return;
        }
    }

    public static void releaseStatics(int guard) {
        field_C = null;
        if (guard != 1) {
          TextButton.releaseStatics(-28);
        }
    }

    final boolean isFocused(int guard) {
        if (guard != 0) {
          this.enabled = false;
          return this.focused;
        }
        return this.focused;
    }

    boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_15_2 = null;
        try {
          if (this.enabled &&
            this.hitTest(pointerX, pointerY, offsetX, (byte) 83, offsetY)) {
            this.focusNext(-4659, root);
            this.field_t = button;
            if (this.listener != null) {
              if (!(this.listener instanceof ButtonPointerListener)) {
                return true;
              }
              ((ButtonPointerListener) (this.listener)).onPointerPressed(offsetX, this, pointerX, offsetY, button, (byte) 105, pointerY);
            }
            return true;
          }
          if (guard != 3) {
            TextButton.releaseStatics(15);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var8;
          StringBuilder stackIn_14_1 = new StringBuilder().append("hc.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(button).append(')').toString());
        }
    }

    protected TextButton() {
        this.focused = false;
        this.tabStop = true;
        this.enabled = true;
        this.painter = mb.field_g.field_b;
    }

    static {
        field_C = new int[128];
    }
}
