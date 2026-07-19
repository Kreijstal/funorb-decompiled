/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tu extends eha {
    static String field_e;
    static volatile int field_h;
    private vna field_c;
    static float field_g;
    ff field_f;
    static String field_d;

    private final boolean a(la param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 47) {
                break L1;
              } else {
                this.field_c = (vna) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_f.b(param2, 0)) {
                  break L3;
                } else {
                  if (!kq.a(-44, param0.q((byte) -82)).field_d) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("tu.Q(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        RuntimeException var7 = null;
        qw var7_ref = null;
        int var8 = 0;
        Object var9 = null;
        String var9_ref = null;
        jha var10 = null;
        la var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              if (ab.field_n == null) {
                break L1;
              } else {
                ab.field_n.field_y.a((byte) -105, 77, -1);
                break L1;
              }
            }
            L2: {
              var7_ref = new qw(param1, param3, param2, param5, param4);
              this.field_c.b((byte) -88, var7_ref);
              var9 = null;
              if (1 != param5) {
                var8 = -10;
                var9_ref = gl.a((byte) 104, uta.field_n, new String[]{String.valueOf(var8)});
                break L2;
              } else {
                var8 = -5;
                var9_ref = gl.a((byte) 107, rf.field_a, new String[]{String.valueOf(var8)});
                break L2;
              }
            }
            L3: {
              param1.h(param0 + -15, var8);
              this.field_f.field_D.a(param5, param1.A(0), param0 + -19);
              if (!this.field_f.j(-1878)) {
                break L3;
              } else {
                if (this.field_f.d(-67)) {
                  break L3;
                } else {
                  if (var9_ref != null) {
                    var10 = ab.a(-48, var9_ref);
                    iqa.field_c.a(3, param0 + -15, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (param0 == 15) {
              break L0;
            } else {
              var11 = (la) null;
              this.a(77, (hca) null, 88, (la) null, -63, 81);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var7);
            stackOut_13_1 = new StringBuilder().append("tu.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, hca param2, fsa param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        hr var6 = null;
        hr var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if ((param0 ^ -1) == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5_int = param0;
                if (var5_int == 0) {
                  var6 = param2.f((byte) 121).a(param2.d(3), param2.e(9648), (byte) 100, 3145728 + param2.g((byte) 115));
                  var6.a(false, 128, 15, 128, 50);
                  var6.a(131072, 0, -107, 0);
                  break L1;
                } else {
                  L2: {
                    if (1 != var5_int) {
                      break L2;
                    } else {
                      if (!TombRacer.field_G) {
                        var7 = param2.f((byte) -109).a(param2.d(3), param2.e(9648), (byte) 100, param2.g((byte) 115) + 3145728);
                        var7.a(false, 128, 16, 128, 50);
                        var7.a(131072, 0, -89, 0);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (2 == var5_int) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 == 15818) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_e = (String) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("tu.E(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            field_d = (String) null;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    final void a(int param0, la param1) {
        if (param0 <= 12) {
            la var4 = (la) null;
            this.a((hca) null, (la) null, false);
        }
        if (null != ab.field_n) {
            ab.field_n.field_y.a((byte) -105, 256, -1);
        }
        if (!(null != this.field_f)) {
            return;
        }
        try {
            this.field_f.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tu.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hca var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_int = param0.w(17825792);
            if (var3_int != -1) {
              var4 = param0.f((byte) -65).u(-90);
              if (param1 == 1) {
                var5 = var3_int;
                if (var5 == 0) {
                  this.field_f.field_D.d(1, 72, var4.A(0));
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("tu.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, hca param1, la param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fsa[] var5 = null;
        fsa[] var6 = null;
        int var7 = 0;
        fsa var8 = null;
        int var9 = 0;
        la var10 = null;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (this.field_f.k(-25319)) {
                    break L3;
                  } else {
                    if (param2 == null) {
                      break L3;
                    } else {
                      if (param2.field_u != null) {
                        L4: {
                          L5: {
                            var4_int = param2.u(-2).A(param0 + 2);
                            if (!param2.j(0)) {
                              break L5;
                            } else {
                              if (!this.field_f.j(param0 + -1876)) {
                                qb.a(var4_int, 5);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          li.b(var4_int, (byte) 116);
                          if (var9 == 0) {
                            break L4;
                          } else {
                            qb.a(var4_int, 5);
                            break L4;
                          }
                        }
                        ff.d(param0 ^ -2, var4_int);
                        var5 = param2.n(16);
                        var6 = var5;
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var6.length) {
                            break L3;
                          } else {
                            var8 = var6[var7];
                            var12 = var8.E((byte) 3) ^ -1;
                            var11 = -2;
                            if (var9 != 0) {
                              if (var11 == var12) {
                                break L1;
                              } else {
                                break L2;
                              }
                            } else {
                              L7: {
                                if (var11 != var12) {
                                  break L7;
                                } else {
                                  qw.a((byte) -32, var4_int);
                                  break L7;
                                }
                              }
                              L8: {
                                if (2 != var8.E((byte) 3)) {
                                  break L8;
                                } else {
                                  mka.a(13, var4_int);
                                  break L8;
                                }
                              }
                              var7++;
                              if (var9 == 0) {
                                continue L6;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -2) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var10 = (la) null;
              this.a(84, (hca) null, 71, (la) null, -32, -21);
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("tu.M(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final qw b(byte param0) {
        int var2 = 0;
        var2 = -114 / ((59 - param0) / 50);
        if (this.field_c.d((byte) 14)) {
          return null;
        } else {
          return (qw) ((Object) this.field_c.c(73));
        }
    }

    void a(hca param0, la param1, boolean param2) {
        jha dupTemp$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jha var9_ref_jha = null;
        int var10 = 0;
        int var11 = 0;
        jha var12 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = kq.a(105, param1.q((byte) -82)).field_h;
              var4_int = var4_int * 2;
              var5 = param1.p((byte) 83);
              if (!param2) {
                break L1;
              } else {
                this.field_f = (ff) null;
                break L1;
              }
            }
            L2: {
              var6 = 50;
              var7 = 0;
              if (var4_int > var5) {
                var7 = (-var5 + var4_int) * 5 / 50;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              param0.h(0, param0.F(-7991) + (var7 + var6));
              var8 = param0.A(0);
              this.field_f.field_F[var8] = (long)var5;
              this.field_f.field_g[var8] = param1.q((byte) -82);
              if (this.field_f.k(-25319)) {
                break L3;
              } else {
                if (this.field_f.j(-1878)) {
                  break L3;
                } else {
                  if (this.field_f.field_x == null) {
                    break L3;
                  } else {
                    if (this.a(param1, (byte) 74, var8)) {
                      break L3;
                    } else {
                      var9 = ll.a(param1.q((byte) -82), 0);
                      if ((var9 ^ -1) > -1) {
                        break L3;
                      } else {
                        this.field_f.field_x[var8].set(var9);
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (!this.field_f.j(-1878)) {
                break L4;
              } else {
                if (!this.field_f.d(-127)) {
                  L5: {
                    L6: {
                      if (0 != var7) {
                        break L6;
                      } else {
                        var9_ref_jha = ab.a(-66, gl.a((byte) 92, gla.field_q, new String[]{String.valueOf(var6)}));
                        if (var11 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var9_ref_jha = ab.a(-89, gl.a((byte) 112, wpa.field_J, new String[]{String.valueOf(var6), String.valueOf(var7)}));
                    break L5;
                  }
                  L7: {
                    iqa.field_c.a(0, var9_ref_jha);
                    var10 = param0.F(-7991);
                    if ((var10 ^ -1) < -1) {
                      dupTemp$1 = ab.a(-96, gl.a((byte) 82, bca.field_c, new String[]{String.valueOf(var10)}));
                      var12 = dupTemp$1;
                      var9_ref_jha = dupTemp$1;
                      iqa.field_c.a(3, 0, var12);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_f.field_I[var8] = true;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L8: {
              if (this.field_f.j(-1878)) {
                break L8;
              } else {
                var9 = 0;
                L9: while (true) {
                  if (var9 >= 3) {
                    break L8;
                  } else {
                    this.field_f.field_D.b(param0.A(0), 65408, gp.field_i[var9] * param0.a(393216, var9));
                    var9++;
                    if (var11 == 0) {
                      continue L9;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("tu.H(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
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
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
        }
    }

    tu(ff param0) {
        try {
            this.field_f = param0;
            this.field_c = new vna();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "<%0> has entered a game.";
        field_d = "White light beams";
        field_h = 0;
    }
}
