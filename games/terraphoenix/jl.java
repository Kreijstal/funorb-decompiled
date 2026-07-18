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

    final static String a(CharSequence param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_5_0 = null;
        String stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_26_0 = null;
        String stackIn_39_0 = null;
        String stackIn_44_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_43_0 = null;
        String stackOut_38_0 = null;
        String stackOut_25_0 = null;
        String stackOut_19_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == null) {
              stackOut_4_0 = km.field_m;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
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
                      if (null == var4) {
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
                                      stackOut_43_0 = vi.field_t;
                                      stackIn_44_0 = stackOut_43_0;
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
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_38_0 = fd.field_p;
                                      stackIn_39_0 = stackOut_38_0;
                                      return stackIn_39_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_25_0 = vi.field_t;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      }
                    }
                    stackOut_19_0 = km.field_m;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                }
              }
              stackOut_13_0 = km.field_m;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var3;
            stackOut_46_1 = new StringBuilder().append("jl.A(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L6;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + 121 + ',' + false + ')');
        }
        return stackIn_44_0;
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
            if (param0 <= -33) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "jl.H(" + param0 + ')');
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
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
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
                        stackOut_10_0 = param0[3].field_q;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_11_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param0[5]) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param0[5].field_q;
                        stackIn_15_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_15_0;
                      if (param0[1] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L4;
                      } else {
                        stackOut_16_0 = param0[1].field_u;
                        stackIn_19_0 = stackOut_16_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_19_0;
                      if (null != param0[7]) {
                        stackOut_22_0 = param0[7].field_u;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_23_0 = stackOut_20_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_23_0;
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
            stackOut_87_0 = (RuntimeException) var6;
            stackOut_87_1 = new StringBuilder().append("jl.I(");
            stackIn_90_0 = stackOut_87_0;
            stackIn_90_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param0 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L23;
            } else {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "{...}";
              stackIn_91_0 = stackOut_88_0;
              stackIn_91_1 = stackOut_88_1;
              stackIn_91_2 = stackOut_88_2;
              break L23;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    jl(gl param0) {
        super(param0.field_w, param0.field_u, param0.field_p, param0.field_n, (cj) null, (sc) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            param0.a(0, (byte) 112, ((jl) this).field_p, 0, ((jl) this).field_n);
            ((jl) this).field_F = param0;
            ((jl) this).field_J = 256;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jl.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
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
