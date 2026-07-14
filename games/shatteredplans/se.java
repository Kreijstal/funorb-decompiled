/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    boolean[][] field_j;
    int[] field_f;
    static boolean field_k;
    static String field_a;
    static boolean field_g;
    int[] field_b;
    int[] field_l;
    static String field_e;
    int[] field_h;
    static ur field_m;
    boolean[][] field_d;
    static qr field_i;
    static String field_c;

    final static void a(hb param0, int param1, hb param2, hb param3, sl param4) {
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        qa var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var12 = null;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = param0.b((byte) -61);
          var6 = param3.b((byte) -61);
          var7 = (qm) (Object) param2.a((byte) 124);
          if (param1 == -256) {
            break L0;
          } else {
            se.a((byte) -9);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 == null) {
            var8 = (qa) (Object) param0.a((byte) 111);
            L2: while (true) {
              if (-60 < var5) {
                L3: {
                  if (-1 > (var5 ^ -1)) {
                    param4.c(192 + var5 - 1, (byte) -86);
                    L4: while (true) {
                      if (var8 == null) {
                        break L3;
                      } else {
                        hm.a(var8, (ob) (Object) param4, true);
                        var8 = (qa) (Object) param0.a(false);
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var12 = (mg) (Object) param3.a((byte) 110);
                L5: while (true) {
                  if ((var6 ^ -1) > -193) {
                    L6: {
                      if (var6 > 0) {
                        param4.c(var6 - 1, (byte) -103);
                        L7: while (true) {
                          if (var12 == null) {
                            break L6;
                          } else {
                            lp.a(var12, (byte) -88, (ob) (Object) param4);
                            var12 = (mg) (Object) param3.a(false);
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    return;
                  } else {
                    param4.c(191, (byte) -104);
                    var10 = 0;
                    L8: while (true) {
                      if (var10 >= 192) {
                        // wide iinc 6 -192
                        continue L5;
                      } else {
                        lp.a(var12, (byte) -106, (ob) (Object) param4);
                        var12 = (mg) (Object) param3.a(false);
                        var10++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                param4.c(250, (byte) -61);
                var9 = 0;
                L9: while (true) {
                  if (-60 <= var9) {
                    var5 -= 59;
                    continue L2;
                  } else {
                    hm.a(var8, (ob) (Object) param4, true);
                    var8 = (qa) (Object) param0.a(false);
                    var9++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            L10: {
              param4.c(var7.field_o + 251, (byte) -125);
              im.a(var7.field_p, (ob) (Object) param4, 9555);
              di.a(var7.field_q, false, (ob) (Object) param4);
              if (var7.field_o != 3) {
                break L10;
              } else {
                di.a(var7.field_r, false, (ob) (Object) param4);
                break L10;
              }
            }
            var7 = (qm) (Object) param2.a(false);
            continue L1;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param1) {
            return;
        }
        gr var4 = (gr) (Object) qa.field_r.d(0);
        while (var4 != null) {
            uf.a(var4, param0, false);
            var4 = (gr) (Object) qa.field_r.a((byte) -71);
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param1.length();
        var3 = new byte[var2];
        if (param0 > 79) {
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
                    if (var5 < 160) {
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
                      if (402 == var5) {
                        var3[var4] = (byte)-125;
                        break L1;
                      } else {
                        if (var5 == 8222) {
                          var3[var4] = (byte)-124;
                          break L1;
                        } else {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 == 8224) {
                              var3[var4] = (byte)-122;
                              break L1;
                            } else {
                              if (var5 != 8225) {
                                if (var5 == 710) {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                } else {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  } else {
                                    if (var5 != 352) {
                                      if (8249 != var5) {
                                        if (var5 == 338) {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        } else {
                                          if (381 != var5) {
                                            if (var5 == 8216) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (var5 != 8217) {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                } else {
                                                  if (var5 != 8221) {
                                                    if (var5 != 8226) {
                                                      if (8211 != var5) {
                                                        if (var5 == 8212) {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        } else {
                                                          if (732 != var5) {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            } else {
                                                              if (var5 != 353) {
                                                                if (var5 == 8250) {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                } else {
                                                                  if (var5 != 339) {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (var5 == 376) {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  }
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
                                                      } else {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
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
                                    } else {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-121;
                                break L1;
                              }
                            }
                          }
                        }
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

    private se() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != -37) {
            se.a((byte) 121);
        }
        field_m = null;
        field_a = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please log in to access this feature.";
        field_e = "Send private Quick Chat to <%0>";
        field_c = "You have signed a Non-Aggression Pact with <%0>.";
    }
}
