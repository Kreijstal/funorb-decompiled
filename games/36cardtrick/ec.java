/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends gk {
    private long field_n;
    private long field_g;
    static int field_f;
    static nc field_j;
    static long field_m;
    private int field_k;
    private long[] field_i;
    private int field_l;
    private long field_h;

    public static void d(int param0) {
        field_j = null;
        if (param0 != 10) {
            field_f = 74;
        }
    }

    final void b(int param0) {
        if (param0 >= -65) {
            ((ec) this).field_n = 22L;
        }
        if ((((ec) this).field_n ^ -1L) > (((ec) this).field_g ^ -1L)) {
            ((ec) this).field_n = ((ec) this).field_n + (-((ec) this).field_n + ((ec) this).field_g);
        }
        ((ec) this).field_h = 0L;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Main.field_T;
        long var2 = System.nanoTime();
        long var4 = var2 - ((ec) this).field_h;
        ((ec) this).field_h = var2;
        if (!param0) {
        }
        if (-5000000000L < var4) {
            if ((var4 ^ -1L) > -5000000001L) {
                ((ec) this).field_i[((ec) this).field_k] = var4;
                if (!(-2 >= (((ec) this).field_l ^ -1))) {
                    ((ec) this).field_l = ((ec) this).field_l + 1;
                }
                ((ec) this).field_k = (((ec) this).field_k - -1) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((ec) this).field_l; var8++) {
            var6 = var6 + ((ec) this).field_i[(10 + (((ec) this).field_k - var8)) % 10];
        }
        return var6 / (long)((ec) this).field_l;
    }

    final int a(long param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (!param1) {
          if (((ec) this).field_n < ((ec) this).field_g) {
            ((ec) this).field_h = ((ec) this).field_h + (((ec) this).field_g - ((ec) this).field_n);
            ((ec) this).field_n = ((ec) this).field_n + (((ec) this).field_g - ((ec) this).field_n);
            ((ec) this).field_g = ((ec) this).field_g + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((ec) this).field_g = ((ec) this).field_g + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L1;
                } else {
                  if ((((ec) this).field_g ^ -1L) > (((ec) this).field_n ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((((ec) this).field_n ^ -1L) >= (((ec) this).field_g ^ -1L)) {
                  break L2;
                } else {
                  ((ec) this).field_g = ((ec) this).field_n;
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 92;
        }
    }

    final static ic a(String param0, qk param1, boolean param2, String param3, qk param4) {
        if (param2) {
            return null;
        }
        int var5 = param4.a(18659, param0);
        int var6 = param4.a(var5, param3, (byte) 7);
        return kf.a(param4, 0, var6, var5, param1);
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (param0 <= -9) {
          L0: {
            L1: {
              L2: {
                if (0 >= param1) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 != 8364) {
                if (param1 != 8218) {
                  if (402 != param1) {
                    if (param1 == 8222) {
                      var2 = -124;
                      break L0;
                    } else {
                      if (param1 != 8230) {
                        if (param1 != 8224) {
                          if (param1 != 8225) {
                            if (710 == param1) {
                              var2 = -120;
                              break L0;
                            } else {
                              if (param1 != 8240) {
                                if (param1 != 352) {
                                  if (param1 == 8249) {
                                    var2 = -117;
                                    break L0;
                                  } else {
                                    if (param1 != 338) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L0;
                                      } else {
                                        if (param1 != 8216) {
                                          if (param1 != 8217) {
                                            if (param1 == 8220) {
                                              var2 = -109;
                                              break L0;
                                            } else {
                                              if (8221 != param1) {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (param1 == 732) {
                                                        var2 = -104;
                                                        break L0;
                                                      } else {
                                                        if (param1 != 8482) {
                                                          if (param1 != 353) {
                                                            if (param1 != 8250) {
                                                              if (param1 != 339) {
                                                                if (param1 == 382) {
                                                                  var2 = -98;
                                                                  break L0;
                                                                } else {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
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
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -111;
                                          break L0;
                                        }
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
                            }
                          } else {
                            var2 = -121;
                            break L0;
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      } else {
                        var2 = -123;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -125;
                    break L0;
                  }
                } else {
                  var2 = -126;
                  break L0;
                }
              } else {
                var2 = -128;
                break L0;
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) 87;
        }
    }

    final long a(int param0) {
        if (param0 != 0) {
            ((ec) this).b(108);
        }
        ((ec) this).field_n = ((ec) this).field_n + this.a(true);
        if (((ec) this).field_g > ((ec) this).field_n) {
            return (((ec) this).field_g - ((ec) this).field_n) / 1000000L;
        }
        return 0L;
    }

    ec() {
        ((ec) this).field_n = 0L;
        ((ec) this).field_g = 0L;
        ((ec) this).field_l = 1;
        ((ec) this).field_k = 0;
        ((ec) this).field_h = 0L;
        ((ec) this).field_i = new long[10];
        ((ec) this).field_n = System.nanoTime();
        ((ec) this).field_g = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new nc();
    }
}
