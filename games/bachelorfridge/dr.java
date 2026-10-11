/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends td {
    static ee field_p;

    public static void c(boolean param0) {
        if (!param0) {
          return;
        }
        field_p = null;
    }

    dr(int param0, aga param1) {
        super(param0, param1);
    }

    final static ee b(int param0) {
        ee var1 = new ee(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], baa.field_P[0], hk.field_f);
        if (param0 == -32124) {
          al.b(-18073);
          return var1;
        }
        field_p = (ee) null;
        al.b(-18073);
        return var1;
    }

    final static int[] c(int param0) {
        if (o.d((byte) 80)) {
          return null;
        }
        if (!bf.field_h[wca.field_n].c((byte) 95)) {
          if (bf.field_h[wca.field_n].field_i) {
            return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_e];
          }
          if (!bf.field_h[wca.field_n].field_i) {
            return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
          }
          if (param0 < 90) {
            return (int[]) null;
          }
          return null;
        }
        if (!bf.field_h[wca.field_n].field_i) {
          return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
        }
        if (param0 < 90) {
          return (int[]) null;
        }
        return null;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        wga var4 = null;
        ii stackIn_2_0 = null;
        wga stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(param1 ^ 20, param0);
          var4 = new wga(this.field_g, new nq(var3));
          var4.field_o.a(new iv(new nq(var3), false, 1, 0, 33), true);
          if (param1 == 3) {
            stackIn_4_0 = var4;
            return (ii) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (ii) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("dr.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
