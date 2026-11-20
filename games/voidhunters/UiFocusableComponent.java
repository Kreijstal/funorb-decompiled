/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiFocusableComponent extends UiComponent {
    static Widget field_w;
    boolean enabled;
    private boolean focused;
    static gj field_A;
    int activatedButton;
    private boolean focusable;
    static String field_v;
    boolean active;

    boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.enabled) {
            return false;
          }
          if (!this.focusable) {
            return false;
          }
          param1.clearFocus((byte) -34);
          this.focused = true;
          if (param0 != 0) {
            return false;
          }
          if (this.listener != null &&
            this.listener instanceof UiFocusListener) {
            ((UiFocusListener) (this.listener)).onFocusChanged(this.focused, (UiComponent) (this), true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("htb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    UiFocusableComponent(String param0, UiListener param1) {
        this(param0, GetDebrisMax.field_s.field_a, param1);
    }

    final void handleMouseRelease(byte param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        try {
          if (this.listener != null &&
            this.listener instanceof UiPointerListener) {
            ((UiPointerListener) (this.listener)).onMouseReleased((byte) -127, this, param1, param3, param5, param2);
          }
          this.pressedButton = 0;
          int var7_int = -114 / ((52 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "htb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            this.focused = false;
          }
          if (!this.hasFocus((byte) -120)) {
            return false;
          }
          if (84 != param1 &&
            83 != param1) {
            return false;
          }
          this.fireAction(1, -1, 23015, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("htb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        UiComponent var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.enabled &&
            this.containsPoint(param2, param1, param0, param5, (byte) 22)) {
            this.requestFocus(0, param4);
            this.pressedButton = param3;
            if (null != this.listener) {
              if (!(this.listener instanceof UiPointerListener)) {
                return true;
              }
              ((UiPointerListener) (this.listener)).onMousePressed(18095, this, param5, param3, param2, param1, param0);
            }
            return true;
          }
          if (param6 > -17) {
            var9 = (UiComponent) null;
            this.requestFocus(-66, (UiComponent) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("htb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean hasFocus(byte param0) {
        if (param0 != -120) {
          return true;
        }
        return this.focused;
    }

    public static void clearSharedReferences(int param0) {
        field_w = null;
        field_A = null;
        field_v = null;
        int var1 = 31 / ((48 - param0) / 43);
    }

    UiFocusableComponent(String param0, UiRenderer param1, UiListener param2) {
        super(param0, param1, param2);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.activatedButton = 0;
    }

    UiFocusableComponent(int param0, int param1, int param2, int param3, UiRenderer param4, UiListener param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.activatedButton = 0;
    }

    final StringBuilder appendDebugTree(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(param1, param2, (byte) 116, param3)) {
            this.appendDebugProperties(111, param2, param1, param3);
            if (this.active) {
              discarded$2 = param3.append(" active");
            }
            if (!this.enabled) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (!param0) {
            stackIn_11_0 = (StringBuilder) (param3);
            return stackIn_11_0;
          }
          stackIn_9_0 = (StringBuilder) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("htb.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void clearFocus(byte param0) {
        if (!this.focused) {
          if (param0 == -34) {
            return;
          }
          this.focused = true;
          return;
        }
        this.focused = false;
        if (this.listener == null) {
          if (param0 == -34) {
            return;
          }
          this.focused = true;
          return;
        }
        if (this.listener instanceof UiFocusListener) {
          ((UiFocusListener) (this.listener)).onFocusChanged(this.focused, (UiComponent) (this), true);
          if (param0 == -34) {
            return;
          }
          this.focused = true;
          return;
        }
        if (param0 == -34) {
          return;
        }
        this.focused = true;
    }

    void fireAction(int param0, int param1, int param2, int param3) {
        if (param2 != 23015) {
          field_v = (String) null;
          this.activatedButton = param0;
          if (null == this.listener) {
            return;
          }
          if (this.listener instanceof UiActionListener) {
            ((UiActionListener) (this.listener)).onAction(11, param0, param1, this, param3);
            return;
          }
          return;
        }
        this.activatedButton = param0;
        if (null == this.listener) {
          return;
        }
        if (this.listener instanceof UiActionListener) {
          ((UiActionListener) (this.listener)).onAction(11, param0, param1, this, param3);
          return;
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.activatedButton = 0;
          if (this.pressedButton != 0 &&
            GpuVertexNormal.field_b != this.pressedButton) {
            if (this.containsPoint(uia.field_b, param1, PlayerGameData.field_b, param0, (byte) 22) &&
              GpuVertexNormal.field_b == 0) {
              this.fireAction(this.pressedButton, -param1 + PlayerGameData.field_b, 23015, uia.field_b - param0);
            }
            this.handleMouseRelease((byte) -106, param1, uia.field_b, param0, param3, PlayerGameData.field_b);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "htb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public UiFocusableComponent() {
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.activatedButton = 0;
        this.renderer = GetDebrisMax.field_s.field_q;
    }

    static {
        field_v = "s";
        field_A = new gj();
    }
}
