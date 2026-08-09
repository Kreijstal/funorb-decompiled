/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static da field_a;
    static al[] field_c;
    static vs field_b;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_8_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        java.awt.Frame stackIn_35_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rm[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rm[] var10 = null;
        en var11 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              L1: {
                if (param3 == 0) {
                  var10 = sk.a(param0, 1175069442);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (param1 == var10[var8].field_f) {
                          if (var10[var8].field_b == param2) {
                            L3: {
                              if (param4 == 0) {
                                break L3;
                              } else {
                                if (var10[var8].field_a == param4) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              if (var7_int == 0) {
                                break L4;
                              } else {
                                if (param3 < var10[var8].field_d) {
                                  break L4;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            param3 = var10[var8].field_d;
                            var7_int = 1;
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(param1, -83, param4, param2, param3);
              L5: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) (var11.field_f);
                  if (var7 != null) {
                    if (param5 == 29742) {
                      if (-3 == (var11.field_a ^ -1)) {
                        ke.a(param5 ^ 30691, param0, var7);
                        stackIn_39_0 = null;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      stackIn_35_0 = (java.awt.Frame) null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  wf.a(10L, false);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6_ref);

            stackIn_42_1 = new StringBuilder().append("kn.A(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L6;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_26_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_32_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_35_0;
              } else {
                return (java.awt.Frame) ((Object) stackIn_39_0);
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_b = (vs) null;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static wp[] a(int param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = -37 / ((19 - param0) / 57);
        wp[] var2 = new wp[to.field_t];
        for (var3 = 0; var3 < to.field_t; var3++) {
            var2[var3] = new wp(pu.field_a, cc.field_i, lh.field_a[var3], lg.field_j[var3], ji.field_b[var3], ee.field_e[var3], fk.field_a[var3], ud.field_e);
        }
        kf.f(1);
        return var2;
    }

    static {
    }
}
