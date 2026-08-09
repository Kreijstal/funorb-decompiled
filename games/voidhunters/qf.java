/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends rqa {
    static kb field_o;

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
              stackIn_4_0 = new nc(jj.field_p);
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

            stackIn_7_1 = new StringBuilder().append("qf.A(");

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

    qf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1) {
        ksa var2 = null;
        int var3 = 0;
        dnb var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4 = (dnb) ((Object) ahb.field_o.d(0));
              if (param1 == -52) {
                break L1;
              } else {
                field_o = (kb) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                var2 = cnb.field_q.d(0);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    wva.b(param0, 22681);
                    var2 = cnb.field_q.a((byte) 54);
                    continue L3;
                  }
                }
              } else {
                nv.a((byte) 88, var4, param0);
                var4 = (dnb) ((Object) ahb.field_o.a((byte) 89));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "qf.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            field_o = (kb) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        uu discarded$0 = new uu();
        field_o = new kb(1);
    }
}
