/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends ksa {
    ana field_d;
    boolean field_h;
    boolean field_g;
    int field_k;
    int field_f;
    int field_i;
    static float field_n;
    static d field_e;
    int field_l;
    static int field_m;
    static String field_j;

    final static void a(int param0, int param1) {
        ana var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        kt.field_l = param0;
        var2 = (ana) (Object) cg.field_p.d(param1 + 13205);
        if (param1 != -13205) {
          nl.a(-88);
          L0: while (true) {
            if (var2 == null) {
              if (null != rd.field_o) {
                var2 = (ana) (Object) rd.field_o.d(0);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (!var2.field_g.b((byte) -63)) {
                        var2.b(param1 ^ 15505);
                        break L2;
                      } else {
                        var2.field_e.e(kt.field_l * var2.field_d + 128 >> -1771790904);
                        break L2;
                      }
                    }
                    var2 = (ana) (Object) rd.field_o.a((byte) 100);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (var2.field_g.b((byte) -63)) {
                  var2.field_e.e(128 + kt.field_l * var2.field_d >> 2128263208);
                  break L3;
                } else {
                  var2.b(-3846);
                  break L3;
                }
              }
              var2 = (ana) (Object) cg.field_p.a((byte) 61);
              continue L0;
            }
          }
        } else {
          L4: while (true) {
            if (var2 == null) {
              if (null != rd.field_o) {
                var2 = (ana) (Object) rd.field_o.d(0);
                L5: while (true) {
                  if (var2 != null) {
                    L6: {
                      if (!var2.field_g.b((byte) -63)) {
                        var2.b(param1 ^ 15505);
                        break L6;
                      } else {
                        var2.field_e.e(kt.field_l * var2.field_d + 128 >> -1771790904);
                        break L6;
                      }
                    }
                    var2 = (ana) (Object) rd.field_o.a((byte) 100);
                    continue L5;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L7: {
                if (var2.field_g.b((byte) -63)) {
                  var2.field_e.e(128 + kt.field_l * var2.field_d >> 2128263208);
                  break L7;
                } else {
                  var2.b(-3846);
                  break L7;
                }
              }
              var2 = (ana) (Object) cg.field_p.a((byte) 61);
              continue L4;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 2128263208) {
            field_n = -0.17532885074615479f;
            field_e = null;
            field_j = null;
            return;
        }
        field_e = null;
        field_j = null;
    }

    nl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0.20000000298023224f;
        field_j = "No";
    }
}
