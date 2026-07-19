/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ue {
    static int field_a;
    ol[] field_b;
    static ii[] field_c;

    final int a(int param0) {
        int discarded$2 = 0;
        int stackIn_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param0 > 124) {
            break L0;
          } else {
            discarded$2 = this.b(-103, -63);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              if (this.field_b.length <= 0) {
                break L2;
              } else {
                stackOut_7_0 = this.field_b[-1 + this.field_b.length].field_f + -this.field_b[0].field_a;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_10_0;
    }

    final int c(int param0, int param1) {
        ol[] var3 = null;
        int var4 = 0;
        ol var5 = null;
        int var6 = 0;
        ol[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var7.length <= var4) {
                break L2;
              } else {
                var5 = var7[var4];
                stackOut_2_0 = param1;
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 < var5.field_g.length) {
                    return var5.field_g[param1];
                  } else {
                    param1 = param1 - (var5.field_g.length - 1);
                    var4++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_9_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 18) {
            field_a = -77;
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ol[] var4 = null;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var2 = 119 / ((param0 - 61) / 46);
          var3 = -1;
          if (this.field_b != null) {
            var4 = this.field_b;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                break L0;
              } else {
                L2: {
                  var6 = var4[var5];
                  if (var6 != null) {
                    var7 = var6.a(-44);
                    if ((var3 ^ -1) <= (var7 ^ -1)) {
                      break L2;
                    } else {
                      var3 = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                if (var8 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var3;
    }

    final static void b(int param0) {
        int incrementValue$1 = 0;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var1_int = 0;
        sj var1_ref2 = null;
        int var2_int = 0;
        sj var2 = null;
        String var3 = null;
        sj var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        sj var5 = null;
        String var6 = null;
        sj var7 = null;
        String var8 = null;
        sj var9 = null;
        String var10 = null;
        sj var11 = null;
        sj stackIn_6_0 = null;
        String stackIn_14_0 = null;
        sj stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_40_0 = null;
        sj stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        sj stackIn_47_1 = null;
        sj stackIn_57_0 = null;
        Object stackIn_68_0 = null;
        sj stackIn_68_1 = null;
        sj stackIn_74_0 = null;
        Object stackIn_78_0 = null;
        sj stackIn_78_1 = null;
        sj stackIn_86_0 = null;
        sj stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        sj stackIn_95_1 = null;
        sj stackIn_99_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_5_0 = null;
        String stackOut_13_0 = null;
        String stackOut_12_0 = null;
        sj stackOut_18_0 = null;
        String stackOut_25_0 = null;
        String stackOut_26_0 = null;
        String stackOut_38_0 = null;
        String stackOut_39_0 = null;
        sj stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        sj stackOut_46_1 = null;
        sj stackOut_56_0 = null;
        Object stackOut_67_0 = null;
        sj stackOut_67_1 = null;
        sj stackOut_73_0 = null;
        Object stackOut_77_0 = null;
        sj stackOut_77_1 = null;
        sj stackOut_93_0 = null;
        Object stackOut_94_0 = null;
        sj stackOut_94_1 = null;
        sj stackOut_85_0 = null;
        sj stackOut_98_0 = null;
        var1 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (2 <= va.field_j) {
              var1_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (-13 >= (var1_int ^ -1)) {
                      break L3;
                    } else {
                      var5 = od.field_g.field_e[var1_int];
                      stackOut_5_0 = (sj) (var5);
                      stackIn_45_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_6_0 == null) {
                            break L4;
                          } else {
                            L5: {
                              L6: {
                                if (var5.field_o != od.field_g) {
                                  break L6;
                                } else {
                                  if (var1_int == var5.field_t) {
                                    stackOut_13_0 = "";
                                    stackIn_14_0 = stackOut_13_0;
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              stackOut_12_0 = "; believes itself to be at " + ac.a(38, var5.field_o) + "[" + var5.field_t + "]";
                              stackIn_14_0 = stackOut_12_0;
                              break L5;
                            }
                            var6 = stackIn_14_0;
                            var3 = var6;
                            System.out.println("submission_rack[" + var1_int + "]=" + var5.field_i + " with dest " + var5.field_g + "," + var5.field_p + var6);
                            var5.field_g = -2147483648;
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
                        var7 = wk.field_a.field_e[var1_int];
                        stackOut_18_0 = (sj) (var7);
                        stackIn_45_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L9: {
                            if (stackIn_19_0 != null) {
                              L10: {
                                L11: {
                                  if (var7.field_o != wk.field_a) {
                                    break L11;
                                  } else {
                                    if ((var7.field_t ^ -1) != (var1_int ^ -1)) {
                                      break L11;
                                    } else {
                                      stackOut_25_0 = "";
                                      stackIn_27_0 = stackOut_25_0;
                                      break L10;
                                    }
                                  }
                                }
                                stackOut_26_0 = "; believes itself to be at " + ac.a(97, var7.field_o) + "[" + var7.field_t + "]";
                                stackIn_27_0 = stackOut_26_0;
                                break L10;
                              }
                              var8 = stackIn_27_0;
                              var3 = var8;
                              System.out.println("carryover_rack[" + var1_int + "]=" + var7.field_i + " with dest " + var7.field_g + "," + var7.field_p + var8);
                              var7.field_g = -2147483648;
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
                            var9 = si.field_i.field_e[var1_int];
                            if (var4 != 0) {
                              break L13;
                            } else {
                              L15: {
                                if (null == var9) {
                                  break L15;
                                } else {
                                  L16: {
                                    L17: {
                                      if (si.field_i != var9.field_o) {
                                        break L17;
                                      } else {
                                        if ((var9.field_t ^ -1) != (var1_int ^ -1)) {
                                          break L17;
                                        } else {
                                          stackOut_38_0 = "";
                                          stackIn_40_0 = stackOut_38_0;
                                          break L16;
                                        }
                                      }
                                    }
                                    stackOut_39_0 = "; believes itself to be at " + ac.a(49, var9.field_o) + "[" + var9.field_t + "]";
                                    stackIn_40_0 = stackOut_39_0;
                                    break L16;
                                  }
                                  var10 = stackIn_40_0;
                                  var3 = var10;
                                  System.out.println("new_rack[" + var1_int + "]=" + var9.field_i + " with dest " + var9.field_g + "," + var9.field_p + var10);
                                  var9.field_g = -2147483648;
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
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                      stackOut_44_0 = (sj) ((Object) ch.field_e.a((byte) -95));
                      stackIn_45_0 = stackOut_44_0;
                      break L2;
                    }
                  }
                }
                var1_ref2 = stackIn_45_0;
                L18: while (true) {
                  stackOut_46_0 = null;
                  stackOut_46_1 = (sj) (var1_ref2);
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  L19: while (true) {
                    L20: {
                      if (stackIn_47_0 == stackIn_47_1) {
                        break L20;
                      } else {
                        L21: {
                          L22: {
                            L23: {
                              if (var1_ref2.field_o != de.field_d) {
                                break L23;
                              } else {
                                if (var4 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (var1_ref2.field_g != -2147483648) {
                              System.out.println("Floating tile " + var1_ref2.field_i + " with dest " + var1_ref2.field_g + "," + var1_ref2.field_p + " believes itself to be at " + ac.a(82, var1_ref2.field_o) + "[" + var1_ref2.field_t + "]");
                              var2_int = 0;
                              var3_int = 0;
                              L24: while (true) {
                                L25: {
                                  if (12 <= var3_int) {
                                    break L25;
                                  } else {
                                    stackOut_56_0 = wk.field_a.field_e[var3_int];
                                    stackIn_74_0 = stackOut_56_0;
                                    stackIn_57_0 = stackOut_56_0;
                                    if (var4 != 0) {
                                      break L21;
                                    } else {
                                      L26: {
                                        if (stackIn_57_0 == null) {
                                          var2_int = 1;
                                          var1_ref2.a(var3_int, 28, wk.field_a);
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
                                    if ((var3_int ^ -1) <= -9) {
                                      break L22;
                                    } else {
                                      stackOut_67_0 = null;
                                      stackOut_67_1 = si.field_i.field_e[var3_int];
                                      stackIn_47_0 = stackOut_67_0;
                                      stackIn_47_1 = stackOut_67_1;
                                      stackIn_68_0 = stackOut_67_0;
                                      stackIn_68_1 = stackOut_67_1;
                                      if (var4 != 0) {
                                        continue L19;
                                      } else {
                                        L28: {
                                          if (stackIn_68_0 == stackIn_68_1) {
                                            var1_ref2.a(var3_int, 28, si.field_i);
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
                          stackOut_73_0 = (sj) ((Object) ch.field_e.a(true));
                          stackIn_74_0 = stackOut_73_0;
                          break L21;
                        }
                        var1_ref2 = stackIn_74_0;
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
                            if ((var2_int ^ -1) <= -13) {
                              break L32;
                            } else {
                              var3_ref = od.field_g.field_e[var2_int];
                              stackOut_77_0 = null;
                              stackOut_77_1 = (sj) (var3_ref);
                              stackIn_95_0 = stackOut_77_0;
                              stackIn_95_1 = stackOut_77_1;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              if (var4 != 0) {
                                L33: while (true) {
                                  L34: {
                                    if (stackIn_95_0 == stackIn_95_1) {
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
                                      stackOut_93_0 = si.field_i.field_e[var2_int];
                                      stackIn_99_0 = stackOut_93_0;
                                      stackIn_94_0 = stackOut_93_0;
                                      if (var4 != 0) {
                                        break L30;
                                      } else {
                                        var3_ref = stackIn_94_0;
                                        stackOut_94_0 = null;
                                        stackOut_94_1 = (sj) (var3_ref);
                                        stackIn_95_0 = stackOut_94_0;
                                        stackIn_95_1 = stackOut_94_1;
                                        continue L33;
                                      }
                                    }
                                  } else {
                                    break L31;
                                  }
                                }
                              } else {
                                L35: {
                                  if (stackIn_78_0 != stackIn_78_1) {
                                    incrementValue$1 = var1_int;
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
                              if (-13 >= (var2_int ^ -1)) {
                                break L37;
                              } else {
                                var11 = wk.field_a.field_e[var2_int];
                                stackOut_85_0 = (sj) (var11);
                                stackIn_99_0 = stackOut_85_0;
                                stackIn_86_0 = stackOut_85_0;
                                if (var4 != 0) {
                                  break L30;
                                } else {
                                  L38: {
                                    if (stackIn_86_0 != null) {
                                      var11.a(var2_int, 28, wk.field_a);
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
                                stackOut_93_0 = si.field_i.field_e[var2_int];
                                stackIn_99_0 = stackOut_93_0;
                                stackIn_94_0 = stackOut_93_0;
                                if (var4 != 0) {
                                  break L30;
                                } else {
                                  var3_ref = stackIn_94_0;
                                  stackOut_94_0 = null;
                                  stackOut_94_1 = (sj) (var3_ref);
                                  stackIn_95_0 = stackOut_94_0;
                                  stackIn_95_1 = stackOut_94_1;
                                  L40: {
                                    if (stackIn_95_0 == stackIn_95_1) {
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
                        stackOut_98_0 = (sj) ((Object) ch.field_e.a((byte) -95));
                        stackIn_99_0 = stackOut_98_0;
                        break L30;
                      }
                      var2 = stackIn_99_0;
                      L41: while (true) {
                        L42: {
                          if (var2 == null) {
                            break L42;
                          } else {
                            var2.field_j = var2.field_g;
                            var2.field_q = var2.field_p;
                            var2 = (sj) ((Object) ch.field_e.a(true));
                            if (var4 != 0) {
                              break L42;
                            } else {
                              if (var4 == 0) {
                                continue L41;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
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
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ue.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            if (nf.field_l.field_h < param0) {
              if (null != nk.field_b) {
                try {
                  L0: {
                    var2_int = nk.field_b.a((byte) -125);
                    if (-1 <= (var2_int ^ -1)) {
                      L1: {
                        if (param1 == 0) {
                          break L1;
                        } else {
                          field_a = 89;
                          break L1;
                        }
                      }
                      L2: {
                        if ((var2_int ^ -1) > -1) {
                          break L2;
                        } else {
                          if ((mc.b(true) ^ -1L) >= -30001L) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      pc.a(1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (param0 - nf.field_l.field_h < var2_int) {
                          var2_int = -nf.field_l.field_h + param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
                      wi.field_q = lk.a(param1 ^ 0);
                      nf.field_l.field_h = nf.field_l.field_h + var2_int;
                      if ((param0 ^ -1) < (nf.field_l.field_h ^ -1)) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        nf.field_l.field_h = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    pc.a(1);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return false;
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
        int decompiledRegionSelector0 = 0;
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
                      stackOut_6_0 = var9 ^ -1;
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
                  stackOut_25_1 = var5_int ^ -1;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L2;
                }
                if (stackIn_26_0 <= stackIn_26_1) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_27_0 = (-param2 + param0 << -1172669496) / var5_int;
                  stackIn_28_0 = stackOut_27_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 126;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var5);
            stackOut_31_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0;
          } else {
            return stackIn_30_0;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ol var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          if (null == this.field_b) {
            break L0;
          } else {
            if (-1 == (this.field_b.length ^ -1)) {
              break L0;
            } else {
              if ((param2 ^ -1) > (this.field_b[0].field_a ^ -1)) {
                break L0;
              } else {
                if (this.field_b[param1 + this.field_b.length].field_f < param2) {
                  return -1;
                } else {
                  if (1 != this.field_b.length) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (this.field_b.length <= var5) {
                            break L3;
                          } else {
                            var6 = this.field_b[var5];
                            stackOut_16_0 = param2;
                            stackIn_28_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (var8 != 0) {
                              break L2;
                            } else {
                              L4: {
                                if (stackIn_17_0 < var6.field_a) {
                                  break L4;
                                } else {
                                  if (var6.field_f >= param2) {
                                    var7 = var6.b(param1 + 29792, param0);
                                    if (0 != (var7 ^ -1)) {
                                      return var4 + var7;
                                    } else {
                                      return -1;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var4 = var4 + (-1 + var6.field_g.length);
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        stackOut_27_0 = -1;
                        stackIn_28_0 = stackOut_27_0;
                        break L2;
                      }
                      return stackIn_28_0;
                    }
                  } else {
                    return this.field_b[0].b(29791, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int discarded$2 = 0;
        int var3 = 0;
        ol var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            discarded$2 = this.b(79, -18);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= (this.field_b.length ^ -1)) {
                break L3;
              } else {
                var4 = this.field_b[var3];
                stackOut_5_0 = var4.field_g.length ^ -1;
                stackIn_12_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (stackIn_6_0 < (param1 ^ -1)) {
                    return var3;
                  } else {
                    param1 = param1 - (-1 + var4.field_g.length);
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_11_0 = this.field_b.length;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_12_0;
        }
    }

    static {
    }
}
