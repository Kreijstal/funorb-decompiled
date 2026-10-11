/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static boolean field_c;
    static String field_b;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 21) {
          field_c = false;
        }
    }

    final static void a(o[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != null &&
            param3 > 0) {
            var5_int = param0[0].field_q;
            var6 = param0[2].field_q;
            var7 = param0[1].field_q;
            param0[0].d(param1, param2);
            param0[2].d(-var6 + param1 + param3, param2);
            mi.b(ql.field_q);
            mi.d(var5_int + param1, param2, param1 + param3 - var6, param0[1].field_r + param2);
            var8 = param1 + var5_int;
            var9 = param1 + (param3 - var6);
            for (param1 = var8; var9 > param1; param1 = param1 + var7) {
              param0[1].d(param1, param2);
            }
            mi.a(ql.field_q);
            var10 = -88 % ((-22 - param4) / 53);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("je.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static o[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -125 % ((param1 - 30) / 35);
        return md.a(param2, param3, param0, param4, 1, -1, 1, 3, 1);
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (qf.field_b > var1) {
          of.field_e = of.field_e + (qf.field_b - var1);
          if (param0 != 1) {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          }
          qf.field_b = var1;
          return var1 + of.field_e;
        }
        if (param0 == 1) {
          qf.field_b = var1;
          return var1 + of.field_e;
        }
        je.a((byte) 110);
        qf.field_b = var1;
        return var1 + of.field_e;
    }

    final static boolean a(ia param0, ia param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (!param2) {
            field_c = false;
          }
          var3_int = param0.field_jb - param1.field_jb;
          if (param0.field_gb != qa.field_r) {
            if (param0.field_gb == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (qa.field_r != param1.field_gb) {
            if (null == param1.field_gb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("je.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 > -59) {
            return;
          }
          if (null == kf.field_G) {
            return;
          }
          for (var3_int = 0; kf.field_G.length > var3_int; var3_int++) {
            if (null != kf.field_G[var3_int]) {
              kf.field_G[var3_int].a((byte) 117, param2, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "je.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          if (lf.field_d != null) {
            lf.field_d.d(2);
            lf.field_d = null;
          }
          return;
        }
        je.a(false);
        if (lf.field_d != null) {
          lf.field_d.d(2);
          lf.field_d = null;
        }
    }

    static {
        field_b = "Waiting for music";
        field_a = "Player";
        field_d = 0;
    }
}
