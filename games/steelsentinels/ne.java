/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends kd {
    int field_O;
    private int field_C;
    private boolean field_Q;
    int field_z;
    private mb[] field_A;
    static String field_J;
    private wk field_P;
    private int field_D;
    static gi field_y;
    int field_S;
    private boolean field_U;
    int field_K;
    boolean field_E;
    static vk field_N;
    int field_F;
    private ee field_B;
    mb field_T;
    int field_I;
    static gk[] field_R;
    private boolean field_L;
    static String field_H;
    static int[] field_G;
    private int field_M;

    final static int[] a(int param0, byte param1) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_6_0 = null;
        int[] stackIn_36_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_35_0 = null;
        Object stackOut_5_0 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_array = nl.a(param0, (byte) 124);
              if (null == var2_array) {
                break L1;
              } else {
                if (var2_array.length != 0) {
                  var3 = new int[-9 + var2_array.length];
                  ii.a(var2_array, 1, var3, 0, var3.length);
                  var4 = 0;
                  var5_int = 0;
                  L2: while (true) {
                    if (var3.length <= var5_int) {
                      L3: {
                        if (param1 == 28) {
                          break L3;
                        } else {
                          ne.g(61);
                          break L3;
                        }
                      }
                      var5 = new int[var4];
                      var4 = 0;
                      var6 = 0;
                      L4: while (true) {
                        if (~var3.length >= ~var6) {
                          stackOut_35_0 = (int[]) var5;
                          stackIn_36_0 = stackOut_35_0;
                          break L0;
                        } else {
                          L5: {
                            if (var3[var6] == -1) {
                              break L5;
                            } else {
                              int incrementValue$1 = var4;
                              var4++;
                              var5[incrementValue$1] = var3[var6];
                              break L5;
                            }
                          }
                          var6++;
                          continue L4;
                        }
                      }
                    } else {
                      L6: {
                        if (0 > qg.a((byte) -60, var3[var5_int])) {
                          break L6;
                        } else {
                          var3[var5_int] = -1;
                          break L6;
                        }
                      }
                      L7: {
                        if (0 <= var3[var5_int]) {
                          var4++;
                          var6 = 1 + var5_int;
                          L8: while (true) {
                            if (~var6 <= ~var3.length) {
                              break L7;
                            } else {
                              L9: {
                                if (var3[var5_int] != var3[var6]) {
                                  break L9;
                                } else {
                                  var3[var6] = -1;
                                  break L9;
                                }
                              }
                              var6++;
                              continue L8;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      var5_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            return (int[]) (Object) stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ne.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    private final void a(mb param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        String stackIn_187_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_183_0 = null;
        StringBuilder stackOut_183_1 = null;
        RuntimeException stackOut_186_0 = null;
        StringBuilder stackOut_186_1 = null;
        String stackOut_186_2 = null;
        RuntimeException stackOut_184_0 = null;
        StringBuilder stackOut_184_1 = null;
        String stackOut_184_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ((ne) this).field_T = param0;
              if (((ne) this).field_Q) {
                break L1;
              } else {
                if (((ne) this).field_T.field_rc != -1) {
                  nh.a(true, ((ne) this).field_T);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (43 == ((ne) this).field_O) {
                break L2;
              } else {
                ((ne) this).field_T.field_tb = ((ne) this).field_T.field_tb + 1;
                break L2;
              }
            }
            L3: {
              if (!((ne) this).field_Q) {
                param0.field_rc = ((ne) this).field_O;
                param0.field_xb = ((ne) this).field_E;
                param0.field_v = ((ne) this).field_F;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              param0.field_F = -Math.abs(param0.field_F);
              var3_int = ((ne) this).field_O;
              if (var3_int != 10) {
                if (11 != var3_int) {
                  if (12 == var3_int) {
                    param0.field_Q = param0.field_Q + 300;
                    param0.field_S = param0.field_Q;
                    break L4;
                  } else {
                    if (var3_int != 13) {
                      if (14 != var3_int) {
                        if (var3_int != 0) {
                          if (var3_int == 1) {
                            param0.field_wb = param0.field_wb + 2;
                            break L4;
                          } else {
                            if (var3_int != 2) {
                              if (3 == var3_int) {
                                param0.field_wb = param0.field_wb + 4;
                                break L4;
                              } else {
                                if (var3_int == 4) {
                                  param0.field_wb = param0.field_wb + 5;
                                  break L4;
                                } else {
                                  if (var3_int == 20) {
                                    param0.field_wb = param0.field_wb + 10;
                                    break L4;
                                  } else {
                                    L5: {
                                      if (5 != var3_int) {
                                        if (6 == var3_int) {
                                          break L5;
                                        } else {
                                          if (7 != var3_int) {
                                            if (var3_int != 8) {
                                              if (var3_int == 9) {
                                                break L5;
                                              } else {
                                                if (var3_int != 29) {
                                                  if (28 == var3_int) {
                                                    param0.field_Fb = param0.field_Fb * 2;
                                                    break L4;
                                                  } else {
                                                    if (var3_int != 15) {
                                                      if (var3_int != 36) {
                                                        if (var3_int != 43) {
                                                          if (var3_int == 44) {
                                                            param0.a((byte) -65);
                                                            break L4;
                                                          } else {
                                                            if (var3_int != 45) {
                                                              break L4;
                                                            } else {
                                                              ((ne) this).field_B.field_M = ((ne) this).field_B.field_M + 1;
                                                              ((ne) this).field_B.field_N = ((ne) this).field_B.field_N - 22;
                                                              ((ne) this).field_B.field_f = ((ne) this).field_B.field_f + 10;
                                                              break L4;
                                                            }
                                                          }
                                                        } else {
                                                          param0.field_Cb = true;
                                                          break L4;
                                                        }
                                                      } else {
                                                        ((ne) this).field_B.field_q = ((ne) this).field_B.field_q + 6000000;
                                                        param0.field_Eb = param0.field_Eb + 100;
                                                        param0.e(-20039);
                                                        break L4;
                                                      }
                                                    } else {
                                                      var3_int = param0.field_Tb;
                                                      param0.field_Tb = 10;
                                                      param0.b((byte) -31, (je) null);
                                                      param0.field_Tb = var3_int;
                                                      break L4;
                                                    }
                                                  }
                                                } else {
                                                  param0.field_cb = param0.field_cb * 2;
                                                  break L4;
                                                }
                                              }
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    param0.field_x = param0.field_x + ag.a(111, ((ne) this).field_O);
                                    param0.g(5);
                                    break L4;
                                  }
                                }
                              }
                            } else {
                              param0.field_wb = param0.field_wb + 3;
                              break L4;
                            }
                          }
                        } else {
                          param0.field_wb = param0.field_wb + 1;
                          break L4;
                        }
                      } else {
                        param0.field_Q = param0.field_Q + 500;
                        param0.field_S = param0.field_Q;
                        break L4;
                      }
                    } else {
                      param0.field_Q = param0.field_Q + 400;
                      param0.field_S = param0.field_Q;
                      break L4;
                    }
                  }
                } else {
                  param0.field_Q = param0.field_Q + 200;
                  param0.field_S = param0.field_Q;
                  break L4;
                }
              } else {
                param0.field_Q = param0.field_Q + 100;
                param0.field_S = param0.field_Q;
                break L4;
              }
            }
            L6: {
              var3_int = -13;
              if (param0.field_Bb == ed.field_j) {
                g.field_h = ((ne) this).field_O;
                pd.field_X = 0;
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_183_0 = (RuntimeException) var3;
            stackOut_183_1 = new StringBuilder().append("ne.E(");
            stackIn_186_0 = stackOut_183_0;
            stackIn_186_1 = stackOut_183_1;
            stackIn_184_0 = stackOut_183_0;
            stackIn_184_1 = stackOut_183_1;
            if (param0 == null) {
              stackOut_186_0 = (RuntimeException) (Object) stackIn_186_0;
              stackOut_186_1 = (StringBuilder) (Object) stackIn_186_1;
              stackOut_186_2 = "null";
              stackIn_187_0 = stackOut_186_0;
              stackIn_187_1 = stackOut_186_1;
              stackIn_187_2 = stackOut_186_2;
              break L7;
            } else {
              stackOut_184_0 = (RuntimeException) (Object) stackIn_184_0;
              stackOut_184_1 = (StringBuilder) (Object) stackIn_184_1;
              stackOut_184_2 = "{...}";
              stackIn_187_0 = stackOut_184_0;
              stackIn_187_1 = stackOut_184_1;
              stackIn_187_2 = stackOut_184_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_187_0, stackIn_187_2 + ',' + -86 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mb[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        double var8_double = 0.0;
        int var9 = 0;
        int var10_int = 0;
        mb var10 = null;
        double var10_double = 0.0;
        int var11 = 0;
        qb var12_ref_qb = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            ((ne) this).field_K = ((ne) this).field_K - 1;
            if (((ne) this).field_K > 0) {
              if (null == ((ne) this).field_T) {
                L1: {
                  if (((ne) this).field_P != null) {
                    var2_int = ((ne) this).field_P.field_E.length;
                    var6 = 0;
                    L2: while (true) {
                      if (~var6 <= ~var2_int) {
                        var6 = 0;
                        L3: while (true) {
                          if (2 <= var6) {
                            break L1;
                          } else {
                            L4: {
                              ((ne) this).field_C = ((ne) this).field_C + 1;
                              if (~var2_int < ~((ne) this).field_C) {
                                break L4;
                              } else {
                                ((ne) this).field_C = 0;
                                break L4;
                              }
                            }
                            L5: {
                              ((ne) this).field_P.field_E[((ne) this).field_C] = nc.a(((ne) this).field_O, (byte) -114).field_o[nc.a(((ne) this).field_O, (byte) -113).field_p[((ne) this).field_C]];
                              if (((ne) this).field_P.field_E[((ne) this).field_C] == 0) {
                                var6--;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var6++;
                            continue L3;
                          }
                        }
                      } else {
                        L6: {
                          var4 = 255 & ((ne) this).field_P.field_E[var6] >> 8;
                          var5 = ((ne) this).field_P.field_E[var6] & 255;
                          var3 = (16711680 & ((ne) this).field_P.field_E[var6]) >> 16;
                          if (!((ne) this).field_Q) {
                            L7: {
                              if (var5 <= 0) {
                                break L7;
                              } else {
                                if ((((ne) this).field_K & 1) != 0) {
                                  break L7;
                                } else {
                                  var5--;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var3 > 0) {
                                var3--;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (var4 <= 0) {
                              break L6;
                            } else {
                              var4--;
                              break L6;
                            }
                          } else {
                            L9: {
                              if (var4 > 0) {
                                var4--;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (var3 <= 0) {
                                break L10;
                              } else {
                                if ((((ne) this).field_K & 3) != 0) {
                                  var3--;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (0 >= var5) {
                              break L6;
                            } else {
                              if ((((ne) this).field_K & 3) != 0) {
                                var5--;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L11: {
                          ((ne) this).field_P.field_E[var6] = var5 + ((var4 << 8) + (var3 << 16));
                          if (!((ne) this).field_L) {
                            break L11;
                          } else {
                            if (0 != ((ne) this).field_P.field_E[var6]) {
                              ((ne) this).field_P.field_E[var6] = ec.a(~((ne) this).field_P.field_E[var6], 16777215);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L12: {
                  var2_int = -((ne) this).field_B.field_ab.a((byte) -99, ((ne) this).field_z >> 4) << 4;
                  var3 = -((ne) this).field_B.field_ab.a(false, ((ne) this).field_z >> 4) << 4;
                  var4 = -((ne) this).field_B.field_ab.b((byte) 121, ((ne) this).field_z >> 4) << 4;
                  var5 = var2_int;
                  if (~var3 == ~var4) {
                    break L12;
                  } else {
                    if (~((ne) this).field_I > ~var4) {
                      var5 = var3;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (~((ne) this).field_I > ~var5) {
                    stackOut_78_0 = 0;
                    stackIn_79_0 = stackOut_78_0;
                    break L13;
                  } else {
                    stackOut_76_0 = 1;
                    stackIn_79_0 = stackOut_76_0;
                    break L13;
                  }
                }
                L14: {
                  var6 = stackIn_79_0;
                  if (4 != ((ne) this).field_B.field_ab.b(114)) {
                    break L14;
                  } else {
                    if (((ne) this).field_I >= 0) {
                      ((ne) this).field_B.field_J.a((byte) 114, (kd) this);
                      return;
                    } else {
                      break L14;
                    }
                  }
                }
                L15: {
                  if (var6 != 0) {
                    break L15;
                  } else {
                    L16: {
                      ((ne) this).field_S = ((ne) this).field_S + ((ne) this).field_B.field_z;
                      if (((ne) this).field_U) {
                        ((ne) this).field_S = ((ne) this).field_S - 3 * ((ne) this).field_B.field_z / 4;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    ((ne) this).field_I = ((ne) this).field_I + ((ne) this).field_S;
                    if (~var5 >= ~((ne) this).field_I) {
                      var6 = 1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if (var6 != 0) {
                    ((ne) this).field_S = 0;
                    ((ne) this).field_U = false;
                    ((ne) this).field_I = var5;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (((ne) this).field_B.field_ab.b(106) != 3) {
                    break L18;
                  } else {
                    if (((ne) this).field_L) {
                      break L18;
                    } else {
                      var7_int = ((ne) this).field_B.field_ab.a(-116) >> 1;
                      var8 = 600;
                      var9 = 5120;
                      var10_int = -var7_int + (((ne) this).field_z >> 4);
                      var11 = (((ne) this).field_I >> 4) + -var8;
                      if (~(var9 * var9) >= ~(var11 * var11 + var10_int * var10_int)) {
                        break L18;
                      } else {
                        ((ne) this).field_L = true;
                        break L18;
                      }
                    }
                  }
                }
                L19: {
                  if (((ne) this).field_L) {
                    ((ne) this).field_K = Math.min(500, -1 + ((ne) this).field_K);
                    ((ne) this).field_S = Math.min(((ne) this).field_S, 50);
                    if (((ne) this).field_B.field_h) {
                      break L19;
                    } else {
                      var7_int = 0;
                      L20: while (true) {
                        if (2 <= var7_int) {
                          break L19;
                        } else {
                          var8_double = Math.random() * 6.283185307179586;
                          var10_double = Math.random() * 512.0;
                          var12_ref_qb = nk.a(8, (int)(Math.sin(var8_double) * var10_double), ((ne) this).field_B, 90, ((ne) this).field_I, false, 250, (int)((double)(((ne) this).field_S - -10) - Math.abs(Math.cos(var8_double)) * var10_double), ((ne) this).field_z, ((ne) this).field_z);
                          ((ne) this).field_B.field_O.a(3, (ck) (Object) var12_ref_qb);
                          var7_int++;
                          continue L20;
                        }
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                ((ne) this).field_z = Math.max(0, Math.min(-128 + (((ne) this).field_B.field_ab.a(106) << 4), ((ne) this).field_z));
                var8 = 9 % ((param0 - -25) / 39);
                var7 = ((ne) this).field_A;
                var9 = 0;
                L21: while (true) {
                  L22: {
                    if (var9 >= var7.length) {
                      break L22;
                    } else {
                      var10 = var7[var9];
                      if (var10 != null) {
                        L23: {
                          if (var10.field_V) {
                            break L23;
                          } else {
                            if (var10.field_Hb) {
                              break L23;
                            } else {
                              var11 = var10.field_Ub << 3;
                              var12 = var10.field_Db << 4;
                              if (var10.field_hc + var11 < ((ne) this).field_z - ((ne) this).field_M / 2) {
                                break L23;
                              } else {
                                if (((ne) this).field_z - -(((ne) this).field_M / 2) <= var10.field_hc - var11) {
                                  break L23;
                                } else {
                                  if (~(((ne) this).field_I - ((ne) this).field_D) < ~var10.field_Gb) {
                                    break L23;
                                  } else {
                                    if (~(var10.field_Gb + -var12) <= ~((ne) this).field_I) {
                                      break L23;
                                    } else {
                                      int discarded$2 = -86;
                                      this.a(var10);
                                      pc discarded$3 = fc.a((byte) -73, 102, ((ne) this).field_z);
                                      break L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var9++;
                        continue L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ne.D(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_R = null;
        field_J = null;
        if (param0 != -23261) {
            return;
        }
        try {
            field_y = null;
            field_H = null;
            field_N = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ne.B(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (!f.a(param1, 4, false)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var3_int = 56;
              var4 = 0;
              L1: while (true) {
                if (var4 >= param1.length()) {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  if (!im.a(param1.charAt(var4), false)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ne.C(").append(-118).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + false + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        try {
          L0: {
            var5_int = (((ne) this).field_z * param0 >> 16) + param3;
            var6 = param1 - -(((ne) this).field_I * param0 >> 16);
            var7 = ((ne) this).field_P.field_z / 2 - -2;
            var8 = 2 + ((ne) this).field_P.field_B / 2;
            var9 = 3 * (param0 * ((ne) this).field_M >> 16) / 2;
            var10 = (((ne) this).field_D * param0 >> 16) * 3 / 2;
            if (param2 == -1) {
              L1: {
                var11 = Math.min(256, ((ne) this).field_K / 2);
                if (null != sl.field_p) {
                  break L1;
                } else {
                  sl.field_p = new wk(var9, var8 + (var10 + 5));
                  break L1;
                }
              }
              L2: {
                sl.field_p.d();
                pb.a(0, 0, sl.field_p.field_z, sl.field_p.field_B, 0);
                var6 = var6 - (var10 + -5);
                var12 = ((ne) this).field_K / 5 % 3;
                var5_int = var5_int - var9 / 2;
                var13 = 6719624;
                if (((ne) this).field_Q) {
                  var13 = 8921736;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var14 = sl.field_p.field_B - var10;
                  if (!((ne) this).field_L) {
                    break L4;
                  } else {
                    if (Math.random() < 0.1) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var15 = (var9 + -var7) / 2 - (-(((ne) this).field_C % ((ne) this).field_P.field_A / 2) - (((ne) this).field_P.field_D / 2 - -(int)(2.0 * Math.sin((double)((ne) this).field_K * 0.2))));
                  var16 = 2 + (((ne) this).field_P.field_H / 2 + ((ne) this).field_C / (((ne) this).field_P.field_F * 2) + (int)(Math.cos((double)((ne) this).field_K * 0.3) * 2.0));
                  ((ne) this).field_P.b((var9 + -var7) / 2 - -(int)(2.0 * Math.sin(0.2 * (double)((ne) this).field_K)), 2 - -(int)(Math.cos((double)((ne) this).field_K * 0.3) * 2.0));
                  stackOut_13_0 = var9 / 2 - -(int)(Math.sin((double)((ne) this).field_K * 0.1) * 5.0);
                  stackOut_13_1 = var14;
                  stackOut_13_2 = var15;
                  stackOut_13_3 = var16;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  stackIn_16_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (((ne) this).field_Q) {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = stackIn_16_3;
                    stackOut_16_4 = 12264123;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    break L5;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = 12303138;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    stackIn_17_3 = stackOut_14_3;
                    stackIn_17_4 = stackOut_14_4;
                    break L5;
                  }
                }
                L6: {
                  pb.f(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, 192);
                  pb.a(-1 + var15, var16, var13);
                  pb.a(var15, var16 + -1, var13);
                  pb.a(1 + var15, var16, var13);
                  pb.a(var15, var16 + 1, var13);
                  stackOut_17_0 = var15;
                  stackOut_17_1 = var16;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (((ne) this).field_Q) {
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = 16755455;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    break L6;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 11206655;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_21_1 = stackOut_18_1;
                    stackIn_21_2 = stackOut_18_2;
                    break L6;
                  }
                }
                pb.a(stackIn_21_0, stackIn_21_1, stackIn_21_2);
                break L3;
              }
              L7: {
                ml.field_c[var12].b(0, var14, var9, var10);
                if (((ne) this).field_L) {
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                var6 = var6 - var10;
                sb.field_bb.b((byte) 123);
                if (var11 < 256) {
                  sl.field_p.b(var5_int, var6, var11);
                  break L8;
                } else {
                  sl.field_p.a(var5_int, var6);
                  break L8;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ne.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ne(ee param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        gk var4 = null;
        jc var5 = null;
        mb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var7 = SteelSentinels.field_G;
        ((ne) this).field_Q = false;
        ((ne) this).field_S = 0;
        ((ne) this).field_K = 3000;
        ((ne) this).field_F = 1500;
        ((ne) this).field_D = 4096;
        ((ne) this).field_E = true;
        ((ne) this).field_M = 4096;
        ((ne) this).field_L = false;
        try {
          L0: {
            ((ne) this).field_O = param1;
            ((ne) this).field_B = param0;
            var3_int = ((ne) this).field_B.field_kb + ((ne) this).field_B.field_Q;
            ((ne) this).field_A = new mb[var3_int];
            var4_int = 0;
            var5 = new jc(((ne) this).field_B.field_K);
            var6 = (mb) (Object) var5.b(2);
            L1: while (true) {
              if (null == var6) {
                L2: {
                  var4_int = ((ne) this).field_O;
                  if (var4_int == 24) {
                    ((ne) this).field_E = false;
                    ((ne) this).field_F = 2147483647;
                    break L2;
                  } else {
                    L3: {
                      if (var4_int == 36) {
                        break L3;
                      } else {
                        if (var4_int != 15) {
                          if (var4_int == 44) {
                            break L3;
                          } else {
                            if (var4_int == 45) {
                              break L3;
                            } else {
                              if (var4_int == 43) {
                                ((ne) this).field_K = 2147483647;
                                ((ne) this).field_Q = true;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((ne) this).field_Q = true;
                    break L2;
                  }
                }
                L4: {
                  if (!((ne) this).field_Q) {
                    break L4;
                  } else {
                    ((ne) this).field_F = 100;
                    ((ne) this).field_E = false;
                    break L4;
                  }
                }
                L5: {
                  if (!((ne) this).field_B.field_h) {
                    var4 = nc.a(((ne) this).field_O, (byte) -97);
                    ((ne) this).field_P = new wk(var4.field_a, var4.field_i);
                    ((ne) this).field_P.field_H = var4.field_n / 2;
                    ((ne) this).field_P.field_D = var4.field_j / 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var6.field_Bb < 0) {
                    break L6;
                  } else {
                    if (~var3_int >= ~var6.field_Bb) {
                      break L6;
                    } else {
                      int incrementValue$1 = var4_int;
                      var4_int++;
                      ((ne) this).field_A[incrementValue$1] = var6;
                      break L6;
                    }
                  }
                }
                var6 = (mb) (Object) var5.d(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var3;
            stackOut_47_1 = new StringBuilder().append("ne.<init>(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Progress <col=ffffff><%0>%</col>";
        field_y = new gi(256);
        field_H = "Only show game chat from my friends";
    }
}
