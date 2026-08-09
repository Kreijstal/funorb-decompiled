/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static ec field_c;
    static cn field_b;
    static ab field_d;
    static String field_h;
    static String field_g;
    static se field_e;
    static jk field_a;
    static md field_f;

    final static String a(se param0, int param1, int param2, String param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 > 103) {
              stackIn_4_0 = ia.a(param2, param0, pj.a((byte) 66, param1, param3), 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ta.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = null;
        if (param0 > -82) {
          return;
        } else {
          field_b = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, int param1, kj param2) {
        wj var3 = null;
        try {
            if (param0 != 11) {
                String var4 = (String) null;
                ta.a((se) null, -96, -112, (String) null, -121);
            }
            var3 = ac.field_B;
            var3.d((byte) -81, param1);
            var3.a(6, 2);
            var3.a(6, 0);
            var3.a(param0 ^ 13, param2.field_j);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ta.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$2 = 0;
        wj var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var1 = ac.field_B;
              if (param0 == 12841) {
                break L1;
              } else {
                field_c = (ec) null;
                break L1;
              }
            }
            L2: while (true) {
              if (!mo.b(-101)) {
                break L0;
              } else {
                var1.d((byte) -102, 8);
                fieldTemp$2 = var1.field_o + 1;
                var1.field_o = var1.field_o + 1;
                var2 = fieldTemp$2;
                ed.a(false, var1);
                ac.field_B.c(var1.field_o - var2, -1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "ta.B(" + param0 + ')');
        }
    }

    static {
        field_c = new ec(256);
        field_h = "After a string of unfortunate accidents led to his exile from the mountain home of the dwarves, the dwarven renegade seeks somewhere else to indulge his passion for explosives.";
        field_g = "Select an orc or goblin to sacrifice";
        field_d = new ab();
        field_f = new md();
    }
}
