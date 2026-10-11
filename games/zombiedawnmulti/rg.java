/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rg extends cf implements dh {
    cf field_B;
    static ri field_C;
    static String field_D;

    final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param1) {
            this.f(-102);
          }
          discarded$4 = param2.append('\n');
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (null == this.field_B) {
            discarded$5 = param2.append("null");
          } else {
            this.field_B.a(7, param0, 1 + param3, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rg.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, 9, param3, param2)) {
            this.a(param2, param3, (byte) 26, param1);
            this.a(param1, true, param3, param2);
          }
          if (param0 != 7) {
            this.c(-4);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rg.GA(").append(param0).append(',');
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

    void a(int param0) {
        if (param0 != -18384) {
          this.field_B = (cf) null;
        }
        if (null != this.field_B) {
          this.field_B.e(-1);
        }
    }

    String d(byte param0) {
        String var4 = null;
        String var2 = super.d((byte) 117);
        int var3 = 6 % ((53 - param0) / 57);
        if (this.field_B != null) {
          var4 = this.field_B.d((byte) 110);
          if (var4 != null) {
            return var4;
          }
        }
        return var2;
    }

    final int f(byte param0) {
        if (param0 != 44) {
          return -111;
        }
        return null != this.field_B ? this.field_B.f((byte) 44) : 0;
    }

    void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_B) {
            this.field_B.a(param0, param1, this.field_i + param2, param3, true, this.field_y + param5);
          }
          if (!param4) {
            field_C = (ri) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("rg.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(cf param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -124) {
            this.field_B = (cf) null;
          }
          stackIn_7_0 = (this.field_B != null) && (!this.field_B.c(125)) && (this.field_B.a(param0, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.W(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    rg(int param0, int param1, int param2, int param3, nl param4, bj param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 66 / ((param0 - 48) / 37);
          stackIn_5_0 = (null != this.field_B) && (this.field_B.c(125)) && (this.field_B.a((byte) -125, param1, param2, param3, param4, param5, param6));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rg.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    cf f(int param0) {
        if (param0 != -1963) {
          field_C = (ri) null;
        }
        cf var2 = this.field_B;
        if (var2 == null) {
          return null;
        }
        if (!var2.c(param0 ^ -2005)) {
          return null;
        }
        return var2;
    }

    public static void a(byte param0) {
        if (param0 != -39) {
          rg.a((byte) 21);
        }
        field_D = null;
        field_C = null;
    }

    final void c(byte param0) {
        if (param0 != 32) {
          return;
        }
        if (null != this.field_B) {
          this.field_B.c((byte) 32);
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_B != null) {
            this.field_B.a(-5407, param1, this.field_y + param2, this.field_i + param3);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rg.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(param2 ^ -14052);
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -6208) {
            field_C = (ri) null;
          }
          if (this.field_B != null &&
            this.field_B.c(127) &&
            this.field_B.a(param0, param1, param2, -6208)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (lc.field_m[81]) {
            stackIn_12_0 = this.a(-81, param2);
          } else {
            stackIn_12_0 = this.a(param2, (byte) -125);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rg.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, cf param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            this.c(-108);
          }
          stackIn_7_0 = (null != this.field_B) && (!this.field_B.c(127)) && (this.field_B.a(param1, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != -2) {
          this.f((byte) 0);
        }
        if (param2 == 0 &&
          null != this.field_h) {
          this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (null != this.field_B) {
          this.field_B.a(param0 ^ 0, this.field_i + param1, param2, this.field_y + param3);
        }
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -24) {
            return false;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.a(param0, param1, param2, param3, -24, param5 + this.field_y, this.field_i + param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("rg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
          field_D = (String) null;
        }
        return null != this.f(-1963) ? true : false;
    }

    final static sk g(int param0) {
        if (param0 != -18799) {
          return (sk) null;
        }
        if (null == lh.field_g) {
          lh.field_g = new sk();
          lh.field_g.a(125269879, ke.field_h);
          lh.field_g.field_d = 2763306;
          lh.field_g.field_p = 14;
          lh.field_g.field_e = 0;
          lh.field_g.field_c = 5;
          lh.field_g.field_l = 6;
          lh.field_g.field_h = cp.field_H;
          lh.field_g.field_b = 7697781;
          lh.field_g.field_m = 4;
        }
        return lh.field_g;
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.a(param0, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rg.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_D = "Connecting to<br>friend server...";
    }
}
