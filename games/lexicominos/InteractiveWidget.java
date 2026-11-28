/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class InteractiveWidget extends UiWidget {
    boolean field_D;
    private boolean field_B;
    static BufferedRandomAccessFile field_y;
    static RgbSprite[] field_A;
    private boolean field_x;
    boolean field_C;
    static dg field_z;

    boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D &&
            this.field_x) {
            param1.blur((byte) -122);
            if (param0 != 44) {
              this.field_x = true;
            }
            this.field_B = true;
            if (null != this.field_r &&
              this.field_r instanceof WidgetFocusListener) {
              ((WidgetFocusListener) (this.field_r)).onWidgetFocusChanged(false, this.field_B, (UiWidget) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kf.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    InteractiveWidget(String param0, WidgetEventListener param1) {
        this(param0, DequeWidgetContainer.field_z.field_f, param1);
    }

    boolean pointerPressed(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4808) {
            this.field_B = false;
          }
          if (!this.field_D) {
            return false;
          }
          if (!this.containsPointer(param3, param6, param5, param4, (byte) -93)) {
            return false;
          }
          this.takeFocus((byte) 44, param2);
          this.field_h = param1;
          if (this.field_r != null &&
            this.field_r instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.field_r)).onWidgetPointerPressed(param3, param1, param6, (byte) -14, param5, param4, this);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("kf.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void activateFromInput(int param0, int param1, int param2, int param3) {
        if (this.field_r != null) {
          if (!(this.field_r instanceof WidgetActivationListener)) {
            if (param0 != -23287) {
              this.field_B = true;
              return;
            }
            return;
          }
          ((WidgetActivationListener) (this.field_r)).onWidgetActivated(param2, param1, 215535458, param3, this);
        }
        if (param0 == -23287) {
          return;
        }
        this.field_B = true;
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (this.field_h != 0 &&
            this.field_h != ul.field_o) {
            if (this.containsPointer(ResourceArchive.field_e, bk.field_b, param3, param2, (byte) -115) &&
              ul.field_o == 0) {
              this.activateFromInput(-23287, -param2 + ResourceArchive.field_e, this.field_h, bk.field_b - param3);
            }
            this.pointerReleased(param1, bk.field_b, param2, 0, param3, ResourceArchive.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "kf.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_z = null;
        field_A = null;
        field_y = null;
        if (param0 != -85) {
          field_y = (BufferedRandomAccessFile) null;
        }
    }

    final static boolean d(boolean param0) {
        int var2 = 0;
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        pd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = (pd) (ModalDialog.field_C.beginForward(param0));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (var4.field_k[var2] != null &&
              var4.field_k[var2].status == 0) {
              return false;
            }
            if (var4.field_i[var2] != null &&
              var4.field_i[var2].status == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) var1_ref), "kf.HA(" + param0 + ')');
        }
    }

    final void pointerReleased(UiWidget param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          if (this.field_r != null &&
            this.field_r instanceof WidgetPointerListener) {
            ((WidgetPointerListener) (this.field_r)).onWidgetPointerReleased(-121, param4, param5, param2, param1, this);
          }
          this.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "kf.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 18337) {
          return false;
        }
        return this.field_B;
    }

    final static void f(int param0) {
        DequeWidgetContainer.field_z = DraggableWidgetContainer.a((byte) 115);
        ug.field_A = new ModalDialogHost();
        if (param0 == 1) {
          jd.a(true, true, 37);
          return;
        }
        InteractiveWidget.h(-103);
        jd.a(true, true, 37);
    }

    final static int g(int param0) {
        if (param0 != 0) {
          InteractiveWidget.f(-4);
          return ProgressDialog.field_V;
        }
        return ProgressDialog.field_V;
    }

    final static void h(int param0) {
        if (param0 != -1) {
          return;
        }
        og.field_c = ig.field_a.readString(false);
        CharSequence var2 = (CharSequence) ((Object) og.field_c);
        MusicPatchNode.field_t = ProxyAuthenticationRequiredException.a(var2, (byte) -48);
    }

    InteractiveWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
    }

    final StringBuilder appendDebugTree(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        UiWidget var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -15992) {
            var6 = (UiWidget) null;
            this.updatePointer((byte) 35, (UiWidget) null, 75, 35);
          }
          if (this.beginDebugTreeEntry(7373, param2, param1, param0)) {
            this.appendDebugProperties(param2, 0, param0, param1);
            if (this.field_C) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -35 / ((-87 - param0) / 36);
        int var3 = 0;
        if ((param1 & 7) != 0) {
          var3 = -(7 & param1) + 8;
        }
        int var4 = param1 + var3;
        return var4;
    }

    protected InteractiveWidget() {
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
        this.field_i = DequeWidgetContainer.field_z.field_j;
    }

    final void blur(byte param0) {
        UiWidget var3 = null;
        UiWidget var3Lifetime1;
        UiWidget var3Lifetime2;
        UiWidget var3Lifetime3;
        if (!this.field_B) {
          if (param0 > -35) {
            var3 = (UiWidget) null;
            this.pointerPressed(-41, -60, (UiWidget) null, 127, 58, -109, 47);
            return;
          }
          return;
        }
        this.field_B = false;
        if (null == this.field_r) {
          if (param0 <= -35) {
            return;
          }
          var3Lifetime1 = (UiWidget) null;
          this.pointerPressed(-41, -60, (UiWidget) null, 127, 58, -109, 47);
          return;
        }
        if (this.field_r instanceof WidgetFocusListener) {
          ((WidgetFocusListener) (this.field_r)).onWidgetFocusChanged(false, this.field_B, (UiWidget) (this));
          if (param0 <= -35) {
            return;
          }
          var3Lifetime2 = (UiWidget) null;
          this.pointerPressed(-41, -60, (UiWidget) null, 127, 58, -109, 47);
          return;
        }
        if (param0 <= -35) {
          return;
        }
        var3Lifetime3 = (UiWidget) null;
        this.pointerPressed(-41, -60, (UiWidget) null, 127, 58, -109, 47);
    }

    boolean handleKey(char param0, int param1, UiWidget param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -98 / ((-13 - param3) / 55);
          if (this.isFocused(18337) && (param1 == 84 ||
            param1 == 83)) {
            this.activateFromInput(-23287, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kf.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_z = new dg();
    }
}
