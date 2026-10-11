/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static double[] field_d;
    static int field_c;
    static un field_b;
    static String field_a;
    static boolean field_e;

    final static void a(byte param0, boolean param1) {
        if (0 >= kh.field_d) {
          if (param0 < 16) {
            field_b = (un) null;
            if (0 >= hn.field_h &&
              th.field_z <= 0) {
              return;
            }
            if (!ad.field_h) {
              return;
            }
            df.g(0, 0, df.field_e, we.field_c.field_J);
            pm.field_n.a(param1, 24960);
            return;
          }
          if (0 < hn.field_h) {
            if (!ad.field_h) {
              return;
            }
            df.g(0, 0, df.field_e, we.field_c.field_J);
            pm.field_n.a(param1, 24960);
            return;
          }
          if (th.field_z <= 0) {
            return;
          }
          if (ad.field_h) {
            df.g(0, 0, df.field_e, we.field_c.field_J);
            pm.field_n.a(param1, 24960);
          }
          return;
        }
        if (!ao.field_Gb) {
          if (param0 < 16) {
            field_b = (un) null;
          }
          if (0 < hn.field_h) {
            if (!ad.field_h) {
              return;
            }
            df.g(0, 0, df.field_e, we.field_c.field_J);
            pm.field_n.a(param1, 24960);
            return;
          }
          if (th.field_z <= 0) {
            return;
          }
          if (ad.field_h) {
            df.g(0, 0, df.field_e, we.field_c.field_J);
            pm.field_n.a(param1, 24960);
          }
          return;
        }
        df.g(0, 0, df.field_e, we.field_c.field_J);
        jj.field_a.a(param1, 24960);
        if (param0 < 16) {
          field_b = (un) null;
        }
        if (0 < hn.field_h) {
          if (!ad.field_h) {
            return;
          }
          df.g(0, 0, df.field_e, we.field_c.field_J);
          pm.field_n.a(param1, 24960);
        } else {
          if (th.field_z > 0) {
            if (ad.field_h) {
              df.g(0, 0, df.field_e, we.field_c.field_J);
              pm.field_n.a(param1, 24960);
            }
            return;
          }
        }
    }

    final static rc a(eh param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        rc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.b(param2, 27034);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (rc) (stackIn_2_0);
          }
          if (param1 <= 41) {
            field_d = (double[]) null;
          }
          stackIn_6_0 = new rc(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vm.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static pe a(byte param0, ml param1) {
        RuntimeException var2 = null;
        pe stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 30) {
            stackIn_4_0 = tm.a(jh.a(param1, 100, 96), param0 ^ 65);
            return stackIn_4_0;
          }
          stackIn_2_0 = (pe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -105) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_a = "<%0> resigned";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static pe $cfr$intArgs$a$45c25716b3df(int param0, ml param1) {
        RuntimeException var2 = null;
        pe stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 30) {
            stackIn_4_0 = tm.a(jh.a(param1, 100, 96), param0 ^ 65);
            return stackIn_4_0;
          }
          stackIn_2_0 = (pe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }
}
