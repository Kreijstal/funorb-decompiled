/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends l {
    static String field_k;
    int[] field_u;
    static int[] field_m;
    int[] field_l;
    static boolean field_t;
    int field_h;
    static mg[] field_p;
    static int field_o;
    int[] field_g;
    int field_n;
    un[] field_q;
    static int field_i;
    byte[][][] field_j;
    static String field_s;
    un[] field_r;

    final static void a(int param0, int param1, mg param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = param2.field_p * param2.field_w;
          while (var3_int != 0) {
            var3_int--;
            param2.field_B[var3_int] = param0;
          }
          if (param1 == 25928) {
            return;
          }
          field_o = 121;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static java.awt.Container a(int param0) {
        if (param0 != 0) {
          field_m = (int[]) null;
          if (bj.field_m != null) {
            return (java.awt.Container) ((Object) bj.field_m);
          }
          return (java.awt.Container) ((Object) mb.g((byte) 46));
        }
        if (bj.field_m != null) {
          return (java.awt.Container) ((Object) bj.field_m);
        }
        return (java.awt.Container) ((Object) mb.g((byte) 46));
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fa var11 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          df.b(param2, param3, param1 + 1, 10000536);
          df.b(param2, param4 + param3, 1 + param1, 12105912);
          var5_int = 1;
          if (!param0) {
            var11 = (fa) null;
            bf.a((fa) null, -34, -7);
          }
          if (df.field_g > param3 + var5_int) {
            var5_int = df.field_g - param3;
          }
          var6 = param4;
          if (var6 + param3 > df.field_h) {
            var6 = df.field_h - param3;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param4;
            var9 = var8 << 16 | var8 << 8 | var8;
            df.field_d[(param3 + var7) * df.field_e + param2] = var9;
            df.field_d[param1 + param2 + (var7 + param3) * df.field_e] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var5), "bf.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(fa param0, int param1, int param2) {
        hg var5 = null;
        int var4 = 0;
        try {
          var5 = gk.field_g;
          var5.g(param2, 8);
          var5.field_l = var5.field_l + 1;
          var4 = var5.field_l;
          var5.a(1, -109);
          if (param0.field_g == null) {
            var5.a(0, param1 ^ -98);
          } else {
            var5.a(param0.field_g.length, 76);
            var5.a(param0.field_g, param0.field_g.length, 0, (byte) 94);
          }
          var5.b((byte) -111, var4);
          var5.field_l = var5.field_l - param1;
          param0.field_i = var5.d((byte) 127);
          var5.b(var5.field_l - var4, param1 ^ -5);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static km a(byte param0) {
        if (param0 >= -70) {
          bf.a((byte) -57);
          return d.h(0);
        }
        return d.h(0);
    }

    public static void c(int param0) {
        if (param0 == 20391) {
          field_s = null;
          field_m = null;
          field_k = null;
          field_p = null;
          return;
        }
        field_p = (mg[]) null;
        field_s = null;
        field_m = null;
        field_k = null;
        field_p = null;
    }

    bf() {
    }

    static {
        field_m = new int[16384];
        field_k = "Elapsed time";
        field_o = 0;
        field_s = "Show all private chat";
        field_t = false;
        field_i = 0;
    }
}
