/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidgetContainer extends SingleChildWidgetContainer {
    static vh field_P;
    private int field_K;
    private boolean field_H;
    private int field_L;
    private int field_U;
    private boolean field_T;
    private int field_M;
    static String field_W;
    static String field_J;
    static sa field_N;
    static PlatformTaskDispatcher field_I;
    static wg field_V;
    static int field_Q;
    static he[] field_S;
    static LoginPanel field_O;
    static String field_R;

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_W = (String) null;
          }
          if (null != MidiPcmStream.field_I) {
            MidiPcmStream.field_I.field_V.setNameSuggestions(2, param1);
          }
          if (null == dd.field_g) {
            return;
          }
          dd.field_g.field_O.setNameSuggestions(2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private DraggableWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_K = 2147483647;
        this.field_M = 2147483647;
        try {
          this.field_T = param7 ? true : false;
          this.field_z = param6;
          this.field_H = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "pi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void layoutChild(int param0) {
        super.layoutChild(0);
        this.field_z.setBounds(param0, this.field_k, 0, 16535, this.field_w);
        this.field_M = this.field_o;
        this.field_K = this.field_m;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener(DequeWidgetContainer.field_G);
        param0.removeMouseMotionListener(DequeWidgetContainer.field_G);
        if (param1 != 1) {
          return;
        }
        try {
          param0.removeFocusListener(DequeWidgetContainer.field_G);
          ProgressDialog.field_mb = 0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean pointerPressed(int param0, UiWidget param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 113) {
            var9 = (UiWidget) null;
            this.updatePointer((UiWidget) null, -121, -33, (byte) 86);
          }
          var8_int = super.pointerPressed(param0, param1, param2, (byte) 126, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_H) {
            return true;
          }
          if (!this.containsPointer(param6, param5, false, param4, param0)) {
            stackIn_12_0 = var8_int;
            return stackIn_12_0 != 0;
          }
          if (1 == param2) {
            this.field_L = -param5 + (-this.field_o + param4);
            this.field_U = -this.field_m + (param0 - param6);
            oh.field_b = this;
          }
          this.field_y = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("pi.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(RgbSprite param0, int param1) {
        try {
          sa.field_e = param0;
          if (param1 != 21914) {
            field_S = (he[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "pi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final StringBuilder appendDebugTree(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
          if (this.beginDebugTreeEntry(param1, param2, param0, -98)) {
            this.appendDebugProperties(param2, (byte) 89, param0, param1);
            this.appendChildDebugTree(10, param2, param0, param1);
            discarded$62 = param2.append(" revert=").append(this.field_T);
            if (this.field_M != 2147483647 &&
              this.field_K != 2147483647) {
              discarded$63 = param2.append(" to ").append(this.field_M).append(',').append(this.field_K);
            }
          }
          if (param3 != -10612) {
            this.layoutChild(-7);
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pi.WA(").append(param0).append(',');
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
          throw ie.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_I = null;
        field_V = null;
        field_J = null;
        if (param0 == 2147483647) {
          field_P = null;
          field_R = null;
          field_O = null;
          field_W = null;
          field_S = null;
          field_N = null;
          return;
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, byte param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_z instanceof InteractiveWidget) ||
            ((InteractiveWidget) (this.field_z)).field_E) &&
            this.field_y == 1) {
            var5_int = -param1 + (-this.field_L + ck.field_c);
            var6 = ob.field_g - this.field_U - param2;
            if (var5_int != this.field_o ||
              this.field_m != var6) {
              this.field_m = var6;
              this.field_o = var5_int;
              if (this.field_u instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.field_u)).widgetDragged(this, -31124, param1, param2);
              }
            }
          } else {
            if (this.field_T) {
              if (this.field_o != this.field_M) {
                var5_int = -this.field_o + this.field_M;
                stackIn_17_1 = this.field_o;
                if (Math.abs(var5_int) > 2) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_18_2 = -1;
                  } else {
                    stackIn_18_2 = 1;
                  }
                }
                this.field_o = stackIn_17_1 + stackIn_18_2;
              }
              if (this.field_m != this.field_K) {
                var5_int = this.field_K - this.field_m;
                stackIn_24_1 = this.field_m;
                if (Math.abs(var5_int) > 2) {
                  stackIn_25_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_25_2 = -1;
                  } else {
                    stackIn_25_2 = 1;
                  }
                }
                this.field_m = stackIn_24_1 + stackIn_25_2;
              }
            }
          }
          super.updatePointer(param0, param1, param2, (byte) -128);
          if (param3 < -127) {
            return;
          }
          field_N = (sa) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("pi.I(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void pointerReleased(int param0, int param1, int param2, UiWidget param3, int param4, boolean param5) {
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          this.field_y = 0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "pi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_P = new vh();
        field_W = "Achievements";
        field_J = null;
        field_V = null;
        field_Q = -1;
        field_N = new sa(4, 1, 1, 1);
        field_R = "Names cannot contain consecutive spaces";
    }
}
