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
        field_c = null;
        if (param0 != 19599) {
            field_d = 21;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        bh var5 = null;
        int var6 = Bounce.field_N;
        bh[] var7 = ((ed) this).field_a;
        bh[] var3 = var7;
        if (param1 <= 69) {
            ed.a((byte) 121);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_a.length > param0) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 60) {
            ed.a(7);
        }
        return kg.a(param1, 1, param3, -2147483648, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = Bounce.field_N;
        for (var3 = param1; ((ed) this).field_a.length > var3; var3++) {
            var4 = ((ed) this).field_a[var3];
            if (!(var4.field_a.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_a.length - 1);
        }
        return ((ed) this).field_a.length;
    }

    final int b(int param0) {
        int var2 = 0;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        var2 = -1;
        if (param0 > 73) {
          L0: {
            if (((ed) this).field_a != null) {
              var3 = ((ed) this).field_a;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) -62);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 107;
        }
    }

    final static void a(byte param0) {
        il.a(6);
        if (param0 != -127) {
            field_b = -84;
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -59 % ((param0 - -51) / 35);
            if (((ed) this).field_a == null) {
              break L1;
            } else {
              if (((ed) this).field_a.length > 0) {
                stackOut_4_0 = -((ed) this).field_a[0].field_f + ((ed) this).field_a[((ed) this).field_a.length + -1].field_b;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    private final static lb[] a(int param0, si param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        lb[] var4 = null;
        int var5 = 0;
        lb var6 = null;
        int var7 = 0;
        mk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        lb[] stackIn_3_0 = null;
        lb[] stackIn_10_0 = null;
        lb[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb[] stackOut_9_0 = null;
        lb[] stackOut_16_0 = null;
        lb[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            if (param1.a((byte) 53)) {
              var8 = param1.c((byte) 5);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (var8.field_f == 2) {
                    stackOut_9_0 = new lb[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new lb[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (lb[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new lb();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << 2];
                        var6.field_e = var3[1 + (var5 << 2)];
                        var6.field_a = var3[(var5 << 2) - -2];
                        var6.field_f = var3[(var5 << 2) - -3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  int discarded$1 = 19406;
                  wh.a(10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new lb[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ed.D(").append(10).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    final static java.awt.Frame a(int param0, si param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        lb[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        lb[] var10 = null;
        mk var11 = null;
        Object stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            if (param1.a((byte) 53)) {
              L1: {
                if (param2 == 0) {
                  var10 = ed.a(10, param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (param4 != var10[var8].field_d) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(param2, param4, 0, param5, 314572800);
              L4: while (true) {
                if (0 != var11.field_f) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_f != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      ib.a(param1, var7, (byte) 115);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (java.awt.Frame) (Object) stackIn_22_0;
                  }
                } else {
                  int discarded$1 = 19406;
                  wh.a(10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ed.E(").append(4147).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ',' + 0 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_27_0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Bounce.field_N;
          if (null == ((ed) this).field_a) {
            break L0;
          } else {
            if (0 == ((ed) this).field_a.length) {
              break L0;
            } else {
              if (((ed) this).field_a[0].field_f <= param2) {
                if (param2 > ((ed) this).field_a[((ed) this).field_a.length - 1].field_b) {
                  return -1;
                } else {
                  if (((ed) this).field_a.length == 1) {
                    return ((ed) this).field_a[0].a(param0, (byte) 110);
                  } else {
                    L1: {
                      if (param1 < -92) {
                        break L1;
                      } else {
                        int discarded$2 = ed.a(-47, (byte) 83, -109);
                        break L1;
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((ed) this).field_a.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((ed) this).field_a[var5];
                          if (param2 < var6.field_f) {
                            break L3;
                          } else {
                            if (param2 > var6.field_b) {
                              break L3;
                            } else {
                              var7 = var6.a(param0, (byte) 91);
                              if (var7 != -1) {
                                return var4 + var7;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_a.length);
                        var5++;
                        continue L2;
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
        return -1;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ja.field_c.length) {
                break L0;
              } else {
                param3 = ja.field_c[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$4 = param3;
                  param3--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param1 = lb.field_c[incrementValue$5];
                    param0[param4[param1]] = param0[param4[param1]] + 1;
                    lb.field_c[param0[param4[param1]]] = param1;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ed.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(-113).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (param1 < -50) {
              L1: {
                if (param0 < param2) {
                  var3_int = param0;
                  param0 = param2;
                  param2 = var3_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: while (true) {
                if (0 == param2) {
                  stackOut_9_0 = param0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var3_int = param0 % param2;
                  param0 = param2;
                  param2 = var3_int;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 106;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "ed.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              if (param2 < -122) {
                break L1;
              } else {
                field_b = 40;
                break L1;
              }
            }
            L2: while (true) {
              if (var7 <= var8) {
                if (var5_int > 0) {
                  stackOut_14_0 = (-param0 + param1 << 8) / var5_int;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L3: {
                  var9 = param3.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("ed.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
    }
}
