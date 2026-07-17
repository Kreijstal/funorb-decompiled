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
          ((rj) this).field_G = false;
          ((rj) this).field_H = false;
          var4 = hp.a((byte) 104, g.field_a, 2);
          if (var4 == 1) {
            ((rj) this).field_G = true;
            break L0;
          } else {
            if (2 != var4) {
              break L0;
            } else {
              ((rj) this).field_H = true;
              break L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1, String param2) {
        try {
            er.field_i = un.field_k;
            int var3_int = 75 % ((43 - param1) / 55);
            b.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rj.K(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.c(((rj) this).g(65) + -24, -20126);
              var4 = param1.d(((rj) this).h(96) + -24, 106);
              if (var3_int < -48) {
                break L1;
              } else {
                if (var4 < -48) {
                  break L1;
                } else {
                  if (640.0f * param1.field_d < (float)var3_int) {
                    break L1;
                  } else {
                    if (480.0f * param1.field_d < (float)var4) {
                      break L1;
                    } else {
                      L2: {
                        if (!((rj) this).field_G) {
                          if (!((rj) this).field_H) {
                            cp.field_X[((rj) this).field_C].g(var3_int, var4);
                            break L2;
                          } else {
                            cp.field_X[((rj) this).field_C].a(var3_int, var4);
                            break L2;
                          }
                        } else {
                          cp.field_X[((rj) this).field_C].b(var3_int, var4);
                          break L2;
                        }
                      }
                      L3: {
                        if (param0 == -10136) {
                          break L3;
                        } else {
                          rj.i(-46);
                          break L3;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("rj.H(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != 8784) {
            field_F = -106;
        }
    }

    final static void i(int param0) {
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
        Object var27 = null;
        ga var28 = null;
        Object var29 = null;
        kj var29_ref = null;
        long[][] var36 = null;
        int[][] var37 = null;
        RuntimeException decompiledCaughtException = null;
        var29 = null;
        var27 = null;
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
              var28 = s.field_e;
              var2 = var28.g(param0 + 31362);
              if (var2 == 0) {
                var3 = var28.d((byte) 69);
                var4 = (nh) (Object) pn.field_f.c(71);
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var3 == var4.field_l) {
                        break L4;
                      } else {
                        var4 = (nh) (Object) pn.field_f.b(6);
                        continue L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    ak.a((byte) -119);
                    return;
                  } else {
                    var5 = var28.g(param0 ^ 31366);
                    if (var5 != 0) {
                      var6 = var4.field_k;
                      ha.field_j[0].field_g = false;
                      ha.field_j[0].field_d = ta.field_lb;
                      ha.field_j[0].field_c = null;
                      var7 = var4.field_f;
                      var8_int = 1;
                      L5: while (true) {
                        if (var5 <= var8_int) {
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var36 = new long[3][var6];
                          var37 = new int[3][var7 * var6];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var28.g(31365);
                          if (var18 > 0) {
                            var19 = 0;
                            L6: while (true) {
                              if (var18 > var19) {
                                L7: {
                                  var20 = var28.g(31365);
                                  var21 = ha.field_j[var20].field_d;
                                  var22 = var28.a((byte) -30);
                                  var24 = var28.field_j;
                                  if (var6 > var19) {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = ha.field_j[var20].field_c;
                                    var36[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L8: while (true) {
                                      if (var7 <= var25) {
                                        break L7;
                                      } else {
                                        int incrementValue$4 = var15;
                                        var15++;
                                        var37[0][incrementValue$4] = var28.i(-1478490344);
                                        var25++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                L9: {
                                  if (var21 == null) {
                                    break L9;
                                  } else {
                                    if (sf.a(1, var21)) {
                                      var8[1][var13] = ta.field_lb;
                                      var9[1][var13] = null;
                                      var36[1][var13] = var22;
                                      var13++;
                                      var28.field_j = var24;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          break L9;
                                        } else {
                                          int incrementValue$5 = var16;
                                          var16++;
                                          var37[1][incrementValue$5] = var28.i(-1478490344);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  if (var14 >= var6) {
                                    break L11;
                                  } else {
                                    if (!ha.field_j[var20].field_g) {
                                      ha.field_j[var20].field_g = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = ha.field_j[var20].field_c;
                                      var36[2][var14] = var22;
                                      var14++;
                                      var28.field_j = var24;
                                      var25 = 0;
                                      L12: while (true) {
                                        if (var25 >= var7) {
                                          break L11;
                                        } else {
                                          int incrementValue$6 = var17;
                                          var17++;
                                          var37[2][incrementValue$6] = var28.i(-1478490344);
                                          var25++;
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var19++;
                                continue L6;
                              } else {
                                var4.a(true);
                                break L2;
                              }
                            }
                          } else {
                            var4.a(true);
                            break L2;
                          }
                        } else {
                          L13: {
                            ha.field_j[var8_int].field_d = var28.f((byte) -121);
                            ha.field_j[var8_int].field_g = false;
                            if (1 != var28.g(31365)) {
                              ha.field_j[var8_int].field_c = null;
                              break L13;
                            } else {
                              ha.field_j[var8_int].field_c = var28.f((byte) -81);
                              break L13;
                            }
                          }
                          var8_int++;
                          continue L5;
                        }
                      }
                    } else {
                      var4.a(true);
                      break L2;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  int discarded$7 = 0;
                  bd.a("HS1: " + ci.a(param0 ^ 3), (Throwable) null);
                  ak.a((byte) -123);
                  break L2;
                } else {
                  var3 = var28.d((byte) 69);
                  var29_ref = (kj) (Object) md.field_u.c(102);
                  L14: while (true) {
                    L15: {
                      if (var29_ref == null) {
                        break L15;
                      } else {
                        if (var29_ref.field_i != var3) {
                          var27 = (Object) (Object) (kj) (Object) md.field_u.b(6);
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var27 == null) {
                      ak.a((byte) -115);
                      return;
                    } else {
                      ((kj) var27).a(true);
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "rj.J(" + param0 + 41);
        }
    }

    static {
    }
}
