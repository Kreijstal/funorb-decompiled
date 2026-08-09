/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class v {
    private int[] field_l;
    private int[] field_n;
    private vb field_d;
    int[] field_h;
    private boolean field_q;
    private int field_i;
    int field_b;
    private int[] field_a;
    private int field_m;
    int[] field_k;
    int[] field_p;
    int[] field_e;
    int[] field_o;
    private int[] field_r;
    static String field_f;
    private int field_g;
    int[] field_c;
    private int field_j;

    private final boolean b(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_8_0 = 0;
        L0: {
          this.a(-100, this.field_k);
          var3 = this.field_k[0];
          var4 = this.field_k[1];
          var5 = -this.field_p[0] + var3;
          var6 = -this.field_p[1] + var4;
          var7 = 16;
          if ((param1 ^ -1) >= 0) {
            break L0;
          } else {
            var7 = param1;
            break L0;
          }
        }
        L1: {
          var8 = 2;
          this.field_l[0] = this.a(this.field_l[0], 6198, var5, var8, var7);
          this.field_l[1] = this.a(this.field_l[1], 6198, var6, var8, var7);
          if (param0 < -118) {
            break L1;
          } else {
            this.f(-83);
            break L1;
          }
        }
        L2: {
          L3: {
            this.field_p[1] = this.field_p[1] + this.field_l[1];
            this.field_p[0] = this.field_p[0] + this.field_l[0];
            this.a(-78, this.field_p);
            this.a(false);
            this.h(-1);
            if (0 != this.field_l[0]) {
              break L3;
            } else {
              if (0 != this.field_l[1]) {
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
          }
          stackIn_8_0 = 0;
          break L2;
        }
        return stackIn_8_0 != 0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param0;
        if (param2 == 0) {
          return 0;
        } else {
          if (param1 == 6198) {
            if (param0 == param2) {
              return param0;
            } else {
              L0: {
                if ((param2 ^ -1) > -1) {
                  stackIn_11_0 = -1;
                  break L0;
                } else {
                  stackIn_11_0 = 1;
                  break L0;
                }
              }
              L1: {
                var8 = stackIn_11_0;
                param2 = param2 * var8;
                if (param0 == 0) {
                  var7 = var8;
                  break L1;
                } else {
                  L2: {
                    if (0 > param0) {
                      stackIn_15_0 = -1;
                      break L2;
                    } else {
                      stackIn_15_0 = 1;
                      break L2;
                    }
                  }
                  var7 = stackIn_15_0;
                  param0 = var7 * param0;
                  break L1;
                }
              }
              if (param2 < param0) {
                return var8 * param2;
              } else {
                L3: {
                  if (var7 == var8) {
                    stackIn_23_0 = 0;
                    break L3;
                  } else {
                    stackIn_23_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_23_0;
                  if (param4 > param0) {
                    stackIn_26_0 = 0;
                    break L4;
                  } else {
                    stackIn_26_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_26_0;
                  var11 = this.a((byte) -70, param0, param2) ? 1 : 0;
                  if (param3 <= param4 - param0) {
                    if (Math.abs(param2) > param3 + param0) {
                      stackIn_32_0 = 1;
                      break L5;
                    } else {
                      stackIn_32_0 = 0;
                      break L5;
                    }
                  } else {
                    stackIn_32_0 = 0;
                    break L5;
                  }
                }
                L6: {
                  var12 = stackIn_32_0;
                  if (param4 <= param0) {
                    stackIn_35_0 = 0;
                    break L6;
                  } else {
                    stackIn_35_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var13 = stackIn_35_0;
                  if (var9 != 0) {
                    var6 = param0 >> -2127732253;
                    break L7;
                  } else {
                    L8: {
                      if (var10 != 0) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 != 0) {
                              var6 = param0 - -1;
                              break L7;
                            } else {
                              var6 = var6 * var7;
                              return var6;
                            }
                          } else {
                            var6 = param0 - -param3;
                            break L7;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    var6 = param0 * 7 >> -1696609885;
                    break L7;
                  }
                }
                var6 = var6 * var7;
                return var6;
              }
            }
          } else {
            return -40;
          }
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3) {
        if (!param1 || param2 < 0 || 0 > param3) {
            this.field_a[0] = param2;
            this.field_a[1] = param3;
            return false;
        }
        this.field_p[0] = this.field_p[0] - (param2 + -this.field_a[0]);
        this.field_p[1] = this.field_p[1] - (-this.field_a[1] + param3);
        this.field_a[0] = param2;
        this.field_a[1] = param3;
        this.a(-85, this.field_p);
        this.a(!param0 ? true : false);
        this.h(-1);
        if (!param0) {
            this.a((byte) 70, 24);
        }
        return true;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = param1;
        int var5 = 0;
        while ((var4 ^ -1) < -1) {
            var5 = var5 + var4;
            var4 = 7 * var4 >> 419772515;
        }
        if (param0 != -70) {
            return false;
        }
        if ((param2 - var5 ^ -1) >= -1) {
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_p[1] = param1;
        this.field_p[0] = param0;
        this.a(-93, this.field_p);
        this.a(false);
        if (param2 <= 54) {
            this.field_m = -31;
        }
        this.h(-1);
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var4 = 0;
            if (-1 >= param2) {
              break L1;
            } else {
              if (param2 >= this.field_j) {
                break L1;
              } else {
                if (0 <= (param0 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_j <= param0) {
                    break L1;
                  } else {
                    var4 = var4 + this.field_o[param2 + param0 * this.field_j];
                    break L0;
                  }
                }
              }
            }
          }
          var4 += 255;
          break L0;
        }
        L2: {
          L3: {
            if (-1 >= param2 + 1) {
              break L3;
            } else {
              if (this.field_j <= param2 - -1) {
                break L3;
              } else {
                if (param0 <= -1) {
                  break L3;
                } else {
                  if (param0 < this.field_j) {
                    var4 = var4 + this.field_o[this.field_j * param0 + 1 + param2];
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
          }
          var4 += 255;
          break L2;
        }
        L4: {
          L5: {
            if (param2 - -1 <= -1) {
              break L5;
            } else {
              if (this.field_j <= 1 + param2) {
                break L5;
              } else {
                if (0 <= (param0 - -1 ^ -1)) {
                  break L5;
                } else {
                  if (param0 - -1 >= this.field_j) {
                    break L5;
                  } else {
                    var4 = var4 + this.field_o[(1 + param0) * this.field_j + (param2 - -1)];
                    break L4;
                  }
                }
              }
            }
          }
          var4 += 255;
          break L4;
        }
        L6: {
          if (param1 == -4510) {
            break L6;
          } else {
            v.d((byte) -11);
            break L6;
          }
        }
        L7: {
          L8: {
            if ((param2 ^ -1) >= 0) {
              break L8;
            } else {
              if (param2 >= this.field_j) {
                break L8;
              } else {
                if (-1 >= param0 - -1) {
                  break L8;
                } else {
                  if (this.field_j > 1 + param0) {
                    var4 = var4 + this.field_o[this.field_j * (1 + param0) + param2];
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
          }
          var4 += 255;
          break L7;
        }
        return var4 >> 1388444194;
    }

    final void c(int param0) {
        this.f(-41);
        this.field_e[0] = -this.field_p[0] + (this.field_k[0] + (so.field_b.field_a >> 1789939649));
        if (param0 != 9470337) {
            this.field_q = false;
        }
        this.field_e[1] = -this.field_p[1] + (this.field_k[1] + (so.field_b.field_g >> 9470337) - 20);
    }

    final void j(int param0) {
        if (param0 > -117) {
            return;
        }
        this.a(false);
        this.h(-1);
    }

    private final void c(byte param0) {
        this.f(-115);
        if (param0 != -28) {
            field_f = (String) null;
        }
        this.field_g = this.field_k[0];
        this.field_i = this.field_k[1];
        this.a(false);
        this.h(param0 + 27);
    }

    private final void a(int param0, int[] param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 40 * this.field_j >> -809523839;
              if (param0 < -76) {
                break L1;
              } else {
                this.field_d = (vb) null;
                break L1;
              }
            }
            L2: {
              var4 = param1[0] - (var3_int << 542256097) >> 1113661985;
              var5 = param1[1] - var3_int;
              if (Math.abs(var4) - -Math.abs(var5) <= var3_int) {
                break L2;
              } else {
                L3: {
                  var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> -467958783;
                  if (0 >= var4) {
                    param1[0] = param1[0] + (var6 << -1640928479);
                    break L3;
                  } else {
                    param1[0] = param1[0] - (var6 << 754877537);
                    break L3;
                  }
                }
                if (-1 > (var5 ^ -1)) {
                  param1[1] = param1[1] - var6;
                  break L2;
                } else {
                  param1[1] = param1[1] + var6;
                  break L2;
                }
              }
            }
            L4: {
              var5 = param1[1] + -var3_int;
              var4 = -(var3_int << -1510912799) + param1[0] >> -1055977439;
              var3_int -= 100;
              if (var3_int < var4) {
                param1[0] = param1[0] - (-var3_int + var4 << 1873418465);
                break L4;
              } else {
                if (var4 >= -var3_int) {
                  break L4;
                } else {
                  param1[0] = param1[0] - (var3_int + var4 << 162883169);
                  break L4;
                }
              }
            }
            L5: {
              if (var5 > var3_int) {
                param1[1] = param1[1] - (var5 - var3_int);
                break L5;
              } else {
                if (-var3_int <= var5) {
                  break L5;
                } else {
                  param1[1] = param1[1] - (var3_int + var5);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("v.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        int stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_16_5;
        int stackIn_16_6;
        int stackIn_24_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == 1745035905) {
          var3 = this.field_n[0];
          var4 = this.field_n[1];
          var4 -= 3;
          this.field_c[0] = var3;
          this.field_c[1] = var4;
          this.f(param1 ^ -1745035990);
          this.i(0);
          var5 = this.field_e[0] - -40;
          var6 = this.field_e[1] - 20;
          var7 = var5;
          var8 = var6;
          var9 = var3;
          var10 = var4;
          var11 = so.field_b.field_a;
          var12 = so.field_b.field_g;
          qn.f(0, 0, var11, var12);
          var13 = 0;
          L0: while (true) {
            if (var8 >= 256 + var12 + 40) {
              L1: {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (!gb.field_B) {
                    break L1;
                  } else {
                    if (cu.field_a) {
                      this.a(-12608);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            } else {
              L2: while (true) {
                if (80 + var11 <= var7) {
                  L3: {
                    var8 += 20;
                    if (var13 == 0) {
                      break L3;
                    } else {
                      var3--;
                      var7 = -40 + var5;
                      break L3;
                    }
                  }
                  L4: {
                    if (var13 != 0) {
                      break L4;
                    } else {
                      var7 = var5;
                      var4++;
                      break L4;
                    }
                  }
                  L5: {
                    if (var13 != 0) {
                      stackIn_24_0 = 0;
                      break L5;
                    } else {
                      stackIn_24_0 = 1;
                      break L5;
                    }
                  }
                  var13 = stackIn_24_0;
                  var9 = var3;
                  var10 = var4;
                  continue L0;
                } else {
                  if ((var9 ^ -1) <= 0) {
                    if (var9 <= this.field_j) {
                      if (var10 >= -1) {
                        if (this.field_m >= var10) {
                          L6: {
                            stackIn_15_0 = var10;

                            stackIn_15_1 = var9;

                            stackIn_15_2 = param0;

                            stackIn_15_3 = var8;

                            stackIn_15_4 = 99;

                            stackIn_15_5 = var7;

                            if (var8 <= var12 + 40) {
                              stackIn_16_0 = stackIn_15_0;
                              stackIn_16_1 = stackIn_15_1;
                              stackIn_16_2 = stackIn_15_2;
                              stackIn_16_3 = stackIn_15_3;
                              stackIn_16_4 = stackIn_15_4;
                              stackIn_16_5 = stackIn_15_5;
                              stackIn_16_6 = 0;
                              break L6;
                            } else {
                              stackIn_16_0 = stackIn_15_0;
                              stackIn_16_1 = stackIn_15_1;
                              stackIn_16_2 = stackIn_15_2;
                              stackIn_16_3 = stackIn_15_3;
                              stackIn_16_4 = stackIn_15_4;
                              stackIn_16_5 = stackIn_15_5;
                              stackIn_16_6 = 1;
                              break L6;
                            }
                          }
                          fg.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5, stackIn_16_6 != 0);
                          var7 += 80;
                          var10++;
                          var9++;
                          continue L2;
                        } else {
                          var7 += 80;
                          var10++;
                          var9++;
                          continue L2;
                        }
                      } else {
                        var7 += 80;
                        var10++;
                        var9++;
                        continue L2;
                      }
                    } else {
                      var7 += 80;
                      var10++;
                      var9++;
                      continue L2;
                    }
                  } else {
                    var7 += 80;
                    var10++;
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        if (param0 < 88) {
            discarded$0 = this.a(false, true, 4, 95);
        }
        int var3 = this.field_e[1];
        int var2 = this.field_e[0];
        var3 = var3 - (so.field_b.field_g >> -279644223);
        var2 = var2 - (so.field_b.field_a >> 1693653825);
        int var4 = var2 - -this.field_p[0];
        int var5 = var3 + this.field_p[1];
        this.field_k[1] = var5;
        this.field_k[0] = var4;
    }

    final void b(int param0, int param1, byte param2) {
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_e[0] = 0;
        this.field_e[1] = 0;
        this.c(false);
        this.field_c[1] = this.field_c[1] - 2;
        var4 = this.field_c[0];
        var5 = this.field_c[1];
        this.f(-63);
        this.i(0);
        this.f(-113);
        this.i(0);
        var6 = this.field_e[0];
        var7 = this.field_e[1];
        var10 = 1 + var4;
        if (param2 == 93) {
          var11 = var5;
          var12 = 0;
          var13 = so.field_b.field_a;
          var14 = so.field_b.field_g;
          var15 = var6;
          L0: while (true) {
            if (var15 > var13) {
              return;
            } else {
              var8 = var10;
              var9 = var11;
              var16 = var12;
              var17 = var7;
              L1: while (true) {
                if (var14 < var17) {
                  L2: {
                    if (var12 != 0) {
                      var10++;
                      var11++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var12 != 0) {
                      stackIn_26_0 = 0;
                      break L3;
                    } else {
                      stackIn_26_0 = 1;
                      break L3;
                    }
                  }
                  var12 = stackIn_26_0;
                  var15 += 40;
                  continue L0;
                } else {
                  L4: {
                    if (var16 != 0) {
                      var9++;
                      break L4;
                    } else {
                      var8--;
                      if (-1 >= var8) {
                        break L4;
                      } else {
                        if (var8 >= this.field_j + 1) {
                          break L4;
                        } else {
                          if (var9 <= -1) {
                            break L4;
                          } else {
                            if (var9 >= 1 + this.field_m) {
                              break L4;
                            } else {
                              L5: {
                                var18 = (-param1 + var15) * (-param1 + var15) + (var17 - param0) * (-param0 + var17);
                                var19 = 3 * fe.a(var18 * 4) + -30;
                                if (var19 >= 0) {
                                  break L5;
                                } else {
                                  var19 = 0;
                                  break L5;
                                }
                              }
                              if ((var19 ^ -1) <= -257) {
                                break L4;
                              } else {
                                pi.field_T.e(-6 + var15, -3 + var17, -var19 + 256);
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (var16 != 0) {
                      stackIn_19_0 = 0;
                      break L6;
                    } else {
                      stackIn_19_0 = 1;
                      break L6;
                    }
                  }
                  var16 = stackIn_19_0;
                  var17 += 20;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        this.field_c[1] = this.field_b / this.field_j;
        this.field_c[0] = -(this.field_c[1] * this.field_j) + this.field_b;
        if (param0 != 36) {
            return;
        }
    }

    private final void h(int param0) {
        this.field_e[1] = 0;
        this.field_e[0] = 0;
        this.c(false);
        if (param0 != -1) {
            this.a((byte) 54, -118);
        }
        this.field_n[0] = this.field_c[0];
        this.field_n[1] = this.field_c[1];
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = ArmiesOfGielinor.field_M ? 1 : 0;
          var11 = 255;
          var12 = 255;
          var13 = 255;
          var14 = 255;
          if (param1 <= -1) {
            break L0;
          } else {
            if ((param5 ^ -1) >= 0) {
              break L0;
            } else {
              if (param1 >= this.field_j) {
                break L0;
              } else {
                if (param5 < this.field_m) {
                  if (param3) {
                    var12 = this.field_o[this.field_j * param5 + param1];
                    break L0;
                  } else {
                    var11 = this.field_o[param5 * this.field_j + param1];
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if ((param0 ^ -1) >= 0) {
            break L1;
          } else {
            if ((param2 ^ -1) >= 0) {
              break L1;
            } else {
              if (param0 >= this.field_j) {
                break L1;
              } else {
                if (param2 >= this.field_m) {
                  break L1;
                } else {
                  if (param3) {
                    var13 = this.field_o[this.field_j * param2 + param0];
                    break L1;
                  } else {
                    var14 = this.field_o[param0 + param2 * this.field_j];
                    break L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param8 == 1760) {
            break L2;
          } else {
            this.field_o = (int[]) null;
            break L2;
          }
        }
        L3: {
          if (!param3) {
            var13 = this.b(param2, -4510, param0);
            var12 = this.b(-1 + param5, -4510, param1 - 1);
            break L3;
          } else {
            var14 = this.b(param2 - 1, -4510, -1 + param0);
            var11 = this.b(param5, -4510, param1);
            break L3;
          }
        }
        this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
    }

    private final void a(boolean param0) {
        this.field_e[1] = so.field_b.field_g >> -1572318207;
        this.field_e[0] = so.field_b.field_a >> 792578625;
        this.c(param0);
        this.field_r[1] = this.field_c[1];
        this.field_r[0] = this.field_c[0];
    }

    private final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5) {
        int var7;
        int var8;
        int var9;
        L0: {
          L1: {
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            var7 = 0;
            if (param5) {
              break L1;
            } else {
              if (param1) {
                break L1;
              } else {
                if (param4) {
                  break L1;
                } else {
                  if (param3) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          var7 = 1;
          break L0;
        }
        if (param0) {
          L2: {
            var8 = 16;
            if (!param5) {
              if (!param2) {
                if ((this.field_l[1] ^ -1) > -1) {
                  this.field_l[1] = this.field_l[1] + 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              if (this.field_l[1] > -var8) {
                this.field_l[1] = this.field_l[1] - 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param1) {
              if (this.field_l[1] >= var8) {
                break L3;
              } else {
                this.field_l[1] = this.field_l[1] + 1;
                break L3;
              }
            } else {
              if (!param2) {
                if (this.field_l[1] <= 0) {
                  break L3;
                } else {
                  this.field_l[1] = this.field_l[1] - 1;
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (param4) {
              if (-var8 < this.field_l[0]) {
                this.field_l[0] = this.field_l[0] - 1;
                break L4;
              } else {
                break L4;
              }
            } else {
              if (param2) {
                break L4;
              } else {
                if (-1 < (this.field_l[0] ^ -1)) {
                  this.field_l[0] = this.field_l[0] + 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
          L5: {
            if (param3) {
              if (this.field_l[0] < var8) {
                this.field_l[0] = this.field_l[0] + 1;
                break L5;
              } else {
                break L5;
              }
            } else {
              if (!param2) {
                if (0 < this.field_l[0]) {
                  this.field_l[0] = this.field_l[0] - 1;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              if (!param2) {
                break L7;
              } else {
                if (var7 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            this.field_p[1] = this.field_p[1] + this.field_l[1];
            this.field_p[0] = this.field_p[0] + (this.field_l[0] << -171355071);
            this.a(-81, this.field_p);
            this.a(false);
            this.h(-1);
            break L6;
          }
          return var7 != 0;
        } else {
          return true;
        }
    }

    private final void d(int param0) {
        int var2 = -40 + this.field_k[0] >> 1477510273;
        int var3 = this.field_k[1] - (this.field_m * 40 >> -608768031);
        int var5 = var3 + var2;
        int var4 = var2 + -var3;
        if (-1 < (var4 ^ -1)) {
            var4 -= 40;
        }
        if (!(var5 >= 0)) {
            var5 -= 40;
        }
        this.field_c[0] = var4 / 40;
        this.field_c[param0] = var5 / 40;
    }

    final void a(int param0, boolean param1) {
        this.field_c[1] = param0 / this.field_j;
        this.field_c[0] = param0 + -(this.field_j * this.field_c[1]);
        if (!param1) {
            this.field_l = (int[]) null;
        }
        this.b(!param1 ? true : false);
    }

    final void c(boolean param0) {
        if (param0) {
            this.a(-4, 46);
        }
        this.e(105);
        this.d(1);
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        L0: {
          var21 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_e[0] = 0;
          this.field_e[1] = 0;
          this.c(false);
          this.field_c[1] = this.field_c[1] - 2;
          var2 = this.field_c[0];
          var3 = this.field_c[1];
          this.f(-47);
          this.i(0);
          this.f(-85);
          this.i(param0 ^ param0);
          var4 = this.field_e[0];
          var5 = this.field_e[1];
          var11 = var2 + -1;
          var12 = var3;
          var13 = var3;
          var10 = var2;
          var14 = 0;
          if (0 != (var3 + var2) % 2) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var15 = stackIn_3_0;
        var16 = so.field_b.field_a;
        var17 = so.field_b.field_g;
        var18 = var4;
        L1: while (true) {
          if (var18 > var16) {
            return;
          } else {
            var8 = var12;
            var6 = var10;
            var7 = var11;
            var9 = var13;
            var19 = var14;
            var20 = var5;
            L2: while (true) {
              if (var20 > var17) {
                L3: {
                  if (var14 != 0) {
                    var10++;
                    var12++;
                    break L3;
                  } else {
                    var13++;
                    var11++;
                    break L3;
                  }
                }
                L4: {
                  if (var14 != 0) {
                    stackIn_20_0 = 0;
                    break L4;
                  } else {
                    stackIn_20_0 = 1;
                    break L4;
                  }
                }
                var14 = stackIn_20_0;
                var18 += 40;
                continue L1;
              } else {
                L5: {
                  this.a(var7, var6, var9, var19 != 0, var15 != 0, var8, var14 != 0, var18, 1760, var20);
                  if (var19 == 0) {
                    var9++;
                    var6--;
                    break L5;
                  } else {
                    var7--;
                    var8++;
                    break L5;
                  }
                }
                L6: {
                  if (var19 != 0) {
                    stackIn_13_0 = 0;
                    break L6;
                  } else {
                    stackIn_13_0 = 1;
                    break L6;
                  }
                }
                var19 = stackIn_13_0;
                var20 += 20;
                continue L2;
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var2 = this.field_k[0];
        int var3 = this.field_k[1];
        int var4 = 0;
        int var5 = 0;
        int var6 = so.a(327680, -129);
        var4 = var4 + ev.b(-48, var2 << -551277810, var6);
        var5 = var5 + ev.b(-70, var2 << 812143534, var6);
        var4 = var4 - ev.b(-94, var2 << -510994289, var6);
        var5 = var5 + ev.b(-51, var3 << -6374289, var6);
        this.field_h[0] = var4;
        this.field_h[1] = var5;
        int var7 = -48 % ((19 - param0) / 36);
    }

    final void i(int param0) {
        int var3 = this.field_k[1];
        int var2 = this.field_k[0];
        int var5 = var3 + -this.field_p[1];
        int var4 = var2 - this.field_p[param0];
        var4 = var4 + (so.field_b.field_a >> 194744801);
        var5 = (so.field_b.field_g >> 1745035905) + var5;
        this.field_e[1] = var5;
        this.field_e[0] = var4;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_31_1 = 0;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int[] var40;
        L0: {
          var39 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param11) {
            break L0;
          } else {
            if (0 > param1) {
              break L0;
            } else {
              if (this.field_m - 1 < param13) {
                break L0;
              } else {
                if (param8 > -1 + this.field_j) {
                  break L0;
                } else {
                  if (0 > param13) {
                    this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
                    return;
                  } else {
                    if (0 > param8) {
                      this.a(true, param4, param10, param0 ^ 8236, param5, param6, param2, param7, param3, param9, param12);
                      return;
                    } else {
                      L1: {
                        if (param0 == -8302) {
                          break L1;
                        } else {
                          var40 = (int[]) null;
                          this.a(-43, (int[]) null);
                          break L1;
                        }
                      }
                      if (param1 > -1 + this.field_m) {
                        this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
                        return;
                      } else {
                        if (-1 + this.field_j < param11) {
                          this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
                          return;
                        } else {
                          L2: {
                            var15 = param2 << 1267885520;
                            var16 = (-var15 + (param12 << -787487536)) / 40;
                            var17 = param7 << 470127472;
                            var18 = ((param4 << -2002597104) + -var17) / 40;
                            var19 = var15;
                            var20 = var17;
                            stackIn_22_0 = 0;

                            if (param9 ^ param5) {
                              stackIn_23_0 = stackIn_22_0;
                              stackIn_23_1 = 0;
                              break L2;
                            } else {
                              stackIn_23_0 = stackIn_22_0;
                              stackIn_23_1 = 40;
                              break L2;
                            }
                          }
                          var21 = stackIn_23_0 - -stackIn_23_1;
                          var22 = so.field_b.field_a;
                          var23 = so.field_b.field_g;
                          var24 = param6;
                          L3: while (true) {
                            if (var24 >= param6 + 40) {
                              return;
                            } else {
                              L4: {
                                stackIn_27_0 = 0;

                                if (param3 == param5) {
                                  stackIn_28_0 = stackIn_27_0;
                                  stackIn_28_1 = 0;
                                  break L4;
                                } else {
                                  stackIn_28_0 = stackIn_27_0;
                                  stackIn_28_1 = 1;
                                  break L4;
                                }
                              }
                              L5: {


                                if (stackIn_28_1 != 0 ^ param9) {

                                  stackIn_31_1 = 20;
                                  break L5;
                                } else {

                                  stackIn_31_1 = 0;
                                  break L5;
                                }
                              }
                              var25 = stackIn_28_0 - -stackIn_31_1;
                              var26 = var19;
                              var27 = (-var19 + var20) / 20;
                              var28 = param10;
                              L6: while (true) {
                                if (param10 - -20 <= var28) {
                                  var20 = var20 + var18;
                                  var21++;
                                  var19 = var19 + var16;
                                  var24++;
                                  continue L3;
                                } else {
                                  L7: {
                                    if (0 > var24) {
                                      break L7;
                                    } else {
                                      if (var24 >= var22) {
                                        break L7;
                                      } else {
                                        if ((var28 ^ -1) > -1) {
                                          break L7;
                                        } else {
                                          if (var23 <= var28) {
                                            break L7;
                                          } else {
                                            var29 = var24 + var22 * var28;
                                            var30 = qn.field_d[var29];
                                            var31 = dd.field_k.field_B[var21 - -(var25 * 80)];
                                            if (var30 != 0) {
                                              L8: {
                                                var32 = (16745529 & var26) >> 738102959;
                                                if ((var32 ^ -1) < -256) {
                                                  var32 = 255;
                                                  break L8;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                              var36 = (16711680 & var31) * (-var32 + 255) >>> 669334472;
                                              var33 = 255 & var30 >> -1961506128;
                                              var35 = (var30 & 65280) >> 917162824;
                                              var34 = var30 & 255;
                                              var37 = (var31 & 255) * (-var32 + 255);
                                              var36 = var36 + var32 * 65280;
                                              var38 = (65280 & var31) * (-var32 + 255);
                                              var38 = var38 + 65280 * var32;
                                              var37 = var37 + 255 * var32;
                                              var37 = var37 >> 8;
                                              var38 = var38 >> 8;
                                              var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> -1439304056;
                                              qn.field_d[var29] = var30;
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var26 = var26 + var27;
                                  var25++;
                                  var28++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10) {
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_10_1 = false;
        int stackIn_10_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        L0: {
          var38 = ArmiesOfGielinor.field_M ? 1 : 0;
          var12 = param6 << 1744478096;
          var13 = (-var12 + (param10 << -758926576)) / 40;
          var14 = param7 << -1020479472;
          var15 = (-var14 + (param1 << -347112496)) / 40;
          var16 = var12;
          var17 = var14;
          stackIn_2_0 = 0;

          if (param4 ^ param9) {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = 40;
            break L0;
          }
        }
        L1: {
          var18 = stackIn_3_0 - -stackIn_3_1;
          var19 = so.field_b.field_a;
          var20 = so.field_b.field_g;
          if (param3 < -51) {
            break L1;
          } else {
            this.field_g = -88;
            break L1;
          }
        }
        var21 = param5;
        L2: while (true) {
          if (40 + param5 <= var21) {
            return;
          } else {
            L3: {
              stackIn_9_0 = 0;

              stackIn_9_1 = param9;

              if (param4) {
                stackIn_10_0 = stackIn_9_0;
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = 0;
                break L3;
              } else {
                stackIn_10_0 = stackIn_9_0;
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = 1;
                break L3;
              }
            }
            L4: {






              if (param8) {



                stackIn_13_3 = 0;
                break L4;
              } else {



                stackIn_13_3 = 1;
                break L4;
              }
            }
            L5: {




              if (stackIn_10_2 == stackIn_13_3) {


                stackIn_16_2 = 0;
                break L5;
              } else {


                stackIn_16_2 = 1;
                break L5;
              }
            }
            L6: {


              if (stackIn_10_1 ^ stackIn_16_2 == 0) {

                stackIn_19_1 = 0;
                break L6;
              } else {

                stackIn_19_1 = 20;
                break L6;
              }
            }
            L7: {
              var22 = stackIn_10_0 + stackIn_19_1;
              var23 = var16;
              if (!param8) {
                stackIn_22_0 = -param5 + var21 >> 1603853377;
                break L7;
              } else {
                stackIn_22_0 = -var21 + (param5 - -40) >> -2076091967;
                break L7;
              }
            }
            var24 = stackIn_22_0;
            var25 = 0;
            var26 = (var17 - var16) / 20;
            var27 = param2;
            L8: while (true) {
              if (param2 + 20 <= var27) {
                var16 = var16 + var13;
                var18++;
                var17 = var17 + var15;
                var21++;
                continue L2;
              } else {
                L9: {
                  L10: {
                    L11: {
                      if ((var25 ^ -1) > (var24 ^ -1)) {
                        break L11;
                      } else {
                        if (!param0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (var25 >= var24) {
                      break L9;
                    } else {
                      if (param0) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (0 > var21) {
                    break L9;
                  } else {
                    if (var19 <= var21) {
                      break L9;
                    } else {
                      if (0 > var27) {
                        break L9;
                      } else {
                        if (var20 <= var27) {
                          break L9;
                        } else {
                          var28 = var21 + var19 * var27;
                          var29 = qn.field_d[var28];
                          var30 = dd.field_k.field_B[var22 * 80 + var18];
                          if (var29 == 0) {
                            break L9;
                          } else {
                            L12: {
                              var31 = (16772243 & var23) >> -1304464561;
                              if (255 < var31) {
                                var31 = 255;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var32 = (var29 & 16711680) >> -1382720272;
                            var34 = 255 & var29 >> 1430622952;
                            var35 = (-var31 + 255) * (16711680 & var30) >>> -1548807032;
                            var33 = var29 & 255;
                            var36 = (var30 & 255) * (-var31 + 255);
                            var35 = var35 + var31 * 65280;
                            var37 = (-var31 + 255) * (65280 & var30);
                            var37 = var37 + var31 * 65280;
                            var36 = var36 + 255 * var31;
                            var37 = var37 >> 8;
                            var36 = var36 >> 8;
                            var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 624440520;
                            qn.field_d[var28] = var29;
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                var25++;
                var23 = var23 + var26;
                var22++;
                var27++;
                continue L8;
              }
            }
          }
        }
    }

    public static void d(byte param0) {
        if (param0 != 55) {
            return;
        }
        field_f = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8) {
        int var10 = 0;
        var10 = this.a(true, param7, param8, param2) ? 1 : 0;
        if (!(var10 != 0)) {
            var10 = this.a(true, param1, param6, param4, param5, param3) ? 1 : 0;
        }
        if (param0 < 88) {
            this.e(93);
        }
        return var10 != 0;
    }

    final void g(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = this.field_n[0];
          var3 = this.field_n[1];
          this.field_c[0] = var2;
          var3 -= 3;
          this.field_c[1] = var3;
          this.f(param0 + -242);
          this.i(0);
          if (param0 == 200) {
            break L0;
          } else {
            this.field_i = 67;
            break L0;
          }
        }
        var4 = 40 + this.field_e[0];
        var5 = -20 + this.field_e[1];
        var6 = var4;
        var7 = var5;
        var8 = var2;
        var9 = var3;
        var10 = so.field_b.field_a;
        var11 = so.field_b.field_g;
        qn.f(0, 0, var10, var11);
        var12 = 0;
        L1: while (true) {
          if (var11 - -200 - -256 <= var7) {
            return;
          } else {
            L2: while (true) {
              if (var6 >= var10 - -80) {
                L3: {
                  var7 += 20;
                  if (var12 == 0) {
                    break L3;
                  } else {
                    var6 = var4 - 40;
                    var2--;
                    break L3;
                  }
                }
                L4: {
                  if (var12 == 0) {
                    var6 = var4;
                    var3++;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var9 = var3;
                  var8 = var2;
                  if (var12 != 0) {
                    stackIn_31_0 = 0;
                    break L5;
                  } else {
                    stackIn_31_0 = 1;
                    break L5;
                  }
                }
                var12 = stackIn_31_0;
                continue L1;
              } else {
                if (-5 <= var8) {
                  if (this.field_j >= var8) {
                    if (var9 >= -1) {
                      if (4 + this.field_m >= var9) {
                        L6: {
                          if (40 + var11 >= var7) {
                            stackIn_16_0 = 0;
                            break L6;
                          } else {
                            stackIn_16_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          bi.a(stackIn_16_0 != 0, var7, var6, param0 ^ 132, var8, var9);
                          if (var7 <= var11 - -120) {
                            stackIn_19_0 = 0;
                            break L7;
                          } else {
                            stackIn_19_0 = 1;
                            break L7;
                          }
                        }
                        L8: {
                          wd.a(stackIn_19_0 != 0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
                          if (var7 <= 200 + var11) {
                            stackIn_22_0 = 0;
                            break L8;
                          } else {
                            stackIn_22_0 = 1;
                            break L8;
                          }
                        }
                        mn.a(stackIn_22_0 != 0, 4 + var8, var6, (byte) 120, var9 + -4, var7 - 160);
                        var9++;
                        var8++;
                        var6 += 80;
                        continue L2;
                      } else {
                        var9++;
                        var8++;
                        var6 += 80;
                        continue L2;
                      }
                    } else {
                      var9++;
                      var8++;
                      var6 += 80;
                      continue L2;
                    }
                  } else {
                    var9++;
                    var8++;
                    var6 += 80;
                    continue L2;
                  }
                } else {
                  var9++;
                  var8++;
                  var6 += 80;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        this.field_c[1] = param2 / this.field_j;
        if (param1 != 113) {
            this.field_e = (int[]) null;
        }
        this.field_c[0] = -(this.field_c[1] * this.field_j) + param2;
        this.f(-62);
        return this.b((byte) -125, param0);
    }

    final void a(byte param0, at param1) {
        boolean discarded$0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = (vb) ((Object) param1.d((byte) -77));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if ((var3.field_x ^ -1) >= 0) {
                    var3 = (vb) ((Object) param1.b((byte) 73));
                    continue L1;
                  } else {
                    L3: {
                      if (var3 != this.field_d) {
                        stackIn_7_0 = 0;
                        break L3;
                      } else {
                        stackIn_7_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var4 = stackIn_7_0;
                      this.field_d = var3;
                      if (var4 == 0) {
                        this.field_q = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      this.field_i = -(so.field_b.field_g >> 1296231521) + var3.field_v + this.field_p[1];
                      this.field_g = this.field_p[0] + var3.field_m - (so.field_b.field_a >> 1432716833);
                      var5 = this.field_p[0] + -this.field_g;
                      var6 = -this.field_i + this.field_p[1];
                      if (-40001 < (var6 * var6 + var5 * var5 ^ -1)) {
                        if (var4 != 0) {
                          break L5;
                        } else {
                          this.field_q = false;
                          break L5;
                        }
                      } else {
                        this.field_q = true;
                        break L5;
                      }
                    }
                    if (this.field_q) {
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              L6: {
                this.field_k[0] = this.field_g;
                this.field_k[1] = this.field_i;
                if (param0 > 99) {
                  break L6;
                } else {
                  this.b(63, 30, (byte) -17);
                  break L6;
                }
              }
              discarded$0 = this.b((byte) -127, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("v.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1) {
        this.field_c[1] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.c((byte) -28);
        int var3 = 121 / ((-71 - param0) / 49);
    }

    final void a(int param0, int param1) {
        this.field_c[param0] = param1 / this.field_j;
        this.field_c[0] = param1 - this.field_j * this.field_c[1];
        this.f(param0 ^ -72);
        this.i(param0 + -1);
    }

    private final void b(int param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = -71 % ((4 - param0) / 32);
        byte[] var3 = new cn(ns.a(false, 2147483647, li.field_n), 4, this.field_j / 5, this.field_m / 5, 7, 0.5f, true).a(this.field_m, (byte) 93, this.field_j);
        this.field_o = new int[var3.length];
        for (var4 = 0; var3.length > var4; var4++) {
            this.field_o[var4] = 256 + -rn.a((int) var3[var4], 255);
        }
    }

    private final void b(boolean param0) {
        this.f(-112);
        this.field_p[0] = this.field_k[0];
        this.field_p[1] = this.field_k[1];
        this.field_g = this.field_k[0];
        this.field_i = this.field_k[1];
        this.a(param0);
        if (param0) {
            this.a(true);
        }
        this.h(-1);
    }

    v(int param0, int param1) {
        this.field_i = 0;
        this.field_g = 0;
        this.a(param1, param0, -87);
        ir.field_d = (v) (this);
    }

    private final void a(int param0, int param1, int param2) {
        this.field_l = new int[2];
        this.field_n = new int[2];
        this.field_r = new int[2];
        this.field_a = new int[2];
        this.field_p = new int[2];
        this.field_p[0] = 40 + 80 * (this.field_j >> -1320498367) + -80;
        this.field_e = new int[2];
        this.field_p[1] = 20 + 40 * (-1 + (this.field_m >> 1562891137));
        this.field_k = new int[2];
        if (param2 > -53) {
            return;
        }
        this.field_h = new int[2];
        this.field_c = new int[2];
        this.field_m = param0;
        this.field_j = param1;
        this.b(63);
        this.a(101, false, so.field_b.field_g >> 390950721, false, false, false, false, false, so.field_b.field_a >> 769477153);
        this.h(-1);
    }

    final void f(int param0) {
        int var7 = -20;
        int var9 = 20;
        int var6 = 40;
        int var2 = 40;
        int var4 = this.field_c[0];
        int var5 = this.field_c[1];
        if (param0 >= -30) {
            this.field_d = (vb) null;
        }
        int var8 = 40;
        int var3 = this.field_j * 40 >> -2123161439;
        int var11 = var5 * var9 + var4 * var7;
        int var10 = var6 * var4 - -(var8 * var5);
        var3 = var3 - -var11;
        var2 = var10 + var2;
        this.field_k[0] = var2;
        this.field_k[1] = var3;
    }

    static {
        field_f = "Environmental";
    }
}
