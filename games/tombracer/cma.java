/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cma extends ci {
    private int field_p;
    private int field_r;
    private int field_q;
    private int[] field_o;
    static int field_m;
    private int field_n;

    final static su[] c(int param0) {
        int var1 = 23 % ((-4 - param0) / 36);
        return new su[]{uk.field_M, ula.field_v, csa.field_y, ll.field_d, sga.field_n, bi.field_d, dp.field_g, wc.field_e, vna.field_a, wsa.field_v, al.field_f, kea.field_c, lfa.field_o, oc.field_H};
    }

    public cma() {
        super(1, false);
        this.field_p = 4096;
        this.field_q = 4096;
        this.field_o = new int[3];
        this.field_r = 4096;
        this.field_n = 409;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        uia var7 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                var7 = (uia) null;
                this.a((byte) -33, (uia) null, 70);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          var5 = param2;
                          if (var5 != 0) {
                            break L8;
                          } else {
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var5 != 1) {
                            break L9;
                          } else {
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (2 != var5) {
                            break L10;
                          } else {
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (-4 != (var5 ^ -1)) {
                            break L11;
                          } else {
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (4 != var5) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.field_n = param1.d(param0 ^ 17);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                    this.field_p = param1.d(124);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                  this.field_r = param1.d(param0 + 20);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                this.field_q = param1.d(123);
                if (var6 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var4_int = param1.a(-32768);
              this.field_o[2] = sea.c(var4_int, 255) >> -1933885940;
              this.field_o[0] = sea.c(267386880, var4_int << -721881788);
              this.field_o[1] = sea.c(4080, var4_int >> 456341860);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("cma.A(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var27 = this.field_h.a(param0, (byte) 122);
        var19 = var27;
        var17 = var19;
        var3 = var17;
        if (param1 == -1) {
          if (this.field_h.field_f) {
            var38 = this.a(param0, 0, -1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var29 = var27[0];
            var21 = var29;
            var8 = var21;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L0: while (true) {
              L1: {
                if (ns.field_g <= var11) {
                  break L1;
                } else {
                  L2: {
                    var13 = var39[var11];
                    var12 = var13 - this.field_o[0];
                    if (0 > var12) {
                      var12 = -var12;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (this.field_n < var12) {
                        var29 = var27[0];
                        var32 = var27[1];
                        var40 = var38[1];
                        var29[var11] = var13;
                        var9[var11] = var40[var11];
                        var10[var11] = var41[var11];
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var29 = var27[0];
                      var32 = var27[1];
                      var40 = var38[1];
                      var14 = var40[var11];
                      var12 = -this.field_o[1] + var14;
                      if (var12 < 0) {
                        var12 = -var12;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_n >= var12) {
                        break L6;
                      } else {
                        var29[var11] = var13;
                        var32[var11] = var14;
                        var10[var11] = var41[var11];
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var15 = var41[var11];
                      var12 = -this.field_o[2] + var15;
                      if (-1 < (var12 ^ -1)) {
                        var12 = -var12;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var12 > this.field_n) {
                        var29[var11] = var13;
                        var32[var11] = var14;
                        var33[var11] = var15;
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var8[var11] = var13 * this.field_q >> -2111631668;
                    var9[var11] = var14 * this.field_r >> -1020975412;
                    var10[var11] = this.field_p * var15 >> -1598030036;
                    break L3;
                  }
                  var11++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var17;
            }
          } else {
            return var17;
          }
        } else {
          return (int[][]) null;
        }
    }

    static {
    }
}
