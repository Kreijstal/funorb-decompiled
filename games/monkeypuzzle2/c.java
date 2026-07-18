/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    private uj field_c;
    private ca[] field_g;
    private java.math.BigInteger field_d;
    private gk field_f;
    static c field_h;
    private wl field_e;
    static String field_j;
    private java.math.BigInteger field_i;
    static int field_b;
    private ob field_a;

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        gk var2_ref = null;
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        byte[] var6_array = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((c) this).field_f) {
              L1: {
                if (null != ((c) this).field_a) {
                  break L1;
                } else {
                  if (!((c) this).field_e.d(20)) {
                    ((c) this).field_a = ((c) this).field_e.a(255, 255, 122, true, (byte) 0);
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
              if (!((c) this).field_a.field_j) {
                var2_ref = new gk(((c) this).field_a.e(100));
                var2_ref.field_h = 5;
                var3 = var2_ref.a((byte) 114);
                var2_ref.field_h = var2_ref.field_h + var3 * 72;
                if (param0 <= -49) {
                  L2: {
                    L3: {
                      var4 = new byte[-var2_ref.field_h + var2_ref.field_g.length];
                      var2_ref.a(var4, var4.length, -111, 0);
                      if (null == ((c) this).field_d) {
                        break L3;
                      } else {
                        if (null == ((c) this).field_i) {
                          break L3;
                        } else {
                          var6 = new java.math.BigInteger(var4);
                          var7_ref_java_math_BigInteger = var6.modPow(((c) this).field_d, ((c) this).field_i);
                          var5 = var7_ref_java_math_BigInteger.toByteArray();
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var5 = var4;
                    break L2;
                  }
                  if (var5.length != 65) {
                    throw new RuntimeException();
                  } else {
                    var6_array = ie.a(-51, var2_ref.field_g, -5 + var2_ref.field_h + -var4.length, 5);
                    var7 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var7 >= 64) {
                            break L6;
                          } else {
                            stackOut_29_0 = ~var6_array[var7];
                            stackIn_38_0 = stackOut_29_0;
                            stackIn_30_0 = stackOut_29_0;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (stackIn_30_0 != ~var5[var7 + 1]) {
                                throw new RuntimeException();
                              } else {
                                var7++;
                                if (var8 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        ((c) this).field_f = var2_ref;
                        ((c) this).field_g = new ca[var3];
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        break L5;
                      }
                      break L0;
                    }
                  }
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "c.D(" + param0 + ')');
        }
        return stackIn_38_0 != 0;
    }

    final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (((c) this).field_g != null) {
              var2_int = 0;
              if (param0) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var2_int <= ~((c) this).field_g.length) {
                        break L3;
                      } else {
                        if (var3 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (null == ((c) this).field_g[var2_int]) {
                              break L4;
                            } else {
                              ((c) this).field_g[var2_int].b(-1);
                              break L4;
                            }
                          }
                          var2_int++;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = 0;
                    break L2;
                  }
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_int >= ((c) this).field_g.length) {
                          break L7;
                        } else {
                          if (var3 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (((c) this).field_g[var2_int] == null) {
                                break L8;
                              } else {
                                ((c) this).field_g[var2_int].c(16311);
                                break L8;
                              }
                            }
                            var2_int++;
                            if (var3 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      break L6;
                    }
                    break L0;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "c.B(" + param0 + ')');
        }
    }

    final static le[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        le[] var10 = null;
        le[] var11_ref_le__ = null;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        le[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        le[] stackOut_63_0 = null;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = param3 + (param7 + param6);
              var10 = new le[]{new le(var9_int, var9_int), new le(param1, var9_int), new le(var9_int, var9_int), new le(var9_int, param1), new le(64, 64), new le(var9_int, param1), new le(var9_int, var9_int), new le(param1, var9_int), new le(var9_int, var9_int)};
              var11_ref_le__ = var10;
              if (param8) {
                break L1;
              } else {
                le[] discarded$1 = c.a(-50, -14, 118, -7, 1, -75, 1, 23, false);
                break L1;
              }
            }
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var11_ref_le__.length <= var12) {
                    break L4;
                  } else {
                    var13 = var11_ref_le__[var12];
                    stackOut_6_0 = 0;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      var14 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var14 >= var13.field_s.length) {
                              break L7;
                            } else {
                              var13.field_s[var14] = param5;
                              var14++;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var12++;
                          break L6;
                        }
                        if (var15 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              var11 = stackIn_16_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (param7 <= var11) {
                      break L10;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_28_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_19_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var12 >= var9_int) {
                                break L13;
                              } else {
                                var10[6].field_s[var12 + var9_int * (-var11 + var9_int + -1)] = param2;
                                var10[8].field_s[var12 + (-var11 + var9_int - 1) * var9_int] = param2;
                                var10[2].field_s[var12 * var9_int + -var11 + (var9_int - 1)] = param2;
                                var10[8].field_s[var9_int * var12 - (var11 + (1 + -var9_int))] = param2;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                var11 = stackIn_28_0;
                L14: while (true) {
                  stackOut_29_0 = ~var11;
                  stackOut_29_1 = ~param7;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_30_0 <= stackIn_30_1) {
                          break L17;
                        } else {
                          stackOut_31_0 = 0;
                          stackIn_41_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_32_0;
                            L18: while (true) {
                              L19: {
                                if (~var9_int >= ~var12) {
                                  break L19;
                                } else {
                                  var10[0].field_s[var9_int * var11 + var12] = param4;
                                  var10[0].field_s[var9_int * var12 + var11] = param4;
                                  stackOut_34_0 = ~var12;
                                  stackOut_34_1 = ~(-var11 + var9_int);
                                  stackIn_30_0 = stackOut_34_0;
                                  stackIn_30_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_35_0 <= stackIn_35_1) {
                                        break L20;
                                      } else {
                                        var10[2].field_s[var9_int * var11 + var12] = param4;
                                        var10[6].field_s[var11 + var9_int * var12] = param4;
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L16;
                    }
                    var11 = stackIn_41_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (~param1 >= ~var11) {
                            break L23;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_53_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_44_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (~var12 <= ~param7) {
                                      break L26;
                                    } else {
                                      var10[7].field_s[param1 * (-1 + var9_int + -var12) + var11] = param2;
                                      var10[5].field_s[var9_int * var11 + (var9_int + -1 + -var12)] = param2;
                                      var10[1].field_s[param1 * var12 - -var11] = param4;
                                      var10[3].field_s[var11 * var9_int + var12] = param4;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L22;
                      }
                      var11 = stackIn_53_0;
                      L27: while (true) {
                        L28: {
                          if (var11 >= param1 >> 1903996897) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~param6 >= ~var12) {
                                    break L31;
                                  } else {
                                    var10[1].field_s[param1 * (var9_int + -var12 - 1) + var11] = param0;
                                    var10[3].field_s[var9_int * var11 - var12 - (1 + -var9_int)] = param0;
                                    var10[7].field_s[var11 + var12 * param1] = param0;
                                    var10[5].field_s[var9_int * var11 - -var12] = param0;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_63_0 = (le[]) var10;
                        stackIn_64_0 = stackOut_63_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var9, "c.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    c(wl param0, uj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              if (param0) {
                break L1;
              } else {
                c.a(true);
                break L1;
              }
            }
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "c.A(" + param0 + ')');
        }
    }

    final ca a(int param0, gf param1, int param2, gf param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        ca var9 = null;
        ca stackIn_14_0 = null;
        ca stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_13_0 = null;
        ca stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
            if (null != ((c) this).field_f) {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (~((c) this).field_g.length >= ~param2) {
                    break L1;
                  } else {
                    if (((c) this).field_g[param2] != null) {
                      stackOut_13_0 = ((c) this).field_g[param2];
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      L2: {
                        ((c) this).field_f.field_h = param2 * 72 + 6;
                        var6_int = ((c) this).field_f.e(126);
                        var7 = ((c) this).field_f.e(-61);
                        if (param0 == -24559) {
                          break L2;
                        } else {
                          ca discarded$1 = ((c) this).a(-126, (gf) null, 30, (gf) null, false);
                          break L2;
                        }
                      }
                      var8 = new byte[64];
                      ((c) this).field_f.a(var8, 64, -86, 0);
                      var9 = new ca(param2, param3, param1, ((c) this).field_e, ((c) this).field_c, var6_int, var8, var7, param4);
                      ((c) this).field_g[param2] = var9;
                      stackOut_18_0 = (ca) var9;
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("c.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          L4: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
        }
        return stackIn_19_0;
    }

    private c(wl param0, uj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((c) this).field_e = param0;
              ((c) this).field_i = param3;
              ((c) this).field_d = param2;
              ((c) this).field_c = param1;
              if (((c) this).field_e.d(20)) {
                break L1;
              } else {
                ((c) this).field_a = ((c) this).field_e.a(255, 255, 105, true, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("c.<init>(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Creating your account";
    }
}
