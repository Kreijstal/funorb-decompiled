/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kj extends pj implements c {
    pj field_y;
    static String field_z;
    static gj field_x;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != 1048575) {
          pj var6 = (pj) null;
          this.a((byte) -108, (pj) null, 80, 49, -111, 20, 18);
        }
        if (param1 == 0 &&
          this.field_j != null) {
          this.field_j.a(param0, param3, (pj) (this), -4394, true);
        }
        if (null != this.field_y) {
          this.field_y.a(param0 + this.field_n, param1, param2 + 0, param3 + this.field_s);
        }
    }

    public static void a(byte param0) {
        if (param0 < 56) {
          return;
        }
        field_z = null;
        field_x = null;
    }

    void b(byte param0) {
        int var2 = 23 / ((param0 - 55) / 49);
        if (this.field_y != null) {
          this.field_y.c(-26385);
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (this.field_y.d(-81)) && (this.field_y.a(false, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("kj.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (ij.field_g <= 32) {
          ia.b(0, -23235);
        } else {
          var1 = ij.field_g % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ia.b(ij.field_g - var1, -23235);
        }
        var1Lifetime1 = 2 / ((param0 - 56) / 41);
    }

    kj(int param0, int param1, int param2, int param3, td param4, ag param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String g(int param0) {
        String var3 = null;
        String var2 = super.g(param0);
        if (null != this.field_y) {
          var3 = this.field_y.g(-8235);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final void h(int param0) {
        if (null != this.field_y) {
          this.field_y.h(0);
        }
        if (param0 != 0) {
          pj var3 = (pj) null;
          this.a(-33, 14, (byte) 60, (pj) null, 79, -69);
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -115) {
            this.g(-12);
          }
          stackIn_6_0 = (null != this.field_y) && (this.field_y.a((byte) -125, param1, param2, param3 + this.field_s, param4, param5, this.field_n + param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("kj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != -20598) {
          return 86;
        }
        return null == this.field_y ? 0 : this.field_y.f(param0 ^ 0);
    }

    final static void j(int param0) {
        o.d(-1);
        il.a(param0, 0);
    }

    void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_y) {
            this.field_y.a(param0 + this.field_n, param1, (byte) -128, param3, this.field_s + param4, param5);
          }
          if (param2 > -91) {
            this.g(-88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("kj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != null &&
            this.field_y.d(-81) &&
            this.field_y.a(param0, param1, param2, 0)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 80) {
            if (ek.field_a[81]) {
              stackIn_10_0 = this.a((byte) -110, param2);
            } else {
              stackIn_10_0 = this.b(8740, param2);
            }
            return stackIn_10_0;
          }
          if (param3 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("kj.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(9882, param3, param2, param1)) {
            this.a(param2, (byte) -98, param1, param3);
            this.a(param3, param2, -19956, param1);
          }
          if (param0 >= -23) {
            field_x = (gj) null;
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean b(int param0, pj param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8740) {
            field_x = (gj) null;
          }
          stackIn_7_0 = (this.field_y != null) && (!this.field_y.d(-81)) && (this.field_y.a(-81, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kj.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -19956) {
            return;
          }
          discarded$4 = param0.append('\n');
          for (var5_int = 0; var5_int <= param1; var5_int++) {
            discarded$6 = param0.append(' ');
          }
          if (this.field_y == null) {
            discarded$5 = param0.append("null");
          } else {
            this.field_y.a((byte) -61, param3, 1 + param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kj.OA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, pj param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -59) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (!this.field_y.d(-81)) && (this.field_y.a(-81, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kj.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_y != null) {
            this.field_y.a((byte) -77, param1, param2 + this.field_s, this.field_n + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != -81) {
          field_x = (gj) null;
        }
        return this.c(false) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b((byte) 127);
    }

    pj c(boolean param0) {
        pj var2 = this.field_y;
        if (var2 != null &&
          var2.d(-81)) {
          return var2;
        }
        if (!param0) {
          return null;
        }
        return (pj) null;
    }

    final static void a(hj param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          pa.field_d = param8;
          ok.field_f = param4;
          qb.field_c = param3;
          ld.field_a = param5;
          ba.field_c = param7;
          if (param2 != 45) {
            kj.a((byte) -79);
          }
          qf.field_m = param1;
          vg.field_l = param6;
          pf.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "kj.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -81) {
            field_x = (gj) null;
          }
          stackIn_6_0 = (this.field_y != null) && (this.field_y.a(param0 + 0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_z = "Loading graphics";
        field_x = null;
    }
}
