/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    final static void a(byte param0) {
        vi dupTemp$2 = null;
        int fieldTemp$3 = 0;
        vi var1 = null;
        int var2 = 0;
        vi var3 = null;
        var2 = HoldTheLine.field_D;
        if (param0 >= 78) {
          if (null != bd.field_Q) {
            if (-1 != ab.field_jb) {
              L0: {
                var1 = gh.field_n[ab.field_jb];
                if (var1 != null) {
                  break L0;
                } else {
                  dupTemp$2 = vi.a(bd.field_Q, em.field_m[ab.field_jb], "");
                  var3 = dupTemp$2;
                  var1 = var3;
                  if (dupTemp$2 != null) {
                    gh.field_n[ab.field_jb] = var3;
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              if (vl.field_d.field_q.a(22050, jh.field_a, var1, false, pd.field_f)) {
                i.field_k[ab.field_jb] = var1;
                ab.field_jb = -1;
                fieldTemp$3 = oc.field_a - 1;
                oc.field_a = oc.field_a - 1;
                if (-1 != (fieldTemp$3 ^ -1)) {
                  if (bi.field_e != 2) {
                    if (1 == bi.field_e) {
                      if (lc.field_d != null) {
                        if (!ai.field_a.a(-98, lc.field_d)) {
                          gn.a(true, var1, (byte) 69, 30);
                          lc.field_d = null;
                          return;
                        } else {
                          ec.field_D = var1;
                          return;
                        }
                      } else {
                        gn.a(true, var1, (byte) 69, 30);
                        lc.field_d = null;
                        return;
                      }
                    } else {
                      gn.a(true, var1, (byte) 69, 30);
                      lc.field_d = null;
                      return;
                    }
                  } else {
                    lc.field_d = var1;
                    gn.a(false, var1, (byte) 69, 30);
                    return;
                  }
                } else {
                  vl.field_d.field_q.e(0);
                  jh.field_a = null;
                  if (bi.field_e != 2) {
                    if (1 == bi.field_e) {
                      if (lc.field_d != null) {
                        if (!ai.field_a.a(-98, lc.field_d)) {
                          gn.a(true, var1, (byte) 69, 30);
                          lc.field_d = null;
                          return;
                        } else {
                          ec.field_D = var1;
                          return;
                        }
                      } else {
                        gn.a(true, var1, (byte) 69, 30);
                        lc.field_d = null;
                        return;
                      }
                    } else {
                      gn.a(true, var1, (byte) 69, 30);
                      lc.field_d = null;
                      return;
                    }
                  } else {
                    lc.field_d = var1;
                    gn.a(false, var1, (byte) 69, 30);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(hj[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param5 <= 0) {
                  break L1;
                } else {
                  var6_int = param0[0].field_o;
                  var7 = param0[2].field_o;
                  var8 = param0[1].field_o;
                  param0[0].a(param2, param3, param1);
                  param0[2].a(-var7 + (param5 + param2), param3, param1);
                  tc.b(hi.field_W);
                  tc.e(param2 - -var6_int, param3, param2 - -param5 + -var7, param3 - -param0[1].field_v);
                  var9 = var6_int + param2;
                  var10 = param2 - (-param5 - -var7);
                  if (param4 <= -73) {
                    param2 = var9;
                    L2: while (true) {
                      if (param2 >= var10) {
                        tc.a(hi.field_W);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param0[1].a(param2, param3, param1);
                        param2 = param2 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("oj.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
