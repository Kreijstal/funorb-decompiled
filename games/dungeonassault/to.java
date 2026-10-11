/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static String[] field_b;
    static String field_a;
    static ab field_e;
    static String field_f;
    static byte[][] field_d;
    static String field_g;
    static int[] field_c;

    final static double a(int param0, int param1, double param2, int param3) {
        double var5 = 1.0 - param2;
        int var7 = -109 % ((param3 - 22) / 51);
        return (double)param0 * var5 + param2 * (double)param1;
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          field_g = null;
          field_c = null;
          field_d = (byte[][]) null;
          return;
        }
        to.b(98);
        field_e = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_c = null;
        field_d = (byte[][]) null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          var2_int = param1.length();
          var3 = 0;
          var4 = 0;
          if (param0 < 114) {
            to.b(47);
          }
          while (var2_int > var4) {
            var3 = hb.a((byte) -38, param1.charAt(var4)) + (-var3 + (var3 << 5));
            var4++;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("to.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5) {
        try {
          kn.a(param2, param4 + "_defeat", param5, param3, 124, param0, param4 + "_special", param4 + "_reveal");
          if (param1 >= -72) {
            String var7 = (String) null;
            to.a(116, 65, -88, 52, (String) null, -97);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "to.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static rj a(int param0, int param1, md param2, int param3) {
        rj dupTemp$1 = null;
        rj var5 = null;
        int var6 = 0;
        rj var7 = null;
        rj stackIn_6_0 = null;
        rj stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2 == null) {
            return null;
          }
          var7 = (rj) (param2.e(-24172));
          if (param3 != 0) {
            stackIn_6_0 = (rj) null;
            return stackIn_6_0;
          }
          while (true) {
            if (var7 == null) {
              return null;
            }
            dupTemp$1 = var7.a(param3 - 115, param1, param0);
            var5 = dupTemp$1;
            if (null == dupTemp$1) {
              var7 = (rj) (param2.a(4));
              continue;
            }
            break;
          }
          stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("to.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 > 57) {
          return;
        }
        to.b(-76);
    }

    static {
        field_b = new String[]{"Fragility", "Dies when incapacitated."};
        field_a = "<col=FF0000><%0> charging</col>";
        field_f = "A ring of mystic runes glow faintly around the perimeter of this room. The first unwise raider to cross this room might be teleported out of the dungeon.<br><br>This trap will only trigger once per raid.";
        field_e = new ab();
        field_d = new byte[1000][];
    }
}
