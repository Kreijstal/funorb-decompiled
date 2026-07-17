/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends RuntimeException {
    static String field_b;
    static char[] field_a;
    String field_c;
    Throwable field_d;

    final static void a(int param0, int param1, byte param2, boolean param3, qh param4) {
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
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        byte stackOut_50_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var5_int = ue.a((-param0 + param1) * 3, -715);
              var6 = 3 * param0;
              var7 = var5_int + -10;
              int discarded$2 = 0;
              ea.c();
              if (param4.field_w <= 0) {
                break L1;
              } else {
                if (param4.field_y == null) {
                  break L1;
                } else {
                  int discarded$3 = 28;
                  uf.c();
                  break L1;
                }
              }
            }
            ab.field_c = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param4.field_h >= ~var8) {
                    break L4;
                  } else {
                    var9 = param4.field_A[var8];
                    var10 = param4.field_x[var8];
                    var11 = param4.field_N[var8];
                    stackOut_9_0 = 0;
                    stackIn_51_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0 == 0) {
                            break L6;
                          } else {
                            var12 = nj.field_g[var9];
                            var13 = ra.field_b[var9];
                            var14 = -var12 + nj.field_g[var10];
                            var15 = nj.field_g[var11] - var12;
                            var16 = -var13 + ra.field_b[var10];
                            var17 = -var13 + ra.field_b[var11];
                            if (-(var15 * var16) + var17 * var14 >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var12 = ko.field_v[var9];
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
                        L8: {
                          var13 = ko.field_v[var10];
                          if (-2147483648 != var13) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var14 = ko.field_v[var11];
                          if (var14 != -2147483648) {
                            break L9;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var15 = -var6 + (var14 + var13) + var12;
                          if (var7 >= 0) {
                            stackOut_29_0 = var15 >> var7;
                            stackIn_30_0 = stackOut_29_0;
                            break L10;
                          } else {
                            stackOut_27_0 = var15 << -var7;
                            stackIn_30_0 = stackOut_27_0;
                            break L10;
                          }
                        }
                        var16 = -stackIn_30_0 + (gg.field_a.length + -1);
                        var17 = gg.field_a[var16];
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (0 == var17 >> 4) {
                                break L13;
                              } else {
                                var16--;
                                stackOut_32_0 = ~var16;
                                stackOut_32_1 = -1;
                                stackIn_41_0 = stackOut_32_0;
                                stackIn_41_1 = stackOut_32_1;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                if (var19 != 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (stackIn_33_0 <= stackIn_33_1) {
                                      break L14;
                                    } else {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var17 = gg.field_a[var16];
                                  if (var19 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            stackOut_40_0 = var17;
                            stackOut_40_1 = var16 << 4;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L12;
                          }
                          L15: {
                            var18 = stackIn_41_0 + stackIn_41_1;
                            hf.field_yb[var18] = var8;
                            gg.field_a[var16] = 1 + var17;
                            if (param4.field_w <= 0) {
                              break L15;
                            } else {
                              if (null != param4.field_y) {
                                hk.field_b[param4.field_y[var8]] = hk.field_b[param4.field_y[var8]] + 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          ab.field_c = ab.field_c + 1;
                          break L5;
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
                stackOut_50_0 = param4.field_w;
                stackIn_51_0 = stackOut_50_0;
                break L3;
              }
              L16: {
                L17: {
                  if (stackIn_51_0 <= 0) {
                    break L17;
                  } else {
                    if (param4.field_y == null) {
                      break L17;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (~hk.field_b.length >= ~var9) {
                          break L17;
                        } else {
                          var10 = hk.field_b[var9];
                          hk.field_b[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("b.E(").append(param0).append(44).append(param1).append(44).append(-84).append(44).append(0).append(44);
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param4 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L19;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
        }
    }

    final static long a(int param0) {
        RuntimeException var1 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            if (param0 > 118) {
              stackOut_3_0 = -qm.field_o + kd.c(-2456);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 109L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "b.D(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    public static void b() {
        field_a = null;
        field_b = null;
    }

    final static void a(hl param0, boolean param1, byte param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                n.field_f[0] = bl.field_i.nextInt();
                n.field_f[1] = bl.field_i.nextInt();
                ta.field_c.field_o = 0;
                n.field_f[2] = (int)(o.field_j >> 32);
                n.field_f[3] = (int)o.field_j;
                ta.field_c.a((byte) 63, n.field_f[0]);
                ta.field_c.a((byte) 63, n.field_f[1]);
                ta.field_c.a((byte) 63, n.field_f[2]);
                ta.field_c.a((byte) 63, n.field_f[3]);
                mf.a(-30463, ta.field_c);
                ta.field_c.i(param3, -112);
                param0.a(ta.field_c, (byte) -79);
                ac.field_B.field_o = 0;
                if (!param4) {
                  break L2;
                } else {
                  ac.field_B.a(6, 18);
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ac.field_B.a(6, 16);
              break L1;
            }
            L3: {
              ac.field_B.field_o = ac.field_B.field_o + 2;
              var5_int = ac.field_B.field_o;
              ac.field_B.a((byte) 63, la.field_c);
              ac.field_B.a(58, dn.field_Q);
              var6 = 0;
              if (ld.field_g) {
                var6 = var6 | 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!fa.field_j) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (param1) {
                var6 = var6 | 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (pd.field_E != null) {
                var6 = var6 | 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ac.field_B.a(6, var6);
              var7 = oj.a(m.c(true), (byte) 98);
              if (null == var7) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              ac.field_B.b(var7, (byte) -20);
              if (null != pd.field_E) {
                ac.field_B.a(2, pd.field_E);
                break L8;
              } else {
                break L8;
              }
            }
            of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -114, ta.field_c);
            ac.field_B.b(-var5_int + ac.field_B.field_o, 1);
            op.a(0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5;
            stackOut_32_1 = new StringBuilder().append("b.A(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 44 + -27 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static String a(String param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = "<col=FF0000>" + param0 + "</col>";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("b.B(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -1 + 41);
        }
        return stackIn_4_0;
    }

    b(Throwable param0, String param1) {
        try {
            ((b) this).field_d = param0;
            ((b) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[128];
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
