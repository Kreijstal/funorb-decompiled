/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static int field_b;
    static ed field_w;
    private int[] field_c;
    private int[] field_x;
    private int[][] field_l;
    private wi[][] field_a;
    private int field_d;
    private boolean[] field_e;
    private int field_g;
    private wi[][] field_p;
    private boolean[][] field_A;
    int field_z;
    private int[][] field_v;
    int field_B;
    private boolean[] field_r;
    static String field_t;
    private int field_q;
    private int field_o;
    private int[] field_n;
    private int[][] field_s;
    private boolean[] field_k;
    static int[] field_i;
    private int field_f;
    private int[] field_u;
    private int field_h;
    private ed[] field_y;
    private int[] field_j;
    static String field_m;

    private final void a(int[][] param0, boolean[][] param1, byte param2) {
        param1[0][0] = this.a(((na) this).field_h + -1, -1 + ((na) this).field_f, (byte) -23, param0[0]);
        param1[0][1 + ((na) this).field_h] = this.a(0, -1 + ((na) this).field_f, (byte) -66, param0[2]);
        param1[1 + ((na) this).field_f][0] = this.a(((na) this).field_h + -1, 0, (byte) -78, param0[6]);
        param1[((na) this).field_f + 1][1 + ((na) this).field_h] = this.a(0, 0, (byte) -44, param0[8]);
        if (param2 < 63) {
            this.b(16);
        }
    }

    private final void a(int param0, int[] param1, int param2) {
        int var4 = 0;
        param2 = param2 - 1;
        for (var4 = 0; var4 < ((na) this).field_h; var4++) {
            param2++;
            param1[param2] = param0;
        }
    }

    private final int[][] e(int param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int[][] var5 = new int[((na) this).field_d * ((na) this).field_g][];
        int[][] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            var5[var3] = ((na) this).field_n;
        }
        if (param0 != 1) {
            ((na) this).field_k = null;
        }
        return var2;
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var9 = EscapeVector.field_A;
        if (param0 >= -96) {
            this.a((wi[][]) null, 102);
        }
        int var4 = -param2;
        for (var5 = param1; var5 < ((na) this).field_d; var5++) {
            var4 = var4 + ((na) this).field_f;
        }
        int var6 = ((na) this).field_j[0];
        int var7 = ((na) this).field_j[1];
        int var8 = 1 + (-var4 + 479);
        if (!(0 < var8)) {
            return;
        }
        em.c(0, var4, 640, var8, var6, var7);
        this.a(var4, (byte) 104);
    }

    private final int a(int[] param0, byte param1, int param2) {
        int var4 = 0;
        var4 = -12 / ((43 - param1) / 44);
        if (((na) this).field_x != param0) {
          if (((na) this).field_n != param0) {
            if (-1 < (param2 ^ -1)) {
              return 0;
            } else {
              if (param2 < ((na) this).field_f) {
                return param0[param2];
              } else {
                return 0;
              }
            }
          } else {
            return 0;
          }
        } else {
          return -1;
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_i = null;
        field_m = null;
        field_w = null;
        if (param0 != 3) {
            Object var2 = null;
            dk[] discarded$0 = na.a(-86, (int[]) null, 29, -25, (ih) null, (String[]) null, (int[]) null, false, (int[]) null);
        }
    }

    private final boolean c(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 == 0 ? true : false;
    }

    private final boolean[][] a(int param0, int[][] param1) {
        this.a((byte) 121, param1, ((na) this).field_A);
        this.a(param1, (byte) 62, ((na) this).field_A);
        int var3 = -64 / ((param0 - -50) / 40);
        this.a(param1, ((na) this).field_A, (byte) 107);
        return ((na) this).field_A;
    }

    private final boolean a(int param0, int param1, byte param2, int[] param3) {
        int var5 = this.a(param3, (byte) 125, param1);
        if (param2 >= -18) {
            return true;
        }
        int var6 = this.a(var5, param0) ? 1 : 0;
        return var6 != 0;
    }

    private final wi[][] a(int param0, wi[][] param1, int param2, boolean param3, int param4) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = EscapeVector.field_A;
        if (!(param1 == null)) {
            return param1;
        }
        int var6 = 640;
        int var7 = 480;
        int var8 = 1 + var6 / ((na) this).field_h;
        int var9 = var7 / ((na) this).field_f - -1;
        param1 = new wi[var9][var8];
        for (var10 = param0; var10 < var9; var10++) {
            var11 = var10 + param4;
            for (var12 = 0; var8 > var12; var12++) {
                var13 = var12 + param2;
                while (var13 < 0) {
                    var13 = var13 + ((na) this).field_g;
                }
                while (var13 >= ((na) this).field_g) {
                    var13 = var13 - ((na) this).field_g;
                }
                param1[var10][var12] = new wi(((na) this).field_h, ((na) this).field_f, var11, var13);
            }
        }
        return param1;
    }

    private final boolean a(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 != 0 ? true : false;
    }

    private final int[] a(int param0, int[] param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          if ((param0 ^ -1) > -1) {
            break L0;
          } else {
            if (param0 >= ((na) this).field_f) {
              break L0;
            } else {
              L1: {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (param4 < ((na) this).field_h) {
                    param1 = this.a(param0, param1, param4, 72);
                    var6 = this.a(param1, (byte) -47, param0);
                    var6 = this.a(param2, var6, param4, param3 + param3);
                    param1[param0] = var6;
                    return param1;
                  } else {
                    break L1;
                  }
                }
              }
              return param1;
            }
          }
        }
        return param1;
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (-1 < (param1 ^ -1)) {
            break L0;
          } else {
            if (((na) this).field_d <= param1) {
              return;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param0 < ((na) this).field_g) {
                  L1: {
                    if (param2) {
                      break L1;
                    } else {
                      ((na) this).field_d = 38;
                      break L1;
                    }
                  }
                  var4 = -1;
                  L2: while (true) {
                    if (-2 > (var4 ^ -1)) {
                      return;
                    } else {
                      if ((var4 + param1 ^ -1) <= -1) {
                        if (((na) this).field_d > param1 + var4) {
                          var5 = ((na) this).field_g * (var4 + param1);
                          var6 = -1;
                          L3: while (true) {
                            if (1 >= var6) {
                              if (var6 + param0 >= 0) {
                                if (var6 + param0 < ((na) this).field_g) {
                                  ((na) this).field_r[var6 + param0 + var5] = true;
                                  var6++;
                                  continue L3;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            } else {
                              var4++;
                              continue L2;
                            }
                          }
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wi var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        var13 = EscapeVector.field_A;
        var4 = ((na) this).field_a.length;
        var5 = ((na) this).field_a[0].length;
        var6 = -((na) this).field_f + -param2;
        if (param1 == 1) {
          var7 = 0;
          L0: while (true) {
            if (var4 <= var7) {
              return;
            } else {
              var6 = var6 + ((na) this).field_f;
              var8 = -((na) this).field_h + -param0;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var5) {
                  var7++;
                  continue L0;
                } else {
                  L2: {
                    var8 = var8 + ((na) this).field_h;
                    var10 = ((na) this).field_a[var7][var9];
                    if (var10.field_b >= 0) {
                      if (((na) this).field_d > var10.field_b) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L2;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = stackIn_12_0;
                    var12 = this.a(var10.field_b, -2981, var10.field_a, ((na) this).field_l);
                    stackOut_12_0 = var11;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((na) this).field_n == var12) {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L3;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L3;
                    }
                  }
                  var11 = stackIn_15_0 & stackIn_15_1;
                  if (var11 != 0) {
                    var10.field_e.e(var8, var6);
                    var9++;
                    continue L1;
                  } else {
                    var9++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, gi param1) {
        int var2 = 0;
        gi var3 = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (null == param1.field_n) {
          return;
        } else {
          L0: {
            L1: {
              if (param1.field_f != 0) {
                break L1;
              } else {
                if (param1.field_h != 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (hf.field_b <= var2) {
                break L0;
              } else {
                var3 = qm.field_d[var2];
                if (var3.field_a == 2) {
                  if (param1.field_f == var3.field_f) {
                    if (var3.field_h == param1.field_h) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param0 == 19956) {
              break L3;
            } else {
              field_b = -79;
              break L3;
            }
          }
          L4: {
            if (null == param1.field_k) {
              break L4;
            } else {
              break L4;
            }
          }
          vi.a(param1, 3);
          return;
        }
    }

    private final void a(int param0, boolean[] param1, int param2, boolean[][] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        for (var7 = 0; var7 < param2; var7++) {
            var8 = param1[var7 - -param0] ? 1 : 0;
            param3[param0 + var7][param5] = var8 != 0;
        }
        if (param4 != -23372) {
            Object var10 = null;
            int discarded$0 = this.a(48, -27, (int[]) null);
        }
    }

    final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = EscapeVector.field_A;
        var4 = 0;
        var5 = 0;
        var6 = ((na) this).field_h * ((na) this).field_g;
        var7 = param1;
        L0: while (true) {
          if (-1 >= (var7 ^ -1)) {
            L1: while (true) {
              if (var6 > var7) {
                var4 = var7 / ((na) this).field_h;
                var5 = var7 % ((na) this).field_h;
                var8 = 0;
                var9 = 0;
                var10 = ((na) this).field_d * ((na) this).field_f;
                var11 = param2;
                L2: while (true) {
                  if (0 <= var11) {
                    L3: {
                      if (param2 < 0) {
                        var8 = var8 + var11 / ((na) this).field_f;
                        break L3;
                      } else {
                        var8 = var11 / ((na) this).field_f;
                        break L3;
                      }
                    }
                    L4: {
                      var9 = var11 % ((na) this).field_f;
                      this.a(false, param2);
                      ((na) this).field_p = this.a(param0 + -640, ((na) this).field_p, var4, false, var8);
                      this.a((byte) -66, ((na) this).field_p, var4, var8);
                      this.a((byte) 122, var8, var4);
                      this.a(var9, var5, (byte) 110);
                      ((na) this).field_a = this.a(0, ((na) this).field_a, var4, true, var8);
                      this.a((byte) -66, ((na) this).field_a, var4, var8);
                      this.b((byte) 89, var8, var4);
                      this.a(var5, (byte) 1, var9);
                      this.a(param0 ^ -744, var8, var9);
                      if (param0 == 640) {
                        break L4;
                      } else {
                        int discarded$1 = na.a(93, -16, 127, -111);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    var8 = var8 - ((na) this).field_d;
                    var11 = var11 + var10;
                    continue L2;
                  }
                }
              } else {
                var7 = var7 - var6;
                continue L1;
              }
            }
          } else {
            var7 = var7 + var6;
            continue L0;
          }
        }
    }

    private final void a(int param0, byte param1) {
        em.a(((na) this).field_c);
        em.f(0, param0, 639, 479);
        ((na) this).field_y[0].e(0, 0);
        if (param1 != 104) {
            field_w = null;
        }
        em.b(((na) this).field_c);
    }

    private final boolean f(int param0) {
        return param0 == -1;
    }

    private final boolean d(int param0, int param1, int param2) {
        if (param0 < 0) {
          return false;
        } else {
          if (((na) this).field_d > param0) {
            L0: {
              if (param1 == 2) {
                break L0;
              } else {
                this.b(-80, 10, -58);
                break L0;
              }
            }
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (((na) this).field_g <= param2) {
                  break L1;
                } else {
                  return ((na) this).field_r[param2 + param0 * ((na) this).field_g];
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final static String a(String param0, boolean param1) {
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var2 = param0.length();
        if (param1) {
            return null;
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var2 > var4; var4++) {
            var3[-1 + (var2 + -var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var13 = EscapeVector.field_A;
        var4 = ((na) this).field_p.length;
        var5 = ((na) this).field_p[0].length;
        var6 = 47 % ((param0 - 75) / 36);
        var7 = 0;
        L0: while (true) {
          if (var7 >= var4) {
            return;
          } else {
            var8 = 0;
            L1: while (true) {
              if (var8 >= var5) {
                var7++;
                continue L0;
              } else {
                var9 = param1 + var7;
                var10 = var8 + param2;
                L2: while (true) {
                  if (var10 >= 0) {
                    L3: while (true) {
                      if (((na) this).field_g > var10) {
                        L4: {
                          var11 = ((na) this).field_p[var7][var8];
                          if (!this.d(var9, 2, var10)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L4;
                          } else {
                            stackOut_10_0 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                        var12 = stackIn_12_0;
                        var12 = var12 != 0 | var11.field_g ? 1 : 0;
                        if (var12 != 0) {
                          var11.field_a = var10;
                          var11.field_b = var9;
                          this.a(var9, ((na) this).field_v, 1, 0, var11.field_e.field_B, var10);
                          var11.field_g = false;
                          var8++;
                          continue L1;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var10 = var10 - ((na) this).field_g;
                        continue L3;
                      }
                    }
                  } else {
                    var10 = var10 + ((na) this).field_g;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    private final int[] a(boolean[][] param0, int param1, int[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        var4 = 14 % ((58 - param1) / 57);
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((na) this).field_f) {
            return param2;
          } else {
            var6 = this.a(param2, (byte) 108, var5);
            var7 = 0;
            L1: while (true) {
              if (((na) this).field_h <= var7) {
                var5++;
                continue L0;
              } else {
                var8 = this.a(var6, var7) ? 1 : 0;
                var9 = this.a(var7, param0, var5, (byte) 110);
                var10 = this.a(var9, false) ? 1 : 0;
                if (this.a(var10 != 0, var8 != 0, 0)) {
                  param2 = this.a(var5, param2, var10 != 0, 0, var7);
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        param3 = param3 - 1;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((na) this).field_h) {
            return;
          } else {
            param3++;
            if (!this.c(param1, var5)) {
              param2[param3] = param0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var12 = EscapeVector.field_A;
          if (param0 > 62) {
            break L0;
          } else {
            boolean discarded$2 = this.a(94, 29);
            break L0;
          }
        }
        var4 = ((na) this).field_a.length;
        var5 = ((na) this).field_a[0].length;
        var6 = 0;
        L1: while (true) {
          if (var6 >= var4) {
            return;
          } else {
            var7 = 0;
            L2: while (true) {
              if (var5 <= var7) {
                var6++;
                continue L1;
              } else {
                var8 = var6 - -param1;
                var9 = var7 - -param2;
                L3: while (true) {
                  if (0 <= var9) {
                    L4: while (true) {
                      if (var9 < ((na) this).field_g) {
                        L5: {
                          if (!this.d(var8, 2, var9)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L5;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L5;
                          }
                        }
                        L6: {
                          var10 = stackIn_14_0;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            this.c((byte) 105, var9, var8);
                            break L6;
                          }
                        }
                        var11 = ((na) this).field_a[var6][var7];
                        var10 = var10 != 0 | var11.field_g ? 1 : 0;
                        if (var10 != 0) {
                          var11.field_a = var9;
                          var11.field_b = var8;
                          this.a(var8, ((na) this).field_l, ((na) this).field_z, 0, var11.field_e.field_B, var9);
                          var11.field_g = false;
                          var7++;
                          continue L2;
                        } else {
                          var7++;
                          continue L2;
                        }
                      } else {
                        var9 = var9 - ((na) this).field_g;
                        continue L4;
                      }
                    }
                  } else {
                    var9 = var9 + ((na) this).field_g;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3) {
        if ((param2 ^ -1) <= -1) {
            // if_icmple L18
        } else {
            return param1;
        }
        int var5 = 1 << param2;
        int var6 = var5 ^ -1;
        if (param3 != 0) {
            ((na) this).field_n = null;
        }
        int var7 = param1 & var6;
        if (param0) {
            param1 = var7 | var5;
        } else {
            param1 = var7;
        }
        return param1;
    }

    private final boolean a(boolean[] param0, boolean param1) {
        if (param1) {
            this.a((wi[][]) null, (byte) 54);
        }
        if (!(param0[4])) {
            return false;
        }
        if (!param0[1]) {
            return true;
        }
        if (!param0[3]) {
            return true;
        }
        if (!(param0[5])) {
            return true;
        }
        if (!param0[7]) {
            return true;
        }
        return false;
    }

    private final void a(int[] param0, boolean param1, int[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = EscapeVector.field_A;
          if (param1) {
            break L0;
          } else {
            var8 = null;
            na.a(-40, (gi) null);
            break L0;
          }
        }
        var4 = param2.length / 8;
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= var4) {
            return;
          } else {
            L2: {
              var5++;
              if (0 == param0[var5]) {
                param2[var5 + -1] = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var5++;
              if (-1 == (param0[var5] ^ -1)) {
                param2[var5 + -1] = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var5++;
              if (param0[var5] == 0) {
                param2[-1 + var5] = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var5++;
              if (param0[var5] != 0) {
                break L5;
              } else {
                param2[var5 + -1] = 0;
                break L5;
              }
            }
            L6: {
              var5++;
              if (param0[var5] != 0) {
                break L6;
              } else {
                param2[var5 - 1] = 0;
                break L6;
              }
            }
            L7: {
              var5++;
              if (0 != param0[var5]) {
                break L7;
              } else {
                param2[var5 + -1] = 0;
                break L7;
              }
            }
            L8: {
              var5++;
              if (param0[var5] == 0) {
                param2[-1 + var5] = 0;
                break L8;
              } else {
                break L8;
              }
            }
            var5++;
            if (0 == param0[var5]) {
              param2[-1 + var5] = 0;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final boolean[] a(int param0, boolean[][] param1, int param2, byte param3) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        int var5 = 3;
        int var6 = 3;
        if (param3 <= 84) {
            this.c(65, -13, 112);
        }
        int var7 = param2 - -1 + -1;
        int var8 = 1 + (param0 + -1);
        for (var9 = 0; var6 > var9; var9++) {
            for (var10 = 0; var5 > var10; var10++) {
                var11 = param1[var7 + var9][var8 + var10] ? 1 : 0;
                var12 = var9 * var5 - -var10;
                ((na) this).field_k[var12] = var11 != 0;
            }
        }
        return ((na) this).field_k;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        vj.a((byte) -116, jf.field_J, param0, oa.field_t, true, vl.field_e, param1);
        for (var2 = 0; jf.field_J > var2; var2++) {
            cd.field_q[var2 + param0] = var2;
        }
        vj.a((byte) -128, jf.field_J + param0, param0 + param0, pl.field_r, false, pg.field_d, param0);
        if (jf.field_J > param0) {
            jf.field_J = param0;
        }
    }

    private final void a(int param0, int[][] param1, int param2, int param3, int[] param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        var13 = EscapeVector.field_A;
        var14 = this.a(param0, param3 + -2981, param5, param1);
        var16 = var14;
        this.a(param4, param3);
        if (((na) this).field_n != var14) {
          var8 = -((na) this).field_h;
          var9 = 0;
          L0: while (true) {
            if (var9 >= ((na) this).field_f) {
              return;
            } else {
              var8 = var8 + ((na) this).field_h;
              var10 = this.a(var16, (byte) 89, var9);
              if (!this.a(var10)) {
                if (this.f(var10)) {
                  this.a(param2, param4, var8);
                  var9++;
                  continue L0;
                } else {
                  this.a(param2, var10, param4, var8);
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(wi[][] param0, int param1, byte param2) {
        int var6 = EscapeVector.field_A;
        int var4 = 117 / ((30 - param2) / 52);
        int var5 = param0[0][0].field_b;
        while (var5 < param1) {
            var5++;
            this.a(param0, 0);
        }
        while (param1 < var5) {
            var5--;
            this.a(param0, (byte) 122);
        }
    }

    private final int[] a(int param0, int param1, int param2, int[][] param3) {
        int var6 = EscapeVector.field_A;
        if (!(-1 >= (param0 ^ -1))) {
            return ((na) this).field_n;
        }
        if (!(param0 < ((na) this).field_d)) {
            return ((na) this).field_x;
        }
        while (((na) this).field_g <= param2) {
            param2 = param2 - ((na) this).field_g;
        }
        while (param2 < 0) {
            param2 = param2 + ((na) this).field_g;
        }
        int var5 = param2 + ((na) this).field_g * param0;
        if (!(0 <= var5)) {
            return ((na) this).field_n;
        }
        if (!(var5 < param3.length)) {
            return ((na) this).field_n;
        }
        if (param1 != -2981) {
            return null;
        }
        return param3[var5];
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        if (param2 != 0) {
            return false;
        }
        return param1 ^ param0;
    }

    private final void a(boolean param0, int param1) {
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var3 = 640;
          var4 = 480;
          var5 = (ma.field_a.field_M >> 232318832) % var3;
          em.a(((na) this).field_c);
          var6 = param1 % var4;
          ((na) this).field_y[0].g();
          this.b(-126, var5, var6);
          if (!param0) {
            break L0;
          } else {
            ((na) this).a(98, 82, true);
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var3;
          var8 = -var6 + var4;
          var9 = 0;
          var10 = var7;
          var11 = 0;
          var12 = var8;
          var13 = -var5;
          var14 = -var6;
          if ((var5 ^ -1) > -1) {
            stackOut_4_0 = -1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var15 = stackIn_5_0;
        em.f(var9, var11, var10, var12);
        dj.a(var14, -24, var13);
        em.f(var7 * var15 + var9, var11, var10 - -(var5 * var15), var12);
        dj.a(var14, -123, var13 + var15 * var3);
        em.f(var9, var11 - -var8, var10, var6 + var12);
        dj.a(var14 + var4, -127, var13);
        em.f(var9 - -(var7 * var15), var11 - -var8, var10 - -(var5 * var15), var12 - -var6);
        dj.a(var14 + var4, -94, var3 * var15 + var13);
        md.field_D.a(107);
        em.b(((na) this).field_c);
    }

    private final void a(int[][] param0, byte param1, boolean[][] param2) {
        int[] var13 = param0[1];
        int var5 = this.a(var13, (byte) 121, -1 + ((na) this).field_f);
        this.a(1, -1, 0, ((na) this).field_h, var5, param2[0]);
        int var7 = 102 / ((param1 - -63) / 41);
        int[] var6 = param0[7];
        int var8 = this.a(var6, (byte) -81, 0);
        this.a(1, -1, 0, ((na) this).field_h, var8, param2[1 + ((na) this).field_f]);
        int[] var9 = param0[3];
        int var10 = this.a(-103, ((na) this).field_h - 1, var9);
        this.a(1, -1, 0, ((na) this).field_f, var10, ((na) this).field_e);
        this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 0);
        int[] var11 = param0[5];
        int var12 = this.a(-95, 0, var11);
        this.a(1, -1, 0, ((na) this).field_f, var12, ((na) this).field_e);
        this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 1 + ((na) this).field_h);
    }

    private final void a(boolean param0, wi[][] param1) {
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        int var3 = param1.length;
        if (param0) {
            return;
        }
        int var4 = param1[0].length;
        for (var5 = 0; var3 > var5; var5++) {
            var6 = param1[var5][var4 - 1];
            var6.field_g = true;
            for (var7_int = -1 + var4; var7_int > 0; var7_int--) {
                param1[var5][var7_int] = param1[var5][-1 + var7_int];
            }
            var7 = param1[var5][1];
            var6.field_b = var7.field_b;
            var8 = var7.field_a + -1;
            while ((var8 ^ -1) > -1) {
                var8 = var8 + ((na) this).field_g;
            }
            var6.field_a = var8;
            param1[var5][0] = var6;
        }
    }

    private final void a(byte param0, wi[][] param1, int param2, int param3) {
        this.a((byte) -3, param1, param2);
        if (param0 != -66) {
            ((na) this).field_o = 10;
        }
        this.a(param1, param3, (byte) -40);
    }

    private final void a(byte param0, int[][] param1, boolean[][] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        int[] var4 = param1[4];
        for (var5 = 0; var5 < ((na) this).field_f; var5++) {
            var6 = this.a(var4, (byte) 111, var5);
            for (var7 = 0; ((na) this).field_h > var7; var7++) {
                var8 = this.a(var6, var7) ? 1 : 0;
                param2[1 + var5][1 + var7] = var8 != 0;
            }
        }
        if (param0 != 121) {
            Object var10 = null;
            int[] discarded$0 = this.a(97, (int[]) null, -32, 39);
        }
    }

    private final void a(byte param0, wi[][] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          var4 = ((na) this).field_g / 2;
          var5 = param1[0][0].field_a;
          var6 = -var5 + param2;
          if (0 <= var6) {
            break L0;
          } else {
            var6 = var6 + ((na) this).field_g;
            break L0;
          }
        }
        L1: {
          if (var5 <= param2) {
            L2: while (true) {
              if (param2 <= var5) {
                break L1;
              } else {
                if (var4 < var6) {
                  break L1;
                } else {
                  this.b(param1, 7);
                  var5++;
                  L3: while (true) {
                    if (var5 < ((na) this).field_g) {
                      continue L2;
                    } else {
                      var5 = var5 - ((na) this).field_g;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            if (var4 >= var6) {
              var5 = var5 - ((na) this).field_g;
              L4: while (true) {
                if (param2 <= var5) {
                  break L1;
                } else {
                  if (var4 < var6) {
                    break L1;
                  } else {
                    this.b(param1, 7);
                    var5++;
                    L5: while (true) {
                      if (var5 < ((na) this).field_g) {
                        continue L4;
                      } else {
                        var5 = var5 - ((na) this).field_g;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              L6: while (true) {
                if (param2 <= var5) {
                  break L1;
                } else {
                  if (var4 < var6) {
                    break L1;
                  } else {
                    this.b(param1, 7);
                    var5++;
                    L7: while (true) {
                      if (var5 < ((na) this).field_g) {
                        continue L6;
                      } else {
                        var5 = var5 - ((na) this).field_g;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L8: {
          if (param0 == -3) {
            break L8;
          } else {
            ((na) this).field_q = -127;
            break L8;
          }
        }
        L9: {
          var6 = var5 + -param2;
          if (var6 >= 0) {
            break L9;
          } else {
            var6 = ((na) this).field_g - -var6;
            break L9;
          }
        }
        L10: {
          if (var5 >= param2) {
            break L10;
          } else {
            if (var4 < var6) {
              break L10;
            } else {
              var5 = var5 + ((na) this).field_g;
              break L10;
            }
          }
        }
        L11: while (true) {
          L12: {
            if (param2 >= var5) {
              break L12;
            } else {
              if (var4 < var6) {
                break L12;
              } else {
                this.a(false, param1);
                var5--;
                L13: while (true) {
                  if ((var5 ^ -1) <= -1) {
                    continue L11;
                  } else {
                    var5 = var5 + ((na) this).field_g;
                    continue L13;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var11 = 0;
        int var12 = EscapeVector.field_A;
        int[] var13 = ((na) this).field_u;
        int[] var4 = var13;
        int var5 = -2 == (param1 & 1 ^ 1 & param2 ^ -1) ? 1 : 0;
        int var7 = -39 % ((param0 - 74) / 47);
        if (var5 != 0) {
            var13[0] = ((na) this).field_q;
            var13[1] = ((na) this).field_o;
        } else {
            var4[1] = ((na) this).field_q;
            var4[0] = ((na) this).field_o;
        }
        int[] var6 = em.field_i;
        int var8 = 640;
        int var9 = 480;
        int var10 = var8 * var9;
        for (var11 = 0; var10 > var11; var11++) {
            var6[var11] = var4[ae.a(var11, 1)];
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        if (param1 != -1) {
            Object var10 = null;
            String discarded$0 = na.a((String) null, true);
        }
        for (var7 = 0; param3 > var7; var7++) {
            var8 = this.a(param4, param2 + var7) ? 1 : 0;
            param5[param0 + var7] = var8 != 0;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = param0 + param1;
        int var5 = -param3 + param2;
        int var6 = var5 / var4;
        return var6;
    }

    private final void a(wi[][] param0, byte param1) {
        int var6 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = EscapeVector.field_A;
        int var3 = param0.length;
        int var4 = param0[0].length;
        int var5 = -89 / ((param1 - 76) / 43);
        for (var6 = 0; var6 < var4; var6++) {
            var7 = param0[-1 + var3][var6];
            var7.field_g = true;
            for (var8_int = var3 - 1; -1 > (var8_int ^ -1); var8_int--) {
                param0[var8_int][var6] = param0[-1 + var8_int][var6];
            }
            var8 = param0[1][var6];
            var7.field_a = var8.field_a;
            var7.field_b = var8.field_b + -1;
            param0[0][var6] = var7;
        }
    }

    private final int a(int param0, int param1, int[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (param2 != ((na) this).field_x) {
          if (((na) this).field_n != param2) {
            L0: {
              if (param1 < 0) {
                break L0;
              } else {
                if (param1 >= ((na) this).field_f) {
                  break L0;
                } else {
                  L1: {
                    if (param0 <= -88) {
                      break L1;
                    } else {
                      ((na) this).field_d = 1;
                      break L1;
                    }
                  }
                  var4 = 0;
                  var5 = 0;
                  L2: while (true) {
                    if (((na) this).field_f <= var5) {
                      return var4;
                    } else {
                      var6 = this.a(param2, (byte) -83, var5);
                      if (this.a(var6, param1)) {
                        var8 = 1 << var5;
                        var4 = var8 | var4;
                        var5++;
                        continue L2;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            return 0;
          } else {
            return 0;
          }
        } else {
          return -1;
        }
    }

    private final void b(wi[][] param0, int param1) {
        int var5 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        int var3 = param0.length;
        int var4 = param0[0].length;
        int var6 = -81 / ((param1 - 56) / 48);
        for (var5 = 0; var3 > var5; var5++) {
            var7 = param0[var5][0];
            var7.field_g = true;
            for (var8_int = 0; var8_int < -1 + var4; var8_int++) {
                param0[var5][var8_int] = param0[var5][var8_int - -1];
            }
            var8 = param0[var5][-2 + var4];
            var7.field_b = var8.field_b;
            var9 = 1 + var8.field_a;
            while (var9 >= ((na) this).field_g) {
                var9 = var9 - ((na) this).field_g;
            }
            var7.field_a = var9;
            param0[var5][-1 + var4] = var7;
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        for (var3 = param1; param0.length > var3; var3++) {
            param0[var3] = 0;
        }
    }

    private final void c(byte param0, int param1, int param2) {
        int[][] var7 = this.a(param2, ((na) this).field_v, false, param1);
        int[][] var4 = var7;
        if (param0 < 103) {
            return;
        }
        int[] var8 = this.a(param2, -2981, param1, ((na) this).field_l);
        int[] var5 = var8;
        boolean[][] var6 = this.a(0, var7);
        var5 = this.a(var6, 115, var8);
        ((na) this).field_l[param1 + param2 * ((na) this).field_g] = var5;
        this.c(param1, -1, param2);
    }

    final static dk[] a(int param0, int[] param1, int param2, int param3, ih param4, String[] param5, int[] param6, boolean param7, int[] param8) {
        int var16 = 0;
        dk var17 = null;
        int var18 = EscapeVector.field_A;
        int var9 = 3;
        int var10 = param1.length;
        int var11 = jd.a(param4, (byte) -121, param5);
        int var12 = na.a(1, var10, param0, var11);
        int var13 = dd.a(var11, (byte) 122, param0, var10, var12);
        dk[] var14 = new dk[var10];
        int var15 = 0;
        if (param7) {
            field_w = null;
        }
        while (var15 < var10) {
            var16 = ji.a(var12, param4, param5, var13, var15, param3, 0);
            var17 = new dk(var9, param1[var15], param5[var15], param8[var15], param6[var15], param4);
            var17.b((byte) 114, var16, param2);
            var14[var15] = var17;
            var15++;
        }
        return var14;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        for (var2 = param0; var2 < ((na) this).field_d; var2++) {
            for (var3 = 0; var3 < ((na) this).field_g; var3++) {
                this.c((byte) 107, var3, var2);
            }
        }
    }

    private final boolean a(int param0) {
        return param0 == 0;
    }

    private final void a(wi[][] param0, int param1) {
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = EscapeVector.field_A;
        int var3 = param0.length;
        int var4 = param0[param1].length;
        for (var5 = 0; var5 < var4; var5++) {
            var6 = param0[0][var5];
            var6.field_g = true;
            for (var7_int = 0; var3 - 1 > var7_int; var7_int++) {
                param0[var7_int][var5] = param0[var7_int - -1][var5];
            }
            var7 = param0[-2 + var3][var5];
            var6.field_b = var7.field_b + 1;
            var6.field_a = var7.field_a;
            param0[-1 + var3][var5] = var6;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (-1 >= (param2 ^ -1)) {
            if (((na) this).field_d <= param2) {
                return;
            }
            if ((param0 ^ -1) <= param1) {
                if (!(param0 < ((na) this).field_g)) {
                    return;
                }
                ((na) this).field_r[param2 * ((na) this).field_g - -param0] = false;
                return;
            }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        int[] var13 = null;
        int var14 = 0;
        var14 = EscapeVector.field_A;
        var4 = 640;
        em.a(((na) this).field_c);
        var5 = 480;
        ((na) this).field_y[1].g();
        em.f(0, 0, var4, var5);
        em.d();
        var6 = ((na) this).field_p.length;
        var7 = ((na) this).field_p[0].length;
        var8 = -((na) this).field_f + -param0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= var6) {
            L1: {
              if (param2 > 102) {
                break L1;
              } else {
                this.a((int[][]) null, (byte) 106, (boolean[][]) null);
                break L1;
              }
            }
            md.field_D.a(126);
            em.b(((na) this).field_c);
            this.a(((na) this).field_y[1].field_B, true, ((na) this).field_y[0].field_B);
            ((na) this).field_y[0].e(0, 0);
            return;
          } else {
            var8 = var8 + ((na) this).field_f;
            var10 = -param1 + -((na) this).field_h;
            var11 = 0;
            L2: while (true) {
              if (var11 >= var7) {
                var9++;
                continue L0;
              } else {
                var10 = var10 + ((na) this).field_h;
                var12 = ((na) this).field_p[var9][var11];
                var13 = this.a(var12.field_b, -2981, var12.field_a, ((na) this).field_v);
                if (((na) this).field_n != var13) {
                  if (var13 == ((na) this).field_x) {
                    em.a(var10, var8, ((na) this).field_h, ((na) this).field_f, 1);
                    var11++;
                    continue L2;
                  } else {
                    var12.field_e.d(var10, var8);
                    var11++;
                    continue L2;
                  }
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final int[] a(int param0, int[] param1, int param2, int param3) {
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        if (((na) this).field_x != param1) {
            if (((na) this).field_n != param1) {
                return param1;
            }
        }
        int var6 = 67 / ((-63 - param3) / 62);
        int var5 = 0;
        if (!(((na) this).field_x != param1)) {
            var5 = -1;
        }
        if (!(((na) this).field_n != param1)) {
            var5 = 0;
        }
        param1 = new int[((na) this).field_f];
        for (var7 = 0; param1.length > var7; var7++) {
            param1[var7] = var5;
        }
        return param1;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        ((na) this).field_y = new ed[2];
        for (var2 = 0; var2 < ((na) this).field_y.length; var2++) {
            ((na) this).field_y[var2] = new ed(640, 480);
        }
        if (param0 < 48) {
            ((na) this).field_B = 101;
        }
    }

    private final int[][] a(int param0, int[][] param1, boolean param2, int param3) {
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        int var5 = 3;
        int var6 = 3;
        int var7 = -1 + param0;
        int var8 = -1 + param3;
        int var9 = 0;
        if (param2) {
            return null;
        }
        while (var9 < var6) {
            for (var10 = 0; var10 < var5; var10++) {
                var11 = this.a(var9 + var7, -2981, var8 - -var10, param1);
                var12 = var10 + var5 * var9;
                ((na) this).field_s[var12] = var11;
            }
            var9++;
        }
        return ((na) this).field_s;
    }

    na(int[][] param0, int[] param1, int[] param2, int param3, int param4) {
        ((na) this).field_B = 1458707;
        ((na) this).field_f = 32;
        ((na) this).field_u = new int[2];
        ((na) this).field_j = new int[]{199169, 0};
        ((na) this).field_o = 199169;
        ((na) this).field_h = 32;
        ((na) this).field_z = 2917671;
        ((na) this).field_q = 597511;
        ((na) this).field_n = param2;
        ((na) this).field_x = param1;
        ((na) this).field_g = param3;
        ((na) this).field_d = param4;
        ((na) this).field_v = param0;
        ((na) this).field_l = this.e(1);
        ((na) this).field_e = new boolean[2 + ((na) this).field_f];
        ((na) this).field_k = new boolean[9];
        ((na) this).field_s = new int[9][];
        ((na) this).field_r = new boolean[((na) this).field_d * ((na) this).field_g];
        ((na) this).field_A = new boolean[((na) this).field_f + 2][2 + ((na) this).field_h];
        this.b(0);
        this.c(96);
        ((na) this).field_c = new int[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_t = " - fire rock buster";
        field_m = "Highscores";
        field_i = new int[]{11, 14, 15, 16, 17, 18};
    }
}
