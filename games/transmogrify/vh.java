/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends me {
    static int field_m;
    static int field_n;
    static ti field_l;
    static String field_j;
    static String field_k;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var7 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                if (!fl.field_c) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (kj.a(param0, false, "getcookies"));
                      var4 = vi.a(';', var3, 0);
                      var5 = param1;
                      L2: while (true) {
                        L3: {
                          if (var5 >= var4.length) {
                            break L3;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackOut_6_0 = var6 ^ -1;
                            stackIn_17_0 = stackOut_6_0;
                            stackIn_7_0 = stackOut_6_0;
                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L4: {
                                if (stackIn_7_0 > -1) {
                                  break L4;
                                } else {
                                  if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                    break L4;
                                  } else {
                                    stackOut_9_0 = 1;
                                    stackIn_10_0 = stackOut_9_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param0.getParameter("tuhstatbut") == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L6;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L6;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L6;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var2_ref);
                stackOut_18_1 = new StringBuilder().append("vh.D(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rc stackIn_5_0 = null;
        rc stackIn_8_0 = null;
        rc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        rc stackOut_9_0 = null;
        rc stackOut_7_0 = null;
        rc stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (tl.a(param1, 2993) != null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (param0 == 95) {
              if (var3_int != 0) {
                stackOut_9_0 = hi.field_b;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = ec.field_d;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = (rc) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.a(95, param1) == ec.field_d) {
              stackOut_2_0 = uc.field_c;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_n = 50;
                  break L1;
                }
              }
              stackOut_6_0 = wj.field_i;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("vh.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_k = null;
        field_j = null;
        int var1 = 57 / ((-83 - param0) / 34);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        ba.field_q[cg.field_l] = param4;
        lk.field_d[cg.field_l] = cg.field_l;
        dk.field_k[cg.field_l] = param0;
        if (param0 >= ua.field_d) {
          L0: {
            if (param0 > rc.field_c) {
              vb.field_a = param0;
              break L0;
            } else {
              break L0;
            }
          }
          bh.field_a[cg.field_l] = param3;
          pd.field_a[cg.field_l] = param2;
          bg.field_j[cg.field_l] = param1;
          var6 = param2 + param3 + param1;
          if (!param5) {
            L1: {
              if (var6 != 0) {
                stackOut_41_0 = param3 * 1000 / var6;
                stackIn_42_0 = stackOut_41_0;
                break L1;
              } else {
                stackOut_40_0 = 0;
                stackIn_42_0 = stackOut_40_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_42_0;
              tb.field_d[cg.field_l] = var7;
              cg.field_l = cg.field_l + 1;
              if (vb.field_a < var7) {
                vb.field_a = var7;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 < ue.field_a) {
              ue.field_a = var7;
              return;
            } else {
              return;
            }
          } else {
            L3: {
              vh.a(59, 57, -75, 24, 38, false);
              if (var6 != 0) {
                stackOut_31_0 = param3 * 1000 / var6;
                stackIn_32_0 = stackOut_31_0;
                break L3;
              } else {
                stackOut_30_0 = 0;
                stackIn_32_0 = stackOut_30_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_32_0;
              tb.field_d[cg.field_l] = var7;
              cg.field_l = cg.field_l + 1;
              if (vb.field_a < var7) {
                vb.field_a = var7;
                break L4;
              } else {
                break L4;
              }
            }
            if (var7 < ue.field_a) {
              ue.field_a = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          L5: {
            ue.field_a = param0;
            if (param0 > rc.field_c) {
              vb.field_a = param0;
              break L5;
            } else {
              break L5;
            }
          }
          bh.field_a[cg.field_l] = param3;
          pd.field_a[cg.field_l] = param2;
          bg.field_j[cg.field_l] = param1;
          var6 = param2 + param3 + param1;
          if (param5) {
            L6: {
              vh.a(59, 57, -75, 24, 38, false);
              if (var6 != 0) {
                stackOut_17_0 = param3 * 1000 / var6;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_16_0 = 0;
                stackIn_18_0 = stackOut_16_0;
                break L6;
              }
            }
            L7: {
              var7 = stackIn_18_0;
              tb.field_d[cg.field_l] = var7;
              cg.field_l = cg.field_l + 1;
              if (vb.field_a < var7) {
                vb.field_a = var7;
                break L7;
              } else {
                break L7;
              }
            }
            if (var7 < ue.field_a) {
              ue.field_a = var7;
              return;
            } else {
              return;
            }
          } else {
            L8: {
              if (var6 != 0) {
                stackOut_7_0 = param3 * 1000 / var6;
                stackIn_8_0 = stackOut_7_0;
                break L8;
              } else {
                stackOut_6_0 = 0;
                stackIn_8_0 = stackOut_6_0;
                break L8;
              }
            }
            L9: {
              var7 = stackIn_8_0;
              tb.field_d[cg.field_l] = var7;
              cg.field_l = cg.field_l + 1;
              if (vb.field_a < var7) {
                vb.field_a = var7;
                break L9;
              } else {
                break L9;
              }
            }
            if (var7 < ue.field_a) {
              ue.field_a = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    vh(rg param0) {
        super(param0);
    }

    static {
        field_n = 0;
        field_j = "Start Game";
        field_k = "Unpacking languages";
    }
}
