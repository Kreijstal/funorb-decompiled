/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jh extends gm implements cj {
    gm field_C;
    static int field_z;
    static dg field_B;
    static ei field_y;
    static int field_A;
    static int[] field_x;

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
        var6 = Torquing.field_u;
        try {
          discarded$4 = param2.append('\n');
          for (var5_int = 0; var5_int <= param0; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (param3 != -16493) {
            this.d((byte) 53);
          }
          if (null != this.field_C) {
            this.field_C.a(param2, (byte) 117, param1, 1 + param0);
          } else {
            discarded$5 = param2.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jh.H(").append(param0).append(',');
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
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1 ^ -31757, param0, param2, param3)) {
            this.a(param0, param3, true, param2);
            this.a(param3, param2, param0, -16493);
          }
          if (param1 != 117) {
            this.c((byte) 28);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jh.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = -52 / ((param0 + 28) / 43);
          super.a(26, param1, param2, param3);
          if (null != this.field_C) {
            this.field_C.a(27, param1, this.field_k + param2, param3 + this.field_w);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) -59, param1, param2, param3, param4);
        this.f((byte) 112);
        int var6 = 2 / ((66 - param0) / 57);
    }

    gm a(boolean param0) {
        if (!param0) {
          field_B = (dg) null;
        }
        gm var2 = this.field_C;
        if (var2 == null) {
          return null;
        }
        if (var2.g(2)) {
          return var2;
        }
        return null;
    }

    jh(int param0, int param1, int param2, int param3, el param4, ca param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, byte param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param0 == 0 &&
          this.field_q != null) {
          this.field_q.a(108, param2, param3, true, (gm) (this));
        }
        if (this.field_C != null) {
          this.field_C.a(param0, (byte) -107, this.field_k + param2, param3 + this.field_w);
        }
        if (param1 > -7) {
          gm var6 = (gm) null;
          discarded$0 = this.a(-5, (gm) null);
        }
    }

    final int d(byte param0) {
        if (param0 != 28) {
          return -20;
        }
        return this.field_C == null ? 0 : this.field_C.d((byte) 28);
    }

    final void c(byte param0) {
        if (param0 < 89) {
          return;
        }
        if (this.field_C != null) {
          this.field_C.c((byte) 125);
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
          this.c((byte) -59);
        }
        return this.a(true) != null ? true : false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 < 5) {
            field_A = -64;
          }
          stackIn_6_0 = (this.field_C != null) && (this.field_C.a(param0, this.field_w + param1, this.field_k + param2, param3, param4, param5, (byte) 100));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("jh.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(int param0, gm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -115 % ((41 - param0) / 37);
          stackIn_5_0 = (this.field_C != null) && (!this.field_C.g(2)) && (this.field_C.a(param1, false));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(wl param0, int param1) {
        try {
          if (param1 != 0) {
            field_y = (ei) null;
          }
          np.a(param0, true, 126);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "jh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        if (param3 <= 109) {
          return;
        }
        try {
          if (this.field_C != null) {
            this.field_C.a(this.field_k + param0, param1 + this.field_w, param2, (byte) 119, param4, param5);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "jh.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    String b(int param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (null != this.field_C) {
          var3 = this.field_C.b(0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_C &&
            this.field_C.g(2) &&
            this.field_C.a(param0, param1, param2, -123)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            var5_int = 65 % ((-33 - param3) / 57);
            return false;
          }
          if (!i.field_P[81]) {
            stackIn_9_0 = this.a(119, param1);
          } else {
            stackIn_9_0 = this.a((byte) -69, param1);
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 13 % ((-49 - param0) / 33);
        field_y = null;
        field_B = null;
        field_x = null;
    }

    final boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        RuntimeException var8 = null;
        gm var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var9 = (gm) null;
            this.a(1, false, 78, 35, (gm) null, 4, 60);
          }
          stackIn_7_0 = (null != this.field_C) && (this.field_C.g(2)) && (this.field_C.a(param0, false, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("jh.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        wl var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (wl) null;
            jh.a((wl) null, -33);
          }
          stackIn_6_0 = (this.field_C != null) && (this.field_C.a(param0, false));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jh.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(byte param0, gm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -1 / ((-15 - param0) / 54);
          stackIn_5_0 = (null != this.field_C) && (!this.field_C.g(2)) && (this.field_C.a(param1, false));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void f(byte param0) {
        if (this.field_C != null) {
          this.field_C.e((byte) 88);
        }
        if (param0 <= 103) {
          gm var3 = (gm) null;
          this.a(-121, (gm) null, 8, -63);
        }
    }

    static {
        field_y = new ei();
    }
}
