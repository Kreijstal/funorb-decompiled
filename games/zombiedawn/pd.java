/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int[] field_a;

    public static void a(byte param0) {
        if (param0 != -117) {
            field_a = null;
        }
        field_a = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            if (param0 > 51) {
              return var3;
            } else {
              return null;
            }
          } else {
            L1: {
              L2: {
                L3: {
                  var5 = param1.charAt(var4);
                  if (var5 <= 0) {
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
                  if (var5 < 160) {
                    break L4;
                  } else {
                    if (var5 > 255) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                if (8364 != var5) {
                  if (var5 != 8218) {
                    if (var5 == 402) {
                      var3[var4] = (byte)-125;
                      break L1;
                    } else {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L1;
                      } else {
                        if (var5 != 8230) {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L1;
                          } else {
                            if (8225 == var5) {
                              var3[var4] = (byte)-121;
                              break L1;
                            } else {
                              if (var5 != 710) {
                                if (var5 != 8240) {
                                  if (var5 != 352) {
                                    if (8249 != var5) {
                                      if (var5 == 338) {
                                        var3[var4] = (byte)-116;
                                        break L1;
                                      } else {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L1;
                                        } else {
                                          if (var5 != 8216) {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (var5 != 8220) {
                                                if (var5 == 8221) {
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
                                                      if (var5 != 8212) {
                                                        if (var5 == 732) {
                                                          var3[var4] = (byte)-104;
                                                          break L1;
                                                        } else {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L1;
                                                          } else {
                                                            if (353 == var5) {
                                                              var3[var4] = (byte)-102;
                                                              break L1;
                                                            } else {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L1;
                                                              } else {
                                                                if (var5 == 339) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L1;
                                                                } else {
                                                                  if (382 != var5) {
                                                                    if (var5 != 376) {
                                                                      var3[var4] = (byte)63;
                                                                      break L1;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L1;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-117;
                                      break L1;
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L1;
                                  }
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L1;
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L1;
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L1;
                        }
                      }
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L1;
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
    }

    final synchronized static long a(int param0) {
        if (param0 != -22826) {
            return -16L;
        }
        long var1 = System.currentTimeMillis();
        if (!(td.field_e <= var1)) {
            cc.field_a = cc.field_a + (-var1 + td.field_e);
        }
        td.field_e = var1;
        return var1 + cc.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{220, 347, 515, -1};
    }
}
