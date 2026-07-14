/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends ca {
    String field_gb;
    int field_hb;
    String field_kb;
    static boolean field_ib;
    static String field_jb;
    static int field_fb;

    ld() {
        super(0L, (ca) null);
    }

    public static void g(int param0) {
        if (param0 != 8240) {
            field_jb = null;
        }
        field_jb = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var2 = param1.length();
        if (param0 == -101) {
          var3 = new byte[var2];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2) {
              return var3;
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
                  if (var5 != 8364) {
                    if (var5 != 8218) {
                      if (var5 != 402) {
                        if (var5 != 8222) {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 != 8224) {
                              if (var5 == 8225) {
                                var3[var4] = (byte)-121;
                                break L1;
                              } else {
                                if (var5 != 710) {
                                  if (8240 == var5) {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  } else {
                                    if (var5 == 352) {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    } else {
                                      if (var5 == 8249) {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      } else {
                                        if (var5 != 338) {
                                          if (var5 == 381) {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          } else {
                                            if (var5 == 8216) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (8217 == var5) {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              } else {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                } else {
                                                  if (var5 != 8221) {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    } else {
                                                      if (8211 != var5) {
                                                        if (var5 != 8212) {
                                                          if (var5 != 732) {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            } else {
                                                              if (353 == var5) {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              } else {
                                                                if (var5 != 8250) {
                                                                  if (var5 == 339) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  } else {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (376 == var5) {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-122;
                              break L1;
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
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
