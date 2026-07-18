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
        try {
            int var2_int = -119 % ((param0 - 30) / 39);
            ((ca) this).field_rb = 0;
            ((ca) this).field_pb = rb.field_c;
            this.a(((ca) this).field_sb, -29870);
            ((ca) this).field_ub.field_Q = 0;
            ((ca) this).field_sb = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.O(" + param0 + ')');
        }
    }

    private final void a(ce param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                if (null != param0) {
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
            L4: {
              ((ca) this).b(((ca) this).field_ub, (byte) -55);
              ((ca) this).field_sb = null;
              if (param1 == -29870) {
                break L4;
              } else {
                ((ca) this).c((ce) null, (byte) -56);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ca.U(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, String param1, String param2, byte param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        hl var6 = null;
        int var7 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var6 = new hl(param4, param0, param5, param1, param2);
            rb.a(var6, -3);
            var7 = 121 % ((20 - param3) / 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ca.W(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        ck[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        ck[] stackOut_63_0 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = param1 + (param3 + param4);
              var10 = new ck[]{new ck(var9_int, var9_int), new ck(param8, var9_int), new ck(var9_int, var9_int), new ck(var9_int, param8), new ck(64, 64), new ck(var9_int, param8), new ck(var9_int, var9_int), new ck(param8, var9_int), new ck(var9_int, var9_int)};
              var11_ref_ck__ = var10;
              if (!param5) {
                break L1;
              } else {
                field_kb = -21;
                break L1;
              }
            }
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var11_ref_ck__.length <= var12) {
                    break L4;
                  } else {
                    var13 = var11_ref_ck__[var12];
                    stackOut_6_0 = 0;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      var14 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var14 >= var13.field_D.length) {
                              break L7;
                            } else {
                              var13.field_D[var14] = param0;
                              var14++;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var12++;
                          break L6;
                        }
                        if (var15 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              var11 = stackIn_16_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var11 >= param3) {
                      break L10;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_28_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_19_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var9_int <= var12) {
                                break L13;
                              } else {
                                var10[6].field_D[var12 + (var9_int + -var11 - 1) * var9_int] = param2;
                                var10[8].field_D[(-1 + (var9_int + -var11)) * var9_int + var12] = param2;
                                var10[2].field_D[-var11 - 1 - -var9_int + var12 * var9_int] = param2;
                                var10[8].field_D[var12 * var9_int + (-var11 + (-1 + var9_int))] = param2;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                var11 = stackIn_28_0;
                L14: while (true) {
                  stackOut_29_0 = var11;
                  stackOut_29_1 = param3;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_30_0 >= stackIn_30_1) {
                          break L17;
                        } else {
                          stackOut_31_0 = 0;
                          stackIn_41_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_32_0;
                            L18: while (true) {
                              L19: {
                                if (var9_int <= var12) {
                                  break L19;
                                } else {
                                  var10[0].field_D[var12 - -(var9_int * var11)] = param7;
                                  var10[0].field_D[var9_int * var12 + var11] = param7;
                                  stackOut_34_0 = ~(-var11 + var9_int);
                                  stackOut_34_1 = ~var12;
                                  stackIn_30_0 = stackOut_34_0;
                                  stackIn_30_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_35_0 < stackIn_35_1) {
                                        var10[2].field_D[var12 - -(var11 * var9_int)] = param7;
                                        var10[6].field_D[var12 * var9_int + var11] = param7;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L16;
                    }
                    var11 = stackIn_41_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (~param8 >= ~var11) {
                            break L23;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_53_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_44_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (~var12 <= ~param3) {
                                      break L26;
                                    } else {
                                      var10[7].field_D[(-1 + var9_int - var12) * param8 + var11] = param2;
                                      var10[5].field_D[-var12 - (1 + -var9_int - var11 * var9_int)] = param2;
                                      var10[1].field_D[var12 * param8 + var11] = param7;
                                      var10[3].field_D[var9_int * var11 - -var12] = param7;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L22;
                      }
                      var11 = stackIn_53_0;
                      L27: while (true) {
                        L28: {
                          if (param8 >> 949160769 <= var11) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~var12 <= ~param4) {
                                    break L31;
                                  } else {
                                    var10[1].field_D[var11 + param8 * (-1 + -var12 + var9_int)] = param6;
                                    var10[3].field_D[-var12 - (1 + -var9_int - var9_int * var11)] = param6;
                                    var10[7].field_D[var12 * param8 - -var11] = param6;
                                    var10[5].field_D[var12 + var9_int * var11] = param6;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_63_0 = (ck[]) var10;
                        stackIn_64_0 = stackOut_63_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var9, "ca.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    void c(ce param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                ((ca) this).field_sb = param0;
                if (fh.field_e != ((ca) this).field_pb) {
                  break L3;
                } else {
                  ((ca) this).b(((ca) this).field_sb.field_t + 12, ((ca) this).field_tb, ((ca) this).field_sb.field_y + ((ca) this).field_nb + 12, 194);
                  ((ca) this).field_rb = 0;
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (da.field_b == ((ca) this).field_pb) {
                break L2;
              } else {
                ((ca) this).field_pb = da.field_b;
                ((ca) this).field_rb = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ca.T(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static ck[] m(int param0) {
        RuntimeException var1 = null;
        ck[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_25_0 = 0;
        ck[] stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_24_0 = 0;
        ck[] stackOut_25_0 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_array = new ck[ec.field_g];
            var2 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= ec.field_g) {
                    break L3;
                  } else {
                    var3 = hc.field_c[var2] * tm.field_a[var2];
                    var4 = tc.field_Nb[var2];
                    stackOut_3_0 = da.field_d[var2];
                    stackIn_25_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0) {
                              break L6;
                            } else {
                              var5_array = new int[var3];
                              var6_int = 0;
                              L7: while (true) {
                                L8: {
                                  L9: {
                                    if (var3 <= var6_int) {
                                      break L9;
                                    } else {
                                      var5_array[var6_int] = mb.field_d[lb.a(255, (int) var4[var6_int])];
                                      var6_int++;
                                      if (var8 != 0) {
                                        break L8;
                                      } else {
                                        if (var8 == 0) {
                                          continue L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var1_array[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var5_array);
                                  break L8;
                                }
                                if (var8 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5 = pd.field_e[var2];
                          var6 = new int[var3];
                          var7 = 0;
                          L10: while (true) {
                            L11: {
                              if (var3 <= var7) {
                                break L11;
                              } else {
                                var6[var7] = de.b(lb.a((int) var5[var7], 255) << -1019066312, mb.field_d[lb.a((int) var4[var7], 255)]);
                                var7++;
                                if (var8 != 0) {
                                  break L4;
                                } else {
                                  if (var8 == 0) {
                                    continue L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var1_array[var2] = (ck) (Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var6);
                            break L5;
                          }
                        }
                        var2++;
                        break L4;
                      }
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_24_0 = 126;
                stackIn_25_0 = stackOut_24_0;
                break L2;
              }
              oa.a(stackIn_25_0);
              stackOut_25_0 = (ck[]) var1_array;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "ca.P(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    public static void l(int param0) {
        if (param0 <= 72) {
            return;
        }
        try {
            field_wb = null;
            field_ob = null;
            field_qb = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.Q(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
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
            if (super.a(82, param1, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var5_int = 54 % ((param0 - -22) / 49);
                if (((ca) this).field_ub == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 == param1) {
                      boolean discarded$2 = ((ca) this).field_ub.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param1 == 99) {
                    boolean discarded$3 = ((ca) this).field_ub.a(false, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ca.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((ca) this).field_pb) {
                L2: {
                  if (((ca) this).field_pb == rb.field_c) {
                    break L2;
                  } else {
                    ((ca) this).a(108, ((ca) this).field_sb.field_t + 12, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y);
                    this.a(((ca) this).field_sb, -29870);
                    break L2;
                  }
                }
                ((ca) this).field_ub.field_Q = 256;
                ((ca) this).field_pb = null;
                break L1;
              } else {
                break L1;
              }
            }
            super.j(92);
            var2_int = 11 % ((-15 - param0) / 49);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ca.V(" + param0 + ')');
        }
    }

    boolean h(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 15) {
                break L1;
              } else {
                field_kb = -126;
                break L1;
              }
            }
            L2: {
              if (((ca) this).field_pb == null) {
                break L2;
              } else {
                L3: {
                  if (da.field_b == ((ca) this).field_pb) {
                    break L3;
                  } else {
                    if (((ca) this).field_pb != rb.field_c) {
                      break L2;
                    } else {
                      L4: {
                        int fieldTemp$2 = ((ca) this).field_rb + 1;
                        ((ca) this).field_rb = ((ca) this).field_rb + 1;
                        if (fieldTemp$2 == ((ca) this).field_mb) {
                          break L4;
                        } else {
                          ((ca) this).field_ub.field_Q = (((ca) this).field_rb << -1699061016) / ((ca) this).field_mb;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((ca) this).field_ub.field_Q = 256;
                      ((ca) this).field_pb = null;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  int fieldTemp$3 = ((ca) this).field_rb + 1;
                  ((ca) this).field_rb = ((ca) this).field_rb + 1;
                  if (~fieldTemp$3 == ~((ca) this).field_lb) {
                    break L5;
                  } else {
                    ((ca) this).field_ub.field_Q = -((((ca) this).field_rb << 1615067112) / ((ca) this).field_lb) + 256;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                ((ca) this).field_pb = fh.field_e;
                ((ca) this).b(12 + ((ca) this).field_sb.field_t, ((ca) this).field_tb, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y, 194);
                ((ca) this).field_ub.field_Q = 0;
                ((ca) this).field_rb = 0;
                break L2;
              }
            }
            stackOut_28_0 = super.h((byte) 47);
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ca.G(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 - -param1.field_y));
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
        try {
          L0: {
            ((ca) this).field_mb = param3;
            ((ca) this).field_lb = param3;
            ((ca) this).field_nb = param2;
            ((ca) this).field_tb = param4;
            this.a(param1, -29870);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ca.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean f(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 77) {
                break L1;
              } else {
                ((ca) this).field_pb = null;
                break L1;
              }
            }
            ((ca) this).j(-109);
            stackOut_3_0 = super.f((byte) 116);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ca.AA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
