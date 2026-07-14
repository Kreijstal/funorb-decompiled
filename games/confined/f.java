/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static String field_a;
    static String field_c;

    final static nf[] a(int param0, nf[] param1, int param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (param0 != 8364) {
            return null;
        }
        nf[] var6 = new nf[param1.length];
        nf[] var3 = var6;
        for (var4 = 0; var4 < param1.length; var4++) {
            var6[var4] = new nf(160, 94);
            var6[var4].d();
            param1[var4].a(param1[var4].field_t << 1176029987, param1[var4].field_x << -2077232733, 1280, 752, 0, 655360 / param2);
        }
        pi.field_S.a((byte) 110);
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -12435) {
            Object var2 = null;
            nf[] discarded$0 = f.a(-105, (nf[]) null, 93);
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
            field_b = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "Names cannot start or end with space or underscore";
        field_b = "You already have the lightning cannon";
    }
}
