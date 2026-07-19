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
        int decompiledRegionSelector0 = 0;
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
              this.field_kb = 200;
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
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
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
            stackOut_15_0 = 1;
            stackIn_16_0 = stackOut_15_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("lm.NA(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
            this.field_qb = (int[]) null;
            break L0;
          }
        }
        var4 = this.field_A.field_u.c(57);
        L1: while (true) {
          if (var4 instanceof ek) {
            L2: {
              if (var4 instanceof ge) {
                var5 = (ge) ((Object) var4);
                if (var5 == null) {
                  break L2;
                } else {
                  if (!var5.o(param2 ^ 5700)) {
                    break L2;
                  } else {
                    var6 = var5.e((byte) -112) + -this.e((byte) -112);
                    var7 = var5.g(param2 ^ 1829953258) + -this.g(1829947600);
                    if (var6 * var6 + var7 * var7 >= param1 * param1) {
                      break L2;
                    } else {
                      L3: {
                        if (param0) {
                          break L3;
                        } else {
                          if (0 == (this.field_A.field_b.a(var5.g(1829947600), var5.e((byte) -112), param2 ^ -21771, this.e((byte) -112), this.g(param2 + 1829941910), false, true) ^ -1)) {
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
              } else {
                break L2;
              }
            }
            var4 = var4.field_d;
            if (var8 == 0) {
              continue L1;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final boolean k(byte param0) {
        int var2 = 0;
        int var3 = 0;
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
        boolean stackOut_4_0 = false;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = 0;
          if (param0 == -7) {
            break L0;
          } else {
            this.b(-71, -11, -39);
            break L0;
          }
        }
        var3 = (ek) ((Object) this.field_A.field_u.c(100));
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              stackOut_4_0 = var3 instanceof ge;
              stackIn_11_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var9 != 0) {
                return stackIn_11_0;
              } else {
                L3: {
                  if (!stackIn_5_0) {
                    break L3;
                  } else {
                    if (!((ge) ((Object) var3)).p((byte) 56)) {
                      break L3;
                    } else {
                      var4 = this.field_ub[-1 + this.field_lb] - var3.e((byte) -112);
                      var5 = this.field_qb[-1 + this.field_lb] - var3.g(1829947600);
                      var6 = var4 * var4;
                      var7 = var5 * var5;
                      var8 = 90000;
                      if (var6 - -var7 >= var8) {
                        break L3;
                      } else {
                        var2 = 1;
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var3 = (ek) ((Object) this.field_A.field_u.b(param0 ^ -1));
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var2 != 0;
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
        this.field_sb[param2][param0] = this.field_sb[param2][param0] - 1;
        if (0 > this.field_sb[param2][param0] - 1) {
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        c var6 = null;
        ek var7 = null;
        int var8 = 0;
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
        int stackOut_2_0 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!this.field_A.field_l) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.m(-7);
            stackIn_3_0 = stackOut_1_0 ? 1 : 0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = 0;
        L1: while (true) {
          stackOut_4_0 = this.field_lb ^ -1;
          stackIn_5_0 = stackOut_4_0;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_5_0 >= (var3 ^ -1)) {
                  break L4;
                } else {
                  fn.field_a[var3] = 0;
                  stackOut_6_0 = -1 + this.field_lb ^ -1;
                  stackOut_6_1 = var3 ^ -1;
                  stackIn_32_0 = stackOut_6_0;
                  stackIn_32_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L5: {
                      L6: {
                        if (stackIn_7_0 == stackIn_7_1) {
                          break L6;
                        } else {
                          L7: {
                            if (!this.a((byte) 108, this.field_qb[var3], this.field_ub[var3])) {
                              break L7;
                            } else {
                              if (-1 != this.field_A.field_b.a(this.field_qb[var3], 95, this.field_ub[var3], this.g(1829947600), this.e((byte) -112))) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          fn.field_a[var3] = -1;
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 = this.field_C + -1;
                      L8: while (true) {
                        if (1 + this.field_C < var4) {
                          break L5;
                        } else {
                          stackOut_15_0 = this.field_B + -1;
                          stackIn_5_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var8 != 0) {
                            continue L2;
                          } else {
                            var5 = stackIn_16_0;
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (1 + this.field_B < var5) {
                                    break L11;
                                  } else {
                                    var6 = this.field_A.a(true, var4, var5);
                                    if (var8 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        L13: {
                                          if (var6 == null) {
                                            break L13;
                                          } else {
                                            if ((var6.b(param0 ^ -18812) ^ -1) == -1) {
                                              break L13;
                                            } else {
                                              var7 = (ek) ((Object) var6.a(false));
                                              L14: while (true) {
                                                if (var7 == null) {
                                                  break L13;
                                                } else {
                                                  this.a(var2 != 0, var7, var3, 2);
                                                  var7 = (ek) ((Object) var6.c(-1));
                                                  if (var8 != 0) {
                                                    break L12;
                                                  } else {
                                                    if (var8 == 0) {
                                                      continue L14;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var5++;
                                        break L12;
                                      }
                                      if (var8 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var4++;
                                break L10;
                              }
                              if (var8 == 0) {
                                continue L8;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var3 = -1;
              stackOut_31_0 = param0;
              stackOut_31_1 = -18812;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L3;
            }
            if (stackIn_32_0 == stackIn_32_1) {
              var4 = 0;
              L15: while (true) {
                L16: {
                  L17: {
                    if (this.field_lb <= var4) {
                      break L17;
                    } else {
                      stackOut_36_0 = fn.field_a[var4];
                      stackOut_36_1 = -1;
                      stackIn_45_0 = stackOut_36_0;
                      stackIn_45_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (var8 != 0) {
                        break L16;
                      } else {
                        L18: {
                          if (stackIn_37_0 != stackIn_37_1) {
                            L19: {
                              if (0 == (var3 ^ -1)) {
                                break L19;
                              } else {
                                if (fn.field_a[var3] > fn.field_a[var4]) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var3 = var4;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var4++;
                        if (var8 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  stackOut_44_0 = var3;
                  stackOut_44_1 = this.field_lb + -1;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  break L16;
                }
                L20: {
                  if (stackIn_45_0 == stackIn_45_1) {
                    var3 = -1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                return var3;
              }
            } else {
              return 34;
            }
          }
        }
    }

    final void j(int param0) {
        this.a(param0, (byte) -89);
        this.field_A.field_m.c(-112);
        super.j(18);
    }

    final void h(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
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
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 >= 30) {
            break L0;
          } else {
            this.p(110);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              super.h(38);
              this.b((byte) 120, this.field_Q);
              if (-1 == (this.field_Q ^ -1)) {
                break L3;
              } else {
                L4: {
                  if (this.field_Q != 2) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        this.h((byte) 70);
                        if (this.field_V >= 4) {
                          break L6;
                        } else {
                          this.field_L = this.field_L + 1;
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (this.field_V != 4) {
                          break L7;
                        } else {
                          L8: {
                            fieldTemp$8 = this.field_xb;
                            this.field_xb = this.field_xb + 1;
                            if (fieldTemp$8 >= 400) {
                              this.field_V = this.field_V + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_L = 0;
                          this.field_W = 0;
                          this.field_R = 0;
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if ((this.field_V ^ -1) == -7) {
                        this.a(0, (byte) -89);
                        this.b(this.g(1829947600), (byte) -61, this.e((byte) -112));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (!this.field_A.field_b.a(this.field_G - -this.field_R >> -337878192, true, true, this.field_W + this.field_E >> 717214000)) {
                      this.field_E = this.field_E - this.field_W;
                      this.field_G = this.field_G - this.field_R;
                      this.field_R = 0;
                      this.field_W = 0;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L9: {
                  if (this.field_Q == 1) {
                    break L9;
                  } else {
                    L10: {
                      if (-4 == (this.field_Q ^ -1)) {
                        break L10;
                      } else {
                        L11: {
                          if (this.field_Q == 16) {
                            break L11;
                          } else {
                            if (this.field_Q != 20) {
                              L12: {
                                if ((this.field_Q ^ -1) == -26) {
                                  break L12;
                                } else {
                                  if (-31 != (this.field_Q ^ -1)) {
                                    break L2;
                                  } else {
                                    this.h((byte) 42);
                                    fieldTemp$9 = this.field_kb;
                                    this.field_kb = this.field_kb + 1;
                                    if (20 <= fieldTemp$9) {
                                      this.field_kb = 0;
                                      this.l((byte) 111);
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L12;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              }
                              fieldTemp$10 = this.field_tb - 1;
                              this.field_tb = this.field_tb - 1;
                              if ((fieldTemp$10 ^ -1) >= -1) {
                                this.a(0, (byte) -89);
                                this.field_S = true;
                                this.field_kb = 0;
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              } else {
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        fieldTemp$11 = this.field_kb;
                        this.field_kb = this.field_kb + 1;
                        if (fieldTemp$11 >= 20) {
                          this.field_kb = 0;
                          if (this.field_mb.b(true)) {
                            this.field_mb = null;
                            this.a(0, (byte) -89);
                            this.field_S = true;
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    fieldTemp$12 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if ((fieldTemp$12 ^ -1) <= -21) {
                      this.field_kb = 0;
                      this.l((byte) 111);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L13: {
                  fieldTemp$13 = this.field_kb;
                  this.field_kb = this.field_kb + 1;
                  if (fieldTemp$13 < 20) {
                    break L13;
                  } else {
                    this.field_kb = 0;
                    var2 = 0;
                    var3 = this.field_A.field_m.field_A.c(106);
                    L14: while (true) {
                      L15: {
                        L16: {
                          L17: {
                            L18: {
                              if (!(var3 instanceof bf)) {
                                break L18;
                              } else {
                                var2 = var2 != 0 | ((bf) ((Object) var3)).a((lm) (this), 0) ? 1 : 0;
                                var3 = var3.field_d;
                                if (var4 != 0) {
                                  break L17;
                                } else {
                                  if (var4 == 0) {
                                    continue L14;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            if (this.field_wb) {
                              break L17;
                            } else {
                              if (var2 != 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (!this.field_wb) {
                            break L15;
                          } else {
                            if (var2 == 0) {
                              this.c(119, this.field_cb);
                              if (var4 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.c(-110, this.field_cb >> -233368862);
                        break L15;
                      }
                      L19: {
                        stackOut_53_0 = this;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (var2 == 0) {
                          stackOut_55_0 = this;
                          stackOut_55_1 = 0;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          break L19;
                        } else {
                          stackOut_54_0 = this;
                          stackOut_54_1 = 1;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          break L19;
                        }
                      }
                      ((lm) (this)).field_wb = stackIn_56_1 != 0;
                      break L13;
                    }
                  }
                }
                this.h((byte) 38);
                if (this.k(2)) {
                  this.a(0, (byte) -89);
                  this.l((byte) 111);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L1;
                }
              }
            }
            L20: {
              fieldTemp$14 = this.field_ib + 1;
              this.field_ib = this.field_ib + 1;
              if (this.field_rb >= fieldTemp$14) {
                break L20;
              } else {
                L21: {
                  this.field_ib = 0;
                  stackOut_61_0 = this;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (this.field_vb) {
                    stackOut_63_0 = this;
                    stackOut_63_1 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    break L21;
                  } else {
                    stackOut_62_0 = this;
                    stackOut_62_1 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    break L21;
                  }
                }
                L22: {
                  ((lm) (this)).field_vb = stackIn_64_1 != 0;
                  if (this.field_vb) {
                    break L22;
                  } else {
                    L23: {
                      stackOut_65_0 = this;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      if (!this.field_vb) {
                        stackOut_67_0 = this;
                        stackOut_67_1 = hp.a((byte) -77, g.field_a, 200) + 20;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        break L23;
                      } else {
                        stackOut_66_0 = this;
                        stackOut_66_1 = 65;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        break L23;
                      }
                    }
                    ((lm) (this)).field_rb = stackIn_68_1;
                    if (var4 == 0) {
                      break L20;
                    } else {
                      break L22;
                    }
                  }
                }
                this.field_rb = 53;
                break L20;
              }
            }
            L24: {
              if (!this.field_vb) {
                this.field_V = 0;
                break L24;
              } else {
                break L24;
              }
            }
            fieldTemp$15 = this.field_kb;
            this.field_kb = this.field_kb + 1;
            if (20 > fieldTemp$15) {
              break L2;
            } else {
              this.field_kb = 0;
              this.l((byte) 111);
              break L1;
            }
          }
          break L1;
        }
    }

    private final void a(boolean param0, ek param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ge var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("lm.CA(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -19863) {
                break L1;
              } else {
                discarded$2 = lm.a(-75, -66, 106);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-1 <= (param2 ^ -1)) {
                    break L4;
                  } else {
                    var3_int = param0 & 1 | var3_int << 90930017;
                    stackOut_5_0 = param0 >>> 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      param0 = stackIn_6_0;
                      param2--;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "lm.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
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
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_31_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_30_0 = 0;
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
        var6 = var5 + this.field_C;
        var7 = var5 + this.field_B;
        var8 = this.e((byte) -112);
        var9 = this.g(1829947600);
        var10 = this.field_C + -var5;
        L1: while (true) {
          L2: {
            L3: {
              if ((var6 ^ -1) > (var10 ^ -1)) {
                break L3;
              } else {
                stackOut_5_0 = this.field_B - var5;
                stackIn_31_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var19 != 0) {
                  break L2;
                } else {
                  var11 = stackIn_6_0;
                  L4: while (true) {
                    stackOut_7_0 = var11 ^ -1;
                    stackIn_8_0 = stackOut_7_0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (stackIn_8_0 < (var7 ^ -1)) {
                            break L7;
                          } else {
                            var12 = this.field_A.a(true, var10, var11);
                            if (var19 != 0) {
                              break L6;
                            } else {
                              L8: {
                                L9: {
                                  if (var12 != null) {
                                    break L9;
                                  } else {
                                    if (var19 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var13 = var12.a(false);
                                L10: while (true) {
                                  if (!(var13 instanceof ek)) {
                                    break L8;
                                  } else {
                                    var14 = (ek) (var13);
                                    stackOut_15_0 = var13 instanceof ge;
                                    stackIn_8_0 = stackOut_15_0 ? 1 : 0;
                                    stackIn_16_0 = stackOut_15_0;
                                    if (var19 != 0) {
                                      continue L5;
                                    } else {
                                      L11: {
                                        L12: {
                                          L13: {
                                            if (!stackIn_16_0) {
                                              break L13;
                                            } else {
                                              if (((ge) (var13)).q(-127)) {
                                                break L12;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (var14 instanceof og) {
                                            break L12;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        var15 = var14.e((byte) -112);
                                        var16 = var14.g(1829947600);
                                        var17 = -var8 + var15;
                                        var18 = var16 + -var9;
                                        if ((var4 ^ -1) >= (var17 * var17 - -(var18 * var18) ^ -1)) {
                                          break L11;
                                        } else {
                                          L14: {
                                            if (param0) {
                                              break L14;
                                            } else {
                                              if ((this.field_A.field_b.a(var16, var15, -17201, var8, var9, false, true) ^ -1) != 0) {
                                                break L14;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          return true;
                                        }
                                      }
                                      var13 = ((br) (var13)).field_d;
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var19 == 0) {
                                continue L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var10++;
                        break L6;
                      }
                      if (var19 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            stackOut_30_0 = param2;
            stackIn_31_0 = stackOut_30_0;
            break L2;
          }
          L15: {
            if (stackIn_31_0 < -13) {
              break L15;
            } else {
              this.b(85, 115, -91);
              break L15;
            }
          }
          return false;
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
        boolean discarded$0 = false;
        param2 = param2 / 24;
        param0 = param0 / 24;
        this.field_sb[param0][param2] = this.field_sb[param0][param2] + 1;
        if (param1 != -61) {
            discarded$0 = this.d(true);
        }
    }

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = this.e((byte) -112);
          var3 = this.g(1829947600);
          var4 = 0;
          if (param0 >= 90) {
            break L0;
          } else {
            this.l((byte) 59);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if ((-1 + this.field_lb ^ -1) >= (var4 ^ -1)) {
                break L3;
              } else {
                this.field_ub[var4] = var2 - -dm.field_dc[var4];
                this.field_qb[var4] = dm.field_Ib[var4] + var3;
                var4++;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_ub[this.field_lb - 1] = var2;
            this.field_qb[-1 + this.field_lb] = var3;
            break L2;
          }
          return;
        }
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
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_Q ^ -1) == -19) {
                break L1;
              } else {
                if (20 == this.field_Q) {
                  break L1;
                } else {
                  if (16 == this.field_Q) {
                    break L1;
                  } else {
                    if ((this.field_Q ^ -1) != -3) {
                      L2: {
                        if (param0 == -12) {
                          break L2;
                        } else {
                          field_ob = (String) null;
                          break L2;
                        }
                      }
                      this.a(16, (byte) -89);
                      this.field_mb = param1;
                      this.field_S = true;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("lm.MA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            var2 = -103 % ((72 - param0) / 49);
            var3 = this.field_D;
            if (2 != var3) {
              break L1;
            } else {
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-5 != (var3 ^ -1)) {
              break L2;
            } else {
              if (var4 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (6 != var3) {
              break L3;
            } else {
              if (var4 == 0) {
                break L0;
              } else {
                break L3;
              }
            }
          }
          return eb.field_A;
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
