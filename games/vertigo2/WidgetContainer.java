/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements dq {
    IntrusiveDeque field_C;
    static int field_D;

    boolean a(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        UiWidget var6_ref_iq = null;
        int var6 = 0;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.field_C);
          if (param1 != 13) {
            this.field_C = (IntrusiveDeque) null;
          }
          var6_ref_iq = (UiWidget) (var8.d(param1 - 9));
          while (var6_ref_iq != null) {
            if (var6_ref_iq.b(92)) {
              if (var6_ref_iq.f(102) &&
                var6_ref_iq.a(param0, param1 ^ 0, param2, param3)) {
                return true;
              }
              var6_ref_iq = (UiWidget) (var8.c(2));
              continue;
            }
            break;
          }
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (!UiPanel.field_eb[81]) {
            stackIn_17_0 = this.b((byte) -89, param3);
          } else {
            stackIn_17_0 = this.a(32345, param3);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("cj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_C);
        if (param0 != 2) {
          field_D = 47;
        }
        UiWidget var3 = (UiWidget) (var2.d(param0 ^ 6));
        while (var3 != null) {
          var3.d((byte) 2);
          var3 = (UiWidget) (var2.c(param0 + 0));
        }
    }

    String a(boolean param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        String var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          this.b(true);
        }
        var2 = new IntrusiveDequeCursor(this.field_C);
        var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          var4 = var3.a(false);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.c(2));
        }
        return null;
    }

    final boolean b(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_C.isEmpty(false)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.field_C);
          var4 = (UiWidget) (var8.d(4));
          while (var4 != null) {
            if (var4.f(34)) {
              var5 = new IntrusiveDequeCursor(this.field_C);
              var5.a(-108, var4);
              var6 = (UiWidget) (var5.c(2));
              while (var6 != null) {
                if (!var6.a((byte) 116, param1)) {
                  var6 = (UiWidget) (var5.c(2));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.c(2));
          }
          if (param0 < -63) {
            return false;
          }
          this.b(false);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_C);
        if (param0 != -641) {
          this.field_C = (IntrusiveDeque) null;
        }
        UiWidget var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          var3.g(param0 + 553);
          var3 = (UiWidget) (var2.c(param0 + 643));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, UiWidget param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.field_C);
          var9 = (UiWidget) (var8.d(4));
          while (var9 != null) {
            if (var9.b(94)) {
              if (var9.f(61) &&
                var9.a(param0, param1, param2, param3, param4, (byte) -123, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.c(2));
              continue;
            }
            break;
          }
          var10 = 39 % ((-87 - param5) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("cj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetListener param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
        this.field_C = new IntrusiveDeque();
    }

    final boolean f(int param0) {
        if (param0 < 3) {
          this.a(true, 15, -89, 98);
        }
        return null != this.b(true) ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_C);
        UiWidget var4 = (UiWidget) (var3.d(4));
        if (param0 > -97) {
          UiWidget var7 = (UiWidget) null;
          this.a((byte) 126, 47, 97, (UiWidget) null);
        }
        while (var4 != null) {
          var5 = var4.c((byte) -121);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.c(2));
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, UiWidget param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget var11 = null;
        IntrusiveDequeCursor var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param5 > -107) {
            var11 = (UiWidget) null;
            this.a(77, -56, -46, (UiWidget) null, 32, (byte) 26, 97);
          }
          var12 = new IntrusiveDequeCursor(this.field_C);
          var9 = (UiWidget) (var12.d(4));
          while (var9 != null) {
            if (var9.b(115)) {
              if (var9.a(param0, param1 + this.field_o, param2 + this.field_t, param3, param4, (byte) -108, param6)) {
                return true;
              }
              var9 = (UiWidget) (var12.c(2));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("cj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(-641);
    }

    private final void a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
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
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.field_C);
          if (param1) {
            return;
          }
          var6 = (UiWidget) (var5.d(4));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param0 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(param3, 1 + param0, (byte) -79, param2);
            var6 = (UiWidget) (var5.c(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("cj.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 46) {
            return;
          }
          var7 = new IntrusiveDequeCursor(this.field_C);
          var8 = (UiWidget) (var7.d(4));
          while (var8 != null) {
            if (var8.b(125)) {
              var8.a(param0, (byte) 46, param2 + this.field_o, this.field_t + param3, param4, param5);
              var8 = (UiWidget) (var7.c(param1 - 44));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cj.HA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, UiWidget param1) {
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
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_C.isEmpty(false)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.field_C);
          if (param0 != 32345) {
            this.field_C = (IntrusiveDeque) null;
          }
          var4 = (UiWidget) (var8.b(param0 - 32341));
          while (var4 != null) {
            if (var4.f(85)) {
              var5 = new IntrusiveDequeCursor(this.field_C);
              var5.a(var4, param0 - 32342);
              var6 = (UiWidget) (var5.a((byte) 76));
              while (var6 != null) {
                if (!var6.a((byte) 116, param1)) {
                  var6 = (UiWidget) (var5.a((byte) 121));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.a((byte) 101));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("cj.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void c(byte param0, UiWidget param1) {
        try {
          int var3_int = 36 / ((param0 - 35) / 38);
          this.field_C.addFirst(param1, false);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cj.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget b(boolean param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          this.a(false);
        }
        var2 = new IntrusiveDequeCursor(this.field_C);
        var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          if (var3.f(93)) {
            return var3;
          }
          var3 = (UiWidget) (var2.c(2));
        }
        return null;
    }

    void a(boolean param0, int param1, int param2, int param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 == 0 &&
          this.field_B != null) {
          this.field_B.a(true, param2, true, (UiWidget) (this), param3);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_C);
        if (param0) {
          this.a(true, 10, -73, -106);
        }
        UiWidget var6 = (UiWidget) (var5.b(4));
        while (var6 != null) {
          var6.a(false, param1, param2 + this.field_o, this.field_t + param3);
          var6 = (UiWidget) (var5.a((byte) 15));
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2 ^ 78, param1, param0)) {
            this.a(param0, param3, true, param1);
            this.a(param1, false, param3, param0);
          }
          if (param2 == -79) {
            stackIn_7_0 = (StringBuilder) (param3);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cj.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, UiWidget param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        UiWidget var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          super.a((byte) 66, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.field_C);
          if (param0 <= 6) {
            var8 = (UiWidget) null;
            this.b((byte) 25, (UiWidget) null);
          }
          var6 = (UiWidget) (var5.d(4));
          while (var6 != null) {
            if (var6.b(101)) {
              var6.a((byte) 73, param1 + this.field_o, this.field_t + param2, param3);
              var6 = (UiWidget) (var5.c(2));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (!BufferedSocket.field_a) {
          return;
        }
        ql.field_L.a(0, param0);
        var4 = TextureOperator.field_n.l(0) ? 1 : 0;
        if (param1 != ~kf.field_c &&
          var4 == 0) {
          param0 = false;
          on.a(9110);
        }
        if (param0) {
          TextureOperator.field_n.a(param2, 538, param3);
        }
        if (var4 != 0) {
          ql.field_L.a(0, param0);
        }
        var5 = TextureOperator.field_n.k(12282) + TextureOperator.field_n.field_ob;
        if (var5 <= 640) {
          if (635 > var5 &&
            !(0 >= gr.field_Y)) {
            gr.field_Y = gr.field_Y - 5;
          }
        } else {
          gr.field_Y = gr.field_Y + 5;
        }
    }

    final boolean a(byte param0, UiWidget param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 116) {
            return true;
          }
          var3 = new IntrusiveDequeCursor(this.field_C);
          var4 = (UiWidget) (var3.d(param0 - 112));
          while (var4 != null) {
            if (var4.a((byte) 116, param1)) {
              return true;
            }
            var4 = (UiWidget) (var3.c(2));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_D = 100;
    }
}
