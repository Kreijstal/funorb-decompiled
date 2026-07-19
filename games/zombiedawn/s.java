/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class s extends le {
    int field_i;
    fb field_h;
    static vn field_j;

    final static void a(long param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, ec param10, String param11, int param12, int param13) {
        try {
            int var15_int = 0;
            RuntimeException var15 = null;
            IOException var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                fj.field_g = new am(param1);
                dp.field_e = new am(param7);
                h.field_b = param5;
                var15_int = 112 / ((56 - param12) / 57);
                jm.field_B = param10;
                cn.field_j = param13;
                if (!param4) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                ni.field_a = stackIn_3_0 != 0;
                tm.field_o = param11;
                ci.field_c = param8;
                kg.field_k = param9;
                if (!param2) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ih.field_S = stackIn_6_0 != 0;
              ba.field_b = param3;
              le.field_g = param6;
              lg.field_u = param0;
              if (null != jm.field_B.field_b) {
                try {
                  L2: {
                    ce.field_t = new sf(jm.field_B.field_b, 64, 0);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var16 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var16.toString());
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) (var15);
                stackOut_12_1 = new StringBuilder().append("s.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param10 == null) {
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
              L4: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param11 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, wk param1, ub param2) {
        int fieldTemp$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        kd var6 = null;
        qh var7 = null;
        int var8 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = 83 % ((param0 - -39) / 39);
            if (ac.field_m <= 1428) {
              L1: {
                if (0 != ac.field_m % 35) {
                  break L1;
                } else {
                  lg.a(2, (byte) 100);
                  break L1;
                }
              }
              L2: {
                if (-1.0f != oc.field_c) {
                  break L2;
                } else {
                  oc.field_c = (float)param1.field_c;
                  break L2;
                }
              }
              L3: {
                if (oc.field_c > 240.0f) {
                  oc.field_c = oc.field_c - i.field_V;
                  param1.field_c = (int)oc.field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1429 != (ac.field_m ^ -1)) {
                L4: {
                  if (ac.field_m <= 1172) {
                    if (1172 == ac.field_m) {
                      wc.field_Rb = ge.field_c;
                      ha.field_d.w(0);
                      wi.field_e = ha.field_d.field_Pb;
                      break L4;
                    } else {
                      if (850 >= ac.field_m) {
                        if (850 != ac.field_m) {
                          break L4;
                        } else {
                          wi.field_a = ce.field_u;
                          break L4;
                        }
                      } else {
                        L5: {
                          var4 = -ac.field_m - -1106;
                          if (-1 < (var4 ^ -1)) {
                            var4 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ZombieDawn.b(126, var4 * wi.field_a >> 779680712);
                        if (ac.field_m % 2 == 0) {
                          param2.i(16777215);
                          if ((ac.field_m + -850) / 2 == 100) {
                            ha.field_d.field_x = -50 + ha.field_d.f(237239984) << -1170422704;
                            var5 = 0;
                            L6: while (true) {
                              if (-6 >= (var5 ^ -1)) {
                                break L4;
                              } else {
                                var6 = dj.field_e.a(10, (byte) 124, 90, 340, 380);
                                var7 = new qh();
                                var7.a(0, new kk(var6.a(true), var6.f(237239984) + -100));
                                var6.a(var7, true);
                                var5++;
                                continue L6;
                              }
                            }
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    L7: {
                      var4 = 1428 + -ac.field_m;
                      if (-1 < (var4 ^ -1)) {
                        var4 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    qb.a(false, var4 * wc.field_Rb >> 1938762664);
                    fieldTemp$1 = wi.field_e;
                    wi.field_e = wi.field_e - 1;
                    if (0 >= fieldTemp$1) {
                      qj.field_f = kh.a(63, false);
                      wi.field_e = 20;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L8: {
                  if (ac.field_m <= 620) {
                    if (150 < ac.field_m) {
                      if (-1 != (ac.field_m % 20 ^ -1)) {
                        break L8;
                      } else {
                        if (0.7 > (double)i.field_V) {
                          i.field_V = i.field_V + 0.10000000149011612f;
                          break L8;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L9: {
                      if (i.field_V <= 0.0f) {
                        break L9;
                      } else {
                        if (-1 != (ac.field_m % 20 ^ -1)) {
                          break L9;
                        } else {
                          i.field_V = i.field_V - 0.10000000149011612f;
                          break L9;
                        }
                      }
                    }
                    if (0.0f <= i.field_V) {
                      break L8;
                    } else {
                      i.field_V = 0.0f;
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L10: {
                  if (qj.field_f == null) {
                    break L10;
                  } else {
                    if (qj.field_f.l()) {
                      break L10;
                    } else {
                      pc.a((byte) 13, qj.field_f);
                      break L10;
                    }
                  }
                }
                ch.b(73);
                ZombieDawn.b(114, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var3);
            stackOut_51_1 = new StringBuilder().append("s.B(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L11;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L11;
            }
          }
          L12: {
            stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L12;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L12;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ')');
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

    public static void c(byte param0) {
        field_j = null;
        if (param0 <= -111) {
            return;
        }
        field_j = (vn) null;
    }

    final static String a(int param0, String param1, String[] param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_15_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                var5 = var6_int - -2;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!bj.a(param1.charAt(var5), 78)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (sj.a((byte) 126, (CharSequence) ((Object) var7_ref_String))) {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = ra.a((CharSequence) ((Object) var7_ref_String), 122);
                        var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param0 == 1938762664) {
                  L4: while (true) {
                    var8 = param1.indexOf("<%", var5);
                    if (var8 < 0) {
                      discarded$3 = var6.append(param1.substring(var7));
                      stackOut_26_0 = var6.toString();
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = 2 + var8;
                      L5: while (true) {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (!bj.a(param1.charAt(var5), param0 + -1938762567)) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param1.substring(var8 - -2, var5);
                        if (sj.a((byte) 59, (CharSequence) ((Object) var9))) {
                          if (var3_int <= var5) {
                            continue L4;
                          } else {
                            if (param1.charAt(var5) != 62) {
                              continue L4;
                            } else {
                              var5++;
                              var10 = ra.a((CharSequence) ((Object) var9), param0 ^ 1938762718);
                              discarded$4 = var6.append(param1.substring(var7, var8));
                              discarded$5 = var6.append(param2[var10]);
                              var7 = var5;
                              continue L4;
                            }
                          }
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_14_0 = (String) null;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("s.A(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_27_0;
        }
    }

    s(fb param0, int param1) {
        try {
            this.field_i = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
