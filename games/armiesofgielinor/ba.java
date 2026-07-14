/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends dr {
    static int field_F;
    static String[] field_E;

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            field_E = null;
            return new nd((Object) (Object) kj.a((byte) 119));
        }
        return new nd((Object) (Object) kj.a((byte) 119));
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

    public static void i(int param0) {
        field_E = null;
        if (param0 <= 111) {
            field_F = 29;
        }
    }

    final static int h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= -103) {
          var1 = 0;
          L0: while (true) {
            if (!jd.i((byte) -52)) {
              L1: {
                nn.field_z.a(0, vo.a((byte) -47, ur.field_z, iu.field_t), vo.a((byte) 93, ko.field_b, sm.field_d));
                if (nn.field_z.d((byte) 46)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if ((nn.field_z.field_h ^ -1) <= -1) {
                  var2 = rg.field_m[nn.field_z.field_h];
                  if ((var2 ^ -1) == -3) {
                    sk.n(-112);
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              nn.field_z.b((byte) -120);
              if (nn.field_z.d((byte) 82)) {
                var1 = 1;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          field_F = 107;
          var1 = 0;
          L2: while (true) {
            if (!jd.i((byte) -52)) {
              L3: {
                nn.field_z.a(0, vo.a((byte) -47, ur.field_z, iu.field_t), vo.a((byte) 93, ko.field_b, sm.field_d));
                if (nn.field_z.d((byte) 46)) {
                  var1 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if ((nn.field_z.field_h ^ -1) <= -1) {
                  var2 = rg.field_m[nn.field_z.field_h];
                  if ((var2 ^ -1) != -3) {
                    return var2;
                  } else {
                    sk.n(-112);
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              nn.field_z.b((byte) -120);
              if (nn.field_z.d((byte) 82)) {
                var1 = 1;
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = -1;
        field_E = new String[]{"This unit is immobilised and unable to move for 1 turn", "This unit is immobilised and unable to move for <%0> turns"};
    }
}
