/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_a;

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          var2 = param1.length();
          var3 = new byte[var2];
          if (param0 == -126) {
            break L0;
          } else {
            var7 = null;
            ta.a(126, 40, (nf) null, -29, (String) null);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (var5 <= 0) {
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
                    if (var5 <= 255) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (8364 == var5) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (402 != var5) {
                      if (var5 != 8222) {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (8224 != var5) {
                            if (8225 != var5) {
                              if (var5 != 710) {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (338 == var5) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (8216 != var5) {
                                            if (var5 != 8217) {
                                              if (var5 != 8220) {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8226) {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8212) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 732) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 339) {
                                                                  if (var5 != 382) {
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  }
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
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
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

    final static void a(int param0, int param1, nf param2, int param3, String param4) {
        if (param0 <= 94) {
            Object var6 = null;
            byte[] discarded$0 = ta.a((byte) 99, (CharSequence) null);
        }
        param2.d(param1, param3);
        pn.field_a.b(param4, param2.field_t / 2 + param1, 15 + param3, 0, -1);
    }

    public static void a(int param0) {
        if (param0 != 27616) {
            field_a = null;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
    }
}
