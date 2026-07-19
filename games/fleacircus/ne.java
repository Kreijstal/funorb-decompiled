/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    static rh field_a;
    pi[] field_c;
    static int[] field_b;
    static fh field_d;

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param2;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var7 <= var8) {
                      break L4;
                    } else {
                      var9 = param1.charAt(var8);
                      var12 = -61;
                      var11 = var9 ^ -1;
                      if (var10 != 0) {
                        if (var11 >= var12) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            if (var11 != var12) {
                              break L6;
                            } else {
                              var6 = 1;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var9 != 62) {
                              break L7;
                            } else {
                              var6 = 0;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var6 != 0) {
                            break L5;
                          } else {
                            if (var9 == 32) {
                              var5_int++;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (0 >= var5_int) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                stackOut_17_0 = (param3 + -param0 << 1573935784) / var5_int;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("ne.P(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
            ne.a((byte) 82);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0) {
        if (param0) {
          if (null != this.field_c) {
            if ((this.field_c.length ^ -1) >= -1) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
            }
          } else {
            return 0;
          }
        } else {
          field_b = (int[]) null;
          if (null != this.field_c) {
            if ((this.field_c.length ^ -1) >= -1) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
            }
          } else {
            return 0;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        pi var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (param1 == -1) {
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_c.length) {
              var4 = this.field_c[var3];
              stackOut_5_0 = param0 ^ -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 == 0) {
                if (stackIn_7_0 <= (var4.field_d.length ^ -1)) {
                  param0 = param0 - (var4.field_d.length + -1);
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return this.field_c.length;
            }
          }
        } else {
          return 33;
        }
    }

    final int b(byte param0) {
        int discarded$2 = 0;
        int var2 = 0;
        pi[] var3 = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        if (param0 == 97) {
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var3.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.b((byte) -42);
                      if (var2 >= var6) {
                        break L2;
                      } else {
                        var2 = var6;
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          discarded$2 = this.a(false);
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L3: while (true) {
              L4: {
                if (var3.length <= var4) {
                  break L4;
                } else {
                  L5: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L5;
                    } else {
                      var6 = var5.b((byte) -42);
                      if (var2 >= var6) {
                        break L5;
                      } else {
                        var2 = var6;
                        break L5;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              return var2;
            }
          }
        }
    }

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        pi var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_19_0 = 0;
        var8 = fleas.field_A ? 1 : 0;
        if (null != this.field_c) {
          if (this.field_c.length != 0) {
            if (this.field_c[0].field_a > param1) {
              return -1;
            } else {
              if (this.field_c[-1 + this.field_c.length].field_c < param1) {
                return -1;
              } else {
                if ((this.field_c.length ^ -1) != -2) {
                  var4 = 0;
                  if (param2 < -104) {
                    var5 = 0;
                    L0: while (true) {
                      if (var5 < this.field_c.length) {
                        var6 = this.field_c[var5];
                        stackOut_19_0 = var6.field_a ^ -1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var8 == 0) {
                          L1: {
                            if (stackIn_21_0 < (param1 ^ -1)) {
                              break L1;
                            } else {
                              if (param1 > var6.field_c) {
                                break L1;
                              } else {
                                var7 = var6.a(6759, param0);
                                if ((var7 ^ -1) != 0) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_d.length);
                          var5++;
                          continue L0;
                        } else {
                          return stackIn_20_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -97;
                  }
                } else {
                  return this.field_c[0].a(6759, param0);
                }
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int c(int param0, int param1) {
        pi[] var3 = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        if (param0 == -1) {
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              stackOut_13_0 = param1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var6 == 0) {
                if (stackIn_15_0 >= var5.field_d.length) {
                  param1 = param1 - (-1 + var5.field_d.length);
                  var4++;
                  continue L0;
                } else {
                  return var5.field_d[param1];
                }
              } else {
                return stackIn_14_0;
              }
            } else {
              return 0;
            }
          }
        } else {
          field_a = (rh) null;
          var4 = 0;
          L1: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              stackOut_4_0 = param1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var6 == 0) {
                if (stackIn_6_0 >= var5.field_d.length) {
                  param1 = param1 - (-1 + var5.field_d.length);
                  var4++;
                  continue L1;
                } else {
                  return var5.field_d[param1];
                }
              } else {
                return stackIn_5_0;
              }
            } else {
              return 0;
            }
          }
        }
    }

    static {
        field_b = new int[256];
        field_d = new fh(0, 2, 2, 1);
    }
}
