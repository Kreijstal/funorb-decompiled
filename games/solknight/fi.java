/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private long[] field_d;
    private byte[] field_g;
    private long[] field_h;
    private long[] field_b;
    static String field_j;
    static o[] field_a;
    private byte[] field_e;
    private long[] field_i;
    private long[] field_k;
    private int field_f;
    private int field_c;

    final static void a(sd param0, int param1, int param2) {
        if (param2 != -24045) {
            o[] discarded$0 = fi.b(101);
        }
        jd var3 = id.field_c;
        var3.e(param1, param2 + -2147459603);
        var3.c(1, 5);
        var3.c(-113, 0);
        var3.a(true, param0.field_o);
        var3.c(50, param0.field_k);
        var3.c(param2 ^ -24018, param0.field_l);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        uj.a(param4, param5, param2, h.field_d, param6, 2);
        uj.a(param3, param0, (param4 - param3 >> -309134335) + param2, of.field_b, param6 - (param0 + -18 >> 2135951233), 2);
        th.field_H.d((param4 + -param3 >> -277449695) + param2 + -20, -10 + param6);
        uk.field_k.d(-18 + param3 + ((-param3 + param4 >> -1231169183) + param2), param6 - 10);
        if (!param1) {
            fi.a(-46);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    L3: {
                      if (param0 == 24843) {
                        break L3;
                      } else {
                        field_j = null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((fi) this).field_d[var2] = ke.a(((fi) this).field_d[var2], ke.a(((fi) this).field_i[var2], ((fi) this).field_k[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            ((fi) this).field_b[0] = ke.a(((fi) this).field_b[0], ie.field_g[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((fi) this).field_i[var3] = ((fi) this).field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fi) this).field_h[var3] = ((fi) this).field_b[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fi) this).field_h[var3] = ke.a(((fi) this).field_h[var3], ie.field_c[var7][fi.a(255, (int)(((fi) this).field_i[fi.a(7, -var7 + var3)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fi) this).field_b[var3] = ((fi) this).field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fi) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            ((fi) this).field_h[var3] = ke.a(((fi) this).field_h[var3], ie.field_c[var4][fi.a(255, (int)(((fi) this).field_b[fi.a(7, var3 + -var4)] >>> var5))]);
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
                ((fi) this).field_b[var2] = ((fi) this).field_d[var2];
                ((fi) this).field_i[var2] = ke.a(((fi) this).field_k[var2], ((fi) this).field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fi) this).field_k[var2] = ke.a(tk.a((long)((fi) this).field_g[var3 + 7], 255L), ke.a(tk.a((long)((fi) this).field_g[6 + var3] << -1358238136, 65280L), ke.a(tk.a((long)((fi) this).field_g[5 + var3], 255L) << -1353661168, ke.a(ke.a(tk.a(255L, (long)((fi) this).field_g[3 + var3]) << -1446647392, ke.a(ke.a((long)((fi) this).field_g[var3] << -795572616, tk.a((long)((fi) this).field_g[1 + var3], 255L) << 1743967536), tk.a((long)((fi) this).field_g[var3 - -2] << 350230440, 280375465082880L))), tk.a(255L, (long)((fi) this).field_g[4 + var3]) << 1456127320))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        if (param0 != -18120) {
            field_a = null;
        }
    }

    final static String a(byte param0) {
        if (param0 != 84) {
            return null;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return lf.field_e;
        }
        return ec.field_j;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((fi) this).field_e[var2] = (byte) 0;
        }
        if (param0 < 95) {
            fi.a(-125);
        }
        ((fi) this).field_f = 0;
        ((fi) this).field_c = 0;
        ((fi) this).field_g[0] = (byte) 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((fi) this).field_d[var2] = 0L;
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var5 = 0;
        var6 = -((int)param0 & 7) + 8 & 7;
        var7 = ((fi) this).field_f & 7;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (var11 < 0) {
            L1: while (true) {
              if (8L >= param0) {
                L2: {
                  if ((long)param2 >= param0) {
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = 255 & param1[var5] << var6;
                    ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], var8 >>> var7);
                    break L2;
                  }
                }
                L3: {
                  if ((param0 + (long)var7 ^ -1L) <= -9L) {
                    L4: {
                      ((fi) this).field_f = ((fi) this).field_f + (8 + -var7);
                      ((fi) this).field_c = ((fi) this).field_c + 1;
                      param0 = param0 - (long)(8 + -var7);
                      if (512 != ((fi) this).field_f) {
                        break L4;
                      } else {
                        this.c(24843);
                        ((fi) this).field_c = 0;
                        ((fi) this).field_f = 0;
                        break L4;
                      }
                    }
                    ((fi) this).field_g[((fi) this).field_c] = (byte)fi.a(var8 << -var7 + 8, 255);
                    ((fi) this).field_f = ((fi) this).field_f + (int)param0;
                    break L3;
                  } else {
                    ((fi) this).field_f = (int)((long)((fi) this).field_f + param0);
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param1[var5] << var6 | (param1[var5 - -1] & 255) >>> 8 - var6;
                  if (var8 < 0) {
                    break L5;
                  } else {
                    if (-257 < (var8 ^ -1)) {
                      L6: {
                        ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], var8 >>> var7);
                        ((fi) this).field_c = ((fi) this).field_c + 1;
                        ((fi) this).field_f = ((fi) this).field_f + (8 - var7);
                        if (((fi) this).field_f != 512) {
                          break L6;
                        } else {
                          this.c(24843);
                          ((fi) this).field_c = 0;
                          ((fi) this).field_f = 0;
                          break L6;
                        }
                      }
                      ((fi) this).field_g[((fi) this).field_c] = (byte)fi.a(255, var8 << -var7 + 8);
                      var5++;
                      ((fi) this).field_f = ((fi) this).field_f + var7;
                      param0 = param0 - 8L;
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
            var12 = var12 + ((255 & (int)var9) + (((fi) this).field_e[var11] & 255));
            ((fi) this).field_e[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final static o[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (param0 != 255) {
            return null;
        }
        o[] var1 = new o[nb.field_c];
        for (var2 = 0; nb.field_c > var2; var2++) {
            var3 = uj.field_b[var2] * sa.field_l[var2];
            var4 = jc.field_c[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ig.field_H[fi.a((int) var4[var6], 255)];
            }
            var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var5);
        }
        og.a((byte) -97);
        return var1;
    }

    fi() {
        ((fi) this).field_b = new long[8];
        ((fi) this).field_e = new byte[32];
        ((fi) this).field_i = new long[8];
        ((fi) this).field_k = new long[8];
        ((fi) this).field_g = new byte[64];
        ((fi) this).field_f = 0;
        ((fi) this).field_h = new long[8];
        ((fi) this).field_d = new long[8];
        ((fi) this).field_c = 0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], 128 >>> fi.a(7, ((fi) this).field_f));
          ((fi) this).field_c = ((fi) this).field_c + 1;
          if (param2 >= 106) {
            break L0;
          } else {
            var9 = null;
            ((fi) this).a((byte[]) null, 111, (byte) -30);
            break L0;
          }
        }
        L1: {
          if (((fi) this).field_c > 32) {
            L2: while (true) {
              if (64 <= ((fi) this).field_c) {
                this.c(24843);
                ((fi) this).field_c = 0;
                break L1;
              } else {
                int fieldTemp$2 = ((fi) this).field_c;
                ((fi) this).field_c = ((fi) this).field_c + 1;
                ((fi) this).field_g[fieldTemp$2] = (byte) 0;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: while (true) {
          if (((fi) this).field_c >= 32) {
            fk.a(((fi) this).field_e, 0, ((fi) this).field_g, 32, 32);
            this.c(24843);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((fi) this).field_d[var4];
                param0[var5] = (byte)(int)(var6 >>> -2093644040);
                param0[1 + var5] = (byte)(int)(var6 >>> -629523920);
                param0[2 + var5] = (byte)(int)(var6 >>> -1022155480);
                param0[3 + var5] = (byte)(int)(var6 >>> -1125435552);
                param0[var5 + 4] = (byte)(int)(var6 >>> -1744101736);
                param0[5 + var5] = (byte)(int)(var6 >>> 369595344);
                param0[6 + var5] = (byte)(int)(var6 >>> 298427400);
                param0[var5 + 7] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((fi) this).field_c;
            ((fi) this).field_c = ((fi) this).field_c + 1;
            ((fi) this).field_g[fieldTemp$3] = (byte) 0;
            continue L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
