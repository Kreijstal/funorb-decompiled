/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ao extends pk implements ug {
    pk[] field_x;
    static ji field_y;
    static String field_z;

    boolean a(pk param0, byte param1) {
        pk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        pk[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_x;
              var3 = var7;
              if (param1 == 61) {
                break L1;
              } else {
                this.field_x = (pk[]) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var7.length) {
                  break L3;
                } else {
                  L4: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (!var5.a(param0, (byte) 61)) {
                        break L4;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("ao.Q(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(pk param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pk var6 = null;
        pk var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == this.field_x) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 0;
              var5 = -106 / ((28 - param1) / 42);
              L1: while (true) {
                L2: {
                  if (var4_int >= this.field_x.length) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var6 = this.field_x[var4_int];
                        if (var6 == null) {
                          break L4;
                        } else {
                          if (!var6.d(-1)) {
                            break L4;
                          } else {
                            var4_int = var4_int + param2;
                            L5: while (true) {
                              if (var4_int >= this.field_x.length) {
                                break L4;
                              } else {
                                var7 = this.field_x[var4_int];
                                if (var8 != 0) {
                                  break L3;
                                } else {
                                  L6: {
                                    if (var7 == null) {
                                      break L6;
                                    } else {
                                      if (var7.a(param0, (byte) 61)) {
                                        stackOut_15_0 = 1;
                                        stackIn_16_0 = stackOut_15_0;
                                        decompiledRegionSelector0 = 1;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var4_int = var4_int + param2;
                                  if (var8 == 0) {
                                    continue L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      break L3;
                    }
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("ao.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        pk[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        pk[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_19_0 = false;
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
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x != null) {
              L1: {
                if (param2 >= 9) {
                  break L1;
                } else {
                  ao.a(-24);
                  break L1;
                }
              }
              var9 = this.field_x;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var6 >= var9.length) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var9[var6];
                      if (var7 == null) {
                        break L4;
                      } else {
                        if (!var7.d(-1)) {
                          break L4;
                        } else {
                          if (var7.a(param0, param1, (byte) 72, param3)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6++;
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_int = param3;
                if ((var5_int ^ -1) != -81) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L5: {
                    if (!hw.field_b[81]) {
                      stackOut_18_0 = this.a((byte) -17, param0);
                      stackIn_19_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = this.b(param0, (byte) 113);
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5_ref);
            stackOut_22_1 = new StringBuilder().append("ao.KA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    ao(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
    }

    final boolean a(byte param0, pk param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == -17) {
                break L1;
              } else {
                discarded$2 = this.d(-97);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param1, (byte) -49, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ao.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        pk var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                var6 = (pk) null;
                discarded$2 = this.b((pk) null, (byte) -86);
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param1, -124, param2)) {
                this.a(param0, (byte) -128, param2, param1);
                this.a(param1, param0, 10, param2);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ao.S(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, pk param2, int param3) {
        pk[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        pk var8 = null;
        int var9 = 0;
        pk[] var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            super.a(param0, -118, param2, param3);
            if (null != this.field_x) {
              var10 = this.field_x;
              var5 = var10;
              var6 = 102 % ((-25 - param1) / 45);
              var7 = 0;
              L1: while (true) {
                if (var10.length <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var10[var7];
                  if (var9 == 0) {
                    L2: {
                      if (var8 == null) {
                        break L2;
                      } else {
                        var8.a(this.field_r + param0, 95, param2, this.field_v + param3);
                        break L2;
                      }
                    }
                    var7++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5_ref);
            stackOut_11_1 = new StringBuilder().append("ao.U(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        pk[] var3 = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 2 % ((param0 - 64) / 51);
        var3 = this.field_x;
        var4 = 0;
        L0: while (true) {
          if (var4 < var3.length) {
            var5 = var3[var4];
            if (var6 == 0) {
              L1: {
                if (var5 != null) {
                  var5.c((byte) -68);
                  break L1;
                } else {
                  break L1;
                }
              }
              var4++;
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    abstract void e(boolean param0);

    final String c(int param0) {
        pk[] var2 = null;
        int var3 = 0;
        pk var4 = null;
        String var5 = null;
        int var6 = 0;
        pk[] var7 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -6696) {
          if (this.field_x != null) {
            var7 = this.field_x;
            var2 = var7;
            var3 = 0;
            L0: while (true) {
              if (var3 < var7.length) {
                L1: {
                  L2: {
                    var4 = var7[var3];
                    if (var4 != null) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5 = var4.c(-6696);
                  if (var5 == null) {
                    break L1;
                  } else {
                    return var5;
                  }
                }
                var3++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        int var5 = 0;
        int var7 = 0;
        pk var8 = null;
        pk var17 = null;
        pk var24 = null;
        pk var25 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (-1 == (param3 ^ -1)) {
          if (this.field_w != null) {
            L0: {
              this.field_w.a((pk) (this), param1, 5592405, true, param0);
              if (this.field_x == null) {
                break L0;
              } else {
                var5 = -1 + this.field_x.length;
                L1: while (true) {
                  if (-1 < (var5 ^ -1)) {
                    break L0;
                  } else {
                    var25 = this.field_x[var5];
                    if (var7 == 0) {
                      L2: {
                        if (var25 != null) {
                          var25.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5--;
                      continue L1;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param2 <= -35) {
              return;
            } else {
              var8 = (pk) null;
              discarded$17 = this.a((pk) null, -125, -13, -18, -36, 44, -11);
              return;
            }
          } else {
            if (this.field_x != null) {
              var5 = -1 + this.field_x.length;
              L3: while (true) {
                if (-1 >= (var5 ^ -1)) {
                  var24 = this.field_x[var5];
                  if (var7 == 0) {
                    L4: {
                      if (var24 != null) {
                        var24.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5--;
                    continue L3;
                  } else {
                    return;
                  }
                } else {
                  if (param2 <= -35) {
                    return;
                  } else {
                    var8 = (pk) null;
                    discarded$18 = this.a((pk) null, -125, -13, -18, -36, 44, -11);
                    return;
                  }
                }
              }
            } else {
              if (param2 <= -35) {
                return;
              } else {
                var8 = (pk) null;
                discarded$19 = this.a((pk) null, -125, -13, -18, -36, 44, -11);
                return;
              }
            }
          }
        } else {
          if (this.field_x != null) {
            var5 = -1 + this.field_x.length;
            L5: while (true) {
              if (-1 >= (var5 ^ -1)) {
                var17 = this.field_x[var5];
                if (var7 == 0) {
                  L6: {
                    if (var17 != null) {
                      var17.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var5--;
                  continue L5;
                } else {
                  return;
                }
              } else {
                if (param2 > -35) {
                  var8 = (pk) null;
                  discarded$20 = this.a((pk) null, -125, -13, -18, -36, 44, -11);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param2 > -35) {
              var8 = (pk) null;
              discarded$21 = this.a((pk) null, -125, -13, -18, -36, 44, -11);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean discarded$2 = false;
        pk[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        pk var9 = null;
        int var10 = 0;
        pk[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_x;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 >= var11.length) {
                      break L3;
                    } else {
                      var9 = var11[var8];
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var9 == null) {
                            break L4;
                          } else {
                            var9.a(param0, false, param2 + this.field_r, param3, param4, param5 + this.field_v);
                            break L4;
                          }
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
                  if (!param1) {
                    break L2;
                  } else {
                    discarded$2 = this.d(49);
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var7_ref);
            stackOut_13_1 = new StringBuilder().append("ao.T(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        boolean discarded$2 = false;
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        pk var12 = null;
        pk[] var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var12 = (pk) null;
                discarded$2 = this.a((pk) null, 'ﾅ', (byte) -58, -49);
                break L1;
              }
            }
            if (this.field_x != null) {
              var13 = this.field_x;
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var13.length <= var9) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var13[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (!var10.d(-1)) {
                          break L4;
                        } else {
                          if (var10.a(param0, param1, -1, param3, param4, param5, param6)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var8_ref);
            stackOut_17_1 = new StringBuilder().append("ao.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        boolean discarded$56 = false;
        StringBuilder discarded$57 = null;
        StringBuilder discarded$58 = null;
        StringBuilder discarded$59 = null;
        StringBuilder discarded$60 = null;
        pk[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        int var9 = 0;
        pk var10 = null;
        pk[] var11 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x != null) {
              L1: {
                if (param2 == 10) {
                  break L1;
                } else {
                  var10 = (pk) null;
                  discarded$56 = this.a((pk) null, (byte) -20);
                  break L1;
                }
              }
              var11 = this.field_x;
              var5 = var11;
              var6 = 0;
              L2: while (true) {
                if (var11.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var11[var6];
                  discarded$57 = param3.append('\n');
                  if (var9 == 0) {
                    var8 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (param1 < var8) {
                            if (var7 != null) {
                              break L5;
                            } else {
                              discarded$58 = param3.append("null");
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            discarded$59 = param3.append(' ');
                            var8++;
                            if (var9 != 0) {
                              break L5;
                            } else {
                              continue L3;
                            }
                          }
                        }
                        discarded$60 = var7.a(1 + param1, param0, param3, 0);
                        break L4;
                      }
                      var6++;
                      continue L2;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5_ref);
            stackOut_20_1 = new StringBuilder().append("ao.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
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
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
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
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < bn.field_T) {
                  break L1;
                } else {
                  if (param0.length() <= or.field_k) {
                    if (param1 == 30996) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ao.D(");
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final boolean b(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 113) {
              stackOut_3_0 = this.a((byte) -128, param0, 1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ao.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final pk d(boolean param0) {
        pk var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_x == null) {
            return null;
        }
        if (!param0) {
            return (pk) null;
        }
        pk[] var6 = this.field_x;
        pk[] var2 = var6;
        int var3 = 0;
        do {
            if (var3 >= var6.length) {
                return null;
            }
            var4 = var6[var3];
            if (var4 != null) {
                if (var4.d(-1)) {
                    return var4;
                }
            }
            var3++;
        } while (var5 == 0);
        return null;
    }

    final boolean a(byte param0, pk param1, int param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        pk var5 = null;
        pk var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_9_0 = null;
        pk stackIn_9_1 = null;
        Object stackIn_14_0 = null;
        pk stackIn_14_1 = null;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        Object stackOut_8_0 = null;
        pk stackOut_8_1 = null;
        Object stackOut_13_0 = null;
        pk stackOut_13_1 = null;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = -1 + this.field_x.length;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4_int < 0) {
                      break L3;
                    } else {
                      var5 = this.field_x[var4_int];
                      if (var7 != 0) {
                        break L2;
                      } else {
                        stackOut_8_0 = null;
                        stackOut_8_1 = (pk) (var5);
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        L4: while (true) {
                          L5: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              break L5;
                            } else {
                              if (!var5.d(-1)) {
                                break L5;
                              } else {
                                var4_int = var4_int - param2;
                                L6: while (true) {
                                  if ((var4_int ^ -1) > -1) {
                                    break L5;
                                  } else {
                                    var6 = this.field_x[var4_int];
                                    stackOut_13_0 = null;
                                    stackOut_13_1 = (pk) (var6);
                                    stackIn_9_0 = stackOut_13_0;
                                    stackIn_9_1 = stackOut_13_1;
                                    stackIn_14_0 = stackOut_13_0;
                                    stackIn_14_1 = stackOut_13_1;
                                    if (var7 != 0) {
                                      continue L4;
                                    } else {
                                      L7: {
                                        if (stackIn_14_0 == stackIn_14_1) {
                                          break L7;
                                        } else {
                                          if (var6.a(param1, (byte) 61)) {
                                            stackOut_17_0 = 1;
                                            stackIn_18_0 = stackOut_17_0;
                                            decompiledRegionSelector0 = 1;
                                            break L0;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      var4_int = var4_int - param2;
                                      if (var7 == 0) {
                                        continue L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4_int--;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (param0 <= -127) {
                    break L2;
                  } else {
                    discarded$2 = this.e(-70);
                    return false;
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("ao.J(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            field_z = (String) null;
            if (this.d(true) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.d(true) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-51, param1, param2, param3, param4);
        int var6 = 53 / ((28 - param0) / 63);
        this.e(false);
    }

    public static void a(int param0) {
        field_z = null;
        field_y = null;
        if (param0 == 0) {
            return;
        }
        String var2 = (String) null;
        boolean discarded$0 = ao.a((String) null, -34);
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        pk[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == this.field_x) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var12 = this.field_x;
                var8 = var12;
                if (param1 <= -42) {
                  break L1;
                } else {
                  field_y = (ji) null;
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var12.length <= var9) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (var10.a(param0, -84, param2, param3, this.field_r + param4, param5, param6 - -this.field_v)) {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var8_ref);
            stackOut_17_1 = new StringBuilder().append("ao.R(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final int e(int param0) {
        int var2 = 0;
        pk[] var3 = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_x;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 >= var3.length) {
                break L2;
              } else {
                var5 = var3[var4];
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      var6 = var5.e(-117);
                      if (var2 >= var6) {
                        break L3;
                      } else {
                        var2 = var6;
                        break L3;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var4 = -37 / ((param0 - -10) / 46);
            break L1;
          }
          return var2;
        }
    }

    static {
        field_y = new ji();
        field_z = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
