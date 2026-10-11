/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class dg extends rj implements f {
    rj field_y;
    static ei field_z;

    public static void h(int param0) {
        if (param0 != 32) {
          field_z = (ei) null;
        }
        field_z = null;
    }

    final boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2147483648) {
            return true;
          }
          stackIn_7_0 = (null != this.field_y) && (this.field_y.a(-2147483648, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = stellarshard.field_B;
        try {
          discarded$3 = param1.append('\n');
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$5 = param1.append(' ');
          }
          if (param0 != -81) {
            return;
          }
          if (this.field_y == null) {
            discarded$4 = param1.append("null");
          } else {
            this.field_y.a(param3 + 1, false, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dg.D(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
          if (null != this.field_y) {
            this.field_y.a(param0, -126, param2, this.field_w + param3, param4 + this.field_k, param5);
          }
          int var7_int = -107 % ((-50 - param1) / 57);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "dg.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
          rj var3 = (rj) null;
          discarded$0 = this.b(false, (rj) null);
        }
        return this.a(257) != null ? true : false;
    }

    final static void g(int param0) {
        if (param0 != 16608) {
          dg.h(58);
        }
        rh.a(17, (byte) -72);
    }

    final boolean a(int param0, int param1, rj param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 30) {
            this.field_y = (rj) null;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.e(0)) && (this.field_y.a(param0, param1, param2, param3, 38, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("dg.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static ml a(boolean param0, int param1) {
        ml var2 = new ml(true);
        if (param1 != 0) {
          field_z = (ei) null;
        }
        var2.field_a = param0 ? true : false;
        return var2;
    }

    final void c(boolean param0) {
        if (!param0) {
          this.a(-30, (byte) -11, 55, -83);
        }
        if (this.field_y != null) {
          this.field_y.c(true);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param0 == 0 &&
          null != this.field_u) {
          this.field_u.a(true, param3, param2, (rj) (this), 4549);
        }
        if (param1 != -57) {
          return;
        }
        if (null != this.field_y) {
          this.field_y.a(param0, (byte) -57, param2 + this.field_k, param3 + this.field_w);
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (this.field_y != null) {
          var3 = this.field_y.d(3690);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        rj var6 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_y &&
            this.field_y.e(0) &&
            this.field_y.a(29657, param1, param2, param3)) {
            return true;
          }
          if (param0 != 29657) {
            var6 = (rj) null;
            this.a((rj) null, -24, -59, -50, 25, (byte) -57, -73);
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (si.field_jb[81]) {
            stackIn_11_0 = this.b(true, param3);
          } else {
            stackIn_11_0 = this.a(true, param3);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("dg.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    rj a(int param0) {
        if (param0 != 257) {
          field_z = (ei) null;
        }
        rj var2 = this.field_y;
        if (var2 == null) {
          return null;
        }
        if (var2.e(0)) {
          return var2;
        }
        return null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a((byte) 79);
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        Hashtable var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            var6 = (Hashtable) null;
            this.a(111, (StringBuilder) null, (Hashtable) null, 2);
          }
          super.a(param0, param1, param2, param3);
          if (null != this.field_y) {
            this.field_y.a(this.field_k + param0, param1, this.field_w + param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dg.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 < 24) {
            return true;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.a(param0, param1, param2, param3, this.field_w + param4, (byte) 109, param6 + this.field_k));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("dg.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    dg(int param0, int param1, int param2, int param3, uk param4, lf param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int a(boolean param0) {
        if (param0) {
          this.d(-101);
        }
        return null != this.field_y ? this.field_y.a(false) : 0;
    }

    private final boolean a(boolean param0, rj param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            dg.g(-100);
          }
          stackIn_7_0 = (null != this.field_y) && (!this.field_y.e(0)) && (this.field_y.a(-2147483648, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -120, param3, param2, param0)) {
            this.a((byte) 111, param0, param2, param3);
            this.a(-81, param2, param3, param0);
          }
          if (param1) {
            this.a(118, (byte) 62, -12, 90);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dg.T(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean b(boolean param0, rj param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          stackIn_8_0 = (this.field_y != null) && (!this.field_y.e(0)) && (this.field_y.a(-2147483648, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(byte param0) {
        if (null != this.field_y) {
          this.field_y.f(0);
        }
        if (param0 != 79) {
          this.field_y = (rj) null;
        }
    }

    static {
    }
}
