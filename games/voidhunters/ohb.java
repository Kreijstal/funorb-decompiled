/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ohb extends rqa {
    static mm field_o;

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
            if (param1 < -119) {
              si.a(176, 62, param0[0].a(124));
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
            stackOut_5_1 = new StringBuilder().append("ohb.A(");
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

    public static void e(byte param0) {
        if (param0 != 84) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    ohb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static nl a(int param0, int param1, int param2) {
        Object var3 = null;
        nl var3_ref = null;
        int var4 = 0;
        var3 = null;
        var4 = VoidHunters.field_G;
        if (param1 <= -17) {
          var3_ref = (nl) (Object) gtb.field_d.d(0);
          L0: while (true) {
            if (var3_ref != null) {
              L1: {
                if (param0 != var3_ref.field_k) {
                  break L1;
                } else {
                  if (param2 == var3_ref.field_l) {
                    return var3_ref;
                  } else {
                    break L1;
                  }
                }
              }
              var3_ref = (nl) (Object) gtb.field_d.a((byte) 59);
              continue L0;
            } else {
              return null;
            }
          }
        } else {
          ohb.e((byte) -51);
          var3_ref = (nl) (Object) gtb.field_d.d(0);
          L2: while (true) {
            if (var3_ref != null) {
              L3: {
                if (param0 != var3_ref.field_k) {
                  break L3;
                } else {
                  if (param2 == var3_ref.field_l) {
                    return var3_ref;
                  } else {
                    break L3;
                  }
                }
              }
              var3_ref = (nl) (Object) gtb.field_d.a((byte) 59);
              continue L2;
            } else {
              return null;
            }
          }
        }
    }

    static {
    }
}
