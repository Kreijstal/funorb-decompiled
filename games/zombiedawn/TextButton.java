/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class TextButton extends UiWidget {
    static Js5Archive field_B;
    private boolean field_A;
    static String field_y;
    boolean field_x;
    int field_z;
    private boolean field_D;
    boolean field_C;

    final void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        try {
          if (param1 <= 1) {
            UiWidget var8 = (UiWidget) null;
            this.updatePointer((UiWidget) null, (byte) -127, 26, -100);
          }
          if (null != this.field_v &&
            this.field_v instanceof ButtonPressListener) {
            ((ButtonPressListener) (this.field_v)).onButtonReleased(param0, param2, param4, param3, this, (byte) -121);
          }
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "an.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        try {
          super.updatePointer(param0, (byte) 104, param2, param3);
          this.field_z = 0;
          int var5_int = -49 % ((param1 - 46) / 42);
          if (this.field_m != 0) {
            if (this.field_m == LaserBarrier.field_R) {
              return;
            }
            if (this.containsPoint(FadingModalPanel.field_K, 21224, param2, param3, KeyStateHelpers.field_b) &&
              LaserBarrier.field_R == 0) {
              this.activate(-param3 + KeyStateHelpers.field_b, 103, -param2 + FadingModalPanel.field_K, this.field_m);
            }
            this.handlePointerRelease(param3, 25, KeyStateHelpers.field_b, FadingModalPanel.field_K, param2, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "an.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_y = null;
        field_B = null;
        if (param0 >= -110) {
          TextButton.releaseStatics(114);
        }
    }

    TextButton(String param0, WidgetListener param1) {
        this(param0, ProxySocketConnector.field_j.field_a, param1);
    }

    final boolean isFocused(int param0) {
        if (param0 != -17741) {
          return false;
        }
        return this.field_A;
    }

    boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C &&
            this.containsPoint(param3, 21224, param2, param4, param0)) {
            this.focusNext((byte) 107, param6);
            this.field_m = param5;
            if (null != this.field_v &&
              this.field_v instanceof ButtonPressListener) {
              ((ButtonPressListener) (this.field_v)).onButtonPressed(false, param2, this, param0, param4, param5, param3);
            }
            return true;
          }
          if (param1 == 1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("an.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static Sprite[] loadSpriteSheet(int param0, int param1, int param2, Js5Archive param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 118) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          if (SpriteSheetArchiveHelpers.decodeSpriteSheetFromArchive(param0, 31043, param1, param3)) {
            stackIn_7_0 = DialogLayer.buildDecodedSprites((byte) 43);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (Sprite[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("an.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    TextButton(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
    }

    boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -108 % ((-83 - param0) / 32);
          if (this.isFocused(-17741) && (param1 == 84 ||
            param1 == 83)) {
            this.activate(-1, -113, -1, 1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("an.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean focusNext(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_C) {
            return false;
          }
          if (!this.field_D) {
            return false;
          }
          param1.blur((byte) 57);
          if (param0 <= 67) {
            this.field_A = false;
          }
          this.field_A = true;
          if (this.field_v != null &&
            this.field_v instanceof FocusChangeListener) {
            ((FocusChangeListener) (this.field_v)).onFocusChanged(this.field_A, (UiWidget) (this), (byte) 15);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("an.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void pumpEventQueue(int param0, PlatformTaskDispatcher param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          if (param1.field_x == null) {
            return;
          }
          for (var3_int = param0; var3_int < 50; var3_int++) {
            if (null != param1.field_x.peekEvent()) {
              AlternateLongAndNameCredentials.sleepMillis(1L, (byte) 71);
              continue;
            }
            break;
          }
          try {
            if (param2 != null) {
              param1.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("an.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        Js5Archive var3 = null;
        Js5Archive var3Lifetime1;
        Js5Archive var3Lifetime2;
        Js5Archive var3Lifetime3;
        if (!this.field_A) {
          if (param0 == 57) {
            return;
          }
          var3 = (Js5Archive) null;
          TextButton.loadSpriteSheet(-59, -128, -24, (Js5Archive) null);
          return;
        }
        this.field_A = false;
        if (this.field_v == null) {
          if (param0 == 57) {
            return;
          }
          var3Lifetime1 = (Js5Archive) null;
          TextButton.loadSpriteSheet(-59, -128, -24, (Js5Archive) null);
          return;
        }
        if (this.field_v instanceof FocusChangeListener) {
          ((FocusChangeListener) (this.field_v)).onFocusChanged(this.field_A, (UiWidget) (this), (byte) 15);
          if (param0 == 57) {
            return;
          }
          var3Lifetime2 = (Js5Archive) null;
          TextButton.loadSpriteSheet(-59, -128, -24, (Js5Archive) null);
          return;
        }
        if (param0 == 57) {
          return;
        }
        var3Lifetime3 = (Js5Archive) null;
        TextButton.loadSpriteSheet(-59, -128, -24, (Js5Archive) null);
    }

    TextButton(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
    }

    final StringBuilder appendDebugTree(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugDescription(param0, param1, 11098, param3)) {
            this.appendDebugProperties(param0, param3, 123, param1);
            if (this.field_x) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_C) {
              discarded$3 = param1.append(" disabled");
            }
          }
          stackIn_11_0 = (StringBuilder) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("an.NA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void activate(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        this.field_z = param3;
        if (null == this.field_v) {
          var5 = -25 / ((-12 - param1) / 56);
          return;
        }
        if (this.field_v instanceof ButtonActionListener) {
          ((ButtonActionListener) (this.field_v)).onButtonActivated(param2, -6, this, param3, param0);
          var5Lifetime1 = -25 / ((-12 - param1) / 56);
          return;
        }
        var5Lifetime2 = -25 / ((-12 - param1) / 56);
    }

    public TextButton() {
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
        this.field_h = ProxySocketConnector.field_j.field_d;
    }

    static {
        field_y = "FROM ONLY";
    }
}
