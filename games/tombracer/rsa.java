/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsa extends osa {
    private int field_v;
    static String field_x;
    static boolean field_s;
    static String field_z;
    static String field_u;
    private int field_w;
    private int field_y;
    private int field_t;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return -51;
        }
        return param1;
    }

    final void b(byte param0) {
        int var2 = -27 / ((param0 - -69) / 42);
    }

    private final void k(byte param0) {
        if (((rsa) this).field_v % 2 != 1) {
            ((rsa) this).field_v = ((rsa) this).field_v + 1;
        }
        if (((rsa) this).field_w % 2 != 1) {
            ((rsa) this).field_w = ((rsa) this).field_w + 1;
        }
    }

    final void a(int param0, fsa param1) {
        if (param0 <= 35) {
            return;
        }
        try {
            super.a(68, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rsa.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -123);
              param0.a((byte) -128, ((rsa) this).field_t >> 16, 10);
              param0.a((byte) -128, ((rsa) this).field_y >> 16, 10);
              param0.a((byte) -127, ((rsa) this).field_v, 7);
              param0.a((byte) -127, ((rsa) this).field_w, 7);
              if (param1 < -78) {
                break L1;
              } else {
                var4 = null;
                ((rsa) this).a((kh) null, (byte) -48);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rsa.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    rsa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((rsa) this).field_t = param1.b((byte) 44, 10) << 16;
            ((rsa) this).field_y = param1.b((byte) 44, 10) << 16;
            ((rsa) this).field_v = param1.b((byte) 44, 7);
            ((rsa) this).field_w = param1.b((byte) 44, 7);
            this.k((byte) -56);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rsa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          var2 = ((rsa) this).field_n.s(25745) + -((rsa) this).f(10);
          var3 = ((rsa) this).field_n.e(false) + -((rsa) this).g((byte) 30);
          if (var2 != 0) {
            break L0;
          } else {
            if (0 != var3) {
              break L0;
            } else {
              return;
            }
          }
        }
        var4 = 0;
        var5 = 0;
        var6 = ((rsa) this).field_t * (((rsa) this).field_v + -1) / 2;
        var7 = ((rsa) this).field_y * (-1 + ((rsa) this).field_w) / 2;
        if (param0 != 1) {
          return;
        } else {
          L1: {
            var8 = 0;
            if (var2 > var6) {
              var4 = -(var2 - var6);
              var8 = 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var2 < -var6) {
              var8 = 1;
              var4 = -var6 + -var2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var3 <= var7) {
              break L3;
            } else {
              var5 = -(-var7 + var3);
              var8 = 1;
              break L3;
            }
          }
          L4: {
            if (-var7 > var3) {
              var5 = -var7 - var3;
              var8 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (var8 != 0) {
                break L6;
              } else {
                L7: {
                  if (var2 >= 0) {
                    var9 = (((rsa) this).field_t / 2 + var2) / ((rsa) this).field_t;
                    break L7;
                  } else {
                    var9 = (-(((rsa) this).field_t / 2) + var2) / ((rsa) this).field_t;
                    break L7;
                  }
                }
                L8: {
                  if (var3 >= 0) {
                    var10 = (((rsa) this).field_y / 2 + var3) / ((rsa) this).field_y;
                    break L8;
                  } else {
                    var10 = (var3 + -(((rsa) this).field_y / 2)) / ((rsa) this).field_y;
                    break L8;
                  }
                }
                var11 = -var2 + ((rsa) this).field_t * var9;
                var12 = -var3 + ((rsa) this).field_y * var10;
                if (0 == var11) {
                  break L6;
                } else {
                  if (var12 != 0) {
                    if (ua.a(var11, param0 + 104) <= ua.a(var12, -104)) {
                      var4 = var11;
                      break L6;
                    } else {
                      var5 = var12;
                      break L6;
                    }
                  } else {
                    ((rsa) this).field_n.a((byte) -31, var4, var5);
                    break L5;
                  }
                }
              }
            }
            ((rsa) this).field_n.a((byte) -31, var4, var5);
            break L5;
          }
          return;
        }
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              return;
            } else {
              L1: {
                if (param4 <= 0) {
                  break L1;
                } else {
                  if (param0 > 0) {
                    L2: {
                      if (param1[3] != null) {
                        stackOut_9_0 = param1[3].field_n;
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
                      if (param1[5] == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param1[5].field_n;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param1[1] == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param1[1].field_k;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param1[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param1[7].field_k;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param4 + param5;
                      var11 = param0 + param2;
                      var12 = param5 + var6_int;
                      var13 = -var7 + var10;
                      var14 = param2 + var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param5 + param4 * var6_int / (var7 + var6_int);
                        var16 = param5 + param4 * var6_int / (var7 + var6_int);
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      bea.b(bba.field_a);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = var8 * param0 / (var9 + var8) + param2;
                        var18 = var8 * param0 / (var9 + var8) + param2;
                        break L7;
                      }
                    }
                    L8: {
                      if (param1[0] != null) {
                        bea.g(param5, param2, var16, var18);
                        param1[0].b(param5, param2);
                        bea.a(bba.field_a);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param1[2]) {
                        break L9;
                      } else {
                        bea.g(var17, param2, var10, var18);
                        param1[2].b(var13, param2);
                        bea.a(bba.field_a);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] == null) {
                        break L10;
                      } else {
                        bea.g(param5, var19, var16, var11);
                        param1[6].b(param5, var15);
                        bea.a(bba.field_a);
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[8] == null) {
                        break L11;
                      } else {
                        bea.g(var17, var19, var10, var11);
                        param1[8].b(var13, var15);
                        bea.a(bba.field_a);
                        break L11;
                      }
                    }
                    if (param3 <= -116) {
                      L12: {
                        if (null == param1[1]) {
                          break L12;
                        } else {
                          if (param1[1].field_n == 0) {
                            break L12;
                          } else {
                            bea.g(var16, param2, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var13 <= var20) {
                                bea.a(bba.field_a);
                                break L12;
                              } else {
                                param1[1].b(var20, param2);
                                var20 = var20 + param1[1].field_n;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (param1[7] == null) {
                          break L14;
                        } else {
                          if (param1[7].field_n == 0) {
                            break L14;
                          } else {
                            bea.g(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var20 >= var13) {
                                bea.a(bba.field_a);
                                break L14;
                              } else {
                                param1[7].b(var20, var15);
                                var20 = var20 + param1[7].field_n;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (param1[3] == null) {
                          break L16;
                        } else {
                          if (param1[3].field_k != 0) {
                            bea.g(param5, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                bea.a(bba.field_a);
                                break L16;
                              } else {
                                param1[3].b(param5, var20);
                                var20 = var20 + param1[3].field_k;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param1[5] == null) {
                          break L18;
                        } else {
                          if (param1[5].field_k == 0) {
                            break L18;
                          } else {
                            bea.g(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var15 <= var20) {
                                bea.a(bba.field_a);
                                break L18;
                              } else {
                                param1[5].b(var13, var20);
                                var20 = var20 + param1[5].field_k;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (null == param1[4]) {
                          break L20;
                        } else {
                          if (0 == param1[4].field_n) {
                            break L20;
                          } else {
                            if (0 == param1[4].field_k) {
                              break L20;
                            } else {
                              bea.g(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var15 <= var20) {
                                  bea.a(bba.field_a);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param1[4].field_k;
                                      continue L21;
                                    } else {
                                      param1[4].b(var21, var20);
                                      var21 = var21 + param1[4].field_n;
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
                      return;
                    }
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
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("rsa.M(").append(param0).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L23;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L23;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void j(byte param0) {
        field_x = null;
        field_z = null;
        field_u = null;
    }

    final int c(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((rsa) this).a((kh) null, (byte) 14);
        }
        return 12;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Press F10 to open Quick Chat.";
    }
}
