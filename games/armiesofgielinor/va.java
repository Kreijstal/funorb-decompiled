/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends ms {
    int[] field_C;
    static String field_F;
    char[] field_v;
    static int field_u;
    static int field_z;
    boolean field_H;
    static int field_D;
    static String field_B;
    String field_E;
    char[] field_x;
    static hg field_w;
    static int[] field_G;
    int[] field_y;
    static String[] field_A;

    private final void a(byte param0, vh param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char stackIn_18_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char stackOut_17_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 81 % ((param0 - 47) / 62);
              if (param2 == 1) {
                this.field_E = param1.g(1);
                break L1;
              } else {
                L2: {
                  L3: {
                    if (-3 != (param2 ^ -1)) {
                      break L3;
                    } else {
                      var5 = param1.k(0);
                      this.field_C = new int[var5];
                      this.field_x = new char[var5];
                      var6 = 0;
                      L4: while (true) {
                        L5: {
                          if ((var5 ^ -1) >= (var6 ^ -1)) {
                            break L5;
                          } else {
                            this.field_C[var6] = param1.e((byte) -104);
                            var7 = param1.a((byte) 111);
                            if (var8 != 0) {
                              break L2;
                            } else {
                              L6: {
                                stackOut_6_0 = this.field_x;
                                stackOut_6_1 = var6;
                                stackIn_8_0 = stackOut_6_0;
                                stackIn_8_1 = stackOut_6_1;
                                stackIn_7_0 = stackOut_6_0;
                                stackIn_7_1 = stackOut_6_1;
                                if (0 == var7) {
                                  stackOut_8_0 = (char[]) ((Object) stackIn_8_0);
                                  stackOut_8_1 = stackIn_8_1;
                                  stackOut_8_2 = (char)0;
                                  stackIn_9_0 = stackOut_8_0;
                                  stackIn_9_1 = stackOut_8_1;
                                  stackIn_9_2 = stackOut_8_2;
                                  break L6;
                                } else {
                                  stackOut_7_0 = (char[]) ((Object) stackIn_7_0);
                                  stackOut_7_1 = stackIn_7_1;
                                  stackOut_7_2 = we.a(-121, (byte) var7);
                                  stackIn_9_0 = stackOut_7_0;
                                  stackIn_9_1 = stackOut_7_1;
                                  stackIn_9_2 = stackOut_7_2;
                                  break L6;
                                }
                              }
                              stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                              var6++;
                              if (var8 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L7: {
                    if (3 != param2) {
                      break L7;
                    } else {
                      var5 = param1.k(0);
                      this.field_v = new char[var5];
                      this.field_y = new int[var5];
                      var6 = 0;
                      L8: while (true) {
                        L9: {
                          if ((var5 ^ -1) >= (var6 ^ -1)) {
                            break L9;
                          } else {
                            this.field_y[var6] = param1.e((byte) -104);
                            var7 = param1.a((byte) -74);
                            if (var8 != 0) {
                              break L2;
                            } else {
                              L10: {
                                stackOut_15_0 = this.field_v;
                                stackOut_15_1 = var6;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (0 == var7) {
                                  stackOut_17_0 = (char[]) ((Object) stackIn_17_0);
                                  stackOut_17_1 = stackIn_17_1;
                                  stackOut_17_2 = (char)0;
                                  stackIn_18_0 = stackOut_17_0;
                                  stackIn_18_1 = stackOut_17_1;
                                  stackIn_18_2 = stackOut_17_2;
                                  break L10;
                                } else {
                                  stackOut_16_0 = (char[]) ((Object) stackIn_16_0);
                                  stackOut_16_1 = stackIn_16_1;
                                  stackOut_16_2 = we.a(-125, (byte) var7);
                                  stackIn_18_0 = stackOut_16_0;
                                  stackIn_18_1 = stackOut_16_1;
                                  stackIn_18_2 = stackOut_16_2;
                                  break L10;
                                }
                              }
                              stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                              var6++;
                              if (var8 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (param2 != 4) {
                    break L2;
                  } else {
                    this.field_H = true;
                    if (var8 == 0) {
                      break L2;
                    } else {
                      this.field_E = param1.g(1);
                      break L1;
                    }
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("va.D(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        vh var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_y) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) > (this.field_y.length ^ -1)) {
              this.field_y[var2] = oe.c(this.field_y[var2], 32768);
              var2++;
              if (var3 != 0) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_C.length) {
                    if (param0 > 6) {
                      return;
                    } else {
                      var4 = (vh) null;
                      this.a((byte) 40, (vh) null, -40);
                      return;
                    }
                  } else {
                    this.field_C[var2] = oe.c(this.field_C[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        if (param0 > 6) {
                          return;
                        } else {
                          var4 = (vh) null;
                          this.a((byte) 40, (vh) null, -40);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (var3 == 0) {
                  continue L0;
                } else {
                  if (this.field_C != null) {
                    var2 = 0;
                    L2: while (true) {
                      if (var2 >= this.field_C.length) {
                        if (param0 > 6) {
                          return;
                        } else {
                          var4 = (vh) null;
                          this.a((byte) 40, (vh) null, -40);
                          return;
                        }
                      } else {
                        this.field_C[var2] = oe.c(this.field_C[var2], 32768);
                        var2++;
                        if (var3 == 0) {
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            if (param0 > 6) {
                              return;
                            } else {
                              var4 = (vh) null;
                              this.a((byte) 40, (vh) null, -40);
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (param0 > 6) {
                      return;
                    } else {
                      var4 = (vh) null;
                      this.a((byte) 40, (vh) null, -40);
                      return;
                    }
                  }
                }
              }
            } else {
              if (this.field_C != null) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= this.field_C.length) {
                    if (param0 > 6) {
                      return;
                    } else {
                      var4 = (vh) null;
                      this.a((byte) 40, (vh) null, -40);
                      return;
                    }
                  } else {
                    this.field_C[var2] = oe.c(this.field_C[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        L4: {
                          if (param0 > 6) {
                            break L4;
                          } else {
                            var4 = (vh) null;
                            this.a((byte) 40, (vh) null, -40);
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L5: {
                  if (param0 > 6) {
                    break L5;
                  } else {
                    var4 = (vh) null;
                    this.a((byte) 40, (vh) null, -40);
                    break L5;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (this.field_C != null) {
            var2 = 0;
            L6: while (true) {
              if (var2 >= this.field_C.length) {
                if (param0 > 6) {
                  return;
                } else {
                  var4 = (vh) null;
                  this.a((byte) 40, (vh) null, -40);
                  return;
                }
              } else {
                this.field_C[var2] = oe.c(this.field_C[var2], 32768);
                var2++;
                if (var3 == 0) {
                  if (var3 == 0) {
                    continue L6;
                  } else {
                    if (param0 > 6) {
                      return;
                    } else {
                      var4 = (vh) null;
                      this.a((byte) 40, (vh) null, -40);
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 > 6) {
              return;
            } else {
              var4 = (vh) null;
              this.a((byte) 40, (vh) null, -40);
              return;
            }
          }
        }
    }

    public static void h(int param0) {
        field_B = null;
        field_F = null;
        if (param0 > -91) {
            va.h(-117);
            field_A = null;
            field_G = null;
            field_w = null;
            return;
        }
        field_A = null;
        field_G = null;
        field_w = null;
    }

    final void a(byte param0, vh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 < -79) {
              L1: while (true) {
                L2: {
                  var3_int = param1.k(0);
                  if ((var3_int ^ -1) == -1) {
                    break L2;
                  } else {
                    this.a((byte) -120, param1, var3_int);
                    if (var4 == 0) {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("va.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    va() {
        this.field_H = false;
    }

    static {
        field_F = "No options available";
        field_G = new int[]{7, 1, 0, 0, 2, 5, 4, 1, 1, 1, 9, 7, 11, 11, 1, 11};
        field_B = "Connection restored.";
        field_u = 0;
        field_w = new hg();
    }
}
