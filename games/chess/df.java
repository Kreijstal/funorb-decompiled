/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    private long[] field_h;
    static km field_e;
    private int field_b;
    private long[] field_d;
    private long[] field_l;
    static int[] field_i;
    private int field_a;
    static String field_k;
    private long[] field_m;
    static String field_c;
    private long[] field_g;
    private byte[] field_j;
    private byte[] field_f;

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_e = null;
        if (param0 != -6) {
            df.b(-105);
        }
        field_c = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Chess.field_G;
        var2 = param0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((df) this).field_d[var2] = la.a(((df) this).field_d[var2], la.a(((df) this).field_m[var2], ((df) this).field_h[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L5: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((df) this).field_g[0] = la.a(((df) this).field_g[0], od.field_N[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((df) this).field_h[var3] = ((df) this).field_l[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((df) this).field_l[var3] = ((df) this).field_g[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((df) this).field_l[var3] = la.a(((df) this).field_l[var3], od.field_O[var7][ce.a((int)(((df) this).field_h[ce.a(-var7 + var3, 7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((df) this).field_g[var3] = ((df) this).field_l[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((df) this).field_l[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L4;
                          } else {
                            ((df) this).field_l[var3] = la.a(((df) this).field_l[var3], od.field_O[var4][ce.a(255, (int)(((df) this).field_g[ce.a(-var4 + var3, 7)] >>> var5))]);
                            var4++;
                            var5 -= 8;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((df) this).field_g[var2] = ((df) this).field_d[var2];
                ((df) this).field_h[var2] = la.a(((df) this).field_m[var2], ((df) this).field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((df) this).field_m[var2] = la.a(la.a(la.a(la.a(cd.a(4278190080L, (long)((df) this).field_j[4 + var3] << 1825899928), la.a(cd.a(1095216660480L, (long)((df) this).field_j[var3 + 3] << -1428670560), la.a(la.a(cd.a(71776119061217280L, (long)((df) this).field_j[1 + var3] << 1316018352), (long)((df) this).field_j[var3] << -30309576), cd.a(280375465082880L, (long)((df) this).field_j[2 + var3] << 1461101480)))), cd.a((long)((df) this).field_j[var3 - -5], 255L) << 1588324688), cd.a((long)((df) this).field_j[var3 - -6], 255L) << -1158673336), cd.a(255L, (long)((df) this).field_j[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(eb param0, int param1) {
        if (!(null == param0.field_q)) {
            param0.field_q = param0.field_q.toUpperCase();
        }
        param0.field_I = 1;
        param0.field_M = 1;
        param0.field_w = 2;
        param0.field_H = -2147483647;
        param0.field_c = 24;
        param0.field_J = (lh) (Object) jj.field_b;
        param0.field_B = -1;
        param0.field_K = 2;
        param0.field_r = 1;
        if (param1 != 0) {
            df.a((byte) -26);
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Chess.field_G;
          ((df) this).field_j[((df) this).field_b] = (byte)s.a((int) ((df) this).field_j[((df) this).field_b], 128 >>> ce.a(((df) this).field_a, 7));
          ((df) this).field_b = ((df) this).field_b + 1;
          if (param0 < -82) {
            break L0;
          } else {
            ((df) this).field_l = null;
            break L0;
          }
        }
        L1: {
          if (((df) this).field_b < -33) {
            L2: while (true) {
              if (-65 <= ((df) this).field_b) {
                this.c(0);
                ((df) this).field_b = 0;
                break L1;
              } else {
                ((df) this).field_b = ((df) this).field_b + 1;
                ((df) this).field_j[((df) this).field_b] = (byte) 0;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: while (true) {
          if (-33 >= (((df) this).field_b ^ -1)) {
            ne.a(((df) this).field_f, 0, ((df) this).field_j, 32, 32);
            this.c(0);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((df) this).field_d[var4];
                param2[var5] = (byte)(int)(var6 >>> -253295432);
                param2[var5 + 1] = (byte)(int)(var6 >>> -321924560);
                param2[var5 - -2] = (byte)(int)(var6 >>> -1226763736);
                param2[var5 - -3] = (byte)(int)(var6 >>> -1654222240);
                param2[4 + var5] = (byte)(int)(var6 >>> 1213923032);
                param2[var5 + 5] = (byte)(int)(var6 >>> -815420656);
                param2[6 + var5] = (byte)(int)(var6 >>> -173081144);
                param2[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((df) this).field_b = ((df) this).field_b + 1;
            ((df) this).field_j[((df) this).field_b] = (byte) 0;
            continue L3;
          }
        }
    }

    final static void a(byte param0) {
        L0: {
          sa.a(new int[1], 342, 27, 410, 6, 297, 27690);
          if (param0 == 102) {
            break L0;
          } else {
            df.a((byte) 124);
            break L0;
          }
        }
        L1: {
          ae.field_e[6] = new aa(6);
          sa.a(new int[2], 440, 27, 410, 4, 200, 27690);
          ae.field_e[4] = new aa(4);
          if (!vi.a(-3)) {
            sa.a(new int[7], 455, 27, 190, 1, 185, 27690);
            ae.field_e[1] = new aa(1);
            sa.a(new int[9], 455, 27, 190, 2, 185, 27690);
            ae.field_e[2] = new aa(2);
            sa.a(new int[7], 455, 27, 190, 11, 185, 27690);
            ae.field_e[11] = new aa(11);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(byte param0, byte[] param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Chess.field_G;
        var5 = 0;
        var6 = 7 & -(7 & (int)param2) + 8;
        var7 = 7 & ((df) this).field_a;
        var9 = param2;
        var11 = 31;
        var13 = -80 / ((12 - param0) / 55);
        var12 = 0;
        L0: while (true) {
          if ((var11 ^ -1) > -1) {
            L1: while (true) {
              if (8L >= param2) {
                L2: {
                  if (-1L > (param2 ^ -1L)) {
                    var8 = 255 & param1[var5] << var6;
                    ((df) this).field_j[((df) this).field_b] = (byte)s.a((int) ((df) this).field_j[((df) this).field_b], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if ((param2 + (long)var7 ^ -1L) <= -9L) {
                    L4: {
                      ((df) this).field_a = ((df) this).field_a + (8 + -var7);
                      param2 = param2 - (long)(-var7 + 8);
                      ((df) this).field_b = ((df) this).field_b + 1;
                      if ((((df) this).field_a ^ -1) == -513) {
                        this.c(0);
                        ((df) this).field_b = 0;
                        ((df) this).field_a = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((df) this).field_j[((df) this).field_b] = (byte)ce.a(255, var8 << -var7 + 8);
                    ((df) this).field_a = ((df) this).field_a + (int)param2;
                    break L3;
                  } else {
                    ((df) this).field_a = (int)((long)((df) this).field_a + param2);
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = param1[var5] << var6 & 255 | (param1[1 + var5] & 255) >>> 8 - var6;
                  if (var8 < 0) {
                    break L5;
                  } else {
                    if (-257 < (var8 ^ -1)) {
                      L6: {
                        ((df) this).field_j[((df) this).field_b] = (byte)s.a((int) ((df) this).field_j[((df) this).field_b], var8 >>> var7);
                        ((df) this).field_b = ((df) this).field_b + 1;
                        ((df) this).field_a = ((df) this).field_a + (8 + -var7);
                        if (-513 != (((df) this).field_a ^ -1)) {
                          break L6;
                        } else {
                          this.c(0);
                          ((df) this).field_b = 0;
                          ((df) this).field_a = 0;
                          break L6;
                        }
                      }
                      ((df) this).field_j[((df) this).field_b] = (byte)ce.a(var8 << -var7 + 8, 255);
                      param2 = param2 - 8L;
                      ((df) this).field_a = ((df) this).field_a + var7;
                      var5++;
                      continue L1;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & (int)var9) + (255 & ((df) this).field_f[var11]));
            ((df) this).field_f[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            df.b(43);
        }
        pg.a((byte) -18, ng.field_c);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        if (param0 < 51) {
            this.c(88);
        }
        for (var2 = 0; 32 > var2; var2++) {
            ((df) this).field_f[var2] = (byte) 0;
        }
        ((df) this).field_a = 0;
        ((df) this).field_j[0] = (byte) 0;
        ((df) this).field_b = 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            ((df) this).field_d[var2] = 0L;
        }
    }

    df() {
        ((df) this).field_l = new long[8];
        ((df) this).field_h = new long[8];
        ((df) this).field_d = new long[8];
        ((df) this).field_a = 0;
        ((df) this).field_m = new long[8];
        ((df) this).field_b = 0;
        ((df) this).field_j = new byte[64];
        ((df) this).field_g = new long[8];
        ((df) this).field_f = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{4, 2, 3, 5, 6, 3, 2, 4, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4097, 4097, 4097, 4097, 4097, 4097, 4097, 4097, 4100, 4098, 4099, 4101, 4102, 4099, 4098, 4100};
        field_c = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_k = "Don't mind";
    }
}
