/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jl extends jc {
    static int[] field_A;
    static d field_I;
    int field_J;

    public jl() {
        super(0, 0, 0, 0, (cj) null, (sc) null);
        ((jl) this).field_J = 256;
    }

    final static void i(byte param0) {
        Object var2 = null;
        hl.a((byte) -93, (String) null, oe.field_a);
        if (param0 > -54) {
            jl.i((byte) 51);
        }
    }

    public static void g(byte param0) {
        if (param0 > -127) {
            field_I = null;
        }
        field_I = null;
        field_A = null;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_35_0 = null;
        String stackOut_30_0 = null;
        String stackOut_21_0 = null;
        String stackOut_16_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = km.field_m;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 >= 110) {
                L1: {
                  var3_int = param0.length();
                  if (var3_int < 1) {
                    break L1;
                  } else {
                    if (var3_int > 12) {
                      break L1;
                    } else {
                      L2: {
                        var4 = hm.a((byte) -126, param0);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var4.length() < 1) {
                            break L2;
                          } else {
                            L3: {
                              if (ad.a((byte) 103, var4.charAt(0))) {
                                break L3;
                              } else {
                                if (!ad.a((byte) 107, var4.charAt(var4.length() - 1))) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (~var6 <= ~param0.length()) {
                                      if (var5 > 0) {
                                        stackOut_35_0 = vi.field_t;
                                        stackIn_36_0 = stackOut_35_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!ad.a((byte) 91, (char) var7)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (param2) {
                                            break L6;
                                          } else {
                                            stackOut_30_0 = fd.field_p;
                                            stackIn_31_0 = stackOut_30_0;
                                            return stackIn_31_0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_21_0 = vi.field_t;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0;
                          }
                        }
                      }
                      stackOut_16_0 = km.field_m;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                }
                stackOut_11_0 = km.field_m;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("jl.A(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_36_0;
    }

    final static void h(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var2 = 1;
            L1: while (true) {
              if (var2 >= rd.field_t) {
                break L0;
              } else {
                var3 = rd.field_t + -1;
                L2: while (true) {
                  if (var2 > var3) {
                    var2++;
                    continue L1;
                  } else {
                    L3: {
                      if (tc.a(false, p.field_a[var3].field_a, 320, 240, p.field_a[var3].field_g) <= tc.a(false, p.field_a[-1 + var3].field_a, 320, 240, p.field_a[-1 + var3].field_g)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3--;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "jl.H(" + -108 + 41);
        }
    }

    final static void a(ci[] param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var23 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param1 > 0) {
                    L2: {
                      if (param0[3] != null) {
                        stackOut_9_0 = param0[3].field_q;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param0[5]) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param0[5].field_q;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param0[1] == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param0[1].field_u;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null != param0[7]) {
                        stackOut_18_0 = param0[7].field_u;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param3 + param5;
                      var11 = param2 - -param1;
                      var12 = param5 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = param2 - -var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = var6_int * param3 / (var6_int + var7) + param5;
                        var16 = var6_int * param3 / (var6_int + var7) + param5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      l.b(e.field_t);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = param2 - -(var8 * param1 / (var9 + var8));
                        var18 = param2 - -(var8 * param1 / (var9 + var8));
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[0] != null) {
                        l.i(param5, param2, var16, var18);
                        param0[0].b(param5, param2);
                        l.a(e.field_t);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param0[2]) {
                        l.i(var17, param2, var10, var18);
                        param0[2].b(var13, param2);
                        l.a(e.field_t);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[6] == null) {
                        break L10;
                      } else {
                        l.i(param5, var19, var16, var11);
                        param0[6].b(param5, var15);
                        l.a(e.field_t);
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[8] == null) {
                        break L11;
                      } else {
                        l.i(var17, var19, var10, var11);
                        param0[8].b(var13, var15);
                        l.a(e.field_t);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (param0[1].field_q == 0) {
                          break L12;
                        } else {
                          l.i(var16, param2, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              l.a(e.field_t);
                              break L12;
                            } else {
                              param0[1].b(var20, param2);
                              var20 = var20 + param0[1].field_q;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      var20 = 15 / ((param4 - -43) / 56);
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (param0[7].field_q != 0) {
                          l.i(var16, var19, var17, var11);
                          var21 = var12;
                          L15: while (true) {
                            if (var21 >= var13) {
                              l.a(e.field_t);
                              break L14;
                            } else {
                              param0[7].b(var21, var15);
                              var21 = var21 + param0[7].field_q;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (param0[3].field_u != 0) {
                          l.i(param5, var18, var16, var19);
                          var21 = var14;
                          L17: while (true) {
                            if (var21 >= var15) {
                              l.a(e.field_t);
                              break L16;
                            } else {
                              param0[3].b(param5, var21);
                              var21 = var21 + param0[3].field_u;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param0[5] == null) {
                        break L18;
                      } else {
                        if (param0[5].field_u != 0) {
                          l.i(var17, var18, var10, var19);
                          var21 = var14;
                          L19: while (true) {
                            if (var15 <= var21) {
                              l.a(e.field_t);
                              break L18;
                            } else {
                              param0[5].b(var13, var21);
                              var21 = var21 + param0[5].field_u;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param0[4] == null) {
                        break L20;
                      } else {
                        if (param0[4].field_q == 0) {
                          break L20;
                        } else {
                          if (param0[4].field_u == 0) {
                            break L20;
                          } else {
                            l.i(var16, var18, var17, var19);
                            var21 = var14;
                            L21: while (true) {
                              if (var21 >= var15) {
                                l.a(e.field_t);
                                break L20;
                              } else {
                                var22 = var12;
                                L22: while (true) {
                                  if (var22 >= var13) {
                                    var21 = var21 + param0[4].field_u;
                                    continue L21;
                                  } else {
                                    param0[4].b(var22, var21);
                                    var22 = var22 + param0[4].field_q;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("jl.I(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    jl(gl param0) {
        super(param0.field_w, param0.field_u, param0.field_p, param0.field_n, (cj) null, (sc) null);
        try {
            param0.a(0, (byte) 112, ((jl) this).field_p, 0, ((jl) this).field_n);
            ((jl) this).field_F = param0;
            ((jl) this).field_J = 256;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        if (!(((jl) this).field_F != null)) {
            return;
        }
        if (0 == ((jl) this).field_J) {
            return;
        }
        if (((jl) this).field_J == 256) {
            ((jl) this).field_F.a(((jl) this).field_w + param0, -124, param2, ((jl) this).field_u + param3);
            return;
        }
        if (param1 >= -106) {
            jl.g((byte) -79);
        }
        ci var6 = new ci(((jl) this).field_F.field_p, ((jl) this).field_F.field_n);
        il.a(1, var6);
        ((jl) this).field_F.a(0, -128, param2, 0);
        ij.a(false);
        var6.a(param0 - -((jl) this).field_w, param3 + ((jl) this).field_u, ((jl) this).field_J);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
