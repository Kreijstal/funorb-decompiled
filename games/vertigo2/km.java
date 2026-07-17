/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends gp {
    static int field_x;
    static String field_u;
    byte[] field_t;
    static String[] field_w;
    static String field_v;

    final static void a(String param0, boolean param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          ff.field_u = param3;
          fi.field_e = param0;
          fi.a(31820, param1, gn.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("km.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void h() {
        field_w = null;
        field_u = null;
        field_v = null;
    }

    km(byte[] param0) {
        try {
            ((km) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "km.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void i() {
        int var1 = (qg.field_G + -640) / 2;
        int var2 = ld.field_b * ld.field_b;
        int var3 = var2 - rk.field_y * rk.field_y;
        ca.field_h.a(102, 199, bi.field_j - 214, 90, -(var3 * 199 / var2) + var1);
        ud.field_A.a(80, 438, -124 + bi.field_j, 0, 438 * var3 / var2 + (var1 + 202));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 500;
        field_u = "Play time:";
        field_w = new String[]{"&***", "none", "can", "pole", "explain", "goblin", "oak", "jungle", "ensure", "pond", "shine", "groom", "dolphin", "sud", "nile", "softy", "stoop", "helmet", "tom", "bolter", "cloudy", "bap", "buzz", "napkin", "wave", "qed", "style", "judo", "tummy", "fable", "zebra", "vote", "harpy", "puma", "haze", "ginger", "squelch", "threat", "hunting", "sid", "clan", "misty", "ribbon", "daisy", "crown", "candy", "timber", "group", "grail", "burnt", "untidy"};
        field_v = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
