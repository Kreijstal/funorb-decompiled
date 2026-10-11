/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class pn extends f {
    boolean field_j;
    f field_l;
    boolean field_k;
    static wj[] field_i;

    void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_l.a(99, param1, param2, param3, param4, param5, param6, param7);
          if (param0 < 92) {
            field_i = (wj[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        this.c(param0, param1);
        this.field_l.b(true, param1);
    }

    final void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        this.field_l.a(param0, param1, param2, param3, param4, param5);
    }

    void c(boolean param0, boolean param1) {
        if (!param0) {
          field_i = (wj[]) null;
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          if (0 < param1 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (!param0) {
            return true;
          }
          if (param1 != 0) {
            var6 = tg.field_d;
            var2 = var6;
            var3 = 0;
            while (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != param1) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "pn.HD(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param0 >> 16;
        int var4 = 65535 & param0;
        int var5 = param2 >> 16;
        int var6 = param2 & 65535;
        if (param1 == 160) {
          return var5 * var4 + param2 * var3 + (var6 * var4 >> 16);
        }
        pn.a(false, 't');
        return var5 * var4 + param2 * var3 + (var6 * var4 >> 16);
    }

    nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.field_k = true;
          }
          stackIn_3_0 = this.field_l.a(23525, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pn.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    int d(byte param0) {
        if (param0 > -40) {
          this.b((f[][]) null, -105, (byte) 127, 83);
          return -1;
        }
        return -1;
    }

    public static void c(byte param0) {
        if (param0 < 105) {
          return;
        }
        field_i = null;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        if (param4 != -35) {
          return;
        }
        try {
          this.field_l = ff.a(param0, param1, param4 + 36, param2, param3);
          this.a(param1, param3, param2, (byte) -78, param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.BC(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    void a(f[][] param0, int param1, int param2, boolean param3) {
        try {
          if (param3) {
            field_i = (wj[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < -69) {
            return;
          }
          this.field_j = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("pn.JC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 65 % ((-43 - param2) / 51);
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("pn.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(fq param0, int param1) {
        try {
          if (param1 <= 126) {
            field_i = (wj[]) null;
          }
          this.field_l.a(param0, 127);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.LB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(f[][] param0, int param1, int param2, int param3) {
        this.field_l.a(param0, param1, param2, -93);
        if (this.field_j) {
          return;
        }
        try {
          if (param3 > -8) {
            field_i = (wj[]) null;
          }
          this.a(param0, param1, param2, false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected Object clone() {
        pn var1 = (pn) (super.clone());
        var1.field_l = (f) (this.field_l.clone());
        return var1;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        this.field_l.a(-116, param1, param2, param3, param4, param5);
        this.b(-94, param2, param5, param1, param3, param4);
        if (param0 > -104) {
          this.a(-25, -57, 24);
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_l.a(param0, param1, param2);
    }

    void a(int param0, f[][] param1, int param2, int param3) {
        try {
          if (param0 != -35) {
            this.field_j = false;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        this.field_l.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 393989) {
          return;
        }
        try {
          this.a(-35, param3, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.UB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0) {
        if (param0 <= -77) {
          return this.field_l.d(-79) & this.d((byte) -50);
        }
        this.a(-116, (f[][]) null, true, 66);
        return this.field_l.d(-79) & this.d((byte) -50);
    }

    final void b(int param0, int param1, f[][] param2, int param3) {
        try {
          this.field_l.b(127, param1, param2, param3);
          if (param0 < 24) {
            this.a(-115, -9, -27, (f[][]) null, -113, -120, -81, -14);
          }
          this.c(param1, 0, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.CC(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    f a(int param0, f[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_j = false;
          this.field_k = false;
          this.field_l = this.field_l.a(param0, param1, param2, param3);
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("pn.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void b(int param0, int param1, int param2, boolean param3, int param4, int param5);

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9352) {
            this.a(103, (byte) 60, 20);
          }
          stackIn_3_0 = this.field_l.a(-9352, param1, param2, param3, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("pn.AC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l.a(110, param1, param2, param3);
          if (param0 <= 106) {
            this.a(-114, (f[][]) null, false, 61);
          }
          if (!this.field_j &&
            !this.field_k) {
            stackIn_8_0 = this.b(param2, param1, (byte) -98, param3);
            return stackIn_8_0;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("pn.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 56 / ((-70 - param1) / 33);
        this.field_l.a(param0, -18, param2, param3, param4, param5);
        this.b(-9, param2, param0, param3, param5, param4);
    }

    f c(int param0) {
        this.field_l = this.field_l.c(param0);
        return (f) (this);
    }

    void a(f[][] param0, int param1, byte param2, int param3) {
        try {
          this.field_l.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    f a(int param0, byte param1, int param2) {
        this.field_l = this.field_l.a(param0, param1, param2);
        return (f) (this);
    }

    void c(int param0, int param1, f[][] param2, int param3) {
        try {
          if (param1 != 0) {
            this.a(3, (byte) -106, -30);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    pn(f param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
