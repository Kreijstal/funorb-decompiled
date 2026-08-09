/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends dr {
    static int field_F;
    static String[] field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                field_E = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new nd(kj.a((byte) 119));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ba.C(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        lt.field_g.a(new ce(), (byte) 66);
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 <= 111) {
            field_F = 29;
        }
    }

    final static int h(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -103) {
                break L1;
              } else {
                field_F = 107;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (!jd.i((byte) -52)) {
                L3: {
                  nn.field_z.a(0, vo.a((byte) -47, ur.field_z, iu.field_t), vo.a((byte) 93, ko.field_b, sm.field_d));
                  if (nn.field_z.d((byte) 46)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L4;
                  } else {
                    if ((nn.field_z.field_h ^ -1) <= -1) {
                      var2 = rg.field_m[nn.field_z.field_h];
                      if ((var2 ^ -1) == -3) {
                        sk.n(-112);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackIn_18_0 = var2;
                break L0;
              } else {
                nn.field_z.b((byte) -120);
                if (nn.field_z.d((byte) 82)) {
                  var1_int = 1;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ba.D(" + param0 + ')');
        }
        return stackIn_18_0;
    }

    static {
        field_F = -1;
        field_E = new String[]{"This unit is immobilised and unable to move for 1 turn", "This unit is immobilised and unable to move for <%0> turns"};
    }
}
