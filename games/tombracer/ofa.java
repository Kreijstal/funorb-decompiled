/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ofa extends gn {
    private int field_H;
    private int field_G;
    static boolean field_I;
    private int field_J;
    private int field_K;
    private int field_F;
    private int field_E;
    static String field_D;

    final void a(int param0, int param1, int param2, byte param3) {
        if ((param0 ^ -1) >= -1) {
            this.c(-11560, param2, param1);
            return;
        }
        this.field_E = param2;
        this.field_K = param1;
        this.field_F = param0;
        this.field_H = this.field_p;
        this.field_J = this.field_m;
        this.field_G = 0;
        if (param3 > -80) {
            ofa.e(-57);
        }
    }

    ofa(jta param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_F = 0;
    }

    boolean a(byte param0) {
        if (param0 >= -53) {
            ofa.e(69);
        }
        this.c(true);
        return super.a((byte) -92);
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
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        bea.b(6 + param2, 35 + param0, this.field_m + -12, this.field_p - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var4 ^ -1) >= (var7 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = var8 ^ -1;
                stackOut_2_1 = bea.field_h ^ -1;
                stackIn_34_0 = stackOut_2_0;
                stackIn_34_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var16 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                      break L3;
                    } else {
                      if ((var8 ^ -1) <= (bea.field_k ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var9 = (var6 + -var5) * var7 / var4 + var5;
                            var10 = 0;
                            var11 = this.field_m;
                            if ((var7 ^ -1) >= -21) {
                              L6: while (true) {
                                if ((var10 ^ -1) < -21) {
                                  break L5;
                                } else {
                                  var12 = (-var10 + 20) * (-var10 + 20) + (20 - var7) * (20 - var7);
                                  stackOut_8_0 = var12;
                                  stackOut_8_1 = 462;
                                  stackIn_16_0 = stackOut_8_0;
                                  stackIn_16_1 = stackOut_8_1;
                                  stackIn_9_0 = stackOut_8_0;
                                  stackIn_9_1 = stackOut_8_1;
                                  if (var16 != 0) {
                                    break L4;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_9_0 <= stackIn_9_1) {
                                          break L8;
                                        } else {
                                          if (var16 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      if (var12 < 420) {
                                        break L5;
                                      } else {
                                        var13 = var9 * (-var12 + 462) / 42;
                                        var13 = var13 | (var13 << -1260004696 | var13 << 1823227088);
                                        bea.field_l[var10 + param2 + bea.field_g * var8] = var13;
                                        break L7;
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
                            } else {
                              break L5;
                            }
                          }
                          stackOut_15_0 = var7 ^ -1;
                          stackOut_15_1 = -21;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L4;
                        }
                        L9: {
                          L10: {
                            if (stackIn_16_0 >= stackIn_16_1) {
                              var12 = var11;
                              var11 -= 21;
                              var13 = 0;
                              L11: while (true) {
                                L12: {
                                  if (20 < var13) {
                                    break L12;
                                  } else {
                                    var14 = var13 * var13 + (-var7 + 20) * (20 - var7);
                                    stackOut_20_0 = 462;
                                    stackOut_20_1 = var14;
                                    stackIn_31_0 = stackOut_20_0;
                                    stackIn_31_1 = stackOut_20_1;
                                    stackIn_21_0 = stackOut_20_0;
                                    stackIn_21_1 = stackOut_20_1;
                                    if (var16 != 0) {
                                      break L9;
                                    } else {
                                      L13: {
                                        if (stackIn_21_0 >= stackIn_21_1) {
                                          break L13;
                                        } else {
                                          if (var16 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L14: {
                                        L15: {
                                          if (-421 < (var14 ^ -1)) {
                                            var12 = 1 + var11;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                        var15 = var9 * (-var14 + 462) / 42;
                                        var15 = var15 | (var15 << -122188656 | var15 << -1850743896);
                                        bea.field_l[param2 + (var8 * bea.field_g + var11)] = var15;
                                        break L14;
                                      }
                                      var13++;
                                      var11++;
                                      if (var16 == 0) {
                                        continue L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                var11 = var12;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var9 = var9 | (var9 << 1039656680 | var9 << -496378768);
                          stackOut_30_0 = var10 + param2;
                          stackOut_30_1 = var8;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          break L9;
                        }
                        bea.c(stackIn_31_0, stackIn_31_1, -var10 + var11, var9);
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
            stackOut_33_0 = param0;
            stackOut_33_1 = 35;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            break L1;
          }
          var8 = stackIn_34_0 + stackIn_34_1;
          L16: while (true) {
            L17: {
              L18: {
                if (var4 <= var7) {
                  break L18;
                } else {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var9 = var9 | (var9 << 2008726120 | var9 << -323450416);
                  bea.c(param2, var8, 6, var9);
                  bea.c(param2 - -this.field_m + -6, var8, 6, var9);
                  var7++;
                  var8++;
                  if (var16 != 0) {
                    break L17;
                  } else {
                    if (var16 == 0) {
                      continue L16;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              if (param1 == -67) {
                bg.field_s.b(-90 + param2 + this.field_m, 10 + param0);
                ag.a(35 + param0, uca.field_f, -59, param2 + 5, -10 + this.field_m);
                ag.a(param0 + (this.field_p - 22), fua.field_f, param1 + -29, param2, this.field_m);
                var6 = 127;
                var5 = 169;
                var4 = this.field_p - 79;
                var7 = 0;
                break L17;
              } else {
                return;
              }
            }
            var8 = 57 + param0;
            L19: while (true) {
              L20: {
                if ((var4 ^ -1) >= (var7 ^ -1)) {
                  break L20;
                } else {
                  var9 = var7 * (var6 + -var5) / var4 + var5;
                  var9 = var9 | (var9 << 1854461320 | var9 << 75080656);
                  bea.c(param2, var8, 6, var9);
                  bea.c(param2 + this.field_m + -6, var8, 6, var9);
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

    boolean a(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 >= 126) {
            break L0;
          } else {
            this.field_J = 90;
            break L0;
          }
        }
        L1: {
          if (0 < this.field_F) {
            L2: {
              L3: {
                var2 = this.field_K;
                var3 = this.field_E;
                fieldTemp$2 = this.field_G + 1;
                this.field_G = this.field_G + 1;
                if (this.field_F > fieldTemp$2) {
                  break L3;
                } else {
                  this.field_F = 0;
                  this.d(-69);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = (-this.field_G + 2 * this.field_F) * this.field_G;
              var5 = this.field_F * this.field_F;
              var3 = this.field_H - -((this.field_E + -this.field_H) * var4 / var5);
              var2 = this.field_J + (-this.field_J + this.field_K) * var4 / var5;
              break L2;
            }
            this.c(-11560, var3, var2);
            break L1;
          } else {
            break L1;
          }
        }
        return super.a(127);
    }

    final static void a(int[] param0, long[] param1, int param2) {
        try {
            if (param2 < 31) {
                long[] var4 = (long[]) null;
                ofa.a((int[]) null, (long[]) null, -57);
            }
            hk.a(-1 + param1.length, param1, 0, param0, -2646);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ofa.QA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != -126) {
            long[] var4 = (long[]) null;
            ofa.a((int[]) null, (long[]) null, -16);
        }
        return (param0 & 384 ^ -1) != -1 ? true : false;
    }

    void c(boolean param0) {
        if (!param0) {
            this.field_G = -30;
        }
        if (!(this.field_F > 0)) {
            return;
        }
        this.c(-11560, this.field_E, this.field_K);
        this.field_F = 0;
        this.d(-90);
    }

    void d(int param0) {
        if (param0 >= -20) {
            field_D = (String) null;
        }
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != 0) {
            field_D = (String) null;
        }
    }

    final static boolean d(boolean param0) {
        if (!param0) {
            return false;
        }
        return cl.field_o;
    }

    static {
        field_I = false;
        field_D = null;
    }
}
