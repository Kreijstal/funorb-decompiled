/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String[] field_b;
    int field_a;
    private fr field_c;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_a, (byte) 113);
        super.finalize();
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_13_0 = false;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 > param5) {
              if (param3 > 1 + param5) {
                L1: {
                  if (param3 <= param5 - -5) {
                    break L1;
                  } else {
                    if (param0 == param1) {
                      break L1;
                    } else {
                      var7_int = (param0 & param1 & 1) + (param0 >> 429166529) - -(param1 >> 1439930241);
                      var8 = param5;
                      var9 = param1;
                      var10 = param0;
                      var11 = param5;
                      L2: while (true) {
                        L3: {
                          if (param3 <= var11) {
                            vk.a(var9, param1, param2, var8, param4, param5, param6);
                            stackOut_35_0 = param0;
                            stackIn_36_0 = stackOut_35_0;
                            break L3;
                          } else {
                            var12 = pd.field_q[var11];
                            stackOut_22_0 = param6;
                            stackIn_36_0 = stackOut_22_0 ? 1 : 0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_23_0) {
                                  stackOut_25_0 = uc.field_c[var12];
                                  stackIn_26_0 = stackOut_25_0;
                                  break L4;
                                } else {
                                  stackOut_24_0 = lj.field_a[var12];
                                  stackIn_26_0 = stackOut_24_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_26_0;
                                  if (var13 <= var7_int) {
                                    break L6;
                                  } else {
                                    L7: {
                                      pd.field_q[var11] = pd.field_q[var8];
                                      if (var13 < var9) {
                                        var9 = var13;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    incrementValue$1 = var8;
                                    var8++;
                                    pd.field_q[incrementValue$1] = var12;
                                    if (var14 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (var13 > var10) {
                                  var10 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        vk.a(stackIn_36_0, var10, (byte) -107, param3, param4, var8, param6);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L8: while (true) {
                  stackOut_9_0 = var7_int ^ -1;
                  stackIn_10_0 = stackOut_9_0;
                  L9: while (true) {
                    L10: {
                      if (stackIn_10_0 >= (param5 ^ -1)) {
                        break L10;
                      } else {
                        var8 = param5;
                        L11: while (true) {
                          L12: {
                            if (var8 >= var7_int) {
                              break L12;
                            } else {
                              var9 = pd.field_q[var8];
                              var10 = pd.field_q[1 + var8];
                              stackOut_13_0 = jl.a(var10, var9, param6, (byte) 98);
                              stackIn_10_0 = stackOut_13_0 ? 1 : 0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var14 != 0) {
                                continue L9;
                              } else {
                                L13: {
                                  if (stackIn_14_0) {
                                    pd.field_q[var8] = var10;
                                    pd.field_q[var8 + 1] = var9;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
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
          var7 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var7), "vk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 > -31) {
            vk.a(-31);
            qr.field_c = new jn();
            return;
        }
        qr.field_c = new jn();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 429166529) {
          vk.a(100, 10, (byte) 96, 17, -1, -25, true);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    vk(fr param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
