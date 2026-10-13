/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aa {
    static jp field_b;
    static NodeDeque field_a;
    static String field_c;

    public static void b(int param0) {
        field_b = null;
        if (param0 < 64) {
          aa.a((byte) 28);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 != 480) {
          return 109;
        }
        return Paddle.field_x;
    }

    final static void a(int param0, jp param1, boolean param2, int param3, pb param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fc.a(-109, param4.field_p);
          lb.g(0, 0, param4.field_i, param4.field_q, fj.field_Sb[param3], 0);
          stackIn_2_0 = -120;
          if (param5 == 1) {
            stackIn_3_1 = 13;
          } else {
            stackIn_3_1 = 0;
          }
          if (param5 == 1) {
            stackIn_6_2 = 13;
          } else {
            stackIn_6_2 = 20;
          }
          og.a(stackIn_2_0, stackIn_3_1, stackIn_6_2, param1, 16777215, (param4.field_i - param1.field_x) / 2, 10 / param5 - param1.field_z + (480 + param0));
          sc.b(-86);
          if (param2) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("aa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0) {
        pb var2;
        if (param0 >= 23) {
          if (hc.field_f > 0) {
            hc.field_f = hc.field_f - 1;
          }
          if (kc.field_q.field_f != ej.field_O) {
            rn.field_h = rn.field_h + (kc.field_q.field_f - ej.field_O);
            ej.field_O = kc.field_q.field_f;
          }
          if (hc.field_f > 0) {
            ef.a(-83);
          }
          return;
        }
        var2 = (pb) null;
        aa.a(90, (jp) null, false, 114, (pb) null, 94);
        if (hc.field_f > 0) {
          hc.field_f = hc.field_f - 1;
        }
        if (kc.field_q.field_f != ej.field_O) {
          rn.field_h = rn.field_h + (kc.field_q.field_f - ej.field_O);
          ej.field_O = kc.field_q.field_f;
        }
        if (hc.field_f > 0) {
          ef.a(-83);
        }
        return;
    }

    final static int a(int param0, Random param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (!param2) {
            field_b = (jp) null;
          }
          if (wn.a(param0, (byte) -6)) {
            stackIn_7_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_7_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var4 = param1.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = er.nonnegativeRemainder(-1560508993, param0, var4);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("aa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new jp(270, 70);
        field_c = "Use this alternative as your account name";
        field_a = new NodeDeque();
    }
}
