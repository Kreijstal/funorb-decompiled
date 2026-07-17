/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ka {
    static ll[] field_a;

    final static String a(int param0) {
        String var1 = null;
        if (param0 > -94) {
          L0: {
            field_a = null;
            var1 = "";
            if (vr.field_b == null) {
              break L0;
            } else {
              var1 = vr.field_b.d(false);
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = ec.b((byte) -128);
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = vj.field_a;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            var1 = "";
            if (vr.field_b == null) {
              break L3;
            } else {
              var1 = vr.field_b.d(false);
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              var1 = ec.b((byte) -128);
              break L4;
            }
          }
          L5: {
            if (var1.length() == 0) {
              var1 = vj.field_a;
              break L5;
            } else {
              break L5;
            }
          }
          return var1;
        }
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        m var4_ref_m = null;
        int var4 = 0;
        int var5_int = 0;
        m var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (ca.field_f != wq.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 > 75) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var2_long = kh.a(-125);
                  if (tj.field_m == 0) {
                    break L3;
                  } else {
                    if (0 <= ec.field_g) {
                      break L3;
                    } else {
                      L4: {
                        var4_ref_m = (m) (Object) oo.field_T.d(268435455);
                        if (var4_ref_m == null) {
                          break L4;
                        } else {
                          if (~var2_long >= ~var4_ref_m.field_e) {
                            break L4;
                          } else {
                            var4_ref_m.c(-123);
                            ag.field_s = var4_ref_m.field_h.length;
                            nm.field_c.field_g = 0;
                            var5_int = 0;
                            L5: while (true) {
                              if (ag.field_s <= var5_int) {
                                ga.field_l = kg.field_b;
                                kg.field_b = hi.field_w;
                                hi.field_w = qs.field_b;
                                qs.field_b = var4_ref_m.field_i;
                                stackOut_14_0 = 1;
                                stackIn_15_0 = stackOut_14_0;
                                return stackIn_15_0 != 0;
                              } else {
                                nm.field_c.field_f[var5_int] = var4_ref_m.field_h[var5_int];
                                var5_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_17_0 = ec.field_g;
                      stackIn_19_0 = stackOut_17_0;
                      break L2;
                    }
                  }
                }
                stackOut_16_0 = ec.field_g;
                stackIn_19_0 = stackOut_16_0;
                break L2;
              }
              L6: while (true) {
                L7: {
                  if (stackIn_19_0 < 0) {
                    nm.field_c.field_g = 0;
                    if (!wo.a(1, true)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    } else {
                      ec.field_g = nm.field_c.j((byte) -53);
                      nm.field_c.field_g = 0;
                      ag.field_s = param1[ec.field_g];
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                if (rm.a(0)) {
                  if (tj.field_m == 0) {
                    ga.field_l = kg.field_b;
                    kg.field_b = hi.field_w;
                    hi.field_w = qs.field_b;
                    qs.field_b = ec.field_g;
                    ec.field_g = -1;
                    stackOut_37_0 = 1;
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  } else {
                    L8: {
                      var4 = tj.field_m;
                      if (0.0 == wk.field_g) {
                        break L8;
                      } else {
                        var4 = (int)((double)var4 + vr.field_h.nextGaussian() * wk.field_g);
                        if (0 <= var4) {
                          break L8;
                        } else {
                          var4 = 0;
                          break L8;
                        }
                      }
                    }
                    var5 = new m((long)var4 + var2_long, ec.field_g, new byte[ag.field_s]);
                    var6 = 0;
                    L9: while (true) {
                      if (ag.field_s <= var6) {
                        oo.field_T.a(88, (wf) (Object) var5);
                        ec.field_g = -1;
                        stackOut_18_0 = ec.field_g;
                        stackIn_19_0 = stackOut_18_0;
                        continue L6;
                      } else {
                        var5.field_h[var6] = nm.field_c.field_f[var6];
                        var6++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("ka.H(").append(param0).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_38_0 != 0;
    }

    final static void a(int param0, long param1, String param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, int param11, rk param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              nm.field_c = new dl(param7);
              if (param0 == -31808) {
                L0: {
                  q.field_p = new dl(param3);
                  ca.field_h = param4;
                  ub.field_g = param11;
                  if (!param5) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L0;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L0;
                  }
                }
                L1: {
                  gl.field_a = stackIn_5_0 != 0;
                  ca.field_g = param2;
                  ii.field_j = param12;
                  sg.field_b = param10;
                  ut.field_a = param8;
                  fs.field_a = param1;
                  ko.field_f = param13;
                  if (!param6) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                te.field_h = stackIn_8_0 != 0;
                id.field_d = param9;
                if (null != ii.field_j.field_g) {
                  {
                    L2: {
                      vs.field_g = new gh(ii.field_j.field_g, 64, 0);
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) var15_ref;
                stackOut_14_1 = new StringBuilder().append("ka.I(").append(param0).append(44).append(param1).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L3;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L3;
                }
              }
              L4: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param12 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L4;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param13 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    final static sa b(byte param0) {
        if (ao.field_b == null) {
          ao.field_b = new sa();
          ao.field_b.a(qo.field_b, 3);
          ao.field_b.field_o = 0;
          ao.field_b.field_i = 14;
          ao.field_b.field_d = 7697781;
          ao.field_b.field_l = 4;
          ao.field_b.field_j = 2763306;
          ao.field_b.field_e = 5;
          ao.field_b.field_f = 6;
          ao.field_b.field_b = oi.field_c;
          return ao.field_b;
        } else {
          return ao.field_b;
        }
    }

    static {
    }
}
