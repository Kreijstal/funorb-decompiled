/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends rqa {
    qo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        jk var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              lqa.field_o = null;
              if (param0 == 15) {
                break L1;
              } else {
                qo.a(-127);
                break L1;
              }
            }
            L2: {
              ii.field_h = false;
              ohb.field_o = null;
              if (null != cta.field_q) {
                cta.field_q.e(103);
                cta.field_q = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              oha.field_o = null;
              if (null == kja.field_E) {
                break L3;
              } else {
                kja.field_E.e(104);
                kja.field_E = null;
                break L3;
              }
            }
            L4: {
              ks.field_r = null;
              if (mea.field_e != null) {
                mea.field_e.e(126);
                mea.field_e = null;
                break L4;
              } else {
                break L4;
              }
            }
            icb.field_p = null;
            if (oha.field_o != null) {
              var3 = (jk) ((Object) oha.field_o.c(param0 + -99));
              L5: while (true) {
                if (var3 == null) {
                  oha.field_o = null;
                  break L0;
                } else {
                  var3.d((byte) -35);
                  var3 = (jk) ((Object) oha.field_o.d(param0 + -16));
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "qo.B(" + param0 + ')');
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
            si.a(15, 62, param0[0].a(12));
            if (param1 < -119) {
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

            stackIn_7_1 = new StringBuilder().append("qo.A(");

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
    }
}
