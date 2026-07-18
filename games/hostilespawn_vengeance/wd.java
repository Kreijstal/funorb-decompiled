/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static gb field_a;
    static bd field_b;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 69) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "wd.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ei var4_ref_ei = null;
        int var4 = 0;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (ci.field_d != rc.field_a) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var2_long = hn.a((byte) 80);
                if (bl.field_b == 0) {
                  break L1;
                } else {
                  if (tc.field_a >= 0) {
                    break L1;
                  } else {
                    var4_ref_ei = (ei) (Object) ck.field_u.g(-69);
                    if (var4_ref_ei == null) {
                      break L1;
                    } else {
                      if (~var4_ref_ei.field_j > ~var2_long) {
                        var4_ref_ei.b(-115);
                        jd.field_q = var4_ref_ei.field_r.length;
                        sc.field_g.field_i = 0;
                        var5_int = 0;
                        L2: while (true) {
                          L3: {
                            L4: {
                              if (var5_int >= jd.field_q) {
                                break L4;
                              } else {
                                sc.field_g.field_n[var5_int] = var4_ref_ei.field_r[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  if (var7 == 0) {
                                    continue L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            bj.field_f = ae.field_u;
                            ae.field_u = ne.field_o;
                            ne.field_o = wa.field_k;
                            wa.field_k = var4_ref_ei.field_s;
                            break L3;
                          }
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (param0 == 23278) {
                L5: while (true) {
                  L6: {
                    if (tc.field_a < 0) {
                      sc.field_g.field_i = 0;
                      if (re.c((byte) 33, 1)) {
                        tc.field_a = sc.field_g.p(param0 + -23214);
                        sc.field_g.field_i = 0;
                        jd.field_q = param1[tc.field_a];
                        break L6;
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (eb.a(13372)) {
                    L7: {
                      if (bl.field_b == 0) {
                        break L7;
                      } else {
                        L8: {
                          var4 = bl.field_b;
                          if (sb.field_a == 0.0) {
                            break L8;
                          } else {
                            var4 = (int)((double)var4 + jk.field_b.nextGaussian() * sb.field_a);
                            if (0 > var4) {
                              var4 = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var5 = new ei(var2_long + (long)var4, tc.field_a, new byte[jd.field_q]);
                        var6 = 0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (~jd.field_q >= ~var6) {
                                break L11;
                              } else {
                                var5.field_r[var6] = sc.field_g.field_n[var6];
                                var6++;
                                if (var7 != 0) {
                                  break L10;
                                } else {
                                  if (var7 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            ck.field_u.a((am) (Object) var5, 111);
                            tc.field_a = -1;
                            break L10;
                          }
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    bj.field_f = ae.field_u;
                    ae.field_u = ne.field_o;
                    ne.field_o = wa.field_k;
                    wa.field_k = tc.field_a;
                    tc.field_a = -1;
                    stackOut_51_0 = 1;
                    stackIn_52_0 = stackOut_51_0;
                    break L0;
                  } else {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                }
              } else {
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L12;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L12;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
        return stackIn_52_0 != 0;
    }

    static {
    }
}
