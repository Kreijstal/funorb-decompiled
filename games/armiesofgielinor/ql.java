/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ql implements pa {
    private int field_i;
    static Calendar field_c;
    private int[] field_q;
    private boolean field_a;
    private vb field_b;
    private v field_k;
    private int[][] field_t;
    private ne[] field_g;
    private int field_s;
    static String field_e;
    private int field_m;
    static String field_p;
    private int field_n;
    static kl field_j;
    private int field_h;
    static String field_l;
    private int field_r;
    private ha field_o;
    private jd field_d;
    private int field_f;

    private final void f(int param0) {
        this.a(param0 + -131, this.field_r, this.field_f);
        if (param0 != 3) {
            field_l = (String) null;
        }
    }

    public final void a(int param0) {
        if (param0 <= 94) {
            this.field_o = (ha) null;
        }
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                var3 = ArmiesOfGielinor.field_M ? 1 : 0;
                var2 = this.field_n;
                if (0 == var2) {
                  break L3;
                } else {
                  if ((var2 ^ -1) == -4) {
                    break L2;
                  } else {
                    if (4 != var2) {
                      break L0;
                    } else {
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.c(param0 + 55);
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            this.c(3);
            if (var3 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          this.c(param0 ^ -49);
          break L0;
        }
        L4: {
          if (param0 == -52) {
            break L4;
          } else {
            this.field_g = (ne[]) null;
            break L4;
          }
        }
    }

    public final void b(oj param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_k.field_c[0] = this.field_b.field_x % this.field_s;
              this.field_k.field_c[1] = this.field_b.field_x / this.field_s;
              this.field_k.f(-48);
              this.field_k.i(0);
              this.field_q[1] = this.field_k.field_e[1];
              this.field_q[0] = this.field_k.field_e[0];
              this.field_b.field_m = this.field_q[0];
              var3_int = -44 / ((param1 - -26) / 48);
              this.field_h = this.field_h + 1;
              this.field_b.field_v = this.field_q[1];
              if (this.field_h == 20) {
                L2: {
                  if (this.field_n == 7) {
                    break L2;
                  } else {
                    if (-9 == (this.field_n ^ -1)) {
                      break L2;
                    } else {
                      if ((this.field_n ^ -1) == -11) {
                        break L2;
                      } else {
                        if (this.field_n == 11) {
                          break L2;
                        } else {
                          if (12 == this.field_n) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_t = new int[10][2];
                var4 = 0;
                L3: while (true) {
                  L4: {
                    if (-11 >= (var4 ^ -1)) {
                      break L4;
                    } else {
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L5: {
                          stackOut_12_0 = this.field_t[var4];
                          stackOut_12_1 = 0;
                          stackOut_12_2 = ns.a(false, 20, li.field_n) - -20;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          if (10 >= ns.a(false, 20, li.field_n)) {
                            stackOut_14_0 = (int[]) ((Object) stackIn_14_0);
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = -1;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            break L5;
                          } else {
                            stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = stackIn_13_2;
                            stackOut_13_3 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            break L5;
                          }
                        }
                        stackIn_15_0[stackIn_15_1] = stackIn_15_2 * stackIn_15_3;
                        this.field_t[var4][1] = -60 + -1 * ns.a(false, 40, li.field_n);
                        var4++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  param0.a(this.field_o, -26661);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("ql.Q(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((this.field_h ^ -1) > -41) {
            if (-21 < (this.field_h ^ -1)) {
              hh.field_d.d(-40 + param2, param1 - 40, 80, 80, 255 * this.field_h / 20);
              hh.field_d.d(param2 - 40, param1 + -40, 80, 80, this.field_h * 255 / 20);
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 <= -124) {
            break L1;
          } else {
            this.field_d = (jd) null;
            break L1;
          }
        }
        L2: {
          if (null != this.field_t) {
            var4 = 0;
            L3: while (true) {
              if (this.field_t.length <= var4) {
                break L2;
              } else {
                var5 = (this.field_h - 20) * this.field_t[var4][0] / 20 + param2;
                var6 = this.field_t[var4][1] * (this.field_h + -20) / 20 + param1;
                hh.field_d.d(var5 - 10, var6 + (this.field_h + -20) * (-20 + this.field_h) / 10 + -10, 20, 20, 255 * (-this.field_h + 60) / 40);
                var4++;
                if (var7 != 0) {
                  break L2;
                } else {
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, oj param3) {
        RuntimeException var5 = null;
        wa var5_ref = null;
        int var6 = 0;
        wa var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h = 0;
              this.field_b.field_x = param2 + this.field_s * param1;
              if (param3.field_m != 12) {
                break L1;
              } else {
                L2: {
                  this.field_n = 1;
                  this.field_d = this.field_o.c(param1, true, param2);
                  if (null == this.field_d) {
                    break L2;
                  } else {
                    if ((this.field_d.field_O ^ -1) != (((qq) ((Object) param3)).field_G ^ -1)) {
                      break L2;
                    } else {
                      if ((this.field_d.field_Y ^ -1) > (this.field_d.field_t ^ -1)) {
                        this.field_i = 16711935;
                        this.field_m = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_h = 50;
                this.field_n = -1;
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L3: {
              if (param3.field_m == 14) {
                L4: {
                  this.field_n = 2;
                  this.field_d = this.field_o.c(param1, true, param2);
                  this.field_f = ns.a(false, 21, li.field_n) - 10;
                  this.field_r = ns.a(false, 21, li.field_n) - 10;
                  if (this.field_d == null) {
                    break L4;
                  } else {
                    if (this.field_d.field_O != ((qq) ((Object) param3)).field_G) {
                      break L4;
                    } else {
                      if (-6 != (this.field_d.field_A ^ -1)) {
                        this.field_i = 16711935;
                        this.field_m = -this.field_d.field_A + 5;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_n = -1;
                this.field_h = 50;
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                break L3;
              }
            }
            L5: {
              if (16 != param3.field_m) {
                break L5;
              } else {
                L6: {
                  L7: {
                    this.field_n = 1;
                    this.field_d = this.field_o.c(param1, true, param2);
                    this.field_f = ns.a(false, 21, li.field_n) + -10;
                    this.field_r = -10 + ns.a(false, 21, li.field_n);
                    if (!this.field_g[param2 - -(this.field_s * param1)].c(92)) {
                      break L7;
                    } else {
                      if (null == this.field_d) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (this.field_d == null) {
                      break L8;
                    } else {
                      if (!this.field_d.a(23072)) {
                        break L8;
                      } else {
                        if (this.field_d.field_O != ((qq) ((Object) param3)).field_G) {
                          break L8;
                        } else {
                          if (this.field_d.field_t != this.field_d.field_Y) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  this.field_h = 50;
                  this.field_n = -1;
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
                L9: {
                  L10: {
                    if (null == this.field_d) {
                      break L10;
                    } else {
                      this.field_m = -this.field_d.field_Y + this.field_d.field_t;
                      if (var6 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  this.field_m = 5;
                  break L9;
                }
                if (this.field_m > 5) {
                  this.field_m = 5;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L11: {
              if (param0 <= -68) {
                break L11;
              } else {
                this.field_g = (ne[]) null;
                break L11;
              }
            }
            L12: {
              L13: {
                if (-26 == (param3.field_m ^ -1)) {
                  break L13;
                } else {
                  if ((param3.field_m ^ -1) == -27) {
                    this.field_n = 7;
                    if (var6 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  } else {
                    break L12;
                  }
                }
              }
              this.field_n = 7;
              hs.b(-55, 46);
              break L12;
            }
            if (param3.field_m == 24) {
              L14: {
                this.field_n = 7;
                var7 = (wa) ((Object) ((pj) ((Object) param3)).field_B);
                var5_ref = var7;
                if (6 == uc.field_d[var7.field_c][4]) {
                  this.field_n = 10;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if ((uc.field_d[var7.field_c][4] ^ -1) != -5) {
                  break L15;
                } else {
                  if (-65 == (uc.field_d[var7.field_c][5] ^ -1)) {
                    break L15;
                  } else {
                    if (-1 == (uc.field_d[var7.field_c][5] ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (uc.field_d[var7.field_c][6] >= 0) {
                          break L16;
                        } else {
                          L17: {
                            if (uc.field_d[var7.field_c][7] > 0) {
                              break L17;
                            } else {
                              this.field_n = 13;
                              if (var6 == 0) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                          this.field_n = 14;
                          if (var6 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (uc.field_d[var7.field_c][7] <= 0) {
                          break L18;
                        } else {
                          this.field_n = 11;
                          if (var6 == 0) {
                            break L15;
                          } else {
                            break L18;
                          }
                        }
                      }
                      this.field_n = 12;
                      break L15;
                    }
                  }
                }
              }
              this.b(param3, (byte) 102);
              this.field_b.field_x = param2 - -(param1 * this.field_s);
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              this.b(param3, (byte) 102);
              this.field_b.field_x = param2 - -(param1 * this.field_s);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var5);
            stackOut_63_1 = new StringBuilder().append("ql.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param3 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L19;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0 != 0;
            } else {
              return stackIn_62_0 != 0;
            }
          }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (40 <= this.field_h) {
              break L1;
            } else {
              var2 = 0;
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                if ((var4 ^ -1) <= -31) {
                  break L1;
                } else {
                  stackOut_3_0 = var4;
                  stackOut_3_1 = this.field_h;
                  stackIn_13_0 = stackOut_3_0;
                  stackIn_13_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (stackIn_4_0 >= stackIn_4_1) {
                      break L1;
                    } else {
                      L3: {
                        stackOut_5_0 = var2;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (ns.a(false, 100, li.field_n) > 50) {
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L3;
                        } else {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = ns.a(false, 100, li.field_n) - 50 >> -2116887836;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L3;
                        }
                      }
                      L4: {
                        var2 = stackIn_8_0 + stackIn_8_1;
                        stackOut_8_0 = var3;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (ns.a(false, 100, li.field_n) <= 50) {
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = -50 + ns.a(false, 100, li.field_n) >> 758171524;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L4;
                        } else {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = 0;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          break L4;
                        }
                      }
                      var3 = stackIn_11_0 + stackIn_11_1;
                      hh.field_d.d(this.field_b.field_m - -35 + var2, var3 + (this.field_b.field_v - -(var4 * 4)) + -120, 10, 10, var4 * 8);
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_12_0 = param0;
          stackOut_12_1 = 10;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L0;
        }
        L5: {
          if (stackIn_13_0 == stackIn_13_1) {
            break L5;
          } else {
            this.e((byte) -128);
            break L5;
          }
        }
        L6: {
          L7: {
            if (null == this.field_t) {
              break L7;
            } else {
              var2 = 0;
              L8: while (true) {
                if (this.field_t.length <= var2) {
                  break L7;
                } else {
                  var3 = this.field_b.field_m + (this.field_t[var2][0] * (this.field_h + -20) / 20 - -30);
                  var4 = -20 + this.field_t[var2][1] * (this.field_h + -20) / 20 + this.field_b.field_v;
                  hh.field_d.d(var3, var4 + (this.field_h + -20) * (this.field_h + -20) / 10, 20, 20, 255 * (-this.field_h + 60) / 40);
                  var2++;
                  if (var5 != 0) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      continue L8;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
          }
          break L6;
        }
    }

    private final void e(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        wk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        wk stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        wk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        wk stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        wk stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_h < 20) {
            L1: {
              stackOut_2_0 = hs.field_F[ns.a(false, hs.field_F.length, li.field_n)];
              stackOut_2_1 = this.field_b.field_m - -30;
              stackOut_2_2 = -90 + (this.field_b.field_v - -(this.field_h * 4));
              stackOut_2_3 = 20;
              stackOut_2_4 = 20;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              stackIn_3_3 = stackOut_2_3;
              stackIn_3_4 = stackOut_2_4;
              if ((this.field_h ^ -1) >= -11) {
                stackOut_4_0 = (wk) ((Object) stackIn_4_0);
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = this.field_h * 255 / 10;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                break L1;
              } else {
                stackOut_3_0 = (wk) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = 255;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_5_4 = stackOut_3_4;
                stackIn_5_5 = stackOut_3_5;
                break L1;
              }
            }
            ((wk) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            if (null != this.field_t) {
              var2 = 0;
              L4: while (true) {
                if ((var2 ^ -1) <= (this.field_t.length ^ -1)) {
                  break L3;
                } else {
                  var3 = this.field_b.field_m + (this.field_t[var2][0] * (this.field_h - 20) / 20 + 35);
                  var4 = -10 + this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
                  hs.field_F[ns.a(false, hs.field_F.length, li.field_n)].d(-((-20 + this.field_h) / 4) + var3, -((-40 + this.field_h) / 4) + (this.field_h - 20) * (this.field_h - 20) / 10 + var4, (-20 + this.field_h) / 2 + 10, (-20 + this.field_h) / 2 + 10, (-this.field_h + 60) * 255 / 40);
                  var2++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      continue L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
          if (param0 == -117) {
            break L2;
          } else {
            discarded$1 = this.a((oj) null, (byte) -72);
            break L2;
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_h < 40) {
            if (this.field_h < 20) {
              hh.field_d.d(this.field_b.field_m - 10, this.field_b.field_v + -30, 100, 50, this.field_h * 255 / 20);
              hh.field_d.d(-10 + this.field_b.field_m, this.field_b.field_v + -30, 100, 50, 255 * this.field_h / 20);
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_t == null) {
              break L2;
            } else {
              var2 = 0;
              L3: while (true) {
                if (this.field_t.length <= var2) {
                  break L2;
                } else {
                  var3 = this.field_b.field_m + (-20 + this.field_h) * this.field_t[var2][0] / 20 + 30;
                  var4 = -20 + (this.field_b.field_v + (this.field_h + -20) * this.field_t[var2][1] / 20);
                  hh.field_d.d(var3, (this.field_h - 20) * (this.field_h + -20) / 10 + var4, 20, 20, (15300 - this.field_h * 255) / 40);
                  var2++;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          if (param0 < -108) {
            break L1;
          } else {
            this.field_a = false;
            break L1;
          }
        }
    }

    public final void c(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -119) {
            break L0;
          } else {
            discarded$1 = this.a(116, -87, 41, (oj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  var2 = this.field_n;
                                  if ((var2 ^ -1) == -2) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if ((var2 ^ -1) != -6) {
                                        break L14;
                                      } else {
                                        if (var3 == 0) {
                                          break L12;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (-10 != (var2 ^ -1)) {
                                        break L15;
                                      } else {
                                        if (var3 == 0) {
                                          break L11;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (2 != var2) {
                                        break L16;
                                      } else {
                                        if (var3 == 0) {
                                          break L10;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (-7 != (var2 ^ -1)) {
                                        break L17;
                                      } else {
                                        if (var3 == 0) {
                                          break L9;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if ((var2 ^ -1) == -8) {
                                      break L8;
                                    } else {
                                      if ((var2 ^ -1) == -15) {
                                        break L7;
                                      } else {
                                        if ((var2 ^ -1) == -14) {
                                          break L6;
                                        } else {
                                          if (-13 == (var2 ^ -1)) {
                                            break L5;
                                          } else {
                                            if (11 == var2) {
                                              break L4;
                                            } else {
                                              if ((var2 ^ -1) == -11) {
                                                break L3;
                                              } else {
                                                if (8 != var2) {
                                                  break L1;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L13;
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
                                this.a(0, (byte) 117);
                                if (var3 == 0) {
                                  break L1;
                                } else {
                                  break L12;
                                }
                              }
                              this.a(2, (byte) 121);
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L11;
                              }
                            }
                            this.a(3, (byte) 101);
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L10;
                            }
                          }
                          L18: {
                            stackOut_30_0 = this;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_31_0 = stackOut_30_0;
                            if ((this.field_m ^ -1) <= -1) {
                              stackOut_32_0 = this;
                              stackOut_32_1 = 4;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              break L18;
                            } else {
                              stackOut_31_0 = this;
                              stackOut_31_1 = 5;
                              stackIn_33_0 = stackOut_31_0;
                              stackIn_33_1 = stackOut_31_1;
                              break L18;
                            }
                          }
                          this.a(stackIn_33_1, (byte) 88);
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L9;
                          }
                        }
                        this.a(7, (byte) 122);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L8;
                        }
                      }
                      this.d(20);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                    this.a(false);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                  this.g(10);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
                this.i(10);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
              this.e((byte) -117);
              if (var3 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
            this.e(-111);
            if (var3 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          this.f(3);
          break L1;
        }
    }

    public static void d(byte param0) {
        field_p = null;
        if (param0 <= 45) {
            ql.d((byte) 124);
        }
        field_j = null;
        field_c = null;
        field_e = null;
        field_l = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 20) {
          L0: {
            if (40 > this.field_h) {
              if (20 <= this.field_h) {
                break L0;
              } else {
                hh.field_d.d(this.field_b.field_m, -70 + this.field_b.field_v, 80, 100, this.field_h * 255 / 20);
                hh.field_d.d(this.field_b.field_m, -70 + this.field_b.field_v, 80, 100, 255 * this.field_h / 20);
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (null == this.field_t) {
                break L2;
              } else {
                var2 = 0;
                L3: while (true) {
                  if ((this.field_t.length ^ -1) >= (var2 ^ -1)) {
                    break L2;
                  } else {
                    var3 = 30 + (this.field_h - 20) * this.field_t[var2][0] / 20 - -this.field_b.field_m;
                    var4 = this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
                    hh.field_d.d(var3, (-20 + this.field_h) * (-20 + this.field_h) / 10 + var4, 20, 20, (15300 + -(this.field_h * 255)) / 40);
                    var2++;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 != 8865) {
            return false;
        }
        if (null != this.field_t) {
            return 60 <= this.field_h ? true : false;
        }
        return (this.field_h ^ -1) <= -41 ? true : false;
    }

    public final boolean b(byte param0) {
        if (param0 >= -25) {
            return true;
        }
        return false;
    }

    private final void a(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_b = (vb) null;
            break L0;
          }
        }
        L1: {
          if (40 <= this.field_h) {
            break L1;
          } else {
            L2: {
              if (this.field_h < 20) {
                break L2;
              } else {
                hh.field_d.d(-this.field_h + this.field_b.field_m + 20, -this.field_h + -70 + this.field_b.field_v, (-20 + this.field_h) * 2 + 80, 100, (10200 - 255 * this.field_h) / 20);
                if (!ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            hh.field_d.d(this.field_b.field_m, -this.field_h + (this.field_b.field_v - 70), 80, 100, 255 * this.field_h / 20);
            break L1;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 >= 83) {
          L0: {
            if ((this.field_m ^ -1) >= -1) {
              stackOut_4_0 = -this.field_m;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = this.field_m;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              var3 = stackIn_5_0;
              if (-2 == (var3 ^ -1)) {
                break L2;
              } else {
                od.field_d[param0].c(this.field_f + (40 + (this.field_b.field_m - var3 * 5)), this.field_r + (this.field_b.field_v + (-20 - var3 * 5) - this.field_h), this.field_m * 10, var3 * 10, 40 + -this.field_h << -349099614);
                if (!ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            od.field_d[param0].e(this.field_f + 35 + this.field_b.field_m, -this.field_h + (this.field_b.field_v + -25) + this.field_r, -this.field_h + 40 << -1530970910);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    private final void c(int param0) {
        qn.a(this.field_b.field_m + 40, -20 + this.field_b.field_v, 10, this.field_i);
        mv.field_a[this.field_a ? 1 : 0].g(20 + this.field_b.field_m, this.field_b.field_v - 35);
        if (param0 != 3) {
            this.c((byte) -24);
        }
        en.field_E.c(Integer.toString(this.field_m), this.field_b.field_m - -40, this.field_b.field_v - 15, 16777215, 0);
    }

    private final void g(int param0) {
        int var3 = 0;
        wk stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        wk stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        wk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        wk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        wk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        wk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        wk stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        wk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        wk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        wk stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        wk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        wk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 10) {
          L0: {
            if ((this.field_h ^ -1) <= -41) {
              break L0;
            } else {
              L1: {
                if ((this.field_h ^ -1) <= -21) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = hh.field_d;
                    stackOut_4_1 = 15 + this.field_b.field_m;
                    stackOut_4_2 = -120 + this.field_b.field_v + this.field_h * 3;
                    stackOut_4_3 = 50;
                    stackOut_4_4 = 50;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if ((this.field_h ^ -1) < -11) {
                      stackOut_6_0 = (wk) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = stackIn_6_2;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = stackIn_6_4;
                      stackOut_6_5 = 255;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L2;
                    } else {
                      stackOut_5_0 = (wk) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = stackIn_5_2;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = stackIn_5_4;
                      stackOut_5_5 = 255 * this.field_h / 10;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_7_4 = stackOut_5_4;
                      stackIn_7_5 = stackOut_5_5;
                      break L2;
                    }
                  }
                  L3: {
                    ((wk) (Object) stackIn_7_0).d(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
                    stackOut_7_0 = hh.field_d;
                    stackOut_7_1 = this.field_b.field_m + 15;
                    stackOut_7_2 = this.field_b.field_v - 120 - -(this.field_h * 3);
                    stackOut_7_3 = 50;
                    stackOut_7_4 = 50;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    if (this.field_h > 10) {
                      stackOut_9_0 = (wk) ((Object) stackIn_9_0);
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = stackIn_9_3;
                      stackOut_9_4 = stackIn_9_4;
                      stackOut_9_5 = 255;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      stackIn_10_4 = stackOut_9_4;
                      stackIn_10_5 = stackOut_9_5;
                      break L3;
                    } else {
                      stackOut_8_0 = (wk) ((Object) stackIn_8_0);
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = stackIn_8_3;
                      stackOut_8_4 = stackIn_8_4;
                      stackOut_8_5 = 255 * this.field_h / 10;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      stackIn_10_4 = stackOut_8_4;
                      stackIn_10_5 = stackOut_8_5;
                      break L3;
                    }
                  }
                  ((wk) (Object) stackIn_10_0).d(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (-31 >= (this.field_h ^ -1)) {
                  break L4;
                } else {
                  hh.field_d.d(15 + (this.field_b.field_m + -((5 * this.field_h + -100) / 2)), this.field_b.field_v - 120 + 3 * this.field_h, -50 + this.field_h * 5, 50, 255);
                  hh.field_d.d(this.field_b.field_m + 15 + -((this.field_h + -20) * 5 / 2), this.field_b.field_v - (120 + -(this.field_h * 3)), this.field_h * 5 + -100 + 50, 50, 255);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              hh.field_d.d(this.field_b.field_m + -10, -30 + this.field_b.field_v, 100, 50, (-(255 * this.field_h) + 10200) / 10);
              hh.field_d.d(-10 + this.field_b.field_m, -30 + this.field_b.field_v, 100, 50, (-this.field_h + 40) * 255 / 10);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean h(int param0) {
        boolean discarded$2 = false;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 31337) {
            break L0;
          } else {
            discarded$2 = ql.h(-19);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((f.field_E ^ -1) > -21) {
              break L2;
            } else {
              if (!wd.a((byte) 28)) {
                break L2;
              } else {
                L3: {
                  if (vt.field_n <= 0) {
                    break L3;
                  } else {
                    if (du.c(10)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        ec var7 = null;
        pj var8 = null;
        as var9 = null;
        qj var10 = null;
        st var11 = null;
        int stackIn_4_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_50_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_55_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h = 0;
              if ((param0.field_m ^ -1) != -16) {
                L2: {
                  if (19 == param0.field_m) {
                    break L2;
                  } else {
                    L3: {
                      if (20 == param0.field_m) {
                        break L3;
                      } else {
                        L4: {
                          if (-3 != (param0.field_m ^ -1)) {
                            break L4;
                          } else {
                            var6 = (mb) ((Object) param0);
                            this.field_n = 7;
                            this.field_b.field_x = var6.field_z - -(this.field_s * var6.field_H);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (param0.field_m == 23) {
                            break L5;
                          } else {
                            L6: {
                              if ((param0.field_m ^ -1) == -25) {
                                break L6;
                              } else {
                                if ((param0.field_m ^ -1) != -27) {
                                  break L1;
                                } else {
                                  L7: {
                                    var7 = (ec) ((Object) param0);
                                    var7.field_w = this.field_o.c(var7.field_B, true, var7.field_A);
                                    if (!var7.field_w.field_bb) {
                                      break L7;
                                    } else {
                                      var7.field_w = var7.field_w.b(false);
                                      break L7;
                                    }
                                  }
                                  this.field_n = 7;
                                  this.field_b.field_x = this.field_s * var7.field_w.field_w + var7.field_w.field_J;
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L8: {
                              L9: {
                                var8 = (pj) ((Object) param0);
                                this.field_n = 8;
                                if (-1 >= (var8.field_y ^ -1)) {
                                  break L9;
                                } else {
                                  this.field_f = 130;
                                  this.field_r = -95 + ag.field_I.field_D;
                                  if (var5 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              this.field_f = (int)(64.0 * Math.sin((double)var8.field_y * 3.141592653589793 / 4.0)) - -130;
                              this.field_r = -95 + (int)(Math.cos(3.141592653589793 * (double)var8.field_y / 4.0) * -64.0) + ag.field_I.field_D;
                              break L8;
                            }
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.field_n = 7;
                        var9 = (as) ((Object) param0);
                        this.field_b.field_x = var9.field_w.field_J + var9.field_w.field_w * this.field_s;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_m = 3;
                    this.field_n = 6;
                    var10 = (qj) ((Object) param0);
                    this.field_f = ns.a(false, 21, li.field_n) + -10;
                    this.field_r = ns.a(false, 21, li.field_n) + -10;
                    this.field_b.field_x = var10.field_y * this.field_s + var10.field_D;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L10: {
                  L11: {
                    L12: {
                      L13: {
                        L14: {
                          L15: {
                            L16: {
                              this.field_m = 1;
                              var11 = (st) ((Object) param0);
                              var4 = var11.field_D;
                              if (var4 != 5) {
                                break L16;
                              } else {
                                if (var5 == 0) {
                                  this.field_n = 2;
                                  this.field_m = -1;
                                  if (var5 == 0) {
                                    break L10;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if ((var4 ^ -1) == -2) {
                              break L15;
                            } else {
                              if (var4 == 3) {
                                break L14;
                              } else {
                                if (-5 == (var4 ^ -1)) {
                                  break L13;
                                } else {
                                  if (6 == var4) {
                                    break L12;
                                  } else {
                                    if (2 == var4) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_n = 1;
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L14;
                          }
                        }
                        this.field_n = 3;
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L13;
                        }
                      }
                      this.field_n = 5;
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                    this.field_n = 9;
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                  this.field_a = true;
                  this.field_n = 4;
                  break L10;
                }
                this.field_f = ns.a(false, 21, li.field_n) - 10;
                this.field_r = ns.a(false, 21, li.field_n) - 10;
                if (param0.field_w == null) {
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.field_w.field_S) {
                    this.field_b.field_x = this.field_s * param0.field_w.field_w + param0.field_w.field_J;
                    break L1;
                  } else {
                    return false;
                  }
                }
              } else {
                this.field_a = ((nw) ((Object) param0)).field_A;
                this.field_n = 0;
                if (null != param0.field_w) {
                  L17: {
                    this.field_b.field_x = this.field_s * param0.field_w.field_w + param0.field_w.field_J;
                    this.field_m = ((nw) ((Object) param0)).field_D;
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (!((nw) ((Object) param0)).field_A) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 16711680;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L17;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 65280;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L17;
                    }
                  }
                  ((ql) (this)).field_i = stackIn_8_1;
                  if (1 <= this.field_m) {
                    break L1;
                  } else {
                    this.field_h = 40;
                    this.field_n = -1;
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L18: {
              this.b(param0, (byte) -106);
              if (param1 == 57) {
                break L18;
              } else {
                this.field_t = (int[][]) null;
                break L18;
              }
            }
            stackOut_55_0 = 1;
            stackIn_56_0 = stackOut_55_0;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var3);
            stackOut_57_1 = new StringBuilder().append("ql.E(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L19;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_51_0 != 0;
            } else {
              return stackIn_56_0 != 0;
            }
          }
        }
    }

    ql(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            this.field_o = param0;
            this.field_s = param0.field_v;
            this.field_k = param1;
            this.field_b = param2;
            this.field_q = new int[2];
            this.field_g = param0.field_Eb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4);
            stackOut_3_1 = new StringBuilder().append("ql.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_p = "Please remove <%0> from your friend list first.";
        field_l = "Unable to delete friend - system busy";
    }
}
