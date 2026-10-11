/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static int[] field_a;

    final static wg a(int param0, boolean param1, String param2) {
        wg var3 = null;
        RuntimeException var3_ref = null;
        wg stackIn_2_0 = null;
        wg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wg(false);
          var3.field_d = param2;
          var3.field_b = param0;
          if (param1) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (wg) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("mh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2 = SolKnight.field_L ? 1 : 0;
        int var1_intLifetime1;
        fh.field_e.c(-10158);
        int var1_int = 0;
        if (param0 != 8192) {
          return;
        }
        try {
          while (var1_int < 32) {
            qf.field_c[var1_int] = 0L;
            var1_int++;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            pg.field_d[var1_intLifetime1] = 0L;
          }
          mj.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 < 90) {
          return;
        }
        field_a = null;
    }

    final static o a(boolean param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        o stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_a = (int[]) null;
          }
          if (l.a(108, param3, param2, param1)) {
            stackIn_6_0 = sf.b(0);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (o) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new int[8192];
    }
}
