/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ab extends UiWidget implements vm {
    IntrusiveDeque field_s;
    static String field_r;

    final boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        String stackIn_15_2 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          an var8 = new an(this.field_s);
          if (param0 != 34) {
            field_r = (String) null;
          }
          UiWidget var9 = (UiWidget) (var8.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 106)) {
              if (!var9.pointerPressed(34, param1 + this.field_p, param2, param3, this.field_h + param4, param5, param6)) {
                var9 = (UiWidget) (var8.a(126));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var8_ref;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ab.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    final String getTooltipText(byte param0) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        UiWidget var3 = (UiWidget) (var2.c(-1372));
        while (var3 != null) {
          String var4 = var3.getTooltipText((byte) -112);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.a(-12));
        }
        if (param0 < -41) {
          return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.a((byte) -28, 3, (Hashtable) null, (StringBuilder) null);
        return null;
    }

    void drawWidget(byte param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          this.field_e != null) {
          this.field_e.paintWidget(true, -7592, param3, (UiWidget) (this), param2);
        }
        an var5 = new an(this.field_s);
        if (param0 < 64) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.b(true));
        while (var6 != null) {
          var6.drawWidget((byte) 100, param1, param2 + this.field_h, param3 + this.field_p);
          var6 = (UiWidget) (var5.a((byte) 120));
        }
    }

    final boolean handleWheel(int param0, int param1, int param2, int param3, int param4, UiWidget param5, boolean param6) {
        String stackIn_16_2 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          an var12 = new an(this.field_s);
          UiWidget var9 = (UiWidget) (var12.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 85)) {
              if (var9.isFocused(28660) &&
                var9.handleWheel(param0, param1, param2, param3, param4, param5, false)) {
                return true;
              }
              var9 = (UiWidget) (var12.a(-121));
              continue;
            }
            break;
          }
          if (!param6) {
            return false;
          }
          Hashtable var11 = (Hashtable) null;
          this.appendDebugTree((StringBuilder) null, -90, 100, (Hashtable) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var8;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ab.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(UiWidget param0, int param1) {
        try {
          if (param1 != 1) {
            field_r = (String) null;
          }
          this.field_s.addLast(87, param0);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "ab.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, UiWidget param1) {
        String stackIn_23_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 80) {
            field_r = (String) null;
          }
          if (this.field_s.isEmpty(true)) {
            return false;
          }
          an var8 = new an(this.field_s);
          UiWidget var4 = (UiWidget) (var8.c(-1372));
          while (var4 != null) {
            if (var4.isFocused(28660)) {
              an var5 = new an(this.field_s);
              var5.a(46, var4);
              UiWidget var6 = (UiWidget) (var5.a(23));
              while (var6 != null) {
                if (var6.takeFocus(param1, (byte) -42)) {
                  return true;
                }
                var6 = (UiWidget) (var5.a(-126));
              }
            }
            var4 = (UiWidget) (var8.a(-123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("ab.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int param0) {
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = param0;
        an var3 = new an(this.field_s);
        UiWidget var4 = (UiWidget) (var3.c(param0 ^ -1372));
        while (var4 != null) {
          int var5 = var4.getMaximumRenderLayer(param0 + 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.a(-119));
        }
        return var2;
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        try {
          an var5 = new an(this.field_s);
          UiWidget var6 = (UiWidget) (var5.c(-1372));
          while (var6 != null) {
            StringBuilder discarded$2 = param3.append('\n');
            for (int var7 = 0; var7 <= param1; var7++) {
              StringBuilder discarded$3 = param3.append(' ');
            }
            var6.appendDebugTree(param3, 32462, 1 + param1, param2);
            var6 = (UiWidget) (var5.a(param0 - 232));
          }
          if (param0 != 115) {
            this.field_s = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5_ref;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ab.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    ab(int param0, int param1, int param2, int param3, WidgetRenderer param4) {
        super(param0, param1, param2, param3, param4, (WidgetEventListener) null);
        this.field_s = new IntrusiveDeque();
    }

    final StringBuilder appendDebugTree(StringBuilder param0, int param1, int param2, Hashtable param3) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        try {
          if (this.beginDebugTreeEntry(param0, param2, false, param3)) {
            this.appendDebugProperties(param0, param1 ^ 32462, param3, param2);
            this.a((byte) 115, param2, param3, param0);
          }
          if (param1 != 32462) {
            this.drawWidget((byte) 77, -41, -88, 96);
          }
          StringBuilder stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ab.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void blur(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        if (param0 != 7398) {
          return;
        }
        UiWidget var3 = (UiWidget) (var2.c(-1372));
        while (var3 != null) {
          var3.blur(7398);
          var3 = (UiWidget) (var2.a(param0 - 7523));
        }
    }

    public static void c(boolean param0) {
        field_r = null;
        if (!param0) {
          int[] var2 = (int[]) null;
          ab.a((OpenGlRenderer) null, -29, true, (int[]) null, 99, -122, -8, -126);
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, byte param4) {
        super.setBounds(param0, param1, param2, param3, (byte) 126);
        if (param4 <= 122) {
          UiWidget var7 = (UiWidget) null;
          this.updatePointer((byte) -120, (UiWidget) null, 59, 121);
        }
        this.b(false);
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        String stackIn_10_2 = null;
        try {
          super.updatePointer((byte) 94, param1, param2, param3);
          an var5 = new an(this.field_s);
          UiWidget var6 = (UiWidget) (var5.c(-1372));
          while (var6 != null) {
            if (var6.isLinked((byte) 119)) {
              var6.updatePointer((byte) 108, param1, param2 + this.field_h, this.field_p + param3);
              var6 = (UiWidget) (var5.a(-125));
              continue;
            }
            break;
          }
          if (param0 <= 13) {
            Hashtable var7 = (Hashtable) null;
            this.appendDebugTree((StringBuilder) null, -85, 34, (Hashtable) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ab.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        boolean stackIn_15_0 = false;
        String stackIn_19_2 = null;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          an var10 = new an(this.field_s);
          int var6 = -95 / ((param0 + 53) / 33);
          UiWidget var9 = (UiWidget) (var10.c(-1372));
          while (var9 != null) {
            if (var9.isLinked((byte) 95)) {
              if (var9.isFocused(28660) &&
                var9.handleKey(-94, param1, param2, param3)) {
                return true;
              }
              var9 = (UiWidget) (var10.a(69));
              continue;
            }
            break;
          }
          int var7 = param1;
          if (80 != var7) {
            return false;
          }
          if (lp.heldKeys[81]) {
            stackIn_15_0 = this.b(param3, -107);
          } else {
            stackIn_15_0 = this.a(80, param3);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("ab.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, byte param5) {
        String stackIn_11_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          an var7 = new an(this.field_s);
          if (param5 != 91) {
            return;
          }
          UiWidget var8 = (UiWidget) (var7.c(-1372));
          while (var8 != null) {
            if (var8.isLinked((byte) 115)) {
              var8.pointerReleased(param0 + this.field_p, param1 + this.field_h, param2, param3, param4, (byte) 91);
              var8 = (UiWidget) (var7.a(3));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_10_0 = runtimeException;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ab.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean isFocused(int param0) {
        if (param0 != 28660) {
          field_r = (String) null;
        }
        return this.a(0) != null ? true : false;
    }

    UiWidget a(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_s);
        UiWidget var3 = (UiWidget) (var2.c(-1372));
        while (var3 != null) {
          if (var3.isFocused(28660)) {
            return var3;
          }
          var3 = (UiWidget) (var2.a(-119));
        }
        if (param0 == 0) {
          return null;
        }
        this.field_s = (IntrusiveDeque) null;
        return null;
    }

    final boolean b(UiWidget param0, int param1) {
        String stackIn_23_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_s.isEmpty(true)) {
            return false;
          }
          an var9 = new an(this.field_s);
          if (param1 >= -20) {
            UiWidget var8 = (UiWidget) null;
            this.a((UiWidget) null, -61);
          }
          UiWidget var4 = (UiWidget) (var9.b(true));
          while (var4 != null) {
            if (var4.isFocused(28660)) {
              an var5 = new an(this.field_s);
              var5.a(var4, 0);
              UiWidget var6 = (UiWidget) (var5.a((byte) 120));
              while (var6 != null) {
                if (var6.takeFocus(param0, (byte) -42)) {
                  return true;
                }
                var6 = (UiWidget) (var5.a((byte) 120));
              }
            }
            var4 = (UiWidget) (var9.a((byte) 120));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("ab.EB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean takeFocus(UiWidget param0, byte param1) {
        String stackIn_13_2 = null;
        try {
          an var3 = new an(this.field_s);
          if (param1 != -42) {
            this.drawWidget((byte) 13, -25, 110, -87);
          }
          UiWidget var4 = (UiWidget) (var3.c(-1372));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.takeFocus(param0, (byte) -42)) {
              var4 = (UiWidget) (var3.a(param1 ^ -31));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ab.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        an var2 = new an(this.field_s);
        UiWidget var3 = (UiWidget) (var2.c(-1372));
        if (param0) {
          return;
        }
        while (var3 != null) {
          var3.refreshLayout(false);
          var3 = (UiWidget) (var2.a(-124));
        }
    }

    final static el a(OpenGlRenderer param0, int param1, boolean param2, int[] param3, int param4, int param5, int param6, int param7) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (param1 > -119) {
            el stackIn_2_0 = (el) null;
            return stackIn_2_0;
          }
          if (!param0.field_Cc && (!mg.a(param6, (byte) -72) ||
            !mg.a(param7, (byte) -39))) {
            if (param0.field_u) {
              el stackIn_13_0 = new el(param0, 34037, param6, param7, param2, param3, param5, param4);
              return stackIn_13_0;
            }
            el stackIn_11_0 = new el(param0, param6, param7, fk.roundUpPowerOfTwo(param6, 61), fk.roundUpPowerOfTwo(param7, 115), param3);
            return stackIn_11_0;
          }
          el stackIn_8_0 = new el(param0, 3553, param6, param7, param2, param3, param5, param4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var8;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ab.JB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_r = "Arcade Mode Unlocked!";
    }
}
