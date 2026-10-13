/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ag extends oc implements sd {
    oc[] field_H;
    static int[] field_M;
    static String field_I;
    static mf field_G;
    static String[] buttonLabels;
    static String field_J;
    static int[] field_L;
    static int field_E;
    static ta field_F;
    static String field_C;
    static int[] decodedSpriteOffsetX;

    final static void f(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (ScorePopup.field_p > 32) {
          var1 = ScorePopup.field_p % 32;
          if (0 == var1) {
            var1 = 32;
          }
          wp.a(1, -var1 + ScorePopup.field_p);
        } else {
          wp.a(1, 0);
        }
        var1Lifetime1 = -4 % ((73 - param0) / 40);
    }

    private final boolean a(int param0, int param1, oc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_H == null) {
            return false;
          }
          if (param0 <= 99) {
            this.f(-98);
          }
          var4_int = -1 + this.field_H.length;
          while (var4_int >= 0) {
            var5 = this.field_H[var4_int];
            if (var5 != null &&
              var5.f(-106)) {
              for (var4_int = var4_int - param1; 0 <= var4_int; var4_int = var4_int - param1) {
                var6 = this.field_H[var4_int];
                if (var6 != null &&
                  var6.a(true, param2)) {
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
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("ag.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        oc var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param3 != -11) {
          return;
        }
        if (param2 == 0 &&
          null != this.field_l) {
          this.field_l.a(true, param3 - 20607, param1, (oc) (this), param0);
        }
        if (this.field_H != null) {
          for (var5 = -1 + this.field_H.length; var5 >= 0; var5--) {
            var6 = this.field_H[var5];
            if (var6 != null) {
              var6.a(param0 + this.field_w, this.field_o + param1, param2, (byte) -11);
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        buttonLabels = null;
        field_J = null;
        decodedSpriteOffsetX = null;
        field_C = null;
        field_F = null;
        if (param0) {
          ag.c(true);
        }
        field_G = null;
    }

    private final boolean a(int param0, oc param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = this.a(param0 ^ 125, 1, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ag.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        oc[] var8 = null;
        RuntimeException var8_ref = null;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_H == null) {
            return false;
          }
          var12 = this.field_H;
          var8 = var12;
          for (var9 = param6; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1, param2 + this.field_o, this.field_w + param3, param4, param5, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("ag.MA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        int var6 = 0;
        oc[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        oc var7 = null;
        int var8 = 0;
        oc var9 = null;
        oc[] var10 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.field_H) {
            return false;
          }
          var10 = this.field_H;
          var5 = var10;
          if (param1 != 110) {
            var9 = (oc) null;
            this.a(26, 34, 108, (oc) null, -13, -79);
          }
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            if (var7 != null &&
              var7.f(-58) &&
              var7.a(param0, (byte) 110, param2, param3)) {
              return true;
            }
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (pe.heldKeys[81]) {
            stackIn_20_0 = this.a(1, param2);
          } else {
            stackIn_20_0 = this.b(true, param2);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("ag.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(boolean param0, oc param1) {
        RuntimeException var3 = null;
        oc var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (oc) null;
            this.a(91, (byte) 97, (oc) null, '<');
          }
          stackIn_3_0 = this.a(1, param1, (byte) 116);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ag.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        int var8 = 0;
        oc[] var7 = null;
        oc var9 = null;
        int var10 = 0;
        oc var11 = null;
        oc[] var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param4 != 19223) {
            var11 = (oc) null;
            this.a(78, (byte) -22, (oc) null, '￻');
          }
          if (null == this.field_H) {
            return;
          }
          var12 = this.field_H;
          var7 = var12;
          for (var8 = 0; var12.length > var8; var8++) {
            var9 = var12[var8];
            if (var9 != null) {
              var9.a(param0, param1, param2 + this.field_w, param3, param4 ^ 0, param5 + this.field_o);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("ag.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        oc var7 = null;
        int var9 = 0;
        oc[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.field_H) {
            return;
          }
          var10 = this.field_H;
          var6 = 0;
          if (param0 <= 72) {
            ag.c(true);
          }
          while (var6 < var10.length) {
            var7 = var10[var6];
            discarded$4 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$6 = param3.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param3.append("null");
            } else {
              var7.a(param1 + 1, param2, 24, param3);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ag.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (param0 > -49) {
          this.field_H = (oc[]) null;
        }
        return null != this.a((byte) -78) ? true : false;
    }

    ag(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
    }

    final void b(boolean param0) {
        oc discarded$1 = null;
        oc[] var2;
        int var3;
        oc var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = this.field_H;
        var3 = 0;
        if (param0) {
          discarded$1 = this.a((byte) 108);
        }
        while (var2.length > var3) {
          var4 = var2[var3];
          if (var4 != null) {
            var4.b(false);
          }
          var3++;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        int var9 = 0;
        oc[] var8 = null;
        RuntimeException var8_ref = null;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.field_H) {
            return false;
          }
          if (param3 >= -125) {
            return false;
          }
          var12 = this.field_H;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.f(-109) &&
              var10.a(param0, param1, param2, -126, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_21_0 = var8_ref;
          stackIn_21_1 = new StringBuilder().append("ag.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    abstract void a(int param0);

    private final oc a(byte param0) {
        int var3 = 0;
        oc[] var2;
        oc var4;
        int var5;
        oc[] var6;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_H) {
          return null;
        }
        if (param0 != -78) {
          return (oc) null;
        }
        var6 = this.field_H;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.f(-88)) {
            return var4;
          }
        }
        return null;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param3 ^ -251);
    }

    private final boolean a(int param0, oc param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == this.field_H) {
            return false;
          }
          if (param2 != 116) {
            field_F = (ta) null;
          }
          var4_int = 0;
          while (this.field_H.length > var4_int) {
            var5 = this.field_H[var4_int];
            if (null != var5 &&
              var5.f(-57)) {
              for (var4_int = var4_int + param0; this.field_H.length > var4_int; var4_int = var4_int + param0) {
                var6 = this.field_H[var4_int];
                if (null != var6 &&
                  var6.a(true, param1)) {
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
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ag.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Brick.field_A.field_Mb = param1;
        sc.field_c = true;
        int var2_int = kc.field_q.field_g;
        if (param0 != -83) {
          return;
        }
        try {
          var3 = kc.field_q.field_f;
          var4 = Brick.field_A.field_O.measureWrappedHeight(param1, 272, Brick.field_A.field_R);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          qp.field_f.a(-(2 * var5) + (-120 + var3), var5, (var2_int - 320) / 2, 320, (byte) 64);
          qp.field_f.field_Jb = na.a(false, 8421504, 3, 11579568, qp.field_f.field_cb, 2105376);
          Brick.field_A.a(-24 + (qp.field_f.field_cb - 20), 16, 24, -24 + (-24 + qp.field_f.field_Ib), (byte) 64);
          nh.field_a.a(24, -24 + (-20 + qp.field_f.field_cb), 120, 80, (byte) 64);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ag.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var6 = 0;
        oc[] var5 = null;
        oc var7 = null;
        int var8 = 0;
        oc[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_H == null) {
            return;
          }
          var9 = this.field_H;
          var5 = var9;
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0, (byte) 0, this.field_o + param2, param3 + this.field_w);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ag.WA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String d(int param0) {
        int var3 = 0;
        oc[] var2;
        oc var4;
        int var6;
        String var5;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.field_H == null) {
          return null;
        }
        var2 = this.field_H;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.d(21);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (param0 >= 6) {
          return null;
        }
        buttonLabels = (String[]) null;
        return null;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        oc var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2 ^ 1595638000, param0, param1)) {
            this.a(param1, param0, param2 ^ 24, param3);
            this.a((byte) 119, param0, param1, param3);
          }
          if (param2 != 24) {
            var6 = (oc) null;
            discarded$1 = this.a(26, -76, (oc) null);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, oc param1) {
        int var4 = 0;
        oc[] var3 = null;
        RuntimeException var3_ref = null;
        oc var5 = null;
        int var6 = 0;
        oc var7 = null;
        oc[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = this.field_H;
          var3 = var8;
          if (!param0) {
            var7 = (oc) null;
            this.a(18, 61, 105, -29, 39, (oc) null, -74);
          }
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null &&
              var5.a(true, param1)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ag.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int e(byte param0) {
        int var5 = 0;
        int var2;
        oc[] var3;
        int var4;
        oc var6;
        int var8;
        int var7;
        var8 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var4 = -128 % ((-17 - param0) / 43);
        var3 = this.field_H;
        for (var5 = 0; var3.length > var5; var5++) {
          var6 = var3[var5];
          if (var6 != null) {
            var7 = var6.e((byte) 117);
            if (var7 > var2) {
              var2 = var7;
            }
          }
        }
        return var2;
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 != -16) {
          String var4 = (String) null;
          ag.a((byte) 10, (String) null);
        }
        String var5 = (String) null;
        bf.a(param2, param1, -15947, (String) null);
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_M = new int[256];
        field_I = "Spectate";
        for (var0 = 0; var0 < 256; var0++) {
          var1 = var0;
          field_M[var0] = LevelSelectScreen.d(LevelSelectScreen.d(var1 << 16, var1 << 8), 0 * var1);
        }
        field_J = "Find opponents";
        field_L = new int[]{7, 40, 41};
        field_C = "Oh no!";
    }
}
