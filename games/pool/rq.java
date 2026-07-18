/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends kd {
    private int[] field_u;
    private cg field_D;
    private int field_s;
    private vk field_w;
    private int field_I;
    private int field_t;
    private boolean field_A;
    static tg[] field_y;
    private vk field_z;
    static String field_r;
    private int[] field_C;
    private boolean field_G;
    private cg field_v;
    private cg field_E;
    private int field_F;
    private vk field_p;
    private static ko field_q;
    static vh field_x;
    static String[] field_H;
    static int[] field_B;

    final static void c(int param0) {
        if (param0 != 946) {
            return;
        }
        try {
            pj.field_H = new ko();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rq.J(" + param0 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_61_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_118_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if (((rq) this).field_F <= 0) {
              ((rq) this).a(param2);
              return;
            } else {
              L1: {
                if (((rq) this).field_G) {
                  L2: {
                    L3: {
                      if (0 >= ((rq) this).field_s) {
                        break L3;
                      } else {
                        if (!((rq) this).field_z.d(-11414)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (((rq) this).field_s >= 0) {
                      break L1;
                    } else {
                      if (!((rq) this).field_w.d(-11414)) {
                        ((rq) this).field_E = null;
                        ((rq) this).field_s = -((rq) this).field_s;
                        ((rq) this).field_G = false;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((rq) this).field_s = -((rq) this).field_s;
                  ((rq) this).field_D = null;
                  ((rq) this).field_G = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              L4: {
                var4_int = ((rq) this).field_F * (((rq) this).field_t >> 1725067180) / 256;
                var5 = -var4_int + ((rq) this).field_F;
                if (0 != ((rq) this).field_s) {
                  L5: {
                    ((rq) this).field_t = ((rq) this).field_t + param2 * ((rq) this).field_s;
                    if (((rq) this).field_t >= 1048576) {
                      break L5;
                    } else {
                      if (0 < ((rq) this).field_t) {
                        break L4;
                      } else {
                        ((rq) this).field_t = 0;
                        if (!((rq) this).field_G) {
                          ((rq) this).field_s = 0;
                          if (((rq) this).field_A) {
                            break L4;
                          } else {
                            L6: {
                              if (((rq) this).field_D != null) {
                                ((rq) this).field_z.e(-1);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((rq) this).field_D = null;
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((rq) this).field_t = 1048576;
                  if (((rq) this).field_G) {
                    break L4;
                  } else {
                    ((rq) this).field_s = 0;
                    if (!((rq) this).field_A) {
                      L7: {
                        if (((rq) this).field_E != null) {
                          ((rq) this).field_w.e(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((rq) this).field_E = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L8: {
                if (bp.field_r) {
                  stackOut_60_0 = param2 << 1182626785;
                  stackIn_61_0 = stackOut_60_0;
                  break L8;
                } else {
                  stackOut_58_0 = param2;
                  stackIn_61_0 = stackOut_58_0;
                  break L8;
                }
              }
              L9: {
                var6 = stackIn_61_0;
                if (((rq) this).field_I >= 256) {
                  break L9;
                } else {
                  L10: {
                    if (null != ((rq) this).field_D) {
                      break L10;
                    } else {
                      if (null == ((rq) this).field_E) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (256 != var4_int) {
                      break L11;
                    } else {
                      ((rq) this).field_z.a(param0, param1, param2);
                      if (var11 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (var5 == 256) {
                      break L12;
                    } else {
                      L13: {
                        L14: {
                          if (null == ((rq) this).field_u) {
                            break L14;
                          } else {
                            if (~((rq) this).field_u.length > ~var6) {
                              break L14;
                            } else {
                              qn.a(((rq) this).field_u, 0, var6);
                              qn.a(((rq) this).field_C, 0, var6);
                              if (var11 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        ((rq) this).field_C = new int[var6];
                        ((rq) this).field_u = new int[var6];
                        break L13;
                      }
                      L15: {
                        ((rq) this).field_z.a(((rq) this).field_u, 0, param2);
                        ((rq) this).field_w.a(((rq) this).field_C, 0, param2);
                        if (!bp.field_r) {
                          stackOut_90_0 = param1;
                          stackIn_91_0 = stackOut_90_0;
                          break L15;
                        } else {
                          param1 = param1 << 1;
                          stackOut_89_0 = param1 << 1;
                          stackIn_91_0 = stackOut_89_0;
                          break L15;
                        }
                      }
                      var7 = stackIn_91_0;
                      var8 = 0;
                      L16: while (true) {
                        L17: {
                          if (var6 <= var8) {
                            break L17;
                          } else {
                            param0[var8 + var7] = param0[var8 + var7] + (((rq) this).field_C[var8] * var5 + var4_int * ((rq) this).field_u[var8] >> -623326776);
                            var8++;
                            if (var11 != 0) {
                              break L9;
                            } else {
                              if (var11 == 0) {
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  ((rq) this).field_w.a(param0, param1, param2);
                  break L9;
                }
              }
              L18: {
                L19: {
                  if (null == ((rq) this).field_v) {
                    break L19;
                  } else {
                    if (0 != ((rq) this).field_I) {
                      L20: {
                        L21: {
                          L22: {
                            if (null == ((rq) this).field_u) {
                              break L22;
                            } else {
                              if (~var6 >= ~((rq) this).field_u.length) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          ((rq) this).field_u = new int[var6];
                          ((rq) this).field_C = new int[var6];
                          if (var11 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                        qn.a(((rq) this).field_u, 0, var6);
                        break L20;
                      }
                      L23: {
                        ((rq) this).field_p.a(((rq) this).field_u, 0, param2);
                        if (!bp.field_r) {
                          stackOut_117_0 = param1;
                          stackIn_118_0 = stackOut_117_0;
                          break L23;
                        } else {
                          param1 = param1 << 1;
                          stackOut_116_0 = param1 << 1;
                          stackIn_118_0 = stackOut_116_0;
                          break L23;
                        }
                      }
                      var7 = stackIn_118_0;
                      var8 = ((rq) this).field_I * ((rq) this).field_F / 256;
                      var9 = ((rq) this).field_F + -var8;
                      var10 = 0;
                      L24: while (true) {
                        if (~var10 <= ~var6) {
                          break L19;
                        } else {
                          param0[var10 + var7] = var9 * param0[var10 + var7] - -(var8 * ((rq) this).field_u[var10]) >> -1937225080;
                          var10++;
                          if (var11 != 0) {
                            break L18;
                          } else {
                            if (var11 == 0) {
                              continue L24;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                break L18;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) var4;
            stackOut_125_1 = new StringBuilder().append("rq.E(");
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param0 == null) {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L25;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_129_0 = stackOut_126_0;
              stackIn_129_1 = stackOut_126_1;
              stackIn_129_2 = stackOut_126_2;
              break L25;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_129_0, stackIn_129_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static kf a(int param0, nb param1) {
        kf var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        kf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var2 = new kf(param1, (ma) (Object) param1);
            if (param0 >= 93) {
              mp.field_R.b((byte) -108, (ma) (Object) var2);
              wm.field_Xb.b((kd) (Object) param1);
              stackOut_3_0 = (kf) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        uf var2_ref = null;
        String var3 = null;
        int var4 = 0;
        uf stackIn_13_0 = null;
        StringBuilder stackIn_19_0 = null;
        StringBuilder stackIn_21_0 = null;
        StringBuilder stackIn_22_0 = null;
        String stackIn_22_1 = null;
        RuntimeException decompiledCaughtException = null;
        uf stackOut_12_0 = null;
        uf stackOut_10_0 = null;
        StringBuilder stackOut_18_0 = null;
        StringBuilder stackOut_21_0 = null;
        String stackOut_21_1 = null;
        StringBuilder stackOut_19_0 = null;
        String stackOut_19_1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                rq.c(-63);
                break L1;
              }
            }
            L2: {
              if (~ok.field_pb.length >= ~param1) {
                break L2;
              } else {
                if (0L != (1L << param1 & pd.field_i)) {
                  L3: {
                    if (null == ba.field_ub) {
                      stackOut_12_0 = am.field_e;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_10_0 = ba.field_ub;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  var2_ref = stackIn_13_0;
                  if (var2_ref == null) {
                    break L2;
                  } else {
                    L4: {
                      var3 = new String(new char[4]);
                      var4 = param1 / 10;
                      if (0 == (2 & var4)) {
                        break L4;
                      } else {
                        var3 = var3 + "Ctrl ";
                        break L4;
                      }
                    }
                    L5: {
                      if ((1 & var4) == 0) {
                        break L5;
                      } else {
                        var3 = var3 + "Shift ";
                        break L5;
                      }
                    }
                    L6: {
                      stackOut_18_0 = new StringBuilder().append(var3);
                      stackIn_21_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (param1 % 10 < 9) {
                        stackOut_21_0 = (StringBuilder) (Object) stackIn_21_0;
                        stackOut_21_1 = Integer.toString(param1 % 10 + 1);
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L6;
                      } else {
                        stackOut_19_0 = (StringBuilder) (Object) stackIn_19_0;
                        stackOut_19_1 = "0";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        break L6;
                      }
                    }
                    var3 = stackIn_22_1;
                    ij discarded$1 = gj.a(true, 0, var3 + ": " + ok.field_pb[param1][0], ok.field_pb[param1][1]);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "rq.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_H = null;
        field_q = null;
        field_y = null;
        field_r = null;
        if (param0 < 42) {
            return;
        }
        try {
            field_B = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rq.I(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              wg.field_Nb[jh.field_c] = param1;
              ep.field_H[jh.field_c] = jh.field_c;
              kb.field_g[jh.field_c] = param3;
              if (q.field_a >= param3) {
                break L1;
              } else {
                jl.field_c = param3;
                break L1;
              }
            }
            L2: {
              if (gr.field_z > param3) {
                rn.field_d = param3;
                break L2;
              } else {
                break L2;
              }
            }
            ob.field_y[jh.field_c] = param4;
            om.field_s[jh.field_c] = param5;
            gd.field_d[jh.field_c] = param0;
            if (param2) {
              L3: {
                var6_int = param5 + (param4 + param0);
                if (var6_int != 0) {
                  stackOut_12_0 = 1000 * param4 / var6_int;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_13_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_13_0;
                ah.field_c[jh.field_c] = var7;
                if (~var7 <= ~rn.field_d) {
                  break L4;
                } else {
                  rn.field_d = var7;
                  break L4;
                }
              }
              L5: {
                if (~var7 < ~jl.field_c) {
                  jl.field_c = var7;
                  break L5;
                } else {
                  break L5;
                }
              }
              jh.field_c = jh.field_c + 1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var6, "rq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (((rq) this).field_t <= 0) {
                break L1;
              } else {
                if (null == ((rq) this).field_D) {
                  break L1;
                } else {
                  ((rq) this).field_z.a(param0);
                  break L1;
                }
              }
            }
            L2: {
              if (((rq) this).field_t >= 1048576) {
                break L2;
              } else {
                if (null == ((rq) this).field_E) {
                  break L2;
                } else {
                  ((rq) this).field_w.a(param0);
                  break L2;
                }
              }
            }
            L3: {
              if (((rq) this).field_I <= 0) {
                break L3;
              } else {
                if (null == ((rq) this).field_v) {
                  break L3;
                } else {
                  ((rq) this).field_p.a(param0);
                  break L3;
                }
              }
            }
            L4: {
              if (((rq) this).field_G) {
                L5: {
                  L6: {
                    if (((rq) this).field_s <= 0) {
                      break L6;
                    } else {
                      if (!((rq) this).field_z.d(-11414)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (((rq) this).field_s >= 0) {
                    break L4;
                  } else {
                    if (!((rq) this).field_w.d(-11414)) {
                      ((rq) this).field_E = null;
                      ((rq) this).field_s = -((rq) this).field_s;
                      ((rq) this).field_G = false;
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                ((rq) this).field_G = false;
                ((rq) this).field_s = -((rq) this).field_s;
                ((rq) this).field_D = null;
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (((rq) this).field_s != 0) {
                L8: {
                  ((rq) this).field_t = ((rq) this).field_t + param0 * ((rq) this).field_s;
                  if (((rq) this).field_t < 1048576) {
                    break L8;
                  } else {
                    ((rq) this).field_t = 1048576;
                    if (((rq) this).field_G) {
                      break L7;
                    } else {
                      ((rq) this).field_s = 0;
                      if (!((rq) this).field_A) {
                        L9: {
                          if (null == ((rq) this).field_E) {
                            break L9;
                          } else {
                            ((rq) this).field_w.e(-1);
                            break L9;
                          }
                        }
                        ((rq) this).field_E = null;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (((rq) this).field_t > 0) {
                  break L7;
                } else {
                  ((rq) this).field_t = 0;
                  if (!((rq) this).field_G) {
                    ((rq) this).field_s = 0;
                    if (!((rq) this).field_A) {
                      L10: {
                        if (((rq) this).field_D == null) {
                          break L10;
                        } else {
                          ((rq) this).field_z.e(-1);
                          break L10;
                        }
                      }
                      ((rq) this).field_D = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "rq.G(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, boolean param2, double param3, int param4, double[] param5, int[] param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = param4 + -320;
              var9 = param1 - 240;
              var10 = -param3 * (double)((float)param6[6] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[9]) * -param3 + (double)((float)var8_int * ((float)param6[3] * 0.0000152587890625f)) * -param3 / 512.0);
              var12 = (double)(0.0000152587890625f * (float)param6[10]) * -param3 + (double)((float)var8_int * ((float)param6[4] * 0.0000152587890625f)) * -param3 / 512.0 + (double)((float)var9 * ((float)param6[7] * 0.0000152587890625f)) * -param3 / 512.0;
              var14 = -param3 * (double)((float)param6[8] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[11]) * -param3 + (double)((float)var8_int * (0.0000152587890625f * (float)param6[5])) * -param3 / 512.0);
              var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
              var14 = var14 / var16;
              var12 = var12 / var16;
              var10 = var10 / var16;
              var18 = (double)(-param6[2] + param0) / var14;
              if (!param2) {
                break L1;
              } else {
                rq.a((byte) -106, -122);
                break L1;
              }
            }
            L2: {
              param5[0] = ((double)param6[0] + var10 * var18) / 8.0;
              param5[1] = ((double)param6[1] + var12 * var18) / 8.0;
              if (0.0 <= var14) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("rq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param6 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        fr var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        fr var6_ref_fr = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (ld.field_c != 0) {
                L2: {
                  var2_long = rl.a((byte) -94);
                  var4 = ld.field_c;
                  if (u.field_b != 0.0) {
                    var4 = (int)((double)var4 + lc.field_P.nextGaussian() * u.field_b);
                    if (var4 >= 0) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 >= ej.field_j.field_v) {
                    break L3;
                  } else {
                    var5_array = new byte[ej.field_j.field_v];
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        if (~var6 <= ~var5_array.length) {
                          break L5;
                        } else {
                          var5_array[var6] = ej.field_j.field_t[var6];
                          var6++;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var6_ref_fr = new fr((long)var4 + var2_long, ej.field_j.field_v, var5_array);
                      field_q.b((byte) 90, (ma) (Object) var6_ref_fr);
                      ej.field_j.field_v = 0;
                      break L3;
                    }
                  }
                }
                var5 = (fr) (Object) field_q.c((byte) -73);
                if (null == var5) {
                  break L1;
                } else {
                  if (~var5.field_p > ~var2_long) {
                    var5.a((byte) -117);
                    var6 = 0;
                    L6: while (true) {
                      L7: {
                        if (var6 >= var5.field_r) {
                          break L7;
                        } else {
                          ej.field_j.field_t[var6] = var5.field_l[var6];
                          var6++;
                          if (var7 != 0) {
                            break L1;
                          } else {
                            if (var7 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      ej.field_j.field_v = var5.field_r;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L8: {
              if (param0 < -16) {
                break L8;
              } else {
                rq.a((byte) -17, -81);
                break L8;
              }
            }
            de.a(param1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "rq.L(" + param0 + ',' + param1 + ')');
        }
    }

    final kd a() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rq.B()");
        }
        return (kd) (Object) stackIn_1_0;
    }

    final synchronized void b(int param0, int param1) {
        try {
            ((rq) this).field_F = param0;
            if (param1 != 11557) {
                field_H = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rq.M(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int d() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rq.C()");
        }
        return stackIn_1_0;
    }

    final kd b() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rq.D()");
        }
        return (kd) (Object) stackIn_1_0;
    }

    private rq() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rq.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_y = new tg[255];
        field_r = "This is your RuneScape clan if you have one.";
        var0 = 0;
        L0: while (true) {
          if (~var0 <= ~field_y.length) {
            field_B = new int[]{20, 21, 49, 6, 8};
            return;
          } else {
            field_y[var0] = new tg();
            var0++;
            continue L0;
          }
        }
    }
}
