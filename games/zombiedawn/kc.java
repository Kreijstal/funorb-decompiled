/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends id {
    private int field_U;
    private fn field_W;
    boolean field_S;
    static int field_R;
    private int field_Z;
    private int field_X;
    int field_V;
    private int field_ab;
    private int field_T;
    static int[] field_Y;
    private boolean field_H;
    static boolean field_Q;
    private boolean field_bb;

    final void a(ej param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var12 = null;
        int[][] var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        Object stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = 12;
              stackOut_1_0 = this;
              stackOut_1_1 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = this;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = this;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((kc) (this)).field_Z = this.a(stackIn_4_2 != 0);
              this.field_X = this.f(237239984);
              var4 = this.field_Z;
              if (!param1) {
                break L2;
              } else {
                var12 = (wk) null;
                this.a((byte) -112, (wk) null);
                break L2;
              }
            }
            L3: {
              var5 = this.field_X;
              this.field_T = var3_int;
              var6 = this.field_V;
              if ((var6 ^ -1) == -3) {
                var5 = var5 - var3_int;
                this.field_X = this.field_X + 12;
                var4 = var4 + var3_int;
                break L3;
              } else {
                if (1 != var6) {
                  break L3;
                } else {
                  var5 = var5 + var3_int;
                  break L3;
                }
              }
            }
            L4: while (true) {
              if ((var3_int ^ -1) > -2) {
                if (this.field_V == 2) {
                  L5: {
                    var6 = this.field_Z / 24;
                    var7 = this.field_X / 24;
                    var16 = param0.field_A.field_h;
                    if ((var6 ^ -1) > -1) {
                      break L5;
                    } else {
                      if (-1 < (var7 ^ -1)) {
                        break L5;
                      } else {
                        if (var6 >= var16[0].length) {
                          break L5;
                        } else {
                          if (var7 < var16.length) {
                            L6: {
                              L7: {
                                var9 = var16[var7][var6] >> 485617447 & 511;
                                if ((var9 ^ -1) >= -218) {
                                  break L7;
                                } else {
                                  if (246 > var9) {
                                    stackOut_32_0 = 4;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              stackOut_31_0 = 0;
                              stackIn_33_0 = stackOut_31_0;
                              break L6;
                            }
                            var10 = stackIn_33_0;
                            this.field_T = this.field_T + var10;
                            this.field_y = this.field_y - (var10 << -1928060368);
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                L8: {
                  if (-3 != (this.field_V ^ -1)) {
                    var5 = var5 + var3_int;
                    break L8;
                  } else {
                    var4 = var4 + var3_int;
                    break L8;
                  }
                }
                if (param0.a(param1, var5, var4, false)) {
                  this.field_T = this.field_T + var3_int;
                  continue L4;
                } else {
                  L9: {
                    if ((this.field_V ^ -1) == -3) {
                      var4 = var4 - var3_int;
                      break L9;
                    } else {
                      var5 = var5 - var3_int;
                      break L9;
                    }
                  }
                  var3_int = var3_int / 2;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("kc.I(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, kd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            var3_int = 28 % ((param0 - -8) / 53);
            if (!this.field_S) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_bb) {
                  break L1;
                } else {
                  if (this.field_H) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              L2: {
                var4 = 0;
                var5 = param1.a(true);
                var6 = param1.f(237239984);
                if (2 != this.field_V) {
                  if (1 == this.field_V) {
                    L3: {
                      var7 = var6 + -this.field_X;
                      if (5 > Math.abs(-12 + var5 - this.field_Z)) {
                        if ((var7 ^ -1) < -1) {
                          if (var7 >= this.field_T) {
                            stackOut_24_0 = 0;
                            stackIn_26_0 = stackOut_24_0;
                            break L3;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_26_0 = stackOut_23_0;
                            break L3;
                          }
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_26_0 = stackOut_21_0;
                          break L3;
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_26_0 = stackOut_19_0;
                        break L3;
                      }
                    }
                    var4 = stackIn_26_0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L4: {
                    var7 = var5 - this.field_Z;
                    if (-6 < (Math.abs(-this.f(237239984) + var6) ^ -1)) {
                      if (var7 > 0) {
                        if (var7 < this.field_T) {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L4;
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_15_0 = stackOut_12_0;
                          break L4;
                        }
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_15_0 = stackOut_10_0;
                        break L4;
                      }
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_15_0 = stackOut_8_0;
                      break L4;
                    }
                  }
                  var4 = stackIn_15_0;
                  break L2;
                }
              }
              L5: {
                if (var4 == 0) {
                  break L5;
                } else {
                  if (!this.field_bb) {
                    this.field_H = true;
                    this.field_U = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_31_0 = var4;
              stackIn_32_0 = stackOut_31_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("kc.J(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_32_0 != 0;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        qg.field_f = param2;
        ej.field_s = param3;
        qi.field_E = param1;
        if (param0 == 50) {
            return;
        }
        field_Q = true;
    }

    public static void c(boolean param0) {
        field_Y = null;
        if (param0) {
            return;
        }
        field_R = 39;
    }

    final void g(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        super.g(126);
        if (this.field_S) {
          if (!this.field_bb) {
            if (this.field_H) {
              fieldTemp$2 = this.field_U + 1;
              this.field_U = this.field_U + 1;
              if (fieldTemp$2 >= this.field_ab) {
                L0: {
                  this.field_U = 0;
                  stackOut_35_0 = this;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (this.field_H) {
                    stackOut_37_0 = this;
                    stackOut_37_1 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L0;
                  } else {
                    stackOut_36_0 = this;
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L0;
                  }
                }
                L1: {
                  ((kc) (this)).field_H = stackIn_38_1 != 0;
                  if (this.field_H) {
                    this.field_W = jp.a((byte) 127, 96);
                    var2 = 30;
                    this.field_W.f(-(var2 / 2) + so.c(var2) + 256);
                    this.field_W.h(ge.field_c / 2);
                    break L1;
                  } else {
                    if (this.field_W == null) {
                      break L1;
                    } else {
                      this.field_W.e(0);
                      this.field_W.i(-1);
                      this.field_W.h(0);
                      this.field_W = null;
                      if (param0 <= 95) {
                        this.field_H = true;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param0 <= 95) {
                  this.field_H = true;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 <= 95) {
                  this.field_H = true;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 <= 95) {
                this.field_H = true;
                return;
              } else {
                return;
              }
            }
          } else {
            fieldTemp$3 = this.field_U + 1;
            this.field_U = this.field_U + 1;
            if (fieldTemp$3 >= this.field_ab) {
              L2: {
                this.field_U = 0;
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (this.field_H) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              }
              ((kc) (this)).field_H = stackIn_11_1 != 0;
              if (this.field_H) {
                this.field_W = jp.a((byte) 127, 96);
                var2 = 30;
                this.field_W.f(-(var2 / 2) + so.c(var2) + 256);
                this.field_W.h(ge.field_c / 2);
                if (param0 > 95) {
                  return;
                } else {
                  this.field_H = true;
                  return;
                }
              } else {
                if (this.field_W != null) {
                  this.field_W.e(0);
                  this.field_W.i(-1);
                  this.field_W.h(0);
                  this.field_W = null;
                  if (param0 > 95) {
                    return;
                  } else {
                    this.field_H = true;
                    return;
                  }
                } else {
                  if (param0 <= 95) {
                    this.field_H = true;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 > 95) {
                return;
              } else {
                this.field_H = true;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    kc(int param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6) {
        super(param0, param1, param2);
        this.field_S = true;
        this.field_H = false;
        this.field_S = true;
        this.field_V = param5;
        if ((param6 ^ -1) == 0) {
            this.field_bb = false;
            this.field_ab = 400;
            if (!param3) {
                return;
            }
            if (this.field_V == 0) {
                this.field_V = 2;
                return;
            }
            if (-3 == (this.field_V ^ -1)) {
                this.field_V = 0;
            }
            return;
        }
        this.field_bb = true;
        this.field_ab = 250;
        this.field_U = param6 * this.field_ab / 2;
        if (this.field_U > this.field_ab) {
            this.field_H = !this.field_H ? true : false;
            this.field_U = this.field_U % this.field_ab;
        }
        if (!param3) {
            return;
        }
        if (this.field_V == 0) {
            this.field_V = 2;
            return;
        }
        if (-3 == (this.field_V ^ -1)) {
            this.field_V = 0;
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) -92, param1);
              if (3 <= (397 * this.field_U + 197 * (this.field_y >> 1934150928) + (this.field_x >> 684441840) * 493) % 63) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (param0 <= -76) {
              L2: {
                if (var3_int != 0) {
                  stackOut_7_0 = 6336736;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 3182768;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_8_0;
                if (var3_int == 0) {
                  stackOut_10_0 = 10543359;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 7393279;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              L4: {
                var5 = stackIn_11_0;
                var6 = param1.a(this.a(true), (byte) -71);
                var7 = param1.a(this.f(237239984), 0);
                if (null == this.field_W) {
                  break L4;
                } else {
                  this.field_W.h(pj.a(var7, 106, var6) >> -1345565663);
                  break L4;
                }
              }
              L5: {
                var9 = this.field_V;
                if (var9 == 0) {
                  var6 = var6 - this.field_T;
                  break L5;
                } else {
                  if ((var9 ^ -1) == -3) {
                    break L5;
                  } else {
                    if ((var9 ^ -1) == -2) {
                      var6 += 11;
                      var7 -= 6;
                      if (!this.field_H) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        bi.e(-1 + var6, var7, 6 + this.field_T, var4);
                        bi.e(var6, var7, this.field_T - -6, var5);
                        bi.e(1 + var6, var7, this.field_T + 6, var4);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              L6: {
                var8 = 18;
                var7 -= 12;
                var6 = var6 + var8;
                if (!this.field_H) {
                  break L6;
                } else {
                  bi.b(var6, var7 + -1, this.field_T + -var8, var4);
                  bi.b(var6, var7, -var8 + this.field_T, var5);
                  bi.b(var6, 1 + var7, this.field_T + -var8, var4);
                  break L6;
                }
              }
              var7 -= 12;
              tm.field_h[this.field_F - -1].b(this.field_T + var6 + (-var8 - 24), var7);
              return;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("kc.B(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_R = 0;
        field_Y = new int[]{20, 7};
        field_Q = false;
    }
}
