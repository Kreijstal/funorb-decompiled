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
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > 103) {
            stackIn_4_0 = ia.a(param2, param0, pj.a((byte) 66, param1, param3), 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ta.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = null;
        if (param0 <= -82) {
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
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        wj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        try {
          var1 = ac.field_B;
          if (param0 != 12841) {
            field_c = (ec) null;
          }
          while (mo.b(-101)) {
            var1.d((byte) -102, 8);
            fieldTemp$0 = var1.field_o + 1;
            var1.field_o = var1.field_o + 1;
            var2 = fieldTemp$0;
            ed.a(false, var1);
            ac.field_B.c(var1.field_o - var2, -1);
          }
          return;
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
