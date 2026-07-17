/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static byte[] field_c;
    private bj field_d;
    static String field_f;
    private bj field_a;
    static String field_b;
    private tg field_e;
    private tg field_g;

    final static void a(byte param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 < -101) {
              nn.field_q = true;
              var2 = "tuhstatbut";
              var3 = "rvnadlm";
              var4 = -1L;
              eg.a(var2, 87, var3, var4, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ri.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static String a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            L1: {
              var1_int = di.a(true);
              var2 = var1_int / 50;
              var3 = -(var2 * 1000) + var1_int * 1000 / 50;
              var5 = 0;
              var4 = "0";
              if (1 > var3 / 100) {
                break L1;
              } else {
                var4 = "" + var3 / 100;
                break L1;
              }
            }
            stackOut_2_0 = var2 + "." + var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ri.D(" + 115 + 41);
        }
        return stackIn_3_0;
    }

    final ji a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        ji stackIn_7_0 = null;
        ji stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji stackOut_6_0 = null;
        ji stackOut_11_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -26575) {
              break L0;
            } else {
              field_c = null;
              break L0;
            }
          }
          if (1 == ((ri) this).field_a.b((byte) -71)) {
            stackOut_6_0 = this.a(-31093, 0, param2, param1);
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          } else {
            if (((ri) this).field_a.b(param2, -26727) == 1) {
              stackOut_11_0 = this.a(param0 ^ 7866, param2, 0, param1);
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ri.A(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2, pb param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              int discarded$2 = -31479;
              var5_int = d.a((param2 - param1) * 3);
              var6 = param1 * 3;
              int discarded$3 = -20707;
              ab.a();
              var7 = var5_int - 10;
              if (param3.field_E <= 0) {
                break L1;
              } else {
                if (null == param3.field_x) {
                  break L1;
                } else {
                  ef.a(-24322);
                  break L1;
                }
              }
            }
            ik.field_T = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var8 <= ~param3.field_I) {
                    break L4;
                  } else {
                    var9 = param3.field_e[var8];
                    var10 = param3.field_O[var8];
                    var11 = param3.field_F[var8];
                    stackOut_9_0 = param0;
                    stackIn_48_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0) {
                            var12 = wa.field_d[var9];
                            var13 = ti.field_O[var9];
                            var14 = wa.field_d[var10] + -var12;
                            var15 = wa.field_d[var11] + -var12;
                            var16 = ti.field_O[var10] + -var13;
                            var17 = ti.field_O[var11] - var13;
                            if (var17 * var14 - var16 * var15 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var12 = oc.field_l[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          L7: {
                            var13 = oc.field_l[var10];
                            if (var13 != -2147483648) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var14 = oc.field_l[var11];
                          if (-2147483648 == var14) {
                            break L5;
                          } else {
                            L8: {
                              var15 = -var6 + (var14 + var13 + var12);
                              if (var7 < 0) {
                                stackOut_27_0 = var15 << -var7;
                                stackIn_28_0 = stackOut_27_0;
                                break L8;
                              } else {
                                stackOut_25_0 = var15 >> var7;
                                stackIn_28_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var16 = -stackIn_28_0 + (mg.field_e.length - 1);
                            var17 = mg.field_e[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (var17 >> 4 == 0) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_30_0 = ~var16;
                                    stackOut_30_1 = -1;
                                    stackIn_38_0 = stackOut_30_0;
                                    stackIn_38_1 = stackOut_30_1;
                                    stackIn_31_0 = stackOut_30_0;
                                    stackIn_31_1 = stackOut_30_1;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_31_0 > stackIn_31_1) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var17 = mg.field_e[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = var17;
                                stackOut_37_1 = var16 << 4;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_38_0 + stackIn_38_1;
                                ta.field_d[var18] = var8;
                                mg.field_e[var16] = 1 + var17;
                                if (0 >= param3.field_E) {
                                  break L13;
                                } else {
                                  if (param3.field_x != null) {
                                    di.field_V[param3.field_x[var8]] = di.field_V[param3.field_x[var8]] + 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              ik.field_T = ik.field_T + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                break L3;
              }
              L14: {
                L15: {
                  if (stackIn_48_0 >= param3.field_E) {
                    break L15;
                  } else {
                    if (null != param3.field_x) {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (~di.field_V.length >= ~var9) {
                          break L15;
                        } else {
                          var10 = di.field_V[var9];
                          di.field_V[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("ri.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param3 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L17;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + 0 + 41);
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            bd.field_b = false;
            int discarded$3 = kj.field_a.d((byte) -54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ri.G(" + 1 + 41);
        }
    }

    private final ji a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        jd var9 = null;
        ji stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        ji stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_14_0 = null;
        ji stackOut_22_0 = null;
        ji stackOut_1_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var5_int = param2 ^ (param3 >>> 12 | param3 << 4 & 65532);
            var5_int = var5_int | param3 << 16;
            var6 = (long)var5_int;
            var8 = (ji) (Object) ((ri) this).field_g.a(var6, -27109);
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 >= param0[0]) {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (ji) (Object) stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              var9 = jd.a(((ri) this).field_d, param3, param2);
              if (var9 == null) {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ji) (Object) stackIn_15_0;
              } else {
                var8 = var9.a();
                ((ri) this).field_g.a(0, var6, (pi) (Object) var8);
                L2: {
                  if (null == param0) {
                    break L2;
                  } else {
                    param0[0] = param0[0] - var8.field_r.length;
                    break L2;
                  }
                }
                stackOut_22_0 = (ji) var8;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            } else {
              stackOut_1_0 = (ji) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ri.I(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -72 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_23_0;
    }

    final ji a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        ji stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji stackOut_4_0 = null;
        ji stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((ri) this).field_d.b((byte) -71) != 1) {
            if (((ri) this).field_d.b(param0, -26727) != 1) {
              L0: {
                if (param2 >= 57) {
                  break L0;
                } else {
                  ((ri) this).field_d = null;
                  break L0;
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_4_0 = this.a(param1, (byte) -72, 0, param0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = this.a(param1, (byte) -72, param0, 0);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ri.E(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_c = null;
            field_f = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ri.F(" + -25 + 41);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                if (pi.field_h[param2] < pi.field_h[param3]) {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                } else {
                  if (~pi.field_h[param2] < ~pi.field_h[param3]) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    return stackIn_28_0 != 0;
                  } else {
                    if (cc.field_L[param3] <= cc.field_L[param2]) {
                      if (~cc.field_L[param3] > ~cc.field_L[param2]) {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0 != 0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0 != 0;
                    }
                  }
                }
              } else {
                if (~cc.field_L[param2] <= ~cc.field_L[param3]) {
                  if (~cc.field_L[param3] > ~cc.field_L[param2]) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    if (~pi.field_h[param2] <= ~pi.field_h[param3]) {
                      if (pi.field_h[param2] > pi.field_h[param3]) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            var4_int = jk.field_db[param2] - -qa.field_c[param2] + li.field_a[param2];
            var5 = qa.field_c[param3] + jk.field_db[param3] - -li.field_a[param3];
            if (var4_int < var5) {
              stackOut_40_0 = 1;
              stackIn_41_0 = stackOut_40_0;
              return stackIn_41_0 != 0;
            } else {
              if (~var5 > ~var4_int) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                return stackIn_49_0 != 0;
              } else {
                L2: {
                  if (param3 <= param2) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L2;
                  } else {
                    stackOut_51_0 = 1;
                    stackIn_54_0 = stackOut_51_0;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var4, "ri.J(" + 20021 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_54_0 != 0;
    }

    private final ji a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        b var9 = null;
        Object stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        ji stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_18_0 = null;
        ji stackOut_24_0 = null;
        Object stackOut_22_0 = null;
        ji stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            var5_int = param2 ^ ((param1 & -1610608641) << 4 | param1 >>> 12);
            var5_int = var5_int | param1 << 16;
            var6 = 4294967296L ^ (long)var5_int;
            if (param0 == -31093) {
              var8 = (ji) (Object) ((ri) this).field_g.a(var6, -27109);
              if (null == var8) {
                L1: {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param3[0] <= 0) {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (ji) (Object) stackIn_13_0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  var9 = (b) (Object) ((ri) this).field_e.a(var6, param0 + 3984);
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = b.a(((ri) this).field_a, param1, param2);
                    if (null == var9) {
                      stackOut_18_0 = null;
                      stackIn_19_0 = stackOut_18_0;
                      return (ji) (Object) stackIn_19_0;
                    } else {
                      ((ri) this).field_e.a(0, var6, (pi) (Object) var9);
                      break L2;
                    }
                  }
                }
                var8 = var9.a(param3);
                if (var8 != null) {
                  var9.b(34);
                  ((ri) this).field_g.a(0, var6, (pi) (Object) var8);
                  stackOut_24_0 = (ji) var8;
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                } else {
                  stackOut_22_0 = null;
                  stackIn_23_0 = stackOut_22_0;
                  return (ji) (Object) stackIn_23_0;
                }
              } else {
                stackOut_4_0 = (ji) var8;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ji) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("ri.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_25_0;
    }

    ri(bj param0, bj param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((ri) this).field_e = new tg(256);
        ((ri) this).field_g = new tg(256);
        try {
          L0: {
            ((ri) this).field_a = param1;
            ((ri) this).field_d = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ri.<init>(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[520];
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_b = "Mine the Volcano";
    }
}
