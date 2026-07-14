/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    wo[] field_l;
    int field_c;
    private boolean field_B;
    static String field_o;
    private boolean field_b;
    int field_t;
    static int field_p;
    int field_h;
    int field_f;
    int field_e;
    bh field_r;
    int field_j;
    int field_d;
    static String field_A;
    private int field_y;
    int field_u;
    static int field_k;
    private bh field_n;
    static ne field_m;
    String[] field_w;
    int field_i;
    boolean field_a;
    private int field_s;
    int field_z;
    private int field_v;
    private int field_x;
    int field_g;
    int field_q;

    final int b(int param0) {
        if (param0 != -6133) {
            this.a(9, 18);
        }
        return 53188834 ^ ((lj) this).field_s;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        wo var5_ref_wo = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        bh stackIn_26_0 = null;
        bh stackIn_27_0 = null;
        bh stackIn_28_0 = null;
        bh stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        bh stackOut_25_0 = null;
        bh stackOut_26_0 = null;
        bh stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        bh stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          var3 = ((lj) this).b(-6133);
          if (param0 == 30113) {
            break L0;
          } else {
            int discarded$1 = ((lj) this).b((byte) 31);
            break L0;
          }
        }
        L1: {
          if (param1) {
            break L1;
          } else {
            var3++;
            this.a(var3, 53188834);
            break L1;
          }
        }
        if (((lj) this).c(param0 + -33430)) {
          return;
        } else {
          var4 = ((lj) this).field_l.length - 1;
          L2: while (true) {
            if (-1 < var4) {
              L3: {
                if (((lj) this).field_B) {
                  break L3;
                } else {
                  if (-3 == ((lj) this).field_j) {
                    break L3;
                  } else {
                    if (0 != ((lj) this).field_j) {
                      break L3;
                    } else {
                      if (var3 >= t.field_l) {
                        L4: {
                          var4 = df.field_k;
                          var8 = var3;
                          var9 = rg.field_f % 4;
                          var10 = 4 * (var8 + -t.field_l);
                          if (-1 == var9) {
                            var11 = var10 / 2;
                            f.field_B = f.field_B + var11;
                            hj.field_c = hj.field_c + (var10 - var11);
                            break L4;
                          } else {
                            if (-2 == var9) {
                              var11 = var10 / 3;
                              f.field_B = f.field_B + (var10 + -var11);
                              hj.field_c = hj.field_c + var11;
                              break L4;
                            } else {
                              if (2 == var9) {
                                f.field_B = f.field_B + var10;
                                break L4;
                              } else {
                                if (var9 == 3) {
                                  hj.field_c = hj.field_c + var10;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        t.field_l = var8;
                        var5 = f.field_B;
                        var6 = hj.field_c;
                        var7 = ca.field_g;
                        oh.field_D.a((li) (Object) new ub(((lj) this).field_j, var3, var4, var5, var6, var7), false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                L6: {
                  ((lj) this).field_r.a((byte) -31, var3, kn.field_h[((lj) this).field_j][var3]);
                  stackOut_25_0 = ((lj) this).field_r;
                  stackIn_28_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (-1 != ((lj) this).field_j) {
                    break L6;
                  } else {
                    stackOut_26_0 = (bh) (Object) stackIn_26_0;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (-50 != var3) {
                      break L6;
                    } else {
                      stackOut_27_0 = (bh) (Object) stackIn_27_0;
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L5;
                    }
                  }
                }
                stackOut_28_0 = (bh) (Object) stackIn_28_0;
                stackOut_28_1 = 0;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L5;
              }
              L7: {
                stackIn_29_0.field_m = stackIn_29_1 != 0;
                if (null == ((lj) this).field_n) {
                  ((lj) this).field_n = ((lj) this).c((byte) -116);
                  break L7;
                } else {
                  break L7;
                }
              }
              ((lj) this).field_n.a(false, ((lj) this).field_r);
              return;
            } else {
              var5_ref_wo = ((lj) this).field_l[var4];
              var5_ref_wo.d(false);
              var4--;
              continue L2;
            }
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -3317) {
          L0: {
            L1: {
              if (((lj) this).b(param0 ^ 6912) >= kn.field_h[((lj) this).field_j].length) {
                break L1;
              } else {
                L2: {
                  if (((lj) this).field_j == 0) {
                    break L2;
                  } else {
                    if (((lj) this).field_c > ((lj) this).field_v) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void a(mi param0, byte param1) {
        ((lj) this).field_r.a(param0, 0);
        if (param1 <= 66) {
            ((lj) this).field_r = null;
        }
        ((lj) this).field_r.i(-10);
    }

    final int a(int param0) {
        if (param0 > -9) {
            return -5;
        }
        if (-1 == (((lj) this).field_y ^ -1)) {
            return ((lj) this).field_l[0].g((byte) 121);
        }
        if (((lj) this).field_y == 1) {
            return ((lj) this).field_l[1].g((byte) 121);
        }
        return 0;
    }

    final static void a(byte param0) {
        e.a(12899, hb.field_D, ji.field_s, ee.field_b, ua.field_c);
        if (param0 >= -114) {
            lj.d(80);
        }
    }

    final int b(byte param0) {
        if (param0 <= 105) {
            ((lj) this).field_i = -107;
        }
        return ((lj) this).field_x;
    }

    final void a(byte param0, int param1) {
        ((lj) this).field_x = param1;
        int var3 = 15 % ((78 - param0) / 35);
        ((lj) this).field_a = true;
    }

    final void e(int param0) {
        if (!((((lj) this).field_j ^ -1) == param0)) {
            return;
        }
        ((lj) this).field_b = true;
    }

    public static void d(int param0) {
        field_o = null;
        if (param0 != 1) {
            return;
        }
        field_m = null;
        field_A = null;
    }

    private final void a(int param0, int param1) {
        ((lj) this).field_s = param0 ^ param1;
    }

    final void a(int[] param0, int param1, boolean[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_74_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        L0: {
          L1: {
            var7 = Vertigo2.field_L ? 1 : 0;
            if (((lj) this).field_r == null) {
              break L1;
            } else {
              if (((lj) this).field_r.field_w != 1) {
                break L1;
              } else {
                if (!((lj) this).field_r.field_f[0].f((byte) 39)) {
                  break L1;
                } else {
                  if (!((lj) this).field_r.field_f[1].f((byte) 97)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          ((lj) this).field_q = ((lj) this).field_q + 1;
          break L0;
        }
        if (!((lj) this).field_a) {
          L2: {
            if (0 >= ((lj) this).field_r.field_p) {
              break L2;
            } else {
              if (-1 != (((lj) this).field_y ^ -1)) {
                break L2;
              } else {
                ((lj) this).field_h = ((lj) this).field_h + ((lj) this).field_r.field_p;
                ((lj) this).field_r.field_p = 0;
                break L2;
              }
            }
          }
          L3: {
            if (-1 <= ((lj) this).field_r.field_d) {
              break L3;
            } else {
              if (-2 == ((lj) this).field_y) {
                ((lj) this).field_h = ((lj) this).field_h + ((lj) this).field_r.field_d;
                ((lj) this).field_r.field_d = 0;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (0 != ((lj) this).field_j) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L4;
            } else {
              stackOut_16_0 = 1;
              stackIn_18_0 = stackOut_16_0;
              break L4;
            }
          }
          L5: {
            L6: {
              var4 = stackIn_18_0;
              stackOut_18_0 = this;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (((lj) this).field_b) {
                break L6;
              } else {
                stackOut_19_0 = this;
                stackIn_22_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (((lj) this).field_r.a(true, param2, 128, param0, var4 == 0)) {
                  stackOut_22_0 = this;
                  stackOut_22_1 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L5;
                } else {
                  stackOut_20_0 = this;
                  stackIn_21_0 = stackOut_20_0;
                  break L6;
                }
              }
            }
            stackOut_21_0 = this;
            stackOut_21_1 = 1;
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            break L5;
          }
          L7: {
            ((lj) this).field_b = stackIn_23_1 != 0;
            if (((lj) this).field_b) {
              var5 = 0;
              L8: while (true) {
                if (((lj) this).field_l.length <= var5) {
                  L9: {
                    ((lj) this).field_r.a(false, ((lj) this).field_n);
                    if (-3 == (((lj) this).field_j ^ -1)) {
                      break L9;
                    } else {
                      if ((((lj) this).field_j ^ -1) != -4) {
                        var5 = 0;
                        L10: while (true) {
                          if (((lj) this).field_l.length <= var5) {
                            break L9;
                          } else {
                            int discarded$1 = ((lj) this).b(-6133);
                            var5++;
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((lj) this).field_b = false;
                  break L7;
                } else {
                  if ((((lj) this).field_j ^ -1) != -3) {
                    if (((lj) this).field_j != 3) {
                      ((lj) this).field_n.field_f[var5].a(true, -1 + ((lj) this).field_l[var5].l(param1 ^ -32748));
                      var5++;
                      continue L8;
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
              break L7;
            }
          }
          L11: {
            if (((lj) this).field_j != 3) {
              break L11;
            } else {
              if (!((lj) this).field_r.f(17940)) {
                break L11;
              } else {
                L12: {
                  var5 = ln.field_d.field_s % 3;
                  if (var5 == 0) {
                    field_k = field_k + 1;
                    break L12;
                  } else {
                    mc.field_e = mc.field_e + 1;
                    break L12;
                  }
                }
                ((lj) this).field_l[0].field_H = ((lj) this).field_l[0].field_H + 1;
                break L11;
              }
            }
          }
          var5 = 0;
          L13: while (true) {
            L14: {
              if (((lj) this).field_l.length <= var5) {
                break L14;
              } else {
                if (!((lj) this).field_l[var5].a(false)) {
                  var5++;
                  continue L13;
                } else {
                  ((lj) this).field_n.a(false, ((lj) this).field_r);
                  var6 = 0;
                  L15: while (true) {
                    if (var6 >= ((lj) this).field_n.field_f.length) {
                      break L14;
                    } else {
                      ((lj) this).field_n.field_f[var6].field_c = 0;
                      ((lj) this).field_n.field_f[var6].field_O = 0;
                      var6++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L16: {
              var5 = ((lj) this).field_r.d((byte) -114);
              if (-2 != var5) {
                L17: {
                  if (var5 == 0) {
                    ((lj) this).field_f = ((lj) this).field_f + 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (1 != var5) {
                    break L18;
                  } else {
                    ((lj) this).field_g = ((lj) this).field_g + 1;
                    break L18;
                  }
                }
                L19: {
                  ((lj) this).field_v = ((lj) this).field_v + 1;
                  if (-1 == var5) {
                    break L19;
                  } else {
                    if (-3 != (((lj) this).field_j ^ -1)) {
                      break L19;
                    } else {
                      if (!((lj) this).field_B) {
                        break L19;
                      } else {
                        if (!on.a((byte) -121, 0)) {
                          break L19;
                        } else {
                          if (((lj) this).field_l[var5].k((byte) 72)) {
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                }
                L20: {
                  if (((lj) this).c(-3317)) {
                    L21: {
                      var6 = -1;
                      if (((lj) this).field_j == 2) {
                        L22: {
                          if (((lj) this).field_g < ((lj) this).field_f) {
                            stackOut_73_0 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            break L22;
                          } else {
                            if (((lj) this).field_f >= ((lj) this).field_g) {
                              stackOut_72_0 = -1;
                              stackIn_74_0 = stackOut_72_0;
                              break L22;
                            } else {
                              stackOut_71_0 = 1;
                              stackIn_74_0 = stackOut_71_0;
                              break L22;
                            }
                          }
                        }
                        var6 = stackIn_74_0;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L23: {
                      if (((lj) this).field_u == 3) {
                        break L23;
                      } else {
                        if (0 != ((lj) this).field_u) {
                          var6 = -((lj) this).field_u + 2;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (((lj) this).field_j == 1) {
                        var6 = 0;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    ((lj) this).a((byte) 114, var6);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if ((((lj) this).field_j ^ -1) == -4) {
                  dh.a(((lj) this).field_e, ((lj) this).field_l[0].field_H, true);
                  gj.a((byte) 91, false, am.field_n, 20);
                  break L16;
                } else {
                  ((lj) this).a(param1 + 30093, false);
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L25: {
              if (param1 == 20) {
                break L25;
              } else {
                ((lj) this).field_f = -75;
                break L25;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
            return 127;
        }
        int var3 = param0 >>> -1798389089;
        return (var3 + param0) / param2 - var3;
    }

    final bh c(byte param0) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        wo[] var5 = new wo[((lj) this).field_l.length];
        wo[] var2 = var5;
        if (param0 != -116) {
            return null;
        }
        for (var3_int = 0; var3_int < ((lj) this).field_l.length; var3_int++) {
            var5[var3_int] = new wo(((lj) this).field_l[var3_int].field_l, ((lj) this).field_B, var3_int, 1 < ((lj) this).field_l.length ? true : false, -3 == (((lj) this).field_j ^ -1) ? true : false, true);
        }
        bh var3 = new bh(((lj) this).field_j, var2, ((lj) this).field_B, false);
        var3.a(false, ((lj) this).field_r);
        return var3;
    }

    lj(String[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7) {
        int var9 = 0;
        ((lj) this).field_x = -2;
        ((lj) this).field_y = param1;
        ((lj) this).field_z = param0.length;
        ((lj) this).field_w = param0;
        this.a(param4, 53188834);
        ((lj) this).field_B = param6 ? true : false;
        ((lj) this).field_c = param5;
        ((lj) this).field_j = param2;
        ((lj) this).field_i = 4012 ^ param3;
        ((lj) this).field_l = new wo[((lj) this).field_z];
        ((lj) this).field_e = param3;
        for (var9 = 0; var9 < ((lj) this).field_z; var9++) {
            ((lj) this).field_l[var9] = new wo(-1 == (b.a(1, var9) ^ -1) ? 0 : 1, ((lj) this).field_B, var9, ((lj) this).field_l.length > 1 ? true : false, 2 == ((lj) this).field_j ? true : false, false);
        }
        oo.field_i = false;
        ((lj) this).field_r = new bh(((lj) this).field_j, ((lj) this).field_l, ((lj) this).field_B, param7);
        ((lj) this).a(30113, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Find opponent";
        field_A = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
