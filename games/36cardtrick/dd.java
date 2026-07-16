/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private int field_a;
    static String field_h;
    private long[] field_c;
    private long[] field_f;
    private byte[] field_k;
    static int[] field_j;
    private long[] field_l;
    private long[] field_d;
    private long[] field_i;
    static String field_e;
    private byte[] field_g;
    private int field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        if (param0) {
            dd.a(false);
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        var2 = param0.length();
        var3 = new byte[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            L1: {
              if (param1 <= -29) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param0.charAt(var4);
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
                    if (var5 != 402) {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 != 8224) {
                            if (8225 != var5) {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (8249 == var5) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (338 == var5) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (var5 != 381) {
                                          if (8216 == var5) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (8220 != var5) {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (8226 != var5) {
                                                    if (var5 != 8211) {
                                                      if (var5 != 8212) {
                                                        if (var5 != 732) {
                                                          if (var5 != 8482) {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8250) {
                                                                if (339 != var5) {
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
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
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
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      }
                                    }
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
                        }
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
            continue L0;
          }
        }
    }

    final void a(long param0, byte param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Main.field_T;
        var5 = 0;
        var6 = 8 + -((int)param0 & 7) & 7;
        var7 = ((dd) this).field_b & 7;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (-1 < (var11 ^ -1)) {
            L1: {
              if (param1 > 109) {
                break L1;
              } else {
                ((dd) this).field_k = null;
                break L1;
              }
            }
            L2: while (true) {
              if ((param0 ^ -1L) >= -9L) {
                L3: {
                  if (0L >= param0) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = 255 & param2[var5] << var6;
                    ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (-9L < ((long)var7 + param0 ^ -1L)) {
                    ((dd) this).field_b = (int)((long)((dd) this).field_b + param0);
                    break L4;
                  } else {
                    L5: {
                      ((dd) this).field_a = ((dd) this).field_a + 1;
                      param0 = param0 - (long)(-var7 + 8);
                      ((dd) this).field_b = ((dd) this).field_b + (8 + -var7);
                      if (((dd) this).field_b == 512) {
                        this.a(-9);
                        ((dd) this).field_b = 0;
                        ((dd) this).field_a = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((dd) this).field_k[((dd) this).field_a] = (byte)bc.a(var8 << -var7 + 8, 255);
                    ((dd) this).field_b = ((dd) this).field_b + (int)param0;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param2[var5] << var6 & 255 | (255 & param2[var5 + 1]) >>> 8 - var6;
                  if (0 > var8) {
                    break L6;
                  } else {
                    if (256 > var8) {
                      L7: {
                        ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], var8 >>> var7);
                        ((dd) this).field_b = ((dd) this).field_b + (-var7 + 8);
                        ((dd) this).field_a = ((dd) this).field_a + 1;
                        if (512 != ((dd) this).field_b) {
                          break L7;
                        } else {
                          this.a(-9);
                          ((dd) this).field_b = 0;
                          ((dd) this).field_a = 0;
                          break L7;
                        }
                      }
                      ((dd) this).field_k[((dd) this).field_a] = (byte)bc.a(var8 << 8 + -var7, 255);
                      var5++;
                      param0 = param0 - 8L;
                      ((dd) this).field_b = ((dd) this).field_b + var7;
                      continue L2;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & (int)var9) + (((dd) this).field_g[var11] & 255));
            ((dd) this).field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Main.field_T;
          ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], 128 >>> bc.a(((dd) this).field_b, 7));
          ((dd) this).field_a = ((dd) this).field_a + 1;
          if ((((dd) this).field_a ^ -1) >= -33) {
            break L0;
          } else {
            L1: while (true) {
              if ((((dd) this).field_a ^ -1) <= -65) {
                this.a(-9);
                ((dd) this).field_a = 0;
                break L0;
              } else {
                int fieldTemp$2 = ((dd) this).field_a;
                ((dd) this).field_a = ((dd) this).field_a + 1;
                ((dd) this).field_k[fieldTemp$2] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if ((((dd) this).field_a ^ -1) <= -33) {
            L3: {
              if (param0 == 5319) {
                break L3;
              } else {
                ((dd) this).field_a = 123;
                break L3;
              }
            }
            og.a(((dd) this).field_g, 0, ((dd) this).field_k, 32, 32);
            this.a(-9);
            var4 = 0;
            var5 = param2;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((dd) this).field_f[var4];
                param1[var5] = (byte)(int)(var6 >>> -1470702280);
                param1[var5 + 1] = (byte)(int)(var6 >>> 994269424);
                param1[2 + var5] = (byte)(int)(var6 >>> -740679000);
                param1[3 + var5] = (byte)(int)(var6 >>> 1132640160);
                param1[var5 + 4] = (byte)(int)(var6 >>> 1826499608);
                param1[var5 - -5] = (byte)(int)(var6 >>> 1667586768);
                param1[var5 - -6] = (byte)(int)(var6 >>> 1930037384);
                param1[var5 + 7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((dd) this).field_a;
            ((dd) this).field_a = ((dd) this).field_a + 1;
            ((dd) this).field_k[fieldTemp$3] = (byte) 0;
            continue L2;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((dd) this).field_g[var2] = (byte) 0;
        }
        ((dd) this).field_b = 0;
        ((dd) this).field_k[0] = (byte) 0;
        ((dd) this).field_a = 0;
        if (param0 <= 20) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((dd) this).field_f[var2] = 0L;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Main.field_T;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      if (param0 == -9) {
                        break L3;
                      } else {
                        this.a(-54);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((dd) this).field_f[var2] = ji.a(((dd) this).field_f[var2], ji.a(((dd) this).field_i[var2], ((dd) this).field_d[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((dd) this).field_c[0] = ji.a(((dd) this).field_c[0], hj.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((dd) this).field_i[var3] = ((dd) this).field_l[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((dd) this).field_l[var3] = ((dd) this).field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((dd) this).field_l[var3] = ji.a(((dd) this).field_l[var3], hj.field_k[var7][bc.a((int)(((dd) this).field_i[bc.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((dd) this).field_c[var3] = ((dd) this).field_l[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((dd) this).field_l[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            ((dd) this).field_l[var3] = ji.a(((dd) this).field_l[var3], hj.field_k[var4][bc.a((int)(((dd) this).field_c[bc.a(var3 + -var4, 7)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((dd) this).field_c[var2] = ((dd) this).field_f[var2];
                ((dd) this).field_i[var2] = ji.a(((dd) this).field_d[var2], ((dd) this).field_f[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((dd) this).field_d[var2] = ji.a(rl.a(255L, (long)((dd) this).field_k[var3 + 7]), ji.a(rl.a((long)((dd) this).field_k[6 + var3], 255L) << 1105995912, ji.a(ji.a(rl.a(4278190080L, (long)((dd) this).field_k[var3 - -4] << -310685864), ji.a(ji.a(ji.a((long)((dd) this).field_k[var3] << -1879877960, rl.a(71776119061217280L, (long)((dd) this).field_k[var3 + 1] << -573494096)), rl.a(255L, (long)((dd) this).field_k[var3 - -2]) << 760124456), rl.a(255L, (long)((dd) this).field_k[3 + var3]) << -2014514080)), rl.a((long)((dd) this).field_k[var3 + 5] << -1129270256, 16711680L))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    dd() {
        ((dd) this).field_f = new long[8];
        ((dd) this).field_a = 0;
        ((dd) this).field_k = new byte[64];
        ((dd) this).field_d = new long[8];
        ((dd) this).field_i = new long[8];
        ((dd) this).field_c = new long[8];
        ((dd) this).field_g = new byte[32];
        ((dd) this).field_b = 0;
        ((dd) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = "Login/Create Account";
    }
}
