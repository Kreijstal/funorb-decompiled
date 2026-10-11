/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pe extends ub implements bg {
    static String[] field_z;
    oi field_A;
    static int field_B;
    static long field_D;
    static md field_y;
    static int[] field_C;

    final void a(ub param0, byte param1) {
        try {
          if (param1 <= 15) {
            field_y = (md) null;
          }
          this.field_A.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pe.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$4 = null;
        pf var5 = null;
        int var6 = 0;
        ub var7 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = wizardrun.field_H;
        try {
          var6 = -90 % ((param1 - 30) / 43);
          var5 = new pf(this.field_A);
          var7 = (ub) (var5.a((byte) 31));
          while (var7 != null) {
            discarded$3 = param3.append('\n');
            for (var8 = 0; param0 >= var8; var8++) {
              discarded$4 = param3.append(' ');
            }
            var7.a(param2, (byte) 102, 1 + param0, param3);
            var7 = (ub) (var5.b(35));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("pe.TA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -23) {
          field_z = (String[]) null;
        }
        field_z = null;
        field_y = null;
        field_C = null;
    }

    final void b(boolean param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(this.field_A);
        if (param0) {
          field_B = -77;
        }
        ub var3 = (ub) (var2.a((byte) 31));
        while (var3 != null) {
          var3.b(param0);
          var3 = (ub) (var2.b(35));
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = wizardrun.field_H;
        if (param2 == 0 &&
          this.field_w != null) {
          this.field_w.a(param0, param3, (ub) (this), true, true);
        }
        pf var5 = new pf(this.field_A);
        ub var6 = (ub) (var5.b((byte) 103));
        while (var6 != null) {
          var6.a(param0 + this.field_o, 0, param2, param3 + this.field_l);
          var6 = (ub) (var5.a(true));
        }
        if (param1 != 0) {
          StringBuilder var8 = (StringBuilder) null;
          this.b(67, 85, (Hashtable) null, (StringBuilder) null);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = wizardrun.field_H;
        try {
          ed.f(param4, param2, 1 + param3, 10000536);
          if (param1 != -14) {
            return;
          }
          ed.f(param4, param0 + param2, 1 + param3, 12105912);
          var5_int = 1;
          var6 = param0;
          if (param2 + var5_int < ed.field_i) {
            var5_int = ed.field_i - param2;
          }
          if (var6 + param2 > ed.field_b) {
            var6 = -param2 + ed.field_b;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = var7 * 48 / param0 + 152;
            var9 = var8 << 16 | var8 << 8 | var8;
            ed.field_k[param4 + ed.field_h * (param2 + var7)] = var9;
            ed.field_k[param3 + (param4 + ed.field_h * (var7 + param2))] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "pe.KA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 102) {
            field_y = (md) null;
          }
          if (this.a(param3, param0, param2, true)) {
            this.a(83, param2, param0, param3);
            this.b(param2, -21, param0, param3);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pe.U(");
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
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 152) {
          return (java.awt.Container) null;
        }
        if (null != he.field_u) {
          return (java.awt.Container) ((Object) he.field_u);
        }
        return (java.awt.Container) ((Object) jg.f(1));
    }

    final boolean b(ub param0, int param1) {
        RuntimeException var3 = null;
        ub var4 = null;
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        pf var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          if (this.field_A.f(8192)) {
            return false;
          }
          if (param1 != 1) {
            field_D = -109L;
          }
          var8 = new pf(this.field_A);
          var4 = (ub) (var8.a((byte) 31));
          while (var4 != null) {
            if (var4.d((byte) 53)) {
              var5 = new pf(this.field_A);
              var5.a(var4, -79);
              var6 = (ub) (var5.b(35));
              while (var6 != null) {
                if (!var6.a(param0, param1 ^ 9)) {
                  var6 = (ub) (var5.b(35));
                  continue;
                }
                return true;
              }
            }
            var4 = (ub) (var8.b(35));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("pe.PA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        pf var8 = null;
        ub var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          var8 = new pf(this.field_A);
          var9 = (ub) (var8.a((byte) 31));
          if (param2 > -96) {
            field_z = (String[]) null;
          }
          while (var9 != null) {
            if (var9.c((byte) 72)) {
              if (var9.d((byte) 53) &&
                var9.a(param0, param1, (byte) -126, param3)) {
                return true;
              }
              var9 = (ub) (var8.b(35));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (!hi.field_p[81]) {
            stackIn_15_0 = this.b(param3, 1);
          } else {
            stackIn_15_0 = this.a((byte) -117, param3);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pe.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        RuntimeException runtimeException = null;
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new pf(this.field_A);
          var6 = (ub) (var5.a((byte) 31));
          while (var6 != null) {
            if (var6.c((byte) -50)) {
              var6.a(10000536, this.field_l + param1, this.field_o + param2, param3);
              var6 = (ub) (var5.b(35));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("pe.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(byte param0, ub param1) {
        RuntimeException var3 = null;
        ub var4 = null;
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        pf var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          if (this.field_A.f(8192)) {
            return false;
          }
          var8 = new pf(this.field_A);
          if (param0 != -117) {
            return false;
          }
          var4 = (ub) (var8.b((byte) 51));
          while (var4 != null) {
            if (var4.d((byte) 53)) {
              var5 = new pf(this.field_A);
              var5.a(-80, var4);
              var6 = (ub) (var5.a(true));
              while (var6 != null) {
                if (!var6.a(param1, param0 ^ -125)) {
                  var6 = (ub) (var5.a(true));
                  continue;
                }
                return true;
              }
            }
            var4 = (ub) (var8.a(true));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("pe.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static o[] a(String param0, kl param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.b(-1, param0);
          var5 = param1.a(var4_int, param2, -11986);
          if (param3 < 86) {
            field_B = -113;
          }
          stackIn_3_0 = cf.a(var4_int, 30736, param1, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pe.SA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    pe(int param0, int param1, int param2, int param3, bf param4) {
        super(param0, param1, param2, param3, param4, (ce) null);
        this.field_A = new oi();
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        pf var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ub var10 = null;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = wizardrun.field_H;
        try {
          var8 = new pf(this.field_A);
          var9 = 18 % ((param1 - 12) / 36);
          var10 = (ub) (var8.a((byte) 31));
          while (var10 != null) {
            if (var10.c((byte) -76)) {
              if (var10.a(this.field_o + param0, (byte) 83, param2, this.field_l + param3, param4, param5, param6)) {
                return true;
              }
              var10 = (ub) (var8.b(35));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_13_0 = var8_ref;
          stackIn_13_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final String c(boolean param0) {
        pf var2;
        ub var3;
        String var4;
        int var5;
        var5 = wizardrun.field_H;
        if (param0) {
          return (String) null;
        }
        var2 = new pf(this.field_A);
        var3 = (ub) (var2.a((byte) 31));
        while (var3 != null) {
          var4 = var3.c(false);
          if (var4 != null) {
            return var4;
          }
          var3 = (ub) (var2.b(35));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        RuntimeException runtimeException = null;
        pf var7 = null;
        ub var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = wizardrun.field_H;
        try {
          var7 = new pf(this.field_A);
          if (param5 != 0) {
            this.field_A = (oi) null;
          }
          var8 = (ub) (var7.a((byte) 31));
          while (var8 != null) {
            if (var8.c((byte) 110)) {
              var8.a(this.field_o + param0, param1, this.field_l + param2, param3, param4, param5 ^ 0);
              var8 = (ub) (var7.b(35));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("pe.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(this.field_A);
        ub var3 = (ub) (var2.a((byte) 31));
        while (var3 != null) {
          var3.c(param0 ^ 124);
          var3 = (ub) (var2.b(35));
        }
        if (param0 != 1) {
          ub var5 = (ub) null;
          this.a(-40, 28, -74, -73, (ub) null, -112);
        }
    }

    ub d(int param0) {
        pf var2;
        ub var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = new pf(this.field_A);
        if (param0 != -16) {
          field_z = (String[]) null;
        }
        var3 = (ub) (var2.a((byte) 31));
        while (var3 != null) {
          if (var3.d((byte) 53)) {
            return var3;
          }
          var3 = (ub) (var2.b(35));
        }
        return null;
    }

    final boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        ub var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        pf var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = wizardrun.field_H;
        try {
          var12 = new pf(this.field_A);
          var9 = (ub) (var12.a((byte) 31));
          while (var9 != null) {
            if (var9.c((byte) -109)) {
              if (var9.d((byte) 53) &&
                var9.a(param0, -23023, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (ub) (var12.b(35));
              continue;
            }
            break;
          }
          if (param1 == -23023) {
            return false;
          }
          var11 = (StringBuilder) null;
          this.a((Hashtable) null, (byte) 115, 4, (StringBuilder) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("pe.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(ub param0, int param1) {
        pf var3 = null;
        RuntimeException var3_ref = null;
        ub var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          var3 = new pf(this.field_A);
          if (param1 != 8) {
            field_C = (int[]) null;
          }
          var4 = (ub) (var3.a((byte) 31));
          while (var4 != null) {
            if (var4.a(param0, param1 ^ 0)) {
              return true;
            }
            var4 = (ub) (var3.b(35));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("pe.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(114, param1, param2, param3, param4);
        if (param0 < 108) {
          this.d((byte) 109);
        }
        this.f(1);
    }

    final int e(byte param0) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        int var2 = 0;
        pf var3 = new pf(this.field_A);
        ub var4 = (ub) (var3.a((byte) 31));
        while (var4 != null) {
          var5 = var4.e((byte) 93);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (ub) (var3.b(35));
        }
        if (param0 < 23) {
          return -1;
        }
        return var2;
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
          return false;
        }
        return this.d(-16) != null ? true : false;
    }

    static {
        field_z = new String[16];
    }
}
