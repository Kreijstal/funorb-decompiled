/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gka extends at {
    static String field_m;
    private gj field_p;
    private ns field_o;
    static rga field_n;
    private boolean field_j;
    private taa field_k;
    private mr field_l;
    private boolean field_q;
    static String field_r;

    final static void a(int param0, int param1) {
        int var2 = 0;
        var2 = -95 / ((12 - param0) / 62);
        bs.field_k = param1;
        if (null == uf.field_c) {
          if (null != kw.field_j) {
            kw.field_j.a(param1, true);
            return;
          } else {
            return;
          }
        } else {
          uf.field_c.a(23679, param1);
          if (null == kw.field_j) {
            return;
          } else {
            kw.field_j.a(param1, true);
            return;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_m = null;
        field_n = null;
    }

    private final void d(int param0) {
    }

    final static rk a(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        rk var3 = null;
        Object stackIn_2_0 = null;
        rk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = param0.b(16711935);
            if (var2_int != 255) {
              var3 = new rk(gfa.field_a[var2_int]);
              var3.a(param0, false);
              stackOut_3_0 = (rk) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("gka.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 255 + 41);
        }
        return stackIn_4_0;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        ad var3 = null;
        if (!((gka) this).field_k.a((byte) -106)) {
          L0: {
            var2 = 112 % ((71 - param0) / 47);
            if (!((gka) this).field_q) {
              ((gka) this).field_q = true;
              wf.a(43, (byte) 126);
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gka) this).field_j) {
            ((gka) this).field_p.field_s.field_d = ((gka) this).field_p.field_s.field_d - 2;
            if (0 <= ((gka) this).field_p.field_s.field_d) {
              return false;
            } else {
              var3 = ((gka) this).field_o.field_n.a(-27449, ((gka) this).field_p);
              ((gka) this).field_k = new taa(((gka) this).field_p, var3);
              ((gka) this).a(27799, (at) (Object) ((gka) this).field_k);
              ((gka) this).field_j = true;
              ((gka) this).field_l = new mr(((gka) this).field_p, ((gka) this).field_o, var3.field_s.field_x, var3.field_s.field_J);
              return false;
            }
          } else {
            ((gka) this).a(27799, (at) (Object) new fha((kj) (Object) ((gka) this).field_l));
            this.d(91);
            return true;
          }
        } else {
          return false;
        }
    }

    gka(gj param0, ns param1) {
        ((gka) this).field_q = false;
        try {
            ((gka) this).field_p = param0;
            ((gka) this).field_o = param1;
            ((gka) this).field_k = new taa(((gka) this).field_p, (((gka) this).field_p.field_h.field_z >> 1) - 1, -3);
            ((gka) this).a(27799, (at) (Object) ((gka) this).field_k);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gka.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Kick <%0> from this game";
        field_n = new rga();
        field_r = "Fly captured!";
    }
}
