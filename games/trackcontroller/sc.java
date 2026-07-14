/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends kd {
    static int field_h;
    static java.math.BigInteger field_d;
    private String field_e;
    private String field_c;
    static int field_g;
    static int field_f;

    final static java.awt.Frame a(uf param0, int param1, int param2, int param3, int param4, int param5) {
        ji[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ji[] var10 = null;
        ce var11 = null;
        var9 = TrackController.field_F ? 1 : 0;
        if (param0.b(-4)) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              var10 = rf.a(param0, false);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_f == param5) {
                      if (var10[var8].field_c == param4) {
                        L2: {
                          if (-1 == (param2 ^ -1)) {
                            break L2;
                          } else {
                            if (param2 == var10[var8].field_g) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param1 < var10[var8].field_b) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param1 = var10[var8].field_b;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          L4: {
            var11 = param0.a(86, param1, param2, param5, param4);
            if (param3 > 85) {
              break L4;
            } else {
              sc.a(-111);
              break L4;
            }
          }
          L5: while (true) {
            if (-1 != (var11.field_f ^ -1)) {
              var7 = (java.awt.Frame) var11.field_e;
              if (var7 != null) {
                if (-3 == (var11.field_f ^ -1)) {
                  sg.a(var7, (byte) -105, param0);
                  return null;
                } else {
                  return var7;
                }
              } else {
                return null;
              }
            } else {
              wl.a(10L, false);
              continue L5;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, be param1) {
        if (param0 != -6) {
            field_g = 54;
        }
        param1.b(((sc) this).field_c, param0 + 132);
        param1.a(((sc) this).field_e, 27933);
    }

    public static void a(int param0) {
        if (param0 != 255) {
            field_d = null;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) + ((param0 & -1431655765) >>> -608814431);
        param0 = (858993459 & param0) - -(param0 >>> -1887489278 & 858993459);
        param0 = (param0 >>> -1395663420) + param0 & 252645135;
        if (param1 != -1) {
            sc.a(-83);
        }
        param0 = param0 + (param0 >>> -43772216);
        param0 = param0 + (param0 >>> -1525667952);
        return param0 & 255;
    }

    final nh a(boolean param0) {
        if (param0) {
            return null;
        }
        return nd.field_M;
    }

    sc(String param0, String param1) {
        ((sc) this).field_e = param1;
        ((sc) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
