/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends td {
    final static void a(int param0, int param1, int param2, String param3, String param4, int param5) {
        pf var9 = null;
        int var7 = 0;
        try {
            var9 = sja.field_fb;
            pf var6 = var9;
            var9.c(param5, (byte) 98);
            var9.field_g = var9.field_g + 1;
            if (param2 <= 39) {
                Object var8 = null;
                no.a(86, -49, 36, (String) null, (String) null, 123);
            }
            var7 = var9.field_g;
            var9.d(param1, 0);
            if (!(param1 != 2)) {
                var9.a((byte) -50, param4);
            }
            if (param3 == null) {
                var9.b(param0, -127);
            } else {
                int discarded$0 = -21840;
                int discarded$1 = nu.a(param3, (lu) (Object) var9);
            }
            var9.b((byte) -38, -var7 + var9.field_g);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "no.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    no(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        tl var4 = null;
        Object var5 = null;
        tl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl stackOut_2_0 = null;
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
              var3 = ((no) this).field_h.a(31, param0);
              var4 = new tl(((no) this).field_g, new nq(var3));
              var4.field_t = ((no) this).field_n;
              var4.field_u = ((no) this).field_k;
              if (param1 == 3) {
                break L1;
              } else {
                var5 = null;
                no.a(89, 77, 35, (String) null, (String) null, -3);
                break L1;
              }
            }
            var4.field_o.a((bw) (Object) new dh(), true);
            stackOut_2_0 = (tl) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("no.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_3_0;
    }

    static {
    }
}
