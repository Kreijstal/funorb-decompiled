/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String[] field_j;
    static java.math.BigInteger field_i;
    int field_g;
    static String field_h;
    int field_d;
    int field_c;
    int field_k;
    static int field_f;
    static boolean field_b;
    static um field_a;
    static boolean field_e;

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == -73) {
              L1: {
                if (null == j.a(0, param0)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ch.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_j = null;
        field_h = null;
    }

    final static void a(byte param0) {
        if (!(kb.field_c)) {
            throw new IllegalStateException();
        }
        if (!(hf.field_w == null)) {
            hf.field_w.h(true);
        }
        String var1 = og.c(-113);
        aa.field_a = new ca(var1, (String) null, true, false, false);
        tm.field_l.a(0, (fi) (Object) fi.field_t);
        fi.field_t.b((fi) (Object) aa.field_a, (byte) -53);
        fi.field_t.j(-4236);
    }

    final static void a(int param0, pd param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        ok.field_G = param8;
        co.field_g = param4;
        ed.field_b = param3;
        fd.field_C = param7;
        rj.field_l = param5;
        ii.field_a = param1;
        if (param6 < 7) {
            return;
        }
        try {
            dl.field_c = param0;
            rb.field_c = param2;
            ji.field_e = (dk) (Object) new pn();
            bc.field_a = new sb(param1);
            ql.field_q = new ha(ji.field_e, bc.field_a);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ch.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(boolean param0) {
        if (null != md.field_e) {
          if (null == md.field_e.field_d) {
            md.field_e = null;
            wf.field_d = null;
            return;
          } else {
            md.field_e.field_d.field_xb = false;
            md.field_e = null;
            wf.field_d = null;
            return;
          }
        } else {
          md.field_e = null;
          wf.field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> cannot join; the game is full.";
        field_f = 0;
        field_i = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
