/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

abstract class ed {
    static ec field_c;
    static int field_b;
    static int field_d;
    bh[] field_a;

    public static void a(int param0) {
        try {
            field_c = null;
            if (param0 != 19599) {
                field_d = 21;
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ed.C(" + param0 + 41);
        }
    }

    final int a(int param0, int param1) {
        bh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        var6 = Bounce.field_N;
        try {
          L0: {
            var3 = ((ed) this).field_a;
            if (param1 > 69) {
              break L0;
            } else {
              ed.a((byte) 121);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if ((var3.length ^ -1) >= (var4 ^ -1)) {
                  break L3;
                } else {
                  var5 = var3[var4];
                  stackOut_6_0 = var5.field_a.length ^ -1;
                  stackIn_14_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (stackIn_7_0 >= (param0 ^ -1)) {
                      param0 = param0 - (var5.field_a.length - 1);
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var5.field_a[param0];
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                }
              }
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3_ref, "ed.K(" + param0 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        tg[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        tg[] stackOut_3_0 = null;
        try {
          L0: {
            if (param2 > 60) {
              break L0;
            } else {
              ed.a(7);
              break L0;
            }
          }
          stackOut_3_0 = kg.a(param1, 1, param3, -2147483648, param0);
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "ed.J(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bh var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        var5 = Bounce.field_N;
        try {
          var3_int = param1;
          L0: while (true) {
            L1: {
              L2: {
                if ((((ed) this).field_a.length ^ -1) >= (var3_int ^ -1)) {
                  break L2;
                } else {
                  var4 = ((ed) this).field_a[var3_int];
                  stackOut_3_0 = var4.field_a.length;
                  stackIn_13_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    if (stackIn_4_0 > param0) {
                      stackOut_9_0 = var3_int;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      param0 = param0 - (var4.field_a.length - 1);
                      var3_int++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = ((ed) this).field_a.length;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "ed.F(" + param0 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var7 = Bounce.field_N;
        try {
          var2_int = -1;
          if (param0 > 73) {
            L0: {
              if (((ed) this).field_a != null) {
                var3 = ((ed) this).field_a;
                var4 = 0;
                L1: while (true) {
                  if ((var4 ^ -1) <= (var3.length ^ -1)) {
                    break L0;
                  } else {
                    L2: {
                      var5 = var3[var4];
                      if (null == var5) {
                        break L2;
                      } else {
                        var6 = var5.a((byte) -62);
                        if ((var2_int ^ -1) > (var6 ^ -1)) {
                          var2_int = var6;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
          } else {
            stackOut_2_0 = 107;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ed.B(" + param0 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(byte param0) {
        try {
            il.a(6);
            if (param0 != -127) {
                field_b = -84;
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ed.L(" + param0 + 41);
        }
    }

    final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = -59 % ((param0 - -51) / 35);
              if (((ed) this).field_a == null) {
                break L1;
              } else {
                if (((ed) this).field_a.length > 0) {
                  stackOut_6_0 = -((ed) this).field_a[0].field_f + ((ed) this).field_a[((ed) this).field_a.length + -1].field_b;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_7_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ed.H(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    private final static lb[] a(int param0, si param1) {
        RuntimeException var2 = null;
        mk var2_ref = null;
        int[] var3 = null;
        lb[] var4 = null;
        int var5 = 0;
        lb var6 = null;
        int var7 = 0;
        lb[] stackIn_3_0 = null;
        lb[] stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        lb[] stackIn_21_0 = null;
        lb[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb[] stackOut_20_0 = null;
        lb[] stackOut_24_0 = null;
        Object stackOut_16_0 = null;
        lb[] stackOut_13_0 = null;
        lb[] stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = Bounce.field_N;
        try {
          if (param1.a((byte) 53)) {
            var2_ref = param1.c((byte) 5);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2_ref.field_f != 0) {
                    break L2;
                  } else {
                    wh.a(10L, param0 + 19396);
                    if (var7 != 0) {
                      break L1;
                    } else {
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if ((var2_ref.field_f ^ -1) == -3) {
                  break L1;
                } else {
                  var3 = (int[]) var2_ref.field_e;
                  if (param0 == 10) {
                    var4 = new lb[var3.length >> -1679031710];
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if ((var5 ^ -1) <= (var4.length ^ -1)) {
                            break L5;
                          } else {
                            var6 = new lb();
                            stackOut_20_0 = (lb[]) var4;
                            stackIn_25_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var7 != 0) {
                              break L4;
                            } else {
                              stackIn_21_0[var5] = var6;
                              var6.field_d = var3[var5 << 508978434];
                              var6.field_e = var3[1 + (var5 << -494393854)];
                              var6.field_a = var3[(var5 << -1549120510) - -2];
                              var6.field_f = var3[(var5 << -1084009118) - -3];
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_24_0 = (lb[]) var4;
                        stackIn_25_0 = stackOut_24_0;
                        break L4;
                      }
                    }
                  } else {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (lb[]) (Object) stackIn_17_0;
                  }
                }
              }
              stackOut_13_0 = new lb[]{};
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0;
            }
          } else {
            stackOut_2_0 = new lb[]{};
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("ed.D(").append(param0).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_25_0;
    }

    final static java.awt.Frame a(int param0, si param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        lb[] var6_array = null;
        mk var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_49_0 = null;
        java.awt.Frame stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_39_0 = null;
        java.awt.Frame stackOut_53_0 = null;
        Object stackOut_48_0 = null;
        Object stackOut_45_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var9 = Bounce.field_N;
        try {
          if (!param1.a((byte) 53)) {
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
            return (java.awt.Frame) (Object) stackIn_5_0;
          } else {
            L0: {
              if (param2 == 0) {
                var6_array = ed.a(10, param1);
                if (var6_array == null) {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (java.awt.Frame) (Object) stackIn_13_0;
                } else {
                  var7_int = 0;
                  var8 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var6_array.length <= var8) {
                          break L3;
                        } else {
                          stackOut_16_0 = param4;
                          stackIn_38_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (stackIn_17_0 != var6_array[var8].field_d) {
                                break L4;
                              } else {
                                if ((var6_array[var8].field_e ^ -1) != (param5 ^ -1)) {
                                  break L4;
                                } else {
                                  L5: {
                                    if ((param3 ^ -1) == -1) {
                                      break L5;
                                    } else {
                                      if (var6_array[var8].field_f == param3) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  L6: {
                                    if (var7_int == 0) {
                                      break L6;
                                    } else {
                                      if (var6_array[var8].field_a <= param2) {
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  param2 = var6_array[var8].field_a;
                                  var7_int = 1;
                                  break L4;
                                }
                              }
                            }
                            var8++;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      stackOut_37_0 = var7_int;
                      stackIn_38_0 = stackOut_37_0;
                      break L2;
                    }
                    if (stackIn_38_0 != 0) {
                      break L0;
                    } else {
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (java.awt.Frame) (Object) stackIn_40_0;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
            var6_ref = param1.a(param2, param4, param3, param5, 314572800);
            L7: while (true) {
              L8: {
                if (0 != var6_ref.field_f) {
                  break L8;
                } else {
                  wh.a(10L, 19406);
                  if (var9 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              var7 = (java.awt.Frame) var6_ref.field_e;
              if (var7 != null) {
                if (var6_ref.field_f != 2) {
                  L9: {
                    if (param0 == 4147) {
                      break L9;
                    } else {
                      field_c = null;
                      break L9;
                    }
                  }
                  stackOut_53_0 = (java.awt.Frame) var7;
                  stackIn_54_0 = stackOut_53_0;
                } else {
                  ib.a(param1, var7, (byte) 115);
                  stackOut_48_0 = null;
                  stackIn_49_0 = stackOut_48_0;
                  return (java.awt.Frame) (Object) stackIn_49_0;
                }
              } else {
                stackOut_45_0 = null;
                stackIn_46_0 = stackOut_45_0;
                return (java.awt.Frame) (Object) stackIn_46_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var6;
            stackOut_55_1 = new StringBuilder().append("ed.E(").append(param0).append(44);
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L10;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L10;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_54_0;
    }

    final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (null == ((ed) this).field_a) {
              break L0;
            } else {
              if (0 == ((ed) this).field_a.length) {
                break L0;
              } else {
                if ((((ed) this).field_a[0].field_f ^ -1) >= (param2 ^ -1)) {
                  if ((param2 ^ -1) < (((ed) this).field_a[((ed) this).field_a.length - 1].field_b ^ -1)) {
                    stackOut_13_0 = -1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (-2 == (((ed) this).field_a.length ^ -1)) {
                      stackOut_18_0 = ((ed) this).field_a[0].a(param0, (byte) 110);
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      L1: {
                        if (param1 < -92) {
                          break L1;
                        } else {
                          int discarded$1 = ed.a(-47, (byte) 83, -109);
                          break L1;
                        }
                      }
                      var4_int = 0;
                      var5 = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if ((((ed) this).field_a.length ^ -1) >= (var5 ^ -1)) {
                              break L4;
                            } else {
                              var6 = ((ed) this).field_a[var5];
                              stackOut_25_0 = param2;
                              stackIn_39_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var8 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_26_0 < var6.field_f) {
                                    break L5;
                                  } else {
                                    if (param2 > var6.field_b) {
                                      break L5;
                                    } else {
                                      var7 = var6.a(param0, (byte) 91);
                                      if ((var7 ^ -1) != 0) {
                                        stackOut_35_0 = var4_int + var7;
                                        stackIn_36_0 = stackOut_35_0;
                                        return stackIn_36_0;
                                      } else {
                                        stackOut_33_0 = -1;
                                        stackIn_34_0 = stackOut_33_0;
                                        return stackIn_34_0;
                                      }
                                    }
                                  }
                                }
                                var4_int = var4_int + (-1 + var6.field_a.length);
                                var5++;
                                if (var8 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackOut_38_0 = -1;
                          stackIn_39_0 = stackOut_38_0;
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          stackOut_8_0 = -1;
          stackIn_9_0 = stackOut_8_0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "ed.M(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_39_0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Bounce.field_N;
        try {
          var5_int = 0;
          L0: while (true) {
            L1: {
              L2: {
                if ((var5_int ^ -1) <= (ja.field_c.length ^ -1)) {
                  break L2;
                } else {
                  param3 = ja.field_c[var5_int];
                  stackOut_3_0 = var5_int << -1850038044;
                  stackIn_13_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    var6 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          param3--;
                          if (param3 == 0) {
                            break L5;
                          } else {
                            var6++;
                            param1 = lb.field_c[var6];
                            param0[param4[param1]] = param0[param4[param1]] + 1;
                            lb.field_c[param0[param4[param1]]] = param1;
                            if (var7 != 0) {
                              break L4;
                            } else {
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var5_int++;
                        break L4;
                      }
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = param2;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L6: {
              if (stackIn_13_0 < -45) {
                break L6;
              } else {
                tg[] discarded$3 = ed.a(85, -86, -63, -63);
                break L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("ed.G(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Bounce.field_N;
        try {
          if (param1 < -50) {
            L0: {
              if ((param0 ^ -1) > (param2 ^ -1)) {
                var3_int = param0;
                param0 = param2;
                param2 = var3_int;
                break L0;
              } else {
                break L0;
              }
            }
            L1: while (true) {
              L2: {
                L3: {
                  if (0 == param2) {
                    break L3;
                  } else {
                    var3_int = param0 % param2;
                    param0 = param2;
                    stackOut_9_0 = var3_int;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      param2 = stackIn_10_0;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_11_0 = param0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
            }
          } else {
            stackOut_2_0 = 106;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "ed.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            if (param2 < -122) {
              break L0;
            } else {
              field_b = 40;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              L3: {
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  break L3;
                } else {
                  var9 = param3.charAt(var8);
                  stackOut_5_0 = -61;
                  stackOut_5_1 = var9 ^ -1;
                  stackIn_25_0 = stackOut_5_0;
                  stackIn_25_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var10 != 0) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 == stackIn_6_1) {
                          break L5;
                        } else {
                          L6: {
                            if (-63 == (var9 ^ -1)) {
                              break L6;
                            } else {
                              if (var6 != 0) {
                                break L4;
                              } else {
                                if (var9 != 32) {
                                  break L4;
                                } else {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
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
              stackOut_24_0 = var5_int ^ -1;
              stackOut_24_1 = -1;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L2;
            }
            if (stackIn_25_0 < stackIn_25_1) {
              stackOut_27_0 = (-param0 + param1 << 1568978088) / var5_int;
              stackIn_28_0 = stackOut_27_0;
              return stackIn_28_0;
            } else {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("ed.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_30_0;
    }

    static {
    }
}
