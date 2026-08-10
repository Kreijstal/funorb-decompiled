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
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    if (var16 >= param1 + param7) {
                      var22.c(-param2.field_p, -param2.field_u);
                      ul.a(var31, var10, var11);
                      ul.b(var30);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param5;
                      L8: while (true) {
                        if (param5 + param3 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          var18 = var26[var13];
                          if (-1 != (var18 ^ -1)) {
                            L9: {
                              L10: {
                                L11: {
                                  if ((var17 ^ -1) >= -1) {
                                    break L11;
                                  } else {
                                    if (0 == var15[var13 + -1]) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (0 >= var16) {
                                    break L12;
                                  } else {
                                    if (0 == var15[var13 + -param2.field_o]) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (param2.field_o - 1 <= var17) {
                                    break L13;
                                  } else {
                                    if (var15[1 + var13] == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (var16 < -1 + param2.field_k) {
                                  if (var15[param2.field_o + var13] == 0) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  var13++;
                                  var17++;
                                  continue L8;
                                }
                              }
                              ul.f(var17, var16, param0, param4);
                              break L9;
                            }
                            var13++;
                            var17++;
                            continue L8;
                          } else {
                            var13++;
                            var17++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var8);

            stackIn_45_1 = new StringBuilder().append("ve.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 == 2113632) {
              L1: {
                if (param0 != this.field_R) {
                  L2: {
                    stackIn_6_0 = this;

                    if (!param0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ((ve) (this)).field_R = stackIn_7_1 != 0;
                    if (!this.field_R) {
                      this.field_T.a(16711422, 2113632, 4210752);
                      if (!this.field_U) {
                        break L3;
                      } else {
                        this.field_T.field_z = false;
                        break L3;
                      }
                    } else {
                      this.field_T.a(16711422, 8405024, 4210752);
                      this.field_T.field_z = true;
                      break L3;
                    }
                  }
                  this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                  this.field_S = param1;
                  break L1;
                } else {
                  this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                  this.field_S = param1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ve.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        qc.field_b.c(this.field_S, param0 - -(this.field_m >> 289864865), param1 + 103, 16777215, -1);
        if (!(null == this.field_P)) {
            ul.d(param0 + 20, param1 - -113, 260, 8421504);
            qc.field_b.a(this.field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
