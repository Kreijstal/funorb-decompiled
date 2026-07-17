/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class lm extends pa {
    static ja field_fb;
    private int[] field_ub;
    private int field_kb;
    private int field_ib;
    private sa field_mb;
    static String field_jb;
    private int field_tb;
    int field_lb;
    private boolean field_vb;
    ge field_nb;
    private boolean field_wb;
    static cj field_gb;
    private int field_rb;
    boolean field_hb;
    static ja field_eb;
    private int[][] field_sb;
    private int[] field_qb;
    private int field_xb;
    static int field_pb;
    static String field_ob;

    private final boolean a(byte param0, int param1, int param2) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          param2 = param2 / 24;
          param1 = param1 / 24;
          if (param2 < 0) {
            break L0;
          } else {
            if (param1 < 0) {
              break L0;
            } else {
              L1: {
                if (((lm) this).field_sb[0].length <= param2) {
                  break L1;
                } else {
                  if (((lm) this).field_sb.length <= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 >= 102) {
                        break L2;
                      } else {
                        ((lm) this).field_mb = null;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (((lm) this).field_sb[param1][param2] == -1) {
                          break L4;
                        } else {
                          if (((lm) this).field_sb[param1][param2] >= 1) {
                            break L4;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L3;
                    }
                    return stackIn_14_0 != 0;
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    final boolean a(boolean param0, pa param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              ((lm) this).field_kb = 200;
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param0) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((lm) this).field_wb = stackIn_3_1 != 0;
              var3_int = (param1.e((byte) -112) + ((lm) this).e((byte) -112)) / 2;
              var4 = (param1.g(1829947600) - -((lm) this).g(1829947600)) / 2;
              var5 = var3_int - ((lm) this).e((byte) -112);
              var6 = -((lm) this).g(1829947600) + var4;
              var7 = 400;
              if (var7 <= var5 * var5 + var6 * var6) {
                L3: {
                  var8 = 8;
                  if (this.a((byte) 117, var4, var3_int)) {
                    break L3;
                  } else {
                    var3_int = var3_int + (hp.a((byte) -107, g.field_a, 2 * var8) + (12 - var8));
                    var4 = var4 + (12 + (hp.a((byte) 108, g.field_a, 2 * var8) + -var8));
                    break L3;
                  }
                }
                if (!this.a((byte) 125, var4, var3_int)) {
                  break L2;
                } else {
                  if (((lm) this).field_A.field_b.a(((lm) this).g(1829947600), ((lm) this).e((byte) -112), -17201, var3_int, var4, false, false) == -1) {
                    break L2;
                  } else {
                    this.b(((lm) this).field_N, -94, ((lm) this).field_ab);
                    ((lm) this).field_N = var3_int;
                    ((lm) this).field_ab = var4;
                    ((lm) this).b(((lm) this).field_ab, (byte) -61, ((lm) this).field_N);
                    break L2;
                  }
                }
              } else {
                L4: {
                  if (((lm) this).field_N != ((lm) this).e((byte) -112)) {
                    break L4;
                  } else {
                    if (((lm) this).field_ab == ((lm) this).g(1829947600)) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                ((lm) this).field_N = ((lm) this).e((byte) -112);
                ((lm) this).field_ab = ((lm) this).g(1829947600);
                break L2;
              }
            }
            ((lm) this).c(93, 28672 * ((lm) this).field_M);
            ((lm) this).field_S = true;
            stackOut_15_0 = 1;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("lm.NA(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final ge a(boolean param0, int param1, int param2) {
        br var4 = null;
        ge var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == 5690) {
            break L0;
          } else {
            ((lm) this).field_qb = null;
            break L0;
          }
        }
        var4 = ((lm) this).field_A.field_u.c(57);
        L1: while (true) {
          if (var4 instanceof ek) {
            if (var4 instanceof ge) {
              L2: {
                var5 = (ge) (Object) var4;
                if (var5 == null) {
                  break L2;
                } else {
                  if (!var5.o(param2 ^ 5700)) {
                    break L2;
                  } else {
                    var6 = var5.e((byte) -112) + -((lm) this).e((byte) -112);
                    var7 = var5.g(param2 ^ 1829953258) + -((lm) this).g(1829947600);
                    if (var6 * var6 + var7 * var7 >= param1 * param1) {
                      break L2;
                    } else {
                      L3: {
                        if (param0) {
                          break L3;
                        } else {
                          if (((lm) this).field_A.field_b.a(var5.g(1829947600), var5.e((byte) -112), param2 ^ -21771, ((lm) this).e((byte) -112), ((lm) this).g(param2 + 1829941910), false, true) == -1) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return var5;
                    }
                  }
                }
              }
              var4 = var4.field_d;
              continue L1;
            } else {
              var4 = var4.field_d;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = ((lm) this).field_D;
        if (var2 != 0) {
          L0: {
            if (var2 == 1) {
              break L0;
            } else {
              if (var2 != 2) {
                L1: {
                  if (var2 != 3) {
                    if (4 == var2) {
                      break L1;
                    } else {
                      if (var2 != 5) {
                        if (6 == var2) {
                          return true;
                        } else {
                          if (var2 != 7) {
                            if (var2 != 8) {
                              if (9 == var2) {
                                return false;
                              } else {
                                if (var2 != 10) {
                                  if (var2 != 11) {
                                    L2: {
                                      if (var2 == 12) {
                                        break L2;
                                      } else {
                                        if (var2 != 13) {
                                          if (var2 == 14) {
                                            break L2;
                                          } else {
                                            if (var2 == 15) {
                                              return true;
                                            } else {
                                              if (16 == var2) {
                                                return true;
                                              } else {
                                                if (var2 != 18) {
                                                  if (19 != var2) {
                                                    if (var2 != 20) {
                                                      if (var2 == 21) {
                                                        return false;
                                                      } else {
                                                        if (var2 == 22) {
                                                          return true;
                                                        } else {
                                                          var2 = -61 % ((74 - param0) / 36);
                                                          return true;
                                                        }
                                                      }
                                                    } else {
                                                      return true;
                                                    }
                                                  } else {
                                                    return true;
                                                  }
                                                } else {
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    return true;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              return true;
                            }
                          } else {
                            return true;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                return true;
              } else {
                break L0;
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final boolean d(boolean param0) {
        this.m((byte) 99);
        if (param0) {
            ((lm) this).q(-67);
        }
        int discarded$0 = -18812;
        int var2 = this.l();
        if (var2 == -1) {
            return false;
        }
        ((lm) this).field_kb = 20;
        ((lm) this).field_wb = false;
        ((lm) this).field_N = ((lm) this).field_ub[var2];
        ((lm) this).field_ab = ((lm) this).field_qb[var2];
        this.b(((lm) this).e((byte) -112), -80, ((lm) this).g(1829947600));
        ((lm) this).b(((lm) this).field_ab, (byte) -61, ((lm) this).field_N);
        ((lm) this).c(-50, ((lm) this).field_M * ((lm) this).field_cb);
        ((lm) this).a(1, (byte) -89);
        return true;
    }

    private final boolean m() {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        ek var3 = (ek) (Object) ((lm) this).field_A.field_u.c(100);
        while (var3 != null) {
            if (var3 instanceof ge) {
                if (((ge) (Object) var3).p((byte) 56)) {
                    var4 = ((lm) this).field_ub[-1 + ((lm) this).field_lb] - var3.e((byte) -112);
                    var5 = ((lm) this).field_qb[-1 + ((lm) this).field_lb] - var3.g(1829947600);
                    var6 = var4 * var4;
                    var7 = var5 * var5;
                    var8 = 90000;
                    if (var6 - -var7 < var8) {
                        var2 = 1;
                        break;
                    }
                }
            }
            var3 = (ek) (Object) ((lm) this).field_A.field_u.b(6);
        }
        return var2 != 0;
    }

    final void c(boolean param0) {
        ((lm) this).a(32, (byte) -89);
        if (param0) {
            this.m((byte) -45);
        }
        ((lm) this).field_S = true;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 38 % ((-40 - param1) / 34);
        param2 = param2 / 24;
        param0 = param0 / 24;
        ((lm) this).field_sb[param2][param0] = ((lm) this).field_sb[param2][param0] - 1;
        if (0 > ((lm) this).field_sb[param2][param0] - 1) {
            ((lm) this).field_sb[param2][param0] = 0;
        }
    }

    final void j(byte param0) {
        ((lm) this).a(20, (byte) -89);
        if (param0 <= 101) {
            ((lm) this).field_lb = -17;
        }
    }

    private final int l() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        c var6 = null;
        ek var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_1_0 = false;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!((lm) this).field_A.field_l) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            int discarded$2 = -7;
            stackOut_1_0 = this.m();
            stackIn_3_0 = stackOut_1_0 ? 1 : 0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = 0;
        L1: while (true) {
          if (((lm) this).field_lb <= var3) {
            var3 = -1;
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (((lm) this).field_lb <= var9) {
                L3: {
                  if (var3 == ((lm) this).field_lb + -1) {
                    var3 = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var3;
              } else {
                if (fn.field_a[var9] != -1) {
                  L4: {
                    if (var3 == -1) {
                      break L4;
                    } else {
                      if (fn.field_a[var3] <= fn.field_a[var9]) {
                        break L4;
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                  var3 = var9;
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            L5: {
              fn.field_a[var3] = 0;
              if (-1 + ((lm) this).field_lb == var3) {
                break L5;
              } else {
                L6: {
                  if (!this.a((byte) 108, ((lm) this).field_qb[var3], ((lm) this).field_ub[var3])) {
                    break L6;
                  } else {
                    if (-1 != ((lm) this).field_A.field_b.a(((lm) this).field_qb[var3], 95, ((lm) this).field_ub[var3], ((lm) this).g(1829947600), ((lm) this).e((byte) -112))) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                fn.field_a[var3] = -1;
                var3++;
                continue L1;
              }
            }
            var4 = ((lm) this).field_C + -1;
            L7: while (true) {
              if (1 + ((lm) this).field_C >= var4) {
                var5 = ((lm) this).field_B + -1;
                L8: while (true) {
                  if (1 + ((lm) this).field_B < var5) {
                    var4++;
                    continue L7;
                  } else {
                    var6 = ((lm) this).field_A.a(true, var4, var5);
                    if (var6 != null) {
                      if (var6.b(0) != 0) {
                        var7 = (ek) (Object) var6.a(false);
                        L9: while (true) {
                          if (var7 != null) {
                            int discarded$3 = 2;
                            this.a(var2 != 0, var7, var3);
                            var7 = (ek) (Object) var6.c(-1);
                            continue L9;
                          } else {
                            var5++;
                            continue L8;
                          }
                        }
                      } else {
                        var5++;
                        continue L8;
                      }
                    } else {
                      var5++;
                      continue L8;
                    }
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final void j(int param0) {
        ((lm) this).a(param0, (byte) -89);
        ((lm) this).field_A.field_m.c(-112);
        super.j(18);
    }

    final void h(int param0) {
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 >= 30) {
            break L0;
          } else {
            ((lm) this).p(110);
            break L0;
          }
        }
        L1: {
          L2: {
            super.h(38);
            ((lm) this).b((byte) 120, ((lm) this).field_Q);
            if (((lm) this).field_Q == 0) {
              L3: {
                int fieldTemp$8 = ((lm) this).field_ib + 1;
                ((lm) this).field_ib = ((lm) this).field_ib + 1;
                if (((lm) this).field_rb >= fieldTemp$8) {
                  break L3;
                } else {
                  L4: {
                    ((lm) this).field_ib = 0;
                    stackOut_58_0 = this;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_59_0 = stackOut_58_0;
                    if (((lm) this).field_vb) {
                      stackOut_60_0 = this;
                      stackOut_60_1 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      break L4;
                    } else {
                      stackOut_59_0 = this;
                      stackOut_59_1 = 1;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      break L4;
                    }
                  }
                  ((lm) this).field_vb = stackIn_61_1 != 0;
                  if (((lm) this).field_vb) {
                    ((lm) this).field_rb = 53;
                    break L3;
                  } else {
                    L5: {
                      stackOut_62_0 = this;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      if (!((lm) this).field_vb) {
                        stackOut_64_0 = this;
                        stackOut_64_1 = hp.a((byte) -77, g.field_a, 200) + 20;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        break L5;
                      } else {
                        stackOut_63_0 = this;
                        stackOut_63_1 = 65;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        break L5;
                      }
                    }
                    ((lm) this).field_rb = stackIn_65_1;
                    break L3;
                  }
                }
              }
              L6: {
                if (!((lm) this).field_vb) {
                  ((lm) this).field_V = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              int fieldTemp$9 = ((lm) this).field_kb;
              ((lm) this).field_kb = ((lm) this).field_kb + 1;
              if (20 > fieldTemp$9) {
                break L2;
              } else {
                ((lm) this).field_kb = 0;
                ((lm) this).l((byte) 111);
                break L1;
              }
            } else {
              if (((lm) this).field_Q != 2) {
                if (((lm) this).field_Q == 1) {
                  L7: {
                    int fieldTemp$10 = ((lm) this).field_kb;
                    ((lm) this).field_kb = ((lm) this).field_kb + 1;
                    if (fieldTemp$10 < 20) {
                      break L7;
                    } else {
                      ((lm) this).field_kb = 0;
                      var2 = 0;
                      var3 = ((lm) this).field_A.field_m.field_A.c(106);
                      L8: while (true) {
                        if (!(var3 instanceof bf)) {
                          L9: {
                            L10: {
                              if (((lm) this).field_wb) {
                                break L10;
                              } else {
                                if (var2 != 0) {
                                  ((lm) this).c(-110, ((lm) this).field_cb >> 2);
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (!((lm) this).field_wb) {
                              break L9;
                            } else {
                              if (var2 == 0) {
                                ((lm) this).c(119, ((lm) this).field_cb);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L11: {
                            stackOut_50_0 = this;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_51_0 = stackOut_50_0;
                            if (var2 == 0) {
                              stackOut_52_0 = this;
                              stackOut_52_1 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              break L11;
                            } else {
                              stackOut_51_0 = this;
                              stackOut_51_1 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              break L11;
                            }
                          }
                          ((lm) this).field_wb = stackIn_53_1 != 0;
                          break L7;
                        } else {
                          var2 = var2 != 0 | ((bf) (Object) var3).a((lm) this, 0) ? 1 : 0;
                          var3 = var3.field_d;
                          continue L8;
                        }
                      }
                    }
                  }
                  ((lm) this).h((byte) 38);
                  if (((lm) this).k(2)) {
                    ((lm) this).a(0, (byte) -89);
                    ((lm) this).l((byte) 111);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (((lm) this).field_Q == 3) {
                    int fieldTemp$11 = ((lm) this).field_kb;
                    ((lm) this).field_kb = ((lm) this).field_kb + 1;
                    if (fieldTemp$11 >= 20) {
                      ((lm) this).field_kb = 0;
                      ((lm) this).l((byte) 111);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if (((lm) this).field_Q == 16) {
                      int fieldTemp$12 = ((lm) this).field_kb;
                      ((lm) this).field_kb = ((lm) this).field_kb + 1;
                      if (fieldTemp$12 >= 20) {
                        ((lm) this).field_kb = 0;
                        if (((lm) this).field_mb.b(true)) {
                          ((lm) this).field_mb = null;
                          ((lm) this).a(0, (byte) -89);
                          ((lm) this).field_S = true;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      if (((lm) this).field_Q != 20) {
                        if (((lm) this).field_Q == 25) {
                          int fieldTemp$13 = ((lm) this).field_tb - 1;
                          ((lm) this).field_tb = ((lm) this).field_tb - 1;
                          if (fieldTemp$13 <= 0) {
                            ((lm) this).a(0, (byte) -89);
                            ((lm) this).field_S = true;
                            ((lm) this).field_kb = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if (((lm) this).field_Q != 30) {
                            break L2;
                          } else {
                            ((lm) this).h((byte) 42);
                            int fieldTemp$14 = ((lm) this).field_kb;
                            ((lm) this).field_kb = ((lm) this).field_kb + 1;
                            if (20 <= fieldTemp$14) {
                              ((lm) this).field_kb = 0;
                              ((lm) this).l((byte) 111);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              } else {
                L12: {
                  ((lm) this).h((byte) 70);
                  if (((lm) this).field_V >= 4) {
                    if (((lm) this).field_V != 4) {
                      if (((lm) this).field_V == 6) {
                        ((lm) this).a(0, (byte) -89);
                        ((lm) this).b(((lm) this).g(1829947600), (byte) -61, ((lm) this).e((byte) -112));
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      L13: {
                        int fieldTemp$15 = ((lm) this).field_xb;
                        ((lm) this).field_xb = ((lm) this).field_xb + 1;
                        if (fieldTemp$15 >= 400) {
                          ((lm) this).field_V = ((lm) this).field_V + 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ((lm) this).field_L = 0;
                      ((lm) this).field_W = 0;
                      ((lm) this).field_R = 0;
                      break L12;
                    }
                  } else {
                    ((lm) this).field_L = ((lm) this).field_L + 1;
                    break L12;
                  }
                }
                if (!((lm) this).field_A.field_b.a(((lm) this).field_G - -((lm) this).field_R >> 16, true, true, ((lm) this).field_W + ((lm) this).field_E >> 16)) {
                  ((lm) this).field_E = ((lm) this).field_E - ((lm) this).field_W;
                  ((lm) this).field_G = ((lm) this).field_G - ((lm) this).field_R;
                  ((lm) this).field_R = 0;
                  ((lm) this).field_W = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          break L1;
        }
    }

    private final void a(boolean param0, ek param1, int param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ge var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof ge)) {
                if (param1 instanceof og) {
                  L2: {
                    var5_int = ((lm) this).field_ub[param2] + -param1.e((byte) -112);
                    var6 = ((lm) this).field_qb[param2] - param1.g(1829947600);
                    var7 = var5_int * var5_int - -(var6 * var6);
                    if (fn.field_a[param2] == 0) {
                      break L2;
                    } else {
                      if (var7 < fn.field_a[param2]) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  fn.field_a[param2] = var7;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var9 = (ge) (Object) param1;
                if (!var9.q(-128)) {
                  break L1;
                } else {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      if (var9.p((byte) 76)) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L4: {
                    var6 = ((lm) this).field_ub[param2] + -param1.e((byte) -112);
                    var7 = ((lm) this).field_qb[param2] - param1.g(1829947600);
                    var8 = var6 * var6 - -(var7 * var7);
                    if (fn.field_a[param2] == 0) {
                      break L4;
                    } else {
                      if (var8 < fn.field_a[param2]) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  fn.field_a[param2] = var8;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("lm.CA(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + 2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -19863) {
                break L1;
              } else {
                int discarded$2 = lm.a(-75, -66, 106);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param2 <= 0) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << 1;
                param0 = param0 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "lm.RA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    lm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((lm) this).field_ib = 0;
        ((lm) this).field_vb = false;
        ((lm) this).field_mb = null;
        ((lm) this).field_wb = false;
        ((lm) this).field_lb = 43;
        ((lm) this).field_hb = false;
        ((lm) this).field_rb = 0;
        ((lm) this).field_nb = null;
        ((lm) this).field_xb = 0;
        ((lm) this).field_rb = hp.a((byte) 43, g.field_a, 200);
        ((lm) this).field_ub = new int[43];
        ((lm) this).field_qb = new int[43];
        this.m((byte) 119);
        ((lm) this).field_kb = hp.a((byte) 20, g.field_a, 20);
    }

    final boolean b(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        c var12 = null;
        Object var13 = null;
        ek var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var19 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = param1 * param1;
          if (param0) {
            stackOut_2_0 = 2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6 = var5 + ((lm) this).field_C;
        var7 = var5 + ((lm) this).field_B;
        var8 = ((lm) this).e((byte) -112);
        var9 = ((lm) this).g(1829947600);
        var10 = ((lm) this).field_C + -var5;
        L1: while (true) {
          if (var6 < var10) {
            L2: {
              if (param2 < -13) {
                break L2;
              } else {
                this.b(85, 115, -91);
                break L2;
              }
            }
            return false;
          } else {
            var11 = ((lm) this).field_B - var5;
            L3: while (true) {
              if (var11 > var7) {
                var10++;
                continue L1;
              } else {
                var12 = ((lm) this).field_A.a(true, var10, var11);
                if (var12 != null) {
                  var13 = (Object) (Object) var12.a(false);
                  L4: while (true) {
                    if (var13 instanceof ek) {
                      L5: {
                        L6: {
                          L7: {
                            var14 = (ek) var13;
                            if (!(var13 instanceof ge)) {
                              break L7;
                            } else {
                              if (((ge) var13).q(-127)) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var14 instanceof og) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                        var15 = var14.e((byte) -112);
                        var16 = var14.g(1829947600);
                        var17 = -var8 + var15;
                        var18 = var16 + -var9;
                        if (var4 <= var17 * var17 - -(var18 * var18)) {
                          break L5;
                        } else {
                          L8: {
                            if (param0) {
                              break L8;
                            } else {
                              if (((lm) this).field_A.field_b.a(var16, var15, -17201, var8, var9, false, true) != -1) {
                                break L8;
                              } else {
                                break L5;
                              }
                            }
                          }
                          return true;
                        }
                      }
                      var13 = (Object) (Object) ((br) var13).field_d;
                      continue L4;
                    } else {
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  var11++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (((lm) this).field_Q == 20) {
            return;
        }
        ((lm) this).a(25, (byte) -89);
        ((lm) this).field_tb = param0;
        ((lm) this).field_S = param1 ? true : false;
    }

    final void p(int param0) {
        ((lm) this).field_hb = true;
        ((lm) this).field_D = !((lm) this).k((byte) 122) ? 21 : 22;
        if (param0 < 22) {
            ((lm) this).field_nb = null;
        }
    }

    final void a(int param0, rl param1) {
        try {
            super.a(param0, param1);
            ((lm) this).field_sb = ((lm) this).field_A.field_b.field_p;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "lm.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void n(byte param0) {
        int var2 = 19 % ((param0 - 2) / 44);
        ((lm) this).field_tb = 0;
    }

    final void b(int param0, byte param1, int param2) {
        param2 = param2 / 24;
        param0 = param0 / 24;
        ((lm) this).field_sb[param0][param2] = ((lm) this).field_sb[param0][param2] + 1;
        if (param1 != -61) {
            boolean discarded$0 = ((lm) this).d(true);
        }
    }

    private final void m(byte param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = ((lm) this).e((byte) -112);
        int var3 = ((lm) this).g(1829947600);
        int var4 = 0;
        if (param0 < 90) {
            ((lm) this).l((byte) 59);
        }
        while (-1 + ((lm) this).field_lb > var4) {
            ((lm) this).field_ub[var4] = var2 - -dm.field_dc[var4];
            ((lm) this).field_qb[var4] = dm.field_Ib[var4] + var3;
            var4++;
        }
        ((lm) this).field_ub[((lm) this).field_lb - 1] = var2;
        ((lm) this).field_qb[-1 + ((lm) this).field_lb] = var3;
    }

    final void a(int param0, sa param1) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              if (((lm) this).field_Q == 18) {
                break L1;
              } else {
                if (20 == ((lm) this).field_Q) {
                  break L1;
                } else {
                  if (16 == ((lm) this).field_Q) {
                    break L1;
                  } else {
                    if (((lm) this).field_Q != 2) {
                      L2: {
                        if (param0 == -12) {
                          break L2;
                        } else {
                          field_ob = null;
                          break L2;
                        }
                      }
                      ((lm) this).a(16, (byte) -89);
                      ((lm) this).field_mb = param1;
                      ((lm) this).field_S = true;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("lm.MA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final int o(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = -103 % ((72 - param0) / 49);
        int var3 = ((lm) this).field_D;
        if (!(2 == var3)) {
            if (!(var3 == 4)) {
                if (!(6 == var3)) {
                    return eb.field_A;
                }
            }
        }
        return n.field_i;
    }

    public static void n() {
        field_ob = null;
        field_eb = null;
        field_fb = null;
        field_gb = null;
        field_jb = null;
    }

    final void q(int param0) {
        if (param0 != -22882) {
            ((lm) this).field_ub = null;
        }
        ((lm) this).a(0, (byte) -89);
    }

    abstract void l(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "";
        field_ob = "Do not yield to their technical powers!";
    }
}
