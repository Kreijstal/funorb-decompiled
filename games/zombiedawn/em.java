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
        int var2 = ((em) this).field_S != null ? ((em) this).field_S.field_n + ((em) this).field_S.field_j : ((em) this).field_I.field_j;
        int var3 = ((em) this).field_C == null ? -((em) this).field_F.field_n + (((em) this).field_I.field_n + ((em) this).field_I.field_j) : ((em) this).field_C.field_j + -((em) this).field_F.field_n;
        int var4 = 10 % ((param0 - -16) / 63);
        ((em) this).a(var2 < var3 ? (-var2 + ((em) this).field_F.field_j << -600307856) / (var3 - var2) : 0, (byte) -98);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var5 = -106 % ((46 - param1) / 42);
        super.a(param0, (byte) 114, param2, param3);
        if (((em) this).field_F.field_z instanceof an) {
          if (((an) (Object) ((em) this).field_F.field_z).field_C) {
            L0: {
              if (1 != ((em) this).field_F.field_m) {
                break L0;
              } else {
                L1: {
                  if (!((em) this).field_X) {
                    this.f((byte) -69);
                    break L1;
                  } else {
                    var6 = ((em) this).field_D;
                    this.k((byte) 33);
                    if (var6 == ((em) this).field_D) {
                      break L1;
                    } else {
                      if (!(((em) this).field_v instanceof un)) {
                        break L1;
                      } else {
                        ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -77, ((em) this).field_D);
                        break L1;
                      }
                    }
                  }
                }
                if (!((em) this).field_Q) {
                  this.a(-734046384);
                  break L0;
                } else {
                  var6 = ((em) this).field_E;
                  this.j((byte) 117);
                  if (((em) this).field_E == var6) {
                    break L0;
                  } else {
                    if (!(((em) this).field_v instanceof un)) {
                      break L0;
                    } else {
                      ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -63, ((em) this).field_E);
                      break L0;
                    }
                  }
                }
              }
            }
            if (((em) this).field_I.field_C) {
              if (1 == ((em) this).field_I.field_z) {
                if (!((em) this).field_Q) {
                  if (((em) this).field_X) {
                    if ((((em) this).field_F.field_i >> -1533195295) + param3 - -((em) this).field_F.field_k >= ha.field_b) {
                      this.b(-((em) this).field_V + ((em) this).field_D, -4218);
                      return;
                    } else {
                      this.b(((em) this).field_V + ((em) this).field_D, -4218);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!((em) this).field_X) {
                    if (ei.field_K > (((em) this).field_F.field_n >> 248845537) + (param2 - -((em) this).field_F.field_j)) {
                      this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                      return;
                    } else {
                      this.b(-((em) this).field_M + ((em) this).field_E, (byte) -121);
                      return;
                    }
                  } else {
                    var6 = -(((em) this).field_F.field_i >> 1827929537) + -((em) this).field_F.field_k + -((em) this).field_k + (-param3 + ha.field_b);
                    var7 = -((em) this).field_j + ei.field_K + (-param2 - (((em) this).field_F.field_n >> 1526471969) - ((em) this).field_F.field_j);
                    if (Math.abs(var7) <= Math.abs(var6)) {
                      if (0 >= var6) {
                        this.b(((em) this).field_D + -((em) this).field_V, -4218);
                        return;
                      } else {
                        this.b(((em) this).field_D + ((em) this).field_V, -4218);
                        return;
                      }
                    } else {
                      if (-1 <= (var7 ^ -1)) {
                        this.b(((em) this).field_E - ((em) this).field_M, (byte) -121);
                        return;
                      } else {
                        this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                        return;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (((em) this).field_I.field_C) {
              if (1 == ((em) this).field_I.field_z) {
                if (!((em) this).field_Q) {
                  if (((em) this).field_X) {
                    if ((((em) this).field_F.field_i >> -1533195295) + param3 - -((em) this).field_F.field_k < ha.field_b) {
                      this.b(((em) this).field_V + ((em) this).field_D, -4218);
                      return;
                    } else {
                      this.b(-((em) this).field_V + ((em) this).field_D, -4218);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!((em) this).field_X) {
                    if (ei.field_K <= (((em) this).field_F.field_n >> 248845537) + (param2 - -((em) this).field_F.field_j)) {
                      this.b(-((em) this).field_M + ((em) this).field_E, (byte) -121);
                      return;
                    } else {
                      this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                      return;
                    }
                  } else {
                    L2: {
                      var6 = -(((em) this).field_F.field_i >> 1827929537) + -((em) this).field_F.field_k + -((em) this).field_k + (-param3 + ha.field_b);
                      var7 = -((em) this).field_j + ei.field_K + (-param2 - (((em) this).field_F.field_n >> 1526471969) - ((em) this).field_F.field_j);
                      if (Math.abs(var7) <= Math.abs(var6)) {
                        if (0 >= var6) {
                          this.b(((em) this).field_D + -((em) this).field_V, -4218);
                          return;
                        } else {
                          this.b(((em) this).field_D + ((em) this).field_V, -4218);
                          break L2;
                        }
                      } else {
                        if (-1 <= (var7 ^ -1)) {
                          this.b(((em) this).field_E - ((em) this).field_M, (byte) -121);
                          break L2;
                        } else {
                          this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                          break L2;
                        }
                      }
                    }
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
        } else {
          L3: {
            if (1 != ((em) this).field_F.field_m) {
              break L3;
            } else {
              L4: {
                if (!((em) this).field_X) {
                  this.f((byte) -69);
                  break L4;
                } else {
                  var6 = ((em) this).field_D;
                  this.k((byte) 33);
                  if (var6 == ((em) this).field_D) {
                    break L4;
                  } else {
                    if (!(((em) this).field_v instanceof un)) {
                      break L4;
                    } else {
                      ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -77, ((em) this).field_D);
                      break L4;
                    }
                  }
                }
              }
              if (!((em) this).field_Q) {
                this.a(-734046384);
                break L3;
              } else {
                var6 = ((em) this).field_E;
                this.j((byte) 117);
                if (((em) this).field_E == var6) {
                  break L3;
                } else {
                  if (!(((em) this).field_v instanceof un)) {
                    break L3;
                  } else {
                    ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -63, ((em) this).field_E);
                    break L3;
                  }
                }
              }
            }
          }
          if (((em) this).field_I.field_C) {
            if (1 == ((em) this).field_I.field_z) {
              if (!((em) this).field_Q) {
                if (((em) this).field_X) {
                  if ((((em) this).field_F.field_i >> -1533195295) + param3 - -((em) this).field_F.field_k < ha.field_b) {
                    this.b(((em) this).field_V + ((em) this).field_D, -4218);
                    return;
                  } else {
                    this.b(-((em) this).field_V + ((em) this).field_D, -4218);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (!((em) this).field_X) {
                  if (ei.field_K <= (((em) this).field_F.field_n >> 248845537) + (param2 - -((em) this).field_F.field_j)) {
                    this.b(-((em) this).field_M + ((em) this).field_E, (byte) -121);
                    return;
                  } else {
                    this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                    return;
                  }
                } else {
                  L5: {
                    var6 = -(((em) this).field_F.field_i >> 1827929537) + -((em) this).field_F.field_k + -((em) this).field_k + (-param3 + ha.field_b);
                    var7 = -((em) this).field_j + ei.field_K + (-param2 - (((em) this).field_F.field_n >> 1526471969) - ((em) this).field_F.field_j);
                    if (Math.abs(var7) <= Math.abs(var6)) {
                      if (0 >= var6) {
                        this.b(((em) this).field_D + -((em) this).field_V, -4218);
                        return;
                      } else {
                        this.b(((em) this).field_D + ((em) this).field_V, -4218);
                        break L5;
                      }
                    } else {
                      if (-1 <= (var7 ^ -1)) {
                        this.b(((em) this).field_E - ((em) this).field_M, (byte) -121);
                        break L5;
                      } else {
                        this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                        break L5;
                      }
                    }
                  }
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

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        var5 = 66 % ((param0 - -83) / 32);
        if (super.a(-120, param1, param2, param3)) {
          return true;
        } else {
          if (((em) this).field_T) {
            if (((em) this).field_F.e(-17741)) {
              if (param1 != 98) {
                if (99 != param1) {
                  if ((param1 ^ -1) != -97) {
                    if (97 != param1) {
                      if (-105 != (param1 ^ -1)) {
                        if (105 != param1) {
                          if (param1 == 102) {
                            L0: {
                              if (!((em) this).field_Q) {
                                break L0;
                              } else {
                                if (!bo.field_p[82]) {
                                  break L0;
                                } else {
                                  this.b(0, (byte) -121);
                                  return true;
                                }
                              }
                            }
                            if (((em) this).field_X) {
                              this.b(0, -4218);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (param1 == 103) {
                              if (!((em) this).field_Q) {
                                if (((em) this).field_X) {
                                  this.b(65536, -4218);
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                if (!bo.field_p[82]) {
                                  if (!((em) this).field_X) {
                                    return false;
                                  } else {
                                    this.b(65536, -4218);
                                    return true;
                                  }
                                } else {
                                  this.b(65536, (byte) -121);
                                  return true;
                                }
                              }
                            } else {
                              return false;
                            }
                          }
                        } else {
                          this.b(((em) this).field_E + this.h((byte) -49), (byte) -121);
                          return true;
                        }
                      } else {
                        this.b(((em) this).field_E + -this.h((byte) -49), (byte) -121);
                        return true;
                      }
                    } else {
                      this.b(((em) this).field_G + ((em) this).field_D, -4218);
                      return true;
                    }
                  } else {
                    this.b(((em) this).field_D + -((em) this).field_G, -4218);
                    return true;
                  }
                } else {
                  this.b(((em) this).field_E + ((em) this).field_W, (byte) -121);
                  return true;
                }
              } else {
                this.b(((em) this).field_E - ((em) this).field_W, (byte) -121);
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 <= param2) {
            ((em) this).field_F.a(115, ((em) this).field_F.field_j, ((em) this).field_F.field_k, ((em) this).field_I.field_i, ((em) this).field_F.field_n);
            this.a(1, false);
        } else {
            var4 = param2 * ((em) this).field_I.field_i / param0;
            if (!(((em) this).field_O <= var4)) {
                var4 = ((em) this).field_O;
            }
            ((em) this).field_F.a(-100, ((em) this).field_F.field_j, ((em) this).field_F.field_k, var4, ((em) this).field_F.field_n);
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
          if (null != ((em) this).field_S) {
            stackOut_2_0 = ((em) this).field_S.field_n + ((em) this).field_S.field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((em) this).field_I.field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != -734046384) {
          return;
        } else {
          L1: {
            if (null == ((em) this).field_C) {
              stackOut_6_0 = -((em) this).field_F.field_n + (((em) this).field_I.field_j + ((em) this).field_I.field_n);
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((em) this).field_C.field_j + -((em) this).field_F.field_n;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          ((em) this).field_F.field_j = var2 + ((var3 - var2) * ((em) this).field_E >> -734046384);
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
            ((em) this).field_X = false;
            if (null != ((em) this).field_L) {
              stackOut_10_0 = ((em) this).field_L.field_i + ((em) this).field_L.field_k;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((em) this).field_I.field_k;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (null != ((em) this).field_N) {
              stackOut_13_0 = -((em) this).field_F.field_i + ((em) this).field_N.field_k;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((em) this).field_I.field_k + ((em) this).field_I.field_i + -((em) this).field_F.field_i;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          ((em) this).field_F.field_k = ((-var2 + var3) * ((em) this).field_D >> 615318608) + var2;
          return;
        } else {
          L2: {
            if (null != ((em) this).field_L) {
              stackOut_3_0 = ((em) this).field_L.field_i + ((em) this).field_L.field_k;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((em) this).field_I.field_k;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (null != ((em) this).field_N) {
              stackOut_6_0 = -((em) this).field_F.field_i + ((em) this).field_N.field_k;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((em) this).field_I.field_k + ((em) this).field_I.field_i + -((em) this).field_F.field_i;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          ((em) this).field_F.field_k = ((-var2 + var3) * ((em) this).field_D >> 615318608) + var2;
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0, -61);
        if (param1 != -4218) {
          return;
        } else {
          L0: {
            if (!(((em) this).field_v instanceof un)) {
              break L0;
            } else {
              ((un) (Object) ((em) this).field_v).a(((em) this).field_D, ((em) this).field_E, (em) this, 13483);
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
              ((em) this).field_E = param0;
              this.a(-734046384);
              return;
            } else {
              ((em) this).field_E = 65536;
              this.a(-734046384);
              return;
            }
          } else {
            ((em) this).field_E = 0;
            this.a(-734046384);
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, byte param1) {
        L0: {
          ((em) this).a(param0, (byte) -77);
          if (((em) this).field_v instanceof un) {
            ((un) (Object) ((em) this).field_v).a(((em) this).field_E, ((em) this).field_E, (em) this, 13483);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -121) {
          ((em) this).b(47, -73, 104);
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
        an stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        an stackIn_16_0 = null;
        an stackIn_17_0 = null;
        an stackIn_18_0 = null;
        an stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        an stackIn_22_0 = null;
        an stackIn_23_0 = null;
        an stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        an stackIn_26_0 = null;
        an stackIn_27_0 = null;
        an stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        an stackIn_34_0 = null;
        an stackIn_35_0 = null;
        an stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        an stackIn_41_0 = null;
        an stackIn_42_0 = null;
        an stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        an stackIn_46_0 = null;
        an stackIn_47_0 = null;
        an stackIn_49_0 = null;
        an stackIn_50_0 = null;
        an stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        an stackIn_54_0 = null;
        an stackIn_55_0 = null;
        an stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        an stackIn_63_0 = null;
        an stackIn_64_0 = null;
        an stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        an stackIn_68_0 = null;
        an stackIn_69_0 = null;
        an stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        an stackIn_72_0 = null;
        an stackIn_73_0 = null;
        an stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        an stackIn_83_0 = null;
        an stackIn_84_0 = null;
        an stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        an stackOut_1_0 = null;
        an stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        an stackOut_4_0 = null;
        an stackOut_16_0 = null;
        an stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        an stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        an stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        an stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        an stackOut_33_0 = null;
        an stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        an stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        an stackOut_21_0 = null;
        an stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        an stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        an stackOut_25_0 = null;
        an stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        an stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        an stackOut_45_0 = null;
        an stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        an stackOut_46_0 = null;
        an stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        an stackOut_48_0 = null;
        an stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        an stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        an stackOut_53_0 = null;
        an stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        an stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        an stackOut_82_0 = null;
        an stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        an stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        an stackOut_67_0 = null;
        an stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        an stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        an stackOut_71_0 = null;
        an stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        an stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        L0: {
          stackOut_0_0 = ((em) this).field_I;
          stackIn_41_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_41_0 = (an) (Object) stackIn_41_0;
            stackOut_41_1 = 1;
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            break L0;
          } else {
            stackOut_1_0 = (an) (Object) stackIn_1_0;
            stackIn_42_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!((em) this).field_X) {
              stackOut_42_0 = (an) (Object) stackIn_42_0;
              stackOut_42_1 = 0;
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_C = true;
                if (((em) this).field_F.field_z instanceof an) {
                  stackOut_4_0 = (an) (Object) ((em) this).field_F.field_z;
                  stackIn_16_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param0) {
                    L2: {
                      stackOut_16_0 = (an) (Object) stackIn_16_0;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (!((em) this).field_X) {
                        stackOut_18_0 = (an) (Object) stackIn_18_0;
                        stackOut_18_1 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L2;
                      } else {
                        stackOut_17_0 = (an) (Object) stackIn_17_0;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L2;
                      }
                    }
                    stackIn_19_0.field_C = stackIn_19_1 != 0;
                    break L1;
                  } else {
                    L3: {
                      stackIn_5_0.field_C = true;
                      if (null == ((em) this).field_S) {
                        break L3;
                      } else {
                        stackOut_6_0 = ((em) this).field_S;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_0.field_C = stackIn_8_1 != 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (((em) this).field_C == null) {
                        break L4;
                      } else {
                        stackOut_10_0 = ((em) this).field_C;
                        stackOut_10_1 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_0.field_C = stackIn_12_1 != 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 == 30789) {
                        break L5;
                      } else {
                        ((em) this).field_C = null;
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((em) this).field_S) {
                L6: {
                  if (((em) this).field_C == null) {
                    break L6;
                  } else {
                    L7: {
                      stackOut_33_0 = ((em) this).field_C;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (!param0) {
                        stackOut_35_0 = (an) (Object) stackIn_35_0;
                        stackOut_35_1 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L7;
                      } else {
                        stackOut_34_0 = (an) (Object) stackIn_34_0;
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L7;
                      }
                    }
                    stackIn_36_0.field_C = stackIn_36_1 != 0;
                    break L6;
                  }
                }
                L8: {
                  if (param1 == 30789) {
                    break L8;
                  } else {
                    ((em) this).field_C = null;
                    break L8;
                  }
                }
                return;
              } else {
                L9: {
                  stackOut_21_0 = ((em) this).field_S;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (!param0) {
                    stackOut_23_0 = (an) (Object) stackIn_23_0;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L9;
                  } else {
                    stackOut_22_0 = (an) (Object) stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L9;
                  }
                }
                L10: {
                  stackIn_24_0.field_C = stackIn_24_1 != 0;
                  if (((em) this).field_C == null) {
                    break L10;
                  } else {
                    L11: {
                      stackOut_25_0 = ((em) this).field_C;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (!param0) {
                        stackOut_27_0 = (an) (Object) stackIn_27_0;
                        stackOut_27_1 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        break L11;
                      } else {
                        stackOut_26_0 = (an) (Object) stackIn_26_0;
                        stackOut_26_1 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        break L11;
                      }
                    }
                    stackIn_28_0.field_C = stackIn_28_1 != 0;
                    break L10;
                  }
                }
                L12: {
                  if (param1 == 30789) {
                    break L12;
                  } else {
                    ((em) this).field_C = null;
                    break L12;
                  }
                }
                return;
              }
            }
          }
        }
        L13: {
          stackIn_43_0.field_C = stackIn_43_1 != 0;
          if (((em) this).field_F.field_z instanceof an) {
            L14: {
              stackOut_45_0 = (an) (Object) ((em) this).field_F.field_z;
              stackIn_63_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (param0) {
                stackOut_63_0 = (an) (Object) stackIn_63_0;
                stackOut_63_1 = 1;
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                break L14;
              } else {
                stackOut_46_0 = (an) (Object) stackIn_46_0;
                stackIn_64_0 = stackOut_46_0;
                stackIn_47_0 = stackOut_46_0;
                if (!((em) this).field_X) {
                  stackOut_64_0 = (an) (Object) stackIn_64_0;
                  stackOut_64_1 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  break L14;
                } else {
                  L15: {
                    stackIn_47_0.field_C = true;
                    if (null == ((em) this).field_S) {
                      break L15;
                    } else {
                      L16: {
                        stackOut_48_0 = ((em) this).field_S;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (!param0) {
                          stackOut_50_0 = (an) (Object) stackIn_50_0;
                          stackOut_50_1 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L16;
                        } else {
                          stackOut_49_0 = (an) (Object) stackIn_49_0;
                          stackOut_49_1 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          break L16;
                        }
                      }
                      stackIn_51_0.field_C = stackIn_51_1 != 0;
                      break L15;
                    }
                  }
                  if (((em) this).field_C == null) {
                    if (param1 != 30789) {
                      ((em) this).field_C = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L17: {
                      stackOut_53_0 = ((em) this).field_C;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if (!param0) {
                        stackOut_55_0 = (an) (Object) stackIn_55_0;
                        stackOut_55_1 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        break L17;
                      } else {
                        stackOut_54_0 = (an) (Object) stackIn_54_0;
                        stackOut_54_1 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        break L17;
                      }
                    }
                    L18: {
                      stackIn_56_0.field_C = stackIn_56_1 != 0;
                      if (param1 == 30789) {
                        break L18;
                      } else {
                        ((em) this).field_C = null;
                        break L18;
                      }
                    }
                    return;
                  }
                }
              }
            }
            stackIn_65_0.field_C = stackIn_65_1 != 0;
            break L13;
          } else {
            break L13;
          }
        }
        if (null == ((em) this).field_S) {
          if (((em) this).field_C == null) {
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            L19: {
              stackOut_82_0 = ((em) this).field_C;
              stackIn_84_0 = stackOut_82_0;
              stackIn_83_0 = stackOut_82_0;
              if (!param0) {
                stackOut_84_0 = (an) (Object) stackIn_84_0;
                stackOut_84_1 = 0;
                stackIn_85_0 = stackOut_84_0;
                stackIn_85_1 = stackOut_84_1;
                break L19;
              } else {
                stackOut_83_0 = (an) (Object) stackIn_83_0;
                stackOut_83_1 = 1;
                stackIn_85_0 = stackOut_83_0;
                stackIn_85_1 = stackOut_83_1;
                break L19;
              }
            }
            stackIn_85_0.field_C = stackIn_85_1 != 0;
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          }
        } else {
          L20: {
            stackOut_67_0 = ((em) this).field_S;
            stackIn_69_0 = stackOut_67_0;
            stackIn_68_0 = stackOut_67_0;
            if (!param0) {
              stackOut_69_0 = (an) (Object) stackIn_69_0;
              stackOut_69_1 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              break L20;
            } else {
              stackOut_68_0 = (an) (Object) stackIn_68_0;
              stackOut_68_1 = 1;
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              break L20;
            }
          }
          stackIn_70_0.field_C = stackIn_70_1 != 0;
          if (((em) this).field_C == null) {
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            L21: {
              stackOut_71_0 = ((em) this).field_C;
              stackIn_73_0 = stackOut_71_0;
              stackIn_72_0 = stackOut_71_0;
              if (!param0) {
                stackOut_73_0 = (an) (Object) stackIn_73_0;
                stackOut_73_1 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                break L21;
              } else {
                stackOut_72_0 = (an) (Object) stackIn_72_0;
                stackOut_72_1 = 1;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                break L21;
              }
            }
            L22: {
              stackIn_74_0.field_C = stackIn_74_1 != 0;
              if (param1 == 30789) {
                break L22;
              } else {
                ((em) this).field_C = null;
                break L22;
              }
            }
            return;
          }
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        if ((param3 ^ -1) == -2) {
          L0: {
            if (((em) this).field_T) {
              if (!((em) this).field_Q) {
                L1: {
                  if (!((em) this).field_Q) {
                    break L1;
                  } else {
                    if (((em) this).field_C != param2) {
                      break L1;
                    } else {
                      this.b(((em) this).field_W + ((em) this).field_E, (byte) -121);
                      if (param1 != -6) {
                        ((em) this).field_Q = true;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L2: {
                  if (!((em) this).field_X) {
                    break L2;
                  } else {
                    if (param2 != ((em) this).field_L) {
                      break L2;
                    } else {
                      this.b(-((em) this).field_G + ((em) this).field_D, param1 ^ 4220);
                      if (param1 != -6) {
                        ((em) this).field_Q = true;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (!((em) this).field_X) {
                  break L0;
                } else {
                  if (param2 != ((em) this).field_N) {
                    break L0;
                  } else {
                    this.b(((em) this).field_G + ((em) this).field_D, -4218);
                    if (param1 != -6) {
                      ((em) this).field_Q = true;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (((em) this).field_S == param2) {
                  this.b(((em) this).field_E + -((em) this).field_W, (byte) -121);
                  if (param1 != -6) {
                    ((em) this).field_Q = true;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((em) this).field_Q) {
                    L3: {
                      if (((em) this).field_C != param2) {
                        L4: {
                          if (!((em) this).field_X) {
                            break L4;
                          } else {
                            if (param2 != ((em) this).field_L) {
                              break L4;
                            } else {
                              this.b(-((em) this).field_G + ((em) this).field_D, param1 ^ 4220);
                              break L3;
                            }
                          }
                        }
                        if (!((em) this).field_X) {
                          break L3;
                        } else {
                          if (param2 != ((em) this).field_N) {
                            break L3;
                          } else {
                            L5: {
                              this.b(((em) this).field_G + ((em) this).field_D, -4218);
                              if (param1 == -6) {
                                break L5;
                              } else {
                                ((em) this).field_Q = true;
                                break L5;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        this.b(((em) this).field_W + ((em) this).field_E, (byte) -121);
                        break L3;
                      }
                    }
                    if (param1 != -6) {
                      ((em) this).field_Q = true;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      if (((em) this).field_X) {
                        if (param2 == ((em) this).field_L) {
                          this.b(-((em) this).field_G + ((em) this).field_D, param1 ^ 4220);
                          break L6;
                        } else {
                          if (!((em) this).field_X) {
                            break L6;
                          } else {
                            if (param2 != ((em) this).field_N) {
                              break L6;
                            } else {
                              this.b(((em) this).field_G + ((em) this).field_D, -4218);
                              break L6;
                            }
                          }
                        }
                      } else {
                        if (!((em) this).field_X) {
                          break L6;
                        } else {
                          if (param2 != ((em) this).field_N) {
                            break L6;
                          } else {
                            this.b(((em) this).field_G + ((em) this).field_D, -4218);
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param1 == -6) {
                        break L7;
                      } else {
                        ((em) this).field_Q = true;
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          if (param1 != -6) {
            ((em) this).field_Q = true;
            return;
          } else {
            return;
          }
        } else {
          if (param1 != -6) {
            ((em) this).field_Q = true;
            return;
          } else {
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 <= param2) {
          ((em) this).field_F.a(26, ((em) this).field_F.field_j, ((em) this).field_F.field_k, ((em) this).field_F.field_i, ((em) this).field_I.field_n);
          this.a(false, param0 ^ -3989);
          this.a(-734046384);
          if (param0 == -30674) {
            return;
          } else {
            ((em) this).e((byte) 16);
            return;
          }
        } else {
          L0: {
            var4 = ((em) this).field_I.field_n * param2 / param1;
            if (((em) this).field_R > var4) {
              var4 = ((em) this).field_R;
              break L0;
            } else {
              break L0;
            }
          }
          ((em) this).field_F.a(param0 ^ 30641, ((em) this).field_F.field_j, ((em) this).field_F.field_k, ((em) this).field_F.field_i, var4);
          this.a(true, 30789);
          this.a(-734046384);
          if (param0 == -30674) {
            return;
          } else {
            ((em) this).e((byte) 16);
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
          return (((em) this).field_F.field_n << 175913520) / ((em) this).field_I.field_n;
        } else {
          return (((em) this).field_F.field_n << 175913520) / ((em) this).field_I.field_n;
        }
    }

    em(int param0, int param1, int param2, int param3, io param4, io param5, io param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ((em) this).field_R = 0;
        ((em) this).field_M = 8192;
        ((em) this).field_D = 32768;
        ((em) this).field_G = 1024;
        ((em) this).field_V = 8192;
        ((em) this).field_W = 1024;
        ((em) this).field_O = 0;
        ((em) this).field_T = true;
        ((em) this).field_E = 32768;
        ((em) this).field_B = new ga[6];
        ij dupTemp$0 = new ij(param0, param1, param7, param8, (io) null, (sk) null, (ga) (Object) new an(0, 0, param7, param8, param6, (sk) null), false, false);
        ((em) this).field_F = dupTemp$0;
        ((em) this).field_B[0] = (ga) (Object) dupTemp$0;
        an dupTemp$1 = new an(param0, param1, param7, param8, param5, (sk) null);
        ((em) this).field_I = dupTemp$1;
        ((em) this).field_B[1] = (ga) (Object) dupTemp$1;
        ((em) this).field_O = param9;
        ((em) this).field_X = param11 ? true : false;
        ((em) this).field_Q = param12 ? true : false;
        ((em) this).field_R = param10;
        this.a(param13, -89);
        ((em) this).a(param14, (byte) -95);
        ((em) this).a(-119, param1, param0, param2, param3);
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
            ((em) this).field_V = 106;
            if (null != ((em) this).field_L) {
              stackOut_13_0 = ((em) this).field_L.field_i + ((em) this).field_L.field_k;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_12_0 = ((em) this).field_I.field_k;
              stackIn_14_0 = stackOut_12_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_14_0;
            if (null != ((em) this).field_N) {
              stackOut_16_0 = -((em) this).field_F.field_i + ((em) this).field_N.field_k;
              stackIn_17_0 = stackOut_16_0;
              break L1;
            } else {
              stackOut_15_0 = -((em) this).field_F.field_i + (((em) this).field_I.field_i + ((em) this).field_I.field_k);
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
              stackOut_18_1 = (((em) this).field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L2;
            }
          }
          this.a(stackIn_20_1, 89);
          return;
        } else {
          L3: {
            if (null != ((em) this).field_L) {
              stackOut_3_0 = ((em) this).field_L.field_i + ((em) this).field_L.field_k;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = ((em) this).field_I.field_k;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_4_0;
            if (null != ((em) this).field_N) {
              stackOut_6_0 = -((em) this).field_F.field_i + ((em) this).field_N.field_k;
              stackIn_7_0 = stackOut_6_0;
              break L4;
            } else {
              stackOut_5_0 = -((em) this).field_F.field_i + (((em) this).field_I.field_i + ((em) this).field_I.field_k);
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
              stackOut_8_1 = (((em) this).field_F.field_k + -var2 << -1013903120) / (var3 + -var2);
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
        if (param0 >= 67) {
          var3 = ((em) this).field_F;
          if (var3 != null) {
            if (!((ga) (Object) var3).a((byte) 104, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void e(byte param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (((em) this).field_L == null) {
            ((em) this).field_I.field_k = 0;
            break L0;
          } else {
            ((em) this).field_L.field_k = 0;
            ((em) this).field_L.field_j = -((em) this).field_L.field_n + ((em) this).field_n >> -609515487;
            ((em) this).field_I.field_k = ((em) this).field_L.field_k + ((em) this).field_L.field_i;
            break L0;
          }
        }
        L1: {
          if (((em) this).field_N == null) {
            ((em) this).field_I.field_i = -((em) this).field_I.field_k + ((em) this).field_i;
            break L1;
          } else {
            ((em) this).field_N.field_k = -((em) this).field_N.field_i + ((em) this).field_i;
            ((em) this).field_N.field_j = -((em) this).field_N.field_n + ((em) this).field_n >> -1795002111;
            ((em) this).field_I.field_i = -((em) this).field_N.field_i + (((em) this).field_i + -((em) this).field_I.field_k);
            break L1;
          }
        }
        if (param0 >= 38) {
          this.f((byte) -119);
          if (((em) this).field_S != null) {
            ((em) this).field_S.field_j = 0;
            ((em) this).field_S.field_k = ((em) this).field_i + -((em) this).field_S.field_i >> -666363679;
            ((em) this).field_I.field_j = ((em) this).field_S.field_j + ((em) this).field_S.field_n;
            if (null == ((em) this).field_C) {
              ((em) this).field_I.field_n = ((em) this).field_n + -((em) this).field_I.field_j;
              this.a(-734046384);
              if (((em) this).field_Q) {
                L2: {
                  if (!((em) this).field_X) {
                    ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                    ((em) this).field_F.field_k = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((em) this).field_F.a(true);
                return;
              } else {
                L3: {
                  ((em) this).field_F.field_n = ((em) this).field_I.field_n;
                  ((em) this).field_F.field_j = 0;
                  if (!((em) this).field_X) {
                    ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                    ((em) this).field_F.field_k = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((em) this).field_F.a(true);
                return;
              }
            } else {
              L4: {
                ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> -719857119;
                ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
                ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
                this.a(-734046384);
                if (((em) this).field_Q) {
                  break L4;
                } else {
                  ((em) this).field_F.field_n = ((em) this).field_I.field_n;
                  ((em) this).field_F.field_j = 0;
                  break L4;
                }
              }
              L5: {
                if (!((em) this).field_X) {
                  ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                  ((em) this).field_F.field_k = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              ((em) this).field_F.a(true);
              return;
            }
          } else {
            L6: {
              ((em) this).field_I.field_j = 0;
              if (null == ((em) this).field_C) {
                ((em) this).field_I.field_n = ((em) this).field_n + -((em) this).field_I.field_j;
                break L6;
              } else {
                ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> -719857119;
                ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
                ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
                break L6;
              }
            }
            this.a(-734046384);
            if (((em) this).field_Q) {
              L7: {
                if (!((em) this).field_X) {
                  ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                  ((em) this).field_F.field_k = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((em) this).field_F.a(true);
              return;
            } else {
              L8: {
                ((em) this).field_F.field_n = ((em) this).field_I.field_n;
                ((em) this).field_F.field_j = 0;
                if (!((em) this).field_X) {
                  ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                  ((em) this).field_F.field_k = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              ((em) this).field_F.a(true);
              return;
            }
          }
        } else {
          L9: {
            em.g((byte) 122);
            this.f((byte) -119);
            if (((em) this).field_S != null) {
              ((em) this).field_S.field_j = 0;
              ((em) this).field_S.field_k = ((em) this).field_i + -((em) this).field_S.field_i >> -666363679;
              ((em) this).field_I.field_j = ((em) this).field_S.field_j + ((em) this).field_S.field_n;
              break L9;
            } else {
              ((em) this).field_I.field_j = 0;
              break L9;
            }
          }
          L10: {
            if (null == ((em) this).field_C) {
              ((em) this).field_I.field_n = ((em) this).field_n + -((em) this).field_I.field_j;
              break L10;
            } else {
              ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> -719857119;
              ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
              ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
              break L10;
            }
          }
          this.a(-734046384);
          if (((em) this).field_Q) {
            L11: {
              if (!((em) this).field_X) {
                ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                ((em) this).field_F.field_k = 0;
                break L11;
              } else {
                break L11;
              }
            }
            ((em) this).field_F.a(true);
            return;
          } else {
            L12: {
              ((em) this).field_F.field_n = ((em) this).field_I.field_n;
              ((em) this).field_F.field_j = 0;
              if (!((em) this).field_X) {
                ((em) this).field_F.field_i = ((em) this).field_I.field_i;
                ((em) this).field_F.field_k = 0;
                break L12;
              } else {
                break L12;
              }
            }
            ((em) this).field_F.a(true);
            return;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        an stackIn_1_0 = null;
        an stackIn_2_0 = null;
        an stackIn_5_0 = null;
        an stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        an stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        an stackIn_19_0 = null;
        an stackIn_20_0 = null;
        an stackIn_21_0 = null;
        an stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        an stackIn_27_0 = null;
        an stackIn_28_0 = null;
        an stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        an stackIn_33_0 = null;
        an stackIn_34_0 = null;
        an stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        an stackIn_39_0 = null;
        an stackIn_40_0 = null;
        an stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        an stackIn_44_0 = null;
        an stackIn_45_0 = null;
        an stackIn_49_0 = null;
        an stackIn_50_0 = null;
        an stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        an stackIn_55_0 = null;
        an stackIn_56_0 = null;
        an stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        an stackIn_61_0 = null;
        an stackIn_62_0 = null;
        an stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        an stackIn_68_0 = null;
        an stackIn_69_0 = null;
        an stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        an stackIn_74_0 = null;
        an stackIn_75_0 = null;
        an stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        an stackOut_1_0 = null;
        an stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        an stackOut_4_0 = null;
        an stackOut_19_0 = null;
        an stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        an stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        an stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        an stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        an stackOut_26_0 = null;
        an stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        an stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        an stackOut_32_0 = null;
        an stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        an stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        an stackOut_43_0 = null;
        an stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        an stackOut_44_0 = null;
        an stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        an stackOut_48_0 = null;
        an stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        an stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        an stackOut_54_0 = null;
        an stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        an stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        an stackOut_67_0 = null;
        an stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        an stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        an stackOut_73_0 = null;
        an stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        an stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        L0: {
          stackOut_0_0 = ((em) this).field_I;
          stackIn_39_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_39_0 = (an) (Object) stackIn_39_0;
            stackOut_39_1 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            break L0;
          } else {
            stackOut_1_0 = (an) (Object) stackIn_1_0;
            stackIn_40_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!((em) this).field_Q) {
              stackOut_40_0 = (an) (Object) stackIn_40_0;
              stackOut_40_1 = 0;
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_C = true;
                if (((em) this).field_F.field_z instanceof an) {
                  stackOut_4_0 = (an) (Object) ((em) this).field_F.field_z;
                  stackIn_19_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param1) {
                    L2: {
                      stackOut_19_0 = (an) (Object) stackIn_19_0;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (!((em) this).field_Q) {
                        stackOut_21_0 = (an) (Object) stackIn_21_0;
                        stackOut_21_1 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L2;
                      } else {
                        stackOut_20_0 = (an) (Object) stackIn_20_0;
                        stackOut_20_1 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L2;
                      }
                    }
                    stackIn_22_0.field_C = stackIn_22_1 != 0;
                    break L1;
                  } else {
                    stackIn_5_0.field_C = true;
                    if (param0 != 1) {
                      return;
                    } else {
                      L3: {
                        if (null != ((em) this).field_L) {
                          stackOut_8_0 = ((em) this).field_L;
                          stackOut_8_1 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_0.field_C = stackIn_10_1 != 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (null != ((em) this).field_N) {
                          stackOut_13_0 = ((em) this).field_N;
                          stackOut_13_1 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_0.field_C = stackIn_15_1 != 0;
                          break L4;
                        } else {
                          break L4;
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
                L5: {
                  if (null != ((em) this).field_L) {
                    L6: {
                      stackOut_26_0 = ((em) this).field_L;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (!param1) {
                        stackOut_28_0 = (an) (Object) stackIn_28_0;
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L6;
                      } else {
                        stackOut_27_0 = (an) (Object) stackIn_27_0;
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L6;
                      }
                    }
                    stackIn_29_0.field_C = stackIn_29_1 != 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (null != ((em) this).field_N) {
                    L8: {
                      stackOut_32_0 = ((em) this).field_N;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (!param1) {
                        stackOut_34_0 = (an) (Object) stackIn_34_0;
                        stackOut_34_1 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L8;
                      } else {
                        stackOut_33_0 = (an) (Object) stackIn_33_0;
                        stackOut_33_1 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        break L8;
                      }
                    }
                    stackIn_35_0.field_C = stackIn_35_1 != 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            }
          }
        }
        L9: {
          stackIn_41_0.field_C = stackIn_41_1 != 0;
          if (((em) this).field_F.field_z instanceof an) {
            L10: {
              stackOut_43_0 = (an) (Object) ((em) this).field_F.field_z;
              stackIn_61_0 = stackOut_43_0;
              stackIn_44_0 = stackOut_43_0;
              if (param1) {
                stackOut_61_0 = (an) (Object) stackIn_61_0;
                stackOut_61_1 = 1;
                stackIn_63_0 = stackOut_61_0;
                stackIn_63_1 = stackOut_61_1;
                break L10;
              } else {
                stackOut_44_0 = (an) (Object) stackIn_44_0;
                stackIn_62_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (!((em) this).field_Q) {
                  stackOut_62_0 = (an) (Object) stackIn_62_0;
                  stackOut_62_1 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  break L10;
                } else {
                  stackIn_45_0.field_C = true;
                  if (param0 != 1) {
                    return;
                  } else {
                    L11: {
                      if (null != ((em) this).field_L) {
                        L12: {
                          stackOut_48_0 = ((em) this).field_L;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_49_0 = stackOut_48_0;
                          if (!param1) {
                            stackOut_50_0 = (an) (Object) stackIn_50_0;
                            stackOut_50_1 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            break L12;
                          } else {
                            stackOut_49_0 = (an) (Object) stackIn_49_0;
                            stackOut_49_1 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            break L12;
                          }
                        }
                        stackIn_51_0.field_C = stackIn_51_1 != 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L13: {
                      if (null != ((em) this).field_N) {
                        L14: {
                          stackOut_54_0 = ((em) this).field_N;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_55_0 = stackOut_54_0;
                          if (!param1) {
                            stackOut_56_0 = (an) (Object) stackIn_56_0;
                            stackOut_56_1 = 0;
                            stackIn_57_0 = stackOut_56_0;
                            stackIn_57_1 = stackOut_56_1;
                            break L14;
                          } else {
                            stackOut_55_0 = (an) (Object) stackIn_55_0;
                            stackOut_55_1 = 1;
                            stackIn_57_0 = stackOut_55_0;
                            stackIn_57_1 = stackOut_55_1;
                            break L14;
                          }
                        }
                        stackIn_57_0.field_C = stackIn_57_1 != 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  }
                }
              }
            }
            stackIn_63_0.field_C = stackIn_63_1 != 0;
            break L9;
          } else {
            break L9;
          }
        }
        if (param0 != 1) {
          return;
        } else {
          L15: {
            if (null != ((em) this).field_L) {
              L16: {
                stackOut_67_0 = ((em) this).field_L;
                stackIn_69_0 = stackOut_67_0;
                stackIn_68_0 = stackOut_67_0;
                if (!param1) {
                  stackOut_69_0 = (an) (Object) stackIn_69_0;
                  stackOut_69_1 = 0;
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  break L16;
                } else {
                  stackOut_68_0 = (an) (Object) stackIn_68_0;
                  stackOut_68_1 = 1;
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  break L16;
                }
              }
              stackIn_70_0.field_C = stackIn_70_1 != 0;
              break L15;
            } else {
              break L15;
            }
          }
          L17: {
            if (null != ((em) this).field_N) {
              L18: {
                stackOut_73_0 = ((em) this).field_N;
                stackIn_75_0 = stackOut_73_0;
                stackIn_74_0 = stackOut_73_0;
                if (!param1) {
                  stackOut_75_0 = (an) (Object) stackIn_75_0;
                  stackOut_75_1 = 0;
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  break L18;
                } else {
                  stackOut_74_0 = (an) (Object) stackIn_74_0;
                  stackOut_74_1 = 1;
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_76_1 = stackOut_74_1;
                  break L18;
                }
              }
              stackIn_76_0.field_C = stackIn_76_1 != 0;
              break L17;
            } else {
              break L17;
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
            ((em) this).field_D = 65536;
            this.f((byte) -76);
            return;
          } else {
            ((em) this).field_D = param0;
            this.f((byte) -76);
            return;
          }
        } else {
          ((em) this).field_D = 0;
          this.f((byte) -76);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = true;
        field_J = new sn("email");
        field_U = -1;
        field_K = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
