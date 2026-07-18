/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends sfa {
    int field_l;
    static boolean field_k;
    static int[] field_j;
    int field_i;

    final void a(int param0, lu param1) {
        try {
            int var3_int = -113 / ((61 - param0) / 53);
            param1.d(((gm) this).field_i | ((gm) this).field_l << 3, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0, op param1) {
        RuntimeException var3 = null;
        wia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aga var10 = null;
        aga var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var10 = ((gm) this).field_h.a(42, param1);
              var11 = var10;
              var4 = param1.field_a[var10.field_x][var10.field_J];
              var5 = var11.a(51, (byte) -87) ? 1 : 0;
              var7 = -31;
              if (var4.field_n != 27) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = stackIn_3_0;
                if (1 != param1.field_E) {
                  break L3;
                } else {
                  if (var4.field_i) {
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var8 = stackIn_7_0;
              if (var5 != 0) {
                break L4;
              } else {
                if (var6 != 0) {
                  break L4;
                } else {
                  if (var8 == 0) {
                    stackOut_11_0 = ((gm) this).field_l;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              var9 = ((gm) this).field_l;
              if (var8 != 0) {
                var9 = var9 + (-1 + kla.a(3, param1.field_w, -2147483648));
                if (var9 >= 1) {
                  break L5;
                } else {
                  var9 = 1;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (var6 != 0) {
                L7: {
                  if (var4.field_j == 1) {
                    var9--;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var4.field_j != 2) {
                    break L8;
                  } else {
                    var9 -= 2;
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    if (3 == var4.field_j) {
                      break L10;
                    } else {
                      if (var4.field_j != 4) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var9 -= 3;
                  break L9;
                }
                if (var9 < 1) {
                  var9 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            stackOut_31_0 = param1.a(var9, var11, ((gm) this).field_i, -1);
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("gm.E(").append(-97).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    private final df b(int param0, int param1, boolean param2) {
        return new df(((gm) this).field_g, ((gm) this).field_h, ((gm) this).field_i, param1, param2);
    }

    gm(int param0, aga param1) {
        super(2, param0, new nq(param1));
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= param4) {
                break L1;
              } else {
                L2: {
                  var5_int = (param4 - -param0) / 2;
                  var6 = param4;
                  var7 = param2[var5_int];
                  param2[var5_int] = param2[param0];
                  param2[param0] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param0];
                  param3[param0] = var8;
                  if (2147483647 != var7) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param4;
                L3: while (true) {
                  if (param0 <= var10) {
                    param2[param0] = param2[var6];
                    param2[var6] = var7;
                    param3[param0] = param3[var6];
                    param3[var6] = var8;
                    gm.a(-1 + var6, -30111, param2, param3, param4);
                    gm.a(param0, -30111, param2, param3, 1 + var6);
                    break L1;
                  } else {
                    L4: {
                      if (param2[var10] <= var7 - (var10 & var9)) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(-30111).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        field_j = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        aga var7 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        aga var12 = null;
        aga var13 = null;
        df stackIn_3_0 = null;
        df stackIn_8_0 = null;
        df stackIn_13_0 = null;
        df stackIn_20_0 = null;
        df stackIn_63_0 = null;
        df stackIn_65_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_7_0 = null;
        df stackOut_12_0 = null;
        df stackOut_19_0 = null;
        df stackOut_62_0 = null;
        df stackOut_64_0 = null;
        df stackOut_2_0 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var12 = ((gm) this).field_h.a(32, param0);
            var13 = var12;
            if (8 != var13.field_y) {
              L1: {
                if (var13.field_y != 11) {
                  break L1;
                } else {
                  if (kla.a(100, param0.field_w, param1 + 2147483645) > 50) {
                    stackOut_7_0 = this.b(25683, 0, true);
                    stackIn_8_0 = stackOut_7_0;
                    return (ii) (Object) stackIn_8_0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param0.field_a[var12.field_x][var12.field_J].field_n != 30) {
                  break L2;
                } else {
                  if (var13.field_y != 32) {
                    stackOut_12_0 = this.b(25683, 0, true);
                    stackIn_13_0 = stackOut_12_0;
                    return (ii) (Object) stackIn_13_0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var13.field_y == 51) {
                  ((gm) this).field_i = 1 + kla.a(4, param0.field_w, -2147483648);
                  break L3;
                } else {
                  break L3;
                }
              }
              var13.field_s = ((gm) this).field_i;
              ((gm) this).field_l = this.a((byte) -97, param0);
              if (((gm) this).field_l == 0) {
                stackOut_19_0 = this.b(25683, 0, true);
                stackIn_20_0 = stackOut_19_0;
                return (ii) (Object) stackIn_20_0;
              } else {
                L4: {
                  var4 = var13.field_x;
                  var5 = var13.field_J;
                  if (((gm) this).field_i != 2) {
                    if (((gm) this).field_i != 1) {
                      if (((gm) this).field_i != 4) {
                        if (((gm) this).field_i != 3) {
                          break L4;
                        } else {
                          var5 = var5 + ((gm) this).field_l;
                          break L4;
                        }
                      } else {
                        var4 = var4 + ((gm) this).field_l;
                        break L4;
                      }
                    } else {
                      var5 = var5 - ((gm) this).field_l;
                      break L4;
                    }
                  } else {
                    var4 = var4 - ((gm) this).field_l;
                    break L4;
                  }
                }
                L5: {
                  if (param1 == 3) {
                    break L5;
                  } else {
                    var11 = null;
                    ii discarded$1 = ((gm) this).a((op) null, -85);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (param0.field_a[var4][var5].field_n == 22) {
                      break L7;
                    } else {
                      if (param0.field_a[var4][var5].field_n != 28) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((gm) this).field_l = ((gm) this).field_l - 1;
                  break L6;
                }
                L8: {
                  var6 = param0.field_a[var4][var5];
                  var7 = var6.field_l;
                  if (var7 == null) {
                    break L8;
                  } else {
                    L9: {
                      var8 = null;
                      if (var7.field_k[1] >= var12.field_k[1]) {
                        break L9;
                      } else {
                        if (var8 == null) {
                          break L9;
                        } else {
                          ((df) var8).field_t = true;
                          ((df) var8).field_n = ((df) var8).field_n - 1;
                          param0.field_a[var12.field_x][var12.field_J].field_l = null;
                          if (2 != ((df) var8).field_p) {
                            if (((df) var8).field_p != 4) {
                              if (((df) var8).field_p != 1) {
                                if (((df) var8).field_p == 3) {
                                  param0.field_a[var13.field_x][-1 + var13.field_J].field_l = var7;
                                  var7.field_J = var7.field_J - 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              } else {
                                param0.field_a[var13.field_x][1 + var13.field_J].field_l = var7;
                                var7.field_J = var7.field_J + 1;
                                break L8;
                              }
                            } else {
                              param0.field_a[-1 + var13.field_x][var13.field_J].field_l = var7;
                              var7.field_x = var7.field_x - 1;
                              break L8;
                            }
                          } else {
                            param0.field_a[1 + var12.field_x][var12.field_J].field_l = var7;
                            var7.field_x = var7.field_x + 1;
                            break L8;
                          }
                        }
                      }
                    }
                    var9 = -1 + ((gm) this).field_l;
                    L10: while (true) {
                      L11: {
                        if (0 >= var9) {
                          break L11;
                        } else {
                          L12: {
                            if (((gm) this).field_i != 2) {
                              break L12;
                            } else {
                              if (null == param0.field_a[var13.field_x + -var9][var13.field_J].field_l) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (1 != ((gm) this).field_i) {
                              break L13;
                            } else {
                              if (param0.field_a[var13.field_x][var13.field_J - var9].field_l != null) {
                                break L13;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L14: {
                            if (((gm) this).field_i != 4) {
                              break L14;
                            } else {
                              if (param0.field_a[var13.field_x + var9][var13.field_J].field_l != null) {
                                break L14;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L15: {
                            if (((gm) this).field_i != 3) {
                              break L15;
                            } else {
                              if (param0.field_a[var13.field_x][var9 + var13.field_J].field_l != null) {
                                break L15;
                              } else {
                                return (ii) (Object) this.b(25683, var9, true);
                              }
                            }
                          }
                          var9--;
                          continue L10;
                        }
                      }
                      stackOut_62_0 = this.b(25683, var9, true);
                      stackIn_63_0 = stackOut_62_0;
                      return (ii) (Object) stackIn_63_0;
                    }
                  }
                }
                stackOut_64_0 = this.b(25683, ((gm) this).field_l, false);
                stackIn_65_0 = stackOut_64_0;
                break L0;
              }
            } else {
              stackOut_2_0 = this.b(25683, 0, true);
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var3;
            stackOut_66_1 = new StringBuilder().append("gm.A(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_65_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_j = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
    }
}
