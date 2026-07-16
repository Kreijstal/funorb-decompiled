/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends id {
    static int field_R;
    private int field_Q;
    static String field_S;
    static int[] field_U;
    private int field_H;
    private int[][] field_X;
    private vn field_W;
    static String field_T;
    private boolean[][] field_V;

    private final void a(wk param0, boolean param1) {
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
        vn[] var14 = null;
        int var15 = 0;
        L0: {
          var15 = ZombieDawn.field_J;
          var3 = -72 + param0.a(((oo) this).a(param1), (byte) -76);
          var4 = param0.a(((oo) this).f(237239984), 0) - 24 * ((oo) this).field_Q;
          var5 = -1 + -var4 / 24;
          if (((oo) this).field_Q + -2 > var5) {
            var5 = -2 + ((oo) this).field_Q;
            break L0;
          } else {
            if (var5 < ((oo) this).field_Q) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var6 = -1 + -var3 / 24;
          if (var6 < 1) {
            var6 = 1;
            break L1;
          } else {
            if (-5 >= (var6 ^ -1)) {
              return;
            } else {
              break L1;
            }
          }
        }
        var7 = (-var4 + nh.field_P) / 24;
        if (var5 > var7) {
          return;
        } else {
          L2: {
            if (((oo) this).field_Q > var7) {
              break L2;
            } else {
              var7 = -1 + ((oo) this).field_Q;
              break L2;
            }
          }
          var8 = (bd.field_e + -var3) / 24;
          if (var6 > var8) {
            return;
          } else {
            L3: {
              if (var8 < 5) {
                break L3;
              } else {
                var8 = 4;
                break L3;
              }
            }
            var4 = var4 + var5 * 24;
            var3 = var3 + 24 * var6;
            var9 = var4;
            var10 = var5;
            L4: while (true) {
              if (var7 < var10) {
                return;
              } else {
                var11 = var3;
                var12 = var6;
                L5: while (true) {
                  if (var8 < var12) {
                    var9 += 24;
                    var10++;
                    continue L4;
                  } else {
                    L6: {
                      var13 = ((oo) this).field_X[var10][var12];
                      if (var13 != 0) {
                        var14 = kd.field_Fb[6];
                        if (!((oo) this).field_V[var10][var12]) {
                          var14[-1 + var13].b(var11, var9);
                          break L6;
                        } else {
                          var14[-1 + var13].c(var11, var9);
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    wg.field_n = wg.field_n + 1;
                    var11 += 24;
                    var12++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        if (param0 <= -76) {
          L0: {
            this.a(param1, true);
            if (ld.field_m) {
              L1: {
                L2: {
                  var3 = bd.field_e + 80;
                  var4 = nh.field_P - -80;
                  if (hn.field_p == null) {
                    break L2;
                  } else {
                    if (var3 != hn.field_p.field_w) {
                      break L2;
                    } else {
                      if (hn.field_p.field_t != var4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                hn.field_p = null;
                hn.field_p = new vn(var3, var4);
                break L1;
              }
              ki.a((byte) -114, hn.field_p);
              this.a(param1, 47);
              pa.a(-21189);
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

    private final int[][] b(byte param0, int param1) {
        int[][][] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int[][][] var19 = null;
        int stackIn_7_0 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_12_2 = null;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_13_2 = null;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_11_2 = null;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          var18 = ZombieDawn.field_J;
          if (param0 >= 21) {
            break L0;
          } else {
            ((oo) this).field_X = null;
            break L0;
          }
        }
        L1: {
          var19 = new int[][][]{new int[5][], new int[4][], new int[4][], new int[3][], new int[3][]};
          var3 = var19;
          ((oo) this).field_H = 0;
          var4 = new int[]{0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 4};
          ((oo) this).field_H = so.a(var4);
          if (((oo) this).field_H != 0) {
            break L1;
          } else {
            ((oo) this).field_Q = ((oo) this).field_Q + 2;
            param1 += 2;
            break L1;
          }
        }
        L2: {
          ((oo) this).field_X = new int[param1][6];
          ((oo) this).field_V = new boolean[param1][6];
          var5 = var19[((oo) this).field_H].length;
          if (0 != so.c(2)) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        var6 = stackIn_7_0;
        var7_int = 0;
        L3: while (true) {
          if (var7_int >= var5) {
            var5--;
            var7 = new int[]{126, 104, 88, 96, 118};
            var8 = new int[]{127, 119, 112, 120};
            var9 = 1;
            var10 = 2;
            var11 = 3;
            var12 = 4;
            var13 = 0;
            ((oo) this).field_X[param1 - 1][var10] = so.a(var7);
            ((oo) this).field_X[-1 + param1][var11] = so.a(var8);
            ((oo) this).field_V[param1 - 1][var11] = var13 != 0;
            ((oo) this).field_V[-1 + param1][var10] = var13 != 0;
            var14 = new int[]{98, 98, 82, 82, 70, 102, 110, 102, 110, 102, 110, 90};
            var15 = new int[]{83, 83, 99, 99, 103, 111, 103, 111, 103, 111, 79, 95};
            var16 = new int[]{89, 89, 89, 89, 105, 113, 121, 121, 81, 81};
            var17 = var5 - -1;
            L4: while (true) {
              if (param1 - 1 <= var17) {
                return ((oo) this).field_X;
              } else {
                L5: {
                  if (so.c(2) != 0) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                L6: {
                  var13 = stackIn_21_0;
                  if (var13 != 0) {
                    var11 = 2;
                    var12 = 1;
                    var10 = 3;
                    var9 = 4;
                    break L6;
                  } else {
                    var12 = 4;
                    var10 = 2;
                    var9 = 1;
                    var11 = 3;
                    break L6;
                  }
                }
                L7: {
                  ((oo) this).field_V[var17][var11] = var13 != 0;
                  ((oo) this).field_V[var17][var10] = var13 != 0;
                  ((oo) this).field_X[var17][var10] = so.a(var14);
                  ((oo) this).field_X[var17][var11] = so.a(var15);
                  if (79 == ((oo) this).field_X[var17][var11]) {
                    ((oo) this).field_X[var17][var12] = 80;
                    ((oo) this).field_V[var17][var12] = var13 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (((oo) this).field_X[var17][var10] == 90) {
                  L8: {
                    L9: {
                      if (-3 + param1 < var17) {
                        break L9;
                      } else {
                        if (((oo) this).field_X[var17][var9] != -1) {
                          break L9;
                        } else {
                          if (-1 == ((oo) this).field_X[var17][var12]) {
                            if (var17 < -2 + param1) {
                              ((oo) this).field_X[var17][var9] = so.a(var16);
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    ((oo) this).field_X[var17][var10] = 106;
                    break L8;
                  }
                  L10: {
                    if ((((oo) this).field_X[var17][var9] ^ -1) != -106) {
                      break L10;
                    } else {
                      ((oo) this).field_X[var17 + 1][var9] = 97;
                      ((oo) this).field_V[var17 - -1][var9] = var13 != 0;
                      break L10;
                    }
                  }
                  ((oo) this).field_V[var17][var9] = var13 != 0;
                  var17++;
                  continue L4;
                } else {
                  var17++;
                  continue L4;
                }
              }
            }
          } else {
            var8_int = 0;
            L11: while (true) {
              if (-7 >= (var8_int ^ -1)) {
                var7_int++;
                continue L3;
              } else {
                L12: {
                  stackOut_11_0 = ((oo) this).field_X[var7_int];
                  stackOut_11_1 = var8_int;
                  stackOut_11_2 = var19[((oo) this).field_H][var7_int];
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  if (var6 == 0) {
                    stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (int[]) (Object) stackIn_13_2;
                    stackOut_13_3 = var8_int;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    break L12;
                  } else {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = (int[]) (Object) stackIn_12_2;
                    stackOut_12_3 = -1 + (-var8_int + 6);
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    break L12;
                  }
                }
                stackIn_14_0[stackIn_14_1] = stackIn_14_2[stackIn_14_3];
                ((oo) this).field_V[var7_int][var8_int] = var6 != 0;
                var8_int++;
                continue L11;
              }
            }
          }
        }
    }

    oo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        boolean discarded$0 = oj.field_d.a(0, 6);
        so.field_a.setSeed((long)param2);
        ((oo) this).field_Q = so.c(2) - -6;
        int[][] discarded$1 = this.b((byte) 123, ((oo) this).field_Q);
    }

    final void a(wk param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var3 = nh.field_R[0].field_w;
          var4 = nh.field_R[0].field_t;
          var5 = -(var3 / 2) + param0.a(((oo) this).a(true), (byte) -77);
          if (param1 == 65) {
            break L0;
          } else {
            ((oo) this).field_H = -94;
            break L0;
          }
        }
        L1: {
          var6 = 16 + param0.a(((oo) this).f(param1 ^ 237240049), param1 ^ 65) + -var4;
          if (var5 < -var3) {
            break L1;
          } else {
            if (-var4 > var6) {
              break L1;
            } else {
              if (var5 > bd.field_e) {
                break L1;
              } else {
                if (nh.field_P >= var6) {
                  var7 = 128;
                  so.b(nh.field_R[1], 12 + var5, 6 + var6, var7);
                  return;
                } else {
                  break L1;
                }
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        field_T = null;
        if (param0 <= 106) {
            oo.f((byte) 91);
        }
        field_S = null;
        field_U = null;
    }

    private final void a(wk param0, int param1) {
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
        vn[] var14 = null;
        int var15 = 0;
        var15 = ZombieDawn.field_J;
        if (param1 >= 32) {
          L0: {
            var3 = -72 + (param0.a(((oo) this).a(true), (byte) -72) - -40);
            var4 = 40 + (param0.a(((oo) this).f(237239984), 0) + -(24 * ((oo) this).field_Q));
            var5 = -1 + -var4 / 24;
            if ((var5 ^ -1) <= -1) {
              if (var5 < ((oo) this).field_Q) {
                break L0;
              } else {
                return;
              }
            } else {
              var5 = 0;
              break L0;
            }
          }
          L1: {
            var6 = -var3 / 24 - 1;
            if (-1 >= (var6 ^ -1)) {
              if (6 > var6) {
                break L1;
              } else {
                return;
              }
            } else {
              var6 = 0;
              break L1;
            }
          }
          var7 = (nh.field_P + (80 - var4)) / 24;
          if ((var7 ^ -1) > -1) {
            return;
          } else {
            L2: {
              if (var7 >= -2 + ((oo) this).field_Q) {
                var7 = -3 + ((oo) this).field_Q;
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (-var3 + 80 + bd.field_e) / 24;
            if (0 > var8) {
              return;
            } else {
              L3: {
                if (6 > var8) {
                  break L3;
                } else {
                  var8 = 5;
                  break L3;
                }
              }
              L4: {
                ap.field_u = ap.field_u + 1;
                var3 = var3 + 24 * var6;
                var4 = var4 + 24 * var5;
                if (null == ((oo) this).field_W) {
                  var9 = var4;
                  var10 = var5;
                  L5: while (true) {
                    if (var10 > var7) {
                      break L4;
                    } else {
                      var11 = var3;
                      var12 = var6;
                      L6: while (true) {
                        if (var8 < var12) {
                          var9 += 24;
                          var10++;
                          continue L5;
                        } else {
                          L7: {
                            var13 = ((oo) this).field_X[var10][var12];
                            if (0 != var13) {
                              var14 = kd.field_Fb[6];
                              if (!((oo) this).field_V[var10][var12]) {
                                var14[-1 + var13].b(var11, var9);
                                break L7;
                              } else {
                                var14[var13 + -1].c(var11, var9);
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          wg.field_n = wg.field_n + 1;
                          var11 += 24;
                          var12++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  ((oo) this).field_W.b(var3, var4);
                  break L4;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new int[]{};
        field_R = 0;
        field_S = "to keep fullscreen or";
    }
}
