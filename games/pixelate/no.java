/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends kd {
    private int field_f;
    static String field_n;
    static tf[] field_p;
    static String field_g;
    private int field_i;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String field_m;
    private boolean field_o;
    private jl field_l;

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, eq param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        lo[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        lo var13 = null;
        int var14 = 0;
        int var15 = 0;
        lo[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        lo[][] stackIn_40_0 = null;
        lo[][] stackIn_41_0 = null;
        lo[][] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_35_0 = 0;
        lo[][] stackOut_39_0 = null;
        lo[][] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        lo[][] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        byte stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 > param7) {
                    break L3;
                  } else {
                    var8_int = 1;
                    var9 = 0;
                    L4: while (true) {
                      stackOut_3_0 = var9;
                      stackOut_3_1 = h.field_Z.length;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (stackIn_4_0 >= stackIn_4_1) {
                              break L7;
                            } else {
                              var20 = h.field_Z[var9];
                              var19 = var20;
                              var18 = var19;
                              var17 = var18;
                              var10_ref_int__ = var17;
                              var11 = 0;
                              stackOut_5_0 = 0;
                              stackIn_36_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                var12 = stackIn_6_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      L11: {
                                        if (var20.length <= var12) {
                                          break L11;
                                        } else {
                                          var13_int = var20[var12];
                                          var14 = var10_ref_int__[1 + var12];
                                          stackOut_8_0 = var13_int;
                                          stackOut_8_1 = -1;
                                          stackIn_25_0 = stackOut_8_0;
                                          stackIn_25_1 = stackOut_8_1;
                                          stackIn_9_0 = stackOut_8_0;
                                          stackIn_9_1 = stackOut_8_1;
                                          if (var15 != 0) {
                                            break L10;
                                          } else {
                                            L12: {
                                              if (stackIn_9_0 != stackIn_9_1) {
                                                L13: {
                                                  if (param7 != var13_int) {
                                                    break L13;
                                                  } else {
                                                    if (var14 != param5) {
                                                      break L13;
                                                    } else {
                                                      var11 = 1;
                                                      if (var15 == 0) {
                                                        break L12;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (~var13_int <= ~param7) {
                                                  break L9;
                                                } else {
                                                  if ((kf.field_o[var13_int] & 255) != var14) {
                                                    break L9;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              } else {
                                                if (~var14 != ~ia.field_a[param4]) {
                                                  break L9;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            var12 += 2;
                                            if (var15 == 0) {
                                              continue L8;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      L14: {
                                        if (var11 != 0) {
                                          break L14;
                                        } else {
                                          if (fj.field_b == param7) {
                                            break L14;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var8_int = 0;
                                      var12 = 0;
                                      stackOut_24_0 = var20.length;
                                      stackOut_24_1 = var12;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      break L10;
                                    }
                                    L15: while (true) {
                                      if (stackIn_25_0 <= stackIn_25_1) {
                                        break L9;
                                      } else {
                                        var13_int = var20[var12];
                                        stackOut_26_0 = -1;
                                        stackOut_26_1 = var13_int;
                                        stackIn_4_0 = stackOut_26_0;
                                        stackIn_4_1 = stackOut_26_1;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        if (var15 != 0) {
                                          continue L5;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (stackIn_27_0 != stackIn_27_1) {
                                                break L17;
                                              } else {
                                                ib.field_b = true;
                                                if (var15 == 0) {
                                                  break L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            if (~param7 < ~var13_int) {
                                              lc.field_t[var13_int] = true;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var12 += 2;
                                          if (var15 == 0) {
                                            stackOut_24_0 = var20.length;
                                            stackOut_24_1 = var12;
                                            stackIn_25_0 = stackOut_24_0;
                                            stackIn_25_1 = stackOut_24_1;
                                            continue L15;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var15 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_35_0 = var8_int;
                          stackIn_36_0 = stackOut_35_0;
                          break L6;
                        }
                        L18: {
                          if (stackIn_36_0 == 0) {
                            break L18;
                          } else {
                            pb.field_f = true;
                            break L18;
                          }
                        }
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L19: {
                  stackOut_39_0 = hc.field_L;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_40_0 = stackOut_39_0;
                  if (param7 != -1) {
                    stackOut_41_0 = (lo[][]) (Object) stackIn_41_0;
                    stackOut_41_1 = param7 + 4;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    break L19;
                  } else {
                    stackOut_40_0 = (lo[][]) (Object) stackIn_40_0;
                    stackOut_40_1 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    break L19;
                  }
                }
                L20: {
                  var16 = stackIn_42_0[stackIn_42_1];
                  var8_array = var16;
                  var9 = 1;
                  if (!param3) {
                    break L20;
                  } else {
                    L21: {
                      if (param7 == -1) {
                        break L21;
                      } else {
                        var10 = 0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (var10 >= var16.length - 1) {
                                break L24;
                              } else {
                                stackOut_46_0 = k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                                stackIn_52_0 = stackOut_46_0;
                                stackIn_47_0 = stackOut_46_0;
                                if (var15 != 0) {
                                  break L23;
                                } else {
                                  L25: {
                                    if (stackIn_47_0 == 0) {
                                      break L25;
                                    } else {
                                      var9 = 0;
                                      if (var15 == 0) {
                                        break L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  var10++;
                                  if (var15 == 0) {
                                    continue L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            stackOut_51_0 = param1 + (oe.field_Rb[param7] & 255);
                            stackIn_52_0 = stackOut_51_0;
                            break L23;
                          }
                          param1 = stackIn_52_0;
                          if (var15 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L26: while (true) {
                      if (var10 >= ia.field_a.length) {
                        break L20;
                      } else {
                        stackOut_55_0 = 0;
                        stackOut_55_1 = qm.field_J[var10 / 8] & 1 << (7 & var10);
                        stackIn_110_0 = stackOut_55_0;
                        stackIn_110_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L27: {
                            if (stackIn_56_0 == stackIn_56_1) {
                              break L27;
                            } else {
                              var9 = 0;
                              if (var15 == 0) {
                                break L20;
                              } else {
                                break L27;
                              }
                            }
                          }
                          var10++;
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L28: while (true) {
                  L29: {
                    L30: {
                      if (param7 != -1) {
                        stackOut_64_0 = -1;
                        stackIn_65_0 = stackOut_64_0;
                        break L30;
                      } else {
                        stackOut_62_0 = ia.field_a.length;
                        stackIn_65_0 = stackOut_62_0;
                        stackIn_63_0 = stackOut_62_0;
                        if (var15 != 0) {
                          break L30;
                        } else {
                          stackOut_63_0 = stackIn_63_0;
                          stackIn_66_0 = stackOut_63_0;
                          break L29;
                        }
                      }
                    }
                    stackOut_65_0 = stackIn_65_0 + var16.length;
                    stackIn_66_0 = stackOut_65_0;
                    break L29;
                  }
                  L31: {
                    if (stackIn_66_0 <= var11) {
                      break L31;
                    } else {
                      L32: {
                        L33: {
                          if (-1 != param7) {
                            break L33;
                          } else {
                            param4 = var11;
                            if (var15 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        kf.field_o[param7] = (byte)var11;
                        break L32;
                      }
                      L34: {
                        L35: {
                          L36: {
                            if (param7 != -1) {
                              break L36;
                            } else {
                              if (ia.field_a.length == 1) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            L38: {
                              var13 = var16[var11 + 1];
                              if (param3) {
                                break L38;
                              } else {
                                L39: {
                                  if (-1 == param7) {
                                    if (~ia.field_a[var11] != ~io.field_c.field_ec) {
                                      stackOut_80_0 = 0;
                                      stackIn_81_0 = stackOut_80_0;
                                      break L39;
                                    } else {
                                      stackOut_79_0 = 1;
                                      stackIn_81_0 = stackOut_79_0;
                                      break L39;
                                    }
                                  } else {
                                    if (var11 != (io.field_c.field_Eb[param7] & 255)) {
                                      stackOut_77_0 = 0;
                                      stackIn_81_0 = stackOut_77_0;
                                      break L39;
                                    } else {
                                      stackOut_76_0 = 1;
                                      stackIn_81_0 = stackOut_76_0;
                                      break L39;
                                    }
                                  }
                                }
                                var12 = stackIn_81_0;
                                if (var15 == 0) {
                                  break L37;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            L40: {
                              L41: {
                                if (var13.field_U) {
                                  break L41;
                                } else {
                                  L42: {
                                    if (var9 == 0) {
                                      break L42;
                                    } else {
                                      if (!var13.field_rb) {
                                        break L42;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                  stackOut_87_0 = 0;
                                  stackIn_88_0 = stackOut_87_0;
                                  break L40;
                                }
                              }
                              stackOut_86_0 = 1;
                              stackIn_88_0 = stackOut_86_0;
                              break L40;
                            }
                            var12 = stackIn_88_0;
                            break L37;
                          }
                          if (var15 == 0) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                        var12 = 1;
                        break L34;
                      }
                      L43: {
                        if (var12 == 0) {
                          break L43;
                        } else {
                          var10 = 1;
                          no.a(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                          break L43;
                        }
                      }
                      if (pb.field_f) {
                        return;
                      } else {
                        var11++;
                        if (var15 == 0) {
                          continue L28;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  if (var10 == 0) {
                    var11 = 0;
                    L44: while (true) {
                      if (~(var16.length - 1) >= ~var11) {
                        break L2;
                      } else {
                        stackOut_101_0 = 0;
                        stackOut_101_1 = ~param7;
                        stackIn_110_0 = stackOut_101_0;
                        stackIn_110_1 = stackOut_101_1;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L45: {
                            L46: {
                              if (stackIn_102_0 == stackIn_102_1) {
                                break L46;
                              } else {
                                kf.field_o[param7] = (byte)var11;
                                if (var15 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            param4 = var11;
                            break L45;
                          }
                          no.a(param0, param1, (byte) 83, param3, param4, param5, param6, param7 - -1);
                          if (!pb.field_f) {
                            var11++;
                            if (var15 == 0) {
                              continue L44;
                            } else {
                              break L2;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_109_0 = param2;
              stackOut_109_1 = 67;
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              break L1;
            }
            L47: {
              if (stackIn_110_0 > stackIn_110_1) {
                break L47;
              } else {
                field_g = null;
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var8 = decompiledCaughtException;
            stackOut_113_0 = (RuntimeException) var8;
            stackOut_113_1 = new StringBuilder().append("no.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_115_0 = stackOut_113_0;
            stackIn_115_1 = stackOut_113_1;
            stackIn_114_0 = stackOut_113_0;
            stackIn_114_1 = stackOut_113_1;
            if (param6 == null) {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "null";
              stackIn_116_0 = stackOut_115_0;
              stackIn_116_1 = stackOut_115_1;
              stackIn_116_2 = stackOut_115_2;
              break L48;
            } else {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "{...}";
              stackIn_116_0 = stackOut_114_0;
              stackIn_116_1 = stackOut_114_1;
              stackIn_116_2 = stackOut_114_2;
              break L48;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_116_0, stackIn_116_2 + 44 + param7 + 41);
        }
    }

    public static void f(int param0) {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    final static void a(boolean param0, byte param1) {
        ui.field_i.a(param0, 0);
        if (param1 != 34) {
            field_n = null;
        }
        oj var2 = td.field_b;
        if (var2 != null) {
            var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mn stackIn_33_0 = null;
        mn stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        mn stackIn_34_0 = null;
        mn stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        mn stackIn_35_0 = null;
        mn stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        jl stackIn_38_0 = null;
        jl stackIn_39_0 = null;
        jl stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_32_0 = null;
        mn stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        mn stackOut_34_0 = null;
        mn stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        mn stackOut_33_0 = null;
        mn stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        jl stackOut_37_0 = null;
        jl stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        jl stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != ~param7) {
                break L1;
              } else {
                param7 = param3.field_M;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (param3 != ((no) this).field_l) {
                  break L2;
                } else {
                  if (((no) this).field_o) {
                    break L2;
                  } else {
                    if (param5 != ((no) this).field_i) {
                      break L2;
                    } else {
                      if (~param6 != ~((no) this).field_f) {
                        break L2;
                      } else {
                        if (((no) this).field_e != param7) {
                          break L2;
                        } else {
                          if (((no) this).field_q != param4) {
                            break L2;
                          } else {
                            if (~((no) this).field_k != ~param0) {
                              break L2;
                            } else {
                              if (null == ((no) this).field_m) {
                                break L2;
                              } else {
                                if (((no) this).field_m.equals((Object) (Object) param2)) {
                                  return;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                ((no) this).field_q = param4;
                ((no) this).field_f = param6;
                ((no) this).field_l = param3;
                ((no) this).field_i = param5;
                ((no) this).field_e = param7;
                ((no) this).field_k = param0;
                ((no) this).field_o = false;
                ((no) this).field_m = param2;
                var16 = new String[1 + param3.b(param2, param0)];
                var17 = var16;
                var10 = Math.max(1, param3.a(param2, new int[1], var17));
                if (((no) this).field_f != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((no) this).field_f = 1;
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (((no) this).field_f == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (1 != ((no) this).field_f) {
                        break L6;
                      } else {
                        var11 = (((no) this).field_q + -(var10 * ((no) this).field_e) >> 1) + param3.field_w;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (((no) this).field_f == 2) {
                        break L7;
                      } else {
                        L8: {
                          var12 = (((no) this).field_q - var10 * ((no) this).field_e) / (1 + var10);
                          if (0 <= var12) {
                            break L8;
                          } else {
                            var12 = 0;
                            break L8;
                          }
                        }
                        var11 = param3.field_w + var12;
                        ((no) this).field_e = ((no) this).field_e + var12;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = -(((no) this).field_e * var10) + ((no) this).field_q - param3.field_z;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var11 = param3.field_w;
                break L4;
              }
              ((no) this).field_b = new mn[var10];
              var12 = 0;
              L9: while (true) {
                L10: {
                  if (var10 <= var12) {
                    break L10;
                  } else {
                    var13 = var16[var12];
                    if (var15 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L11: {
                        stackOut_32_0 = null;
                        stackOut_32_1 = null;
                        stackOut_32_2 = var11 - param3.field_w;
                        stackOut_32_3 = var11 - -param3.field_z;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_34_2 = stackOut_32_2;
                        stackIn_34_3 = stackOut_32_3;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        stackIn_33_2 = stackOut_32_2;
                        stackIn_33_3 = stackOut_32_3;
                        if (var13 != null) {
                          stackOut_34_0 = null;
                          stackOut_34_1 = null;
                          stackOut_34_2 = stackIn_34_2;
                          stackOut_34_3 = stackIn_34_3;
                          stackOut_34_4 = var13.length();
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          stackIn_35_3 = stackOut_34_3;
                          stackIn_35_4 = stackOut_34_4;
                          break L11;
                        } else {
                          stackOut_33_0 = null;
                          stackOut_33_1 = null;
                          stackOut_33_2 = stackIn_33_2;
                          stackOut_33_3 = stackIn_33_3;
                          stackOut_33_4 = 0;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          stackIn_35_3 = stackOut_33_3;
                          stackIn_35_4 = stackOut_33_4;
                          break L11;
                        }
                      }
                      L12: {
                        var14 = new mn(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                        var14.field_g[0] = 0;
                        if (var13 != null) {
                          L13: {
                            var14.field_g[var13.length()] = param3.c(var13);
                            stackOut_37_0 = (jl) param3;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (param5 != 3) {
                              stackOut_39_0 = (jl) (Object) stackIn_39_0;
                              stackOut_39_1 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L13;
                            } else {
                              stackOut_38_0 = (jl) (Object) stackIn_38_0;
                              stackOut_38_1 = ((no) this).a(var13, param0, param3.c(var13), 60);
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_40_1 = stackOut_38_1;
                              break L13;
                            }
                          }
                          an.a(stackIn_40_0, stackIn_40_1, (byte) -92, var14, var13);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var11 = var11 + param7;
                      ((no) this).field_b[var12] = var14;
                      var12++;
                      if (var15 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              ((no) this).field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var9;
            stackOut_43_1 = new StringBuilder().append("no.K(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          L15: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L15;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        mn var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (param1) {
            field_g = null;
        }
        if (((no) this).field_l == param3) {
            if (((no) this).field_o) {
                if (1 == ((no) this).field_i) {
                    if (null != ((no) this).field_m) {
                        if (!(!((no) this).field_m.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((no) this).field_i = 1;
            ((no) this).field_o = true;
            ((no) this).field_l = param3;
            var8 = this.a(param0, 0, param3, param2);
            var7 = param3.c(param0);
            var8.field_g[0] = param4 - (var7 >> 1);
            var8.field_g[param0.length()] = param4 + (var7 >> 1);
            an.a(param3, 0, (byte) -92, var8, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        ak var6 = null;
        ak var7 = null;
        ak var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        bb var17 = null;
        Object var18 = null;
        uj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        ak var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        ak var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        ak stackIn_18_0 = null;
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        ak stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_128_0 = 0;
        boolean stackIn_138_0 = false;
        boolean stackIn_154_0 = false;
        int stackIn_161_0 = 0;
        ak stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        ak stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        ak stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        ak stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        ak stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        int stackIn_181_2 = 0;
        ak stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        ak stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        ak stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        ak stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        ak stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        ak stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        ak stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        ak stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        ak stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        ak stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        int stackIn_191_2 = 0;
        ak stackOut_17_0 = null;
        ak stackOut_18_0 = null;
        ak stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ak stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_127_0 = 0;
        boolean stackOut_137_0 = false;
        boolean stackOut_153_0 = false;
        int stackOut_160_0 = 0;
        ak stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        ak stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        ak stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        ak stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        int stackOut_179_2 = 0;
        ak stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        ak stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        ak stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        ak stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        ak stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        ak stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        ak stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        ak stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        ak stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        ak stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        ak stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        var18 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        cm.b(h.field_W, 4740);
        if (param1 == 1) {
          L0: {
            if (io.field_c != null) {
              L1: {
                L2: {
                  gk.field_kb.field_rb = true;
                  wm.field_d.field_nb = 0;
                  var22 = wm.field_d;
                  var27 = var22;
                  var27.field_K = 0;
                  var6 = ep.field_a;
                  ep.field_a.field_nb = 0;
                  var6.field_K = 0;
                  var7 = nk.field_e;
                  nk.field_e.field_nb = 0;
                  var7.field_K = 0;
                  if (pl.m(param1 + 98)) {
                    break L2;
                  } else {
                    var9_ref_String = io.field_c.field_pc;
                    vp.field_Qb.field_cb = sd.a(fk.field_q, param1 ^ 62, new String[1]).toUpperCase();
                    nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, param1 + 255, ai.field_A.field_K);
                    nk.field_e.field_cb = sd.a(qh.field_a, param1 + 23, new String[1]);
                    var8 = nk.field_e;
                    if (var19 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    vp.field_Qb.field_cb = hk.field_g.toUpperCase();
                    var9 = (ai.field_A.field_K - -2) / 2;
                    wm.field_d.a(ai.field_A.field_nb - 40, 40, 0, 256, var9 - 2);
                    if (io.field_c.field_ec > io.field_c.field_mc) {
                      break L4;
                    } else {
                      wm.field_d.field_cb = fo.field_m.toUpperCase();
                      wm.field_d.field_rb = false;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  wm.field_d.field_cb = ca.field_k.toUpperCase();
                  wm.field_d.field_rb = true;
                  break L3;
                }
                L5: {
                  wm.field_d.field_zb = bf.field_k.field_zb;
                  if (ka.field_X <= 0) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (ka.field_X != 1) {
                          break L7;
                        } else {
                          var10_ref_String = sm.field_k;
                          if (var19 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var10_ref_String = sd.a(d.field_a, 99, new String[1]);
                      break L6;
                    }
                    wm.field_d.field_cb = wm.field_d.field_cb + "<br>" + var10_ref_String;
                    if (0 != (16 & rb.field_o)) {
                      break L5;
                    } else {
                      if (bm.field_o) {
                        break L5;
                      } else {
                        wm.field_d.field_zb = bf.field_k.field_ab;
                        break L5;
                      }
                    }
                  }
                }
                L8: {
                  L9: {
                    ep.field_a.a(-40 + ai.field_A.field_nb, 40, var9, 256, -var9 + ai.field_A.field_K);
                    ep.field_a.field_cb = kb.field_J.toUpperCase();
                    var8 = ep.field_a;
                    stackOut_17_0 = ep.field_a;
                    stackIn_20_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (!param0) {
                      break L9;
                    } else {
                      stackOut_18_0 = (ak) (Object) stackIn_18_0;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (bo.field_e != 0L) {
                        break L9;
                      } else {
                        stackOut_19_0 = (ak) (Object) stackIn_19_0;
                        stackOut_19_1 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L8;
                      }
                    }
                  }
                  stackOut_20_0 = (ak) (Object) stackIn_20_0;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L8;
                }
                L10: {
                  stackIn_21_0.field_rb = stackIn_21_1 != 0;
                  var10 = 2;
                  if (h.field_Z == null) {
                    break L10;
                  } else {
                    L11: {
                      if (kf.field_o != null) {
                        break L11;
                      } else {
                        kf.field_o = new byte[fj.field_b];
                        lc.field_t = new boolean[fj.field_b];
                        break L11;
                      }
                    }
                    var11_int = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (~fj.field_b >= ~var11_int) {
                            break L14;
                          } else {
                            lc.field_t[var11_int] = false;
                            var11_int++;
                            if (var19 != 0) {
                              break L13;
                            } else {
                              if (var19 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        break L13;
                      }
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (var10 >= 2) {
                              break L17;
                            } else {
                              var11_int = 0;
                              stackOut_32_0 = 0;
                              stackIn_65_0 = stackOut_32_0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var19 != 0) {
                                break L16;
                              } else {
                                var12 = stackIn_33_0;
                                L18: while (true) {
                                  stackOut_34_0 = ~var12;
                                  stackOut_34_1 = ~h.field_Z.length;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  L19: while (true) {
                                    L20: {
                                      L21: {
                                        if (stackIn_35_0 <= stackIn_35_1) {
                                          break L21;
                                        } else {
                                          var29 = h.field_Z[var12];
                                          var28 = var29;
                                          var26 = var28;
                                          var23 = var26;
                                          var20 = var23;
                                          var13_array = var20;
                                          stackOut_36_0 = 0;
                                          stackIn_59_0 = stackOut_36_0;
                                          stackIn_37_0 = stackOut_36_0;
                                          if (var19 != 0) {
                                            break L20;
                                          } else {
                                            var14_int = stackIn_37_0;
                                            L22: while (true) {
                                              L23: {
                                                L24: {
                                                  L25: {
                                                    if (var14_int >= var29.length) {
                                                      break L25;
                                                    } else {
                                                      var15 = var29[var14_int];
                                                      var16 = var20[var14_int + 1];
                                                      stackOut_39_0 = ~var15;
                                                      stackIn_50_0 = stackOut_39_0;
                                                      stackIn_40_0 = stackOut_39_0;
                                                      if (var19 != 0) {
                                                        break L24;
                                                      } else {
                                                        L26: {
                                                          if (stackIn_40_0 == 0) {
                                                            L27: {
                                                              if (var10 == 0) {
                                                                stackOut_45_0 = io.field_c.field_ec;
                                                                stackIn_46_0 = stackOut_45_0;
                                                                break L27;
                                                              } else {
                                                                stackOut_44_0 = io.field_c.field_mc;
                                                                stackIn_46_0 = stackOut_44_0;
                                                                break L27;
                                                              }
                                                            }
                                                            var17_int = stackIn_46_0;
                                                            if (~var17_int != ~var16) {
                                                              break L23;
                                                            } else {
                                                              break L26;
                                                            }
                                                          } else {
                                                            if (~var16 != ~(255 & io.field_c.field_Eb[var15])) {
                                                              break L23;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        var14_int += 2;
                                                        if (var19 == 0) {
                                                          continue L22;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var11_int = 1;
                                                  var14_int = -1;
                                                  stackOut_49_0 = 0;
                                                  stackIn_50_0 = stackOut_49_0;
                                                  break L24;
                                                }
                                                var15 = stackIn_50_0;
                                                L28: while (true) {
                                                  L29: {
                                                    if (~var29.length >= ~var15) {
                                                      break L29;
                                                    } else {
                                                      var16 = var29[var15];
                                                      stackOut_52_0 = var16;
                                                      stackOut_52_1 = var14_int;
                                                      stackIn_35_0 = stackOut_52_0;
                                                      stackIn_35_1 = stackOut_52_1;
                                                      stackIn_53_0 = stackOut_52_0;
                                                      stackIn_53_1 = stackOut_52_1;
                                                      if (var19 != 0) {
                                                        continue L19;
                                                      } else {
                                                        L30: {
                                                          if (stackIn_53_0 <= stackIn_53_1) {
                                                            break L30;
                                                          } else {
                                                            var14_int = var16;
                                                            break L30;
                                                          }
                                                        }
                                                        var15 += 2;
                                                        if (var19 == 0) {
                                                          continue L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  lc.field_t[var14_int] = true;
                                                  break L23;
                                                }
                                              }
                                              var12++;
                                              if (var19 == 0) {
                                                continue L18;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_58_0 = var11_int;
                                      stackIn_59_0 = stackOut_58_0;
                                      break L20;
                                    }
                                    L31: {
                                      if (stackIn_59_0 == 0) {
                                        break L31;
                                      } else {
                                        if (var19 == 0) {
                                          break L17;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var19 == 0) {
                                      continue L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_64_0 = ~wo.field_h;
                          stackIn_65_0 = stackOut_64_0;
                          break L16;
                        }
                        if (stackIn_65_0 > -3) {
                          break L10;
                        } else {
                          if (bc.field_m[12]) {
                            var10 = 2;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                L32: {
                  L33: {
                    L34: {
                      if (2 > var10) {
                        break L34;
                      } else {
                        L35: {
                          if (null != jm.field_r) {
                            break L35;
                          } else {
                            if (w.field_z != null) {
                              break L35;
                            } else {
                              if (null != pa.field_a) {
                                break L35;
                              } else {
                                if (oo.field_e != null) {
                                  break L35;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        var11_int = 0;
                        var12 = 0;
                        var13_int = 0;
                        var14_int = 0;
                        var15 = 0;
                        var16 = 0;
                        L36: while (true) {
                          L37: {
                            L38: {
                              if (var16 >= fj.field_b) {
                                break L38;
                              } else {
                                var17_int = io.field_c.field_Eb[var16] & 255;
                                if (var19 != 0) {
                                  break L37;
                                } else {
                                  L39: {
                                    if (jm.field_r == null) {
                                      break L39;
                                    } else {
                                      if (jm.field_r[var16] == null) {
                                        break L39;
                                      } else {
                                        if (!jm.field_r[var16][var17_int]) {
                                          break L39;
                                        } else {
                                          var11_int = 1;
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  L40: {
                                    if (w.field_z == null) {
                                      break L40;
                                    } else {
                                      if (null != w.field_z[var16]) {
                                        L41: {
                                          var18_int = w.field_z[var16][var17_int];
                                          if (~var18_int < ~var13_int) {
                                            var13_int = var18_int;
                                            break L41;
                                          } else {
                                            break L41;
                                          }
                                        }
                                        if (var18_int == 0) {
                                          break L40;
                                        } else {
                                          if (fe.field_a) {
                                            break L40;
                                          } else {
                                            var11_int = 1;
                                            break L40;
                                          }
                                        }
                                      } else {
                                        break L40;
                                      }
                                    }
                                  }
                                  L42: {
                                    if (null == pa.field_a) {
                                      break L42;
                                    } else {
                                      if (null != pa.field_a[var16]) {
                                        L43: {
                                          var18_int = pa.field_a[var16][var17_int];
                                          if (~var14_int <= ~var18_int) {
                                            break L43;
                                          } else {
                                            var14_int = var18_int;
                                            break L43;
                                          }
                                        }
                                        if (var18_int == 0) {
                                          break L42;
                                        } else {
                                          if (!fe.field_a) {
                                            var11_int = 1;
                                            break L42;
                                          } else {
                                            break L42;
                                          }
                                        }
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  L44: {
                                    if (oo.field_e == null) {
                                      break L44;
                                    } else {
                                      if (null != oo.field_e[var16]) {
                                        var15 = var15 | oo.field_e[var16][var17_int];
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L36;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L37;
                          }
                          var17 = ae.field_c.field_Fb.field_L;
                          var18_ref = (uj) (Object) var17.c(1504642273);
                          L45: while (true) {
                            L46: {
                              L47: {
                                if (var18_ref == null) {
                                  break L47;
                                } else {
                                  stackOut_108_0 = var18_ref.b((byte) -98);
                                  stackIn_128_0 = stackOut_108_0 ? 1 : 0;
                                  stackIn_109_0 = stackOut_108_0;
                                  if (var19 != 0) {
                                    break L46;
                                  } else {
                                    L48: {
                                      if (stackIn_109_0) {
                                        break L48;
                                      } else {
                                        L49: {
                                          if (var11_int == 0) {
                                            break L49;
                                          } else {
                                            if (!var18_ref.field_Xb) {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L47;
                                              } else {
                                                break L49;
                                              }
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                        L50: {
                                          if (~var18_ref.field_Rb > ~var13_int) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L47;
                                            } else {
                                              break L50;
                                            }
                                          } else {
                                            break L50;
                                          }
                                        }
                                        L51: {
                                          if (~var18_ref.field_Yb > ~var14_int) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L47;
                                            } else {
                                              break L51;
                                            }
                                          } else {
                                            break L51;
                                          }
                                        }
                                        L52: {
                                          if ((~var18_ref.field_Ib & var15) > 0) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L47;
                                            } else {
                                              break L52;
                                            }
                                          } else {
                                            break L52;
                                          }
                                        }
                                        if (var12 != 0) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L47;
                                          } else {
                                            break L48;
                                          }
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    var18_ref = (uj) (Object) var17.f(1504642273);
                                    if (var19 == 0) {
                                      continue L45;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                              stackOut_127_0 = -3;
                              stackIn_128_0 = stackOut_127_0;
                              break L46;
                            }
                            L53: {
                              if (stackIn_128_0 < ~wo.field_h) {
                                break L53;
                              } else {
                                if (bc.field_m[12]) {
                                  var16 = 0;
                                  break L53;
                                } else {
                                  break L53;
                                }
                              }
                            }
                            L54: {
                              if (var16 != 0) {
                                break L54;
                              } else {
                                if (var19 == 0) {
                                  break L1;
                                } else {
                                  ep.field_a.field_rb = false;
                                  if (!ep.field_a.field_R) {
                                    break L1;
                                  } else {
                                    var11 = null;
                                    var12 = 0;
                                    var13_int = 0;
                                    L55: while (true) {
                                      if (var13_int >= fj.field_b) {
                                        break L33;
                                      } else {
                                        stackOut_137_0 = lc.field_t[var13_int];
                                        stackIn_161_0 = stackOut_137_0 ? 1 : 0;
                                        stackIn_138_0 = stackOut_137_0;
                                        if (var19 != 0) {
                                          break L32;
                                        } else {
                                          L56: {
                                            if (stackIn_138_0) {
                                              L57: {
                                                var24 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                                if (var11 == null) {
                                                  break L57;
                                                } else {
                                                  var11 = (Object) (Object) (var11 + ", " + var24);
                                                  var12 = 1;
                                                  if (var19 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              var11 = (Object) (Object) var24;
                                              break L56;
                                            } else {
                                              break L56;
                                            }
                                          }
                                          var13_int++;
                                          if (var19 == 0) {
                                            continue L55;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L58: {
                              ep.field_a.field_rb = false;
                              if (!ep.field_a.field_R) {
                                break L58;
                              } else {
                                L59: {
                                  if (0 != nd.field_b.field_g.field_Jb) {
                                    break L59;
                                  } else {
                                    up.field_o = pc.field_u;
                                    if (var19 == 0) {
                                      break L58;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                up.field_o = sd.a(li.field_b, 107, new String[1]);
                                break L58;
                              }
                            }
                            if (var19 == 0) {
                              break L1;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                    }
                    ep.field_a.field_rb = false;
                    if (!ep.field_a.field_R) {
                      break L1;
                    } else {
                      var11 = null;
                      var12 = 0;
                      var13_int = 0;
                      L60: while (true) {
                        if (var13_int >= fj.field_b) {
                          break L33;
                        } else {
                          stackOut_153_0 = lc.field_t[var13_int];
                          stackIn_161_0 = stackOut_153_0 ? 1 : 0;
                          stackIn_154_0 = stackOut_153_0;
                          if (var19 != 0) {
                            break L32;
                          } else {
                            L61: {
                              if (stackIn_154_0) {
                                L62: {
                                  var25 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                  if (var11 == null) {
                                    break L62;
                                  } else {
                                    var11 = (Object) (Object) (var11 + ", " + var25);
                                    var12 = 1;
                                    if (var19 == 0) {
                                      break L61;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                var11 = (Object) (Object) var25;
                                break L61;
                              } else {
                                break L61;
                              }
                            }
                            var13_int++;
                            if (var19 == 0) {
                              continue L60;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_160_0 = 0;
                  stackIn_161_0 = stackOut_160_0;
                  break L32;
                }
                L63: {
                  if (stackIn_161_0 == var10) {
                    L64: {
                      var13 = ji.field_a;
                      if (var12 != 0) {
                        break L64;
                      } else {
                        var14 = sd.a(sm.field_n, 80, new String[1]);
                        if (var19 == 0) {
                          break L63;
                        } else {
                          break L64;
                        }
                      }
                    }
                    var14 = cf.field_x + var11;
                    break L63;
                  } else {
                    L65: {
                      var13 = aq.field_c;
                      if (var12 != 0) {
                        break L65;
                      } else {
                        var14 = sd.a(ff.field_b, 31, new String[1]);
                        if (var19 == 0) {
                          break L63;
                        } else {
                          break L65;
                        }
                      }
                    }
                    var14 = fg.field_b + var11;
                    break L63;
                  }
                }
                up.field_o = "<col=A00000>" + var13 + "<br>" + var14;
                break L1;
              }
              L66: {
                if (0L != bo.field_e) {
                  L67: {
                    var9 = (int)(-hm.a(64) + bo.field_e);
                    var9 = (var9 + 999) / 1000;
                    if (var9 < 1) {
                      var9 = 1;
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  var8.field_cb = sd.a(ao.field_i, 100, new String[1]);
                  break L66;
                } else {
                  break L66;
                }
              }
              qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[2]);
              break L0;
            } else {
              break L0;
            }
          }
          L68: {
            L69: {
              stackOut_176_0 = ff.field_h;
              stackOut_176_1 = -28476;
              stackIn_180_0 = stackOut_176_0;
              stackIn_180_1 = stackOut_176_1;
              stackIn_177_0 = stackOut_176_0;
              stackIn_177_1 = stackOut_176_1;
              if (!param4) {
                break L69;
              } else {
                stackOut_177_0 = (ak) (Object) stackIn_177_0;
                stackOut_177_1 = stackIn_177_1;
                stackIn_180_0 = stackOut_177_0;
                stackIn_180_1 = stackOut_177_1;
                stackIn_178_0 = stackOut_177_0;
                stackIn_178_1 = stackOut_177_1;
                if (param3) {
                  break L69;
                } else {
                  stackOut_178_0 = (ak) (Object) stackIn_178_0;
                  stackOut_178_1 = stackIn_178_1;
                  stackIn_180_0 = stackOut_178_0;
                  stackIn_180_1 = stackOut_178_1;
                  stackIn_179_0 = stackOut_178_0;
                  stackIn_179_1 = stackOut_178_1;
                  if (bm.field_o) {
                    break L69;
                  } else {
                    stackOut_179_0 = (ak) (Object) stackIn_179_0;
                    stackOut_179_1 = stackIn_179_1;
                    stackOut_179_2 = 1;
                    stackIn_181_0 = stackOut_179_0;
                    stackIn_181_1 = stackOut_179_1;
                    stackIn_181_2 = stackOut_179_2;
                    break L68;
                  }
                }
              }
            }
            stackOut_180_0 = (ak) (Object) stackIn_180_0;
            stackOut_180_1 = stackIn_180_1;
            stackOut_180_2 = 0;
            stackIn_181_0 = stackOut_180_0;
            stackIn_181_1 = stackOut_180_1;
            stackIn_181_2 = stackOut_180_2;
            break L68;
          }
          L70: {
            L71: {
              ((ak) (Object) stackIn_181_0).a(stackIn_181_1, stackIn_181_2 != 0);
              stackOut_181_0 = ai.field_A;
              stackOut_181_1 = -28476;
              stackIn_185_0 = stackOut_181_0;
              stackIn_185_1 = stackOut_181_1;
              stackIn_182_0 = stackOut_181_0;
              stackIn_182_1 = stackOut_181_1;
              if (!param4) {
                break L71;
              } else {
                stackOut_182_0 = (ak) (Object) stackIn_182_0;
                stackOut_182_1 = stackIn_182_1;
                stackIn_185_0 = stackOut_182_0;
                stackIn_185_1 = stackOut_182_1;
                stackIn_183_0 = stackOut_182_0;
                stackIn_183_1 = stackOut_182_1;
                if (param3) {
                  break L71;
                } else {
                  stackOut_183_0 = (ak) (Object) stackIn_183_0;
                  stackOut_183_1 = stackIn_183_1;
                  stackIn_185_0 = stackOut_183_0;
                  stackIn_185_1 = stackOut_183_1;
                  stackIn_184_0 = stackOut_183_0;
                  stackIn_184_1 = stackOut_183_1;
                  if (bm.field_o) {
                    break L71;
                  } else {
                    stackOut_184_0 = (ak) (Object) stackIn_184_0;
                    stackOut_184_1 = stackIn_184_1;
                    stackOut_184_2 = 1;
                    stackIn_186_0 = stackOut_184_0;
                    stackIn_186_1 = stackOut_184_1;
                    stackIn_186_2 = stackOut_184_2;
                    break L70;
                  }
                }
              }
            }
            stackOut_185_0 = (ak) (Object) stackIn_185_0;
            stackOut_185_1 = stackIn_185_1;
            stackOut_185_2 = 0;
            stackIn_186_0 = stackOut_185_0;
            stackIn_186_1 = stackOut_185_1;
            stackIn_186_2 = stackOut_185_2;
            break L70;
          }
          L72: {
            L73: {
              ((ak) (Object) stackIn_186_0).a(stackIn_186_1, stackIn_186_2 != 0);
              stackOut_186_0 = ra.field_e;
              stackOut_186_1 = -28476;
              stackIn_190_0 = stackOut_186_0;
              stackIn_190_1 = stackOut_186_1;
              stackIn_187_0 = stackOut_186_0;
              stackIn_187_1 = stackOut_186_1;
              if (!param4) {
                break L73;
              } else {
                stackOut_187_0 = (ak) (Object) stackIn_187_0;
                stackOut_187_1 = stackIn_187_1;
                stackIn_190_0 = stackOut_187_0;
                stackIn_190_1 = stackOut_187_1;
                stackIn_188_0 = stackOut_187_0;
                stackIn_188_1 = stackOut_187_1;
                if (param3) {
                  break L73;
                } else {
                  stackOut_188_0 = (ak) (Object) stackIn_188_0;
                  stackOut_188_1 = stackIn_188_1;
                  stackIn_190_0 = stackOut_188_0;
                  stackIn_190_1 = stackOut_188_1;
                  stackIn_189_0 = stackOut_188_0;
                  stackIn_189_1 = stackOut_188_1;
                  if (!bm.field_o) {
                    break L73;
                  } else {
                    stackOut_189_0 = (ak) (Object) stackIn_189_0;
                    stackOut_189_1 = stackIn_189_1;
                    stackOut_189_2 = 1;
                    stackIn_191_0 = stackOut_189_0;
                    stackIn_191_1 = stackOut_189_1;
                    stackIn_191_2 = stackOut_189_2;
                    break L72;
                  }
                }
              }
            }
            stackOut_190_0 = (ak) (Object) stackIn_190_0;
            stackOut_190_1 = stackIn_190_1;
            stackOut_190_2 = 0;
            stackIn_191_0 = stackOut_190_0;
            stackIn_191_1 = stackOut_190_1;
            stackIn_191_2 = stackOut_190_2;
            break L72;
          }
          L74: {
            ((ak) (Object) stackIn_191_0).a(stackIn_191_1, stackIn_191_2 != 0);
            nd.field_b.field_g.b((byte) -122);
            if (null != io.field_c) {
              L75: {
                if (0 == gk.field_kb.field_P) {
                  break L75;
                } else {
                  qg.a(io.field_c.c((byte) 8), param2, false);
                  break L75;
                }
              }
              L76: {
                if (0 == wm.field_d.field_P) {
                  break L76;
                } else {
                  bm.field_o = true;
                  break L76;
                }
              }
              L77: {
                if (ep.field_a.field_P != 0) {
                  of.field_c = true;
                  break L77;
                } else {
                  break L77;
                }
              }
              L78: {
                if (0 != hb.field_eb.field_P) {
                  bm.field_o = false;
                  break L78;
                } else {
                  break L78;
                }
              }
              be.a(false, io.field_c, param2, -1);
              break L74;
            } else {
              break L74;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        tf var5 = null;
        tf var6 = null;
        tf var7 = null;
        Object stackIn_23_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        Object stackOut_32_0 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            t.a(243, 197, 369, 143, 16777215);
            t.d(244, 198, 367, 141, 0);
            if (wg.field_g != null) {
              L1: {
                if (param0 == -19308) {
                  break L1;
                } else {
                  field_p = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = wg.field_g[ae.field_b];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.b(245, 199);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (qe.field_A == null) {
                  break L2;
                } else {
                  int discarded$3 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L2;
                }
              }
              L4: {
                if (ui.field_k <= jn.field_q) {
                  break L4;
                } else {
                  var6 = wg.field_g[jc.field_b];
                  if (var6 != null) {
                    L5: {
                      var2_int = jn.field_q * (var6.field_A - -60) / ui.field_k;
                      var3 = var2_int + -30;
                      if (!pm.field_e) {
                        break L5;
                      } else {
                        kj.a(var3 * -256 / 30, var6, 245, -123, 199, (var6.field_A - var3) * 256 / 30);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    kj.a(256 * (-var3 + var6.field_A) / 30, var6, 245, 89, 199, -256 * var3 / 30);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                L7: {
                  if (null == qe.field_A) {
                    break L7;
                  } else {
                    var2 = null;
                    var3 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (~var3 <= ~wg.field_g.length) {
                            break L10;
                          } else {
                            var7 = wg.field_g[var3];
                            stackOut_22_0 = null;
                            stackIn_33_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var4 != 0) {
                              break L9;
                            } else {
                              L11: {
                                if (stackIn_23_0 != (Object) (Object) var7) {
                                  L12: {
                                    if (var7.field_A != 365) {
                                      break L12;
                                    } else {
                                      if (var7.field_B != 139) {
                                        break L12;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var2 == null) {
                                      break L13;
                                    } else {
                                      var2 = (Object) (Object) (var2 + ", " + var3);
                                      if (var4 == 0) {
                                        break L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var2 = (Object) (Object) Integer.toString(var3);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var3++;
                              if (var4 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
                        break L9;
                      }
                      if (stackIn_33_0 != var2) {
                        int discarded$4 = qe.field_A.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L6;
              }
              break L0;
            } else {
              L14: {
                if (null == qe.field_A) {
                  break L14;
                } else {
                  int discarded$5 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L14;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "no.P(" + param0 + 41);
        }
    }

    final static long d(int param0) {
        if (param0 != 8) {
            field_j = null;
        }
        return -jc.field_c + hm.a(64);
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        mn var8 = null;
        mn var9 = null;
        if (!(param4 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param0) {
            if (((no) this).field_o) {
                if (((no) this).field_i == 2) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((no) this).field_m = param4;
        ((no) this).field_i = 2;
        ((no) this).field_o = true;
        ((no) this).field_l = param0;
        if (param3) {
            return;
        }
        try {
            var8 = this.a(param4, 0, param0, param1);
            var9 = var8;
            var9.field_g[0] = -param0.c(param4) + param2;
            var9.field_g[param4.length()] = param2;
            an.a(param0, 0, (byte) -92, var9, param4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var5 = null;
        RuntimeException var5_ref = null;
        mn var6 = null;
        Object stackIn_2_0 = null;
        mn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var6 = new mn(-param2.field_w + param3, param3 - -param2.field_z, param0.length());
            var5 = var6;
            if (param1 == 0) {
              ((no) this).field_b = new mn[]{var6};
              stackOut_3_0 = (mn) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("no.T(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        mn var7 = null;
        int var6_int = -72 % ((param4 - -70) / 49);
        if (!(param0 != null)) {
            ((no) this).field_b = null;
            return;
        }
        if (((no) this).field_l == param2) {
            if (((no) this).field_o) {
                if (0 == ((no) this).field_i) {
                    if (((no) this).field_m != null) {
                        if (((no) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((no) this).field_o = true;
            ((no) this).field_l = param2;
            ((no) this).field_i = 0;
            ((no) this).field_m = param0;
            var7 = this.a(param0, 0, param2, param1);
            var7.field_g[0] = param3;
            var7.field_g[param0.length()] = param2.c(param0) + param3;
            an.a(param2, 0, (byte) -92, var7, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public no() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
