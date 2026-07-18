/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ue {
    static int field_a;
    ol[] field_b;
    static ii[] field_c;

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 124) {
                break L1;
              } else {
                int discarded$2 = ((ue) this).b(-103, -63);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((ue) this).field_b) {
                  break L3;
                } else {
                  if (((ue) this).field_b.length <= 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = ((ue) this).field_b[-1 + ((ue) this).field_b.length].field_f + -((ue) this).field_b[0].field_a;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ue.H(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final int c(int param0, int param1) {
        ol[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ol var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3 = ((ue) this).field_b;
            var4 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3.length <= var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_3_0 = param1;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 < var5.field_g.length) {
                        stackOut_9_0 = var5.field_g[param1];
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        param1 = param1 - (var5.field_g.length - 1);
                        var4++;
                        if (var6 == 0) {
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3_ref, "ue.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(byte param0) {
        try {
            field_c = null;
            if (param0 != 18) {
                field_a = -77;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ue.F(" + param0 + ')');
        }
    }

    final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ol[] var4 = null;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 119 / ((param0 - 61) / 46);
              var3 = -1;
              if (((ue) this).field_b != null) {
                var4 = ((ue) this).field_b;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4.length) {
                    break L1;
                  } else {
                    L3: {
                      var6 = var4[var5];
                      if (var6 != null) {
                        var7 = var6.a(-44);
                        if (~var3 <= ~var7) {
                          break L3;
                        } else {
                          var3 = var7;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            stackOut_12_0 = var3;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ue.I(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        sj var1_ref = null;
        sj var2 = null;
        int var2_int = 0;
        String var3 = null;
        sj var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        sj stackIn_7_0 = null;
        String stackIn_19_0 = null;
        sj stackIn_24_0 = null;
        String stackIn_35_0 = null;
        String stackIn_52_0 = null;
        sj stackIn_57_0 = null;
        Object stackIn_59_0 = null;
        sj stackIn_59_1 = null;
        sj stackIn_72_0 = null;
        Object stackIn_86_0 = null;
        sj stackIn_86_1 = null;
        sj stackIn_93_0 = null;
        Object stackIn_97_0 = null;
        sj stackIn_97_1 = null;
        sj stackIn_106_0 = null;
        sj stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        sj stackIn_116_1 = null;
        sj stackIn_121_0 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_6_0 = null;
        String stackOut_18_0 = null;
        String stackOut_16_0 = null;
        sj stackOut_23_0 = null;
        String stackOut_32_0 = null;
        String stackOut_34_0 = null;
        String stackOut_49_0 = null;
        String stackOut_51_0 = null;
        sj stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        sj stackOut_58_1 = null;
        sj stackOut_71_0 = null;
        Object stackOut_85_0 = null;
        sj stackOut_85_1 = null;
        sj stackOut_92_0 = null;
        Object stackOut_96_0 = null;
        sj stackOut_96_1 = null;
        sj stackOut_114_0 = null;
        Object stackOut_115_0 = null;
        sj stackOut_115_1 = null;
        sj stackOut_105_0 = null;
        sj stackOut_120_0 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (2 <= va.field_j) {
              var1_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var1_int >= 12) {
                      break L3;
                    } else {
                      var2 = od.field_g.field_e[var1_int];
                      stackOut_6_0 = (sj) var2;
                      stackIn_57_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 == null) {
                            break L4;
                          } else {
                            L5: {
                              L6: {
                                if (var2.field_o != od.field_g) {
                                  break L6;
                                } else {
                                  if (var1_int == var2.field_t) {
                                    stackOut_18_0 = "";
                                    stackIn_19_0 = stackOut_18_0;
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              stackOut_16_0 = "; believes itself to be at " + ac.a(38, var2.field_o) + "[" + var2.field_t + "]";
                              stackIn_19_0 = stackOut_16_0;
                              break L5;
                            }
                            var3 = stackIn_19_0;
                            System.out.println("submission_rack[" + var1_int + "]=" + var2.field_i + " with dest " + var2.field_g + "," + var2.field_p + var3);
                            var2.field_g = -2147483648;
                            break L4;
                          }
                        }
                        var1_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var1_int = 0;
                  L7: while (true) {
                    L8: {
                      if (12 <= var1_int) {
                        break L8;
                      } else {
                        var2 = wk.field_a.field_e[var1_int];
                        stackOut_23_0 = (sj) var2;
                        stackIn_57_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L9: {
                            if (stackIn_24_0 != null) {
                              L10: {
                                L11: {
                                  if (var2.field_o != wk.field_a) {
                                    break L11;
                                  } else {
                                    if (~var2.field_t != ~var1_int) {
                                      break L11;
                                    } else {
                                      stackOut_32_0 = "";
                                      stackIn_35_0 = stackOut_32_0;
                                      break L10;
                                    }
                                  }
                                }
                                stackOut_34_0 = "; believes itself to be at " + ac.a(97, var2.field_o) + "[" + var2.field_t + "]";
                                stackIn_35_0 = stackOut_34_0;
                                break L10;
                              }
                              var3 = stackIn_35_0;
                              System.out.println("carryover_rack[" + var1_int + "]=" + var2.field_i + " with dest " + var2.field_g + "," + var2.field_p + var3);
                              var2.field_g = -2147483648;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var1_int++;
                          if (var4 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var1_int = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (var1_int >= 8) {
                            break L14;
                          } else {
                            var2 = si.field_i.field_e[var1_int];
                            if (var4 != 0) {
                              break L13;
                            } else {
                              L15: {
                                if (null == var2) {
                                  break L15;
                                } else {
                                  L16: {
                                    L17: {
                                      if (si.field_i != var2.field_o) {
                                        break L17;
                                      } else {
                                        if (~var2.field_t != ~var1_int) {
                                          break L17;
                                        } else {
                                          stackOut_49_0 = "";
                                          stackIn_52_0 = stackOut_49_0;
                                          break L16;
                                        }
                                      }
                                    }
                                    stackOut_51_0 = "; believes itself to be at " + ac.a(49, var2.field_o) + "[" + var2.field_t + "]";
                                    stackIn_52_0 = stackOut_51_0;
                                    break L16;
                                  }
                                  var3 = stackIn_52_0;
                                  System.out.println("new_rack[" + var1_int + "]=" + var2.field_i + " with dest " + var2.field_g + "," + var2.field_p + var3);
                                  var2.field_g = -2147483648;
                                  break L15;
                                }
                              }
                              var1_int++;
                              if (var4 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        if (param0 == 31370) {
                          break L13;
                        } else {
                          return;
                        }
                      }
                      stackOut_56_0 = (sj) (Object) ch.field_e.a((byte) -95);
                      stackIn_57_0 = stackOut_56_0;
                      break L2;
                    }
                  }
                }
                var1_ref = stackIn_57_0;
                L18: while (true) {
                  stackOut_58_0 = null;
                  stackOut_58_1 = (sj) var1_ref;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  L19: while (true) {
                    L20: {
                      if (stackIn_59_0 == (Object) (Object) stackIn_59_1) {
                        break L20;
                      } else {
                        L21: {
                          L22: {
                            L23: {
                              if (var1_ref.field_o != de.field_d) {
                                break L23;
                              } else {
                                if (var4 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (var1_ref.field_g != -2147483648) {
                              System.out.println("Floating tile " + var1_ref.field_i + " with dest " + var1_ref.field_g + "," + var1_ref.field_p + " believes itself to be at " + ac.a(82, var1_ref.field_o) + "[" + var1_ref.field_t + "]");
                              var2_int = 0;
                              var3_int = 0;
                              L24: while (true) {
                                L25: {
                                  if (12 <= var3_int) {
                                    break L25;
                                  } else {
                                    stackOut_71_0 = wk.field_a.field_e[var3_int];
                                    stackIn_93_0 = stackOut_71_0;
                                    stackIn_72_0 = stackOut_71_0;
                                    if (var4 != 0) {
                                      break L21;
                                    } else {
                                      L26: {
                                        if (stackIn_72_0 == null) {
                                          var2_int = 1;
                                          var1_ref.a(var3_int, 28, wk.field_a);
                                          if (var4 == 0) {
                                            break L25;
                                          } else {
                                            break L26;
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var3_int++;
                                      if (var4 == 0) {
                                        continue L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                if (var2_int == 0) {
                                  var3_int = 0;
                                  L27: while (true) {
                                    if (var3_int >= 8) {
                                      break L22;
                                    } else {
                                      stackOut_85_0 = null;
                                      stackOut_85_1 = si.field_i.field_e[var3_int];
                                      stackIn_59_0 = stackOut_85_0;
                                      stackIn_59_1 = stackOut_85_1;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      if (var4 != 0) {
                                        continue L19;
                                      } else {
                                        L28: {
                                          if (stackIn_86_0 == (Object) (Object) stackIn_86_1) {
                                            var1_ref.a(var3_int, 28, si.field_i);
                                            if (var4 == 0) {
                                              break L22;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        var3_int++;
                                        if (var4 == 0) {
                                          continue L27;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L22;
                                }
                              }
                            } else {
                              break L22;
                            }
                          }
                          stackOut_92_0 = (sj) (Object) ch.field_e.a(true);
                          stackIn_93_0 = stackOut_92_0;
                          break L21;
                        }
                        var1_ref = stackIn_93_0;
                        if (var4 == 0) {
                          continue L18;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var1_int = 0;
                    var2_int = 0;
                    L29: while (true) {
                      L30: {
                        L31: {
                          L32: {
                            if (var2_int >= 12) {
                              break L32;
                            } else {
                              var3_ref = od.field_g.field_e[var2_int];
                              stackOut_96_0 = null;
                              stackOut_96_1 = (sj) var3_ref;
                              stackIn_116_0 = stackOut_96_0;
                              stackIn_116_1 = stackOut_96_1;
                              stackIn_97_0 = stackOut_96_0;
                              stackIn_97_1 = stackOut_96_1;
                              if (var4 != 0) {
                                L33: while (true) {
                                  L34: {
                                    if (stackIn_116_0 == (Object) (Object) stackIn_116_1) {
                                      break L34;
                                    } else {
                                      var3_ref.a(var2_int, 28, si.field_i);
                                      break L34;
                                    }
                                  }
                                  var2_int++;
                                  if (var4 == 0) {
                                    if (var2_int >= 8) {
                                      break L31;
                                    } else {
                                      stackOut_114_0 = si.field_i.field_e[var2_int];
                                      stackIn_121_0 = stackOut_114_0;
                                      stackIn_115_0 = stackOut_114_0;
                                      if (var4 != 0) {
                                        break L30;
                                      } else {
                                        var3_ref = stackIn_115_0;
                                        stackOut_115_0 = null;
                                        stackOut_115_1 = (sj) var3_ref;
                                        stackIn_116_0 = stackOut_115_0;
                                        stackIn_116_1 = stackOut_115_1;
                                        continue L33;
                                      }
                                    }
                                  } else {
                                    break L31;
                                  }
                                }
                              } else {
                                L35: {
                                  if (stackIn_97_0 != (Object) (Object) stackIn_97_1) {
                                    int incrementValue$1 = var1_int;
                                    var1_int++;
                                    var3_ref.a(incrementValue$1, 28, od.field_g);
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                var2_int++;
                                if (var4 == 0) {
                                  continue L29;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          var2_int = 0;
                          L36: while (true) {
                            L37: {
                              if (var2_int >= 12) {
                                break L37;
                              } else {
                                var3_ref = wk.field_a.field_e[var2_int];
                                stackOut_105_0 = (sj) var3_ref;
                                stackIn_121_0 = stackOut_105_0;
                                stackIn_106_0 = stackOut_105_0;
                                if (var4 != 0) {
                                  break L30;
                                } else {
                                  L38: {
                                    if (stackIn_106_0 != null) {
                                      var3_ref.a(var2_int, 28, wk.field_a);
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  var2_int++;
                                  if (var4 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                            }
                            var2_int = 0;
                            L39: while (true) {
                              if (var2_int >= 8) {
                                break L31;
                              } else {
                                stackOut_114_0 = si.field_i.field_e[var2_int];
                                stackIn_121_0 = stackOut_114_0;
                                stackIn_115_0 = stackOut_114_0;
                                if (var4 != 0) {
                                  break L30;
                                } else {
                                  var3_ref = stackIn_115_0;
                                  stackOut_115_0 = null;
                                  stackOut_115_1 = (sj) var3_ref;
                                  stackIn_116_0 = stackOut_115_0;
                                  stackIn_116_1 = stackOut_115_1;
                                  L40: {
                                    if (stackIn_116_0 == (Object) (Object) stackIn_116_1) {
                                      break L40;
                                    } else {
                                      var3_ref.a(var2_int, 28, si.field_i);
                                      break L40;
                                    }
                                  }
                                  var2_int++;
                                  if (var4 == 0) {
                                    continue L39;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_120_0 = (sj) (Object) ch.field_e.a((byte) -95);
                        stackIn_121_0 = stackOut_120_0;
                        break L30;
                      }
                      var2 = stackIn_121_0;
                      L41: while (true) {
                        L42: {
                          L43: {
                            if (var2 == null) {
                              break L43;
                            } else {
                              var2.field_j = var2.field_g;
                              var2.field_q = var2.field_p;
                              var2 = (sj) (Object) ch.field_e.a(true);
                              if (var4 != 0) {
                                break L42;
                              } else {
                                if (var4 == 0) {
                                  continue L41;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                          break L42;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "ue.E(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            IOException var2_ref = null;
            int stackIn_2_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_32_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_31_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (nf.field_l.field_h < param0) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = 1;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return stackIn_2_0 != 0;
                    }
                    case 3: {
                        try {
                            if (null != nk.field_b) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = 0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            var2_int = nk.field_b.a((byte) -125);
                            if (var2_int <= 0) {
                                statePc = 20;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param0 - nf.field_l.field_h < var2_int) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2_int = -nf.field_l.field_h + param0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
                            wi.field_q = lk.a(param1);
                            nf.field_l.field_h = nf.field_l.field_h + var2_int;
                            if (~param0 < ~nf.field_l.field_h) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
                    }
                    case 18: {
                        try {
                            nf.field_l.field_h = 0;
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            if (param1 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            field_a = 89;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int < 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (mc.b(true) <= 30000L) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            pc.a(1);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2_ref = (IOException) (Object) caughtException;
                            pc.a(1);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0 != 0;
                    }
                    case 33: {
                        var2 = (RuntimeException) (Object) caughtException;
                        throw ch.a((Throwable) (Object) var2, "ue.B(" + param0 + ',' + param1 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            if (param3 == 12) {
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 >= var7) {
                      break L3;
                    } else {
                      var9 = param1.charAt(var8);
                      stackOut_6_0 = ~var9;
                      stackOut_6_1 = -61;
                      stackIn_26_0 = stackOut_6_0;
                      stackIn_26_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 == stackIn_7_1) {
                              break L5;
                            } else {
                              L6: {
                                if (var9 != 62) {
                                  break L6;
                                } else {
                                  var6 = 0;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              if (var6 != 0) {
                                break L4;
                              } else {
                                if (var9 != 32) {
                                  break L4;
                                } else {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var6 = 1;
                          break L4;
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = -1;
                  stackOut_25_1 = ~var5_int;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L2;
                }
                if (stackIn_26_0 <= stackIn_26_1) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                } else {
                  stackOut_27_0 = (-param2 + param0 << -1172669496) / var5_int;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0;
                }
              }
            } else {
              stackOut_2_0 = 126;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_30_0;
    }

    final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((ue) this).field_b) {
                break L1;
              } else {
                if (((ue) this).field_b.length == 0) {
                  break L1;
                } else {
                  if (~param2 > ~((ue) this).field_b[0].field_a) {
                    break L1;
                  } else {
                    if (((ue) this).field_b[param1 + ((ue) this).field_b.length].field_f < param2) {
                      stackOut_15_0 = -1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (1 != ((ue) this).field_b.length) {
                        var4_int = 0;
                        var5 = 0;
                        L2: while (true) {
                          L3: {
                            L4: {
                              if (((ue) this).field_b.length <= var5) {
                                break L4;
                              } else {
                                var6 = ((ue) this).field_b[var5];
                                stackOut_22_0 = param2;
                                stackIn_38_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if (var8 != 0) {
                                  break L3;
                                } else {
                                  L5: {
                                    if (stackIn_23_0 < var6.field_a) {
                                      break L5;
                                    } else {
                                      if (var6.field_f >= param2) {
                                        var7 = var6.b(param1 + 29792, param0);
                                        if (var7 != -1) {
                                          stackOut_34_0 = var4_int + var7;
                                          stackIn_35_0 = stackOut_34_0;
                                          return stackIn_35_0;
                                        } else {
                                          stackOut_32_0 = -1;
                                          stackIn_33_0 = stackOut_32_0;
                                          return stackIn_33_0;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var4_int = var4_int + (-1 + var6.field_g.length);
                                  var5++;
                                  if (var8 == 0) {
                                    continue L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            stackOut_37_0 = -1;
                            stackIn_38_0 = stackOut_37_0;
                            break L3;
                          }
                          break L0;
                        }
                      } else {
                        stackOut_18_0 = ((ue) this).field_b[0].b(29791, param0);
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_10_0 = -1;
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var4, "ue.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_38_0;
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ol var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                int discarded$2 = ((ue) this).b(79, -18);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3_int <= ~((ue) this).field_b.length) {
                    break L4;
                  } else {
                    var4 = ((ue) this).field_b[var3_int];
                    stackOut_6_0 = ~var4.field_g.length;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_7_0 < ~param1) {
                        stackOut_12_0 = var3_int;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        param1 = param1 - (-1 + var4.field_g.length);
                        var3_int++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = ((ue) this).field_b.length;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ue.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    static {
    }
}
