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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              var3_int = -72 + param0.a(this.a(param1), (byte) -76);
              var4 = param0.a(this.f(237239984), 0) - 24 * this.field_Q;
              var5 = -1 + -var4 / 24;
              if (this.field_Q + -2 > var5) {
                var5 = -2 + this.field_Q;
                break L1;
              } else {
                if (var5 < this.field_Q) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var6 = -1 + -var3_int / 24;
              if (var6 < 1) {
                var6 = 1;
                break L2;
              } else {
                if (-5 >= (var6 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var7 = (-var4 + nh.field_P) / 24;
            if (var5 > var7) {
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if (this.field_Q > var7) {
                  break L3;
                } else {
                  var7 = -1 + this.field_Q;
                  break L3;
                }
              }
              var8 = (bd.field_e + -var3_int) / 24;
              if (var6 > var8) {
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L4: {
                  if (var8 < 5) {
                    break L4;
                  } else {
                    var8 = 4;
                    break L4;
                  }
                }
                var4 = var4 + var5 * 24;
                var3_int = var3_int + 24 * var6;
                var9 = var4;
                var10 = var5;
                L5: while (true) {
                  if (var7 < var10) {
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    var11 = var3_int;
                    var12 = var6;
                    L6: while (true) {
                      if (var8 < var12) {
                        var9 += 24;
                        var10++;
                        continue L5;
                      } else {
                        L7: {
                          var13 = this.field_X[var10][var12];
                          if (var13 != 0) {
                            var14 = kd.field_Fb[6];
                            if (!this.field_V[var10][var12]) {
                              var14[-1 + var13].b(var11, var9);
                              break L7;
                            } else {
                              var14[-1 + var13].c(var11, var9);
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("oo.K(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 <= -76) {
              L1: {
                this.a(param1, true);
                if (ld.field_m) {
                  L2: {
                    L3: {
                      var3_int = bd.field_e + 80;
                      var4 = nh.field_P - -80;
                      if (hn.field_p == null) {
                        break L3;
                      } else {
                        if (var3_int != hn.field_p.field_w) {
                          break L3;
                        } else {
                          if (hn.field_p.field_t != var4) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    hn.field_p = null;
                    hn.field_p = new vn(var3_int, var4);
                    break L2;
                  }
                  ki.a((byte) -114, hn.field_p);
                  this.a(param1, 47);
                  pa.a(-21189);
                  break L1;
                } else {
                  break L1;
                }
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
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("oo.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int[][] b(byte param0, int param1) {
        boolean[] dupTemp$8 = null;
        boolean[] arrayValue$9 = null;
        boolean[] dupTemp$10 = null;
        boolean[] arrayValue$11 = null;
        int[][][] var3;
        int[] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int var8_int;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var16;
        int var17;
        int var18;
        int[][][] var19;
        int stackIn_7_0 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_13_2 = null;
        int[] stackIn_14_0;
        int stackIn_14_1;
        int[] stackIn_14_2;
        int stackIn_14_3;
        int stackIn_21_0 = 0;
        L0: {
          var18 = ZombieDawn.field_J;
          if (param0 >= 21) {
            break L0;
          } else {
            this.field_X = (int[][]) null;
            break L0;
          }
        }
        L1: {
          var19 = new int[][][]{new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{9, 10, 11, 12, 13, 14}, new int[]{17, 18, 19, 20, 21, 22}, new int[]{25, 26, 27, 28, 29, 30}, new int[]{33, 34, 35, 36, 37, 38}}, new int[][]{new int[]{0, 57, 58, 59, 60, 0}, new int[]{0, 65, 66, 67, 68, 0}, new int[]{0, 73, 74, 75, 76, 0}, new int[]{0, 0, 82, 83, 84, 0}}, new int[][]{new int[]{0, 41, 42, 43, 44, 0}, new int[]{0, 49, 50, 51, 52, 0}, new int[]{0, 73, 74, 75, 76, 0}, new int[]{0, 0, 82, 83, 84, 0}}, new int[][]{new int[]{0, 0, 0, 23, 24, 0}, new int[]{0, 7, 8, 31, 32, 0}, new int[]{0, 15, 16, 39, 40, 0}}, new int[][]{new int[]{0, 45, 46, 47, 48, 0}, new int[]{0, 53, 54, 55, 56, 0}, new int[]{0, 61, 62, 63, 64, 0}}};
          var3 = var19;
          this.field_H = 0;
          var4 = new int[]{0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 4};
          this.field_H = so.a(var4);
          if (this.field_H != 0) {
            break L1;
          } else {
            this.field_Q = this.field_Q + 2;
            param1 += 2;
            break L1;
          }
        }
        L2: {
          this.field_X = new int[param1][6];
          this.field_V = new boolean[param1][6];
          var5 = var19[this.field_H].length;
          if (0 != so.c(2)) {
            stackIn_7_0 = 0;
            break L2;
          } else {
            stackIn_7_0 = 1;
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
            this.field_X[param1 - 1][var10] = so.a(var7);
            this.field_X[-1 + param1][var11] = so.a(var8);
            dupTemp$8 = this.field_V[param1 - 1];
            arrayValue$9 = this.field_V[-1 + param1];
            dupTemp$8[var11] = var13 != 0;
            arrayValue$9[var10] = var13 != 0;
            var14 = new int[]{98, 98, 82, 82, 70, 102, 110, 102, 110, 102, 110, 90};
            var15 = new int[]{83, 83, 99, 99, 103, 111, 103, 111, 103, 111, 79, 95};
            var16 = new int[]{89, 89, 89, 89, 105, 113, 121, 121, 81, 81};
            var17 = var5 - -1;
            L4: while (true) {
              if (param1 - 1 <= var17) {
                return this.field_X;
              } else {
                L5: {
                  if (so.c(2) != 0) {
                    stackIn_21_0 = 0;
                    break L5;
                  } else {
                    stackIn_21_0 = 1;
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
                  dupTemp$10 = this.field_V[var17];
                  arrayValue$11 = this.field_V[var17];
                  dupTemp$10[var11] = var13 != 0;
                  arrayValue$11[var10] = var13 != 0;
                  this.field_X[var17][var10] = so.a(var14);
                  this.field_X[var17][var11] = so.a(var15);
                  if (79 == this.field_X[var17][var11]) {
                    this.field_X[var17][var12] = 80;
                    this.field_V[var17][var12] = var13 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (this.field_X[var17][var10] == 90) {
                  L8: {
                    L9: {
                      if (-3 + param1 < var17) {
                        break L9;
                      } else {
                        if (this.field_X[var17][var9] != 0) {
                          break L9;
                        } else {
                          if (-1 == (this.field_X[var17][var12] ^ -1)) {
                            if (var17 < -2 + param1) {
                              this.field_X[var17][var9] = so.a(var16);
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
                    this.field_X[var17][var10] = 106;
                    break L8;
                  }
                  L10: {
                    if ((this.field_X[var17][var9] ^ -1) != -106) {
                      break L10;
                    } else {
                      this.field_X[var17 + 1][var9] = 97;
                      this.field_V[var17 - -1][var9] = var13 != 0;
                      break L10;
                    }
                  }
                  this.field_V[var17][var9] = var13 != 0;
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
                  stackIn_13_0 = this.field_X[var7_int];

                  stackIn_13_1 = var8_int;

                  stackIn_13_2 = var19[this.field_H][var7_int];

                  if (var6 == 0) {
                    stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = (int[]) ((Object) stackIn_13_2);
                    stackIn_14_3 = var8_int;
                    break L12;
                  } else {
                    stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = (int[]) ((Object) stackIn_13_2);
                    stackIn_14_3 = -1 + (-var8_int + 6);
                    break L12;
                  }
                }
                stackIn_14_0[stackIn_14_1] = stackIn_14_2[stackIn_14_3];
                this.field_V[var7_int][var8_int] = var6 != 0;
                var8_int++;
                continue L11;
              }
            }
          }
        }
    }

    oo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        oj.field_d.a(0, 6);
        so.field_a.setSeed((long)param2);
        this.field_Q = so.c(2) - -6;
        int[][] discarded$0 = this.b((byte) 123, this.field_Q);
    }

    final void a(wk param0, byte param1) {
        int var7 = 0;
        int var3_int = nh.field_R[0].field_w;
        int var4 = nh.field_R[0].field_t;
        int var5 = -(var3_int / 2) + param0.a(this.a(true), (byte) -77);
        if (param1 != 65) {
            this.field_H = -94;
        }
        int var6 = 16 + param0.a(this.f(param1 ^ 237240049), param1 ^ 65) + -var4;
        if (var5 < -var3_int || -var4 > var6 || var5 > bd.field_e || nh.field_P < var6) {
            return;
        }
        try {
            var7 = 128;
            so.b(nh.field_R[1], 12 + var5, 6 + var6, var7);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "oo.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            if (param1 >= 32) {
              L1: {
                var3_int = -72 + (param0.a(this.a(true), (byte) -72) - -40);
                var4 = 40 + (param0.a(this.f(237239984), 0) + -(24 * this.field_Q));
                var5 = -1 + -var4 / 24;
                if ((var5 ^ -1) <= -1) {
                  if (var5 < this.field_Q) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var5 = 0;
                  break L1;
                }
              }
              L2: {
                var6 = -var3_int / 24 - 1;
                if (-1 >= (var6 ^ -1)) {
                  if (6 > var6) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var6 = 0;
                  break L2;
                }
              }
              var7 = (nh.field_P + (80 - var4)) / 24;
              if ((var7 ^ -1) > -1) {
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L3: {
                  if (var7 >= -2 + this.field_Q) {
                    var7 = -3 + this.field_Q;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = (-var3_int + 80 + bd.field_e) / 24;
                if (0 > var8) {
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  L4: {
                    if (6 > var8) {
                      break L4;
                    } else {
                      var8 = 5;
                      break L4;
                    }
                  }
                  L5: {
                    ap.field_u = ap.field_u + 1;
                    var3_int = var3_int + 24 * var6;
                    var4 = var4 + 24 * var5;
                    if (null != this.field_W) {
                      this.field_W.b(var3_int, var4);
                      break L5;
                    } else {
                      var9 = var4;
                      var10 = var5;
                      L6: while (true) {
                        if (var10 > var7) {
                          break L5;
                        } else {
                          var11 = var3_int;
                          var12 = var6;
                          L7: while (true) {
                            if (var8 < var12) {
                              var9 += 24;
                              var10++;
                              continue L6;
                            } else {
                              L8: {
                                var13 = this.field_X[var10][var12];
                                if (0 != var13) {
                                  var14 = kd.field_Fb[6];
                                  if (!this.field_V[var10][var12]) {
                                    var14[-1 + var13].b(var11, var9);
                                    break L8;
                                  } else {
                                    var14[var13 + -1].c(var11, var9);
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              wg.field_n = wg.field_n + 1;
                              var11 += 24;
                              var12++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("oo.H(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
        field_U = new int[]{};
        field_R = 0;
        field_S = "to keep fullscreen or";
    }
}
