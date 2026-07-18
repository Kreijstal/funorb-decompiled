/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp {
    static int field_a;
    co[] field_b;

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        co var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          if (((pp) this).field_b == null) {
            break L0;
          } else {
            if (0 == ((pp) this).field_b.length) {
              break L0;
            } else {
              if (param2 >= ((pp) this).field_b[0].field_f) {
                if (((pp) this).field_b[-1 + ((pp) this).field_b.length].field_d < param2) {
                  return -1;
                } else {
                  if (1 == ((pp) this).field_b.length) {
                    return ((pp) this).field_b[0].a(true, param0);
                  } else {
                    L1: {
                      var4 = 0;
                      if (param1 >= 34) {
                        break L1;
                      } else {
                        int discarded$2 = ((pp) this).a(103);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (((pp) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((pp) this).field_b[var5];
                          if (param2 < var6.field_f) {
                            break L3;
                          } else {
                            if (var6.field_d >= param2) {
                              var7 = var6.a(true, param0);
                              if (-1 != var7) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_h.length + -1);
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

    final int a(int param0, int param1) {
        int var3 = 0;
        co var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 1) {
            return 124;
        }
        for (var3 = 0; var3 < ((pp) this).field_b.length; var3++) {
            var4 = ((pp) this).field_b[var3];
            if (!(var4.field_h.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_h.length - 1);
        }
        return ((pp) this).field_b.length;
    }

    final int b(int param0, int param1) {
        co var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        co[] var7 = ((pp) this).field_b;
        co[] var3 = var7;
        int var4 = 0;
        if (param1 >= -101) {
            return 7;
        }
        while (var4 < var7.length) {
            var5 = var7[var4];
            if (param0 < var5.field_h.length) {
                return var5.field_h[param0];
            }
            param0 = param0 - (var5.field_h.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (~var5_int < param1) {
                  stackOut_13_0 = (-param3 + param0 << 8) / var5_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L2: {
                  var9 = param2.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 != 62) {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("pp.J(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 == 26326) {
              L1: {
                ht.field_k = uk.field_j;
                if (param1 == 255) {
                  L2: {
                    stackOut_9_0 = 111;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (sd.field_h >= 13) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L2;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L2;
                    }
                  }
                  ld.field_c = in.a((byte) stackIn_12_0, stackIn_12_1 != 0);
                  break L1;
                } else {
                  L3: {
                    if (param1 < 100) {
                      break L3;
                    } else {
                      if (param1 <= 105) {
                        ld.field_c = oq.a((byte) -63, args);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ld.field_c = dq.a(param1, 32, param2);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("pp.I(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        co[] var3 = null;
        int var4 = 0;
        co var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var2 = -1;
          if (param0 == 24) {
            break L0;
          } else {
            var8 = null;
            pp.a((String[]) null, -43, (String) null, -67);
            break L0;
          }
        }
        L1: {
          if (null == ((pp) this).field_b) {
            break L1;
          } else {
            var3 = ((pp) this).field_b;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(true);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = ((pp) this).a((byte) 95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((pp) this).field_b == null) {
              break L2;
            } else {
              if (((pp) this).field_b.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = ((pp) this).field_b[-1 + ((pp) this).field_b.length].field_d + -((pp) this).field_b[0].field_f;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    static {
    }
}
