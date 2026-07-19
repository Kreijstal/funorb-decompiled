/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends mk {
    static volatile boolean field_M;
    private int field_N;
    private int field_F;
    static int field_J;
    private int field_K;
    static int field_L;
    private int field_I;
    static String field_O;
    private int field_H;
    private int field_G;

    void p(int param0) {
        if (!(-1 > (this.field_G ^ -1))) {
            return;
        }
        this.a(this.field_H, this.field_N, false);
        this.field_G = 0;
        if (param0 != 27830) {
            return;
        }
        this.d((byte) -2);
    }

    boolean m(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 < this.field_G) {
            L1: {
              L2: {
                var2 = this.field_H;
                var3 = this.field_N;
                fieldTemp$2 = this.field_F + 1;
                this.field_F = this.field_F + 1;
                if (fieldTemp$2 < this.field_G) {
                  break L2;
                } else {
                  this.field_G = 0;
                  this.d((byte) -2);
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = this.field_F * (this.field_G * 2 - this.field_F);
              var5 = this.field_G * this.field_G;
              var3 = this.field_I - -((this.field_N + -this.field_I) * var4 / var5);
              var2 = var4 * (this.field_H - this.field_K) / var5 + this.field_K;
              break L1;
            }
            this.a(var2, var3, false);
            break L0;
          } else {
            break L0;
          }
        }
        return super.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 > param0)) {
            this.a(param1, param2, false);
            return;
        }
        this.field_I = this.field_h;
        this.field_K = this.field_l;
        this.field_G = param3;
        this.field_H = param1;
        this.field_F = 0;
        this.field_N = param2;
    }

    void a(int param0, byte param1, int param2) {
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
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        var16 = Transmogrify.field_A ? 1 : 0;
        sb.d(param2 - -6, 35 + param0, -12 + this.field_l, this.field_h + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var7 ^ -1) <= (var4 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = var8;
                stackOut_2_1 = sb.field_e;
                stackIn_30_0 = stackOut_2_0;
                stackIn_30_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var16 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 < stackIn_3_1) {
                      break L3;
                    } else {
                      if ((sb.field_f ^ -1) >= (var8 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var9 = var5 + var7 * (var6 - var5) / var4;
                            var10 = 0;
                            var11 = this.field_l;
                            if (20 < var7) {
                              break L5;
                            } else {
                              L6: while (true) {
                                if (var10 > 20) {
                                  break L5;
                                } else {
                                  var12 = (-var7 + 20) * (-var7 + 20) + (20 + -var10) * (20 + -var10);
                                  stackOut_7_0 = -463;
                                  stackOut_7_1 = var12 ^ -1;
                                  stackIn_13_0 = stackOut_7_0;
                                  stackIn_13_1 = stackOut_7_1;
                                  stackIn_8_0 = stackOut_7_0;
                                  stackIn_8_1 = stackOut_7_1;
                                  if (var16 != 0) {
                                    break L4;
                                  } else {
                                    L7: {
                                      if (stackIn_8_0 > stackIn_8_1) {
                                        break L7;
                                      } else {
                                        if (-421 < (var12 ^ -1)) {
                                          break L5;
                                        } else {
                                          var13 = var9 * (-var12 + 462) / 42;
                                          var13 = var13 | (var13 << 2145939208 | var13 << -2105867760);
                                          sb.field_h[var8 * sb.field_c - -param2 - -var10] = var13;
                                          break L7;
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var16 == 0) {
                                      continue L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_12_0 = -21;
                          stackOut_12_1 = var7 ^ -1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L4;
                        }
                        L8: {
                          L9: {
                            if (stackIn_13_0 <= stackIn_13_1) {
                              var12 = var11;
                              var11 -= 21;
                              var13 = 0;
                              L10: while (true) {
                                L11: {
                                  if (var13 > 20) {
                                    break L11;
                                  } else {
                                    var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                                    stackOut_17_0 = 462;
                                    stackOut_17_1 = var14;
                                    stackIn_27_0 = stackOut_17_0;
                                    stackIn_27_1 = stackOut_17_1;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    if (var16 != 0) {
                                      break L8;
                                    } else {
                                      L12: {
                                        if (stackIn_18_0 >= stackIn_18_1) {
                                          break L12;
                                        } else {
                                          if (var16 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        L14: {
                                          if ((var14 ^ -1) <= -421) {
                                            break L14;
                                          } else {
                                            var12 = var11 - -1;
                                            if (var16 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        var15 = (462 - var14) * var9 / 42;
                                        var15 = var15 | (var15 << -960466776 | var15 << 1073714256);
                                        sb.field_h[var11 + sb.field_c * var8 + param2] = var15;
                                        break L13;
                                      }
                                      var11++;
                                      var13++;
                                      if (var16 == 0) {
                                        continue L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var11 = var12;
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                          var9 = var9 | (var9 << 753738320 | var9 << -411919416);
                          stackOut_26_0 = var10 - -param2;
                          stackOut_26_1 = var8;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L8;
                        }
                        sb.d(stackIn_27_0, stackIn_27_1, -var10 + var11, var9);
                        break L3;
                      }
                    }
                  }
                  var8++;
                  var7++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            stackOut_29_0 = 35;
            stackOut_29_1 = param0;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            break L1;
          }
          var8 = stackIn_30_0 + stackIn_30_1;
          L15: while (true) {
            L16: {
              L17: {
                if ((var4 ^ -1) >= (var7 ^ -1)) {
                  break L17;
                } else {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var9 = var9 | (var9 << 1785724232 | var9 << -986326480);
                  sb.d(param2, var8, 6, var9);
                  sb.d(this.field_l + (param2 - 6), var8, 6, var9);
                  var8++;
                  var7++;
                  if (var16 != 0) {
                    break L16;
                  } else {
                    if (var16 == 0) {
                      continue L15;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              vf.field_a.c(-90 + (this.field_l + param2), 10 + param0);
              k.a(35 + param0, true, 5 + param2, ua.field_f, -10 + this.field_l);
              k.a(-22 + (this.field_h + param0), true, param2, rh.field_l, this.field_l);
              break L16;
            }
            L18: {
              if (param1 <= -79) {
                break L18;
              } else {
                this.a(64, -46, 111, -124);
                break L18;
              }
            }
            var5 = 169;
            var6 = 127;
            var4 = -79 + this.field_h;
            var7 = 0;
            var8 = param0 - -57;
            L19: while (true) {
              L20: {
                if (var7 >= var4) {
                  break L20;
                } else {
                  var9 = var5 + (var6 - var5) * var7 / var4;
                  var9 = var9 | (var9 << 1556442024 | var9 << 1666535120);
                  sb.d(param2, var8, 6, var9);
                  sb.d(-6 + this.field_l + param2, var8, 6, var9);
                  var8++;
                  var7++;
                  if (var16 != 0) {
                    break L20;
                  } else {
                    if (var16 == 0) {
                      continue L19;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    bi(da param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_F = 0;
        this.field_G = 0;
    }

    void d(byte param0) {
        if (param0 != -2) {
            bi.o(-106);
        }
    }

    boolean a(byte param0) {
        this.p(27830);
        if (param0 != -97) {
            this.field_G = 107;
        }
        return super.a((byte) -97);
    }

    public static void o(int param0) {
        field_O = null;
        int var1 = 38 % ((29 - param0) / 45);
    }

    static {
        field_M = true;
        field_O = "Player Name: ";
    }
}
