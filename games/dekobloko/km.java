/*
 * Decompiled by CFR-JS 0.4.0.
 */
class km extends be {
    static String field_B;
    static ni field_A;
    static long field_C;
    static en field_z;
    static String field_y;
    static byte[] field_D;

    final static boolean b(int param0, int param1) {
        if (param1 != -8222) {
            return false;
        }
        return (param0 ^ -1) <= -3 ? true : false;
    }

    km() {
    }

    public static void c(int param0) {
        if (param0 != 710) {
            return;
        }
        field_D = null;
        field_y = null;
        field_B = null;
        field_A = null;
        field_z = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          if (param0 == 6216) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
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
                  if (var5 < 160) {
                    break L5;
                  } else {
                    if (var5 > 255) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (var5 == 402) {
                      var3[var4] = (byte)-125;
                      break L2;
                    } else {
                      if (var5 != 8222) {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (8225 == var5) {
                              var3[var4] = (byte)-121;
                              break L2;
                            } else {
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 != 381) {
                                          if (var5 != 8216) {
                                            if (var5 != 8217) {
                                              if (var5 != 8220) {
                                                if (var5 != 8221) {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (8212 == var5) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (var5 != 732) {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (353 != var5) {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (339 == var5) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                } else {
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
                                                                }
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
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte)-124;
                        break L2;
                      }
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "ESC - cancel this line";
        field_y = "Advertising websites";
    }
}
