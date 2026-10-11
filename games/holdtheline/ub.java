/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ub extends n implements jm {
    static go field_A;
    static String field_D;
    n field_B;
    static int[] field_C;
    static String field_E;

    final boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -24898) {
            field_D = (String) null;
          }
          stackIn_7_0 = (this.field_B != null) && (this.field_B.c((byte) -20)) && (this.field_B.a(param0, param1, param2, param3, param4, param5, param6 + 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ub.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String f(int param0) {
        String var3 = null;
        String var2 = super.f(param0);
        if (this.field_B != null) {
          var3 = this.field_B.f(0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_B) {
            this.field_B.a(this.field_k + param0, param1, this.field_o + param2, (byte) -3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ub.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -25823) {
            return false;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.a(param0, -25823));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ub.NB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static fl a(byte[] param0, int param1, int param2) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        fl stackIn_2_0 = null;
        fl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new fl(param0);
          if (param2 != 0) {
            stackIn_2_0 = (fl) null;
            return stackIn_2_0;
          }
          pd.field_e.a((byte) -86, var3);
          om.a(27391, var3, param1);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ub.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean b(int param0, n param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            return true;
          }
          stackIn_8_0 = (null != this.field_B) && (!this.field_B.c((byte) -20)) && (this.field_B.a(param1, param0 - 25742));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ub.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean a(int param0, n param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_C = (int[]) null;
          }
          stackIn_7_0 = (null != this.field_B) && (!this.field_B.c((byte) -20)) && (this.field_B.a(param1, -25823));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ub.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0) {
        if (this.field_B != null) {
          this.field_B.g(82);
        }
        int var2 = 91 / ((param0 + 68) / 32);
    }

    n a(byte param0) {
        n var2 = this.field_B;
        if (var2 != null &&
          var2.c((byte) -20)) {
          return var2;
        }
        if (param0 > 120) {
          return null;
        }
        return (n) null;
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -108) {
            return false;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.a(this.field_k + param0, param1, param2 + this.field_o, param3, (byte) -108, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ub.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static uh a(int param0, int param1) {
        if (param1 <= 40) {
          ub.e((byte) 22);
        }
        uh var2 = new uh(param0, false);
        return var2;
    }

    final void e(int param0) {
        if (null != this.field_B) {
          this.field_B.e(112);
        }
        if (param0 <= 15) {
          field_A = (go) null;
        }
    }

    final int d(byte param0) {
        if (param0 > -66) {
          return 73;
        }
        return this.field_B != null ? this.field_B.d((byte) -83) : 0;
    }

    ub(int param0, int param1, int param2, int param3, dh param4, tb param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
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
          if (this.a(20720, param2, param3, param0)) {
            this.a(param2, param0, true, param3);
            this.a((byte) 123, param0, param3, param2);
          }
          var5_int = 107 / ((0 - param1) / 49);
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ub.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        n var6 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B != null &&
            this.field_B.c((byte) -20) &&
            this.field_B.a(param0, param1, (byte) -78, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (!lk.field_g[81]) {
              stackIn_11_0 = this.b(param2 ^ 29, param0);
            } else {
              stackIn_11_0 = this.a(3, param0);
            }
            return stackIn_11_0;
          }
          if (param2 == -78) {
            return false;
          }
          var6 = (n) null;
          this.a((n) null, 55);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ub.T(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(117);
    }

    void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        n var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_B) {
            this.field_B.a(param0, param1, param2 + this.field_o, param3 + this.field_k, (byte) -9, param5);
          }
          if (param4 != -9) {
            var8 = (n) null;
            this.a((n) null, 41, (byte) 18, '2');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("ub.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (0 == param3 &&
          this.field_l != null) {
          this.field_l.a(true, param2, -95, (n) (this), param1);
        }
        if (this.field_B != null) {
          this.field_B.a(-9532, this.field_o + param1, this.field_k + param2, param3);
        }
        if (param0 != -9532) {
          field_E = (String) null;
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
          return false;
        }
        return null != this.a((byte) 123) ? true : false;
    }

    public static void e(byte param0) {
        field_A = null;
        field_C = null;
        field_D = null;
        if (param0 < 80) {
          field_C = (int[]) null;
        }
        field_E = null;
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        int var6 = HoldTheLine.field_D;
        int var5_intLifetime1;
        try {
          discarded$0 = param2.append('\n');
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$1 = param2.append(' ');
          }
          if (null == this.field_B) {
            discarded$3 = param2.append("null");
          } else {
            this.field_B.a(param1 + 1, (byte) -97, param3, param2);
          }
          var5_intLifetime1 = 39 % ((param0 - 66) / 34);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ub.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = "Pressing <img=0> will fire a weapon if you have one <col=1>red</col> powerup. Laying <col=1>mines</col> or firing the <col=1>machine gun</col> will not cause any powerups to be lost.";
        field_C = new int[]{5, 3, 1, 0};
        field_E = "End of free game!";
    }
}
