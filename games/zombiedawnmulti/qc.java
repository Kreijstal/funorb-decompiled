/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends qa {
    static ul field_s;
    boolean field_x;
    boolean field_r;
    static int field_q;
    static cj field_u;
    static int field_v;
    static String field_w;
    volatile boolean field_t;

    final static void a(int param0, byte param1, ja[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  g.c();
                  if (0 != param4) {
                    break L3;
                  } else {
                    param2[param3].a();
                    param2[param0].c(0, 0);
                    oo.f(0, 0, 24, 24, 0, 128);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (1 == param4) {
                    break L4;
                  } else {
                    L5: {
                      if ((param4 ^ -1) != -3) {
                        break L5;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L6: while (true) {
                          L7: {
                            if ((var5_int ^ -1) <= -25) {
                              break L7;
                            } else {
                              oo.b(var5_int, 0, 24, 0, -(5 * var5_int) + 120);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (3 != param4) {
                        break L8;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L9: while (true) {
                          L10: {
                            if (var5_int >= 24) {
                              break L10;
                            } else {
                              oo.c(0, var5_int, 24, 0, var5_int * 5);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    L11: {
                      if (-5 != (param4 ^ -1)) {
                        break L11;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L12: while (true) {
                          L13: {
                            if (var5_int >= 24) {
                              break L13;
                            } else {
                              oo.c(0, var5_int, 24, 0, -(5 * var5_int) + 120);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L14: {
                      if (-7 != (param4 ^ -1)) {
                        break L14;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L15: while (true) {
                          L16: {
                            if (24 <= var5_int) {
                              break L16;
                            } else {
                              oo.c(var5_int + 1, var5_int, 24 + -var5_int, 0, 5 * var5_int);
                              oo.b(var5_int, var5_int, -var5_int + 24, 0, var5_int * 5);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    L17: {
                      if (-9 != (param4 ^ -1)) {
                        break L17;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L18: while (true) {
                          L19: {
                            if (24 <= var5_int) {
                              break L19;
                            } else {
                              oo.c(0, var5_int, var5_int - -1, 0, -(var5_int * 5) + 120);
                              oo.b(var5_int, 0, var5_int, 0, -(5 * var5_int) + 120);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L20: {
                      if (7 != param4) {
                        break L20;
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L21: while (true) {
                          L22: {
                            if (-25 >= (var5_int ^ -1)) {
                              break L22;
                            } else {
                              oo.c(0, var5_int, 24 - var5_int, 0, 5 * var5_int);
                              oo.b(var5_int, -var5_int + 24, var5_int, 0, -(5 * var5_int) + 120);
                              var5_int++;
                              if (var6 != 0) {
                                break L1;
                              } else {
                                if (var6 == 0) {
                                  continue L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    if (-6 != (param4 ^ -1)) {
                      break L2;
                    } else {
                      param2[param3].a();
                      param2[param0].c(0, 0);
                      var5_int = 0;
                      L23: while (true) {
                        if (var5_int >= 24) {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        } else {
                          oo.c(-var5_int + 24, var5_int, var5_int, 0, -(5 * var5_int) + 120);
                          oo.b(var5_int, 0, 24 - var5_int, 0, var5_int * 5);
                          var5_int++;
                          if (var6 != 0) {
                            break L1;
                          } else {
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                }
                param2[param3].a();
                param2[param0].c(0, 0);
                var5_int = 0;
                L24: while (true) {
                  if (var5_int >= 24) {
                    break L2;
                  } else {
                    oo.b(var5_int, 0, 24, 0, var5_int * 5);
                    var5_int++;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      continue L24;
                    }
                  }
                }
              }
              g.b();
              break L1;
            }
            L25: {
              if (param1 == -126) {
                break L25;
              } else {
                field_q = 122;
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var5 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var5);
            stackOut_63_1 = new StringBuilder().append("qc.P(").append(param0).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L26;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L26;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] e(int param0);

    final static void a(br param0, br param1, int param2) {
        if (param2 != 0) {
            return;
        }
        try {
            if (param0.field_b != null) {
                param0.a(true);
            }
            param0.field_b = param1;
            param0.field_d = param1.field_d;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qc.O(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_u = null;
        field_s = null;
        field_w = null;
        if (param0 < 97) {
            qc.c((byte) 22);
        }
    }

    final static String b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 == -32) {
                break L1;
              } else {
                field_u = (cj) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = new String(var3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("qc.M(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    abstract int f(int param0);

    qc() {
        this.field_t = true;
    }

    static {
        field_w = "Hungry";
    }
}
