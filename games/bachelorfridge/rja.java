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
        pf var3;
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
        super(param0, param1);
        ad var3 = null;
        ad var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            this.field_p = param0;
            this.field_q = param1;
            var5 = this.field_q.field_l.a(-27449, this.field_p);
            var3 = var5;
            if (var5.field_s.i(-84)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5.field_s.d(this.field_q.field_k, (byte) -106);
                var5.b(-1, 1);
                if (this.field_q.field_r) {
                  var5.a(16777152, 14, m.field_c);
                  break L1;
                } else {
                  if (!this.field_q.field_n) {
                    al.a(109, this.field_q.field_k);
                    this.f(-120);
                    break L1;
                  } else {
                    var5.a(16761024, 110, dc.field_o);
                    break L1;
                  }
                }
              }
              this.a(27799, new qf(this.field_p, this.field_q.field_l, this.field_q.field_k, this.field_q.field_q, this.field_q.field_v, false));
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rja.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
