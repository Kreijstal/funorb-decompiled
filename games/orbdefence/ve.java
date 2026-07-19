/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ej {
    private String field_P;
    private boolean field_R;
    static int[] field_N;
    static int field_Q;
    private String field_S;
    static jc field_O;
    private dg field_T;
    static int[] field_V;
    private boolean field_U;

    public static void f(boolean param0) {
        if (param0) {
            return;
        }
        field_N = null;
        field_V = null;
        field_O = null;
    }

    ve(sk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_P = param1;
            if (null != this.field_P) {
                var3_int = qc.field_b.a(this.field_P, 260, qc.field_b.field_H);
                this.a(150 + var3_int, (byte) -81, 300);
            }
            this.field_T = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_R = false;
            this.field_T.field_z = true;
            this.field_U = false;
            this.a(this.field_T, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.field_U = true;
        this.field_T.field_z = false;
        if (param0 != 1) {
            hj var3 = (hj) null;
            ve.a(62, -4, (hj) null, -58, 98, -124, (byte) 124, -112);
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5, byte param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        hj var20 = null;
        hj var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_i > param5) {
                param3 = param3 - (ul.field_i + -param5);
                param5 = ul.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ul.field_d > param7) {
                param1 = param1 - (ul.field_d - param7);
                param7 = ul.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ul.field_e < param5 - -param3) {
                param3 = ul.field_e + -param5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param7 - -param1 > ul.field_a) {
                param1 = ul.field_a + -param7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 <= (param3 ^ -1)) {
                break L5;
              } else {
                if (param1 <= 0) {
                  break L5;
                } else {
                  L6: {
                    var22 = param2.f();
                    var31 = ul.field_b;
                    var10 = ul.field_f;
                    var11 = ul.field_l;
                    var30 = new int[4];
                    ul.a(var30);
                    param2.d();
                    ul.i(var30[0], var30[1], var30[2], var30[3]);
                    var13 = param5 - -(param7 * param2.field_o);
                    var14 = -param3 + param2.field_o;
                    var26 = var22.field_v;
                    var23 = var26;
                    var15 = var23;
                    if (param6 >= 52) {
                      break L6;
                    } else {
                      var20 = (hj) null;
                      ve.a(69, -127, (hj) null, 0, -117, 43, (byte) -101, -90);
                      break L6;
                    }
                  }
                  var16 = param7;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var16 >= param1 + param7) {
                          break L9;
                        } else {
                          if (var19 != 0) {
                            break L8;
                          } else {
                            var17 = param5;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (param5 + param3 <= var17) {
                                    break L12;
                                  } else {
                                    var18 = var26[var13];
                                    stackOut_24_0 = -1;
                                    stackOut_24_1 = var18 ^ -1;
                                    stackIn_41_0 = stackOut_24_0;
                                    stackIn_41_1 = stackOut_24_1;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackIn_25_1 = stackOut_24_1;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_25_0 == stackIn_25_1) {
                                          break L13;
                                        } else {
                                          L14: {
                                            L15: {
                                              if ((var17 ^ -1) >= -1) {
                                                break L15;
                                              } else {
                                                if (0 == var15[var13 + -1]) {
                                                  break L14;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (0 >= var16) {
                                                break L16;
                                              } else {
                                                if (0 == var15[var13 + -param2.field_o]) {
                                                  break L14;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (param2.field_o - 1 <= var17) {
                                                break L17;
                                              } else {
                                                if (var15[1 + var13] == 0) {
                                                  break L14;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            if (var16 >= -1 + param2.field_k) {
                                              break L13;
                                            } else {
                                              if (var15[param2.field_o + var13] == 0) {
                                                break L14;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          ul.f(var17, var16, param0, param4);
                                          break L13;
                                        }
                                      }
                                      var13++;
                                      var17++;
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_40_0 = var13;
                                stackOut_40_1 = var14;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                break L11;
                              }
                              var13 = stackIn_41_0 + stackIn_41_1;
                              var16++;
                              if (var19 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      var22.c(-param2.field_p, -param2.field_u);
                      ul.a(var31, var10, var11);
                      ul.b(var30);
                      break L8;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var8);
            stackOut_44_1 = new StringBuilder().append("ve.K(").append(param0).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L18;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L18;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param3 == 2113632) {
              if (param0 != this.field_R) {
                L1: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    ((ve) (this)).field_R = stackIn_7_1 != 0;
                    if (!this.field_R) {
                      break L3;
                    } else {
                      this.field_T.a(16711422, 8405024, 4210752);
                      this.field_T.field_z = true;
                      if (!OrbDefence.field_D) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_T.a(16711422, 2113632, 4210752);
                  if (!this.field_U) {
                    break L2;
                  } else {
                    this.field_T.field_z = false;
                    break L2;
                  }
                }
                this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                this.field_S = param1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                this.field_S = param1;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ve.N(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        super.a(param0, param1, param2);
        qc.field_b.c(this.field_S, param0 - -(this.field_m >> 289864865), param1 + 103, 16777215, -1);
        if (!(null == this.field_P)) {
            ul.d(param0 + 20, param1 - -113, 260, 8421504);
            discarded$0 = qc.field_b.a(this.field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
