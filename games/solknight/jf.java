/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    le[] field_c;
    static bc field_a;
    static String field_b;

    final int a(int param0, int param1, int param2, String param3) {
        int discarded$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 21107) {
                break L1;
              } else {
                var11 = (String) null;
                discarded$2 = this.a(-66, 103, -92, (String) null);
                break L1;
              }
            }
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var7 <= var8) {
                      break L5;
                    } else {
                      var9 = param3.charAt(var8);
                      var13 = -61;
                      var12 = var9 ^ -1;
                      if (var10 != 0) {
                        if (var12 >= var13) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var12 != var13) {
                              break L7;
                            } else {
                              var6 = 1;
                              if (var10 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 == 62) {
                              break L8;
                            } else {
                              if (var6 != 0) {
                                break L6;
                              } else {
                                if (var9 == 32) {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6 = 0;
                          break L6;
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (0 >= var5_int) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                stackOut_19_0 = (-param0 + param1 << 439492808) / var5_int;
                stackIn_20_0 = stackOut_19_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        le var11 = null;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        if (this.field_c != null) {
          if (0 != this.field_c.length) {
            if (param1 < this.field_c[0].field_g) {
              return -1;
            } else {
              if (param1 <= this.field_c[this.field_c.length - 1].field_e) {
                if (1 != this.field_c.length) {
                  if (param0 == -2592) {
                    var4 = 0;
                    var5 = 0;
                    L0: while (true) {
                      if (var5 < this.field_c.length) {
                        var11 = this.field_c[var5];
                        stackOut_18_0 = var11.field_g;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var8 == 0) {
                          L1: {
                            if (stackIn_20_0 > param1) {
                              break L1;
                            } else {
                              if (var11.field_e >= param1) {
                                var7 = var11.a(param2, false);
                                if (var7 != -1) {
                                  return var7 + var4;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                          var4 = var4 + (var11.field_c.length - 1);
                          var5++;
                          continue L0;
                        } else {
                          return stackIn_19_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -51;
                  }
                } else {
                  return this.field_c[0].a(param2, false);
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, int param1) {
        le[] var3 = null;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        le[] var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length > var4) {
            var5 = var7[var4];
            stackOut_3_0 = var5.field_c.length ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              if (stackIn_5_0 < (param1 ^ -1)) {
                return var5.field_c[param1];
              } else {
                param1 = param1 - (var5.field_c.length - 1);
                var4++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return 0;
          }
        }
    }

    final int b(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var2 = 0;
        le[] var3 = null;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          var4 = 0;
          L0: while (true) {
            if (var3.length > var4) {
              var5 = var3[var4];
              if (var7 == 0) {
                if (var5 != null) {
                  L1: {
                    var6 = var5.a((byte) 110);
                    if (var2 < var6) {
                      var2 = var6;
                      break L1;
                    } else {
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
              if (param0 != 62) {
                discarded$4 = this.a((byte) 22);
                return var2;
              } else {
                return var2;
              }
            }
          }
        } else {
          if (param0 != 62) {
            discarded$5 = this.a((byte) 22);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = 5 % ((60 - param0) / 43);
        if (this.field_c != null) {
          if (this.field_c.length <= 0) {
            return 0;
          } else {
            return -this.field_c[0].field_g + this.field_c[this.field_c.length + -1].field_e;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -25616) {
            field_b = (String) null;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        le var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (this.field_c.length <= var3) {
              break L1;
            } else {
              var4 = this.field_c[var3];
              var7 = param1 ^ -1;
              var6 = var4.field_c.length ^ -1;
              if (var5 != 0) {
                if (var6 > var7) {
                  field_b = (String) null;
                  return this.field_c.length;
                } else {
                  return this.field_c.length;
                }
              } else {
                if (var6 >= var7) {
                  param1 = param1 - (var4.field_c.length - 1);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var3;
                }
              }
            }
          }
          if (param0 > -87) {
            field_b = (String) null;
            return this.field_c.length;
          } else {
            return this.field_c.length;
          }
        }
    }

    static {
    }
}
