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
        int var2;
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = this.field_n;
          if (0 == var2) {
            this.c(param0 + 55);
            break L0;
          } else {
            if ((var2 ^ -1) == -4) {
              this.c(3);
              break L0;
            } else {
              if (4 != var2) {
                break L0;
              } else {
                this.c(param0 ^ -49);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == -52) {
            break L1;
          } else {
            this.field_g = (ne[]) null;
            break L1;
          }
        }
    }

    public final void b(oj param0, byte param1) {
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
                  if (-11 >= (var4 ^ -1)) {
                    param0.a(this.field_o, -26661);
                    break L1;
                  } else {
                    L4: {
                      stackIn_13_0 = this.field_t[var4];

                      stackIn_13_1 = 0;

                      stackIn_13_2 = ns.a(false, 20, li.field_n) - -20;

                      if (10 >= ns.a(false, 20, li.field_n)) {
                        stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = -1;
                        break L4;
                      } else {
                        stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = 1;
                        break L4;
                      }
                    }
                    stackIn_14_0[stackIn_14_1] = stackIn_14_2 * stackIn_14_3;
                    this.field_t[var4][1] = -60 + -1 * ns.a(false, 40, li.field_n);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("ql.Q(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
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
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, oj param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_58_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
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
                    if (this.field_d.field_O != ((qq) ((Object) param3)).field_G) {
                      break L2;
                    } else {
                      if (this.field_d.field_Y < this.field_d.field_t) {
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
                stackIn_7_0 = 0;
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
                stackIn_16_0 = 0;
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
                  stackIn_28_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
                L9: {
                  if (null == this.field_d) {
                    this.field_m = 5;
                    break L9;
                  } else {
                    this.field_m = -this.field_d.field_Y + this.field_d.field_t;
                    break L9;
                  }
                }
                if (this.field_m > 5) {
                  this.field_m = 5;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L10: {
              if (param0 <= -68) {
                break L10;
              } else {
                this.field_g = (ne[]) null;
                break L10;
              }
            }
            L11: {
              if (-26 == (param3.field_m ^ -1)) {
                this.field_n = 7;
                hs.b(-55, 46);
                break L11;
              } else {
                if ((param3.field_m ^ -1) == -27) {
                  this.field_n = 7;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            if (param3.field_m == 24) {
              L12: {
                this.field_n = 7;
                var7 = (wa) ((Object) ((pj) ((Object) param3)).field_B);
                var8 = var7;
                if (6 == uc.field_d[var7.field_c][4]) {
                  this.field_n = 10;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((uc.field_d[var7.field_c][4] ^ -1) != -5) {
                  break L13;
                } else {
                  if (-65 == (uc.field_d[var7.field_c][5] ^ -1)) {
                    break L13;
                  } else {
                    if (-1 == (uc.field_d[var7.field_c][5] ^ -1)) {
                      break L13;
                    } else {
                      if (uc.field_d[var7.field_c][6] >= 0) {
                        if (uc.field_d[var8.field_c][7] <= 0) {
                          this.field_n = 12;
                          break L13;
                        } else {
                          this.field_n = 11;
                          break L13;
                        }
                      } else {
                        if (uc.field_d[var7.field_c][7] > 0) {
                          this.field_n = 14;
                          break L13;
                        } else {
                          this.field_n = 13;
                          break L13;
                        }
                      }
                    }
                  }
                }
              }
              this.b(param3, (byte) 102);
              this.field_b.field_x = param2 - -(param1 * this.field_s);
              stackIn_58_0 = 1;
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
          L14: {
            var5 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var5);

            stackIn_61_1 = new StringBuilder().append("ql.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L14;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
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
              return stackIn_58_0 != 0;
            }
          }
        }
    }

    private final void i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (40 <= this.field_h) {
            break L0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -31) {
                break L0;
              } else {
                if (var4 >= this.field_h) {
                  break L0;
                } else {
                  L2: {
                    stackIn_6_0 = var2;

                    if (ns.a(false, 100, li.field_n) > 50) {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = ns.a(false, 100, li.field_n) - 50 >> -2116887836;
                      break L2;
                    }
                  }
                  L3: {
                    var2 = stackIn_7_0 + stackIn_7_1;
                    stackIn_9_0 = var3;

                    if (ns.a(false, 100, li.field_n) <= 50) {
                      stackIn_10_0 = stackIn_9_0;
                      stackIn_10_1 = -50 + ns.a(false, 100, li.field_n) >> 758171524;
                      break L3;
                    } else {
                      stackIn_10_0 = stackIn_9_0;
                      stackIn_10_1 = 0;
                      break L3;
                    }
                  }
                  var3 = stackIn_10_0 + stackIn_10_1;
                  hh.field_d.d(this.field_b.field_m - -35 + var2, var3 + (this.field_b.field_v - -(var4 * 4)) + -120, 10, 10, var4 * 8);
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (param0 == 10) {
            break L4;
          } else {
            this.e((byte) -128);
            break L4;
          }
        }
        L5: {
          if (null == this.field_t) {
            break L5;
          } else {
            var2 = 0;
            L6: while (true) {
              if (this.field_t.length <= var2) {
                break L5;
              } else {
                var3 = this.field_b.field_m + (this.field_t[var2][0] * (this.field_h + -20) / 20 - -30);
                var4 = -20 + this.field_t[var2][1] * (this.field_h + -20) / 20 + this.field_b.field_v;
                hh.field_d.d(var3, var4 + (this.field_h + -20) * (this.field_h + -20) / 10, 20, 20, 255 * (-this.field_h + 60) / 40);
                var2++;
                continue L6;
              }
            }
          }
        }
    }

    private final void e(byte param0) {
        wk stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        wk stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        int var2;
        int var3;
        int var4;
        int var5;
        oj var6;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_h < 20) {
            L1: {
              stackIn_4_0 = hs.field_F[ns.a(false, hs.field_F.length, li.field_n)];

              stackIn_4_1 = this.field_b.field_m - -30;

              stackIn_4_2 = -90 + (this.field_b.field_v - -(this.field_h * 4));

              stackIn_4_3 = 20;

              stackIn_4_4 = 20;

              if ((this.field_h ^ -1) >= -11) {
                stackIn_5_0 = (wk) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = this.field_h * 255 / 10;
                break L1;
              } else {
                stackIn_5_0 = (wk) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = 255;
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
          if (null != this.field_t) {
            var2 = 0;
            L3: while (true) {
              if (var2 >= this.field_t.length) {
                break L2;
              } else {
                var3 = this.field_b.field_m + (this.field_t[var2][0] * (this.field_h - 20) / 20 + 35);
                var4 = -10 + this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
                hs.field_F[ns.a(false, hs.field_F.length, li.field_n)].d(-((-20 + this.field_h) / 4) + var3, -((-40 + this.field_h) / 4) + (this.field_h - 20) * (this.field_h - 20) / 10 + var4, (-20 + this.field_h) / 2 + 10, (-20 + this.field_h) / 2 + 10, (-this.field_h + 60) * 255 / 40);
                var2++;
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (param0 == -117) {
            break L4;
          } else {
            var6 = (oj) null;
            this.a((oj) null, (byte) -72);
            break L4;
          }
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
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
          if (this.field_t == null) {
            break L1;
          } else {
            var2 = 0;
            L2: while (true) {
              if (this.field_t.length <= var2) {
                break L1;
              } else {
                var3 = this.field_b.field_m + (-20 + this.field_h) * this.field_t[var2][0] / 20 + 30;
                var4 = -20 + (this.field_b.field_v + (this.field_h + -20) * this.field_t[var2][1] / 20);
                hh.field_d.d(var3, (this.field_h - 20) * (this.field_h + -20) / 10 + var4, 20, 20, (15300 - this.field_h * 255) / 40);
                var2++;
                continue L2;
              }
            }
          }
        }
        L3: {
          if (param0 < -108) {
            break L3;
          } else {
            this.field_a = false;
            break L3;
          }
        }
    }

    public final void c(byte param0) {
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int var2;
        int var3;
        oj var4;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -119) {
            break L0;
          } else {
            var4 = (oj) null;
            this.a(116, -87, 41, (oj) null);
            break L0;
          }
        }
        L1: {
          var2 = this.field_n;
          if ((var2 ^ -1) == -2) {
            this.a(0, (byte) 117);
            break L1;
          } else {
            if ((var2 ^ -1) != -6) {
              if (-10 != (var2 ^ -1)) {
                if (2 != var2) {
                  if (-7 != (var2 ^ -1)) {
                    if ((var2 ^ -1) == -8) {
                      this.d(20);
                      break L1;
                    } else {
                      if ((var2 ^ -1) == -15) {
                        this.a(false);
                        break L1;
                      } else {
                        if ((var2 ^ -1) == -14) {
                          this.g(10);
                          break L1;
                        } else {
                          if (-13 == (var2 ^ -1)) {
                            this.i(10);
                            break L1;
                          } else {
                            if (11 == var2) {
                              this.e((byte) -117);
                              break L1;
                            } else {
                              if ((var2 ^ -1) == -11) {
                                this.e(-111);
                                break L1;
                              } else {
                                if (8 != var2) {
                                  break L1;
                                } else {
                                  this.f(3);
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.a(7, (byte) 122);
                    break L1;
                  }
                } else {
                  L2: {
                    stackIn_24_0 = this;

                    if ((this.field_m ^ -1) <= -1) {
                      stackIn_25_0 = this;
                      stackIn_25_1 = 4;
                      break L2;
                    } else {
                      stackIn_25_0 = this;
                      stackIn_25_1 = 5;
                      break L2;
                    }
                  }
                  this.a(stackIn_25_1, (byte) 88);
                  break L1;
                }
              } else {
                this.a(3, (byte) 101);
                break L1;
              }
            } else {
              this.a(2, (byte) 121);
              break L1;
            }
          }
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
        int var2;
        int var3;
        int var4;
        int var5;
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
            if (null == this.field_t) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (this.field_t.length <= var2) {
                  break L1;
                } else {
                  var3 = 30 + (this.field_h - 20) * this.field_t[var2][0] / 20 - -this.field_b.field_m;
                  var4 = this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
                  hh.field_d.d(var3, (-20 + this.field_h) * (-20 + this.field_h) / 10 + var4, 20, 20, (15300 + -(this.field_h * 255)) / 40);
                  var2++;
                  continue L2;
                }
              }
            }
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
        if (param0) {
            this.field_b = (vb) null;
        }
        if (40 > this.field_h) {
            if (this.field_h >= 20) {
                hh.field_d.d(-this.field_h + this.field_b.field_m + 20, -this.field_h + -70 + this.field_b.field_v, (-20 + this.field_h) * 2 + 80, 100, (10200 - 255 * this.field_h) / 20);
            } else {
                hh.field_d.d(this.field_b.field_m, -this.field_h + (this.field_b.field_v - 70), 80, 100, 255 * this.field_h / 20);
            }
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 < 83) {
            return;
        }
        int var3 = (this.field_m ^ -1) < -1 ? this.field_m : -this.field_m;
        if (-2 != (var3 ^ -1)) {
            od.field_d[param0].c(this.field_f + (40 + (this.field_b.field_m - var3 * 5)), this.field_r + (this.field_b.field_v + (-20 - var3 * 5) - this.field_h), this.field_m * 10, var3 * 10, 40 + -this.field_h << -349099614);
        } else {
            od.field_d[param0].e(this.field_f + 35 + this.field_b.field_m, -this.field_h + (this.field_b.field_v + -25) + this.field_r, -this.field_h + 40 << -1530970910);
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
        wk stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        wk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        wk stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        wk stackIn_10_0;
        int stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        int stackIn_10_5;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 10) {
          L0: {
            if ((this.field_h ^ -1) <= -41) {
              break L0;
            } else {
              if ((this.field_h ^ -1) <= -21) {
                if (-31 >= (this.field_h ^ -1)) {
                  hh.field_d.d(this.field_b.field_m + -10, -30 + this.field_b.field_v, 100, 50, (-(255 * this.field_h) + 10200) / 10);
                  hh.field_d.d(-10 + this.field_b.field_m, -30 + this.field_b.field_v, 100, 50, (-this.field_h + 40) * 255 / 10);
                  break L0;
                } else {
                  hh.field_d.d(15 + (this.field_b.field_m + -((5 * this.field_h + -100) / 2)), this.field_b.field_v - 120 + 3 * this.field_h, -50 + this.field_h * 5, 50, 255);
                  hh.field_d.d(this.field_b.field_m + 15 + -((this.field_h + -20) * 5 / 2), this.field_b.field_v - (120 + -(this.field_h * 3)), this.field_h * 5 + -100 + 50, 50, 255);
                  break L0;
                }
              } else {
                L1: {
                  stackIn_6_0 = hh.field_d;

                  stackIn_6_1 = 15 + this.field_b.field_m;

                  stackIn_6_2 = -120 + this.field_b.field_v + this.field_h * 3;

                  stackIn_6_3 = 50;

                  stackIn_6_4 = 50;

                  if ((this.field_h ^ -1) < -11) {
                    stackIn_7_0 = (wk) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = stackIn_6_3;
                    stackIn_7_4 = stackIn_6_4;
                    stackIn_7_5 = 255;
                    break L1;
                  } else {
                    stackIn_7_0 = (wk) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = stackIn_6_2;
                    stackIn_7_3 = stackIn_6_3;
                    stackIn_7_4 = stackIn_6_4;
                    stackIn_7_5 = 255 * this.field_h / 10;
                    break L1;
                  }
                }
                L2: {
                  ((wk) (Object) stackIn_7_0).d(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
                  stackIn_9_0 = hh.field_d;

                  stackIn_9_1 = this.field_b.field_m + 15;

                  stackIn_9_2 = this.field_b.field_v - 120 - -(this.field_h * 3);

                  stackIn_9_3 = 50;

                  stackIn_9_4 = 50;

                  if (this.field_h > 10) {
                    stackIn_10_0 = (wk) ((Object) stackIn_9_0);
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = stackIn_9_2;
                    stackIn_10_3 = stackIn_9_3;
                    stackIn_10_4 = stackIn_9_4;
                    stackIn_10_5 = 255;
                    break L2;
                  } else {
                    stackIn_10_0 = (wk) ((Object) stackIn_9_0);
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = stackIn_9_2;
                    stackIn_10_3 = stackIn_9_3;
                    stackIn_10_4 = stackIn_9_4;
                    stackIn_10_5 = 255 * this.field_h / 10;
                    break L2;
                  }
                }
                ((wk) (Object) stackIn_10_0).d(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean h(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == 31337) {
            break L0;
          } else {
            ql.h(-19);
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
                stackIn_9_0 = 0;
                break L1;
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public final boolean a(oj param0, byte param1) {
        int stackIn_4_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        ec var7 = null;
        pj var8 = null;
        as var9 = null;
        qj var10 = null;
        st var11 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h = 0;
              if ((param0.field_m ^ -1) != -16) {
                if (19 == param0.field_m) {
                  L2: {
                    this.field_m = 1;
                    var11 = (st) ((Object) param0);
                    var4 = var11.field_D;
                    if (var4 != 5) {
                      if ((var4 ^ -1) == -2) {
                        this.field_n = 1;
                        break L2;
                      } else {
                        if (var4 == 3) {
                          this.field_n = 3;
                          break L2;
                        } else {
                          if (-5 == (var4 ^ -1)) {
                            this.field_n = 5;
                            break L2;
                          } else {
                            if (6 == var4) {
                              this.field_n = 9;
                              break L2;
                            } else {
                              if (2 == var4) {
                                this.field_a = true;
                                this.field_n = 4;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.field_n = 2;
                      this.field_m = -1;
                      break L2;
                    }
                  }
                  this.field_f = ns.a(false, 21, li.field_n) - 10;
                  this.field_r = ns.a(false, 21, li.field_n) - 10;
                  if (param0.field_w == null) {
                    stackIn_44_0 = 0;
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
                  if (20 == param0.field_m) {
                    this.field_m = 3;
                    this.field_n = 6;
                    var10 = (qj) ((Object) param0);
                    this.field_f = ns.a(false, 21, li.field_n) + -10;
                    this.field_r = ns.a(false, 21, li.field_n) + -10;
                    this.field_b.field_x = var10.field_y * this.field_s + var10.field_D;
                    break L1;
                  } else {
                    if (-3 != (param0.field_m ^ -1)) {
                      if (param0.field_m == 23) {
                        this.field_n = 7;
                        var9 = (as) ((Object) param0);
                        this.field_b.field_x = var9.field_w.field_J + var9.field_w.field_w * this.field_s;
                        break L1;
                      } else {
                        if ((param0.field_m ^ -1) == -25) {
                          var8 = (pj) ((Object) param0);
                          this.field_n = 8;
                          if (-1 >= (var8.field_y ^ -1)) {
                            this.field_f = (int)(64.0 * Math.sin((double)var8.field_y * 3.141592653589793 / 4.0)) - -130;
                            this.field_r = -95 + (int)(Math.cos(3.141592653589793 * (double)var8.field_y / 4.0) * -64.0) + ag.field_I.field_D;
                            break L1;
                          } else {
                            this.field_f = 130;
                            this.field_r = -95 + ag.field_I.field_D;
                            break L1;
                          }
                        } else {
                          if ((param0.field_m ^ -1) != -27) {
                            break L1;
                          } else {
                            L3: {
                              var7 = (ec) ((Object) param0);
                              var7.field_w = this.field_o.c(var7.field_B, true, var7.field_A);
                              if (!var7.field_w.field_bb) {
                                break L3;
                              } else {
                                var7.field_w = var7.field_w.b(false);
                                break L3;
                              }
                            }
                            this.field_n = 7;
                            this.field_b.field_x = this.field_s * var7.field_w.field_w + var7.field_w.field_J;
                            break L1;
                          }
                        }
                      }
                    } else {
                      var6 = (mb) ((Object) param0);
                      this.field_n = 7;
                      this.field_b.field_x = var6.field_z - -(this.field_s * var6.field_H);
                      break L1;
                    }
                  }
                }
              } else {
                this.field_a = ((nw) ((Object) param0)).field_A;
                this.field_n = 0;
                if (null != param0.field_w) {
                  L4: {
                    this.field_b.field_x = this.field_s * param0.field_w.field_w + param0.field_w.field_J;
                    this.field_m = ((nw) ((Object) param0)).field_D;
                    stackIn_7_0 = this;

                    if (!((nw) ((Object) param0)).field_A) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 16711680;
                      break L4;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 65280;
                      break L4;
                    }
                  }
                  ((ql) (this)).field_i = stackIn_8_1;
                  if (1 <= this.field_m) {
                    break L1;
                  } else {
                    this.field_h = 40;
                    this.field_n = -1;
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              this.b(param0, (byte) -106);
              if (param1 == 57) {
                break L5;
              } else {
                this.field_t = (int[][]) null;
                break L5;
              }
            }
            stackIn_49_0 = 1;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var3);

            stackIn_52_1 = new StringBuilder().append("ql.E(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L6;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0 != 0;
            } else {
              return stackIn_49_0 != 0;
            }
          }
        }
    }

    ql(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("ql.<init>(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_p = "Please remove <%0> from your friend list first.";
        field_l = "Unable to delete friend - system busy";
    }
}
