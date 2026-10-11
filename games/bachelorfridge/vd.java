/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vd extends wj implements e {
    static Random field_z;
    static String[] field_B;
    eaa field_A;
    static vr field_y;

    void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param2 ^ -104);
    }

    private final void h(int param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(this.field_A);
        wj var5 = (wj) (var2.b((byte) 86));
        while (var5 != null) {
          var5.d(6);
          var5 = (wj) (var2.a((byte) 0));
        }
        int var3 = -30 % ((param0 + 8) / 57);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        int var5 = 123 / ((-20 - param0) / 54);
        if (param2 == 0 &&
          this.field_f != null) {
          this.field_f.a(param3, (wj) (this), 32679, param1, true);
        }
        rna var6 = new rna(this.field_A);
        wj var7 = (wj) (var6.c((byte) 120));
        while (var7 != null) {
          var7.a((byte) -104, param1 + this.field_v, param2, this.field_s + param3);
          var7 = (wj) (var6.d((byte) -124));
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        rna var5 = null;
        wj var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          var5 = new rna(this.field_A);
          var6 = (wj) (var5.b((byte) 40));
          while (var6 != null) {
            discarded$2 = param2.append('\n');
            for (var7 = 0; param0 >= var7; var7++) {
              discarded$3 = param2.append(' ');
            }
            var6.a(param1, 1 + param0, (byte) 113, param2);
            var6 = (wj) (var5.a((byte) 0));
          }
          if (param3 > -77) {
            field_z = (Random) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("vd.CB(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0, vr param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 89) {
            field_z = (Random) null;
          }
          stackIn_3_0 = param1.b((byte) 107);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vd.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(double param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param1 != 81) {
            field_z = (Random) null;
          }
          if (in.field_e != param0) {
            for (var3_int = 0; var3_int < 256; var3_int++) {
              var4 = (int)(255.0 * Math.pow((double)var3_int / 255.0, param0));
              stackIn_9_0 = jna.field_f;
              stackIn_9_1 = var3_int;
              if (var4 > 255) {
                stackIn_10_2 = 255;
              } else {
                stackIn_10_2 = var4;
              }
              stackIn_9_0[stackIn_9_1] = stackIn_10_2;
            }
            in.field_e = param0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "vd.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != wt.field_n) {
          var3 = wt.field_n.a(param1, true);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = wt.field_n.g(0) ? 1 : 0;
              ula.a(param2, (byte) 75, wt.field_n.h((byte) 82), var3, var4 != 0, wt.field_n.field_Eb);
            }
            wt.field_n = null;
            di.c(-121);
          }
        }
        if (param0 != -35) {
          vd.a((byte) 62, true, 65);
        }
    }

    wj g(int param0) {
        rna var2;
        wj var3;
        int var4;
        vr var5;
        var4 = BachelorFridge.field_y;
        var2 = new rna(this.field_A);
        if (param0 >= -26) {
          var5 = (vr) null;
          vd.a((byte) 113, (vr) null);
        }
        var3 = (wj) (var2.b((byte) 106));
        while (var3 != null) {
          if (var3.e(1023)) {
            return var3;
          }
          var3 = (wj) (var2.a((byte) 0));
        }
        return null;
    }

    final boolean a(wj param0, int param1) {
        rna var3 = null;
        RuntimeException var3_ref = null;
        wj var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var3 = new rna(this.field_A);
          if (param1 > -78) {
            this.c((byte) -5);
          }
          var4 = (wj) (var3.b((byte) -117));
          while (var4 != null) {
            if (var4.a(param0, -117)) {
              return true;
            }
            var4 = (wj) (var3.a((byte) 0));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("vd.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, wj param1) {
        RuntimeException var3 = null;
        wj var4 = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        wj var8 = null;
        rna var9 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_A.e(12917)) {
            return false;
          }
          var9 = new rna(this.field_A);
          if (param0 >= -121) {
            var8 = (wj) null;
            this.b(-33, -39, 54, -107, -45, (wj) null, -22);
          }
          var4 = (wj) (var9.c((byte) 121));
          while (var4 != null) {
            if (var4.e(1023)) {
              var5 = new rna(this.field_A);
              var5.a(var4, (byte) -86);
              var6 = (wj) (var5.d((byte) -124));
              while (var6 != null) {
                if (var6.a(param1, -112)) {
                  return true;
                }
                var6 = (wj) (var5.d((byte) -124));
              }
            }
            var4 = (wj) (var9.d((byte) -124));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("vd.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        wj var9 = null;
        int var10 = 0;
        rna var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          var11 = new rna(this.field_A);
          if (param1 != -7375) {
            this.a(78, -90, (byte) 87, -47, 82);
          }
          var9 = (wj) (var11.b((byte) -103));
          while (var9 != null) {
            if (var9.a((byte) -106)) {
              if (!var9.b(param0, -7375, param2 + this.field_s, param3, param4 + this.field_v, param5, param6)) {
                var9 = (wj) (var11.a((byte) 0));
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
          stackIn_14_1 = new StringBuilder().append("vd.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        wj var8 = null;
        rna var9 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var9 = new rna(this.field_A);
          var8 = (wj) (var9.b((byte) -109));
          while (var8 != null) {
            if (var8.a((byte) -106)) {
              if (var8.e(1023) &&
                var8.a(10, param1, param2, param3)) {
                return true;
              }
              var8 = (wj) (var9.a((byte) 0));
              continue;
            }
            break;
          }
          if (param0 != 10) {
            field_y = (vr) null;
          }
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (wga.field_q[81]) {
            stackIn_16_0 = this.a(-128, param3);
          } else {
            stackIn_16_0 = this.b(param3, 1);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("vd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        RuntimeException runtimeException = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new rna(this.field_A);
          var6 = (wj) (var5.b((byte) 14));
          while (var6 != null) {
            if (var6.a((byte) -106)) {
              var6.a(param0 + this.field_s, param1 + this.field_v, param2, 20);
              var6 = (wj) (var5.a((byte) 0));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("vd.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 20) {
            field_z = (Random) null;
          }
          if (this.a(param0, param1, param3, (byte) 122)) {
            this.a(9, param0, param3, param1);
            this.a(param1, param0, param3, (byte) -108);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vd.V(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        rna var8 = null;
        RuntimeException var8_ref = null;
        wj var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          var8 = new rna(this.field_A);
          var9 = (wj) (var8.b((byte) 127));
          while (var9 != null) {
            if (var9.a((byte) -106)) {
              if (var9.e(1023) &&
                var9.a(param0, 13, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (wj) (var8.a((byte) 0));
              continue;
            }
            break;
          }
          if (param1 == 13) {
            return false;
          }
          field_y = (vr) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("vd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    String c(byte param0) {
        rna var2;
        wj var3;
        String var4;
        int var5;
        StringBuilder var6;
        var5 = BachelorFridge.field_y;
        var2 = new rna(this.field_A);
        if (param0 != 16) {
          var6 = (StringBuilder) null;
          this.a(-68, (Hashtable) null, (StringBuilder) null, (byte) -17);
        }
        var3 = (wj) (var2.b((byte) -122));
        while (var3 != null) {
          var4 = var3.c((byte) 16);
          if (var4 != null) {
            return var4;
          }
          var3 = (wj) (var2.a((byte) 0));
        }
        return null;
    }

    final void c(wj param0, int param1) {
        try {
          this.field_A.a(param0, true);
          int var3_int = 69 % ((param1 + 70) / 50);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vd.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
          this.b(-75);
        }
        return this.g(-29) != null ? true : false;
    }

    vd(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
        this.field_A = new eaa();
    }

    final boolean b(wj param0, int param1) {
        RuntimeException var3 = null;
        wj var4 = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        rna var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_A.e(12917)) {
            return false;
          }
          if (param1 != 1) {
            return false;
          }
          var8 = new rna(this.field_A);
          var4 = (wj) (var8.b((byte) 30));
          while (var4 != null) {
            if (var4.e(1023)) {
              var5 = new rna(this.field_A);
              var5.a(param1 + 5999, var4);
              var6 = (wj) (var5.a((byte) 0));
              while (var6 != null) {
                if (var6.a(param0, -123)) {
                  return true;
                }
                var6 = (wj) (var5.a((byte) 0));
              }
            }
            var4 = (wj) (var8.a((byte) 0));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("vd.RA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_z = null;
        if (param0 != 20742) {
          vd.i(-83);
        }
        field_y = null;
        field_B = null;
    }

    final int b(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0 >= -3) {
          this.field_A = (eaa) null;
        }
        rna var3 = new rna(this.field_A);
        wj var4 = (wj) (var3.b((byte) 36));
        while (var4 != null) {
          var5 = var4.b(-61);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (wj) (var3.a((byte) 0));
        }
        return var2;
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        rna var7 = null;
        wj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = BachelorFridge.field_y;
        try {
          var7 = new rna(this.field_A);
          var8 = (wj) (var7.b((byte) -128));
          while (var8 != null) {
            if (var8.a((byte) -106)) {
              var8.a(param0 + this.field_s, param1, (byte) -101, param3, param4, param5 + this.field_v);
              var8 = (wj) (var7.a((byte) 0));
              continue;
            }
            break;
          }
          if (param2 != -101) {
            this.e(50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("vd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != 31) {
          field_y = (vr) null;
        }
        rna var2 = new rna(this.field_A);
        wj var3 = (wj) (var2.b((byte) 79));
        while (var3 != null) {
          var3.f(31);
          var3 = (wj) (var2.a((byte) 0));
        }
    }

    static {
        field_z = new Random();
    }
}
