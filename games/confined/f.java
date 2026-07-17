/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static String field_a;
    static String field_c;

    final static nf[] a(int param0, nf[] param1) {
        nf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        nf[] var6 = null;
        nf[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var6 = new nf[param1.length];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param1.length) {
                pi.field_S.a((byte) 110);
                stackOut_6_0 = (nf[]) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var6[var4] = new nf(160, 94);
                var6[var4].d();
                param1[var4].a(param1[var4].field_t << 3, param1[var4].field_x << 3, 1280, 752, 0, 6826);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("f.A(").append(8364).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 96 + 41);
        }
        return stackIn_7_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static byte a(char param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = Confined.field_J ? 1 : 0;
              if (param0 <= 0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (255 >= param0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (8364 == param0) {
              var2 = -128;
              break L0;
            } else {
              if (param0 != 8218) {
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (8224 == param0) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (param0 != 8225) {
                          if (param0 != 710) {
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (8249 == param0) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (param0 != 338) {
                                    if (381 != param0) {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L0;
                                      } else {
                                        if (param0 != 8217) {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (8226 == param0) {
                                                var2 = -107;
                                                break L0;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (8250 != param0) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L0;
                                                              } else {
                                                                if (param0 == 376) {
                                                                  var2 = -97;
                                                                  break L0;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  } else {
                                    var2 = -116;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -118;
                                break L0;
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          } else {
                            var2 = -120;
                            break L0;
                          }
                        } else {
                          var2 = -121;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  } else {
                    var2 = -124;
                    break L0;
                  }
                } else {
                  var2 = -125;
                  break L0;
                }
              } else {
                var2 = -126;
                break L0;
              }
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        return (byte) var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "Names cannot start or end with space or underscore";
        field_b = "You already have the lightning cannon";
    }
}
