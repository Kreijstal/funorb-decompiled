/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep extends f implements Cloneable {
    private int field_k;
    private f field_j;
    private int field_i;

    final void b(int param0, int param1, f[][] param2, int param3) {
        try {
          this.field_j.b(101, param1, param2, param3);
          if (param0 <= 24) {
            this.a((byte) 0);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ep.CC(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int d(int param0) {
        if (param0 >= -77) {
          this.field_k = 30;
          return this.field_j.d(-82);
        }
        return this.field_j.d(-82);
    }

    final static boolean a(char param0, byte param1) {
        if (param1 != -14) {
          return true;
        }
        if (65 <= param0) {
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          return -79;
        }
        return 0;
    }

    final static wj[] a(db param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param2, -1);
          if (param3) {
            ep.c((byte) -89);
          }
          var5 = param0.a(-2862, param1, var4_int);
          stackIn_3_0 = qk.a(false, var4_int, param0, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ep.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    protected final Object clone() {
        ep var1 = (ep) (super.clone());
        var1.field_j = (f) (this.field_j.clone());
        return var1;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_j = ff.a(param0, param1, 1, param2, param3);
          if (param4 == -35) {
            return;
          }
          this.a((byte) 87);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("ep.BC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -29660) {
          this.field_i = -116;
        }
    }

    final static int c(byte param0) {
        if (param0 != 112) {
          return -103;
        }
        return lg.field_b;
    }

    final void b(boolean param0, boolean param1) {
        this.field_j.b(param0, param1);
    }

    final int a(byte param0) {
        if (param0 > -34) {
          this.field_i = -99;
          return this.field_j.a((byte) -39);
        }
        return this.field_j.a((byte) -39);
    }

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k == param4 &&
            0 == this.field_i) {
            mb.field_g = mb.field_g - 128;
            fn.field_j = fn.field_j - 128;
            fp.field_a = fp.field_a + 2;
            we.field_h = we.field_h + 2;
            je.field_j = je.field_j + 1;
            b.field_a = b.field_a + 1;
            fn.field_j = fn.field_j + ob.field_l;
            wd.field_j = wd.field_j - 1;
            pm.field_b.a(128, param1 * 12, 12 * param2, 0, (byte) -111);
            this.field_i = 1;
            this.a((byte) 74, param3);
            this.field_j.a((byte) 87, param3);
            stackIn_3_0 = 1;
            return stackIn_3_0;
          }
          if (param0 == -9352) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          this.d(-6);
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ep.AC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        if (param1 >= 61) {
          this.field_k = param0;
          return;
        }
        this.a(-85, 60, 47, false, -57, 25);
        this.field_k = param0;
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        try {
          this.field_j.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ep.UB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        this.field_j.a(param3, param4, false, param0, param5, param2);
        int var7 = param3 ? 18 : this.field_i;
        if (24 != param2) {
          if (var7 <= 1) {
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8 = 32 % ((param1 + 70) / 33);
            return;
          }
          bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[this.field_k]);
          var8Lifetime5 = ((24 - var7) * param2 + 23) / 24;
          var9 = (param0 * (24 - var7) + 23) / 24;
          if (param2 <= var8Lifetime5) {
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8Lifetime5 = 32 % ((param1 + 70) / 33);
            return;
          }
          if (param0 > var9) {
            this.field_j.a(-128, param3, param2 - var8Lifetime5, param5 + var8Lifetime5, param4 + var9, param0 - var9);
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8Lifetime5 = 32 % ((param1 + 70) / 33);
            return;
          }
          v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
          var8Lifetime6 = 32 % ((param1 + 70) / 33);
          return;
        }
        if (param0 != 24) {
          if (var7 <= 1) {
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8Lifetime1 = 32 % ((param1 + 70) / 33);
            return;
          }
          bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[this.field_k]);
          var8Lifetime1Lifetime1 = ((24 - var7) * param2 + 23) / 24;
          var9Lifetime1 = (param0 * (24 - var7) + 23) / 24;
          if (param2 <= var8Lifetime1Lifetime1) {
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8Lifetime1Lifetime1 = 32 % ((param1 + 70) / 33);
            return;
          }
          if (param0 > var9Lifetime1) {
            this.field_j.a(-128, param3, param2 - var8Lifetime1Lifetime1, param5 + var8Lifetime1Lifetime1, param4 + var9Lifetime1, param0 - var9Lifetime1);
            v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8Lifetime1Lifetime1 = 32 % ((param1 + 70) / 33);
            return;
          }
          v.field_b[var7 / 2].b(param5, param4 - param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
          var8Lifetime1Lifetime2 = 32 % ((param1 + 70) / 33);
          return;
        }
        if (var7 <= 1) {
          v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
          var8Lifetime2 = 32 % ((param1 + 70) / 33);
          return;
        }
        bb.field_y[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
        var8Lifetime3 = ((24 - var7) * param2 + 23) / 24;
        var9Lifetime2 = (param0 * (-var7 + 24) + 23) / 24;
        if (var8Lifetime3 >= param2) {
          v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
          var8Lifetime3 = 32 % ((param1 + 70) / 33);
          return;
        }
        if (param0 > var9Lifetime2) {
          this.field_j.a(-125, param3, param2 - var8Lifetime3, var8Lifetime3 + param5, param4 + var9Lifetime2, param0 - var9Lifetime2);
          v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
          var8Lifetime3 = 32 % ((param1 + 70) / 33);
          return;
        }
        v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
        var8Lifetime4 = 32 % ((param1 + 70) / 33);
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.a(-24, -83, 51, true, 50, -127);
          }
          stackIn_3_0 = ng.a(qh.field_g, param1, new ep(new kp(-1), this.field_k), (byte) -83, rb.field_j);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        f stackIn_7_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 106) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          if (this.field_i > 0) {
            this.field_i = this.field_i + 1;
            if (24 == this.field_i) {
              stackIn_7_0 = this.field_j;
              return stackIn_7_0;
            }
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ep.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    ep(f param0, int param1) {
        this.field_i = 0;
        try {
          this.field_j = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ep.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
