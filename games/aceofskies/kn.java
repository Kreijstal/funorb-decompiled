/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static da field_a;
    static al[] field_c;
    static vs field_b;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        rm[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rm[] var10 = null;
        en var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        java.awt.Frame stackIn_35_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_38_0 = null;
        java.awt.Frame stackOut_34_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              L1: {
                if (param3 == 0) {
                  var10 = sk.a(param0, 1175069442);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
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
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
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
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      stackOut_34_0 = (java.awt.Frame) null;
                      stackIn_35_0 = stackOut_34_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
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
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("kn.A(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L6;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
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
