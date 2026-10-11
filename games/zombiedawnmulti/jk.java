/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static mi field_h;
    static int[] field_l;
    static int[] field_b;
    static String field_i;
    static int field_j;
    static String field_c;
    static String field_a;
    static String field_e;
    static int field_g;
    static int field_f;
    static cj field_d;
    static int[] field_k;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
          return;
        }
        field_i = null;
        field_k = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_b = null;
        field_l = null;
    }

    final static boolean a(byte param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 > -38) {
          jk.a((byte) -103, -99);
        }
        stackIn_7_0 = (param1 != 255) && (param1 >= 0) && ((1L << param1 & em.field_N) != 0L);
        return stackIn_7_0;
    }

    final static int a(byte param0, int param1, int[][] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 <= param1 &&
            param3 >= 0) {
            if (param3 >= param2.length) {
              stackIn_7_0 = -1;
              return stackIn_7_0;
            }
            var4_int = 85 / ((-36 - param0) / 38);
            if (param1 < param2[0].length) {
              stackIn_12_0 = param2[param3][param1];
              return stackIn_12_0;
            }
            stackIn_10_0 = -1;
            return stackIn_10_0;
          }
          stackIn_4_0 = -1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (hd.field_s != null) {
            hd.field_s.field_J.a((byte) -112, param1);
          }
          if (qe.field_e != null) {
            qe.field_e.field_V.a((byte) -112, param1);
          }
          if (param0 != 0) {
            jk.a((byte) 88, 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-120, param1);
        var2.a(121, 1);
    }

    static {
        int var5 = 0;
        field_j = -1;
        field_a = "You must play 1 more rated game before playing with the current options.";
        field_c = "Hide game chat";
        field_i = "Send private message to <%0>";
        field_e = "Staff impersonation";
        field_l = new int[61];
        field_b = new int[61];
        double var0 = 0.0;
        double var2 = 0.41887902047863906;
        int var4 = 20;
        for (var5 = 0; var5 < 60; var5++) {
          field_l[var5] = (int)(Math.sin(var0) * ((double)(var4 > var5 ? 2 : var5 >= 2 * var4 ? 8 : 4) * 20.0));
          field_b[var5] = (int)(20.0 * (double)(var4 <= var5 ? 2 * var4 <= var5 ? 8 : 4 : 2) * Math.cos(var0));
          var0 = var0 + var2;
        }
        field_l[60] = 0;
        field_b[60] = 0;
        field_k = new int[8192];
    }
}
