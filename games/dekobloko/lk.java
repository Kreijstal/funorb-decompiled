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
          var3 = ((lk) this).field_C * ((lk) this).field_zb;
          if (param0 <= -36) {
            break L0;
          } else {
            ((lk) this).k(5);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3) {
            return var2;
          } else {
            var5 = ((lk) this).field_T[var4];
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
            var13 = ((lk) this).field_B;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if (var13.length >= ((lk) this).field_C * ((lk) this).field_zb) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = new int[((lk) this).field_C * ((lk) this).field_zb];
          ((lk) this).field_B = new int[((lk) this).field_C * ((lk) this).field_zb];
          break L0;
        }
        L2: {
          var3 = 0;
          if (param0 == 21200) {
            break L2;
          } else {
            ((lk) this).field_vb = null;
            break L2;
          }
        }
        var4 = 0;
        L3: while (true) {
          if (var4 >= ((lk) this).field_zb) {
            var4 = ((lk) this).field_db + -((lk) this).field_zb + ((lk) this).field_C - -((lk) this).field_o >> 2027132385;
            var5 = ((lk) this).field_o + (((lk) this).field_zb + (-((lk) this).field_C - ((lk) this).field_db)) >> 1485015713;
            ((lk) this).field_q = ((lk) this).field_q + var4;
            var3 = ((lk) this).field_C;
            ((lk) this).field_L = ((lk) this).field_L + var5;
            ((lk) this).field_C = ((lk) this).field_zb;
            ((lk) this).field_B = ((lk) this).field_T;
            ((lk) this).field_zb = var3;
            ((lk) this).field_T = var2;
            if (this.c((byte) -117)) {
              ((lk) this).field_T = ((lk) this).field_B;
              ((lk) this).field_B = var2;
              ((lk) this).field_zb = ((lk) this).field_C;
              ((lk) this).field_L = ((lk) this).field_L - var5;
              ((lk) this).field_C = var3;
              ((lk) this).field_q = ((lk) this).field_q - var4;
              return false;
            } else {
              ((lk) this).field_ab = ((lk) this).field_ab + 1;
              var3 = ((lk) this).field_db;
              ((lk) this).field_db = -((lk) this).field_o;
              ((lk) this).field_o = var3;
              this.d(30968);
              var3 = 0;
              this.h(-1);
              var6 = 0;
              L4: while (true) {
                if (var6 >= ((lk) this).field_zb) {
                  ge.a(((lk) this).field_lb, ((lk) this).field_k / 4, (byte) 127, ib.field_ob);
                  return true;
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= ((lk) this).field_C) {
                      var6++;
                      continue L4;
                    } else {
                      ((lk) this).field_tb[var3] = 0;
                      ((lk) this).field_b[var3] = (-1 + (((lk) this).field_C + ((lk) this).field_db - var7 * 2)) * -8 / ((lk) this).field_C;
                      var3++;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            var5 = -var4 + (-1 + ((lk) this).field_zb);
            var6 = 0;
            L6: while (true) {
              if (((lk) this).field_C <= var6) {
                var4++;
                continue L3;
              } else {
                int incrementValue$1 = var3;
                var3++;
                ((lk) this).field_B[var5] = ((lk) this).field_T[incrementValue$1];
                var5 = var5 + ((lk) this).field_zb;
                var6++;
                continue L6;
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
            if (((lk) this).field_a * ((lk) this).field_O <= var6) {
              L1: {
                if (param1) {
                  L2: {
                    var6 = ((int)((double)((lk) this).field_k * Math.sqrt((double)(var4 + (16 - -var5)))) + 8) / 16;
                    if (((lk) this).field_k >= var6) {
                      break L2;
                    } else {
                      var6 = ((lk) this).field_k;
                      break L2;
                    }
                  }
                  ge.a(((lk) this).field_lb, var6, (byte) 127, ee.field_g);
                  break L1;
                } else {
                  L3: {
                    if (-1 <= (var4 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        var6 = ((int)((double)((lk) this).field_k * Math.sqrt((double)var4)) - -1) / 2;
                        if (((lk) this).field_k >= var6) {
                          break L4;
                        } else {
                          var6 = ((lk) this).field_k;
                          break L4;
                        }
                      }
                      ge.a(((lk) this).field_lb, var6, (byte) 127, wd.field_c);
                      break L3;
                    }
                  }
                  if (0 < var5) {
                    L5: {
                      var6 = (2 + (int)((double)((lk) this).field_k * Math.sqrt((double)var5))) / 4;
                      if (var6 <= ((lk) this).field_k) {
                        break L5;
                      } else {
                        var6 = ((lk) this).field_k;
                        break L5;
                      }
                    }
                    ge.a(((lk) this).field_lb, var6, (byte) 127, sa.field_w);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              var7 = ((lk) this).field_P[var6];
              if ((1879048192 & var7) == 0) {
                ((lk) this).field_P[var6] = lb.a(2147483647, var7);
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
                  ((lk) this).field_ib = param2;
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
                  ((lk) this).field_P[var6] = 56;
                  var6++;
                  continue L0;
                } else {
                  ((lk) this).field_P[var6] = de.b(32, lb.a(var7, 268435455));
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
        return 80 + ((lk) this).field_g * ((lk) this).field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4 = 0;
        if (param0 >= 0) {
            if (-1 >= (param2 ^ -1)) {
                if ((param0 ^ -1) > (((lk) this).field_O ^ -1)) {
                    if (((lk) this).field_a > param2) {
                        var4 = ((lk) this).field_P[param0 + ((lk) this).field_O * param2];
                    }
                }
            }
        }
        int var5 = 101 / ((param1 - 24) / 52);
        if (((lk) this).field_C != 0) {
            if (!((lk) this).field_S) {
                var6 = -((lk) this).field_q + param0;
                var7 = -((lk) this).field_L + param2;
                if ((var6 ^ -1) <= -1) {
                    if (-1 >= (var7 ^ -1)) {
                        if (((lk) this).field_C > var6) {
                            if (((lk) this).field_zb > var7) {
                                var8 = ((lk) this).field_T[var7 * ((lk) this).field_C + var6];
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
        if (param0 != -1) {
            return;
        }
        if (!((lk) this).field_y) {
        } else {
            if (!this.a((byte) -93, true)) {
                ((lk) this).field_y = false;
                this.c(30000, ((lk) this).field_g, 1);
            } else {
                ((lk) this).field_e = 20;
            }
        }
    }

    private final int a(boolean param0, int param1, int param2, lk param3, boolean param4, int param5, int param6, int param7, oi param8, boolean param9, byte param10) {
        int var12 = 0;
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
        Object stackIn_75_0 = null;
        lk stackIn_75_1 = null;
        oi stackIn_75_2 = null;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
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
        int stackIn_77_5 = 0;
        Object stackOut_74_0 = null;
        lk stackOut_74_1 = null;
        oi stackOut_74_2 = null;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        Object stackOut_76_0 = null;
        lk stackOut_76_1 = null;
        oi stackOut_76_2 = null;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        Object stackOut_75_0 = null;
        lk stackOut_75_1 = null;
        oi stackOut_75_2 = null;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_75_5 = 0;
        var22 = client.field_A ? 1 : 0;
        var12 = ((lk) this).field_P[param6];
        if ((var12 & -1879048193) >> -1240422525 != param1) {
          return 0;
        } else {
          L0: {
            var13 = 0;
            if (param5 >= 0) {
              break L0;
            } else {
              if ((var12 & -1879048193) == -24) {
                L1: {
                  if (-2 != param5) {
                    break L1;
                  } else {
                    var14 = 0;
                    L2: while (true) {
                      if (-8 <= var14) {
                        break L1;
                      } else {
                        var13 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
                        var14++;
                        continue L2;
                      }
                    }
                  }
                }
                return var13;
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (((lk) this).field_v) {
              param7 = 3;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var14 = 0;
            ((lk) this).field_w[0] = param6;
            var15 = 1;
            ((lk) this).field_P[param6] = de.b(-2147483648, var12);
            var16 = 0;
            if (param5 < 0) {
              break L4;
            } else {
              var16 = 1;
              var12 = (-1879048200 & var12) + param5;
              break L4;
            }
          }
          L5: {
            L6: {
              if (param0) {
                L7: {
                  if (param9) {
                    var17 = 24 ^ var12;
                    break L7;
                  } else {
                    var17 = 23;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var14 >= var15) {
                    var17 = -119 / ((param10 - 7) / 60);
                    if (var16 != 0) {
                      break L5;
                    } else {
                      if (var15 < param2) {
                        break L5;
                      } else {
                        var12 = 8 | var12 & 7;
                        var14 = 0;
                        var18 = 0;
                        L9: while (true) {
                          if (var18 >= var15) {
                            break L6;
                          } else {
                            var19 = ((lk) this).field_w[var18];
                            var20 = ((lk) this).field_P[var19];
                            if (1879048192 > (1879048192 & var20)) {
                              ((lk) this).field_P[var19] = var20 - -268435456;
                              var18++;
                              continue L9;
                            } else {
                              var18++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L10: {
                      int incrementValue$2 = var14;
                      var14++;
                      var18 = ((lk) this).field_w[incrementValue$2];
                      if (var16 == 0) {
                        break L10;
                      } else {
                        if (23 != (((lk) this).field_P[var18] & 268435455)) {
                          var16 = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (0 < var18 % ((lk) this).field_O) {
                        var15 = this.a(-1 + var18, 124, var17, var15, var12);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (((lk) this).field_O + -1 <= var18 % ((lk) this).field_O) {
                        break L12;
                      } else {
                        var15 = this.a(1 + var18, 126, var17, var15, var12);
                        break L12;
                      }
                    }
                    L13: {
                      if (var18 >= ((lk) this).field_O) {
                        var15 = this.a(-((lk) this).field_O + var18, 126, var17, var15, var12);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if ((-1 + ((lk) this).field_a) * ((lk) this).field_O > var18) {
                      var15 = this.a(var18 - -((lk) this).field_O, 125, var17, var15, var12);
                      continue L8;
                    } else {
                      continue L8;
                    }
                  }
                }
              } else {
                var17 = -119 / ((param10 - 7) / 60);
                if (var16 != 0) {
                  break L5;
                } else {
                  if (var15 < param2) {
                    break L5;
                  } else {
                    var12 = 8 | var12 & 7;
                    var14 = 0;
                    var18 = 0;
                    L14: while (true) {
                      if (var18 >= var15) {
                        break L6;
                      } else {
                        var19 = ((lk) this).field_w[var18];
                        var20 = ((lk) this).field_P[var19];
                        if (1879048192 > (1879048192 & var20)) {
                          ((lk) this).field_P[var19] = var20 - -268435456;
                          var18++;
                          continue L14;
                        } else {
                          var18++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              }
            }
            L15: {
              var18 = var15;
              if (!param4) {
                break L15;
              } else {
                L16: while (true) {
                  if (var15 <= var14) {
                    break L15;
                  } else {
                    L17: {
                      int incrementValue$3 = var14;
                      var14++;
                      var19 = ((lk) this).field_w[incrementValue$3];
                      if ((var19 % ((lk) this).field_O ^ -1) >= -1) {
                        break L17;
                      } else {
                        var15 = this.a(var15, var19 + -1, (byte) -44, var12);
                        break L17;
                      }
                    }
                    L18: {
                      if (var19 % ((lk) this).field_O >= -1 + ((lk) this).field_O) {
                        break L18;
                      } else {
                        var15 = this.a(var15, var19 - -1, (byte) -44, var12);
                        break L18;
                      }
                    }
                    L19: {
                      if (((lk) this).field_O <= var19) {
                        var15 = this.a(var15, -((lk) this).field_O + var19, (byte) -44, var12);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (var19 >= (((lk) this).field_a + -1) * ((lk) this).field_O) {
                      continue L16;
                    } else {
                      var15 = this.a(var15, ((lk) this).field_O + var19, (byte) -44, var12);
                      continue L16;
                    }
                  }
                }
              }
            }
            L20: {
              if (param9) {
                break L20;
              } else {
                if (null == ((lk) this).field_rb) {
                  break L20;
                } else {
                  L21: {
                    if ((param7 ^ -1) != -4) {
                      break L21;
                    } else {
                      if (null == ((lk) this).field_rb) {
                        break L21;
                      } else {
                        var19 = gg.b(var15, 27935);
                        var20 = var19;
                        he.field_ab = he.field_ab + var20;
                        fb.field_e = fb.field_e + var20;
                        ((lk) this).field_hb = ((lk) this).field_hb + var19;
                        ((lk) this).field_rb.a((bh) (Object) new sa(false, this.b(0, var15, 81), this.a(true, var15, 0), var19, a.field_u, -1 + var15, 8 | 7 & var12, new String[4]), 2777);
                        break L20;
                      }
                    }
                  }
                  if (((lk) this).field_rb == null) {
                    break L20;
                  } else {
                    L22: {
                      var19 = pa.b(var18, 65);
                      var20 = gg.b(var15 + -var18, 27935);
                      ((lk) this).field_f = ((lk) this).field_f + var19;
                      var21 = var19;
                      he.field_ab = he.field_ab + var21;
                      fb.field_e = fb.field_e + var21;
                      ((lk) this).field_hb = ((lk) this).field_hb + var20;
                      var21 = var20;
                      fb.field_e = fb.field_e + var21;
                      he.field_ab = he.field_ab + var21;
                      if (0 >= var20) {
                        break L22;
                      } else {
                        ((lk) this).field_rb.a((bh) (Object) new sa(false, this.b(var18, var15, 65), this.a(true, var15, var18), var20, a.field_u, var15 + -var18 - 1, 8 | 7 & var12, new String[4]), 2777);
                        break L22;
                      }
                    }
                    ((lk) this).field_rb.a((bh) (Object) new sa(false, this.b(0, var18, 112), this.a(true, var18, 0), var19, bc.field_J, -4 + var18, 16 | 7 & var12, new String[4]), 2777);
                    break L20;
                  }
                }
              }
            }
            var13 = var15;
            if (((lk) this).field_D >= param7) {
              L23: {
                stackOut_74_0 = this;
                stackOut_74_1 = (lk) param3;
                stackOut_74_2 = (oi) param8;
                stackOut_74_3 = var12;
                stackOut_74_4 = 0;
                stackIn_76_0 = stackOut_74_0;
                stackIn_76_1 = stackOut_74_1;
                stackIn_76_2 = stackOut_74_2;
                stackIn_76_3 = stackOut_74_3;
                stackIn_76_4 = stackOut_74_4;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                stackIn_75_2 = stackOut_74_2;
                stackIn_75_3 = stackOut_74_3;
                stackIn_75_4 = stackOut_74_4;
                if (-3 < (((lk) this).field_D ^ -1)) {
                  stackOut_76_0 = this;
                  stackOut_76_1 = (lk) (Object) stackIn_76_1;
                  stackOut_76_2 = (oi) (Object) stackIn_76_2;
                  stackOut_76_3 = stackIn_76_3;
                  stackOut_76_4 = stackIn_76_4;
                  stackOut_76_5 = var18;
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  stackIn_77_2 = stackOut_76_2;
                  stackIn_77_3 = stackOut_76_3;
                  stackIn_77_4 = stackOut_76_4;
                  stackIn_77_5 = stackOut_76_5;
                  break L23;
                } else {
                  stackOut_75_0 = this;
                  stackOut_75_1 = (lk) (Object) stackIn_75_1;
                  stackOut_75_2 = (oi) (Object) stackIn_75_2;
                  stackOut_75_3 = stackIn_75_3;
                  stackOut_75_4 = stackIn_75_4;
                  stackOut_75_5 = var15;
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_77_1 = stackOut_75_1;
                  stackIn_77_2 = stackOut_75_2;
                  stackIn_77_3 = stackOut_75_3;
                  stackIn_77_4 = stackOut_75_4;
                  stackIn_77_5 = stackOut_75_5;
                  break L23;
                }
              }
              this.a(stackIn_77_1, stackIn_77_2, stackIn_77_3, stackIn_77_4, stackIn_77_5);
              break L5;
            } else {
              break L5;
            }
          }
          L24: {
            if (!param9) {
              var18 = 0;
              L25: while (true) {
                if (var18 >= var15) {
                  break L24;
                } else {
                  L26: {
                    var19 = ((lk) this).field_w[var18];
                    var20 = ((lk) this).field_P[var19];
                    var21 = var20 & 268435455;
                    if (23 == var21) {
                      break L26;
                    } else {
                      if (-3 != (var21 >> -536593437 ^ -1)) {
                        break L26;
                      } else {
                        var18++;
                        continue L25;
                      }
                    }
                  }
                  var20 = var20 & 2147483647;
                  ((lk) this).field_P[var19] = var20;
                  var18++;
                  continue L25;
                }
              }
            } else {
              break L24;
            }
          }
          return var13;
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (0 == ((lk) this).field_C) {
          throw new IllegalStateException();
        } else {
          L0: {
            var3 = ((lk) this).field_A & param0;
            ((lk) this).field_A = param0;
            var4 = 0;
            if (-1 >= ((lk) this).field_Ab) {
              var4 = 1;
              break L0;
            } else {
              L1: {
                ((lk) this).field_Ab = ((lk) this).field_Ab - 1;
                if (0 != (1 & var3)) {
                  this.b((byte) -116);
                  ((lk) this).field_Cb = -10;
                  break L1;
                } else {
                  if ((var3 & 2) != 0) {
                    this.j(param1 ^ -1674843003);
                    ((lk) this).field_Cb = 10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (0 > ((lk) this).field_Cb) {
                  if ((param0 & 1) != 0) {
                    int fieldTemp$3 = ((lk) this).field_Cb + 1;
                    ((lk) this).field_Cb = ((lk) this).field_Cb + 1;
                    if (fieldTemp$3 != 0) {
                      break L2;
                    } else {
                      this.b((byte) -116);
                      ((lk) this).field_Cb = -3;
                      break L2;
                    }
                  } else {
                    ((lk) this).field_Cb = 0;
                    break L2;
                  }
                } else {
                  if (((lk) this).field_Cb > 0) {
                    if ((param0 & 2) == 0) {
                      ((lk) this).field_Cb = 0;
                      break L2;
                    } else {
                      int fieldTemp$4 = ((lk) this).field_Cb - 1;
                      ((lk) this).field_Cb = ((lk) this).field_Cb - 1;
                      if (fieldTemp$4 == 0) {
                        this.j(4);
                        ((lk) this).field_Cb = 3;
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
              boolean discarded$5 = lk.a(50, -101, 127, 94, false, 20, 66);
              break L5;
            }
          }
          L6: {
            if (var4 != 0) {
              L7: {
                if (0 == ((lk) this).field_Ab) {
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
              if (((lk) this).field_e <= 2) {
                break L6;
              } else {
                L8: {
                  if (((lk) this).field_y) {
                    break L8;
                  } else {
                    if (-1 >= ((lk) this).field_Ab) {
                      break L8;
                    } else {
                      if (((lk) this).field_g != ((lk) this).field_e) {
                        break L8;
                      } else {
                        if (this.o(32) != ((lk) this).field_M) {
                          break L8;
                        } else {
                          if (null != ((lk) this).field_rb) {
                            ((lk) this).field_H = ((lk) this).field_H + 5;
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
                ((lk) this).field_e = 2;
                break L6;
              }
            } else {
              break L6;
            }
          }
          L9: {
            if (-1 > (((lk) this).field_e ^ -1)) {
              this.c(30000, -1 + ((lk) this).field_e, 0);
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
            if (((lk) this).field_t <= var2) {
              break L1;
            } else {
              if (((lk) this).field_X[var2].field_e == 0) {
                break L1;
              } else {
                var2++;
                continue L0;
              }
            }
          }
          if (((lk) this).field_t > var2) {
            if (param0 == -19939) {
              var3 = ((lk) this).field_X[var2];
              var3.field_e = var3.field_e + 1;
              return var3;
            } else {
              return null;
            }
          } else {
            throw new IllegalStateException();
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
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
        ((lk) this).field_L = param5;
        ((lk) this).field_q = param4;
        param2 = param0 & -((lk) this).field_ab + param2;
        L0: while (true) {
          if (-1 <= (param2 ^ -1)) {
            ((lk) this).a(param1, (byte) 126, param3);
            return;
          } else {
            L1: {
              L2: {
                var17 = ((lk) this).field_B;
                var16 = var17;
                var15 = var16;
                var14 = var15;
                var13 = var14;
                var7 = var13;
                if (var13 == null) {
                  break L2;
                } else {
                  if (((lk) this).field_zb * ((lk) this).field_C <= var17.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7 = new int[((lk) this).field_C * ((lk) this).field_zb];
              ((lk) this).field_B = new int[((lk) this).field_C * ((lk) this).field_zb];
              break L1;
            }
            var8 = 0;
            var9 = 0;
            L3: while (true) {
              if (((lk) this).field_zb <= var9) {
                var8 = ((lk) this).field_C;
                ((lk) this).field_C = ((lk) this).field_zb;
                ((lk) this).field_B = ((lk) this).field_T;
                ((lk) this).field_zb = var8;
                ((lk) this).field_T = var7;
                param2--;
                continue L0;
              } else {
                var10 = -1 + ((lk) this).field_zb - var9;
                var11 = 0;
                L4: while (true) {
                  if (((lk) this).field_C <= var11) {
                    var9++;
                    continue L3;
                  } else {
                    int incrementValue$2 = var8;
                    var8++;
                    ((lk) this).field_B[var10] = ((lk) this).field_T[incrementValue$2];
                    var10 = var10 + ((lk) this).field_zb;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          ((lk) this).field_zb = param2.field_n;
          ((lk) this).field_U = ((lk) this).field_U + 1;
          ((lk) this).field_C = param2.field_b;
          ((lk) this).field_b = new int[((lk) this).field_C * ((lk) this).field_zb];
          ((lk) this).field_T = new int[((lk) this).field_C * ((lk) this).field_zb];
          if (param0 > 73) {
            break L0;
          } else {
            ((lk) this).a(false);
            break L0;
          }
        }
        ((lk) this).field_tb = new int[((lk) this).field_C * ((lk) this).field_zb];
        var4 = 0;
        L1: while (true) {
          if (((lk) this).field_zb * ((lk) this).field_C <= var4) {
            var4 = 0;
            L2: while (true) {
              if (((lk) this).field_C * ((lk) this).field_zb <= var4) {
                L3: {
                  ((lk) this).field_o = 0;
                  ((lk) this).field_db = 0;
                  if (-1 == (1 & (((lk) this).field_C ^ ((lk) this).field_zb) ^ -1)) {
                    break L3;
                  } else {
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    L4: while (true) {
                      if (var8 >= ((lk) this).field_zb) {
                        L5: {
                          var8 = (-1 + ((lk) this).field_C) * var6 >> 1653217089;
                          var9 = var6 * (((lk) this).field_zb - 1) >> 847858401;
                          if (-var9 + var5 <= var4 + -var8) {
                            break L5;
                          } else {
                            if (var5 - var9 > var8 + -var4) {
                              ((lk) this).field_o = 1;
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var5 - var9 >= -var8 + var4) {
                            break L6;
                          } else {
                            if (-var9 + var5 >= -var4 + var8) {
                              break L6;
                            } else {
                              ((lk) this).field_o = -1;
                              break L3;
                            }
                          }
                        }
                        if (var4 < var8) {
                          ((lk) this).field_db = -1;
                          break L3;
                        } else {
                          ((lk) this).field_db = 1;
                          break L3;
                        }
                      } else {
                        var9 = 0;
                        L7: while (true) {
                          if (var9 >= ((lk) this).field_C) {
                            var8++;
                            continue L4;
                          } else {
                            if (0 != ((lk) this).field_T[var7]) {
                              var5 = var5 + var8;
                              var6++;
                              var4 = var4 + var9;
                              var7++;
                              var9++;
                              continue L7;
                            } else {
                              var7++;
                              var9++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  ((lk) this).field_Cb = 0;
                  ((lk) this).field_q = -((lk) this).field_C + ((lk) this).field_O >> -433015551;
                  ((lk) this).field_A = 0;
                  ((lk) this).field_L = -((lk) this).field_zb + 1 + ((lk) this).field_z;
                  ((lk) this).field_yb = param1;
                  ((lk) this).field_ab = 0;
                  stackOut_27_0 = this;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (-3 >= (((lk) this).field_g ^ -1)) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = ((lk) this).field_g;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 2;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L8;
                  }
                }
                ((lk) this).field_e = stackIn_30_1;
                ((lk) this).field_y = false;
                ((lk) this).field_Ab = this.l(123);
                ((lk) this).field_M = this.o(32);
                return;
              } else {
                ((lk) this).field_b[var4] = 8;
                var4++;
                continue L2;
              }
            }
          } else {
            ((lk) this).field_T[var4] = lb.a(255, (int) param2.field_c[var4]);
            var4++;
            continue L1;
          }
        }
    }

    final void a(rf param0, byte param1) {
        rf[] var6 = null;
        rf[] var3 = null;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        if (((lk) this).field_t >= ((lk) this).field_X.length) {
            var6 = new rf[2 * ((lk) this).field_X.length];
            var3 = var6;
            for (var4 = 0; var4 < ((lk) this).field_X.length; var4++) {
                var6[var4] = ((lk) this).field_X[var4];
            }
            ((lk) this).field_X = var3;
        }
        if (param1 > -116) {
            ((lk) this).field_o = 45;
        }
        param0.field_l = ((lk) this).field_wb;
        ((lk) this).field_wb = ((lk) this).field_wb + 3;
        int fieldTemp$0 = ((lk) this).field_t;
        ((lk) this).field_t = ((lk) this).field_t + 1;
        ((lk) this).field_X[fieldTemp$0] = param0;
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
          L0: {
            if (param1 == -15303) {
              break L0;
            } else {
              ((lk) this).field_Bb = false;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (-6 >= (var3 ^ -1)) {
              return false;
            } else {
              var4 = ((lk) this).field_w[var3];
              var5 = var4 % ((lk) this).field_O;
              var6 = var4 / ((lk) this).field_O;
              var7 = 15;
              var8 = 0;
              L2: while (true) {
                L3: {
                  if (5 <= var8) {
                    if (-1 == (var7 ^ -1)) {
                      break L3;
                    } else {
                      return true;
                    }
                  } else {
                    L4: {
                      if (var8 == var3) {
                        break L4;
                      } else {
                        L5: {
                          var9 = ((lk) this).field_w[var8];
                          var10 = var9 % ((lk) this).field_O;
                          var10 = var10 - var5;
                          var11 = var9 / ((lk) this).field_O;
                          var11 = var11 - var6;
                          if (-1 != (var11 ^ -1)) {
                            break L5;
                          } else {
                            L6: {
                              if (0 == (var10 ^ -1)) {
                                break L6;
                              } else {
                                if (var10 == 1) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var7 = var7 & 3;
                            break L4;
                          }
                        }
                        L7: {
                          if ((var10 ^ -1) != -1) {
                            break L7;
                          } else {
                            L8: {
                              if (var11 == -1) {
                                break L8;
                              } else {
                                if ((var11 ^ -1) != -2) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var7 = var7 & 12;
                            break L4;
                          }
                        }
                        L9: {
                          if (-1 != var10) {
                            break L9;
                          } else {
                            if ((var11 ^ -1) != 0) {
                              break L9;
                            } else {
                              var7 = var7 & 5;
                              break L4;
                            }
                          }
                        }
                        L10: {
                          if (-2 != (var10 ^ -1)) {
                            break L10;
                          } else {
                            if (var11 == -1) {
                              var7 = var7 & 9;
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (0 != (var10 ^ -1)) {
                            break L11;
                          } else {
                            if (-2 == (var11 ^ -1)) {
                              var7 = var7 & 6;
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if ((var10 ^ -1) != -2) {
                          break L3;
                        } else {
                          if ((var11 ^ -1) == -2) {
                            var7 = var7 & 10;
                            break L4;
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
            ((lk) this).field_V = 92;
        }
        if (-1 > (((lk) this).field_C ^ -1)) {
            if (!((lk) this).field_S) {
                ((lk) this).field_V = ((lk) this).field_C;
                ((lk) this).field_E = ((lk) this).field_L;
                ((lk) this).field_mb = 1;
                ((lk) this).field_h = ((lk) this).field_zb;
                ((lk) this).field_ob = ((lk) this).field_q;
                ((lk) this).field_N = ((lk) this).field_T;
                ge.a(((lk) this).field_lb, ((lk) this).field_k / 2, (byte) 127, ul.field_i);
                ((lk) this).field_S = true;
                ((lk) this).field_K = 0;
                ((lk) this).field_p = 0;
                ((lk) this).field_Bb = false;
                ((lk) this).field_nb = 0;
            }
        }
        ((lk) this).field_C = 0;
    }

    private final void b(boolean param0) {
        int var2 = -300 + ka.a((byte) 122, 601, tf.field_cb);
        var2 = var2 * (var2 * var2) / 90000;
        a.a(var2, ((lk) this).field_J / 4, ak.field_b, ((lk) this).field_sb, 256);
        if (param0) {
            ((lk) this).field_M = -21;
        }
    }

    private final void i(int param0) {
        if (this.q(21200)) {
            return;
        }
        if ((((lk) this).field_db | ((lk) this).field_o) != param0) {
            ((lk) this).field_o = -((lk) this).field_o;
            ((lk) this).field_db = -((lk) this).field_db;
            if (this.q(param0 ^ 21200)) {
                return;
            }
            ((lk) this).field_o = -((lk) this).field_o;
            ((lk) this).field_db = -((lk) this).field_db;
        }
    }

    private final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        int var2 = ((lk) this).field_C * ((lk) this).field_zb;
        for (var3 = 0; var2 > var3; var3++) {
            var4 = ((lk) this).field_T[var3];
            if (!(0 == var4)) {
                return (var4 & 24) >> 1983512195;
            }
        }
        if (param0 < 35) {
            ((lk) this).field_T = null;
            return 0;
        }
        return 0;
    }

    final boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = client.field_A ? 1 : 0;
        var2 = ((lk) this).field_O * ((lk) this).field_a;
        var3 = 0;
        L0: while (true) {
          if (var2 <= var3) {
            L1: {
              if (param0 == -22477) {
                break L1;
              } else {
                var6 = null;
                ((lk) this).a((oi) null, 112, true, (lk) null);
                break L1;
              }
            }
            return false;
          } else {
            var4 = ((lk) this).field_P[var3];
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
        ((lk) this).field_nb = 0;
        ((lk) this).field_p = 0;
        ((lk) this).field_S = true;
        ((lk) this).field_K = 0;
    }

    final void a(oi param0, int param1, boolean param2, lk param3) {
        int var5 = 0;
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
        ud stackIn_85_0 = null;
        ud stackOut_84_0 = null;
        ud stackOut_83_0 = null;
        var14 = client.field_A ? 1 : 0;
        mk.field_e = 0;
        if (param1 > 124) {
          L0: {
            L1: {
              L2: {
                dn.field_i = false;
                fk.field_H = 0;
                bj.field_a = false;
                pn.field_db = false;
                var5 = 0;
                if (1 != ((lk) this).field_ib) {
                  if (-1 == (((lk) this).field_ib ^ -1)) {
                    var6 = 0;
                    var7 = 0;
                    var8 = -1 + ((lk) this).field_a * ((lk) this).field_O;
                    var9 = ((lk) this).field_a + -1;
                    L3: while (true) {
                      if (-1 < (var9 ^ -1)) {
                        L4: {
                          if ((((lk) this).field_l ^ -1) != -1) {
                            stackOut_84_0 = rc.field_i;
                            stackIn_85_0 = stackOut_84_0;
                            break L4;
                          } else {
                            stackOut_83_0 = bf.field_u;
                            stackIn_85_0 = stackOut_83_0;
                            break L4;
                          }
                        }
                        L5: {
                          var9_ref_ud = stackIn_85_0;
                          if ((var6 ^ -1) < -1) {
                            L6: {
                              pg.field_a[((lk) this).field_Q] = true;
                              var10 = (int)(0.5 + (double)((lk) this).field_k * Math.sqrt((double)var6));
                              if ((4 * ((lk) this).field_k ^ -1) <= (var10 ^ -1)) {
                                break L6;
                              } else {
                                var10 = 4 * ((lk) this).field_k;
                                break L6;
                              }
                            }
                            L7: {
                              var15 = wf.field_l[((lk) this).field_Q];
                              var11_ref_ei = var15;
                              if (var11_ref_ei == null) {
                                break L7;
                              } else {
                                var15.f(-1);
                                break L7;
                              }
                            }
                            L8: {
                              if (var11_ref_ei == null) {
                                break L8;
                              } else {
                                if (!var15.a((byte) 93)) {
                                  break L8;
                                } else {
                                  if ((Object) (Object) var15.field_q == (Object) (Object) var9_ref_ud) {
                                    var11_ref_ei.b(en.field_o / 50, var10 * pb.field_d, ((lk) this).field_lb << 522231430);
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L9: {
                              if (var11_ref_ei != null) {
                                var15.g(en.field_o / 50);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var16 = ei.c(var9_ref_ud, 100, var10 * pb.field_d, ((lk) this).field_lb << -273244250);
                            var11_ref_ei = var16;
                            var16.f(-1);
                            dg.field_c.a((ol) (Object) var16);
                            wf.field_l[((lk) this).field_Q] = var16;
                            break L5;
                          } else {
                            var10_ref_ei = wf.field_l[((lk) this).field_Q];
                            if (var10_ref_ei != null) {
                              var10_ref_ei.g(en.field_o / 50);
                              wf.field_l[((lk) this).field_Q] = null;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L10: {
                          if (0 < var7) {
                            L11: {
                              var10 = (2 + (int)((double)((lk) this).field_k * Math.sqrt((double)var7))) / 4;
                              if (((lk) this).field_k < var10) {
                                var10 = ((lk) this).field_k;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            ge.a(((lk) this).field_lb, var10, (byte) 127, bj.field_e);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if (var5 == 0) {
                          ((lk) this).field_ib = 2;
                          ((lk) this).field_l = 0;
                          break L2;
                        } else {
                          ((lk) this).field_l = -((lk) this).field_l;
                          break L2;
                        }
                      } else {
                        var10 = -1 + ((lk) this).field_O;
                        L12: while (true) {
                          if (-1 < (var10 ^ -1)) {
                            var9--;
                            continue L3;
                          } else {
                            L13: {
                              var11 = ((lk) this).field_P[var8];
                              if ((var11 ^ -1) == -1) {
                                break L13;
                              } else {
                                L14: {
                                  if (param2) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (16 == (var11 & 24)) {
                                        break L15;
                                      } else {
                                        if (-25 != (var11 & 24 ^ -1)) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if ((var9 ^ -1) <= (-1 + ((lk) this).field_a ^ -1)) {
                                      break L14;
                                    } else {
                                      if (((lk) this).field_P[var8 - -((lk) this).field_O] == 0) {
                                        ((lk) this).field_P[var8 + ((lk) this).field_O] = de.b(lb.a(var11, 31), 32);
                                        ((lk) this).field_P[var8] = 0;
                                        var6++;
                                        var5 = 1;
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  if (param2) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if ((var11 & 24 ^ -1) == -17) {
                                        break L17;
                                      } else {
                                        if ((24 & var11) != 24) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (((lk) this).field_a + -1 <= var9) {
                                      break L16;
                                    } else {
                                      if (var10 - -((lk) this).field_l < 0) {
                                        break L16;
                                      } else {
                                        if ((var10 + ((lk) this).field_l ^ -1) <= (((lk) this).field_O ^ -1)) {
                                          break L16;
                                        } else {
                                          if ((((lk) this).field_P[((lk) this).field_l + var8] ^ -1) != -1) {
                                            break L16;
                                          } else {
                                            if ((((lk) this).field_P[((lk) this).field_O + var8 + ((lk) this).field_l] ^ -1) != -1) {
                                              break L16;
                                            } else {
                                              ((lk) this).field_P[((lk) this).field_l + var8] = de.b(lb.a(31, var11), 32);
                                              ((lk) this).field_P[var8] = 0;
                                              var5 = 1;
                                              var6++;
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L18: {
                                  if (param2) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if ((var11 & 24 ^ -1) == -17) {
                                        break L19;
                                      } else {
                                        if ((var11 & 24 ^ -1) != -25) {
                                          break L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if ((((lk) this).field_a + -1 ^ -1) >= (var9 ^ -1)) {
                                      break L18;
                                    } else {
                                      if ((-((lk) this).field_l + var10 ^ -1) > -1) {
                                        break L18;
                                      } else {
                                        if ((((lk) this).field_O ^ -1) >= (-((lk) this).field_l + var10 ^ -1)) {
                                          break L18;
                                        } else {
                                          if ((((lk) this).field_P[-((lk) this).field_l + var8] ^ -1) != -1) {
                                            break L18;
                                          } else {
                                            if (-1 != (((lk) this).field_P[-((lk) this).field_l + (var8 + ((lk) this).field_O)] ^ -1)) {
                                              break L18;
                                            } else {
                                              ((lk) this).field_P[-((lk) this).field_l + var8] = de.b(lb.a(31, var11), 32);
                                              var5 = 1;
                                              ((lk) this).field_P[var8] = 0;
                                              var6++;
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (32 <= var11) {
                                  L20: {
                                    L21: {
                                      if (!param2) {
                                        break L21;
                                      } else {
                                        if (var11 < 64) {
                                          var11 = var11 & 31;
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (var11 < 64) {
                                        var7++;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var11 += 32;
                                    if (-449 >= (var11 ^ -1)) {
                                      var11 = var11 & 31;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((lk) this).field_P[var8] = var11;
                                  var5 = 1;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var8--;
                            var10--;
                            continue L12;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var6 = 1;
                  var7 = 0;
                  L23: while (true) {
                    if (((lk) this).field_a * ((lk) this).field_O <= var7) {
                      if (var6 != 0) {
                        ((lk) this).field_ib = 0;
                        break L2;
                      } else {
                        if (var5 != 0) {
                          break L0;
                        } else {
                          if (((lk) this).field_s) {
                            break L0;
                          } else {
                            if (!param2) {
                              gg.field_B = 2147483647;
                              gi.field_a = 0;
                              var6 = 0;
                              var7 = 0;
                              L24: while (true) {
                                if ((var7 ^ -1) <= (((lk) this).field_a * ((lk) this).field_O ^ -1)) {
                                  break L1;
                                } else {
                                  L25: {
                                    var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                                    if (var8 > 0) {
                                      L26: {
                                        if (((lk) this).field_kb) {
                                          L27: {
                                            if (this.a(-101, var8)) {
                                              bj.field_a = true;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          L28: {
                                            if (!this.c(var8, -15303)) {
                                              break L28;
                                            } else {
                                              dn.field_i = true;
                                              break L28;
                                            }
                                          }
                                          if (!this.b(var8, -1)) {
                                            break L26;
                                          } else {
                                            pn.field_db = true;
                                            break L26;
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var6++;
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  var7++;
                                  continue L24;
                                }
                              }
                            } else {
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      L29: {
                        var8 = ((lk) this).field_P[var7];
                        if (-33 < (var8 ^ -1)) {
                          break L29;
                        } else {
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
                          var5 = 1;
                          ((lk) this).field_P[var7] = var8;
                          break L29;
                        }
                      }
                      var7++;
                      continue L23;
                    }
                  }
                }
              }
              if (var5 != 0) {
                break L0;
              } else {
                if (((lk) this).field_s) {
                  break L0;
                } else {
                  if (!param2) {
                    gg.field_B = 2147483647;
                    gi.field_a = 0;
                    var6 = 0;
                    var7 = 0;
                    L31: while (true) {
                      if ((var7 ^ -1) <= (((lk) this).field_a * ((lk) this).field_O ^ -1)) {
                        break L1;
                      } else {
                        L32: {
                          var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                          if (var8 > 0) {
                            L33: {
                              if (((lk) this).field_kb) {
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
                    break L0;
                  }
                }
              }
            }
            this.a(-99, false, 1);
            if (var6 > 0) {
              L36: {
                ((lk) this).field_K = ((lk) this).field_K + var6;
                if (-3 < (var6 ^ -1)) {
                  break L36;
                } else {
                  L37: {
                    var7 = ((int)((double)((lk) this).field_k * Math.sqrt((double)var6)) + 1) / 2;
                    if (((lk) this).field_k < var7) {
                      var7 = ((lk) this).field_k;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  ge.a(((lk) this).field_lb, var7, (byte) 127, bf.field_w);
                  break L36;
                }
              }
              L38: {
                ((lk) this).field_nb = ((lk) this).field_nb + 1;
                if (-3 >= (((lk) this).field_nb ^ -1)) {
                  L39: {
                    var7 = (((lk) this).field_nb + -1) % 4;
                    var8 = (-1 + ((lk) this).field_nb) / 4 * 3;
                    if (var7 != 3) {
                      break L39;
                    } else {
                      var8++;
                      break L39;
                    }
                  }
                  ai.a(62, var8, jm.field_v[var7], ((lk) this).field_lb, ((lk) this).field_k);
                  break L38;
                } else {
                  break L38;
                }
              }
              L40: {
                if (null == ((lk) this).field_rb) {
                  break L40;
                } else {
                  L41: {
                    var7 = ik.a((byte) 126, var6);
                    var8 = var7;
                    fb.field_e = fb.field_e + var8;
                    he.field_ab = he.field_ab + var8;
                    ((lk) this).field_ub = ((lk) this).field_ub + var7;
                    if (0 < var7) {
                      int fieldTemp$6 = gg.field_B;
                      gg.field_B = gg.field_B - 1;
                      ((lk) this).field_rb.a((bh) (Object) new sa(true, ((lk) this).field_O * 128, -384 + fieldTemp$6 * 256, var7, jg.field_f, -2 + var6, 0, new String[3]), 2777);
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                  var8 = le.b(32085, ((lk) this).field_nb);
                  if (0 < var8) {
                    int fieldTemp$7 = gg.field_B;
                    gg.field_B = gg.field_B - 1;
                    ((lk) this).field_W = new sa(true, 128 * ((lk) this).field_O, -384 + fieldTemp$7 * 256, var8, nf.field_f, ((lk) this).field_nb + -2, 0, new String[3]);
                    break L40;
                  } else {
                    break L40;
                  }
                }
              }
              var5 = 1;
              break L0;
            } else {
              ((lk) this).field_s = true;
              break L0;
            }
          }
          L42: {
            if (var5 != 0) {
              break L42;
            } else {
              if (param2) {
                break L42;
              } else {
                var6 = 1;
                var7 = 0;
                L43: while (true) {
                  if (var7 >= ((lk) this).field_a * ((lk) this).field_O) {
                    var7 = -1 + (-1 + ((lk) this).field_a) * ((lk) this).field_O;
                    var8 = ((lk) this).field_a - 2;
                    L44: while (true) {
                      if (var8 < 0) {
                        var7 = ((lk) this).field_O * (-1 + ((lk) this).field_a) - 1;
                        var8 = -2 + ((lk) this).field_a;
                        L45: while (true) {
                          if ((var8 ^ -1) > -1) {
                            this.a(-121, false, 2);
                            var8 = 0;
                            var7 = -1 + ((lk) this).field_O * ((lk) this).field_a;
                            var9 = 0;
                            var10 = -1 + ((lk) this).field_a;
                            L46: while (true) {
                              if (-1 < (var10 ^ -1)) {
                                L47: {
                                  if (0 >= var8) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var10 = kd.field_s[0][((lk) this).field_Q];
                                      var11_ref_ei__ = sk.field_a[0];
                                      var12 = (1 + (int)((double)((lk) this).field_k * Math.sqrt((double)var8))) / 2;
                                      if (var12 > ((lk) this).field_k) {
                                        var12 = ((lk) this).field_k;
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
                                    kd.field_s[0][((lk) this).field_Q] = var12;
                                    var13 = var11_ref_ei__[((lk) this).field_Q];
                                    if (var13 == null) {
                                      var17 = ei.c(ob.field_n, 100, pb.field_d * var12, ((lk) this).field_lb << -1195698778);
                                      var17.f(-1);
                                      dg.field_c.a((ol) (Object) var17);
                                      var11_ref_ei__[((lk) this).field_Q] = var17;
                                      break L47;
                                    } else {
                                      var13.b(en.field_o / 50, var12 * pb.field_d, ((lk) this).field_lb << -432303322);
                                      break L47;
                                    }
                                  }
                                }
                                L50: {
                                  if (0 < var9) {
                                    L51: {
                                      var10 = kd.field_s[1][((lk) this).field_Q];
                                      var11_ref_ei__ = sk.field_a[1];
                                      var12 = (1 + (int)((double)((lk) this).field_k * Math.sqrt((double)var9))) / 2;
                                      if ((((lk) this).field_k ^ -1) <= (var12 ^ -1)) {
                                        break L51;
                                      } else {
                                        var12 = ((lk) this).field_k;
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
                                    kd.field_s[1][((lk) this).field_Q] = var12;
                                    var13 = var11_ref_ei__[((lk) this).field_Q];
                                    if (var13 == null) {
                                      var18 = ei.c(ob.field_n, 120, var12 * pb.field_d, ((lk) this).field_lb << -297612698);
                                      var18.f(-1);
                                      dg.field_c.a((ol) (Object) var18);
                                      var11_ref_ei__[((lk) this).field_Q] = var18;
                                      break L50;
                                    } else {
                                      var13.b(en.field_o / 50, pb.field_d * var12, ((lk) this).field_lb << -59157402);
                                      break L50;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                                if (var5 == 0) {
                                  break L42;
                                } else {
                                  if (var6 == 0) {
                                    break L42;
                                  } else {
                                    ((lk) this).field_ib = 0;
                                    ((lk) this).field_s = false;
                                    break L42;
                                  }
                                }
                              } else {
                                var11 = ((lk) this).field_O + -1;
                                L53: while (true) {
                                  if (var11 < 0) {
                                    var10--;
                                    continue L46;
                                  } else {
                                    L54: {
                                      L55: {
                                        var12 = ((lk) this).field_P[var7];
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
                                      var5 = 1;
                                      if (32 > var12) {
                                        L56: {
                                          if (-1 + ((lk) this).field_a > var10) {
                                            ((lk) this).field_P[var7 + ((lk) this).field_O] = var12;
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        }
                                        ((lk) this).field_P[var7] = var12 - -32;
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
                                        ((lk) this).field_P[var7] = var12;
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
                            var9 = -1 + ((lk) this).field_O;
                            L58: while (true) {
                              if (-1 < (var9 ^ -1)) {
                                var8--;
                                continue L45;
                              } else {
                                L59: {
                                  var10 = ((lk) this).field_P[var7];
                                  if ((var10 ^ -1) != -26) {
                                    break L59;
                                  } else {
                                    if (-1 != (((lk) this).field_P[var7 + ((lk) this).field_O] & 1879048192 ^ -1)) {
                                      break L59;
                                    } else {
                                      int discarded$8 = this.a(false, 1, 1, param3, false, -1, var7 - -((lk) this).field_O, 3, param0, false, (byte) 123);
                                      break L59;
                                    }
                                  }
                                }
                                L60: {
                                  if ((var10 ^ -1) != -28) {
                                    break L60;
                                  } else {
                                    if (0 != (((lk) this).field_P[((lk) this).field_O + var7] & 1879048192)) {
                                      break L60;
                                    } else {
                                      int discarded$9 = this.a(false, 1, 1, param3, true, -1, ((lk) this).field_O + var7, 3, param0, false, (byte) 72);
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
                        var9 = -1 + ((lk) this).field_O;
                        L61: while (true) {
                          if (var9 < 0) {
                            var8--;
                            continue L44;
                          } else {
                            L62: {
                              var10 = ((lk) this).field_P[var7];
                              if ((var10 ^ -1) == -26) {
                                int discarded$10 = this.a(false, 2, 1, param3, false, -2, ((lk) this).field_O + var7, 3, param0, false, (byte) 109);
                                this.b(-1, ((lk) this).field_O + var7, false);
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                            L63: {
                              if (27 == var10) {
                                int discarded$11 = this.a(true, 2, 1, param3, true, -2, ((lk) this).field_O + var7, 3, param0, false, (byte) -99);
                                this.b(-1, var7 - -((lk) this).field_O, false);
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
                    L64: {
                      var8 = ((lk) this).field_P[var7];
                      if ((var8 ^ -1) > -33) {
                        break L64;
                      } else {
                        if ((var8 & 31 ^ -1) == -26) {
                          break L64;
                        } else {
                          if ((var8 & 31 ^ -1) == -28) {
                            break L64;
                          } else {
                            L65: {
                              var8 += 32;
                              if (var8 < 416) {
                                var6 = 0;
                                break L65;
                              } else {
                                var8 = 0;
                                break L65;
                              }
                            }
                            ((lk) this).field_P[var7] = var8;
                            var5 = 1;
                            break L64;
                          }
                        }
                      }
                    }
                    var7++;
                    continue L43;
                  }
                }
              }
            }
          }
          L66: {
            if (param2) {
              break L66;
            } else {
              if (((lk) this).field_G == 0) {
                break L66;
              } else {
                var6 = ((lk) this).field_G;
                ((lk) this).field_G = 0;
                var7 = 0;
                var8 = 0;
                L67: while (true) {
                  if (((lk) this).field_a * ((lk) this).field_O <= var8) {
                    this.a(-107, true, ((lk) this).field_ib);
                    if ((var7 ^ -1) < -1) {
                      var5 = 1;
                      if (null == ((lk) this).field_rb) {
                        break L66;
                      } else {
                        var8 = gg.b(var7, 27935);
                        var9 = var8;
                        he.field_ab = he.field_ab + var9;
                        fb.field_e = fb.field_e + var9;
                        ((lk) this).field_hb = ((lk) this).field_hb + var8;
                        ((lk) this).field_rb.a((bh) (Object) new sa(true, ((lk) this).field_O * 128, ((lk) this).field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[2]), 2777);
                        break L66;
                      }
                    } else {
                      break L66;
                    }
                  } else {
                    L68: {
                      L69: {
                        var9 = ((lk) this).field_P[var8];
                        var10 = var9 >> -465067389;
                        if (2 == var10) {
                          break L69;
                        } else {
                          if ((var10 ^ -1) != -2) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                      }
                      var11 = 1 << (7 & var9);
                      if (0 == (var6 & var11)) {
                        break L68;
                      } else {
                        var7 = var7 + this.a(true, var10, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                        break L68;
                      }
                    }
                    var8++;
                    continue L67;
                  }
                }
              }
            }
          }
          L70: {
            if (param2) {
              break L70;
            } else {
              L71: {
                if (((lk) this).field_r) {
                  break L71;
                } else {
                  if (((lk) this).field_Y) {
                    break L71;
                  } else {
                    break L70;
                  }
                }
              }
              var6 = 0;
              L72: while (true) {
                if ((((lk) this).field_O * ((lk) this).field_a ^ -1) >= (var6 ^ -1)) {
                  L73: {
                    if (((lk) this).field_r) {
                      ((lk) this).field_v = true;
                      ge.a(((lk) this).field_lb, ((lk) this).field_k, (byte) 127, fj.field_k);
                      break L73;
                    } else {
                      break L73;
                    }
                  }
                  L74: {
                    if (((lk) this).field_Y) {
                      ge.a(((lk) this).field_lb, ((lk) this).field_k, (byte) 127, w.field_Eb);
                      break L74;
                    } else {
                      break L74;
                    }
                  }
                  ((lk) this).field_Y = false;
                  ((lk) this).field_r = false;
                  break L70;
                } else {
                  L75: {
                    var7 = ((lk) this).field_P[var6];
                    if (-24 == (var7 ^ -1)) {
                      break L75;
                    } else {
                      L76: {
                        L77: {
                          if (!((lk) this).field_r) {
                            break L77;
                          } else {
                            if (var7 >> 1910143171 == 1) {
                              break L76;
                            } else {
                              break L77;
                            }
                          }
                        }
                        if (!((lk) this).field_Y) {
                          break L75;
                        } else {
                          if ((var7 >> 585718723 ^ -1) == -3) {
                            break L76;
                          } else {
                            break L75;
                          }
                        }
                      }
                      ((lk) this).field_P[var6] = qm.b(24, var7);
                      break L75;
                    }
                  }
                  var6++;
                  continue L72;
                }
              }
            }
          }
          L78: {
            if (((lk) this).field_N != null) {
              ((lk) this).field_mb = ((lk) this).field_mb + 1;
              if (13 == ((lk) this).field_mb) {
                ((lk) this).field_N = null;
                break L78;
              } else {
                break L78;
              }
            } else {
              break L78;
            }
          }
          L79: {
            if (param2) {
              break L79;
            } else {
              if (var5 != 0) {
                break L79;
              } else {
                if (null != ((lk) this).field_N) {
                  break L79;
                } else {
                  if (((lk) this).field_jb <= 0) {
                    break L79;
                  } else {
                    if (((lk) this).field_Z != ((lk) this).field_z) {
                      ge.a(((lk) this).field_lb, ((lk) this).field_k, (byte) 127, qa.field_s);
                      var6 = ((lk) this).field_z;
                      L80: while (true) {
                        if ((var6 ^ -1) <= (((lk) this).field_Z ^ -1)) {
                          ((lk) this).field_L = ((lk) this).field_L + (((lk) this).field_Z - ((lk) this).field_z);
                          var5 = 1;
                          ((lk) this).field_z = ((lk) this).field_Z;
                          break L79;
                        } else {
                          var7 = 0;
                          L81: while (true) {
                            if (var7 >= ((lk) this).field_O) {
                              var6++;
                              continue L80;
                            } else {
                              L82: {
                                var8 = ((lk) this).field_P[var6 * ((lk) this).field_O + var7];
                                if (-1 == (var8 ^ -1)) {
                                  break L82;
                                } else {
                                  ((lk) this).field_P[var6 * ((lk) this).field_O - -var7] = 32 + var8;
                                  ((lk) this).field_ib = 1;
                                  break L82;
                                }
                              }
                              var7++;
                              continue L81;
                            }
                          }
                        }
                      }
                    } else {
                      break L79;
                    }
                  }
                }
              }
            }
          }
          L83: {
            if (var5 != 0) {
              break L83;
            } else {
              L84: {
                if (((lk) this).field_N != null) {
                  break L84;
                } else {
                  if (!param2) {
                    L85: {
                      ((lk) this).field_S = false;
                      ((lk) this).field_s = false;
                      ((lk) this).field_ib = 0;
                      ((lk) this).field_v = false;
                      if (((lk) this).field_rb == null) {
                        break L85;
                      } else {
                        if (((lk) this).field_W != null) {
                          ((lk) this).field_j = ((lk) this).field_j + ((lk) this).field_W.field_t;
                          var6 = ((lk) this).field_W.field_t;
                          fb.field_e = fb.field_e + var6;
                          he.field_ab = he.field_ab + var6;
                          ((lk) this).field_rb.a((bh) (Object) ((lk) this).field_W, 2777);
                          ((lk) this).field_W = null;
                          break L85;
                        } else {
                          break L85;
                        }
                      }
                    }
                    L86: {
                      if (this.c((byte) -117)) {
                        ((lk) this).field_L = ((lk) this).field_L - 1;
                        break L86;
                      } else {
                        break L86;
                      }
                    }
                    ((lk) this).field_M = this.o(32);
                    break L84;
                  } else {
                    break L83;
                  }
                }
              }
              break L83;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        if (param0 < 35) {
            Object var2 = null;
            lk.a((mm) null, true, (mm) null, -73);
        }
        field_i = null;
    }

    private final void b(byte param0) {
        ((lk) this).field_q = ((lk) this).field_q - 1;
        if (this.c((byte) -117)) {
            ((lk) this).field_q = ((lk) this).field_q + 1;
        } else {
            this.h(param0 + 115);
            ge.a(((lk) this).field_lb, ((lk) this).field_k / 4, (byte) 127, hm.field_d);
        }
        if (param0 != -116) {
            ((lk) this).field_j = 63;
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
            ((lk) this).field_pb = -32;
        }
        ge.a(((lk) this).field_sb, ((lk) this).field_J / 8, (byte) 127, ul.field_i);
    }

    private final rf p(int param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (((lk) this).field_t <= 0) {
            throw new IllegalStateException();
        }
        rf var2 = ((lk) this).field_X[0];
        for (var3 = 1; ((lk) this).field_t > var3; var3++) {
            ((lk) this).field_X[-1 + var3] = ((lk) this).field_X[var3];
        }
        ((lk) this).field_m = ((lk) this).field_m + 1;
        if (param0 <= 121) {
            return null;
        }
        ((lk) this).field_t = ((lk) this).field_t - 1;
        return var2;
    }

    final void a(boolean param0, wl param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var4 = param1.e(3);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 == (var4 & 256 ^ -1)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((lk) this).field_S = stackIn_3_1 != 0;
          ((lk) this).field_ab = (1616 & var4) >> 2050439561;
          ((lk) this).field_o = (-1073741824 & var4 << -818043813) >> 627226110;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 == (64 & var4)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((lk) this).field_y = stackIn_6_1 != 0;
          if ((32 & var4) == 0) {
            ((lk) this).field_ib = 1;
            break L2;
          } else {
            ((lk) this).field_ib = 0;
            break L2;
          }
        }
        L3: {
          ((lk) this).field_db = (-1073741824 & var4 << 2113050941) >> 1576984158;
          ((lk) this).field_jb = param1.d((byte) -74);
          if (!param0) {
            break L3;
          } else {
            var5 = ((lk) this).field_jb;
            L4: while (true) {
              if (3 <= var5) {
                break L3;
              } else {
                rk.field_cb = rk.field_cb + 30000;
                fh.field_h = fh.field_h + 30000;
                var5++;
                continue L4;
              }
            }
          }
        }
        var5 = 0;
        L5: while (true) {
          if (((lk) this).field_a * ((lk) this).field_O <= var5) {
            ((lk) this).field_U = param1.d((byte) -71);
            ((lk) this).field_C = param1.d((byte) -38);
            ((lk) this).field_zb = param1.d((byte) -39);
            ((lk) this).field_T = new int[((lk) this).field_C * ((lk) this).field_zb];
            ((lk) this).field_b = new int[((lk) this).field_C * ((lk) this).field_zb];
            ((lk) this).field_tb = new int[((lk) this).field_zb * ((lk) this).field_C];
            var5 = 0;
            L6: while (true) {
              if (var5 >= ((lk) this).field_C * ((lk) this).field_zb) {
                var5 = 0;
                L7: while (true) {
                  if (((lk) this).field_C * ((lk) this).field_zb <= var5) {
                    L8: {
                      ((lk) this).field_q = param1.g((byte) -123);
                      ((lk) this).field_L = param1.g((byte) -84);
                      ((lk) this).field_e = param1.d((byte) -45);
                      ((lk) this).field_Ab = param1.e(3);
                      ((lk) this).field_A = param1.d((byte) -104);
                      ((lk) this).field_Cb = param1.g((byte) -122);
                      ((lk) this).field_yb = param1.d((byte) -102);
                      if (param2 >= 116) {
                        break L8;
                      } else {
                        this.a(84, false, 99);
                        break L8;
                      }
                    }
                    ((lk) this).field_K = param1.d((byte) -52);
                    ((lk) this).field_z = param1.d((byte) -100);
                    ((lk) this).field_Bb = false;
                    return;
                  } else {
                    ((lk) this).field_b[var5] = 8;
                    var5++;
                    continue L7;
                  }
                }
              } else {
                ((lk) this).field_T[var5] = param1.d((byte) -42);
                var5++;
                continue L6;
              }
            }
          } else {
            L9: {
              var6 = param1.d((byte) -40);
              if (-129 >= (var6 ^ -1)) {
                var7 = param1.d((byte) -102);
                var6 = 127 & var6 | var7 << 1559143495;
                break L9;
              } else {
                break L9;
              }
            }
            ((lk) this).field_P[var5] = var6;
            var5++;
            continue L5;
          }
        }
    }

    private final int o(int param0) {
        if (param0 != 32) {
            field_i = null;
        }
        return ((lk) this).field_o + ((lk) this).field_zb + 2 * ((lk) this).field_L;
    }

    private final void d(int param0) {
        int var2 = this.o(32);
        if (!(((lk) this).field_M >= var2)) {
            ((lk) this).field_M = var2;
        }
        if (param0 != 30968) {
            Object var3 = null;
            ((lk) this).a((oi) null, -76, false, (lk) null);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          if (param1 > 123) {
            break L0;
          } else {
            ((lk) this).field_pb = -105;
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = ((lk) this).field_P[param0];
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
          int incrementValue$2 = param3;
          param3++;
          ((lk) this).field_w[incrementValue$2] = param0;
          ((lk) this).field_P[param0] = var6 + -2147483648;
          break L1;
        }
        return param3;
    }

    private final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        var4 = ((lk) this).field_P[param1];
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
                      if (0 != ((lk) this).field_l) {
                        break L1;
                      } else {
                        ((lk) this).field_l = 1;
                        ge.a(((lk) this).field_lb, ((lk) this).field_k / 2, (byte) 127, pk.field_q);
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if ((var4 & -1879048193) != 29) {
                      break L2;
                    } else {
                      ((lk) this).field_Y = true;
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
                        ((lk) this).field_G = ((lk) this).field_G | 1 << param0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((-1879048193 & var4 ^ -1) != -29) {
                      break L4;
                    } else {
                      ((lk) this).field_r = true;
                      break L4;
                    }
                  }
                  if ((1879048192 & var4) == 0) {
                    ((lk) this).field_P[param1] = 268435456 + var4;
                    if (((lk) this).field_rb != null) {
                      he.field_ab = he.field_ab + 2000;
                      fb.field_e = fb.field_e + 2000;
                      ((lk) this).field_bb = ((lk) this).field_bb + 2000;
                      ((lk) this).field_rb.a((bh) (Object) new sa(true, 128 - -(256 * (param1 % ((lk) this).field_O)), param1 / ((lk) this).field_O * 256 + 128, 2000, (int[]) null, 13684944, var4, new String[2]), 2777);
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
            var13 = ((lk) this).field_B;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var2 = var9;
            if (var9 == null) {
              break L1;
            } else {
              if (var13.length < ((lk) this).field_C * ((lk) this).field_zb) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 = new int[((lk) this).field_C * ((lk) this).field_zb];
          ((lk) this).field_B = new int[((lk) this).field_C * ((lk) this).field_zb];
          break L0;
        }
        var3 = param0;
        var4 = 0;
        L2: while (true) {
          if (((lk) this).field_zb <= var4) {
            var4 = -((lk) this).field_o + -((lk) this).field_zb + (((lk) this).field_C - -((lk) this).field_db) >> -1674843007;
            ((lk) this).field_q = ((lk) this).field_q + var4;
            var5 = ((lk) this).field_o + ((lk) this).field_db + (-((lk) this).field_C + ((lk) this).field_zb) >> -212989087;
            ((lk) this).field_L = ((lk) this).field_L + var5;
            var3 = ((lk) this).field_C;
            ((lk) this).field_C = ((lk) this).field_zb;
            ((lk) this).field_zb = var3;
            ((lk) this).field_B = ((lk) this).field_T;
            ((lk) this).field_T = var2;
            if (this.c((byte) -117)) {
              ((lk) this).field_T = ((lk) this).field_B;
              ((lk) this).field_zb = ((lk) this).field_C;
              ((lk) this).field_B = var2;
              ((lk) this).field_L = ((lk) this).field_L - var5;
              ((lk) this).field_q = ((lk) this).field_q - var4;
              ((lk) this).field_C = var3;
              return false;
            } else {
              ((lk) this).field_ab = ((lk) this).field_ab - 1;
              var3 = ((lk) this).field_db;
              ((lk) this).field_db = ((lk) this).field_o;
              ((lk) this).field_o = -var3;
              this.d(30968);
              var3 = 0;
              this.h(param0 ^ -1);
              var6 = 0;
              L3: while (true) {
                if (((lk) this).field_zb <= var6) {
                  ge.a(((lk) this).field_lb, ((lk) this).field_k / 4, (byte) 127, ib.field_ob);
                  return true;
                } else {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= ((lk) this).field_C) {
                      var6++;
                      continue L3;
                    } else {
                      ((lk) this).field_tb[var3] = 0;
                      ((lk) this).field_b[var3] = 8 * (-1 + -(var7 * 2) + ((lk) this).field_db + ((lk) this).field_C) / ((lk) this).field_C;
                      var3++;
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var5 = (-1 + ((lk) this).field_C) * ((lk) this).field_zb + var4;
            var6 = 0;
            L5: while (true) {
              if (var6 >= ((lk) this).field_C) {
                var4++;
                continue L2;
              } else {
                int incrementValue$2 = var3;
                var3++;
                ((lk) this).field_B[var5] = ((lk) this).field_T[incrementValue$2];
                var5 = var5 - ((lk) this).field_zb;
                var6++;
                continue L5;
              }
            }
          }
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (0 != ((lk) this).field_C) {
            if (!(((lk) this).field_S)) {
                var4 = param2 + -((lk) this).field_q;
                var5 = -((lk) this).field_L + param0;
                if (-1 >= var4) {
                    if (-1 <= var5) {
                        if (((lk) this).field_C > var4) {
                            if (var5 >= ((lk) this).field_zb) {
                                var4 = 119 / ((45 - param1) / 37);
                                return 0;
                            }
                            var6 = var5 * ((lk) this).field_C + var4;
                            if (((lk) this).field_T[var6] != 0) {
                                return ((lk) this).field_tb[var6];
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
        int var7 = client.field_A ? 1 : 0;
        int var4 = 0;
        for (var5 = param0; var5 < param1; var5++) {
            var6 = ((lk) this).field_w[var5];
            var4 = var4 + var6 % ((lk) this).field_O;
        }
        if (param2 <= 49) {
            int discarded$0 = this.a((byte) -117);
        }
        return 128 + var4 * 256 / (-param0 + param1);
    }

    final int r(int param0) {
        if (param0 != 3837) {
            return -4;
        }
        if (0 > ((lk) this).field_L) {
            return ((lk) this).field_L;
        }
        return 0;
    }

    private final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        ((lk) this).field_L = ((lk) this).field_L + 1;
        if (!(!this.c((byte) -117))) {
            ((lk) this).field_L = ((lk) this).field_L - 1;
            return true;
        }
        this.d(30968);
        if (param1) {
            var3 = this.a((byte) 103);
            if (var3 != 1) {
                ge.a(((lk) this).field_lb, ((lk) this).field_k / 4, (byte) 127, pg.field_d);
            } else {
                ge.a(((lk) this).field_lb, ((lk) this).field_k / 8, (byte) 127, client.field_F);
            }
        }
        int var5 = 0;
        var3 = var5;
        while (((lk) this).field_zb * ((lk) this).field_C > var5) {
            ((lk) this).field_tb[var5] = 0;
            ((lk) this).field_b[var5] = 8;
            var5++;
        }
        if (param0 >= -27) {
            ((lk) this).a(-71, (byte) 28, false);
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
        var3 = ((lk) this).field_q + ((lk) this).field_L * ((lk) this).field_O;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((lk) this).field_zb) {
            if (param0 == -117) {
              return false;
            } else {
              return true;
            }
          } else {
            var5 = 0;
            L1: while (true) {
              if (((lk) this).field_C <= var5) {
                var3 = var3 + (((lk) this).field_O - ((lk) this).field_C);
                var4++;
                continue L0;
              } else {
                if (((lk) this).field_T[var2] != 0) {
                  L2: {
                    if ((((lk) this).field_q - -var5 ^ -1) > -1) {
                      break L2;
                    } else {
                      if (((lk) this).field_O <= ((lk) this).field_q + var5) {
                        break L2;
                      } else {
                        if (((lk) this).field_L + var4 < ((lk) this).field_a) {
                          if (var4 + ((lk) this).field_L <= -1) {
                            if (-1 != ((lk) this).field_P[var3]) {
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
        if (((lk) this).field_N != null) {
            var5 = -((lk) this).field_ob + param0;
            var6 = -((lk) this).field_E + param2;
            if ((var5 ^ -1) <= -1) {
                if ((var6 ^ -1) <= -1) {
                    if (var5 < ((lk) this).field_V) {
                        if (var6 < ((lk) this).field_h) {
                            var7 = ((lk) this).field_N[var6 * ((lk) this).field_V + var5];
                            if (!(-1 == (var7 ^ -1))) {
                                var4 = ((lk) this).field_mb;
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
          if ((((lk) this).field_C * ((lk) this).field_zb ^ -1) >= (var4 ^ -1)) {
            L1: {
              ((lk) this).field_Z = param0;
              if (((lk) this).field_z <= ((lk) this).field_L) {
                var4 = 0;
                var5 = ((lk) this).field_L * ((lk) this).field_O + ((lk) this).field_q;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if ((var7 ^ -1) <= (((lk) this).field_zb ^ -1)) {
                    if (0 < var6) {
                      L3: {
                        var7 = ((int)((double)((lk) this).field_k * Math.sqrt((double)var6)) + 4) / 8;
                        if ((var7 ^ -1) >= (((lk) this).field_k ^ -1)) {
                          break L3;
                        } else {
                          var7 = ((lk) this).field_k;
                          break L3;
                        }
                      }
                      ge.a(((lk) this).field_lb, var7, (byte) 127, fh.field_c);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var8 = 0;
                    L4: while (true) {
                      if ((var8 ^ -1) <= (((lk) this).field_C ^ -1)) {
                        var5 = var5 + (((lk) this).field_O - ((lk) this).field_C);
                        var7++;
                        continue L2;
                      } else {
                        L5: {
                          var9 = ((lk) this).field_T[var4];
                          if (-1 != (var9 ^ -1)) {
                            L6: {
                              L7: {
                                if ((24 & var9) == 16) {
                                  break L7;
                                } else {
                                  if ((var7 ^ -1) == -1) {
                                    break L7;
                                  } else {
                                    if (-1 == (((lk) this).field_T[-((lk) this).field_C + var4] ^ -1)) {
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
                              ((lk) this).field_P[var5] = var9;
                              if ((24 & var9) != 16) {
                                break L8;
                              } else {
                                if (((lk) this).field_rb != null) {
                                  ((lk) this).field_x = ((lk) this).field_x + 25;
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
                  ((lk) this).field_jb = ((lk) this).field_jb - 1;
                  if (!param2) {
                    break L9;
                  } else {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    break L9;
                  }
                }
                if (((lk) this).field_jb > 0) {
                  ((lk) this).field_E = ((lk) this).field_L;
                  ((lk) this).field_V = ((lk) this).field_C;
                  ((lk) this).field_ob = ((lk) this).field_q;
                  ((lk) this).field_h = ((lk) this).field_zb;
                  var4 = ((lk) this).field_V * ((lk) this).field_h;
                  ((lk) this).field_N = new int[var4];
                  var5 = var4;
                  var6 = -1 + (((lk) this).field_L + ((lk) this).field_zb);
                  L10: while (true) {
                    if (((lk) this).field_L > var6) {
                      ((lk) this).field_mb = 1;
                      ge.a(((lk) this).field_lb, ((lk) this).field_k / 2, (byte) 127, ul.field_i);
                      break L1;
                    } else {
                      var7 = -1 + (((lk) this).field_q - -((lk) this).field_C);
                      L11: while (true) {
                        if ((((lk) this).field_q ^ -1) < (var7 ^ -1)) {
                          var6--;
                          continue L10;
                        } else {
                          L12: {
                            L13: {
                              var5--;
                              var8 = ((lk) this).field_T[var5];
                              if ((24 & var8) == 16) {
                                break L13;
                              } else {
                                if (24 == (var8 & 24)) {
                                  break L13;
                                } else {
                                  ((lk) this).field_N[var5] = var8;
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              var9 = var6;
                              if (var9 >= ((lk) this).field_z) {
                                break L14;
                              } else {
                                var9 = ((lk) this).field_z;
                                break L14;
                              }
                            }
                            L15: {
                              if ((((lk) this).field_a ^ -1) >= (var9 ^ -1)) {
                                break L15;
                              } else {
                                if (-1 != (((lk) this).field_P[var7 + ((lk) this).field_O * var9] ^ -1)) {
                                  break L15;
                                } else {
                                  ((lk) this).field_P[var7 + ((lk) this).field_O * var9] = 32 + var8;
                                  if (16 != (var8 & 24)) {
                                    break L12;
                                  } else {
                                    if (((lk) this).field_rb == null) {
                                      break L12;
                                    } else {
                                      fb.field_e = fb.field_e + 25;
                                      he.field_ab = he.field_ab + 25;
                                      ((lk) this).field_x = ((lk) this).field_x + 25;
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            ((lk) this).field_N[var5] = var8;
                            break L12;
                          }
                          var7--;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  ((lk) this).k(-9897);
                  return;
                }
              }
            }
            ((lk) this).field_p = 0;
            ((lk) this).field_S = true;
            ((lk) this).field_Bb = false;
            ((lk) this).field_nb = 0;
            ((lk) this).field_K = 0;
            ((lk) this).field_C = 0;
            return;
          } else {
            L16: {
              if (-1 == (((lk) this).field_T[var4] ^ -1)) {
                break L16;
              } else {
                ((lk) this).field_qb = ((lk) this).field_qb + 1;
                break L16;
              }
            }
            var4++;
            continue L0;
          }
        }
    }

    final static void a(mm param0, boolean param1, mm param2, int param3) {
        rk.field_R = param2;
        om.field_a = param3;
        bg.field_g = param0;
        pj.a(31004, hk.field_j / 2, hk.field_i / 2);
        s.a(param2.field_C, param0.field_K + param0.field_C, (byte) -91, param0.field_C, param2.field_C + param2.field_K);
        if (!param1) {
            field_i = null;
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
            if (param1 == -1) {
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
              return true;
            }
          } else {
            L3: {
              var6 = ((lk) this).field_w[var5];
              if (var6 < ((lk) this).field_O) {
                var3 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (((lk) this).field_O * (((lk) this).field_a - 1) <= var6) {
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
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0 == 30000) {
            break L0;
          } else {
            ((lk) this).field_O = -79;
            break L0;
          }
        }
        ((lk) this).field_e = param1;
        L1: while (true) {
          L2: {
            if (param1 != 0) {
              break L2;
            } else {
              if (((lk) this).field_y) {
                ((lk) this).field_Bb = true;
                break L2;
              } else {
                L3: {
                  stackOut_5_0 = this;
                  stackOut_5_1 = -126;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (0 != param2) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L3;
                  }
                }
                if (this.a((byte) stackIn_8_1, stackIn_8_2 != 0)) {
                  ((lk) this).field_e = 20;
                  ((lk) this).field_y = true;
                  break L2;
                } else {
                  param2++;
                  param1 = ((lk) this).field_g;
                  ((lk) this).field_e = ((lk) this).field_g;
                  continue L1;
                }
              }
            }
          }
          L4: {
            if (((lk) this).field_g != -1) {
              break L4;
            } else {
              if (-1 < param2) {
                L5: {
                  var4 = ((int)((double)((lk) this).field_k * Math.sqrt((double)(((lk) this).field_a - -param2) / ((double)((lk) this).field_a * 2.0))) + 4) / 8;
                  if (var4 > ((lk) this).field_k) {
                    var4 = ((lk) this).field_k;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ge.a(((lk) this).field_lb, var4, (byte) 127, fh.field_c);
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
        if (((lk) this).field_t > 0) {
            if (!(-1 != (((lk) this).field_X[0].field_l ^ -1))) {
                return true;
            }
        }
        if (((lk) this).field_pb >= 18) {
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
          L0: {
            if (param0 < -45) {
              break L0;
            } else {
              int discarded$2 = this.a(-31, -66, (byte) 71, -102);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if ((var3 ^ -1) <= -5) {
              return false;
            } else {
              var4 = ((lk) this).field_w[var3];
              var5 = var4 % ((lk) this).field_O;
              var6 = var4 / ((lk) this).field_O;
              var7 = 0;
              L2: while (true) {
                if (4 <= var7) {
                  return true;
                } else {
                  if (var3 != var7) {
                    L3: {
                      var8 = ((lk) this).field_w[var7];
                      var9 = var8 % ((lk) this).field_O;
                      var10 = var8 / ((lk) this).field_O;
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
        int var6 = 0;
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
        L0: {
          var19 = client.field_A ? 1 : 0;
          if (param0 != null) {
            break L0;
          } else {
            if (param1 == null) {
              return;
            } else {
              break L0;
            }
          }
        }
        var6 = -1 + ((lk) this).field_O;
        var7 = -1 + ((lk) this).field_a;
        var8 = param3;
        var9 = 0;
        var10 = 0;
        L1: while (true) {
          if (param4 <= var10) {
            L2: {
              var10 = -var6 + 1 + var8;
              var11 = var9 - -1 - var7;
              var12 = var10 * var11;
              int fieldTemp$2 = ((lk) this).field_fb;
              ((lk) this).field_fb = ((lk) this).field_fb + 1;
              var13 = fieldTemp$2;
              var14 = null;
              if (param1 == null) {
                break L2;
              } else {
                var14 = (Object) (Object) param1.a(false, var13);
                break L2;
              }
            }
            L3: {
              if (var14 == null) {
                L4: {
                  var21 = new rf(var13);
                  var14 = (Object) (Object) var21;
                  int fieldTemp$3 = ((lk) this).field_p;
                  ((lk) this).field_p = ((lk) this).field_p + 1;
                  var21.field_m = fieldTemp$3;
                  if (param1 != null) {
                    param1.a(var21, 0);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((rf) var14).field_b = var10;
                ((rf) var14).field_c = new byte[var12];
                ((rf) var14).field_n = var11;
                var15 = 0;
                L5: while (true) {
                  if (var15 >= var12) {
                    break L3;
                  } else {
                    ((rf) var14).field_c[var15] = (byte) 0;
                    var15++;
                    continue L5;
                  }
                }
              } else {
                ((rf) var14).field_b = var10;
                ((rf) var14).field_c = new byte[var12];
                ((rf) var14).field_n = var11;
                var15 = 0;
                L6: while (true) {
                  if (var15 >= var12) {
                    break L3;
                  } else {
                    ((rf) var14).field_c[var15] = (byte) 0;
                    var15++;
                    continue L6;
                  }
                }
              }
            }
            var20 = 0;
            var15 = var20;
            L7: while (true) {
              if (var20 >= param4) {
                L8: {
                  if (param0 == null) {
                    break L8;
                  } else {
                    param0.a((rf) var14, (byte) -128);
                    break L8;
                  }
                }
                return;
              } else {
                var16 = ((lk) this).field_w[var20];
                var17 = -var6 + var16 % ((lk) this).field_O;
                var18 = var16 / ((lk) this).field_O - var7;
                ((rf) var14).field_c[var17 + var18 * var10] = (byte)param2;
                var20++;
                continue L7;
              }
            }
          } else {
            L9: {
              var11 = ((lk) this).field_w[var10];
              var12 = var11 % ((lk) this).field_O;
              var13 = var11 / ((lk) this).field_O;
              if (var12 < var6) {
                var6 = var12;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (var12 > var8) {
                var8 = var12;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var9 >= var13) {
                break L11;
              } else {
                var9 = var13;
                break L11;
              }
            }
            if (var13 < var7) {
              var7 = var13;
              var10++;
              continue L1;
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param1 != 2113050941) {
            int discarded$0 = this.a(80, 86, (byte) -26, -11);
        }
        if (!param2) {
            ((lk) this).field_g = mn.field_b[param0];
        } else {
            ((lk) this).field_g = pn.field_eb[param0];
        }
    }

    private final void c(boolean param0) {
        if (!(!this.t(0))) {
            return;
        }
        if (param0) {
            boolean discarded$0 = this.c(61, 75);
        }
        if (!(-1 == ((((lk) this).field_db | ((lk) this).field_o) ^ -1))) {
            ((lk) this).field_db = -((lk) this).field_db;
            ((lk) this).field_o = -((lk) this).field_o;
            if (!(!this.t(0))) {
                return;
            }
            ((lk) this).field_db = -((lk) this).field_db;
            ((lk) this).field_o = -((lk) this).field_o;
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int var5 = ((lk) this).field_P[param1];
        if (param3 != (-1879048193 & var5)) {
            this.b(7 & param3, param1, false);
        } else {
            if (-1879048193 < (var5 & 1879048192 ^ -1)) {
                var5 = var5 + 268435456;
            }
            int incrementValue$0 = param0;
            param0++;
            ((lk) this).field_w[incrementValue$0] = param1;
            ((lk) this).field_P[param1] = var5 + -2147483648;
        }
        if (param2 != -44) {
            Object var6 = null;
            int discarded$1 = this.a(true, 26, -7, (lk) null, true, 84, -39, 24, (oi) null, false, (byte) -94);
        }
        return param0;
    }

    private final void j(int param0) {
        ((lk) this).field_q = ((lk) this).field_q + 1;
        if (!this.c((byte) -117)) {
            this.h(-1);
            ge.a(((lk) this).field_lb, ((lk) this).field_k / 4, (byte) 127, hm.field_d);
        } else {
            ((lk) this).field_q = ((lk) this).field_q - 1;
        }
        if (param0 != 4) {
            ((lk) this).field_mb = -42;
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var4 = 0;
        int var5 = param2;
        if (!param0) {
            ((lk) this).field_N = null;
        }
        while (var5 < param1) {
            var6 = ((lk) this).field_w[var5];
            var7 = var6 / ((lk) this).field_O;
            if (gg.field_B > var7) {
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
            ((lk) this).field_A = -70;
        }
        return ((lk) this).field_j + (((lk) this).field_ub + ((lk) this).field_hb) + (((lk) this).field_H + ((lk) this).field_x) - (-((lk) this).field_bb - ((lk) this).field_f);
    }

    final int m(int param0) {
        int var2 = 0;
        if (1 <= ((lk) this).field_c) {
            var2++;
        }
        int var3 = ((lk) this).field_u.a(79, var2 + ((lk) this).field_d);
        int var4 = ((lk) this).field_u.a(107, ((lk) this).field_d - -var2);
        if (param0 != 26580) {
            return -69;
        }
        if (((lk) this).field_d == var3) {
            var3 = 7;
        }
        if (((lk) this).field_d == var4) {
            var4 = 7;
        }
        return var4 + (var3 << -793988540);
    }

    final void s(int param0) {
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
        int[] var16 = null;
        int stackIn_94_0 = 0;
        int stackIn_111_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (((lk) this).field_S) {
            break L0;
          } else {
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (((lk) this).field_zb <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((lk) this).field_C) {
                    break L0;
                  } else {
                    var4 = -1073741824;
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= ((lk) this).field_zb) {
                        var5_int = 1073741823;
                        var6 = -1 + ((lk) this).field_zb;
                        L4: while (true) {
                          if (0 > var6) {
                            var3++;
                            continue L2;
                          } else {
                            L5: {
                              var2 = ((lk) this).field_C * var6 - -var3;
                              var7 = var3 + ((lk) this).field_q;
                              if (var7 < 0) {
                                break L5;
                              } else {
                                if (((lk) this).field_O > var7) {
                                  var8 = ((lk) this).field_L - -var6 - -1;
                                  var9 = 0;
                                  L6: while (true) {
                                    if (var5_int <= var9) {
                                      break L5;
                                    } else {
                                      L7: {
                                        if (var8 >= ((lk) this).field_a) {
                                          break L7;
                                        } else {
                                          if (-1 >= (var8 ^ -1)) {
                                            if (((lk) this).field_P[var7 + ((lk) this).field_O * var8] != 0) {
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
                              var8 = ((lk) this).field_tb[var2];
                              var9 = ((lk) this).field_b[var2];
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
                            ((lk) this).field_tb[var2] = var8;
                            ((lk) this).field_b[var2] = var9;
                            var5_int += 80;
                            if (((lk) this).field_T[var2] != 0) {
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
                          var2 = var3 + var5_int * ((lk) this).field_C;
                          var6 = ((lk) this).field_q + var3;
                          if ((var6 ^ -1) > -1) {
                            break L10;
                          } else {
                            if (((lk) this).field_O > var6) {
                              var7 = ((lk) this).field_L - (-var5_int + 1);
                              var8 = 0;
                              L11: while (true) {
                                if (-1 < (var7 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var4 >= var8) {
                                    break L10;
                                  } else {
                                    if (var7 < ((lk) this).field_a) {
                                      if (0 != ((lk) this).field_P[var6 + var7 * ((lk) this).field_O]) {
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
                          var7 = ((lk) this).field_tb[var2];
                          var8 = ((lk) this).field_b[var2];
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
                        ((lk) this).field_tb[var2] = var7;
                        ((lk) this).field_b[var2] = var8;
                        var4 -= 80;
                        if (-1 != (((lk) this).field_T[var2] ^ -1)) {
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
                  if (((lk) this).field_C <= var4) {
                    var3++;
                    continue L1;
                  } else {
                    L14: {
                      var5_int = ((lk) this).field_tb[var2];
                      var6 = ((lk) this).field_b[var2];
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
                    ((lk) this).field_tb[var2] = var5_int;
                    ((lk) this).field_b[var2] = var6;
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
          if (((lk) this).field_vb != null) {
            ((lk) this).field_R = ((lk) this).field_R + 1;
            if (100 > ((lk) this).field_R) {
              break L16;
            } else {
              ((lk) this).field_vb = null;
              break L16;
            }
          } else {
            break L16;
          }
        }
        var2 = 1;
        var3 = 0;
        L17: while (true) {
          if (((lk) this).field_t <= var3) {
            L18: {
              if (param0 == -21142) {
                break L18;
              } else {
                this.h(13);
                break L18;
              }
            }
            L19: {
              if (!((lk) this).e(-124)) {
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
                if (((lk) this).field_t <= 0) {
                  break L21;
                } else {
                  if (-14 < ((lk) this).field_X[0].field_e) {
                    break L21;
                  } else {
                    rf discarded$2 = this.p(127);
                    continue L20;
                  }
                }
              }
              L22: {
                if (((lk) this).field_cb == null) {
                  break L22;
                } else {
                  if (((lk) this).field_cb.c((byte) 70) == null) {
                    break L22;
                  } else {
                    L23: {
                      if (-1 == ((lk) this).field_pb) {
                        this.b(false);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (-323 != (((lk) this).field_pb ^ -1)) {
                        break L24;
                      } else {
                        this.c(0);
                        break L24;
                      }
                    }
                    ((lk) this).field_pb = ((lk) this).field_pb + 1;
                    if (335 == ((lk) this).field_pb) {
                      ((lk) this).field_pb = 0;
                      bh discarded$3 = ((lk) this).field_cb.a(param0 + 21146);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L25: {
                if (!((lk) this).e(param0 ^ 21190)) {
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
                      ge.a(((lk) this).field_sb, ((lk) this).field_J / 8, (byte) 127, ig.field_ac);
                      break L26;
                    } else {
                      if (var4 != 0) {
                        break L26;
                      } else {
                        ge.a(((lk) this).field_sb, ((lk) this).field_J / 8, (byte) 127, ig.field_ac);
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
                      ge.a(((lk) this).field_sb, ((lk) this).field_J / 8, (byte) 127, ig.field_ac);
                      break L26;
                    }
                  }
                }
              }
              L27: {
                if (var4 != 0) {
                  ah.field_b[((lk) this).field_Q] = true;
                  var5 = ik.field_c[((lk) this).field_Q];
                  if (var5 == null) {
                    var6 = 100 + rd.a((byte) 16, 4, ((lk) this).field_Q);
                    var11 = ei.c(kf.field_P, var6, pb.field_d * ((lk) this).field_J, ((lk) this).field_sb << 1719062758);
                    var13 = var11;
                    var13.f(-1);
                    dg.field_c.a((ol) (Object) var11);
                    ik.field_c[((lk) this).field_Q] = var11;
                    break L27;
                  } else {
                    var5.b(en.field_o / 50, pb.field_d * ((lk) this).field_J, ((lk) this).field_sb << -2127177498);
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
              var4_ref_rf = ((lk) this).field_X[var3];
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
                        ((lk) this).field_vb = cm.a((byte) 105, uj.field_b, new String[1]);
                        ((lk) this).field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
                        ((lk) this).field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
                        ((lk) this).field_R = 0;
                        var16 = vl.field_G;
                        var7 = var5_int / 10;
                        if (var16.length <= var7) {
                          var7 = var16.length + -1;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ((lk) this).field_xb = var16[var7];
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
        L0: {
          ((lk) this).field_k = 128;
          ((lk) this).field_r = false;
          ((lk) this).field_j = 0;
          ((lk) this).field_wb = 18;
          ((lk) this).field_U = -1;
          ((lk) this).field_K = 0;
          ((lk) this).field_vb = null;
          ((lk) this).field_X = new rf[1];
          ((lk) this).field_sb = 48;
          ((lk) this).field_G = 0;
          ((lk) this).field_lb = 128;
          ((lk) this).field_Y = false;
          ((lk) this).field_R = 0;
          ((lk) this).field_S = false;
          ((lk) this).field_x = 0;
          ((lk) this).field_f = 0;
          ((lk) this).field_l = 0;
          ((lk) this).field_ib = 0;
          ((lk) this).field_u = null;
          ((lk) this).field_Q = -1;
          ((lk) this).field_v = false;
          ((lk) this).field_J = 128;
          ((lk) this).field_hb = 0;
          ((lk) this).field_ub = 0;
          ((lk) this).field_s = false;
          ((lk) this).field_Bb = false;
          ((lk) this).field_bb = 0;
          ((lk) this).field_H = 0;
          ((lk) this).field_jb = 3;
          ((lk) this).field_pb = 0;
          if (!param0) {
            ((lk) this).field_a = 18;
            ((lk) this).field_O = 8;
            break L0;
          } else {
            ((lk) this).field_O = 12;
            ((lk) this).field_a = 27;
            break L0;
          }
        }
        ((lk) this).field_d = param3;
        ((lk) this).field_w = new int[((lk) this).field_O * ((lk) this).field_a];
        ((lk) this).field_D = param2;
        ((lk) this).field_c = param4;
        ((lk) this).field_P = new int[((lk) this).field_O * ((lk) this).field_a];
        ((lk) this).a(param1, 2113050941, false);
        ((lk) this).field_t = 0;
        ((lk) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 3;
        field_i = "There are no valid types of game that match your preferences.";
    }
}
