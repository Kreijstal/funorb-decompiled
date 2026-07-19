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
          if (var4 >= var3) {
            return var2;
          } else {
            var5 = this.field_T[var4];
            if ((var5 & 24) == 24) {
              var5 = var5 & 7;
              if (var5 > var2) {
                var2 = var5;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final boolean q(int param0) {
        int[] array$4 = null;
        int incrementValue$5 = 0;
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
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          L1: {
            var8 = client.field_A ? 1 : 0;
            var13 = this.field_B;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if (var13.length >= this.field_C * this.field_zb) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          array$4 = new int[this.field_C * this.field_zb];
          var2 = array$4;
          this.field_B = array$4;
          break L0;
        }
        var3 = 0;
        var4 = 0;
        L2: while (true) {
          if (var4 >= this.field_zb) {
            var4 = this.field_db + -this.field_zb + this.field_C - -this.field_o >> 1;
            var5 = this.field_o + (this.field_zb + (-this.field_C - this.field_db)) >> 1;
            this.field_q = this.field_q + var4;
            var3 = this.field_C;
            this.field_L = this.field_L + var5;
            this.field_C = this.field_zb;
            this.field_B = this.field_T;
            this.field_zb = var3;
            this.field_T = var2;
            if (this.c((byte) -117)) {
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
              L3: while (true) {
                if (var6 >= this.field_zb) {
                  ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
                  return true;
                } else {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= this.field_C) {
                      var6++;
                      continue L3;
                    } else {
                      this.field_tb[var3] = 0;
                      this.field_b[var3] = (-1 + (this.field_C + this.field_db - var7 * 2)) * -8 / this.field_C;
                      var3++;
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var5 = -var4 + (-1 + this.field_zb);
            var6 = 0;
            L5: while (true) {
              if (this.field_C <= var6) {
                var4++;
                continue L2;
              } else {
                incrementValue$5 = var3;
                var3++;
                this.field_B[var5] = this.field_T[incrementValue$5];
                var5 = var5 + this.field_zb;
                var6++;
                continue L5;
              }
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
        var9 = client.field_A ? 1 : 0;
        if (param0 <= -88) {
          var4 = 0;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (this.field_a * this.field_O <= var6) {
              L1: {
                if (param1) {
                  L2: {
                    var6 = ((int)((double)this.field_k * Math.sqrt((double)(var4 + (16 - -var5)))) + 8) / 16;
                    if (this.field_k >= var6) {
                      break L2;
                    } else {
                      var6 = this.field_k;
                      break L2;
                    }
                  }
                  ge.a(this.field_lb, var6, (byte) 127, ee.field_g);
                  break L1;
                } else {
                  L3: {
                    if (var4 <= 0) {
                      break L3;
                    } else {
                      L4: {
                        var6 = ((int)((double)this.field_k * Math.sqrt((double)var4)) - -1) / 2;
                        if (this.field_k >= var6) {
                          break L4;
                        } else {
                          var6 = this.field_k;
                          break L4;
                        }
                      }
                      ge.a(this.field_lb, var6, (byte) 127, wd.field_c);
                      break L3;
                    }
                  }
                  if (0 < var5) {
                    L5: {
                      var6 = (2 + (int)((double)this.field_k * Math.sqrt((double)var5))) / 4;
                      if (var6 <= this.field_k) {
                        break L5;
                      } else {
                        var6 = this.field_k;
                        break L5;
                      }
                    }
                    ge.a(this.field_lb, var6, (byte) 127, sa.field_w);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              var7 = this.field_P[var6];
              if ((1879048192 & var7) == 0) {
                this.field_P[var6] = lb.a(2147483647, var7);
                var6++;
                continue L0;
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
                    if (var8 <= mk.field_e) {
                      break L8;
                    } else {
                      mk.field_e = var8;
                      break L8;
                    }
                  }
                }
                L9: {
                  this.field_ib = param2;
                  if ((-1879048193 & var7) != 23) {
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
                if (param1) {
                  this.field_P[var6] = 56;
                  var6++;
                  continue L0;
                } else {
                  this.field_P[var6] = de.b(32, lb.a(var7, 268435455));
                  var6++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        return 80 + this.field_g * this.field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4 = 0;
        if (param0 >= 0) {
            if (param2 >= 0) {
                if (~param0 > ~this.field_O) {
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
                if (var6 >= 0) {
                    if (var7 >= 0) {
                        if (this.field_C > var6) {
                            if (this.field_zb > var7) {
                                var8 = this.field_T[var7 * this.field_C + var6];
                                if (!(var8 == 0)) {
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
        th.a(16777215, 14, param6, 15, param10, param11, true, 16777215, 0, 13, 11, (byte) 103, param5, param8);
    }

    private final void h(int param0) {
        if (param0 != -1) {
            return;
        }
        if (!this.field_y) {
        } else {
            if (!this.a((byte) -93, true)) {
                this.field_y = false;
                this.c(30000, this.field_g, 1);
            } else {
                this.field_e = 20;
            }
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
        int stackIn_13_0 = 0;
        Object stackIn_76_0 = null;
        lk stackIn_76_1 = null;
        oi stackIn_76_2 = null;
        int stackIn_76_3 = 0;
        int stackIn_76_4 = 0;
        Object stackIn_77_0 = null;
        lk stackIn_77_1 = null;
        oi stackIn_77_2 = null;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        Object stackIn_78_0 = null;
        lk stackIn_78_1 = null;
        oi stackIn_78_2 = null;
        int stackIn_78_3 = 0;
        int stackIn_78_4 = 0;
        int stackIn_78_5 = 0;
        int stackIn_89_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_75_0 = null;
        lk stackOut_75_1 = null;
        oi stackOut_75_2 = null;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        Object stackOut_77_0 = null;
        lk stackOut_77_1 = null;
        oi stackOut_77_2 = null;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        Object stackOut_76_0 = null;
        lk stackOut_76_1 = null;
        oi stackOut_76_2 = null;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        int stackOut_88_0 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            var12_int = this.field_P[param6];
            if ((var12_int & -1879048193) >> 3 != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var13 = 0;
                if (param5 >= 0) {
                  break L1;
                } else {
                  if ((var12_int & -1879048193) == -24) {
                    L2: {
                      if (-2 != param5) {
                        break L2;
                      } else {
                        var14 = 0;
                        L3: while (true) {
                          if (-8 <= var14) {
                            break L2;
                          } else {
                            var13 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
                            var14++;
                            continue L3;
                          }
                        }
                      }
                    }
                    stackOut_12_0 = var13;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (this.field_v) {
                  param7 = 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var14 = 0;
                this.field_w[0] = param6;
                var15 = 1;
                this.field_P[param6] = de.b(-2147483648, var12_int);
                var16 = 0;
                if (param5 < 0) {
                  break L5;
                } else {
                  var16 = 1;
                  var12_int = (-1879048200 & var12_int) + param5;
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (param0) {
                    L8: {
                      if (param9) {
                        var17 = 24 ^ var12_int;
                        break L8;
                      } else {
                        var17 = 23;
                        break L8;
                      }
                    }
                    L9: while (true) {
                      if (var14 >= var15) {
                        var17 = -119 / ((param10 - 7) / 60);
                        if (var16 != 0) {
                          break L6;
                        } else {
                          if (var15 < param2) {
                            break L6;
                          } else {
                            var12_int = 8 | var12_int & 7;
                            var14 = 0;
                            var18 = 0;
                            L10: while (true) {
                              if (var18 >= var15) {
                                break L7;
                              } else {
                                L11: {
                                  var19 = this.field_w[var18];
                                  var20 = this.field_P[var19];
                                  if (1879048192 <= (1879048192 & var20)) {
                                    break L11;
                                  } else {
                                    this.field_P[var19] = var20 - -268435456;
                                    break L11;
                                  }
                                }
                                var18++;
                                continue L10;
                              }
                            }
                          }
                        }
                      } else {
                        L12: {
                          incrementValue$2 = var14;
                          var14++;
                          var18 = this.field_w[incrementValue$2];
                          if (var16 == 0) {
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
                          if (var18 >= this.field_O) {
                            var15 = this.a(-this.field_O + var18, 126, var17, var15, var12_int);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if ((-1 + this.field_a) * this.field_O > var18) {
                          var15 = this.a(var18 - -this.field_O, 125, var17, var15, var12_int);
                          continue L9;
                        } else {
                          continue L9;
                        }
                      }
                    }
                  } else {
                    var17 = -119 / ((param10 - 7) / 60);
                    if (var16 != 0) {
                      break L6;
                    } else {
                      if (var15 < param2) {
                        break L6;
                      } else {
                        var12_int = 8 | var12_int & 7;
                        var14 = 0;
                        var18 = 0;
                        L16: while (true) {
                          if (var18 >= var15) {
                            break L7;
                          } else {
                            L17: {
                              var19 = this.field_w[var18];
                              var20 = this.field_P[var19];
                              if (1879048192 <= (1879048192 & var20)) {
                                break L17;
                              } else {
                                this.field_P[var19] = var20 - -268435456;
                                break L17;
                              }
                            }
                            var18++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
                L18: {
                  var18 = var15;
                  if (!param4) {
                    break L18;
                  } else {
                    L19: while (true) {
                      if (var15 <= var14) {
                        break L18;
                      } else {
                        L20: {
                          incrementValue$3 = var14;
                          var14++;
                          var19 = this.field_w[incrementValue$3];
                          if (var19 % this.field_O <= 0) {
                            break L20;
                          } else {
                            var15 = this.a(var15, var19 + -1, (byte) -44, var12_int);
                            break L20;
                          }
                        }
                        L21: {
                          if (var19 % this.field_O >= -1 + this.field_O) {
                            break L21;
                          } else {
                            var15 = this.a(var15, var19 - -1, (byte) -44, var12_int);
                            break L21;
                          }
                        }
                        L22: {
                          if (this.field_O <= var19) {
                            var15 = this.a(var15, -this.field_O + var19, (byte) -44, var12_int);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var19 >= (this.field_a + -1) * this.field_O) {
                          continue L19;
                        } else {
                          var15 = this.a(var15, this.field_O + var19, (byte) -44, var12_int);
                          continue L19;
                        }
                      }
                    }
                  }
                }
                L23: {
                  if (param9) {
                    break L23;
                  } else {
                    if (null == this.field_rb) {
                      break L23;
                    } else {
                      L24: {
                        if (param7 != 3) {
                          break L24;
                        } else {
                          if (null == this.field_rb) {
                            break L24;
                          } else {
                            var19 = gg.b(var15, 27935);
                            var20 = var19;
                            he.field_ab = he.field_ab + var20;
                            fb.field_e = fb.field_e + var20;
                            this.field_hb = this.field_hb + var19;
                            this.field_rb.a(new sa(false, this.b(0, var15, 81), this.a(true, var15, 0), var19, a.field_u, -1 + var15, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15), " = <b>", Integer.toString(var19)}), 2777);
                            break L23;
                          }
                        }
                      }
                      if (this.field_rb == null) {
                        break L23;
                      } else {
                        L25: {
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
                            break L25;
                          } else {
                            this.field_rb.a(new sa(false, this.b(var18, var15, 65), this.a(true, var15, var18), var20, a.field_u, var15 + -var18 - 1, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15 + -var18), " = <b>", Integer.toString(var20)}), 2777);
                            break L25;
                          }
                        }
                        this.field_rb.a(new sa(false, this.b(0, var18, 112), this.a(true, var18, 0), var19, bc.field_J, -4 + var18, 16 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var18), " = <b>", Integer.toString(var19)}), 2777);
                        break L23;
                      }
                    }
                  }
                }
                var13 = var15;
                if (this.field_D >= param7) {
                  L26: {
                    stackOut_75_0 = this;
                    stackOut_75_1 = (lk) (param3);
                    stackOut_75_2 = (oi) (param8);
                    stackOut_75_3 = var12_int;
                    stackOut_75_4 = 0;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_77_2 = stackOut_75_2;
                    stackIn_77_3 = stackOut_75_3;
                    stackIn_77_4 = stackOut_75_4;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    stackIn_76_2 = stackOut_75_2;
                    stackIn_76_3 = stackOut_75_3;
                    stackIn_76_4 = stackOut_75_4;
                    if (this.field_D < 2) {
                      stackOut_77_0 = this;
                      stackOut_77_1 = (lk) ((Object) stackIn_77_1);
                      stackOut_77_2 = (oi) ((Object) stackIn_77_2);
                      stackOut_77_3 = stackIn_77_3;
                      stackOut_77_4 = stackIn_77_4;
                      stackOut_77_5 = var18;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      stackIn_78_2 = stackOut_77_2;
                      stackIn_78_3 = stackOut_77_3;
                      stackIn_78_4 = stackOut_77_4;
                      stackIn_78_5 = stackOut_77_5;
                      break L26;
                    } else {
                      stackOut_76_0 = this;
                      stackOut_76_1 = (lk) ((Object) stackIn_76_1);
                      stackOut_76_2 = (oi) ((Object) stackIn_76_2);
                      stackOut_76_3 = stackIn_76_3;
                      stackOut_76_4 = stackIn_76_4;
                      stackOut_76_5 = var15;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_78_2 = stackOut_76_2;
                      stackIn_78_3 = stackOut_76_3;
                      stackIn_78_4 = stackOut_76_4;
                      stackIn_78_5 = stackOut_76_5;
                      break L26;
                    }
                  }
                  this.a(stackIn_78_1, stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_78_5);
                  break L6;
                } else {
                  break L6;
                }
              }
              L27: {
                if (!param9) {
                  var18 = 0;
                  L28: while (true) {
                    if (var18 >= var15) {
                      break L27;
                    } else {
                      L29: {
                        L30: {
                          var19 = this.field_w[var18];
                          var20 = this.field_P[var19];
                          var21 = var20 & 268435455;
                          if (23 == var21) {
                            break L30;
                          } else {
                            if (var21 >> 3 != 2) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        var20 = var20 & 2147483647;
                        this.field_P[var19] = var20;
                        break L29;
                      }
                      var18++;
                      continue L28;
                    }
                  }
                } else {
                  break L27;
                }
              }
              stackOut_88_0 = var13;
              stackIn_89_0 = stackOut_88_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var12 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) (var12);
            stackOut_90_1 = new StringBuilder().append("lk.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param3 == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L31;
            } else {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L31;
            }
          }
          L32: {
            stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
            stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param8 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L32;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L32;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_89_0;
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
            var3 = this.field_A & param0;
            this.field_A = param0;
            var4 = 0;
            if (-1 >= this.field_Ab) {
              var4 = 1;
              break L0;
            } else {
              L1: {
                this.field_Ab = this.field_Ab - 1;
                if (0 != (1 & var3)) {
                  this.b((byte) -116);
                  this.field_Cb = -10;
                  break L1;
                } else {
                  if ((var3 & 2) != 0) {
                    this.j(param1 ^ -1674843003);
                    this.field_Cb = 10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (0 > this.field_Cb) {
                  if ((param0 & 1) != 0) {
                    fieldTemp$3 = this.field_Cb + 1;
                    this.field_Cb = this.field_Cb + 1;
                    if (fieldTemp$3 != 0) {
                      break L2;
                    } else {
                      this.b((byte) -116);
                      this.field_Cb = -3;
                      break L2;
                    }
                  } else {
                    this.field_Cb = 0;
                    break L2;
                  }
                } else {
                  if (this.field_Cb > 0) {
                    if ((param0 & 2) == 0) {
                      this.field_Cb = 0;
                      break L2;
                    } else {
                      fieldTemp$4 = this.field_Cb - 1;
                      this.field_Cb = this.field_Cb - 1;
                      if (fieldTemp$4 == 0) {
                        this.j(4);
                        this.field_Cb = 3;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (0 != (var3 & 4)) {
                  this.c(false);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (0 != (16 & param0)) {
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              if ((8 & var3) == 0) {
                break L0;
              } else {
                this.i(0);
                break L0;
              }
            }
          }
          L5: {
            if (param1 == -1674843007) {
              break L5;
            } else {
              discarded$5 = lk.a(50, -101, 127, 94, false, 20, 66);
              break L5;
            }
          }
          L6: {
            if (var4 != 0) {
              L7: {
                if (0 == this.field_Ab) {
                  break L7;
                } else {
                  if ((param0 & 16) != -1) {
                    break L7;
                  } else {
                    var4 = 0;
                    break L6;
                  }
                }
              }
              if (this.field_e <= 2) {
                break L6;
              } else {
                L8: {
                  if (this.field_y) {
                    break L8;
                  } else {
                    if (-1 >= this.field_Ab) {
                      break L8;
                    } else {
                      if (this.field_g != this.field_e) {
                        break L8;
                      } else {
                        if (this.o(32) != this.field_M) {
                          break L8;
                        } else {
                          if (null != this.field_rb) {
                            this.field_H = this.field_H + 5;
                            he.field_ab = he.field_ab + 5;
                            fb.field_e = fb.field_e + 5;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_e = 2;
                break L6;
              }
            } else {
              break L6;
            }
          }
          L9: {
            if (this.field_e > 0) {
              this.c(30000, -1 + this.field_e, 0);
              break L9;
            } else {
              break L9;
            }
          }
          return;
        }
    }

    final rf b(int param0) {
        int var2 = 0;
        rf var3 = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        this.c(0);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (this.field_t <= var2) {
              break L1;
            } else {
              if (this.field_X[var2].field_e == 0) {
                break L1;
              } else {
                var2++;
                continue L0;
              }
            }
          }
          if (this.field_t > var2) {
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
        int[] array$4 = null;
        int incrementValue$5 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var12 = client.field_A ? 1 : 0;
        this.field_L = param5;
        this.field_q = param4;
        param2 = param0 & -this.field_ab + param2;
        L0: while (true) {
          if (param2 <= 0) {
            this.a(param1, (byte) 126, param3);
            return;
          } else {
            L1: {
              L2: {
                var17 = this.field_B;
                var16 = var17;
                var15 = var16;
                var14 = var15;
                var13 = var14;
                var7 = var13;
                if (var13 == null) {
                  break L2;
                } else {
                  if (this.field_zb * this.field_C <= var17.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              array$4 = new int[this.field_C * this.field_zb];
              var7 = array$4;
              this.field_B = array$4;
              break L1;
            }
            var8 = 0;
            var9 = 0;
            L3: while (true) {
              if (this.field_zb <= var9) {
                var8 = this.field_C;
                this.field_C = this.field_zb;
                this.field_B = this.field_T;
                this.field_zb = var8;
                this.field_T = var7;
                param2--;
                continue L0;
              } else {
                var10 = -1 + this.field_zb - var9;
                var11 = 0;
                L4: while (true) {
                  if (this.field_C <= var11) {
                    var9++;
                    continue L3;
                  } else {
                    incrementValue$5 = var8;
                    var8++;
                    this.field_B[var10] = this.field_T[incrementValue$5];
                    var10 = var10 + this.field_zb;
                    var11++;
                    continue L4;
                  }
                }
              }
            }
          }
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
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
              if (this.field_zb * this.field_C <= var4_int) {
                var4_int = 0;
                L3: while (true) {
                  if (this.field_C * this.field_zb <= var4_int) {
                    L4: {
                      this.field_o = 0;
                      this.field_db = 0;
                      if ((1 & (this.field_C ^ this.field_zb)) == 0) {
                        break L4;
                      } else {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        L5: while (true) {
                          if (var8 >= this.field_zb) {
                            L6: {
                              var8 = (-1 + this.field_C) * var6 >> 1;
                              var9 = var6 * (this.field_zb - 1) >> 1;
                              if (-var9 + var5 <= var4_int + -var8) {
                                break L6;
                              } else {
                                if (var5 - var9 > var8 + -var4_int) {
                                  this.field_o = 1;
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (var5 - var9 >= -var8 + var4_int) {
                                break L7;
                              } else {
                                if (-var9 + var5 >= -var4_int + var8) {
                                  break L7;
                                } else {
                                  this.field_o = -1;
                                  break L4;
                                }
                              }
                            }
                            if (var4_int < var8) {
                              this.field_db = -1;
                              break L4;
                            } else {
                              this.field_db = 1;
                              break L4;
                            }
                          } else {
                            var9 = 0;
                            L8: while (true) {
                              if (var9 >= this.field_C) {
                                var8++;
                                continue L5;
                              } else {
                                L9: {
                                  if (0 == this.field_T[var7]) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var7++;
                                var9++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      this.field_Cb = 0;
                      this.field_q = -this.field_C + this.field_O >> 1;
                      this.field_A = 0;
                      this.field_L = -this.field_zb + 1 + this.field_z;
                      this.field_yb = param1;
                      this.field_ab = 0;
                      stackOut_28_0 = this;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (this.field_g >= 2) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = this.field_g;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L10;
                      } else {
                        stackOut_29_0 = this;
                        stackOut_29_1 = 2;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L10;
                      }
                    }
                    ((lk) (this)).field_e = stackIn_31_1;
                    this.field_y = false;
                    this.field_Ab = this.l(123);
                    this.field_M = this.o(32);
                    break L0;
                  } else {
                    this.field_b[var4_int] = 8;
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                this.field_T[var4_int] = lb.a(255, (int) param2.field_c[var4_int]);
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var4);
            stackOut_33_1 = new StringBuilder().append("lk.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void a(rf param0, byte param1) {
        rf[] var6 = null;
        rf[] var7 = null;
        int var4 = 0;
        int fieldTemp$0 = 0;
        int var5 = client.field_A ? 1 : 0;
        try {
            if (this.field_t >= this.field_X.length) {
                var6 = new rf[2 * this.field_X.length];
                var7 = var6;
                rf[] var3 = var7;
                for (var4 = 0; var4 < this.field_X.length; var4++) {
                    var6[var4] = this.field_X[var4];
                }
                this.field_X = var7;
            }
            if (param1 > -116) {
                this.field_o = 45;
            }
            param0.field_l = this.field_wb;
            this.field_wb = this.field_wb + 3;
            fieldTemp$0 = this.field_t;
            this.field_t = this.field_t + 1;
            this.field_X[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "lk.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        var12 = client.field_A ? 1 : 0;
        if (param0 == 5) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= 5) {
              return false;
            } else {
              var4 = this.field_w[var3];
              var5 = var4 % this.field_O;
              var6 = var4 / this.field_O;
              var7 = 15;
              var8 = 0;
              L1: while (true) {
                L2: {
                  if (5 <= var8) {
                    if (var7 == 0) {
                      break L2;
                    } else {
                      return true;
                    }
                  } else {
                    L3: {
                      if (var8 == var3) {
                        break L3;
                      } else {
                        L4: {
                          var9 = this.field_w[var8];
                          var10 = var9 % this.field_O;
                          var10 = var10 - var5;
                          var11 = var9 / this.field_O;
                          var11 = var11 - var6;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            L5: {
                              if (var10 == -1) {
                                break L5;
                              } else {
                                if (var10 == 1) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var7 = var7 & 3;
                            break L3;
                          }
                        }
                        L6: {
                          if (var10 != 0) {
                            break L6;
                          } else {
                            L7: {
                              if (var11 == -1) {
                                break L7;
                              } else {
                                if (var11 != 1) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var7 = var7 & 12;
                            break L3;
                          }
                        }
                        L8: {
                          if (-1 != var10) {
                            break L8;
                          } else {
                            if (var11 != -1) {
                              break L8;
                            } else {
                              var7 = var7 & 5;
                              break L3;
                            }
                          }
                        }
                        L9: {
                          if (var10 != 1) {
                            break L9;
                          } else {
                            if (var11 == -1) {
                              var7 = var7 & 9;
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var10 != -1) {
                            break L10;
                          } else {
                            if (var11 == 1) {
                              var7 = var7 & 6;
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (var10 != 1) {
                          break L2;
                        } else {
                          if (var11 == 1) {
                            var7 = var7 & 10;
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var8++;
                    continue L1;
                  }
                }
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final void k(int param0) {
        if (param0 != -9897) {
            this.field_V = 92;
        }
        if (this.field_C > 0) {
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
    }

    private final void i(int param0) {
        if (this.q(21200)) {
            return;
        }
        if ((this.field_db | this.field_o) != 0) {
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
            if (this.q(21200)) {
                return;
            }
            this.field_o = -this.field_o;
            this.field_db = -this.field_db;
        }
    }

    private final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        int var2 = this.field_C * this.field_zb;
        for (var3 = 0; var2 > var3; var3++) {
            var4 = this.field_T[var3];
            if (!(0 == var4)) {
                return (var4 & 24) >> 3;
            }
        }
        if (param0 < 35) {
            this.field_T = (int[]) null;
            return 0;
        }
        return 0;
    }

    final boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_O * this.field_a;
        var3 = 0;
        L0: while (true) {
          if (var2 <= var3) {
            L1: {
              if (param0 == -22477) {
                break L1;
              } else {
                var6 = (lk) null;
                this.a((oi) null, 112, true, (lk) null);
                break L1;
              }
            }
            return false;
          } else {
            var4 = this.field_P[var3];
            if ((24 & var4) == 24) {
              var4 = var4 & 7;
              if (1 != var4) {
                if (var4 != 3) {
                  return true;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
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
        ei var19 = null;
        ei var20 = null;
        ud stackIn_86_0 = null;
        RuntimeException stackIn_298_0 = null;
        StringBuilder stackIn_298_1 = null;
        RuntimeException stackIn_299_0 = null;
        StringBuilder stackIn_299_1 = null;
        RuntimeException stackIn_300_0 = null;
        StringBuilder stackIn_300_1 = null;
        String stackIn_300_2 = null;
        RuntimeException stackIn_301_0 = null;
        StringBuilder stackIn_301_1 = null;
        RuntimeException stackIn_302_0 = null;
        StringBuilder stackIn_302_1 = null;
        RuntimeException stackIn_303_0 = null;
        StringBuilder stackIn_303_1 = null;
        String stackIn_303_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_85_0 = null;
        ud stackOut_84_0 = null;
        RuntimeException stackOut_297_0 = null;
        StringBuilder stackOut_297_1 = null;
        RuntimeException stackOut_299_0 = null;
        StringBuilder stackOut_299_1 = null;
        String stackOut_299_2 = null;
        RuntimeException stackOut_298_0 = null;
        StringBuilder stackOut_298_1 = null;
        String stackOut_298_2 = null;
        RuntimeException stackOut_300_0 = null;
        StringBuilder stackOut_300_1 = null;
        RuntimeException stackOut_302_0 = null;
        StringBuilder stackOut_302_1 = null;
        String stackOut_302_2 = null;
        RuntimeException stackOut_301_0 = null;
        StringBuilder stackOut_301_1 = null;
        String stackOut_301_2 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            mk.field_e = 0;
            if (param1 > 124) {
              L1: {
                L2: {
                  L3: {
                    dn.field_i = false;
                    fk.field_H = 0;
                    bj.field_a = false;
                    pn.field_db = false;
                    var5_int = 0;
                    if (1 != this.field_ib) {
                      if (this.field_ib == 0) {
                        var6 = 0;
                        var7 = 0;
                        var8 = -1 + this.field_a * this.field_O;
                        var9 = this.field_a + -1;
                        L4: while (true) {
                          if (var9 < 0) {
                            L5: {
                              if (this.field_l != 0) {
                                stackOut_85_0 = rc.field_i;
                                stackIn_86_0 = stackOut_85_0;
                                break L5;
                              } else {
                                stackOut_84_0 = bf.field_u;
                                stackIn_86_0 = stackOut_84_0;
                                break L5;
                              }
                            }
                            L6: {
                              var9_ref_ud = stackIn_86_0;
                              if (var6 > 0) {
                                L7: {
                                  pg.field_a[this.field_Q] = true;
                                  var10 = (int)(0.5 + (double)this.field_k * Math.sqrt((double)var6));
                                  if (~(4 * this.field_k) <= ~var10) {
                                    break L7;
                                  } else {
                                    var10 = 4 * this.field_k;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var15 = wf.field_l[this.field_Q];
                                  var11_ref_ei = var15;
                                  if (var11_ref_ei == null) {
                                    break L8;
                                  } else {
                                    var15.f(-1);
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (var11_ref_ei == null) {
                                    break L9;
                                  } else {
                                    if (!var15.a((byte) 93)) {
                                      break L9;
                                    } else {
                                      if (var15.field_q == var9_ref_ud) {
                                        var15.b(en.field_o / 50, var10 * pb.field_d, this.field_lb << 6);
                                        break L6;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (var11_ref_ei != null) {
                                    var15.g(en.field_o / 50);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var16 = ei.c(var9_ref_ud, 100, var10 * pb.field_d, this.field_lb << 6);
                                var16.f(-1);
                                dg.field_c.a(var16);
                                wf.field_l[this.field_Q] = var16;
                                break L6;
                              } else {
                                var10_ref_ei = wf.field_l[this.field_Q];
                                if (var10_ref_ei != null) {
                                  var10_ref_ei.g(en.field_o / 50);
                                  wf.field_l[this.field_Q] = null;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L11: {
                              if (0 < var7) {
                                L12: {
                                  var10 = (2 + (int)((double)this.field_k * Math.sqrt((double)var7))) / 4;
                                  if (this.field_k < var10) {
                                    var10 = this.field_k;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ge.a(this.field_lb, var10, (byte) 127, bj.field_e);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var5_int == 0) {
                              this.field_ib = 2;
                              this.field_l = 0;
                              break L3;
                            } else {
                              this.field_l = -this.field_l;
                              break L3;
                            }
                          } else {
                            var10 = -1 + this.field_O;
                            L13: while (true) {
                              if (var10 < 0) {
                                var9--;
                                continue L4;
                              } else {
                                L14: {
                                  var11 = this.field_P[var8];
                                  if (var11 == 0) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (param2) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (16 == (var11 & 24)) {
                                            break L16;
                                          } else {
                                            if ((var11 & 24) != 24) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        if (~var9 <= ~(-1 + this.field_a)) {
                                          break L15;
                                        } else {
                                          if (this.field_P[var8 - -this.field_O] == 0) {
                                            this.field_P[var8 + this.field_O] = de.b(lb.a(var11, 31), 32);
                                            this.field_P[var8] = 0;
                                            var6++;
                                            var5_int = 1;
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    L17: {
                                      if (param2) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if ((var11 & 24) == 16) {
                                            break L18;
                                          } else {
                                            if ((24 & var11) != 24) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if (this.field_a + -1 <= var9) {
                                          break L17;
                                        } else {
                                          if (var10 - -this.field_l < 0) {
                                            break L17;
                                          } else {
                                            if (~(var10 + this.field_l) <= ~this.field_O) {
                                              break L17;
                                            } else {
                                              if (this.field_P[this.field_l + var8] != 0) {
                                                break L17;
                                              } else {
                                                if (this.field_P[this.field_O + var8 + this.field_l] != 0) {
                                                  break L17;
                                                } else {
                                                  this.field_P[this.field_l + var8] = de.b(lb.a(31, var11), 32);
                                                  this.field_P[var8] = 0;
                                                  var5_int = 1;
                                                  var6++;
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L19: {
                                      if (param2) {
                                        break L19;
                                      } else {
                                        L20: {
                                          if ((var11 & 24) == 16) {
                                            break L20;
                                          } else {
                                            if ((var11 & 24) != 24) {
                                              break L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (~(this.field_a + -1) >= ~var9) {
                                          break L19;
                                        } else {
                                          if (-this.field_l + var10 < 0) {
                                            break L19;
                                          } else {
                                            if (~this.field_O >= ~(-this.field_l + var10)) {
                                              break L19;
                                            } else {
                                              if (this.field_P[-this.field_l + var8] != 0) {
                                                break L19;
                                              } else {
                                                if (this.field_P[-this.field_l + (var8 + this.field_O)] != 0) {
                                                  break L19;
                                                } else {
                                                  this.field_P[-this.field_l + var8] = de.b(lb.a(31, var11), 32);
                                                  var5_int = 1;
                                                  this.field_P[var8] = 0;
                                                  var6++;
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (32 <= var11) {
                                      L21: {
                                        L22: {
                                          if (!param2) {
                                            break L22;
                                          } else {
                                            if (var11 < 64) {
                                              var11 = var11 & 31;
                                              break L21;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (var11 < 64) {
                                            var7++;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                        var11 += 32;
                                        if (var11 >= 448) {
                                          var11 = var11 & 31;
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      }
                                      this.field_P[var8] = var11;
                                      var5_int = 1;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var8--;
                                var10--;
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      var6 = 1;
                      var7 = 0;
                      L24: while (true) {
                        if (this.field_a * this.field_O <= var7) {
                          if (var6 != 0) {
                            this.field_ib = 0;
                            break L3;
                          } else {
                            if (var5_int != 0) {
                              break L1;
                            } else {
                              if (this.field_s) {
                                break L1;
                              } else {
                                if (!param2) {
                                  gg.field_B = 2147483647;
                                  gi.field_a = 0;
                                  var6 = 0;
                                  var7 = 0;
                                  L25: while (true) {
                                    if (~var7 <= ~(this.field_a * this.field_O)) {
                                      break L2;
                                    } else {
                                      L26: {
                                        var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                                        if (var8 > 0) {
                                          L27: {
                                            if (this.field_kb) {
                                              L28: {
                                                if (this.a(-101, var8)) {
                                                  bj.field_a = true;
                                                  break L28;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                              L29: {
                                                if (!this.c(var8, -15303)) {
                                                  break L29;
                                                } else {
                                                  dn.field_i = true;
                                                  break L29;
                                                }
                                              }
                                              if (!this.b(var8, -1)) {
                                                break L27;
                                              } else {
                                                pn.field_db = true;
                                                break L27;
                                              }
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var6++;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var7++;
                                      continue L25;
                                    }
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          L30: {
                            var8 = this.field_P[var7];
                            if (var8 < 32) {
                              break L30;
                            } else {
                              L31: {
                                var8 += 32;
                                if (var8 < 416) {
                                  var6 = 0;
                                  break L31;
                                } else {
                                  var8 = 0;
                                  break L31;
                                }
                              }
                              var5_int = 1;
                              this.field_P[var7] = var8;
                              break L30;
                            }
                          }
                          var7++;
                          continue L24;
                        }
                      }
                    }
                  }
                  if (var5_int != 0) {
                    break L1;
                  } else {
                    if (this.field_s) {
                      break L1;
                    } else {
                      if (!param2) {
                        gg.field_B = 2147483647;
                        gi.field_a = 0;
                        var6 = 0;
                        var7 = 0;
                        L32: while (true) {
                          if (~var7 <= ~(this.field_a * this.field_O)) {
                            break L2;
                          } else {
                            L33: {
                              var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                              if (var8 > 0) {
                                L34: {
                                  if (this.field_kb) {
                                    L35: {
                                      if (this.a(-101, var8)) {
                                        bj.field_a = true;
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    L36: {
                                      if (!this.c(var8, -15303)) {
                                        break L36;
                                      } else {
                                        dn.field_i = true;
                                        break L36;
                                      }
                                    }
                                    if (!this.b(var8, -1)) {
                                      break L34;
                                    } else {
                                      pn.field_db = true;
                                      break L34;
                                    }
                                  } else {
                                    break L34;
                                  }
                                }
                                var6++;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            var7++;
                            continue L32;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                this.a(-99, false, 1);
                if (var6 > 0) {
                  L37: {
                    this.field_K = this.field_K + var6;
                    if (var6 < 2) {
                      break L37;
                    } else {
                      L38: {
                        var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 1) / 2;
                        if (this.field_k < var7) {
                          var7 = this.field_k;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      ge.a(this.field_lb, var7, (byte) 127, bf.field_w);
                      break L37;
                    }
                  }
                  L39: {
                    this.field_nb = this.field_nb + 1;
                    if (this.field_nb >= 2) {
                      L40: {
                        var7 = (this.field_nb + -1) % 4;
                        var8 = (-1 + this.field_nb) / 4 * 3;
                        if (var7 != 3) {
                          break L40;
                        } else {
                          var8++;
                          break L40;
                        }
                      }
                      ai.a(62, var8, jm.field_v[var7], this.field_lb, this.field_k);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L41: {
                    if (null == this.field_rb) {
                      break L41;
                    } else {
                      L42: {
                        var7 = ik.a((byte) 126, var6);
                        var8 = var7;
                        fb.field_e = fb.field_e + var8;
                        he.field_ab = he.field_ab + var8;
                        this.field_ub = this.field_ub + var7;
                        if (0 < var7) {
                          fieldTemp$6 = gg.field_B;
                          gg.field_B = gg.field_B - 1;
                          this.field_rb.a(new sa(true, this.field_O * 128, -384 + fieldTemp$6 * 256, var7, jg.field_f, -2 + var6, 0, new String[]{cm.a((byte) 85, on.field_h, new String[]{Integer.toString(var6)}), " = <b>", Integer.toString(var7)}), 2777);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      var8 = le.b(32085, this.field_nb);
                      if (0 < var8) {
                        fieldTemp$7 = gg.field_B;
                        gg.field_B = gg.field_B - 1;
                        this.field_W = new sa(true, 128 * this.field_O, -384 + fieldTemp$7 * 256, var8, nf.field_f, this.field_nb + -2, 0, new String[]{cm.a((byte) 115, e.field_d, new String[]{Integer.toString(this.field_nb)}), " = <b>", Integer.toString(var8)});
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                  }
                  var5_int = 1;
                  break L1;
                } else {
                  this.field_s = true;
                  break L1;
                }
              }
              L43: {
                if (var5_int != 0) {
                  break L43;
                } else {
                  if (param2) {
                    break L43;
                  } else {
                    var6 = 1;
                    var7 = 0;
                    L44: while (true) {
                      if (var7 >= this.field_a * this.field_O) {
                        var7 = -1 + (-1 + this.field_a) * this.field_O;
                        var8 = this.field_a - 2;
                        L45: while (true) {
                          if (var8 < 0) {
                            var7 = this.field_O * (-1 + this.field_a) - 1;
                            var8 = -2 + this.field_a;
                            L46: while (true) {
                              if (var8 < 0) {
                                this.a(-121, false, 2);
                                var8 = 0;
                                var7 = -1 + this.field_O * this.field_a;
                                var9 = 0;
                                var10 = -1 + this.field_a;
                                L47: while (true) {
                                  if (var10 < 0) {
                                    L48: {
                                      if (0 >= var8) {
                                        break L48;
                                      } else {
                                        L49: {
                                          var10 = kd.field_s[0][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[0];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var8))) / 2;
                                          if (var12 > this.field_k) {
                                            var12 = this.field_k;
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                        L50: {
                                          if (var12 >= var10) {
                                            break L50;
                                          } else {
                                            var12 = var10;
                                            break L50;
                                          }
                                        }
                                        kd.field_s[0][this.field_Q] = var12;
                                        var17 = var11_ref_ei__[this.field_Q];
                                        var13 = var17;
                                        if (var13 == null) {
                                          var18 = ei.c(ob.field_n, 100, pb.field_d * var12, this.field_lb << 6);
                                          var18.f(-1);
                                          dg.field_c.a(var18);
                                          var11_ref_ei__[this.field_Q] = var18;
                                          break L48;
                                        } else {
                                          var17.b(en.field_o / 50, var12 * pb.field_d, this.field_lb << 6);
                                          break L48;
                                        }
                                      }
                                    }
                                    L51: {
                                      if (0 < var9) {
                                        L52: {
                                          var10 = kd.field_s[1][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[1];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var9))) / 2;
                                          if (~this.field_k <= ~var12) {
                                            break L52;
                                          } else {
                                            var12 = this.field_k;
                                            break L52;
                                          }
                                        }
                                        L53: {
                                          if (var12 >= var10) {
                                            break L53;
                                          } else {
                                            var12 = var10;
                                            break L53;
                                          }
                                        }
                                        kd.field_s[1][this.field_Q] = var12;
                                        var19 = var11_ref_ei__[this.field_Q];
                                        var13 = var19;
                                        if (var13 == null) {
                                          var20 = ei.c(ob.field_n, 120, var12 * pb.field_d, this.field_lb << 6);
                                          var20.f(-1);
                                          dg.field_c.a(var20);
                                          var11_ref_ei__[this.field_Q] = var20;
                                          break L51;
                                        } else {
                                          var19.b(en.field_o / 50, pb.field_d * var12, this.field_lb << 6);
                                          break L51;
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                    if (var5_int == 0) {
                                      break L43;
                                    } else {
                                      if (var6 == 0) {
                                        break L43;
                                      } else {
                                        this.field_ib = 0;
                                        this.field_s = false;
                                        break L43;
                                      }
                                    }
                                  } else {
                                    var11 = this.field_O + -1;
                                    L54: while (true) {
                                      if (var11 < 0) {
                                        var10--;
                                        continue L47;
                                      } else {
                                        L55: {
                                          L56: {
                                            var12 = this.field_P[var7];
                                            if ((31 & var12) == 25) {
                                              break L56;
                                            } else {
                                              if (27 != (var12 & 31)) {
                                                break L55;
                                              } else {
                                                break L56;
                                              }
                                            }
                                          }
                                          var5_int = 1;
                                          if (32 > var12) {
                                            L57: {
                                              if (-1 + this.field_a > var10) {
                                                this.field_P[var7 + this.field_O] = var12;
                                                break L57;
                                              } else {
                                                break L57;
                                              }
                                            }
                                            this.field_P[var7] = var12 - -32;
                                            var6 = 0;
                                            if ((7 & var12) == 3) {
                                              var9++;
                                              break L55;
                                            } else {
                                              var8++;
                                              break L55;
                                            }
                                          } else {
                                            L58: {
                                              var12 += 32;
                                              if (var12 < 416) {
                                                var6 = 0;
                                                break L58;
                                              } else {
                                                var12 = 0;
                                                break L58;
                                              }
                                            }
                                            this.field_P[var7] = var12;
                                            break L55;
                                          }
                                        }
                                        var7--;
                                        var11--;
                                        continue L54;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var9 = -1 + this.field_O;
                                L59: while (true) {
                                  if (var9 < 0) {
                                    var8--;
                                    continue L46;
                                  } else {
                                    L60: {
                                      var10 = this.field_P[var7];
                                      if (var10 != 25) {
                                        break L60;
                                      } else {
                                        if ((this.field_P[var7 + this.field_O] & 1879048192) != 0) {
                                          break L60;
                                        } else {
                                          discarded$8 = this.a(false, 1, 1, param3, false, -1, var7 - -this.field_O, 3, param0, false, (byte) 123);
                                          break L60;
                                        }
                                      }
                                    }
                                    L61: {
                                      if (var10 != 27) {
                                        break L61;
                                      } else {
                                        if (0 != (this.field_P[this.field_O + var7] & 1879048192)) {
                                          break L61;
                                        } else {
                                          discarded$9 = this.a(false, 1, 1, param3, true, -1, this.field_O + var7, 3, param0, false, (byte) 72);
                                          break L61;
                                        }
                                      }
                                    }
                                    var7--;
                                    var9--;
                                    continue L59;
                                  }
                                }
                              }
                            }
                          } else {
                            var9 = -1 + this.field_O;
                            L62: while (true) {
                              if (var9 < 0) {
                                var8--;
                                continue L45;
                              } else {
                                L63: {
                                  var10 = this.field_P[var7];
                                  if (var10 == 25) {
                                    discarded$10 = this.a(false, 2, 1, param3, false, -2, this.field_O + var7, 3, param0, false, (byte) 109);
                                    this.b(-1, this.field_O + var7, false);
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                                L64: {
                                  if (27 == var10) {
                                    discarded$11 = this.a(true, 2, 1, param3, true, -2, this.field_O + var7, 3, param0, false, (byte) -99);
                                    this.b(-1, var7 - -this.field_O, false);
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                                var7--;
                                var9--;
                                continue L62;
                              }
                            }
                          }
                        }
                      } else {
                        L65: {
                          var8 = this.field_P[var7];
                          if (var8 < 32) {
                            break L65;
                          } else {
                            if ((var8 & 31) == 25) {
                              break L65;
                            } else {
                              if ((var8 & 31) == 27) {
                                break L65;
                              } else {
                                L66: {
                                  var8 += 32;
                                  if (var8 < 416) {
                                    var6 = 0;
                                    break L66;
                                  } else {
                                    var8 = 0;
                                    break L66;
                                  }
                                }
                                this.field_P[var7] = var8;
                                var5_int = 1;
                                break L65;
                              }
                            }
                          }
                        }
                        var7++;
                        continue L44;
                      }
                    }
                  }
                }
              }
              L67: {
                if (param2) {
                  break L67;
                } else {
                  if (this.field_G == 0) {
                    break L67;
                  } else {
                    var6 = this.field_G;
                    this.field_G = 0;
                    var7 = 0;
                    var8 = 0;
                    L68: while (true) {
                      if (this.field_a * this.field_O <= var8) {
                        this.a(-107, true, this.field_ib);
                        if (var7 > 0) {
                          var5_int = 1;
                          if (null == this.field_rb) {
                            break L67;
                          } else {
                            var8 = gg.b(var7, 27935);
                            var9 = var8;
                            he.field_ab = he.field_ab + var9;
                            fb.field_e = fb.field_e + var9;
                            this.field_hb = this.field_hb + var8;
                            this.field_rb.a(new sa(true, this.field_O * 128, this.field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[]{" = <b>", Integer.toString(var8)}), 2777);
                            break L67;
                          }
                        } else {
                          break L67;
                        }
                      } else {
                        L69: {
                          L70: {
                            var9 = this.field_P[var8];
                            var10 = var9 >> 3;
                            if (2 == var10) {
                              break L70;
                            } else {
                              if (var10 != 1) {
                                break L69;
                              } else {
                                break L70;
                              }
                            }
                          }
                          var11 = 1 << (7 & var9);
                          if (0 == (var6 & var11)) {
                            break L69;
                          } else {
                            var7 = var7 + this.a(true, var10, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                            break L69;
                          }
                        }
                        var8++;
                        continue L68;
                      }
                    }
                  }
                }
              }
              L71: {
                if (param2) {
                  break L71;
                } else {
                  L72: {
                    if (this.field_r) {
                      break L72;
                    } else {
                      if (this.field_Y) {
                        break L72;
                      } else {
                        break L71;
                      }
                    }
                  }
                  var6 = 0;
                  L73: while (true) {
                    if (~(this.field_O * this.field_a) >= ~var6) {
                      L74: {
                        if (this.field_r) {
                          this.field_v = true;
                          ge.a(this.field_lb, this.field_k, (byte) 127, fj.field_k);
                          break L74;
                        } else {
                          break L74;
                        }
                      }
                      L75: {
                        if (this.field_Y) {
                          ge.a(this.field_lb, this.field_k, (byte) 127, w.field_Eb);
                          break L75;
                        } else {
                          break L75;
                        }
                      }
                      this.field_Y = false;
                      this.field_r = false;
                      break L71;
                    } else {
                      L76: {
                        var7 = this.field_P[var6];
                        if (var7 == 23) {
                          break L76;
                        } else {
                          L77: {
                            L78: {
                              if (!this.field_r) {
                                break L78;
                              } else {
                                if (var7 >> 3 == 1) {
                                  break L77;
                                } else {
                                  break L78;
                                }
                              }
                            }
                            if (!this.field_Y) {
                              break L76;
                            } else {
                              if (var7 >> 3 == 2) {
                                break L77;
                              } else {
                                break L76;
                              }
                            }
                          }
                          this.field_P[var6] = qm.b(24, var7);
                          break L76;
                        }
                      }
                      var6++;
                      continue L73;
                    }
                  }
                }
              }
              L79: {
                if (this.field_N != null) {
                  this.field_mb = this.field_mb + 1;
                  if (13 == this.field_mb) {
                    this.field_N = null;
                    break L79;
                  } else {
                    break L79;
                  }
                } else {
                  break L79;
                }
              }
              L80: {
                if (param2) {
                  break L80;
                } else {
                  if (var5_int != 0) {
                    break L80;
                  } else {
                    if (null != this.field_N) {
                      break L80;
                    } else {
                      if (this.field_jb <= 0) {
                        break L80;
                      } else {
                        if (this.field_Z != this.field_z) {
                          ge.a(this.field_lb, this.field_k, (byte) 127, qa.field_s);
                          var6 = this.field_z;
                          L81: while (true) {
                            if (~var6 <= ~this.field_Z) {
                              this.field_L = this.field_L + (this.field_Z - this.field_z);
                              var5_int = 1;
                              this.field_z = this.field_Z;
                              break L80;
                            } else {
                              var7 = 0;
                              L82: while (true) {
                                if (var7 >= this.field_O) {
                                  var6++;
                                  continue L81;
                                } else {
                                  L83: {
                                    var8 = this.field_P[var6 * this.field_O + var7];
                                    if (var8 == 0) {
                                      break L83;
                                    } else {
                                      this.field_P[var6 * this.field_O - -var7] = 32 + var8;
                                      this.field_ib = 1;
                                      break L83;
                                    }
                                  }
                                  var7++;
                                  continue L82;
                                }
                              }
                            }
                          }
                        } else {
                          break L80;
                        }
                      }
                    }
                  }
                }
              }
              L84: {
                L85: {
                  if (var5_int != 0) {
                    break L85;
                  } else {
                    if (this.field_N != null) {
                      break L85;
                    } else {
                      if (!param2) {
                        L86: {
                          this.field_S = false;
                          this.field_s = false;
                          this.field_ib = 0;
                          this.field_v = false;
                          if (this.field_rb == null) {
                            break L86;
                          } else {
                            if (this.field_W != null) {
                              this.field_j = this.field_j + this.field_W.field_t;
                              var6 = this.field_W.field_t;
                              fb.field_e = fb.field_e + var6;
                              he.field_ab = he.field_ab + var6;
                              this.field_rb.a(this.field_W, 2777);
                              this.field_W = null;
                              break L86;
                            } else {
                              break L86;
                            }
                          }
                        }
                        L87: {
                          if (this.c((byte) -117)) {
                            this.field_L = this.field_L - 1;
                            break L87;
                          } else {
                            break L87;
                          }
                        }
                        this.field_M = this.o(32);
                        break L85;
                      } else {
                        break L84;
                      }
                    }
                  }
                }
                break L84;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L88: {
            var5 = decompiledCaughtException;
            stackOut_297_0 = (RuntimeException) (var5);
            stackOut_297_1 = new StringBuilder().append("lk.WA(");
            stackIn_299_0 = stackOut_297_0;
            stackIn_299_1 = stackOut_297_1;
            stackIn_298_0 = stackOut_297_0;
            stackIn_298_1 = stackOut_297_1;
            if (param0 == null) {
              stackOut_299_0 = (RuntimeException) ((Object) stackIn_299_0);
              stackOut_299_1 = (StringBuilder) ((Object) stackIn_299_1);
              stackOut_299_2 = "null";
              stackIn_300_0 = stackOut_299_0;
              stackIn_300_1 = stackOut_299_1;
              stackIn_300_2 = stackOut_299_2;
              break L88;
            } else {
              stackOut_298_0 = (RuntimeException) ((Object) stackIn_298_0);
              stackOut_298_1 = (StringBuilder) ((Object) stackIn_298_1);
              stackOut_298_2 = "{...}";
              stackIn_300_0 = stackOut_298_0;
              stackIn_300_1 = stackOut_298_1;
              stackIn_300_2 = stackOut_298_2;
              break L88;
            }
          }
          L89: {
            stackOut_300_0 = (RuntimeException) ((Object) stackIn_300_0);
            stackOut_300_1 = ((StringBuilder) (Object) stackIn_300_1).append(stackIn_300_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_302_0 = stackOut_300_0;
            stackIn_302_1 = stackOut_300_1;
            stackIn_301_0 = stackOut_300_0;
            stackIn_301_1 = stackOut_300_1;
            if (param3 == null) {
              stackOut_302_0 = (RuntimeException) ((Object) stackIn_302_0);
              stackOut_302_1 = (StringBuilder) ((Object) stackIn_302_1);
              stackOut_302_2 = "null";
              stackIn_303_0 = stackOut_302_0;
              stackIn_303_1 = stackOut_302_1;
              stackIn_303_2 = stackOut_302_2;
              break L89;
            } else {
              stackOut_301_0 = (RuntimeException) ((Object) stackIn_301_0);
              stackOut_301_1 = (StringBuilder) ((Object) stackIn_301_1);
              stackOut_301_2 = "{...}";
              stackIn_303_0 = stackOut_301_0;
              stackIn_303_1 = stackOut_301_1;
              stackIn_303_2 = stackOut_301_2;
              break L89;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_303_0), stackIn_303_2 + ')');
        }
    }

    public static void g(int param0) {
        field_i = null;
    }

    private final void b(byte param0) {
        this.field_q = this.field_q - 1;
        if (this.c((byte) -117)) {
            this.field_q = this.field_q + 1;
        } else {
            this.h(-1);
            ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
        }
    }

    private final void c(int param0) {
        ge.a(this.field_sb, this.field_J / 8, (byte) 127, ul.field_i);
    }

    private final rf p(int param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (this.field_t <= 0) {
            throw new IllegalStateException();
        }
        rf var2 = this.field_X[0];
        for (var3 = 1; this.field_t > var3; var3++) {
            this.field_X[-1 + var3] = this.field_X[var3];
        }
        this.field_m = this.field_m + 1;
        this.field_t = this.field_t - 1;
        return var2;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.e(3);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((var4_int & 256) == 0) {
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
              this.field_ab = (1616 & var4_int) >> 9;
              this.field_o = (-1073741824 & var4_int << 27) >> 30;
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
              ((lk) (this)).field_y = stackIn_7_1 != 0;
              if ((32 & var4_int) == 0) {
                this.field_ib = 1;
                break L3;
              } else {
                this.field_ib = 0;
                break L3;
              }
            }
            L4: {
              this.field_db = (-1073741824 & var4_int << 29) >> 30;
              this.field_jb = param1.d((byte) -74);
              if (!param0) {
                break L4;
              } else {
                var5 = this.field_jb;
                L5: while (true) {
                  if (3 <= var5) {
                    break L4;
                  } else {
                    rk.field_cb = rk.field_cb + 30000;
                    fh.field_h = fh.field_h + 30000;
                    var5++;
                    continue L5;
                  }
                }
              }
            }
            var5 = 0;
            L6: while (true) {
              if (this.field_a * this.field_O <= var5) {
                this.field_U = param1.d((byte) -71);
                this.field_C = param1.d((byte) -38);
                this.field_zb = param1.d((byte) -39);
                this.field_T = new int[this.field_C * this.field_zb];
                this.field_b = new int[this.field_C * this.field_zb];
                this.field_tb = new int[this.field_zb * this.field_C];
                var5 = 0;
                L7: while (true) {
                  if (var5 >= this.field_C * this.field_zb) {
                    var5 = 0;
                    L8: while (true) {
                      if (this.field_C * this.field_zb <= var5) {
                        L9: {
                          this.field_q = param1.g((byte) -123);
                          this.field_L = param1.g((byte) -84);
                          this.field_e = param1.d((byte) -45);
                          this.field_Ab = param1.e(3);
                          this.field_A = param1.d((byte) -104);
                          this.field_Cb = param1.g((byte) -122);
                          this.field_yb = param1.d((byte) -102);
                          if (param2 >= 116) {
                            break L9;
                          } else {
                            this.a(84, false, 99);
                            break L9;
                          }
                        }
                        this.field_K = param1.d((byte) -52);
                        this.field_z = param1.d((byte) -100);
                        this.field_Bb = false;
                        break L0;
                      } else {
                        this.field_b[var5] = 8;
                        var5++;
                        continue L8;
                      }
                    }
                  } else {
                    this.field_T[var5] = param1.d((byte) -42);
                    var5++;
                    continue L7;
                  }
                }
              } else {
                L10: {
                  var6 = param1.d((byte) -40);
                  if (var6 >= 128) {
                    var7 = param1.d((byte) -102);
                    var6 = 127 & var6 | var7 << 7;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                this.field_P[var5] = var6;
                var5++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("lk.JA(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
        }
    }

    private final int o(int param0) {
        return this.field_o + this.field_zb + 2 * this.field_L;
    }

    private final void d(int param0) {
        int var2 = this.o(32);
        if (!(this.field_M >= var2)) {
            this.field_M = var2;
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
            if ((-1879048193 & var6) == param4) {
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
        L0: {
          var4 = this.field_P[param1];
          if (24 != (-1879048200 & var4)) {
            break L0;
          } else {
            if (1 == (7 & var4)) {
              return;
            } else {
              if ((7 & var4) != 3) {
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
                  if ((-1879048193 & var4) != 28) {
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
    }

    private final boolean t(int param0) {
        int[] array$4 = null;
        int incrementValue$5 = 0;
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
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          L1: {
            var8 = client.field_A ? 1 : 0;
            var13 = this.field_B;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if (var13.length < this.field_C * this.field_zb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          array$4 = new int[this.field_C * this.field_zb];
          var2 = array$4;
          this.field_B = array$4;
          break L0;
        }
        var3 = 0;
        var4 = 0;
        L2: while (true) {
          if (this.field_zb <= var4) {
            var4 = -this.field_o + -this.field_zb + (this.field_C - -this.field_db) >> 1;
            this.field_q = this.field_q + var4;
            var5 = this.field_o + this.field_db + (-this.field_C + this.field_zb) >> 1;
            this.field_L = this.field_L + var5;
            var3 = this.field_C;
            this.field_C = this.field_zb;
            this.field_zb = var3;
            this.field_B = this.field_T;
            this.field_T = var2;
            if (this.c((byte) -117)) {
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
              this.h(-1);
              var6 = 0;
              L3: while (true) {
                if (this.field_zb <= var6) {
                  ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
                  return true;
                } else {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= this.field_C) {
                      var6++;
                      continue L3;
                    } else {
                      this.field_tb[var3] = 0;
                      this.field_b[var3] = 8 * (-1 + -(var7 * 2) + this.field_db + this.field_C) / this.field_C;
                      var3++;
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var5 = (-1 + this.field_C) * this.field_zb + var4;
            var6 = 0;
            L5: while (true) {
              if (var6 >= this.field_C) {
                var4++;
                continue L2;
              } else {
                incrementValue$5 = var3;
                var3++;
                this.field_B[var5] = this.field_T[incrementValue$5];
                var5 = var5 - this.field_zb;
                var6++;
                continue L5;
              }
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
                if (var4 >= 0) {
                    if (var5 >= 0) {
                        if (~this.field_C < ~var4) {
                            if (~var5 <= ~this.field_zb) {
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
        int var5 = 0;
        int var6 = 0;
        int discarded$0 = 0;
        int var7 = client.field_A ? 1 : 0;
        int var4 = 0;
        for (var5 = param0; var5 < param1; var5++) {
            var6 = this.field_w[var5];
            var4 = var4 + var6 % this.field_O;
        }
        if (param2 <= 49) {
            discarded$0 = this.a((byte) -117);
        }
        return 128 + var4 * 256 / (-param0 + param1);
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
        int var4 = client.field_A ? 1 : 0;
        this.field_L = this.field_L + 1;
        if (!(!this.c((byte) -117))) {
            this.field_L = this.field_L - 1;
            return true;
        }
        this.d(30968);
        if (param1) {
            var3 = this.a((byte) 103);
            if (var3 != 1) {
                ge.a(this.field_lb, this.field_k / 4, (byte) 127, pg.field_d);
            } else {
                ge.a(this.field_lb, this.field_k / 8, (byte) 127, client.field_F);
            }
        }
        int var5 = 0;
        var3 = var5;
        while (this.field_zb * this.field_C > var5) {
            this.field_tb[var5] = 0;
            this.field_b[var5] = 8;
            var5++;
        }
        if (param0 >= -27) {
            this.a(-71, (byte) 28, false);
        }
        return false;
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_q + this.field_L * this.field_O;
        var4 = 0;
        L0: while (true) {
          if (~var4 <= ~this.field_zb) {
            return false;
          } else {
            var5 = 0;
            L1: while (true) {
              if (~this.field_C >= ~var5) {
                var3 = var3 + (this.field_O - this.field_C);
                var4++;
                continue L0;
              } else {
                L2: {
                  if (this.field_T[var2] != 0) {
                    L3: {
                      if (this.field_q - -var5 < 0) {
                        break L3;
                      } else {
                        if (~this.field_O >= ~(this.field_q + var5)) {
                          break L3;
                        } else {
                          if (this.field_L + var4 < this.field_a) {
                            if (var4 + this.field_L < 0) {
                              break L2;
                            } else {
                              if (this.field_P[var3] != 0) {
                                return true;
                              } else {
                                break L2;
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
                    break L2;
                  }
                }
                var2++;
                var3++;
                var5++;
                continue L1;
              }
            }
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
            if (var5 >= 0) {
                if (var6 >= 0) {
                    if (var5 < this.field_V) {
                        if (var6 < this.field_h) {
                            var7 = this.field_N[var6 * this.field_V + var5];
                            if (!(var7 == 0)) {
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
        var10 = client.field_A ? 1 : 0;
        var4 = 0;
        var5 = -97 % ((83 - param1) / 37);
        L0: while (true) {
          if (~(this.field_C * this.field_zb) >= ~var4) {
            L1: {
              this.field_Z = param0;
              if (this.field_z <= this.field_L) {
                var4 = 0;
                var5 = this.field_L * this.field_O + this.field_q;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (~var7 <= ~this.field_zb) {
                    if (0 < var6) {
                      L3: {
                        var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 4) / 8;
                        if (~var7 >= ~this.field_k) {
                          break L3;
                        } else {
                          var7 = this.field_k;
                          break L3;
                        }
                      }
                      ge.a(this.field_lb, var7, (byte) 127, fh.field_c);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var8 = 0;
                    L4: while (true) {
                      if (~var8 <= ~this.field_C) {
                        var5 = var5 + (this.field_O - this.field_C);
                        var7++;
                        continue L2;
                      } else {
                        L5: {
                          var9 = this.field_T[var4];
                          if (var9 != 0) {
                            L6: {
                              L7: {
                                if ((24 & var9) == 16) {
                                  break L7;
                                } else {
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    if (this.field_T[-this.field_C + var4] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var9 = var9 | 32;
                              break L6;
                            }
                            L8: {
                              this.field_P[var5] = var9;
                              if ((24 & var9) != 16) {
                                break L8;
                              } else {
                                if (this.field_rb != null) {
                                  this.field_x = this.field_x + 25;
                                  fb.field_e = fb.field_e + 25;
                                  he.field_ab = he.field_ab + 25;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (8 == (24 & var9)) {
                              var6++;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        var4++;
                        var8++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  this.field_jb = this.field_jb - 1;
                  if (!param2) {
                    break L9;
                  } else {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    break L9;
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
                  L10: while (true) {
                    if (this.field_L > var6) {
                      this.field_mb = 1;
                      ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
                      break L1;
                    } else {
                      var7 = -1 + (this.field_q - -this.field_C);
                      L11: while (true) {
                        if (~this.field_q < ~var7) {
                          var6--;
                          continue L10;
                        } else {
                          L12: {
                            L13: {
                              var5--;
                              var8 = this.field_T[var5];
                              if ((24 & var8) == 16) {
                                break L13;
                              } else {
                                if (24 == (var8 & 24)) {
                                  break L13;
                                } else {
                                  this.field_N[var5] = var8;
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              var9 = var6;
                              if (var9 >= this.field_z) {
                                break L14;
                              } else {
                                var9 = this.field_z;
                                break L14;
                              }
                            }
                            L15: {
                              if (~this.field_a >= ~var9) {
                                break L15;
                              } else {
                                if (this.field_P[var7 + this.field_O * var9] != 0) {
                                  break L15;
                                } else {
                                  this.field_P[var7 + this.field_O * var9] = 32 + var8;
                                  if (16 != (var8 & 24)) {
                                    break L12;
                                  } else {
                                    if (this.field_rb == null) {
                                      break L12;
                                    } else {
                                      fb.field_e = fb.field_e + 25;
                                      he.field_ab = he.field_ab + 25;
                                      this.field_x = this.field_x + 25;
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            this.field_N[var5] = var8;
                            break L12;
                          }
                          var7--;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  this.k(-9897);
                  return;
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
          } else {
            L16: {
              if (this.field_T[var4] == 0) {
                break L16;
              } else {
                this.field_qb = this.field_qb + 1;
                break L16;
              }
            }
            var4++;
            continue L0;
          }
        }
    }

    final static void a(mm param0, boolean param1, mm param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            rk.field_R = param2;
            om.field_a = 480;
            bg.field_g = param0;
            pj.a(31004, hk.field_j / 2, hk.field_i / 2);
            s.a(param2.field_C, param0.field_K + param0.field_C, (byte) -91, param0.field_C, param2.field_C + param2.field_K);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("lk.HA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(true).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + 480 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param0) {
            L1: {
              L2: {
                if (var3 == 0) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L1;
                  }
                }
              }
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            return stackIn_14_0 != 0;
          } else {
            L3: {
              var6 = this.field_w[var5];
              if (var6 < this.field_O) {
                var3 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (this.field_O * (this.field_a - 1) <= var6) {
              var4 = 1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        var5 = client.field_A ? 1 : 0;
        this.field_e = param1;
        L0: while (true) {
          L1: {
            if (param1 != 0) {
              break L1;
            } else {
              if (this.field_y) {
                this.field_Bb = true;
                break L1;
              } else {
                L2: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = -126;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (0 != param2) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L2;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L2;
                  }
                }
                if (this.a((byte) stackIn_6_1, stackIn_6_2 != 0)) {
                  this.field_e = 20;
                  this.field_y = true;
                  break L1;
                } else {
                  param2++;
                  param1 = this.field_g;
                  this.field_e = this.field_g;
                  continue L0;
                }
              }
            }
          }
          L3: {
            if (this.field_g != 0) {
              break L3;
            } else {
              if (param2 > 0) {
                L4: {
                  var4 = ((int)((double)this.field_k * Math.sqrt((double)(this.field_a - -param2) / ((double)this.field_a * 2.0))) + 4) / 8;
                  if (var4 > this.field_k) {
                    var4 = this.field_k;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ge.a(this.field_lb, var4, (byte) 127, fh.field_c);
                break L3;
              } else {
                break L3;
              }
            }
          }
          return;
        }
    }

    final boolean e(int param0) {
        int var2 = -106 % ((param0 - -22) / 51);
        if (this.field_t > 0) {
            if (!(this.field_X[0].field_l != 0)) {
                return true;
            }
        }
        if (this.field_pb >= 18) {
            return true;
        }
        return false;
    }

    private final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        if (4 == param1) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= 4) {
              return false;
            } else {
              var4 = this.field_w[var3];
              var5 = var4 % this.field_O;
              var6 = var4 / this.field_O;
              var7 = 0;
              L1: while (true) {
                if (4 <= var7) {
                  return true;
                } else {
                  if (var3 != var7) {
                    L2: {
                      var8 = this.field_w[var7];
                      var9 = var8 % this.field_O;
                      var10 = var8 / this.field_O;
                      var9 = var9 - var5;
                      var10 = var10 - var6;
                      if (0 != var9) {
                        break L2;
                      } else {
                        if (var10 != -1) {
                          if (var10 != 1) {
                            break L2;
                          } else {
                            var7++;
                            continue L1;
                          }
                        } else {
                          var7++;
                          continue L1;
                        }
                      }
                    }
                    if (0 == var10) {
                      if (var9 != -1) {
                        if (var9 == 1) {
                          var7++;
                          continue L1;
                        } else {
                          var3++;
                          continue L0;
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
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
        int var20 = 0;
        rf var21 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                break L1;
              } else {
                if (param1 == null) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            var6_int = -1 + this.field_O;
            var7 = -1 + this.field_a;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            L2: while (true) {
              if (param4 <= var10) {
                L3: {
                  var10 = -var6_int + 1 + var8;
                  var11 = var9 - -1 - var7;
                  var12 = var10 * var11;
                  fieldTemp$2 = this.field_fb;
                  this.field_fb = this.field_fb + 1;
                  var13 = fieldTemp$2;
                  var14 = null;
                  if (param1 == null) {
                    break L3;
                  } else {
                    var14 = param1.a(false, var13);
                    break L3;
                  }
                }
                L4: {
                  if (var14 != null) {
                    break L4;
                  } else {
                    var21 = new rf(var13);
                    var14 = var21;
                    fieldTemp$3 = this.field_p;
                    this.field_p = this.field_p + 1;
                    var21.field_m = fieldTemp$3;
                    if (param1 != null) {
                      param1.a(var21, 0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                ((rf) (var14)).field_b = var10;
                ((rf) (var14)).field_c = new byte[var12];
                ((rf) (var14)).field_n = var11;
                var15 = 0;
                L5: while (true) {
                  if (var15 >= var12) {
                    var20 = 0;
                    var15 = var20;
                    L6: while (true) {
                      if (var20 >= param4) {
                        L7: {
                          if (param0 == null) {
                            break L7;
                          } else {
                            param0.a((rf) (var14), (byte) -128);
                            break L7;
                          }
                        }
                        break L0;
                      } else {
                        var16 = this.field_w[var20];
                        var17 = -var6_int + var16 % this.field_O;
                        var18 = var16 / this.field_O - var7;
                        ((rf) (var14)).field_c[var17 + var18 * var10] = (byte)param2;
                        var20++;
                        continue L6;
                      }
                    }
                  } else {
                    ((rf) (var14)).field_c[var15] = (byte) 0;
                    var15++;
                    continue L5;
                  }
                }
              } else {
                L8: {
                  var11 = this.field_w[var10];
                  var12 = var11 % this.field_O;
                  var13 = var11 / this.field_O;
                  if (var12 < var6_int) {
                    var6_int = var12;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var12 > var8) {
                    var8 = var12;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var9 >= var13) {
                    break L10;
                  } else {
                    var9 = var13;
                    break L10;
                  }
                }
                L11: {
                  if (var13 < var7) {
                    var7 = var13;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var6);
            stackOut_34_1 = new StringBuilder().append("lk.T(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ',' + 0 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int discarded$0 = 0;
        if (param1 != 2113050941) {
            discarded$0 = this.a(80, 86, (byte) -26, -11);
        }
        if (!param2) {
            this.field_g = mn.field_b[param0];
        } else {
            this.field_g = pn.field_eb[param0];
        }
    }

    private final void c(boolean param0) {
        if (!(!this.t(0))) {
            return;
        }
        if (!((this.field_db | this.field_o) == 0)) {
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
        int incrementValue$0 = 0;
        int discarded$1 = 0;
        int var5 = this.field_P[param1];
        if (param3 != (-1879048193 & var5)) {
            this.b(7 & param3, param1, false);
        } else {
            if ((var5 & 1879048192) < 1879048192) {
                var5 = var5 + 268435456;
            }
            incrementValue$0 = param0;
            param0++;
            this.field_w[incrementValue$0] = param1;
            this.field_P[param1] = var5 + -2147483648;
        }
        if (param2 != -44) {
            oi var6 = (oi) null;
            discarded$1 = this.a(true, 26, -7, (lk) null, true, 84, -39, 24, (oi) null, false, (byte) -94);
        }
        return param0;
    }

    private final void j(int param0) {
        this.field_q = this.field_q + 1;
        if (!this.c((byte) -117)) {
            this.h(-1);
            ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
        } else {
            this.field_q = this.field_q - 1;
        }
        if (param0 != 4) {
            this.field_mb = -42;
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var4 = 0;
        for (var5 = param2; var5 < param1; var5++) {
            var6 = this.field_w[var5];
            var7 = var6 / this.field_O;
            if (gg.field_B > var7) {
                gg.field_B = var7;
            }
            if (gi.field_a < var7) {
                gi.field_a = var7;
            }
            var4 = var4 + var7;
        }
        return 128 - -(var4 * 256 / (param1 + -param2));
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
        return var4 + (var3 << 4);
    }

    final void s(int param0) {
        rf discarded$2 = null;
        bh discarded$3 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rf var4_ref_rf = null;
        int var5_int = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ei var11 = null;
        ei var13 = null;
        ei var14 = null;
        int[] var17 = null;
        int stackIn_94_0 = 0;
        int stackIn_111_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (this.field_S) {
            break L0;
          } else {
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (this.field_zb <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= this.field_C) {
                    break L0;
                  } else {
                    var4 = -1073741824;
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= this.field_zb) {
                        var5_int = 1073741823;
                        var6 = -1 + this.field_zb;
                        L4: while (true) {
                          if (0 > var6) {
                            var3++;
                            continue L2;
                          } else {
                            L5: {
                              var2 = this.field_C * var6 - -var3;
                              var7 = var3 + this.field_q;
                              if (var7 < 0) {
                                break L5;
                              } else {
                                if (this.field_O > var7) {
                                  var8 = this.field_L - -var6 - -1;
                                  var9 = 0;
                                  L6: while (true) {
                                    if (var5_int <= var9) {
                                      break L5;
                                    } else {
                                      L7: {
                                        if (var8 >= this.field_a) {
                                          break L7;
                                        } else {
                                          if (var8 >= 0) {
                                            if (this.field_P[var7 + this.field_O * var8] != 0) {
                                              break L7;
                                            } else {
                                              var9 += 80;
                                              var8++;
                                              continue L6;
                                            }
                                          } else {
                                            var9 += 80;
                                            var8++;
                                            continue L6;
                                          }
                                        }
                                      }
                                      var5_int = var9;
                                      break L5;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              var8 = this.field_tb[var2];
                              var9 = this.field_b[var2];
                              if (var8 > var5_int) {
                                L9: {
                                  if (var9 <= 0) {
                                    break L9;
                                  } else {
                                    var9 = -var9;
                                    break L9;
                                  }
                                }
                                var8 = var5_int;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            this.field_tb[var2] = var8;
                            this.field_b[var2] = var9;
                            var5_int += 80;
                            if (this.field_T[var2] != 0) {
                              if (var5_int > var8) {
                                var5_int = var8;
                                var6--;
                                continue L4;
                              } else {
                                var6--;
                                continue L4;
                              }
                            } else {
                              var6--;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        L10: {
                          var2 = var3 + var5_int * this.field_C;
                          var6 = this.field_q + var3;
                          if (var6 < 0) {
                            break L10;
                          } else {
                            if (this.field_O > var6) {
                              var7 = this.field_L - (-var5_int + 1);
                              var8 = 0;
                              L11: while (true) {
                                if (var7 < 0) {
                                  break L10;
                                } else {
                                  if (var4 >= var8) {
                                    break L10;
                                  } else {
                                    if (var7 < this.field_a) {
                                      if (0 != this.field_P[var6 + var7 * this.field_O]) {
                                        var4 = var8;
                                        break L10;
                                      } else {
                                        var7--;
                                        var8 -= 80;
                                        continue L11;
                                      }
                                    } else {
                                      var7--;
                                      var8 -= 80;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        L12: {
                          var7 = this.field_tb[var2];
                          var8 = this.field_b[var2];
                          if (var7 < var4) {
                            var7 = var4;
                            if (0 > var8) {
                              var8 = -var8;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                        this.field_tb[var2] = var7;
                        this.field_b[var2] = var8;
                        var4 -= 80;
                        if (this.field_T[var2] != 0) {
                          if (var4 < var7) {
                            var4 = var7;
                            var5_int++;
                            continue L3;
                          } else {
                            var5_int++;
                            continue L3;
                          }
                        } else {
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L13: while (true) {
                  if (this.field_C <= var4) {
                    var3++;
                    continue L1;
                  } else {
                    L14: {
                      var5_int = this.field_tb[var2];
                      var6 = this.field_b[var2];
                      if (var5_int < 0) {
                        var6 = var6 - (var5_int >> 1);
                        break L14;
                      } else {
                        var6 = var6 + (-var5_int >> 1);
                        break L14;
                      }
                    }
                    L15: {
                      var5_int = var5_int + var6;
                      if (0 <= var5_int) {
                        var5_int = var5_int + (-var5_int >> 4);
                        break L15;
                      } else {
                        var5_int = var5_int - (var5_int >> 4);
                        break L15;
                      }
                    }
                    this.field_tb[var2] = var5_int;
                    this.field_b[var2] = var6;
                    var2++;
                    var4++;
                    continue L13;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (this.field_vb != null) {
            this.field_R = this.field_R + 1;
            if (100 > this.field_R) {
              break L16;
            } else {
              this.field_vb = null;
              break L16;
            }
          } else {
            break L16;
          }
        }
        var2 = 1;
        var3 = 0;
        L17: while (true) {
          if (this.field_t <= var3) {
            L18: {
              if (param0 == -21142) {
                break L18;
              } else {
                this.h(13);
                break L18;
              }
            }
            L19: {
              if (!this.e(-124)) {
                stackOut_93_0 = 0;
                stackIn_94_0 = stackOut_93_0;
                break L19;
              } else {
                stackOut_92_0 = 1;
                stackIn_94_0 = stackOut_92_0;
                break L19;
              }
            }
            var3 = stackIn_94_0;
            L20: while (true) {
              L21: {
                if (this.field_t <= 0) {
                  break L21;
                } else {
                  if (-14 < this.field_X[0].field_e) {
                    break L21;
                  } else {
                    discarded$2 = this.p(127);
                    continue L20;
                  }
                }
              }
              L22: {
                if (this.field_cb == null) {
                  break L22;
                } else {
                  if (this.field_cb.c((byte) 70) == null) {
                    break L22;
                  } else {
                    L23: {
                      if (-1 == this.field_pb) {
                        this.b(false);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (this.field_pb != 322) {
                        break L24;
                      } else {
                        this.c(0);
                        break L24;
                      }
                    }
                    this.field_pb = this.field_pb + 1;
                    if (335 == this.field_pb) {
                      this.field_pb = 0;
                      discarded$3 = this.field_cb.a(param0 + 21146);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L25: {
                if (!this.e(param0 ^ 21190)) {
                  stackOut_110_0 = 0;
                  stackIn_111_0 = stackOut_110_0;
                  break L25;
                } else {
                  stackOut_109_0 = 1;
                  stackIn_111_0 = stackOut_109_0;
                  break L25;
                }
              }
              L26: {
                var4 = stackIn_111_0;
                if (var2 == 0) {
                  if (var3 == 0) {
                    break L26;
                  } else {
                    if (var4 == 0) {
                      ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
                      break L26;
                    } else {
                      if (var4 != 0) {
                        break L26;
                      } else {
                        ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
                        break L26;
                      }
                    }
                  }
                } else {
                  if (var3 == 0) {
                    break L26;
                  } else {
                    if (var4 != 0) {
                      break L26;
                    } else {
                      ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
                      break L26;
                    }
                  }
                }
              }
              L27: {
                if (var4 != 0) {
                  ah.field_b[this.field_Q] = true;
                  var13 = ik.field_c[this.field_Q];
                  var5 = var13;
                  if (var5 == null) {
                    var6 = 100 + rd.a((byte) 16, 4, this.field_Q);
                    var11 = ei.c(kf.field_P, var6, pb.field_d * this.field_J, this.field_sb << 6);
                    var14 = var11;
                    var14.f(-1);
                    dg.field_c.a(var11);
                    ik.field_c[this.field_Q] = var11;
                    break L27;
                  } else {
                    var13.b(en.field_o / 50, pb.field_d * this.field_J, this.field_sb << 6);
                    break L27;
                  }
                } else {
                  break L27;
                }
              }
              return;
            }
          } else {
            L28: {
              var4_ref_rf = this.field_X[var3];
              if (null != var4_ref_rf.field_c) {
                break L28;
              } else {
                if (var4_ref_rf.field_l <= 18) {
                  var2 = 0;
                  break L28;
                } else {
                  break L28;
                }
              }
            }
            L29: {
              if (var2 == 0) {
                break L29;
              } else {
                if (0 >= var4_ref_rf.field_l) {
                  break L29;
                } else {
                  L30: {
                    if (18 != var4_ref_rf.field_l) {
                      break L30;
                    } else {
                      this.b(false);
                      break L30;
                    }
                  }
                  var4_ref_rf.field_l = var4_ref_rf.field_l - 1;
                  var5_int = var4_ref_rf.field_m - -1;
                  if (var4_ref_rf.field_l != 12) {
                    break L29;
                  } else {
                    if (var5_int >= 5) {
                      L31: {
                        this.field_vb = cm.a((byte) 105, uj.field_b, new String[]{Integer.toString(var5_int)});
                        this.field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
                        this.field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
                        this.field_R = 0;
                        var17 = vl.field_G;
                        var7 = var5_int / 10;
                        if (var17.length <= var7) {
                          var7 = var17.length + -1;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      this.field_xb = var17[var7];
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
              }
            }
            if (var4_ref_rf.field_e > 0) {
              var4_ref_rf.field_e = var4_ref_rf.field_e + 1;
              var3++;
              continue L17;
            } else {
              var3++;
              continue L17;
            }
          }
        }
    }

    lk(boolean param0, int param1, int param2, int param3, int param4) {
        L0: {
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
            this.field_a = 18;
            this.field_O = 8;
            break L0;
          } else {
            this.field_O = 12;
            this.field_a = 27;
            break L0;
          }
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
