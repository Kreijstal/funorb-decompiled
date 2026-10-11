/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ec {
    static rc field_d;
    int field_e;
    static qj field_b;
    static int[] field_c;
    String field_a;

    final static void a(int param0, int param1) {
        od var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        od var2Lifetime1;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          kc.field_g = param0;
          var2 = (od) (lb.field_f.a((byte) -95));
          while (var2 != null) {
            if (!var2.field_i.b(param1 - 9948)) {
              var2.c(param1 - 9951);
            } else {
              var2.field_j.i(128 + var2.field_k * kc.field_g >> 8);
            }
            var2 = (od) (lb.field_f.a(true));
          }
          if (param1 != 9956) {
            ec.a(true, true, 47);
          }
          if (null != nc.field_q) {
            var2Lifetime1 = (od) (nc.field_q.a((byte) -95));
            while (var2Lifetime1 != null) {
              if (var2Lifetime1.field_i.b(8)) {
                var2Lifetime1.field_j.i(128 + var2Lifetime1.field_k * kc.field_g >> 8);
              } else {
                var2Lifetime1.c(5);
              }
              var2Lifetime1 = (od) (nc.field_q.a(true));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ec.M(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 0) {
          field_c = (int[]) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param0) {
          sb.c();
          kh.a(-75, param0);
          var3 = 119 % ((-73 - param2) / 42);
          return;
        }
        sb.c(0, 0, sb.field_c, sb.field_g, 0, 192);
        kh.a(-75, param0);
        var3Lifetime1 = 119 % ((-73 - param2) / 42);
    }

    final static hb a(int param0, int param1, int param2, hb param3) {
        hb var4 = null;
        RuntimeException var4_ref = null;
        hb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hb(param3.field_h, -param2 + param0);
          ji.a(param3.field_l, param2, var4.field_l, param1, var4.field_l.length);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ec.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static ci a(boolean param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 == 77) {
          return mh.a(-26159, param4, param0, false, param2, param3);
        }
        ec.a(true, (byte) 79, -120, 125, true);
        return mh.a(-26159, param4, param0, false, param2, param3);
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (null != wg.field_d) {
            wg.field_d.r(77);
          }
          ok.field_a = new ff(param0, param2, false, true, true);
          int var3_int = -114 / ((57 - param1) / 56);
          l.field_d.b(-88, ok.field_a);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ec.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 == -9008) {
          return new java.net.Socket(this.field_a, this.field_e);
        }
        field_c = (int[]) null;
        return new java.net.Socket(this.field_a, this.field_e);
    }

    static {
        field_d = new rc();
        field_c = new int[8192];
        field_b = new qj();
    }
}
