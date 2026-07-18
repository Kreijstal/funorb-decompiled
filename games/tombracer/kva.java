/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kva extends dg {
    private uh field_u;
    private oia[][] field_q;
    static en field_n;
    static String field_r;
    private dpa[][] field_m;
    static jea[] field_p;
    static kea field_s;
    private int field_t;
    private int field_v;
    private int field_o;

    kva(int param0) {
        super(param0);
    }

    final void a(uw param0, int param1) {
        ev var3 = null;
        RuntimeException var3_ref = null;
        sva var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 82) {
                break L1;
              } else {
                ((kva) this).field_t = 34;
                break L1;
              }
            }
            L2: {
              super.a(param0, 87);
              ((kva) this).field_q = null;
              ((kva) this).field_m = null;
              if (null != ((kva) this).field_u) {
                L3: {
                  var3 = param0.a((byte) 59);
                  if (var3 instanceof sva) {
                    var4 = (sva) (Object) var3;
                    var4.b((byte) -105, ((kva) this).field_u);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((kva) this).field_u = null;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("kva.RA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final ka a(int param0, dpa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        ka stackIn_15_0 = null;
        ka stackIn_23_0 = null;
        ka stackIn_25_0 = null;
        ka stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_24_0 = null;
        ka stackOut_26_0 = null;
        ka stackOut_22_0 = null;
        ka stackOut_14_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 90) {
                break L1;
              } else {
                var5 = null;
                ((kva) this).a((byte) -47, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = ((kva) this).field_v;
              if (var3_int == 0) {
                break L2;
              } else {
                if (var3_int != 1) {
                  break L2;
                } else {
                  L3: {
                    var3_int = param1.field_j;
                    if (0 != var3_int) {
                      if (var3_int == 1) {
                        stackOut_24_0 = df.field_J[91];
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      } else {
                        if (var3_int == 2) {
                          stackOut_26_0 = df.field_J[92];
                          stackIn_27_0 = stackOut_26_0;
                          break L0;
                        } else {
                          if (var3_int != 3) {
                            break L3;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  stackOut_22_0 = df.field_J[90];
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0;
                }
              }
            }
            L4: {
              var3_int = param1.field_j;
              if (var3_int != 0) {
                if (var3_int != 1) {
                  if (var3_int != 2) {
                    if (var3_int != 3) {
                      break L4;
                    } else {
                      return null;
                    }
                  } else {
                    return df.field_J[73];
                  }
                } else {
                  return df.field_J[72];
                }
              } else {
                break L4;
              }
            }
            stackOut_14_0 = df.field_J[71];
            stackIn_15_0 = stackOut_14_0;
            return stackIn_15_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("kva.PA(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_27_0;
    }

    final ka a(dpa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        ka stackIn_10_0 = null;
        ka stackIn_12_0 = null;
        ka stackIn_15_0 = null;
        ka stackIn_18_0 = null;
        ka stackIn_21_0 = null;
        ka stackIn_24_0 = null;
        ka stackIn_27_0 = null;
        ka stackIn_30_0 = null;
        ka stackIn_33_0 = null;
        ka stackIn_36_0 = null;
        ka stackIn_38_0 = null;
        ka stackIn_40_0 = null;
        ka stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_39_0 = null;
        ka stackOut_41_0 = null;
        ka stackOut_37_0 = null;
        ka stackOut_35_0 = null;
        ka stackOut_32_0 = null;
        ka stackOut_29_0 = null;
        ka stackOut_26_0 = null;
        ka stackOut_23_0 = null;
        ka stackOut_20_0 = null;
        ka stackOut_17_0 = null;
        ka stackOut_14_0 = null;
        ka stackOut_11_0 = null;
        ka stackOut_9_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 44) {
                break L1;
              } else {
                var4 = null;
                ((kva) this).a((byte) -87, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_j;
              if (var3_int == 0) {
                break L2;
              } else {
                if (1 == var3_int) {
                  stackOut_39_0 = df.field_J[29];
                  stackIn_40_0 = stackOut_39_0;
                  return stackIn_40_0;
                } else {
                  if (var3_int == 2) {
                    stackOut_41_0 = df.field_J[30];
                    stackIn_42_0 = stackOut_41_0;
                    break L0;
                  } else {
                    if (var3_int != 3) {
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
            if (!param0.field_g) {
              if (param0.field_d >= 11) {
                if (param0.field_d >= 22) {
                  if (33 <= param0.field_d) {
                    if (param0.field_d >= 44) {
                      if (55 <= param0.field_d) {
                        if (param0.field_d >= 66) {
                          if (param0.field_d >= 77) {
                            if (param0.field_d >= 88) {
                              stackOut_37_0 = df.field_J[39];
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0;
                            } else {
                              stackOut_35_0 = df.field_J[38];
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0;
                            }
                          } else {
                            stackOut_32_0 = df.field_J[37];
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0;
                          }
                        } else {
                          stackOut_29_0 = df.field_J[36];
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        }
                      } else {
                        stackOut_26_0 = df.field_J[35];
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0;
                      }
                    } else {
                      stackOut_23_0 = df.field_J[34];
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0;
                    }
                  } else {
                    stackOut_20_0 = df.field_J[33];
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  }
                } else {
                  stackOut_17_0 = df.field_J[32];
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              } else {
                stackOut_14_0 = df.field_J[31];
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            } else {
              if (param0.field_d >= 50) {
                stackOut_11_0 = df.field_J[114];
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_9_0 = df.field_J[113];
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("kva.TA(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L3;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
        }
        return stackIn_42_0;
    }

    kva(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    private final void n() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dpa var11 = null;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        dpa var27 = null;
        dpa var28 = null;
        la var29 = null;
        dpa var30 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_119_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        var29 = ((kva) this).a(113);
        var3 = var29.m((byte) -86);
        var4 = var29.s(85);
        var5 = ((kva) this).field_h.d(3);
        var6 = ((kva) this).field_h.e(9648);
        ((kva) this).field_o = ((kva) this).field_h.c(-128) / 2097152;
        ((kva) this).field_t = ((kva) this).field_h.a((byte) 55) / 2097152;
        ((kva) this).field_m = new dpa[((kva) this).field_o][((kva) this).field_t];
        var7 = -(((kva) this).field_h.a((byte) 55) / 2) + (var6 + 1048576);
        var8 = 0;
        L0: while (true) {
          if (var8 >= ((kva) this).field_t) {
            return;
          } else {
            var9 = -(((kva) this).field_h.c(-53) / 2) + var5 + 1048576;
            var10 = 0;
            L1: while (true) {
              if (~var10 <= ~((kva) this).field_o) {
                var7 = var7 + 2097152;
                var8++;
                continue L0;
              } else {
                L2: {
                  var27 = new dpa();
                  var28 = var27;
                  var30 = var28;
                  var11 = var30;
                  ((kva) this).field_m[var10][var8] = var27;
                  if (0 >= var10) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_7_0;
                  if (-1 + ((kva) this).field_o <= var10) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var8 <= 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_13_0;
                  if (-1 + ((kva) this).field_t <= var8) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var15 = stackIn_16_0;
                    if (var12 != 0) {
                      break L7;
                    } else {
                      if (2097152 > var9) {
                        break L7;
                      } else {
                        if (!var29.a(var9 + -2097152, 2097152, var7, 2097152, true, 1, (byte) -101)) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
                L8: {
                  L9: {
                    var16 = stackIn_22_0;
                    if (var13 != 0) {
                      break L9;
                    } else {
                      if (var9 > var3 + -2097152) {
                        break L9;
                      } else {
                        if (!var29.a(2097152 + var9, 2097152, var7, 2097152, true, 1, (byte) -86)) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L8;
                }
                L10: {
                  L11: {
                    var17 = stackIn_28_0;
                    if (var14 != 0) {
                      break L11;
                    } else {
                      if (var7 < 2097152) {
                        break L11;
                      } else {
                        if (!var29.a(var9, 2097152, -2097152 + var7, 2097152, true, 1, (byte) -44)) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  stackOut_32_0 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  break L10;
                }
                L12: {
                  L13: {
                    var18 = stackIn_34_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      if (~var7 < ~(-2097152 + var4)) {
                        break L13;
                      } else {
                        if (!var29.a(var9, 2097152, 2097152 + var7, 2097152, true, 1, (byte) 92)) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  stackOut_38_0 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  break L12;
                }
                L14: {
                  var19 = stackIn_40_0;
                  var20 = 0;
                  if (var16 == 0) {
                    break L14;
                  } else {
                    var20++;
                    break L14;
                  }
                }
                L15: {
                  if (var17 == 0) {
                    break L15;
                  } else {
                    var20++;
                    break L15;
                  }
                }
                L16: {
                  if (var18 == 0) {
                    break L16;
                  } else {
                    var20++;
                    break L16;
                  }
                }
                L17: {
                  if (var19 != 0) {
                    var20++;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  var21 = 0;
                  if (var20 == 4) {
                    L19: {
                      L20: {
                        L21: {
                          if (var12 == 0) {
                            break L21;
                          } else {
                            if (var14 != 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var9 < 2097152) {
                          break L20;
                        } else {
                          if (var7 < 2097152) {
                            break L20;
                          } else {
                            if (!var29.a(-2097152 + var9, 2097152, var7 + -2097152, 2097152, true, 1, (byte) -103)) {
                              stackOut_91_0 = 0;
                              stackIn_92_0 = stackOut_91_0;
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      stackOut_90_0 = 1;
                      stackIn_92_0 = stackOut_90_0;
                      break L19;
                    }
                    L22: {
                      L23: {
                        L24: {
                          var22 = stackIn_92_0;
                          if (var13 == 0) {
                            break L24;
                          } else {
                            if (var14 != 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (~var9 < ~(-2097152 + var3)) {
                          break L23;
                        } else {
                          if (var7 < 2097152) {
                            break L23;
                          } else {
                            if (!var29.a(2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) 114)) {
                              stackOut_100_0 = 0;
                              stackIn_101_0 = stackOut_100_0;
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L22;
                    }
                    L25: {
                      L26: {
                        L27: {
                          var23 = stackIn_101_0;
                          if (var12 == 0) {
                            break L27;
                          } else {
                            if (var15 != 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (var9 < 2097152) {
                          break L26;
                        } else {
                          if (var7 > -2097152 + var4) {
                            break L26;
                          } else {
                            if (!var29.a(var9 + -2097152, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 126)) {
                              stackOut_109_0 = 0;
                              stackIn_110_0 = stackOut_109_0;
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      stackOut_108_0 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      break L25;
                    }
                    L28: {
                      L29: {
                        L30: {
                          var24 = stackIn_110_0;
                          if (var13 == 0) {
                            break L30;
                          } else {
                            if (var15 != 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        if (var9 > var3 + -2097152) {
                          break L29;
                        } else {
                          if (var7 > -2097152 + var4) {
                            break L29;
                          } else {
                            if (!var29.a(2097152 + var9, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 77)) {
                              stackOut_118_0 = 0;
                              stackIn_119_0 = stackOut_118_0;
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      stackOut_117_0 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      break L28;
                    }
                    L31: {
                      var25 = stackIn_119_0;
                      if (var22 == 0) {
                        break L31;
                      } else {
                        if (var23 == 0) {
                          break L31;
                        } else {
                          if (var24 == 0) {
                            break L31;
                          } else {
                            if (var25 == 0) {
                              break L31;
                            } else {
                              var28.field_j = 3;
                              break L18;
                            }
                          }
                        }
                      }
                    }
                    L32: {
                      if (var22 != 0) {
                        if (var24 == 0) {
                          var21 = 0;
                          break L32;
                        } else {
                          if (var23 != 0) {
                            var21 = -512;
                            break L32;
                          } else {
                            var21 = 1024;
                            break L32;
                          }
                        }
                      } else {
                        var21 = 512;
                        break L32;
                      }
                    }
                    var30.field_j = 2;
                    break L18;
                  } else {
                    if (var20 == 3) {
                      var30.field_j = 0;
                      if (var18 != 0) {
                        if (var19 != 0) {
                          if (var17 == 0) {
                            var30.field_g = var29.a(2097152 + var9, 2097152, var7, 2097152, true, 0, (byte) -88);
                            var21 = -512;
                            break L18;
                          } else {
                            var30.field_g = var29.a(var9 - 2097152, 2097152, var7, 2097152, true, 0, (byte) 108);
                            var21 = 512;
                            break L18;
                          }
                        } else {
                          var21 = 0;
                          var30.field_g = var29.a(var9, 2097152, 2097152 + var7, 2097152, true, 0, (byte) -52);
                          break L18;
                        }
                      } else {
                        var30.field_g = var29.a(var9, 2097152, -2097152 + var7, 2097152, true, 0, (byte) -20);
                        var21 = 1024;
                        break L18;
                      }
                    } else {
                      if (var20 == 2) {
                        L33: {
                          if (var18 != 0) {
                            break L33;
                          } else {
                            if (var19 == 0) {
                              var30.field_j = 3;
                              break L18;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L34: {
                          if (var16 != 0) {
                            break L34;
                          } else {
                            if (var17 != 0) {
                              break L34;
                            } else {
                              var30.field_j = 3;
                              break L18;
                            }
                          }
                        }
                        L35: {
                          L36: {
                            var30.field_f = var30.field_f - 512;
                            if (var16 != 0) {
                              break L36;
                            } else {
                              if (var18 == 0) {
                                var21 = 512;
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (var16 != 0) {
                              break L37;
                            } else {
                              if (var19 == 0) {
                                var21 = 0;
                                break L35;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (var17 != 0) {
                              break L38;
                            } else {
                              if (var18 == 0) {
                                var21 = 1024;
                                break L35;
                              } else {
                                break L38;
                              }
                            }
                          }
                          if (var17 != 0) {
                            break L35;
                          } else {
                            if (var19 != 0) {
                              break L35;
                            } else {
                              var21 = -512;
                              break L35;
                            }
                          }
                        }
                        var30.field_j = 1;
                        break L18;
                      } else {
                        var28.field_j = 3;
                        break L18;
                      }
                    }
                  }
                }
                var30.field_d = var29.e(true).a(100, 0);
                var30.field_f = dfa.a(var21 + ku.field_j[var30.field_j], 2048, 85);
                var30.field_a = -var6 + var7;
                var30.field_i = -var5 + var9;
                var30.field_e = (kva) this;
                var22 = 0;
                var23 = 80;
                var24 = 80;
                L39: while (true) {
                  if (var23 <= var22) {
                    var9 = var9 + 2097152;
                    var10++;
                    continue L1;
                  } else {
                    var22 = var22 + var24;
                    var11.field_b = var11.b(53);
                    var11.field_b.field_h = var22;
                    var11 = var11.field_b;
                    continue L39;
                  }
                }
              }
            }
          }
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -93;
        }
        return 0;
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -114 % ((param0 - -8) / 40);
            super.a((byte) -68, param1);
            param1.a((byte) -127, ((kva) this).field_v, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kva.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dpa var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 < 0) {
            ((kva) this).field_o = 122;
        }
        super.h(70);
        if (null == ((kva) this).field_m) {
            return;
        }
        for (var2 = 0; ((kva) this).field_o > var2; var2++) {
            for (var3 = 0; var3 < ((kva) this).field_t; var3++) {
                var4 = ((kva) this).field_m[var2][var3];
                var5 = ku.field_j[var4.field_j];
                var4.field_f = dfa.a(-var4.field_f + var5, 2048, 93);
                var4.field_i = -var4.field_i;
            }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            field_r = null;
        }
        return 2;
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((kva) this).field_m != null) {
                var4_int = 0;
                L2: while (true) {
                  if (((kva) this).field_o <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((kva) this).field_t) {
                        var4_int++;
                        continue L2;
                      } else {
                        L4: {
                          var9 = ((kva) this).field_m[var4_int][var5];
                          var6 = var9;
                          if (var9 == null) {
                            break L4;
                          } else {
                            if (var9.field_j != 3) {
                              L5: while (true) {
                                if (var6 == null) {
                                  break L4;
                                } else {
                                  param1.a(param0, (fo) (Object) var6, (byte) -33);
                                  var6 = var6.field_b;
                                  continue L5;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (((kva) this).field_q != null) {
                var4_int = 0;
                L7: while (true) {
                  if (((kva) this).field_o <= var4_int) {
                    break L6;
                  } else {
                    var8 = 0;
                    var5 = var8;
                    L8: while (true) {
                      if (var8 >= ((kva) this).field_t) {
                        var4_int++;
                        continue L7;
                      } else {
                        L9: {
                          if (((kva) this).field_q[var4_int][var8] == null) {
                            break L9;
                          } else {
                            param1.a(0, (fo) (Object) ((kva) this).field_q[var4_int][var8], (byte) -33);
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L10: {
              if (param2 > 40) {
                break L10;
              } else {
                field_s = null;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            runtimeException = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) runtimeException;
            stackOut_27_1 = new StringBuilder().append("kva.FA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
    }

    final int f(byte param0) {
        int var2 = 89 / ((param0 - 15) / 45);
        return 1;
    }

    public static void i(int param0) {
        field_n = null;
        int var1 = -43 / ((param0 - -84) / 37);
        field_s = null;
        field_p = null;
        field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = -76 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ka a(byte param0, oia param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = 102 / ((param0 - -68) / 49);
            var7 = ((kva) this).field_v;
            if (var7 != 0) {
              if (1 == var7) {
                var4 = param1.b((byte) 111) / 2097152 % 3;
                var5 = param1.c((byte) 102) / 2097152 % 3;
                var6 = 3 * var5 + (80 + var4);
                stackOut_5_0 = df.field_J[var6];
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kva.SA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                int discarded$3 = ((kva) this).f((byte) -126);
                break L1;
              }
            }
            L2: {
              super.a(122, param1, param2);
              if (param1.field_E >= 19) {
                ((kva) this).field_v = param2.b((byte) 44, 2);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("kva.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void j() {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oia var8 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = ((kva) this).field_h.d(3);
        int var3 = ((kva) this).field_h.e(9648);
        ((kva) this).field_q = new oia[((kva) this).field_o][((kva) this).field_t];
        int var4 = -(((kva) this).field_h.a((byte) 55) / 2) + var3 - -1048576;
        for (var5 = 0; ((kva) this).field_t > var5; var5++) {
            var6 = 1048576 + (var2 - ((kva) this).field_h.c(-100) / 2);
            for (var7 = 0; var7 < ((kva) this).field_o; var7++) {
                var8 = new oia();
                ((kva) this).field_q[var7][var5] = var8;
                var8.field_c = (kva) this;
                var8.field_b = var4 - var3;
                var8.field_a = var6 + -var2;
                var6 = var6 + 2097152;
            }
            var4 = var4 + 2097152;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((kva) this).field_m) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (((kva) this).field_o <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((kva) this).field_t) {
                        var4_int++;
                        continue L2;
                      } else {
                        L4: {
                          var9 = ((kva) this).field_m[var4_int][var5];
                          var6 = var9;
                          if (var9 == null) {
                            break L4;
                          } else {
                            if (var9.field_j == 3) {
                              break L4;
                            } else {
                              L5: while (true) {
                                if (var6 == null) {
                                  break L4;
                                } else {
                                  param2.a((byte) -5, param1, (fo) (Object) var6);
                                  var6 = var6.field_b;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (null == ((kva) this).field_q) {
                break L6;
              } else {
                var4_int = 0;
                L7: while (true) {
                  if (var4_int >= ((kva) this).field_o) {
                    break L6;
                  } else {
                    var8 = 0;
                    var5 = var8;
                    L8: while (true) {
                      if (((kva) this).field_t <= var8) {
                        var4_int++;
                        continue L7;
                      } else {
                        L9: {
                          if (null != ((kva) this).field_q[var4_int][var8]) {
                            param2.a((byte) 17, 0, (fo) (Object) ((kva) this).field_q[var4_int][var8]);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
            L10: {
              if (param0 >= 50) {
                break L10;
              } else {
                int discarded$1 = ((kva) this).k((byte) 96);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("kva.V(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final void b(int param0, uw param1) {
        aga var6 = null;
        ev var4 = null;
        sva var5 = null;
        try {
            if (!(null != ((kva) this).field_m)) {
                int discarded$0 = -110;
                this.n();
            }
            if (((kva) this).field_q == null) {
                int discarded$1 = 9859;
                this.j();
            }
            if (!(((kva) this).field_v != 1)) {
                var6 = new aga(tga.field_a, 0, 0, 0, 0, 16720418, 200, 8);
                ((kva) this).field_u = new uh(var6);
                ((kva) this).field_u.a(-17825792 + ((kva) this).e((byte) -118) + 4194304, (byte) 95, ((kva) this).c((byte) 108), ((kva) this).b((byte) 84));
                var4 = param1.a((byte) 59);
                if (!(!(var4 instanceof sva))) {
                    var5 = (sva) (Object) var4;
                    var5.a((byte) 45, ((kva) this).field_u);
                }
            }
            super.b(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kva.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        ((kva) this).field_v = param1;
        if (param0 != 2097152) {
            ((kva) this).field_u = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Wandering walls";
        field_s = new kea();
    }
}
