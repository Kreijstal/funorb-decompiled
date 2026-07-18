/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends oj {
    int field_J;
    private boolean field_C;
    private int field_F;
    int field_I;
    static String field_D;
    static String field_z;
    static String field_y;
    static String field_A;
    static String field_H;
    int field_G;

    final static void e(byte param0) {
        if (ib.field_j != -fw.field_C) {
            if (250 - fw.field_C == ib.field_j) {
            }
        }
        ib.field_j = ib.field_j + 1;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var6 = 0;
        int var8 = 0;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        jd var16 = null;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_103_0 = 0;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 0;
                var6 = ((qq) this).field_F;
                if (2 != var6) {
                  if (var6 != 3) {
                    if (var6 != 1) {
                      if (var6 != 4) {
                        if (var6 == 0) {
                          if (((qq) this).a((byte) -39, param2, param0, true)) {
                            var4_int = 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          ((qq) this).c((byte) -95);
                          break L1;
                        }
                      } else {
                        if (param2.field_xb.field_Eb[param2.field_xb.field_v * ((qq) this).field_J + ((qq) this).field_I].c(111)) {
                          if (((qq) this).a((byte) -39, param2, param0, true)) {
                            var4_int = 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          ((qq) this).c((byte) -74);
                          break L1;
                        }
                      }
                    } else {
                      L3: {
                        if (((qq) this).field_I > 0) {
                          L4: {
                            L5: {
                              var13 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - 1);
                              if (!param2.field_xb.field_Eb[((qq) this).field_I - (1 - param2.field_xb.field_v * ((qq) this).field_J)].c(-65)) {
                                break L5;
                              } else {
                                if (null == ((qq) this).field_w) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var13 == null) {
                              break L3;
                            } else {
                              if (!param2.field_xb.c(var13.field_O, -16985, ((qq) this).field_G)) {
                                break L3;
                              } else {
                                if (!var13.a(23072)) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          ((qq) this).field_s = ((qq) this).field_s + 1;
                          if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I + -1)) {
                            var4_int = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (~((qq) this).field_I > ~(param2.field_xb.field_v + -1)) {
                          L7: {
                            L8: {
                              var14 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - -1);
                              if (!param2.field_xb.field_Eb[((qq) this).field_I - -1 + param2.field_xb.field_v * ((qq) this).field_J].c(-26)) {
                                break L8;
                              } else {
                                if (((qq) this).field_w == null) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (var14 == null) {
                              break L6;
                            } else {
                              if (!param2.field_xb.c(var14.field_O, -16985, ((qq) this).field_G)) {
                                break L6;
                              } else {
                                if (!var14.a(23072)) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ((qq) this).field_s = ((qq) this).field_s + 1;
                          if (!((qq) this).a(((qq) this).field_J, 15, param2, param0, 1 + ((qq) this).field_I)) {
                            break L6;
                          } else {
                            var4_int = 1;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L9: {
                        if (0 < ((qq) this).field_J) {
                          L10: {
                            L11: {
                              var15 = param2.field_xb.c(-1 + ((qq) this).field_J, true, ((qq) this).field_I);
                              if (!param2.field_xb.field_Eb[(((qq) this).field_J - 1) * param2.field_xb.field_v + ((qq) this).field_I].c(-45)) {
                                break L11;
                              } else {
                                if (((qq) this).field_w == null) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var15 == null) {
                              break L9;
                            } else {
                              if (!param2.field_xb.c(var15.field_O, -16985, ((qq) this).field_G)) {
                                break L9;
                              } else {
                                if (!var15.a(23072)) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          ((qq) this).field_s = ((qq) this).field_s + 1;
                          if (!((qq) this).a(-1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                            break L9;
                          } else {
                            var4_int = 1;
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      L12: {
                        if (~(-1 + param2.field_xb.field_db) >= ~((qq) this).field_J) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              var16 = param2.field_xb.c(((qq) this).field_J + 1, true, ((qq) this).field_I);
                              if (!param2.field_xb.field_Eb[((qq) this).field_I + (1 + ((qq) this).field_J) * param2.field_xb.field_v].c(-44)) {
                                break L14;
                              } else {
                                if (null == ((qq) this).field_w) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (var16 == null) {
                              break L12;
                            } else {
                              if (!param2.field_xb.c(var16.field_O, -16985, ((qq) this).field_G)) {
                                break L12;
                              } else {
                                if (!var16.a(23072)) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          ((qq) this).field_s = ((qq) this).field_s + 1;
                          if (!((qq) this).a(((qq) this).field_J + 1, 15, param2, param0, ((qq) this).field_I)) {
                            break L12;
                          } else {
                            var4_int = 1;
                            break L12;
                          }
                        }
                      }
                      if (((qq) this).field_s <= 1) {
                        ((qq) this).c((byte) -127);
                        break L1;
                      } else {
                        if (((qq) this).a((byte) -39, param2, param0, true)) {
                          var4_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L15: {
                if (((qq) this).field_I > 0) {
                  var9 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - 1);
                  if (var9 == null) {
                    break L15;
                  } else {
                    if (param2.field_xb.c(var9.field_O, -16985, ((qq) this).field_G)) {
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I + -1)) {
                        var4_int = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if (~(param2.field_xb.field_v + -1) >= ~((qq) this).field_I) {
                  break L16;
                } else {
                  var10 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - -1);
                  if (var10 == null) {
                    break L16;
                  } else {
                    if (!param2.field_xb.c(var10.field_O, -16985, ((qq) this).field_G)) {
                      break L16;
                    } else {
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I - -1)) {
                        var4_int = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
              }
              L17: {
                if (((qq) this).field_J > 0) {
                  var11 = param2.field_xb.c(((qq) this).field_J + -1, true, ((qq) this).field_I);
                  if (var11 == null) {
                    break L17;
                  } else {
                    if (param2.field_xb.c(var11.field_O, -16985, ((qq) this).field_G)) {
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (!((qq) this).a(-1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                        break L17;
                      } else {
                        var4_int = 1;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (~((qq) this).field_J <= ~(param2.field_xb.field_db - 1)) {
                  break L18;
                } else {
                  var12 = param2.field_xb.c(1 + ((qq) this).field_J, true, ((qq) this).field_I);
                  if (var12 == null) {
                    break L18;
                  } else {
                    if (!param2.field_xb.c(var12.field_O, -16985, ((qq) this).field_G)) {
                      break L18;
                    } else {
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (((qq) this).a(1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                        var4_int = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              }
              if (1 < ((qq) this).field_s) {
                if (((qq) this).a((byte) -39, param2, param0, true)) {
                  var4_int = 1;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((qq) this).c((byte) -114);
                break L1;
              }
            }
            L19: {
              if (param1 < -84) {
                break L19;
              } else {
                qq.a((byte) -37, 26, -64, -50);
                break L19;
              }
            }
            ((qq) this).a(param2.field_xb, -26661);
            stackOut_103_0 = var4_int;
            stackIn_104_0 = stackOut_103_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var4 = decompiledCaughtException;
            stackOut_105_0 = (RuntimeException) var4;
            stackOut_105_1 = new StringBuilder().append("qq.A(");
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param0 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L20;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L20;
            }
          }
          L21: {
            stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param1).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param2 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L21;
            } else {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L21;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + ')');
        }
        return stackIn_104_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = param0 << 8 | param0;
            var4_int = param0 ^ param0 >> 1;
            var7 = 0;
            L1: while (true) {
              if (4 <= var7) {
                break L0;
              } else {
                var5 = -54 + (bm.field_y[var7][0] + param3) + (var4_int & 15);
                var6 = param2 + (bm.field_y[var7][1] - -(param0 & 7) + -64);
                fe.a(jq.field_G[3], 60 + var5, var6 - -50, jq.field_G[3].field_A >> 1, jq.field_G[3].field_x >> 1);
                var4_int = var4_int >> 1;
                param0 = param0 >> 1;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "qq.T(" + param0 + ',' + -12933 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            wd.field_b = rs.field_n.a(il.field_t[17]) - -20;
            var1_int = rs.field_n.a(il.field_t[18]);
            if (wd.field_b < var1_int) {
                wd.field_b = var1_int;
            }
            if (!(kr.field_G != null)) {
                kr.field_G = new rk();
            }
            kr.field_G.f((byte) 79);
            if (!(kr.field_E != null)) {
                kr.field_E = new dm();
            }
            kr.field_E.i(1);
            kr.field_E.e((byte) 97);
            ts.field_j = bm.field_D;
            for (var2 = 0; var2 < oh.field_G.length; var2++) {
                oh.field_G[var2] = true;
            }
            oh.field_G[37] = false;
            oh.field_G[32] = re.a(0, (byte) -98);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "qq.D(" + 1 + ')');
        }
    }

    public static void d(byte param0) {
        field_A = null;
        field_y = null;
        field_D = null;
        field_H = null;
        field_z = null;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((qq) this).field_C) {
              return;
            } else {
              L1: {
                ((qq) this).field_C = true;
                var3_int = ((qq) this).field_F;
                if (var3_int != 0) {
                  if (var3_int == 1) {
                    param0.a((byte) 34, ((qq) this).field_G, ((qq) this).field_J, ((qq) this).field_I - -1);
                    param0.a((byte) 30, ((qq) this).field_G, ((qq) this).field_J, -1 + ((qq) this).field_I);
                    param0.a((byte) 61, ((qq) this).field_G, ((qq) this).field_J + 1, ((qq) this).field_I);
                    param0.a((byte) 35, ((qq) this).field_G, ((qq) this).field_J - 1, ((qq) this).field_I);
                    break L1;
                  } else {
                    if (var3_int != 2) {
                      if (3 == var3_int) {
                        param0.f(((qq) this).field_I - -1, ((qq) this).field_G, 126, ((qq) this).field_J);
                        param0.f(-1 + ((qq) this).field_I, ((qq) this).field_G, param1 + 26785, ((qq) this).field_J);
                        param0.f(((qq) this).field_I, ((qq) this).field_G, 121, ((qq) this).field_J - -1);
                        param0.f(((qq) this).field_I, ((qq) this).field_G, 119, -1 + ((qq) this).field_J);
                        break L1;
                      } else {
                        if (4 == var3_int) {
                          param0.a(-100, param0.field_Eb[param0.field_v * ((qq) this).field_J + ((qq) this).field_I]);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      param0.a(-122, false, ((qq) this).field_I - -1, ((qq) this).field_J, ((qq) this).field_G, 3);
                      param0.a(-125, false, -1 + ((qq) this).field_I, ((qq) this).field_J, ((qq) this).field_G, 3);
                      param0.a(-119, false, ((qq) this).field_I, 1 + ((qq) this).field_J, ((qq) this).field_G, 3);
                      param0.a(-128, false, ((qq) this).field_I, -1 + ((qq) this).field_J, ((qq) this).field_G, 3);
                      break L1;
                    }
                  }
                } else {
                  param0.c(((qq) this).field_J, ((qq) this).field_I, ((qq) this).field_G, (byte) -115);
                  break L1;
                }
              }
              L2: {
                if (param1 == -26661) {
                  break L2;
                } else {
                  var5 = null;
                  boolean discarded$1 = ((qq) this).a((at) null, (byte) -124, (ic) null);
                  break L2;
                }
              }
              L3: {
                L4: {
                  if (2 == ((qq) this).field_F) {
                    break L4;
                  } else {
                    if (3 == ((qq) this).field_F) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                param0.e(14, ((qq) this).field_I - -1, ((qq) this).field_G, ((qq) this).field_J);
                param0.e(14, -1 + ((qq) this).field_I, ((qq) this).field_G, ((qq) this).field_J);
                param0.e(14, ((qq) this).field_I, ((qq) this).field_G, 1 + ((qq) this).field_J);
                param0.e(param1 + 26675, ((qq) this).field_I, ((qq) this).field_G, -1 + ((qq) this).field_J);
                break L3;
              }
              fl.a(param0, -111);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("qq.G(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (nw.g(98)) {
            return;
        }
        bv var4 = vl.field_n;
        var4.h(32161, 16);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(param0 ^ 7, 0);
        var4.b(true, param1);
        var4.b(1, param2);
        var4.b(true, param3);
        if (param0 != 6) {
            qq.a(-60, -103, 22, 28, -21);
        }
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              qn.e(param1, param4, 1 + param0, 10000536);
              qn.e(param1, param4 - -param2, param0 - -1, 12105912);
              var5_int = 1;
              if (qn.field_a > var5_int + param4) {
                var5_int = -param4 + qn.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (qn.field_f < var6 + param4) {
                var6 = qn.field_f - param4;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            var8 = 125 / ((param3 - 27) / 51);
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var9 = 152 - -(var7 * 48 / param2);
                var10 = var9 << 16 | var9 << 8 | var9;
                qn.field_d[(var7 + param4) * qn.field_l + param1] = var10;
                qn.field_d[qn.field_l * (param4 - -var7) + (param1 - -param0)] = var10;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "qq.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        int var4_int = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = -2 / ((53 - param0) / 51);
          if (!param1) {
            break L0;
          } else {
            System.out.println("State change event debug");
            System.out.println("At " + ((qq) this).field_I + "," + ((qq) this).field_J);
            System.out.println("Player" + ((qq) this).field_G);
            var4_int = ((qq) this).field_F;
            if (var4_int != 0) {
              if (var4_int == 1) {
                System.out.println("Raise");
                break L0;
              } else {
                if (var4_int == 2) {
                  System.out.println("Heal");
                  break L0;
                } else {
                  if (var4_int != 3) {
                    if (var4_int == 4) {
                      System.out.println("Bury");
                      break L0;
                    } else {
                      var4 = "EventStateChange: pos: (" + ((qq) this).field_I + "," + ((qq) this).field_J + "), type: " + ((qq) this).field_F + ", player: " + ((qq) this).field_G;
                      return var4;
                    }
                  } else {
                    System.out.println("Pump");
                    break L0;
                  }
                }
              }
            } else {
              System.out.println("Capture");
              break L0;
            }
          }
        }
        var4 = "EventStateChange: pos: (" + ((qq) this).field_I + "," + ((qq) this).field_J + "), type: " + ((qq) this).field_F + ", player: " + ((qq) this).field_G;
        return var4;
    }

    qq(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          ((qq) this).field_G = param3;
          ((qq) this).field_F = param0;
          ((qq) this).field_I = param1;
          ((qq) this).field_J = param2;
          ((qq) this).field_m = -1;
          var5 = ((qq) this).field_F;
          if (var5 == 0) {
            ((qq) this).field_m = 3;
            break L0;
          } else {
            if (1 == var5) {
              ((qq) this).field_m = 16;
              break L0;
            } else {
              if (var5 == 2) {
                ((qq) this).field_m = 12;
                break L0;
              } else {
                if (var5 == 3) {
                  ((qq) this).field_m = 14;
                  break L0;
                } else {
                  if (var5 != 4) {
                    break L0;
                  } else {
                    ((qq) this).field_m = 17;
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(kl param0, kl param1, kl param2, int param3, boolean param4) {
        se.field_g = cr.a("", 4210752);
        se.field_g.a(false, true);
        try {
            kr.a(param2, false, param1, param0);
            da.b(-2);
            oh.field_L = nb.field_i;
            mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "qq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 0 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Invalid date";
        field_y = "Skip";
        field_A = "Empty";
        field_H = "Most honourable";
        field_D = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
