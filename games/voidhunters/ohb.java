/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ohb extends rqa {
    static mm field_o;

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
            if (param1 < -119) {
              si.a(176, 62, param0[0].a(124));
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

            stackIn_7_1 = new StringBuilder().append("ohb.A(");

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

    public static void e(byte param0) {
        if (param0 != 84) {
            field_o = (mm) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    ohb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static nl a(int param0, int param1, int param2) {
        Object var3;
        nl var3_ref;
        int var4;
        var3 = null;
        var4 = VoidHunters.field_G;
        if (param1 <= -17) {
          var3_ref = (nl) ((Object) gtb.field_d.d(0));
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
              var3_ref = (nl) ((Object) gtb.field_d.a((byte) 59));
              continue L0;
            } else {
              return null;
            }
          }
        } else {
          ohb.e((byte) -51);
          var3_ref = (nl) ((Object) gtb.field_d.d(0));
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
              var3_ref = (nl) ((Object) gtb.field_d.a((byte) 59));
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
