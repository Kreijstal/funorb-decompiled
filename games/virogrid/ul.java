/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int[] field_h;
    static dl field_c;
    static km field_a;
    static String field_b;
    static String field_f;
    int field_d;
    static wg field_g;
    static String field_e;

    final static void b(byte param0) {
        me.field_b = me.field_b - 1;
        df.a(ph.field_l[me.field_b], kn.field_K[me.field_b], se.field_e[me.field_b]);
        if (param0 < 79) {
          return;
        } else {
          df.field_i = pb.field_i[me.field_b];
          df.field_k = m.field_i[me.field_b];
          df.field_g = ng.field_O[me.field_b];
          df.field_h = qe.field_h[me.field_b];
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(long param0, int param1, int param2, String param3, int[] param4) {
        oj var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (oa.a(28977, param3, param0, param1, param4)) {
              L1: {
                if (param1 == 1) {
                  param1 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              va.field_d = param3;
              sd.field_e = param1;
              var7 = (CharSequence) (Object) param3;
              d.field_Gb = c.a(var7, true);
              oc.field_n = param0;
              var6 = dl.a(dh.field_k, sd.field_a, 49, gk.field_e, param4);
              rk.a(var6, (byte) -27);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(-22557).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void c() {
        int var1 = 0;
        if (ag.field_c >= 224) {
            qe.a((byte) 120, 256);
        } else {
            var1 = ag.field_c % 32;
            qe.a((byte) 59, -var1 + (ag.field_c + 32));
        }
        var1 = 0;
    }

    final static void a(int param0) {
        sa.a((byte) 120, ea.field_e, de.field_sb, true);
        if (param0 != 15429) {
            field_b = null;
            p.field_f = true;
            return;
        }
        p.field_f = true;
    }

    ul(int param0) {
        ((ul) this).field_d = param0;
    }

    public static void a() {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[8192];
        field_f = "Player names can be up to 12 letters, numbers and underscores";
        field_b = "Who can join";
        field_e = "Loading...";
        field_c = new dl();
    }
}
