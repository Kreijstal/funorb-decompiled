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
        if (~((ec) this).field_n > ~((ec) this).field_g) {
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
        if (-5000000000L < var4) {
            if (var4 < 5000000000L) {
                ((ec) this).field_i[((ec) this).field_k] = var4;
                if (!(((ec) this).field_l >= 1)) {
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
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((ec) this).field_g > ~((ec) this).field_n) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (~((ec) this).field_n >= ~((ec) this).field_g) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ic stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = param4.a(18659, param0);
            var6 = param4.a(var5_int, param3, (byte) 7);
            stackOut_2_0 = kf.a(param4, 0, var6, var5_int, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ec.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(false).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_3_0;
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
