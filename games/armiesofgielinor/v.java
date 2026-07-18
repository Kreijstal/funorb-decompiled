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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          this.a(-100, ((v) this).field_k);
          var3 = ((v) this).field_k[0];
          var4 = ((v) this).field_k[1];
          var5 = -((v) this).field_p[0] + var3;
          var6 = -((v) this).field_p[1] + var4;
          var7 = 16;
          if (param1 <= -1) {
            break L0;
          } else {
            var7 = param1;
            break L0;
          }
        }
        L1: {
          var8 = 2;
          ((v) this).field_l[0] = this.a(((v) this).field_l[0], 6198, var5, var8, var7);
          ((v) this).field_l[1] = this.a(((v) this).field_l[1], 6198, var6, var8, var7);
          if (param0 < -118) {
            break L1;
          } else {
            ((v) this).f(-83);
            break L1;
          }
        }
        L2: {
          L3: {
            ((v) this).field_p[1] = ((v) this).field_p[1] + ((v) this).field_l[1];
            ((v) this).field_p[0] = ((v) this).field_p[0] + ((v) this).field_l[0];
            this.a(-78, ((v) this).field_p);
            this.a(false);
            int discarded$2 = -1;
            this.h();
            if (0 != ((v) this).field_l[0]) {
              break L3;
            } else {
              if (0 != ((v) this).field_l[1]) {
                break L3;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L2;
        }
        return stackIn_8_0 != 0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param0;
        if (param2 == 0) {
          return 0;
        } else {
          if (param0 == param2) {
            return param0;
          } else {
            L0: {
              if (param2 < 0) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            }
            L1: {
              var8 = stackIn_9_0;
              param2 = param2 * var8;
              if (param0 == 0) {
                var7 = var8;
                break L1;
              } else {
                L2: {
                  if (0 > param0) {
                    stackOut_12_0 = -1;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                var7 = stackIn_13_0;
                param0 = var7 * param0;
                break L1;
              }
            }
            if (param2 < param0) {
              return var8 * param2;
            } else {
              L3: {
                if (var7 == var8) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_21_0;
                if (param4 > param0) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L4;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_24_0;
                var11 = this.a((byte) -70, param0, param2) ? 1 : 0;
                if (param4 - param0 >= 2) {
                  if (Math.abs(param2) > 2 + param0) {
                    stackOut_28_0 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    break L5;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_30_0 = stackOut_27_0;
                    break L5;
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_30_0 = stackOut_25_0;
                  break L5;
                }
              }
              L6: {
                var12 = stackIn_30_0;
                if (param4 <= param0) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var13 = stackIn_33_0;
                if (var9 != 0) {
                  var6 = param0 >> 3;
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
                          var6 = param0 - -2;
                          break L7;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  var6 = param0 * 7 >> 3;
                  break L7;
                }
              }
              var6 = var6 * var7;
              return var6;
            }
          }
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            if (param2 < 0) {
              break L0;
            } else {
              if (0 <= param3) {
                L1: {
                  ((v) this).field_p[0] = ((v) this).field_p[0] - (param2 + -((v) this).field_a[0]);
                  ((v) this).field_p[1] = ((v) this).field_p[1] - (-((v) this).field_a[1] + param3);
                  ((v) this).field_a[0] = param2;
                  ((v) this).field_a[1] = param3;
                  this.a(-85, ((v) this).field_p);
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (param0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_8_1 != 0);
                  int discarded$2 = -1;
                  this.h();
                  if (param0) {
                    break L2;
                  } else {
                    ((v) this).a((byte) 70, 24);
                    break L2;
                  }
                }
                return true;
              } else {
                break L0;
              }
            }
          }
        }
        ((v) this).field_a[0] = param2;
        ((v) this).field_a[1] = param3;
        return false;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = param1;
        int var5 = 0;
        while (var4 > 0) {
            var5 = var5 + var4;
            var4 = 7 * var4 >> 3;
        }
        if (param2 - var5 <= 0) {
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, byte param2) {
        ((v) this).field_p[1] = param1;
        ((v) this).field_p[0] = param0;
        this.a(-93, ((v) this).field_p);
        this.a(false);
        if (param2 <= 54) {
            ((v) this).field_m = -31;
        }
        int discarded$0 = -1;
        this.h();
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            var4 = 0;
            if (-1 >= param2) {
              break L1;
            } else {
              if (param2 >= ((v) this).field_j) {
                break L1;
              } else {
                if (param0 <= -1) {
                  break L1;
                } else {
                  if (((v) this).field_j <= param0) {
                    break L1;
                  } else {
                    var4 = var4 + ((v) this).field_o[param2 + param0 * ((v) this).field_j];
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
              if (((v) this).field_j <= param2 - -1) {
                break L3;
              } else {
                if (param0 <= -1) {
                  break L3;
                } else {
                  if (param0 < ((v) this).field_j) {
                    var4 = var4 + ((v) this).field_o[((v) this).field_j * param0 + 1 + param2];
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
              if (((v) this).field_j <= 1 + param2) {
                break L5;
              } else {
                if (param0 - -1 <= -1) {
                  break L5;
                } else {
                  if (param0 - -1 >= ((v) this).field_j) {
                    break L5;
                  } else {
                    var4 = var4 + ((v) this).field_o[(1 + param0) * ((v) this).field_j + (param2 - -1)];
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
          L7: {
            if (param2 <= -1) {
              break L7;
            } else {
              if (param2 >= ((v) this).field_j) {
                break L7;
              } else {
                if (-1 >= param0 - -1) {
                  break L7;
                } else {
                  if (((v) this).field_j > 1 + param0) {
                    var4 = var4 + ((v) this).field_o[((v) this).field_j * (1 + param0) + param2];
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
          }
          var4 += 255;
          break L6;
        }
        return var4 >> 2;
    }

    final void c(int param0) {
        ((v) this).f(-41);
        ((v) this).field_e[0] = -((v) this).field_p[0] + (((v) this).field_k[0] + (so.field_b.field_a >> 1));
        if (param0 != 9470337) {
            ((v) this).field_q = false;
        }
        ((v) this).field_e[1] = -((v) this).field_p[1] + (((v) this).field_k[1] + (so.field_b.field_g >> 1) - 20);
    }

    final void j(int param0) {
        if (param0 > -117) {
            return;
        }
        this.a(false);
        int discarded$0 = -1;
        this.h();
    }

    private final void c() {
        ((v) this).f(-115);
        ((v) this).field_g = ((v) this).field_k[0];
        ((v) this).field_i = ((v) this).field_k[1];
        this.a(false);
        int discarded$0 = -1;
        this.h();
    }

    private final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 40 * ((v) this).field_j >> 1;
              if (param0 < -76) {
                break L1;
              } else {
                ((v) this).field_d = null;
                break L1;
              }
            }
            L2: {
              var4 = param1[0] - (var3_int << 1) >> 1;
              var5 = param1[1] - var3_int;
              if (Math.abs(var4) - -Math.abs(var5) <= var3_int) {
                break L2;
              } else {
                L3: {
                  var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> 1;
                  if (0 >= var4) {
                    param1[0] = param1[0] + (var6 << 1);
                    break L3;
                  } else {
                    param1[0] = param1[0] - (var6 << 1);
                    break L3;
                  }
                }
                if (var5 > 0) {
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
              var4 = -(var3_int << 1) + param1[0] >> 1;
              var3_int -= 100;
              if (var3_int < var4) {
                param1[0] = param1[0] - (-var3_int + var4 << 1);
                break L4;
              } else {
                if (var4 >= -var3_int) {
                  break L4;
                } else {
                  param1[0] = param1[0] - (var3_int + var4 << 1);
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("v.NA(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final void b(int param0, int param1) {
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
        int var14 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == 1745035905) {
          var3 = ((v) this).field_n[0];
          var4 = ((v) this).field_n[1];
          var4 -= 3;
          ((v) this).field_c[0] = var3;
          ((v) this).field_c[1] = var4;
          ((v) this).f(param1 ^ -1745035990);
          ((v) this).i(0);
          var5 = ((v) this).field_e[0] - -40;
          var6 = ((v) this).field_e[1] - 20;
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
                      int discarded$1 = -12608;
                      this.a();
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
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L5;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L5;
                    }
                  }
                  var13 = stackIn_24_0;
                  var9 = var3;
                  var10 = var4;
                  continue L0;
                } else {
                  if (var9 >= -1) {
                    if (var9 <= ((v) this).field_j) {
                      if (var10 >= -1) {
                        if (((v) this).field_m >= var10) {
                          L6: {
                            stackOut_13_0 = var10;
                            stackOut_13_1 = var9;
                            stackOut_13_2 = param0;
                            stackOut_13_3 = var8;
                            stackOut_13_4 = 99;
                            stackOut_13_5 = var7;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            if (var8 <= var12 + 40) {
                              stackOut_15_0 = stackIn_15_0;
                              stackOut_15_1 = stackIn_15_1;
                              stackOut_15_2 = stackIn_15_2;
                              stackOut_15_3 = stackIn_15_3;
                              stackOut_15_4 = stackIn_15_4;
                              stackOut_15_5 = stackIn_15_5;
                              stackOut_15_6 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              stackIn_16_1 = stackOut_15_1;
                              stackIn_16_2 = stackOut_15_2;
                              stackIn_16_3 = stackOut_15_3;
                              stackIn_16_4 = stackOut_15_4;
                              stackIn_16_5 = stackOut_15_5;
                              stackIn_16_6 = stackOut_15_6;
                              break L6;
                            } else {
                              stackOut_14_0 = stackIn_14_0;
                              stackOut_14_1 = stackIn_14_1;
                              stackOut_14_2 = stackIn_14_2;
                              stackOut_14_3 = stackIn_14_3;
                              stackOut_14_4 = stackIn_14_4;
                              stackOut_14_5 = stackIn_14_5;
                              stackOut_14_6 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_16_2 = stackOut_14_2;
                              stackIn_16_3 = stackOut_14_3;
                              stackIn_16_4 = stackOut_14_4;
                              stackIn_16_5 = stackOut_14_5;
                              stackIn_16_6 = stackOut_14_6;
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
        if (param0 < 88) {
            boolean discarded$0 = this.a(false, true, 4, 95);
        }
        int var3 = ((v) this).field_e[1];
        int var2 = ((v) this).field_e[0];
        var3 = var3 - (so.field_b.field_g >> 1);
        var2 = var2 - (so.field_b.field_a >> 1);
        int var4 = var2 - -((v) this).field_p[0];
        int var5 = var3 + ((v) this).field_p[1];
        ((v) this).field_k[1] = var5;
        ((v) this).field_k[0] = var4;
    }

    final void b(int param0, int param1, byte param2) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((v) this).field_e[0] = 0;
        ((v) this).field_e[1] = 0;
        ((v) this).c(false);
        ((v) this).field_c[1] = ((v) this).field_c[1] - 2;
        var4 = ((v) this).field_c[0];
        var5 = ((v) this).field_c[1];
        ((v) this).f(-63);
        ((v) this).i(0);
        ((v) this).f(-113);
        ((v) this).i(0);
        var6 = ((v) this).field_e[0];
        var7 = ((v) this).field_e[1];
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
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L3;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
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
                        if (var8 >= ((v) this).field_j + 1) {
                          break L4;
                        } else {
                          if (var9 <= -1) {
                            break L4;
                          } else {
                            if (var9 >= 1 + ((v) this).field_m) {
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
                              if (var19 >= 256) {
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
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
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
        ((v) this).field_c[1] = ((v) this).field_b / ((v) this).field_j;
        ((v) this).field_c[0] = -(((v) this).field_c[1] * ((v) this).field_j) + ((v) this).field_b;
        if (param0 != 36) {
            return;
        }
    }

    private final void h() {
        ((v) this).field_e[1] = 0;
        ((v) this).field_e[0] = 0;
        ((v) this).c(false);
        ((v) this).field_n[0] = ((v) this).field_c[0];
        ((v) this).field_n[1] = ((v) this).field_c[1];
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = ArmiesOfGielinor.field_M ? 1 : 0;
          var11 = 255;
          var12 = 255;
          var13 = 255;
          var14 = 255;
          if (param1 <= -1) {
            break L0;
          } else {
            if (param5 <= -1) {
              break L0;
            } else {
              if (param1 >= ((v) this).field_j) {
                break L0;
              } else {
                if (param5 < ((v) this).field_m) {
                  if (param3) {
                    var12 = ((v) this).field_o[((v) this).field_j * param5 + param1];
                    break L0;
                  } else {
                    var11 = ((v) this).field_o[param5 * ((v) this).field_j + param1];
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
          if (param0 <= -1) {
            break L1;
          } else {
            if (param2 <= -1) {
              break L1;
            } else {
              if (param0 >= ((v) this).field_j) {
                break L1;
              } else {
                if (param2 >= ((v) this).field_m) {
                  break L1;
                } else {
                  if (param3) {
                    var13 = ((v) this).field_o[((v) this).field_j * param2 + param0];
                    break L1;
                  } else {
                    var14 = ((v) this).field_o[param0 + param2 * ((v) this).field_j];
                    break L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (!param3) {
            var13 = this.b(param2, -4510, param0);
            var12 = this.b(-1 + param5, -4510, param1 - 1);
            break L2;
          } else {
            var14 = this.b(param2 - 1, -4510, -1 + param0);
            var11 = this.b(param5, -4510, param1);
            break L2;
          }
        }
        this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
    }

    private final void a(boolean param0) {
        ((v) this).field_e[1] = so.field_b.field_g >> 1;
        ((v) this).field_e[0] = so.field_b.field_a >> 1;
        ((v) this).c(param0);
        ((v) this).field_r[1] = ((v) this).field_c[1];
        ((v) this).field_r[0] = ((v) this).field_c[0];
    }

    private final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        L2: {
          var8 = 16;
          if (!param5) {
            if (!param2) {
              if (((v) this).field_l[1] < 0) {
                ((v) this).field_l[1] = ((v) this).field_l[1] + 1;
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            if (((v) this).field_l[1] > -var8) {
              ((v) this).field_l[1] = ((v) this).field_l[1] - 1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param1) {
            if (((v) this).field_l[1] >= var8) {
              break L3;
            } else {
              ((v) this).field_l[1] = ((v) this).field_l[1] + 1;
              break L3;
            }
          } else {
            if (!param2) {
              if (((v) this).field_l[1] <= 0) {
                break L3;
              } else {
                ((v) this).field_l[1] = ((v) this).field_l[1] - 1;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (param4) {
            if (-var8 < ((v) this).field_l[0]) {
              ((v) this).field_l[0] = ((v) this).field_l[0] - 1;
              break L4;
            } else {
              break L4;
            }
          } else {
            if (param2) {
              break L4;
            } else {
              if (((v) this).field_l[0] < 0) {
                ((v) this).field_l[0] = ((v) this).field_l[0] + 1;
                break L4;
              } else {
                break L4;
              }
            }
          }
        }
        L5: {
          if (param3) {
            if (((v) this).field_l[0] < var8) {
              ((v) this).field_l[0] = ((v) this).field_l[0] + 1;
              break L5;
            } else {
              break L5;
            }
          } else {
            if (!param2) {
              if (0 < ((v) this).field_l[0]) {
                ((v) this).field_l[0] = ((v) this).field_l[0] - 1;
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
          ((v) this).field_p[1] = ((v) this).field_p[1] + ((v) this).field_l[1];
          ((v) this).field_p[0] = ((v) this).field_p[0] + (((v) this).field_l[0] << 1);
          this.a(-81, ((v) this).field_p);
          this.a(false);
          int discarded$1 = -1;
          this.h();
          break L6;
        }
        return var7 != 0;
    }

    private final void d(int param0) {
        int var2 = -40 + ((v) this).field_k[0] >> 1;
        int var3 = ((v) this).field_k[1] - (((v) this).field_m * 40 >> 1);
        int var5 = var3 + var2;
        int var4 = var2 + -var3;
        if (var4 < 0) {
            var4 -= 40;
        }
        if (!(var5 >= 0)) {
            var5 -= 40;
        }
        ((v) this).field_c[0] = var4 / 40;
        ((v) this).field_c[1] = var5 / 40;
    }

    final void a(int param0, boolean param1) {
        ((v) this).field_c[1] = param0 / ((v) this).field_j;
        ((v) this).field_c[0] = param0 + -(((v) this).field_j * ((v) this).field_c[1]);
        if (!param1) {
            ((v) this).field_l = null;
        }
        this.b(!param1 ? true : false);
    }

    final void c(boolean param0) {
        if (param0) {
            ((v) this).a(-4, 46);
        }
        this.e(105);
        this.d(1);
    }

    private final void a() {
        int var2 = 0;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var21 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((v) this).field_e[0] = 0;
          ((v) this).field_e[1] = 0;
          ((v) this).c(false);
          ((v) this).field_c[1] = ((v) this).field_c[1] - 2;
          var2 = ((v) this).field_c[0];
          var3 = ((v) this).field_c[1];
          ((v) this).f(-47);
          ((v) this).i(0);
          ((v) this).f(-85);
          ((v) this).i(0);
          var4 = ((v) this).field_e[0];
          var5 = ((v) this).field_e[1];
          var11 = var2 + -1;
          var12 = var3;
          var13 = var3;
          var10 = var2;
          var14 = 0;
          if (0 != (var3 + var2) % 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
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
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L4;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
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
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L6;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
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
        int var2 = ((v) this).field_k[0];
        int var3 = ((v) this).field_k[1];
        int var4 = 0;
        int var5 = 0;
        int var6 = so.a(327680, -129);
        var4 = var4 + ev.b(-48, var2 << 14, var6);
        var5 = var5 + ev.b(-70, var2 << 14, var6);
        var4 = var4 - ev.b(-94, var2 << 15, var6);
        var5 = var5 + ev.b(-51, var3 << 15, var6);
        ((v) this).field_h[0] = var4;
        ((v) this).field_h[1] = var5;
        int var7 = -48 % ((19 - param0) / 36);
    }

    final void i(int param0) {
        int var3 = ((v) this).field_k[1];
        int var2 = ((v) this).field_k[0];
        int var5 = var3 + -((v) this).field_p[1];
        int var4 = var2 - ((v) this).field_p[param0];
        var4 = var4 + (so.field_b.field_a >> 1);
        var5 = (so.field_b.field_g >> 1) + var5;
        ((v) this).field_e[1] = var5;
        ((v) this).field_e[0] = var4;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
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
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        L0: {
          var39 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param11) {
            break L0;
          } else {
            if (0 > param1) {
              break L0;
            } else {
              if (((v) this).field_m - 1 < param13) {
                break L0;
              } else {
                if (param8 > -1 + ((v) this).field_j) {
                  break L0;
                } else {
                  if (0 > param13) {
                    this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
                    return;
                  } else {
                    if (0 > param8) {
                      this.a(true, param4, param10, -66, param5, param6, param2, param7, param3, param9, param12);
                      return;
                    } else {
                      if (param1 > -1 + ((v) this).field_m) {
                        this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
                        return;
                      } else {
                        if (-1 + ((v) this).field_j < param11) {
                          this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
                          return;
                        } else {
                          L1: {
                            var15 = param2 << 16;
                            var16 = (-var15 + (param12 << 16)) / 40;
                            var17 = param7 << 16;
                            var18 = ((param4 << 16) + -var17) / 40;
                            var19 = var15;
                            var20 = var17;
                            stackOut_18_0 = 0;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (param9 ^ param5) {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              break L1;
                            } else {
                              stackOut_19_0 = stackIn_19_0;
                              stackOut_19_1 = 40;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L1;
                            }
                          }
                          var21 = stackIn_21_0 - -stackIn_21_1;
                          var22 = so.field_b.field_a;
                          var23 = so.field_b.field_g;
                          var24 = param6;
                          L2: while (true) {
                            if (var24 >= param6 + 40) {
                              return;
                            } else {
                              L3: {
                                stackOut_23_0 = 0;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_24_0 = stackOut_23_0;
                                if (param3 == param5) {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = 0;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  break L3;
                                } else {
                                  stackOut_24_0 = stackIn_24_0;
                                  stackOut_24_1 = 1;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  break L3;
                                }
                              }
                              L4: {
                                stackOut_26_0 = stackIn_26_0;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (stackIn_26_1 != 0 ^ param9) {
                                  stackOut_28_0 = stackIn_28_0;
                                  stackOut_28_1 = 20;
                                  stackIn_29_0 = stackOut_28_0;
                                  stackIn_29_1 = stackOut_28_1;
                                  break L4;
                                } else {
                                  stackOut_27_0 = stackIn_27_0;
                                  stackOut_27_1 = 0;
                                  stackIn_29_0 = stackOut_27_0;
                                  stackIn_29_1 = stackOut_27_1;
                                  break L4;
                                }
                              }
                              var25 = stackIn_29_0 - -stackIn_29_1;
                              var26 = var19;
                              var27 = (-var19 + var20) / 20;
                              var28 = param10;
                              L5: while (true) {
                                if (param10 - -20 <= var28) {
                                  var20 = var20 + var18;
                                  var21++;
                                  var19 = var19 + var16;
                                  var24++;
                                  continue L2;
                                } else {
                                  L6: {
                                    if (0 > var24) {
                                      break L6;
                                    } else {
                                      if (var24 >= var22) {
                                        break L6;
                                      } else {
                                        if (var28 < 0) {
                                          break L6;
                                        } else {
                                          if (var23 <= var28) {
                                            break L6;
                                          } else {
                                            var29 = var24 + var22 * var28;
                                            var30 = qn.field_d[var29];
                                            var31 = dd.field_k.field_B[var21 - -(var25 * 80)];
                                            if (var30 != 0) {
                                              L7: {
                                                var32 = (16745529 & var26) >> 15;
                                                if (var32 > 255) {
                                                  var32 = 255;
                                                  break L7;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                              var36 = (16711680 & var31) * (-var32 + 255) >>> 8;
                                              var33 = 255 & var30 >> 16;
                                              var35 = (var30 & 65280) >> 8;
                                              var34 = var30 & 255;
                                              var37 = (var31 & 255) * (-var32 + 255);
                                              var36 = var36 + var32 * 65280;
                                              var38 = (65280 & var31) * (-var32 + 255);
                                              var38 = var38 + 65280 * var32;
                                              var37 = var37 + 255 * var32;
                                              var37 = var37 >> 8;
                                              var38 = var38 >> 8;
                                              var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> 8;
                                              qn.field_d[var29] = var30;
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var26 = var26 + var27;
                                  var25++;
                                  var28++;
                                  continue L5;
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
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_8_1 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_10_1 = false;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_13_1 = false;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_14_1 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_15_1 = false;
        int stackIn_16_0 = 0;
        boolean stackIn_16_1 = false;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_7_1 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_9_1 = false;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_8_1 = false;
        int stackOut_8_2 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_10_1 = false;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_12_1 = false;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_11_1 = false;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_13_1 = false;
        int stackOut_15_0 = 0;
        boolean stackOut_15_1 = false;
        int stackOut_15_2 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_14_1 = false;
        int stackOut_14_2 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var38 = ArmiesOfGielinor.field_M ? 1 : 0;
          var12 = param6 << 16;
          var13 = (-var12 + (param10 << 16)) / 40;
          var14 = param7 << 16;
          var15 = (-var14 + (param1 << 16)) / 40;
          var16 = var12;
          var17 = var14;
          stackOut_0_0 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param4 ^ param9) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 40;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
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
            ((v) this).field_g = -88;
            break L1;
          }
        }
        var21 = param5;
        L2: while (true) {
          if (40 + param5 <= var21) {
            return;
          } else {
            L3: {
              stackOut_7_0 = 0;
              stackOut_7_1 = param9;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (param4) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L3;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L3;
              }
            }
            L4: {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = stackIn_10_2;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              if (param8) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                break L4;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                break L4;
              }
            }
            L5: {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = stackIn_13_1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (stackIn_13_2 == stackIn_13_3) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L5;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L5;
              }
            }
            L6: {
              stackOut_16_0 = stackIn_16_0;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (stackIn_16_1 ^ stackIn_16_2 == 0) {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 20;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            L7: {
              var22 = stackIn_19_0 + stackIn_19_1;
              var23 = var16;
              if (!param8) {
                stackOut_21_0 = -param5 + var21 >> 1;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_20_0 = -var21 + (param5 - -40) >> 1;
                stackIn_22_0 = stackOut_20_0;
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
                      if (var25 < var24) {
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
                              var31 = (16772243 & var23) >> 15;
                              if (255 < var31) {
                                var31 = 255;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var32 = (var29 & 16711680) >> 16;
                            var34 = 255 & var29 >> 8;
                            var35 = (-var31 + 255) * (16711680 & var30) >>> 8;
                            var33 = var29 & 255;
                            var36 = (var30 & 255) * (-var31 + 255);
                            var35 = var35 + var31 * 65280;
                            var37 = (-var31 + 255) * (65280 & var30);
                            var37 = var37 + var31 * 65280;
                            var36 = var36 + 255 * var31;
                            var37 = var37 >> 8;
                            var36 = var36 >> 8;
                            var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 8;
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

    public static void d() {
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
        int var2 = 0;
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
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = ((v) this).field_n[0];
          var3 = ((v) this).field_n[1];
          ((v) this).field_c[0] = var2;
          var3 -= 3;
          ((v) this).field_c[1] = var3;
          ((v) this).f(param0 + -242);
          ((v) this).i(0);
          if (param0 == 200) {
            break L0;
          } else {
            ((v) this).field_i = 67;
            break L0;
          }
        }
        var4 = 40 + ((v) this).field_e[0];
        var5 = -20 + ((v) this).field_e[1];
        var6 = var4;
        var7 = var5;
        var8 = var2;
        var9 = var3;
        var10 = so.field_b.field_a;
        var11 = so.field_b.field_g;
        qn.f(0, 0, var10, var11);
        var12 = 0;
        L1: while (true) {
          if (var11 + 456 <= var7) {
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
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L5;
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    break L5;
                  }
                }
                var12 = stackIn_31_0;
                continue L1;
              } else {
                if (-5 <= var8) {
                  if (((v) this).field_j >= var8) {
                    if (var9 >= -1) {
                      if (4 + ((v) this).field_m >= var9) {
                        L6: {
                          if (40 + var11 >= var7) {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            break L6;
                          } else {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            break L6;
                          }
                        }
                        L7: {
                          bi.a(stackIn_16_0 != 0, var7, var6, param0 ^ 132, var8, var9);
                          if (var7 <= var11 - -120) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L7;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L7;
                          }
                        }
                        L8: {
                          wd.a(stackIn_19_0 != 0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
                          if (var7 <= 200 + var11) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L8;
                          } else {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
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
        ((v) this).field_c[1] = param2 / ((v) this).field_j;
        if (param1 != 113) {
            ((v) this).field_e = null;
        }
        ((v) this).field_c[0] = -(((v) this).field_c[1] * ((v) this).field_j) + param2;
        ((v) this).f(-62);
        return this.b((byte) -125, param0);
    }

    final void a(byte param0, at param1) {
        RuntimeException var3 = null;
        vb var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_ref = (vb) (Object) param1.d((byte) -77);
            L1: while (true) {
              L2: {
                if (var3_ref == null) {
                  break L2;
                } else {
                  if (var3_ref.field_x <= -1) {
                    var3_ref = (vb) (Object) param1.b((byte) 73);
                    continue L1;
                  } else {
                    L3: {
                      if (var3_ref != ((v) this).field_d) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        break L3;
                      }
                    }
                    L4: {
                      var4 = stackIn_7_0;
                      ((v) this).field_d = var3_ref;
                      if (var4 == 0) {
                        ((v) this).field_q = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      ((v) this).field_i = -(so.field_b.field_g >> 1) + var3_ref.field_v + ((v) this).field_p[1];
                      ((v) this).field_g = ((v) this).field_p[0] + var3_ref.field_m - (so.field_b.field_a >> 1);
                      var5 = ((v) this).field_p[0] + -((v) this).field_g;
                      var6 = -((v) this).field_i + ((v) this).field_p[1];
                      if (var6 * var6 + var5 * var5 < 40000) {
                        if (var4 != 0) {
                          break L5;
                        } else {
                          ((v) this).field_q = false;
                          break L5;
                        }
                      } else {
                        ((v) this).field_q = true;
                        break L5;
                      }
                    }
                    if (((v) this).field_q) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L6: {
                ((v) this).field_k[0] = ((v) this).field_g;
                ((v) this).field_k[1] = ((v) this).field_i;
                if (param0 > 99) {
                  break L6;
                } else {
                  ((v) this).b(63, 30, (byte) -17);
                  break L6;
                }
              }
              boolean discarded$1 = this.b((byte) -127, -1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("v.F(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        ((v) this).field_c[1] = param1 / ((v) this).field_j;
        ((v) this).field_c[0] = param1 - ((v) this).field_j * ((v) this).field_c[1];
        int discarded$0 = -28;
        this.c();
        int var3 = 121 / ((-71 - param0) / 49);
    }

    final void a(int param0, int param1) {
        ((v) this).field_c[param0] = param1 / ((v) this).field_j;
        ((v) this).field_c[0] = param1 - ((v) this).field_j * ((v) this).field_c[1];
        ((v) this).f(param0 ^ -72);
        ((v) this).i(param0 + -1);
    }

    private final void b() {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        byte[] var3 = new cn(ns.a(false, 2147483647, li.field_n), 4, ((v) this).field_j / 5, ((v) this).field_m / 5, 7, 0.5f, true).a(((v) this).field_m, (byte) 93, ((v) this).field_j);
        ((v) this).field_o = new int[var3.length];
        for (var4 = 0; var3.length > var4; var4++) {
            ((v) this).field_o[var4] = 256 + -rn.a((int) var3[var4], 255);
        }
    }

    private final void b(boolean param0) {
        ((v) this).f(-112);
        ((v) this).field_p[0] = ((v) this).field_k[0];
        ((v) this).field_p[1] = ((v) this).field_k[1];
        ((v) this).field_g = ((v) this).field_k[0];
        ((v) this).field_i = ((v) this).field_k[1];
        this.a(param0);
        if (param0) {
            this.a(true);
        }
        int discarded$0 = -1;
        this.h();
    }

    v(int param0, int param1) {
        ((v) this).field_i = 0;
        ((v) this).field_g = 0;
        this.a(param1, param0, -87);
        ir.field_d = (v) this;
    }

    private final void a(int param0, int param1, int param2) {
        ((v) this).field_l = new int[2];
        ((v) this).field_n = new int[2];
        ((v) this).field_r = new int[2];
        ((v) this).field_a = new int[2];
        ((v) this).field_p = new int[2];
        ((v) this).field_p[0] = 40 + 80 * (((v) this).field_j >> 1) + -80;
        ((v) this).field_e = new int[2];
        ((v) this).field_p[1] = 20 + 40 * (-1 + (((v) this).field_m >> 1));
        ((v) this).field_k = new int[2];
        ((v) this).field_h = new int[2];
        ((v) this).field_c = new int[2];
        ((v) this).field_m = param0;
        ((v) this).field_j = param1;
        int discarded$0 = 63;
        this.b();
        boolean discarded$1 = ((v) this).a(101, false, so.field_b.field_g >> 1, false, false, false, false, false, so.field_b.field_a >> 1);
        int discarded$2 = -1;
        this.h();
    }

    final void f(int param0) {
        int var7 = -20;
        int var9 = 20;
        int var6 = 40;
        int var2 = 40;
        int var4 = ((v) this).field_c[0];
        int var5 = ((v) this).field_c[1];
        if (param0 >= -30) {
            ((v) this).field_d = null;
        }
        int var8 = 40;
        int var3 = ((v) this).field_j * 40 >> 1;
        int var11 = var5 * var9 + var4 * var7;
        int var10 = var6 * var4 - -(var8 * var5);
        var3 = var3 - -var11;
        var2 = var10 + var2;
        ((v) this).field_k[0] = var2;
        ((v) this).field_k[1] = var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Environmental";
    }
}
