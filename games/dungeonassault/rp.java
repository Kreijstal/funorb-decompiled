/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static ef field_d;
    static byte[][] field_c;
    static String[] field_b;
    static String field_a;
    static java.security.SecureRandom field_g;
    static String[] field_f;
    static String field_h;
    static int[] field_e;

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (pp.a(-111, param0)) {
          return true;
        }
        if (param0 != 45 &&
          param0 != 160 &&
          param0 != 32 &&
          param0 != 95) {
          if (param1 < -102) {
            return false;
          }
          field_f = (String[]) null;
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int[][] param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var7_intLifetime1;
        var8 = DungeonAssault.field_K;
        try {
          jh.a(jh.field_l);
          if (param2 != 108) {
            return;
          }
          for (var7_int = 0; var7_int < param5.length / param0 + 1; var7_int++) {
            gf.b(-1 + (-var7_int + param3), param6 - (1 + var7_int), param1 + 2 * var7_int + 2, 59416);
            gf.c(param3 + (-var7_int - 1), param6 - var7_int, param4 + var7_int * 2, 15204376);
            gf.b(-1 + (param3 - var7_int), param4 + (param6 + var7_int), 2 + (param1 + var7_int * 2), 6168);
            gf.c(var7_int + param3 + param1, -var7_int + param6, 2 * var7_int + param4, 1572888);
          }
          jh.b();
          var7_intLifetime1 = 0;
          while (var7_intLifetime1 < param5.length) {
            te.a(-1 + param3, param6 - 1, 2 + param1, param5[var7_intLifetime1]);
            te.b(-1 + param3, param6, param4, param5[var7_intLifetime1]);
            te.a(param3 - 1, param6 + param4, 2 + param1, param5[var7_intLifetime1]);
            te.b(param1 + param3, param6, param4, param5[var7_intLifetime1]);
            var7_intLifetime1 = var7_intLifetime1 + param0;
            param6--;
            param4 += 2;
            param3--;
            param1 += 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_12_0 = var7;
          stackIn_12_1 = new StringBuilder().append("rp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (null != a.field_n) {
          a.field_n.j((byte) 73);
        }
        if (param0 > -33) {
          String var2 = (String) null;
          rp.a((String) null, -9);
        }
        pj.field_c = new gk();
        ta.field_a.b(1, pj.field_c);
    }

    final static boolean a(int param0, int param1) {
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        if (param0 != 15204376) {
          rp.a(-31, -32);
        }
        if (4 != param1 &&
          3 != param1) {
          if (22 != param1) {
            if (23 == param1) {
              return of.field_k;
            }
            return true;
          }
          stackIn_15_0 = (gm.field_d.field_m >= ak.field_o[0]) && (!of.field_k);
          return stackIn_15_0;
        }
        stackIn_9_0 = (null != gm.field_d) && (gm.field_d.field_K != 0);
        return stackIn_9_0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 39) {
            rp.a(-93, 97, (byte) -14, 21, 98, (int[][]) null, 14);
          }
          stackIn_3_0 = bb.field_b.a("", param0, (byte) -113);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rp.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        field_d = null;
        field_f = null;
        if (param0 != -68) {
          rp.a((byte) 9);
        }
        field_c = (byte[][]) null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_d = new ef();
        field_c = new byte[250][];
        field_b = new String[]{"Gift of the Trees", "Double target <%sneak> in the next room. (Single use)"};
        field_a = "Your <col=FF8000><%0></col> was caught and eaten.";
        field_f = new String[]{"Revive", "Return a killed raider to your stable. (Single use)"};
        field_h = "Members' Benefits";
        field_e = new int[4];
    }
}
