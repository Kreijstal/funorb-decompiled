/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static cn[] field_d;
    static cn[] field_a;
    static cn field_g;
    static cn field_f;
    static String field_c;
    static String[] field_e;
    static String field_b;

    final static boolean c(int param0) {
        int var1 = -28 % ((param0 + 5) / 62);
        if (kh.field_n < 10) {
          return false;
        }
        if (!tl.field_l) {
          return !dh.a((byte) -125) ? true : false;
        }
        return false;
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != wo.field_e) {
          var1 = wo.field_e.a(-16);
        }
        if (0 == var1.length()) {
          var1 = dc.a(-118);
        }
        int var2 = 28 % ((-38 - param0) / 38);
        if (0 == var1.length()) {
          var1 = fb.field_a;
        }
        return var1;
    }

    final static void a(md param0, int[] param1, int param2, int param3, int param4, int param5) {
        a var6 = null;
        RuntimeException var6_ref = null;
        a var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          if (!bo.field_Jb.a(param5, (byte) 97)) {
            return;
          }
          if (param2 > param1[param4]) {
            return;
          }
          param1[param4] = param2;
          var6 = new a(param4);
          var7 = (a) (param0.e(-24172));
          var8 = -120 / ((74 - param3) / 46);
          while (var7 != null) {
            if (param1[var7.field_j] <= param2) {
              var7 = (a) (param0.a(4));
              continue;
            }
            so.$cfr$intArgs$a$d4f67f19bfc6(60, var7, var6);
            break;
          }
          if (var7 != null) {
            return;
          }
          param0.a(var6, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_16_0 = var6_ref;
          stackIn_16_1 = new StringBuilder().append("dm.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        if (param0 == 0) {
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_c = (String) null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_f = null;
    }

    static {
        field_e = new String[]{"First Strike", "Always attacks first."};
        field_c = "Blinded";
        field_b = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";
    }
}
