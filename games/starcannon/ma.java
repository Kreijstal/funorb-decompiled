/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private boolean field_d;
    private String field_i;
    static rk field_h;
    static hl[] field_e;
    static String field_g;
    static rk field_c;
    static hl field_b;
    static String field_f;
    static hl[] field_a;

    final static boolean a(int param0) {
        va var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        va var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (va) (Object) ee.field_a.c(-3905);
            var1 = var3;
            if (var1 != null) {
              var2 = param0;
              L1: while (true) {
                if (var2 >= var1.field_n) {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (null == var3.field_p[var2]) {
                      break L2;
                    } else {
                      if (var3.field_p[var2].field_b != 0) {
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      }
                    }
                  }
                  L3: {
                    if (null == var3.field_i[var2]) {
                      break L3;
                    } else {
                      if (var3.field_i[var2].field_b == 0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "ma.F(" + param0 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final static void a(boolean param0) {
        ba.a(false, param0, 2);
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            field_f = null;
        }
        return ((ma) this).field_d;
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        L0: {
          if (param0 <= -126) {
            break L0;
          } else {
            boolean discarded$1 = ma.a(100);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 <= 0) {
                break L3;
              } else {
                if (param1 < 128) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 160) {
                break L4;
              } else {
                if (param1 <= 255) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            if (param1 == 8364) {
              var2 = -128;
              break L1;
            } else {
              if (param1 != 8218) {
                if (402 != param1) {
                  if (param1 != 8222) {
                    if (8230 == param1) {
                      var2 = -123;
                      break L1;
                    } else {
                      if (param1 != 8224) {
                        if (param1 == 8225) {
                          var2 = -121;
                          break L1;
                        } else {
                          if (param1 != 710) {
                            if (param1 == 8240) {
                              var2 = -119;
                              break L1;
                            } else {
                              if (352 == param1) {
                                var2 = -118;
                                break L1;
                              } else {
                                if (8249 == param1) {
                                  var2 = -117;
                                  break L1;
                                } else {
                                  if (338 == param1) {
                                    var2 = -116;
                                    break L1;
                                  } else {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      break L1;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 == 8217) {
                                          var2 = -110;
                                          break L1;
                                        } else {
                                          if (param1 == 8220) {
                                            var2 = -109;
                                            break L1;
                                          } else {
                                            if (param1 != 8221) {
                                              if (param1 == 8226) {
                                                var2 = -107;
                                                break L1;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L1;
                                                } else {
                                                  if (param1 == 8212) {
                                                    var2 = -105;
                                                    break L1;
                                                  } else {
                                                    if (param1 == 732) {
                                                      var2 = -104;
                                                      break L1;
                                                    } else {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L1;
                                                      } else {
                                                        if (353 != param1) {
                                                          if (param1 != 8250) {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                              break L1;
                                                            } else {
                                                              if (param1 != 382) {
                                                                if (param1 != 376) {
                                                                  var2 = 63;
                                                                  break L1;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var2 = -120;
                            break L1;
                          }
                        }
                      } else {
                        var2 = -122;
                        break L1;
                      }
                    }
                  } else {
                    var2 = -124;
                    break L1;
                  }
                } else {
                  var2 = -125;
                  break L1;
                }
              } else {
                var2 = -126;
                break L1;
              }
            }
          }
          var2 = (byte)param1;
          break L1;
        }
        return (byte) var2;
    }

    public static void a() {
        field_h = null;
        int var1 = 110;
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    final String b(int param0) {
        int var2 = 41 / ((59 - param0) / 58);
        return ((ma) this).field_i;
    }

    ma(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((ma) this).field_i = param0;
              if (null != ((ma) this).field_i) {
                break L1;
              } else {
                ((ma) this).field_i = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((ma) this).field_d = stackIn_6_1 != 0;
              if (0 != ((ma) this).field_i.length()) {
                break L3;
              } else {
                ((ma) this).field_d = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ma.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final static void a(String param0, int param1, float param2) {
        if (param1 != -13923) {
            return;
        }
        try {
            o.field_b = param0;
            nb.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ma.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    ma(String param0) {
        this(param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new rk();
        field_g = "Retry";
        field_f = "Orb points: <%0>";
    }
}
