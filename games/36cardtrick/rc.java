/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends qb {
    boolean field_j;
    int[] field_p;
    int field_h;
    static int field_o;
    static de field_g;
    static String field_n;
    static kc field_i;
    static ml field_l;
    static kc[] field_k;
    static boolean field_m;

    public static void b() {
        field_i = null;
        field_k = null;
        field_l = null;
        field_g = null;
        field_n = null;
    }

    final static void a(byte param0, int param1) {
        int discarded$0 = 0;
        fd.a(ca.field_c[param1], jd.field_c[param1]);
    }

    rc() {
        ((rc) this).field_j = false;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var3 = (CharSequence) (Object) param1;
            stackOut_0_0 = aa.field_fb.equals((Object) (Object) ff.a((byte) 116, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rc.B(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new de(10, 2, 2, 0);
        field_n = "Select pairs of tiles to reveal them. If they match, they are removed from the<nbsp>game.<br><br>Remember the tiles you've revealed and track them as they move to clear the<nbsp>board.<br><br>Don't waste time, but think before you click, because the number of mistakes you can make is<nbsp>limited.";
        field_i = new kc(270, 70);
        field_l = new ml();
    }
}
