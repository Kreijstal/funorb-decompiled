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
        if (-2 != (((rsa) this).field_w % 2 ^ -1)) {
            ((rsa) this).field_w = ((rsa) this).field_w + 1;
        }
        if (param0 > -22) {
            Object var3 = null;
            ((rsa) this).a(-103, (fsa) null);
        }
    }

    final void a(int param0, fsa param1) {
        if (param0 <= 35) {
            return;
        }
        super.a(68, param1);
    }

    final void a(kh param0, byte param1) {
        super.a(param0, (byte) -123);
        param0.a((byte) -128, ((rsa) this).field_t >> 927314576, 10);
        param0.a((byte) -128, ((rsa) this).field_y >> -555921872, 10);
        param0.a((byte) -127, ((rsa) this).field_v, 7);
        param0.a((byte) -127, ((rsa) this).field_w, 7);
        if (param1 >= -78) {
            Object var4 = null;
            ((rsa) this).a((kh) null, (byte) -48);
        }
    }

    rsa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((rsa) this).field_t = param1.b((byte) 44, 10) << -56700816;
        ((rsa) this).field_y = param1.b((byte) 44, 10) << -89042896;
        ((rsa) this).field_v = param1.b((byte) 44, 7);
        ((rsa) this).field_w = param1.b((byte) 44, 7);
        this.k((byte) -56);
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
                  if ((var3 ^ -1) <= -1) {
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = TombRacer.field_G ? 1 : 0;
        if (param1 == null) {
          return;
        } else {
          L0: {
            if (-1 <= (param4 ^ -1)) {
              break L0;
            } else {
              if ((param0 ^ -1) < -1) {
                L1: {
                  if (param1[3] != null) {
                    stackOut_8_0 = param1[3].field_n;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param1[5] == null) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = param1[5].field_n;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (param1[1] == null) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param1[1].field_k;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param1[7] == null) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param1[7].field_k;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param4 + param5;
                  var11 = param0 + param2;
                  var12 = param5 + var6;
                  var13 = -var7 + var10;
                  var14 = param2 + var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var17 >= var16) {
                    break L5;
                  } else {
                    var17 = param5 + param4 * var6 / (var7 + var6);
                    var16 = param5 + param4 * var6 / (var7 + var6);
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  bea.b(bba.field_a);
                  if (var18 <= var19) {
                    break L6;
                  } else {
                    var19 = var8 * param0 / (var9 + var8) + param2;
                    var18 = var8 * param0 / (var9 + var8) + param2;
                    break L6;
                  }
                }
                L7: {
                  if (param1[0] != null) {
                    bea.g(param5, param2, var16, var18);
                    param1[0].b(param5, param2);
                    bea.a(bba.field_a);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null == param1[2]) {
                    break L8;
                  } else {
                    bea.g(var17, param2, var10, var18);
                    param1[2].b(var13, param2);
                    bea.a(bba.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (param1[6] == null) {
                    break L9;
                  } else {
                    bea.g(param5, var19, var16, var11);
                    param1[6].b(param5, var15);
                    bea.a(bba.field_a);
                    break L9;
                  }
                }
                L10: {
                  if (param1[8] == null) {
                    break L10;
                  } else {
                    bea.g(var17, var19, var10, var11);
                    param1[8].b(var13, var15);
                    bea.a(bba.field_a);
                    break L10;
                  }
                }
                if (param3 <= -116) {
                  L11: {
                    if (null == param1[1]) {
                      break L11;
                    } else {
                      if (param1[1].field_n == 0) {
                        break L11;
                      } else {
                        bea.g(var16, param2, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var13 <= var20) {
                              break L13;
                            } else {
                              param1[1].b(var20, param2);
                              var20 = var20 + param1[1].field_n;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          bea.a(bba.field_a);
                          break L11;
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
                          L16: {
                            if (var20 >= var13) {
                              break L16;
                            } else {
                              param1[7].b(var20, var15);
                              var20 = var20 + param1[7].field_n;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          bea.a(bba.field_a);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (param1[3] == null) {
                      break L17;
                    } else {
                      if (-1 != (param1[3].field_k ^ -1)) {
                        bea.g(param5, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var20 >= var15) {
                              break L19;
                            } else {
                              param1[3].b(param5, var20);
                              var20 = var20 + param1[3].field_k;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          bea.a(bba.field_a);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (param1[5] == null) {
                      break L20;
                    } else {
                      if (param1[5].field_k == 0) {
                        break L20;
                      } else {
                        bea.g(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var15 <= var20) {
                              break L22;
                            } else {
                              param1[5].b(var13, var20);
                              var20 = var20 + param1[5].field_k;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          bea.a(bba.field_a);
                          break L20;
                        }
                      }
                    }
                  }
                  L23: {
                    if (null == param1[4]) {
                      break L23;
                    } else {
                      if (0 == param1[4].field_n) {
                        break L23;
                      } else {
                        if (0 == param1[4].field_k) {
                          break L23;
                        } else {
                          bea.g(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var15 <= var20) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var13 <= var21) {
                                      break L27;
                                    } else {
                                      param1[4].b(var21, var20);
                                      var21 = var21 + param1[4].field_n;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param1[4].field_k;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            bea.a(bba.field_a);
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    public static void j(byte param0) {
        field_x = null;
        if (param0 <= 105) {
            return;
        }
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
