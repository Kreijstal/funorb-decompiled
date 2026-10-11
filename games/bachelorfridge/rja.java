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
        if (param2 == 1) {
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
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_p = param0;
          this.field_q = param1;
          var5 = this.field_q.field_l.a(-27449, this.field_p);
          var3 = var5;
          if (var5.field_s.i(-84)) {
            return;
          }
          var5.field_s.d(this.field_q.field_k, (byte) -106);
          var5.b(-1, 1);
          if (this.field_q.field_r) {
            var5.a(16777152, 14, m.field_c);
          } else {
            if (!this.field_q.field_n) {
              al.a(109, this.field_q.field_k);
              this.f(-120);
            } else {
              var5.a(16761024, 110, dc.field_o);
            }
          }
          this.a(27799, new qf(this.field_p, this.field_q.field_l, this.field_q.field_k, this.field_q.field_q, this.field_q.field_v, false));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rja.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
