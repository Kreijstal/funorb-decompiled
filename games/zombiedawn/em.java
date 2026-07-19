/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends eh implements hh {
    int field_W;
    private int field_R;
    static sn field_J;
    private boolean field_Q;
    private int field_M;
    private an field_S;
    private ij field_F;
    private an field_C;
    private an field_N;
    private boolean field_X;
    int field_D;
    private an field_L;
    static boolean field_H;
    private int field_V;
    private int field_G;
    private int field_O;
    int field_E;
    static int field_U;
    static String[] field_K;
    private boolean field_T;
    private an field_I;

    private final void j(byte param0) {
        int var2 = this.field_S != null ? this.field_S.field_n + this.field_S.field_j : this.field_I.field_j;
        int var3 = this.field_C == null ? -this.field_F.field_n + (this.field_I.field_n + this.field_I.field_j) : this.field_C.field_j + -this.field_F.field_n;
        int var4 = 10 % ((param0 - -16) / 63);
        this.a(var2 < var3 ? (-var2 + this.field_F.field_j << -600307856) / (var3 - var2) : 0, (byte) -98);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = -106 % ((46 - param1) / 42);
                super.a(param0, (byte) 114, param2, param3);
                if (!(this.field_F.field_z instanceof an)) {
                  break L2;
                } else {
                  if (!((an) ((Object) this.field_F.field_z)).field_C) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (1 != this.field_F.field_m) {
                break L1;
              } else {
                L3: {
                  if (!this.field_X) {
                    this.f((byte) -69);
                    break L3;
                  } else {
                    var6 = this.field_D;
                    this.k((byte) 33);
                    if (var6 == this.field_D) {
                      break L3;
                    } else {
                      if (!(this.field_v instanceof un)) {
                        break L3;
                      } else {
                        ((un) ((Object) this.field_v)).a(this.field_D, (em) (this), -77, this.field_D);
                        break L3;
                      }
                    }
                  }
                }
                if (!this.field_Q) {
                  this.a(-734046384);
                  break L1;
                } else {
                  var6 = this.field_E;
                  this.j((byte) 117);
                  if (this.field_E == var6) {
                    break L1;
                  } else {
                    if (!(this.field_v instanceof un)) {
                      break L1;
                    } else {
                      ((un) ((Object) this.field_v)).a(this.field_D, (em) (this), -63, this.field_E);
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (!this.field_I.field_C) {
                break L4;
              } else {
                if (1 != this.field_I.field_z) {
                  break L4;
                } else {
                  if (!this.field_Q) {
                    if (this.field_X) {
                      if ((this.field_F.field_i >> -1533195295) + param3 - -this.field_F.field_k >= ha.field_b) {
                        this.b(-this.field_V + this.field_D, -4218);
                        break L4;
                      } else {
                        this.b(this.field_V + this.field_D, -4218);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    if (!this.field_X) {
                      if (ei.field_K > (this.field_F.field_n >> 248845537) + (param2 - -this.field_F.field_j)) {
                        this.b(this.field_M + this.field_E, (byte) -121);
                        break L4;
                      } else {
                        this.b(-this.field_M + this.field_E, (byte) -121);
                        break L4;
                      }
                    } else {
                      var6 = -(this.field_F.field_i >> 1827929537) + -this.field_F.field_k + -this.field_k + (-param3 + ha.field_b);
                      var7 = -this.field_j + ei.field_K + (-param2 - (this.field_F.field_n >> 1526471969) - this.field_F.field_j);
                      if (Math.abs(var7) <= Math.abs(var6)) {
                        if (0 >= var6) {
                          this.b(this.field_D + -this.field_V, -4218);
                          break L4;
                        } else {
                          this.b(this.field_D + this.field_V, -4218);
                          break L4;
                        }
                      } else {
                        if (-1 <= (var7 ^ -1)) {
                          this.b(this.field_E - this.field_M, (byte) -121);
                          break L4;
                        } else {
                          this.b(this.field_M + this.field_E, (byte) -121);
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var5);
            stackOut_37_1 = new StringBuilder().append("em.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            var5_int = 66 % ((param0 - -83) / 32);
            if (super.a(-120, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_T) {
                  break L1;
                } else {
                  if (!this.field_F.e(-17741)) {
                    break L1;
                  } else {
                    if (param1 != 98) {
                      if (99 == param1) {
                        this.b(this.field_E + this.field_W, (byte) -121);
                        stackOut_39_0 = 1;
                        stackIn_40_0 = stackOut_39_0;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      } else {
                        if ((param1 ^ -1) != -97) {
                          if (97 == param1) {
                            this.b(this.field_G + this.field_D, -4218);
                            stackOut_37_0 = 1;
                            stackIn_38_0 = stackOut_37_0;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if (-105 != (param1 ^ -1)) {
                              if (105 == param1) {
                                this.b(this.field_E + this.h((byte) -49), (byte) -121);
                                stackOut_35_0 = 1;
                                stackIn_36_0 = stackOut_35_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                if (param1 == 102) {
                                  L2: {
                                    if (!this.field_Q) {
                                      break L2;
                                    } else {
                                      if (!bo.field_p[82]) {
                                        break L2;
                                      } else {
                                        this.b(0, (byte) -121);
                                        stackOut_30_0 = 1;
                                        stackIn_31_0 = stackOut_30_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!this.field_X) {
                                    break L1;
                                  } else {
                                    this.b(0, -4218);
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                } else {
                                  if (param1 != 103) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_Q) {
                                        break L3;
                                      } else {
                                        if (bo.field_p[82]) {
                                          this.b(65536, (byte) -121);
                                          stackOut_26_0 = 1;
                                          stackIn_27_0 = stackOut_26_0;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    if (!this.field_X) {
                                      break L1;
                                    } else {
                                      this.b(65536, -4218);
                                      stackOut_24_0 = 1;
                                      stackIn_25_0 = stackOut_24_0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.b(this.field_E + -this.h((byte) -49), (byte) -121);
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          this.b(this.field_D + -this.field_G, -4218);
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      this.b(this.field_E - this.field_W, (byte) -121);
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              stackOut_41_0 = 0;
              stackIn_42_0 = stackOut_41_0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var5);
            stackOut_43_1 = new StringBuilder().append("em.I(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L4;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_34_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_36_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_38_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_40_0 != 0;
                            } else {
                              return stackIn_42_0 != 0;
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

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 <= param2) {
            this.field_F.a(115, this.field_F.field_j, this.field_F.field_k, this.field_I.field_i, this.field_F.field_n);
            this.a(1, false);
        } else {
            var4 = param2 * this.field_I.field_i / param0;
            if (!(this.field_O <= var4)) {
                var4 = this.field_O;
            }
            this.field_F.a(-100, this.field_F.field_j, this.field_F.field_k, var4, this.field_F.field_n);
            this.a(1, true);
        }
        this.f((byte) -118);
        var4 = 7 % ((-29 - param1) / 44);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (null != this.field_S) {
            stackOut_2_0 = this.field_S.field_n + this.field_S.field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_I.field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != -734046384) {
          return;
        } else {
          L1: {
            if (null == this.field_C) {
              stackOut_6_0 = -this.field_F.field_n + (this.field_I.field_j + this.field_I.field_n);
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_C.field_j + -this.field_F.field_n;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          this.field_F.field_j = var2 + ((var3 - var2) * this.field_E >> -734046384);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -52) {
          L0: {
            this.field_X = false;
            if (null != this.field_L) {
              stackOut_10_0 = this.field_L.field_i + this.field_L.field_k;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_I.field_k;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (null != this.field_N) {
              stackOut_13_0 = -this.field_F.field_i + this.field_N.field_k;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = this.field_I.field_k + this.field_I.field_i + -this.field_F.field_i;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          this.field_F.field_k = ((-var2 + var3) * this.field_D >> 615318608) + var2;
          return;
        } else {
          L2: {
            if (null != this.field_L) {
              stackOut_3_0 = this.field_L.field_i + this.field_L.field_k;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = this.field_I.field_k;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (null != this.field_N) {
              stackOut_6_0 = -this.field_F.field_i + this.field_N.field_k;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = this.field_I.field_k + this.field_I.field_i + -this.field_F.field_i;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          this.field_F.field_k = ((-var2 + var3) * this.field_D >> 615318608) + var2;
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0, -61);
        if (param1 != -4218) {
          return;
        } else {
          L0: {
            if (!(this.field_v instanceof un)) {
              break L0;
            } else {
              ((un) ((Object) this.field_v)).a(this.field_D, this.field_E, (em) (this), 13483);
              break L0;
            }
          }
          return;
        }
    }

    final static vn i(byte param0) {
        int var5_int = 0;
        int var6 = ZombieDawn.field_J;
        int var1 = uf.field_n[0] * bn.field_c[0];
        int var2 = 26 % ((-31 - param0) / 37);
        byte[] var3 = vj.field_m[0];
        int[] var4 = new int[var1];
        for (var5_int = 0; var1 > var5_int; var5_int++) {
            var4[var5_int] = j.field_a[eg.a(255, (int) var3[var5_int])];
        }
        vn var5 = new vn(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var4);
        no.f((byte) -110);
        return var5;
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param1 <= -57) {
          if (-1 >= (param0 ^ -1)) {
            if (param0 <= 65536) {
              this.field_E = param0;
              this.a(-734046384);
              return;
            } else {
              this.field_E = 65536;
              this.a(-734046384);
              return;
            }
          } else {
            this.field_E = 0;
            this.a(-734046384);
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, byte param1) {
        L0: {
          this.a(param0, (byte) -77);
          if (this.field_v instanceof un) {
            ((un) ((Object) this.field_v)).a(this.field_E, this.field_E, (em) (this), 13483);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -121) {
          this.b(47, -73, 104);
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1) {
        an stackIn_1_0 = null;
        an stackIn_2_0 = null;
        an stackIn_5_0 = null;
        an stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        an stackIn_11_0 = null;
        an stackIn_12_0 = null;
        an stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        an stackIn_17_0 = null;
        an stackIn_18_0 = null;
        an stackIn_19_0 = null;
        an stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        an stackIn_23_0 = null;
        an stackIn_24_0 = null;
        an stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        an stackIn_27_0 = null;
        an stackIn_28_0 = null;
        an stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        an stackIn_35_0 = null;
        an stackIn_36_0 = null;
        an stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        an stackIn_42_0 = null;
        an stackIn_43_0 = null;
        an stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        an stackIn_47_0 = null;
        an stackIn_48_0 = null;
        an stackIn_50_0 = null;
        an stackIn_51_0 = null;
        an stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        an stackIn_55_0 = null;
        an stackIn_56_0 = null;
        an stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        an stackIn_64_0 = null;
        an stackIn_65_0 = null;
        an stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        an stackIn_69_0 = null;
        an stackIn_70_0 = null;
        an stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        an stackIn_73_0 = null;
        an stackIn_74_0 = null;
        an stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        an stackIn_84_0 = null;
        an stackIn_85_0 = null;
        an stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        an stackOut_1_0 = null;
        an stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        an stackOut_4_0 = null;
        an stackOut_17_0 = null;
        an stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        an stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        an stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        an stackOut_10_0 = null;
        an stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        an stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        an stackOut_34_0 = null;
        an stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        an stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        an stackOut_22_0 = null;
        an stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        an stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        an stackOut_26_0 = null;
        an stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        an stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        an stackOut_46_0 = null;
        an stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        an stackOut_47_0 = null;
        an stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        an stackOut_49_0 = null;
        an stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        an stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        an stackOut_54_0 = null;
        an stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        an stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        an stackOut_83_0 = null;
        an stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        an stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        an stackOut_68_0 = null;
        an stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        an stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        an stackOut_72_0 = null;
        an stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        an stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        L0: {
          stackOut_0_0 = this.field_I;
          stackIn_42_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_42_0 = (an) ((Object) stackIn_42_0);
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L0;
          } else {
            stackOut_1_0 = (an) ((Object) stackIn_1_0);
            stackIn_43_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!this.field_X) {
              stackOut_43_0 = (an) ((Object) stackIn_43_0);
              stackOut_43_1 = 0;
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_C = true;
                if (this.field_F.field_z instanceof an) {
                  stackOut_4_0 = (an) ((Object) this.field_F.field_z);
                  stackIn_17_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param0) {
                    L2: {
                      stackOut_17_0 = (an) ((Object) stackIn_17_0);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!this.field_X) {
                        stackOut_19_0 = (an) ((Object) stackIn_19_0);
                        stackOut_19_1 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L2;
                      } else {
                        stackOut_18_0 = (an) ((Object) stackIn_18_0);
                        stackOut_18_1 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L2;
                      }
                    }
                    stackIn_20_0.field_C = stackIn_20_1 != 0;
                    break L1;
                  } else {
                    L3: {
                      stackIn_5_0.field_C = true;
                      if (null == this.field_S) {
                        break L3;
                      } else {
                        stackOut_6_0 = this.field_S;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_0.field_C = stackIn_8_1 != 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (this.field_C == null) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_10_0 = this.field_C;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (!param0) {
                            stackOut_12_0 = (an) ((Object) stackIn_12_0);
                            stackOut_12_1 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L5;
                          } else {
                            stackOut_11_0 = (an) ((Object) stackIn_11_0);
                            stackOut_11_1 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L5;
                          }
                        }
                        stackIn_13_0.field_C = stackIn_13_1 != 0;
                        break L4;
                      }
                    }
                    L6: {
                      if (param1 == 30789) {
                        break L6;
                      } else {
                        this.field_C = (an) null;
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
              if (null == this.field_S) {
                L7: {
                  if (this.field_C == null) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_34_0 = this.field_C;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (!param0) {
                        stackOut_36_0 = (an) ((Object) stackIn_36_0);
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L8;
                      } else {
                        stackOut_35_0 = (an) ((Object) stackIn_35_0);
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L8;
                      }
                    }
                    stackIn_37_0.field_C = stackIn_37_1 != 0;
                    break L7;
                  }
                }
                L9: {
                  if (param1 == 30789) {
                    break L9;
                  } else {
                    this.field_C = (an) null;
                    break L9;
                  }
                }
                return;
              } else {
                L10: {
                  stackOut_22_0 = this.field_S;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (!param0) {
                    stackOut_24_0 = (an) ((Object) stackIn_24_0);
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L10;
                  } else {
                    stackOut_23_0 = (an) ((Object) stackIn_23_0);
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L10;
                  }
                }
                L11: {
                  stackIn_25_0.field_C = stackIn_25_1 != 0;
                  if (this.field_C == null) {
                    break L11;
                  } else {
                    L12: {
                      stackOut_26_0 = this.field_C;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (!param0) {
                        stackOut_28_0 = (an) ((Object) stackIn_28_0);
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L12;
                      } else {
                        stackOut_27_0 = (an) ((Object) stackIn_27_0);
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L12;
                      }
                    }
                    stackIn_29_0.field_C = stackIn_29_1 != 0;
                    break L11;
                  }
                }
                L13: {
                  if (param1 == 30789) {
                    break L13;
                  } else {
                    this.field_C = (an) null;
                    break L13;
                  }
                }
                return;
              }
            }
          }
        }
        L14: {
          stackIn_44_0.field_C = stackIn_44_1 != 0;
          if (this.field_F.field_z instanceof an) {
            L15: {
              stackOut_46_0 = (an) ((Object) this.field_F.field_z);
              stackIn_64_0 = stackOut_46_0;
              stackIn_47_0 = stackOut_46_0;
              if (param0) {
                stackOut_64_0 = (an) ((Object) stackIn_64_0);
                stackOut_64_1 = 1;
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                break L15;
              } else {
                stackOut_47_0 = (an) ((Object) stackIn_47_0);
                stackIn_65_0 = stackOut_47_0;
                stackIn_48_0 = stackOut_47_0;
                if (!this.field_X) {
                  stackOut_65_0 = (an) ((Object) stackIn_65_0);
                  stackOut_65_1 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  break L15;
                } else {
                  L16: {
                    stackIn_48_0.field_C = true;
                    if (null == this.field_S) {
                      break L16;
                    } else {
                      L17: {
                        stackOut_49_0 = this.field_S;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (!param0) {
                          stackOut_51_0 = (an) ((Object) stackIn_51_0);
                          stackOut_51_1 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        } else {
                          stackOut_50_0 = (an) ((Object) stackIn_50_0);
                          stackOut_50_1 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          break L17;
                        }
                      }
                      stackIn_52_0.field_C = stackIn_52_1 != 0;
                      break L16;
                    }
                  }
                  if (this.field_C == null) {
                    if (param1 != 30789) {
                      this.field_C = (an) null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L18: {
                      stackOut_54_0 = this.field_C;
                      stackIn_56_0 = stackOut_54_0;
                      stackIn_55_0 = stackOut_54_0;
                      if (!param0) {
                        stackOut_56_0 = (an) ((Object) stackIn_56_0);
                        stackOut_56_1 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        break L18;
                      } else {
                        stackOut_55_0 = (an) ((Object) stackIn_55_0);
                        stackOut_55_1 = 1;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_57_1 = stackOut_55_1;
                        break L18;
                      }
                    }
                    L19: {
                      stackIn_57_0.field_C = stackIn_57_1 != 0;
                      if (param1 == 30789) {
                        break L19;
                      } else {
                        this.field_C = (an) null;
                        break L19;
                      }
                    }
                    return;
                  }
                }
              }
            }
            stackIn_66_0.field_C = stackIn_66_1 != 0;
            break L14;
          } else {
            break L14;
          }
        }
        if (null == this.field_S) {
          if (this.field_C == null) {
            if (param1 != 30789) {
              this.field_C = (an) null;
              return;
            } else {
              return;
            }
          } else {
            L20: {
              stackOut_83_0 = this.field_C;
              stackIn_85_0 = stackOut_83_0;
              stackIn_84_0 = stackOut_83_0;
              if (!param0) {
                stackOut_85_0 = (an) ((Object) stackIn_85_0);
                stackOut_85_1 = 0;
                stackIn_86_0 = stackOut_85_0;
                stackIn_86_1 = stackOut_85_1;
                break L20;
              } else {
                stackOut_84_0 = (an) ((Object) stackIn_84_0);
                stackOut_84_1 = 1;
                stackIn_86_0 = stackOut_84_0;
                stackIn_86_1 = stackOut_84_1;
                break L20;
              }
            }
            stackIn_86_0.field_C = stackIn_86_1 != 0;
            if (param1 != 30789) {
              this.field_C = (an) null;
              return;
            } else {
              return;
            }
          }
        } else {
          L21: {
            stackOut_68_0 = this.field_S;
            stackIn_70_0 = stackOut_68_0;
            stackIn_69_0 = stackOut_68_0;
            if (!param0) {
              stackOut_70_0 = (an) ((Object) stackIn_70_0);
              stackOut_70_1 = 0;
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              break L21;
            } else {
              stackOut_69_0 = (an) ((Object) stackIn_69_0);
              stackOut_69_1 = 1;
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              break L21;
            }
          }
          stackIn_71_0.field_C = stackIn_71_1 != 0;
          if (this.field_C == null) {
            if (param1 != 30789) {
              this.field_C = (an) null;
              return;
            } else {
              return;
            }
          } else {
            L22: {
              stackOut_72_0 = this.field_C;
              stackIn_74_0 = stackOut_72_0;
              stackIn_73_0 = stackOut_72_0;
              if (!param0) {
                stackOut_74_0 = (an) ((Object) stackIn_74_0);
                stackOut_74_1 = 0;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                break L22;
              } else {
                stackOut_73_0 = (an) ((Object) stackIn_73_0);
                stackOut_73_1 = 1;
                stackIn_75_0 = stackOut_73_0;
                stackIn_75_1 = stackOut_73_1;
                break L22;
              }
            }
            L23: {
              stackIn_75_0.field_C = stackIn_75_1 != 0;
              if (param1 == 30789) {
                break L23;
              } else {
                this.field_C = (an) null;
                break L23;
              }
            }
            return;
          }
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) != -2) {
                break L1;
              } else {
                if (this.field_T) {
                  L2: {
                    if (!this.field_Q) {
                      break L2;
                    } else {
                      if (this.field_S == param2) {
                        this.b(this.field_E + -this.field_W, (byte) -121);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!this.field_Q) {
                      break L3;
                    } else {
                      if (this.field_C != param2) {
                        break L3;
                      } else {
                        this.b(this.field_W + this.field_E, (byte) -121);
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (!this.field_X) {
                      break L4;
                    } else {
                      if (param2 != this.field_L) {
                        break L4;
                      } else {
                        this.b(-this.field_G + this.field_D, param1 ^ 4220);
                        break L1;
                      }
                    }
                  }
                  if (!this.field_X) {
                    break L1;
                  } else {
                    if (param2 != this.field_N) {
                      break L1;
                    } else {
                      this.b(this.field_G + this.field_D, -4218);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (param1 == -6) {
                break L5;
              } else {
                this.field_Q = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("em.K(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 <= param2) {
          this.field_F.a(26, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, this.field_I.field_n);
          this.a(false, param0 ^ -3989);
          this.a(-734046384);
          if (param0 == -30674) {
            return;
          } else {
            this.e((byte) 16);
            return;
          }
        } else {
          L0: {
            var4 = this.field_I.field_n * param2 / param1;
            if (this.field_R > var4) {
              var4 = this.field_R;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_F.a(param0 ^ 30641, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, var4);
          this.a(true, 30789);
          this.a(-734046384);
          if (param0 == -30674) {
            return;
          } else {
            this.e((byte) 16);
            return;
          }
        }
    }

    public static void g(byte param0) {
        field_K = null;
        if (param0 >= -19) {
            return;
        }
        field_J = null;
    }

    private final int h(byte param0) {
        if (param0 != -49) {
          this.a(-46);
          return (this.field_F.field_n << 175913520) / this.field_I.field_n;
        } else {
          return (this.field_F.field_n << 175913520) / this.field_I.field_n;
        }
    }

    em(int param0, int param1, int param2, int param3, io param4, io param5, io param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ij dupTemp$2 = null;
        an dupTemp$3 = null;
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        this.field_R = 0;
        this.field_M = 8192;
        this.field_D = 32768;
        this.field_G = 1024;
        this.field_V = 8192;
        this.field_W = 1024;
        this.field_O = 0;
        this.field_T = true;
        this.field_E = 32768;
        try {
          L0: {
            L1: {
              this.field_B = new ga[6];
              dupTemp$2 = new ij(param0, param1, param7, param8, (io) null, (sk) null, new an(0, 0, param7, param8, param6, (sk) null), false, false);
              this.field_F = dupTemp$2;
              this.field_B[0] = (ga) ((Object) dupTemp$2);
              dupTemp$3 = new an(param0, param1, param7, param8, param5, (sk) null);
              this.field_I = dupTemp$3;
              this.field_B[1] = (ga) ((Object) dupTemp$3);
              this.field_O = param9;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param11) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((em) (this)).field_X = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param12) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((em) (this)).field_Q = stackIn_7_1 != 0;
            this.field_R = param10;
            this.a(param13, -89);
            this.a(param14, (byte) -95);
            this.a(-119, param1, param0, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var16);
            stackOut_9_1 = new StringBuilder().append("em.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (param0 < 15) {
          L0: {
            this.field_V = 106;
            if (null != this.field_L) {
              stackOut_13_0 = this.field_L.field_i + this.field_L.field_k;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_12_0 = this.field_I.field_k;
              stackIn_14_0 = stackOut_12_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_14_0;
            if (null != this.field_N) {
              stackOut_16_0 = -this.field_F.field_i + this.field_N.field_k;
              stackIn_17_0 = stackOut_16_0;
              break L1;
            } else {
              stackOut_15_0 = -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k);
              stackIn_17_0 = stackOut_15_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_17_0;
            stackOut_17_0 = this;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (var2 >= var3) {
              stackOut_19_0 = this;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L2;
            } else {
              stackOut_18_0 = this;
              stackOut_18_1 = (this.field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L2;
            }
          }
          this.a(stackIn_20_1, 89);
          return;
        } else {
          L3: {
            if (null != this.field_L) {
              stackOut_3_0 = this.field_L.field_i + this.field_L.field_k;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = this.field_I.field_k;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_4_0;
            if (null != this.field_N) {
              stackOut_6_0 = -this.field_F.field_i + this.field_N.field_k;
              stackIn_7_0 = stackOut_6_0;
              break L4;
            } else {
              stackOut_5_0 = -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k);
              stackIn_7_0 = stackOut_5_0;
              break L4;
            }
          }
          L5: {
            var3 = stackIn_7_0;
            stackOut_7_0 = this;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (var2 >= var3) {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L5;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = (this.field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L5;
            }
          }
          this.a(stackIn_10_1, 89);
          return;
        }
    }

    final boolean a(byte param0, ga param1) {
        ij var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 >= 67) {
              var3 = this.field_F;
              if (var3 == null) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (((ga) ((Object) var3)).a((byte) 104, param1)) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("em.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final void e(byte param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (this.field_L == null) {
            this.field_I.field_k = 0;
            break L0;
          } else {
            this.field_L.field_k = 0;
            this.field_L.field_j = -this.field_L.field_n + this.field_n >> -609515487;
            this.field_I.field_k = this.field_L.field_k + this.field_L.field_i;
            break L0;
          }
        }
        L1: {
          if (this.field_N == null) {
            this.field_I.field_i = -this.field_I.field_k + this.field_i;
            break L1;
          } else {
            this.field_N.field_k = -this.field_N.field_i + this.field_i;
            this.field_N.field_j = -this.field_N.field_n + this.field_n >> -1795002111;
            this.field_I.field_i = -this.field_N.field_i + (this.field_i + -this.field_I.field_k);
            break L1;
          }
        }
        if (param0 >= 38) {
          this.f((byte) -119);
          if (this.field_S != null) {
            this.field_S.field_j = 0;
            this.field_S.field_k = this.field_i + -this.field_S.field_i >> -666363679;
            this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
            if (null == this.field_C) {
              this.field_I.field_n = this.field_n + -this.field_I.field_j;
              this.a(-734046384);
              if (this.field_Q) {
                L2: {
                  if (!this.field_X) {
                    this.field_F.field_i = this.field_I.field_i;
                    this.field_F.field_k = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_F.a(true);
                return;
              } else {
                L3: {
                  this.field_F.field_n = this.field_I.field_n;
                  this.field_F.field_j = 0;
                  if (!this.field_X) {
                    this.field_F.field_i = this.field_I.field_i;
                    this.field_F.field_k = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_F.a(true);
                return;
              }
            } else {
              L4: {
                this.field_C.field_k = this.field_i - this.field_C.field_i >> -719857119;
                this.field_C.field_j = -this.field_C.field_n + this.field_n;
                this.field_I.field_n = -this.field_C.field_n + this.field_n + -this.field_I.field_j;
                this.a(-734046384);
                if (this.field_Q) {
                  break L4;
                } else {
                  this.field_F.field_n = this.field_I.field_n;
                  this.field_F.field_j = 0;
                  break L4;
                }
              }
              L5: {
                if (!this.field_X) {
                  this.field_F.field_i = this.field_I.field_i;
                  this.field_F.field_k = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_F.a(true);
              return;
            }
          } else {
            L6: {
              this.field_I.field_j = 0;
              if (null == this.field_C) {
                this.field_I.field_n = this.field_n + -this.field_I.field_j;
                break L6;
              } else {
                this.field_C.field_k = this.field_i - this.field_C.field_i >> -719857119;
                this.field_C.field_j = -this.field_C.field_n + this.field_n;
                this.field_I.field_n = -this.field_C.field_n + this.field_n + -this.field_I.field_j;
                break L6;
              }
            }
            this.a(-734046384);
            if (this.field_Q) {
              L7: {
                if (!this.field_X) {
                  this.field_F.field_i = this.field_I.field_i;
                  this.field_F.field_k = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              this.field_F.a(true);
              return;
            } else {
              L8: {
                this.field_F.field_n = this.field_I.field_n;
                this.field_F.field_j = 0;
                if (!this.field_X) {
                  this.field_F.field_i = this.field_I.field_i;
                  this.field_F.field_k = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              this.field_F.a(true);
              return;
            }
          }
        } else {
          L9: {
            em.g((byte) 122);
            this.f((byte) -119);
            if (this.field_S != null) {
              this.field_S.field_j = 0;
              this.field_S.field_k = this.field_i + -this.field_S.field_i >> -666363679;
              this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
              break L9;
            } else {
              this.field_I.field_j = 0;
              break L9;
            }
          }
          L10: {
            if (null == this.field_C) {
              this.field_I.field_n = this.field_n + -this.field_I.field_j;
              break L10;
            } else {
              this.field_C.field_k = this.field_i - this.field_C.field_i >> -719857119;
              this.field_C.field_j = -this.field_C.field_n + this.field_n;
              this.field_I.field_n = -this.field_C.field_n + this.field_n + -this.field_I.field_j;
              break L10;
            }
          }
          this.a(-734046384);
          if (this.field_Q) {
            L11: {
              if (!this.field_X) {
                this.field_F.field_i = this.field_I.field_i;
                this.field_F.field_k = 0;
                break L11;
              } else {
                break L11;
              }
            }
            this.field_F.a(true);
            return;
          } else {
            L12: {
              this.field_F.field_n = this.field_I.field_n;
              this.field_F.field_j = 0;
              if (!this.field_X) {
                this.field_F.field_i = this.field_I.field_i;
                this.field_F.field_k = 0;
                break L12;
              } else {
                break L12;
              }
            }
            this.field_F.a(true);
            return;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        an stackIn_1_0 = null;
        an stackIn_2_0 = null;
        an stackIn_5_0 = null;
        an stackIn_9_0 = null;
        an stackIn_10_0 = null;
        an stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        an stackIn_15_0 = null;
        an stackIn_16_0 = null;
        an stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        an stackIn_21_0 = null;
        an stackIn_22_0 = null;
        an stackIn_23_0 = null;
        an stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        an stackIn_29_0 = null;
        an stackIn_30_0 = null;
        an stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        an stackIn_35_0 = null;
        an stackIn_36_0 = null;
        an stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        an stackIn_41_0 = null;
        an stackIn_42_0 = null;
        an stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        an stackIn_46_0 = null;
        an stackIn_47_0 = null;
        an stackIn_51_0 = null;
        an stackIn_52_0 = null;
        an stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        an stackIn_57_0 = null;
        an stackIn_58_0 = null;
        an stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        an stackIn_63_0 = null;
        an stackIn_64_0 = null;
        an stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        an stackIn_70_0 = null;
        an stackIn_71_0 = null;
        an stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        an stackIn_76_0 = null;
        an stackIn_77_0 = null;
        an stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        an stackOut_1_0 = null;
        an stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        an stackOut_4_0 = null;
        an stackOut_21_0 = null;
        an stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        an stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        an stackOut_8_0 = null;
        an stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        an stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        an stackOut_14_0 = null;
        an stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        an stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        an stackOut_28_0 = null;
        an stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        an stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        an stackOut_34_0 = null;
        an stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        an stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        an stackOut_45_0 = null;
        an stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        an stackOut_46_0 = null;
        an stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        an stackOut_50_0 = null;
        an stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        an stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        an stackOut_56_0 = null;
        an stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        an stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        an stackOut_69_0 = null;
        an stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        an stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        an stackOut_75_0 = null;
        an stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        an stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        L0: {
          stackOut_0_0 = this.field_I;
          stackIn_41_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_41_0 = (an) ((Object) stackIn_41_0);
            stackOut_41_1 = 1;
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            break L0;
          } else {
            stackOut_1_0 = (an) ((Object) stackIn_1_0);
            stackIn_42_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!this.field_Q) {
              stackOut_42_0 = (an) ((Object) stackIn_42_0);
              stackOut_42_1 = 0;
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_C = true;
                if (this.field_F.field_z instanceof an) {
                  stackOut_4_0 = (an) ((Object) this.field_F.field_z);
                  stackIn_21_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param1) {
                    L2: {
                      stackOut_21_0 = (an) ((Object) stackIn_21_0);
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (!this.field_Q) {
                        stackOut_23_0 = (an) ((Object) stackIn_23_0);
                        stackOut_23_1 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L2;
                      } else {
                        stackOut_22_0 = (an) ((Object) stackIn_22_0);
                        stackOut_22_1 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        break L2;
                      }
                    }
                    stackIn_24_0.field_C = stackIn_24_1 != 0;
                    break L1;
                  } else {
                    stackIn_5_0.field_C = true;
                    if (param0 != 1) {
                      return;
                    } else {
                      L3: {
                        if (null != this.field_L) {
                          L4: {
                            stackOut_8_0 = this.field_L;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if (!param1) {
                              stackOut_10_0 = (an) ((Object) stackIn_10_0);
                              stackOut_10_1 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              break L4;
                            } else {
                              stackOut_9_0 = (an) ((Object) stackIn_9_0);
                              stackOut_9_1 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              break L4;
                            }
                          }
                          stackIn_11_0.field_C = stackIn_11_1 != 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (null != this.field_N) {
                          L6: {
                            stackOut_14_0 = this.field_N;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (!param1) {
                              stackOut_16_0 = (an) ((Object) stackIn_16_0);
                              stackOut_16_1 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L6;
                            } else {
                              stackOut_15_0 = (an) ((Object) stackIn_15_0);
                              stackOut_15_1 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L6;
                            }
                          }
                          stackIn_17_0.field_C = stackIn_17_1 != 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (param0 != 1) {
                return;
              } else {
                L7: {
                  if (null != this.field_L) {
                    L8: {
                      stackOut_28_0 = this.field_L;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (!param1) {
                        stackOut_30_0 = (an) ((Object) stackIn_30_0);
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L8;
                      } else {
                        stackOut_29_0 = (an) ((Object) stackIn_29_0);
                        stackOut_29_1 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L8;
                      }
                    }
                    stackIn_31_0.field_C = stackIn_31_1 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (null != this.field_N) {
                    L10: {
                      stackOut_34_0 = this.field_N;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (!param1) {
                        stackOut_36_0 = (an) ((Object) stackIn_36_0);
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L10;
                      } else {
                        stackOut_35_0 = (an) ((Object) stackIn_35_0);
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L10;
                      }
                    }
                    stackIn_37_0.field_C = stackIn_37_1 != 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            }
          }
        }
        L11: {
          stackIn_43_0.field_C = stackIn_43_1 != 0;
          if (this.field_F.field_z instanceof an) {
            L12: {
              stackOut_45_0 = (an) ((Object) this.field_F.field_z);
              stackIn_63_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (param1) {
                stackOut_63_0 = (an) ((Object) stackIn_63_0);
                stackOut_63_1 = 1;
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                break L12;
              } else {
                stackOut_46_0 = (an) ((Object) stackIn_46_0);
                stackIn_64_0 = stackOut_46_0;
                stackIn_47_0 = stackOut_46_0;
                if (!this.field_Q) {
                  stackOut_64_0 = (an) ((Object) stackIn_64_0);
                  stackOut_64_1 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  break L12;
                } else {
                  stackIn_47_0.field_C = true;
                  if (param0 != 1) {
                    return;
                  } else {
                    L13: {
                      if (null != this.field_L) {
                        L14: {
                          stackOut_50_0 = this.field_L;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_51_0 = stackOut_50_0;
                          if (!param1) {
                            stackOut_52_0 = (an) ((Object) stackIn_52_0);
                            stackOut_52_1 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L14;
                          } else {
                            stackOut_51_0 = (an) ((Object) stackIn_51_0);
                            stackOut_51_1 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            break L14;
                          }
                        }
                        stackIn_53_0.field_C = stackIn_53_1 != 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L15: {
                      if (null != this.field_N) {
                        L16: {
                          stackOut_56_0 = this.field_N;
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_57_0 = stackOut_56_0;
                          if (!param1) {
                            stackOut_58_0 = (an) ((Object) stackIn_58_0);
                            stackOut_58_1 = 0;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            break L16;
                          } else {
                            stackOut_57_0 = (an) ((Object) stackIn_57_0);
                            stackOut_57_1 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            break L16;
                          }
                        }
                        stackIn_59_0.field_C = stackIn_59_1 != 0;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  }
                }
              }
            }
            stackIn_65_0.field_C = stackIn_65_1 != 0;
            break L11;
          } else {
            break L11;
          }
        }
        if (param0 != 1) {
          return;
        } else {
          L17: {
            if (null != this.field_L) {
              L18: {
                stackOut_69_0 = this.field_L;
                stackIn_71_0 = stackOut_69_0;
                stackIn_70_0 = stackOut_69_0;
                if (!param1) {
                  stackOut_71_0 = (an) ((Object) stackIn_71_0);
                  stackOut_71_1 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  break L18;
                } else {
                  stackOut_70_0 = (an) ((Object) stackIn_70_0);
                  stackOut_70_1 = 1;
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  break L18;
                }
              }
              stackIn_72_0.field_C = stackIn_72_1 != 0;
              break L17;
            } else {
              break L17;
            }
          }
          L19: {
            if (null != this.field_N) {
              L20: {
                stackOut_75_0 = this.field_N;
                stackIn_77_0 = stackOut_75_0;
                stackIn_76_0 = stackOut_75_0;
                if (!param1) {
                  stackOut_77_0 = (an) ((Object) stackIn_77_0);
                  stackOut_77_1 = 0;
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  break L20;
                } else {
                  stackOut_76_0 = (an) ((Object) stackIn_76_0);
                  stackOut_76_1 = 1;
                  stackIn_78_0 = stackOut_76_0;
                  stackIn_78_1 = stackOut_76_1;
                  break L20;
                }
              }
              stackIn_78_0.field_C = stackIn_78_1 != 0;
              break L19;
            } else {
              break L19;
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var3 = 73 % ((param1 - 20) / 61);
        if (param0 >= 0) {
          if ((param0 ^ -1) < -65537) {
            this.field_D = 65536;
            this.f((byte) -76);
            return;
          } else {
            this.field_D = param0;
            this.f((byte) -76);
            return;
          }
        } else {
          this.field_D = 0;
          this.f((byte) -76);
          return;
        }
    }

    static {
        field_H = true;
        field_J = new sn("email");
        field_U = -1;
        field_K = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
