/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static String field_a;
    static String field_c;

    final static nf[] a(int param0, nf[] param1, int param2) {
        nf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        nf[] var6 = null;
        nf[] stackIn_3_0 = null;
        nf[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nf[] stackOut_7_0 = null;
        nf[] stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 8364) {
              var6 = new nf[param1.length];
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (var4 >= param1.length) {
                  pi.field_S.a((byte) 110);
                  stackOut_7_0 = (nf[]) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6[var4] = new nf(160, 94);
                  var6[var4].d();
                  param1[var4].a(param1[var4].field_t << 1176029987, param1[var4].field_x << -2077232733, 1280, 752, 0, 655360 / param2);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (nf[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("f.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void a(int param0) {
        nf[] discarded$0 = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -12435) {
            nf[] var2 = (nf[]) null;
            discarded$0 = f.a(-105, (nf[]) null, 93);
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Confined.field_J ? 1 : 0;
          if (param1 == -8483) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 <= 0) {
                break L3;
              } else {
                if (param0 < 128) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 160) {
                break L4;
              } else {
                if (255 >= param0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            if (8364 == param0) {
              var2 = -128;
              break L1;
            } else {
              if (param0 != 8218) {
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (8224 == param0) {
                        var2 = -122;
                        break L1;
                      } else {
                        if (param0 != 8225) {
                          if (param0 != 710) {
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (8249 == param0) {
                                  var2 = -117;
                                  break L1;
                                } else {
                                  if (param0 != 338) {
                                    if (381 != param0) {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L1;
                                      } else {
                                        if (param0 != 8217) {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (8226 == param0) {
                                                var2 = -107;
                                                break L1;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L1;
                                                    } else {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (8250 != param0) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L1;
                                                            } else {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L1;
                                                              } else {
                                                                if (param0 == 376) {
                                                                  var2 = -97;
                                                                  break L1;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L1;
                                                                }
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
                                                      } else {
                                                        var2 = -103;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                      break L1;
                                    }
                                  } else {
                                    var2 = -116;
                                    break L1;
                                  }
                                }
                              } else {
                                var2 = -118;
                                break L1;
                              }
                            } else {
                              var2 = -119;
                              break L1;
                            }
                          } else {
                            var2 = -120;
                            break L1;
                          }
                        } else {
                          var2 = -121;
                          break L1;
                        }
                      }
                    } else {
                      var2 = -123;
                      break L1;
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
          var2 = (byte)param0;
          break L1;
        }
        return (byte) var2;
    }

    static {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "Names cannot start or end with space or underscore";
        field_b = "You already have the lightning cannon";
    }
}
