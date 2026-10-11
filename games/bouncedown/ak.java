/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ak extends lk implements ik {
    lk field_x;
    static volatile int field_y;
    static String field_w;
    static int field_z;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 <= 33) {
          return;
        }
        if (0 == param0 &&
          null != this.field_j) {
          this.field_j.a(param1, (lk) (this), (byte) 5, true, param3);
        }
        if (this.field_x != null) {
          this.field_x.a(param0, this.field_i + param1, 56, this.field_r + param3);
        }
    }

    public static void h(int param0) {
        field_w = null;
        if (param0 < 118) {
          ak.h(-55);
        }
    }

    final boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return true;
          }
          stackIn_7_0 = (this.field_x != null) && (this.field_x.a(param0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ak.PA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(lk param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 101) {
            field_z = -78;
          }
          stackIn_7_0 = (this.field_x != null) && (!this.field_x.e(1)) && (this.field_x.a(param0, false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ak.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 1) {
          field_w = (String) null;
        }
        return null != this.a(0) ? true : false;
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = Bounce.field_N;
        if (param0 <= 12) {
          return (String) null;
        }
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
          param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
          var4 = param3.indexOf(param1, param2.length() + var4);
        }
        return param3;
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 28455) {
            this.e(-72);
          }
          stackIn_6_0 = (this.field_x != null) && (this.field_x.a(param0, param1, param2 + this.field_r, param3, 28455, param5, param6 + this.field_i));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ak.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ak(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    lk a(int param0) {
        if (param0 != 0) {
          lk var3 = (lk) null;
          this.a(122, 60, (lk) null, 29, -123, -17);
        }
        lk var2 = this.field_x;
        if (var2 == null) {
          return null;
        }
        if (!var2.e(param0 ^ 1)) {
          return null;
        }
        return var2;
    }

    void a(int param0, int param1, int param2, lk param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_x) {
            this.field_x.a(-1, param1 + this.field_r, this.field_i + param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ak.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (null != this.field_x) {
          var3 = this.field_x.d(0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final void c(byte param0) {
        if (this.field_x != null) {
          this.field_x.c((byte) 98);
        }
        if (param0 <= 80) {
          field_z = 38;
        }
    }

    final void a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$22 = null;
        int var5_int = 0;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$23 = null;
        int var6 = 0;
        lk var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Bounce.field_N;
        try {
          discarded$22 = param3.append('\n');
          if (param1 != 12) {
            var7 = (lk) null;
            this.a(-7, -32, -97, (lk) null);
          }
          for (var5_int = 0; var5_int <= param2; var5_int++) {
            discarded$24 = param3.append(' ');
          }
          if (null == this.field_x) {
            discarded$23 = param3.append("null");
          } else {
            this.field_x.a(1 + param2, true, param0, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ak.K(");
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
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param2, param3, (byte) 14, param0)) {
            this.a(param0, param3, param2, 32362);
            this.a(param2, (byte) 12, param0, param3);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ak.HA(").append(param0).append(',').append(param1).append(',');
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
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        StringBuilder var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_x != null) {
            this.field_x.a(param0, param1 + this.field_r, param2, param3 + this.field_i, 34, param5);
          }
          if (param4 != 34) {
            var8 = (StringBuilder) null;
            this.a(59, true, (Hashtable) null, (StringBuilder) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("ak.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -14565) {
            field_w = (String) null;
          }
          if (null != this.field_x &&
            this.field_x.e(1) &&
            this.field_x.a(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          var5_int = param2;
          if (var5_int != 80) {
            return false;
          }
          if (!ng.field_a[81]) {
            stackIn_13_0 = this.a(true, param0);
          } else {
            stackIn_13_0 = this.a(param0, param3 + 14675);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ak.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
        RuntimeException var8 = null;
        lk var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param6) {
            var9 = (lk) null;
            this.a(27, 100, (lk) null, 64, 123, -58);
          }
          stackIn_7_0 = (null != this.field_x) && (this.field_x.e(1)) && (this.field_x.a(param0, param1, param2, param3, param4, param5, true));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ak.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
          this.field_x = (lk) null;
        }
        return this.field_x != null ? this.field_x.f(0) : 0;
    }

    private final boolean a(boolean param0, lk param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_x = (lk) null;
          }
          stackIn_7_0 = (this.field_x != null) && (!this.field_x.e(1)) && (this.field_x.a(param1, false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ak.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void i(int param0) {
        if (param0 > -21) {
          field_z = 102;
        }
        if (null != this.field_x) {
          this.field_x.g(11213);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1 ^ 0, param2, param3, param4);
        this.i(-46);
        if (param1 != 80) {
          this.f(-100);
        }
    }

    static {
        field_z = -1;
        field_y = 0;
    }
}
