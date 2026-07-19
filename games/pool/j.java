/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements fp {
    static vh field_a;
    static int field_b;

    final static int a(int param0, float param1, byte param2) {
        int var3 = -90 / ((param2 - 82) / 36);
        return (int)(0.5f + (float)(1 << param0) * param1);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        long var14 = 0L;
        int var16 = 0;
        long var17 = 0L;
        long var19 = 0L;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        var9 = param6 - param1;
        var11 = -92 / ((param7 - -46) / 51);
        var10 = -param8 + param0;
        if ((od.a((long)var9, (long)param2, false) - -od.a((long)var10, (long)param3, false) ^ -1L) > -1L) {
          var12 = bm.a(-112, od.a((long)var9, (long)var9, false) + od.a((long)var10, (long)var10, false));
          var14 = bm.a(-99, od.a((long)param2, (long)param2, false) + od.a((long)param3, (long)param3, false));
          if (0L >= -(long)(param5 << 1623784848) + (var12 + -var14)) {
            var16 = aj.a(param2, false, param2) + aj.a(param3, false, param3);
            if (-1 == (var16 ^ -1)) {
              return -1;
            } else {
              var17 = (od.a((long)var9, (long)param2, false) - -od.a((long)var10, (long)param3, false)) * 2L;
              var19 = od.a((long)var9, (long)var9, false) + (od.a((long)var10, (long)var10, false) + -(long)(param5 * param5 << -1901510576));
              var21 = od.a(var17, var17, false) + -(4L * od.a((long)var16, var19, false));
              if (var21 >= 0L) {
                var23 = bm.a(-113, var21);
                if (-2147483648L <= (var23 ^ -1L)) {
                  if (-2147483648L <= var23) {
                    var25 = lh.a(var16, (byte) -128, (long)(int)(var23 + -var17)) / 2;
                    var26 = lh.a(var16, (byte) -64, (long)(int)(-var23 + -var17)) / 2;
                    if (0 < var25) {
                      if (var25 <= 65536 + -param4) {
                        if (var25 <= var26) {
                          return param4 + var25;
                        } else {
                          L0: {
                            if (-1 <= (var26 ^ -1)) {
                              break L0;
                            } else {
                              if (65536 - param4 < var26) {
                                break L0;
                              } else {
                                return param4 + var26;
                              }
                            }
                          }
                          L1: {
                            if (var25 >= 0) {
                              if ((var26 ^ -1) <= -1) {
                                return -1;
                              } else {
                                if (var25 > 0) {
                                  break L1;
                                } else {
                                  return -1;
                                }
                              }
                            } else {
                              if (var26 > 0) {
                                break L1;
                              } else {
                                if ((var26 ^ -1) <= -1) {
                                  return -1;
                                } else {
                                  if (var25 > 0) {
                                    return param4;
                                  } else {
                                    return -1;
                                  }
                                }
                              }
                            }
                          }
                          return param4;
                        }
                      } else {
                        L2: {
                          if (-1 <= (var26 ^ -1)) {
                            break L2;
                          } else {
                            if (65536 - param4 < var26) {
                              break L2;
                            } else {
                              return param4 + var26;
                            }
                          }
                        }
                        L3: {
                          if (var25 >= 0) {
                            if ((var26 ^ -1) <= -1) {
                              return -1;
                            } else {
                              if (var25 > 0) {
                                break L3;
                              } else {
                                return -1;
                              }
                            }
                          } else {
                            if (var26 > 0) {
                              break L3;
                            } else {
                              if ((var26 ^ -1) <= -1) {
                                return -1;
                              } else {
                                if (var25 > 0) {
                                  return param4;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                        }
                        return param4;
                      }
                    } else {
                      if (-1 > (var26 ^ -1)) {
                        if (65536 - param4 >= var26) {
                          return param4 + var26;
                        } else {
                          L4: {
                            if (var25 >= 0) {
                              if ((var26 ^ -1) <= -1) {
                                return -1;
                              } else {
                                if (var25 > 0) {
                                  break L4;
                                } else {
                                  return -1;
                                }
                              }
                            } else {
                              if (var26 > 0) {
                                break L4;
                              } else {
                                if ((var26 ^ -1) <= -1) {
                                  return -1;
                                } else {
                                  if (var25 > 0) {
                                    return param4;
                                  } else {
                                    return -1;
                                  }
                                }
                              }
                            }
                          }
                          return param4;
                        }
                      } else {
                        if (var25 >= 0) {
                          if ((var26 ^ -1) <= -1) {
                            return -1;
                          } else {
                            if (var25 <= 0) {
                              return -1;
                            } else {
                              return param4;
                            }
                          }
                        } else {
                          if (var26 <= 0) {
                            if ((var26 ^ -1) <= -1) {
                              return -1;
                            } else {
                              if (var25 > 0) {
                                return param4;
                              } else {
                                return -1;
                              }
                            }
                          } else {
                            return param4;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException("Out of range: 0x" + Long.toString(var23, 16));
                  }
                } else {
                  throw new IllegalStateException("Out of range: 0x" + Long.toString(var23, 16));
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

    public static void a(int param0) {
        int discarded$2 = 0;
        if (param0 != 16) {
          discarded$2 = j.a(-121, 82, 21, -7, 28, 50, -82, (byte) 121, 119);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        dd var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param4.field_C + param1;
              var7 = -103 / ((param2 - 2) / 41);
              var8 = param3 - -param4.field_D;
              mh.a(var6_int, var8, param4.field_y, param4.field_l, false);
              var9 = bo.field_a[1];
              if (!(param4 instanceof fe)) {
                break L1;
              } else {
                if (!((fe) ((Object) param4)).field_G) {
                  break L1;
                } else {
                  var9.c(var6_int + (1 + (param4.field_l - var9.field_w >> -1618395327)), (param4.field_y - var9.field_y >> 1687671905) + (1 + var8), 256);
                  break L1;
                }
              }
            }
            if (!param4.d(126)) {
              break L0;
            } else {
              bj.a(2 + var8, param4.field_y + -4, param4.field_l - 4, 2 + var6_int, 2187);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
    }
}
