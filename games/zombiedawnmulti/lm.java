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
                  if (this.field_sb.length <= param1) {
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
              ((lm) (this)).field_wb = stackIn_3_1 != 0;
              var3_int = (param1.e((byte) -112) + this.e((byte) -112)) / 2;
              var4 = (param1.g(1829947600) - -this.g(1829947600)) / 2;
              var5 = var3_int - this.e((byte) -112);
              var6 = -this.g(1829947600) + var4;
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
              } else {
                L4: {
                  if (this.field_N != this.e((byte) -112)) {
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
                break L2;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("lm.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
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
        br var4;
        int var8;
        ge var5;
        int var6;
        int var7;
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
            if (var4 instanceof ge) {
              L2: {
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
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_D;
        if (var2 != 0) {
          L0: {
            if (-2 == (var2 ^ -1)) {
              break L0;
            } else {
              if (var2 != 2) {
                L1: {
                  if (var2 != 3) {
                    if (4 == var2) {
                      break L1;
                    } else {
                      if ((var2 ^ -1) != -6) {
                        if (6 == var2) {
                          return true;
                        } else {
                          if (var2 != 7) {
                            if (-9 != (var2 ^ -1)) {
                              if (9 == var2) {
                                return false;
                              } else {
                                if ((var2 ^ -1) != -11) {
                                  if (-12 != (var2 ^ -1)) {
                                    L2: {
                                      if (-13 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (var2 != 13) {
                                          if ((var2 ^ -1) == -15) {
                                            break L2;
                                          } else {
                                            if (-16 == (var2 ^ -1)) {
                                              return true;
                                            } else {
                                              if (16 == var2) {
                                                return true;
                                              } else {
                                                if (-19 != (var2 ^ -1)) {
                                                  if (19 != var2) {
                                                    if ((var2 ^ -1) != -21) {
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
        int var2;
        ek var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
              L3: {
                if (!(var3 instanceof ge)) {
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
                      break L2;
                    }
                  }
                }
              }
              var3 = (ek) ((Object) this.field_A.field_u.b(param0 ^ -1));
              continue L1;
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
        int var2;
        int var3;
        int var4;
        int var5;
        c var6;
        ek var7;
        int var8;
        int var9;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!this.field_A.field_l) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = this.m(-7) ? 1 : 0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = 0;
        L1: while (true) {
          if (this.field_lb <= var3) {
            var3 = -1;
            if (param0 == -18812) {
              var9 = 0;
              var4 = var9;
              L2: while (true) {
                if (this.field_lb <= var9) {
                  L3: {
                    if (var3 == this.field_lb + -1) {
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
                      if (0 == (var3 ^ -1)) {
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
              return 34;
            }
          } else {
            L5: {
              fn.field_a[var3] = 0;
              if ((-1 + this.field_lb ^ -1) == (var3 ^ -1)) {
                break L5;
              } else {
                L6: {
                  if (!this.a((byte) 108, this.field_qb[var3], this.field_ub[var3])) {
                    break L6;
                  } else {
                    if (-1 != this.field_A.field_b.a(this.field_qb[var3], 95, this.field_ub[var3], this.g(1829947600), this.e((byte) -112))) {
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
            var4 = this.field_C + -1;
            L7: while (true) {
              if (1 + this.field_C >= var4) {
                var5 = this.field_B + -1;
                L8: while (true) {
                  if (1 + this.field_B < var5) {
                    var4++;
                    continue L7;
                  } else {
                    var6 = this.field_A.a(true, var4, var5);
                    if (var6 != null) {
                      if (var6.b(param0 ^ -18812) != 0) {
                        var7 = (ek) ((Object) var6.a(false));
                        L9: while (true) {
                          if (var7 != null) {
                            this.a(var2 != 0, var7, var3, 2);
                            var7 = (ek) ((Object) var6.c(-1));
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
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int var2;
        br var3;
        int var4;
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
            super.h(38);
            this.b((byte) 120, this.field_Q);
            if (-1 == (this.field_Q ^ -1)) {
              L3: {
                fieldTemp$0 = this.field_ib + 1;
                this.field_ib = this.field_ib + 1;
                if (this.field_rb >= fieldTemp$0) {
                  break L3;
                } else {
                  L4: {
                    this.field_ib = 0;
                    stackIn_60_0 = this;

                    if (this.field_vb) {
                      stackIn_61_0 = this;
                      stackIn_61_1 = 0;
                      break L4;
                    } else {
                      stackIn_61_0 = this;
                      stackIn_61_1 = 1;
                      break L4;
                    }
                  }
                  ((lm) (this)).field_vb = stackIn_61_1 != 0;
                  if (this.field_vb) {
                    this.field_rb = 53;
                    break L3;
                  } else {
                    L5: {
                      stackIn_64_0 = this;

                      if (!this.field_vb) {
                        stackIn_65_0 = this;
                        stackIn_65_1 = hp.a((byte) -77, g.field_a, 200) + 20;
                        break L5;
                      } else {
                        stackIn_65_0 = this;
                        stackIn_65_1 = 65;
                        break L5;
                      }
                    }
                    ((lm) (this)).field_rb = stackIn_65_1;
                    break L3;
                  }
                }
              }
              L6: {
                if (!this.field_vb) {
                  this.field_V = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              fieldTemp$1 = this.field_kb;
              this.field_kb = this.field_kb + 1;
              if (20 > fieldTemp$1) {
                break L2;
              } else {
                this.field_kb = 0;
                this.l((byte) 111);
                break L1;
              }
            } else {
              if (this.field_Q != 2) {
                if (this.field_Q == 1) {
                  L7: {
                    fieldTemp$2 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if (fieldTemp$2 < 20) {
                      break L7;
                    } else {
                      this.field_kb = 0;
                      var2 = 0;
                      var3 = this.field_A.field_m.field_A.c(106);
                      L8: while (true) {
                        if (!(var3 instanceof bf)) {
                          L9: {
                            L10: {
                              if (this.field_wb) {
                                break L10;
                              } else {
                                if (var2 != 0) {
                                  this.c(-110, this.field_cb >> -233368862);
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (!this.field_wb) {
                              break L9;
                            } else {
                              if (var2 == 0) {
                                this.c(119, this.field_cb);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L11: {
                            stackIn_52_0 = this;

                            if (var2 == 0) {
                              stackIn_53_0 = this;
                              stackIn_53_1 = 0;
                              break L11;
                            } else {
                              stackIn_53_0 = this;
                              stackIn_53_1 = 1;
                              break L11;
                            }
                          }
                          ((lm) (this)).field_wb = stackIn_53_1 != 0;
                          break L7;
                        } else {
                          var2 = var2 != 0 | ((bf) ((Object) var3)).a((lm) (this), 0) ? 1 : 0;
                          var3 = var3.field_d;
                          continue L8;
                        }
                      }
                    }
                  }
                  this.h((byte) 38);
                  if (this.k(2)) {
                    this.a(0, (byte) -89);
                    this.l((byte) 111);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (-4 == (this.field_Q ^ -1)) {
                    fieldTemp$3 = this.field_kb;
                    this.field_kb = this.field_kb + 1;
                    if ((fieldTemp$3 ^ -1) <= -21) {
                      this.field_kb = 0;
                      this.l((byte) 111);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if (this.field_Q == 16) {
                      fieldTemp$4 = this.field_kb;
                      this.field_kb = this.field_kb + 1;
                      if (fieldTemp$4 >= 20) {
                        this.field_kb = 0;
                        if (this.field_mb.b(true)) {
                          this.field_mb = null;
                          this.a(0, (byte) -89);
                          this.field_S = true;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      if (this.field_Q != 20) {
                        if ((this.field_Q ^ -1) == -26) {
                          fieldTemp$5 = this.field_tb - 1;
                          this.field_tb = this.field_tb - 1;
                          if ((fieldTemp$5 ^ -1) >= -1) {
                            this.a(0, (byte) -89);
                            this.field_S = true;
                            this.field_kb = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if (-31 != (this.field_Q ^ -1)) {
                            break L2;
                          } else {
                            this.h((byte) 42);
                            fieldTemp$6 = this.field_kb;
                            this.field_kb = this.field_kb + 1;
                            if (20 <= fieldTemp$6) {
                              this.field_kb = 0;
                              this.l((byte) 111);
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
                  this.h((byte) 70);
                  if (this.field_V >= 4) {
                    if (this.field_V != 4) {
                      if ((this.field_V ^ -1) == -7) {
                        this.a(0, (byte) -89);
                        this.b(this.g(1829947600), (byte) -61, this.e((byte) -112));
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      L13: {
                        fieldTemp$7 = this.field_xb;
                        this.field_xb = this.field_xb + 1;
                        if (fieldTemp$7 >= 400) {
                          this.field_V = this.field_V + 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      this.field_L = 0;
                      this.field_W = 0;
                      this.field_R = 0;
                      break L12;
                    }
                  } else {
                    this.field_L = this.field_L + 1;
                    break L12;
                  }
                }
                if (!this.field_A.field_b.a(this.field_G - -this.field_R >> -337878192, true, true, this.field_W + this.field_E >> 717214000)) {
                  this.field_E = this.field_E - this.field_W;
                  this.field_G = this.field_G - this.field_R;
                  this.field_R = 0;
                  this.field_W = 0;
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
              if (!(param1 instanceof ge)) {
                if (param1 instanceof og) {
                  L3: {
                    var5_int = this.field_ub[param2] + -param1.e((byte) -112);
                    var6 = this.field_qb[param2] - param1.g(param3 ^ 1829947602);
                    var7 = var5_int * var5_int - -(var6 * var6);
                    if (-1 == (fn.field_a[param2] ^ -1)) {
                      break L3;
                    } else {
                      if (var7 < fn.field_a[param2]) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  fn.field_a[param2] = var7;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                L4: {
                  var9 = (ge) ((Object) param1);
                  if (!var9.q(param3 ^ -126)) {
                    break L4;
                  } else {
                    L5: {
                      if (!param0) {
                        break L5;
                      } else {
                        if (var9.p((byte) 76)) {
                          break L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L6: {
                      var6 = this.field_ub[param2] + -param1.e((byte) -112);
                      var7 = this.field_qb[param2] - param1.g(1829947600);
                      var8 = var6 * var6 - -(var7 * var7);
                      if (fn.field_a[param2] == 0) {
                        break L6;
                      } else {
                        if (var8 < fn.field_a[param2]) {
                          break L6;
                        } else {
                          break L2;
                        }
                      }
                    }
                    fn.field_a[param2] = var8;
                    break L4;
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("lm.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -19863) {
                break L1;
              } else {
                lm.a(-75, -66, 106);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (-1 <= (param2 ^ -1)) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << 90930017;
                param0 = param0 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "lm.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
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
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        c var12;
        Object var13;
        ek var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          var19 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = param1 * param1;
          if (param0) {
            stackIn_3_0 = 2;
            break L0;
          } else {
            stackIn_3_0 = 1;
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
            var11 = this.field_B - var5;
            L3: while (true) {
              if (var11 > var7) {
                var10++;
                continue L1;
              } else {
                var12 = this.field_A.a(true, var10, var11);
                if (var12 != null) {
                  var13 = var12.a(false);
                  L4: while (true) {
                    if (var13 instanceof ek) {
                      L5: {
                        L6: {
                          L7: {
                            var14 = (ek) (var13);
                            if (!(var13 instanceof ge)) {
                              break L7;
                            } else {
                              if (((ge) (var13)).q(-127)) {
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
                              if ((this.field_A.field_b.a(var16, var15, -17201, var8, var9, false, true) ^ -1) != 0) {
                                break L8;
                              } else {
                                break L5;
                              }
                            }
                          }
                          return true;
                        }
                      }
                      var13 = ((br) (var13)).field_d;
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
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = this.e((byte) -112);
        int var3 = this.g(1829947600);
        int var4 = 0;
        if (param0 < 90) {
            this.l((byte) 59);
        }
        while (-1 + this.field_lb > var4) {
            this.field_ub[var4] = var2 - -dm.field_dc[var4];
            this.field_qb[var4] = dm.field_Ib[var4] + var3;
            var4++;
        }
        this.field_ub[this.field_lb - 1] = var2;
        this.field_qb[-1 + this.field_lb] = var3;
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
        if (!(2 == var3)) {
            if (!(-5 == (var3 ^ -1))) {
                if (!(6 == var3)) {
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
