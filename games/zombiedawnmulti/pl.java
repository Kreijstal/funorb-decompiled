/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pl extends cf implements dh {
    cf[] field_E;
    static pi field_G;
    static go field_J;
    static int field_F;
    static String field_D;
    static ul field_C;
    static cj field_L;
    static int field_I;
    static String field_K;

    void a(int param0, cf param1, int param2, int param3) {
        int var6 = 0;
        cf[] var5 = null;
        cf var7 = null;
        int var8 = 0;
        cf[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_E == null) {
            return;
          }
          var9 = this.field_E;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null) {
              var7.a(-5407, param1, this.field_y + param2, param3 + this.field_i);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("pl.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int f(byte param0) {
        int var4 = 0;
        int var2;
        cf[] var3;
        cf var5;
        int var7;
        int var6;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = this.field_E;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.f((byte) 44);
            if (var6 > var2) {
              var2 = var6;
            }
          }
        }
        if (param0 != 44) {
          this.g(-103);
        }
        return var2;
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var10 = 0;
        int var8_int = 0;
        RuntimeException var8 = null;
        cf[] var9 = null;
        cf var11 = null;
        int var12 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_E == null) {
            return false;
          }
          var8_int = -34 % ((48 - param0) / 37);
          var9 = this.field_E;
          for (var10 = 0; var9.length > var10; var10++) {
            var11 = var9[var10];
            if (var11 != null &&
              var11.c(127) &&
              var11.a((byte) -14, param1, param2, param3, param4, param5, param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("pl.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
          field_L = (cj) null;
        }
        return null != this.a(8464) ? true : false;
    }

    final boolean a(cf param0, int param1) {
        int var4 = 0;
        cf[] var3 = null;
        RuntimeException var3_ref = null;
        cf var5 = null;
        int var6 = 0;
        cf[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7 = this.field_E;
          var3 = var7;
          for (var4 = param1; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.a(param0, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("pl.S(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder discarded$4 = null;
        int var8 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        cf[] var5 = null;
        cf var7 = null;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_E == null) {
            return;
          }
          var5 = this.field_E;
          if (param2 != 1) {
            return;
          }
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            discarded$4 = param3.append('\n');
            for (var8 = 0; param1 >= var8; var8++) {
              discarded$6 = param3.append(' ');
            }
            if (var7 == null) {
              discarded$5 = param3.append("null");
            } else {
              var7.a(7, param0, param1 + 1, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("pl.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    abstract void g(int param0);

    final String d(byte param0) {
        int var4 = 0;
        int var2;
        cf[] var3;
        cf var5;
        int var7;
        String var6;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = -83 / ((param0 - 53) / 57);
        if (this.field_E == null) {
          return null;
        }
        var3 = this.field_E;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.d((byte) 123);
            if (var6 != null) {
              return var6;
            }
          }
        }
        return null;
    }

    private final cf a(int param0) {
        int var3 = 0;
        cf[] var2;
        cf var4;
        int var5;
        cf[] var6;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_E) {
          return null;
        }
        var6 = this.field_E;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null &&
            var4.c(126)) {
            return var4;
          }
        }
        if (param0 == 8464) {
          return null;
        }
        field_D = (String) null;
        return null;
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        cf[] var7 = null;
        cf var9 = null;
        int var10 = 0;
        cf[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param4) {
            this.field_E = (cf[]) null;
          }
          if (this.field_E == null) {
            return;
          }
          var11 = this.field_E;
          var7 = var11;
          for (var8 = 0; var8 < var11.length; var8++) {
            var9 = var11[var8];
            if (var9 != null) {
              var9.a(param0, param1, param2 + this.field_i, param3, true, param5 + this.field_y);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("pl.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param0);
        var3.a(112, 3);
        var3.a(117, 8);
        if (param1 <= 89) {
          return;
        }
        var3.a(param2, (byte) -69);
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var9 = 0;
        cf[] var8 = null;
        RuntimeException var8_ref = null;
        cf var10 = null;
        int var11 = 0;
        cf[] var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (null == this.field_E) {
            return false;
          }
          if (param4 != -24) {
            field_G = (pi) null;
          }
          var12 = this.field_E;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.a(param0, param1, param2, param3, param4 + 0, param5 + this.field_y, this.field_i + param6)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("pl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -20) {
            stackIn_4_0 = this.a(param1, false, 1);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.g(140);
    }

    public static void f(int param0) {
        field_C = null;
        field_J = null;
        field_L = null;
        field_K = null;
        field_G = null;
        if (param0 <= 80) {
          return;
        }
        field_D = null;
    }

    pl(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
    }

    private final boolean a(cf param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cf var5 = null;
        cf var6 = null;
        int var7 = 0;
        cf var8 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf var6Lifetime1;
        cf var6Lifetime2;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_E == null) {
            return false;
          }
          var4_int = 0;
          while (var4_int < this.field_E.length) {
            var5 = this.field_E[var4_int];
            var6 = var5;
            var6Lifetime1 = var5;
            if (var5 != null &&
              var5.c(127)) {
              for (var4_int = var4_int + param2; var4_int < this.field_E.length; var4_int = var4_int + param2) {
                var6Lifetime2 = this.field_E[var4_int];
                if (var6Lifetime2 != null &&
                  var6Lifetime2.a(param0, 0)) {
                  return true;
                }
              }
            }
            var4_int++;
          }
          if (param1) {
            var8 = (cf) null;
            this.a(127, (cf) null, -44, -22, false, 122);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("pl.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        cf var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, -116, param3, param2)) {
            this.a(param2, param3, (byte) 26, param1);
            this.a(param1, param2, 1, param3);
          }
          if (param0 != 7) {
            var6 = (cf) null;
            this.a(-120, 113, 5, (cf) null, -93, 86, 64);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pl.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean a(cf param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -74) {
            pl.a(-78, (byte) 4, -120);
          }
          stackIn_3_0 = this.a(param0, 32, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pl.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        cf[] var2;
        cf var4;
        int var5;
        cf[] var7;
        cf var6;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = this.field_E;
        var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var4.c((byte) 32);
          }
        }
        if (param0 != 32) {
          var6 = (cf) null;
          this.a((byte) 74, 95, -68, -35, 42, 88, (cf) null);
        }
    }

    private final boolean a(cf param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cf var5 = null;
        cf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_E == null) {
            return false;
          }
          var4_int = -1 + this.field_E.length;
          if (param1 != 32) {
            field_C = (ul) null;
          }
          while (0 <= var4_int) {
            var5 = this.field_E[var4_int];
            if (var5 != null &&
              var5.c(param1 + 93)) {
              for (var4_int = var4_int - param2; var4_int >= 0; var4_int = var4_int - param2) {
                var6 = this.field_E[var4_int];
                if (var6 != null &&
                  var6.a(param0, param1 ^ 32)) {
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
          stackIn_24_1 = new StringBuilder().append("pl.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        cf var6;
        int var7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == param2 &&
          this.field_h != null) {
          this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (param0 != -2) {
          this.c(31);
        }
        if (null != this.field_E) {
          for (var5 = -1 + this.field_E.length; var5 >= 0; var5--) {
            var6 = this.field_E[var5];
            if (var6 != null) {
              var6.a(-2, param1 + this.field_i, param2, this.field_y + param3);
            }
          }
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        int var6 = 0;
        cf[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        cf var7 = null;
        int var8 = 0;
        cf var9 = null;
        cf[] var10 = null;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_E == null) {
            return false;
          }
          var10 = this.field_E;
          var5 = var10;
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            if (var7 != null &&
              var7.c(125) &&
              var7.a(param0, param1, param2, -6208)) {
              return true;
            }
          }
          if (param3 != -6208) {
            var9 = (cf) null;
            this.a((cf) null, -34);
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (lc.field_m[81]) {
            stackIn_19_0 = this.a(param2, (byte) -80);
          } else {
            stackIn_19_0 = this.a((byte) -20, param2);
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("pl.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_G = new pi(2);
        field_D = "Make one of your zombies quite appealing, charming humans into following it...to their doom!";
        field_K = "Enter name of player to add to list";
    }
}
