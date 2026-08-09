/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int field_c;
    int field_d;
    static ed field_b;
    static String field_g;
    static String field_a;
    static String field_f;
    static char[] field_e;

    final static void a(int param0) {
        ah.field_c = false;
        jg.field_d = false;
        cg.a((byte) -105, -1);
        if (param0 != -55) {
          field_b = (ed) null;
          cb.field_v = ql.field_l;
          ui.field_kb = ql.field_l;
          return;
        } else {
          cb.field_v = ql.field_l;
          ui.field_kb = ql.field_l;
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        int var1 = 90 % ((param0 - -20) / 57);
        field_f = null;
        field_g = null;
        field_b = null;
    }

    fh(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_d = param0;
    }

    final static pd a(byte param0, sf param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -79 % ((25 - param0) / 61);
            stackIn_1_0 = sg.a((byte) 20, ie.a(param1, param2, param3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("fh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new ed();
        field_f = "<%0>Exit:<%1> This is your goal. Get your fleas here to complete the level.";
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
