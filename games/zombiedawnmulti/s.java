/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        if (param0 > -71) {
            return;
        }
        try {
            field_g = null;
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "s.D(" + param0 + ')');
        }
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
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        md stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        md stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = 76 / ((param1 - -22) / 54);
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
                    L6: {
                      L7: {
                        if (var8 >= var6.field_z.length) {
                          break L7;
                        } else {
                          stackOut_17_0 = var6.field_z[var8] & 255;
                          stackOut_17_1 = var7;
                          stackIn_25_0 = stackOut_17_0;
                          stackIn_25_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var9 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_18_0 > stackIn_18_1) {
                                var7 = 255 & var6.field_z[var8];
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var8++;
                            if (var9 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = ~var7;
                      stackOut_24_1 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_25_0 == stackIn_25_1) {
                        break L9;
                      } else {
                        var6.field_m = (byte)(var7 + 1);
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var6.field_z = null;
                    break L4;
                  }
                }
              }
              stackOut_31_0 = (md) var6;
              stackIn_32_0 = stackOut_31_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("s.B(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
        return stackIn_32_0;
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
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != param2) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (param4 > 0) {
                    L2: {
                      if (null != param2[3]) {
                        stackOut_9_0 = param2[3].field_z;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_10_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param2[5]) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param2[5].field_z;
                        stackIn_14_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null != param2[1]) {
                        stackOut_17_0 = param2[1].field_u;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_18_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_18_0;
                      if (param2[7] != null) {
                        stackOut_21_0 = param2[7].field_u;
                        stackIn_22_0 = stackOut_21_0;
                        break L5;
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_22_0 = stackOut_19_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_22_0;
                      var10 = param3 + param5;
                      var11 = param4 + param0;
                      var12 = param3 - -var6_int;
                      var13 = var10 + -var7;
                      var14 = var8 + param0;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (~var16 >= ~var17) {
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
                      if (~var18 >= ~var19) {
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
                            L14: {
                              if (var20 >= var13) {
                                break L14;
                              } else {
                                param2[1].g(var20, param0);
                                var20 = var20 + param2[1].field_z;
                                if (var22 != 0) {
                                  break L12;
                                } else {
                                  if (var22 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            oo.b(qa.field_f);
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L15: {
                      if (param2[7] == null) {
                        break L15;
                      } else {
                        if (0 != param2[7].field_z) {
                          oo.e(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            L17: {
                              if (var20 >= var13) {
                                break L17;
                              } else {
                                param2[7].g(var20, var15);
                                var20 = var20 + param2[7].field_z;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  if (var22 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            oo.b(qa.field_f);
                            break L15;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L18: {
                      if (null == param2[3]) {
                        break L18;
                      } else {
                        if (param2[3].field_u == 0) {
                          break L18;
                        } else {
                          oo.e(param3, var18, var16, var19);
                          var20 = var14;
                          L19: while (true) {
                            L20: {
                              if (var20 >= var15) {
                                break L20;
                              } else {
                                param2[3].g(param3, var20);
                                var20 = var20 + param2[3].field_u;
                                if (var22 != 0) {
                                  break L18;
                                } else {
                                  if (var22 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            oo.b(qa.field_f);
                            break L18;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param2[5] == null) {
                        break L21;
                      } else {
                        if (param2[5].field_u == 0) {
                          break L21;
                        } else {
                          oo.e(var17, var18, var10, var19);
                          var20 = var14;
                          L22: while (true) {
                            L23: {
                              if (~var20 <= ~var15) {
                                break L23;
                              } else {
                                param2[5].g(var13, var20);
                                var20 = var20 + param2[5].field_u;
                                if (var22 != 0) {
                                  break L21;
                                } else {
                                  if (var22 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            oo.b(qa.field_f);
                            break L21;
                          }
                        }
                      }
                    }
                    L24: {
                      if (null == param2[4]) {
                        break L24;
                      } else {
                        if (param2[4].field_z == 0) {
                          break L24;
                        } else {
                          if (param2[4].field_u != 0) {
                            oo.e(var16, var18, var17, var19);
                            var20 = var14;
                            L25: while (true) {
                              L26: {
                                if (~var20 <= ~var15) {
                                  break L26;
                                } else {
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var21 = var12;
                                    L27: while (true) {
                                      L28: {
                                        L29: {
                                          if (var13 <= var21) {
                                            break L29;
                                          } else {
                                            param2[4].g(var21, var20);
                                            var21 = var21 + param2[4].field_z;
                                            if (var22 != 0) {
                                              break L28;
                                            } else {
                                              if (var22 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                        var20 = var20 + param2[4].field_u;
                                        break L28;
                                      }
                                      if (var22 == 0) {
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                              oo.b(qa.field_f);
                              break L24;
                            }
                          } else {
                            break L24;
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
          L30: {
            var6 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var6;
            stackOut_111_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param2 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L30;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L30;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (dj.field_k == id.field_B) {
              stackOut_3_0 = ch.field_j;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 32) {
                if (dj.field_k == ta.field_hb) {
                  stackOut_11_0 = ih.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  if (tg.field_g.d(-107)) {
                    stackOut_16_0 = fa.field_Ib;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_14_0 = ih.field_a;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "s.E(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(int param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (ka.field_f == null) {
                  break L2;
                } else {
                  if (ka.field_f.length < param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ka.field_f = new int[param0 * 2];
              break L1;
            }
            L3: {
              L4: {
                if (null == lb.field_c) {
                  break L4;
                } else {
                  if (~lb.field_c.length > ~param0) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              lb.field_c = new int[2 * param0];
              break L3;
            }
            L5: {
              L6: {
                if (null == vk.field_J) {
                  break L6;
                } else {
                  if (~param0 >= ~vk.field_J.length) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              vk.field_J = new int[2 * param0];
              break L5;
            }
            L7: {
              L8: {
                if (kj.field_p == null) {
                  break L8;
                } else {
                  if (param0 > kj.field_p.length) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              kj.field_p = new int[param0 * 2];
              break L7;
            }
            L9: {
              L10: {
                if (ie.field_ob == null) {
                  break L10;
                } else {
                  if (ie.field_ob.length < param0) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              ie.field_ob = new int[param0 * 2];
              break L9;
            }
            L11: {
              L12: {
                if (hn.field_f == null) {
                  break L12;
                } else {
                  if (~hn.field_f.length > ~param0) {
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
              hn.field_f = new int[param0 * 2];
              break L11;
            }
            L13: {
              L14: {
                if (la.field_c == null) {
                  break L14;
                } else {
                  if (param0 - -param2 <= la.field_c.length) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              la.field_c = new int[2 * (param2 + param0)];
              break L13;
            }
            L15: {
              L16: {
                if (fc.field_c == null) {
                  break L16;
                } else {
                  if (fc.field_c.length >= param0) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              fc.field_c = new boolean[param0 * 2];
              break L15;
            }
            lj.field_n = 0;
            ba.field_m = -2147483648;
            up.field_d = -2147483648;
            var3_int = -105 / ((param1 - 6) / 47);
            ab.field_j = 2147483647;
            mj.field_Ub = 2147483647;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "s.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
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
