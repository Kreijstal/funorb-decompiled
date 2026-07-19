/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ew extends rqa {
    static dra field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 < -119) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(43, 85));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ew.A(");
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

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              vla.field_E = param1;
              if (param0 == 1043) {
                break L1;
              } else {
                ew.b(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ew.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_p = null;
    }

    ew(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = VoidHunters.field_G;
        var6 = -param3 + param1;
        var7 = param4 + -param0;
        if (var6 != 0) {
          if (0 == var7) {
            kdb.a(param0, param1, (byte) 111, param5, param3);
            return;
          } else {
            if (param2 >= 45) {
              var12 = (var7 << 1826955916) / var6;
              var13 = param0 - (var12 * param3 >> 38777740);
              if (param3 >= ob.field_j) {
                if (mt.field_o >= param3) {
                  var8 = param3;
                  var10 = param0;
                  if (ob.field_j > param1) {
                    var11 = (ob.field_j * var12 >> -147830388) + var13;
                    var9 = ob.field_j;
                    if (lua.field_c <= var11) {
                      if (hab.field_i < var11) {
                        var11 = hab.field_i;
                        var9 = (hab.field_i + -var13 << -1018694356) / var12;
                        if (lua.field_c > var10) {
                          var10 = lua.field_c;
                          var8 = (-var13 + lua.field_c << 1151627820) / var12;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          if (hab.field_i < var10) {
                            var8 = (hab.field_i + -var13 << -971667316) / var12;
                            var10 = hab.field_i;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          }
                        }
                      } else {
                        if (lua.field_c > var10) {
                          var10 = lua.field_c;
                          var8 = (-var13 + lua.field_c << 1151627820) / var12;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          if (hab.field_i < var10) {
                            var8 = (hab.field_i + -var13 << -971667316) / var12;
                            var10 = hab.field_i;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          }
                        }
                      }
                    } else {
                      var11 = lua.field_c;
                      var9 = (lua.field_c - var13 << 1700536588) / var12;
                      if (lua.field_c > var10) {
                        var10 = lua.field_c;
                        var8 = (-var13 + lua.field_c << 1151627820) / var12;
                        rsa.a(param5, var9, -1, var10, var11, var8);
                        return;
                      } else {
                        if (hab.field_i < var10) {
                          var8 = (hab.field_i + -var13 << -971667316) / var12;
                          var10 = hab.field_i;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        }
                      }
                    }
                  } else {
                    if (mt.field_o < param1) {
                      var11 = var13 - -(mt.field_o * var12 >> -703305652);
                      var9 = mt.field_o;
                      if (lua.field_c <= var11) {
                        if (hab.field_i < var11) {
                          var11 = hab.field_i;
                          var9 = (hab.field_i + -var13 << -1018694356) / var12;
                          if (lua.field_c > var10) {
                            var10 = lua.field_c;
                            var8 = (-var13 + lua.field_c << 1151627820) / var12;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            if (hab.field_i < var10) {
                              var8 = (hab.field_i + -var13 << -971667316) / var12;
                              var10 = hab.field_i;
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            } else {
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            }
                          }
                        } else {
                          if (lua.field_c > var10) {
                            var10 = lua.field_c;
                            var8 = (-var13 + lua.field_c << 1151627820) / var12;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            if (hab.field_i < var10) {
                              var8 = (hab.field_i + -var13 << -971667316) / var12;
                              var10 = hab.field_i;
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            } else {
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            }
                          }
                        }
                      } else {
                        var11 = lua.field_c;
                        var9 = (lua.field_c - var13 << 1700536588) / var12;
                        if (lua.field_c > var10) {
                          var10 = lua.field_c;
                          var8 = (-var13 + lua.field_c << 1151627820) / var12;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          if (hab.field_i < var10) {
                            var8 = (hab.field_i + -var13 << -971667316) / var12;
                            var10 = hab.field_i;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          }
                        }
                      }
                    } else {
                      var9 = param1;
                      var11 = param4;
                      if (lua.field_c <= var11) {
                        if (hab.field_i < var11) {
                          var11 = hab.field_i;
                          var9 = (hab.field_i + -var13 << -1018694356) / var12;
                          if (lua.field_c > var10) {
                            var10 = lua.field_c;
                            var8 = (-var13 + lua.field_c << 1151627820) / var12;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            if (hab.field_i < var10) {
                              var8 = (hab.field_i + -var13 << -971667316) / var12;
                              var10 = hab.field_i;
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            } else {
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            }
                          }
                        } else {
                          if (lua.field_c > var10) {
                            var10 = lua.field_c;
                            var8 = (-var13 + lua.field_c << 1151627820) / var12;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            if (hab.field_i < var10) {
                              var8 = (hab.field_i + -var13 << -971667316) / var12;
                              var10 = hab.field_i;
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            } else {
                              rsa.a(param5, var9, -1, var10, var11, var8);
                              return;
                            }
                          }
                        }
                      } else {
                        var11 = lua.field_c;
                        var9 = (lua.field_c - var13 << 1700536588) / var12;
                        if (lua.field_c > var10) {
                          var10 = lua.field_c;
                          var8 = (-var13 + lua.field_c << 1151627820) / var12;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          if (hab.field_i < var10) {
                            var8 = (hab.field_i + -var13 << -971667316) / var12;
                            var10 = hab.field_i;
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          } else {
                            rsa.a(param5, var9, -1, var10, var11, var8);
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L0: {
                    var10 = var13 - -(var12 * mt.field_o >> -2130128052);
                    var8 = mt.field_o;
                    if (ob.field_j > param1) {
                      var11 = (ob.field_j * var12 >> -147830388) + var13;
                      var9 = ob.field_j;
                      break L0;
                    } else {
                      if (mt.field_o < param1) {
                        var11 = var13 - -(mt.field_o * var12 >> -703305652);
                        var9 = mt.field_o;
                        break L0;
                      } else {
                        var9 = param1;
                        var11 = param4;
                        break L0;
                      }
                    }
                  }
                  if (lua.field_c <= var11) {
                    if (hab.field_i < var11) {
                      var11 = hab.field_i;
                      var9 = (hab.field_i + -var13 << -1018694356) / var12;
                      if (lua.field_c > var10) {
                        var10 = lua.field_c;
                        var8 = (-var13 + lua.field_c << 1151627820) / var12;
                        rsa.a(param5, var9, -1, var10, var11, var8);
                        return;
                      } else {
                        if (hab.field_i < var10) {
                          var8 = (hab.field_i + -var13 << -971667316) / var12;
                          var10 = hab.field_i;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        }
                      }
                    } else {
                      if (lua.field_c > var10) {
                        var10 = lua.field_c;
                        var8 = (-var13 + lua.field_c << 1151627820) / var12;
                        rsa.a(param5, var9, -1, var10, var11, var8);
                        return;
                      } else {
                        if (hab.field_i < var10) {
                          var8 = (hab.field_i + -var13 << -971667316) / var12;
                          var10 = hab.field_i;
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        } else {
                          rsa.a(param5, var9, -1, var10, var11, var8);
                          return;
                        }
                      }
                    }
                  } else {
                    var11 = lua.field_c;
                    var9 = (lua.field_c - var13 << 1700536588) / var12;
                    if (lua.field_c > var10) {
                      var10 = lua.field_c;
                      var8 = (-var13 + lua.field_c << 1151627820) / var12;
                      rsa.a(param5, var9, -1, var10, var11, var8);
                      return;
                    } else {
                      if (hab.field_i < var10) {
                        var8 = (hab.field_i + -var13 << -971667316) / var12;
                        var10 = hab.field_i;
                        rsa.a(param5, var9, -1, var10, var11, var8);
                        return;
                      } else {
                        rsa.a(param5, var9, -1, var10, var11, var8);
                        return;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  var8 = ob.field_j;
                  var10 = var13 + (ob.field_j * var12 >> -920780948);
                  if (ob.field_j > param1) {
                    var11 = (ob.field_j * var12 >> -147830388) + var13;
                    var9 = ob.field_j;
                    break L1;
                  } else {
                    if (mt.field_o < param1) {
                      var11 = var13 - -(mt.field_o * var12 >> -703305652);
                      var9 = mt.field_o;
                      break L1;
                    } else {
                      var9 = param1;
                      var11 = param4;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (lua.field_c <= var11) {
                    if (hab.field_i < var11) {
                      var11 = hab.field_i;
                      var9 = (hab.field_i + -var13 << -1018694356) / var12;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var11 = lua.field_c;
                    var9 = (lua.field_c - var13 << 1700536588) / var12;
                    break L2;
                  }
                }
                if (lua.field_c > var10) {
                  var10 = lua.field_c;
                  var8 = (-var13 + lua.field_c << 1151627820) / var12;
                  rsa.a(param5, var9, -1, var10, var11, var8);
                  return;
                } else {
                  if (hab.field_i < var10) {
                    var8 = (hab.field_i + -var13 << -971667316) / var12;
                    var10 = hab.field_i;
                    rsa.a(param5, var9, -1, var10, var11, var8);
                    return;
                  } else {
                    rsa.a(param5, var9, -1, var10, var11, var8);
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          L3: {
            if (-1 != (var7 ^ -1)) {
              rha.a(-119, param3, param5, param4, param0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    static {
        field_o = true;
    }
}
