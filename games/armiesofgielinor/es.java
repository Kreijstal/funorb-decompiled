/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[][][] field_c;
    static ru[] field_d;
    int field_a;
    static String field_b;
    private og[] field_e;

    final og a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 13) {
            discarded$0 = this.a(97);
        }
        int fieldTemp$1 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_e[fieldTemp$1];
    }

    public static void b(int param0) {
        if (param0 > -13) {
            es.b(-31);
        }
        field_b = null;
        field_d = null;
        field_c = (String[][][]) null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (mg.field_e.field_q < param1) {
              if (param0 < -63) {
                if (null == am.field_z) {
                  return false;
                } else {
                  try {
                    L0: {
                      var2_int = am.field_z.d((byte) 43);
                      if (-1 <= (var2_int ^ -1)) {
                        L1: {
                          if (0 > var2_int) {
                            break L1;
                          } else {
                            if (ca.b(0) <= 30000L) {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                        dj.a((byte) -127);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L2: {
                          if (param1 + -mg.field_e.field_q < var2_int) {
                            var2_int = -mg.field_e.field_q + param1;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        am.field_z.a(0, mg.field_e.field_q, var2_int, mg.field_e.field_o);
                        iq.field_h = vi.b(46);
                        mg.field_e.field_q = mg.field_e.field_q + var2_int;
                        if ((mg.field_e.field_q ^ -1) > (param1 ^ -1)) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          mg.field_e.field_q = 0;
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      dj.a((byte) -127);
                      decompiledRegionSelector0 = 3;
                      break L3;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      return stackIn_16_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 2) {
                        return false;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 <= 109) {
            field_d = (ru[]) null;
        }
        return (this.field_a ^ -1) <= (this.field_e.length ^ -1) ? true : false;
    }

    final static void a(int param0, int param1, au param2, int param3, boolean param4, int param5, byte param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        nf[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        nf var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_35_0 = 0;
        nf[][] stackIn_40_0 = null;
        nf[][] stackIn_41_0 = null;
        nf[][] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_90_0 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        int decompiledRegionSelector0 = 0;
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
        int stackOut_34_0 = 0;
        nf[][] stackOut_39_0 = null;
        nf[][] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        nf[][] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var8_int = -49 % ((2 - param6) / 56);
                  if (param3 < param1) {
                    break L3;
                  } else {
                    var9_int = 1;
                    var10 = 0;
                    L4: while (true) {
                      stackOut_3_0 = fs.field_d.length;
                      stackOut_3_1 = var10;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (stackIn_4_0 <= stackIn_4_1) {
                              break L7;
                            } else {
                              var18 = fs.field_d[var10];
                              var17 = var18;
                              var11_ref_int__ = var17;
                              var12 = 0;
                              stackOut_5_0 = 0;
                              stackIn_35_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var16 != 0) {
                                break L6;
                              } else {
                                var13 = stackIn_6_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      L11: {
                                        if (var13 >= var18.length) {
                                          break L11;
                                        } else {
                                          var14_int = var18[var13];
                                          var15 = var11_ref_int__[var13 - -1];
                                          stackOut_8_0 = -1;
                                          stackOut_8_1 = var14_int;
                                          stackIn_25_0 = stackOut_8_0;
                                          stackIn_25_1 = stackOut_8_1;
                                          stackIn_9_0 = stackOut_8_0;
                                          stackIn_9_1 = stackOut_8_1;
                                          if (var16 != 0) {
                                            break L10;
                                          } else {
                                            L12: {
                                              if (stackIn_9_0 != stackIn_9_1) {
                                                L13: {
                                                  if ((var14_int ^ -1) != (param3 ^ -1)) {
                                                    break L13;
                                                  } else {
                                                    if ((var15 ^ -1) != (param5 ^ -1)) {
                                                      break L13;
                                                    } else {
                                                      var12 = 1;
                                                      if (var16 == 0) {
                                                        break L12;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                }
                                                if ((param3 ^ -1) >= (var14_int ^ -1)) {
                                                  break L9;
                                                } else {
                                                  if (var15 != (255 & ur.field_B[var14_int])) {
                                                    break L9;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              } else {
                                                if ((var15 ^ -1) != (lm.field_e[param7] ^ -1)) {
                                                  break L9;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            var13 += 2;
                                            if (var16 == 0) {
                                              continue L8;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      L14: {
                                        if (var12 != 0) {
                                          break L14;
                                        } else {
                                          if ((param3 ^ -1) != (tq.field_b ^ -1)) {
                                            break L9;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      var9_int = 0;
                                      var13 = 0;
                                      stackOut_24_0 = var18.length ^ -1;
                                      stackOut_24_1 = var13 ^ -1;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      break L10;
                                    }
                                    L15: while (true) {
                                      if (stackIn_25_0 >= stackIn_25_1) {
                                        break L9;
                                      } else {
                                        var14_int = var18[var13];
                                        stackOut_26_0 = var14_int;
                                        stackOut_26_1 = -1;
                                        stackIn_4_0 = stackOut_26_0;
                                        stackIn_4_1 = stackOut_26_1;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        if (var16 != 0) {
                                          continue L5;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (stackIn_27_0 == stackIn_27_1) {
                                                break L17;
                                              } else {
                                                if (param3 > var14_int) {
                                                  dt.field_d[var14_int] = true;
                                                  if (var16 == 0) {
                                                    break L16;
                                                  } else {
                                                    break L17;
                                                  }
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            jp.field_a = true;
                                            break L16;
                                          }
                                          var13 += 2;
                                          if (var16 == 0) {
                                            stackOut_24_0 = var18.length ^ -1;
                                            stackOut_24_1 = var13 ^ -1;
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
                                  var10++;
                                  if (var16 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_34_0 = var9_int;
                          stackIn_35_0 = stackOut_34_0;
                          break L6;
                        }
                        L18: {
                          if (stackIn_35_0 != 0) {
                            fc.field_a = true;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        if (var16 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L19: {
                  stackOut_39_0 = pu.field_k;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_40_0 = stackOut_39_0;
                  if ((param3 ^ -1) != 0) {
                    stackOut_41_0 = (nf[][]) ((Object) stackIn_41_0);
                    stackOut_41_1 = 4 + param3;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    break L19;
                  } else {
                    stackOut_40_0 = (nf[][]) ((Object) stackIn_40_0);
                    stackOut_40_1 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    break L19;
                  }
                }
                L20: {
                  L21: {
                    var9 = stackIn_42_0[stackIn_42_1];
                    var10 = 1;
                    if (!param4) {
                      break L21;
                    } else {
                      L22: {
                        if (0 == (param3 ^ -1)) {
                          break L22;
                        } else {
                          var11 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if ((var9.length + -1 ^ -1) >= (var11 ^ -1)) {
                                  break L25;
                                } else {
                                  stackOut_46_0 = tg.field_d[(var11 + param0) / 8] & 1 << (param0 - -var11 & 7);
                                  stackIn_52_0 = stackOut_46_0;
                                  stackIn_47_0 = stackOut_46_0;
                                  if (var16 != 0) {
                                    break L24;
                                  } else {
                                    L26: {
                                      if (stackIn_47_0 == 0) {
                                        break L26;
                                      } else {
                                        var10 = 0;
                                        if (var16 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var11++;
                                    if (var16 == 0) {
                                      continue L23;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              stackOut_51_0 = param0 + (255 & t.field_b[param3]);
                              stackIn_52_0 = stackOut_51_0;
                              break L24;
                            }
                            param0 = stackIn_52_0;
                            if (var16 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      var11 = 0;
                      L27: while (true) {
                        if ((var11 ^ -1) <= (lm.field_e.length ^ -1)) {
                          break L21;
                        } else {
                          stackOut_55_0 = ln.field_d[var11 / 8] & 1 << (var11 & 7) ^ -1;
                          stackIn_61_0 = stackOut_55_0;
                          stackIn_56_0 = stackOut_55_0;
                          if (var16 != 0) {
                            break L20;
                          } else {
                            L28: {
                              if (stackIn_56_0 == -1) {
                                break L28;
                              } else {
                                var10 = 0;
                                if (var16 == 0) {
                                  break L21;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var11++;
                            if (var16 == 0) {
                              continue L27;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                  }
                  var11 = 0;
                  stackOut_60_0 = 0;
                  stackIn_61_0 = stackOut_60_0;
                  break L20;
                }
                var12 = stackIn_61_0;
                L29: while (true) {
                  L30: {
                    L31: {
                      if (0 != (param3 ^ -1)) {
                        stackOut_65_0 = -1;
                        stackIn_66_0 = stackOut_65_0;
                        break L31;
                      } else {
                        stackOut_63_0 = lm.field_e.length;
                        stackIn_66_0 = stackOut_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        if (var16 != 0) {
                          break L31;
                        } else {
                          stackOut_64_0 = stackIn_64_0;
                          stackIn_67_0 = stackOut_64_0;
                          break L30;
                        }
                      }
                    }
                    stackOut_66_0 = stackIn_66_0 + var9.length;
                    stackIn_67_0 = stackOut_66_0;
                    break L30;
                  }
                  L32: {
                    if ((stackIn_67_0 ^ -1) >= (var12 ^ -1)) {
                      break L32;
                    } else {
                      L33: {
                        L34: {
                          if (param3 == -1) {
                            break L34;
                          } else {
                            ur.field_B[param3] = (byte)var12;
                            if (var16 == 0) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        param7 = var12;
                        break L33;
                      }
                      L35: {
                        L36: {
                          L37: {
                            if (0 != (param3 ^ -1)) {
                              break L37;
                            } else {
                              if ((lm.field_e.length ^ -1) == -2) {
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            L39: {
                              var14 = var9[1 + var12];
                              if (param4) {
                                break L39;
                              } else {
                                L40: {
                                  if ((param3 ^ -1) == 0) {
                                    if ((vu.field_M.field_nc ^ -1) != (lm.field_e[var12] ^ -1)) {
                                      stackOut_82_0 = 0;
                                      stackIn_83_0 = stackOut_82_0;
                                      break L40;
                                    } else {
                                      stackOut_81_0 = 1;
                                      stackIn_83_0 = stackOut_81_0;
                                      break L40;
                                    }
                                  } else {
                                    if ((vu.field_M.field_pc[param3] & 255) != var12) {
                                      stackOut_79_0 = 0;
                                      stackIn_83_0 = stackOut_79_0;
                                      break L40;
                                    } else {
                                      stackOut_78_0 = 1;
                                      stackIn_83_0 = stackOut_78_0;
                                      break L40;
                                    }
                                  }
                                }
                                var13 = stackIn_83_0;
                                if (var16 == 0) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            L41: {
                              L42: {
                                if (var14.field_rb) {
                                  break L42;
                                } else {
                                  L43: {
                                    if (var10 == 0) {
                                      break L43;
                                    } else {
                                      if (!var14.field_xb) {
                                        break L43;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  stackOut_89_0 = 0;
                                  stackIn_90_0 = stackOut_89_0;
                                  break L41;
                                }
                              }
                              stackOut_88_0 = 1;
                              stackIn_90_0 = stackOut_88_0;
                              break L41;
                            }
                            var13 = stackIn_90_0;
                            break L38;
                          }
                          if (var16 == 0) {
                            break L35;
                          } else {
                            break L36;
                          }
                        }
                        var13 = 1;
                        break L35;
                      }
                      L44: {
                        if (var13 == 0) {
                          break L44;
                        } else {
                          es.a(param0, param1, param2, param3 - -1, param4, param5, (byte) 120, param7);
                          var11 = 1;
                          break L44;
                        }
                      }
                      if (!fc.field_a) {
                        var12++;
                        if (var16 == 0) {
                          continue L29;
                        } else {
                          break L32;
                        }
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  if (var11 != 0) {
                    break L2;
                  } else {
                    var12 = 0;
                    L45: while (true) {
                      if (var12 >= var9.length - 1) {
                        break L2;
                      } else {
                        if (var16 != 0) {
                          break L1;
                        } else {
                          L46: {
                            L47: {
                              if (-1 != param3) {
                                break L47;
                              } else {
                                param7 = var12;
                                if (var16 == 0) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            ur.field_B[param3] = (byte)var12;
                            break L46;
                          }
                          es.a(param0, param1, param2, param3 + 1, param4, param5, (byte) -72, param7);
                          if (fc.field_a) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var12++;
                            if (var16 == 0) {
                              continue L45;
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
              break L1;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var8 = decompiledCaughtException;
            stackOut_110_0 = (RuntimeException) (var8);
            stackOut_110_1 = new StringBuilder().append("es.B(").append(param0).append(',').append(param1).append(',');
            stackIn_112_0 = stackOut_110_0;
            stackIn_112_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param2 == null) {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L48;
            } else {
              stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackOut_111_2 = "{...}";
              stackIn_113_0 = stackOut_111_0;
              stackIn_113_1 = stackOut_111_1;
              stackIn_113_2 = stackOut_111_2;
              break L48;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_113_0), stackIn_113_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    es(at param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        og var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_a = 0;
        try {
          L0: {
            this.field_e = new og[param0.b(false)];
            var2_int = 0;
            var3 = (og) ((Object) param0.e((byte) 105));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  var3.d(121);
                  incrementValue$2 = var2_int;
                  var2_int++;
                  this.field_e[incrementValue$2] = var3;
                  var3 = (og) ((Object) param0.a((byte) 123));
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("es.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_c = new String[][][]{new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, "movement_range", null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null}, new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{"key_space", "key_arrows", "key_esc"}}};
        field_b = "Load Mission";
    }
}
