/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag {
    private li field_b;
    private int field_g;
    private wf field_c;
    static String field_e;
    private int field_d;
    static int field_f;
    static volatile boolean field_a;

    final void a(Object param0, byte param1, long param2) {
        try {
          this.a(1, param2, param0, -127);
          if (param1 != -122) {
            field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ag.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, long param1, Object param2, int param3) {
        cb var6 = null;
        pj var7 = null;
        int var8 = fleas.field_A ? 1 : 0;
        try {
          if (param0 > this.field_g) {
            throw new IllegalStateException();
          }
          this.a(param1, (byte) 94);
          this.field_d = this.field_d - param0;
          while (this.field_d < 0) {
            var6 = (cb) (this.field_c.d(-27593));
            this.a(var6, 28);
          }
          int var6_int = -125 % ((48 - param3) / 46);
          var7 = new pj(param2, param0);
          this.field_b.a(param1, var7, (byte) 43);
          this.field_c.a(-99, var7);
          ((cb) ((Object) var7)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ag.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(long param0, byte param1) {
        if (param1 != 94) {
          return;
        }
        cb var4 = (cb) (this.field_b.a(true, param0));
        this.a(var4, 13);
    }

    private ag() throws Throwable {
        throw new Error();
    }

    final static rh a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          cg var8 = null;
          rh stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != mh.field_x.field_q) {
              rd.field_c = new k(mh.field_x.field_q, 5200, 0);
              mh.field_x.field_q = null;
              var6 = new ah(255, rd.field_c, new k(mh.field_x.field_t, 12000, 0), 2097152);
            }
            if (rd.field_c != null) {
              if (mc.field_c == null) {
                mc.field_c = new k[mh.field_x.field_l.length];
              }
              if (mc.field_c[param1] == null) {
                mc.field_c[param1] = new k(mh.field_x.field_l[param1], 12000, 0);
                mh.field_x.field_l[param1] = null;
              }
              var7 = new ah(param1, rd.field_c, mc.field_c[param1], 2097152);
            }
            if (param5 != 1) {
              ag.a(7);
            }
            var8 = gf.field_e.a(28742, param2, (ah) (var7), (ah) (var6), param1);
            if (param0) {
              var8.c(param5 - 78);
            }
            stackIn_15_0 = new rh(var8, param4, param3);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object a(byte param0, long param1) {
        pj var7 = null;
        cb var8 = (cb) (this.field_b.a(true, param1));
        int var5 = 60 / ((-15 - param0) / 34);
        if (var8 == null) {
          return null;
        }
        Object var6 = var8.g(5);
        if (var6 != null) {
          if (!var8.c((byte) -52)) {
            this.field_c.a(-123, var8);
            var8.field_j = 0L;
          } else {
            var7 = new pj(var6, var8.field_r);
            this.field_b.a(var8.field_c, var7, (byte) 43);
            this.field_c.a(-36, var7);
            ((cb) ((Object) var7)).field_j = 0L;
            var8.c(-1);
            var8.e(90);
          }
          return var6;
        }
        var8.c(-1);
        var8.e(30);
        this.field_d = this.field_d + var8.field_r;
        return null;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = 5;
          field_e = null;
          return;
        }
        field_e = null;
    }

    private final void a(cb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            param0.c(-1);
            param0.e(-118);
            this.field_d = this.field_d + param0.field_r;
          }
          if (param1 > 3) {
            return;
          }
          field_e = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ag.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_a = false;
    }
}
