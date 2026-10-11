/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class si extends vg implements ba {
    static db field_A;
    vg field_z;
    static he[] field_G;
    static nh field_F;
    static boolean[] field_C;
    static vj field_E;
    static int field_B;
    static he field_D;

    void i(int param0) {
        if (param0 == 0) {
          if (null != this.field_z) {
            this.field_z.e((byte) 38);
          }
          return;
        }
        field_G = (he[]) null;
        if (null != this.field_z) {
          this.field_z.e((byte) 38);
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 63) {
            return false;
          }
          if (null != this.field_z &&
            this.field_z.a(true) &&
            this.field_z.a(param0, param1, param2, 74)) {
            return true;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (ck.field_f[81]) {
            stackIn_13_0 = this.a(0, param2);
          } else {
            stackIn_13_0 = this.a(param2, 6);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 43) {
            si.f(-83);
          }
          stackIn_7_0 = (null != this.field_z) && (this.field_z.a(true)) && (this.field_z.a(param0, param1, (byte) 113, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("si.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String e(int param0) {
        String var2 = super.e(-93);
        if (null == this.field_z) {
          if (param0 > -39) {
            field_B = 63;
            return var2;
          }
          return var2;
        }
        String var3 = this.field_z.e(-71);
        if (var3 != null) {
          return var3;
        }
        if (param0 > -39) {
          field_B = 63;
          return var2;
        }
        return var2;
    }

    vg h(int param0) {
        int var2 = -51 % ((-28 - param0) / 57);
        vg var3 = this.field_z;
        if (var3 == null) {
          return null;
        }
        if (var3.a(true)) {
          return var3;
        }
        return null;
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 113) {
            field_E = (vj) null;
          }
          stackIn_6_0 = (null != this.field_z) && (this.field_z.a(param0, param1, param2, (byte) 123, param4, param5 + this.field_o, this.field_m + param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("si.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param1 == 0 &&
          this.field_l != null) {
          this.field_l.a(true, param2 + 143, (vg) (this), param3, param0);
        }
        if (param2 != -21) {
          field_G = (he[]) null;
        }
        if (null != this.field_z) {
          this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
        }
    }

    private final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            field_B = -60;
          }
          stackIn_7_0 = (null != this.field_z) && (!this.field_z.a(true)) && (this.field_z.a(false, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
          if (param3 != -10612) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param2, param0, 92)) {
            this.a(param2, (byte) 89, param0, param1);
            this.a(10, param2, param0, param1);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("si.WA(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 == 3) {
          return null != this.field_z ? this.field_z.d(3) : 0;
        }
        field_F = (nh) null;
        return null != this.field_z ? this.field_z.d(3) : 0;
    }

    si(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          discarded$3 = param1.append((char)param0);
          for (var5_int = 0; param2 >= var5_int; var5_int++) {
            discarded$5 = param1.append(' ');
          }
          if (this.field_z == null) {
            discarded$4 = param1.append("null");
            return;
          }
          this.field_z.a(param2 + 1, param3, param1, -10612);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("si.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_z == null) {
          var2 = -113 / ((-10 - param0) / 51);
          return;
        }
        this.field_z.c((byte) -93);
        var2Lifetime1 = -113 / ((-10 - param0) / 51);
    }

    final static void f(int param0) {
        cj.field_h = new he[8];
        cj.field_h[4] = od.field_k;
        cj.field_h[2] = ri.field_b;
        cj.field_h[1] = re.field_d;
        cj.field_h[0] = fa.field_o;
        if (param0 == 10) {
          cj.field_h[5] = qc.field_a;
          cj.field_h[6] = p.field_e;
          cj.field_h[3] = of.field_x;
          cj.field_h[7] = c.field_a[0];
          return;
        }
    }

    private final boolean a(int param0, vg param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_D = (he) null;
          }
          stackIn_7_0 = (null != this.field_z) && (!this.field_z.a(true)) && (this.field_z.a(false, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return null != this.h(115) ? true : false;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, (byte) -128);
          if (param3 > -127) {
            var6 = (vg) null;
            this.a(22, (vg) null, -5, (byte) 124, 57, 35, -88);
          }
          if (null == this.field_z) {
            return;
          }
          this.field_z.a(param0, param1 + this.field_o, this.field_m + param2, (byte) -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("si.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    public static void g(int param0) {
        field_F = null;
        field_C = null;
        field_E = null;
        if (param0 == 6714) {
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        }
        si.f(94);
        field_A = null;
        field_D = null;
        field_G = null;
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            this.a(-71, 74, (byte) -81, 61);
          }
          if (null == this.field_z) {
            return;
          }
          this.field_z.a(param0 + this.field_o, this.field_m + param1, param2, param3, param4, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("si.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_7_0 = (this.field_z != null) && (this.field_z.a(param0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("si.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_A = new db(2);
        field_C = new boolean[]{false, false, false, false};
    }
}
