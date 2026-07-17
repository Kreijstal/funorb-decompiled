/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends t {
    private ef field_ub;
    private int field_nb;
    private int field_tb;
    static int field_vb;
    static ke field_wb;
    private int field_lb;
    private ce field_sb;
    private i field_pb;
    private int field_rb;
    private int field_mb;
    static ck field_qb;
    static int field_kb;
    static String field_ob;

    final void j(byte param0) {
        if (((ca) this).field_pb == da.field_b) {
            return;
        }
        int var2 = -119 % ((param0 - 30) / 39);
        ((ca) this).field_rb = 0;
        ((ca) this).field_pb = rb.field_c;
        this.a(((ca) this).field_sb, -29870);
        ((ca) this).field_ub.field_Q = 0;
        ((ca) this).field_sb = null;
    }

    private final void a(ce param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (((ca) this).field_ub == null) {
                break L1;
              } else {
                ((ca) this).field_ub.b((byte) 111);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  break L3;
                } else {
                  ((ca) this).field_ub = new ef();
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.b(param0.field_y, param0.field_t, 6, ((ca) this).field_nb + 6, -16555);
              ((ca) this).field_ub = new ef(param0);
              break L2;
            }
            ((ca) this).b((ce) (Object) ((ca) this).field_ub, (byte) -55);
            ((ca) this).field_sb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ca.U(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -29870 + 41);
        }
    }

    final static void a(String param0, String param1, String param2, byte param3, int param4, int param5) {
        hl var6 = null;
        try {
            var6 = new hl(param4, param0, param5, param1, param2);
            rb.a(var6, -3);
            int var7 = 121 % ((20 - param3) / 42);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.W(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9 = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_47_0 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var9 = param1 + (param3 + param4);
          var10 = new ck[]{new ck(var9, var9), new ck(param8, var9), new ck(var9, var9), new ck(var9, param8), new ck(64, 64), new ck(var9, param8), new ck(var9, var9), new ck(param8, var9), new ck(var9, var9)};
          var11_ref_ck__ = var10;
          if (!param5) {
            break L0;
          } else {
            field_kb = -21;
            break L0;
          }
        }
        var12 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var11_ref_ck__.length <= var12) {
                break L3;
              } else {
                var13 = var11_ref_ck__[var12];
                stackOut_4_0 = 0;
                stackIn_13_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var15 != 0) {
                  break L2;
                } else {
                  var14 = stackIn_5_0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var14 >= var13.field_D.length) {
                          break L6;
                        } else {
                          var13.field_D[var14] = param0;
                          var14++;
                          if (var15 != 0) {
                            break L5;
                          } else {
                            if (var15 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var12++;
                      break L5;
                    }
                    if (var15 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          }
          var11 = stackIn_13_0;
          L7: while (true) {
            L8: {
              L9: {
                if (var11 >= param3) {
                  break L9;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_24_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 != 0) {
                    break L8;
                  } else {
                    var12 = stackIn_16_0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var9 <= var12) {
                            break L12;
                          } else {
                            var10[6].field_D[var12 + (var9 + -var11 - 1) * var9] = param2;
                            var10[8].field_D[(-1 + (var9 + -var11)) * var9 + var12] = param2;
                            var10[2].field_D[-var11 - 1 - -var9 + var12 * var9] = param2;
                            var10[8].field_D[var12 * var9 + (-var11 + (-1 + var9))] = param2;
                            var12++;
                            if (var15 != 0) {
                              break L11;
                            } else {
                              if (var15 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var11++;
                        break L11;
                      }
                      if (var15 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            }
            var11 = stackIn_24_0;
            L13: while (true) {
              stackOut_25_0 = var11;
              stackOut_25_1 = param3;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              L14: while (true) {
                L15: {
                  L16: {
                    if (stackIn_26_0 >= stackIn_26_1) {
                      break L16;
                    } else {
                      stackOut_27_0 = 0;
                      stackIn_37_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var15 != 0) {
                        break L15;
                      } else {
                        var12 = stackIn_28_0;
                        L17: while (true) {
                          L18: {
                            if (var9 <= var12) {
                              break L18;
                            } else {
                              var10[0].field_D[var12 - -(var9 * var11)] = param7;
                              var10[0].field_D[var9 * var12 + var11] = param7;
                              stackOut_30_0 = ~(-var11 + var9);
                              stackOut_30_1 = ~var12;
                              stackIn_26_0 = stackOut_30_0;
                              stackIn_26_1 = stackOut_30_1;
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              if (var15 != 0) {
                                continue L14;
                              } else {
                                L19: {
                                  if (stackIn_31_0 < stackIn_31_1) {
                                    var10[2].field_D[var12 - -(var11 * var9)] = param7;
                                    var10[6].field_D[var12 * var9 + var11] = param7;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                var12++;
                                if (var15 == 0) {
                                  continue L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          var11++;
                          if (var15 == 0) {
                            continue L13;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = 0;
                  stackIn_37_0 = stackOut_36_0;
                  break L15;
                }
                var11 = stackIn_37_0;
                L20: while (true) {
                  L21: {
                    L22: {
                      if (~param8 >= ~var11) {
                        break L22;
                      } else {
                        stackOut_39_0 = 0;
                        stackIn_48_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var15 != 0) {
                          break L21;
                        } else {
                          var12 = stackIn_40_0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (~var12 <= ~param3) {
                                  break L25;
                                } else {
                                  var10[7].field_D[(-1 + var9 - var12) * param8 + var11] = param2;
                                  var10[5].field_D[-var12 - (1 + -var9 - var11 * var9)] = param2;
                                  var10[1].field_D[var12 * param8 + var11] = param7;
                                  var10[3].field_D[var9 * var11 - -var12] = param7;
                                  var12++;
                                  if (var15 != 0) {
                                    break L24;
                                  } else {
                                    if (var15 == 0) {
                                      continue L23;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              var11++;
                              break L24;
                            }
                            if (var15 == 0) {
                              continue L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L21;
                  }
                  var11 = stackIn_48_0;
                  L26: while (true) {
                    L27: {
                      if (param8 >> 1 <= var11) {
                        break L27;
                      } else {
                        var12 = 0;
                        L28: while (true) {
                          L29: {
                            L30: {
                              if (~var12 <= ~param4) {
                                break L30;
                              } else {
                                var10[1].field_D[var11 + param8 * (-1 + -var12 + var9)] = param6;
                                var10[3].field_D[-var12 - (1 + -var9 - var9 * var11)] = param6;
                                var10[7].field_D[var12 * param8 - -var11] = param6;
                                var10[5].field_D[var12 + var9 * var11] = param6;
                                var12++;
                                if (var15 != 0) {
                                  break L29;
                                } else {
                                  if (var15 == 0) {
                                    continue L28;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L29;
                          }
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    void c(ce param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 >= 10) {
                break L1;
              } else {
                field_kb = -79;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  ((ca) this).field_sb = param0;
                  if (fh.field_e != ((ca) this).field_pb) {
                    break L4;
                  } else {
                    ((ca) this).b(((ca) this).field_sb.field_t + 12, ((ca) this).field_tb, ((ca) this).field_sb.field_y + ((ca) this).field_nb + 12, 194);
                    ((ca) this).field_rb = 0;
                    if (!client.field_A) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (da.field_b == ((ca) this).field_pb) {
                  break L3;
                } else {
                  ((ca) this).field_pb = da.field_b;
                  ((ca) this).field_rb = 0;
                  break L2;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ca.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L5;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final static ck[] m(int param0) {
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_19_0 = 0;
        var8 = client.field_A ? 1 : 0;
        var1 = new ck[ec.field_g];
        var2 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= ec.field_g) {
                break L2;
              } else {
                var3 = hc.field_c[var2] * tm.field_a[var2];
                var19 = tc.field_Nb[var2];
                stackOut_2_0 = da.field_d[var2];
                stackIn_20_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (stackIn_3_0) {
                          break L5;
                        } else {
                          var20 = new int[var3];
                          var16 = var20;
                          var9 = var16;
                          var6_int = 0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (var3 <= var6_int) {
                                  break L8;
                                } else {
                                  var9[var6_int] = mb.field_d[lb.a(255, (int) var19[var6_int])];
                                  var6_int++;
                                  if (var8 != 0) {
                                    break L7;
                                  } else {
                                    if (var8 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var20);
                              break L7;
                            }
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var21 = pd.field_e[var2];
                      var22 = new int[var3];
                      var18 = var22;
                      var14 = var18;
                      var12 = var14;
                      var6 = var12;
                      var7 = 0;
                      L9: while (true) {
                        L10: {
                          if (var3 <= var7) {
                            break L10;
                          } else {
                            var6[var7] = de.b(lb.a((int) var21[var7], 255) << 24, mb.field_d[lb.a((int) var19[var7], 255)]);
                            var7++;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              if (var8 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var1[var2] = (ck) (Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var22);
                        break L4;
                      }
                    }
                    var2++;
                    break L3;
                  }
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_19_0 = 126;
            stackIn_20_0 = stackOut_19_0;
            break L1;
          }
          oa.a(stackIn_20_0);
          return var1;
        }
    }

    public static void l(int param0) {
        if (param0 <= 72) {
            return;
        }
        field_wb = null;
        field_ob = null;
        field_qb = null;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(82, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var5_int = 54 % ((param0 - -22) / 49);
                if (((ca) this).field_ub == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 == param1) {
                      boolean discarded$4 = ((ca) this).field_ub.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param1 == 99) {
                    boolean discarded$5 = ((ca) this).field_ub.a(false, param2);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ca.QA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void j(int param0) {
        if (!(null == ((ca) this).field_pb)) {
            if (((ca) this).field_pb != rb.field_c) {
                ((ca) this).a(108, ((ca) this).field_sb.field_t + 12, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y);
                this.a(((ca) this).field_sb, -29870);
            }
            ((ca) this).field_ub.field_Q = 256;
            ((ca) this).field_pb = null;
        }
        super.j(92);
        int var2 = 11 % ((-15 - param0) / 49);
    }

    boolean h(byte param0) {
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 > 15) {
            break L0;
          } else {
            field_kb = -126;
            break L0;
          }
        }
        L1: {
          if (((ca) this).field_pb == null) {
            break L1;
          } else {
            L2: {
              if (da.field_b == ((ca) this).field_pb) {
                break L2;
              } else {
                if (((ca) this).field_pb != rb.field_c) {
                  break L1;
                } else {
                  L3: {
                    int fieldTemp$4 = ((ca) this).field_rb + 1;
                    ((ca) this).field_rb = ((ca) this).field_rb + 1;
                    if (fieldTemp$4 == ((ca) this).field_mb) {
                      break L3;
                    } else {
                      ((ca) this).field_ub.field_Q = (((ca) this).field_rb << 8) / ((ca) this).field_mb;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((ca) this).field_ub.field_Q = 256;
                  ((ca) this).field_pb = null;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              int fieldTemp$5 = ((ca) this).field_rb + 1;
              ((ca) this).field_rb = ((ca) this).field_rb + 1;
              if (~fieldTemp$5 == ~((ca) this).field_lb) {
                break L4;
              } else {
                ((ca) this).field_ub.field_Q = -((((ca) this).field_rb << 8) / ((ca) this).field_lb) + 256;
                if (var3 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            ((ca) this).field_pb = fh.field_e;
            ((ca) this).b(12 + ((ca) this).field_sb.field_t, ((ca) this).field_tb, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y, 194);
            ((ca) this).field_ub.field_Q = 0;
            ((ca) this).field_rb = 0;
            break L1;
          }
        }
        return super.h((byte) 47);
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 - -param1.field_y));
        try {
            ((ca) this).field_mb = param3;
            ((ca) this).field_lb = param3;
            ((ca) this).field_nb = param2;
            ((ca) this).field_tb = param4;
            this.a(param1, -29870);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 77) {
            ((ca) this).field_pb = null;
        }
        ((ca) this).j(-109);
        return super.f((byte) 116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
