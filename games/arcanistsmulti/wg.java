/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ag {
    private int field_K;
    int field_L;
    static qb[] field_J;
    private jl field_I;
    int field_H;

    final int g(byte param0) {
        if (param0 != -102) {
            Object var3 = null;
            boolean discarded$0 = ((wg) this).a(-7, 91, (qm) null, 21, -15, 11, 120);
        }
        return ((wg) this).field_K;
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        field_J = null;
    }

    final int c(boolean param0) {
        if (param0) {
            int discarded$0 = ((wg) this).c(true);
        }
        return ((wg) this).field_I.a(1);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 < 0) {
                break L1;
              } else {
                if (id.field_b > param7) {
                  L2: {
                    if (param2 >= 0) {
                      break L2;
                    } else {
                      if (param0 >= 0) {
                        break L2;
                      } else {
                        if (param8 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < id.field_d) {
                      break L3;
                    } else {
                      if (id.field_d > param0) {
                        break L3;
                      } else {
                        if (param8 < id.field_d) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param1 == 2973) {
                      break L4;
                    } else {
                      wg.d(false);
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param5 - param7;
                    if (param7 != param3) {
                      L6: {
                        var10 = param2 << 16;
                        var9_int = param2 << 16;
                        var15 = param3 + -param7;
                        var11 = (-param2 + param0 << 16) / var15;
                        var12 = (-param2 + param8 << 16) / var14;
                        if (~var11 <= ~var12) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L6;
                        } else {
                          var13 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param7 < 0) {
                            if (param3 >= 0) {
                              param7 = -param7;
                              var10 = var10 + param7 * var12;
                              var9_int = var9_int + var11 * param7;
                              param7 = 0;
                              break L8;
                            } else {
                              param7 = -param7 + param3;
                              var10 = var10 + var12 * param7;
                              var9_int = var9_int + var11 * param7;
                              param7 = param3;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var16 = id.field_f[param7];
                        L9: while (true) {
                          if (~param7 <= ~param3) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (~id.field_d < ~var17) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (0 > var17) {
                                    break L10;
                                  } else {
                                    if (var17 < id.field_d) {
                                      ol.a(var16 + var17, param4, false, param6, var18);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (~(var17 + var18) <= ~id.field_d) {
                                      var18 = -1 + (id.field_d - var17);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    ol.a(var17 + var16, param4, false, param6, var18);
                                    break L10;
                                  } else {
                                    ol.a(var16, param4, false, param6, var18 + var17);
                                    break L10;
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param7++;
                            if (~param7 > ~id.field_b) {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var16 = var16 + de.field_e;
                              continue L9;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param5 + -param3;
                      if (var16 != 0) {
                        L12: {
                          var17 = param8 << 16;
                          if (var13 != 0) {
                            var10 = param0 << 16;
                            break L12;
                          } else {
                            var9_int = param0 << 16;
                            break L12;
                          }
                        }
                        var12 = (var17 + -var10) / var16;
                        var11 = (var17 + -var9_int) / var16;
                        break L5;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      }
                    } else {
                      L13: {
                        if (param7 == param5) {
                          var10 = param0 << 16;
                          var11 = 0;
                          var12 = 0;
                          var9_int = param2 << 16;
                          break L13;
                        } else {
                          var15 = -param3 + param5;
                          if (~param0 < ~param2) {
                            var10 = param0 << 16;
                            var11 = (param8 + -param2 << 16) / var14;
                            var12 = (param8 + -param0 << 16) / var15;
                            var9_int = param2 << 16;
                            break L13;
                          } else {
                            var12 = (param8 - param2 << 16) / var14;
                            var10 = param2 << 16;
                            var9_int = param0 << 16;
                            var11 = (-param0 + param8 << 16) / var15;
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (0 > param7) {
                          param7 = Math.min(-param7, param3 + -param7);
                          var10 = var10 + param7 * var12;
                          var9_int = var9_int + var11 * param7;
                          param7 = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var13 = 0;
                      break L5;
                    }
                  }
                  L15: {
                    if (param7 >= 0) {
                      break L15;
                    } else {
                      param7 = -param7;
                      var10 = var10 + param7 * var12;
                      var9_int = var9_int + var11 * param7;
                      param7 = 0;
                      break L15;
                    }
                  }
                  var15 = id.field_f[param7];
                  L16: while (true) {
                    if (~param7 <= ~param5) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (var16 >= id.field_d) {
                          break L17;
                        } else {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 == 0) {
                            if (0 > var16) {
                              break L17;
                            } else {
                              if (var16 < id.field_d) {
                                ol.a(var16 - -var15, param4, false, param6, var17);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var16 + var17 >= id.field_d) {
                                var17 = -var16 + id.field_d - 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var16 >= 0) {
                              ol.a(var16 + var15, param4, false, param6, var17);
                              break L17;
                            } else {
                              ol.a(var15, param4, false, param6, var16 + var17);
                              break L17;
                            }
                          }
                        }
                      }
                      param7++;
                      if (param7 < id.field_b) {
                        var15 = var15 + de.field_e;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L16;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var9;
            stackOut_78_1 = new StringBuilder().append("wg.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L19;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L19;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = -12 % ((param4 - -42) / 35);
            if (super.a(param0, param1, param2, param3, 94, param5, param6)) {
              L1: {
                var9 = -((wg) this).field_H + -param6 + param5;
                var10 = -(2 * ((wg) this).field_H) + ((wg) this).field_v;
                if (var10 < var9) {
                  var9 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var9 >= 0) {
                  break L2;
                } else {
                  var9 = 0;
                  break L2;
                }
              }
              L3: {
                var9 = ((wg) this).field_K * var9 / var10;
                if (1 != param1) {
                  if (param1 != 2) {
                    break L3;
                  } else {
                    var11 = 2147483647;
                    var12 = -1;
                    var13 = 0;
                    L4: while (true) {
                      if (var13 >= ((wg) this).field_I.a(1)) {
                        if (var12 >= 0) {
                          ((wg) this).field_I.b(var12, -11292);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          var14 = -var9 + ((wg) this).field_I.c(31103, var13);
                          var14 = var14 * var14;
                          if (var14 >= var11) {
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((wg) this).field_I.a(var9, 1);
                  break L3;
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var8;
            stackOut_21_1 = new StringBuilder().append("wg.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final int a(int param0, int param1) {
        L0: {
          if (param0 > param1) {
            break L0;
          } else {
            if (((wg) this).field_I.a(param0 ^ 1) <= param1) {
              break L0;
            } else {
              return ((wg) this).field_I.c(31103, param1);
            }
          }
        }
        return -1;
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
    }
}
