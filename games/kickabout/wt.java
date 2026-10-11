/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wt extends fd implements jp {
    static int field_v;
    static int field_x;
    static ut field_y;
    static ut[] field_z;
    fd[] field_w;
    static wu field_A;

    private final boolean a(fd param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param1 != -28) {
            return true;
          }
          var4_int = 0;
          while (var4_int < this.field_w.length) {
            var5 = this.field_w[var4_int];
            if (var5 != null &&
              var5.b(100)) {
              for (var4_int = var4_int + param2; var4_int < this.field_w.length; var4_int = var4_int + param2) {
                var6 = this.field_w[var4_int];
                if (var6 != null &&
                  var6.a(param0, param1 ^ -28)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("wt.I(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 < 10) {
          return true;
        }
        return this.a(true) != null ? true : false;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        fd var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17883) {
            var6 = (fd) null;
            this.a(125, (fd) null, 11, -44, 107, -118, 34);
          }
          if (this.a(1, param3, param2, param1)) {
            this.b(param1, param3, param2, param0 ^ -3421);
            this.a(param2, 10, param1, param3);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wt.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static wh a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (pn.field_z.a(false) >= 16) {
          return null;
        }
        int var7 = -79 % ((-85 - param5) / 32);
        wh var6 = new wh(param3, param0, param4, param2, param1);
        pn.field_z.a(var6, 3);
        return var6;
    }

    public static void b(boolean param0) {
        field_y = null;
        field_z = null;
        if (param0) {
          field_y = (ut) null;
        }
        field_A = null;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        fd var7 = null;
        int var9 = 0;
        fd var10 = null;
        fd[] var11 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return;
          }
          if (param1 != 10) {
            var10 = (fd) null;
            this.a((byte) 88, (fd) null, 119, 67);
          }
          var11 = this.field_w;
          for (var6 = 0; var6 < var11.length; var6++) {
            var7 = var11[var6];
            discarded$6 = param3.append('\n');
            for (var8 = 0; param2 >= var8; var8++) {
              discarded$8 = param3.append(' ');
            }
            if (var7 != null) {
              var7.a(17883, param2 + 1, param0, param3);
            } else {
              discarded$7 = param3.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("wt.M(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final boolean a(int param0, fd param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 9) {
            stackIn_4_0 = this.a(-17305, param1, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wt.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -118);
    }

    private final boolean b(fd param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 84) {
            this.f((byte) 119);
          }
          stackIn_3_0 = this.a(param0, -28, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wt.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        int var6 = 0;
        fd[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return false;
          }
          var9 = this.field_w;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.b(35) &&
              var7.a(param0, (byte) -123, param2, param3)) {
              return true;
            }
          }
          if (param1 >= -60) {
            field_v = -42;
          }
          var5_int = param3;
          if (80 != var5_int) {
            return false;
          }
          if (!ne.field_G[81]) {
            stackIn_19_0 = this.b(param2, 87);
          } else {
            stackIn_19_0 = this.a(9, param2);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("wt.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, nu param1, int param2, ut[] param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Kickabout.field_G;
        try {
          nw.field_b = param1;
          ek.field_G = param2;
          tm.field_n = param3;
          if (param0 != 0) {
            return;
          }
          if (ek.field_G != -2) {
            af.field_a = new dt[4];
            for (var4_int = 0; var4_int < 4; var4_int++) {
              af.field_a[var4_int] = new dt((gm) (nw.field_b.field_P[nw.field_b.field_g[ek.field_G].field_p][var4_int + 1]), var4_int + 1);
            }
            return;
          }
          af.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wt.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(tj param0, nl param1, byte param2, int param3) {
        nl stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        try {
          if (-1 == param0.field_m &&
            0 != param0.field_h) {
            var4_int = -(param1.field_o >> 1) + 20;
            if (param2 != -75) {
              var8 = (String[]) null;
              wt.a(69, (String[]) null);
            }
            var5 = (param1.field_w - param0.field_p) / param0.field_h;
            var5 = 9 * var5 >> 3;
            if (var5 > 2 &&
              var5 < var4_int) {
              var6 = param0.field_t + param0.field_q * var5;
              var7 = Math.abs(-var6 + param1.field_M);
              if (var6 > 24379392 &&
                var6 < 34275328) {
                if (-28 + (var7 >> 16) > 12) {
                  param1.c(var6, 5);
                  return true;
                }
                stackIn_17_0 = (nl) (param1);
                if (param1.field_M < var6) {
                  stackIn_18_1 = 8;
                } else {
                  stackIn_18_1 = 2;
                }
                stackIn_17_0.field_G = stackIn_18_1;
                return true;
              }
              param1.field_G = 0;
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("wt.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static wn a(int param0, String[] param1) {
        wn var2 = null;
        RuntimeException var2_ref = null;
        wn stackIn_2_0 = null;
        wn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -108) {
            stackIn_2_0 = (wn) null;
            return stackIn_2_0;
          }
          var2 = new wn(false);
          var2.field_f = param1;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("wt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract void a(byte param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        fd var6;
        int var7;
        var7 = Kickabout.field_G;
        if (0 == param0 &&
          null != this.field_r) {
          this.field_r.a(126, true, param3, (fd) (this), param2);
        }
        if (param1 != 65) {
          field_x = -84;
        }
        if (this.field_w != null) {
          for (var5 = this.field_w.length - 1; var5 >= 0; var5--) {
            var6 = this.field_w[var5];
            if (var6 != null) {
              var6.a(param0, 65, param2 + this.field_t, this.field_g + param3);
            }
          }
        }
    }

    final String f(int param0) {
        int var3 = 0;
        fd[] var2;
        fd var4;
        int var6;
        fd[] var7;
        String var5;
        var6 = Kickabout.field_G;
        if (this.field_w == null) {
          return null;
        }
        var7 = this.field_w;
        var2 = var7;
        if (param0 != -1) {
          field_A = (wu) null;
        }
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var5 = var4.f(-1);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final int f(byte param0) {
        int var4 = 0;
        int var2;
        fd[] var3;
        fd var5;
        int var7;
        int var6;
        fd var8;
        var7 = Kickabout.field_G;
        var2 = 0;
        var3 = this.field_w;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.f((byte) 118);
            if (var2 < var6) {
              var2 = var6;
            }
          }
        }
        if (param0 != 118) {
          var8 = (fd) null;
          this.a(20, (fd) null, 22, -126, -123, 63, -127);
        }
        return var2;
    }

    wt(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        int var9 = 0;
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (!param0) {
            field_v = -64;
          }
          var12 = this.field_w;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_t, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("wt.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final fd a(boolean param0) {
        int var3 = 0;
        fd[] var2;
        fd var4;
        int var5;
        fd[] var6;
        var5 = Kickabout.field_G;
        if (null == this.field_w) {
          return null;
        }
        var6 = this.field_w;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.b(100)) {
            return var4;
          }
        }
        if (param0) {
          return null;
        }
        this.f(91);
        return null;
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        int var8 = 0;
        fd[] var7 = null;
        fd var9 = null;
        int var10 = 0;
        fd[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return;
          }
          var11 = this.field_w;
          var7 = var11;
          for (var8 = 0; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(this.field_g + param0, param1, param2, param3, -1, this.field_t + param5);
            }
          }
          if (param4 != -1) {
            wt.a(-45, false, false, 110, 69, -102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_13_0 = var7_ref;
          stackIn_13_1 = new StringBuilder().append("wt.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        int var6 = 0;
        fd[] var5 = null;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Kickabout.field_G;
        try {
          super.a(param0, param1, param2, param3);
          if (null == this.field_w) {
            return;
          }
          var9 = this.field_w;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a((byte) 12, param1, this.field_t + param2, this.field_g + param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("wt.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, fd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_w == null) {
            return false;
          }
          if (param0 != -17305) {
            field_z = (ut[]) null;
          }
          var4_int = -1 + this.field_w.length;
          while (var4_int >= 0) {
            var5 = this.field_w[var4_int];
            if (var5 != null &&
              var5.b(92)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_w[var4_int];
                if (var6 != null &&
                  var6.a(param1, 0)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("wt.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var3 = 0;
        fd[] var2;
        fd var4;
        int var5;
        fd[] var6;
        var5 = Kickabout.field_G;
        var6 = this.field_w;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.g(84);
          }
        }
        if (param0 != 84) {
          field_z = (ut[]) null;
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (null == this.field_w) {
            return false;
          }
          var12 = this.field_w;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.b(127) &&
              var10.a(param0, param1, param2, param3, param4, param5, -87)) {
              return true;
            }
          }
          var9Lifetime1 = -27 / ((param6 - 63) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("wt.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(fd param0, int param1) {
        int var4 = 0;
        fd[] var3 = null;
        RuntimeException var3_ref = null;
        fd var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, param1 + 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("wt.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
