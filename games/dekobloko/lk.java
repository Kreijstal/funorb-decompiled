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
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
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
            if (-25 == (var5 & 24 ^ -1)) {
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
        int[] array$0 = null;
        int incrementValue$1 = 0;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
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
          array$0 = new int[this.field_C * this.field_zb];
          var2 = array$0;
          this.field_B = array$0;
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
          if (var4 >= this.field_zb) {
            var4 = this.field_db + -this.field_zb + this.field_C - -this.field_o >> 2027132385;
            var5 = this.field_o + (this.field_zb + (-this.field_C - this.field_db)) >> 1485015713;
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
              L4: while (true) {
                if (var6 >= this.field_zb) {
                  ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
                  return true;
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= this.field_C) {
                      var6++;
                      continue L4;
                    } else {
                      this.field_tb[var3] = 0;
                      this.field_b[var3] = (-1 + (this.field_C + this.field_db - var7 * 2)) * -8 / this.field_C;
                      var3++;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            var5 = -var4 + (-1 + this.field_zb);
            var6 = 0;
            L6: while (true) {
              if (this.field_C <= var6) {
                var4++;
                continue L3;
              } else {
                incrementValue$1 = var3;
                var3++;
                this.field_B[var5] = this.field_T[incrementValue$1];
                var5 = var5 + this.field_zb;
                var6++;
                continue L6;
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
                    if (-1 <= (var4 ^ -1)) {
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
              if ((1879048192 & var7 ^ -1) == -1) {
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
        int var2 = 95 % ((param0 - 43) / 54);
        return 80 + this.field_g * this.field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var4 = 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (-1 < (param2 ^ -1)) {
              break L0;
            } else {
              if (param0 >= this.field_O) {
                break L0;
              } else {
                if (this.field_a <= param2) {
                  break L0;
                } else {
                  var4 = this.field_P[param0 + this.field_O * param2];
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          var5 = 101 / ((param1 - 24) / 52);
          if (this.field_C == 0) {
            break L1;
          } else {
            if (this.field_S) {
              break L1;
            } else {
              var6 = -this.field_q + param0;
              var7 = -this.field_L + param2;
              if ((var6 ^ -1) > -1) {
                break L1;
              } else {
                if (-1 < (var7 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_C <= var6) {
                    break L1;
                  } else {
                    if (this.field_zb <= var7) {
                      break L1;
                    } else {
                      var8 = this.field_T[var7 * this.field_C + var6];
                      if (var8 != 0) {
                        var4 = var8;
                        break L1;
                      } else {
                        break L1;
                      }
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_77_0;
        lk stackIn_77_1;
        oi stackIn_77_2;
        int stackIn_77_3;
        int stackIn_77_4;
        Object stackIn_78_0;
        lk stackIn_78_1;
        oi stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_78_5;
        int stackIn_89_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
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
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            var12_int = this.field_P[param6];
            if ((var12_int & -1879048193) >> -1240422525 != param1) {
              stackIn_4_0 = 0;
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
                      if (-2 != param5) {
                        break L2;
                      } else {
                        var14 = 0;
                        L3: while (true) {
                          if (-8 >= (var14 ^ -1)) {
                            break L2;
                          } else {
                            var13 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
                            var14++;
                            continue L3;
                          }
                        }
                      }
                    }
                    stackIn_13_0 = var13;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
                          incrementValue$0 = var14;
                          var14++;
                          var18 = this.field_w[incrementValue$0];
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
                          incrementValue$1 = var14;
                          var14++;
                          var19 = this.field_w[incrementValue$1];
                          if ((var19 % this.field_O ^ -1) >= -1) {
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
                        if ((param7 ^ -1) != -4) {
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
                    stackIn_77_0 = this;

                    stackIn_77_1 = (lk) (param3);

                    stackIn_77_2 = (oi) (param8);

                    stackIn_77_3 = var12_int;

                    stackIn_77_4 = 0;

                    if (-3 < (this.field_D ^ -1)) {
                      stackIn_78_0 = this;
                      stackIn_78_1 = (lk) ((Object) stackIn_77_1);
                      stackIn_78_2 = (oi) ((Object) stackIn_77_2);
                      stackIn_78_3 = stackIn_77_3;
                      stackIn_78_4 = stackIn_77_4;
                      stackIn_78_5 = var18;
                      break L26;
                    } else {
                      stackIn_78_0 = this;
                      stackIn_78_1 = (lk) ((Object) stackIn_77_1);
                      stackIn_78_2 = (oi) ((Object) stackIn_77_2);
                      stackIn_78_3 = stackIn_77_3;
                      stackIn_78_4 = stackIn_77_4;
                      stackIn_78_5 = var15;
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
                            if (-3 != (var21 >> -536593437 ^ -1)) {
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
              stackIn_89_0 = var13;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var12 = decompiledCaughtException;
            stackIn_92_0 = (RuntimeException) (var12);

            stackIn_92_1 = new StringBuilder().append("lk.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L31;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_95_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L32;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L32;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_93_0), stackIn_96_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_89_0;
          }
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (0 == this.field_C) {
          throw new IllegalStateException();
        } else {
          L0: {
            var3 = (this.field_A ^ -1) & param0;
            this.field_A = param0;
            var4 = 0;
            if (-1 <= (this.field_Ab ^ -1)) {
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
                    fieldTemp$0 = this.field_Cb + 1;
                    this.field_Cb = this.field_Cb + 1;
                    if (fieldTemp$0 != 0) {
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
                      fieldTemp$1 = this.field_Cb - 1;
                      this.field_Cb = this.field_Cb - 1;
                      if (fieldTemp$1 == 0) {
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
              if (-1 == (8 & var3 ^ -1)) {
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
              lk.a(50, -101, 127, 94, false, 20, 66);
              break L5;
            }
          }
          L6: {
            if (var4 != 0) {
              L7: {
                if (0 == this.field_Ab) {
                  break L7;
                } else {
                  if ((param0 & 16) != 0) {
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
                    if (-1 <= (this.field_Ab ^ -1)) {
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
            if (-1 > (this.field_e ^ -1)) {
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
        int var2;
        rf var3;
        int var4;
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
        int[] var15 = null;
        int[] var14 = null;
        int[] var13 = null;
        int[] var7 = null;
        int[] array$0 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$1 = 0;
        int var12 = client.field_A ? 1 : 0;
        this.field_L = param5;
        this.field_q = param4;
        for (param2 = param0 & -this.field_ab + param2; -1 > (param2 ^ -1); param2--) {
            var15 = this.field_B;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            if (var13 == null || this.field_zb * this.field_C > var15.length) {
                array$0 = new int[this.field_C * this.field_zb];
                var7 = array$0;
                this.field_B = array$0;
            }
            var8 = 0;
            for (var9 = 0; this.field_zb > var9; var9++) {
                var10 = -1 + this.field_zb - var9;
                for (var11 = 0; this.field_C > var11; var11++) {
                    incrementValue$1 = var8;
                    var8++;
                    this.field_B[var10] = this.field_T[incrementValue$1];
                    var10 = var10 + this.field_zb;
                }
            }
            var8 = this.field_C;
            this.field_C = this.field_zb;
            this.field_B = this.field_T;
            this.field_zb = var8;
            this.field_T = var7;
        }
        this.a(param1, (byte) 126, param3);
    }

    final void a(int param0, int param1, rf param2) {
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
                      if (-1 == (1 & (this.field_C ^ this.field_zb) ^ -1)) {
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
                              var8 = (-1 + this.field_C) * var6 >> 1653217089;
                              var9 = var6 * (this.field_zb - 1) >> 847858401;
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
                                if (0 != this.field_T[var7]) {
                                  var5 = var5 + var8;
                                  var6++;
                                  var4_int = var4_int + var9;
                                  var7++;
                                  var9++;
                                  continue L8;
                                } else {
                                  var7++;
                                  var9++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      this.field_Cb = 0;
                      this.field_q = -this.field_C + this.field_O >> -433015551;
                      this.field_A = 0;
                      this.field_L = -this.field_zb + 1 + this.field_z;
                      this.field_yb = param1;
                      this.field_ab = 0;
                      stackIn_30_0 = this;

                      if (-3 >= (this.field_g ^ -1)) {
                        stackIn_31_0 = this;
                        stackIn_31_1 = this.field_g;
                        break L9;
                      } else {
                        stackIn_31_0 = this;
                        stackIn_31_1 = 2;
                        break L9;
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
          L10: {
            var4 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var4);

            stackIn_35_1 = new StringBuilder().append("lk.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
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
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
            if (-6 >= (var3 ^ -1)) {
              return false;
            } else {
              var4 = this.field_w[var3];
              var5 = var4 % this.field_O;
              var6 = var4 / this.field_O;
              var7 = 15;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (5 <= var8) {
                      stackIn_37_0 = -1;
                      stackIn_37_1 = var7 ^ -1;
                      break L4;
                    } else {
                      stackIn_37_0 = var8;

                      stackIn_37_1 = var3;

                      L5: {
                        if (stackIn_37_0 == stackIn_37_1) {
                          break L5;
                        } else {
                          L6: {
                            var9 = this.field_w[var8];
                            var10 = var9 % this.field_O;
                            var10 = var10 - var5;
                            var11 = var9 / this.field_O;
                            var11 = var11 - var6;
                            if (-1 != (var11 ^ -1)) {
                              break L6;
                            } else {
                              L7: {
                                if (0 == (var10 ^ -1)) {
                                  break L7;
                                } else {
                                  if (var10 == 1) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var7 = var7 & 3;
                              break L5;
                            }
                          }
                          L8: {
                            if ((var10 ^ -1) != -1) {
                              break L8;
                            } else {
                              L9: {
                                if (var11 == -1) {
                                  break L9;
                                } else {
                                  if ((var11 ^ -1) != -2) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var7 = var7 & 12;
                              break L5;
                            }
                          }
                          L10: {
                            if (-1 != var10) {
                              break L10;
                            } else {
                              if ((var11 ^ -1) != 0) {
                                break L10;
                              } else {
                                var7 = var7 & 5;
                                break L5;
                              }
                            }
                          }
                          L11: {
                            if (-2 != (var10 ^ -1)) {
                              break L11;
                            } else {
                              if (var11 == -1) {
                                var7 = var7 & 9;
                                break L5;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (0 != (var10 ^ -1)) {
                              break L12;
                            } else {
                              if (-2 == (var11 ^ -1)) {
                                var7 = var7 & 6;
                                break L5;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if ((var10 ^ -1) != -2) {
                            break L3;
                          } else {
                            if ((var11 ^ -1) == -2) {
                              var7 = var7 & 10;
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                  if (stackIn_37_0 == stackIn_37_1) {
                    break L3;
                  } else {
                    return true;
                  }
                }
                var3++;
                continue L1;
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
        if (-1 > (this.field_C ^ -1) && !this.field_S) {
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
        int var3 = 0;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        int var2 = this.field_C * this.field_zb;
        for (var3 = 0; var2 > var3; var3++) {
            var4 = this.field_T[var3];
            if (!(0 == var4)) {
                return (var4 & 24) >> 1983512195;
            }
        }
        if (param0 < 35) {
            this.field_T = (int[]) null;
            return 0;
        }
        return 0;
    }

    final boolean n(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        lk var6;
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
                if (-4 != (var4 ^ -1)) {
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
            if (w.field_H != null && w.field_H.a(param4, param3, param0, 0, param5)) {
                param4 = false;
                tf.i((byte) -78);
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        ud stackIn_87_0 = null;
        RuntimeException stackIn_305_0 = null;
        StringBuilder stackIn_305_1 = null;
        RuntimeException stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        String stackIn_306_2 = null;
        StringBuilder stackIn_308_1 = null;
        StringBuilder stackIn_309_1 = null;
        String stackIn_309_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var9_ref_ud = null;
        int var10 = 0;
        ei var10_ref_ei = null;
        ei var11_ref_ei = null;
        int var11 = 0;
        ei[] var11_ref_ei__ = null;
        int var12 = 0;
        ei var13 = null;
        int var14 = 0;
        ei var15 = null;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
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
                      if (-1 == (this.field_ib ^ -1)) {
                        var6 = 0;
                        var7 = 0;
                        var8 = -1 + this.field_a * this.field_O;
                        var9 = this.field_a + -1;
                        L4: while (true) {
                          if (-1 < (var9 ^ -1)) {
                            L5: {
                              if (this.field_l != 0) {
                                stackIn_87_0 = rc.field_i;
                                break L5;
                              } else {
                                stackIn_87_0 = bf.field_u;
                                break L5;
                              }
                            }
                            L6: {
                              var9_ref_ud = stackIn_87_0;
                              if ((var6 ^ -1) < -1) {
                                L7: {
                                  pg.field_a[this.field_Q] = true;
                                  var10 = (int)(0.5 + (double)this.field_k * Math.sqrt((double)var6));
                                  if (4 * this.field_k >= var10) {
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
                                        var11_ref_ei.b(en.field_o / 50, var10 * pb.field_d, this.field_lb << 522231430);
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
                                var16 = ei.c(var9_ref_ud, 100, var10 * pb.field_d, this.field_lb << -273244250);
                                var11_ref_ei = var16;
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
                              if (-1 < (var10 ^ -1)) {
                                var9--;
                                continue L4;
                              } else {
                                var11 = this.field_P[var8];
                                if ((var11 ^ -1) != -1) {
                                  L14: {
                                    L15: {
                                      if (param2) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (16 == (var11 & 24)) {
                                            break L16;
                                          } else {
                                            if (-25 != (var11 & 24 ^ -1)) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        if (var9 >= -1 + this.field_a) {
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
                                          if ((var11 & 24 ^ -1) == -17) {
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
                                            if (var10 + this.field_l >= this.field_O) {
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
                                          if ((var11 & 24 ^ -1) == -17) {
                                            break L20;
                                          } else {
                                            if ((var11 & 24 ^ -1) != -25) {
                                              break L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (this.field_a + -1 <= var9) {
                                          break L19;
                                        } else {
                                          if ((-this.field_l + var10 ^ -1) > -1) {
                                            break L19;
                                          } else {
                                            if (this.field_O <= -this.field_l + var10) {
                                              break L19;
                                            } else {
                                              if (this.field_P[-this.field_l + var8] != 0) {
                                                break L19;
                                              } else {
                                                if (-1 != (this.field_P[-this.field_l + (var8 + this.field_O)] ^ -1)) {
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
                                        if (-449 >= (var11 ^ -1)) {
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
                                  var8--;
                                  var10--;
                                  continue L13;
                                } else {
                                  var8--;
                                  var10--;
                                  continue L13;
                                }
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
                                    if (var7 >= this.field_a * this.field_O) {
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
                          var8 = this.field_P[var7];
                          if (-33 >= (var8 ^ -1)) {
                            L30: {
                              var8 += 32;
                              if ((var8 ^ -1) > -417) {
                                var6 = 0;
                                break L30;
                              } else {
                                var8 = 0;
                                break L30;
                              }
                            }
                            var5_int = 1;
                            this.field_P[var7] = var8;
                            var7++;
                            continue L24;
                          } else {
                            var7++;
                            continue L24;
                          }
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
                        L31: while (true) {
                          if (var7 >= this.field_a * this.field_O) {
                            break L2;
                          } else {
                            L32: {
                              var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                              if (var8 > 0) {
                                L33: {
                                  if (this.field_kb) {
                                    L34: {
                                      if (this.a(-101, var8)) {
                                        bj.field_a = true;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    L35: {
                                      if (!this.c(var8, -15303)) {
                                        break L35;
                                      } else {
                                        dn.field_i = true;
                                        break L35;
                                      }
                                    }
                                    if (!this.b(var8, -1)) {
                                      break L33;
                                    } else {
                                      pn.field_db = true;
                                      break L33;
                                    }
                                  } else {
                                    break L33;
                                  }
                                }
                                var6++;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            var7++;
                            continue L31;
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
                  L36: {
                    this.field_K = this.field_K + var6;
                    if (-3 < (var6 ^ -1)) {
                      break L36;
                    } else {
                      L37: {
                        var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 1) / 2;
                        if (this.field_k < var7) {
                          var7 = this.field_k;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      ge.a(this.field_lb, var7, (byte) 127, bf.field_w);
                      break L36;
                    }
                  }
                  L38: {
                    this.field_nb = this.field_nb + 1;
                    if (-3 >= (this.field_nb ^ -1)) {
                      L39: {
                        var7 = (this.field_nb + -1) % 4;
                        var8 = (-1 + this.field_nb) / 4 * 3;
                        if (var7 != 3) {
                          break L39;
                        } else {
                          var8++;
                          break L39;
                        }
                      }
                      ai.a(62, var8, jm.field_v[var7], this.field_lb, this.field_k);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L40: {
                    if (null == this.field_rb) {
                      break L40;
                    } else {
                      L41: {
                        var7 = ik.a((byte) 126, var6);
                        var8 = var7;
                        fb.field_e = fb.field_e + var8;
                        he.field_ab = he.field_ab + var8;
                        this.field_ub = this.field_ub + var7;
                        if (0 < var7) {
                          fieldTemp$0 = gg.field_B;
                          gg.field_B = gg.field_B - 1;
                          this.field_rb.a(new sa(true, this.field_O * 128, -384 + fieldTemp$0 * 256, var7, jg.field_f, -2 + var6, 0, new String[]{cm.a((byte) 85, on.field_h, new String[]{Integer.toString(var6)}), " = <b>", Integer.toString(var7)}), 2777);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      var8 = le.b(32085, this.field_nb);
                      if (0 < var8) {
                        fieldTemp$1 = gg.field_B;
                        gg.field_B = gg.field_B - 1;
                        this.field_W = new sa(true, 128 * this.field_O, -384 + fieldTemp$1 * 256, var8, nf.field_f, this.field_nb + -2, 0, new String[]{cm.a((byte) 115, e.field_d, new String[]{Integer.toString(this.field_nb)}), " = <b>", Integer.toString(var8)});
                        break L40;
                      } else {
                        break L40;
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
              L42: {
                if (var5_int != 0) {
                  break L42;
                } else {
                  if (param2) {
                    break L42;
                  } else {
                    var6 = 1;
                    var7 = 0;
                    L43: while (true) {
                      if (var7 >= this.field_a * this.field_O) {
                        var7 = -1 + (-1 + this.field_a) * this.field_O;
                        var8 = this.field_a - 2;
                        L44: while (true) {
                          if (var8 < 0) {
                            var7 = this.field_O * (-1 + this.field_a) - 1;
                            var8 = -2 + this.field_a;
                            L45: while (true) {
                              if ((var8 ^ -1) > -1) {
                                this.a(-121, false, 2);
                                var8 = 0;
                                var7 = -1 + this.field_O * this.field_a;
                                var9 = 0;
                                var10 = -1 + this.field_a;
                                L46: while (true) {
                                  if (-1 < (var10 ^ -1)) {
                                    L47: {
                                      if (0 >= var8) {
                                        break L47;
                                      } else {
                                        L48: {
                                          var10 = kd.field_s[0][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[0];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var8))) / 2;
                                          if (var12 > this.field_k) {
                                            var12 = this.field_k;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                        L49: {
                                          if (var12 >= var10) {
                                            break L49;
                                          } else {
                                            var12 = var10;
                                            break L49;
                                          }
                                        }
                                        kd.field_s[0][this.field_Q] = var12;
                                        var13 = var11_ref_ei__[this.field_Q];
                                        if (var13 == null) {
                                          var17 = ei.c(ob.field_n, 100, pb.field_d * var12, this.field_lb << -1195698778);
                                          var17.f(-1);
                                          dg.field_c.a(var17);
                                          var11_ref_ei__[this.field_Q] = var17;
                                          break L47;
                                        } else {
                                          var13.b(en.field_o / 50, var12 * pb.field_d, this.field_lb << -432303322);
                                          break L47;
                                        }
                                      }
                                    }
                                    L50: {
                                      if (0 < var9) {
                                        L51: {
                                          var10 = kd.field_s[1][this.field_Q];
                                          var11_ref_ei__ = sk.field_a[1];
                                          var12 = (1 + (int)((double)this.field_k * Math.sqrt((double)var9))) / 2;
                                          if (this.field_k >= var12) {
                                            break L51;
                                          } else {
                                            var12 = this.field_k;
                                            break L51;
                                          }
                                        }
                                        L52: {
                                          if (var12 >= var10) {
                                            break L52;
                                          } else {
                                            var12 = var10;
                                            break L52;
                                          }
                                        }
                                        kd.field_s[1][this.field_Q] = var12;
                                        var13 = var11_ref_ei__[this.field_Q];
                                        if (var13 == null) {
                                          var18 = ei.c(ob.field_n, 120, var12 * pb.field_d, this.field_lb << -297612698);
                                          var18.f(-1);
                                          dg.field_c.a(var18);
                                          var11_ref_ei__[this.field_Q] = var18;
                                          break L50;
                                        } else {
                                          var13.b(en.field_o / 50, pb.field_d * var12, this.field_lb << -59157402);
                                          break L50;
                                        }
                                      } else {
                                        break L50;
                                      }
                                    }
                                    if (var5_int == 0) {
                                      break L42;
                                    } else {
                                      if (var6 == 0) {
                                        break L42;
                                      } else {
                                        this.field_ib = 0;
                                        this.field_s = false;
                                        break L42;
                                      }
                                    }
                                  } else {
                                    var11 = this.field_O + -1;
                                    L53: while (true) {
                                      if (var11 < 0) {
                                        var10--;
                                        continue L46;
                                      } else {
                                        L54: {
                                          L55: {
                                            var12 = this.field_P[var7];
                                            if ((31 & var12 ^ -1) == -26) {
                                              break L55;
                                            } else {
                                              if (27 != (var12 & 31)) {
                                                break L54;
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          var5_int = 1;
                                          if (32 > var12) {
                                            L56: {
                                              if (-1 + this.field_a > var10) {
                                                this.field_P[var7 + this.field_O] = var12;
                                                break L56;
                                              } else {
                                                break L56;
                                              }
                                            }
                                            this.field_P[var7] = var12 - -32;
                                            var6 = 0;
                                            if ((7 & var12 ^ -1) == -4) {
                                              var9++;
                                              break L54;
                                            } else {
                                              var8++;
                                              break L54;
                                            }
                                          } else {
                                            L57: {
                                              var12 += 32;
                                              if ((var12 ^ -1) > -417) {
                                                var6 = 0;
                                                break L57;
                                              } else {
                                                var12 = 0;
                                                break L57;
                                              }
                                            }
                                            this.field_P[var7] = var12;
                                            break L54;
                                          }
                                        }
                                        var7--;
                                        var11--;
                                        continue L53;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var9 = -1 + this.field_O;
                                L58: while (true) {
                                  if (-1 < (var9 ^ -1)) {
                                    var8--;
                                    continue L45;
                                  } else {
                                    L59: {
                                      var10 = this.field_P[var7];
                                      if ((var10 ^ -1) != -26) {
                                        break L59;
                                      } else {
                                        if (-1 != (this.field_P[var7 + this.field_O] & 1879048192 ^ -1)) {
                                          break L59;
                                        } else {
                                          discarded$2 = this.a(false, 1, 1, param3, false, -1, var7 - -this.field_O, 3, param0, false, (byte) 123);
                                          break L59;
                                        }
                                      }
                                    }
                                    L60: {
                                      if ((var10 ^ -1) != -28) {
                                        break L60;
                                      } else {
                                        if (0 != (this.field_P[this.field_O + var7] & 1879048192)) {
                                          break L60;
                                        } else {
                                          discarded$3 = this.a(false, 1, 1, param3, true, -1, this.field_O + var7, 3, param0, false, (byte) 72);
                                          break L60;
                                        }
                                      }
                                    }
                                    var7--;
                                    var9--;
                                    continue L58;
                                  }
                                }
                              }
                            }
                          } else {
                            var9 = -1 + this.field_O;
                            L61: while (true) {
                              if (var9 < 0) {
                                var8--;
                                continue L44;
                              } else {
                                L62: {
                                  var10 = this.field_P[var7];
                                  if ((var10 ^ -1) == -26) {
                                    discarded$4 = this.a(false, 2, 1, param3, false, -2, this.field_O + var7, 3, param0, false, (byte) 109);
                                    this.b(-1, this.field_O + var7, false);
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                }
                                L63: {
                                  if (27 == var10) {
                                    discarded$5 = this.a(true, 2, 1, param3, true, -2, this.field_O + var7, 3, param0, false, (byte) -99);
                                    this.b(-1, var7 - -this.field_O, false);
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                                var7--;
                                var9--;
                                continue L61;
                              }
                            }
                          }
                        }
                      } else {
                        var8 = this.field_P[var7];
                        if ((var8 ^ -1) <= -33) {
                          if ((var8 & 31 ^ -1) != -26) {
                            if ((var8 & 31 ^ -1) != -28) {
                              L64: {
                                var8 += 32;
                                if (var8 < 416) {
                                  var6 = 0;
                                  break L64;
                                } else {
                                  var8 = 0;
                                  break L64;
                                }
                              }
                              this.field_P[var7] = var8;
                              var5_int = 1;
                              var7++;
                              continue L43;
                            } else {
                              var7++;
                              continue L43;
                            }
                          } else {
                            var7++;
                            continue L43;
                          }
                        } else {
                          var7++;
                          continue L43;
                        }
                      }
                    }
                  }
                }
              }
              L65: {
                if (param2) {
                  break L65;
                } else {
                  if (this.field_G == 0) {
                    break L65;
                  } else {
                    var6 = this.field_G;
                    this.field_G = 0;
                    var7 = 0;
                    var8 = 0;
                    L66: while (true) {
                      if (this.field_a * this.field_O <= var8) {
                        this.a(-107, true, this.field_ib);
                        if ((var7 ^ -1) < -1) {
                          var5_int = 1;
                          if (null == this.field_rb) {
                            break L65;
                          } else {
                            var8 = gg.b(var7, 27935);
                            var9 = var8;
                            he.field_ab = he.field_ab + var9;
                            fb.field_e = fb.field_e + var9;
                            this.field_hb = this.field_hb + var8;
                            this.field_rb.a(new sa(true, this.field_O * 128, this.field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[]{" = <b>", Integer.toString(var8)}), 2777);
                            break L65;
                          }
                        } else {
                          break L65;
                        }
                      } else {
                        L67: {
                          var9 = this.field_P[var8];
                          var10 = var9 >> -465067389;
                          if (2 == var10) {
                            break L67;
                          } else {
                            if ((var10 ^ -1) == -2) {
                              break L67;
                            } else {
                              var8++;
                              continue L66;
                            }
                          }
                        }
                        var11 = 1 << (7 & var9);
                        if (0 != (var6 & var11)) {
                          var7 = var7 + this.a(true, var10, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                          var8++;
                          continue L66;
                        } else {
                          var8++;
                          continue L66;
                        }
                      }
                    }
                  }
                }
              }
              L68: {
                if (param2) {
                  break L68;
                } else {
                  L69: {
                    if (this.field_r) {
                      break L69;
                    } else {
                      if (this.field_Y) {
                        break L69;
                      } else {
                        break L68;
                      }
                    }
                  }
                  var6 = 0;
                  L70: while (true) {
                    if (this.field_O * this.field_a <= var6) {
                      L71: {
                        if (this.field_r) {
                          this.field_v = true;
                          ge.a(this.field_lb, this.field_k, (byte) 127, fj.field_k);
                          break L71;
                        } else {
                          break L71;
                        }
                      }
                      L72: {
                        if (this.field_Y) {
                          ge.a(this.field_lb, this.field_k, (byte) 127, w.field_Eb);
                          break L72;
                        } else {
                          break L72;
                        }
                      }
                      this.field_Y = false;
                      this.field_r = false;
                      break L68;
                    } else {
                      var7 = this.field_P[var6];
                      if (-24 != (var7 ^ -1)) {
                        L73: {
                          L74: {
                            L75: {
                              if (!this.field_r) {
                                break L75;
                              } else {
                                if (var7 >> 1910143171 == 1) {
                                  break L74;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            if (this.field_Y) {
                              if ((var7 >> 585718723 ^ -1) == -3) {
                                break L74;
                              } else {
                                break L73;
                              }
                            } else {
                              var6++;
                              continue L70;
                            }
                          }
                          this.field_P[var6] = qm.b(24, var7);
                          break L73;
                        }
                        var6++;
                        continue L70;
                      } else {
                        var6++;
                        continue L70;
                      }
                    }
                  }
                }
              }
              L76: {
                if (this.field_N != null) {
                  this.field_mb = this.field_mb + 1;
                  if (13 == this.field_mb) {
                    this.field_N = null;
                    break L76;
                  } else {
                    break L76;
                  }
                } else {
                  break L76;
                }
              }
              L77: {
                if (param2) {
                  break L77;
                } else {
                  if (var5_int != 0) {
                    break L77;
                  } else {
                    if (null != this.field_N) {
                      break L77;
                    } else {
                      if (this.field_jb <= 0) {
                        break L77;
                      } else {
                        if (this.field_Z != this.field_z) {
                          ge.a(this.field_lb, this.field_k, (byte) 127, qa.field_s);
                          var6 = this.field_z;
                          L78: while (true) {
                            if (var6 >= this.field_Z) {
                              this.field_L = this.field_L + (this.field_Z - this.field_z);
                              var5_int = 1;
                              this.field_z = this.field_Z;
                              break L77;
                            } else {
                              var7 = 0;
                              L79: while (true) {
                                if (var7 >= this.field_O) {
                                  var6++;
                                  continue L78;
                                } else {
                                  L80: {
                                    var8 = this.field_P[var6 * this.field_O + var7];
                                    if (-1 == (var8 ^ -1)) {
                                      break L80;
                                    } else {
                                      this.field_P[var6 * this.field_O - -var7] = 32 + var8;
                                      this.field_ib = 1;
                                      break L80;
                                    }
                                  }
                                  var7++;
                                  continue L79;
                                }
                              }
                            }
                          }
                        } else {
                          break L77;
                        }
                      }
                    }
                  }
                }
              }
              L81: {
                L82: {
                  if (var5_int != 0) {
                    break L82;
                  } else {
                    if (this.field_N != null) {
                      break L82;
                    } else {
                      if (!param2) {
                        L83: {
                          this.field_S = false;
                          this.field_s = false;
                          this.field_ib = 0;
                          this.field_v = false;
                          if (this.field_rb == null) {
                            break L83;
                          } else {
                            if (this.field_W != null) {
                              this.field_j = this.field_j + this.field_W.field_t;
                              var6 = this.field_W.field_t;
                              fb.field_e = fb.field_e + var6;
                              he.field_ab = he.field_ab + var6;
                              this.field_rb.a(this.field_W, 2777);
                              this.field_W = null;
                              break L83;
                            } else {
                              break L83;
                            }
                          }
                        }
                        L84: {
                          if (this.c((byte) -117)) {
                            this.field_L = this.field_L - 1;
                            break L84;
                          } else {
                            break L84;
                          }
                        }
                        this.field_M = this.o(32);
                        break L82;
                      } else {
                        break L81;
                      }
                    }
                  }
                }
                break L81;
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
          L85: {
            var5 = decompiledCaughtException;
            stackIn_305_0 = (RuntimeException) (var5);

            stackIn_305_1 = new StringBuilder().append("lk.WA(");

            if (param0 == null) {
              stackIn_306_0 = (RuntimeException) ((Object) stackIn_305_0);
              stackIn_306_1 = (StringBuilder) ((Object) stackIn_305_1);
              stackIn_306_2 = "null";
              break L85;
            } else {
              stackIn_306_0 = (RuntimeException) ((Object) stackIn_305_0);
              stackIn_306_1 = (StringBuilder) ((Object) stackIn_305_1);
              stackIn_306_2 = "{...}";
              break L85;
            }
          }
          L86: {


            stackIn_308_1 = ((StringBuilder) (Object) stackIn_306_1).append(stackIn_306_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_306_0 = (RuntimeException) ((Object) stackIn_306_0);
              stackIn_309_1 = (StringBuilder) ((Object) stackIn_308_1);
              stackIn_309_2 = "null";
              break L86;
            } else {
              stackIn_306_0 = (RuntimeException) ((Object) stackIn_306_0);
              stackIn_309_1 = (StringBuilder) ((Object) stackIn_308_1);
              stackIn_309_2 = "{...}";
              break L86;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_306_0), stackIn_309_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        if (param0 < 35) {
            mm var2 = (mm) null;
            lk.a((mm) null, true, (mm) null, -73);
        }
        field_i = null;
    }

    private final void b(byte param0) {
        this.field_q = this.field_q - 1;
        if (this.c((byte) -117)) {
            this.field_q = this.field_q + 1;
        } else {
            this.h(param0 + 115);
            ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
        }
        if (param0 != -116) {
            this.field_j = 63;
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
            this.field_pb = -32;
        }
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
        if (param0 <= 121) {
            return (rf) null;
        }
        this.field_t = this.field_t - 1;
        return var2;
    }

    final void a(boolean param0, wl param1, byte param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.e(3);
              stackIn_3_0 = this;

              if (-1 == (var4_int & 256 ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((lk) (this)).field_S = stackIn_4_1 != 0;
              this.field_ab = (1616 & var4_int) >> 2050439561;
              this.field_o = (-1073741824 & var4_int << -818043813) >> 627226110;
              stackIn_6_0 = this;

              if (0 == (64 & var4_int)) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
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
              this.field_db = (-1073741824 & var4_int << 2113050941) >> 1576984158;
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
                  if (-129 >= (var6 ^ -1)) {
                    var7 = param1.d((byte) -102);
                    var6 = 127 & var6 | var7 << 1559143495;
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
            stackIn_32_0 = (RuntimeException) (var4);

            stackIn_32_1 = new StringBuilder().append("lk.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
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
            lk var3 = (lk) null;
            this.a((oi) null, -76, false, (lk) null);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        if (param1 <= 123) {
            this.field_pb = -105;
        }
        int var6 = this.field_P[param0];
        if ((-1879048193 & var6) == param4 || (var6 & -1879048193) == param2) {
            incrementValue$0 = param3;
            param3++;
            this.field_w[incrementValue$0] = param0;
            this.field_P[param0] = var6 + -2147483648;
        }
        return param3;
    }

    private final void b(int param0, int param1, boolean param2) {
        int var4;
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
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
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
              if (var11.length < this.field_C * this.field_zb) {
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
          if (this.field_zb <= var4) {
            var4 = -this.field_o + -this.field_zb + (this.field_C - -this.field_db) >> -1674843007;
            this.field_q = this.field_q + var4;
            var5 = this.field_o + this.field_db + (-this.field_C + this.field_zb) >> -212989087;
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
              this.h(param0 ^ -1);
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
                incrementValue$3 = var3;
                var3++;
                this.field_B[var5] = this.field_T[incrementValue$3];
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
                if (-1 >= (var4 ^ -1) && -1 >= (var5 ^ -1) && this.field_C > var4) {
                    if (var5 >= this.field_zb) {
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
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_q + this.field_L * this.field_O;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_zb) {
            if (param0 == -117) {
              return false;
            } else {
              return true;
            }
          } else {
            var5 = 0;
            L1: while (true) {
              if (this.field_C <= var5) {
                var3 = var3 + (this.field_O - this.field_C);
                var4++;
                continue L0;
              } else {
                if (this.field_T[var2] != 0) {
                  L2: {
                    if ((this.field_q - -var5 ^ -1) > -1) {
                      break L2;
                    } else {
                      if (this.field_O <= this.field_q + var5) {
                        break L2;
                      } else {
                        if (this.field_L + var4 < this.field_a) {
                          if ((var4 + this.field_L ^ -1) <= -1) {
                            if (-1 != (this.field_P[var3] ^ -1)) {
                              return true;
                            } else {
                              var2++;
                              var3++;
                              var5++;
                              continue L1;
                            }
                          } else {
                            var2++;
                            var3++;
                            var5++;
                            continue L1;
                          }
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  var2++;
                  var3++;
                  var5++;
                  continue L1;
                }
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
            if ((var5 ^ -1) <= -1 && (var6 ^ -1) <= -1 && var5 < this.field_V && var6 < this.field_h) {
                var7 = this.field_N[var6 * this.field_V + var5];
                if (!(-1 == (var7 ^ -1))) {
                    var4 = this.field_mb;
                }
            }
        }
        return var4;
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = client.field_A ? 1 : 0;
        var4 = 0;
        var5 = -97 % ((83 - param1) / 37);
        L0: while (true) {
          if (this.field_C * this.field_zb <= var4) {
            L1: {
              this.field_Z = param0;
              if (this.field_z <= this.field_L) {
                var4 = 0;
                var5 = this.field_L * this.field_O + this.field_q;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= this.field_zb) {
                    if (0 < var6) {
                      L3: {
                        var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 4) / 8;
                        if (var7 <= this.field_k) {
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
                      if (var8 >= this.field_C) {
                        var5 = var5 + (this.field_O - this.field_C);
                        var7++;
                        continue L2;
                      } else {
                        var9 = this.field_T[var4];
                        if (-1 != (var9 ^ -1)) {
                          L5: {
                            L6: {
                              if ((24 & var9) == 16) {
                                break L6;
                              } else {
                                if (var7 == 0) {
                                  break L6;
                                } else {
                                  if (-1 == (this.field_T[-this.field_C + var4] ^ -1)) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            var9 = var9 | 32;
                            break L5;
                          }
                          L7: {
                            this.field_P[var5] = var9;
                            if ((24 & var9) != 16) {
                              break L7;
                            } else {
                              if (this.field_rb != null) {
                                this.field_x = this.field_x + 25;
                                fb.field_e = fb.field_e + 25;
                                he.field_ab = he.field_ab + 25;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (8 == (24 & var9)) {
                            var6++;
                            var5++;
                            var4++;
                            var8++;
                            continue L4;
                          } else {
                            var5++;
                            var4++;
                            var8++;
                            continue L4;
                          }
                        } else {
                          var5++;
                          var4++;
                          var8++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                L8: {
                  this.field_jb = this.field_jb - 1;
                  if (!param2) {
                    break L8;
                  } else {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    break L8;
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
                  L9: while (true) {
                    if (this.field_L > var6) {
                      this.field_mb = 1;
                      ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
                      break L1;
                    } else {
                      var7 = -1 + (this.field_q - -this.field_C);
                      L10: while (true) {
                        if (this.field_q > var7) {
                          var6--;
                          continue L9;
                        } else {
                          L11: {
                            var5--;
                            var8 = this.field_T[var5];
                            if ((24 & var8) == 16) {
                              break L11;
                            } else {
                              if (24 == (var8 & 24)) {
                                break L11;
                              } else {
                                this.field_N[var5] = var8;
                                var7--;
                                continue L10;
                              }
                            }
                          }
                          L12: {
                            var9 = var6;
                            if (var9 >= this.field_z) {
                              break L12;
                            } else {
                              var9 = this.field_z;
                              break L12;
                            }
                          }
                          L13: {
                            if (this.field_a <= var9) {
                              break L13;
                            } else {
                              if (-1 != (this.field_P[var7 + this.field_O * var9] ^ -1)) {
                                break L13;
                              } else {
                                this.field_P[var7 + this.field_O * var9] = 32 + var8;
                                if (16 == (var8 & 24)) {
                                  if (this.field_rb != null) {
                                    fb.field_e = fb.field_e + 25;
                                    he.field_ab = he.field_ab + 25;
                                    this.field_x = this.field_x + 25;
                                    var7--;
                                    continue L10;
                                  } else {
                                    var7--;
                                    continue L10;
                                  }
                                } else {
                                  var7--;
                                  continue L10;
                                }
                              }
                            }
                          }
                          this.field_N[var5] = var8;
                          var7--;
                          continue L10;
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
            if (-1 != (this.field_T[var4] ^ -1)) {
              this.field_qb = this.field_qb + 1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
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
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_14_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param0) {
            if (param1 == -1) {
              L1: {
                L2: {
                  if (var3 == 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L2;
                    } else {
                      stackIn_14_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_14_0 = 0;
                break L1;
              }
              return stackIn_14_0 != 0;
            } else {
              return true;
            }
          } else {
            L3: {
              var6 = this.field_w[var5];
              if ((var6 ^ -1) > (this.field_O ^ -1)) {
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
        int var5;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int var4;
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
            if (param1 != 0) {
              break L2;
            } else {
              if (this.field_y) {
                this.field_Bb = true;
                break L2;
              } else {
                L3: {
                  stackIn_7_0 = this;

                  stackIn_7_1 = -126;

                  if (0 != param2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = 1;
                    break L3;
                  }
                }
                if (this.a((byte) stackIn_8_1, stackIn_8_2 != 0)) {
                  this.field_e = 20;
                  this.field_y = true;
                  break L2;
                } else {
                  param2++;
                  param1 = this.field_g;
                  this.field_e = this.field_g;
                  continue L1;
                }
              }
            }
          }
          L4: {
            if (this.field_g != 0) {
              break L4;
            } else {
              if (-1 > (param2 ^ -1)) {
                L5: {
                  var4 = ((int)((double)this.field_k * Math.sqrt((double)(this.field_a - -param2) / ((double)this.field_a * 2.0))) + 4) / 8;
                  if (var4 > this.field_k) {
                    var4 = this.field_k;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ge.a(this.field_lb, var4, (byte) 127, fh.field_c);
                break L4;
              } else {
                break L4;
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
        int discarded$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var11;
        int var8;
        int var9;
        int var10;
        var11 = client.field_A ? 1 : 0;
        if (4 == param1) {
          L0: {
            if (param0 < -45) {
              break L0;
            } else {
              discarded$1 = this.a(-31, -66, (byte) 71, -102);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if ((var3 ^ -1) <= -5) {
              return false;
            } else {
              var4 = this.field_w[var3];
              var5 = var4 % this.field_O;
              var6 = var4 / this.field_O;
              var7 = 0;
              L2: while (true) {
                if (4 <= var7) {
                  return true;
                } else {
                  if (var3 != var7) {
                    L3: {
                      var8 = this.field_w[var7];
                      var9 = var8 % this.field_O;
                      var10 = var8 / this.field_O;
                      var9 = var9 - var5;
                      var10 = var10 - var6;
                      if (0 != var9) {
                        break L3;
                      } else {
                        if (var10 != -1) {
                          if (var10 != 1) {
                            break L3;
                          } else {
                            var7++;
                            continue L2;
                          }
                        } else {
                          var7++;
                          continue L2;
                        }
                      }
                    }
                    if (0 == var10) {
                      if (var9 != -1) {
                        if (-2 == (var9 ^ -1)) {
                          var7++;
                          continue L2;
                        } else {
                          var3++;
                          continue L1;
                        }
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var7++;
                    continue L2;
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
              if (param4 <= var10) {
                L3: {
                  var10 = -var6_int + 1 + var8;
                  var11 = var9 - -1 - var7;
                  var12 = var10 * var11;
                  fieldTemp$0 = this.field_fb;
                  this.field_fb = this.field_fb + 1;
                  var13 = fieldTemp$0;
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
                    fieldTemp$1 = this.field_p;
                    this.field_p = this.field_p + 1;
                    var21.field_m = fieldTemp$1;
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
                        decompiledRegionSelector0 = 1;
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
            stackIn_36_0 = (RuntimeException) (var6);

            stackIn_36_1 = new StringBuilder().append("lk.T(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int incrementValue$0 = 0;
        int discarded$1 = 0;
        int var5 = this.field_P[param1];
        if (param3 != (-1879048193 & var5)) {
            this.b(7 & param3, param1, false);
        } else {
            if (-1879048193 < (var5 & 1879048192 ^ -1)) {
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
        int var6 = 0;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var4 = 0;
        int var5 = param2;
        if (!param0) {
            this.field_N = (int[]) null;
        }
        while (var5 < param1) {
            var6 = this.field_w[var5];
            var7 = var6 / this.field_O;
            if ((gg.field_B ^ -1) < (var7 ^ -1)) {
                gg.field_B = var7;
            }
            if (gi.field_a < var7) {
                gi.field_a = var7;
            }
            var4 = var4 + var7;
            var5++;
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
        return var4 + (var3 << -793988540);
    }

    final void s(int param0) {
        rf discarded$0 = null;
        int stackIn_94_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_112_0 = 0;
        int var2;
        int var3;
        int var4;
        rf var4_ref_rf;
        int var5_int;
        ei var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ei var11;
        ei var13;
        int[] var16;
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
                                        if ((var8 ^ -1) <= (this.field_a ^ -1)) {
                                          break L7;
                                        } else {
                                          if (-1 >= (var8 ^ -1)) {
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
                                  if (-1 <= (var9 ^ -1)) {
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
                          if ((var6 ^ -1) > -1) {
                            break L10;
                          } else {
                            if (this.field_O > var6) {
                              var7 = this.field_L - (-var5_int + 1);
                              var8 = 0;
                              L11: while (true) {
                                if (-1 < (var7 ^ -1)) {
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
                        if (-1 != (this.field_T[var2] ^ -1)) {
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
                      if ((var5_int ^ -1) > -1) {
                        var6 = var6 - (var5_int >> -2057940319);
                        break L14;
                      } else {
                        var6 = var6 + (-var5_int >> 1589558273);
                        break L14;
                      }
                    }
                    L15: {
                      var5_int = var5_int + var6;
                      if (0 <= var5_int) {
                        var5_int = var5_int + (-var5_int >> 521635204);
                        break L15;
                      } else {
                        var5_int = var5_int - (var5_int >> -1962291932);
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
                stackIn_94_0 = 0;
                break L19;
              } else {
                stackIn_94_0 = 1;
                break L19;
              }
            }
            var3 = stackIn_94_0;
            L20: while (true) {
              L21: {
                if (this.field_t <= 0) {
                  break L21;
                } else {
                  if (-14 < (this.field_X[0].field_e ^ -1)) {
                    break L21;
                  } else {
                    discarded$0 = this.p(127);
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
                    stackIn_101_0 = -1;
                    stackIn_101_1 = this.field_pb ^ -1;
                    L23: {
                      if (stackIn_101_0 == stackIn_101_1) {
                        this.b(false);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (-323 != (this.field_pb ^ -1)) {
                        break L24;
                      } else {
                        this.c(0);
                        break L24;
                      }
                    }
                    this.field_pb = this.field_pb + 1;
                    if (335 == this.field_pb) {
                      this.field_pb = 0;
                      this.field_cb.a(param0 + 21146);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L25: {
                if (!this.e(param0 ^ 21190)) {
                  stackIn_112_0 = 0;
                  break L25;
                } else {
                  stackIn_112_0 = 1;
                  break L25;
                }
              }
              L26: {
                var4 = stackIn_112_0;
                if (var2 != 0) {
                  if (18 < this.field_wb) {
                    this.field_wb = this.field_wb - 1;
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
                  var5 = ik.field_c[this.field_Q];
                  if (var5 == null) {
                    var6 = 100 + rd.a((byte) 16, 4, this.field_Q);
                    var11 = ei.c(kf.field_P, var6, pb.field_d * this.field_J, this.field_sb << 1719062758);
                    var13 = var11;
                    var13.f(-1);
                    dg.field_c.a(var11);
                    ik.field_c[this.field_Q] = var11;
                    break L27;
                  } else {
                    var5.b(en.field_o / 50, pb.field_d * this.field_J, this.field_sb << -2127177498);
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
                    if (-6 >= (var5_int ^ -1)) {
                      L31: {
                        this.field_vb = cm.a((byte) 105, uj.field_b, new String[]{Integer.toString(var5_int)});
                        this.field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
                        this.field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
                        this.field_R = 0;
                        var16 = vl.field_G;
                        var7 = var5_int / 10;
                        if (var16.length <= var7) {
                          var7 = var16.length + -1;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      this.field_xb = var16[var7];
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
              }
            }
            if ((var4_ref_rf.field_e ^ -1) < -1) {
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
        if (param0) {
            this.field_O = 12;
            this.field_a = 27;
        } else {
            this.field_a = 18;
            this.field_O = 8;
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
