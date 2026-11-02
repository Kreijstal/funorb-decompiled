/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class WidgetWrapper extends UiWidget implements e {
    static String field_y;
    static BinaryBitmapFont field_z;
    static String field_B;
    UiWidget child;

    void draw(byte param0, int param1, int param2, int param3) {
        if (0 == param2 &&
          this.renderer != null) {
          this.renderer.a(param3, (UiWidget) (this), 32679, param1, true);
        }
        if (null != this.child) {
          this.child.draw((byte) 125, param1 + this.y, param2, param3 + this.x);
        }
        int var5 = 19 / ((param0 + 20) / 54);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -81) {
          WidgetWrapper.a(-77, 73);
        }
        field_y = null;
        field_B = null;
        field_z = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            field_B = (String) null;
          }
          stackIn_7_0 = (this.child != null) && (this.child.isFocused(param1 ^ 1010)) && (this.child.a(param0, 13, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("hfa.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7375) {
            return false;
          }
          stackIn_7_0 = (this.child != null) && (this.child.b(param0, -7375, param2 + this.x, param3, param4 + this.y, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("hfa.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 2) {
          field_y = (String) null;
        }
        return 2 <= param0 ? true : false;
    }

    String getTooltip(byte param0) {
        String var3 = null;
        String var2 = super.getTooltip(param0);
        if (this.child != null) {
          var3 = this.child.getTooltip((byte) 16);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    WidgetWrapper(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int b(int param0) {
        if (param0 > -3) {
          return -117;
        }
        return this.child == null ? 0 : this.child.b(-34);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(-81);
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 20) {
            this.child = (UiWidget) null;
          }
          if (this.a(param0, param1, param3, (byte) 121)) {
            this.a(9, param0, param3, param1);
            this.b(param1, param0, param3, 108);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("hfa.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(int param0) {
        if (this.child != null) {
          this.child.refreshLayout(6);
        }
        if (param0 != -81) {
          field_z = (BinaryBitmapFont) null;
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 1023) {
          field_y = (String) null;
        }
        return null != this.d((byte) 111) ? true : false;
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        UiWidget var6 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.child != null &&
            this.child.isFocused(1023) &&
            this.child.handleKey(10, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (InvincibleEvent.field_q[81]) {
              stackIn_9_0 = this.a(0, param3);
            } else {
              stackIn_9_0 = this.b(-14391, param3);
            }
            return stackIn_9_0;
          }
          if (param0 == 10) {
            return false;
          }
          var6 = (UiWidget) null;
          this.b(-49, 33, 67, -11, -47, (UiWidget) null, 62);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("hfa.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$11 = null;
        int var5_int = 0;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$12 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BachelorFridge.field_y;
        try {
          discarded$11 = param2.append('\n');
          if (param3 < 107) {
            return;
          }
          for (var5_int = 0; var5_int <= param0; var5_int++) {
            discarded$13 = param2.append(' ');
          }
          if (this.child == null) {
            discarded$12 = param2.append("null");
          } else {
            this.child.a(param1, 1 + param0, (byte) 74, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hfa.D(").append(param0).append(',');
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
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, UiWidget param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param2 != -101) {
            field_y = (String) null;
          }
          if (null != this.child) {
            this.child.a(this.x + param0, param1, (byte) -101, param3, param4, param5 + this.y);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("hfa.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void updateMouseOver(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updateMouseOver(param0, param1, param2, param3);
          if (this.child != null) {
            this.child.updateMouseOver(param0 + this.x, this.y + param1, param2, 20);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "hfa.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void blur(int param0) {
        if (param0 != 31) {
          return;
        }
        if (this.child != null) {
          this.child.blur(31);
        }
    }

    private final boolean a(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.d((byte) 124);
          }
          stackIn_7_0 = (this.child != null) && (!this.child.isFocused(1023)) && (this.child.acquireFocus(param1, param0 - 97));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hfa.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean b(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -14391) {
            var4 = (UiWidget) null;
            this.a(124, 28, -53, 58, -115, (UiWidget) null, -70);
          }
          stackIn_7_0 = (this.child != null) && (!this.child.isFocused(param0 ^ -15306)) && (this.child.acquireFocus(param1, -83));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hfa.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    UiWidget d(byte param0) {
        UiWidget var2 = this.child;
        if (var2 != null &&
          var2.isFocused(1023)) {
          return var2;
        }
        if (param0 > 38) {
          return null;
        }
        this.b(93);
        return null;
    }

    final boolean acquireFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -78) {
            this.b(-31);
          }
          stackIn_6_0 = (this.child != null) && (this.child.acquireFocus(param0, -113));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hfa.W(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_y = "Quit";
        field_B = "Game";
    }
}
