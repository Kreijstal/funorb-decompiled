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

    private final void j() {
        int var2 = ((em) this).field_S != null ? ((em) this).field_S.field_n + ((em) this).field_S.field_j : ((em) this).field_I.field_j;
        int var3 = ((em) this).field_C == null ? -((em) this).field_F.field_n + (((em) this).field_I.field_n + ((em) this).field_I.field_j) : ((em) this).field_C.field_j + -((em) this).field_F.field_n;
        int var4 = 0;
        ((em) this).a(var2 < var3 ? (-var2 + ((em) this).field_F.field_j << 16) / (var3 - var2) : 0, (byte) -98);
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
                if (!(((em) this).field_F.field_z instanceof an)) {
                  break L2;
                } else {
                  if (!((an) (Object) ((em) this).field_F.field_z).field_C) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (1 != ((em) this).field_F.field_m) {
                break L1;
              } else {
                L3: {
                  if (!((em) this).field_X) {
                    this.f((byte) -69);
                    break L3;
                  } else {
                    var6 = ((em) this).field_D;
                    int discarded$3 = 33;
                    this.k();
                    if (var6 == ((em) this).field_D) {
                      break L3;
                    } else {
                      if (!(((em) this).field_v instanceof un)) {
                        break L3;
                      } else {
                        ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -77, ((em) this).field_D);
                        break L3;
                      }
                    }
                  }
                }
                if (!((em) this).field_Q) {
                  int discarded$4 = -734046384;
                  this.a();
                  break L1;
                } else {
                  var6 = ((em) this).field_E;
                  int discarded$5 = 117;
                  this.j();
                  if (((em) this).field_E == var6) {
                    break L1;
                  } else {
                    if (!(((em) this).field_v instanceof un)) {
                      break L1;
                    } else {
                      ((un) (Object) ((em) this).field_v).a(((em) this).field_D, (em) this, -63, ((em) this).field_E);
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (!((em) this).field_I.field_C) {
                break L4;
              } else {
                if (1 != ((em) this).field_I.field_z) {
                  break L4;
                } else {
                  if (!((em) this).field_Q) {
                    if (((em) this).field_X) {
                      if ((((em) this).field_F.field_i >> 1) + param3 - -((em) this).field_F.field_k >= ha.field_b) {
                        this.b(-((em) this).field_V + ((em) this).field_D, -4218);
                        break L4;
                      } else {
                        this.b(((em) this).field_V + ((em) this).field_D, -4218);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    if (!((em) this).field_X) {
                      if (ei.field_K > (((em) this).field_F.field_n >> 1) + (param2 - -((em) this).field_F.field_j)) {
                        this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
                        break L4;
                      } else {
                        this.b(-((em) this).field_M + ((em) this).field_E, (byte) -121);
                        break L4;
                      }
                    } else {
                      var6 = -(((em) this).field_F.field_i >> 1) + -((em) this).field_F.field_k + -((em) this).field_k + (-param3 + ha.field_b);
                      var7 = -((em) this).field_j + ei.field_K + (-param2 - (((em) this).field_F.field_n >> 1) - ((em) this).field_F.field_j);
                      if (Math.abs(var7) <= Math.abs(var6)) {
                        if (0 >= var6) {
                          this.b(((em) this).field_D + -((em) this).field_V, -4218);
                          break L4;
                        } else {
                          this.b(((em) this).field_D + ((em) this).field_V, -4218);
                          break L4;
                        }
                      } else {
                        if (var7 <= 0) {
                          this.b(((em) this).field_E - ((em) this).field_M, (byte) -121);
                          break L4;
                        } else {
                          this.b(((em) this).field_M + ((em) this).field_E, (byte) -121);
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
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("em.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (!((em) this).field_T) {
                  break L1;
                } else {
                  if (!((em) this).field_F.e(-17741)) {
                    break L1;
                  } else {
                    if (param1 != 98) {
                      if (99 == param1) {
                        this.b(((em) this).field_E + ((em) this).field_W, (byte) -121);
                        stackOut_39_0 = 1;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0 != 0;
                      } else {
                        if (param1 != 96) {
                          if (97 == param1) {
                            this.b(((em) this).field_G + ((em) this).field_D, -4218);
                            stackOut_37_0 = 1;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0 != 0;
                          } else {
                            if (param1 != 104) {
                              if (105 == param1) {
                                int discarded$2 = -49;
                                this.b(((em) this).field_E + this.h(), (byte) -121);
                                stackOut_35_0 = 1;
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0 != 0;
                              } else {
                                if (param1 == 102) {
                                  L2: {
                                    if (!((em) this).field_Q) {
                                      break L2;
                                    } else {
                                      if (!bo.field_p[82]) {
                                        break L2;
                                      } else {
                                        this.b(0, (byte) -121);
                                        stackOut_30_0 = 1;
                                        stackIn_31_0 = stackOut_30_0;
                                        return stackIn_31_0 != 0;
                                      }
                                    }
                                  }
                                  if (!((em) this).field_X) {
                                    break L1;
                                  } else {
                                    this.b(0, -4218);
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    return stackIn_34_0 != 0;
                                  }
                                } else {
                                  if (param1 != 103) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!((em) this).field_Q) {
                                        break L3;
                                      } else {
                                        if (bo.field_p[82]) {
                                          this.b(65536, (byte) -121);
                                          stackOut_26_0 = 1;
                                          stackIn_27_0 = stackOut_26_0;
                                          return stackIn_27_0 != 0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    if (!((em) this).field_X) {
                                      break L1;
                                    } else {
                                      this.b(65536, -4218);
                                      stackOut_24_0 = 1;
                                      stackIn_25_0 = stackOut_24_0;
                                      return stackIn_25_0 != 0;
                                    }
                                  }
                                }
                              }
                            } else {
                              int discarded$3 = -49;
                              this.b(((em) this).field_E + -this.h(), (byte) -121);
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            }
                          }
                        } else {
                          this.b(((em) this).field_D + -((em) this).field_G, -4218);
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      }
                    } else {
                      this.b(((em) this).field_E - ((em) this).field_W, (byte) -121);
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
              }
              stackOut_41_0 = 0;
              stackIn_42_0 = stackOut_41_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var5;
            stackOut_43_1 = new StringBuilder().append("em.I(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L4;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param3 + ')');
        }
        return stackIn_42_0 != 0;
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

    private final void a() {
        int var2 = null == ((em) this).field_S ? ((em) this).field_I.field_j : ((em) this).field_S.field_n + ((em) this).field_S.field_j;
        int var3 = null != ((em) this).field_C ? ((em) this).field_C.field_j + -((em) this).field_F.field_n : -((em) this).field_F.field_n + (((em) this).field_I.field_j + ((em) this).field_I.field_n);
        ((em) this).field_F.field_j = var2 + ((var3 - var2) * ((em) this).field_E >> 16);
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
          ((em) this).field_F.field_k = ((-var2 + var3) * ((em) this).field_D >> 16) + var2;
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
          ((em) this).field_F.field_k = ((-var2 + var3) * ((em) this).field_D >> 16) + var2;
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

    final static vn i() {
        int var5_int = 0;
        int var6 = ZombieDawn.field_J;
        int var1 = uf.field_n[0] * bn.field_c[0];
        int var2 = 0;
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
          if (param0 >= 0) {
            if (param0 <= 65536) {
              ((em) this).field_E = param0;
              int discarded$6 = -734046384;
              this.a();
              return;
            } else {
              ((em) this).field_E = 65536;
              int discarded$7 = -734046384;
              this.a();
              return;
            }
          } else {
            ((em) this).field_E = 0;
            int discarded$8 = -734046384;
            this.a();
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, byte param1) {
        ((em) this).a(param0, (byte) -77);
        if (!(!(((em) this).field_v instanceof un))) {
            ((un) (Object) ((em) this).field_v).a(((em) this).field_E, ((em) this).field_E, (em) this, 13483);
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
          stackOut_0_0 = ((em) this).field_I;
          stackIn_42_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_42_0 = (an) (Object) stackIn_42_0;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L0;
          } else {
            stackOut_1_0 = (an) (Object) stackIn_1_0;
            stackIn_43_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!((em) this).field_X) {
              stackOut_43_0 = (an) (Object) stackIn_43_0;
              stackOut_43_1 = 0;
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_C = true;
                if (((em) this).field_F.field_z instanceof an) {
                  stackOut_4_0 = (an) (Object) ((em) this).field_F.field_z;
                  stackIn_17_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param0) {
                    L2: {
                      stackOut_17_0 = (an) (Object) stackIn_17_0;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!((em) this).field_X) {
                        stackOut_19_0 = (an) (Object) stackIn_19_0;
                        stackOut_19_1 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L2;
                      } else {
                        stackOut_18_0 = (an) (Object) stackIn_18_0;
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
                        L5: {
                          stackOut_10_0 = ((em) this).field_C;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (!param0) {
                            stackOut_12_0 = (an) (Object) stackIn_12_0;
                            stackOut_12_1 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L5;
                          } else {
                            stackOut_11_0 = (an) (Object) stackIn_11_0;
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
                        ((em) this).field_C = null;
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((em) this).field_S) {
                L7: {
                  if (((em) this).field_C == null) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_34_0 = ((em) this).field_C;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (!param0) {
                        stackOut_36_0 = (an) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L8;
                      } else {
                        stackOut_35_0 = (an) (Object) stackIn_35_0;
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
                    ((em) this).field_C = null;
                    break L9;
                  }
                }
                return;
              } else {
                L10: {
                  stackOut_22_0 = ((em) this).field_S;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (!param0) {
                    stackOut_24_0 = (an) (Object) stackIn_24_0;
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L10;
                  } else {
                    stackOut_23_0 = (an) (Object) stackIn_23_0;
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L10;
                  }
                }
                L11: {
                  stackIn_25_0.field_C = stackIn_25_1 != 0;
                  if (((em) this).field_C == null) {
                    break L11;
                  } else {
                    L12: {
                      stackOut_26_0 = ((em) this).field_C;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (!param0) {
                        stackOut_28_0 = (an) (Object) stackIn_28_0;
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L12;
                      } else {
                        stackOut_27_0 = (an) (Object) stackIn_27_0;
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
                    ((em) this).field_C = null;
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
          if (((em) this).field_F.field_z instanceof an) {
            L15: {
              stackOut_46_0 = (an) (Object) ((em) this).field_F.field_z;
              stackIn_64_0 = stackOut_46_0;
              stackIn_47_0 = stackOut_46_0;
              if (param0) {
                stackOut_64_0 = (an) (Object) stackIn_64_0;
                stackOut_64_1 = 1;
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                break L15;
              } else {
                stackOut_47_0 = (an) (Object) stackIn_47_0;
                stackIn_65_0 = stackOut_47_0;
                stackIn_48_0 = stackOut_47_0;
                if (!((em) this).field_X) {
                  stackOut_65_0 = (an) (Object) stackIn_65_0;
                  stackOut_65_1 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  break L15;
                } else {
                  L16: {
                    stackIn_48_0.field_C = true;
                    if (null == ((em) this).field_S) {
                      break L16;
                    } else {
                      L17: {
                        stackOut_49_0 = ((em) this).field_S;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (!param0) {
                          stackOut_51_0 = (an) (Object) stackIn_51_0;
                          stackOut_51_1 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        } else {
                          stackOut_50_0 = (an) (Object) stackIn_50_0;
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
                  if (((em) this).field_C == null) {
                    if (param1 != 30789) {
                      ((em) this).field_C = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L18: {
                      stackOut_54_0 = ((em) this).field_C;
                      stackIn_56_0 = stackOut_54_0;
                      stackIn_55_0 = stackOut_54_0;
                      if (!param0) {
                        stackOut_56_0 = (an) (Object) stackIn_56_0;
                        stackOut_56_1 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        break L18;
                      } else {
                        stackOut_55_0 = (an) (Object) stackIn_55_0;
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
                        ((em) this).field_C = null;
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
        if (null == ((em) this).field_S) {
          if (((em) this).field_C == null) {
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            L20: {
              stackOut_83_0 = ((em) this).field_C;
              stackIn_85_0 = stackOut_83_0;
              stackIn_84_0 = stackOut_83_0;
              if (!param0) {
                stackOut_85_0 = (an) (Object) stackIn_85_0;
                stackOut_85_1 = 0;
                stackIn_86_0 = stackOut_85_0;
                stackIn_86_1 = stackOut_85_1;
                break L20;
              } else {
                stackOut_84_0 = (an) (Object) stackIn_84_0;
                stackOut_84_1 = 1;
                stackIn_86_0 = stackOut_84_0;
                stackIn_86_1 = stackOut_84_1;
                break L20;
              }
            }
            stackIn_86_0.field_C = stackIn_86_1 != 0;
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          }
        } else {
          L21: {
            stackOut_68_0 = ((em) this).field_S;
            stackIn_70_0 = stackOut_68_0;
            stackIn_69_0 = stackOut_68_0;
            if (!param0) {
              stackOut_70_0 = (an) (Object) stackIn_70_0;
              stackOut_70_1 = 0;
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              break L21;
            } else {
              stackOut_69_0 = (an) (Object) stackIn_69_0;
              stackOut_69_1 = 1;
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              break L21;
            }
          }
          stackIn_71_0.field_C = stackIn_71_1 != 0;
          if (((em) this).field_C == null) {
            if (param1 != 30789) {
              ((em) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            L22: {
              stackOut_72_0 = ((em) this).field_C;
              stackIn_74_0 = stackOut_72_0;
              stackIn_73_0 = stackOut_72_0;
              if (!param0) {
                stackOut_74_0 = (an) (Object) stackIn_74_0;
                stackOut_74_1 = 0;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                break L22;
              } else {
                stackOut_73_0 = (an) (Object) stackIn_73_0;
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
                ((em) this).field_C = null;
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
              if (param3 != 1) {
                break L1;
              } else {
                if (((em) this).field_T) {
                  L2: {
                    if (!((em) this).field_Q) {
                      break L2;
                    } else {
                      if (((em) this).field_S == param2) {
                        this.b(((em) this).field_E + -((em) this).field_W, (byte) -121);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!((em) this).field_Q) {
                      break L3;
                    } else {
                      if (((em) this).field_C != param2) {
                        break L3;
                      } else {
                        this.b(((em) this).field_W + ((em) this).field_E, (byte) -121);
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (!((em) this).field_X) {
                      break L4;
                    } else {
                      if (param2 != ((em) this).field_L) {
                        break L4;
                      } else {
                        this.b(-((em) this).field_G + ((em) this).field_D, param1 ^ 4220);
                        break L1;
                      }
                    }
                  }
                  if (!((em) this).field_X) {
                    break L1;
                  } else {
                    if (param2 != ((em) this).field_N) {
                      break L1;
                    } else {
                      this.b(((em) this).field_G + ((em) this).field_D, -4218);
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
                ((em) this).field_Q = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("em.K(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 <= param2) {
          ((em) this).field_F.a(26, ((em) this).field_F.field_j, ((em) this).field_F.field_k, ((em) this).field_F.field_i, ((em) this).field_I.field_n);
          this.a(false, param0 ^ -3989);
          int discarded$4 = -734046384;
          this.a();
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
          int discarded$5 = -734046384;
          this.a();
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

    private final int h() {
        return (((em) this).field_F.field_n << 16) / ((em) this).field_I.field_n;
    }

    em(int param0, int param1, int param2, int param3, io param4, io param5, io param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
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
        ((em) this).field_R = 0;
        ((em) this).field_M = 8192;
        ((em) this).field_D = 32768;
        ((em) this).field_G = 1024;
        ((em) this).field_V = 8192;
        ((em) this).field_W = 1024;
        ((em) this).field_O = 0;
        ((em) this).field_T = true;
        ((em) this).field_E = 32768;
        try {
          L0: {
            L1: {
              ((em) this).field_B = new ga[6];
              ij dupTemp$2 = new ij(param0, param1, param7, param8, (io) null, (sk) null, (ga) (Object) new an(0, 0, param7, param8, param6, (sk) null), false, false);
              ((em) this).field_F = dupTemp$2;
              ((em) this).field_B[0] = (ga) (Object) dupTemp$2;
              an dupTemp$3 = new an(param0, param1, param7, param8, param5, (sk) null);
              ((em) this).field_I = dupTemp$3;
              ((em) this).field_B[1] = (ga) (Object) dupTemp$3;
              ((em) this).field_O = param9;
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
              ((em) this).field_X = stackIn_4_1 != 0;
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
            ((em) this).field_Q = stackIn_7_1 != 0;
            ((em) this).field_R = param10;
            this.a(param13, -89);
            ((em) this).a(param14, (byte) -95);
            ((em) this).a(-119, param1, param0, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var16;
            stackOut_9_1 = new StringBuilder().append("em.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void k() {
        int var2 = null == ((em) this).field_L ? ((em) this).field_I.field_k : ((em) this).field_L.field_i + ((em) this).field_L.field_k;
        int var3 = null == ((em) this).field_N ? -((em) this).field_F.field_i + (((em) this).field_I.field_i + ((em) this).field_I.field_k) : -((em) this).field_F.field_i + ((em) this).field_N.field_k;
        this.a(var2 < var3 ? (((em) this).field_F.field_k + -var2 << 16) / (var3 + -var2) : 0, 89);
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
              var3 = ((em) this).field_F;
              if (var3 == null) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (((ga) (Object) var3).a((byte) 104, param1)) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("em.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
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
            ((em) this).field_L.field_j = -((em) this).field_L.field_n + ((em) this).field_n >> 1;
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
            ((em) this).field_N.field_j = -((em) this).field_N.field_n + ((em) this).field_n >> 1;
            ((em) this).field_I.field_i = -((em) this).field_N.field_i + (((em) this).field_i + -((em) this).field_I.field_k);
            break L1;
          }
        }
        if (param0 >= 38) {
          this.f((byte) -119);
          if (((em) this).field_S != null) {
            ((em) this).field_S.field_j = 0;
            ((em) this).field_S.field_k = ((em) this).field_i + -((em) this).field_S.field_i >> 1;
            ((em) this).field_I.field_j = ((em) this).field_S.field_j + ((em) this).field_S.field_n;
            if (null == ((em) this).field_C) {
              ((em) this).field_I.field_n = ((em) this).field_n + -((em) this).field_I.field_j;
              int discarded$4 = -734046384;
              this.a();
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
                ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> 1;
                ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
                ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
                int discarded$5 = -734046384;
                this.a();
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
                ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> 1;
                ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
                ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
                break L6;
              }
            }
            int discarded$6 = -734046384;
            this.a();
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
              ((em) this).field_S.field_k = ((em) this).field_i + -((em) this).field_S.field_i >> 1;
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
              ((em) this).field_C.field_k = ((em) this).field_i - ((em) this).field_C.field_i >> 1;
              ((em) this).field_C.field_j = -((em) this).field_C.field_n + ((em) this).field_n;
              ((em) this).field_I.field_n = -((em) this).field_C.field_n + ((em) this).field_n + -((em) this).field_I.field_j;
              break L10;
            }
          }
          int discarded$7 = -734046384;
          this.a();
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
        an stackIn_6_0 = null;
        an stackIn_7_0 = null;
        an stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        an stackIn_11_0 = null;
        an stackIn_12_0 = null;
        an stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        an stackIn_17_0 = null;
        an stackIn_18_0 = null;
        an stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        an stackIn_21_0 = null;
        an stackIn_24_0 = null;
        an stackIn_25_0 = null;
        an stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        an stackIn_30_0 = null;
        an stackIn_31_0 = null;
        an stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        an stackIn_38_0 = null;
        an stackIn_39_0 = null;
        an stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        an stackIn_44_0 = null;
        an stackIn_45_0 = null;
        an stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        an stackIn_48_0 = null;
        an stackIn_49_0 = null;
        an stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        an stackIn_53_0 = null;
        an stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        an stackIn_58_0 = null;
        an stackIn_59_0 = null;
        an stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        an stackIn_64_0 = null;
        an stackIn_65_0 = null;
        an stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        an stackIn_68_0 = null;
        an stackIn_69_0 = null;
        an stackIn_72_0 = null;
        an stackIn_73_0 = null;
        an stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        an stackIn_78_0 = null;
        an stackIn_79_0 = null;
        an stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        an stackIn_82_0 = null;
        an stackIn_85_0 = null;
        an stackIn_86_0 = null;
        an stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        an stackIn_91_0 = null;
        an stackIn_92_0 = null;
        an stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        an stackIn_99_0 = null;
        an stackIn_100_0 = null;
        an stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        an stackIn_105_0 = null;
        an stackIn_106_0 = null;
        an stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        an stackOut_1_0 = null;
        an stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        an stackOut_4_0 = null;
        an stackOut_23_0 = null;
        an stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        an stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        an stackOut_29_0 = null;
        an stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        an stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        an stackOut_5_0 = null;
        an stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        an stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        an stackOut_10_0 = null;
        an stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        an stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        an stackOut_16_0 = null;
        an stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        an stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        an stackOut_37_0 = null;
        an stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        an stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        an stackOut_43_0 = null;
        an stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        an stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        an stackOut_52_0 = null;
        an stackOut_68_0 = null;
        an stackOut_84_0 = null;
        an stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        an stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        an stackOut_90_0 = null;
        an stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        an stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        an stackOut_71_0 = null;
        an stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        an stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        an stackOut_77_0 = null;
        an stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        an stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        an stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        an stackOut_57_0 = null;
        an stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        an stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        an stackOut_63_0 = null;
        an stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        an stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        an stackOut_98_0 = null;
        an stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        an stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        an stackOut_104_0 = null;
        an stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        an stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        L0: {
          stackOut_0_0 = ((em) this).field_I;
          stackIn_48_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_48_0 = (an) (Object) stackIn_48_0;
            stackOut_48_1 = 1;
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            break L0;
          } else {
            stackOut_1_0 = (an) (Object) stackIn_1_0;
            stackIn_49_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!((em) this).field_Q) {
              stackOut_49_0 = (an) (Object) stackIn_49_0;
              stackOut_49_1 = 0;
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              break L0;
            } else {
              stackIn_2_0.field_C = true;
              if (((em) this).field_F.field_z instanceof an) {
                stackOut_4_0 = (an) (Object) ((em) this).field_F.field_z;
                stackIn_21_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param1) {
                  L1: {
                    stackIn_21_0.field_C = true;
                    if (null != ((em) this).field_L) {
                      L2: {
                        stackOut_23_0 = ((em) this).field_L;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (!param1) {
                          stackOut_25_0 = (an) (Object) stackIn_25_0;
                          stackOut_25_1 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          break L2;
                        } else {
                          stackOut_24_0 = (an) (Object) stackIn_24_0;
                          stackOut_24_1 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          break L2;
                        }
                      }
                      stackIn_26_0.field_C = stackIn_26_1 != 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L3: {
                    if (null != ((em) this).field_N) {
                      L4: {
                        stackOut_29_0 = ((em) this).field_N;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (!param1) {
                          stackOut_31_0 = (an) (Object) stackIn_31_0;
                          stackOut_31_1 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          break L4;
                        } else {
                          stackOut_30_0 = (an) (Object) stackIn_30_0;
                          stackOut_30_1 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_32_1 = stackOut_30_1;
                          break L4;
                        }
                      }
                      stackIn_32_0.field_C = stackIn_32_1 != 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    stackOut_5_0 = (an) (Object) stackIn_5_0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (!((em) this).field_Q) {
                      stackOut_7_0 = (an) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L5;
                    } else {
                      stackOut_6_0 = (an) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L5;
                    }
                  }
                  L6: {
                    stackIn_8_0.field_C = stackIn_8_1 != 0;
                    if (null != ((em) this).field_L) {
                      L7: {
                        stackOut_10_0 = ((em) this).field_L;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (!param1) {
                          stackOut_12_0 = (an) (Object) stackIn_12_0;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L7;
                        } else {
                          stackOut_11_0 = (an) (Object) stackIn_11_0;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L7;
                        }
                      }
                      stackIn_13_0.field_C = stackIn_13_1 != 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    if (null != ((em) this).field_N) {
                      L9: {
                        stackOut_16_0 = ((em) this).field_N;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (!param1) {
                          stackOut_18_0 = (an) (Object) stackIn_18_0;
                          stackOut_18_1 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          break L9;
                        } else {
                          stackOut_17_0 = (an) (Object) stackIn_17_0;
                          stackOut_17_1 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          break L9;
                        }
                      }
                      stackIn_19_0.field_C = stackIn_19_1 != 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  if (null != ((em) this).field_L) {
                    L11: {
                      stackOut_37_0 = ((em) this).field_L;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (!param1) {
                        stackOut_39_0 = (an) (Object) stackIn_39_0;
                        stackOut_39_1 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        break L11;
                      } else {
                        stackOut_38_0 = (an) (Object) stackIn_38_0;
                        stackOut_38_1 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L11;
                      }
                    }
                    stackIn_40_0.field_C = stackIn_40_1 != 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L12: {
                  if (null != ((em) this).field_N) {
                    L13: {
                      stackOut_43_0 = ((em) this).field_N;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_44_0 = stackOut_43_0;
                      if (!param1) {
                        stackOut_45_0 = (an) (Object) stackIn_45_0;
                        stackOut_45_1 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        break L13;
                      } else {
                        stackOut_44_0 = (an) (Object) stackIn_44_0;
                        stackOut_44_1 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        break L13;
                      }
                    }
                    stackIn_46_0.field_C = stackIn_46_1 != 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            }
          }
        }
        stackIn_50_0.field_C = stackIn_50_1 != 0;
        if (((em) this).field_F.field_z instanceof an) {
          stackOut_52_0 = (an) (Object) ((em) this).field_F.field_z;
          stackIn_68_0 = stackOut_52_0;
          stackIn_53_0 = stackOut_52_0;
          if (!param1) {
            stackOut_68_0 = (an) (Object) stackIn_68_0;
            stackIn_82_0 = stackOut_68_0;
            stackIn_69_0 = stackOut_68_0;
            if (((em) this).field_Q) {
              L14: {
                stackIn_82_0.field_C = true;
                if (null != ((em) this).field_L) {
                  L15: {
                    stackOut_84_0 = ((em) this).field_L;
                    stackIn_86_0 = stackOut_84_0;
                    stackIn_85_0 = stackOut_84_0;
                    if (!param1) {
                      stackOut_86_0 = (an) (Object) stackIn_86_0;
                      stackOut_86_1 = 0;
                      stackIn_87_0 = stackOut_86_0;
                      stackIn_87_1 = stackOut_86_1;
                      break L15;
                    } else {
                      stackOut_85_0 = (an) (Object) stackIn_85_0;
                      stackOut_85_1 = 1;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_87_1 = stackOut_85_1;
                      break L15;
                    }
                  }
                  stackIn_87_0.field_C = stackIn_87_1 != 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L16: {
                if (null != ((em) this).field_N) {
                  L17: {
                    stackOut_90_0 = ((em) this).field_N;
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_91_0 = stackOut_90_0;
                    if (!param1) {
                      stackOut_92_0 = (an) (Object) stackIn_92_0;
                      stackOut_92_1 = 0;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      break L17;
                    } else {
                      stackOut_91_0 = (an) (Object) stackIn_91_0;
                      stackOut_91_1 = 1;
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_93_1 = stackOut_91_1;
                      break L17;
                    }
                  }
                  stackIn_93_0.field_C = stackIn_93_1 != 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            } else {
              L18: {
                stackIn_69_0.field_C = false;
                if (null != ((em) this).field_L) {
                  L19: {
                    stackOut_71_0 = ((em) this).field_L;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_72_0 = stackOut_71_0;
                    if (!param1) {
                      stackOut_73_0 = (an) (Object) stackIn_73_0;
                      stackOut_73_1 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      break L19;
                    } else {
                      stackOut_72_0 = (an) (Object) stackIn_72_0;
                      stackOut_72_1 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      break L19;
                    }
                  }
                  stackIn_74_0.field_C = stackIn_74_1 != 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L20: {
                if (null != ((em) this).field_N) {
                  L21: {
                    stackOut_77_0 = ((em) this).field_N;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_78_0 = stackOut_77_0;
                    if (!param1) {
                      stackOut_79_0 = (an) (Object) stackIn_79_0;
                      stackOut_79_1 = 0;
                      stackIn_80_0 = stackOut_79_0;
                      stackIn_80_1 = stackOut_79_1;
                      break L21;
                    } else {
                      stackOut_78_0 = (an) (Object) stackIn_78_0;
                      stackOut_78_1 = 1;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      break L21;
                    }
                  }
                  stackIn_80_0.field_C = stackIn_80_1 != 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              return;
            }
          } else {
            stackOut_53_0 = (an) (Object) stackIn_53_0;
            stackOut_53_1 = 1;
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            L22: {
              stackIn_55_0.field_C = stackIn_55_1 != 0;
              if (null != ((em) this).field_L) {
                L23: {
                  stackOut_57_0 = ((em) this).field_L;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_58_0 = stackOut_57_0;
                  if (!param1) {
                    stackOut_59_0 = (an) (Object) stackIn_59_0;
                    stackOut_59_1 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L23;
                  } else {
                    stackOut_58_0 = (an) (Object) stackIn_58_0;
                    stackOut_58_1 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    break L23;
                  }
                }
                stackIn_60_0.field_C = stackIn_60_1 != 0;
                break L22;
              } else {
                break L22;
              }
            }
            L24: {
              if (null != ((em) this).field_N) {
                L25: {
                  stackOut_63_0 = ((em) this).field_N;
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_64_0 = stackOut_63_0;
                  if (!param1) {
                    stackOut_65_0 = (an) (Object) stackIn_65_0;
                    stackOut_65_1 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    break L25;
                  } else {
                    stackOut_64_0 = (an) (Object) stackIn_64_0;
                    stackOut_64_1 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    break L25;
                  }
                }
                stackIn_66_0.field_C = stackIn_66_1 != 0;
                break L24;
              } else {
                break L24;
              }
            }
            return;
          }
        } else {
          L26: {
            if (null != ((em) this).field_L) {
              L27: {
                stackOut_98_0 = ((em) this).field_L;
                stackIn_100_0 = stackOut_98_0;
                stackIn_99_0 = stackOut_98_0;
                if (!param1) {
                  stackOut_100_0 = (an) (Object) stackIn_100_0;
                  stackOut_100_1 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  break L27;
                } else {
                  stackOut_99_0 = (an) (Object) stackIn_99_0;
                  stackOut_99_1 = 1;
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_101_1 = stackOut_99_1;
                  break L27;
                }
              }
              stackIn_101_0.field_C = stackIn_101_1 != 0;
              break L26;
            } else {
              break L26;
            }
          }
          L28: {
            if (null != ((em) this).field_N) {
              L29: {
                stackOut_104_0 = ((em) this).field_N;
                stackIn_106_0 = stackOut_104_0;
                stackIn_105_0 = stackOut_104_0;
                if (!param1) {
                  stackOut_106_0 = (an) (Object) stackIn_106_0;
                  stackOut_106_1 = 0;
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  break L29;
                } else {
                  stackOut_105_0 = (an) (Object) stackIn_105_0;
                  stackOut_105_1 = 1;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_107_1 = stackOut_105_1;
                  break L29;
                }
              }
              stackIn_107_0.field_C = stackIn_107_1 != 0;
              break L28;
            } else {
              break L28;
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
          if (param0 > 65536) {
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
