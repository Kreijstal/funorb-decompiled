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
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
            stackIn_39_0 = (RuntimeException) (var5);

            stackIn_39_1 = new StringBuilder().append("em.D(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L5;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
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
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = 66 % ((param0 - -83) / 32);
            if (super.a(-120, param1, param2, param3)) {
              stackIn_3_0 = 1;
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
                        stackIn_40_0 = 1;
                        decompiledRegionSelector0 = 10;
                        break L0;
                      } else {
                        if ((param1 ^ -1) != -97) {
                          if (97 == param1) {
                            this.b(this.field_G + this.field_D, -4218);
                            stackIn_38_0 = 1;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if (-105 != (param1 ^ -1)) {
                              if (105 == param1) {
                                this.b(this.field_E + this.h((byte) -49), (byte) -121);
                                stackIn_36_0 = 1;
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
                                        stackIn_31_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!this.field_X) {
                                    break L1;
                                  } else {
                                    this.b(0, -4218);
                                    stackIn_34_0 = 1;
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
                                          stackIn_27_0 = 1;
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
                                      stackIn_25_0 = 1;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.b(this.field_E + -this.h((byte) -49), (byte) -121);
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          this.b(this.field_D + -this.field_G, -4218);
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      this.b(this.field_E - this.field_W, (byte) -121);
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              stackIn_42_0 = 0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var5);

            stackIn_45_1 = new StringBuilder().append("em.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L4;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
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
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (null != this.field_S) {
            stackIn_3_0 = this.field_S.field_n + this.field_S.field_j;
            break L0;
          } else {
            stackIn_3_0 = this.field_I.field_j;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != -734046384) {
          return;
        } else {
          L1: {
            if (null == this.field_C) {
              stackIn_7_0 = -this.field_F.field_n + (this.field_I.field_j + this.field_I.field_n);
              break L1;
            } else {
              stackIn_7_0 = this.field_C.field_j + -this.field_F.field_n;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          this.field_F.field_j = var2 + ((var3 - var2) * this.field_E >> -734046384);
          return;
        }
    }

    private final void f(byte param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        if (param0 > -52) {
          L0: {
            this.field_X = false;
            if (null != this.field_L) {
              stackIn_11_0 = this.field_L.field_i + this.field_L.field_k;
              break L0;
            } else {
              stackIn_11_0 = this.field_I.field_k;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (null != this.field_N) {
              stackIn_14_0 = -this.field_F.field_i + this.field_N.field_k;
              break L1;
            } else {
              stackIn_14_0 = this.field_I.field_k + this.field_I.field_i + -this.field_F.field_i;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          this.field_F.field_k = ((-var2 + var3) * this.field_D >> 615318608) + var2;
          return;
        } else {
          L2: {
            if (null != this.field_L) {
              stackIn_4_0 = this.field_L.field_i + this.field_L.field_k;
              break L2;
            } else {
              stackIn_4_0 = this.field_I.field_k;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (null != this.field_N) {
              stackIn_7_0 = -this.field_F.field_i + this.field_N.field_k;
              break L3;
            } else {
              stackIn_7_0 = this.field_I.field_k + this.field_I.field_i + -this.field_F.field_i;
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
        int var4;
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
        an stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        an stackIn_12_0 = null;
        an stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        an stackIn_17_0 = null;
        int stackIn_20_1 = 0;
        an stackIn_24_0 = null;
        an stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        an stackIn_28_0 = null;
        an stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        an stackIn_36_0 = null;
        an stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        an stackIn_42_0 = null;
        an stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        an stackIn_51_0 = null;
        an stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        an stackIn_56_0 = null;
        an stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        an stackIn_64_0 = null;
        an stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        an stackIn_70_0 = null;
        an stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        an stackIn_74_0 = null;
        an stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        an stackIn_85_0 = null;
        an stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        L0: {
          stackIn_42_0 = this.field_I;

          if (param0) {
            stackIn_44_0 = (an) ((Object) stackIn_42_0);
            stackIn_44_1 = 1;
            break L0;
          } else {


            if (!this.field_X) {
              stackIn_44_0 = (an) ((Object) stackIn_42_0);
              stackIn_44_1 = 0;
              break L0;
            } else {
              L1: {
                stackIn_42_0.field_C = true;
                if (this.field_F.field_z instanceof an) {
                  stackIn_17_0 = (an) ((Object) this.field_F.field_z);

                  if (!param0) {
                    L2: {


                      if (!this.field_X) {
                        stackIn_17_0 = (an) ((Object) stackIn_17_0);
                        stackIn_20_1 = 0;
                        break L2;
                      } else {
                        stackIn_17_0 = (an) ((Object) stackIn_17_0);
                        stackIn_20_1 = 1;
                        break L2;
                      }
                    }
                    stackIn_17_0.field_C = stackIn_20_1 != 0;
                    break L1;
                  } else {
                    L3: {
                      stackIn_17_0.field_C = true;
                      if (null == this.field_S) {
                        break L3;
                      } else {
                        stackIn_8_0 = this.field_S;
                        stackIn_8_1 = 1;
                        stackIn_8_0.field_C = stackIn_8_1 != 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (this.field_C == null) {
                        break L4;
                      } else {
                        L5: {
                          stackIn_12_0 = this.field_C;

                          if (!param0) {
                            stackIn_13_0 = (an) ((Object) stackIn_12_0);
                            stackIn_13_1 = 0;
                            break L5;
                          } else {
                            stackIn_13_0 = (an) ((Object) stackIn_12_0);
                            stackIn_13_1 = 1;
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
                      stackIn_36_0 = this.field_C;

                      if (!param0) {
                        stackIn_37_0 = (an) ((Object) stackIn_36_0);
                        stackIn_37_1 = 0;
                        break L8;
                      } else {
                        stackIn_37_0 = (an) ((Object) stackIn_36_0);
                        stackIn_37_1 = 1;
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
                  stackIn_24_0 = this.field_S;

                  if (!param0) {
                    stackIn_25_0 = (an) ((Object) stackIn_24_0);
                    stackIn_25_1 = 0;
                    break L10;
                  } else {
                    stackIn_25_0 = (an) ((Object) stackIn_24_0);
                    stackIn_25_1 = 1;
                    break L10;
                  }
                }
                L11: {
                  stackIn_25_0.field_C = stackIn_25_1 != 0;
                  if (this.field_C == null) {
                    break L11;
                  } else {
                    L12: {
                      stackIn_28_0 = this.field_C;

                      if (!param0) {
                        stackIn_29_0 = (an) ((Object) stackIn_28_0);
                        stackIn_29_1 = 0;
                        break L12;
                      } else {
                        stackIn_29_0 = (an) ((Object) stackIn_28_0);
                        stackIn_29_1 = 1;
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
              stackIn_64_0 = (an) ((Object) this.field_F.field_z);

              if (param0) {
                stackIn_66_0 = (an) ((Object) stackIn_64_0);
                stackIn_66_1 = 1;
                break L15;
              } else {


                if (!this.field_X) {
                  stackIn_66_0 = (an) ((Object) stackIn_64_0);
                  stackIn_66_1 = 0;
                  break L15;
                } else {
                  L16: {
                    stackIn_64_0.field_C = true;
                    if (null == this.field_S) {
                      break L16;
                    } else {
                      L17: {
                        stackIn_51_0 = this.field_S;

                        if (!param0) {
                          stackIn_52_0 = (an) ((Object) stackIn_51_0);
                          stackIn_52_1 = 0;
                          break L17;
                        } else {
                          stackIn_52_0 = (an) ((Object) stackIn_51_0);
                          stackIn_52_1 = 1;
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
                      stackIn_56_0 = this.field_C;

                      if (!param0) {
                        stackIn_57_0 = (an) ((Object) stackIn_56_0);
                        stackIn_57_1 = 0;
                        break L18;
                      } else {
                        stackIn_57_0 = (an) ((Object) stackIn_56_0);
                        stackIn_57_1 = 1;
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
              stackIn_85_0 = this.field_C;

              if (!param0) {
                stackIn_86_0 = (an) ((Object) stackIn_85_0);
                stackIn_86_1 = 0;
                break L20;
              } else {
                stackIn_86_0 = (an) ((Object) stackIn_85_0);
                stackIn_86_1 = 1;
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
            stackIn_70_0 = this.field_S;

            if (!param0) {
              stackIn_71_0 = (an) ((Object) stackIn_70_0);
              stackIn_71_1 = 0;
              break L21;
            } else {
              stackIn_71_0 = (an) ((Object) stackIn_70_0);
              stackIn_71_1 = 1;
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
              stackIn_74_0 = this.field_C;

              if (!param0) {
                stackIn_75_0 = (an) ((Object) stackIn_74_0);
                stackIn_75_1 = 0;
                break L22;
              } else {
                stackIn_75_0 = (an) ((Object) stackIn_74_0);
                stackIn_75_1 = 1;
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
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
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
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("em.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4;
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
        ij dupTemp$0 = null;
        an dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
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
              dupTemp$0 = new ij(param0, param1, param7, param8, (io) null, (sk) null, new an(0, 0, param7, param8, param6, (sk) null), false, false);
              this.field_F = dupTemp$0;
              this.field_B[0] = (ga) ((Object) dupTemp$0);
              dupTemp$1 = new an(param0, param1, param7, param8, param5, (sk) null);
              this.field_I = dupTemp$1;
              this.field_B[1] = (ga) ((Object) dupTemp$1);
              this.field_O = param9;
              stackIn_3_0 = this;

              if (!param11) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((em) (this)).field_X = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param12) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
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
            stackIn_11_0 = (RuntimeException) (var16);

            stackIn_11_1 = new StringBuilder().append("em.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void k(byte param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        if (param0 < 15) {
          L0: {
            this.field_V = 106;
            if (null != this.field_L) {
              stackIn_14_0 = this.field_L.field_i + this.field_L.field_k;
              break L0;
            } else {
              stackIn_14_0 = this.field_I.field_k;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_14_0;
            if (null != this.field_N) {
              stackIn_17_0 = -this.field_F.field_i + this.field_N.field_k;
              break L1;
            } else {
              stackIn_17_0 = -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k);
              break L1;
            }
          }
          L2: {
            var3 = stackIn_17_0;
            stackIn_19_0 = this;

            if (var2 >= var3) {
              stackIn_20_0 = this;
              stackIn_20_1 = 0;
              break L2;
            } else {
              stackIn_20_0 = this;
              stackIn_20_1 = (this.field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
              break L2;
            }
          }
          this.a(stackIn_20_1, 89);
          return;
        } else {
          L3: {
            if (null != this.field_L) {
              stackIn_4_0 = this.field_L.field_i + this.field_L.field_k;
              break L3;
            } else {
              stackIn_4_0 = this.field_I.field_k;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_4_0;
            if (null != this.field_N) {
              stackIn_7_0 = -this.field_F.field_i + this.field_N.field_k;
              break L4;
            } else {
              stackIn_7_0 = -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k);
              break L4;
            }
          }
          L5: {
            var3 = stackIn_7_0;
            stackIn_9_0 = this;

            if (var2 >= var3) {
              stackIn_10_0 = this;
              stackIn_10_1 = 0;
              break L5;
            } else {
              stackIn_10_0 = this;
              stackIn_10_1 = (this.field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 67) {
              var3 = this.field_F;
              if (var3 == null) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (((ga) ((Object) var3)).a((byte) 104, param1)) {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("em.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        int var3;
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
        an stackIn_10_0 = null;
        an stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        an stackIn_16_0 = null;
        an stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        an stackIn_21_0 = null;
        int stackIn_24_1 = 0;
        an stackIn_30_0 = null;
        an stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        an stackIn_36_0 = null;
        an stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        an stackIn_41_0 = null;
        an stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        an stackIn_52_0 = null;
        an stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        an stackIn_58_0 = null;
        an stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        an stackIn_63_0 = null;
        an stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        an stackIn_71_0 = null;
        an stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        an stackIn_77_0 = null;
        an stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        L0: {
          stackIn_41_0 = this.field_I;

          if (param1) {
            stackIn_43_0 = (an) ((Object) stackIn_41_0);
            stackIn_43_1 = 1;
            break L0;
          } else {


            if (!this.field_Q) {
              stackIn_43_0 = (an) ((Object) stackIn_41_0);
              stackIn_43_1 = 0;
              break L0;
            } else {
              L1: {
                stackIn_41_0.field_C = true;
                if (this.field_F.field_z instanceof an) {
                  stackIn_21_0 = (an) ((Object) this.field_F.field_z);

                  if (!param1) {
                    L2: {


                      if (!this.field_Q) {
                        stackIn_21_0 = (an) ((Object) stackIn_21_0);
                        stackIn_24_1 = 0;
                        break L2;
                      } else {
                        stackIn_21_0 = (an) ((Object) stackIn_21_0);
                        stackIn_24_1 = 1;
                        break L2;
                      }
                    }
                    stackIn_21_0.field_C = stackIn_24_1 != 0;
                    break L1;
                  } else {
                    stackIn_21_0.field_C = true;
                    if (param0 != 1) {
                      return;
                    } else {
                      L3: {
                        if (null != this.field_L) {
                          L4: {
                            stackIn_10_0 = this.field_L;

                            if (!param1) {
                              stackIn_11_0 = (an) ((Object) stackIn_10_0);
                              stackIn_11_1 = 0;
                              break L4;
                            } else {
                              stackIn_11_0 = (an) ((Object) stackIn_10_0);
                              stackIn_11_1 = 1;
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
                            stackIn_16_0 = this.field_N;

                            if (!param1) {
                              stackIn_17_0 = (an) ((Object) stackIn_16_0);
                              stackIn_17_1 = 0;
                              break L6;
                            } else {
                              stackIn_17_0 = (an) ((Object) stackIn_16_0);
                              stackIn_17_1 = 1;
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
                      stackIn_30_0 = this.field_L;

                      if (!param1) {
                        stackIn_31_0 = (an) ((Object) stackIn_30_0);
                        stackIn_31_1 = 0;
                        break L8;
                      } else {
                        stackIn_31_0 = (an) ((Object) stackIn_30_0);
                        stackIn_31_1 = 1;
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
                      stackIn_36_0 = this.field_N;

                      if (!param1) {
                        stackIn_37_0 = (an) ((Object) stackIn_36_0);
                        stackIn_37_1 = 0;
                        break L10;
                      } else {
                        stackIn_37_0 = (an) ((Object) stackIn_36_0);
                        stackIn_37_1 = 1;
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
              stackIn_63_0 = (an) ((Object) this.field_F.field_z);

              if (param1) {
                stackIn_65_0 = (an) ((Object) stackIn_63_0);
                stackIn_65_1 = 1;
                break L12;
              } else {


                if (!this.field_Q) {
                  stackIn_65_0 = (an) ((Object) stackIn_63_0);
                  stackIn_65_1 = 0;
                  break L12;
                } else {
                  stackIn_63_0.field_C = true;
                  if (param0 != 1) {
                    return;
                  } else {
                    L13: {
                      if (null != this.field_L) {
                        L14: {
                          stackIn_52_0 = this.field_L;

                          if (!param1) {
                            stackIn_53_0 = (an) ((Object) stackIn_52_0);
                            stackIn_53_1 = 0;
                            break L14;
                          } else {
                            stackIn_53_0 = (an) ((Object) stackIn_52_0);
                            stackIn_53_1 = 1;
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
                          stackIn_58_0 = this.field_N;

                          if (!param1) {
                            stackIn_59_0 = (an) ((Object) stackIn_58_0);
                            stackIn_59_1 = 0;
                            break L16;
                          } else {
                            stackIn_59_0 = (an) ((Object) stackIn_58_0);
                            stackIn_59_1 = 1;
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
                stackIn_71_0 = this.field_L;

                if (!param1) {
                  stackIn_72_0 = (an) ((Object) stackIn_71_0);
                  stackIn_72_1 = 0;
                  break L18;
                } else {
                  stackIn_72_0 = (an) ((Object) stackIn_71_0);
                  stackIn_72_1 = 1;
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
                stackIn_77_0 = this.field_N;

                if (!param1) {
                  stackIn_78_0 = (an) ((Object) stackIn_77_0);
                  stackIn_78_1 = 0;
                  break L20;
                } else {
                  stackIn_78_0 = (an) ((Object) stackIn_77_0);
                  stackIn_78_1 = 1;
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
        int var3;
        int var4;
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
