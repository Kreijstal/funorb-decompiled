/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg extends ub {
    static String field_I;
    static String field_H;
    static kg field_K;
    static int field_G;
    static String field_F;
    static gn field_J;
    static String[] field_L;

    final static void a(int param0, qk param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_11_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = qm.a((-param4 + param0) * 3, (byte) -100);
              var6 = param4 * 3;
              var7 = var5_int - 10;
              p.a(80);
              if (param1.field_l <= 0) {
                break L1;
              } else {
                if (null != param1.field_r) {
                  int discarded$1 = -92;
                  go.b();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            rb.field_t = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param1.field_J <= var8) {
                    break L4;
                  } else {
                    var9 = param1.field_w[var8];
                    var10 = param1.field_Q[var8];
                    var11 = param1.field_P[var8];
                    stackOut_10_0 = 0;
                    stackIn_49_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_11_0 == 0) {
                            break L6;
                          } else {
                            var12 = gd.field_d[var9];
                            var13 = om.field_p[var9];
                            var14 = -var12 + gd.field_d[var10];
                            var15 = gd.field_d[var11] + -var12;
                            var16 = -var13 + om.field_p[var10];
                            var17 = om.field_p[var11] + -var13;
                            if (var14 * var17 + -(var16 * var15) < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          var12 = ff.field_c[var9];
                          if (var12 != -2147483648) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var13 = ff.field_c[var10];
                        if (-2147483648 == var13) {
                          break L5;
                        } else {
                          var14 = ff.field_c[var11];
                          if (var14 == -2147483648) {
                            break L5;
                          } else {
                            L8: {
                              var15 = var13 + (var12 + var14) + -var6;
                              stackOut_24_0 = qg.field_d.length + -1;
                              stackIn_27_0 = stackOut_24_0;
                              stackIn_25_0 = stackOut_24_0;
                              if (var7 < 0) {
                                stackOut_27_0 = stackIn_27_0;
                                stackOut_27_1 = var15 << -var7;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L8;
                              } else {
                                stackOut_25_0 = stackIn_25_0;
                                stackOut_25_1 = var15 >> var7;
                                stackIn_28_0 = stackOut_25_0;
                                stackIn_28_1 = stackOut_25_1;
                                break L8;
                              }
                            }
                            var16 = stackIn_28_0 + -stackIn_28_1;
                            var17 = qg.field_d[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (var17 >> 4 == 0) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_30_0 = -1;
                                    stackOut_30_1 = ~var16;
                                    stackIn_39_0 = stackOut_30_0;
                                    stackIn_39_1 = stackOut_30_1;
                                    stackIn_31_0 = stackOut_30_0;
                                    stackIn_31_1 = stackOut_30_1;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_31_0 >= stackIn_31_1) {
                                          break L12;
                                        } else {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var17 = qg.field_d[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_38_0 = var17;
                                stackOut_38_1 = var16 << 4;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_39_0 + stackIn_39_1;
                                al.field_b[var18] = var8;
                                qg.field_d[var16] = var17 - -1;
                                if (param1.field_l <= 0) {
                                  break L13;
                                } else {
                                  if (param1.field_r != null) {
                                    pk.field_I[param1.field_r[var8]] = pk.field_I[param1.field_r[var8]] + 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              rb.field_t = rb.field_t + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L14: {
                L15: {
                  if (stackIn_49_0 >= param1.field_l) {
                    break L15;
                  } else {
                    if (null == param1.field_r) {
                      break L15;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (var9 >= pk.field_I.length) {
                          break L15;
                        } else {
                          var10 = pk.field_I[var9];
                          pk.field_I[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5;
            stackOut_60_1 = new StringBuilder().append("pg.L(").append(param0).append(44);
            stackIn_63_0 = stackOut_60_0;
            stackIn_63_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + 0 + 44 + 3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                if (param0 == ud.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (1 == param0) {
                      break L2;
                    } else {
                      int discarded$2 = 2;
                      if (o.a(param0) != null) {
                        break L2;
                      } else {
                        kd.field_c = 80;
                        if (HoldTheLine.field_D == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ud.field_d = param0;
                  break L1;
                }
              }
            }
            if (~param0 != ~ma.field_k) {
              L3: {
                ma.field_k = param0;
                if (param1 > 91) {
                  break L3;
                } else {
                  field_K = null;
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) (Object) runtimeException, "pg.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            uk.b(-45);
            if (param1 >= 82) {
              ka.field_b.a(false);
              lh.field_a = new vg(ec.field_v, (String) null, ci.field_o, param3, param0);
              sm.field_c = new si(ka.field_b, (n) (Object) lh.field_a);
              ka.field_b.a((n) (Object) sm.field_c, false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("pg.I(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
    }

    public static void h() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_H = null;
            field_F = null;
            field_K = null;
            field_L = null;
            field_I = null;
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "pg.M(" + 6 + 41);
        }
    }

    final static int a(byte param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -10 % ((57 - param0) / 62);
            stackOut_0_0 = qe.a(0, param2, 0, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pg.J(").append(param0).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(gn param0) {
        try {
            RuntimeException var2 = null;
            byte[] var2_array = null;
            String[] var3 = null;
            String[][] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            IOException var9 = null;
            int var10 = 0;
            int stackIn_5_0 = 0;
            int stackIn_7_0 = 0;
            boolean stackIn_10_0 = false;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_6_0 = 0;
            boolean stackOut_9_0 = false;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var10 = HoldTheLine.field_D;
            try {
              L0: {
                var2_array = param0.a((byte) -96, "level_progression.txt");
                int discarded$2 = 0;
                var3 = ik.a(var2_array);
                var4 = new String[6][];
                var4[0] = e.a(var3, 0, "s1");
                var4[1] = e.a(var3, 0, "s2");
                var4[2] = e.a(var3, 0, "s3");
                var4[3] = e.a(var3, 0, "s4");
                var4[4] = e.a(var3, 0, "tutorial");
                var4[5] = e.a(var3, 0, "demolition");
                vf.field_v = false;
                tk.field_c = new vk[6][];
                pc.field_l = new int[6];
                var5 = 0;
                L1: while (true) {
                  stackOut_4_0 = -7;
                  stackIn_5_0 = stackOut_4_0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (stackIn_5_0 >= ~var5) {
                          break L4;
                        } else {
                          var6 = var4[var5].length;
                          pc.field_l[var5] = var6;
                          tk.field_c[var5] = new vk[var6];
                          stackOut_6_0 = 0;
                          stackIn_19_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            var7 = stackIn_7_0;
                            L5: while (true) {
                              L6: {
                                if (var7 >= var6) {
                                  break L6;
                                } else {
                                  var8 = var4[var5][var7];
                                  stackOut_9_0 = param0.a(var8, "", 23158);
                                  stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                                  stackIn_10_0 = stackOut_9_0;
                                  if (var10 != 0) {
                                    continue L2;
                                  } else {
                                    L7: {
                                      if (!stackIn_10_0) {
                                        tk.field_c[var5][var7] = new vk(var8);
                                        break L7;
                                      } else {
                                        {
                                          L8: {
                                            tk.field_c[var5][var7] = lm.a(param0.a((byte) 125, var4[var5][var7]), (byte) 121);
                                            break L8;
                                          }
                                        }
                                        break L7;
                                      }
                                    }
                                    var7++;
                                    if (var10 == 0) {
                                      continue L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var5++;
                              if (var10 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_18_0 = -117;
                      stackIn_19_0 = stackOut_18_0;
                      break L3;
                    }
                    int discarded$3 = 0;
                    j.a((byte) stackIn_19_0, ik.a(param0.a((byte) 58, "tutorial.txt")));
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var2;
                stackOut_21_1 = new StringBuilder().append("pg.D(");
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L9;
                } else {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "{...}";
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_25_2 = stackOut_22_2;
                  break L9;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -121 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        jd var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = ig.field_q;
              if (null == var7) {
                break L1;
              } else {
                if (((pg) this).b(param3, (byte) -105, param0, param2, param5)) {
                  L2: {
                    if (!(((pg) this).field_t instanceof c)) {
                      break L2;
                    } else {
                      ((c) (Object) ((pg) this).field_t).a(var7, (byte) 122, (pg) this);
                      ig.field_q = null;
                      if (HoldTheLine.field_D == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!(var7.field_t instanceof c)) {
                    break L1;
                  } else {
                    ((c) (Object) var7.field_t).a(var7, (byte) 113, (pg) this);
                    ig.field_q = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("pg.SA(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static sh a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        sh var6 = null;
        sh stackIn_7_0 = null;
        sh stackIn_10_0 = null;
        sh stackIn_15_0 = null;
        sh stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_14_0 = null;
        sh stackOut_16_0 = null;
        sh stackOut_9_0 = null;
        sh stackOut_6_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param0.substring(0, var2_int);
                    var5 = 0;
                    var4 = param0.substring(var2_int + 1);
                    int discarded$2 = 34;
                    var6 = mm.a(var3);
                    if (var6 != null) {
                      stackOut_14_0 = (sh) var6;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      stackOut_16_0 = cd.a((byte) -118, var4);
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    }
                  } else {
                    stackOut_9_0 = fo.field_k;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
            }
            stackOut_6_0 = tg.field_g;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("pg.G(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -128 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(int param0, gn param1, gn param2, gn param3) {
        byte[] var4 = null;
        bm[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        hj var9 = null;
        int var10_int = 0;
        hj var10 = null;
        hj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hj var15 = null;
        int var16 = 0;
        int[] stackIn_9_0 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_15_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_14_0 = null;
        var16 = HoldTheLine.field_D;
        fb.field_i = param2;
        wj.field_n = param1;
        ef.field_c = param3;
        var4 = ef.field_c.a("", false, "font");
        var5 = oc.a("", fb.field_i, (byte) 32, "font");
        qf.a(0, -1, var4);
        int discarded$47 = 8;
        int discarded$48 = 16777215;
        ni.field_a = ce.a(0, var4, var5, 1);
        qf.a(0, 2, var4);
        int discarded$49 = 8;
        int discarded$50 = 16777215;
        nm.field_c = ce.a(0, var4, var5, 2);
        HoldTheLine.field_F = om.a("font12", ef.field_c, "", 8192, fb.field_i);
        var6 = nm.field_c.field_N[0];
        nm.field_c.field_N = new int[10][];
        nm.field_c.field_N[0] = var6;
        nm.field_c.field_N[1] = mf.a(1, (byte) 102, 14737632, var6);
        nm.field_c.field_N[2] = mf.a(1, (byte) 97, 16724736, var6);
        nm.field_c.field_N[3] = mf.a(8388608, (byte) 118, 16711680, var6);
        nm.field_c.field_N[4] = mf.a(4194304, (byte) 93, 16764672, var6);
        nm.field_c.field_N[5] = mf.a(1, (byte) 121, 16763904, var6);
        var7 = HoldTheLine.field_F.field_N[0];
        HoldTheLine.field_F.field_N = new int[13][];
        HoldTheLine.field_F.field_N[0] = var7;
        HoldTheLine.field_F.field_N[4] = mf.a(1, (byte) 98, 14737632, var7);
        HoldTheLine.field_F.field_N[5] = mf.a(1, (byte) 93, 16724736, var7);
        HoldTheLine.field_F.field_N[2] = mf.a(1, (byte) 109, 16724736, var7);
        HoldTheLine.field_F.field_N[1] = mf.a(1, (byte) 99, 16763904, var7);
        HoldTheLine.field_F.field_N[3] = mf.a(1, (byte) 114, 16777087, var7);
        HoldTheLine.field_F.field_N[6] = mf.a(12632256, (byte) 116, 8421504, var7);
        HoldTheLine.field_F.field_N[7] = mf.a(1, (byte) 123, 8421504, var7);
        HoldTheLine.field_F.field_N[8] = mf.a(1, (byte) 99, 1, var7);
        var8_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (~nc.field_j.length >= ~var8_int) {
                break L2;
              } else {
                nm.field_c.field_N[6 - -var8_int] = mf.a(1, (byte) 103, nc.field_j[var8_int], var6);
                HoldTheLine.field_F.field_N[var8_int + 9] = mf.a(1, (byte) 114, nc.field_j[var8_int], var7);
                var8_int++;
                if (var16 != 0) {
                  break L1;
                } else {
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            im.field_b = dl.a(fb.field_i, "logo", false, "");
            td.field_a = dl.a(fb.field_i, "logo_large", false, "");
            uk.field_a = new hj(im.field_b.field_s, im.field_b.field_y);
            break L1;
          }
          var8_int = im.field_b.field_z.length;
          L3: while (true) {
            L4: {
              L5: {
                if (var8_int <= 0) {
                  break L5;
                } else {
                  var8_int--;
                  stackOut_8_0 = uk.field_a.field_z;
                  stackIn_15_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var16 != 0) {
                    break L4;
                  } else {
                    L6: {
                      stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                      stackOut_9_1 = var8_int;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (im.field_b.field_z[var8_int] == 0) {
                        stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L6;
                      } else {
                        stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L6;
                      }
                    }
                    stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                    if (var16 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              rf.field_ab = dl.a(fb.field_i, "locked", false, "");
              kj.field_q = dl.a(wj.field_n, "basic", false, "locked");
              ra.field_hb = dl.a(fb.field_i, "loading", false, "");
              ai.field_c = dl.a(wj.field_n, "basic", false, "orbcoin");
              hf.field_j = new ah();
              qn.field_m = new bm[14];
              qn.field_m[0] = hc.a("", fb.field_i, -123, "keyboard_space");
              qn.field_m[1] = hc.a("", fb.field_i, -117, "keyboard_esc");
              qn.field_m[2] = hc.a("", fb.field_i, -120, "keyboard_right");
              qn.field_m[3] = hc.a("", fb.field_i, -123, "keyboard_left");
              qn.field_m[4] = hc.a("", fb.field_i, -120, "keyboard_down");
              qn.field_m[5] = hc.a("", fb.field_i, -123, "keyboard_up");
              qn.field_m[6] = hc.a("", fb.field_i, wb.a(30865, -30976), "keyboard_enter");
              qn.field_m[7] = hc.a("", fb.field_i, -118, "keyboard_ctrl");
              qn.field_m[8] = hc.a("", fb.field_i, wb.a(30865, -30951), "keyboard_alt");
              qn.field_m[9] = hc.a("", fb.field_i, -128, "keyboard_tab");
              qn.field_m[10] = hc.a("", fb.field_i, -118, "keyboard_q");
              qn.field_m[11] = hc.a("", fb.field_i, -121, "keyboard_a");
              qn.field_m[12] = hc.a("", fb.field_i, wb.a(30865, -30958), "keyboard_x");
              qn.field_m[13] = hc.a("", fb.field_i, -124, "keyboard_c");
              stackOut_14_0 = new int[qn.field_m.length];
              stackIn_15_0 = stackOut_14_0;
              break L4;
            }
            var8 = stackIn_15_0;
            var9_int = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (qn.field_m.length <= var9_int) {
                    break L9;
                  } else {
                    var8[var9_int] = 13;
                    var9_int++;
                    if (var16 != 0) {
                      break L8;
                    } else {
                      if (var16 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                HoldTheLine.field_F.a((p[]) (Object) qn.field_m, var8);
                ka.field_f = new hj(32, 32);
                vb.a(-114, ka.field_f);
                kj.field_q.c(0, 0, 32, 32);
                ug.b(-1);
                cm.field_d = dl.a(fb.field_i, "flag", false, "");
                kc.field_a = new va("benefits");
                rm.field_A = new uf("mb_template");
                jf.field_a = new uf("mb_buttonframe");
                bo.field_d = new uf("mb_logotext");
                nj.field_i = dl.a(fb.field_i, "menubar", false, "");
                on.field_t = dl.a(fb.field_i, "titlebar", false, "");
                de.field_O = dl.a(fb.field_i, "titlebar_divleft", false, "");
                dc.field_ab = dl.a(fb.field_i, "titlebar_divright", false, "");
                hh.field_e = dl.a(fb.field_i, "courseselect_bar", false, "");
                oi.field_a = new hj(20, 20);
                vb.a(-53, oi.field_a);
                break L8;
              }
              var9_int = 1;
              L10: while (true) {
                L11: {
                  L12: {
                    if (var9_int >= 19) {
                      break L12;
                    } else {
                      var10_int = (2166 + var9_int * 44) / 17;
                      var10_int = var10_int << 16 | (var10_int | var10_int << 8);
                      tc.b(1, var9_int, 18, var10_int);
                      var9_int++;
                      if (var16 != 0) {
                        break L11;
                      } else {
                        if (var16 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var9_int = 2;
                  break L11;
                }
                L13: while (true) {
                  L14: {
                    L15: {
                      if (var9_int >= 18) {
                        break L15;
                      } else {
                        var10_int = (77 * var9_int - 4) / 15;
                        var10_int = var10_int | var10_int << 8 | var10_int << 16;
                        tc.b(2, var9_int, 16, var10_int);
                        var9_int++;
                        if (var16 != 0) {
                          break L14;
                        } else {
                          if (var16 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    tc.a(0, 0, 20, 20, 65793);
                    ug.b(-1);
                    ol.field_i = new uf("win");
                    sm.field_a = new uf("loss");
                    nj.field_c = new uf[4];
                    nj.field_c[0] = new uf("splash_s1");
                    nj.field_c[1] = new uf("splash_s2");
                    nj.field_c[2] = new uf("splash_s3");
                    nj.field_c[3] = new uf("splash_s4");
                    ha.field_o = new uf[3];
                    ha.field_o[0] = new uf("wreath1");
                    ha.field_o[1] = new uf("wreath2");
                    ha.field_o[2] = new uf("wreath3");
                    break L14;
                  }
                  var9 = dl.a(fb.field_i, "frame", false, "");
                  qk.field_E = new hj[9];
                  qk.field_E[0] = fj.a(0, 0, var9, 20, 0, 20);
                  qk.field_E[1] = fj.a(0, 20, var9, 20, 0, 16);
                  qk.field_E[2] = fj.a(0, 36, var9, 20, 0, 20);
                  qk.field_E[3] = fj.a(0, 0, var9, 16, 20, 20);
                  qk.field_E[4] = fj.a(0, 20, var9, 16, 20, 16);
                  qk.field_E[5] = fj.a(0, 36, var9, 16, 20, 20);
                  qk.field_E[6] = fj.a(0, 0, var9, 20, 36, 20);
                  qk.field_E[7] = fj.a(0, 20, var9, 20, 36, 16);
                  qk.field_E[8] = fj.a(0, 36, var9, 20, 36, 20);
                  var10 = dl.a(fb.field_i, "frame_textured", false, "");
                  var11 = dl.a(fb.field_i, "tarmac", false, "");
                  var12 = 14;
                  var13 = -(2 * var12) + var10.field_s;
                  jc.field_h = new hj[9];
                  var14 = var10.field_y - 2 * var12;
                  jc.field_h[0] = fj.a(0, 0, var10, var12, 0, var12);
                  jc.field_h[1] = fj.a(0, var12, var10, var12, 0, var13);
                  jc.field_h[2] = fj.a(0, var12 + var13, var10, var12, 0, var12);
                  jc.field_h[3] = fj.a(0, 0, var10, var14, var12, var12);
                  jc.field_h[4] = var11;
                  jc.field_h[5] = fj.a(0, var13 + var12, var10, var14, var12, var12);
                  jc.field_h[6] = fj.a(wb.a(30865, 30865), 0, var10, var12, var14 + var12, var12);
                  jc.field_h[7] = fj.a(0, var12, var10, var12, var14 - -var12, var13);
                  jc.field_h[8] = fj.a(0, var13 - -var12, var10, var12, var12 + var14, var12);
                  ua.field_b = new va("vehicle_select");
                  oe.field_i = new va("vehicle_select_large");
                  wn.field_f = kb.a("mine", (byte) -53);
                  wb.field_d = hm.a(5499, "missile");
                  ha.field_k = kb.a("powerup_red", (byte) -53);
                  pk.field_O = kb.a("powerup_green", (byte) -53);
                  na.field_q = kb.a("powerup_blue", (byte) -53);
                  cf.field_u = kb.a("powerup_black", (byte) -53);
                  int discarded$51 = 1;
                  ol.field_h = jd.a("s1_background");
                  int discarded$52 = 1;
                  fd.field_e = jd.a("s1_track");
                  int discarded$53 = 1;
                  qb.field_b = jd.a("s1_tree20");
                  int discarded$54 = 1;
                  t.field_i = jd.a("s1_tree30");
                  int discarded$55 = 1;
                  cd.field_d = jd.a("s1_tree40");
                  int discarded$56 = 1;
                  ci.field_k = jd.a("s1_tree50");
                  int discarded$57 = 1;
                  ud.field_o = jd.a("s1_tree80");
                  ub.field_A = ji.a("s1_standempty", (byte) -125);
                  aj.field_c = ji.a("s1_standscattered", (byte) 81);
                  jf.field_c = ji.a("s1_standfull", (byte) 106);
                  ie.field_k = ji.a("s1_ad1", (byte) 97);
                  sj.field_I = ji.a("s1_ad2", (byte) 87);
                  ch.field_u = ji.a("s1_ad3", (byte) 86);
                  int discarded$58 = 1;
                  bl.field_s = jd.a("s1_pa");
                  int discarded$59 = 1;
                  vh.field_i = jd.a("s1_tyreblack");
                  int discarded$60 = 1;
                  ae.field_b = jd.a("s1_tyrewhite");
                  int discarded$61 = 1;
                  ma.field_l = jd.a("s1_tyrered");
                  h.field_b = ji.a("s1_bridge_top", (byte) -57);
                  pd.field_h = ji.a("s1_bridge_side", (byte) -81);
                  int discarded$62 = 1;
                  aj.field_a = jd.a("s1_bridge_support");
                  int discarded$63 = 1;
                  kc.field_b = jd.a("s3_background");
                  int discarded$64 = 1;
                  ug.field_b = jd.a("s3_background2");
                  int discarded$65 = 1;
                  ha.field_i = jd.a("s3_background3");
                  int discarded$66 = 1;
                  om.field_i = jd.a("s3_rock20");
                  int discarded$67 = 1;
                  en.field_e = jd.a("s3_rock30");
                  int discarded$68 = 1;
                  q.field_d = jd.a("s3_rock40");
                  int discarded$69 = 1;
                  co.field_b = jd.a("s3_tree20");
                  int discarded$70 = 1;
                  tf.field_A = jd.a("s3_tree30");
                  int discarded$71 = 1;
                  uk.field_b = jd.a("s3_tree40");
                  int discarded$72 = 1;
                  ac.field_c = jd.a("s3_tree50");
                  int discarded$73 = 1;
                  ri.field_a = jd.a("s3_tree80");
                  ci.field_l = ji.a("s3_igloo", (byte) -76);
                  fj.field_s = ji.a("s3_snowman", (byte) 88);
                  int discarded$74 = 1;
                  lk.field_a = jd.a("s2_background");
                  int discarded$75 = 1;
                  hf.field_h = jd.a("s2_background2");
                  int discarded$76 = 1;
                  a.field_F = jd.a("s2_background3");
                  gh.field_a = ji.a("s2_bones1", (byte) 99);
                  ag.field_r = ji.a("s2_bones2", (byte) -126);
                  int discarded$77 = 1;
                  w.field_a = jd.a("s2_cacti20");
                  int discarded$78 = 1;
                  n.field_r = jd.a("s2_cacti30");
                  int discarded$79 = 1;
                  tf.field_o = jd.a("s2_cacti40");
                  int discarded$80 = 1;
                  aa.field_q = jd.a("s2_tree30");
                  int discarded$81 = 1;
                  kc.field_d = jd.a("s2_tree40");
                  int discarded$82 = 1;
                  nd.field_c = jd.a("s2_tree50");
                  int discarded$83 = 1;
                  int discarded$84 = 105;
                  int discarded$85 = 0;
                  ig.field_t = uk.a("s2_well");
                  int discarded$86 = 1;
                  n.field_j = jd.a("s2_tyre1");
                  int discarded$87 = 1;
                  mo.field_r = jd.a("s2_tyre2");
                  gi.field_J = ji.a("s2_wreckage1", (byte) -116);
                  gk.field_b = ji.a("s2_wreckage2", (byte) 126);
                  int discarded$88 = 1;
                  hg.field_Q = jd.a("s4_background");
                  gn.field_f = ji.a("s4_light1", (byte) -126);
                  ai.field_b = ji.a("s4_light2", (byte) 91);
                  um.field_e = ji.a("s4_crates", (byte) 74);
                  we.field_p = ji.a("s4_drain", (byte) 92);
                  lc.field_c = ji.a("s4_pa", (byte) 88);
                  int discarded$89 = 1;
                  jo.field_a = jd.a("s4_tree20");
                  int discarded$90 = 1;
                  hm.field_b = jd.a("s4_tree30");
                  int discarded$91 = 1;
                  in.field_b = jd.a("s4_tree40");
                  int discarded$92 = 1;
                  ie.field_i = jd.a("s4_tree50");
                  lk.field_c = lb.b("vehicle_f1", (byte) -85);
                  al.field_a = lb.b("vehicle_tourer", (byte) -113);
                  rl.field_K = lb.b("vehicle_dragster", (byte) 125);
                  jg.field_o = lb.b("vehicle_dunebuggy", (byte) -114);
                  md.field_j = lb.b("vehicle_snowcat", (byte) 110);
                  ei.field_a = lb.b("vehicle_snowmobile", (byte) 91);
                  am.field_b = lb.b("vehicle_hatchback", (byte) -90);
                  ud.field_h = lb.b("vehicle_suv", (byte) 72);
                  field_K = hm.a(5499, "booster");
                  jk.field_p = hm.a(5499, "slowdown");
                  la.field_g = ji.a("oilslick", (byte) -98);
                  wi.field_a = new kg("halloween_zombie");
                  tn.field_b = new va("halloween_blood");
                  var15 = j.a((byte) 81, 100, 13487565, 40);
                  mg discarded$93 = new mg(var15, true, false);
                  qk.field_f = new mg(rl.a(-5936, 0, var15, 10, var15), true, false);
                  de.field_Q = sf.a(60, (byte) -108, 8355647);
                  return;
                }
              }
            }
          }
        }
    }

    private pg(int param0, int param1, int param2, int param3, dh param4, tb param5, n param6) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((pg) this).field_B = param6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pg.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static int b(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_28_0 = 0;
        try {
          L0: {
            var4 = param2 >> 31;
            param2 = var4 ^ var4 + param2;
            L1: {
              var4 = param0 >> 31;
              param0 = var4 ^ param0 + var4;
              if (~param0 < ~param2) {
                var4 = param2;
                param2 = param0;
                param0 = var4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = 0;
              if (param2 < 32768) {
                break L2;
              } else {
                L3: {
                  if (param2 < 1073741824) {
                    break L3;
                  } else {
                    var3_int += 16;
                    param2 = param2 >> 16;
                    break L3;
                  }
                }
                L4: {
                  if (param2 >= 4194304) {
                    var3_int += 8;
                    param2 = param2 >> 8;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param2 >= 262144) {
                    var3_int += 4;
                    param2 = param2 >> 4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param2 < 65536) {
                    break L6;
                  } else {
                    param2 = param2 >> 2;
                    var3_int += 2;
                    break L6;
                  }
                }
                L7: {
                  if (param2 >= 32768) {
                    param2 = param2 >> 1;
                    var3_int++;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                param0 = param0 >> var3_int;
                break L2;
              }
            }
            if (~param2 >= ~(param0 << 5)) {
              param2 = param2 * param2 + param0 * param0;
              if (param2 >= 65536) {
                if (param2 < 16777216) {
                  if (param2 >= 1048576) {
                    if (param2 < 4194304) {
                      stackOut_94_0 = lg.field_j[param2 >> 14] >> 5;
                      stackIn_95_0 = stackOut_94_0;
                      break L0;
                    } else {
                      stackOut_92_0 = lg.field_j[param2 >> 16] >> 4;
                      stackIn_93_0 = stackOut_92_0;
                      return stackIn_93_0;
                    }
                  } else {
                    if (param2 < 262144) {
                      stackOut_89_0 = lg.field_j[param2 >> 10] >> 7;
                      stackIn_90_0 = stackOut_89_0;
                      return stackIn_90_0;
                    } else {
                      stackOut_87_0 = lg.field_j[param2 >> 12] >> 6;
                      stackIn_88_0 = stackOut_87_0;
                      return stackIn_88_0;
                    }
                  }
                } else {
                  if (param2 < 268435456) {
                    if (param2 < 67108864) {
                      L8: {
                        if (var3_int < 3) {
                          stackOut_81_0 = lg.field_j[param2 >> 18] >> -var3_int + 3;
                          stackIn_82_0 = stackOut_81_0;
                          break L8;
                        } else {
                          stackOut_79_0 = lg.field_j[param2 >> 18] << var3_int + -3;
                          stackIn_82_0 = stackOut_79_0;
                          break L8;
                        }
                      }
                      return stackIn_82_0;
                    } else {
                      L9: {
                        if (2 <= var3_int) {
                          stackOut_76_0 = lg.field_j[param2 >> 20] << var3_int - 2;
                          stackIn_77_0 = stackOut_76_0;
                          break L9;
                        } else {
                          stackOut_74_0 = lg.field_j[param2 >> 20] >> 2 + -var3_int;
                          stackIn_77_0 = stackOut_74_0;
                          break L9;
                        }
                      }
                      return stackIn_77_0;
                    }
                  } else {
                    if (param2 >= 1073741824) {
                      stackOut_68_0 = lg.field_j[param2 >> 24] << var3_int;
                      stackIn_69_0 = stackOut_68_0;
                      return stackIn_69_0;
                    } else {
                      L10: {
                        if (1 <= var3_int) {
                          stackOut_66_0 = lg.field_j[param2 >> 22] << -1 + var3_int;
                          stackIn_67_0 = stackOut_66_0;
                          break L10;
                        } else {
                          stackOut_64_0 = lg.field_j[param2 >> 22] >> 1 - var3_int;
                          stackIn_67_0 = stackOut_64_0;
                          break L10;
                        }
                      }
                      return stackIn_67_0;
                    }
                  }
                }
              } else {
                if (param2 < 256) {
                  if (0 <= param2) {
                    stackOut_52_0 = lg.field_j[param2] >> 12;
                    stackIn_53_0 = stackOut_52_0;
                    return stackIn_53_0;
                  } else {
                    stackOut_50_0 = -1;
                    stackIn_51_0 = stackOut_50_0;
                    return stackIn_51_0;
                  }
                } else {
                  if (param2 < 4096) {
                    if (1024 <= param2) {
                      stackOut_47_0 = lg.field_j[param2 >> 4] >> 10;
                      stackIn_48_0 = stackOut_47_0;
                      return stackIn_48_0;
                    } else {
                      stackOut_45_0 = lg.field_j[param2 >> 2] >> 11;
                      stackIn_46_0 = stackOut_45_0;
                      return stackIn_46_0;
                    }
                  } else {
                    if (16384 <= param2) {
                      stackOut_42_0 = lg.field_j[param2 >> 8] >> 8;
                      stackIn_43_0 = stackOut_42_0;
                      return stackIn_43_0;
                    } else {
                      stackOut_40_0 = lg.field_j[param2 >> 6] >> 9;
                      stackIn_41_0 = stackOut_40_0;
                      return stackIn_41_0;
                    }
                  }
                }
              }
            } else {
              stackOut_28_0 = param2 << var3_int;
              stackIn_29_0 = stackOut_28_0;
              return stackIn_29_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var3, "pg.B(" + param0 + 44 + 4805 + 44 + param2 + 41);
        }
        return stackIn_95_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Updates will sent to the email address you've given";
        field_F = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_H = "Championship";
    }
}
