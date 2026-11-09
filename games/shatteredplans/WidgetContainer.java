/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements CompositeWidgetMarker {
    static String field_z;
    static boolean field_C;
    static int[] field_y;
    static String field_B;
    IntrusiveDeque field_A;

    final boolean a(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget var11 = null;
        IntrusiveDequeCursor var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != 0) {
            var11 = (UiWidget) null;
            this.a(118, -43, -76, (UiWidget) null, 87, 88, 5);
          }
          var12 = new IntrusiveDequeCursor(this.field_A);
          var9 = (UiWidget) (var12.a(2));
          while (var9 != null) {
            if (var9.isLinked(param0 + 2048)) {
              if (var9.isFocused(1) &&
                var9.a(0, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (UiWidget) (var12.a((byte) 58));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("f.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean handlePress(int param0, int param1, byte param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget var11 = null;
        IntrusiveDequeCursor var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12 = new IntrusiveDequeCursor(this.field_A);
          if (param2 < 95) {
            var11 = (UiWidget) null;
            this.isAfterFocusedChild((UiWidget) null, -47);
          }
          var9 = (UiWidget) (var12.a(2));
          while (var9 != null) {
            if (var9.isLinked(2048)) {
              if (!var9.handlePress(param0, param1, (byte) 109, param3, param4 + this.field_m, param5 + this.field_q, param6)) {
                var9 = (UiWidget) (var12.a((byte) 87));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("f.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        UiWidget var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.field_A);
          var6_ref_vg = (UiWidget) (var8.a(param2 ^ 15));
          while (var6_ref_vg != null) {
            if (var6_ref_vg.isLinked(param2 ^ 2061)) {
              if (var6_ref_vg.isFocused(1) &&
                var6_ref_vg.handleKey(param0, param1, 13, param3)) {
                return true;
              }
              var6_ref_vg = (UiWidget) (var8.a((byte) 84));
              continue;
            }
            break;
          }
          if (param2 != 13) {
            return true;
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (FleetTrailPoint.field_p[81]) {
            stackIn_18_0 = this.isBeforeFocusedChild(param3, true);
          } else {
            stackIn_18_0 = this.isAfterFocusedChild(param3, param2 + 105);
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("f.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    UiWidget findFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_A);
        if (param0 != 1) {
          field_C = true;
        }
        var3 = (UiWidget) (var2.a(param0 ^ 3));
        while (var3 != null) {
          if (var3.isFocused(1)) {
            return var3;
          }
          var3 = (UiWidget) (var2.a((byte) 121));
        }
        return null;
    }

    void setBounds(int param0, int param1, byte param2, int param3, int param4) {
        super.setBounds(param0, param1, (byte) 103, param3, param4);
        if (param2 < 99) {
          this.findFocusedChild(-8);
        }
        this.layoutChildren(-87);
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.field_A);
          if (param2 >= -21) {
            field_B = (String) null;
          }
          var6 = (UiWidget) (var5.a(2));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.describeTree((byte) 125, param1, param3 + 1, param0);
            var6 = (UiWidget) (var5.a((byte) 89));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("f.QA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int maxLayer(int param0) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_A);
        UiWidget var4 = (UiWidget) (var3.a(2));
        while (var4 != null) {
          var5 = var4.maxLayer(param0 ^ 0);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.a((byte) 51));
        }
        if (param0 != -600269855) {
          field_B = (String) null;
        }
        return var2;
    }

    final boolean containsWidget(byte param0, UiWidget param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        UiWidget var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = new IntrusiveDequeCursor(this.field_A);
          var6 = (UiWidget) (var3.a(2));
          while (true) {
            if (var6 == null) {
              var4 = -111 / ((param0 - 61) / 59);
              return false;
            }
            if (!var6.containsWidget((byte) 125, param1)) {
              var6 = (UiWidget) (var3.a((byte) 100));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("f.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean isBeforeFocusedChild(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_A.isEmpty(-86)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.field_A);
          if (!param1) {
            field_B = (String) null;
          }
          var4 = (UiWidget) (var8.c(-30));
          while (var4 != null) {
            if (var4.isFocused(1)) {
              var5 = new IntrusiveDequeCursor(this.field_A);
              var5.a((byte) 109, var4);
              var6 = (UiWidget) (var5.b((byte) -124));
              while (var6 != null) {
                if (!var6.containsWidget((byte) 124, param0)) {
                  var6 = (UiWidget) (var5.b((byte) -124));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.b((byte) -124));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("f.RA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isAfterFocusedChild(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        UiWidget var5 = null;
        IntrusiveDequeCursor var6 = null;
        UiWidget var7 = null;
        int var8 = 0;
        IntrusiveDequeCursor var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_A.isEmpty(102)) {
            return false;
          }
          var4 = 70 % ((5 - param1) / 50);
          var9 = new IntrusiveDequeCursor(this.field_A);
          var5 = (UiWidget) (var9.a(2));
          while (var5 != null) {
            if (var5.isFocused(1)) {
              var6 = new IntrusiveDequeCursor(this.field_A);
              var6.a(false, var5);
              var7 = (UiWidget) (var6.a((byte) 54));
              while (var7 != null) {
                if (var7.containsWidget((byte) 123, param0)) {
                  return true;
                }
                var7 = (UiWidget) (var6.a((byte) 68));
              }
            }
            var5 = (UiWidget) (var9.a((byte) 111));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("f.DA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 0 &&
          null != this.field_p) {
          this.field_p.paintWidget((UiWidget) (this), param3, true, param2, (byte) 12);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_A);
        if (param1 != -11857) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.c(param1 ^ -11803));
        while (var6 != null) {
          var6.drawLayer(param0, -11857, this.field_q + param2, this.field_m + param3);
          var6 = (UiWidget) (var5.b((byte) -124));
        }
    }

    final StringBuilder describeTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 31 % ((64 - param0) / 61);
          if (this.markVisited(false, param2, param3, param1)) {
            this.appendDescription(param1, param2, false, param3);
            this.a(param3, param1, (byte) -114, param2);
          }
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("f.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, mj param1) {
        mj var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param1.unlink((byte) -127);
          var2 = (mj) (gr.field_p.startForward(param0 + 60));
          while (var2 != null) {
            if (var2.a(param1, param0 ^ -60)) {
              var2 = (mj) (gr.field_p.nextForward((byte) -71));
              continue;
            }
            break;
          }
          if (param0 != -60) {
            return;
          }
          if (var2 != null) {
            wp.$cfr$intArgs$a$2661ebe01e52(-127, param1, var2);
          } else {
            gr.field_p.addLast((byte) -113, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("f.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        field_z = null;
        if (param0 < 88) {
          field_C = true;
        }
        field_y = null;
        field_B = null;
    }

    private final void layoutChildren(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= -58) {
          UiWidget var5 = (UiWidget) null;
          this.containsWidget((byte) -71, (UiWidget) null);
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_A);
        UiWidget var3 = (UiWidget) (var2.a(2));
        while (var3 != null) {
          var3.reapplyBounds((byte) 90);
          var3 = (UiWidget) (var2.a((byte) 63));
        }
    }

    final void addChild(byte param0, UiWidget param1) {
        try {
          if (param0 >= -41) {
            field_z = (String) null;
          }
          this.field_A.addLast((byte) -113, param1);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "f.LA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void handleRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7 = new IntrusiveDequeCursor(this.field_A);
          var8 = (UiWidget) (var7.a(param4 + 600269857));
          if (param4 != -600269855) {
            return;
          }
          while (var8 != null) {
            if (var8.isLinked(2048)) {
              var8.handleRelease(param0, this.field_q + param1, param2 + this.field_m, param3, -600269855, param5);
              var8 = (UiWidget) (var7.a((byte) 60));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("f.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = -104 / ((param0 + 84) / 33);
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_A);
        UiWidget var4 = (UiWidget) (var3.a(2));
        while (var4 != null) {
          var4.blur((byte) -121);
          var4 = (UiWidget) (var3.a((byte) 88));
        }
    }

    String getTooltip(boolean param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        String var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_A);
        if (!param0) {
          return (String) null;
        }
        var3 = (UiWidget) (var2.a(2));
        while (var3 != null) {
          var4 = var3.getTooltip(true);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.a((byte) 104));
        }
        return null;
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        this.field_A = new IntrusiveDeque();
    }

    void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          super.updateHover(param0, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.field_A);
          var6 = (UiWidget) (var5.a(2));
          while (var6 != null) {
            if (var6.isLinked(2048)) {
              var6.updateHover(this.field_m + param0, this.field_q + param1, param2, (byte) 91);
              var6 = (UiWidget) (var5.a((byte) 94));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("f.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 1) {
          field_z = (String) null;
        }
        return this.findFocusedChild(1) != null ? true : false;
    }

    static {
        field_B = "You are offering a rematch.";
        field_z = "Options";
        field_C = false;
    }
}
