/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends mc {
    private int[] field_r;
    private int[] field_q;
    private int[] field_s;
    float field_n;
    boolean field_p;
    int field_o;
    int[] field_u;
    private int[] field_t;

    private final static int a(int param0, double param1) {
        if (param1 == 1.0) {
            return param0;
        }
        int var3 = param0 >> 16;
        int var4 = param0 >> 8 & 255;
        int var5 = param0 & 255;
        var3 = (int)(Math.pow((double)var3 / 256.0, param1) * 256.0);
        var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
        var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
        return (var3 << 16) + (var4 << 8) + var5;
    }

    final void a() {
        ((gf) this).field_u = null;
    }

    final boolean a(float param0, int param1, ah param2) {
        int var4 = 0;
        int var5 = 0;
        kh var6 = null;
        byte[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        byte[] var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        int[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((gf) this).field_s.length) {
            var4 = param1 * param1;
            ((gf) this).field_u = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((gf) this).field_s.length) {
                ((gf) this).field_n = param0;
                return true;
              } else {
                L2: {
                  var6 = hd.a(1, ((gf) this).field_s[var5], param2);
                  var6.a();
                  var21 = var6.field_o;
                  var19 = var21;
                  var17 = var19;
                  var15 = var17;
                  var7 = var15;
                  var20 = var6.field_p;
                  var18 = var20;
                  var16 = var18;
                  var14 = var16;
                  var8 = var14;
                  var9 = ((gf) this).field_t[var5];
                  if ((var9 & -16777216) != 50331648) {
                    break L2;
                  } else {
                    var10 = var9 & 16711935;
                    var11 = var9 >> 8 & 255;
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= var20.length) {
                        break L2;
                      } else {
                        var13 = var20[var12];
                        if ((var13 & 65535) == var13 >> 8) {
                          var13 = var13 & 255;
                          var8[var12] = var10 * var13 >> 8 & 16711935 | var11 * var13 & 65280;
                          var12++;
                          continue L3;
                        } else {
                          var12++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var10 = 0;
                L4: while (true) {
                  if (var10 >= var20.length) {
                    L5: {
                      if (var5 != 0) {
                        var10 = ((gf) this).field_r[var5 - 1];
                        break L5;
                      } else {
                        var10 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      if (var5 != 0) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (var10 == 0) {
                      if (var6.field_b != param1) {
                        L7: {
                          if (var6.field_b != 64) {
                            break L7;
                          } else {
                            if (param1 != 128) {
                              break L7;
                            } else {
                              var11 = 0;
                              var12 = 0;
                              L8: while (true) {
                                if (var12 < param1) {
                                  var13 = 0;
                                  L9: while (true) {
                                    if (var13 >= param1) {
                                      var12++;
                                      continue L8;
                                    } else {
                                      var11++;
                                      ((gf) this).field_u[var11] = var8[var7[(var13 >> 1) + (var12 >> 1 << 6)] & 255];
                                      var13++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  var5++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                        L10: {
                          if (var6.field_b != 128) {
                            break L10;
                          } else {
                            if (param1 != 64) {
                              break L10;
                            } else {
                              var11 = 0;
                              var12 = 0;
                              L11: while (true) {
                                if (var12 < param1) {
                                  var13 = 0;
                                  L12: while (true) {
                                    if (var13 >= param1) {
                                      var12++;
                                      continue L11;
                                    } else {
                                      var11++;
                                      ((gf) this).field_u[var11] = var8[var7[(var13 << 1) + (var12 << 1 << 7)] & 255];
                                      var13++;
                                      continue L12;
                                    }
                                  }
                                } else {
                                  var5++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                        throw new RuntimeException();
                      } else {
                        var11 = 0;
                        L13: while (true) {
                          if (var11 < var4) {
                            ((gf) this).field_u[var11] = var8[var21[var11] & 255];
                            var11++;
                            continue L13;
                          } else {
                            var5++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var8[var10] = gf.a(var20[var10], (double)param0);
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            if (param2.f(((gf) this).field_s[var4], 88)) {
              var4++;
              continue L0;
            } else {
              return false;
            }
          }
        }
    }

    gf(bh param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((gf) this).field_o = param0.e(127);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0.d((byte) -99) != 1) {
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
          ((gf) this).field_p = stackIn_3_1 != 0;
          var2 = param0.d((byte) -99);
          if (var2 < 1) {
            break L1;
          } else {
            if (var2 <= 4) {
              ((gf) this).field_s = new int[var2];
              var3 = 0;
              L2: while (true) {
                if (var3 >= var2) {
                  L3: {
                    if (var2 <= 1) {
                      break L3;
                    } else {
                      ((gf) this).field_r = new int[var2 - 1];
                      var3 = 0;
                      L4: while (true) {
                        if (var3 >= var2 - 1) {
                          break L3;
                        } else {
                          ((gf) this).field_r[var3] = param0.d((byte) -99);
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (var2 <= 1) {
                      break L5;
                    } else {
                      ((gf) this).field_q = new int[var2 - 1];
                      var3 = 0;
                      L6: while (true) {
                        if (var3 >= var2 - 1) {
                          break L5;
                        } else {
                          ((gf) this).field_q[var3] = param0.d((byte) -99);
                          var3++;
                          continue L6;
                        }
                      }
                    }
                  }
                  ((gf) this).field_t = new int[var2];
                  var3 = 0;
                  L7: while (true) {
                    if (var3 >= var2) {
                      int discarded$2 = param0.d((byte) -99);
                      int discarded$3 = param0.d((byte) -99);
                      ((gf) this).field_u = null;
                    } else {
                      ((gf) this).field_t[var3] = param0.f(119);
                      var3++;
                      continue L7;
                    }
                  }
                } else {
                  ((gf) this).field_s[var3] = param0.e(127);
                  var3++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
        }
        throw new RuntimeException();
    }
}
