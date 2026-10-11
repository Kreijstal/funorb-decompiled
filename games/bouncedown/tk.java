/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk extends IOException {
    static boolean field_a;
    static hc field_b;
    static int field_c;

    final static boolean c(int param0) {
        if (param0 == 250) {
          return 250 < oa.field_a ? true : false;
        }
        tk.c(84);
        return 250 < oa.field_a ? true : false;
    }

    tk(String param0) {
        super(param0);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -822) {
          if (4096 > param1) {
            if (param1 >= 2048) {
              stackIn_19_0 = -lc.field_x[-2048 + param1];
            } else {
              stackIn_19_0 = lc.field_x[-param1 + 2048];
            }
            return stackIn_19_0;
          }
          if (param1 >= 6144) {
            stackIn_15_0 = lc.field_x[-6144 + param1];
          } else {
            stackIn_15_0 = -lc.field_x[-param1 + 6144];
          }
          return stackIn_15_0;
        }
        field_a = true;
        if (4096 > param1) {
          if (param1 >= 2048) {
            stackIn_9_0 = -lc.field_x[-2048 + param1];
          } else {
            stackIn_9_0 = lc.field_x[-param1 + 2048];
          }
          return stackIn_9_0;
        }
        if (param1 >= 6144) {
          stackIn_5_0 = lc.field_x[-6144 + param1];
        } else {
          stackIn_5_0 = -lc.field_x[-param1 + 6144];
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = Bounce.field_N;
        if (param3 != -72) {
          return;
        }
        param0--;
        while (param0 >= 0) {
          try {
            var17 = param5;
            var10 = var17;
            var11 = param1;
            var12 = param2;
            var13 = param8;
            var14 = param7;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = var15 + da.b(var14 >> 17, 255) + (da.b(var12 >> 1, 16711680) + (da.b(33423384, var13) >> 9));
            param1++;
            param2 = param2 + param4;
            param7 = param7 + param6;
            param8 = param8 + param9;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("tk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
          }
          param0--;
        }
    }

    public static void b(int param0) {
        if (param0 != 8191) {
          field_a = false;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        ma.field_m = qj.a((byte) 67);
        q.field_N = new pf();
        l.a(true, true, 43);
        if (param0 < 72) {
          field_b = (hc) null;
          return;
        }
    }

    final static void d(int param0) {
        if (!pg.field_c) {
          throw new IllegalStateException();
        }
        pa.field_e = true;
        qb.a(true, -1402584374);
        if (param0 == -6144) {
          mh.field_U = 0;
          return;
        }
        field_a = false;
        mh.field_U = 0;
    }

    static {
    }
}
