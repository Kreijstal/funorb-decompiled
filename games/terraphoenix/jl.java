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
        try {
            ((jl) this).field_J = 256;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jl.<init>()");
        }
    }

    final static void i(byte param0) {
        try {
            hl.a((byte) -93, (String) null, oe.field_a);
            if (param0 > -54) {
                jl.i((byte) 51);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jl.G(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -127) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            field_I = null;
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "jl.D(" + param0 + ')');
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_16_0 = null;
        String stackIn_24_0 = null;
        String stackIn_30_0 = null;
        boolean stackIn_34_0 = false;
        String stackIn_46_0 = null;
        int stackIn_49_0 = 0;
        String stackIn_51_0 = null;
        Object stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        boolean stackOut_33_0 = false;
        String stackOut_45_0 = null;
        int stackOut_48_0 = 0;
        Object stackOut_52_0 = null;
        String stackOut_50_0 = null;
        String stackOut_29_0 = null;
        String stackOut_23_0 = null;
        String stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == null) {
              stackOut_4_0 = km.field_m;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
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
                                    L5: {
                                      L6: {
                                        if (~var6 <= ~param0.length()) {
                                          break L6;
                                        } else {
                                          var7 = param0.charAt(var6);
                                          stackOut_33_0 = ad.a((byte) 91, (char) var7);
                                          stackIn_49_0 = stackOut_33_0 ? 1 : 0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (!stackIn_34_0) {
                                                  break L8;
                                                } else {
                                                  var5++;
                                                  if (var8 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var5 = 0;
                                              break L7;
                                            }
                                            L9: {
                                              if (var5 < 2) {
                                                break L9;
                                              } else {
                                                if (param2) {
                                                  break L9;
                                                } else {
                                                  stackOut_45_0 = fd.field_p;
                                                  stackIn_46_0 = stackOut_45_0;
                                                  return stackIn_46_0;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_48_0 = ~var5;
                                      stackIn_49_0 = stackOut_48_0;
                                      break L5;
                                    }
                                    if (stackIn_49_0 >= -1) {
                                      stackOut_52_0 = null;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L0;
                                    } else {
                                      stackOut_50_0 = vi.field_t;
                                      stackIn_51_0 = stackOut_50_0;
                                      return stackIn_51_0;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_29_0 = vi.field_t;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0;
                          }
                        }
                      }
                      stackOut_23_0 = km.field_m;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0;
                    }
                  }
                }
                stackOut_15_0 = km.field_m;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (String) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var3;
            stackOut_54_1 = new StringBuilder().append("jl.A(");
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L10;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_53_0;
    }

    final static void h(byte param0) {
        RuntimeException runtimeException = null;
        se var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 <= -33) {
              var2 = 1;
              L1: while (true) {
                stackOut_4_0 = var2;
                stackOut_4_1 = rd.field_t;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= stackIn_5_1) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          var3 = rd.field_t + -1;
                          L5: while (true) {
                            L6: {
                              if (var2 > var3) {
                                break L6;
                              } else {
                                stackOut_9_0 = ~tc.a(false, p.field_a[var3].field_a, 320, 240, p.field_a[var3].field_g);
                                stackOut_9_1 = ~tc.a(false, p.field_a[-1 + var3].field_a, 320, 240, p.field_a[-1 + var3].field_g);
                                stackIn_5_0 = stackOut_9_0;
                                stackIn_5_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var4 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_10_0 >= stackIn_10_1) {
                                      break L7;
                                    } else {
                                      var1 = p.field_a[var3];
                                      p.field_a[var3] = p.field_a[var3 - 1];
                                      p.field_a[var3 - 1] = var1;
                                      break L7;
                                    }
                                  }
                                  var3--;
                                  if (var4 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var2++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "jl.H(" + param0 + ')');
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
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
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
                      if (~var18 >= ~var19) {
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
                      L13: {
                        if (null == param0[1]) {
                          break L13;
                        } else {
                          if (param0[1].field_q == 0) {
                            break L13;
                          } else {
                            l.i(var16, param2, var17, var18);
                            var20 = var12;
                            L14: while (true) {
                              L15: {
                                if (~var20 <= ~var13) {
                                  break L15;
                                } else {
                                  param0[1].b(var20, param2);
                                  var20 = var20 + param0[1].field_q;
                                  if (var23 != 0) {
                                    break L12;
                                  } else {
                                    if (var23 == 0) {
                                      continue L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              l.a(e.field_t);
                              break L13;
                            }
                          }
                        }
                      }
                      var20 = 15 / ((param4 - -43) / 56);
                      break L12;
                    }
                    L16: {
                      if (null == param0[7]) {
                        break L16;
                      } else {
                        if (param0[7].field_q != 0) {
                          l.i(var16, var19, var17, var11);
                          var21 = var12;
                          L17: while (true) {
                            L18: {
                              if (var21 >= var13) {
                                break L18;
                              } else {
                                param0[7].b(var21, var15);
                                var21 = var21 + param0[7].field_q;
                                if (var23 != 0) {
                                  break L16;
                                } else {
                                  if (var23 == 0) {
                                    continue L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            l.a(e.field_t);
                            break L16;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L19: {
                      if (null == param0[3]) {
                        break L19;
                      } else {
                        if (param0[3].field_u != 0) {
                          l.i(param5, var18, var16, var19);
                          var21 = var14;
                          L20: while (true) {
                            L21: {
                              if (~var21 <= ~var15) {
                                break L21;
                              } else {
                                param0[3].b(param5, var21);
                                var21 = var21 + param0[3].field_u;
                                if (var23 != 0) {
                                  break L19;
                                } else {
                                  if (var23 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            l.a(e.field_t);
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L22: {
                      if (param0[5] == null) {
                        break L22;
                      } else {
                        if (param0[5].field_u != 0) {
                          l.i(var17, var18, var10, var19);
                          var21 = var14;
                          L23: while (true) {
                            L24: {
                              if (var15 <= var21) {
                                break L24;
                              } else {
                                param0[5].b(var13, var21);
                                var21 = var21 + param0[5].field_u;
                                if (var23 != 0) {
                                  break L22;
                                } else {
                                  if (var23 == 0) {
                                    continue L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            l.a(e.field_t);
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    L25: {
                      if (param0[4] == null) {
                        break L25;
                      } else {
                        if (param0[4].field_q == 0) {
                          break L25;
                        } else {
                          if (param0[4].field_u == 0) {
                            break L25;
                          } else {
                            l.i(var16, var18, var17, var19);
                            var21 = var14;
                            L26: while (true) {
                              L27: {
                                if (var21 >= var15) {
                                  break L27;
                                } else {
                                  if (var23 != 0) {
                                    break L25;
                                  } else {
                                    var22 = var12;
                                    L28: while (true) {
                                      L29: {
                                        L30: {
                                          if (var22 >= var13) {
                                            break L30;
                                          } else {
                                            param0[4].b(var22, var21);
                                            var22 = var22 + param0[4].field_q;
                                            if (var23 != 0) {
                                              break L29;
                                            } else {
                                              if (var23 == 0) {
                                                continue L28;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                        var21 = var21 + param0[4].field_u;
                                        break L29;
                                      }
                                      if (var23 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              }
                              l.a(e.field_t);
                              break L25;
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
          L31: {
            var6 = decompiledCaughtException;
            stackOut_114_0 = (RuntimeException) var6;
            stackOut_114_1 = new StringBuilder().append("jl.I(");
            stackIn_117_0 = stackOut_114_0;
            stackIn_117_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param0 == null) {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "null";
              stackIn_118_0 = stackOut_117_0;
              stackIn_118_1 = stackOut_117_1;
              stackIn_118_2 = stackOut_117_2;
              break L31;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_118_0 = stackOut_115_0;
              stackIn_118_1 = stackOut_115_1;
              stackIn_118_2 = stackOut_115_2;
              break L31;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_118_0, stackIn_118_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        ci var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != 0) {
              return;
            } else {
              if (((jl) this).field_F == null) {
                return;
              } else {
                if (0 != ((jl) this).field_J) {
                  if (((jl) this).field_J != 256) {
                    L1: {
                      if (param1 < -106) {
                        break L1;
                      } else {
                        jl.g((byte) -79);
                        break L1;
                      }
                    }
                    var5 = new ci(((jl) this).field_F.field_p, ((jl) this).field_F.field_n);
                    il.a(1, var5);
                    ((jl) this).field_F.a(0, -128, param2, 0);
                    ij.a(false);
                    var5.a(param0 - -((jl) this).field_w, param3 + ((jl) this).field_u, ((jl) this).field_J);
                    break L0;
                  } else {
                    ((jl) this).field_F.a(((jl) this).field_w + param0, -124, param2, ((jl) this).field_u + param3);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var5_ref, "jl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
