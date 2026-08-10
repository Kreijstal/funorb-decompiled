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
        if (param0 != 0) {
          to.b(98);
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          field_g = null;
          field_c = null;
          field_d = (byte[][]) null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          field_g = null;
          field_c = null;
          field_d = (byte[][]) null;
          return;
        }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              var4 = 0;
              if (param0 >= 114) {
                break L1;
              } else {
                to.b(47);
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_6_0 = var3;
                break L0;
              } else {
                var3 = hb.a((byte) -38, param1.charAt(var4)) + (-var3 + (var3 << 2023052677));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("to.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            if (param2 != null) {
              var7 = (rj) ((Object) param2.e(-24172));
              if (param3 == 0) {
                L1: while (true) {
                  if (var7 != null) {
                    dupTemp$1 = var7.a(param3 + -115, param1, param0);
                    var5 = dupTemp$1;
                    if (null == dupTemp$1) {
                      var7 = (rj) ((Object) param2.a(4));
                      continue L1;
                    } else {
                      stackIn_11_0 = (rj) (var5);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (rj) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("to.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
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
