/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ju {
    static wk[][] field_a;
    ts[] field_b;
    static int[] field_c;

    final int a(byte param0) {
        int var2 = 0;
        var2 = -76 / ((param0 - 74) / 32);
        if (this.field_b != null) {
          if (0 >= this.field_b.length) {
            return 0;
          } else {
            return this.field_b[-1 + this.field_b.length].field_c - this.field_b[0].field_n;
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ts var12 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_b != null) {
          if (0 != this.field_b.length) {
            if (this.field_b[0].field_n <= param1) {
              if (param1 <= this.field_b[this.field_b.length + param2].field_c) {
                if (-2 != (this.field_b.length ^ -1)) {
                  var4 = 0;
                  var5 = 0;
                  L0: while (true) {
                    if (this.field_b.length > var5) {
                      var12 = this.field_b[var5];
                      stackOut_16_0 = param1 ^ -1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var8 == 0) {
                        L1: {
                          if (stackIn_18_0 > (var12.field_n ^ -1)) {
                            break L1;
                          } else {
                            if (param1 > var12.field_c) {
                              break L1;
                            } else {
                              var7 = var12.a(param0, (byte) 29);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var4 - -var7;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var12.field_i.length);
                        var5++;
                        continue L0;
                      } else {
                        return stackIn_17_0;
                      }
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return this.field_b[0].a(param0, (byte) 29);
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static int a(bv param0, int param1, int param2, int param3, byte param4, int param5) {
        int discarded$2 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        bv var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param4 <= -121) {
                break L1;
              } else {
                var7 = (bv) null;
                discarded$2 = ju.a((bv) null, 120, 29, -83, (byte) -93, 59);
                break L1;
              }
            }
            var6_int = param0.g(-106, 1);
            if (0 != var6_int) {
              if (1 == var6_int) {
                stackOut_9_0 = param0.g(95, param3) - -param1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              L2: {
                if ((param5 ^ -1) < -1) {
                  stackOut_5_0 = param0.g(-109, param5);
                  stackIn_6_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("ju.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ju.a(-112);
                break L1;
              }
            }
            stackOut_2_0 = ob.a(param1, true, param2, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(boolean param0) {
        int var2 = 0;
        ts[] var3 = null;
        int var4 = 0;
        ts var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = -1;
        if (this.field_b != null) {
          var3 = this.field_b;
          var4 = 0;
          L0: while (true) {
            if (var3.length > var4) {
              var5 = var3[var4];
              if (var7 == 0) {
                if (var5 != null) {
                  L1: {
                    var6 = var5.a(0);
                    if (var2 >= var6) {
                      break L1;
                    } else {
                      var2 = var6;
                      break L1;
                    }
                  }
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return var2;
              }
            } else {
              if (param0) {
                field_a = (wk[][]) null;
                return var2;
              } else {
                return var2;
              }
            }
          }
        } else {
          if (param0) {
            field_a = (wk[][]) null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0, int param1) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        ts[] var3 = null;
        int var4 = 0;
        ts var5 = null;
        int var6 = 0;
        ts[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= var7.length) {
              break L1;
            } else {
              var5 = var7[var4];
              var9 = param1 ^ -1;
              var8 = var5.field_i.length ^ -1;
              if (var6 != 0) {
                if (var8 != var9) {
                  discarded$4 = this.a(true);
                  return 0;
                } else {
                  return 0;
                }
              } else {
                if (var8 >= var9) {
                  param1 = param1 - (-1 + var5.field_i.length);
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var5.field_i[param1];
                }
              }
            }
          }
          if (param0 != -66) {
            discarded$5 = this.a(true);
            return 0;
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        ts var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        L0: while (true) {
          if (this.field_b.length > var3) {
            var4 = this.field_b[var3];
            stackOut_3_0 = var4.field_i.length ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_5_0 < (param1 ^ -1)) {
                return var3;
              } else {
                param1 = param1 - (-1 + var4.field_i.length);
                var3++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return this.field_b.length;
          }
        }
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        CharSequence var2 = null;
        if (param0 >= -111) {
          var2 = (CharSequence) null;
          discarded$2 = ju.a(-42, 6, (CharSequence) null);
          field_c = null;
          field_a = (wk[][]) null;
          return;
        } else {
          field_c = null;
          field_a = (wk[][]) null;
          return;
        }
    }

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
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 <= var8) {
                    break L3;
                  } else {
                    var9 = param1.charAt(var8);
                    var12 = 60;
                    var11 = var9;
                    if (var10 != 0) {
                      if (var11 < var12) {
                        break L2;
                      } else {
                        return 0;
                      }
                    } else {
                      L4: {
                        L5: {
                          if (var11 == var12) {
                            break L5;
                          } else {
                            L6: {
                              if (var9 == 62) {
                                break L6;
                              } else {
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  if (var9 == 32) {
                                    var5_int++;
                                    if (var10 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            var6 = 0;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6 = 1;
                        break L4;
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if ((var5_int ^ -1) < -1) {
                  break L2;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackOut_18_0 = (-param3 + param2 << -1853594840) / var5_int;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("ju.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_c = new int[8192];
    }
}
