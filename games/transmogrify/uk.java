/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends bj {
    int field_hb;
    static boolean field_gb;
    String field_eb;
    String field_fb;

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14122) {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackOut_69_0 = (byte[]) var3;
                  stackIn_70_0 = stackOut_69_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                          break L4;
                        } else {
                          if (var5 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (160 > var5) {
                          break L5;
                        } else {
                          if (var5 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (8364 != var5) {
                        if (var5 == 8218) {
                          var3[var4] = (byte) -126;
                          break L2;
                        } else {
                          if (402 != var5) {
                            if (var5 != 8222) {
                              if (var5 == 8230) {
                                var3[var4] = (byte) -123;
                                break L2;
                              } else {
                                if (var5 == 8224) {
                                  var3[var4] = (byte) -122;
                                  break L2;
                                } else {
                                  if (var5 == 8225) {
                                    var3[var4] = (byte) -121;
                                    break L2;
                                  } else {
                                    if (710 == var5) {
                                      var3[var4] = (byte) -120;
                                      break L2;
                                    } else {
                                      if (8240 != var5) {
                                        if (var5 == 352) {
                                          var3[var4] = (byte) -118;
                                          break L2;
                                        } else {
                                          if (8249 != var5) {
                                            if (var5 == 338) {
                                              var3[var4] = (byte) -116;
                                              break L2;
                                            } else {
                                              if (381 != var5) {
                                                if (8216 == var5) {
                                                  var3[var4] = (byte) -111;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8217) {
                                                    if (var5 == 8220) {
                                                      var3[var4] = (byte) -109;
                                                      break L2;
                                                    } else {
                                                      if (8221 == var5) {
                                                        var3[var4] = (byte) -108;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte) -107;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8211) {
                                                            var3[var4] = (byte) -106;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 8212) {
                                                              var3[var4] = (byte) -105;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 732) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte) -103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (var5 != 8250) {
                                                                      if (339 != var5) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte) -98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 != 376) {
                                                                            var3[var4] = (byte) 63;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte) -97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -100;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -104;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte) -117;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte) -119;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte) -124;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte) -125;
                            break L2;
                          }
                        }
                      } else {
                        var3[var4] = (byte) -128;
                        break L2;
                      }
                    }
                    var3[var4] = (byte)var5;
                    break L2;
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("uk.I(").append(param0).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_70_0;
    }

    final static long b(int param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (var6 > 90) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(1 + (var6 + -65));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + var6 + -97);
                          break L3;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L3;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (param0 > 72) {
                  break L6;
                } else {
                  field_gb = true;
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_20_0 = var2_long;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("uk.H(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    uk() {
        super(0L, (bj) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = false;
    }
}
