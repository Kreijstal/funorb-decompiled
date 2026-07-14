/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_f;
    private int field_b;
    private long[] field_e;
    private byte[] field_j;
    private long[] field_i;
    private int field_c;
    private long[] field_k;
    private long[] field_d;
    private byte[] field_h;
    private long[] field_a;
    static String field_g;

    final void a(long param0, byte[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = EscapeVector.field_A;
          var5 = 0;
          if (param2 == 2) {
            break L0;
          } else {
            var14 = null;
            ((lj) this).a(5, (byte[]) null, true);
            break L0;
          }
        }
        var6 = 7 & -(7 & (int)param0) + 8;
        var7 = 7 & ((lj) this).field_c;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (0 > var11) {
            L2: while (true) {
              if (param0 <= 8L) {
                L3: {
                  if (0L < param0) {
                    var8 = 255 & param1[var5] << var6;
                    ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (8L > param0 + (long)var7) {
                    ((lj) this).field_c = (int)((long)((lj) this).field_c + param0);
                    break L4;
                  } else {
                    L5: {
                      ((lj) this).field_c = ((lj) this).field_c + (-var7 + 8);
                      ((lj) this).field_b = ((lj) this).field_b + 1;
                      param0 = param0 - (long)(8 - var7);
                      if ((((lj) this).field_c ^ -1) == -513) {
                        this.a((byte) -34);
                        ((lj) this).field_c = 0;
                        ((lj) this).field_b = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((lj) this).field_h[((lj) this).field_b] = (byte)ae.a(var8 << 8 + -var7, 255);
                    ((lj) this).field_c = ((lj) this).field_c + (int)param0;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param1[var5] << var6 | (255 & param1[1 + var5]) >>> -var6 + 8;
                  if ((var8 ^ -1) > -1) {
                    break L6;
                  } else {
                    if ((var8 ^ -1) > -257) {
                      L7: {
                        ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], var8 >>> var7);
                        ((lj) this).field_b = ((lj) this).field_b + 1;
                        ((lj) this).field_c = ((lj) this).field_c + (8 - var7);
                        if ((((lj) this).field_c ^ -1) != -513) {
                          break L7;
                        } else {
                          this.a((byte) -41);
                          ((lj) this).field_c = 0;
                          ((lj) this).field_b = 0;
                          break L7;
                        }
                      }
                      ((lj) this).field_h[((lj) this).field_b] = (byte)ae.a(255, var8 << -var7 + 8);
                      param0 = param0 - 8L;
                      ((lj) this).field_c = ((lj) this).field_c + var7;
                      var5++;
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
            var12 = var12 + ((255 & (int)var9) + (((lj) this).field_j[var11] & 255));
            ((lj) this).field_j[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = 69;
        }
        field_g = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((lj) this).field_j[var2] = (byte) 0;
        }
        ((lj) this).field_b = 0;
        ((lj) this).field_h[0] = (byte) 0;
        ((lj) this).field_c = 0;
        var2 = 0;
        if (param0) {
            ((lj) this).field_d = null;
        }
        while (var2 < 8) {
            ((lj) this).field_k[var2] = 0L;
            var2++;
        }
    }

    final static void a(int param0, int param1) {
        rf.field_a = param0;
        if (param1 <= 11) {
            lj.a(false);
        }
    }

    final void a(int param0, byte[] param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = EscapeVector.field_A;
          ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], 128 >>> ae.a(((lj) this).field_c, 7));
          ((lj) this).field_b = ((lj) this).field_b + 1;
          if (32 >= ((lj) this).field_b) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 >= (((lj) this).field_b ^ -1)) {
                this.a((byte) -75);
                ((lj) this).field_b = 0;
                break L0;
              } else {
                ((lj) this).field_b = ((lj) this).field_b + 1;
                ((lj) this).field_h[((lj) this).field_b] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((lj) this).field_b) {
            L3: {
              qg.a(((lj) this).field_j, 0, ((lj) this).field_h, 32, 32);
              if (!param2) {
                break L3;
              } else {
                var9 = null;
                ((lj) this).a(105L, (byte[]) null, -56);
                break L3;
              }
            }
            this.a((byte) -95);
            var4 = 0;
            var5 = param0;
            L4: while (true) {
              if (-9 >= (var4 ^ -1)) {
                return;
              } else {
                var6 = ((lj) this).field_k[var4];
                param1[var5] = (byte)(int)(var6 >>> 1006213304);
                param1[var5 + 1] = (byte)(int)(var6 >>> 1116021744);
                param1[var5 + 2] = (byte)(int)(var6 >>> 1769835304);
                param1[var5 - -3] = (byte)(int)(var6 >>> -1338657696);
                param1[4 + var5] = (byte)(int)(var6 >>> -462703656);
                param1[5 + var5] = (byte)(int)(var6 >>> -493562480);
                param1[6 + var5] = (byte)(int)(var6 >>> 137514248);
                param1[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((lj) this).field_b = ((lj) this).field_b + 1;
            ((lj) this).field_h[((lj) this).field_b] = (byte) 0;
            continue L2;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                L2: {
                  if (param0 <= -22) {
                    break L2;
                  } else {
                    ((lj) this).field_i = null;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((lj) this).field_k[var2] = ja.a(((lj) this).field_k[var2], ja.a(((lj) this).field_i[var2], ((lj) this).field_d[var2]));
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
                            ((lj) this).field_e[0] = ja.a(((lj) this).field_e[0], tm.field_ab[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((lj) this).field_d[var3] = ((lj) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((lj) this).field_a[var3] = ((lj) this).field_e[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((lj) this).field_a[var3] = ja.a(((lj) this).field_a[var3], tm.field_db[var7][ae.a((int)(((lj) this).field_d[ae.a(var3 + -var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((lj) this).field_e[var3] = ((lj) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((lj) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((lj) this).field_a[var3] = ja.a(((lj) this).field_a[var3], tm.field_db[var4][ae.a((int)(((lj) this).field_e[ae.a(7, var3 + -var4)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((lj) this).field_e[var2] = ((lj) this).field_k[var2];
                ((lj) this).field_d[var2] = ja.a(((lj) this).field_i[var2], ((lj) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((lj) this).field_i[var2] = ja.a(ja.a(fn.a((long)((lj) this).field_h[6 + var3] << 2093809544, 65280L), ja.a(fn.a(16711680L, (long)((lj) this).field_h[5 + var3] << -1493128304), ja.a(fn.a(255L, (long)((lj) this).field_h[var3 - -4]) << 1919214424, ja.a(fn.a(255L, (long)((lj) this).field_h[3 + var3]) << 355605984, ja.a(fn.a(255L, (long)((lj) this).field_h[2 + var3]) << 1960665000, ja.a(fn.a(71776119061217280L, (long)((lj) this).field_h[var3 + 1] << 241768752), (long)((lj) this).field_h[var3] << 1346548664)))))), fn.a((long)((lj) this).field_h[7 + var3], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    lj() {
        ((lj) this).field_e = new long[8];
        ((lj) this).field_k = new long[8];
        ((lj) this).field_j = new byte[32];
        ((lj) this).field_c = 0;
        ((lj) this).field_i = new long[8];
        ((lj) this).field_b = 0;
        ((lj) this).field_h = new byte[64];
        ((lj) this).field_d = new long[8];
        ((lj) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_g = "Change display name";
    }
}
