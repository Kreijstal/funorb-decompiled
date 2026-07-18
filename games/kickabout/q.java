/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int[] field_e;
    static String field_f;
    static int field_b;
    private lk[] field_g;
    int field_a;
    static String[] field_h;
    static uo field_d;
    static String field_c;

    final static void a(hd param0, int param1, int param2, int param3, hd param4, byte[] param5, hd param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            rp.field_x = param5;
            dd.field_c = -1L;
            qi.field_p = param8;
            ss.field_j = param5.length;
            hw.field_k = false;
            er.field_h = new byte[(7 + qi.field_p) / 8];
            uv.field_i = null;
            ow.field_b = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11 >= rp.field_x.length) {
                    break L3;
                  } else {
                    var10_int = var10_int + (rp.field_x[var11] & 255);
                    var11++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10_int = (7 + var10_int) / 8;
                rf.field_d = new byte[var10_int];
                break L2;
              }
              L4: {
                if (null == param0.field_jb) {
                  param0.field_jb = new tf();
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                rp.field_B = param0.field_jb;
                rp.field_B.b(22997);
                pq.field_N = new em(param2);
                jm.field_h = 0;
                mi.field_d = -1;
                da.field_o = -1;
                fh.field_b = 0;
                if (param6.field_jb == null) {
                  param6.field_jb = new tf();
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                kq.field_yb = param6.field_jb;
                kq.field_yb.b(22997);
                sr.field_f = new em(param9);
                if (param4.field_jb == null) {
                  param4.field_jb = new tf();
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                lw.field_d = param4.field_jb;
                lw.field_d.b(22997);
                pu.field_Eb = new em(param3);
                mg.field_c = param7;
                vg.field_Ib = 0L;
                if (param1 > 114) {
                  break L7;
                } else {
                  ut[] discarded$1 = q.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var10;
            stackOut_24_1 = new StringBuilder().append("q.C(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param6 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final lk a(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        lk stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 > 55) {
              int fieldTemp$2 = ((q) this).field_a;
              ((q) this).field_a = ((q) this).field_a + 1;
              stackOut_3_0 = ((q) this).field_g[fieldTemp$2];
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "q.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        try {
            field_e = null;
            field_h = null;
            field_c = null;
            field_f = null;
            int var1_int = 73 / ((-20 - param0) / 63);
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "q.B(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              if (((q) this).field_a < ((q) this).field_g.length) {
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
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "q.A(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        ut[] var10 = null;
        ut[] var11_ref_ut__ = null;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_52_0 = null;
        ut[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        ut[] stackOut_63_0 = null;
        Object stackOut_51_0 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var9_int = param1 + (param3 + param0);
            var10 = new ut[]{new ut(var9_int, var9_int), new ut(param4, var9_int), new ut(var9_int, var9_int), new ut(var9_int, param4), new ut(64, 64), new ut(var9_int, param4), new ut(var9_int, var9_int), new ut(param4, var9_int), new ut(var9_int, var9_int)};
            var11_ref_ut__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var12 <= ~var11_ref_ut__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_ut__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var14 <= ~var13.field_y.length) {
                              break L6;
                            } else {
                              var13.field_y[var14] = param6;
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
                    if (param0 <= var11) {
                      break L9;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var15 != 0) {
                        break L8;
                      } else {
                        var12 = stackIn_16_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var12 >= var9_int) {
                                break L12;
                              } else {
                                var10[6].field_y[(-1 + -var11 + var9_int) * var9_int - -var12] = param2;
                                var10[8].field_y[var12 + var9_int * (-var11 + (var9_int + -1))] = param2;
                                var10[2].field_y[var12 * var9_int + (-1 + (var9_int + -var11))] = param2;
                                var10[8].field_y[-var11 - -var9_int - (1 - var12 * var9_int)] = param2;
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
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L8;
                }
                var11 = stackIn_25_0;
                L13: while (true) {
                  stackOut_26_0 = ~param0;
                  stackOut_26_1 = ~var11;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 >= stackIn_27_1) {
                          break L16;
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            var12 = stackIn_29_0;
                            L17: while (true) {
                              L18: {
                                if (var12 >= var9_int) {
                                  break L18;
                                } else {
                                  var10[0].field_y[var12 + var11 * var9_int] = param8;
                                  var10[0].field_y[var9_int * var12 + var11] = param8;
                                  stackOut_31_0 = var9_int + -var11;
                                  stackOut_31_1 = var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 <= stackIn_32_1) {
                                        break L19;
                                      } else {
                                        var10[2].field_y[var11 * var9_int + var12] = param8;
                                        var10[6].field_y[var9_int * var12 + var11] = param8;
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
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~var11 <= ~param4) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var12 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (~var12 <= ~param0) {
                                      break L25;
                                    } else {
                                      var10[7].field_y[param4 * (-var12 + (var9_int + -1)) - -var11] = param2;
                                      var10[5].field_y[-var12 - (-var9_int + 1 - var9_int * var11)] = param2;
                                      var10[1].field_y[var12 * param4 - -var11] = param8;
                                      var10[3].field_y[var11 * var9_int + var12] = param8;
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
                        stackOut_49_0 = param5;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      if (stackIn_50_0 == -1481) {
                        var11 = 0;
                        L26: while (true) {
                          L27: {
                            if (param4 >> 1827069377 <= var11) {
                              break L27;
                            } else {
                              var12 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (var12 >= param1) {
                                      break L30;
                                    } else {
                                      var10[1].field_y[(var9_int + -var12 - 1) * param4 - -var11] = param7;
                                      var10[3].field_y[var9_int + -1 + (-var12 + var9_int * var11)] = param7;
                                      var10[7].field_y[var12 * param4 - -var11] = param7;
                                      var10[5].field_y[var9_int * var11 - -var12] = param7;
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
                          stackOut_63_0 = (ut[]) var10;
                          stackIn_64_0 = stackOut_63_0;
                          break L0;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (ut[]) (Object) stackIn_52_0;
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
          throw nb.a((Throwable) (Object) var9, "q.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    q(tf param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        lk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = Kickabout.field_G;
        ((q) this).field_a = 0;
        try {
          L0: {
            ((q) this).field_g = new lk[param0.a(false)];
            var2_int = 0;
            var3 = (lk) (Object) param0.g(24009);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.c((byte) -109);
                    int incrementValue$3 = var2_int;
                    var2_int++;
                    ((q) this).field_g[incrementValue$3] = var3;
                    var3 = (lk) (Object) param0.c(33);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("q.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[7];
        field_h = new String[]{"Amateur", "Pebble Playoffs", "Cobalt Conference", "Sandstone Series", "Quartz Qualifiers", "Crystal Circuit", "Diamond Division"};
        field_f = "Stats";
        field_e[5] = 11;
        field_e[2] = 8;
        field_e[4] = 10;
        field_e[6] = 19;
        field_e[1] = 7;
        field_e[0] = 6;
        field_e[3] = 9;
        field_c = "Username: ";
    }
}
