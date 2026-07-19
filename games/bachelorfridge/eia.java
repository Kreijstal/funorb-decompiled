/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eia {
    private int field_i;
    private int field_j;
    private int[][][] field_c;
    private fw[] field_e;
    private int field_h;
    static qia field_a;
    private eaa field_f;
    private int field_g;
    static int field_d;
    boolean field_b;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (param0) {
            eia.a(-90);
        }
        for (var2 = 0; this.field_i > var2; var2++) {
            this.field_c[var2][0] = null;
            this.field_c[var2][1] = null;
            this.field_c[var2][2] = null;
            this.field_c[var2] = (int[][]) null;
        }
        this.field_c = (int[][][]) null;
        this.field_e = null;
        this.field_f.d(70);
        this.field_f = null;
    }

    final static void b(byte param0) {
        if (param0 != -116) {
            return;
        }
        lha.b((byte) 117);
        qs.c(-10901);
    }

    final static void a(byte param0) {
        if (param0 != -15) {
            field_a = (qia) null;
        }
        if (!(null == lc.field_l)) {
            lc.field_l.b();
        }
        if (null != nia.field_m) {
            nia.field_m.b();
        }
    }

    public static void a(int param0) {
        int var1 = 21 % ((81 - param0) / 37);
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var47 = BachelorFridge.field_y;
        try {
          L0: {
            var8_int = 0;
            var9 = param3;
            var10 = 0;
            var11 = -param0 + param7;
            var12 = -param0 + param3;
            var13 = param7 * param7;
            var14 = param3 * param3;
            var15 = var11 * var11;
            var16 = var12 * var12;
            var17 = var14 << -1829602079;
            var18 = var13 << -622684031;
            var19 = var16 << 1489496961;
            var20 = var15 << 1675318305;
            var21 = param3 << 1375995009;
            var22 = var12 << 491939041;
            var23 = (-var21 + 1) * var13 + var17;
            var24 = var14 + -((-1 + var21) * var18);
            if (param2 <= -74) {
              L1: {
                var25 = (-var22 + 1) * var15 - -var19;
                var26 = var16 - var20 * (var22 - 1);
                var27 = var13 << -1007667614;
                var28 = var14 << -1063058366;
                var29 = var15 << 979280994;
                var30 = var16 << -320139230;
                var31 = 3 * var17;
                var32 = var18 * (-3 + var21);
                var33 = var19 * 3;
                var34 = (var22 - 3) * var20;
                var35 = var28;
                var36 = (param3 + -1) * var27;
                var37 = var30;
                var38 = (var12 - 1) * var29;
                if (an.field_q > param5) {
                  break L1;
                } else {
                  if (param5 > ha.field_n) {
                    break L1;
                  } else {
                    var57 = tj.field_b[param5];
                    var40 = cr.a(eo.field_l, -param7 + param6, pw.field_x, 0);
                    var41 = cr.a(eo.field_l, param6 - -param7, pw.field_x, 0);
                    var42 = cr.a(eo.field_l, param6 + -var11, pw.field_x, 0);
                    var43 = cr.a(eo.field_l, param6 - -var11, pw.field_x, 0);
                    hba.a(param1, var40, var57, 7, var42);
                    hba.a(param4, var42, var57, 7, var43);
                    hba.a(param1, var43, var57, 7, var41);
                    break L1;
                  }
                }
              }
              L2: while (true) {
                if (0 >= var9) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (var12 < var9) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L3;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L3;
                    }
                  }
                  L4: {
                    var39 = stackIn_10_0;
                    if (var23 < 0) {
                      L5: while (true) {
                        if (0 <= var23) {
                          break L4;
                        } else {
                          var23 = var23 + var31;
                          var24 = var24 + var35;
                          var31 = var31 + var28;
                          var35 = var35 + var28;
                          var8_int++;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    if (var39 == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (var25 < 0) {
                          L8: while (true) {
                            if ((var25 ^ -1) <= -1) {
                              break L7;
                            } else {
                              var25 = var25 + var33;
                              var26 = var26 + var37;
                              var33 = var33 + var30;
                              var10++;
                              var37 = var37 + var30;
                              continue L8;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L9: {
                        if (-1 < (var26 ^ -1)) {
                          var25 = var25 + var33;
                          var26 = var26 + var37;
                          var33 = var33 + var30;
                          var37 = var37 + var30;
                          var10++;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var25 = var25 + -var38;
                      var26 = var26 + -var34;
                      var34 = var34 - var29;
                      var38 = var38 - var29;
                      break L6;
                    }
                  }
                  L10: {
                    if (var24 >= 0) {
                      break L10;
                    } else {
                      var23 = var23 + var31;
                      var24 = var24 + var35;
                      var35 = var35 + var28;
                      var8_int++;
                      var31 = var31 + var28;
                      break L10;
                    }
                  }
                  var24 = var24 + -var32;
                  var23 = var23 + -var36;
                  var36 = var36 - var27;
                  var9--;
                  var32 = var32 - var27;
                  var40 = -var9 + param5;
                  var41 = param5 - -var9;
                  if (var41 < an.field_q) {
                    continue L2;
                  } else {
                    if (ha.field_n >= var40) {
                      var42 = cr.a(eo.field_l, param6 - -var8_int, pw.field_x, 0);
                      var43 = cr.a(eo.field_l, -var8_int + param6, pw.field_x, 0);
                      if (var39 == 0) {
                        L11: {
                          if (var40 >= an.field_q) {
                            hba.a(param1, var43, tj.field_b[var40], 7, var42);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        if (ha.field_n < var41) {
                          continue L2;
                        } else {
                          hba.a(param1, var43, tj.field_b[var41], 7, var42);
                          continue L2;
                        }
                      } else {
                        L12: {
                          var44 = cr.a(eo.field_l, var10 + param6, pw.field_x, 0);
                          var45 = cr.a(eo.field_l, param6 + -var10, pw.field_x, 0);
                          if (an.field_q <= var40) {
                            var58 = tj.field_b[var40];
                            hba.a(param1, var43, var58, 7, var45);
                            hba.a(param4, var45, var58, 7, var44);
                            hba.a(param1, var44, var58, 7, var42);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        if (ha.field_n < var41) {
                          continue L2;
                        } else {
                          var59 = tj.field_b[var41];
                          hba.a(param1, var43, var59, 7, var45);
                          hba.a(param4, var45, var59, 7, var44);
                          hba.a(param1, var44, var59, 7, var42);
                          continue L2;
                        }
                      }
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var8), "eia.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[][][] b(int param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (!(this.field_i == this.field_h)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -67 / ((param0 - -35) / 46);
        for (var3 = 0; var3 < this.field_i; var3++) {
            this.field_e[var3] = fa.field_g;
        }
        return this.field_c;
    }

    final int[][] a(int param0, int param1) {
        fw var3 = null;
        fw var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var5 = BachelorFridge.field_y;
        if (param1 == -858) {
          if (this.field_h == this.field_i) {
            L0: {
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (this.field_e[param0] != null) {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L0;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L0;
              }
            }
            ((eia) (this)).field_b = stackIn_18_1 != 0;
            this.field_e[param0] = fa.field_g;
            return this.field_c[param0];
          } else {
            if (this.field_i != 1) {
              L1: {
                var3 = this.field_e[param0];
                var4 = var3;
                var4 = var3;
                if (var3 == null) {
                  L2: {
                    this.field_b = true;
                    if (this.field_g < this.field_i) {
                      var3 = new fw(param0, this.field_g);
                      this.field_g = this.field_g + 1;
                      break L2;
                    } else {
                      var4 = (fw) ((Object) this.field_f.a(param1 + 864));
                      var3 = new fw(param0, var4.field_g);
                      this.field_e[var4.field_k] = null;
                      var4.a(false);
                      break L2;
                    }
                  }
                  this.field_e[param0] = var3;
                  break L1;
                } else {
                  this.field_b = false;
                  break L1;
                }
              }
              this.field_f.a(-52, var3);
              return this.field_c[var3.field_g];
            } else {
              L3: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (this.field_j == param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              ((eia) (this)).field_b = stackIn_7_1 != 0;
              this.field_j = param0;
              return this.field_c[0];
            }
          }
        } else {
          return (int[][]) null;
        }
    }

    eia(int param0, int param1, int param2) {
        this.field_g = 0;
        this.field_j = -1;
        this.field_f = new eaa();
        this.field_b = false;
        this.field_i = param0;
        this.field_h = param1;
        this.field_e = new fw[this.field_h];
        this.field_c = new int[this.field_i][3][param2];
    }

    static {
    }
}
