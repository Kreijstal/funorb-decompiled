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
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              L2: {
                va.field_d = param3;
                sd.field_e = param1;
                if (param2 == -22557) {
                  break L2;
                } else {
                  field_c = null;
                  break L2;
                }
              }
              var7 = (CharSequence) (Object) param3;
              d.field_Gb = c.a(var7, true);
              oc.field_n = param0;
              var6 = dl.a(dh.field_k, sd.field_a, 49, gk.field_e, param4);
              rk.a(var6, (byte) -27);
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("ul.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void c(byte param0) {
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

    public static void a(byte param0) {
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
