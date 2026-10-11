/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ok extends al implements je {
    static int[] field_F;
    static kk field_G;
    al field_B;
    static String[] field_C;
    static ic field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != 127) {
            this.f(-111);
          }
          stackIn_7_0 = (null != this.field_B) && (this.field_B.h(param6 - 216)) && (this.field_B.a(param0, param1, param2, param3, param4, param5, (byte) 127));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ok.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    al i(int param0) {
        al var2 = this.field_B;
        if (var2 != null) {
          if (var2.h(-89)) {
            return var2;
          }
          if (param0 != 199) {
            field_F = (int[]) null;
            return null;
          }
          return null;
        }
        if (param0 != 199) {
          field_F = (int[]) null;
          return null;
        }
        return null;
    }

    public static void d(byte param0) {
        field_G = null;
        field_C = null;
        if (param0 != -7) {
          return;
        }
        field_F = null;
        field_D = null;
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B != null &&
            this.field_B.h(-114) &&
            this.field_B.a((byte) 121, param1, param2, param3)) {
            return true;
          }
          var5_int = param3;
          if (var5_int != 80) {
            var5_int = -53 % ((17 - param0) / 51);
            return false;
          }
          if (ni.field_m[81]) {
            stackIn_10_0 = this.b((byte) 104, param2);
          } else {
            stackIn_10_0 = this.c((byte) 100, param2);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ok.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 <= -83) {
          return null != this.i(199) ? true : false;
        }
        field_F = (int[]) null;
        return null != this.i(199) ? true : false;
    }

    ok(int param0, int param1, int param2, int param3, t param4, tg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var6 = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          discarded$3 = param2.append('\n');
          var5_int = 27 % ((param0 + 90) / 33);
          for (var6 = 0; param3 >= var6; var6++) {
            discarded$5 = param2.append(' ');
          }
          if (null == this.field_B) {
            discarded$4 = param2.append("null");
            return;
          }
          this.field_B.a(false, param1, param2, param3 + 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ok.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -6);
    }

    void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_B == null) {
            return;
          }
          this.field_B.a(this.field_m + param0, param1 + this.field_p, (byte) -124, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ok.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(k param0, int param1, byte param2, kk param3) {
        vi.field_c = il.c(-14496) * param1 / 1000;
        if (param2 != 52) {
          return;
        }
        try {
          ak.a(param3, 4);
          fe.a(30344, param3);
          cl.a(param3, (byte) -123);
          ea.a(false);
          cj.d(param2 + 45);
          fb.field_a = 0 - vi.field_c;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ok.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    String e(int param0) {
        String var2 = super.e(param0 + param0);
        if (this.field_B == null) {
          return var2;
        }
        String var3 = this.field_B.e(param0 + 0);
        if (var3 == null) {
          return var2;
        }
        return var3;
    }

    final boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -104) {
            return true;
          }
          stackIn_7_0 = (this.field_B != null) && (this.field_B.a((byte) -116, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ok.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
          if (null != this.field_B) {
            this.field_B.a(param0, this.field_p + param1, param2 + this.field_m, 29221);
          }
          if (param3 == 29221) {
            return;
          }
          this.c((byte) 58);
          return;
        }
        if (this.field_y == null) {
          if (null != this.field_B) {
            this.field_B.a(param0, this.field_p + param1, param2 + this.field_m, 29221);
          }
          if (param3 == 29221) {
            return;
          }
          this.c((byte) 58);
          return;
        }
        this.field_y.a(-24969, (al) (this), param2, true, param1);
        if (null != this.field_B) {
          this.field_B.a(param0, this.field_p + param1, param2 + this.field_m, 29221);
        }
        if (param3 == 29221) {
          return;
        }
        this.c((byte) 58);
    }

    final void f(int param0) {
        if (null != this.field_B) {
          this.field_B.f(-24174);
        }
        if (param0 != -24174) {
          field_C = (String[]) null;
          return;
        }
    }

    private final boolean c(byte param0, al param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 60) {
            return false;
          }
          stackIn_8_0 = (this.field_B != null) && (!this.field_B.h(-112)) && (this.field_B.a((byte) -106, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ok.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param1) {
          return;
        }
        try {
          if (this.field_B != null) {
            this.field_B.a(param0, false, param2, param3 + this.field_m, param4, this.field_p + param5);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ok.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 0) {
            return true;
          }
          stackIn_7_0 = (this.field_B != null) && (this.field_B.a(param0, param1, param2, param3, 0, this.field_p + param5, param6 + this.field_m));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ok.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 == -14) {
          return null == this.field_B ? 0 : this.field_B.c((byte) -14);
        }
        field_C = (String[]) null;
        return null == this.field_B ? 0 : this.field_B.c((byte) -14);
    }

    StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 121, param3, param2, param1)) {
            this.a(34, param2, param3, param1);
            this.a(4, param1, param2, param3);
          }
          if (param0) {
            field_C = (String[]) null;
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ok.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0) {
        int var2 = -24 / ((48 - param0) / 40);
        if (null != this.field_B) {
          this.field_B.g(55);
        }
    }

    private final boolean b(byte param0, al param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        al var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 104) {
            var4 = (al) null;
            discarded$1 = this.c((byte) 3, (al) null);
          }
          stackIn_7_0 = (this.field_B != null) && (!this.field_B.h(-90)) && (this.field_B.a((byte) -118, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ok.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_F = new int[128];
        field_C = new String[16];
    }
}
