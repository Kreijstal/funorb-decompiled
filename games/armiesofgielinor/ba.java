/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends dr {
    static int field_F;
    static String[] field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            stackOut_2_0 = new nd((Object) (Object) kj.a((byte) 119));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ba.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    ba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        if (param0 < 68) {
            return;
        }
        lt.field_g.a((kb) (Object) new ce(), (byte) 66);
    }

    public static void i() {
        field_E = null;
    }

    final static int h() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!jd.i((byte) -52)) {
                L2: {
                  nn.field_z.a(0, vo.a((byte) -47, ur.field_z, iu.field_t), vo.a((byte) 93, ko.field_b, sm.field_d));
                  if (nn.field_z.d((byte) 46)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (nn.field_z.field_h >= 0) {
                      var2 = rg.field_m[nn.field_z.field_h];
                      if (var2 == 2) {
                        sk.n(-112);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = var2;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                nn.field_z.b((byte) -120);
                if (nn.field_z.d((byte) 82)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ba.D(" + -124 + 41);
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = -1;
        field_E = new String[]{"This unit is immobilised and unable to move for 1 turn", "This unit is immobilised and unable to move for <%0> turns"};
    }
}
