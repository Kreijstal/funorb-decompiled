/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends ma {
    private int[] field_s;
    private int[] field_m;
    int[] field_r;
    private int[] field_q;
    boolean field_n;
    float field_p;
    private int[] field_l;
    int field_o;

    final void a() {
        this.field_r = null;
    }

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

    final boolean a(float param0, int param1, di param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
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
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_m.length) {
            var4 = param1 * param1;
            this.field_r = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_m.length) {
                this.field_p = param0;
                return true;
              } else {
                L2: {
                  var6 = sb.a(-7575, param2, this.field_m[var5]);
                  var6.b();
                  var17 = var6.field_j;
                  var15 = var17;
                  var7 = var15;
                  var16 = var6.field_i;
                  var14 = var16;
                  var8 = var14;
                  var9 = this.field_l[var5];
                  if ((var9 & -16777216) != 50331648) {
                    break L2;
                  } else {
                    var10 = var9 & 16711935;
                    var11 = var9 >> 8 & 255;
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= var16.length) {
                        break L2;
                      } else {
                        var13 = var16[var12];
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
                  if (var10 >= var16.length) {
                    L5: {
                      if (var5 != 0) {
                        var10 = this.field_q[var5 - 1];
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
                      if (var6.field_f != param1) {
                        L7: {
                          if (var6.field_f != 64) {
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
                                      incrementValue$2 = var11;
                                      var11++;
                                      this.field_r[incrementValue$2] = var8[var7[(var13 >> 1) + (var12 >> 1 << 6)] & 255];
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
                          if (var6.field_f != 128) {
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
                                      incrementValue$3 = var11;
                                      var11++;
                                      this.field_r[incrementValue$3] = var8[var7[(var13 << 1) + (var12 << 1 << 7)] & 255];
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
                            this.field_r[var11] = var8[var17[var11] & 255];
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
                    var8[var10] = dh.a(var16[var10], (double)param0);
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            if (param2.b(true, this.field_m[var4])) {
              var4++;
              continue L0;
            } else {
              return false;
            }
          }
        }
    }

    dh(ge param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
          this.field_o = param0.d(-1034);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0.g(-78) != 1) {
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
          ((dh) (this)).field_n = stackIn_3_1 != 0;
          var2 = param0.g(-99);
          if (var2 < 1) {
            break L1;
          } else {
            if (var2 <= 4) {
              this.field_m = new int[var2];
              var3 = 0;
              L2: while (true) {
                if (var3 >= var2) {
                  L3: {
                    if (var2 <= 1) {
                      break L3;
                    } else {
                      this.field_q = new int[var2 - 1];
                      var3 = 0;
                      L4: while (true) {
                        if (var3 >= var2 - 1) {
                          break L3;
                        } else {
                          this.field_q[var3] = param0.g(-60);
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
                      this.field_s = new int[var2 - 1];
                      var3 = 0;
                      L6: while (true) {
                        if (var3 >= var2 - 1) {
                          break L5;
                        } else {
                          this.field_s[var3] = param0.g(-84);
                          var3++;
                          continue L6;
                        }
                      }
                    }
                  }
                  this.field_l = new int[var2];
                  var3 = 0;
                  L7: while (true) {
                    if (var3 >= var2) {
                      discarded$2 = param0.g(-62);
                      discarded$3 = param0.g(-102);
                      this.field_r = null;
                      return;
                    } else {
                      this.field_l[var3] = param0.b(true);
                      var3++;
                      continue L7;
                    }
                  }
                } else {
                  this.field_m[var3] = param0.d(-1034);
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
