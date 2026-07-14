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
        this.a(param0 + -131, ((ql) this).field_r, ((ql) this).field_f);
        if (param0 != 3) {
            field_l = null;
        }
    }

    public final void a(int param0) {
        if (param0 <= 94) {
            ((ql) this).field_o = null;
        }
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = ((ql) this).field_n;
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
            ((ql) this).field_g = null;
            break L1;
          }
        }
    }

    public final void b(oj param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ql) this).field_k.field_c[0] = ((ql) this).field_b.field_x % ((ql) this).field_s;
          ((ql) this).field_k.field_c[1] = ((ql) this).field_b.field_x / ((ql) this).field_s;
          ((ql) this).field_k.f(-48);
          ((ql) this).field_k.i(0);
          ((ql) this).field_q[1] = ((ql) this).field_k.field_e[1];
          ((ql) this).field_q[0] = ((ql) this).field_k.field_e[0];
          ((ql) this).field_b.field_m = ((ql) this).field_q[0];
          var3 = -44 / ((param1 - -26) / 48);
          ((ql) this).field_h = ((ql) this).field_h + 1;
          ((ql) this).field_b.field_v = ((ql) this).field_q[1];
          if (((ql) this).field_h == 20) {
            L1: {
              if (((ql) this).field_n == 7) {
                break L1;
              } else {
                if (-9 == (((ql) this).field_n ^ -1)) {
                  break L1;
                } else {
                  if ((((ql) this).field_n ^ -1) == -11) {
                    break L1;
                  } else {
                    if (((ql) this).field_n == 11) {
                      break L1;
                    } else {
                      if (12 == ((ql) this).field_n) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            ((ql) this).field_t = new int[10][2];
            var4 = 0;
            L2: while (true) {
              if (-11 >= (var4 ^ -1)) {
                param0.a(((ql) this).field_o, -26661);
                break L0;
              } else {
                L3: {
                  stackOut_10_0 = ((ql) this).field_t[var4];
                  stackOut_10_1 = 0;
                  stackOut_10_2 = ns.a(false, 20, li.field_n) - -20;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  if (10 >= ns.a(false, 20, li.field_n)) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = stackIn_12_2;
                    stackOut_12_3 = -1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    break L3;
                  } else {
                    stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    break L3;
                  }
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2 * stackIn_13_3;
                ((ql) this).field_t[var4][1] = -60 + -1 * ns.a(false, 40, li.field_n);
                var4++;
                continue L2;
              }
            }
          } else {
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ql) this).field_h > -41) {
            if (-21 > ((ql) this).field_h) {
              hh.field_d.d(-40 + param2, param1 - 40, 80, 80, 255 * ((ql) this).field_h / 20);
              hh.field_d.d(param2 - 40, param1 + -40, 80, 80, ((ql) this).field_h * 255 / 20);
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
            ((ql) this).field_d = null;
            break L1;
          }
        }
        L2: {
          if (null != ((ql) this).field_t) {
            var4 = 0;
            L3: while (true) {
              if (((ql) this).field_t.length <= var4) {
                break L2;
              } else {
                var5 = (((ql) this).field_h - 20) * ((ql) this).field_t[var4][0] / 20 + param2;
                var6 = ((ql) this).field_t[var4][1] * (((ql) this).field_h + -20) / 20 + param1;
                hh.field_d.d(var5 - 10, var6 + (((ql) this).field_h + -20) * (-20 + ((ql) this).field_h) / 10 + -10, 20, 20, 255 * (-((ql) this).field_h + 60) / 40);
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
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ql) this).field_h = 0;
          ((ql) this).field_b.field_x = param2 + ((ql) this).field_s * param1;
          if (param3.field_m != 12) {
            break L0;
          } else {
            L1: {
              ((ql) this).field_n = 1;
              ((ql) this).field_d = ((ql) this).field_o.c(param1, true, param2);
              if (null == ((ql) this).field_d) {
                break L1;
              } else {
                if (((ql) this).field_d.field_O != ((qq) (Object) param3).field_G) {
                  break L1;
                } else {
                  if (((ql) this).field_d.field_Y < ((ql) this).field_d.field_t) {
                    ((ql) this).field_i = 16711935;
                    ((ql) this).field_m = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            ((ql) this).field_h = 50;
            ((ql) this).field_n = -1;
            return false;
          }
        }
        L2: {
          if (param3.field_m == 14) {
            L3: {
              ((ql) this).field_n = 2;
              ((ql) this).field_d = ((ql) this).field_o.c(param1, true, param2);
              ((ql) this).field_f = ns.a(false, 21, li.field_n) - 10;
              ((ql) this).field_r = ns.a(false, 21, li.field_n) - 10;
              if (((ql) this).field_d == null) {
                break L3;
              } else {
                if (((ql) this).field_d.field_O != ((qq) (Object) param3).field_G) {
                  break L3;
                } else {
                  if (-6 != (((ql) this).field_d.field_A ^ -1)) {
                    ((ql) this).field_i = 16711935;
                    ((ql) this).field_m = -((ql) this).field_d.field_A + 5;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            ((ql) this).field_n = -1;
            ((ql) this).field_h = 50;
            return false;
          } else {
            break L2;
          }
        }
        L4: {
          if (16 != param3.field_m) {
            break L4;
          } else {
            L5: {
              L6: {
                ((ql) this).field_n = 1;
                ((ql) this).field_d = ((ql) this).field_o.c(param1, true, param2);
                ((ql) this).field_f = ns.a(false, 21, li.field_n) + -10;
                ((ql) this).field_r = -10 + ns.a(false, 21, li.field_n);
                if (!((ql) this).field_g[param2 - -(((ql) this).field_s * param1)].c(92)) {
                  break L6;
                } else {
                  if (null == ((ql) this).field_d) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (((ql) this).field_d == null) {
                  break L7;
                } else {
                  if (!((ql) this).field_d.a(23072)) {
                    break L7;
                  } else {
                    if (((ql) this).field_d.field_O != ((qq) (Object) param3).field_G) {
                      break L7;
                    } else {
                      if (((ql) this).field_d.field_t != ((ql) this).field_d.field_Y) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              ((ql) this).field_h = 50;
              ((ql) this).field_n = -1;
              return false;
            }
            L8: {
              if (null == ((ql) this).field_d) {
                ((ql) this).field_m = 5;
                break L8;
              } else {
                ((ql) this).field_m = -((ql) this).field_d.field_Y + ((ql) this).field_d.field_t;
                break L8;
              }
            }
            if (((ql) this).field_m > 5) {
              ((ql) this).field_m = 5;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L9: {
          if (param0 <= -68) {
            break L9;
          } else {
            ((ql) this).field_g = null;
            break L9;
          }
        }
        L10: {
          if (-26 == (param3.field_m ^ -1)) {
            ((ql) this).field_n = 7;
            hs.b(-55, 46);
            break L10;
          } else {
            if ((param3.field_m ^ -1) == -27) {
              ((ql) this).field_n = 7;
              break L10;
            } else {
              break L10;
            }
          }
        }
        if (param3.field_m == 24) {
          L11: {
            ((ql) this).field_n = 7;
            var7 = (wa) (Object) ((pj) (Object) param3).field_B;
            var8 = var7;
            if (6 == uc.field_d[var7.field_c][4]) {
              ((ql) this).field_n = 10;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (uc.field_d[var7.field_c][4] != -5) {
              break L12;
            } else {
              if (-65 == uc.field_d[var7.field_c][5]) {
                break L12;
              } else {
                if (-1 == (uc.field_d[var7.field_c][5] ^ -1)) {
                  break L12;
                } else {
                  if (uc.field_d[var7.field_c][6] >= 0) {
                    if (uc.field_d[var8.field_c][7] <= 0) {
                      ((ql) this).field_n = 12;
                      break L12;
                    } else {
                      ((ql) this).field_n = 11;
                      break L12;
                    }
                  } else {
                    if (uc.field_d[var7.field_c][7] > 0) {
                      ((ql) this).field_n = 14;
                      break L12;
                    } else {
                      ((ql) this).field_n = 13;
                      break L12;
                    }
                  }
                }
              }
            }
          }
          ((ql) this).b(param3, (byte) 102);
          ((ql) this).field_b.field_x = param2 - -(param1 * ((ql) this).field_s);
          return true;
        } else {
          ((ql) this).b(param3, (byte) 102);
          ((ql) this).field_b.field_x = param2 - -(param1 * ((ql) this).field_s);
          return true;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (40 <= ((ql) this).field_h) {
            break L0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -31) {
                break L0;
              } else {
                if (var4 >= ((ql) this).field_h) {
                  break L0;
                } else {
                  L2: {
                    stackOut_4_0 = var2;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (ns.a(false, 100, li.field_n) > 50) {
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = ns.a(false, 100, li.field_n) - 50 >> -2116887836;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  L3: {
                    var2 = stackIn_7_0 + stackIn_7_1;
                    stackOut_7_0 = var3;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (ns.a(false, 100, li.field_n) <= 50) {
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = -50 + ns.a(false, 100, li.field_n) >> 758171524;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 0;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  var3 = stackIn_10_0 + stackIn_10_1;
                  hh.field_d.d(((ql) this).field_b.field_m - -35 + var2, var3 + (((ql) this).field_b.field_v - -(var4 * 4)) + -120, 10, 10, var4 * 8);
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
          if (null == ((ql) this).field_t) {
            break L5;
          } else {
            var2 = 0;
            L6: while (true) {
              if (((ql) this).field_t.length <= var2) {
                break L5;
              } else {
                var3 = ((ql) this).field_b.field_m + (((ql) this).field_t[var2][0] * (((ql) this).field_h + -20) / 20 - -30);
                var4 = -20 + ((ql) this).field_t[var2][1] * (((ql) this).field_h + -20) / 20 + ((ql) this).field_b.field_v;
                hh.field_d.d(var3, var4 + (((ql) this).field_h + -20) * (((ql) this).field_h + -20) / 10, 20, 20, 255 * (-((ql) this).field_h + 60) / 40);
                var2++;
                continue L6;
              }
            }
          }
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
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
          if (((ql) this).field_h < 20) {
            L1: {
              stackOut_2_0 = hs.field_F[ns.a(false, hs.field_F.length, li.field_n)];
              stackOut_2_1 = ((ql) this).field_b.field_m - -30;
              stackOut_2_2 = -90 + (((ql) this).field_b.field_v - -(((ql) this).field_h * 4));
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
              if ((((ql) this).field_h ^ -1) >= -11) {
                stackOut_4_0 = (wk) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = ((ql) this).field_h * 255 / 10;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                break L1;
              } else {
                stackOut_3_0 = (wk) (Object) stackIn_3_0;
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
          if (null != ((ql) this).field_t) {
            var2 = 0;
            L3: while (true) {
              if (var2 >= ((ql) this).field_t.length) {
                break L2;
              } else {
                var3 = ((ql) this).field_b.field_m + (((ql) this).field_t[var2][0] * (((ql) this).field_h - 20) / 20 + 35);
                var4 = -10 + ((ql) this).field_b.field_v + (-20 + ((ql) this).field_h) * ((ql) this).field_t[var2][1] / 20;
                hs.field_F[ns.a(false, hs.field_F.length, li.field_n)].d(-((-20 + ((ql) this).field_h) / 4) + var3, -((-40 + ((ql) this).field_h) / 4) + (((ql) this).field_h - 20) * (((ql) this).field_h - 20) / 10 + var4, (-20 + ((ql) this).field_h) / 2 + 10, (-20 + ((ql) this).field_h) / 2 + 10, (-((ql) this).field_h + 60) * 255 / 40);
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
            var6 = null;
            boolean discarded$1 = ((ql) this).a((oj) null, (byte) -72);
            break L4;
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
          if (((ql) this).field_h < 40) {
            if (((ql) this).field_h < 20) {
              hh.field_d.d(((ql) this).field_b.field_m - 10, ((ql) this).field_b.field_v + -30, 100, 50, ((ql) this).field_h * 255 / 20);
              hh.field_d.d(-10 + ((ql) this).field_b.field_m, ((ql) this).field_b.field_v + -30, 100, 50, 255 * ((ql) this).field_h / 20);
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (((ql) this).field_t == null) {
            break L1;
          } else {
            var2 = 0;
            L2: while (true) {
              if (((ql) this).field_t.length <= var2) {
                break L1;
              } else {
                var3 = ((ql) this).field_b.field_m + (-20 + ((ql) this).field_h) * ((ql) this).field_t[var2][0] / 20 + 30;
                var4 = -20 + (((ql) this).field_b.field_v + (((ql) this).field_h + -20) * ((ql) this).field_t[var2][1] / 20);
                hh.field_d.d(var3, (((ql) this).field_h - 20) * (((ql) this).field_h + -20) / 10 + var4, 20, 20, (15300 - ((ql) this).field_h * 255) / 40);
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
            ((ql) this).field_a = false;
            break L3;
          }
        }
    }

    public final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -119) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$1 = ((ql) this).a(116, -87, 41, (oj) null);
            break L0;
          }
        }
        L1: {
          var2 = ((ql) this).field_n;
          if (var2 == -2) {
            this.a(0, (byte) 117);
            break L1;
          } else {
            if (var2 != -6) {
              if (-10 != var2) {
                if (2 != var2) {
                  if (-7 != var2) {
                    if ((var2 ^ -1) == -8) {
                      this.d(20);
                      break L1;
                    } else {
                      if ((var2 ^ -1) == -15) {
                        this.a(false);
                        break L1;
                      } else {
                        if (var2 == -14) {
                          this.g(10);
                          break L1;
                        } else {
                          if (-13 == var2) {
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
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if ((((ql) this).field_m ^ -1) <= -1) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = 4;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L2;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = 5;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 20) {
          L0: {
            if (40 > ((ql) this).field_h) {
              if (20 <= ((ql) this).field_h) {
                break L0;
              } else {
                hh.field_d.d(((ql) this).field_b.field_m, -70 + ((ql) this).field_b.field_v, 80, 100, ((ql) this).field_h * 255 / 20);
                hh.field_d.d(((ql) this).field_b.field_m, -70 + ((ql) this).field_b.field_v, 80, 100, 255 * ((ql) this).field_h / 20);
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (null == ((ql) this).field_t) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (((ql) this).field_t.length <= var2) {
                  break L1;
                } else {
                  var3 = 30 + (((ql) this).field_h - 20) * ((ql) this).field_t[var2][0] / 20 - -((ql) this).field_b.field_m;
                  var4 = ((ql) this).field_b.field_v + (-20 + ((ql) this).field_h) * ((ql) this).field_t[var2][1] / 20;
                  hh.field_d.d(var3, (-20 + ((ql) this).field_h) * (-20 + ((ql) this).field_h) / 10 + var4, 20, 20, (15300 + -(((ql) this).field_h * 255)) / 40);
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
        if (null != ((ql) this).field_t) {
            return 60 <= ((ql) this).field_h ? true : false;
        }
        return (((ql) this).field_h ^ -1) <= -41 ? true : false;
    }

    public final boolean b(byte param0) {
        if (param0 >= -25) {
            return true;
        }
        return false;
    }

    private final void a(boolean param0) {
        if (param0) {
            ((ql) this).field_b = null;
        }
        if (40 > ((ql) this).field_h) {
            if (((ql) this).field_h >= 20) {
                hh.field_d.d(-((ql) this).field_h + ((ql) this).field_b.field_m + 20, -((ql) this).field_h + -70 + ((ql) this).field_b.field_v, (-20 + ((ql) this).field_h) * 2 + 80, 100, (10200 - 255 * ((ql) this).field_h) / 20);
            } else {
                hh.field_d.d(((ql) this).field_b.field_m, -((ql) this).field_h + (((ql) this).field_b.field_v - 70), 80, 100, 255 * ((ql) this).field_h / 20);
            }
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 < 83) {
            return;
        }
        int var3 = ((ql) this).field_m < -1 ? ((ql) this).field_m : -((ql) this).field_m;
        if (-2 != var3) {
            od.field_d[param0].c(((ql) this).field_f + (40 + (((ql) this).field_b.field_m - var3 * 5)), ((ql) this).field_r + (((ql) this).field_b.field_v + (-20 - var3 * 5) - ((ql) this).field_h), ((ql) this).field_m * 10, var3 * 10, 40 + -((ql) this).field_h << -349099614);
        } else {
            od.field_d[param0].e(((ql) this).field_f + 35 + ((ql) this).field_b.field_m, -((ql) this).field_h + (((ql) this).field_b.field_v + -25) + ((ql) this).field_r, -((ql) this).field_h + 40 << -1530970910);
        }
    }

    private final void c(int param0) {
        qn.a(((ql) this).field_b.field_m + 40, -20 + ((ql) this).field_b.field_v, 10, ((ql) this).field_i);
        mv.field_a[((ql) this).field_a ? 1 : 0].g(20 + ((ql) this).field_b.field_m, ((ql) this).field_b.field_v - 35);
        if (param0 != 3) {
            ((ql) this).c((byte) -24);
        }
        en.field_E.c(Integer.toString(((ql) this).field_m), ((ql) this).field_b.field_m - -40, ((ql) this).field_b.field_v - 15, 16777215, 0);
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
            if ((((ql) this).field_h ^ -1) <= -41) {
              break L0;
            } else {
              if ((((ql) this).field_h ^ -1) <= -21) {
                if (-31 >= (((ql) this).field_h ^ -1)) {
                  hh.field_d.d(((ql) this).field_b.field_m + -10, -30 + ((ql) this).field_b.field_v, 100, 50, (-(255 * ((ql) this).field_h) + 10200) / 10);
                  hh.field_d.d(-10 + ((ql) this).field_b.field_m, -30 + ((ql) this).field_b.field_v, 100, 50, (-((ql) this).field_h + 40) * 255 / 10);
                  break L0;
                } else {
                  hh.field_d.d(15 + (((ql) this).field_b.field_m + -((5 * ((ql) this).field_h + -100) / 2)), ((ql) this).field_b.field_v - 120 + 3 * ((ql) this).field_h, -50 + ((ql) this).field_h * 5, 50, 255);
                  hh.field_d.d(((ql) this).field_b.field_m + 15 + -((((ql) this).field_h + -20) * 5 / 2), ((ql) this).field_b.field_v - (120 + -(((ql) this).field_h * 3)), ((ql) this).field_h * 5 + -100 + 50, 50, 255);
                  break L0;
                }
              } else {
                L1: {
                  stackOut_4_0 = hh.field_d;
                  stackOut_4_1 = 15 + ((ql) this).field_b.field_m;
                  stackOut_4_2 = -120 + ((ql) this).field_b.field_v + ((ql) this).field_h * 3;
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
                  if ((((ql) this).field_h ^ -1) < -11) {
                    stackOut_6_0 = (wk) (Object) stackIn_6_0;
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
                    break L1;
                  } else {
                    stackOut_5_0 = (wk) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = stackIn_5_2;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = stackIn_5_4;
                    stackOut_5_5 = 255 * ((ql) this).field_h / 10;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_7_5 = stackOut_5_5;
                    break L1;
                  }
                }
                L2: {
                  ((wk) (Object) stackIn_7_0).d(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
                  stackOut_7_0 = hh.field_d;
                  stackOut_7_1 = ((ql) this).field_b.field_m + 15;
                  stackOut_7_2 = ((ql) this).field_b.field_v - 120 - -(((ql) this).field_h * 3);
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
                  if (((ql) this).field_h > 10) {
                    stackOut_9_0 = (wk) (Object) stackIn_9_0;
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
                    break L2;
                  } else {
                    stackOut_8_0 = (wk) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = stackIn_8_4;
                    stackOut_8_5 = 255 * ((ql) this).field_h / 10;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    stackIn_10_4 = stackOut_8_4;
                    stackIn_10_5 = stackOut_8_5;
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
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 31337) {
            break L0;
          } else {
            boolean discarded$2 = ql.h(-19);
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
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        ec var7 = null;
        pj var8 = null;
        as var9 = null;
        qj var10 = null;
        st var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ql) this).field_h = 0;
          if ((param0.field_m ^ -1) != -16) {
            if (19 == param0.field_m) {
              L1: {
                ((ql) this).field_m = 1;
                var11 = (st) (Object) param0;
                var4 = var11.field_D;
                if (var4 != 5) {
                  if (var4 == -2) {
                    ((ql) this).field_n = 1;
                    break L1;
                  } else {
                    if (var4 == 3) {
                      ((ql) this).field_n = 3;
                      break L1;
                    } else {
                      if (-5 == var4) {
                        ((ql) this).field_n = 5;
                        break L1;
                      } else {
                        if (6 == var4) {
                          ((ql) this).field_n = 9;
                          break L1;
                        } else {
                          if (2 == var4) {
                            ((ql) this).field_a = true;
                            ((ql) this).field_n = 4;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((ql) this).field_n = 2;
                  ((ql) this).field_m = -1;
                  break L1;
                }
              }
              ((ql) this).field_f = ns.a(false, 21, li.field_n) - 10;
              ((ql) this).field_r = ns.a(false, 21, li.field_n) - 10;
              if (param0.field_w == null) {
                return false;
              } else {
                if (!param0.field_w.field_S) {
                  ((ql) this).field_b.field_x = ((ql) this).field_s * param0.field_w.field_w + param0.field_w.field_J;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              if (20 == param0.field_m) {
                ((ql) this).field_m = 3;
                ((ql) this).field_n = 6;
                var10 = (qj) (Object) param0;
                ((ql) this).field_f = ns.a(false, 21, li.field_n) + -10;
                ((ql) this).field_r = ns.a(false, 21, li.field_n) + -10;
                ((ql) this).field_b.field_x = var10.field_y * ((ql) this).field_s + var10.field_D;
                break L0;
              } else {
                if (-3 != (param0.field_m ^ -1)) {
                  if (param0.field_m == 23) {
                    ((ql) this).field_n = 7;
                    var9 = (as) (Object) param0;
                    ((ql) this).field_b.field_x = var9.field_w.field_J + var9.field_w.field_w * ((ql) this).field_s;
                    break L0;
                  } else {
                    if ((param0.field_m ^ -1) == -25) {
                      var8 = (pj) (Object) param0;
                      ((ql) this).field_n = 8;
                      if (-1 >= (var8.field_y ^ -1)) {
                        ((ql) this).field_f = (int)(64.0 * Math.sin((double)var8.field_y * 3.141592653589793 / 4.0)) - -130;
                        ((ql) this).field_r = -95 + (int)(Math.cos(3.141592653589793 * (double)var8.field_y / 4.0) * -64.0) + ag.field_I.field_D;
                        break L0;
                      } else {
                        ((ql) this).field_f = 130;
                        ((ql) this).field_r = -95 + ag.field_I.field_D;
                        break L0;
                      }
                    } else {
                      if ((param0.field_m ^ -1) != -27) {
                        break L0;
                      } else {
                        L2: {
                          var7 = (ec) (Object) param0;
                          var7.field_w = ((ql) this).field_o.c(var7.field_B, true, var7.field_A);
                          if (!var7.field_w.field_bb) {
                            break L2;
                          } else {
                            var7.field_w = var7.field_w.b(false);
                            break L2;
                          }
                        }
                        ((ql) this).field_n = 7;
                        ((ql) this).field_b.field_x = ((ql) this).field_s * var7.field_w.field_w + var7.field_w.field_J;
                        break L0;
                      }
                    }
                  }
                } else {
                  var6 = (mb) (Object) param0;
                  ((ql) this).field_n = 7;
                  ((ql) this).field_b.field_x = var6.field_z - -(((ql) this).field_s * var6.field_H);
                  break L0;
                }
              }
            }
          } else {
            ((ql) this).field_a = ((nw) (Object) param0).field_A;
            ((ql) this).field_n = 0;
            if (null != param0.field_w) {
              L3: {
                ((ql) this).field_b.field_x = ((ql) this).field_s * param0.field_w.field_w + param0.field_w.field_J;
                ((ql) this).field_m = ((nw) (Object) param0).field_D;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!((nw) (Object) param0).field_A) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 16711680;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 65280;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((ql) this).field_i = stackIn_6_1;
              if (1 <= ((ql) this).field_m) {
                break L0;
              } else {
                ((ql) this).field_h = 40;
                ((ql) this).field_n = -1;
                return false;
              }
            } else {
              return false;
            }
          }
        }
        L4: {
          ((ql) this).b(param0, (byte) -106);
          if (param1 == 57) {
            break L4;
          } else {
            ((ql) this).field_t = null;
            break L4;
          }
        }
        return true;
    }

    ql(ha param0, v param1, vb param2) {
        ((ql) this).field_o = param0;
        ((ql) this).field_s = param0.field_v;
        ((ql) this).field_k = param1;
        ((ql) this).field_b = param2;
        ((ql) this).field_q = new int[2];
        ((ql) this).field_g = param0.field_Eb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_p = "Please remove <%0> from your friend list first.";
        field_l = "Unable to delete friend - system busy";
    }
}
