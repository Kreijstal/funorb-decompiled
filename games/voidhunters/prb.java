/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class prb extends rqa {
    prb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ri[] e(byte param0) {
        if (param0 >= -40) {
          return (ri[]) null;
        } else {
          return new ri[]{vp.field_e, gha.field_r, go.field_o, efb.field_c, dh.field_r, dmb.field_b, dh.field_o, eaa.field_p, tpa.field_a, ppb.field_c, ae.field_g, qw.field_g, erb.field_o, qc.field_g};
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          if (null == flb.field_o) {
            if (aaa.field_b != null) {
              aaa.field_b.e();
              return;
            } else {
              return;
            }
          } else {
            flb.field_o.e();
            if (aaa.field_b == null) {
              return;
            } else {
              aaa.field_b.e();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static phb[] a(boolean param0, int param1) {
        phb[] var2;
        phb[] var3;
        var3 = new phb[9];
        var2 = var3;
        if (!param0) {
          return (phb[]) null;
        } else {
          var3[4] = mra.a(param1, (byte) -113, 64);
          return var2;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(44, 111));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("prb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        kf discarded$0 = new kf();
    }
}
