/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk {
    int field_g;
    rf[] field_X;
    int[] field_P;
    int field_zb;
    private int field_o;
    String field_vb;
    private int field_wb;
    sa field_W;
    private int field_M;
    int field_gb;
    private boolean field_r;
    private int field_p;
    int field_k;
    private int field_Cb;
    static String field_i;
    private int field_E;
    private int[] field_T;
    private int field_Ab;
    int field_j;
    private int[] field_b;
    int field_eb;
    boolean field_Bb;
    static int field_I;
    int field_Q;
    private int[] field_N;
    int field_K;
    int field_O;
    int field_q;
    int field_n;
    int field_lb;
    private int field_mb;
    private int field_V;
    private boolean field_Y;
    int field_U;
    int field_sb;
    private int field_e;
    int field_f;
    int field_t;
    int field_x;
    int[] field_w;
    int field_ib;
    private int field_G;
    private int field_db;
    int field_xb;
    int field_c;
    boolean field_S;
    int field_R;
    int field_z;
    vj field_cb;
    int field_J;
    int field_hb;
    private int[] field_tb;
    private boolean field_y;
    int field_m;
    int field_d;
    int field_qb;
    private int field_ob;
    boolean field_kb;
    int field_jb;
    private int field_l;
    int field_L;
    int field_D;
    ee field_u;
    static boolean field_F;
    int field_Z;
    private boolean field_v;
    private int field_ab;
    private int[] field_B;
    private boolean field_s;
    int field_fb;
    vj field_rb;
    int field_yb;
    int field_ub;
    int field_a;
    private int field_h;
    int field_nb;
    private int field_A;
    int field_H;
    int field_bb;
    int field_C;
    int field_pb;

    final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var2 = -1;
          var3 = this.field_C * this.field_zb;
          if (param0 <= -36) {
            break L0;
          } else {
            this.k(5);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= var3) {
              break L2;
            } else {
              var5 = this.field_T[var4];
              stackOut_4_0 = -25;
              stackIn_11_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var6 != 0) {
                return stackIn_11_0;
              } else {
                L3: {
                  if (stackIn_5_0 == (var5 & 24 ^ -1)) {
                    var5 = var5 & 7;
                    if ((var5 ^ -1) >= (var2 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var5;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var2;
        }
    }

    private final boolean q(int param0) {
        int[] array$2 = null;
        int incrementValue$3 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_20_0 = 0;
        L0: {
          L1: {
            var8 = client.field_A ? 1 : 0;
            var11 = this.field_B;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if (var11.length >= this.field_C * this.field_zb) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          array$2 = new int[this.field_C * this.field_zb];
          var2 = array$2;
          this.field_B = array$2;
          break L0;
        }
        L2: {
          var3 = 0;
          if (param0 == 21200) {
            break L2;
          } else {
            this.field_vb = (String) null;
            break L2;
          }
        }
        var4 = 0;
        L3: while (true) {
          L4: {
            L5: {
              if ((var4 ^ -1) <= (this.field_zb ^ -1)) {
                break L5;
              } else {
                var5 = -var4 + (-1 + this.field_zb);
                stackOut_8_0 = 0;
                stackIn_17_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var8 != 0) {
                  break L4;
                } else {
                  var6 = stackIn_9_0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if ((this.field_C ^ -1) >= (var6 ^ -1)) {
                          break L8;
                        } else {
                          incrementValue$3 = var3;
                          var3++;
                          this.field_B[var5] = this.field_T[incrementValue$3];
                          var5 = var5 + this.field_zb;
                          var6++;
                          if (var8 != 0) {
                            break L7;
                          } else {
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      var4++;
                      break L7;
                    }
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            var4 = this.field_db + -this.field_zb + this.field_C - -this.field_o >> 2027132385;
            var5 = this.field_o + (this.field_zb + (-this.field_C - this.field_db)) >> 1485015713;
            this.field_q = this.field_q + var4;
            var3 = this.field_C;
            this.field_L = this.field_L + var5;
            this.field_C = this.field_zb;
            this.field_B = this.field_T;
            this.field_zb = var3;
            this.field_T = var2;
            stackOut_16_0 = this.c((byte) -117);
            stackIn_17_0 = stackOut_16_0 ? 1 : 0;
            break L4;
          }
          if (stackIn_17_0 != 0) {
            this.field_T = this.field_B;
            this.field_B = var2;
            this.field_zb = this.field_C;
            this.field_L = this.field_L - var5;
            this.field_C = var3;
            this.field_q = this.field_q - var4;
            return false;
          } else {
            this.field_ab = this.field_ab + 1;
            var3 = this.field_db;
            this.field_db = -this.field_o;
            this.field_o = var3;
            this.d(30968);
            var3 = 0;
            this.h(-1);
            var6 = 0;
            L9: while (true) {
              L10: {
                if ((var6 ^ -1) <= (this.field_zb ^ -1)) {
                  break L10;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_30_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var8 != 0) {
                    return stackIn_30_0 != 0;
                  } else {
                    var7 = stackIn_21_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if ((var7 ^ -1) <= (this.field_C ^ -1)) {
                            break L13;
                          } else {
                            this.field_tb[var3] = 0;
                            this.field_b[var3] = (-1 + (this.field_C + this.field_db - var7 * 2)) * -8 / this.field_C;
                            var3++;
                            var7++;
                            if (var8 != 0) {
                              break L12;
                            } else {
                              if (var8 == 0) {
                                continue L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        var6++;
                        break L12;
                      }
                      if (var8 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
              ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
              return true;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param0 <= -88) {
          var4 = 0;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if ((this.field_a * this.field_O ^ -1) >= (var6 ^ -1)) {
                    break L3;
                  } else {
                    var7 = this.field_P[var6];
                    stackOut_4_0 = 1879048192 & var7 ^ -1;
                    stackOut_4_1 = -1;
                    stackIn_37_0 = stackOut_4_0;
                    stackIn_37_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_5_0 == stackIn_5_1) {
                            break L5;
                          } else {
                            L6: {
                              if (8 == (var7 & 24)) {
                                var5++;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              if (16 == (var7 & 24)) {
                                var4++;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              var8 = (1879048192 & var7) / 268435456;
                              if (8 != (var7 & 24)) {
                                break L8;
                              } else {
                                if ((var8 ^ -1) >= (mk.field_e ^ -1)) {
                                  break L8;
                                } else {
                                  mk.field_e = var8;
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              this.field_ib = param2;
                              if (-24 != (-1879048193 & var7 ^ -1)) {
                                break L9;
                              } else {
                                if (var8 > fk.field_H) {
                                  fk.field_H = var8;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              L11: {
                                if (param1) {
                                  break L11;
                                } else {
                                  this.field_P[var6] = de.b(32, lb.a(var7, 268435455));
                                  if (var9 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              this.field_P[var6] = 56;
                              break L10;
                            }
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.field_P[var6] = lb.a(2147483647, var7);
                        break L4;
                      }
                      var6++;
                      if (var9 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L12: {
                  if (param1) {
                    break L12;
                  } else {
                    L13: {
                      if (-1 <= (var4 ^ -1)) {
                        break L13;
                      } else {
                        L14: {
                          var6 = ((int)((double)this.field_k * Math.sqrt((double)var4)) - -1) / 2;
                          if (this.field_k >= var6) {
                            break L14;
                          } else {
                            var6 = this.field_k;
                            break L14;
                          }
                        }
                        ge.a(this.field_lb, var6, (byte) 127, wd.field_c);
                        break L13;
                      }
                    }
                    if (0 < var5) {
                      L15: {
                        var6 = (2 + (int)((double)this.field_k * Math.sqrt((double)var5))) / 4;
                        if ((var6 ^ -1) >= (this.field_k ^ -1)) {
                          break L15;
                        } else {
                          var6 = this.field_k;
                          break L15;
                        }
                      }
                      ge.a(this.field_lb, var6, (byte) 127, sa.field_w);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L12;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = ((int)((double)this.field_k * Math.sqrt((double)(var4 + (16 - -var5)))) + 8) / 16;
                stackOut_36_0 = this.field_k;
                stackOut_36_1 = var6;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L2;
              }
              L16: {
                if (stackIn_37_0 >= stackIn_37_1) {
                  break L16;
                } else {
                  var6 = this.field_k;
                  break L16;
                }
              }
              ge.a(this.field_lb, var6, (byte) 127, ee.field_g);
              break L1;
            }
            return;
          }
        } else {
          return;
        }
    }

    private final int l(int param0) {
        int var2 = 95 % ((param0 - 43) / 54);
        return 80 + this.field_g * this.field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4 = 0;
        if (param0 >= 0) {
            if (-1 >= (param2 ^ -1)) {
                if ((param0 ^ -1) > (this.field_O ^ -1)) {
                    if (this.field_a > param2) {
                        var4 = this.field_P[param0 + this.field_O * param2];
                    }
                }
            }
        }
        int var5 = 101 / ((param1 - 24) / 52);
        if (this.field_C != 0) {
            if (!this.field_S) {
                var6 = -this.field_q + param0;
                var7 = -this.field_L + param2;
                if ((var6 ^ -1) <= -1) {
                    if (-1 >= (var7 ^ -1)) {
                        if (this.field_C > var6) {
                            if (this.field_zb > var7) {
                                var8 = this.field_T[var7 * this.field_C + var6];
                                if (!((var8 ^ -1) == -1)) {
                                    var4 = var8;
                                }
                            }
                        }
                    }
                }
            }
        }
        return var4;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11) {
        th.a(16777215, param2, param6, param7, param10, param11, param1, 16777215, param0, param4, param3, (byte) 103, param5, param8);
        if (!param9) {
            lk.g(-50);
        }
    }

    private final void h(int param0) {
        if (param0 == -1) {
          L0: {
            if (this.field_y) {
              L1: {
                if (this.a((byte) -93, true)) {
                  break L1;
                } else {
                  this.field_y = false;
                  this.c(30000, this.field_g, 1);
                  if (!client.field_A) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_e = 20;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(boolean param0, int param1, int param2, lk param3, boolean param4, int param5, int param6, int param7, oi param8, boolean param9, byte param10) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        Object stackIn_79_0 = null;
        lk stackIn_79_1 = null;
        oi stackIn_79_2 = null;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        Object stackIn_80_0 = null;
        lk stackIn_80_1 = null;
        oi stackIn_80_2 = null;
        int stackIn_80_3 = 0;
        int stackIn_80_4 = 0;
        Object stackIn_81_0 = null;
        lk stackIn_81_1 = null;
        oi stackIn_81_2 = null;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        int stackIn_87_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        Object stackOut_78_0 = null;
        lk stackOut_78_1 = null;
        oi stackOut_78_2 = null;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        Object stackOut_80_0 = null;
        lk stackOut_80_1 = null;
        oi stackOut_80_2 = null;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int stackOut_80_5 = 0;
        Object stackOut_79_0 = null;
        lk stackOut_79_1 = null;
        oi stackOut_79_2 = null;
        int stackOut_79_3 = 0;
        int stackOut_79_4 = 0;
        int stackOut_79_5 = 0;
        int stackOut_86_0 = 0;
        int stackOut_92_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            var12_int = this.field_P[param6];
            if (((var12_int & -1879048193) >> -1240422525 ^ -1) != (param1 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var13 = 0;
                if (param5 >= 0) {
                  break L1;
                } else {
                  if ((var12_int & -1879048193 ^ -1) == -24) {
                    L2: {
                      L3: {
                        if (-2 != param5) {
                          break L3;
                        } else {
                          var14 = 0;
                          L4: while (true) {
                            if (-8 >= (var14 ^ -1)) {
                              break L3;
                            } else {
                              stackOut_11_0 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
                              stackIn_14_0 = stackOut_11_0;
                              stackIn_12_0 = stackOut_11_0;
                              if (var22 != 0) {
                                break L2;
                              } else {
                                var13 = stackIn_12_0;
                                var14++;
                                if (var22 == 0) {
                                  continue L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_13_0 = var13;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                if (this.field_v) {
                  param7 = 3;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var14 = 0;
                this.field_w[0] = param6;
                var15 = 1;
                this.field_P[param6] = de.b(-2147483648, var12_int);
                var16 = 0;
                if (param5 < 0) {
                  break L6;
                } else {
                  var16 = 1;
                  var12_int = (-1879048200 & var12_int) + param5;
                  break L6;
                }
              }
              L7: {
                L8: {
                  if (param0) {
                    L9: {
                      L10: {
                        if (param9) {
                          break L10;
                        } else {
                          var17 = 23;
                          if (var22 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var17 = 24 ^ var12_int;
                      break L9;
                    }
                    L11: while (true) {
                      if (var14 >= var15) {
                        break L8;
                      } else {
                        incrementValue$2 = var14;
                        var14++;
                        var18 = this.field_w[incrementValue$2];
                        stackOut_27_0 = var16;
                        stackIn_45_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var22 != 0) {
                          break L7;
                        } else {
                          L12: {
                            if (stackIn_28_0 == 0) {
                              break L12;
                            } else {
                              if (23 != (this.field_P[var18] & 268435455)) {
                                var16 = 0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (0 < var18 % this.field_O) {
                              var15 = this.a(-1 + var18, 124, var17, var15, var12_int);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (this.field_O + -1 <= var18 % this.field_O) {
                              break L14;
                            } else {
                              var15 = this.a(1 + var18, 126, var17, var15, var12_int);
                              break L14;
                            }
                          }
                          L15: {
                            if ((var18 ^ -1) <= (this.field_O ^ -1)) {
                              var15 = this.a(-this.field_O + var18, 126, var17, var15, var12_int);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if ((-1 + this.field_a) * this.field_O > var18) {
                              var15 = this.a(var18 - -this.field_O, 125, var17, var15, var12_int);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (var22 == 0) {
                            continue L11;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                var17 = -119 / ((param10 - 7) / 60);
                stackOut_44_0 = var16;
                stackIn_45_0 = stackOut_44_0;
                break L7;
              }
              L17: {
                if (stackIn_45_0 != 0) {
                  break L17;
                } else {
                  if (var15 < param2) {
                    break L17;
                  } else {
                    var12_int = 8 | var12_int & 7;
                    var14 = 0;
                    var18 = 0;
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (var18 >= var15) {
                            break L20;
                          } else {
                            var19 = this.field_w[var18];
                            var20 = this.field_P[var19];
                            stackOut_49_0 = 1879048192;
                            stackOut_49_1 = 1879048192 & var20;
                            stackIn_76_0 = stackOut_49_0;
                            stackIn_76_1 = stackOut_49_1;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            if (var22 != 0) {
                              break L19;
                            } else {
                              L21: {
                                if (stackIn_50_0 <= stackIn_50_1) {
                                  break L21;
                                } else {
                                  this.field_P[var19] = var20 - -268435456;
                                  break L21;
                                }
                              }
                              var18++;
                              if (var22 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        L22: {
                          var18 = var15;
                          if (!param4) {
                            break L22;
                          } else {
                            L23: while (true) {
                              if (var15 <= var14) {
                                break L22;
                              } else {
                                incrementValue$3 = var14;
                                var14++;
                                var19 = this.field_w[incrementValue$3];
                                stackOut_55_0 = var19 % this.field_O ^ -1;
                                stackOut_55_1 = -1;
                                stackIn_76_0 = stackOut_55_0;
                                stackIn_76_1 = stackOut_55_1;
                                stackIn_56_0 = stackOut_55_0;
                                stackIn_56_1 = stackOut_55_1;
                                if (var22 != 0) {
                                  break L19;
                                } else {
                                  L24: {
                                    if (stackIn_56_0 >= stackIn_56_1) {
                                      break L24;
                                    } else {
                                      var15 = this.a(var15, var19 + -1, (byte) -44, var12_int);
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    if (var19 % this.field_O >= -1 + this.field_O) {
                                      break L25;
                                    } else {
                                      var15 = this.a(var15, var19 - -1, (byte) -44, var12_int);
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    if ((this.field_O ^ -1) >= (var19 ^ -1)) {
                                      var15 = this.a(var15, -this.field_O + var19, (byte) -44, var12_int);
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if ((var19 ^ -1) <= ((this.field_a + -1) * this.field_O ^ -1)) {
                                      break L27;
                                    } else {
                                      var15 = this.a(var15, this.field_O + var19, (byte) -44, var12_int);
                                      break L27;
                                    }
                                  }
                                  if (var22 == 0) {
                                    continue L23;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L28: {
                          if (param9) {
                            break L28;
                          } else {
                            if (null == this.field_rb) {
                              break L28;
                            } else {
                              L29: {
                                if ((param7 ^ -1) != -4) {
                                  break L29;
                                } else {
                                  if (null == this.field_rb) {
                                    break L29;
                                  } else {
                                    var19 = gg.b(var15, 27935);
                                    var20 = var19;
                                    he.field_ab = he.field_ab + var20;
                                    fb.field_e = fb.field_e + var20;
                                    this.field_hb = this.field_hb + var19;
                                    this.field_rb.a(new sa(false, this.b(0, var15, 81), this.a(true, var15, 0), var19, a.field_u, -1 + var15, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15), " = <b>", Integer.toString(var19)}), 2777);
                                    if (var22 == 0) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              if (this.field_rb == null) {
                                break L28;
                              } else {
                                L30: {
                                  var19 = pa.b(var18, 65);
                                  var20 = gg.b(var15 + -var18, 27935);
                                  this.field_f = this.field_f + var19;
                                  var21 = var19;
                                  he.field_ab = he.field_ab + var21;
                                  fb.field_e = fb.field_e + var21;
                                  this.field_hb = this.field_hb + var20;
                                  var21 = var20;
                                  fb.field_e = fb.field_e + var21;
                                  he.field_ab = he.field_ab + var21;
                                  if (0 >= var20) {
                                    break L30;
                                  } else {
                                    this.field_rb.a(new sa(false, this.b(var18, var15, 65), this.a(true, var15, var18), var20, a.field_u, var15 + -var18 - 1, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15 + -var18), " = <b>", Integer.toString(var20)}), 2777);
                                    break L30;
                                  }
                                }
                                this.field_rb.a(new sa(false, this.b(0, var18, 112), this.a(true, var18, 0), var19, bc.field_J, -4 + var18, 16 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var18), " = <b>", Integer.toString(var19)}), 2777);
                                break L28;
                              }
                            }
                          }
                        }
                        var13 = var15;
                        stackOut_75_0 = this.field_D;
                        stackOut_75_1 = param7;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        break L19;
                      }
                      if (stackIn_76_0 >= stackIn_76_1) {
                        L31: {
                          stackOut_78_0 = this;
                          stackOut_78_1 = (lk) (param3);
                          stackOut_78_2 = (oi) (param8);
                          stackOut_78_3 = var12_int;
                          stackOut_78_4 = 0;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          stackIn_80_2 = stackOut_78_2;
                          stackIn_80_3 = stackOut_78_3;
                          stackIn_80_4 = stackOut_78_4;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          stackIn_79_3 = stackOut_78_3;
                          stackIn_79_4 = stackOut_78_4;
                          if (-3 < (this.field_D ^ -1)) {
                            stackOut_80_0 = this;
                            stackOut_80_1 = (lk) ((Object) stackIn_80_1);
                            stackOut_80_2 = (oi) ((Object) stackIn_80_2);
                            stackOut_80_3 = stackIn_80_3;
                            stackOut_80_4 = stackIn_80_4;
                            stackOut_80_5 = var18;
                            stackIn_81_0 = stackOut_80_0;
                            stackIn_81_1 = stackOut_80_1;
                            stackIn_81_2 = stackOut_80_2;
                            stackIn_81_3 = stackOut_80_3;
                            stackIn_81_4 = stackOut_80_4;
                            stackIn_81_5 = stackOut_80_5;
                            break L31;
                          } else {
                            stackOut_79_0 = this;
                            stackOut_79_1 = (lk) ((Object) stackIn_79_1);
                            stackOut_79_2 = (oi) ((Object) stackIn_79_2);
                            stackOut_79_3 = stackIn_79_3;
                            stackOut_79_4 = stackIn_79_4;
                            stackOut_79_5 = var15;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            stackIn_81_2 = stackOut_79_2;
                            stackIn_81_3 = stackOut_79_3;
                            stackIn_81_4 = stackOut_79_4;
                            stackIn_81_5 = stackOut_79_5;
                            break L31;
                          }
                        }
                        this.a(stackIn_81_1, stackIn_81_2, stackIn_81_3, stackIn_81_4, stackIn_81_5);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
              }
              L32: {
                L33: {
                  if (!param9) {
                    var18 = 0;
                    L34: while (true) {
                      if ((var18 ^ -1) <= (var15 ^ -1)) {
                        break L33;
                      } else {
                        var19 = this.field_w[var18];
                        var20 = this.field_P[var19];
                        var21 = var20 & 268435455;
                        stackOut_86_0 = 23;
                        stackIn_93_0 = stackOut_86_0;
                        stackIn_87_0 = stackOut_86_0;
                        if (var22 != 0) {
                          break L32;
                        } else {
                          L35: {
                            L36: {
                              if (stackIn_87_0 == var21) {
                                break L36;
                              } else {
                                if (-3 != (var21 >> -536593437 ^ -1)) {
                                  break L36;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var20 = var20 & 2147483647;
                            this.field_P[var19] = var20;
                            break L35;
                          }
                          var18++;
                          if (var22 == 0) {
                            continue L34;
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                  } else {
                    break L33;
                  }
                }
                stackOut_92_0 = var13;
                stackIn_93_0 = stackOut_92_0;
                break L32;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var12 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) (var12);
            stackOut_94_1 = new StringBuilder().append("lk.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param3 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L37;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L37;
            }
          }
          L38: {
            stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param8 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L38;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L38;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_93_0;
          }
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        boolean discarded$5 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (0 == this.field_C) {
          throw new IllegalStateException();
        } else {
          L0: {
            L1: {
              var3 = (this.field_A ^ -1) & param0;
              this.field_A = param0;
              var4 = 0;
              if (-1 <= (this.field_Ab ^ -1)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Ab = this.field_Ab - 1;
                    if (0 != (1 & var3)) {
                      break L3;
                    } else {
                      if ((var3 & 2 ^ -1) != -1) {
                        this.j(param1 ^ -1674843003);
                        this.field_Cb = 10;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.b((byte) -116);
                  this.field_Cb = -10;
                  break L2;
                }
                L4: {
                  L5: {
                    if (0 > this.field_Cb) {
                      break L5;
                    } else {
                      if (this.field_Cb > 0) {
                        L6: {
                          if ((param0 & 2 ^ -1) == -1) {
                            break L6;
                          } else {
                            fieldTemp$3 = this.field_Cb - 1;
                            this.field_Cb = this.field_Cb - 1;
                            if ((fieldTemp$3 ^ -1) == -1) {
                              this.j(4);
                              this.field_Cb = 3;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        this.field_Cb = 0;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if ((param0 & 1) != 0) {
                      break L7;
                    } else {
                      this.field_Cb = 0;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  fieldTemp$4 = this.field_Cb + 1;
                  this.field_Cb = this.field_Cb + 1;
                  if (fieldTemp$4 != 0) {
                    break L4;
                  } else {
                    this.b((byte) -116);
                    this.field_Cb = -3;
                    break L4;
                  }
                }
                L8: {
                  if (0 != (var3 & 4)) {
                    this.c(false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (0 != (16 & param0)) {
                    var4 = 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 == (8 & var3 ^ -1)) {
                  break L0;
                } else {
                  this.i(0);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var4 = 1;
            break L0;
          }
          L10: {
            if (param1 == -1674843007) {
              break L10;
            } else {
              discarded$5 = lk.a(50, -101, 127, 94, false, 20, 66);
              break L10;
            }
          }
          L11: {
            if (var4 != 0) {
              L12: {
                if (0 == this.field_Ab) {
                  break L12;
                } else {
                  if ((param0 & 16 ^ -1) != -1) {
                    break L12;
                  } else {
                    var4 = 0;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              if (this.field_e <= 2) {
                break L11;
              } else {
                L13: {
                  if (this.field_y) {
                    break L13;
                  } else {
                    if (-1 <= (this.field_Ab ^ -1)) {
                      break L13;
                    } else {
                      if ((this.field_g ^ -1) != (this.field_e ^ -1)) {
                        break L13;
                      } else {
                        if (this.o(32) != this.field_M) {
                          break L13;
                        } else {
                          if (null != this.field_rb) {
                            this.field_H = this.field_H + 5;
                            he.field_ab = he.field_ab + 5;
                            fb.field_e = fb.field_e + 5;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_e = 2;
                break L11;
              }
            } else {
              break L11;
            }
          }
          L14: {
            if (-1 > (this.field_e ^ -1)) {
              this.c(30000, -1 + this.field_e, 0);
              break L14;
            } else {
              break L14;
            }
          }
          return;
        }
    }

    final rf b(int param0) {
        int var2 = 0;
        rf var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        var4 = client.field_A ? 1 : 0;
        this.c(0);
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_t ^ -1) >= (var2 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = this.field_X[var2].field_e;
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
                    break L2;
                  } else {
                    var2++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = this.field_t ^ -1;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          }
          if (stackIn_7_0 < (var2 ^ -1)) {
            if (param0 == -19939) {
              var3 = this.field_X[var2];
              var3.field_e = var3.field_e + 1;
              return var3;
            } else {
              return (rf) null;
            }
          } else {
            throw new IllegalStateException();
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int[] array$2 = null;
        int incrementValue$3 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        var12 = client.field_A ? 1 : 0;
        this.field_L = param5;
        this.field_q = param4;
        param2 = param0 & -this.field_ab + param2;
        L0: while (true) {
          L1: {
            L2: {
              if (-1 <= (param2 ^ -1)) {
                break L2;
              } else {
                var15 = this.field_B;
                var14 = var15;
                var13 = var14;
                var7 = var13;
                if (var12 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (var13 == null) {
                        break L4;
                      } else {
                        if ((this.field_zb * this.field_C ^ -1) >= (var15.length ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    array$2 = new int[this.field_C * this.field_zb];
                    var7 = array$2;
                    this.field_B = array$2;
                    break L3;
                  }
                  var8 = 0;
                  var9 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (this.field_zb <= var9) {
                          break L7;
                        } else {
                          var10 = -1 + this.field_zb - var9;
                          stackOut_9_0 = 0;
                          stackIn_18_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var12 != 0) {
                            break L6;
                          } else {
                            var11 = stackIn_10_0;
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (this.field_C <= var11) {
                                    break L10;
                                  } else {
                                    incrementValue$3 = var8;
                                    var8++;
                                    this.field_B[var10] = this.field_T[incrementValue$3];
                                    var10 = var10 + this.field_zb;
                                    var11++;
                                    if (var12 != 0) {
                                      break L9;
                                    } else {
                                      if (var12 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var9++;
                                break L9;
                              }
                              if (var12 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_17_0 = this.field_C;
                      stackIn_18_0 = stackOut_17_0;
                      break L6;
                    }
                    var8 = stackIn_18_0;
                    this.field_C = this.field_zb;
                    this.field_B = this.field_T;
                    this.field_zb = var8;
                    this.field_T = var7;
                    param2--;
                    if (var12 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            this.a(param1, (byte) 126, param3);
            break L1;
          }
          return;
        }
    }

    final void a(int param0, int param1, rf param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_27_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_zb = param2.field_n;
              this.field_U = this.field_U + 1;
              this.field_C = param2.field_b;
              this.field_b = new int[this.field_C * this.field_zb];
              this.field_T = new int[this.field_C * this.field_zb];
              if (param0 > 73) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            this.field_tb = new int[this.field_C * this.field_zb];
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_zb * this.field_C <= var4_int) {
                    break L4;
                  } else {
                    this.field_T[var4_int] = lb.a(255, (int) param2.field_c[var4_int]);
                    var4_int++;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4_int = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (this.field_C * this.field_zb <= var4_int) {
                      break L7;
                    } else {
                      this.field_b[var4_int] = 8;
                      var4_int++;
                      if (var10 != 0) {
                        break L6;
                      } else {
                        if (var10 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_o = 0;
                  this.field_db = 0;
                  break L6;
                }
                L8: {
                  if (-1 == (1 & (this.field_C ^ this.field_zb) ^ -1)) {
                    break L8;
                  } else {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    L9: while (true) {
                      stackOut_17_0 = var8 ^ -1;
                      stackOut_17_1 = this.field_zb ^ -1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (stackIn_18_0 <= stackIn_18_1) {
                              break L12;
                            } else {
                              stackOut_19_0 = 0;
                              stackIn_28_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (var10 != 0) {
                                break L11;
                              } else {
                                var9 = stackIn_20_0;
                                L13: while (true) {
                                  L14: {
                                    if (var9 >= this.field_C) {
                                      break L14;
                                    } else {
                                      stackOut_22_0 = 0;
                                      stackOut_22_1 = this.field_T[var7];
                                      stackIn_18_0 = stackOut_22_0;
                                      stackIn_18_1 = stackOut_22_1;
                                      stackIn_23_0 = stackOut_22_0;
                                      stackIn_23_1 = stackOut_22_1;
                                      if (var10 != 0) {
                                        continue L10;
                                      } else {
                                        L15: {
                                          if (stackIn_23_0 == stackIn_23_1) {
                                            break L15;
                                          } else {
                                            var5 = var5 + var8;
                                            var6++;
                                            var4_int = var4_int + var9;
                                            break L15;
                                          }
                                        }
                                        var7++;
                                        var9++;
                                        if (var10 == 0) {
                                          continue L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  var8++;
                                  if (var10 == 0) {
                                    continue L9;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var8 = (-1 + this.field_C) * var6 >> 1653217089;
                          stackOut_27_0 = var6 * (this.field_zb - 1) >> 847858401;
                          stackIn_28_0 = stackOut_27_0;
                          break L11;
                        }
                        L16: {
                          L17: {
                            var9 = stackIn_28_0;
                            if (-var9 + var5 <= var4_int + -var8) {
                              break L17;
                            } else {
                              if (var5 - var9 > var8 + -var4_int) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if ((var5 - var9 ^ -1) <= (-var8 + var4_int ^ -1)) {
                              break L18;
                            } else {
                              if (-var9 + var5 >= -var4_int + var8) {
                                break L18;
                              } else {
                                this.field_o = -1;
                                if (var10 == 0) {
                                  break L8;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L19: {
                            if (var4_int < var8) {
                              break L19;
                            } else {
                              this.field_db = 1;
                              if (var10 == 0) {
                                break L8;
                              } else {
                                break L19;
                              }
                            }
                          }
                          this.field_db = -1;
                          if (var10 == 0) {
                            break L8;
                          } else {
                            break L16;
                          }
                        }
                        this.field_o = 1;
                        break L8;
                      }
                    }
                  }
                }
                L20: {
                  this.field_Cb = 0;
                  this.field_q = -this.field_C + this.field_O >> -433015551;
                  this.field_A = 0;
                  this.field_L = -this.field_zb + 1 + this.field_z;
                  this.field_yb = param1;
                  this.field_ab = 0;
                  stackOut_41_0 = this;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_42_0 = stackOut_41_0;
                  if (-3 >= (this.field_g ^ -1)) {
                    stackOut_43_0 = this;
                    stackOut_43_1 = this.field_g;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    break L20;
                  } else {
                    stackOut_42_0 = this;
                    stackOut_42_1 = 2;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    break L20;
                  }
                }
                ((lk) (this)).field_e = stackIn_44_1;
                this.field_y = false;
                this.field_Ab = this.l(123);
                this.field_M = this.o(32);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var4);
            stackOut_46_1 = new StringBuilder().append("lk.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L21;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L21;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
    }

    final void a(rf param0, byte param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        rf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        rf[] var6 = null;
        rf[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_t < this.field_X.length) {
                break L1;
              } else {
                var6 = new rf[2 * this.field_X.length];
                var7 = var6;
                var3 = var7;
                var4 = 0;
                L2: while (true) {
                  L3: {
                    if ((var4 ^ -1) <= (this.field_X.length ^ -1)) {
                      break L3;
                    } else {
                      var6[var4] = this.field_X[var4];
                      var4++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.field_X = var7;
                  break L1;
                }
              }
            }
            L4: {
              if (param1 <= -116) {
                break L4;
              } else {
                this.field_o = 45;
                break L4;
              }
            }
            param0.field_l = this.field_wb;
            this.field_wb = this.field_wb + 3;
            fieldTemp$2 = this.field_t;
            this.field_t = this.field_t + 1;
            this.field_X[fieldTemp$2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("lk.O(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_42_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        var12 = client.field_A ? 1 : 0;
        if (param0 == 5) {
          L0: {
            if (param1 == -15303) {
              break L0;
            } else {
              this.field_Bb = false;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              if (-6 >= (var3 ^ -1)) {
                break L2;
              } else {
                var4 = this.field_w[var3];
                var5 = var4 % this.field_O;
                var6 = var4 / this.field_O;
                var7 = 15;
                stackOut_6_0 = 0;
                stackIn_42_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var12 != 0) {
                  return stackIn_42_0 != 0;
                } else {
                  var8 = stackIn_7_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (5 <= var8) {
                            break L6;
                          } else {
                            stackOut_9_0 = var8;
                            stackOut_9_1 = var3;
                            stackIn_38_0 = stackOut_9_0;
                            stackIn_38_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var12 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  break L7;
                                } else {
                                  L8: {
                                    var9 = this.field_w[var8];
                                    var10 = var9 % this.field_O;
                                    var10 = var10 - var5;
                                    var11 = var9 / this.field_O;
                                    var11 = var11 - var6;
                                    if (-1 != (var11 ^ -1)) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (0 == (var10 ^ -1)) {
                                          break L9;
                                        } else {
                                          if (var10 == 1) {
                                            break L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var7 = var7 & 3;
                                      if (var12 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L10: {
                                    if ((var10 ^ -1) != -1) {
                                      break L10;
                                    } else {
                                      L11: {
                                        if (var11 == -1) {
                                          break L11;
                                        } else {
                                          if ((var11 ^ -1) != -2) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      var7 = var7 & 12;
                                      if (var12 == 0) {
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-1 != var10) {
                                      break L12;
                                    } else {
                                      if ((var11 ^ -1) != 0) {
                                        break L12;
                                      } else {
                                        var7 = var7 & 5;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (-2 != (var10 ^ -1)) {
                                      break L13;
                                    } else {
                                      if (var11 == -1) {
                                        var7 = var7 & 9;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (0 != (var10 ^ -1)) {
                                      break L14;
                                    } else {
                                      if (-2 == (var11 ^ -1)) {
                                        var7 = var7 & 6;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if ((var10 ^ -1) != -2) {
                                    break L4;
                                  } else {
                                    if ((var11 ^ -1) == -2) {
                                      var7 = var7 & 10;
                                      break L7;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              var8++;
                              if (var12 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = -1;
                        stackOut_37_1 = var7 ^ -1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L5;
                      }
                      if (stackIn_38_0 == stackIn_38_1) {
                        break L4;
                      } else {
                        return true;
                      }
                    }
                    var3++;
                    if (var12 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final void k(int param0) {
        if (param0 != -9897) {
            this.field_V = 92;
        }
        if (-1 > (this.field_C ^ -1)) {
            if (!this.field_S) {
                this.field_V = this.field_C;
                this.field_E = this.field_L;
                this.field_mb = 1;
                this.field_h = this.field_zb;
                this.field_ob = this.field_q;
                this.field_N = this.field_T;
                ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
                this.field_S = true;
                this.field_K = 0;
                this.field_p = 0;
                this.field_Bb = false;
                this.field_nb = 0;
            }
        }
        this.field_C = 0;
    }

    private final void b(boolean param0) {
        int var2 = -300 + ka.a((byte) 122, 601, tf.field_cb);
        var2 = var2 * (var2 * var2) / 90000;
        a.a(var2, this.field_J / 4, ak.field_b, this.field_sb, 256);
        if (param0) {
            this.field_M = -21;
        }
    }

    private final void i(int param0) {
        if (this.q(21200)) {
            return;
        }
        if ((this.field_db | this.field_o) != param0) {
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
            if (this.q(param0 ^ 21200)) {
                return;
            }
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_C * this.field_zb;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                var4 = this.field_T[var3];
                stackOut_2_0 = 0;
                stackOut_2_1 = var4;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 != stackIn_3_1) {
                    return (var4 & 24) >> 1983512195;
                  } else {
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = param0;
            stackOut_7_1 = 35;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L1;
          }
          if (stackIn_8_0 >= stackIn_8_1) {
            return 0;
          } else {
            this.field_T = (int[]) null;
            return 0;
          }
        }
    }

    final boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_O * this.field_a;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                var4 = this.field_P[var3];
                stackOut_2_0 = 24 & var4;
                stackOut_2_1 = 24;
                stackIn_9_0 = stackOut_2_0;
                stackIn_9_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      break L3;
                    } else {
                      var4 = var4 & 7;
                      if (1 == var4) {
                        break L3;
                      } else {
                        if (-4 == (var4 ^ -1)) {
                          break L3;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_8_0 = param0;
            stackOut_8_1 = -22477;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          }
          L4: {
            if (stackIn_9_0 == stackIn_9_1) {
              break L4;
            } else {
              this.a((oi) null, 112, true, (lk) null);
              break L4;
            }
          }
          return false;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = -122 / ((param1 - -36) / 55);
        if (!(!ea.d((byte) 69))) {
            im.a(-93, param6, param4, param5);
            if (w.field_H != null) {
                if (w.field_H.a(param4, param3, param0, 0, param5)) {
                    param4 = false;
                    tf.i((byte) -78);
                }
            }
            ll.a(param4, 0, param5);
            ji.a(param2, 0, param4);
            param4 = false;
        }
        return param4;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        this.field_nb = 0;
        this.field_p = 0;
        this.field_S = true;
        this.field_K = 0;
    }

    final void a(oi param0, int param1, boolean param2, lk param3) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var9_ref_ud = null;
        int var10 = 0;
        ei var10_ref_ei = null;
        int var11 = 0;
        ei var11_ref_ei = null;
        ei[] var11_ref_ei__ = null;
        int var12 = 0;
        ei var13 = null;
        int var14 = 0;
        ei var15 = null;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_71_0 = 0;
        ud stackIn_74_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_243_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_281_0 = 0;
        int stackIn_281_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_294_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_297_1 = 0;
        int stackIn_302_0 = 0;
        RuntimeException stackIn_317_0 = null;
        StringBuilder stackIn_317_1 = null;
        RuntimeException stackIn_318_0 = null;
        StringBuilder stackIn_318_1 = null;
        RuntimeException stackIn_319_0 = null;
        StringBuilder stackIn_319_1 = null;
        String stackIn_319_2 = null;
        RuntimeException stackIn_320_0 = null;
        StringBuilder stackIn_320_1 = null;
        RuntimeException stackIn_321_0 = null;
        StringBuilder stackIn_321_1 = null;
        RuntimeException stackIn_322_0 = null;
        StringBuilder stackIn_322_1 = null;
        String stackIn_322_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_70_0 = 0;
        ud stackOut_73_0 = null;
        ud stackOut_72_0 = null;
        int stackOut_108_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_172_0 = 0;
        int stackOut_172_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_177_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        int stackOut_189_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_242_1 = 0;
        int stackOut_249_0 = 0;
        int stackOut_249_1 = 0;
        int stackOut_260_0 = 0;
        int stackOut_260_1 = 0;
        int stackOut_272_0 = 0;
        int stackOut_272_1 = 0;
        int stackOut_280_0 = 0;
        int stackOut_280_1 = 0;
        int stackOut_291_0 = 0;
        int stackOut_291_1 = 0;
        int stackOut_293_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_296_1 = 0;
        int stackOut_301_0 = 0;
        RuntimeException stackOut_316_0 = null;
        StringBuilder stackOut_316_1 = null;
        RuntimeException stackOut_318_0 = null;
        StringBuilder stackOut_318_1 = null;
        String stackOut_318_2 = null;
        RuntimeException stackOut_317_0 = null;
        StringBuilder stackOut_317_1 = null;
        String stackOut_317_2 = null;
        RuntimeException stackOut_319_0 = null;
        StringBuilder stackOut_319_1 = null;
        RuntimeException stackOut_321_0 = null;
        StringBuilder stackOut_321_1 = null;
        String stackOut_321_2 = null;
        RuntimeException stackOut_320_0 = null;
        StringBuilder stackOut_320_1 = null;
        String stackOut_320_2 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            mk.field_e = 0;
            if (param1 > 124) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      dn.field_i = false;
                      fk.field_H = 0;
                      bj.field_a = false;
                      pn.field_db = false;
                      var5_int = 0;
                      if (1 != this.field_ib) {
                        break L4;
                      } else {
                        var6 = 1;
                        var7 = 0;
                        L5: while (true) {
                          L6: {
                            if (this.field_a * this.field_O <= var7) {
                              break L6;
                            } else {
                              var8 = this.field_P[var7];
                              stackOut_6_0 = -33;
                              stackOut_6_1 = var8 ^ -1;
                              stackIn_281_0 = stackOut_6_0;
                              stackIn_281_1 = stackOut_6_1;
                              stackIn_7_0 = stackOut_6_0;
                              stackIn_7_1 = stackOut_6_1;
                              if (var14 != 0) {
                                break L2;
                              } else {
                                L7: {
                                  if (stackIn_7_0 < stackIn_7_1) {
                                    break L7;
                                  } else {
                                    L8: {
                                      L9: {
                                        var8 += 32;
                                        if ((var8 ^ -1) > -417) {
                                          break L9;
                                        } else {
                                          var8 = 0;
                                          if (var14 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var6 = 0;
                                      break L8;
                                    }
                                    var5_int = 1;
                                    this.field_P[var7] = var8;
                                    break L7;
                                  }
                                }
                                var7++;
                                if (var14 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L10: {
                            if (var6 != 0) {
                              this.field_ib = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (-1 == (this.field_ib ^ -1)) {
                      var6 = 0;
                      var7 = 0;
                      var8 = -1 + this.field_a * this.field_O;
                      var9 = this.field_a + -1;
                      L11: while (true) {
                        stackOut_20_0 = -1;
                        stackOut_20_1 = var9 ^ -1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (stackIn_21_0 < stackIn_21_1) {
                                break L14;
                              } else {
                                stackOut_22_0 = -1 + this.field_O;
                                stackIn_71_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if (var14 != 0) {
                                  break L13;
                                } else {
                                  var10 = stackIn_23_0;
                                  L15: while (true) {
                                    L16: {
                                      if (-1 < (var10 ^ -1)) {
                                        break L16;
                                      } else {
                                        var11 = this.field_P[var8];
                                        stackOut_25_0 = var11 ^ -1;
                                        stackOut_25_1 = -1;
                                        stackIn_21_0 = stackOut_25_0;
                                        stackIn_21_1 = stackOut_25_1;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        if (var14 != 0) {
                                          continue L12;
                                        } else {
                                          L17: {
                                            if (stackIn_26_0 == stackIn_26_1) {
                                              break L17;
                                            } else {
                                              L18: {
                                                L19: {
                                                  if (param2) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      if (16 == (var11 & 24)) {
                                                        break L20;
                                                      } else {
                                                        if (-25 != (var11 & 24 ^ -1)) {
                                                          break L19;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    if ((var9 ^ -1) <= (-1 + this.field_a ^ -1)) {
                                                      break L19;
                                                    } else {
                                                      if (this.field_P[var8 - -this.field_O] == 0) {
                                                        break L18;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  if (param2) {
                                                    break L21;
                                                  } else {
                                                    L22: {
                                                      if ((var11 & 24 ^ -1) == -17) {
                                                        break L22;
                                                      } else {
                                                        if ((24 & var11) != 24) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    if (this.field_a + -1 <= var9) {
                                                      break L21;
                                                    } else {
                                                      if (var10 - -this.field_l < 0) {
                                                        break L21;
                                                      } else {
                                                        if ((var10 + this.field_l ^ -1) <= (this.field_O ^ -1)) {
                                                          break L21;
                                                        } else {
                                                          if ((this.field_P[this.field_l + var8] ^ -1) != -1) {
                                                            break L21;
                                                          } else {
                                                            if ((this.field_P[this.field_O + var8 + this.field_l] ^ -1) != -1) {
                                                              break L21;
                                                            } else {
                                                              this.field_P[this.field_l + var8] = de.b(lb.a(31, var11), 32);
                                                              this.field_P[var8] = 0;
                                                              var5_int = 1;
                                                              var6++;
                                                              if (var14 == 0) {
                                                                break L17;
                                                              } else {
                                                                break L21;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L23: {
                                                  if (param2) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if ((var11 & 24 ^ -1) == -17) {
                                                        break L24;
                                                      } else {
                                                        if ((var11 & 24 ^ -1) != -25) {
                                                          break L23;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    if ((this.field_a + -1 ^ -1) >= (var9 ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      if ((-this.field_l + var10 ^ -1) > -1) {
                                                        break L23;
                                                      } else {
                                                        if ((this.field_O ^ -1) >= (-this.field_l + var10 ^ -1)) {
                                                          break L23;
                                                        } else {
                                                          if ((this.field_P[-this.field_l + var8] ^ -1) != -1) {
                                                            break L23;
                                                          } else {
                                                            if (-1 != (this.field_P[-this.field_l + (var8 + this.field_O)] ^ -1)) {
                                                              break L23;
                                                            } else {
                                                              this.field_P[-this.field_l + var8] = de.b(lb.a(31, var11), 32);
                                                              var5_int = 1;
                                                              this.field_P[var8] = 0;
                                                              var6++;
                                                              if (var14 == 0) {
                                                                break L17;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (32 <= var11) {
                                                  L25: {
                                                    L26: {
                                                      L27: {
                                                        if (!param2) {
                                                          break L27;
                                                        } else {
                                                          if (var11 < 64) {
                                                            break L26;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      L28: {
                                                        if (var11 < 64) {
                                                          var7++;
                                                          break L28;
                                                        } else {
                                                          break L28;
                                                        }
                                                      }
                                                      var11 += 32;
                                                      if (-449 >= (var11 ^ -1)) {
                                                        var11 = var11 & 31;
                                                        if (var14 == 0) {
                                                          break L25;
                                                        } else {
                                                          break L26;
                                                        }
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                    var11 = var11 & 31;
                                                    break L25;
                                                  }
                                                  this.field_P[var8] = var11;
                                                  var5_int = 1;
                                                  if (var14 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L18;
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              this.field_P[var8 + this.field_O] = de.b(lb.a(var11, 31), 32);
                                              this.field_P[var8] = 0;
                                              var6++;
                                              var5_int = 1;
                                              break L17;
                                            }
                                          }
                                          var8--;
                                          var10--;
                                          if (var14 == 0) {
                                            continue L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    var9--;
                                    if (var14 == 0) {
                                      continue L11;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_70_0 = this.field_l ^ -1;
                            stackIn_71_0 = stackOut_70_0;
                            break L13;
                          }
                          L29: {
                            if (stackIn_71_0 != -1) {
                              stackOut_73_0 = rc.field_i;
                              stackIn_74_0 = stackOut_73_0;
                              break L29;
                            } else {
                              stackOut_72_0 = bf.field_u;
                              stackIn_74_0 = stackOut_72_0;
                              break L29;
                            }
                          }
                          L30: {
                            L31: {
                              var9_ref_ud = stackIn_74_0;
                              if ((var6 ^ -1) < -1) {
                                break L31;
                              } else {
                                L32: {
                                  var10_ref_ei = wf.field_l[this.field_Q];
                                  if (var10_ref_ei != null) {
                                    var10_ref_ei.g(en.field_o / 50);
                                    wf.field_l[this.field_Q] = null;
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                if (var14 == 0) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L33: {
                              pg.field_a[this.field_Q] = true;
                              var10 = (int)(0.5 + (double)this.field_k * Math.sqrt((double)var6));
                              if ((4 * this.field_k ^ -1) <= (var10 ^ -1)) {
                                break L33;
                              } else {
                                var10 = 4 * this.field_k;
                                break L33;
                              }
                            }
                            L34: {
                              var15 = wf.field_l[this.field_Q];
                              var11_ref_ei = var15;
                              if (var11_ref_ei == null) {
                                break L34;
                              } else {
                                var15.f(-1);
                                break L34;
                              }
                            }
                            L35: {
                              L36: {
                                if (var11_ref_ei == null) {
                                  break L36;
                                } else {
                                  if (!var15.a((byte) 93)) {
                                    break L36;
                                  } else {
                                    if (var15.field_q == var9_ref_ud) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                              L37: {
                                if (var11_ref_ei != null) {
                                  var15.g(en.field_o / 50);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                              var16 = ei.c(var9_ref_ud, 100, var10 * pb.field_d, this.field_lb << -273244250);
                              var11_ref_ei = var16;
                              var16.f(-1);
                              dg.field_c.a(var16);
                              wf.field_l[this.field_Q] = var16;
                              if (var14 == 0) {
                                break L30;
                              } else {
                                break L35;
                              }
                            }
                            var11_ref_ei.b(en.field_o / 50, var10 * pb.field_d, this.field_lb << 522231430);
                            break L30;
                          }
                          L38: {
                            if (0 < var7) {
                              L39: {
                                var10 = (2 + (int)((double)this.field_k * Math.sqrt((double)var7))) / 4;
                                if (this.field_k < var10) {
                                  var10 = this.field_k;
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              ge.a(this.field_lb, var10, (byte) 127, bj.field_e);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L40: {
                            if (var5_int == 0) {
                              break L40;
                            } else {
                              this.field_l = -this.field_l;
                              if (var14 == 0) {
                                break L3;
                              } else {
                                break L40;
                              }
                            }
                          }
                          this.field_ib = 2;
                          this.field_l = 0;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L41: {
                    if (var5_int != 0) {
                      break L41;
                    } else {
                      if (this.field_s) {
                        break L41;
                      } else {
                        if (!param2) {
                          gg.field_B = 2147483647;
                          gi.field_a = 0;
                          var6 = 0;
                          var7 = 0;
                          L42: while (true) {
                            L43: {
                              L44: {
                                if ((var7 ^ -1) <= (this.field_a * this.field_O ^ -1)) {
                                  break L44;
                                } else {
                                  var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                                  stackOut_108_0 = var8;
                                  stackIn_123_0 = stackOut_108_0;
                                  stackIn_109_0 = stackOut_108_0;
                                  if (var14 != 0) {
                                    break L43;
                                  } else {
                                    L45: {
                                      if (stackIn_109_0 > 0) {
                                        L46: {
                                          if (this.field_kb) {
                                            L47: {
                                              if (this.a(-101, var8)) {
                                                bj.field_a = true;
                                                break L47;
                                              } else {
                                                break L47;
                                              }
                                            }
                                            L48: {
                                              if (!this.c(var8, -15303)) {
                                                break L48;
                                              } else {
                                                dn.field_i = true;
                                                break L48;
                                              }
                                            }
                                            if (!this.b(var8, -1)) {
                                              break L46;
                                            } else {
                                              pn.field_db = true;
                                              break L46;
                                            }
                                          } else {
                                            break L46;
                                          }
                                        }
                                        var6++;
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                    var7++;
                                    if (var14 == 0) {
                                      continue L42;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              this.a(-99, false, 1);
                              stackOut_122_0 = var6;
                              stackIn_123_0 = stackOut_122_0;
                              break L43;
                            }
                            L49: {
                              if (stackIn_123_0 > 0) {
                                break L49;
                              } else {
                                this.field_s = true;
                                if (var14 == 0) {
                                  break L41;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            L50: {
                              this.field_K = this.field_K + var6;
                              if (-3 < (var6 ^ -1)) {
                                break L50;
                              } else {
                                L51: {
                                  var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 1) / 2;
                                  if (this.field_k < var7) {
                                    var7 = this.field_k;
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                ge.a(this.field_lb, var7, (byte) 127, bf.field_w);
                                break L50;
                              }
                            }
                            L52: {
                              this.field_nb = this.field_nb + 1;
                              if (-3 >= (this.field_nb ^ -1)) {
                                L53: {
                                  var7 = (this.field_nb + -1) % 4;
                                  var8 = (-1 + this.field_nb) / 4 * 3;
                                  if (var7 != 3) {
                                    break L53;
                                  } else {
                                    var8++;
                                    break L53;
                                  }
                                }
                                ai.a(62, var8, jm.field_v[var7], this.field_lb, this.field_k);
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            L54: {
                              if (null == this.field_rb) {
                                break L54;
                              } else {
                                L55: {
                                  var7 = ik.a((byte) 126, var6);
                                  var8 = var7;
                                  fb.field_e = fb.field_e + var8;
                                  he.field_ab = he.field_ab + var8;
                                  this.field_ub = this.field_ub + var7;
                                  if (0 < var7) {
                                    fieldTemp$6 = gg.field_B;
                                    gg.field_B = gg.field_B - 1;
                                    this.field_rb.a(new sa(true, this.field_O * 128, -384 + fieldTemp$6 * 256, var7, jg.field_f, -2 + var6, 0, new String[]{cm.a((byte) 85, on.field_h, new String[]{Integer.toString(var6)}), " = <b>", Integer.toString(var7)}), 2777);
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                                var8 = le.b(32085, this.field_nb);
                                if (0 < var8) {
                                  fieldTemp$7 = gg.field_B;
                                  gg.field_B = gg.field_B - 1;
                                  this.field_W = new sa(true, 128 * this.field_O, -384 + fieldTemp$7 * 256, var8, nf.field_f, this.field_nb + -2, 0, new String[]{cm.a((byte) 115, e.field_d, new String[]{Integer.toString(this.field_nb)}), " = <b>", Integer.toString(var8)});
                                  break L54;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            var5_int = 1;
                            break L41;
                          }
                        } else {
                          break L41;
                        }
                      }
                    }
                  }
                  L56: {
                    if (var5_int != 0) {
                      break L56;
                    } else {
                      if (param2) {
                        break L56;
                      } else {
                        var6 = 1;
                        var7 = 0;
                        L57: while (true) {
                          L58: {
                            L59: {
                              if (var7 >= this.field_a * this.field_O) {
                                break L59;
                              } else {
                                var8 = this.field_P[var7];
                                stackOut_148_0 = var8 ^ -1;
                                stackOut_148_1 = -33;
                                stackIn_158_0 = stackOut_148_0;
                                stackIn_158_1 = stackOut_148_1;
                                stackIn_149_0 = stackOut_148_0;
                                stackIn_149_1 = stackOut_148_1;
                                if (var14 != 0) {
                                  break L58;
                                } else {
                                  L60: {
                                    if (stackIn_149_0 > stackIn_149_1) {
                                      break L60;
                                    } else {
                                      if ((var8 & 31 ^ -1) == -26) {
                                        break L60;
                                      } else {
                                        if ((var8 & 31 ^ -1) == -28) {
                                          break L60;
                                        } else {
                                          L61: {
                                            L62: {
                                              var8 += 32;
                                              if (var8 < 416) {
                                                break L62;
                                              } else {
                                                var8 = 0;
                                                if (var14 == 0) {
                                                  break L61;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                            var6 = 0;
                                            break L61;
                                          }
                                          this.field_P[var7] = var8;
                                          var5_int = 1;
                                          break L60;
                                        }
                                      }
                                    }
                                  }
                                  var7++;
                                  if (var14 == 0) {
                                    continue L57;
                                  } else {
                                    break L59;
                                  }
                                }
                              }
                            }
                            var7 = -1 + (-1 + this.field_a) * this.field_O;
                            stackOut_157_0 = this.field_a;
                            stackOut_157_1 = 2;
                            stackIn_158_0 = stackOut_157_0;
                            stackIn_158_1 = stackOut_157_1;
                            break L58;
                          }
                          var8 = stackIn_158_0 - stackIn_158_1;
                          L63: while (true) {
                            L64: {
                              L65: {
                                L66: {
                                  if (var8 < 0) {
                                    break L66;
                                  } else {
                                    stackOut_160_0 = -1 + this.field_O;
                                    stackIn_174_0 = stackOut_160_0;
                                    stackIn_161_0 = stackOut_160_0;
                                    if (var14 != 0) {
                                      break L64;
                                    } else {
                                      var9 = stackIn_161_0;
                                      L67: while (true) {
                                        L68: {
                                          if (var9 < 0) {
                                            break L68;
                                          } else {
                                            var10 = this.field_P[var7];
                                            stackOut_163_0 = var10 ^ -1;
                                            stackOut_163_1 = -26;
                                            stackIn_173_0 = stackOut_163_0;
                                            stackIn_173_1 = stackOut_163_1;
                                            stackIn_164_0 = stackOut_163_0;
                                            stackIn_164_1 = stackOut_163_1;
                                            if (var14 != 0) {
                                              break L65;
                                            } else {
                                              L69: {
                                                if (stackIn_164_0 == stackIn_164_1) {
                                                  discarded$8 = this.a(false, 2, 1, param3, false, -2, this.field_O + var7, 3, param0, false, (byte) 109);
                                                  this.b(-1, this.field_O + var7, false);
                                                  break L69;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                              L70: {
                                                if (27 == var10) {
                                                  discarded$9 = this.a(true, 2, 1, param3, true, -2, this.field_O + var7, 3, param0, false, (byte) -99);
                                                  this.b(-1, var7 - -this.field_O, false);
                                                  break L70;
                                                } else {
                                                  break L70;
                                                }
                                              }
                                              var7--;
                                              var9--;
                                              if (var14 == 0) {
                                                continue L67;
                                              } else {
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                        var8--;
                                        if (var14 == 0) {
                                          continue L63;
                                        } else {
                                          break L66;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7 = this.field_O * (-1 + this.field_a) - 1;
                                stackOut_172_0 = -2;
                                stackOut_172_1 = this.field_a;
                                stackIn_173_0 = stackOut_172_0;
                                stackIn_173_1 = stackOut_172_1;
                                break L65;
                              }
                              stackOut_173_0 = stackIn_173_0 + stackIn_173_1;
                              stackIn_174_0 = stackOut_173_0;
                              break L64;
                            }
                            var8 = stackIn_174_0;
                            L71: while (true) {
                              stackOut_175_0 = var8 ^ -1;
                              stackOut_175_1 = -1;
                              stackIn_176_0 = stackOut_175_0;
                              stackIn_176_1 = stackOut_175_1;
                              L72: while (true) {
                                L73: {
                                  L74: {
                                    if (stackIn_176_0 > stackIn_176_1) {
                                      break L74;
                                    } else {
                                      stackOut_177_0 = -1 + this.field_O;
                                      stackIn_190_0 = stackOut_177_0;
                                      stackIn_178_0 = stackOut_177_0;
                                      if (var14 != 0) {
                                        break L73;
                                      } else {
                                        var9 = stackIn_178_0;
                                        L75: while (true) {
                                          L76: {
                                            if (-1 < (var9 ^ -1)) {
                                              break L76;
                                            } else {
                                              var10 = this.field_P[var7];
                                              stackOut_180_0 = var10 ^ -1;
                                              stackOut_180_1 = -26;
                                              stackIn_176_0 = stackOut_180_0;
                                              stackIn_176_1 = stackOut_180_1;
                                              stackIn_181_0 = stackOut_180_0;
                                              stackIn_181_1 = stackOut_180_1;
                                              if (var14 != 0) {
                                                continue L72;
                                              } else {
                                                L77: {
                                                  if (stackIn_181_0 != stackIn_181_1) {
                                                    break L77;
                                                  } else {
                                                    if (-1 != (this.field_P[var7 + this.field_O] & 1879048192 ^ -1)) {
                                                      break L77;
                                                    } else {
                                                      discarded$10 = this.a(false, 1, 1, param3, false, -1, var7 - -this.field_O, 3, param0, false, (byte) 123);
                                                      break L77;
                                                    }
                                                  }
                                                }
                                                L78: {
                                                  if ((var10 ^ -1) != -28) {
                                                    break L78;
                                                  } else {
                                                    if (0 != (this.field_P[this.field_O + var7] & 1879048192)) {
                                                      break L78;
                                                    } else {
                                                      discarded$11 = this.a(false, 1, 1, param3, true, -1, this.field_O + var7, 3, param0, false, (byte) 72);
                                                      break L78;
                                                    }
                                                  }
                                                }
                                                var7--;
                                                var9--;
                                                if (var14 == 0) {
                                                  continue L75;
                                                } else {
                                                  break L76;
                                                }
                                              }
                                            }
                                          }
                                          var8--;
                                          if (var14 == 0) {
                                            continue L71;
                                          } else {
                                            break L74;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.a(-121, false, 2);
                                  var8 = 0;
                                  var7 = -1 + this.field_O * this.field_a;
                                  stackOut_189_0 = 0;
                                  stackIn_190_0 = stackOut_189_0;
                                  break L73;
                                }
                                var9 = stackIn_190_0;
                                var10 = -1 + this.field_a;
                                L79: while (true) {
                                  stackOut_191_0 = -1;
                                  stackOut_191_1 = var10 ^ -1;
                                  stackIn_192_0 = stackOut_191_0;
                                  stackIn_192_1 = stackOut_191_1;
                                  L80: while (true) {
                                    L81: {
                                      L82: {
                                        if (stackIn_192_0 < stackIn_192_1) {
                                          break L82;
                                        } else {
                                          stackOut_193_0 = this.field_O + -1;
                                          stackIn_215_0 = stackOut_193_0;
                                          stackIn_194_0 = stackOut_193_0;
                                          if (var14 != 0) {
                                            break L81;
                                          } else {
                                            var11 = stackIn_194_0;
                                            L83: while (true) {
                                              L84: {
                                                if (var11 < 0) {
                                                  break L84;
                                                } else {
                                                  var12 = this.field_P[var7];
                                                  stackOut_196_0 = 31 & var12 ^ -1;
                                                  stackOut_196_1 = -26;
                                                  stackIn_192_0 = stackOut_196_0;
                                                  stackIn_192_1 = stackOut_196_1;
                                                  stackIn_197_0 = stackOut_196_0;
                                                  stackIn_197_1 = stackOut_196_1;
                                                  if (var14 != 0) {
                                                    continue L80;
                                                  } else {
                                                    L85: {
                                                      L86: {
                                                        if (stackIn_197_0 == stackIn_197_1) {
                                                          break L86;
                                                        } else {
                                                          if (27 != (var12 & 31)) {
                                                            break L85;
                                                          } else {
                                                            break L86;
                                                          }
                                                        }
                                                      }
                                                      L87: {
                                                        var5_int = 1;
                                                        if (32 > var12) {
                                                          break L87;
                                                        } else {
                                                          L88: {
                                                            L89: {
                                                              var12 += 32;
                                                              if ((var12 ^ -1) > -417) {
                                                                break L89;
                                                              } else {
                                                                var12 = 0;
                                                                if (var14 == 0) {
                                                                  break L88;
                                                                } else {
                                                                  break L89;
                                                                }
                                                              }
                                                            }
                                                            var6 = 0;
                                                            break L88;
                                                          }
                                                          this.field_P[var7] = var12;
                                                          if (var14 == 0) {
                                                            break L85;
                                                          } else {
                                                            break L87;
                                                          }
                                                        }
                                                      }
                                                      L90: {
                                                        if (-1 + this.field_a > var10) {
                                                          this.field_P[var7 + this.field_O] = var12;
                                                          break L90;
                                                        } else {
                                                          break L90;
                                                        }
                                                      }
                                                      L91: {
                                                        this.field_P[var7] = var12 - -32;
                                                        var6 = 0;
                                                        if ((7 & var12 ^ -1) == -4) {
                                                          break L91;
                                                        } else {
                                                          var8++;
                                                          if (var14 == 0) {
                                                            break L85;
                                                          } else {
                                                            break L91;
                                                          }
                                                        }
                                                      }
                                                      var9++;
                                                      break L85;
                                                    }
                                                    var7--;
                                                    var11--;
                                                    if (var14 == 0) {
                                                      continue L83;
                                                    } else {
                                                      break L84;
                                                    }
                                                  }
                                                }
                                              }
                                              var10--;
                                              if (var14 == 0) {
                                                continue L79;
                                              } else {
                                                break L82;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_214_0 = 0;
                                      stackIn_215_0 = stackOut_214_0;
                                      break L81;
                                    }
                                    L92: {
                                      if (stackIn_215_0 >= var8) {
                                        break L92;
                                      } else {
                                        L93: {
                                          var10 = kd.field_s[0][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[0];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var8))) / 2;
                                          if (var12 > this.field_k) {
                                            var12 = this.field_k;
                                            break L93;
                                          } else {
                                            break L93;
                                          }
                                        }
                                        L94: {
                                          if (var12 >= var10) {
                                            break L94;
                                          } else {
                                            var12 = var10;
                                            break L94;
                                          }
                                        }
                                        L95: {
                                          kd.field_s[0][this.field_Q] = var12;
                                          var13 = var11_ref_ei__[this.field_Q];
                                          if (var13 == null) {
                                            break L95;
                                          } else {
                                            var13.b(en.field_o / 50, var12 * pb.field_d, this.field_lb << -432303322);
                                            if (var14 == 0) {
                                              break L92;
                                            } else {
                                              break L95;
                                            }
                                          }
                                        }
                                        var17 = ei.c(ob.field_n, 100, pb.field_d * var12, this.field_lb << -1195698778);
                                        var17.f(-1);
                                        dg.field_c.a(var17);
                                        var11_ref_ei__[this.field_Q] = var17;
                                        break L92;
                                      }
                                    }
                                    L96: {
                                      if (0 < var9) {
                                        L97: {
                                          var10 = kd.field_s[1][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[1];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var9))) / 2;
                                          if ((this.field_k ^ -1) <= (var12 ^ -1)) {
                                            break L97;
                                          } else {
                                            var12 = this.field_k;
                                            break L97;
                                          }
                                        }
                                        L98: {
                                          if (var12 >= var10) {
                                            break L98;
                                          } else {
                                            var12 = var10;
                                            break L98;
                                          }
                                        }
                                        L99: {
                                          kd.field_s[1][this.field_Q] = var12;
                                          var13 = var11_ref_ei__[this.field_Q];
                                          if (var13 == null) {
                                            break L99;
                                          } else {
                                            var13.b(en.field_o / 50, pb.field_d * var12, this.field_lb << -59157402);
                                            if (var14 == 0) {
                                              break L96;
                                            } else {
                                              break L99;
                                            }
                                          }
                                        }
                                        var18 = ei.c(ob.field_n, 120, var12 * pb.field_d, this.field_lb << -297612698);
                                        var18.f(-1);
                                        dg.field_c.a(var18);
                                        var11_ref_ei__[this.field_Q] = var18;
                                        break L96;
                                      } else {
                                        break L96;
                                      }
                                    }
                                    if (var5_int == 0) {
                                      break L56;
                                    } else {
                                      if (var6 == 0) {
                                        break L56;
                                      } else {
                                        this.field_ib = 0;
                                        this.field_s = false;
                                        break L56;
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
                  }
                  L100: {
                    if (param2) {
                      break L100;
                    } else {
                      if (this.field_G == 0) {
                        break L100;
                      } else {
                        var6 = this.field_G;
                        this.field_G = 0;
                        var7 = 0;
                        var8 = 0;
                        L101: while (true) {
                          L102: {
                            L103: {
                              if (this.field_a * this.field_O <= var8) {
                                break L103;
                              } else {
                                var9 = this.field_P[var8];
                                var10 = var9 >> -465067389;
                                stackOut_242_0 = 2;
                                stackOut_242_1 = var10;
                                stackIn_250_0 = stackOut_242_0;
                                stackIn_250_1 = stackOut_242_1;
                                stackIn_243_0 = stackOut_242_0;
                                stackIn_243_1 = stackOut_242_1;
                                if (var14 != 0) {
                                  break L102;
                                } else {
                                  L104: {
                                    L105: {
                                      if (stackIn_243_0 == stackIn_243_1) {
                                        break L105;
                                      } else {
                                        if ((var10 ^ -1) != -2) {
                                          break L104;
                                        } else {
                                          break L105;
                                        }
                                      }
                                    }
                                    var11 = 1 << (7 & var9);
                                    if (0 == (var6 & var11)) {
                                      break L104;
                                    } else {
                                      var7 = var7 + this.a(true, var10, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                                      break L104;
                                    }
                                  }
                                  var8++;
                                  if (var14 == 0) {
                                    continue L101;
                                  } else {
                                    break L103;
                                  }
                                }
                              }
                            }
                            this.a(-107, true, this.field_ib);
                            stackOut_249_0 = var7 ^ -1;
                            stackOut_249_1 = -1;
                            stackIn_250_0 = stackOut_249_0;
                            stackIn_250_1 = stackOut_249_1;
                            break L102;
                          }
                          if (stackIn_250_0 < stackIn_250_1) {
                            var5_int = 1;
                            if (null == this.field_rb) {
                              break L100;
                            } else {
                              var8 = gg.b(var7, 27935);
                              var9 = var8;
                              he.field_ab = he.field_ab + var9;
                              fb.field_e = fb.field_e + var9;
                              this.field_hb = this.field_hb + var8;
                              this.field_rb.a(new sa(true, this.field_O * 128, this.field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[]{" = <b>", Integer.toString(var8)}), 2777);
                              break L100;
                            }
                          } else {
                            break L100;
                          }
                        }
                      }
                    }
                  }
                  L106: {
                    if (param2) {
                      break L106;
                    } else {
                      L107: {
                        if (this.field_r) {
                          break L107;
                        } else {
                          if (this.field_Y) {
                            break L107;
                          } else {
                            break L106;
                          }
                        }
                      }
                      var6 = 0;
                      L108: while (true) {
                        L109: {
                          L110: {
                            L111: {
                              if ((this.field_O * this.field_a ^ -1) >= (var6 ^ -1)) {
                                break L111;
                              } else {
                                var7 = this.field_P[var6];
                                stackOut_260_0 = -24;
                                stackOut_260_1 = var7 ^ -1;
                                stackIn_273_0 = stackOut_260_0;
                                stackIn_273_1 = stackOut_260_1;
                                stackIn_261_0 = stackOut_260_0;
                                stackIn_261_1 = stackOut_260_1;
                                if (var14 != 0) {
                                  break L110;
                                } else {
                                  L112: {
                                    if (stackIn_261_0 == stackIn_261_1) {
                                      break L112;
                                    } else {
                                      L113: {
                                        L114: {
                                          if (!this.field_r) {
                                            break L114;
                                          } else {
                                            if (var7 >> 1910143171 == 1) {
                                              break L113;
                                            } else {
                                              break L114;
                                            }
                                          }
                                        }
                                        if (!this.field_Y) {
                                          break L112;
                                        } else {
                                          if ((var7 >> 585718723 ^ -1) == -3) {
                                            break L113;
                                          } else {
                                            break L112;
                                          }
                                        }
                                      }
                                      this.field_P[var6] = qm.b(24, var7);
                                      break L112;
                                    }
                                  }
                                  var6++;
                                  if (var14 == 0) {
                                    continue L108;
                                  } else {
                                    break L111;
                                  }
                                }
                              }
                            }
                            if (this.field_r) {
                              this.field_v = true;
                              stackOut_272_0 = this.field_lb;
                              stackOut_272_1 = this.field_k;
                              stackIn_273_0 = stackOut_272_0;
                              stackIn_273_1 = stackOut_272_1;
                              break L110;
                            } else {
                              break L109;
                            }
                          }
                          ge.a(stackIn_273_0, stackIn_273_1, (byte) 127, fj.field_k);
                          break L109;
                        }
                        L115: {
                          if (this.field_Y) {
                            ge.a(this.field_lb, this.field_k, (byte) 127, w.field_Eb);
                            break L115;
                          } else {
                            break L115;
                          }
                        }
                        this.field_Y = false;
                        this.field_r = false;
                        break L106;
                      }
                    }
                  }
                  if (this.field_N != null) {
                    this.field_mb = this.field_mb + 1;
                    stackOut_280_0 = 13;
                    stackOut_280_1 = this.field_mb;
                    stackIn_281_0 = stackOut_280_0;
                    stackIn_281_1 = stackOut_280_1;
                    break L2;
                  } else {
                    break L1;
                  }
                }
                if (stackIn_281_0 == stackIn_281_1) {
                  this.field_N = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              L116: {
                if (param2) {
                  break L116;
                } else {
                  if (var5_int != 0) {
                    break L116;
                  } else {
                    if (null != this.field_N) {
                      break L116;
                    } else {
                      if (this.field_jb <= 0) {
                        break L116;
                      } else {
                        if (this.field_Z != this.field_z) {
                          ge.a(this.field_lb, this.field_k, (byte) 127, qa.field_s);
                          var6 = this.field_z;
                          L117: while (true) {
                            stackOut_291_0 = var6 ^ -1;
                            stackOut_291_1 = this.field_Z ^ -1;
                            stackIn_292_0 = stackOut_291_0;
                            stackIn_292_1 = stackOut_291_1;
                            L118: while (true) {
                              L119: {
                                L120: {
                                  if (stackIn_292_0 <= stackIn_292_1) {
                                    break L120;
                                  } else {
                                    stackOut_293_0 = 0;
                                    stackIn_302_0 = stackOut_293_0;
                                    stackIn_294_0 = stackOut_293_0;
                                    if (var14 != 0) {
                                      break L119;
                                    } else {
                                      var7 = stackIn_294_0;
                                      L121: while (true) {
                                        L122: {
                                          if (var7 >= this.field_O) {
                                            break L122;
                                          } else {
                                            var8 = this.field_P[var6 * this.field_O + var7];
                                            stackOut_296_0 = -1;
                                            stackOut_296_1 = var8 ^ -1;
                                            stackIn_292_0 = stackOut_296_0;
                                            stackIn_292_1 = stackOut_296_1;
                                            stackIn_297_0 = stackOut_296_0;
                                            stackIn_297_1 = stackOut_296_1;
                                            if (var14 != 0) {
                                              continue L118;
                                            } else {
                                              L123: {
                                                if (stackIn_297_0 == stackIn_297_1) {
                                                  break L123;
                                                } else {
                                                  this.field_P[var6 * this.field_O - -var7] = 32 + var8;
                                                  this.field_ib = 1;
                                                  break L123;
                                                }
                                              }
                                              var7++;
                                              if (var14 == 0) {
                                                continue L121;
                                              } else {
                                                break L122;
                                              }
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var14 == 0) {
                                          continue L117;
                                        } else {
                                          break L120;
                                        }
                                      }
                                    }
                                  }
                                }
                                this.field_L = this.field_L + (this.field_Z - this.field_z);
                                stackOut_301_0 = 1;
                                stackIn_302_0 = stackOut_301_0;
                                break L119;
                              }
                              var5_int = stackIn_302_0;
                              this.field_z = this.field_Z;
                              break L116;
                            }
                          }
                        } else {
                          break L116;
                        }
                      }
                    }
                  }
                }
              }
              L124: {
                L125: {
                  if (var5_int != 0) {
                    break L125;
                  } else {
                    if (this.field_N != null) {
                      break L125;
                    } else {
                      if (!param2) {
                        L126: {
                          this.field_S = false;
                          this.field_s = false;
                          this.field_ib = 0;
                          this.field_v = false;
                          if (this.field_rb == null) {
                            break L126;
                          } else {
                            if (this.field_W != null) {
                              this.field_j = this.field_j + this.field_W.field_t;
                              var6 = this.field_W.field_t;
                              fb.field_e = fb.field_e + var6;
                              he.field_ab = he.field_ab + var6;
                              this.field_rb.a(this.field_W, 2777);
                              this.field_W = null;
                              break L126;
                            } else {
                              break L126;
                            }
                          }
                        }
                        L127: {
                          if (this.c((byte) -117)) {
                            this.field_L = this.field_L - 1;
                            break L127;
                          } else {
                            break L127;
                          }
                        }
                        this.field_M = this.o(32);
                        break L125;
                      } else {
                        break L124;
                      }
                    }
                  }
                }
                break L124;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L128: {
            var5 = decompiledCaughtException;
            stackOut_316_0 = (RuntimeException) (var5);
            stackOut_316_1 = new StringBuilder().append("lk.WA(");
            stackIn_318_0 = stackOut_316_0;
            stackIn_318_1 = stackOut_316_1;
            stackIn_317_0 = stackOut_316_0;
            stackIn_317_1 = stackOut_316_1;
            if (param0 == null) {
              stackOut_318_0 = (RuntimeException) ((Object) stackIn_318_0);
              stackOut_318_1 = (StringBuilder) ((Object) stackIn_318_1);
              stackOut_318_2 = "null";
              stackIn_319_0 = stackOut_318_0;
              stackIn_319_1 = stackOut_318_1;
              stackIn_319_2 = stackOut_318_2;
              break L128;
            } else {
              stackOut_317_0 = (RuntimeException) ((Object) stackIn_317_0);
              stackOut_317_1 = (StringBuilder) ((Object) stackIn_317_1);
              stackOut_317_2 = "{...}";
              stackIn_319_0 = stackOut_317_0;
              stackIn_319_1 = stackOut_317_1;
              stackIn_319_2 = stackOut_317_2;
              break L128;
            }
          }
          L129: {
            stackOut_319_0 = (RuntimeException) ((Object) stackIn_319_0);
            stackOut_319_1 = ((StringBuilder) (Object) stackIn_319_1).append(stackIn_319_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_321_0 = stackOut_319_0;
            stackIn_321_1 = stackOut_319_1;
            stackIn_320_0 = stackOut_319_0;
            stackIn_320_1 = stackOut_319_1;
            if (param3 == null) {
              stackOut_321_0 = (RuntimeException) ((Object) stackIn_321_0);
              stackOut_321_1 = (StringBuilder) ((Object) stackIn_321_1);
              stackOut_321_2 = "null";
              stackIn_322_0 = stackOut_321_0;
              stackIn_322_1 = stackOut_321_1;
              stackIn_322_2 = stackOut_321_2;
              break L129;
            } else {
              stackOut_320_0 = (RuntimeException) ((Object) stackIn_320_0);
              stackOut_320_1 = (StringBuilder) ((Object) stackIn_320_1);
              stackOut_320_2 = "{...}";
              stackIn_322_0 = stackOut_320_0;
              stackIn_322_1 = stackOut_320_1;
              stackIn_322_2 = stackOut_320_2;
              break L129;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_322_0), stackIn_322_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        if (param0 < 35) {
            lk.a((mm) null, true, (mm) null, -73);
        }
        field_i = null;
    }

    private final void b(byte param0) {
        L0: {
          L1: {
            this.field_q = this.field_q - 1;
            if (!this.c((byte) -117)) {
              break L1;
            } else {
              this.field_q = this.field_q + 1;
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.h(param0 + 115);
          ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
          break L0;
        }
        L2: {
          if (param0 == -116) {
            break L2;
          } else {
            this.field_j = 63;
            break L2;
          }
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
            this.field_pb = -32;
        }
        ge.a(this.field_sb, this.field_J / 8, (byte) 127, ul.field_i);
    }

    private final rf p(int param0) {
        rf var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        if (this.field_t > 0) {
          var2 = this.field_X[0];
          var3 = 1;
          L0: while (true) {
            L1: {
              L2: {
                if ((this.field_t ^ -1) >= (var3 ^ -1)) {
                  break L2;
                } else {
                  this.field_X[-1 + var3] = this.field_X[var3];
                  var3++;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_m = this.field_m + 1;
              break L1;
            }
            if (param0 > 121) {
              this.field_t = this.field_t - 1;
              return var2;
            } else {
              return (rf) null;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final void a(boolean param0, wl param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.e(3);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 == (var4_int & 256 ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((lk) (this)).field_S = stackIn_4_1 != 0;
              this.field_ab = (1616 & var4_int) >> 2050439561;
              this.field_o = (-1073741824 & var4_int << -818043813) >> 627226110;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (64 & var4_int)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              L4: {
                ((lk) (this)).field_y = stackIn_7_1 != 0;
                if ((32 & var4_int) == 0) {
                  break L4;
                } else {
                  this.field_ib = 0;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_ib = 1;
              break L3;
            }
            L5: {
              L6: {
                this.field_db = (-1073741824 & var4_int << 2113050941) >> 1576984158;
                this.field_jb = param1.d((byte) -74);
                if (!param0) {
                  break L6;
                } else {
                  var5 = this.field_jb;
                  L7: while (true) {
                    if (3 <= var5) {
                      break L6;
                    } else {
                      rk.field_cb = rk.field_cb + 30000;
                      fh.field_h = fh.field_h + 30000;
                      var5++;
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          continue L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              var5 = 0;
              break L5;
            }
            L8: while (true) {
              L9: {
                L10: {
                  L11: {
                    L12: {
                      if ((this.field_a * this.field_O ^ -1) >= (var5 ^ -1)) {
                        break L12;
                      } else {
                        var6 = param1.d((byte) -40);
                        stackOut_20_0 = -129;
                        stackOut_20_1 = var6 ^ -1;
                        stackIn_27_0 = stackOut_20_0;
                        stackIn_27_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (var8 != 0) {
                          L13: while (true) {
                            if (stackIn_27_0 <= stackIn_27_1) {
                              break L10;
                            } else {
                              this.field_T[var5] = param1.d((byte) -42);
                              var5++;
                              if (var8 != 0) {
                                break L9;
                              } else {
                                if (var8 == 0) {
                                  stackOut_26_0 = var5 ^ -1;
                                  stackOut_26_1 = this.field_C * this.field_zb ^ -1;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  continue L13;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        } else {
                          L14: {
                            if (stackIn_21_0 >= stackIn_21_1) {
                              var7 = param1.d((byte) -102);
                              var6 = 127 & var6 | var7 << 1559143495;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          this.field_P[var5] = var6;
                          var5++;
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    this.field_U = param1.d((byte) -71);
                    this.field_C = param1.d((byte) -38);
                    this.field_zb = param1.d((byte) -39);
                    this.field_T = new int[this.field_C * this.field_zb];
                    this.field_b = new int[this.field_C * this.field_zb];
                    this.field_tb = new int[this.field_zb * this.field_C];
                    var5 = 0;
                    L15: while (true) {
                      stackOut_26_0 = var5 ^ -1;
                      stackOut_26_1 = this.field_C * this.field_zb ^ -1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (stackIn_27_0 <= stackIn_27_1) {
                        break L10;
                      } else {
                        this.field_T[var5] = param1.d((byte) -42);
                        var5++;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            continue L15;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  break L10;
                }
                var5 = 0;
                break L9;
              }
              L16: while (true) {
                L17: {
                  L18: {
                    if (this.field_C * this.field_zb <= var5) {
                      break L18;
                    } else {
                      this.field_b[var5] = 8;
                      var5++;
                      if (var8 != 0) {
                        break L17;
                      } else {
                        if (var8 == 0) {
                          continue L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  this.field_q = param1.g((byte) -123);
                  this.field_L = param1.g((byte) -84);
                  this.field_e = param1.d((byte) -45);
                  this.field_Ab = param1.e(3);
                  this.field_A = param1.d((byte) -104);
                  this.field_Cb = param1.g((byte) -122);
                  this.field_yb = param1.d((byte) -102);
                  break L17;
                }
                L19: {
                  if (param2 >= 116) {
                    break L19;
                  } else {
                    this.a(84, false, 99);
                    break L19;
                  }
                }
                this.field_K = param1.d((byte) -52);
                this.field_z = param1.d((byte) -100);
                this.field_Bb = false;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("lk.JA(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L20;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L20;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ')');
        }
    }

    private final int o(int param0) {
        if (param0 != 32) {
            field_i = (String) null;
        }
        return this.field_o + this.field_zb + 2 * this.field_L;
    }

    private final void d(int param0) {
        int var2 = this.o(32);
        if (!(this.field_M >= var2)) {
            this.field_M = var2;
        }
        if (param0 != 30968) {
            this.a((oi) null, -76, false, (lk) null);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$2 = 0;
        int var6 = 0;
        L0: {
          if (param1 > 123) {
            break L0;
          } else {
            this.field_pb = -105;
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = this.field_P[param0];
            if ((-1879048193 & var6 ^ -1) == (param4 ^ -1)) {
              break L2;
            } else {
              if ((var6 & -1879048193) != param2) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          incrementValue$2 = param3;
          param3++;
          this.field_w[incrementValue$2] = param0;
          this.field_P[param0] = var6 + -2147483648;
          break L1;
        }
        return param3;
    }

    private final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        var4 = this.field_P[param1];
        if (!param2) {
          L0: {
            if (24 != (-1879048200 & var4)) {
              break L0;
            } else {
              if (1 == (7 & var4)) {
                return;
              } else {
                if ((7 & var4 ^ -1) != -4) {
                  L1: {
                    if ((var4 & -1879048193) != 24) {
                      break L1;
                    } else {
                      if (0 != this.field_l) {
                        break L1;
                      } else {
                        this.field_l = 1;
                        ge.a(this.field_lb, this.field_k / 2, (byte) 127, pk.field_q);
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if ((var4 & -1879048193) != 29) {
                      break L2;
                    } else {
                      this.field_Y = true;
                      break L2;
                    }
                  }
                  L3: {
                    if ((var4 & -1879048193) != 26) {
                      break L3;
                    } else {
                      if (param0 < 0) {
                        break L3;
                      } else {
                        this.field_G = this.field_G | 1 << param0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((-1879048193 & var4 ^ -1) != -29) {
                      break L4;
                    } else {
                      this.field_r = true;
                      break L4;
                    }
                  }
                  if ((1879048192 & var4) == 0) {
                    this.field_P[param1] = 268435456 + var4;
                    if (this.field_rb != null) {
                      he.field_ab = he.field_ab + 2000;
                      fb.field_e = fb.field_e + 2000;
                      this.field_bb = this.field_bb + 2000;
                      this.field_rb.a(new sa(true, 128 - -(256 * (param1 % this.field_O)), param1 / this.field_O * 256 + 128, 2000, (int[]) null, 13684944, var4, new String[]{" = <b>", Integer.toString(2000)}), 2777);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean t(int param0) {
        int[] array$2 = null;
        int incrementValue$3 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_18_0 = 0;
        L0: {
          L1: {
            var8 = client.field_A ? 1 : 0;
            var11 = this.field_B;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if ((var11.length ^ -1) > (this.field_C * this.field_zb ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          array$2 = new int[this.field_C * this.field_zb];
          var2 = array$2;
          this.field_B = array$2;
          break L0;
        }
        var3 = param0;
        var4 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (this.field_zb <= var4) {
                break L4;
              } else {
                var5 = (-1 + this.field_C) * this.field_zb + var4;
                stackOut_6_0 = 0;
                stackIn_15_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var8 != 0) {
                  break L3;
                } else {
                  var6 = stackIn_7_0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if ((var6 ^ -1) <= (this.field_C ^ -1)) {
                          break L7;
                        } else {
                          incrementValue$3 = var3;
                          var3++;
                          this.field_B[var5] = this.field_T[incrementValue$3];
                          var5 = var5 - this.field_zb;
                          var6++;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var4++;
                      break L6;
                    }
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var4 = -this.field_o + -this.field_zb + (this.field_C - -this.field_db) >> -1674843007;
            this.field_q = this.field_q + var4;
            var5 = this.field_o + this.field_db + (-this.field_C + this.field_zb) >> -212989087;
            this.field_L = this.field_L + var5;
            var3 = this.field_C;
            this.field_C = this.field_zb;
            this.field_zb = var3;
            this.field_B = this.field_T;
            this.field_T = var2;
            stackOut_14_0 = this.c((byte) -117);
            stackIn_15_0 = stackOut_14_0 ? 1 : 0;
            break L3;
          }
          if (stackIn_15_0 != 0) {
            this.field_T = this.field_B;
            this.field_zb = this.field_C;
            this.field_B = var2;
            this.field_L = this.field_L - var5;
            this.field_q = this.field_q - var4;
            this.field_C = var3;
            return false;
          } else {
            this.field_ab = this.field_ab - 1;
            var3 = this.field_db;
            this.field_db = this.field_o;
            this.field_o = -var3;
            this.d(30968);
            var3 = 0;
            this.h(param0 ^ -1);
            var6 = 0;
            L8: while (true) {
              L9: {
                if (this.field_zb <= var6) {
                  break L9;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_28_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var8 != 0) {
                    return stackIn_28_0 != 0;
                  } else {
                    var7 = stackIn_19_0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var7 >= this.field_C) {
                            break L12;
                          } else {
                            this.field_tb[var3] = 0;
                            this.field_b[var3] = 8 * (-1 + -(var7 * 2) + this.field_db + this.field_C) / this.field_C;
                            var3++;
                            var7++;
                            if (var8 != 0) {
                              break L11;
                            } else {
                              if (var8 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var6++;
                        break L11;
                      }
                      if (var8 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
              return true;
            }
          }
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        if (0 != this.field_C) {
            if (!(this.field_S)) {
                var4 = param2 + -this.field_q;
                var5 = -this.field_L + param0;
                if (-1 >= (var4 ^ -1)) {
                    if (-1 >= (var5 ^ -1)) {
                        if ((this.field_C ^ -1) < (var4 ^ -1)) {
                            if ((var5 ^ -1) <= (this.field_zb ^ -1)) {
                                var4 = 119 / ((45 - param1) / 37);
                                return 0;
                            }
                            var6 = var5 * this.field_C + var4;
                            if (this.field_T[var6] != 0) {
                                return this.field_tb[var6];
                            }
                        }
                    }
                }
            }
        }
        var4 = 119 / ((45 - param1) / 37);
        return 0;
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        var4 = 0;
        var5 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= param1) {
                break L2;
              } else {
                var6 = this.field_w[var5];
                var4 = var4 + var6 % this.field_O;
                var5++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param2 > 49) {
              break L1;
            } else {
              discarded$2 = this.a((byte) -117);
              break L1;
            }
          }
          return 128 + var4 * 256 / (-param0 + param1);
        }
    }

    final int r(int param0) {
        if (param0 != 3837) {
            return -4;
        }
        if (0 > this.field_L) {
            return this.field_L;
        }
        return 0;
    }

    private final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        this.field_L = this.field_L + 1;
        if (this.c((byte) -117)) {
          this.field_L = this.field_L - 1;
          return true;
        } else {
          L0: {
            this.d(30968);
            if (!param1) {
              break L0;
            } else {
              L1: {
                var3 = this.a((byte) 103);
                if (var3 == 1) {
                  break L1;
                } else {
                  ge.a(this.field_lb, this.field_k / 4, (byte) 127, pg.field_d);
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              ge.a(this.field_lb, this.field_k / 8, (byte) 127, client.field_F);
              break L0;
            }
          }
          var3 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if (this.field_zb * this.field_C <= var3) {
                  break L4;
                } else {
                  this.field_tb[var3] = 0;
                  this.field_b[var3] = 8;
                  var3++;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param0 < -27) {
                break L3;
              } else {
                this.a(-71, (byte) 28, false);
                break L3;
              }
            }
            return false;
          }
        }
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_19_0 = 0;
        byte stackOut_21_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_q + this.field_L * this.field_O;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var4 ^ -1) <= (this.field_zb ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackIn_22_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  var5 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if ((this.field_C ^ -1) >= (var5 ^ -1)) {
                          break L5;
                        } else {
                          stackOut_5_0 = this.field_T[var2];
                          stackIn_20_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (stackIn_6_0 != 0) {
                                L7: {
                                  if ((this.field_q - -var5 ^ -1) > -1) {
                                    break L7;
                                  } else {
                                    if ((this.field_O ^ -1) >= (this.field_q + var5 ^ -1)) {
                                      break L7;
                                    } else {
                                      if (this.field_L + var4 < this.field_a) {
                                        if ((var4 + this.field_L ^ -1) > -1) {
                                          break L6;
                                        } else {
                                          if (-1 != (this.field_P[var3] ^ -1)) {
                                            return true;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                                return true;
                              } else {
                                break L6;
                              }
                            }
                            var2++;
                            var3++;
                            var5++;
                            if (var6 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_19_0 = var3 + (this.field_O - this.field_C);
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    }
                    var3 = stackIn_20_0;
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
            stackOut_21_0 = param0;
            stackIn_22_0 = stackOut_21_0;
            break L1;
          }
          if (stackIn_22_0 == -117) {
            return false;
          } else {
            return true;
          }
        }
    }

    final int b(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        if (param1 <= 102) {
            return -33;
        }
        if (this.field_N != null) {
            var5 = -this.field_ob + param0;
            var6 = -this.field_E + param2;
            if ((var5 ^ -1) <= -1) {
                if ((var6 ^ -1) <= -1) {
                    if (var5 < this.field_V) {
                        if (var6 < this.field_h) {
                            var7 = this.field_N[var6 * this.field_V + var5];
                            if (!(-1 == (var7 ^ -1))) {
                                var4 = this.field_mb;
                            }
                        }
                    }
                }
            }
        }
        return var4;
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_58_0 = 0;
        var10 = client.field_A ? 1 : 0;
        var4 = 0;
        var5 = -97 % ((83 - param1) / 37);
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_C * this.field_zb ^ -1) >= (var4 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = -1;
                stackOut_2_1 = this.field_T[var4] ^ -1;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var10 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                      break L3;
                    } else {
                      this.field_qb = this.field_qb + 1;
                      break L3;
                    }
                  }
                  var4++;
                  if (var10 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_Z = param0;
            stackOut_6_0 = this.field_z;
            stackOut_6_1 = this.field_L;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            L5: {
              if (stackIn_7_0 <= stackIn_7_1) {
                break L5;
              } else {
                L6: {
                  this.field_jb = this.field_jb - 1;
                  if (!param2) {
                    break L6;
                  } else {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    break L6;
                  }
                }
                if (this.field_jb > 0) {
                  this.field_E = this.field_L;
                  this.field_V = this.field_C;
                  this.field_ob = this.field_q;
                  this.field_h = this.field_zb;
                  var4 = this.field_V * this.field_h;
                  this.field_N = new int[var4];
                  var5 = var4;
                  var6 = -1 + (this.field_L + this.field_zb);
                  L7: while (true) {
                    stackOut_13_0 = this.field_L;
                    stackOut_13_1 = var6;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (stackIn_14_0 > stackIn_14_1) {
                            break L10;
                          } else {
                            stackOut_15_0 = -1 + (this.field_q - -this.field_C);
                            stackIn_34_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (var10 != 0) {
                              break L9;
                            } else {
                              var7 = stackIn_16_0;
                              L11: while (true) {
                                L12: {
                                  if ((this.field_q ^ -1) < (var7 ^ -1)) {
                                    break L12;
                                  } else {
                                    var5--;
                                    var8 = this.field_T[var5];
                                    stackOut_18_0 = 24 & var8;
                                    stackOut_18_1 = 16;
                                    stackIn_14_0 = stackOut_18_0;
                                    stackIn_14_1 = stackOut_18_1;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    if (var10 != 0) {
                                      continue L8;
                                    } else {
                                      L13: {
                                        L14: {
                                          if (stackIn_19_0 == stackIn_19_1) {
                                            break L14;
                                          } else {
                                            if (24 == (var8 & 24)) {
                                              break L14;
                                            } else {
                                              this.field_N[var5] = var8;
                                              break L13;
                                            }
                                          }
                                        }
                                        L15: {
                                          var9 = var6;
                                          if (var9 >= this.field_z) {
                                            break L15;
                                          } else {
                                            var9 = this.field_z;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if ((this.field_a ^ -1) >= (var9 ^ -1)) {
                                            break L16;
                                          } else {
                                            if (-1 != (this.field_P[var7 + this.field_O * var9] ^ -1)) {
                                              break L16;
                                            } else {
                                              this.field_P[var7 + this.field_O * var9] = 32 + var8;
                                              if (16 != (var8 & 24)) {
                                                break L13;
                                              } else {
                                                if (this.field_rb == null) {
                                                  break L13;
                                                } else {
                                                  fb.field_e = fb.field_e + 25;
                                                  he.field_ab = he.field_ab + 25;
                                                  this.field_x = this.field_x + 25;
                                                  if (var10 == 0) {
                                                    break L13;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_N[var5] = var8;
                                        break L13;
                                      }
                                      var7--;
                                      if (var10 == 0) {
                                        continue L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                var6--;
                                if (var10 == 0) {
                                  continue L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        this.field_mb = 1;
                        stackOut_33_0 = this.field_lb;
                        stackIn_34_0 = stackOut_33_0;
                        break L9;
                      }
                      ge.a(stackIn_34_0, this.field_k / 2, (byte) 127, ul.field_i);
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  this.k(-9897);
                  return;
                }
              }
            }
            var4 = 0;
            var5 = this.field_L * this.field_O + this.field_q;
            var6 = 0;
            var7 = 0;
            L17: while (true) {
              L18: {
                L19: {
                  if ((var7 ^ -1) <= (this.field_zb ^ -1)) {
                    break L19;
                  } else {
                    stackOut_37_0 = 0;
                    stackIn_59_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var10 != 0) {
                      break L18;
                    } else {
                      var8 = stackIn_38_0;
                      L20: while (true) {
                        L21: {
                          L22: {
                            if ((var8 ^ -1) <= (this.field_C ^ -1)) {
                              break L22;
                            } else {
                              var9 = this.field_T[var4];
                              stackOut_40_0 = -1;
                              stackOut_40_1 = var9 ^ -1;
                              stackIn_57_0 = stackOut_40_0;
                              stackIn_57_1 = stackOut_40_1;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              if (var10 != 0) {
                                break L21;
                              } else {
                                L23: {
                                  if (stackIn_41_0 != stackIn_41_1) {
                                    L24: {
                                      L25: {
                                        if ((24 & var9) == 16) {
                                          break L25;
                                        } else {
                                          if ((var7 ^ -1) == -1) {
                                            break L25;
                                          } else {
                                            if (-1 == (this.field_T[-this.field_C + var4] ^ -1)) {
                                              break L25;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                      var9 = var9 | 32;
                                      break L24;
                                    }
                                    L26: {
                                      this.field_P[var5] = var9;
                                      if ((24 & var9) != 16) {
                                        break L26;
                                      } else {
                                        if (this.field_rb != null) {
                                          this.field_x = this.field_x + 25;
                                          fb.field_e = fb.field_e + 25;
                                          he.field_ab = he.field_ab + 25;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    if (8 == (24 & var9)) {
                                      var6++;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  } else {
                                    break L23;
                                  }
                                }
                                var5++;
                                var4++;
                                var8++;
                                if (var10 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          stackOut_56_0 = var5;
                          stackOut_56_1 = this.field_O - this.field_C;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          break L21;
                        }
                        var5 = stackIn_57_0 + stackIn_57_1;
                        var7++;
                        if (var10 == 0) {
                          continue L17;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                }
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L18;
              }
              if (stackIn_59_0 < var6) {
                L27: {
                  var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 4) / 8;
                  if ((var7 ^ -1) >= (this.field_k ^ -1)) {
                    break L27;
                  } else {
                    var7 = this.field_k;
                    break L27;
                  }
                }
                ge.a(this.field_lb, var7, (byte) 127, fh.field_c);
                break L4;
              } else {
                break L4;
              }
            }
          }
          this.field_p = 0;
          this.field_S = true;
          this.field_Bb = false;
          this.field_nb = 0;
          this.field_K = 0;
          this.field_C = 0;
          return;
        }
    }

    final static void a(mm param0, boolean param1, mm param2, int param3) {
        try {
            rk.field_R = param2;
            om.field_a = param3;
            bg.field_g = param0;
            pj.a(31004, hk.field_j / 2, hk.field_i / 2);
            s.a(param2.field_C, param0.field_K + param0.field_C, (byte) -91, param0.field_C, param2.field_C + param2.field_K);
            if (!param1) {
                field_i = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "lk.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= param0) {
                break L2;
              } else {
                var6 = this.field_w[var5];
                stackOut_2_0 = var6 ^ -1;
                stackOut_2_1 = this.field_O ^ -1;
                stackIn_11_0 = stackOut_2_0;
                stackIn_11_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                      var3 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((this.field_O * (this.field_a - 1) ^ -1) >= (var6 ^ -1)) {
                      var4 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = param1;
            stackOut_10_1 = -1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L1;
          }
          if (stackIn_11_0 == stackIn_11_1) {
            L5: {
              L6: {
                if (var3 == 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    break L6;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L5;
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L5;
            }
            return stackIn_17_0 != 0;
          } else {
            return true;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        boolean stackOut_4_0 = false;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0 == 30000) {
            break L0;
          } else {
            this.field_O = -79;
            break L0;
          }
        }
        this.field_e = param1;
        L1: while (true) {
          L2: {
            L3: {
              if ((param1 ^ -1) != -1) {
                break L3;
              } else {
                stackOut_4_0 = this.field_y;
                stackIn_14_0 = stackOut_4_0 ? 1 : 0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0) {
                      break L4;
                    } else {
                      L5: {
                        stackOut_6_0 = this;
                        stackOut_6_1 = -126;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (0 != param2) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          break L5;
                        } else {
                          stackOut_7_0 = this;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          break L5;
                        }
                      }
                      L6: {
                        if (this.a((byte) stackIn_9_1, stackIn_9_2 != 0)) {
                          break L6;
                        } else {
                          param2++;
                          param1 = this.field_g;
                          this.field_e = this.field_g;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_e = 20;
                      this.field_y = true;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_Bb = true;
                  break L3;
                }
              }
            }
            stackOut_13_0 = this.field_g ^ -1;
            stackIn_14_0 = stackOut_13_0;
            break L2;
          }
          L7: {
            if (stackIn_14_0 != -1) {
              break L7;
            } else {
              if (-1 > (param2 ^ -1)) {
                L8: {
                  var4 = ((int)((double)this.field_k * Math.sqrt((double)(this.field_a - -param2) / ((double)this.field_a * 2.0))) + 4) / 8;
                  if (var4 > this.field_k) {
                    var4 = this.field_k;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ge.a(this.field_lb, var4, (byte) 127, fh.field_c);
                break L7;
              } else {
                break L7;
              }
            }
          }
          return;
        }
    }

    final boolean e(int param0) {
        int var2 = -106 % ((param0 - -22) / 51);
        if (this.field_t > 0) {
            if (!(-1 != (this.field_X[0].field_l ^ -1))) {
                return true;
            }
        }
        if (this.field_pb >= 18) {
            return true;
        }
        return false;
    }

    private final boolean a(int param0, int param1) {
        int discarded$2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        var11 = client.field_A ? 1 : 0;
        if (4 == param1) {
          L0: {
            if (param0 < -45) {
              break L0;
            } else {
              discarded$2 = this.a(-31, -66, (byte) 71, -102);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              if ((var3 ^ -1) <= -5) {
                break L2;
              } else {
                L3: {
                  var4 = this.field_w[var3];
                  var5 = var4 % this.field_O;
                  var6 = var4 / this.field_O;
                  stackOut_6_0 = 0;
                  stackIn_26_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var11 != 0) {
                    break L3;
                  } else {
                    var7 = stackIn_7_0;
                    L4: while (true) {
                      L5: {
                        if (4 <= var7) {
                          break L5;
                        } else {
                          stackOut_9_0 = var3 ^ -1;
                          stackIn_26_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_10_0 != (var7 ^ -1)) {
                                  break L7;
                                } else {
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                var8 = this.field_w[var7];
                                var9 = var8 % this.field_O;
                                var10 = var8 / this.field_O;
                                var9 = var9 - var5;
                                var10 = var10 - var6;
                                if (0 != var9) {
                                  break L8;
                                } else {
                                  if (var10 == -1) {
                                    break L6;
                                  } else {
                                    if (var10 != 1) {
                                      break L8;
                                    } else {
                                      if (var11 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (0 != var10) {
                                  break L9;
                                } else {
                                  if (var9 == -1) {
                                    break L6;
                                  } else {
                                    if (-2 != (var9 ^ -1)) {
                                      break L9;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var3++;
                              if (var11 == 0) {
                                continue L1;
                              } else {
                                break L2;
                              }
                            }
                            var7++;
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                }
                return stackIn_26_0 != 0;
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(lk param0, oi param1, int param2, int param3, int param4) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        rf var20 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                break L1;
              } else {
                if (param1 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6_int = -1 + this.field_O;
            var7 = -1 + this.field_a;
            var8 = param3;
            var9 = 0;
            var10 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param4 <= var10) {
                    break L4;
                  } else {
                    var11 = this.field_w[var10];
                    var12 = var11 % this.field_O;
                    var13 = var11 / this.field_O;
                    stackOut_7_0 = var12;
                    stackOut_7_1 = var6_int;
                    stackIn_21_0 = stackOut_7_0;
                    stackIn_21_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_8_0 < stackIn_8_1) {
                          var6_int = var12;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if ((var12 ^ -1) < (var8 ^ -1)) {
                          var8 = var12;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var9 >= var13) {
                          break L7;
                        } else {
                          var9 = var13;
                          break L7;
                        }
                      }
                      L8: {
                        if (var13 < var7) {
                          var7 = var13;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var10++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var10 = -var6_int + 1 + var8;
                var11 = var9 - -1 - var7;
                stackOut_20_0 = var10;
                stackOut_20_1 = var11;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L3;
              }
              L9: {
                var12 = stackIn_21_0 * stackIn_21_1;
                fieldTemp$2 = this.field_fb;
                this.field_fb = this.field_fb + 1;
                var13 = fieldTemp$2;
                var14 = null;
                if (param1 == null) {
                  break L9;
                } else {
                  var14 = param1.a(false, var13);
                  break L9;
                }
              }
              L10: {
                if (var14 != null) {
                  break L10;
                } else {
                  var20 = new rf(var13);
                  var14 = var20;
                  fieldTemp$3 = this.field_p;
                  this.field_p = this.field_p + 1;
                  var20.field_m = fieldTemp$3;
                  if (param1 != null) {
                    param1.a(var20, 0);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              ((rf) (var14)).field_b = var10;
              ((rf) (var14)).field_c = new byte[var12];
              ((rf) (var14)).field_n = var11;
              var15 = 0;
              L11: while (true) {
                L12: {
                  L13: {
                    if ((var15 ^ -1) <= (var12 ^ -1)) {
                      break L13;
                    } else {
                      ((rf) (var14)).field_c[var15] = (byte) 0;
                      var15++;
                      if (var19 != 0) {
                        break L12;
                      } else {
                        if (var19 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  var15 = 0;
                  break L12;
                }
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        if (var15 >= param4) {
                          break L17;
                        } else {
                          var16 = this.field_w[var15];
                          var17 = -var6_int + var16 % this.field_O;
                          var18 = var16 / this.field_O - var7;
                          ((rf) (var14)).field_c[var17 + var18 * var10] = (byte)param2;
                          var15++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      if (param0 == null) {
                        break L16;
                      } else {
                        param0.a((rf) (var14), (byte) -128);
                        break L15;
                      }
                    }
                    break L15;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var6 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var6);
            stackOut_41_1 = new StringBuilder().append("lk.T(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L18;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L18;
            }
          }
          L19: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L19;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L19;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int discarded$2 = 0;
        L0: {
          if (param1 == 2113050941) {
            break L0;
          } else {
            discarded$2 = this.a(80, 86, (byte) -26, -11);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2) {
              break L2;
            } else {
              this.field_g = mn.field_b[param0];
              if (!client.field_A) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_g = pn.field_eb[param0];
          break L1;
        }
    }

    private final void c(boolean param0) {
        boolean discarded$0 = false;
        if (!(!this.t(0))) {
            return;
        }
        if (param0) {
            discarded$0 = this.c(61, 75);
        }
        if (!(-1 == ((this.field_db | this.field_o) ^ -1))) {
            this.field_db = -this.field_db;
            this.field_o = -this.field_o;
            if (!(!this.t(0))) {
                return;
            }
            this.field_db = -this.field_db;
            this.field_o = -this.field_o;
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int incrementValue$4 = 0;
        int discarded$5 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = this.field_P[param1];
            if ((param3 ^ -1) == (-1879048193 & var5 ^ -1)) {
              break L1;
            } else {
              this.b(7 & param3, param1, false);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-1879048193 >= (var5 & 1879048192 ^ -1)) {
              break L2;
            } else {
              var5 = var5 + 268435456;
              break L2;
            }
          }
          incrementValue$4 = param0;
          param0++;
          this.field_w[incrementValue$4] = param1;
          this.field_P[param1] = var5 + -2147483648;
          break L0;
        }
        L3: {
          if (param2 == -44) {
            break L3;
          } else {
            discarded$5 = this.a(true, 26, -7, (lk) null, true, 84, -39, 24, (oi) null, false, (byte) -94);
            break L3;
          }
        }
        return param0;
    }

    private final void j(int param0) {
        L0: {
          L1: {
            this.field_q = this.field_q + 1;
            if (this.c((byte) -117)) {
              break L1;
            } else {
              this.h(-1);
              ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_q = this.field_q - 1;
          break L0;
        }
        L2: {
          if (param0 == 4) {
            break L2;
          } else {
            this.field_mb = -42;
            break L2;
          }
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var4 = 0;
          var5 = param2;
          if (param0) {
            break L0;
          } else {
            this.field_N = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if ((var5 ^ -1) <= (param1 ^ -1)) {
                break L3;
              } else {
                var6 = this.field_w[var5];
                var7 = var6 / this.field_O;
                stackOut_3_0 = gg.field_B ^ -1;
                stackOut_3_1 = var7 ^ -1;
                stackIn_10_0 = stackOut_3_0;
                stackIn_10_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (var8 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_4_0 >= stackIn_4_1) {
                      break L4;
                    } else {
                      gg.field_B = var7;
                      break L4;
                    }
                  }
                  L5: {
                    if (gi.field_a >= var7) {
                      break L5;
                    } else {
                      gi.field_a = var7;
                      break L5;
                    }
                  }
                  var4 = var4 + var7;
                  var5++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_9_0 = 128;
            stackOut_9_1 = -(var4 * 256 / (param1 + -param2));
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L2;
          }
          return stackIn_10_0 - stackIn_10_1;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            this.field_A = -70;
        }
        return this.field_j + (this.field_ub + this.field_hb) + (this.field_H + this.field_x) - (-this.field_bb - this.field_f);
    }

    final int m(int param0) {
        int var2 = 0;
        if (1 <= this.field_c) {
            var2++;
        }
        int var3 = this.field_u.a(79, var2 + this.field_d);
        int var4 = this.field_u.a(107, this.field_d - -var2);
        if (param0 != 26580) {
            return -69;
        }
        if (this.field_d == var3) {
            var3 = 7;
        }
        if (this.field_d == var4) {
            var4 = 7;
        }
        return var4 + (var3 << -793988540);
    }

    final void s(int param0) {
        rf discarded$2 = null;
        bh discarded$3 = null;
        int var2 = 0;
        int var3 = 0;
        rf var4_ref_rf = null;
        int var4 = 0;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ei var11 = null;
        ei var13 = null;
        int[] var16 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_126_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        L0: {
          L1: {
            L2: {
              var10 = client.field_A ? 1 : 0;
              if (this.field_S) {
                break L2;
              } else {
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  stackOut_2_0 = this.field_zb ^ -1;
                  stackOut_2_1 = var3 ^ -1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (stackIn_3_0 >= stackIn_3_1) {
                          break L6;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_17_0 = stackOut_4_0;
                          stackIn_5_0 = stackOut_4_0;
                          if (var10 != 0) {
                            break L5;
                          } else {
                            var4 = stackIn_5_0;
                            L7: while (true) {
                              L8: {
                                if (this.field_C <= var4) {
                                  break L8;
                                } else {
                                  var5_int = this.field_tb[var2];
                                  var6 = this.field_b[var2];
                                  stackOut_7_0 = var5_int ^ -1;
                                  stackOut_7_1 = -1;
                                  stackIn_3_0 = stackOut_7_0;
                                  stackIn_3_1 = stackOut_7_1;
                                  stackIn_8_0 = stackOut_7_0;
                                  stackIn_8_1 = stackOut_7_1;
                                  if (var10 != 0) {
                                    continue L4;
                                  } else {
                                    L9: {
                                      L10: {
                                        if (stackIn_8_0 > stackIn_8_1) {
                                          break L10;
                                        } else {
                                          var6 = var6 + (-var5_int >> 1589558273);
                                          if (var10 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var6 = var6 - (var5_int >> -2057940319);
                                      break L9;
                                    }
                                    L11: {
                                      L12: {
                                        var5_int = var5_int + var6;
                                        if (0 <= var5_int) {
                                          break L12;
                                        } else {
                                          var5_int = var5_int - (var5_int >> -1962291932);
                                          if (var10 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var5_int = var5_int + (-var5_int >> 521635204);
                                      break L11;
                                    }
                                    this.field_tb[var2] = var5_int;
                                    this.field_b[var2] = var6;
                                    var2++;
                                    var4++;
                                    if (var10 == 0) {
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var3++;
                              if (var10 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    }
                    var3 = stackIn_17_0;
                    L13: while (true) {
                      stackOut_18_0 = var3 ^ -1;
                      stackIn_19_0 = stackOut_18_0;
                      L14: while (true) {
                        if (stackIn_19_0 <= (this.field_C ^ -1)) {
                          break L2;
                        } else {
                          var4 = -1073741824;
                          stackOut_20_0 = 0;
                          stackIn_78_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var10 != 0) {
                            break L1;
                          } else {
                            var5_int = stackIn_21_0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  if ((var5_int ^ -1) <= (this.field_zb ^ -1)) {
                                    break L17;
                                  } else {
                                    var2 = var3 + var5_int * this.field_C;
                                    var6 = this.field_q + var3;
                                    stackOut_23_0 = var6 ^ -1;
                                    stackOut_23_1 = -1;
                                    stackIn_48_0 = stackOut_23_0;
                                    stackIn_48_1 = stackOut_23_1;
                                    stackIn_24_0 = stackOut_23_0;
                                    stackIn_24_1 = stackOut_23_1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      L18: {
                                        L19: {
                                          if (stackIn_24_0 > stackIn_24_1) {
                                            break L19;
                                          } else {
                                            if ((this.field_O ^ -1) < (var6 ^ -1)) {
                                              var7 = this.field_L - (-var5_int + 1);
                                              var8 = 0;
                                              L20: while (true) {
                                                if (-1 < (var7 ^ -1)) {
                                                  break L19;
                                                } else {
                                                  stackOut_29_0 = var4;
                                                  stackOut_29_1 = var8;
                                                  stackIn_38_0 = stackOut_29_0;
                                                  stackIn_38_1 = stackOut_29_1;
                                                  stackIn_30_0 = stackOut_29_0;
                                                  stackIn_30_1 = stackOut_29_1;
                                                  if (var10 != 0) {
                                                    break L18;
                                                  } else {
                                                    if (stackIn_30_0 >= stackIn_30_1) {
                                                      break L19;
                                                    } else {
                                                      L21: {
                                                        if (var7 >= this.field_a) {
                                                          break L21;
                                                        } else {
                                                          if (0 != this.field_P[var6 + var7 * this.field_O]) {
                                                            var4 = var8;
                                                            if (var10 == 0) {
                                                              break L19;
                                                            } else {
                                                              break L21;
                                                            }
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      var7--;
                                                      var8 -= 80;
                                                      if (var10 == 0) {
                                                        continue L20;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        var7 = this.field_tb[var2];
                                        var8 = this.field_b[var2];
                                        stackOut_37_0 = var7 ^ -1;
                                        stackOut_37_1 = var4 ^ -1;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackIn_38_1 = stackOut_37_1;
                                        break L18;
                                      }
                                      L22: {
                                        if (stackIn_38_0 > stackIn_38_1) {
                                          var7 = var4;
                                          if (0 > var8) {
                                            var8 = -var8;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        this.field_tb[var2] = var7;
                                        this.field_b[var2] = var8;
                                        var4 -= 80;
                                        if (-1 == (this.field_T[var2] ^ -1)) {
                                          break L23;
                                        } else {
                                          if ((var4 ^ -1) <= (var7 ^ -1)) {
                                            break L23;
                                          } else {
                                            var4 = var7;
                                            break L23;
                                          }
                                        }
                                      }
                                      var5_int++;
                                      if (var10 == 0) {
                                        continue L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var5_int = 1073741823;
                                stackOut_47_0 = -1;
                                stackOut_47_1 = this.field_zb;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                break L16;
                              }
                              var6 = stackIn_48_0 + stackIn_48_1;
                              L24: while (true) {
                                L25: {
                                  if (0 > var6) {
                                    break L25;
                                  } else {
                                    var2 = this.field_C * var6 - -var3;
                                    var7 = var3 + this.field_q;
                                    stackOut_50_0 = var7;
                                    stackIn_19_0 = stackOut_50_0;
                                    stackIn_51_0 = stackOut_50_0;
                                    if (var10 != 0) {
                                      continue L14;
                                    } else {
                                      L26: {
                                        L27: {
                                          if (stackIn_51_0 < 0) {
                                            break L27;
                                          } else {
                                            if ((this.field_O ^ -1) < (var7 ^ -1)) {
                                              var8 = this.field_L - -var6 - -1;
                                              var9 = 0;
                                              L28: while (true) {
                                                if ((var5_int ^ -1) >= (var9 ^ -1)) {
                                                  break L27;
                                                } else {
                                                  stackOut_56_0 = var8 ^ -1;
                                                  stackOut_56_1 = this.field_a ^ -1;
                                                  stackIn_65_0 = stackOut_56_0;
                                                  stackIn_65_1 = stackOut_56_1;
                                                  stackIn_57_0 = stackOut_56_0;
                                                  stackIn_57_1 = stackOut_56_1;
                                                  if (var10 != 0) {
                                                    break L26;
                                                  } else {
                                                    L29: {
                                                      L30: {
                                                        if (stackIn_57_0 <= stackIn_57_1) {
                                                          break L30;
                                                        } else {
                                                          if (-1 < (var8 ^ -1)) {
                                                            break L29;
                                                          } else {
                                                            if (this.field_P[var7 + this.field_O * var8] != 0) {
                                                              break L30;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var5_int = var9;
                                                      if (var10 == 0) {
                                                        break L27;
                                                      } else {
                                                        break L29;
                                                      }
                                                    }
                                                    var9 += 80;
                                                    var8++;
                                                    if (var10 == 0) {
                                                      continue L28;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        var8 = this.field_tb[var2];
                                        var9 = this.field_b[var2];
                                        stackOut_64_0 = var8 ^ -1;
                                        stackOut_64_1 = var5_int ^ -1;
                                        stackIn_65_0 = stackOut_64_0;
                                        stackIn_65_1 = stackOut_64_1;
                                        break L26;
                                      }
                                      L31: {
                                        if (stackIn_65_0 < stackIn_65_1) {
                                          L32: {
                                            if (-1 <= (var9 ^ -1)) {
                                              break L32;
                                            } else {
                                              var9 = -var9;
                                              break L32;
                                            }
                                          }
                                          var8 = var5_int;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L33: {
                                        this.field_tb[var2] = var8;
                                        this.field_b[var2] = var9;
                                        var5_int += 80;
                                        if ((this.field_T[var2] ^ -1) == -1) {
                                          break L33;
                                        } else {
                                          if (var5_int <= var8) {
                                            break L33;
                                          } else {
                                            var5_int = var8;
                                            break L33;
                                          }
                                        }
                                      }
                                      var6--;
                                      if (var10 == 0) {
                                        continue L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                var3++;
                                if (var10 == 0) {
                                  continue L13;
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
                }
              }
            }
            if (this.field_vb != null) {
              this.field_R = this.field_R + 1;
              stackOut_77_0 = 100;
              stackIn_78_0 = stackOut_77_0;
              break L1;
            } else {
              break L0;
            }
          }
          if (stackIn_78_0 > this.field_R) {
            break L0;
          } else {
            this.field_vb = null;
            break L0;
          }
        }
        var2 = 1;
        var3 = 0;
        L34: while (true) {
          L35: {
            L36: {
              if ((this.field_t ^ -1) >= (var3 ^ -1)) {
                break L36;
              } else {
                var4_ref_rf = this.field_X[var3];
                if (var10 != 0) {
                  break L35;
                } else {
                  L37: {
                    if (null != var4_ref_rf.field_c) {
                      break L37;
                    } else {
                      if (var4_ref_rf.field_l <= 18) {
                        var2 = 0;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: {
                    if (var2 == 0) {
                      break L38;
                    } else {
                      if (0 >= var4_ref_rf.field_l) {
                        break L38;
                      } else {
                        L39: {
                          if (18 != var4_ref_rf.field_l) {
                            break L39;
                          } else {
                            this.b(false);
                            break L39;
                          }
                        }
                        var4_ref_rf.field_l = var4_ref_rf.field_l - 1;
                        var5_int = var4_ref_rf.field_m - -1;
                        if (var4_ref_rf.field_l != 12) {
                          break L38;
                        } else {
                          if (-6 >= (var5_int ^ -1)) {
                            L40: {
                              this.field_vb = cm.a((byte) 105, uj.field_b, new String[]{Integer.toString(var5_int)});
                              this.field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
                              this.field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
                              this.field_R = 0;
                              var16 = vl.field_G;
                              var7 = var5_int / 10;
                              if ((var16.length ^ -1) >= (var7 ^ -1)) {
                                var7 = var16.length + -1;
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            this.field_xb = var16[var7];
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                  }
                  L41: {
                    if ((var4_ref_rf.field_e ^ -1) >= -1) {
                      break L41;
                    } else {
                      var4_ref_rf.field_e = var4_ref_rf.field_e + 1;
                      break L41;
                    }
                  }
                  var3++;
                  if (var10 == 0) {
                    continue L34;
                  } else {
                    break L36;
                  }
                }
              }
            }
            if (param0 == -21142) {
              break L35;
            } else {
              this.h(13);
              break L35;
            }
          }
          L42: {
            if (!this.e(-124)) {
              stackOut_105_0 = 0;
              stackIn_106_0 = stackOut_105_0;
              break L42;
            } else {
              stackOut_104_0 = 1;
              stackIn_106_0 = stackOut_104_0;
              break L42;
            }
          }
          var3 = stackIn_106_0;
          L43: while (true) {
            L44: {
              L45: {
                L46: {
                  if (this.field_t <= 0) {
                    break L46;
                  } else {
                    stackOut_108_0 = -14;
                    stackOut_108_1 = this.field_X[0].field_e ^ -1;
                    stackIn_115_0 = stackOut_108_0;
                    stackIn_115_1 = stackOut_108_1;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    if (var10 != 0) {
                      break L45;
                    } else {
                      if (stackIn_109_0 < stackIn_109_1) {
                        break L46;
                      } else {
                        discarded$2 = this.p(127);
                        if (var10 == 0) {
                          continue L43;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                }
                if (this.field_cb == null) {
                  break L44;
                } else {
                  if (this.field_cb.c((byte) 70) == null) {
                    break L44;
                  } else {
                    stackOut_114_0 = -1;
                    stackOut_114_1 = this.field_pb ^ -1;
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    break L45;
                  }
                }
              }
              L47: {
                if (stackIn_115_0 == stackIn_115_1) {
                  this.b(false);
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (-323 != (this.field_pb ^ -1)) {
                  break L48;
                } else {
                  this.c(0);
                  break L48;
                }
              }
              this.field_pb = this.field_pb + 1;
              if (335 == this.field_pb) {
                this.field_pb = 0;
                discarded$3 = this.field_cb.a(param0 + 21146);
                break L44;
              } else {
                break L44;
              }
            }
            L49: {
              if (!this.e(param0 ^ 21190)) {
                stackOut_125_0 = 0;
                stackIn_126_0 = stackOut_125_0;
                break L49;
              } else {
                stackOut_124_0 = 1;
                stackIn_126_0 = stackOut_124_0;
                break L49;
              }
            }
            L50: {
              var4 = stackIn_126_0;
              if (var2 == 0) {
                break L50;
              } else {
                if (18 >= this.field_wb) {
                  break L50;
                } else {
                  this.field_wb = this.field_wb - 1;
                  break L50;
                }
              }
            }
            L51: {
              if (var3 == 0) {
                break L51;
              } else {
                if (var4 != 0) {
                  break L51;
                } else {
                  ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
                  break L51;
                }
              }
            }
            L52: {
              if (var4 != 0) {
                L53: {
                  ah.field_b[this.field_Q] = true;
                  var5 = ik.field_c[this.field_Q];
                  if (var5 == null) {
                    break L53;
                  } else {
                    var5.b(en.field_o / 50, pb.field_d * this.field_J, this.field_sb << -2127177498);
                    if (var10 == 0) {
                      break L52;
                    } else {
                      break L53;
                    }
                  }
                }
                var6 = 100 + rd.a((byte) 16, 4, this.field_Q);
                var11 = ei.c(kf.field_P, var6, pb.field_d * this.field_J, this.field_sb << 1719062758);
                var13 = var11;
                var13.f(-1);
                dg.field_c.a(var11);
                ik.field_c[this.field_Q] = var11;
                break L52;
              } else {
                break L52;
              }
            }
            return;
          }
        }
    }

    lk(boolean param0, int param1, int param2, int param3, int param4) {
        L0: {
          L1: {
            this.field_k = 128;
            this.field_r = false;
            this.field_j = 0;
            this.field_wb = 18;
            this.field_U = -1;
            this.field_K = 0;
            this.field_vb = null;
            this.field_X = new rf[1];
            this.field_sb = 48;
            this.field_G = 0;
            this.field_lb = 128;
            this.field_Y = false;
            this.field_R = 0;
            this.field_S = false;
            this.field_x = 0;
            this.field_f = 0;
            this.field_l = 0;
            this.field_ib = 0;
            this.field_u = null;
            this.field_Q = -1;
            this.field_v = false;
            this.field_J = 128;
            this.field_hb = 0;
            this.field_ub = 0;
            this.field_s = false;
            this.field_Bb = false;
            this.field_bb = 0;
            this.field_H = 0;
            this.field_jb = 3;
            this.field_pb = 0;
            if (!param0) {
              break L1;
            } else {
              this.field_O = 12;
              this.field_a = 27;
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_a = 18;
          this.field_O = 8;
          break L0;
        }
        this.field_d = param3;
        this.field_w = new int[this.field_O * this.field_a];
        this.field_D = param2;
        this.field_c = param4;
        this.field_P = new int[this.field_O * this.field_a];
        this.a(param1, 2113050941, false);
        this.field_t = 0;
        this.field_m = 0;
    }

    static {
        field_I = 3;
        field_i = "There are no valid types of game that match your preferences.";
    }
}
