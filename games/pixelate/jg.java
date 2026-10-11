/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jg extends ng implements j {
    ng[] field_L;
    static fp field_F;
    static String field_M;
    static java.awt.Image field_K;
    static tf field_H;
    static char[] field_I;
    static int field_J;

    final boolean b(boolean param0) {
        if (!param0) {
          field_H = (tf) null;
        }
        return null != this.m(0) ? true : false;
    }

    final boolean a(ng param0, int param1) {
        int var4 = 0;
        ng[] var3 = null;
        RuntimeException var3_ref = null;
        ng var5 = null;
        int var6 = 0;
        ng[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != 27) {
            return true;
          }
          var7 = this.field_L;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, 27)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("jg.HA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        ng var7 = null;
        int var9 = 0;
        ng[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.field_L) {
            return;
          }
          var10 = this.field_L;
          if (param2 <= 126) {
            field_J = -27;
          }
          for (var6 = 0; var10.length > var6; var6++) {
            var7 = var10[var6];
            discarded$6 = param0.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$8 = param0.append(' ');
            }
            if (var7 != null) {
              var7.a(param0, false, param3 + 1, param1);
            } else {
              discarded$7 = param0.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("jg.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 56) {
          field_F = (fp) null;
        }
        return lo.field_Nb;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 75, param2, param3, param4);
        this.a(14210);
        if (param1 < 19) {
          field_H = (tf) null;
        }
    }

    final static boolean k(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return true;
        }
        stackIn_6_0 = (null != he.field_f) && (he.field_f.c((byte) -87));
        return stackIn_6_0;
    }

    private final boolean a(byte param0, ng param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -95) {
            this.a(-13, (byte) -36, 75, -82, -49);
          }
          stackIn_3_0 = this.a(-18125, 1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        int var6 = 0;
        ng[] var5 = null;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_L == null) {
            return;
          }
          var9 = this.field_L;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(param0 + 0, this.field_p + param1, param2 + this.field_z, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("jg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final String b(byte param0) {
        ng[] var2;
        int var3;
        Object var5;
        int var6;
        ng[] var7;
        ng var4;
        String var5_ref;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_L) {
          return null;
        }
        var7 = this.field_L;
        var2 = var7;
        var3 = 0;
        if (param0 < 16) {
          return (String) null;
        }
        while (var7.length > var3) {
          var4 = var7[var3];
          if (var4 != null) {
            var5_ref = var4.b((byte) 36);
            if (var5_ref != null) {
              return var5_ref;
            }
          }
          var3++;
        }
        return null;
    }

    final static void a(int param0, int param1) {
        wn.field_u = param0;
        if (null != to.field_q) {
          to.field_q.c((byte) 30, param0);
        }
        int var2 = -13 % ((52 - param1) / 59);
        if (ri.field_a != null) {
          ri.field_a.a(param0, (byte) 2);
        }
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -58) {
            this.b(true);
          }
          if (this.field_L == null) {
            return false;
          }
          var12 = this.field_L;
          var8 = var12;
          for (var9 = 0; var9 < var12.length; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a((byte) -58, param1, param2, param3 + this.field_p, param4, this.field_z + param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("jg.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_F = (fp) null;
          }
          if (this.a(-90, param2, param0, param3)) {
            this.a(param2, (byte) -2, param3, param0);
            this.a(param0, param3, (byte) 127, param2);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jg.AA(");
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int l(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          wa.field_c.a(hf.field_w, true, (byte) 99, ph.field_o);
          wa.field_c.d((byte) 112);
          while (bh.$cfr$intArgs$b$c4997cb15529(120)) {
            wa.field_c.a(nj.field_f, ke.field_a, false);
          }
          if (u.field_h != -1) {
            var1_int = u.field_h;
            te.a(-1, -2671);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 <= 51) {
            jg.a((byte) -82);
          }
          if (dk.field_c) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (qo.field_n == rj.field_F) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!an.field_e.d(123)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (tm.field_X != rj.field_F) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "jg.M(" + param0 + ')');
        }
    }

    final void h(int param0) {
        int var3 = 0;
        ng[] var2;
        ng var4;
        int var5;
        ng[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        var6 = this.field_L;
        var2 = var6;
        if (param0 != 2) {
          field_K = (java.awt.Image) null;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.h(2);
          }
        }
    }

    final int e(int param0) {
        int var4 = 0;
        int var2;
        ng[] var3;
        ng var5;
        int var7;
        int var6;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        var3 = this.field_L;
        if (param0 <= 31) {
          this.field_L = (ng[]) null;
        }
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.e(61);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        return var2;
    }

    private final boolean a(ng param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_L == null) {
            return false;
          }
          var4_int = 0;
          if (param1 != -44) {
            this.e(-60);
          }
          while (this.field_L.length > var4_int) {
            var5 = this.field_L[var4_int];
            if (null != var5 &&
              var5.b(true)) {
              for (var4_int = var4_int + param2; var4_int < this.field_L.length; var4_int = var4_int + param2) {
                var6 = this.field_L[var4_int];
                if (null != var6 &&
                  var6.a(param0, 27)) {
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
          stackIn_22_1 = new StringBuilder().append("jg.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_I = null;
        field_M = null;
        field_F = null;
        if (param0 > -65) {
          return;
        }
        field_K = null;
        field_H = null;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        int var8 = 0;
        ng[] var7 = null;
        ng var9 = null;
        int var10 = 0;
        ng[] var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.field_L) {
            return;
          }
          var11 = this.field_L;
          var7 = var11;
          for (var8 = param3; var11.length > var8; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, param1 + this.field_z, param2, 0, param4 + this.field_p, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("jg.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final ng m(int param0) {
        int var3 = 0;
        ng[] var2;
        ng var4;
        int var5;
        ng[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_L) {
          return null;
        }
        var6 = this.field_L;
        var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.b(true)) {
            return var4;
          }
        }
        return null;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5;
        ng var6;
        int var7;
        int var5Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param1 == 0 &&
          null != this.field_y) {
          this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
        }
        if (null != this.field_L) {
          for (var5 = this.field_L.length - 1; 0 <= var5; var5--) {
            var6 = this.field_L[var5];
            if (var6 != null) {
              var6.a(this.field_p + param0, param1, param2 + this.field_z, (byte) -95);
            }
          }
        }
        var5Lifetime1 = -65 / ((param3 - 70) / 49);
    }

    jg(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
    }

    abstract void a(int param0);

    private final boolean b(ng param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -17753) {
            stackIn_4_0 = this.a(param0, (byte) -44, 1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jg.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, ng param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        ng stackIn_8_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var6Lifetime1;
        ng var6Lifetime2;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.field_L) {
            return false;
          }
          var4_int = -1 + this.field_L.length;
          while (var4_int >= 0) {
            var5 = this.field_L[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            stackIn_8_0 = var5;
            if (stackIn_8_0 != null &&
              var5.b(true)) {
              for (var4_int = var4_int - param1; var4_int >= 0; var4_int = var4_int - param1) {
                var6Lifetime2 = this.field_L[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(param2, 27)) {
                  return true;
                }
              }
            }
            var4_int--;
          }
          if (param0 == -18125) {
            return false;
          }
          field_J = -62;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("jg.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        int var6 = 0;
        ng[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (null == this.field_L) {
            return false;
          }
          var9 = this.field_L;
          var5 = var9;
          if (param1 != 3) {
            jg.a((byte) 125);
          }
          for (var6 = 0; var6 < var9.length; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.b(true) &&
              var7.a(param0, 3, param2, param3)) {
              return true;
            }
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (!bc.field_m[81]) {
            stackIn_20_0 = this.b(param2, -17753);
          } else {
            stackIn_20_0 = this.a((byte) -126, param2);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("jg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        int var9 = 0;
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_L == null) {
            return false;
          }
          var12 = this.field_L;
          var8 = var12;
          if (param1 < 61) {
            this.h(91);
          }
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.b(true) &&
              var10.a(param0, (byte) 105, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("jg.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_F = new fp();
        field_M = "<%0> disconnected.";
        field_I = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
