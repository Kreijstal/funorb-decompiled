/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ao {
    String field_c;
    int field_e;
    static boolean field_b;
    static int field_d;
    static t[] field_a;
    static int field_f;

    final static int b(int param0, int param1) {
        if (param0 != 2048) {
          ao.b(1, 62);
        }
        param1 = param1 & 8191;
        if (param1 < 4096) {
          return param1 >= 2048 ? -bm.field_j[param1 - 2048] : bm.field_j[-param1 + 2048];
        }
        return param1 >= 6144 ? bm.field_j[param1 - 6144] : -bm.field_j[6144 - param1];
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_c, this.field_e);
    }

    final static li a(int param0, int param1, int param2, la param3, la param4) {
        RuntimeException var5 = null;
        la var6 = null;
        Object stackIn_4_0 = null;
        li stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -75) {
            var6 = (la) null;
            ao.a(77, 31, 80, (la) null, (la) null);
          }
          if (nd.a(param1, param3, -1, param2)) {
            stackIn_6_0 = ee.a(param4.a(param1, 100, param2), 7028);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (li) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ao.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Torquing.field_u;
        try {
          jg.a(param1, param0 ^ -8141, true, mc.field_l, 0, ga.field_c, vg.field_o);
          if (param0 != 8191) {
            return;
          }
          for (var2_int = 0; var2_int < vg.field_o; var2_int++) {
            lp.field_g[param1 + var2_int] = var2_int;
          }
          jg.a(param1 + param1, param0 ^ -8153, false, qd.field_g, param1, lj.field_d, param1 + vg.field_o);
          if (vg.field_o > param1) {
            vg.field_o = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "ao.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 23116) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
