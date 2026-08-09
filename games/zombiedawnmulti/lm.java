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
        L0: {
          param2 = param2 / 24;
          param1 = param1 / 24;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              L1: {
                if (this.field_sb[0].length <= param2) {
                  break L1;
                } else {
                  if ((this.field_sb.length ^ -1) >= (param1 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 >= 102) {
                        break L2;
                      } else {
                        this.field_mb = (sa) null;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (this.field_sb[param1][param2] == -1) {
                          break L4;
                        } else {
                          if (this.field_sb[param1][param2] >= 1) {
                            break L4;
                          } else {
                            stackIn_14_0 = 1;
                            break L3;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              this.field_kb = 200;
              stackIn_2_0 = this;

              if (!param0) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((lm) (this)).field_wb = stackIn_3_1 != 0;
                var3_int = (param1.e((byte) -112) + this.e((byte) -112)) / 2;
                var4 = (param1.g(1829947600) - -this.g(1829947600)) / 2;
                var5 = var3_int - this.e((byte) -112);
                var6 = -this.g(1829947600) + var4;
                var7 = 400;
                if ((var7 ^ -1) >= (var5 * var5 + var6 * var6 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if ((this.field_N ^ -1) != (this.e((byte) -112) ^ -1)) {
                      break L4;
                    } else {
                      if (this.field_ab == this.g(1829947600)) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_N = this.e((byte) -112);
                  this.field_ab = this.g(1829947600);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                var8 = 8;
                if (this.a((byte) 117, var4, var3_int)) {
                  break L5;
                } else {
                  var3_int = var3_int + (hp.a((byte) -107, g.field_a, 2 * var8) + (12 - var8));
                  var4 = var4 + (12 + (hp.a((byte) 108, g.field_a, 2 * var8) + -var8));
                  break L5;
                }
              }
              if (!this.a((byte) 125, var4, var3_int)) {
                break L2;
              } else {
                if (0 == (this.field_A.field_b.a(this.g(1829947600), this.e((byte) -112), -17201, var3_int, var4, false, false) ^ -1)) {
                  break L2;
                } else {
                  this.b(this.field_N, -94, this.field_ab);
                  this.field_N = var3_int;
                  this.field_ab = var4;
                  this.b(this.field_ab, (byte) -61, this.field_N);
                  break L2;
                }
              }
            }
            this.c(93, 28672 * this.field_M);
            this.field_S = true;
            stackIn_16_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("lm.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final ge a(boolean param0, int param1, int param2) {
        ge var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != 5690) {
            this.field_qb = (int[]) null;
        }
        br var4 = this.field_A.field_u.c(57);
        do {
            if (!(var4 instanceof ek)) {
                return null;
            }
            if (!(!(var4 instanceof ge))) {
                var5 = (ge) ((Object) var4);
                if (var5 != null && var5.o(param2 ^ 5700)) {
                    var6 = var5.e((byte) -112) + -this.e((byte) -112);
                    var7 = var5.g(param2 ^ 1829953258) + -this.g(1829947600);
                    if (var6 * var6 + var7 * var7 < param1 * param1) {
                        if (param0 || 0 != (this.field_A.field_b.a(var5.g(1829947600), var5.e((byte) -112), param2 ^ -21771, this.e((byte) -112), this.g(param2 + 1829941910), false, true) ^ -1)) {
                            return var5;
                        }
                    }
                }
            }
            var4 = var4.field_d;
        } while (var8 == 0);
        return null;
    }

    final boolean k(byte param0) {
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            var2 = this.field_D;
            if (var2 != 0) {
              break L1;
            } else {
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (-2 == (var2 ^ -1)) {
            break L0;
          } else {
            L2: {
              if (var2 != 2) {
                break L2;
              } else {
                if (var3 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var2 != 3) {
                  break L4;
                } else {
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (4 == var2) {
                break L3;
              } else {
                L5: {
                  if ((var2 ^ -1) != -6) {
                    break L5;
                  } else {
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (6 == var2) {
                  return true;
                } else {
                  L6: {
                    if (var2 != 7) {
                      break L6;
                    } else {
                      if (var3 == 0) {
                        return true;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-9 != (var2 ^ -1)) {
                      break L7;
                    } else {
                      if (var3 == 0) {
                        return true;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (9 == var2) {
                    return false;
                  } else {
                    L8: {
                      if ((var2 ^ -1) != -11) {
                        break L8;
                      } else {
                        if (var3 == 0) {
                          return true;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (-12 != (var2 ^ -1)) {
                        break L9;
                      } else {
                        if (var3 == 0) {
                          return false;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (-13 == (var2 ^ -1)) {
                        break L10;
                      } else {
                        L11: {
                          if (var2 != 13) {
                            break L11;
                          } else {
                            if (var3 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if ((var2 ^ -1) == -15) {
                          break L10;
                        } else {
                          if (-16 == (var2 ^ -1)) {
                            return true;
                          } else {
                            if (16 == var2) {
                              return true;
                            } else {
                              L12: {
                                if (-19 != (var2 ^ -1)) {
                                  break L12;
                                } else {
                                  if (var3 == 0) {
                                    return true;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (19 != var2) {
                                  break L13;
                                } else {
                                  if (var3 == 0) {
                                    return true;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if ((var2 ^ -1) != -21) {
                                  break L14;
                                } else {
                                  if (var3 == 0) {
                                    return true;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              if ((var2 ^ -1) == -22) {
                                return false;
                              } else {
                                if (var2 == 22) {
                                  return true;
                                } else {
                                  var2 = -61 % ((74 - param0) / 36);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return true;
                  }
                }
              }
            }
            return true;
          }
        }
        return false;
    }

    final boolean d(boolean param0) {
        this.m((byte) 99);
        if (param0) {
            this.q(-67);
        }
        int var2 = this.l(-18812);
        if (0 == (var2 ^ -1)) {
            return false;
        }
        this.field_kb = 20;
        this.field_wb = false;
        this.field_N = this.field_ub[var2];
        this.field_ab = this.field_qb[var2];
        this.b(this.e((byte) -112), -80, this.g(1829947600));
        this.b(this.field_ab, (byte) -61, this.field_N);
        this.c(-50, this.field_M * this.field_cb);
        this.a(1, (byte) -89);
        return true;
    }

    private final boolean m(int param0) {
        int var2 = 0;
        ek var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = 0;
                    if (param0 == -7) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b(-71, -11, -39);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (ek) ((Object) this.field_A.field_u.c(100));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == null) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_11_0 = var3 instanceof ge;
                    stackIn_5_0 = stackIn_11_0;
                    if (var9 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!stackIn_5_0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (!((ge) ((Object) var3)).p((byte) 56)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = this.field_ub[-1 + this.field_lb] - var3.e((byte) -112);
                    var5 = this.field_qb[-1 + this.field_lb] - var3.g(1829947600);
                    var6 = var4 * var4;
                    var7 = var5 * var5;
                    var8 = 90000;
                    if (var6 - -var7 >= var8) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2 = 1;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = (ek) ((Object) this.field_A.field_u.b(param0 ^ -1));
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return var2 != 0;
                }
                case 11: {
                    return stackIn_11_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        this.a(32, (byte) -89);
        if (param0) {
            this.m((byte) -45);
        }
        this.field_S = true;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 38 % ((-40 - param1) / 34);
        param2 = param2 / 24;
        param0 = param0 / 24;
        int[] dupTemp$0 = this.field_sb[param2];
        int dupTemp$1 = dupTemp$0[param0] - 1;
        dupTemp$0[param0] = dupTemp$1;
        if (0 > dupTemp$1) {
            this.field_sb[param2][param0] = 0;
        }
    }

    final void j(byte param0) {
        this.a(20, (byte) -89);
        if (param0 <= 101) {
            this.field_lb = -17;
        }
    }

    private final int l(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        c var6 = null;
        ek var7 = null;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (!this.field_A.field_l) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = this.m(-7) ? 1 : 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var2 = stackIn_3_0;
                    var3 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = this.field_lb ^ -1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 >= (var3 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    fn.field_a[var3] = 0;
                    stackIn_32_0 = -1 + this.field_lb ^ -1;
                    stackIn_7_0 = stackIn_32_0;
                    stackIn_32_1 = var3 ^ -1;
                    stackIn_7_1 = stackIn_32_1;
                    if (var8 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 == stackIn_7_1) {
                        statePc = 13;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!this.a((byte) 108, this.field_qb[var3], this.field_ub[var3])) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 != this.field_A.field_b.a(this.field_qb[var3], 95, this.field_ub[var3], this.g(1829947600), this.e((byte) -112))) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    fn.field_a[var3] = -1;
                    if (var8 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = this.field_C + -1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (1 + this.field_C < var4) {
                        statePc = 30;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_5_0 = this.field_B + -1;
                    stackIn_16_0 = stackIn_5_0;
                    if (var8 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var5 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (1 + this.field_B < var5) {
                        statePc = 28;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6 = this.field_A.a(true, var4, var5);
                    if (var8 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var6 == null) {
                        statePc = 26;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((var6.b(param0 ^ -18812) ^ -1) == -1) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7 = (ek) ((Object) var6.a(false));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var7 == null) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.a(var2 != 0, var7, var3, 2);
                    var7 = (ek) ((Object) var6.c(-1));
                    if (var8 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var5++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var4++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3++;
                    if (var8 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3 = -1;
                    stackIn_32_0 = param0;
                    stackIn_32_1 = -18812;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 == stackIn_32_1) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return 34;
                }
                case 34: {
                    var4 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_lb <= var4) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = fn.field_a[var4];
                    stackIn_37_0 = stackIn_45_0;
                    stackIn_45_1 = -1;
                    stackIn_37_1 = stackIn_45_1;
                    if (var8 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 != stackIn_37_1) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (0 == (var3 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (fn.field_a[var3] > fn.field_a[var4]) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var3 = var4;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = var3;
                    stackIn_45_1 = this.field_lb + -1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 == stackIn_45_1) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var3 = -1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void j(int param0) {
        this.a(param0, (byte) -89);
        this.field_A.field_m.c(-112);
        super.j(18);
    }

    final void h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int statePc = 0;
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 >= 30) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.p(110);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    super.h(38);
                    this.b((byte) 120, this.field_Q);
                    if (-1 == (this.field_Q ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_Q != 2) {
                        statePc = 18;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.h((byte) 70);
                    if (this.field_V >= 4) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_L = this.field_L + 1;
                    if (var4 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_V != 4) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    fieldTemp$0 = this.field_xb;
                    this.field_xb = this.field_xb + 1;
                    if (fieldTemp$0 >= 400) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_V = this.field_V + 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    this.field_L = 0;
                    this.field_W = 0;
                    this.field_R = 0;
                    if (var4 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((this.field_V ^ -1) == -7) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.a(0, (byte) -89);
                    this.b(this.g(1829947600), (byte) -61, this.e((byte) -112));
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (!this.field_A.field_b.a(this.field_G - -this.field_R >> -337878192, true, true, this.field_W + this.field_E >> 717214000)) {
                        statePc = 17;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_E = this.field_E - this.field_W;
                    this.field_G = this.field_G - this.field_R;
                    this.field_R = 0;
                    this.field_W = 0;
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_Q == 1) {
                        statePc = 39;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-4 == (this.field_Q ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_Q == 16) {
                        statePc = 31;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_Q != 20) {
                        statePc = 23;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((this.field_Q ^ -1) == -26) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-31 != (this.field_Q ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.h((byte) 42);
                    fieldTemp$1 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if (20 <= fieldTemp$1) {
                        statePc = 27;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_kb = 0;
                    this.l((byte) 111);
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    fieldTemp$2 = this.field_tb - 1;
                    this.field_tb = this.field_tb - 1;
                    if ((fieldTemp$2 ^ -1) >= -1) {
                        statePc = 30;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.a(0, (byte) -89);
                    this.field_S = true;
                    this.field_kb = 0;
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    fieldTemp$3 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if (fieldTemp$3 >= 20) {
                        statePc = 33;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_kb = 0;
                    if (this.field_mb.b(true)) {
                        statePc = 35;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_mb = null;
                    this.a(0, (byte) -89);
                    this.field_S = true;
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    fieldTemp$4 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if ((fieldTemp$4 ^ -1) <= -21) {
                        statePc = 38;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.field_kb = 0;
                    this.l((byte) 111);
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    fieldTemp$5 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if (fieldTemp$5 < 20) {
                        statePc = 57;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.field_kb = 0;
                    var2 = 0;
                    var3 = this.field_A.field_m.field_A.c(106);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (!(var3 instanceof bf)) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var2 = var2 != 0 | ((bf) ((Object) var3)).a((lm) (this), 0) ? 1 : 0;
                    var3 = var3.field_d;
                    if (var4 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var4 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_wb) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var2 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (!this.field_wb) {
                        statePc = 53;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var2 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.c(119, this.field_cb);
                    if (var4 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.c(-110, this.field_cb >> -233368862);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = this;
                    stackIn_54_0 = stackIn_55_0;
                    if (var2 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_56_0 = this;
                    stackIn_56_1 = 1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = this;
                    stackIn_56_1 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    ((lm) (this)).field_wb = stackIn_56_1 != 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    this.h((byte) 38);
                    if (this.k(2)) {
                        statePc = 59;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.a(0, (byte) -89);
                    this.l((byte) 111);
                    if (var4 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    fieldTemp$6 = this.field_ib + 1;
                    this.field_ib = this.field_ib + 1;
                    if (this.field_rb >= fieldTemp$6) {
                        statePc = 70;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    this.field_ib = 0;
                    stackIn_63_0 = this;
                    stackIn_62_0 = stackIn_63_0;
                    if (this.field_vb) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    ((lm) (this)).field_vb = stackIn_64_1 != 0;
                    if (this.field_vb) {
                        statePc = 69;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = this;
                    stackIn_66_0 = stackIn_67_0;
                    if (!this.field_vb) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = this;
                    stackIn_68_1 = 65;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = this;
                    stackIn_68_1 = hp.a((byte) -77, g.field_a, 200) + 20;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    ((lm) (this)).field_rb = stackIn_68_1;
                    if (var4 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.field_rb = 53;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (!this.field_vb) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_V = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    fieldTemp$7 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if (20 > fieldTemp$7) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    this.field_kb = 0;
                    this.l((byte) 111);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, ek param1, int param2, int param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ge var9 = null;
        try {
          L0: {
            L1: {
              if (param3 == 2) {
                break L1;
              } else {
                field_pb = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!(param1 instanceof ge)) {
                    break L4;
                  } else {
                    L5: {
                      var9 = (ge) ((Object) param1);
                      if (!var9.q(param3 ^ -126)) {
                        break L5;
                      } else {
                        L6: {
                          if (!param0) {
                            break L6;
                          } else {
                            if (var9.p((byte) 76)) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          var6 = this.field_ub[param2] + -param1.e((byte) -112);
                          var7 = this.field_qb[param2] - param1.g(1829947600);
                          var8 = var6 * var6 - -(var7 * var7);
                          if ((fn.field_a[param2] ^ -1) == -1) {
                            break L7;
                          } else {
                            if ((var8 ^ -1) > (fn.field_a[param2] ^ -1)) {
                              break L7;
                            } else {
                              break L5;
                            }
                          }
                        }
                        fn.field_a[param2] = var8;
                        break L5;
                      }
                    }
                    if (!ZombieDawnMulti.field_E) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param1 instanceof og) {
                  L8: {
                    var5_int = this.field_ub[param2] + -param1.e((byte) -112);
                    var6 = this.field_qb[param2] - param1.g(param3 ^ 1829947602);
                    var7 = var5_int * var5_int - -(var6 * var6);
                    if (-1 == (fn.field_a[param2] ^ -1)) {
                      break L8;
                    } else {
                      if ((var7 ^ -1) > (fn.field_a[param2] ^ -1)) {
                        break L8;
                      } else {
                        break L2;
                      }
                    }
                  }
                  fn.field_a[param2] = var7;
                  break L3;
                } else {
                  break L2;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("lm.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -19863) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        lm.a(-75, -66, 106);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = param0 & 1 | var3_int << 90930017;
                        stackIn_8_0 = param0 >>> 1;
                        stackIn_6_0 = stackIn_8_0;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param0 = stackIn_6_0;
                        param2--;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var3), "lm.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_ib = 0;
        this.field_vb = false;
        this.field_mb = null;
        this.field_wb = false;
        this.field_lb = 43;
        this.field_hb = false;
        this.field_rb = 0;
        this.field_nb = null;
        this.field_xb = 0;
        this.field_rb = hp.a((byte) 43, g.field_a, 200);
        this.field_ub = new int[43];
        this.field_qb = new int[43];
        this.m((byte) 119);
        this.field_kb = hp.a((byte) 20, g.field_a, 20);
    }

    final boolean b(boolean param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_31_0 = 0;
        boolean stackOut_15_0;
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = param1 * param1;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 2;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var5 = stackIn_3_0;
                    var6 = var5 + this.field_C;
                    var7 = var5 + this.field_B;
                    var8 = this.e((byte) -112);
                    var9 = this.g(1829947600);
                    var10 = this.field_C + -var5;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var6 ^ -1) > (var10 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_31_0 = this.field_B - var5;
                    stackIn_6_0 = stackIn_31_0;
                    if (var19 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var11 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = var11 ^ -1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 < (var7 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var12 = this.field_A.a(true, var10, var11);
                    if (var19 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var12 != null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var19 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var13 = var12.a(false);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (!(var13 instanceof ek)) {
                        statePc = 27;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var14 = (ek) (var13);
                    stackOut_15_0 = var13 instanceof ge;
                    stackIn_8_0 = stackOut_15_0 ? 1 : 0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var19 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!stackIn_16_0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (((ge) (var13)).q(-127)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var14 instanceof og) {
                        statePc = 21;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var15 = var14.e((byte) -112);
                    var16 = var14.g(1829947600);
                    var17 = -var8 + var15;
                    var18 = var16 + -var9;
                    if ((var4 ^ -1) >= (var17 * var17 - -(var18 * var18) ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (param0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((this.field_A.field_b.a(var16, var15, -17201, var8, var9, false, true) ^ -1) != 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return true;
                }
                case 26: {
                    var13 = ((br) (var13)).field_d;
                    if (var19 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var11++;
                    if (var19 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var19 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = param2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 < -13) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.b(85, 115, -91);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1) {
        if (this.field_Q == 20) {
            return;
        }
        this.a(25, (byte) -89);
        this.field_tb = param0;
        this.field_S = param1 ? true : false;
    }

    final void p(int param0) {
        this.field_hb = true;
        this.field_D = !this.k((byte) 122) ? 21 : 22;
        if (param0 < 22) {
            this.field_nb = (ge) null;
        }
    }

    final void a(int param0, rl param1) {
        try {
            super.a(param0, param1);
            this.field_sb = this.field_A.field_b.field_p;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lm.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void n(byte param0) {
        int var2 = 19 % ((param0 - 2) / 44);
        this.field_tb = 0;
    }

    final void b(int param0, byte param1, int param2) {
        param2 = param2 / 24;
        param0 = param0 / 24;
        int[] dupTemp$0 = this.field_sb[param0];
        dupTemp$0[param2] = dupTemp$0[param2] + 1;
        if (param1 != -61) {
            this.d(true);
        }
    }

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = this.e((byte) -112);
                    var3 = this.g(1829947600);
                    var4 = 0;
                    if (param0 >= 90) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.l((byte) 59);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((-1 + this.field_lb ^ -1) >= (var4 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_ub[var4] = var2 - -dm.field_dc[var4];
                    this.field_qb[var4] = dm.field_Ib[var4] + var3;
                    var4++;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_ub[this.field_lb - 1] = var2;
                    this.field_qb[-1 + this.field_lb] = var3;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, sa param1) {
        if ((this.field_Q ^ -1) == -19 || 20 == this.field_Q || 16 == this.field_Q || (this.field_Q ^ -1) == -3) {
            return;
        }
        try {
            if (param0 != -12) {
                field_ob = (String) null;
            }
            this.a(16, (byte) -89);
            this.field_mb = param1;
            this.field_S = true;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lm.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int o(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = -103 % ((72 - param0) / 49);
        int var3 = this.field_D;
        if (2 != var3 || var4 != 0) {
            if (-5 != (var3 ^ -1) || var4 != 0) {
                if (6 != var3 || var4 != 0) {
                    return eb.field_A;
                }
            }
        }
        return n.field_i;
    }

    public static void n(int param0) {
        if (param0 != 0) {
            field_ob = (String) null;
        }
        field_ob = null;
        field_eb = null;
        field_fb = null;
        field_gb = null;
        field_jb = null;
    }

    final void q(int param0) {
        if (param0 != -22882) {
            this.field_ub = (int[]) null;
        }
        this.a(0, (byte) -89);
    }

    abstract void l(byte param0);

    static {
        field_jb = "";
        field_ob = "Do not yield to their technical powers!";
    }
}
