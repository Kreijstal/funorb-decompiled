/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea {
    static int field_a;
    static int field_b;
    private static String field_z;

    final static byte a(int param0, char param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_2_0 = 0;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 < -118) {
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
                    var2_int = -128;
                    break L1;
                  } else {
                    if (param1 != 8218) {
                      if (402 == param1) {
                        var2_int = -125;
                        break L1;
                      } else {
                        if (8222 != param1) {
                          if (8230 != param1) {
                            if (param1 == 8224) {
                              var2_int = -122;
                              break L1;
                            } else {
                              if (8225 == param1) {
                                var2_int = -121;
                                break L1;
                              } else {
                                if (param1 != 710) {
                                  if (param1 != 8240) {
                                    if (param1 == 352) {
                                      var2_int = -118;
                                      break L1;
                                    } else {
                                      if (param1 == 8249) {
                                        var2_int = -117;
                                        break L1;
                                      } else {
                                        if (param1 == 338) {
                                          var2_int = -116;
                                          break L1;
                                        } else {
                                          if (381 != param1) {
                                            if (8216 != param1) {
                                              if (param1 != 8217) {
                                                if (param1 == 8220) {
                                                  var2_int = -109;
                                                  break L1;
                                                } else {
                                                  if (param1 == 8221) {
                                                    var2_int = -108;
                                                    break L1;
                                                  } else {
                                                    if (param1 != 8226) {
                                                      if (param1 != 8211) {
                                                        if (param1 != 8212) {
                                                          if (732 == param1) {
                                                            var2_int = -104;
                                                            break L1;
                                                          } else {
                                                            if (param1 == 8482) {
                                                              var2_int = -103;
                                                              break L1;
                                                            } else {
                                                              if (param1 == 353) {
                                                                var2_int = -102;
                                                                break L1;
                                                              } else {
                                                                if (param1 == 8250) {
                                                                  var2_int = -101;
                                                                  break L1;
                                                                } else {
                                                                  if (param1 == 339) {
                                                                    var2_int = -100;
                                                                    break L1;
                                                                  } else {
                                                                    if (382 != param1) {
                                                                      if (param1 != 376) {
                                                                        var2_int = 63;
                                                                        break L1;
                                                                      } else {
                                                                        var2_int = -97;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      var2_int = -98;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2_int = -105;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2_int = -106;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2_int = -107;
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2_int = -110;
                                                break L1;
                                              }
                                            } else {
                                              var2_int = -111;
                                              break L1;
                                            }
                                          } else {
                                            var2_int = -114;
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2_int = -119;
                                    break L1;
                                  }
                                } else {
                                  var2_int = -120;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            var2_int = -123;
                            break L1;
                          }
                        } else {
                          var2_int = -124;
                          break L1;
                        }
                      }
                    } else {
                      var2_int = -126;
                      break L1;
                    }
                  }
                }
                var2_int = (byte)param1;
                break L1;
              }
              stackOut_66_0 = var2_int;
              stackIn_67_0 = stackOut_66_0;
              break L0;
            } else {
              stackOut_2_0 = 32;
              stackIn_3_0 = stackOut_2_0;
              return (byte) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, field_z + param0 + 44 + param1 + 41);
        }
        return (byte) stackIn_67_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "aea.A(";
        field_b = 600;
        field_a = 0;
    }
}
