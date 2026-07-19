/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends bf {
    private int[] field_k;
    int[] field_q;
    private int[][] field_j;
    static String field_p;
    private String[] field_n;
    static Random field_l;
    static int field_o;
    static String field_i;
    static String field_m;

    final void a(gk param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        gk var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (gk) null;
                this.a((gk) null, -61, 68);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    var3_int = param0.a((byte) 114);
                    if (0 != var3_int) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.a(param0, -305, var3_int);
                  break L4;
                }
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("pi.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void a(gk param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        te var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if ((param2 ^ -1) != -2) {
                      break L4;
                    } else {
                      this.field_n = ma.a(122, '<', param0.f(-1));
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param2 != 2) {
                      break L5;
                    } else {
                      var4_int = param0.a((byte) 114);
                      this.field_q = new int[var4_int];
                      var5 = 0;
                      L6: while (true) {
                        if (var4_int <= var5) {
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          this.field_q[var5] = param0.j(17277);
                          var5++;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  if ((param2 ^ -1) == -4) {
                    var4_int = param0.a((byte) 114);
                    this.field_j = new int[var4_int][];
                    this.field_k = new int[var4_int];
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        var6 = param0.j(param1 + 17582);
                        var7 = ab.a((byte) -65, var6);
                        stackOut_16_0 = null;
                        stackIn_27_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L8: {
                            L9: {
                              if (stackIn_17_0 == var7) {
                                break L9;
                              } else {
                                this.field_k[var5] = var6;
                                array$1 = new int[var7.field_b];
                                this.field_j[var5] = array$1;
                                var8 = 0;
                                L10: while (true) {
                                  if (var8 >= var7.field_b) {
                                    break L9;
                                  } else {
                                    this.field_j[var5][var8] = param0.j(17277);
                                    var8++;
                                    if (var9 != 0) {
                                      break L8;
                                    } else {
                                      if (var9 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5++;
                            break L8;
                          }
                          continue L7;
                        }
                      }
                    }
                  } else {
                    if (param2 != 4) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 == -305) {
                  break L1;
                } else {
                  stackOut_26_0 = null;
                  stackIn_27_0 = stackOut_26_0;
                  break L2;
                }
              }
              field_l = (Random) ((Object) stackIn_27_0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("pi.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        ki var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_83_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_14_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (!ba.a(-1)) {
                    if (kc.field_d != 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    var12 = 13;
                    var11 = oa.field_H;
                    if (var6 != 0) {
                      if (var11 != var12) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      L4: {
                        if (var11 == var12) {
                          break L4;
                        } else {
                          if (oa.field_H == 83) {
                            break L4;
                          } else {
                            if (-85 == (oa.field_H ^ -1)) {
                              break L4;
                            } else {
                              continue L1;
                            }
                          }
                        }
                      }
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                L5: {
                  L6: {
                    L7: {
                      m.field_h = m.field_h + 1;
                      var1_int = 6;
                      if (0 != m.field_h % var1_int) {
                        break L7;
                      } else {
                        var2 = 0;
                        L8: while (true) {
                          if (var2 >= ii.field_E) {
                            break L7;
                          } else {
                            var10 = ii.field_U[var2] ^ -1;
                            var9 = -1;
                            if (var6 == 0) {
                              L9: {
                                if (var9 < var10) {
                                  break L9;
                                } else {
                                  ii.field_U[var2] = ii.field_U[var2] + 1;
                                  if (3 > ii.field_U[var2]) {
                                    break L9;
                                  } else {
                                    ii.field_U[var2] = -2;
                                    break L9;
                                  }
                                }
                              }
                              var2++;
                              continue L8;
                            } else {
                              if (var9 <= var10) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (-298 <= (m.field_h ^ -1)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                  if (326 <= m.field_h) {
                    break L5;
                  } else {
                    var1_int = 14;
                    break L5;
                  }
                }
                L10: {
                  if (-1 == (m.field_h % var1_int ^ -1)) {
                    L11: {
                      if (196 >= m.field_h) {
                        break L11;
                      } else {
                        if (-298 >= (m.field_h ^ -1)) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              if (i.field_i) {
                                break L13;
                              } else {
                                mg.field_q = mg.field_q + 1;
                                if (var6 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            mg.field_q = mg.field_q - 1;
                            break L12;
                          }
                          L14: {
                            if (!i.field_i) {
                              break L14;
                            } else {
                              if (-5 != (mg.field_q ^ -1)) {
                                break L14;
                              } else {
                                i.field_i = false;
                                if (var6 == 0) {
                                  break L10;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          if (mg.field_q == 6) {
                            i.field_i = true;
                            if (var6 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L15: {
                      mg.field_q = mg.field_q + 1;
                      if (-197 >= (m.field_h ^ -1)) {
                        break L15;
                      } else {
                        if (mg.field_q == 4) {
                          mg.field_q = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if ((m.field_h ^ -1) >= -305) {
                        break L16;
                      } else {
                        if ((m.field_h ^ -1) > -331) {
                          mg.field_q = 7;
                          break L10;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (mg.field_q < we.field_f.length) {
                      break L10;
                    } else {
                      mg.field_q = we.field_f.length - 1 + -3;
                      if (var6 == 0) {
                        break L10;
                      } else {
                        mg.field_q = 7;
                        break L10;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                L17: {
                  L18: {
                    L19: {
                      if (102 >= m.field_h) {
                        break L19;
                      } else {
                        var2 = 0;
                        var3 = (ki) ((Object) bd.field_b.a((byte) -117));
                        L20: while (true) {
                          if (var3 == null) {
                            break L19;
                          } else {
                            var4 = m.field_h - (102 + ck.field_g[var2]);
                            var8 = -1;
                            var7 = var4 ^ -1;
                            if (var6 == 0) {
                              L21: {
                                L22: {
                                  if (var7 <= var8) {
                                    break L22;
                                  } else {
                                    var2++;
                                    if (var6 == 0) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                L23: {
                                  var5 = (float)var4 / 80.0f;
                                  if (var5 < 1.0f) {
                                    break L23;
                                  } else {
                                    var5 = 1.0f;
                                    break L23;
                                  }
                                }
                                L24: {
                                  if (var5 >= 0.9700000286102295f) {
                                    if ((ii.field_U[var2] ^ -1) != 0) {
                                      break L24;
                                    } else {
                                      ii.field_U[var2] = 0;
                                      cj.a((byte) 113, ke.field_h[5]);
                                      break L24;
                                    }
                                  } else {
                                    break L24;
                                  }
                                }
                                var3.field_B = rl.field_c[var2][0] + (-rl.field_c[var2][0] + da.field_b[var2][0]) * var5;
                                var3.field_q = rl.field_c[var2][1] + (da.field_b[var2][1] - rl.field_c[var2][1]) * var5;
                                var2++;
                                break L21;
                              }
                              var3 = (ki) ((Object) bd.field_b.d((byte) 63));
                              continue L20;
                            } else {
                              if (var7 >= var8) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0 >= 120) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                  field_p = (String) null;
                  break L17;
                }
                L25: {
                  if (m.field_h == 330) {
                    cj.a((byte) -71, ke.field_h[14]);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((m.field_h ^ -1) != -375) {
                    break L26;
                  } else {
                    cj.a((byte) -99, ke.field_h[12]);
                    break L26;
                  }
                }
                L27: {
                  if (m.field_h <= 424) {
                    stackOut_82_0 = 0;
                    stackIn_83_0 = stackOut_82_0;
                    break L27;
                  } else {
                    stackOut_81_0 = 1;
                    stackIn_83_0 = stackOut_81_0;
                    break L27;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "pi.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_83_0 != 0;
          }
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_l = null;
        field_i = null;
        if (param0 != -13739) {
            return;
        }
        field_m = null;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (this.field_q != null) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_q.length) {
                  break L1;
                } else {
                  this.field_q[var2] = bd.a(this.field_q[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 == 0) {
            break L0;
          } else {
            field_l = (Random) null;
            break L0;
          }
        }
    }

    final String b(byte param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_9_0 = null;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -54) {
            break L0;
          } else {
            pi.f(62);
            break L0;
          }
        }
        var5 = new StringBuilder(80);
        var2 = var5;
        if (null != this.field_n) {
          discarded$6 = var5.append(this.field_n[0]);
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_n.length <= var3) {
                  break L3;
                } else {
                  discarded$7 = var2.append("...");
                  stackOut_6_0 = var5.append(this.field_n[var3]);
                  stackIn_10_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_9_0 = (StringBuilder) (var2);
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_10_0).toString();
          }
        } else {
          return "";
        }
    }

    pi() {
    }

    final static String a(byte param0, CharSequence param1) {
        String discarded$2 = null;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 122) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = pi.a((byte) -13, (CharSequence) null);
                break L1;
              }
            }
            stackOut_2_0 = wg.a(false, param1, 17212);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("pi.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_l = new Random();
        field_m = "Mouse over an icon for details";
        field_i = "Continue";
    }
}
