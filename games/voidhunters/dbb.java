/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dbb extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(230, 99));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("dbb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    dbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        if (param7 == 0) {
          var10 = -(param0 * param9 / param1) + param3;
          if (param8 <= var10) {
            if (var10 <= param5) {
              if (param4 <= param3) {
                if (var10 >= param4) {
                  if (param3 >= var10) {
                    var11 = -(param9 << param6) / param1;
                    if (0 <= var11) {
                      if (1 << param6 > var11) {
                        if (param2 != -1) {
                          if (var11 >= param2) {
                            return param2;
                          } else {
                            return var11;
                          }
                        } else {
                          return var11;
                        }
                      } else {
                        return param2;
                      }
                    } else {
                      return param2;
                    }
                  } else {
                    return param2;
                  }
                } else {
                  return param2;
                }
              } else {
                if (param3 <= var10) {
                  if (param4 >= var10) {
                    var11 = -(param9 << param6) / param1;
                    if (0 <= var11) {
                      if (1 << param6 > var11) {
                        if (param2 != -1) {
                          if (var11 >= param2) {
                            return param2;
                          } else {
                            return var11;
                          }
                        } else {
                          return var11;
                        }
                      } else {
                        return param2;
                      }
                    } else {
                      return param2;
                    }
                  } else {
                    return param2;
                  }
                } else {
                  return param2;
                }
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          dbb.a(-63, -43, 28, 28, -60, -61, 125, 10, -27, 53);
          var10 = -(param0 * param9 / param1) + param3;
          if (param8 <= var10) {
            if (var10 <= param5) {
              if (param4 <= param3) {
                if (var10 >= param4) {
                  if (param3 >= var10) {
                    var11 = -(param9 << param6) / param1;
                    if (0 <= var11) {
                      if (1 << param6 > var11) {
                        if (param2 != -1) {
                          if (var11 >= param2) {
                            return param2;
                          } else {
                            return var11;
                          }
                        } else {
                          return var11;
                        }
                      } else {
                        return param2;
                      }
                    } else {
                      return param2;
                    }
                  } else {
                    return param2;
                  }
                } else {
                  return param2;
                }
              } else {
                if (param3 <= var10) {
                  if (param4 >= var10) {
                    var11 = -(param9 << param6) / param1;
                    if (0 <= var11) {
                      if (1 << param6 > var11) {
                        if (param2 != -1) {
                          if (var11 >= param2) {
                            return param2;
                          } else {
                            return var11;
                          }
                        } else {
                          return var11;
                        }
                      } else {
                        return param2;
                      }
                    } else {
                      return param2;
                    }
                  } else {
                    return param2;
                  }
                } else {
                  return param2;
                }
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    final static byte[] a(float param0, float param1, byte param2, int param3, vjb param4, int param5, int param6, int param7, float param8, float param9, float param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        byte[] var12 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11_int = 57 / ((param2 - 17) / 51);
            var12 = new byte[param5 * (param6 * param7)];
            toa.a(param6, param8, param5, param10, param1, (byte) -61, param4, param9, 0, param0, param3, param7, var12);
            stackIn_1_0 = (byte[]) (var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var11);

            stackIn_4_1 = new StringBuilder().append("dbb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_o = -1;
    }
}
