/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends bj {
    int field_hb;
    static boolean field_gb;
    String field_eb;
    String field_fb;

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14122) {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_70_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
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
                          var3[var4] = (byte)-126;
                          break L2;
                        } else {
                          if (402 != var5) {
                            if (var5 != 8222) {
                              if (var5 == 8230) {
                                var3[var4] = (byte)-123;
                                break L2;
                              } else {
                                if (var5 == 8224) {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                } else {
                                  if (var5 == 8225) {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (710 == var5) {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    } else {
                                      if (8240 != var5) {
                                        if (var5 == 352) {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (8249 != var5) {
                                            if (var5 == 338) {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (381 != var5) {
                                                if (8216 == var5) {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8217) {
                                                    if (var5 == 8220) {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    } else {
                                                      if (8221 == var5) {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8211) {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 8212) {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 732) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (var5 != 8250) {
                                                                      if (339 != var5) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 != 376) {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte)-124;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-125;
                            break L2;
                          }
                        }
                      } else {
                        var3[var4] = (byte)-128;
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
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var2);

            stackIn_73_1 = new StringBuilder().append("uk.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static long b(int param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                      if (-66 < (var6 ^ -1)) {
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
                  if ((var2_long % 37L ^ -1L) != -1L) {
                    break L8;
                  } else {
                    if (-1L == (var2_long ^ -1L)) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_21_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("uk.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    uk() {
        super(0L, (bj) null);
    }

    static {
        field_gb = false;
    }
}
