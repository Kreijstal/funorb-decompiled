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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param2.field_p * param2.field_w;
            L1: while (true) {
              if (var3_int == 0) {
                break L0;
              } else {
                var3_int--;
                param2.field_B[var3_int] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bf.D(").append(0).append(',').append(25928).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static java.awt.Container a() {
        if (!(bj.field_m == null)) {
            return (java.awt.Container) (Object) bj.field_m;
        }
        return (java.awt.Container) (Object) mb.g((byte) 46);
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              df.b(param2, param3, param1 - -1, 10000536);
              df.b(param2, param4 + param3, 1 + param1, 12105912);
              var5_int = 1;
              if (df.field_g > param3 - -var5_int) {
                var5_int = df.field_g - param3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param4;
              if (var6 + param3 <= df.field_h) {
                break L2;
              } else {
                var6 = df.field_h - param3;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = 152 + 48 * var7 / param4;
                var9 = var8 << 16 | var8 << 8 | var8;
                df.field_d[(param3 + var7) * df.field_e - -param2] = var9;
                df.field_d[param1 + param2 + (var7 + param3) * df.field_e] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var5, "bf.F(" + true + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(fa param0) {
        hg var5 = null;
        int var4 = 0;
        try {
            var5 = gk.field_g;
            var5.g(6, 8);
            var5.field_l = var5.field_l + 1;
            var4 = var5.field_l;
            var5.a(1, -109);
            if (param0.field_g == null) {
                var5.a(0, -102);
            } else {
                var5.a(param0.field_g.length, 76);
                var5.a(param0.field_g, param0.field_g.length, 0, (byte) 94);
            }
            int discarded$0 = var5.b((byte) -111, var4);
            var5.field_l = var5.field_l - 4;
            param0.field_i = var5.d((byte) 127);
            var5.b(var5.field_l + -var4, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ',' + 6 + ')');
        }
    }

    final static km a(byte param0) {
        if (param0 >= -70) {
            km discarded$0 = bf.a((byte) -57);
            int discarded$1 = 0;
            return d.h();
        }
        int discarded$2 = 0;
        return d.h();
    }

    public static void c(int param0) {
        if (param0 != 20391) {
          field_p = null;
          field_s = null;
          field_m = null;
          field_k = null;
          field_p = null;
          return;
        } else {
          field_s = null;
          field_m = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    bf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[16384];
        field_k = "Elapsed time";
        field_o = 0;
        field_s = "Show all private chat";
        field_t = false;
        field_i = 0;
    }
}
