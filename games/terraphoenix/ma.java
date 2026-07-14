/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends rf {
    static int field_I;
    ua field_F;
    static int field_E;
    static int field_J;
    int field_H;
    byte[] field_G;

    final static boolean a(uc param0, byte param1) {
        if (param1 != 98) {
            field_J = 47;
        }
        return (param0.a(false, 1) ^ -1) == -2 ? true : false;
    }

    final int c(int param0) {
        if (param0 != 0) {
            byte[] discarded$0 = ((ma) this).b(true);
        }
        if (!(!((ma) this).field_A)) {
            return 0;
        }
        return 100;
    }

    final byte[] b(boolean param0) {
        if (!(!((ma) this).field_A)) {
            throw new RuntimeException();
        }
        if (!param0) {
            field_E = -122;
        }
        return ((ma) this).field_G;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Terraphoenix.field_V;
          if (param0 == -32396) {
            break L0;
          } else {
            var7 = null;
            boolean discarded$1 = ma.a((uc) null, (byte) -48);
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
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (8218 == var5) {
                    var3[var4] = (byte)-126;
                    break L2;
                  } else {
                    if (var5 != 402) {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (var5 != 8225) {
                              if (var5 != 710) {
                                if (8240 != var5) {
                                  if (352 != var5) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 != 381) {
                                          if (var5 != 8216) {
                                            if (var5 != 8217) {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (8221 != var5) {
                                                  if (var5 != 8226) {
                                                    if (8211 == var5) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8212) {
                                                        if (var5 != 732) {
                                                          if (var5 != 8482) {
                                                            if (353 == var5) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8250) {
                                                                if (var5 != 339) {
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
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
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
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
                    }
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

    ma() {
    }

    final static oa a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        oa var7 = null;
        int var8 = Terraphoenix.field_V;
        int var2 = param0.length();
        if (!(0 != var2)) {
            return b.field_f;
        }
        if (!(255 >= var2)) {
            return lg.field_j;
        }
        String[] var3 = nc.a(14352, param0, (char)param1);
        if (!(var3.length >= 2)) {
            return b.field_f;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = pj.a(-56, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return wf.a(param1 + -46, var3[var3.length - 1]);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
    }
}
