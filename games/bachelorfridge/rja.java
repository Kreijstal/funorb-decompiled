/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends mv {
    private gj field_p;
    private ce field_q;
    static int field_o;

    final void d(int param0) {
        if (param0 < 16) {
            rja.a(-101, 125, -52);
        }
    }

    final static void a(int param0, int param1, int param2) {
        pf var3 = null;
        if (param2 != 1) {
          return;
        } else {
          var3 = sja.field_fb;
          var3.c(param0, (byte) 99);
          var3.d(3, 0);
          var3.d(9, 0);
          var3.b(param1, -127);
          return;
        }
    }

    rja(gj param0, ce param1) {
        super(param0, (vja) (Object) param1);
        ad var3 = null;
        RuntimeException var3_ref = null;
        ad var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            ((rja) this).field_p = param0;
            ((rja) this).field_q = param1;
            var5 = ((rja) this).field_q.field_l.a(-27449, ((rja) this).field_p);
            var3 = var5;
            if (var5.field_s.i(-84)) {
              return;
            } else {
              L1: {
                var5.field_s.d(((rja) this).field_q.field_k, (byte) -106);
                var5.b(-1, 1);
                if (((rja) this).field_q.field_r) {
                  var5.a(16777152, 14, m.field_c);
                  break L1;
                } else {
                  if (!((rja) this).field_q.field_n) {
                    oha discarded$9 = al.a(109, ((rja) this).field_q.field_k);
                    ((rja) this).f(-120);
                    break L1;
                  } else {
                    var5.a(16761024, 110, dc.field_o);
                    break L1;
                  }
                }
              }
              ((rja) this).a(27799, (at) (Object) new qf(((rja) this).field_p, ((rja) this).field_q.field_l, ((rja) this).field_q.field_k, ((rja) this).field_q.field_q, ((rja) this).field_q.field_v, false));
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("rja.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
    }
}
