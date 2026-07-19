/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends id {
    private boolean field_H;
    static int field_J;
    static ja[] field_I;
    static int field_F;
    private boolean field_G;

    final void f(byte param0) {
        if (param0 >= -79) {
            rj.i(14);
        }
    }

    rj(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int var4 = 0;
        L0: {
          L1: {
            this.field_G = false;
            this.field_H = false;
            var4 = hp.a((byte) 104, g.field_a, 2);
            if (var4 == 1) {
              break L1;
            } else {
              if (2 != var4) {
                break L0;
              } else {
                this.field_H = true;
                if (!ZombieDawnMulti.field_E) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_G = true;
          break L0;
        }
    }

    final static void a(int param0, byte param1, String param2) {
        try {
            er.field_i = un.field_k;
            int var3_int = 75 % ((43 - param1) / 55);
            b.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rj.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.c(this.g(65) + -24, -20126);
              var4 = param1.d(this.h(96) + -24, 106);
              if ((var3_int ^ -1) > 47) {
                break L1;
              } else {
                if (47 < (var4 ^ -1)) {
                  break L1;
                } else {
                  if (640.0f * param1.field_d < (float)var3_int) {
                    break L1;
                  } else {
                    if (480.0f * param1.field_d < (float)var4) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          if (!this.field_G) {
                            break L3;
                          } else {
                            cp.field_X[this.field_C].b(var3_int, var4);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (!this.field_H) {
                            break L4;
                          } else {
                            cp.field_X[this.field_C].a(var3_int, var4);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        cp.field_X[this.field_C].g(var3_int, var4);
                        break L2;
                      }
                      L5: {
                        if (param0 == -10136) {
                          break L5;
                        } else {
                          rj.i(-46);
                          break L5;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("rj.H(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != 8784) {
            field_F = -106;
        }
    }

    final static void i(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ga var28 = null;
        Object var29 = null;
        ga var30 = null;
        Object var31 = null;
        kj var31_ref = null;
        long[][] var38 = null;
        int[][] var39 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var31 = null;
        var29 = null;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                rj.j(-22);
                break L1;
              }
            }
            L2: {
              L3: {
                var28 = s.field_e;
                var30 = var28;
                var2 = var30.g(param0 + 31362);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      var3 = var30.d((byte) 69);
                      var31_ref = (kj) ((Object) md.field_u.c(102));
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var31_ref == null) {
                              break L7;
                            } else {
                              stackOut_7_0 = var31_ref.field_i;
                              stackIn_15_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var26 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_8_0 != var3) {
                                    break L8;
                                  } else {
                                    if (var26 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var29 = (kj) ((Object) md.field_u.b(6));
                                if (var26 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var29 == null) {
                            stackOut_14_0 = -115;
                            stackIn_15_0 = stackOut_14_0;
                            break L6;
                          } else {
                            ((kj) (var29)).a(true);
                            if (var26 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        ak.a((byte) stackIn_15_0);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  bd.a("HS1: " + ci.a(param0 ^ 3), (Throwable) null, false);
                  ak.a((byte) -123);
                  if (var26 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = var30.d((byte) 69);
              var4 = (nh) ((Object) pn.field_f.c(71));
              L9: while (true) {
                L10: {
                  L11: {
                    if (var4 == null) {
                      break L11;
                    } else {
                      stackOut_22_0 = var3 ^ -1;
                      stackIn_28_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var26 != 0) {
                        break L10;
                      } else {
                        if (stackIn_23_0 == (var4.field_l ^ -1)) {
                          break L11;
                        } else {
                          var4 = (nh) ((Object) pn.field_f.b(6));
                          if (var26 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  if (var4 == null) {
                    stackOut_27_0 = -119;
                    stackIn_28_0 = stackOut_27_0;
                    break L10;
                  } else {
                    var5 = var30.g(param0 ^ 31366);
                    if (var5 != 0) {
                      var6 = var4.field_k;
                      ha.field_j[0].field_g = false;
                      ha.field_j[0].field_d = ta.field_lb;
                      ha.field_j[0].field_c = null;
                      var7 = var4.field_f;
                      var8_int = 1;
                      L12: while (true) {
                        L13: {
                          if (var5 <= var8_int) {
                            stackOut_40_0 = 3;
                            stackOut_40_1 = var6;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L13;
                          } else {
                            ha.field_j[var8_int].field_d = var28.f((byte) -121);
                            ha.field_j[var8_int].field_g = false;
                            stackOut_34_0 = 1;
                            stackOut_34_1 = var30.g(31365);
                            stackIn_41_0 = stackOut_34_0;
                            stackIn_41_1 = stackOut_34_1;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            if (var26 != 0) {
                              break L13;
                            } else {
                              L14: {
                                L15: {
                                  if (stackIn_35_0 != stackIn_35_1) {
                                    break L15;
                                  } else {
                                    ha.field_j[var8_int].field_c = var30.f((byte) -81);
                                    if (var26 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                ha.field_j[var8_int].field_c = null;
                                break L14;
                              }
                              var8_int++;
                              continue L12;
                            }
                          }
                        }
                        var8 = new String[stackIn_41_0][stackIn_41_1];
                        var9 = new String[3][var6];
                        var38 = new long[3][var6];
                        var39 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var30.g(31365);
                        if ((var18 ^ -1) < -1) {
                          var19 = 0;
                          L16: while (true) {
                            if (var18 > var19) {
                              var20 = var28.g(31365);
                              var21 = ha.field_j[var20].field_d;
                              var22 = var30.a((byte) -30);
                              var24 = var30.field_j;
                              if (var26 != 0) {
                                break L2;
                              } else {
                                L17: {
                                  L18: {
                                    L19: {
                                      if (var6 > var19) {
                                        var8[0][var12] = var21;
                                        var9[0][var12] = ha.field_j[var20].field_c;
                                        var38[0][var12] = var22;
                                        var12++;
                                        var25 = 0;
                                        L20: while (true) {
                                          if (var7 <= var25) {
                                            break L19;
                                          } else {
                                            incrementValue$3 = var15;
                                            var15++;
                                            var39[0][incrementValue$3] = var28.i(-1478490344);
                                            var25++;
                                            if (var26 != 0) {
                                              break L18;
                                            } else {
                                              continue L20;
                                            }
                                          }
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                    if (var21 == null) {
                                      break L18;
                                    } else {
                                      if (sf.a(1, var21)) {
                                        var8[1][var13] = ta.field_lb;
                                        var9[1][var13] = null;
                                        var38[1][var13] = var22;
                                        var13++;
                                        var30.field_j = var24;
                                        var25 = 0;
                                        L21: while (true) {
                                          if (var7 <= var25) {
                                            break L18;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var39[1][incrementValue$4] = var28.i(-1478490344);
                                            var25++;
                                            if (var26 != 0) {
                                              break L17;
                                            } else {
                                              continue L21;
                                            }
                                          }
                                        }
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L22: {
                                    if (var14 >= var6) {
                                      break L22;
                                    } else {
                                      if (!ha.field_j[var20].field_g) {
                                        ha.field_j[var20].field_g = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = ha.field_j[var20].field_c;
                                        var38[2][var14] = var22;
                                        var14++;
                                        var30.field_j = var24;
                                        var25 = 0;
                                        L23: while (true) {
                                          if (var25 >= var7) {
                                            break L22;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var39[2][incrementValue$5] = var28.i(-1478490344);
                                            var25++;
                                            if (var26 != 0) {
                                              break L17;
                                            } else {
                                              continue L23;
                                            }
                                          }
                                        }
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  var19++;
                                  break L17;
                                }
                                continue L16;
                              }
                            } else {
                              var4.a(true);
                              break L2;
                            }
                          }
                        } else {
                          var4.a(true);
                          break L2;
                        }
                      }
                    } else {
                      var4.a(true);
                      break L2;
                    }
                  }
                }
                ak.a((byte) stackIn_28_0);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rj.J(" + param0 + ')');
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

    static {
    }
}
