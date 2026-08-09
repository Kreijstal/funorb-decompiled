/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lna extends rqa {
    static String field_p;
    static boolean[] field_o;

    final static phb[] a(boolean param0, phb param1) {
        phb[] var2 = null;
        RuntimeException var2_ref = null;
        phb[] var3 = null;
        phb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new phb[9];
              var2 = var3;
              if (!param0) {
                break L1;
              } else {
                lna.e((byte) -84);
                break L1;
              }
            }
            var3[4] = param1;
            stackIn_3_0 = (phb[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("lna.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(byte param0) {
        field_p = null;
        if (param0 >= -113) {
            qfa var2 = (qfa) null;
            lna.a((qfa) null, 103);
            field_o = null;
            return;
        }
        field_o = null;
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
            si.a(92, 62, param0[0].a(112));
            if (param1 <= -119) {
              stackIn_4_0 = new nc("void");
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

            stackIn_7_1 = new StringBuilder().append("lna.A(");

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

    lna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(qfa param0, int param1) {
        RuntimeException var2 = null;
        rjb var7 = null;
        krb var9 = null;
        nk var11 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pra.field_p == null) {
                var7 = new rjb();
                var19 = var7.b(128, (byte) -66, 128, 16);
                pra.field_p = gfb.a(false, var19, -12445);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (pjb.field_vb != null) {
                break L2;
              } else {
                var9 = new krb();
                var20 = var9.b(128, (byte) -29, 128, 16);
                pjb.field_vb = gfb.a(false, var20, -12445);
                break L2;
              }
            }
            L3: {
              var11 = param0.field_yb;
              if (!var11.a(param1 + 77)) {
                break L3;
              } else {
                if (null == lda.field_o) {
                  var21 = dbb.a(4.0f, 0.6000000238418579f, (byte) 80, 8, new ko(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
                  lda.field_o = gfb.a(false, var21, param1 + -12461);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (param1 == 16) {
              break L0;
            } else {
              lna.e((byte) -27);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lna.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    static {
        field_p = "This password is part of your Player Name, and would be easy to guess";
        field_o = new boolean[64];
    }
}
