/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends UiWidget {
    private boolean field_z;
    boolean field_D;
    static boolean[] field_y;
    static String field_C;
    private boolean field_A;
    boolean field_B;

    boolean pointerPressed(int param0, int param1, int param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.containsPointer(-102, param0, param6, param2, param1)) {
            this.takeFocus(107, param4);
            this.field_x = param5;
            if (this.field_k != null) {
              if (!(this.field_k instanceof WidgetPointerListener)) {
                return true;
              }
              ((WidgetPointerListener) (this.field_k)).onWidgetPointerPressed(param6, param0, param2, this, param5, param1, (byte) -124);
            }
            return true;
          }
          if (param3 <= -14) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("hl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(PlatformTaskDispatcher param0, int param1) {
        RuntimeException var2 = null;
        PlatformTaskDispatcher var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            var3 = (PlatformTaskDispatcher) null;
            InteractiveWidget.a((PlatformTaskDispatcher) null, -15);
          }
          stackIn_3_0 = param0.isFullscreenAvailable((byte) -127);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hl.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    InteractiveWidget(String param0, WidgetEventListener param1) {
        this(param0, pj.field_a.field_i, param1);
    }

    final boolean isFocused(int param0) {
        if (param0 <= 44) {
          this.field_A = false;
          return this.field_z;
        }
        return this.field_z;
    }

    void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (this.field_x != 0 &&
            DebouncedFieldValidator.field_c != this.field_x) {
            if (this.containsPointer(-47, param1, ij.field_e, eg.field_b, param0) &&
              DebouncedFieldValidator.field_c == 0) {
              this.activateFromInput(-param0 + ij.field_e, true, this.field_x, -param1 + eg.field_b);
            }
            this.pointerReleased(false, param2, eg.field_b, param1, param0, ij.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "hl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.field_A) {
            param1.blur((byte) 31);
            this.field_z = true;
            if (this.field_k != null &&
              this.field_k instanceof WidgetFocusListener) {
              ((WidgetFocusListener) (this.field_k)).onWidgetFocusChanged(62, this.field_z, (UiWidget) (this));
            }
            if (param0 > 71) {
              return true;
            }
            this.field_z = true;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    InteractiveWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        super(param0, param1, param2);
        this.field_z = false;
        this.field_A = true;
        this.field_B = true;
    }

    final void blur(byte param0) {
        if (param0 <= 27) {
          return;
        }
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (null == this.field_k) {
          return;
        }
        if (!(this.field_k instanceof WidgetFocusListener)) {
          return;
        }
        ((WidgetFocusListener) (this.field_k)).onWidgetFocusChanged(81, this.field_z, (UiWidget) (this));
    }

    final void pointerReleased(boolean param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        if (param0) {
          return;
        }
        try {
          if (this.field_k != null &&
            this.field_k instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.field_k)).onWidgetPointerReleased(param4, -32051, param5, this, param3, param2);
          }
          this.field_x = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "hl.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isFocused(123) && (param2 == 84 ||
            param2 == 83)) {
            this.activateFromInput(-1, true, 1, -1);
            return true;
          }
          if (param1 < -99) {
            return false;
          }
          var6 = (ResourceArchive) null;
          InteractiveWidget.a((ResourceArchive) null, -100, -63, -51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hl.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_C = null;
        field_y = null;
        if (param0 > -33) {
          InteractiveWidget.clearDeclaredStaticReferences((byte) -15);
        }
    }

    final StringBuilder appendDebugTree(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_z = false;
          }
          if (this.beginDebugTreeEntry(param3, param2, param1, param0)) {
            this.appendDebugProperties(param0, (byte) -16, param3, param2);
            if (this.field_D) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param3.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hl.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    void activateFromInput(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          return;
        }
        if (this.field_k == null) {
          return;
        }
        if (this.field_k instanceof WidgetActivationListener) {
          ((WidgetActivationListener) (this.field_k)).onWidgetActivated(param0, 23, param2, this, param3);
          return;
        }
    }

    final static RgbSprite[] a(ResourceArchive param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RgbSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 57 / ((param1 - 0) / 50);
          if (tc.a(param3, param2, 25479, param0)) {
            stackIn_4_0 = pf.a(111);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (RgbSprite[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("hl.WA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected InteractiveWidget() {
        this.field_z = false;
        this.field_A = true;
        this.field_B = true;
        this.field_v = pj.field_a.field_n;
    }

    static {
        field_C = "Passwords can only contain letters and numbers";
    }
}
