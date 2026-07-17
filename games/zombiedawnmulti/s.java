/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_g;
    static volatile int field_b;
    static ri field_c;
    static String field_a;
    static volatile int field_f;
    static ga field_e;
    static String field_d;
    static String field_h;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_g = null;
        field_h = null;
    }

    final static md a(ga param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        md stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = -76;
            var2_int = param0.h(8, 14862);
            if (var2_int <= 0) {
              L1: {
                var4 = fq.a(-128, param0) ? 1 : 0;
                var5 = fq.a(-86, param0) ? 1 : 0;
                var6 = new md();
                var6.field_n = (short)param0.h(16, 14862);
                var6.field_k = lo.a(16, var6.field_k, param0, (byte) -104);
                var6.field_E = lo.a(16, var6.field_E, param0, (byte) -120);
                var6.field_v = lo.a(16, var6.field_v, param0, (byte) -122);
                var6.field_B = (short)param0.h(16, 14862);
                var6.field_y = lo.a(16, var6.field_y, param0, (byte) -128);
                var6.field_L = lo.a(16, var6.field_L, param0, (byte) -106);
                var6.field_H = lo.a(16, var6.field_H, param0, (byte) -119);
                if (var4 == 0) {
                  break L1;
                } else {
                  var6.field_o = (short)param0.h(16, 14862);
                  var6.field_A = lo.a(16, var6.field_A, param0, (byte) -108);
                  var6.field_p = lo.a(16, var6.field_p, param0, (byte) -103);
                  var6.field_b = lo.a(16, var6.field_b, param0, (byte) -119);
                  var6.field_F = lo.a(16, var6.field_F, param0, (byte) -114);
                  var6.field_K = lo.a(16, var6.field_K, param0, (byte) -103);
                  var6.field_x = lo.a(16, var6.field_x, param0, (byte) -127);
                  break L1;
                }
              }
              L2: {
                if (var5 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param0.h(16, 14862);
                  var6.field_M = lo.a(16, var6.field_M, param0, (byte) -117);
                  var6.field_s = lo.a(16, var6.field_s, param0, (byte) -126);
                  var6.field_g = lo.a(16, var6.field_g, param0, (byte) -128);
                  var6.field_a = lo.a(16, var6.field_a, param0, (byte) -120);
                  var6.field_J = lo.a(16, var6.field_J, param0, (byte) -116);
                  break L2;
                }
              }
              L3: {
                if (fq.a(-99, param0)) {
                  var6.field_c = lo.a(16, var6.field_c, param0, (byte) -100);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!fq.a(-92, param0)) {
                  break L4;
                } else {
                  var6.field_z = dn.a(param0, var6.field_z, (byte) -102, 16);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var6.field_z.length) {
                      if (var7 == 0) {
                        var6.field_z = null;
                        break L4;
                      } else {
                        var6.field_m = (byte)(var7 + 1);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var6.field_z[var8] & 255) > var7) {
                          var7 = 255 & var6.field_z[var8];
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_20_0 = (md) var6;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("s.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -111 + 41);
        }
        return stackIn_21_0;
    }

    final static void a(int param0, int param1, ja[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (param4 > 0) {
                    L2: {
                      if (null != param2[3]) {
                        stackOut_8_0 = param2[3].field_z;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null == param2[5]) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = param2[5].field_z;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null != param2[1]) {
                        stackOut_14_0 = param2[1].field_u;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param2[7] != null) {
                        stackOut_17_0 = param2[7].field_u;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param3 + param5;
                      var11 = param4 + param0;
                      var12 = param3 - -var6_int;
                      var13 = var10 + -var7;
                      var14 = var8 + param0;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = param3 + param5 * var6_int / (var7 + var6_int);
                        var16 = param3 + param5 * var6_int / (var7 + var6_int);
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      oo.a(qa.field_f);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = param0 + param4 * var8 / (var8 + var9);
                        var18 = param0 + param4 * var8 / (var8 + var9);
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param2[param1]) {
                        oo.e(param3, param0, var16, var18);
                        param2[0].g(param3, param0);
                        oo.b(qa.field_f);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param2[2] == null) {
                        break L9;
                      } else {
                        oo.e(var17, param0, var10, var18);
                        param2[2].g(var13, param0);
                        oo.b(qa.field_f);
                        break L9;
                      }
                    }
                    L10: {
                      if (param2[6] != null) {
                        oo.e(param3, var19, var16, var11);
                        param2[6].g(param3, var15);
                        oo.b(qa.field_f);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param2[8] != null) {
                        oo.e(var17, var19, var10, var11);
                        param2[8].g(var13, var15);
                        oo.b(qa.field_f);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param2[1] == null) {
                        break L12;
                      } else {
                        if (param2[1].field_z != 0) {
                          oo.e(var16, param0, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              oo.b(qa.field_f);
                              break L12;
                            } else {
                              param2[1].g(var20, param0);
                              var20 = var20 + param2[1].field_z;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param2[7] == null) {
                        break L14;
                      } else {
                        if (0 != param2[7].field_z) {
                          oo.e(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              oo.b(qa.field_f);
                              break L14;
                            } else {
                              param2[7].g(var20, var15);
                              var20 = var20 + param2[7].field_z;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param2[3]) {
                        break L16;
                      } else {
                        if (param2[3].field_u == 0) {
                          break L16;
                        } else {
                          oo.e(param3, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
                              oo.b(qa.field_f);
                              break L16;
                            } else {
                              param2[3].g(param3, var20);
                              var20 = var20 + param2[3].field_u;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param2[5] == null) {
                        break L18;
                      } else {
                        if (param2[5].field_u == 0) {
                          break L18;
                        } else {
                          oo.e(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              oo.b(qa.field_f);
                              break L18;
                            } else {
                              param2[5].g(var13, var20);
                              var20 = var20 + param2[5].field_u;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param2[4]) {
                        break L20;
                      } else {
                        if (param2[4].field_z == 0) {
                          break L20;
                        } else {
                          if (param2[4].field_u != 0) {
                            oo.e(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var20 >= var15) {
                                oo.b(qa.field_f);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param2[4].field_u;
                                    continue L21;
                                  } else {
                                    param2[4].g(var21, var20);
                                    var21 = var21 + param2[4].field_z;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("s.A(").append(param0).append(44).append(param1).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L23;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L23;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static String a(byte param0) {
        if (!(dj.field_k != id.field_B)) {
            return ch.field_j;
        }
        if (!(dj.field_k != ta.field_hb)) {
            return ih.field_a;
        }
        if (!tg.field_g.d(-107)) {
            return ih.field_a;
        }
        return fa.field_Ib;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        L0: {
          L1: {
            if (ka.field_f == null) {
              break L1;
            } else {
              if (ka.field_f.length < param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ka.field_f = new int[param0 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == lb.field_c) {
              break L3;
            } else {
              if (lb.field_c.length < param0) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          lb.field_c = new int[2 * param0];
          break L2;
        }
        L4: {
          L5: {
            if (null == vk.field_J) {
              break L5;
            } else {
              if (param0 <= vk.field_J.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          vk.field_J = new int[2 * param0];
          break L4;
        }
        L6: {
          L7: {
            if (kj.field_p == null) {
              break L7;
            } else {
              if (param0 > kj.field_p.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          kj.field_p = new int[param0 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (ie.field_ob == null) {
              break L9;
            } else {
              if (ie.field_ob.length < param0) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          ie.field_ob = new int[param0 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (hn.field_f == null) {
              break L11;
            } else {
              if (hn.field_f.length < param0) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          hn.field_f = new int[param0 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (la.field_c == null) {
              break L13;
            } else {
              if (param0 - -param2 <= la.field_c.length) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          la.field_c = new int[2 * (param2 + param0)];
          break L12;
        }
        L14: {
          L15: {
            if (fc.field_c == null) {
              break L15;
            } else {
              if (fc.field_c.length >= param0) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          fc.field_c = new boolean[param0 * 2];
          break L14;
        }
        lj.field_n = 0;
        ba.field_m = -2147483648;
        up.field_d = -2147483648;
        var3 = -105 / ((param1 - 6) / 47);
        ab.field_j = 2147483647;
        mj.field_Ub = 2147483647;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_g = "Retry (<%0> Left)";
        field_d = "They may be nowhere near your zombies, but you'll still be able to reach them...";
        field_f = 0;
        field_h = "Loading extra data";
    }
}
