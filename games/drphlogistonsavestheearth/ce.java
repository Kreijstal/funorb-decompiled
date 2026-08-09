/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static he field_b;
    static String field_d;
    static String field_c;
    static vj field_a;
    static long field_f;
    static vh field_e;

    final static void a(bl param0, java.awt.Frame param1, byte param2) {
        il var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param1, (byte) -124);
              L2: while (true) {
                if (var3.field_b != 0) {
                  if (1 != var3.field_b) {
                    kk.a(100L, true);
                    continue L1;
                  } else {
                    param1.setVisible(false);
                    var3_int = -46 / ((64 - param2) / 50);
                    param1.dispose();
                    break L0;
                  }
                } else {
                  kk.a(10L, true);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ce.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = param3 + param1;
            if (param2 == -16579) {
              L1: {
                var6 = param0 + param4;
                if (param1 > wj.field_g) {
                  stackIn_6_0 = param1;
                  break L1;
                } else {
                  stackIn_6_0 = wj.field_g;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (wj.field_e >= param4) {
                  stackIn_9_0 = wj.field_e;
                  break L2;
                } else {
                  stackIn_9_0 = param4;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (wj.field_b > var5_int) {
                  stackIn_12_0 = var5_int;
                  break L3;
                } else {
                  stackIn_12_0 = wj.field_b;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (wj.field_j > var6) {
                  stackIn_15_0 = var6;
                  break L4;
                } else {
                  stackIn_15_0 = wj.field_j;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (wj.field_g > param1) {
                  break L5;
                } else {
                  if (param1 < wj.field_b) {
                    var11 = param1 + var8 * wj.field_k;
                    var12 = -var8 + var10 + 1 >> -548037055;
                    L6: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L5;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 = var11 + 2 * wj.field_k;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (param4 < wj.field_e) {
                  break L7;
                } else {
                  if (wj.field_j > var6) {
                    var11 = var7 + param4 * wj.field_k;
                    var12 = 1 + (var9 + -var7) >> -2067431935;
                    L8: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L7;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (wj.field_g > var5_int) {
                  break L9;
                } else {
                  if (wj.field_b <= var5_int) {
                    break L9;
                  } else {
                    var11 = var5_int + wj.field_k * (var8 - -(var5_int - param1 & 1));
                    var12 = -var8 + 1 - -var10 >> 2098333537;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L9;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 = var11 + 2 * wj.field_k;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (wj.field_e > param4) {
                  break L11;
                } else {
                  if (wj.field_j <= var6) {
                    break L11;
                  } else {
                    var11 = (-param4 + var6 & 1) + var7 + var6 * wj.field_k;
                    var12 = -var7 + (1 - -var9) >> -1233119231;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        wj.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var5), "ce.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -90) {
          field_a = (vj) null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        od var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new od(param1);
              if (param0 == 1) {
                break L1;
              } else {
                ce.a(76, 80, 93, -121, -34);
                break L1;
              }
            }
            L2: {
              var3 = var9.l(31760);
              var4 = var9.h(-4);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (0 == aj.field_d) {
                    break L3;
                  } else {
                    if (aj.field_d < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.h(-9);
                    if ((var5 ^ -1) > -1) {
                      break L4;
                    } else {
                      L5: {
                        if (aj.field_d == 0) {
                          break L5;
                        } else {
                          if (var5 > aj.field_d) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = ei.field_i;
                          synchronized (var7) {
                            L7: {
                              ei.field_i.a(var13, var9, -1);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          gh.a(var13, var5, param1, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_23_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.b(0, var4, param0 + 127, var12);
                  stackIn_9_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ce.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    static {
        field_c = "Email address is unavailable";
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new vh();
    }
}
