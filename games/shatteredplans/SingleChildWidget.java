/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements ni {
    UiWidget field_z;
    static ScrollPane field_y;

    private final boolean a(UiWidget param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 36 / ((33 - param1) / 61);
          stackIn_5_0 = (null != this.field_z) && (!this.field_z.isFocused(1)) && (this.field_z.containsWidget((byte) 125, param0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qs.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$13 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          discarded$12 = param3.append('\n');
          if (param0 != 81) {
            this.field_z = (UiWidget) null;
          }
          for (var5_int = 0; param2 >= var5_int; var5_int++) {
            discarded$14 = param3.append(' ');
          }
          if (null == this.field_z) {
            discarded$13 = param3.append("null");
            return;
          }
          this.field_z.describeTree((byte) -121, param1, 1 + param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qs.Q(").append(param0).append(',');
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
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean containsWidget(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -6 % ((param0 - 61) / 59);
          stackIn_4_0 = (this.field_z != null) && (this.field_z.containsWidget((byte) -97, param1));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qs.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (null == this.field_z) {
          var2 = 31 % ((-84 - param0) / 33);
          return;
        }
        this.field_z.blur((byte) -124);
        var2Lifetime1 = 31 % ((-84 - param0) / 33);
    }

    void handleRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        if (param4 != -600269855) {
          return;
        }
        try {
          if (null != this.field_z) {
            this.field_z.handleRelease(param0, this.field_q + param1, param2 + this.field_m, param3, -600269855, param5);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "qs.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void h(int param0) {
        if (null != this.field_z) {
          this.field_z.reapplyBounds((byte) 70);
        }
        if (param0 == 1) {
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.updateHover(-10, 20, (UiWidget) null, (byte) 94);
    }

    public static void clearStatics(byte param0) {
        field_y = null;
        if (param0 < 6) {
          field_y = (ScrollPane) null;
        }
    }

    final boolean a(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_y = (ScrollPane) null;
          }
          stackIn_7_0 = (null != this.field_z) && (this.field_z.isFocused(param0 + 1)) && (this.field_z.a(param0 ^ 0, param1, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("qs.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void d(boolean param0) {
        if (!param0) {
          return;
        }
        if (wm.field_b <= 32) {
          DiskArchiveRequest.c(-127, 0);
          return;
        }
        int var1 = wm.field_b % 32;
        if (var1 == 0) {
          var1 = 32;
        }
        DiskArchiveRequest.c(126, -var1 + wm.field_b);
    }

    private final boolean a(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9501) {
            var4 = (UiWidget) null;
            this.containsWidget((byte) -63, (UiWidget) null);
          }
          stackIn_7_0 = (this.field_z != null) && (!this.field_z.isFocused(1)) && (this.field_z.containsWidget((byte) 1, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qs.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int maxLayer(int param0) {
        if (param0 != -600269855) {
          return -125;
        }
        return null == this.field_z ? 0 : this.field_z.maxLayer(param0 ^ 0);
    }

    final boolean isFocused(int param0) {
        if (param0 != 1) {
          return true;
        }
        return null != this.findFocusedWidget(2) ? true : false;
    }

    final void setBounds(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 >= 99) {
          super.setBounds(param0, param1, (byte) 108, param3, param4);
          this.h(1);
          return;
        }
        this.maxLayer(73);
        super.setBounds(param0, param1, (byte) 108, param3, param4);
        this.h(1);
    }

    SingleChildWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String getTooltip(boolean param0) {
        boolean discarded$0 = false;
        String var2 = null;
        String var3 = null;
        String var2Lifetime1;
        String var3Lifetime1;
        if (!param0) {
          UiWidget var4 = (UiWidget) null;
          discarded$0 = this.a(112, (UiWidget) null);
          var2 = super.getTooltip(param0);
          if (this.field_z != null) {
            var3 = this.field_z.getTooltip(param0);
            if (var3 != null) {
              return var3;
            }
            return var2;
          }
          return var2;
        }
        var2Lifetime1 = super.getTooltip(param0);
        if (this.field_z == null) {
          return var2Lifetime1;
        }
        var3Lifetime1 = this.field_z.getTooltip(param0);
        if (var3Lifetime1 == null) {
          return var2Lifetime1;
        }
        return var3Lifetime1;
    }

    StringBuilder describeTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.markVisited(false, param2, param3, param1)) {
            this.appendDescription(param1, param2, false, param3);
            this.a(81, param1, param2, param3);
          }
          var5_int = -117 % ((param0 - 64) / 61);
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qs.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean handlePress(int param0, int param1, byte param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 95) {
            this.field_z = (UiWidget) null;
          }
          stackIn_6_0 = (null != this.field_z) && (this.field_z.handlePress(param0, param1, (byte) 112, param3, param4 + this.field_m, this.field_q + param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qs.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    UiWidget findFocusedWidget(int param0) {
        UiWidget var2 = null;
        UiWidget var2Lifetime1;
        if (param0 != 2) {
          this.field_z = (UiWidget) null;
          var2 = this.field_z;
          if (var2 == null) {
            return null;
          }
          if (var2.isFocused(param0 ^ 3)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_z;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.isFocused(param0 ^ 3)) {
          return var2Lifetime1;
        }
        return null;
    }

    void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updateHover(param0, param1, param2, param3);
          if (null == this.field_z) {
            return;
          }
          this.field_z.updateHover(this.field_m + param0, this.field_q + param1, param2, (byte) 91);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qs.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 != -11857) {
          field_y = (ScrollPane) null;
        }
        if (param0 == 0 &&
          this.field_p != null) {
          this.field_p.a((UiWidget) (this), param3, true, param2, (byte) 12);
        }
        if (null != this.field_z) {
          this.field_z.drawLayer(param0, -11857, this.field_q + param2, this.field_m + param3);
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_z &&
            this.field_z.isFocused(1) &&
            this.field_z.handleKey(param0, param1, 13, param3)) {
            return true;
          }
          if (param2 != 13) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (di.field_p[81]) {
            stackIn_14_0 = this.a(9501, param3);
          } else {
            stackIn_14_0 = this.a(param3, 125);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
    }
}
