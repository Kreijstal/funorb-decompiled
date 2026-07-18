/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dua extends rqa {
    static khb field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
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
            si.a(98, 62, param0[0].a(78));
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("dua.A(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void f(byte param0) {
        field_p = null;
    }

    dua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String e(byte param0) {
        if (ef.field_z < 2) {
          return tdb.field_p;
        } else {
          if (ppb.field_a == null) {
            if (btb.field_b.b((byte) 115)) {
              if (!btb.field_b.a(32171, "commonui")) {
                return drb.field_k + " - " + btb.field_b.a("commonui", -2118) + "%";
              } else {
                if (dt.field_o.b((byte) 122)) {
                  if (dt.field_o.a(32171, "commonui")) {
                    if (gdb.field_i.b((byte) -41)) {
                      if (!gdb.field_i.a(35)) {
                        return lwa.field_vb + " - " + gdb.field_i.b(-115) + "%";
                      } else {
                        return neb.field_p;
                      }
                    } else {
                      return ltb.field_q;
                    }
                  } else {
                    return am.field_p + " - " + dt.field_o.a("commonui", -2118) + "%";
                  }
                } else {
                  return wqb.field_b;
                }
              }
            } else {
              return wea.field_o;
            }
          } else {
            if (!ppb.field_a.b((byte) -37)) {
              return ocb.field_i;
            } else {
              return lo.field_d;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new khb("");
    }
}
