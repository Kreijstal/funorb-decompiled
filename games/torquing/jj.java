/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    final static java.awt.Frame a(vh param0, int param1, int param2, int param3, int param4, int param5) {
        sf[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        sf[] var11 = null;
        rc var12 = null;
        rc var13 = null;
        java.awt.Frame var14 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        Object var26 = null;
        Object var27 = null;
        java.awt.Frame var27_ref = null;
        rc var28 = null;
        Object var29 = null;
        java.awt.Frame var29_ref = null;
        Object var30 = null;
        Object var31 = null;
        Object var32 = null;
        java.awt.Frame var32_ref = null;
        Object var33 = null;
        Object var34 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var24 = null;
        var25 = null;
        var26 = null;
        var27 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var33 = null;
        var34 = null;
        var9 = Torquing.field_u;
        if (param0.a((byte) 13)) {
          if (param4 == 0) {
            var11 = no.a(param0, -33);
            var6 = var11;
            if (var6 != null) {
              var7 = 0;
              var8 = 0;
              L0: while (true) {
                if (var11.length <= var8) {
                  if (var7 != 0) {
                    var28 = param0.a(true, param2, param1, param5, param4);
                    var12 = var28;
                    L1: while (true) {
                      if (var28.field_a != 0) {
                        if (param3 != 0) {
                          var10 = null;
                          java.awt.Frame discarded$2 = jj.a((vh) null, 19, 84, -43, 52, 100);
                          var32_ref = (java.awt.Frame) var28.field_d;
                          if (var32_ref != null) {
                            if (-3 != (var28.field_a ^ -1)) {
                              return var32_ref;
                            } else {
                              ka.a(-123, var32_ref, param0);
                              return null;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          var29_ref = (java.awt.Frame) var28.field_d;
                          if (var29_ref != null) {
                            if (-3 != (var28.field_a ^ -1)) {
                              return var29_ref;
                            } else {
                              ka.a(-123, var29_ref, param0);
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      } else {
                        ub.a(1976, 10L);
                        continue L1;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  if (var11[var8].field_d == param2) {
                    if (var11[var8].field_c == param1) {
                      L2: {
                        if (param5 == 0) {
                          break L2;
                        } else {
                          if (var11[var8].field_e == param5) {
                            break L2;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      L3: {
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (var11[var8].field_b > param4) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      param4 = var11[var8].field_b;
                      var7 = 1;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var13 = param0.a(true, param2, param1, param5, param4);
            var12 = var13;
            L4: while (true) {
              if (var13.field_a != 0) {
                if (param3 != 0) {
                  var10 = null;
                  java.awt.Frame discarded$3 = jj.a((vh) null, 19, 84, -43, 52, 100);
                  var27_ref = (java.awt.Frame) var13.field_d;
                  if (var27_ref != null) {
                    if (-3 != (var13.field_a ^ -1)) {
                      return var27_ref;
                    } else {
                      ka.a(-123, var27_ref, param0);
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  var14 = (java.awt.Frame) var13.field_d;
                  if (var14 != null) {
                    if (-3 == (var13.field_a ^ -1)) {
                      ka.a(-123, var14, param0);
                      return null;
                    } else {
                      return var14;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                ub.a(1976, 10L);
                continue L4;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static sm a(sm param0, int[] param1, int param2) {
        sm var3 = new sm(param2, 0, 0);
        var3.field_d = param0.field_d;
        var3.field_a = param0.field_a;
        var3.field_l = param0.field_l;
        var3.field_j = param0.field_j;
        var3.field_g = param0.field_g;
        var3.field_k = param1;
        var3.field_c = param0.field_c;
        var3.field_e = param0.field_e;
        return var3;
    }

    static {
    }
}
