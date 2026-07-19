/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lv extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        nc discarded$2 = null;
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                discarded$2 = this.a((nc[]) null, -128);
                break L1;
              }
            }
            si.a(213, 62, param0[0].a(119));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("lv.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    lv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param2 = param2 - param7;
        param1 = param1 - param7;
        param6 = param6 - param3;
        param4 = param4 - param3;
        if (param6 <= param4) {
          if (-param0 <= param4) {
            if (param0 >= param6) {
              if (param2 <= param1) {
                if (param1 >= -param0) {
                  if (param2 <= param0) {
                    L0: {
                      var9 = vkb.a(34, param1 ^ param1 >> -117395393 | param4 >> 1365089791 ^ param4 | param6 ^ param6 >> -2016635681 | param2 >> -685227041 ^ param2 | param0 >> -954469505 ^ param0) + -12;
                      if (var9 > 0) {
                        param0 = param0 >> var9;
                        param6 = param6 >> var9;
                        param1 = param1 >> var9;
                        param4 = param4 >> var9;
                        param2 = param2 >> var9;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    if (param0 > 0) {
                      var9 = param0 * param0;
                      if (param8 > 26) {
                        if (var9 > param4 * param4 - -(param1 * param1)) {
                          if (param2 * param2 + param6 * param6 < var9) {
                            return (1 << param5) - -1;
                          } else {
                            param2 = param2 - param1;
                            param6 = param6 - param4;
                            return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                          }
                        } else {
                          param2 = param2 - param1;
                          param6 = param6 - param4;
                          return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                        }
                      } else {
                        return -122;
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
                if (param2 >= -param0) {
                  if (param0 >= param1) {
                    L1: {
                      var9 = vkb.a(34, param1 ^ param1 >> -117395393 | param4 >> 1365089791 ^ param4 | param6 ^ param6 >> -2016635681 | param2 >> -685227041 ^ param2 | param0 >> -954469505 ^ param0) + -12;
                      if (var9 > 0) {
                        param0 = param0 >> var9;
                        param6 = param6 >> var9;
                        param1 = param1 >> var9;
                        param4 = param4 >> var9;
                        param2 = param2 >> var9;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param0 > 0) {
                      var9 = param0 * param0;
                      if (param8 > 26) {
                        if (var9 > param4 * param4 - -(param1 * param1)) {
                          if (param2 * param2 + param6 * param6 < var9) {
                            return (1 << param5) - -1;
                          } else {
                            param2 = param2 - param1;
                            param6 = param6 - param4;
                            return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                          }
                        } else {
                          param2 = param2 - param1;
                          param6 = param6 - param4;
                          return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                        }
                      } else {
                        return -122;
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
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          if (-param0 <= param6) {
            if (param4 <= param0) {
              if (param2 <= param1) {
                if (param1 >= -param0) {
                  if (param2 <= param0) {
                    L2: {
                      var9 = vkb.a(34, param1 ^ param1 >> -117395393 | param4 >> 1365089791 ^ param4 | param6 ^ param6 >> -2016635681 | param2 >> -685227041 ^ param2 | param0 >> -954469505 ^ param0) + -12;
                      if (var9 > 0) {
                        param0 = param0 >> var9;
                        param6 = param6 >> var9;
                        param1 = param1 >> var9;
                        param4 = param4 >> var9;
                        param2 = param2 >> var9;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (param0 > 0) {
                      var9 = param0 * param0;
                      if (param8 > 26) {
                        if (var9 > param4 * param4 - -(param1 * param1)) {
                          if (param2 * param2 + param6 * param6 < var9) {
                            return (1 << param5) - -1;
                          } else {
                            param2 = param2 - param1;
                            param6 = param6 - param4;
                            return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                          }
                        } else {
                          param2 = param2 - param1;
                          param6 = param6 - param4;
                          return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                        }
                      } else {
                        return -122;
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
                if (param2 >= -param0) {
                  if (param0 >= param1) {
                    L3: {
                      var9 = vkb.a(34, param1 ^ param1 >> -117395393 | param4 >> 1365089791 ^ param4 | param6 ^ param6 >> -2016635681 | param2 >> -685227041 ^ param2 | param0 >> -954469505 ^ param0) + -12;
                      if (var9 > 0) {
                        param0 = param0 >> var9;
                        param6 = param6 >> var9;
                        param1 = param1 >> var9;
                        param4 = param4 >> var9;
                        param2 = param2 >> var9;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (param0 > 0) {
                      var9 = param0 * param0;
                      if (param8 > 26) {
                        if (var9 > param4 * param4 - -(param1 * param1)) {
                          if (param2 * param2 + param6 * param6 >= var9) {
                            param2 = param2 - param1;
                            param6 = param6 - param4;
                            return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                          } else {
                            return (1 << param5) - -1;
                          }
                        } else {
                          param2 = param2 - param1;
                          param6 = param6 - param4;
                          return vu.b(-var9 + param1 * param1 + param4 * param4, 0, param6 * param4 - -(param2 * param1) << -268400959, param5, param6 * param6 + param2 * param2 << -82316799);
                        }
                      } else {
                        return -122;
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
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        int var1 = 15 % ((-67 - param0) / 54);
    }

    static {
        field_o = "If you are not, please change your password to something more obscure!";
    }
}
