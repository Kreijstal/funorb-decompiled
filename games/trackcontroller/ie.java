/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_a;

    final static kd a(long param0, String param1, boolean param2, String param3, byte param4) {
        RuntimeException var6 = null;
        kd stackIn_2_0 = null;
        of stackIn_9_0 = null;
        sc stackIn_11_0 = null;
        ec stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -107) {
            stackIn_2_0 = (kd) null;
            return stackIn_2_0;
          }
          if (0L == param0 &&
            param3 != null) {
            stackIn_11_0 = new sc(param3, param1);
            return (kd) ((Object) stackIn_11_0);
          }
          if (param2) {
            stackIn_9_0 = new of(param0, param1);
            return (kd) ((Object) stackIn_9_0);
          }
          stackIn_13_0 = new ec(param0, param1);
          return (kd) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ie.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 < 38) {
          field_a = (String) null;
        }
        if (gl.field_I < 2) {
          return 0;
        }
        if (hl.field_F == 0) {
          if (!ei.field_i.c(-81)) {
            return 20;
          }
          if (!ei.field_i.b("commonui", (byte) -3)) {
            return 40;
          }
          if (!ha.field_x.c(-63)) {
            return 50;
          }
          if (!ha.field_x.b("commonui", (byte) -3)) {
            return 60;
          }
          if (!ok.field_G.c(88)) {
            return 70;
          }
          if (ok.field_G.a((byte) 48)) {
            return 100;
          }
          return 80;
        }
        if (null != ff.field_b) {
          if (!ff.field_b.c(123)) {
            return 14;
          }
          if (!ff.field_b.a("", (byte) -113)) {
            return 29;
          }
          if (!ff.field_b.b("", (byte) -3)) {
            return 29;
          }
        }
        if (!ei.field_i.c(-121)) {
          return 43;
        }
        if (!ei.field_i.b("commonui", (byte) -3)) {
          return 57;
        }
        if (!ha.field_x.c(116)) {
          return 71;
        }
        if (!ha.field_x.b("commonui", (byte) -3)) {
          return 80;
        }
        if (!ok.field_G.c(94)) {
          return 82;
        }
        if (!ok.field_G.a((byte) 48)) {
          return 86;
        }
        return 100;
    }

    final static ng[] a(String param0, kk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ng[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 38) {
            var6 = (String) null;
            ie.a(11L, (String) null, false, (String) null, (byte) 116);
          }
          var4_int = param1.a(true, param0);
          var5 = param1.a(param2, var4_int, -1);
          stackIn_3_0 = nd.a(param1, var5, var4_int, 16777215);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ie.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 82) {
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 2) {
            stackIn_6_0 = (null != ob.a(param1 + 47, param0));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ie.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != 93) {
          field_a = (String) null;
          qc.b(4, (byte) -42);
          return;
        }
        qc.b(4, (byte) -42);
    }

    static {
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
