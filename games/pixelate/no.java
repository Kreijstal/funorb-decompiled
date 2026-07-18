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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_54_0 = 0;
        lo[][] stackIn_59_0 = null;
        lo[][] stackIn_61_0 = null;
        lo[][] stackIn_63_0 = null;
        lo[][] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        String stackIn_170_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_53_0 = 0;
        lo[][] stackOut_58_0 = null;
        lo[][] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        lo[][] stackOut_59_0 = null;
        lo[][] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        byte stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
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
                              var10_ref_int__ = h.field_Z[var9];
                              var11 = 0;
                              stackOut_5_0 = 0;
                              stackIn_54_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                var12 = stackIn_6_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      L11: {
                                        if (var10_ref_int__.length <= var12) {
                                          break L11;
                                        } else {
                                          var13_int = var10_ref_int__[var12];
                                          var14 = var10_ref_int__[1 + var12];
                                          stackOut_8_0 = var13_int;
                                          stackOut_8_1 = -1;
                                          stackIn_39_0 = stackOut_8_0;
                                          stackIn_39_1 = stackOut_8_1;
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
                                      stackOut_38_0 = var10_ref_int__.length;
                                      stackOut_38_1 = var12;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackIn_39_1 = stackOut_38_1;
                                      break L10;
                                    }
                                    L15: while (true) {
                                      if (stackIn_39_0 <= stackIn_39_1) {
                                        break L9;
                                      } else {
                                        var13_int = var10_ref_int__[var12];
                                        stackOut_40_0 = -1;
                                        stackOut_40_1 = var13_int;
                                        stackIn_4_0 = stackOut_40_0;
                                        stackIn_4_1 = stackOut_40_1;
                                        stackIn_41_0 = stackOut_40_0;
                                        stackIn_41_1 = stackOut_40_1;
                                        if (var15 != 0) {
                                          continue L5;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (stackIn_41_0 != stackIn_41_1) {
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
                                            stackOut_38_0 = var10_ref_int__.length;
                                            stackOut_38_1 = var12;
                                            stackIn_39_0 = stackOut_38_0;
                                            stackIn_39_1 = stackOut_38_1;
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
                          stackOut_53_0 = var8_int;
                          stackIn_54_0 = stackOut_53_0;
                          break L6;
                        }
                        L18: {
                          if (stackIn_54_0 == 0) {
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
                  stackOut_58_0 = hc.field_L;
                  stackIn_63_0 = stackOut_58_0;
                  stackIn_59_0 = stackOut_58_0;
                  if (param7 != -1) {
                    stackOut_63_0 = (lo[][]) (Object) stackIn_63_0;
                    stackOut_63_1 = param7 + 4;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    break L19;
                  } else {
                    stackOut_59_0 = (lo[][]) (Object) stackIn_59_0;
                    stackIn_61_0 = stackOut_59_0;
                    stackOut_61_0 = (lo[][]) (Object) stackIn_61_0;
                    stackOut_61_1 = 1;
                    stackIn_64_0 = stackOut_61_0;
                    stackIn_64_1 = stackOut_61_1;
                    break L19;
                  }
                }
                L20: {
                  var8_array = stackIn_64_0[stackIn_64_1];
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
                              if (var10 >= var8_array.length - 1) {
                                break L24;
                              } else {
                                stackOut_70_0 = k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                                stackIn_79_0 = stackOut_70_0;
                                stackIn_71_0 = stackOut_70_0;
                                if (var15 != 0) {
                                  break L23;
                                } else {
                                  L25: {
                                    if (stackIn_71_0 == 0) {
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
                            stackOut_78_0 = param1 + (oe.field_Rb[param7] & 255);
                            stackIn_79_0 = stackOut_78_0;
                            break L23;
                          }
                          param1 = stackIn_79_0;
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
                        stackOut_82_0 = 0;
                        stackOut_82_1 = qm.field_J[var10 / 8] & 1 << (7 & var10);
                        stackIn_162_0 = stackOut_82_0;
                        stackIn_162_1 = stackOut_82_1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L27: {
                            if (stackIn_83_0 == stackIn_83_1) {
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
                        stackOut_95_0 = -1;
                        stackIn_96_0 = stackOut_95_0;
                        break L30;
                      } else {
                        stackOut_92_0 = ia.field_a.length;
                        stackIn_96_0 = stackOut_92_0;
                        stackIn_93_0 = stackOut_92_0;
                        if (var15 != 0) {
                          break L30;
                        } else {
                          stackOut_93_0 = stackIn_93_0;
                          stackIn_97_0 = stackOut_93_0;
                          break L29;
                        }
                      }
                    }
                    stackOut_96_0 = stackIn_96_0 + var8_array.length;
                    stackIn_97_0 = stackOut_96_0;
                    break L29;
                  }
                  L31: {
                    if (stackIn_97_0 <= var11) {
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
                              var13 = var8_array[var11 + 1];
                              if (param3) {
                                break L38;
                              } else {
                                L39: {
                                  if (-1 == param7) {
                                    if (~ia.field_a[var11] != ~io.field_c.field_ec) {
                                      stackOut_121_0 = 0;
                                      stackIn_122_0 = stackOut_121_0;
                                      break L39;
                                    } else {
                                      stackOut_119_0 = 1;
                                      stackIn_122_0 = stackOut_119_0;
                                      break L39;
                                    }
                                  } else {
                                    if (var11 != (io.field_c.field_Eb[param7] & 255)) {
                                      stackOut_117_0 = 0;
                                      stackIn_122_0 = stackOut_117_0;
                                      break L39;
                                    } else {
                                      stackOut_115_0 = 1;
                                      stackIn_122_0 = stackOut_115_0;
                                      break L39;
                                    }
                                  }
                                }
                                var12 = stackIn_122_0;
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
                                  stackOut_134_0 = 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  break L40;
                                }
                              }
                              stackOut_132_0 = 1;
                              stackIn_135_0 = stackOut_132_0;
                              break L40;
                            }
                            var12 = stackIn_135_0;
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
                      if (~(var8_array.length - 1) >= ~var11) {
                        break L2;
                      } else {
                        stackOut_150_0 = 0;
                        stackOut_150_1 = ~param7;
                        stackIn_162_0 = stackOut_150_0;
                        stackIn_162_1 = stackOut_150_1;
                        stackIn_151_0 = stackOut_150_0;
                        stackIn_151_1 = stackOut_150_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L45: {
                            L46: {
                              if (stackIn_151_0 == stackIn_151_1) {
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
              stackOut_161_0 = param2;
              stackOut_161_1 = 67;
              stackIn_162_0 = stackOut_161_0;
              stackIn_162_1 = stackOut_161_1;
              break L1;
            }
            L47: {
              if (stackIn_162_0 > stackIn_162_1) {
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
            stackOut_166_0 = (RuntimeException) var8;
            stackOut_166_1 = new StringBuilder().append("no.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_169_0 = stackOut_166_0;
            stackIn_169_1 = stackOut_166_1;
            stackIn_167_0 = stackOut_166_0;
            stackIn_167_1 = stackOut_166_1;
            if (param6 == null) {
              stackOut_169_0 = (RuntimeException) (Object) stackIn_169_0;
              stackOut_169_1 = (StringBuilder) (Object) stackIn_169_1;
              stackOut_169_2 = "null";
              stackIn_170_0 = stackOut_169_0;
              stackIn_170_1 = stackOut_169_1;
              stackIn_170_2 = stackOut_169_2;
              break L48;
            } else {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "{...}";
              stackIn_170_0 = stackOut_167_0;
              stackIn_170_1 = stackOut_167_1;
              stackIn_170_2 = stackOut_167_2;
              break L48;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_170_0, stackIn_170_2 + ',' + param7 + ')');
        }
    }

    public static void f(int param0) {
        try {
            field_g = null;
            field_n = null;
            field_j = null;
            field_p = null;
            if (param0 != 0) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "no.R(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        oj var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ui.field_i.a(param0, 0);
              if (param1 == 34) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              var2 = td.field_b;
              if (null == var2) {
                break L2;
              } else {
                var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "no.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        String[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        mn stackIn_57_0 = null;
        mn stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        mn stackIn_59_0 = null;
        mn stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        mn stackIn_60_0 = null;
        mn stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        mn stackIn_61_0 = null;
        mn stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        jl stackIn_65_0 = null;
        jl stackIn_67_0 = null;
        jl stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_56_0 = null;
        mn stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        mn stackOut_60_0 = null;
        mn stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        mn stackOut_57_0 = null;
        mn stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        mn stackOut_59_0 = null;
        mn stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        jl stackOut_64_0 = null;
        jl stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        jl stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
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
                var9_array = new String[1 + param3.b(param2, param0)];
                var10 = Math.max(1, param3.a(param2, new int[1], var9_array));
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
                        var11 = (((no) this).field_q + -(var10 * ((no) this).field_e) >> 188935169) + param3.field_w;
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
                  L11: {
                    if (var10 <= var12) {
                      break L11;
                    } else {
                      var13 = var9_array[var12];
                      if (var15 != 0) {
                        break L10;
                      } else {
                        L12: {
                          stackOut_56_0 = null;
                          stackOut_56_1 = null;
                          stackOut_56_2 = var11 - param3.field_w;
                          stackOut_56_3 = var11 - -param3.field_z;
                          stackIn_60_0 = stackOut_56_0;
                          stackIn_60_1 = stackOut_56_1;
                          stackIn_60_2 = stackOut_56_2;
                          stackIn_60_3 = stackOut_56_3;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          stackIn_57_2 = stackOut_56_2;
                          stackIn_57_3 = stackOut_56_3;
                          if (var13 != null) {
                            stackOut_60_0 = null;
                            stackOut_60_1 = null;
                            stackOut_60_2 = stackIn_60_2;
                            stackOut_60_3 = stackIn_60_3;
                            stackOut_60_4 = var13.length();
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            stackIn_61_2 = stackOut_60_2;
                            stackIn_61_3 = stackOut_60_3;
                            stackIn_61_4 = stackOut_60_4;
                            break L12;
                          } else {
                            stackOut_57_0 = null;
                            stackOut_57_1 = null;
                            stackOut_57_2 = stackIn_57_2;
                            stackOut_57_3 = stackIn_57_3;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            stackIn_59_2 = stackOut_57_2;
                            stackIn_59_3 = stackOut_57_3;
                            stackOut_59_0 = null;
                            stackOut_59_1 = null;
                            stackOut_59_2 = stackIn_59_2;
                            stackOut_59_3 = stackIn_59_3;
                            stackOut_59_4 = 0;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            stackIn_61_2 = stackOut_59_2;
                            stackIn_61_3 = stackOut_59_3;
                            stackIn_61_4 = stackOut_59_4;
                            break L12;
                          }
                        }
                        L13: {
                          var14 = new mn(stackIn_61_2, stackIn_61_3, stackIn_61_4);
                          var14.field_g[0] = 0;
                          if (null != var13) {
                            L14: {
                              var14.field_g[var13.length()] = param3.c(var13);
                              stackOut_64_0 = (jl) param3;
                              stackIn_67_0 = stackOut_64_0;
                              stackIn_65_0 = stackOut_64_0;
                              if (param5 != 3) {
                                stackOut_67_0 = (jl) (Object) stackIn_67_0;
                                stackOut_67_1 = 0;
                                stackIn_68_0 = stackOut_67_0;
                                stackIn_68_1 = stackOut_67_1;
                                break L14;
                              } else {
                                stackOut_65_0 = (jl) (Object) stackIn_65_0;
                                stackOut_65_1 = ((no) this).a(var13, param0, param3.c(var13), 60);
                                stackIn_68_0 = stackOut_65_0;
                                stackIn_68_1 = stackOut_65_1;
                                break L14;
                              }
                            }
                            an.a(stackIn_68_0, stackIn_68_1, (byte) -92, var14, var13);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var11 = var11 + param7;
                        ((no) this).field_b[var12] = var14;
                        var12++;
                        if (var15 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  break L10;
                }
                break L0;
              }
            } else {
              ((no) this).field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var9 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var9;
            stackOut_71_1 = new StringBuilder().append("no.K(").append(param0).append(',').append(param1).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L15;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L15;
            }
          }
          L16: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L16;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        RuntimeException var6 = null;
        mn var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (null == param0) {
              ((no) this).field_b = null;
              return;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_g = null;
                  break L1;
                }
              }
              L2: {
                if (((no) this).field_l != param3) {
                  break L2;
                } else {
                  if (!((no) this).field_o) {
                    break L2;
                  } else {
                    if (1 != ((no) this).field_i) {
                      break L2;
                    } else {
                      if (null == ((no) this).field_m) {
                        break L2;
                      } else {
                        if (((no) this).field_m.equals((Object) (Object) param0)) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              ((no) this).field_i = 1;
              ((no) this).field_o = true;
              ((no) this).field_l = param3;
              var6_ref = this.a(param0, 0, param3, param2);
              var7 = param3.c(param0);
              var6_ref.field_g[0] = param4 - (var7 >> -409475647);
              var6_ref.field_g[param0.length()] = param4 + (var7 >> 1100722081);
              an.a(param3, 0, (byte) -92, var6_ref, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("no.Q(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L3;
            }
          }
          L4: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L4;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        ak var5 = null;
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
        uj var18 = null;
        int var18_int = 0;
        int var19 = 0;
        ak stackIn_20_0 = null;
        ak stackIn_21_0 = null;
        ak stackIn_22_0 = null;
        ak stackIn_23_0 = null;
        ak stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_153_0 = 0;
        boolean stackIn_172_0 = false;
        int stackIn_180_0 = 0;
        ak stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        ak stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        ak stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        ak stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        ak stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        ak stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        ak stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        int stackIn_202_2 = 0;
        ak stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        ak stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        ak stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        ak stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        ak stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        ak stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        ak stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        int stackIn_209_2 = 0;
        ak stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        ak stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        ak stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        ak stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        ak stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        ak stackIn_215_0 = null;
        int stackIn_215_1 = 0;
        ak stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        int stackIn_216_2 = 0;
        ak stackOut_19_0 = null;
        ak stackOut_20_0 = null;
        ak stackOut_21_0 = null;
        ak stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ak stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_69_0 = 0;
        boolean stackOut_126_0 = false;
        int stackOut_152_0 = 0;
        boolean stackOut_171_0 = false;
        int stackOut_179_0 = 0;
        ak stackOut_195_0 = null;
        int stackOut_195_1 = 0;
        ak stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        ak stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        ak stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        ak stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        ak stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        ak stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        int stackOut_201_2 = 0;
        ak stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        ak stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        ak stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        ak stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        ak stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        ak stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        ak stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        int stackOut_208_2 = 0;
        ak stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        ak stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        ak stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        ak stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        ak stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        ak stackOut_214_0 = null;
        int stackOut_214_1 = 0;
        int stackOut_214_2 = 0;
        ak stackOut_215_0 = null;
        int stackOut_215_1 = 0;
        int stackOut_215_2 = 0;
        var19 = Pixelate.field_H ? 1 : 0;
        cm.b(h.field_W, 4740);
        if (param1 == 1) {
          L0: {
            if (io.field_c != null) {
              L1: {
                L2: {
                  gk.field_kb.field_rb = true;
                  wm.field_d.field_nb = 0;
                  var5 = wm.field_d;
                  var5.field_K = 0;
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
                    stackOut_19_0 = ep.field_a;
                    stackIn_23_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (!param0) {
                      break L9;
                    } else {
                      stackOut_20_0 = (ak) (Object) stackIn_20_0;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (bo.field_e != 0L) {
                        break L9;
                      } else {
                        stackOut_21_0 = (ak) (Object) stackIn_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        stackOut_22_0 = (ak) (Object) stackIn_22_0;
                        stackOut_22_1 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        break L8;
                      }
                    }
                  }
                  stackOut_23_0 = (ak) (Object) stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L8;
                }
                L10: {
                  stackIn_24_0.field_rb = stackIn_24_1 != 0;
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
                              stackOut_35_0 = 0;
                              stackIn_70_0 = stackOut_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              if (var19 != 0) {
                                break L16;
                              } else {
                                var12 = stackIn_36_0;
                                L18: while (true) {
                                  stackOut_37_0 = ~var12;
                                  stackOut_37_1 = ~h.field_Z.length;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  L19: while (true) {
                                    L20: {
                                      L21: {
                                        if (stackIn_38_0 <= stackIn_38_1) {
                                          break L21;
                                        } else {
                                          var13_array = h.field_Z[var12];
                                          stackOut_39_0 = 0;
                                          stackIn_64_0 = stackOut_39_0;
                                          stackIn_40_0 = stackOut_39_0;
                                          if (var19 != 0) {
                                            break L20;
                                          } else {
                                            var14_int = stackIn_40_0;
                                            L22: while (true) {
                                              L23: {
                                                L24: {
                                                  L25: {
                                                    if (var14_int >= var13_array.length) {
                                                      break L25;
                                                    } else {
                                                      var15 = var13_array[var14_int];
                                                      var16 = var13_array[var14_int + 1];
                                                      stackOut_42_0 = ~var15;
                                                      stackIn_55_0 = stackOut_42_0;
                                                      stackIn_43_0 = stackOut_42_0;
                                                      if (var19 != 0) {
                                                        break L24;
                                                      } else {
                                                        L26: {
                                                          if (stackIn_43_0 == 0) {
                                                            L27: {
                                                              if (var10 == 0) {
                                                                stackOut_50_0 = io.field_c.field_ec;
                                                                stackIn_51_0 = stackOut_50_0;
                                                                break L27;
                                                              } else {
                                                                stackOut_49_0 = io.field_c.field_mc;
                                                                stackIn_51_0 = stackOut_49_0;
                                                                break L27;
                                                              }
                                                            }
                                                            var17_int = stackIn_51_0;
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
                                                  stackOut_54_0 = 0;
                                                  stackIn_55_0 = stackOut_54_0;
                                                  break L24;
                                                }
                                                var15 = stackIn_55_0;
                                                L28: while (true) {
                                                  L29: {
                                                    if (~var13_array.length >= ~var15) {
                                                      break L29;
                                                    } else {
                                                      var16 = var13_array[var15];
                                                      stackOut_57_0 = var16;
                                                      stackOut_57_1 = var14_int;
                                                      stackIn_38_0 = stackOut_57_0;
                                                      stackIn_38_1 = stackOut_57_1;
                                                      stackIn_58_0 = stackOut_57_0;
                                                      stackIn_58_1 = stackOut_57_1;
                                                      if (var19 != 0) {
                                                        continue L19;
                                                      } else {
                                                        L30: {
                                                          if (stackIn_58_0 <= stackIn_58_1) {
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
                                      stackOut_63_0 = var11_int;
                                      stackIn_64_0 = stackOut_63_0;
                                      break L20;
                                    }
                                    L31: {
                                      if (stackIn_64_0 == 0) {
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
                          stackOut_69_0 = ~wo.field_h;
                          stackIn_70_0 = stackOut_69_0;
                          break L16;
                        }
                        if (stackIn_70_0 > -3) {
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
                  if (2 > var10) {
                    break L32;
                  } else {
                    L33: {
                      if (null != jm.field_r) {
                        break L33;
                      } else {
                        if (w.field_z != null) {
                          break L33;
                        } else {
                          if (null != pa.field_a) {
                            break L33;
                          } else {
                            if (oo.field_e != null) {
                              break L33;
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
                    L34: while (true) {
                      L35: {
                        L36: {
                          if (var16 >= fj.field_b) {
                            break L36;
                          } else {
                            var17_int = io.field_c.field_Eb[var16] & 255;
                            if (var19 != 0) {
                              break L35;
                            } else {
                              L37: {
                                if (jm.field_r == null) {
                                  break L37;
                                } else {
                                  if (jm.field_r[var16] == null) {
                                    break L37;
                                  } else {
                                    if (!jm.field_r[var16][var17_int]) {
                                      break L37;
                                    } else {
                                      var11_int = 1;
                                      break L37;
                                    }
                                  }
                                }
                              }
                              L38: {
                                if (w.field_z == null) {
                                  break L38;
                                } else {
                                  if (null != w.field_z[var16]) {
                                    L39: {
                                      var18_int = w.field_z[var16][var17_int];
                                      if (~var18_int < ~var13_int) {
                                        var13_int = var18_int;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    if (var18_int == 0) {
                                      break L38;
                                    } else {
                                      if (fe.field_a) {
                                        break L38;
                                      } else {
                                        var11_int = 1;
                                        break L38;
                                      }
                                    }
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L40: {
                                if (null == pa.field_a) {
                                  break L40;
                                } else {
                                  if (null != pa.field_a[var16]) {
                                    L41: {
                                      var18_int = pa.field_a[var16][var17_int];
                                      if (~var14_int <= ~var18_int) {
                                        break L41;
                                      } else {
                                        var14_int = var18_int;
                                        break L41;
                                      }
                                    }
                                    if (var18_int == 0) {
                                      break L40;
                                    } else {
                                      if (!fe.field_a) {
                                        var11_int = 1;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              L42: {
                                if (oo.field_e == null) {
                                  break L42;
                                } else {
                                  if (null != oo.field_e[var16]) {
                                    var15 = var15 | oo.field_e[var16][var17_int];
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              var16++;
                              if (var19 == 0) {
                                continue L34;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        var16 = 0;
                        break L35;
                      }
                      var17 = ae.field_c.field_Fb.field_L;
                      var18 = (uj) (Object) var17.c(1504642273);
                      L43: while (true) {
                        L44: {
                          L45: {
                            if (null == var18) {
                              break L45;
                            } else {
                              stackOut_126_0 = var18.b((byte) -98);
                              stackIn_153_0 = stackOut_126_0 ? 1 : 0;
                              stackIn_127_0 = stackOut_126_0;
                              if (var19 != 0) {
                                break L44;
                              } else {
                                L46: {
                                  if (stackIn_127_0) {
                                    break L46;
                                  } else {
                                    L47: {
                                      if (var11_int == 0) {
                                        break L47;
                                      } else {
                                        if (!var18.field_Xb) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L45;
                                          } else {
                                            break L47;
                                          }
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                    L48: {
                                      if (~var18.field_Rb > ~var13_int) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L45;
                                        } else {
                                          break L48;
                                        }
                                      } else {
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (~var18.field_Yb > ~var14_int) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L45;
                                        } else {
                                          break L49;
                                        }
                                      } else {
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      if ((~var18.field_Ib & var15) > 0) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L45;
                                        } else {
                                          break L50;
                                        }
                                      } else {
                                        break L50;
                                      }
                                    }
                                    if (var12 != 0) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                var18 = (uj) (Object) var17.f(1504642273);
                                if (var19 == 0) {
                                  continue L43;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                          stackOut_152_0 = -3;
                          stackIn_153_0 = stackOut_152_0;
                          break L44;
                        }
                        L51: {
                          if (stackIn_153_0 < ~wo.field_h) {
                            break L51;
                          } else {
                            if (bc.field_m[12]) {
                              var16 = 0;
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                        }
                        L52: {
                          if (var16 != 0) {
                            ep.field_a.field_rb = false;
                            if (!ep.field_a.field_R) {
                              break L52;
                            } else {
                              L53: {
                                if (0 != nd.field_b.field_g.field_Jb) {
                                  break L53;
                                } else {
                                  up.field_o = pc.field_u;
                                  if (var19 == 0) {
                                    break L52;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                              up.field_o = sd.a(li.field_b, 107, new String[1]);
                              break L52;
                            }
                          } else {
                            break L52;
                          }
                        }
                        if (var19 == 0) {
                          break L1;
                        } else {
                          break L32;
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
                  L54: while (true) {
                    L55: {
                      L56: {
                        if (var13_int >= fj.field_b) {
                          break L56;
                        } else {
                          stackOut_171_0 = lc.field_t[var13_int];
                          stackIn_180_0 = stackOut_171_0 ? 1 : 0;
                          stackIn_172_0 = stackOut_171_0;
                          if (var19 != 0) {
                            break L55;
                          } else {
                            L57: {
                              if (stackIn_172_0) {
                                L58: {
                                  var14 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                                  if (var11 == null) {
                                    break L58;
                                  } else {
                                    var11 = (Object) (Object) ((String) var11 + ", " + var14);
                                    var12 = 1;
                                    if (var19 == 0) {
                                      break L57;
                                    } else {
                                      break L58;
                                    }
                                  }
                                }
                                var11 = (Object) (Object) var14;
                                break L57;
                              } else {
                                break L57;
                              }
                            }
                            var13_int++;
                            if (var19 == 0) {
                              continue L54;
                            } else {
                              break L56;
                            }
                          }
                        }
                      }
                      stackOut_179_0 = 0;
                      stackIn_180_0 = stackOut_179_0;
                      break L55;
                    }
                    L59: {
                      if (stackIn_180_0 == var10) {
                        L60: {
                          var13 = ji.field_a;
                          if (var12 != 0) {
                            break L60;
                          } else {
                            var14 = sd.a(sm.field_n, 80, new String[1]);
                            if (var19 == 0) {
                              break L59;
                            } else {
                              break L60;
                            }
                          }
                        }
                        var14 = cf.field_x + (String) var11;
                        break L59;
                      } else {
                        L61: {
                          var13 = aq.field_c;
                          if (var12 != 0) {
                            break L61;
                          } else {
                            var14 = sd.a(ff.field_b, 31, new String[1]);
                            if (var19 == 0) {
                              break L59;
                            } else {
                              break L61;
                            }
                          }
                        }
                        var14 = fg.field_b + (String) var11;
                        break L59;
                      }
                    }
                    up.field_o = "<col=A00000>" + var13 + "<br>" + var14;
                    break L1;
                  }
                }
              }
              L62: {
                if (0L != bo.field_e) {
                  L63: {
                    var9 = (int)(-hm.a(64) + bo.field_e);
                    var9 = (var9 + 999) / 1000;
                    if (var9 < 1) {
                      var9 = 1;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                  var8.field_cb = sd.a(ao.field_i, 100, new String[1]);
                  break L62;
                } else {
                  break L62;
                }
              }
              qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[2]);
              break L0;
            } else {
              break L0;
            }
          }
          L64: {
            L65: {
              stackOut_195_0 = ff.field_h;
              stackOut_195_1 = -28476;
              stackIn_201_0 = stackOut_195_0;
              stackIn_201_1 = stackOut_195_1;
              stackIn_196_0 = stackOut_195_0;
              stackIn_196_1 = stackOut_195_1;
              if (!param4) {
                break L65;
              } else {
                stackOut_196_0 = (ak) (Object) stackIn_196_0;
                stackOut_196_1 = stackIn_196_1;
                stackIn_201_0 = stackOut_196_0;
                stackIn_201_1 = stackOut_196_1;
                stackIn_197_0 = stackOut_196_0;
                stackIn_197_1 = stackOut_196_1;
                if (param3) {
                  break L65;
                } else {
                  stackOut_197_0 = (ak) (Object) stackIn_197_0;
                  stackOut_197_1 = stackIn_197_1;
                  stackIn_198_0 = stackOut_197_0;
                  stackIn_198_1 = stackOut_197_1;
                  stackOut_198_0 = (ak) (Object) stackIn_198_0;
                  stackOut_198_1 = stackIn_198_1;
                  stackIn_201_0 = stackOut_198_0;
                  stackIn_201_1 = stackOut_198_1;
                  stackIn_199_0 = stackOut_198_0;
                  stackIn_199_1 = stackOut_198_1;
                  if (bm.field_o) {
                    break L65;
                  } else {
                    stackOut_199_0 = (ak) (Object) stackIn_199_0;
                    stackOut_199_1 = stackIn_199_1;
                    stackIn_200_0 = stackOut_199_0;
                    stackIn_200_1 = stackOut_199_1;
                    stackOut_200_0 = (ak) (Object) stackIn_200_0;
                    stackOut_200_1 = stackIn_200_1;
                    stackOut_200_2 = 1;
                    stackIn_202_0 = stackOut_200_0;
                    stackIn_202_1 = stackOut_200_1;
                    stackIn_202_2 = stackOut_200_2;
                    break L64;
                  }
                }
              }
            }
            stackOut_201_0 = (ak) (Object) stackIn_201_0;
            stackOut_201_1 = stackIn_201_1;
            stackOut_201_2 = 0;
            stackIn_202_0 = stackOut_201_0;
            stackIn_202_1 = stackOut_201_1;
            stackIn_202_2 = stackOut_201_2;
            break L64;
          }
          L66: {
            L67: {
              ((ak) (Object) stackIn_202_0).a(stackIn_202_1, stackIn_202_2 != 0);
              stackOut_202_0 = ai.field_A;
              stackOut_202_1 = -28476;
              stackIn_208_0 = stackOut_202_0;
              stackIn_208_1 = stackOut_202_1;
              stackIn_203_0 = stackOut_202_0;
              stackIn_203_1 = stackOut_202_1;
              if (!param4) {
                break L67;
              } else {
                stackOut_203_0 = (ak) (Object) stackIn_203_0;
                stackOut_203_1 = stackIn_203_1;
                stackIn_208_0 = stackOut_203_0;
                stackIn_208_1 = stackOut_203_1;
                stackIn_204_0 = stackOut_203_0;
                stackIn_204_1 = stackOut_203_1;
                if (param3) {
                  break L67;
                } else {
                  stackOut_204_0 = (ak) (Object) stackIn_204_0;
                  stackOut_204_1 = stackIn_204_1;
                  stackIn_205_0 = stackOut_204_0;
                  stackIn_205_1 = stackOut_204_1;
                  stackOut_205_0 = (ak) (Object) stackIn_205_0;
                  stackOut_205_1 = stackIn_205_1;
                  stackIn_208_0 = stackOut_205_0;
                  stackIn_208_1 = stackOut_205_1;
                  stackIn_206_0 = stackOut_205_0;
                  stackIn_206_1 = stackOut_205_1;
                  if (bm.field_o) {
                    break L67;
                  } else {
                    stackOut_206_0 = (ak) (Object) stackIn_206_0;
                    stackOut_206_1 = stackIn_206_1;
                    stackIn_207_0 = stackOut_206_0;
                    stackIn_207_1 = stackOut_206_1;
                    stackOut_207_0 = (ak) (Object) stackIn_207_0;
                    stackOut_207_1 = stackIn_207_1;
                    stackOut_207_2 = 1;
                    stackIn_209_0 = stackOut_207_0;
                    stackIn_209_1 = stackOut_207_1;
                    stackIn_209_2 = stackOut_207_2;
                    break L66;
                  }
                }
              }
            }
            stackOut_208_0 = (ak) (Object) stackIn_208_0;
            stackOut_208_1 = stackIn_208_1;
            stackOut_208_2 = 0;
            stackIn_209_0 = stackOut_208_0;
            stackIn_209_1 = stackOut_208_1;
            stackIn_209_2 = stackOut_208_2;
            break L66;
          }
          L68: {
            L69: {
              ((ak) (Object) stackIn_209_0).a(stackIn_209_1, stackIn_209_2 != 0);
              stackOut_209_0 = ra.field_e;
              stackOut_209_1 = -28476;
              stackIn_215_0 = stackOut_209_0;
              stackIn_215_1 = stackOut_209_1;
              stackIn_210_0 = stackOut_209_0;
              stackIn_210_1 = stackOut_209_1;
              if (!param4) {
                break L69;
              } else {
                stackOut_210_0 = (ak) (Object) stackIn_210_0;
                stackOut_210_1 = stackIn_210_1;
                stackIn_215_0 = stackOut_210_0;
                stackIn_215_1 = stackOut_210_1;
                stackIn_211_0 = stackOut_210_0;
                stackIn_211_1 = stackOut_210_1;
                if (param3) {
                  break L69;
                } else {
                  stackOut_211_0 = (ak) (Object) stackIn_211_0;
                  stackOut_211_1 = stackIn_211_1;
                  stackIn_212_0 = stackOut_211_0;
                  stackIn_212_1 = stackOut_211_1;
                  stackOut_212_0 = (ak) (Object) stackIn_212_0;
                  stackOut_212_1 = stackIn_212_1;
                  stackIn_215_0 = stackOut_212_0;
                  stackIn_215_1 = stackOut_212_1;
                  stackIn_213_0 = stackOut_212_0;
                  stackIn_213_1 = stackOut_212_1;
                  if (!bm.field_o) {
                    break L69;
                  } else {
                    stackOut_213_0 = (ak) (Object) stackIn_213_0;
                    stackOut_213_1 = stackIn_213_1;
                    stackIn_214_0 = stackOut_213_0;
                    stackIn_214_1 = stackOut_213_1;
                    stackOut_214_0 = (ak) (Object) stackIn_214_0;
                    stackOut_214_1 = stackIn_214_1;
                    stackOut_214_2 = 1;
                    stackIn_216_0 = stackOut_214_0;
                    stackIn_216_1 = stackOut_214_1;
                    stackIn_216_2 = stackOut_214_2;
                    break L68;
                  }
                }
              }
            }
            stackOut_215_0 = (ak) (Object) stackIn_215_0;
            stackOut_215_1 = stackIn_215_1;
            stackOut_215_2 = 0;
            stackIn_216_0 = stackOut_215_0;
            stackIn_216_1 = stackOut_215_1;
            stackIn_216_2 = stackOut_215_2;
            break L68;
          }
          L70: {
            ((ak) (Object) stackIn_216_0).a(stackIn_216_1, stackIn_216_2 != 0);
            nd.field_b.field_g.b((byte) -122);
            if (null != io.field_c) {
              L71: {
                if (0 == gk.field_kb.field_P) {
                  break L71;
                } else {
                  qg.a(io.field_c.c((byte) 8), param2, false);
                  break L71;
                }
              }
              L72: {
                if (0 == wm.field_d.field_P) {
                  break L72;
                } else {
                  bm.field_o = true;
                  break L72;
                }
              }
              L73: {
                if (ep.field_a.field_P != 0) {
                  of.field_c = true;
                  break L73;
                } else {
                  break L73;
                }
              }
              L74: {
                if (0 != hb.field_eb.field_P) {
                  bm.field_o = false;
                  break L74;
                } else {
                  break L74;
                }
              }
              be.a(false, io.field_c, param2, -1);
              break L70;
            } else {
              break L70;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        tf var1_ref = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_50_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_33_0 = null;
        Object stackOut_49_0 = null;
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
                  var1_ref = wg.field_g[ae.field_b];
                  if (null == var1_ref) {
                    break L3;
                  } else {
                    var1_ref.b(245, 199);
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
                  var1_ref = wg.field_g[jc.field_b];
                  if (null != var1_ref) {
                    L5: {
                      var2_int = jn.field_q * (var1_ref.field_A - -60) / ui.field_k;
                      var3 = var2_int + -30;
                      if (!pm.field_e) {
                        break L5;
                      } else {
                        kj.a(var3 * -256 / 30, var1_ref, 245, -123, 199, (var1_ref.field_A - var3) * 256 / 30);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    kj.a(256 * (-var3 + var1_ref.field_A) / 30, var1_ref, 245, 89, 199, -256 * var3 / 30);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (null == qe.field_A) {
                  break L6;
                } else {
                  var2 = null;
                  var3 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (~var3 <= ~wg.field_g.length) {
                          break L9;
                        } else {
                          var1_ref = wg.field_g[var3];
                          stackOut_33_0 = null;
                          stackIn_50_0 = stackOut_33_0;
                          stackIn_34_0 = stackOut_33_0;
                          if (var4 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (stackIn_34_0 != (Object) (Object) var1_ref) {
                                L11: {
                                  if (var1_ref.field_A != 365) {
                                    break L11;
                                  } else {
                                    if (var1_ref.field_B != 139) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L12: {
                                  if (null == var2) {
                                    break L12;
                                  } else {
                                    var2 = (Object) (Object) ((String) var2 + ", " + var3);
                                    if (var4 == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                var2 = (Object) (Object) Integer.toString(var3);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_49_0 = null;
                      stackIn_50_0 = stackOut_49_0;
                      break L8;
                    }
                    if (stackIn_50_0 != var2) {
                      int discarded$4 = qe.field_A.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              break L0;
            } else {
              L13: {
                if (null == qe.field_A) {
                  break L13;
                } else {
                  int discarded$5 = qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L13;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "no.P(" + param0 + ')');
        }
    }

    final static long d(int param0) {
        RuntimeException var1 = null;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            stackOut_3_0 = -jc.field_c + hm.a(64);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "no.O(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        RuntimeException runtimeException = null;
        mn var6 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (param4 == null) {
              ((no) this).field_b = null;
              return;
            } else {
              L1: {
                if (((no) this).field_l != param0) {
                  break L1;
                } else {
                  if (!((no) this).field_o) {
                    break L1;
                  } else {
                    if (((no) this).field_i != 2) {
                      break L1;
                    } else {
                      if (((no) this).field_m == null) {
                        break L1;
                      } else {
                        if (!((no) this).field_m.equals((Object) (Object) param4)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              ((no) this).field_m = param4;
              ((no) this).field_i = 2;
              ((no) this).field_o = true;
              ((no) this).field_l = param0;
              if (!param3) {
                var6 = this.a(param4, 0, param0, param1);
                var6.field_g[0] = -param0.c(param4) + param2;
                var6.field_g[param4.length()] = param2;
                an.a(param0, 0, (byte) -92, var6, param4);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) runtimeException;
            stackOut_23_1 = new StringBuilder().append("no.J(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L2;
            }
          }
          L3: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        mn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        mn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var5 = new mn(-param2.field_w + param3, param3 - -param2.field_z, param0.length());
            if (param1 == 0) {
              ((no) this).field_b = new mn[]{var5};
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
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        mn var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var6_int = -72 % ((param4 - -70) / 49);
            if (param0 == null) {
              ((no) this).field_b = null;
              return;
            } else {
              L1: {
                if (((no) this).field_l != param2) {
                  break L1;
                } else {
                  if (!((no) this).field_o) {
                    break L1;
                  } else {
                    if (0 != ((no) this).field_i) {
                      break L1;
                    } else {
                      if (((no) this).field_m == null) {
                        break L1;
                      } else {
                        if (!((no) this).field_m.equals((Object) (Object) param0)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              ((no) this).field_o = true;
              ((no) this).field_l = param2;
              ((no) this).field_i = 0;
              ((no) this).field_m = param0;
              var7 = this.a(param0, 0, param2, param1);
              var7.field_g[0] = param3;
              var7.field_g[param0.length()] = param2.c(param0) + param3;
              an.a(param2, 0, (byte) -92, var7, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) runtimeException;
            stackOut_21_1 = new StringBuilder().append("no.L(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L2;
            }
          }
          L3: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
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
