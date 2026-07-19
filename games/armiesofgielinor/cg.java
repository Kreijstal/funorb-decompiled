/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static boolean field_a;
    static int[] field_b;
    private int field_l;
    private int[] field_e;
    static at field_c;
    private int field_k;
    private int field_h;
    private int field_g;
    static String field_i;
    private int field_f;
    private byte[] field_d;
    static int field_j;
    static boolean[] field_m;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        te discarded$2 = ub.a((byte) 70, im.field_v[13]);
        var2 = param0;
        L0: while (true) {
          if (this.field_h > var2) {
            if (var4 == 0) {
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var3 >= this.field_f) {
                    var2++;
                    break L2;
                  } else {
                    this.field_e[var2 - -(this.field_h * var3)] = qn.field_d[this.field_l + var2 - -((this.field_k + var3) * qn.field_l)];
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                continue L0;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = th.a(param0, 1, param1);
          if (var4 > param1 / 2) {
            var4 = param1 - var4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != 13) {
          return -127;
        } else {
          return var4;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        byte stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 8) {
            break L0;
          } else {
            cg.a((byte) -21);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          stackOut_3_0 = this.field_h;
          stackOut_3_1 = var3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            if (stackIn_4_0 > stackIn_4_1) {
              if (var10 == 0) {
                var4 = 0;
                L3: while (true) {
                  L4: {
                    if (this.field_f <= var4) {
                      break L4;
                    } else {
                      var5 = this.field_h * var4 + var3;
                      var6 = this.field_l + (var3 - -(qn.field_l * (var4 - -this.field_k)));
                      stackOut_10_0 = this.field_d[var5];
                      stackOut_10_1 = param1;
                      stackIn_4_0 = stackOut_10_0;
                      stackIn_4_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var10 != 0) {
                        continue L2;
                      } else {
                        L5: {
                          if (stackIn_11_0 > stackIn_11_1) {
                            L6: {
                              if (this.field_d[var5] <= 8 + param1) {
                                break L6;
                              } else {
                                qn.field_d[var6] = this.field_e[var5];
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var7 = qn.field_d[var6];
                            var8 = this.field_e[var5];
                            var9 = (-param1 + this.field_d[var5]) * 256 / 8;
                            qn.field_d[var6] = oe.c(oe.c(var9 * rn.a(var8, 255) + rn.a(var7, 255) * (-var9 + 256) >> -682449336, rn.a(var9 * (rn.a(var8, 65280) >> 1852188584) - -((-var9 + 256) * (rn.a(var7, 65280) >> 1895087432)), 65280)), rn.a((rn.a(var7, 16711680) >> -2022715408) * (256 - var9) + (rn.a(var8, 16711680) >> -2037990096) * var9 << 140585832, 16711851));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var4++;
                        if (var10 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var3++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0 == -109) {
            return;
        }
        cg.a((byte) 9);
    }

    public cg() {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var9 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_l = 0;
        this.field_k = 0;
        this.field_f = so.field_b.field_g;
        this.field_h = so.field_b.field_a;
        this.field_g = 50;
        this.field_d = new byte[this.field_f * this.field_h];
        this.field_e = new int[this.field_h * this.field_f];
        var9 = new int[this.field_f];
        var7 = var9;
        var6 = var7;
        var1 = var6;
        var2 = 1;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= this.field_f) {
                break L2;
              } else {
                var6[var2] = (int)(40.0 * Math.sin(3.141592653589793 * (double)var2 / (double)this.field_f * 6.0));
                var2++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            break L1;
          }
          L3: while (true) {
            if (var2 >= this.field_h) {
              this.a(0);
              return;
            } else {
              if (var5 == 0) {
                var3 = 0;
                L4: while (true) {
                  L5: {
                    if (var3 >= this.field_f) {
                      var2++;
                      break L5;
                    } else {
                      var4 = (5 * this.a(var9[var3] + var2, 160, 13) + -(var3 * 2) + 1160) * (-8 + this.field_g) / 1280;
                      this.field_d[this.field_h * var3 + var2] = (byte)var4;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        continue L4;
                      }
                    }
                  }
                  continue L3;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_b = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 9};
        field_i = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_c = new at();
        field_m = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, true, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, true, false};
    }
}
