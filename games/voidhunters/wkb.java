/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wkb implements dja {
    static int field_c;
    static int field_b;
    static String[] field_e;
    static int field_a;
    static String[] field_d;

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
          field_c = 115;
        }
        field_d = null;
    }

    final static void b(byte param0) {
        if (param0 != 6) {
          field_a = 79;
        }
        if (nd.field_r != -tha.field_p + 0 &&
          nd.field_r == -tha.field_p + 250) {
        }
        nd.field_r = nd.field_r + 1;
    }

    public final tv a(byte param0) {
        int var2 = 73 % ((-64 - param0) / 50);
        return (tv) ((Object) new pob());
    }

    final static void a(tjb param0, int param1) {
        try {
          tra.field_o.b(-561, param0);
          if (param1 != 6) {
            field_e = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wkb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          faa var4 = (faa) null;
          wkb.a((byte) -44, (int[]) null, (faa) null, -49);
        }
        return (tv[]) ((Object) new pob[param1]);
    }

    final static int[] a(byte param0, int[] param1, faa param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        int[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var8 = VoidHunters.field_G;
        try {
          var4_int = param2.i(param0 ^ 37, param3);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (int[]) (stackIn_3_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new int[var4_int];
          }
          var5 = param2.i(param0 ^ 37, 6);
          var6 = param2.i(0, 32);
          if (param0 != 37) {
            field_b = -18;
          }
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = param2.i(0, var5) + var6;
            }
          } else {
            var9 = 0;
            var7 = var9;
            while (var9 < var4_int) {
              param1[var9] = var6;
              var9++;
            }
          }
          stackIn_18_0 = (int[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("wkb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Name", "Size", "Kills", "Assists", "Deaths", "Ping"};
        field_c = 1;
        field_b = 0;
        field_a = 60;
    }
}
