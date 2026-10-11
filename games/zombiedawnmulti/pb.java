/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static String field_g;
    static int field_h;
    static ef field_e;
    static boolean field_f;
    static int field_b;
    static String field_i;
    static String field_c;
    static volatile int field_a;
    static int field_d;

    final static boolean a(int param0, int param1, int param2) {
        if (!ch.a(param2, false)) {
          return false;
        }
        if (param1 != -20) {
          return false;
        }
        if (param0 == 255) {
          return false;
        }
        if (param0 < 19) {
          return (1 << -32 + param2 & em.field_O[param0]) != 0 ? true : false;
        }
        return false;
    }

    final static ja[] a(String param0, ul param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ja[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -256) {
            pb.$cfr$intArgs$a$90ed9136db05(-65, -95);
          }
          var4_int = param1.a(param0, (byte) -70);
          var5 = param1.a(param3, var4_int, -1);
          stackIn_3_0 = vk.a(38, var5, param1, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pb.C(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 == -116) {
          field_i = null;
          field_g = null;
          return;
        }
        field_d = 70;
        field_i = null;
        field_g = null;
    }

    final static int a(byte[] param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -117 / ((param2 + 83) / 37);
          stackIn_1_0 = c.a(param0, param1, true, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pb.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static uj a(byte param0, int param1) {
        if (!df.field_H) {
          return null;
        }
        if (qo.field_q.a(0) >= 4) {
          return null;
        }
        wj var2 = new wj(param1);
        if (param0 == 62) {
          qo.field_q.a(var2, false);
          return var2.field_m;
        }
        field_a = 52;
        qo.field_q.a(var2, false);
        return var2.field_m;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 256 * (-320 + param1) / 320;
        var3 = var3 / 2;
        var3 += 128;
        int var4 = 64;
        if (param2) {
          return -119;
        }
        int var5 = 256 - var4;
        if (var5 < var3) {
          var3 = var5;
          return var3;
        }
        if (var4 > var3) {
          var3 = var4;
          return var3;
        }
        return var3;
    }

    static {
        field_g = "Players: <%0>/<%1>";
        field_a = -1;
        field_c = "Zombie-lover";
        field_d = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static uj $cfr$intArgs$a$90ed9136db05(int param0, int param1) {
        if (!df.field_H) {
          return null;
        }
        if (qo.field_q.a(0) >= 4) {
          return null;
        }
        wj var2 = new wj(param1);
        if (param0 == 62) {
          qo.field_q.a(var2, false);
          return var2.field_m;
        }
        field_a = 52;
        qo.field_q.a(var2, false);
        return var2.field_m;
    }
}
