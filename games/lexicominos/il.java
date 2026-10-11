/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    static int field_c;
    static String field_a;
    static ng field_b;

    final static int a(int param0, String param1, String param2, String param3, boolean param4, int param5, int param6) {
        gb var7 = null;
        RuntimeException var7_ref = null;
        gb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new gb(param1);
          var8 = new gb(param3);
          if (param5 < 88) {
            il.a(40);
          }
          stackIn_3_0 = hc.a(param6, param0, var8, -30762, var7, param2, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("il.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static sh a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          ug var8 = null;
          sh stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (sa.field_g.field_t != null) {
              wj.field_s = new be(sa.field_g.field_t, 5200, 0);
              sa.field_g.field_t = null;
              var6 = new dl(255, wj.field_s, new be(sa.field_g.field_o, 12000, 0), 2097152);
            }
            if (null != wj.field_s) {
              if (bd.field_i == null) {
                bd.field_i = new be[sa.field_g.field_c.length];
              }
              if (null == bd.field_i[param3]) {
                bd.field_i[param3] = new be(sa.field_g.field_c[param3], 12000, 0);
                sa.field_g.field_c[param3] = null;
              }
              var7 = new dl(param3, wj.field_s, bd.field_i[param3], 2097152);
            }
            var8 = nh.field_a.a(param3, 3510, (dl) (var7), (dl) (var6), param2);
            if (param1 != 12317) {
              il.a(false, -117, false, -23, true, 38);
            }
            if (param4) {
              var8.c(11002);
            }
            stackIn_15_0 = new sh(var8, param0, param5);
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

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_c = -1;
        field_a = "Play the game without logging in just yet";
        field_b = new ng();
    }
}
