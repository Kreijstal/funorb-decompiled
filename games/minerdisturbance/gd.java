/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends um {
    static long field_s;
    static String field_z;
    static int field_y;
    static int field_x;
    static boolean field_w;
    static String[] field_C;
    static boolean field_B;
    static String field_t;
    private di field_u;
    ta field_v;
    static String field_A;
    hg field_r;

    private final void a(int param0, int param1, int param2, cg param3, int[] param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rc var11 = null;
        int var12 = 0;
        di stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        di stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        di stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        di stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        di stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        di stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!param5) {
              L1: {
                if ((this.field_u.field_v[param3.field_n] & 4) == 0) {
                  break L1;
                } else {
                  if ((param3.field_G ^ -1) > -1) {
                    var7_int = this.field_u.field_u[param3.field_n] / fj.field_r;
                    L2: while (true) {
                      var8 = (-param3.field_B + (1048575 - -var7_int)) / var7_int;
                      if (param1 >= var8) {
                        L3: {
                          param3.field_w.a(param4, param0, var8);
                          param1 = param1 - var8;
                          param0 = param0 + var8;
                          param3.field_B = param3.field_B + (-1048576 + var7_int * var8);
                          var9 = fj.field_r / 100;
                          var10 = 262144 / var7_int;
                          if (var10 >= var9) {
                            break L3;
                          } else {
                            var9 = var10;
                            break L3;
                          }
                        }
                        L4: {
                          var11 = param3.field_w;
                          if (this.field_u.field_Y[param3.field_n] == 0) {
                            param3.field_w = rc.a(param3.field_D, var11.h(), var11.i(), var11.e());
                            break L4;
                          } else {
                            L5: {
                              param3.field_w = rc.a(param3.field_D, var11.h(), 0, var11.e());
                              stackOut_12_0 = this.field_u;
                              stackOut_12_1 = 255;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              if (0 <= param3.field_I.field_t[param3.field_F]) {
                                stackOut_14_0 = (di) ((Object) stackIn_14_0);
                                stackOut_14_1 = stackIn_14_1;
                                stackOut_14_2 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                stackIn_15_2 = stackOut_14_2;
                                break L5;
                              } else {
                                stackOut_13_0 = (di) ((Object) stackIn_13_0);
                                stackOut_13_1 = stackIn_13_1;
                                stackOut_13_2 = 1;
                                stackIn_15_0 = stackOut_13_0;
                                stackIn_15_1 = stackOut_13_1;
                                stackIn_15_2 = stackOut_13_2;
                                break L5;
                              }
                            }
                            ((di) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, param3);
                            param3.field_w.c(var9, var11.i());
                            break L4;
                          }
                        }
                        L6: {
                          if ((param3.field_I.field_t[param3.field_F] ^ -1) <= -1) {
                            break L6;
                          } else {
                            param3.field_w.i(-1);
                            break L6;
                          }
                        }
                        var11.g(var9);
                        var11.a(param4, param0, -param0 + param2);
                        if (var11.j()) {
                          this.field_r.b(var11);
                          continue L2;
                        } else {
                          continue L2;
                        }
                      } else {
                        param3.field_B = param3.field_B + var7_int * param1;
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              param3.field_w.a(param4, param0, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var7);
            stackOut_25_1 = new StringBuilder().append("gd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        cg var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        this.field_r.a(param0);
        var3 = (cg) ((Object) this.field_v.b(73));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (this.field_u.a(var3, -24)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_M >= var2) {
                    this.a((byte) 100, var2, var3);
                    var3.field_M = var3.field_M - var2;
                    break L1;
                  } else {
                    this.a((byte) 122, var3.field_M, var3);
                    var2 = var2 - var3.field_M;
                    if (!this.field_u.a(var2, var3, 1387831944, (int[]) null, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (cg) ((Object) this.field_v.b((byte) 56));
            continue L0;
          }
        }
    }

    final int d() {
        return 0;
    }

    private final void a(byte param0, int param1, cg param2) {
        short[] discarded$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        short[] var6 = null;
        di stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        di stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        di stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        di stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        di stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if ((4 & this.field_u.field_v[param2.field_n]) == 0) {
                break L1;
              } else {
                if ((param2.field_G ^ -1) <= -1) {
                  break L1;
                } else {
                  var4_int = this.field_u.field_u[param2.field_n] / fj.field_r;
                  var5 = (-param2.field_B + (var4_int + 1048575)) / var4_int;
                  param2.field_B = 1048575 & var4_int * param1 + param2.field_B;
                  if (param1 < var5) {
                    break L1;
                  } else {
                    L2: {
                      if (-1 == (this.field_u.field_Y[param2.field_n] ^ -1)) {
                        param2.field_w = rc.a(param2.field_D, param2.field_w.h(), param2.field_w.i(), param2.field_w.e());
                        break L2;
                      } else {
                        L3: {
                          param2.field_w = rc.a(param2.field_D, param2.field_w.h(), 0, param2.field_w.e());
                          stackOut_4_0 = this.field_u;
                          stackOut_4_1 = 255;
                          stackIn_6_0 = stackOut_4_0;
                          stackIn_6_1 = stackOut_4_1;
                          stackIn_5_0 = stackOut_4_0;
                          stackIn_5_1 = stackOut_4_1;
                          if (param2.field_I.field_t[param2.field_F] >= 0) {
                            stackOut_6_0 = (di) ((Object) stackIn_6_0);
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            break L3;
                          } else {
                            stackOut_5_0 = (di) ((Object) stackIn_5_0);
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
                            break L3;
                          }
                        }
                        ((di) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2 != 0, param2);
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_I.field_t[param2.field_F] < 0) {
                        param2.field_w.i(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param2.field_B / var4_int;
                    break L1;
                  }
                }
              }
            }
            L5: {
              param2.field_w.a(param1);
              if (param0 > 64) {
                break L5;
              } else {
                var6 = (short[]) null;
                discarded$1 = gd.a((ld) null, 110, -27, (short[]) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("gd.H(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final um c() {
        cg var1_ref = null;
        do {
            var1_ref = (cg) ((Object) this.field_v.b((byte) 56));
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_w == null);
        return (um) ((Object) var1_ref.field_w);
    }

    final static boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -95) {
          L0: {
            L1: {
              if (ci.field_i == null) {
                break L1;
              } else {
                if (qd.field_Q != pb.field_c) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        field_t = null;
        if (param0 != -114) {
            return;
        }
        field_C = null;
    }

    final static short[] a(ld param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 <= -54) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            var4_int = param0.c((byte) -122, param1);
            if (-1 != (var4_int ^ -1)) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (var4_int != param3.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.c((byte) -82, 4);
                var6 = (short)param0.c((byte) -123, 16);
                if (0 < var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (short)(param0.c((byte) -70, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (short[]) (param3);
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("gd.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            this.field_r.a(param0, param1, param2);
            var6 = (cg) ((Object) this.field_v.b(90));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_u.a(var6, -75)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_M) {
                        this.a(var4_int, var5, var4_int - -var5, var6, param0, false);
                        var6.field_M = var6.field_M - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var6.field_M, var4_int - -var5, var6, param0, false);
                        var4_int = var4_int + var6.field_M;
                        var5 = var5 - var6.field_M;
                        if (!this.field_u.a(var5, var6, 1387831944, param0, var4_int)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (cg) ((Object) this.field_v.b((byte) 56));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("gd.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(boolean param0, int param1, ob param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 104 % ((-3 - param1) / 48);
            stackOut_0_0 = param2.c(param0, true);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("gd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final um b() {
        cg var1 = (cg) ((Object) this.field_v.b(97));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (um) ((Object) var1.field_w);
        }
        return this.c();
    }

    gd(di param0) {
        this.field_v = new ta();
        this.field_r = new hg();
        try {
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = "3x multiplier: Triples all points. Combines with 2x muliplier to make a 6x multiplier!";
        field_A = "<%0> <times> 250 = <%1>";
        field_t = "Tips: ";
        field_C = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
