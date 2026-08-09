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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ff.field_u = param3;
              fi.field_e = param0;
              fi.a(31820, param1, gn.field_a);
              if (param2) {
                break L1;
              } else {
                km.h(-35);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("km.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_u = null;
        if (param0 < 7) {
            km.i(119);
            field_v = null;
            return;
        }
        field_v = null;
    }

    km(byte[] param0) {
        try {
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        int var1 = (qg.field_G + -640) / 2;
        int var2 = ld.field_b * ld.field_b;
        int var3 = var2 - rk.field_y * rk.field_y;
        ca.field_h.a(param0 + -100, 199, bi.field_j - 214, 90, -(var3 * 199 / var2) + var1);
        ud.field_A.a(80, 438, -124 + bi.field_j, 0, 438 * var3 / var2 + (var1 + param0));
    }

    static {
        field_x = 500;
        field_u = "Play time:";
        field_w = new String[]{"&***", "none", "can", "pole", "explain", "goblin", "oak", "jungle", "ensure", "pond", "shine", "groom", "dolphin", "sud", "nile", "softy", "stoop", "helmet", "tom", "bolter", "cloudy", "bap", "buzz", "napkin", "wave", "qed", "style", "judo", "tummy", "fable", "zebra", "vote", "harpy", "puma", "haze", "ginger", "squelch", "threat", "hunting", "sid", "clan", "misty", "ribbon", "daisy", "crown", "candy", "timber", "group", "grail", "burnt", "untidy"};
        field_v = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
