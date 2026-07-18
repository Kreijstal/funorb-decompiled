/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ka {
    static ll[] field_a;

    final static String a(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -94) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              var1 = "";
              if (vr.field_b == null) {
                break L2;
              } else {
                var1 = vr.field_b.d(false);
                break L2;
              }
            }
            L3: {
              if (var1.length() != 0) {
                break L3;
              } else {
                var1 = ec.b((byte) -128);
                break L3;
              }
            }
            L4: {
              if (var1.length() == 0) {
                var1 = vj.field_a;
                break L4;
              } else {
                break L4;
              }
            }
            stackOut_11_0 = (String) var1;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1_ref, "ka.J(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        m var4_ref_m = null;
        int var4 = 0;
        m var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (ca.field_f != wq.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
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
                var2_long = kh.a(-125);
                if (tj.field_m == 0) {
                  break L2;
                } else {
                  if (0 <= ec.field_g) {
                    break L2;
                  } else {
                    var4_ref_m = (m) (Object) oo.field_T.d(268435455);
                    if (var4_ref_m == null) {
                      break L2;
                    } else {
                      if (~var2_long >= ~var4_ref_m.field_e) {
                        break L2;
                      } else {
                        var4_ref_m.c(-123);
                        ag.field_s = var4_ref_m.field_h.length;
                        nm.field_c.field_g = 0;
                        var5_int = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              if (~ag.field_s >= ~var5_int) {
                                break L5;
                              } else {
                                nm.field_c.field_f[var5_int] = var4_ref_m.field_h[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L4;
                                } else {
                                  if (var7 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            ga.field_l = kg.field_b;
                            kg.field_b = hi.field_w;
                            hi.field_w = qs.field_b;
                            qs.field_b = var4_ref_m.field_i;
                            break L4;
                          }
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (ec.field_g < 0) {
                    nm.field_c.field_g = 0;
                    if (!wo.a(1, true)) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
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
                  L8: {
                    if (tj.field_m == 0) {
                      break L8;
                    } else {
                      L9: {
                        var4 = tj.field_m;
                        if (0.0 == wk.field_g) {
                          break L9;
                        } else {
                          var4 = (int)((double)var4 + vr.field_h.nextGaussian() * wk.field_g);
                          if (0 <= var4) {
                            break L9;
                          } else {
                            var4 = 0;
                            break L9;
                          }
                        }
                      }
                      var5 = new m((long)var4 + var2_long, ec.field_g, new byte[ag.field_s]);
                      var6 = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (~ag.field_s >= ~var6) {
                              break L12;
                            } else {
                              var5.field_h[var6] = nm.field_c.field_f[var6];
                              var6++;
                              if (var7 != 0) {
                                break L11;
                              } else {
                                if (var7 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          oo.field_T.a(88, (wf) (Object) var5);
                          ec.field_g = -1;
                          break L11;
                        }
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ga.field_l = kg.field_b;
                  kg.field_b = hi.field_w;
                  hi.field_w = qs.field_b;
                  qs.field_b = ec.field_g;
                  ec.field_g = -1;
                  stackOut_49_0 = 1;
                  stackIn_50_0 = stackOut_49_0;
                  break L0;
                } else {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  return stackIn_36_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("ka.H(").append(param0).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L13;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ')');
        }
        return stackIn_50_0 != 0;
    }

    final static void a(int param0, long param1, String param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, int param11, rk param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                nm.field_c = new dl(param7);
                if (param0 == -31808) {
                  L1: {
                    q.field_p = new dl(param3);
                    ca.field_h = param4;
                    ub.field_g = param11;
                    gl.field_a = param5;
                    ca.field_g = param2;
                    ii.field_j = param12;
                    sg.field_b = param10;
                    ut.field_a = param8;
                    fs.field_a = param1;
                    ko.field_f = param13;
                    te.field_h = param6;
                    id.field_d = param9;
                    if (null != ii.field_j.field_g) {
                      {
                        L2: {
                          vs.field_g = new gh(ii.field_j.field_g, 64, 0);
                          break L2;
                        }
                      }
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var15_ref;
                stackOut_9_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_13_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param12 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L4;
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

    public static void a(byte param0) {
        try {
            field_a = null;
            if (param0 != -126) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ka.K(" + param0 + ')');
        }
    }

    final static sa b(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_5_0 = null;
        sa stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (ao.field_b != null) {
                break L1;
              } else {
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
                break L1;
              }
            }
            if (param0 > 98) {
              stackOut_6_0 = ao.field_b;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (sa) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "ka.G(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    static {
    }
}
