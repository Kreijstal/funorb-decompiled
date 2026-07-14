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
        int var2 = 0;
        va var3 = null;
        var3 = (va) (Object) ee.field_a.c(-3905);
        var1 = var3;
        if (var1 != null) {
          var2 = param0;
          L0: while (true) {
            if (var2 >= var1.field_n) {
              return true;
            } else {
              L1: {
                if (null == var3.field_p[var2]) {
                  break L1;
                } else {
                  if (var3.field_p[var2].field_b != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              if (null != var3.field_i[var2]) {
                if (var3.field_i[var2].field_b == 0) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0, int param1) {
        ba.a(false, param0, param1 ^ 2);
        if (param1 != 0) {
            boolean discarded$0 = ma.a(-10);
        }
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

    public static void a(byte param0) {
        field_h = null;
        int var1 = -110 / ((8 - param0) / 57);
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
        ((ma) this).field_i = param0;
        if (null == ((ma) this).field_i) {
            ((ma) this).field_i = "";
        }
        ((ma) this).field_d = param1 ? true : false;
        if (0 == ((ma) this).field_i.length()) {
            ((ma) this).field_d = false;
        }
    }

    final static void a(String param0, int param1, float param2) {
        if (param1 != -13923) {
            return;
        }
        o.field_b = param0;
        nb.field_a = param2;
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
