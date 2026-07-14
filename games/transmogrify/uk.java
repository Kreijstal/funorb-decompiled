/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends bj {
    int field_hb;
    static boolean field_gb;
    String field_eb;
    String field_fb;

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 == 14122) {
          var2 = param1.length();
          var3 = new byte[var2];
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param1.charAt(var4);
                    if (0 >= var5) {
                      break L3;
                    } else {
                      if (var5 < 128) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (160 > var5) {
                      break L4;
                    } else {
                      if (var5 <= 255) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (8364 != var5) {
                    if (var5 == 8218) {
                      var3[var4] = (byte)-126;
                      break L1;
                    } else {
                      if (402 != var5) {
                        if (var5 != 8222) {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 == 8224) {
                              var3[var4] = (byte)-122;
                              break L1;
                            } else {
                              if (var5 == 8225) {
                                var3[var4] = (byte)-121;
                                break L1;
                              } else {
                                if (710 == var5) {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                } else {
                                  if (8240 != var5) {
                                    if (var5 == 352) {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    } else {
                                      if (8249 != var5) {
                                        if (var5 == 338) {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        } else {
                                          if (381 != var5) {
                                            if (8216 == var5) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (var5 != 8217) {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                } else {
                                                  if (8221 == var5) {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  } else {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    } else {
                                                      if (var5 == 8211) {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      } else {
                                                        if (var5 == 8212) {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        } else {
                                                          if (var5 != 732) {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            } else {
                                                              if (var5 != 353) {
                                                                if (var5 != 8250) {
                                                                  if (339 != var5) {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (var5 != 376) {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L1;
                        }
                      } else {
                        var3[var4] = (byte)-125;
                        break L1;
                      }
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    break L1;
                  }
                }
                var3[var4] = (byte)var5;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static long b(int param0, CharSequence param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        long var2 = 0L;
        int var4 = param1.length();
        for (var5 = 0; var5 < var4; var5++) {
            var2 = var2 * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65) {
                // if_icmpgt L75
                var2 = var2 + (long)(1 + (var6 + -65));
            } else {
                if (var6 >= 97) {
                    // if_icmpgt L103
                    var2 = var2 + (long)(1 + var6 + -97);
                } else {
                    if (48 <= var6) {
                        if (!(var6 > 57)) {
                            var2 = var2 + (long)(var6 + -21);
                        }
                    }
                }
            }
            // ifle L143
        }
        if (param0 <= 72) {
            field_gb = true;
        }
        while ((var2 % 37L ^ -1L) == -1L) {
            // ifeq L193
            var2 = var2 / 37L;
        }
        return var2;
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
