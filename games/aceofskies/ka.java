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
              int discarded$4 = -128;
              var1 = ec.b();
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
              int discarded$5 = -128;
              var1 = ec.b();
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
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (ca.field_f != wq.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                L2: {
                  var2_long = kh.a(-125);
                  if (tj.field_m == 0) {
                    break L2;
                  } else {
                    if (0 <= ec.field_g) {
                      break L2;
                    } else {
                      L3: {
                        var4_ref_m = (m) (Object) oo.field_T.d(268435455);
                        if (var4_ref_m == null) {
                          break L3;
                        } else {
                          if (~var2_long >= ~var4_ref_m.field_e) {
                            break L3;
                          } else {
                            var4_ref_m.c(-123);
                            ag.field_s = var4_ref_m.field_h.length;
                            nm.field_c.field_g = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (ag.field_s <= var5_int) {
                                ga.field_l = kg.field_b;
                                kg.field_b = hi.field_w;
                                hi.field_w = qs.field_b;
                                qs.field_b = var4_ref_m.field_i;
                                stackOut_12_0 = 1;
                                stackIn_13_0 = stackOut_12_0;
                                return stackIn_13_0 != 0;
                              } else {
                                nm.field_c.field_f[var5_int] = var4_ref_m.field_h[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_15_0 = ec.field_g;
                      stackIn_17_0 = stackOut_15_0;
                      break L1;
                    }
                  }
                }
                stackOut_14_0 = ec.field_g;
                stackIn_17_0 = stackOut_14_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_17_0 < 0) {
                    nm.field_c.field_g = 0;
                    if (!wo.a(1, true)) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0 != 0;
                    } else {
                      ec.field_g = nm.field_c.j((byte) -53);
                      nm.field_c.field_g = 0;
                      ag.field_s = param1[ec.field_g];
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                if (rm.a(0)) {
                  if (tj.field_m == 0) {
                    ga.field_l = kg.field_b;
                    kg.field_b = hi.field_w;
                    hi.field_w = qs.field_b;
                    qs.field_b = ec.field_g;
                    ec.field_g = -1;
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = tj.field_m;
                      if (0.0 == wk.field_g) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + vr.field_h.nextGaussian() * wk.field_g);
                        if (0 <= var4) {
                          break L7;
                        } else {
                          var4 = 0;
                          break L7;
                        }
                      }
                    }
                    var5 = new m((long)var4 + var2_long, ec.field_g, new byte[ag.field_s]);
                    var6 = 0;
                    L8: while (true) {
                      if (ag.field_s <= var6) {
                        oo.field_T.a(88, (wf) (Object) var5);
                        ec.field_g = -1;
                        stackOut_16_0 = ec.field_g;
                        stackIn_17_0 = stackOut_16_0;
                        continue L5;
                      } else {
                        var5.field_h[var6] = nm.field_c.field_f[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("ka.H(").append(93).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return stackIn_36_0 != 0;
    }

    final static void a(int param0, long param1, String param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, int param11, rk param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              nm.field_c = new dl(5000);
              L0: {
                q.field_p = new dl(5000);
                ca.field_h = param4;
                ub.field_g = param11;
                gl.field_a = false;
                ca.field_g = param2;
                ii.field_j = param12;
                sg.field_b = param10;
                ut.field_a = param8;
                fs.field_a = param1;
                ko.field_f = param13;
                if (!param6) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
              te.field_h = stackIn_5_0 != 0;
              id.field_d = param9;
              if (null != ii.field_j.field_g) {
                {
                  L1: {
                    vs.field_g = new gh(ii.field_j.field_g, 64, 0);
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("ka.I(").append(-31808).append(',').append(param1).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L2;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L2;
                }
              }
              L3: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(5000).append(',').append(param4).append(',').append(false).append(',').append(param6).append(',').append(5000).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param12 == null) {
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
              throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
    }

    final static sa b() {
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
