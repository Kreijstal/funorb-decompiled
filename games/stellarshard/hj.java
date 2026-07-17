/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static rd field_d;
    static String field_b;
    static String field_e;
    static String field_c;
    static String field_a;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 5 / ((param0 - 42) / 39);
              if (ck.a(true, param1) == null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hj.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(pf param0, int param1) {
        ad.a(param0.a("headers.packvorbis", "", (byte) -12));
        ad var2 = ad.a(param0, "jagex logo2.packvorbis", "");
        try {
            ud discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hj.E(" + (param0 != null ? "{...}" : "null") + 44 + 23987 + 41);
        }
    }

    final static void a(pb param0, int param1) {
        kg.d(false);
        if (param1 != 1) {
            return;
        }
        try {
            ti.a(param0.field_z, param0.field_w, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hj.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        lh.field_d = lh.field_d + param1;
        lg.field_f = lg.field_f + ed.field_b * param1;
        var3 = 1 << param1;
        if ((var3 & sd.field_d) != 0) {
          return;
        } else {
          sd.field_d = sd.field_d | var3;
          tl.field_a = tl.field_a | var3;
          hf.field_i.b(-46, (gg) (Object) new jf(param1));
          if (!e.field_c) {
            if (!ah.a(-1)) {
              kl discarded$2 = vj.a(lh.field_d, ed.field_b, (byte) 15, hk.field_p, lg.field_f, param1, param0, 4);
              return;
            } else {
              ue.field_c.b(-47, (gg) (Object) new kl(param1, param0, hk.field_p, lg.field_f, lh.field_d, ed.field_b));
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = 0;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new rd();
        field_c = "Collect the powerups shown below to improve your weapons and defences.";
        field_b = "From only <%0>/month";
        field_a = "Connection timed out. Please try using a different server.";
        field_e = "Create a free account to start using this feature";
    }
}
