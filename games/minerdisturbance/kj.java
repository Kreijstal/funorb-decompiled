/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static int field_d;
    static ld field_a;
    static String field_b;
    static eg field_c;

    final static void a(int param0) {
        tm dupTemp$0 = null;
        tm var4 = null;
        tm dupTemp$1 = null;
        tm var5 = null;
        int var2 = 0;
        tm var1 = null;
        int var3 = MinerDisturbance.field_ab;
        tm var1Lifetime1;
        while (true) {
          dupTemp$0 = (tm) (ok.field_b.e(63854));
          var4 = dupTemp$0;
          var1 = var4;
          if (null == dupTemp$0) {
            break;
          }
          ke.field_X[var4.field_s] = false;
        }
        while (true) {
          dupTemp$1 = (tm) (ec.field_c.e(63854));
          var5 = dupTemp$1;
          var1Lifetime1 = var5;
          if (null == dupTemp$1) {
            break;
          }
          ke.field_X[var5.field_s] = false;
        }
        if (param0 > -16) {
          return;
        }
        try {
          for (var2 = 0; var2 < 35; var2++) {
            ke.field_X[var2] = false;
          }
          jn.a(0);
          ja.field_u = 150;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kj.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -22156) {
          field_b = (String) null;
          pj.field_b = param0 ^ -1422590333;
          return;
        }
        pj.field_b = param0 ^ -1422590333;
    }

    final static void a(byte param0) {
        if (param0 != -123) {
          return;
        }
        mk.a(false, aa.field_e, 0);
    }

    final static boolean b(int param0) {
        if (-1 == rj.field_d) {
          if (!ta.a(0, 1)) {
            return false;
          }
          rj.field_d = field_a.d((byte) -54);
          field_a.field_o = 0;
        }
        if (param0 != -9319) {
          field_b = (String) null;
          if (-2 != rj.field_d) {
            return ta.a(0, rj.field_d);
          }
          if (ta.a(0, 2)) {
            rj.field_d = field_a.e(-81);
            field_a.field_o = 0;
            return ta.a(0, rj.field_d);
          }
          return false;
        }
        if (-2 != rj.field_d) {
          return ta.a(0, rj.field_d);
        }
        if (ta.a(0, 2)) {
          rj.field_d = field_a.e(-81);
          field_a.field_o = 0;
          return ta.a(0, rj.field_d);
        }
        return false;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (!param0) {
          return;
        }
        kj.a('[', 105);
    }

    final static boolean a(boolean param0) {
        if (param0) {
          kj.a(-55);
          return qc.field_b;
        }
        return qc.field_b;
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = MinerDisturbance.field_ab;
        if (param1 != -8251) {
          return (byte) -81;
        }
        if (0 >= param0) {
          if (160 <= param0 &&
            param0 <= 255) {
            var2 = (byte)param0;
          } else {
            if (param0 == 8364) {
              var2 = -128;
              return (byte) var2;
            }
            if (param0 != 8218) {
              if (param0 == 402) {
                var2 = -125;
                return (byte) var2;
              }
              if (param0 == 8222) {
                var2 = -124;
                return (byte) var2;
              }
              if (param0 == 8230) {
                var2 = -123;
                return (byte) var2;
              }
              if (param0 == 8224) {
                var2 = -122;
                return (byte) var2;
              }
              if (param0 == 8225) {
                var2 = -121;
                return (byte) var2;
              }
              if (710 != param0) {
                if (8240 != param0) {
                  if (352 == param0) {
                    var2 = -118;
                    return (byte) var2;
                  }
                  if (8249 != param0) {
                    if (338 == param0) {
                      var2 = -116;
                    } else {
                      if (param0 == 381) {
                        var2 = -114;
                      } else {
                        if (8216 != param0) {
                          if (8217 != param0) {
                            if (8220 != param0) {
                              if (param0 == 8221) {
                                var2 = -108;
                              } else {
                                if (param0 == 8226) {
                                  var2 = -107;
                                } else {
                                  if (param0 != 8211) {
                                    if (param0 == 8212) {
                                      var2 = -105;
                                    } else {
                                      if (param0 != 732) {
                                        if (param0 == 8482) {
                                          var2 = -103;
                                        } else {
                                          if (param0 != 353) {
                                            if (param0 == 8250) {
                                              var2 = -101;
                                            } else {
                                              if (param0 == 339) {
                                                var2 = -100;
                                              } else {
                                                if (param0 != 382) {
                                                  var2 = (376 != param0) ? 63 : -97;
                                                } else {
                                                  var2 = -98;
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -102;
                                          }
                                        }
                                      } else {
                                        var2 = -104;
                                      }
                                    }
                                  } else {
                                    var2 = -106;
                                  }
                                }
                              }
                            } else {
                              var2 = -109;
                            }
                          } else {
                            var2 = -110;
                          }
                        } else {
                          var2 = -111;
                        }
                      }
                    }
                  } else {
                    var2 = -117;
                  }
                } else {
                  var2 = -119;
                }
              } else {
                var2 = -120;
              }
            } else {
              var2 = -126;
            }
          }
          return (byte) var2;
        }
        if (128 > param0) {
          var2Lifetime1 = (byte)param0;
          return (byte) var2Lifetime1;
        }
        if (160 <= param0 &&
          param0 <= 255) {
          var2Lifetime2 = (byte)param0;
          return (byte) var2Lifetime2;
        }
        if (param0 == 8364) {
          var2Lifetime3 = -128;
        } else {
          if (param0 != 8218) {
            if (param0 == 402) {
              var2Lifetime3 = -125;
            } else {
              if (param0 == 8222) {
                var2Lifetime3 = -124;
              } else {
                if (param0 == 8230) {
                  var2Lifetime3 = -123;
                } else {
                  if (param0 == 8224) {
                    var2Lifetime3 = -122;
                  } else {
                    if (param0 == 8225) {
                      var2Lifetime3 = -121;
                    } else {
                      if (710 != param0) {
                        if (8240 != param0) {
                          if (352 == param0) {
                            var2Lifetime3 = -118;
                          } else {
                            if (8249 != param0) {
                              if (338 == param0) {
                                var2Lifetime3 = -116;
                              } else {
                                if (param0 == 381) {
                                  var2Lifetime3 = -114;
                                } else {
                                  if (8216 != param0) {
                                    if (8217 != param0) {
                                      if (8220 != param0) {
                                        if (param0 == 8221) {
                                          var2Lifetime3 = -108;
                                        } else {
                                          if (param0 == 8226) {
                                            var2Lifetime3 = -107;
                                          } else {
                                            if (param0 != 8211) {
                                              if (param0 == 8212) {
                                                var2Lifetime3 = -105;
                                              } else {
                                                if (param0 != 732) {
                                                  if (param0 == 8482) {
                                                    var2Lifetime3 = -103;
                                                  } else {
                                                    if (param0 != 353) {
                                                      if (param0 == 8250) {
                                                        var2Lifetime3 = -101;
                                                      } else {
                                                        if (param0 == 339) {
                                                          var2Lifetime3 = -100;
                                                        } else {
                                                          if (param0 != 382) {
                                                            var2Lifetime3 = (376 != param0) ? 63 : -97;
                                                          } else {
                                                            var2Lifetime3 = -98;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime3 = -102;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime3 = -104;
                                                }
                                              }
                                            } else {
                                              var2Lifetime3 = -106;
                                            }
                                          }
                                        }
                                      } else {
                                        var2Lifetime3 = -109;
                                      }
                                    } else {
                                      var2Lifetime3 = -110;
                                    }
                                  } else {
                                    var2Lifetime3 = -111;
                                  }
                                }
                              }
                            } else {
                              var2Lifetime3 = -117;
                            }
                          }
                        } else {
                          var2Lifetime3 = -119;
                        }
                      } else {
                        var2Lifetime3 = -120;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var2Lifetime3 = -126;
          }
        }
        return (byte) var2Lifetime3;
    }

    static {
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
