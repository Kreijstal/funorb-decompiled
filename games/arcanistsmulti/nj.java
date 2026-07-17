/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_i;
    static String field_f;
    static kc field_d;
    static String field_g;
    static String field_j;
    static int field_c;
    static String field_l;
    static String field_b;
    static String field_h;
    static nk field_e;
    static ll[] field_k;
    static int[] field_a;
    static int[] field_n;
    static dn field_m;

    final static km a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        km stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -25 % ((param1 - -12) / 54);
            stackOut_0_0 = new km(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("nj.B(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_a = null;
        field_i = null;
        field_j = null;
        field_l = null;
        field_n = null;
        field_g = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_m = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Wield arcane magics in a shattered world.  Battle cyclopes, dragons and other mighty Arcanists in this test of cunning, skill and determination.  Spend the wands you earn on more world-shattering spells in order to rise to the top of the league and proclaim yourself the greatest Arcanist of all time!";
        field_f = "Invalid password.";
        field_g = "Tutorial";
        field_c = 0;
        field_i = "MOST HONOURABLE - ";
        field_a = new int[]{16711680, 65280, 255, 16776960, 16711935, 65535, 7829367};
        field_n = field_a;
        field_l = "Use this button to quickly randomise your character. Your previous character will be lost.";
        field_b = "Waiting for awards";
        field_e = null;
        field_h = "You will now see a focus point where your mouse is pointing. This point is where each of the four projectiles this spell fires will aim towards. Click on one of the targets to focus your attack on that location.";
    }
}
