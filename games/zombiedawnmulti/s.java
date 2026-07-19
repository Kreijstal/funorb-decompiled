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
        if (param0 > -71) {
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static md a(ga param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        md stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        md stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = 76 / ((param1 - -22) / 54);
            var2_int = param0.h(8, 14862);
            if (-1 <= (var2_int ^ -1)) {
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
                  discarded$1 = param0.h(16, 14862);
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
                          stackOut_13_0 = var6.field_z[var8] & 255;
                          stackOut_13_1 = var7;
                          stackIn_19_0 = stackOut_13_0;
                          stackIn_19_1 = stackOut_13_1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          if (var9 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_14_0 > stackIn_14_1) {
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
                      stackOut_18_0 = var7 ^ -1;
                      stackOut_18_1 = -1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_19_0 == stackIn_19_1) {
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
              stackOut_23_0 = (md) (var6);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("s.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
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
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if ((param4 ^ -1) < -1) {
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
                      if ((var16 ^ -1) >= (var17 ^ -1)) {
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
                      if ((var18 ^ -1) >= (var19 ^ -1)) {
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
                        if ((param2[1].field_z ^ -1) != -1) {
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
                        if (-1 == (param2[3].field_u ^ -1)) {
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
                        if ((param2[5].field_u ^ -1) == -1) {
                          break L21;
                        } else {
                          oo.e(var17, var18, var10, var19);
                          var20 = var14;
                          L22: while (true) {
                            L23: {
                              if ((var20 ^ -1) <= (var15 ^ -1)) {
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
                      L25: {
                        if (null == param2[4]) {
                          break L25;
                        } else {
                          if (param2[4].field_z == 0) {
                            break L25;
                          } else {
                            if (param2[4].field_u != 0) {
                              oo.e(var16, var18, var17, var19);
                              var20 = var14;
                              L26: while (true) {
                                L27: {
                                  if ((var20 ^ -1) <= (var15 ^ -1)) {
                                    break L27;
                                  } else {
                                    if (var22 != 0) {
                                      break L25;
                                    } else {
                                      var21 = var12;
                                      L28: while (true) {
                                        L29: {
                                          L30: {
                                            if (var13 <= var21) {
                                              break L30;
                                            } else {
                                              param2[4].g(var21, var20);
                                              var21 = var21 + param2[4].field_z;
                                              if (var22 != 0) {
                                                break L29;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L28;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          var20 = var20 + param2[4].field_u;
                                          break L29;
                                        }
                                        if (var22 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                }
                                oo.b(qa.field_f);
                                break L25;
                              }
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      break L24;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var6 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) (var6);
            stackOut_83_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param2 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L31;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L31;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static String a(byte param0) {
        if (!(dj.field_k != id.field_B)) {
            return ch.field_j;
        }
        if (param0 != 32) {
            return (String) null;
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
              if ((lb.field_c.length ^ -1) > (param0 ^ -1)) {
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
              if ((param0 ^ -1) >= (vk.field_J.length ^ -1)) {
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
              if ((hn.field_f.length ^ -1) > (param0 ^ -1)) {
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
        field_b = 0;
        field_g = "Retry (<%0> Left)";
        field_d = "They may be nowhere near your zombies, but you'll still be able to reach them...";
        field_f = 0;
        field_h = "Loading extra data";
    }
}
