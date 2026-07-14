/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static lg field_m;
    static volatile int field_f;
    static int field_i;
    static int[] field_h;
    static int field_c;
    static int field_g;
    static wk[] field_e;
    static String field_a;
    static ql field_j;
    static String field_d;
    String[] field_b;
    static int field_l;
    static pn field_k;

    final static boolean a(int param0) {
        if (param0 > -97) {
            return true;
        }
        return 250 < vn.field_h ? true : false;
    }

    final static void a(boolean param0) {
        wc.field_f = null;
        if (param0) {
            field_c = -88;
        }
        ll.field_j = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          var2 = param1.length();
          var3 = new byte[var2];
          if (param0 <= -12) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (128 > var5) {
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
                    if (255 >= var5) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (8364 != var5) {
                  if (8218 != var5) {
                    if (var5 != 402) {
                      if (var5 != 8222) {
                        if (var5 != 8230) {
                          if (var5 != 8224) {
                            if (8225 != var5) {
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (352 != var5) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (var5 == 8216) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (8217 == var5) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (var5 != 8221) {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (8212 != var5) {
                                                        if (var5 == 732) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
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
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
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
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              }
                                            }
                                          }
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
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L2;
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
    }

    public static void a(byte param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        field_d = null;
        field_k = null;
        if (param0 != -27) {
            field_j = null;
        }
        field_h = null;
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        uc.field_e[param6] = param2;
        uc.field_k[param6] = param3;
        if (param0 != -44) {
            field_e = null;
        }
        uc.field_d[param6] = param1;
        uc.field_c[param6] = param5;
        uc.field_f[param6] = param4;
    }

    private km() throws Throwable {
        throw new Error();
    }

    final static String a(int param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        nk var13 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        L0: {
          var10 = SteelSentinels.field_G;
          var13 = ul.a(param0, (byte) 67);
          if (param1 > 29) {
            break L0;
          } else {
            field_c = 12;
            break L0;
          }
        }
        L1: {
          var3 = var13.field_Q;
          if ((var3 ^ -1) == -3) {
            var3 = 0;
            L2: while (true) {
              if (n.field_z.length <= var3) {
                break L1;
              } else {
                var4_int = n.field_z[var3];
                var22 = nl.a(var4_int, (byte) 127);
                var6 = 0;
                L3: while (true) {
                  if (var22.length + -8 <= var6) {
                    var3++;
                    continue L2;
                  } else {
                    if (var22[var6] != param0) {
                      var6++;
                      continue L3;
                    } else {
                      return db.a(si.field_F, -66, new String[1]);
                    }
                  }
                }
              }
            }
          } else {
            L4: {
              if (4 == var3) {
                break L4;
              } else {
                if (var3 == 2048) {
                  break L4;
                } else {
                  if ((var3 ^ -1) == -9) {
                    var3 = 0;
                    var4_int = 0;
                    L5: while (true) {
                      if (var4_int >= n.field_z.length) {
                        var4 = lj.field_g[0];
                        var5 = 0;
                        var6 = 0;
                        L6: while (true) {
                          if (var6 < n.field_z.length) {
                            var7 = n.field_z[var6];
                            var25 = nl.a(var7, (byte) 123);
                            var9 = 0;
                            L7: while (true) {
                              if (-8 + var25.length > var9) {
                                if (var25[var9] != param0) {
                                  var9++;
                                  continue L7;
                                } else {
                                  var5++;
                                  if (var5 >= var3 - 1) {
                                    if (-1 + var3 != var5) {
                                      if (-2 <= (var3 ^ -1)) {
                                        return var4_ref + cd.field_c[var6] + lj.field_g[3];
                                      } else {
                                        return var4_ref + cd.field_c[var6] + lj.field_g[4];
                                      }
                                    } else {
                                      var4_ref = var4_ref + cd.field_c[var6] + lj.field_g[2];
                                      var6++;
                                      continue L6;
                                    }
                                  } else {
                                    var4_ref = var4 + cd.field_c[var6] + lj.field_g[1];
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var6++;
                                continue L6;
                              }
                            }
                          } else {
                            return null;
                          }
                        }
                      } else {
                        var5 = n.field_z[var4_int];
                        var24 = nl.a(var5, (byte) 124);
                        var7 = 0;
                        L8: while (true) {
                          if (var7 < -8 + var24.length) {
                            if (var24[var7] == param0) {
                              var3++;
                              var4_int++;
                              continue L5;
                            } else {
                              var7++;
                              continue L8;
                            }
                          } else {
                            var4_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            var3 = 0;
            L9: while (true) {
              if (n.field_z.length <= var3) {
                break L1;
              } else {
                var4_int = n.field_z[var3];
                var23 = nl.a(var4_int, (byte) 126);
                var6 = 0;
                L10: while (true) {
                  if (-8 + var23.length <= var6) {
                    var3++;
                    continue L9;
                  } else {
                    if (var23[var6] != param0) {
                      var6++;
                      continue L10;
                    } else {
                      return db.a(nj.field_T, -54, new String[1]);
                    }
                  }
                }
              }
            }
          }
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_h = new int[8192];
        field_d = "Withdraw request to join <%0>'s game";
        field_a = null;
        field_f = 0;
    }
}
