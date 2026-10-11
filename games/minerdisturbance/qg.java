/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qg implements ad {
    static int[] field_n;
    static dm field_d;
    private int field_i;
    private int field_j;
    private int field_k;
    private int field_h;
    static String field_e;
    static String field_g;
    private we field_c;
    static rc field_b;
    private int field_a;
    private int field_m;
    private int field_l;
    static int field_f;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_e = null;
        field_g = null;
        field_n = null;
        field_d = null;
    }

    qg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_j = param3;
          this.field_c = param0;
          this.field_k = param4;
          this.field_h = param2;
          this.field_a = param6;
          this.field_i = param1;
          this.field_m = param7;
          this.field_l = param5;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        s var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param2 instanceof s) ? null : (s) (param2);
          eh.e(param1 + param2.field_u, param3 + param2.field_t, param2.field_v, param2.field_q, this.field_m);
          if (var14 != null) {
          }
          var7 = param1 - (-param2.field_u - var14.field_M);
          var8 = var14.field_R + param2.field_t + param3;
          eh.c(var7, var8, var14.field_J, this.field_l);
          if (var14.field_K != -1) {
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_K) / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            eh.c(var11 + var7, var12 + var8, 1, this.field_a);
          }
          eh.c(var7, var8, 2, 1);
          var9Lifetime1 = (double)var14.field_S * 3.141592653589793 * 2.0 / (double)var14.field_N;
          if (param0 != 12088) {
            qg.a(-31);
          }
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_J);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_J);
          eh.d(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (null != this.field_c) {
            var13 = var14.field_M + var14.field_J + this.field_i;
            this.field_c.a(param2.field_s, param2.field_u + param1 + var13, this.field_h + param3 + param2.field_t, param2.field_v - this.field_i - var13, param2.field_q - (this.field_i << 1), this.field_j, this.field_k, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "qg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static hn a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        oc stackIn_5_0 = null;
        tl stackIn_8_0 = null;
        pc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            qg.a(-13);
          }
          if (param0 == 0L &&
            param3 != null) {
            stackIn_5_0 = new oc(param3, param1);
            return (hn) ((Object) stackIn_5_0);
          }
          if (!param4) {
            stackIn_10_0 = new pc(param0, param1);
            return (hn) ((Object) stackIn_10_0);
          }
          stackIn_8_0 = new tl(param0, param1);
          return (hn) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(vf param0, int param1, int param2, int param3, int param4, long param5, int param6, String param7, boolean param8, int param9, boolean param10, boolean param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            kj.field_a = new ld(param9);
            sn.field_c = new ld(param12);
            ic.field_h = param6;
            cm.field_q = param3;
            ei.field_L = param11;
            sj.field_c = param13;
            mm.field_b = param0;
            wf.field_U = param7;
            ii.field_a = param1;
            v.field_e = param8;
            if (!param10) {
              return;
            }
            bj.field_a = param5;
            jc.field_E = param4;
            mh.field_c = param2;
            if (mm.field_b.field_i == null) {
              return;
            }
            try {
              w.field_W = new me(mm.field_b.field_i, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("qg.D(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_n = new int[8192];
        field_e = "Unpacking graphics";
        field_g = "You have 1 unread message!";
        field_f = 0;
    }
}
