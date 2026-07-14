/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((gi) this).field_i[var2] = (byte) 0;
        }
        ((gi) this).field_g = 0;
        ((gi) this).field_h[0] = (byte)param0;
        ((gi) this).field_d = 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            ((gi) this).field_k[var2] = 0L;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 8) {
            Object var2 = null;
            sj discarded$0 = gi.a(-67, (hb) null);
        }
        field_e = null;
        field_l = null;
    }

    final static sj a(int param0, hb param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param1.f(8, 8);
        if (0 >= var2) {
          if (param0 <= -43) {
            L0: {
              var3 = vg.a(89, param1) ? 1 : 0;
              var4 = vg.a(91, param1) ? 1 : 0;
              var5 = new sj();
              var5.field_e = (short)param1.f(8, 16);
              var5.field_O = nf.a(false, param1, 16, var5.field_O);
              var5.field_M = nf.a(false, param1, 16, var5.field_M);
              var5.field_z = nf.a(false, param1, 16, var5.field_z);
              var5.field_k = (short)param1.f(8, 16);
              var5.field_u = nf.a(false, param1, 16, var5.field_u);
              var5.field_L = nf.a(false, param1, 16, var5.field_L);
              var5.field_C = nf.a(false, param1, 16, var5.field_C);
              if (var3 != 0) {
                var5.field_r = (short)param1.f(8, 16);
                var5.field_y = nf.a(false, param1, 16, var5.field_y);
                var5.field_p = nf.a(false, param1, 16, var5.field_p);
                var5.field_K = nf.a(false, param1, 16, var5.field_K);
                var5.field_d = nf.a(false, param1, 16, var5.field_d);
                var5.field_n = nf.a(false, param1, 16, var5.field_n);
                var5.field_A = nf.a(false, param1, 16, var5.field_A);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var4 != 0) {
                int discarded$1 = param1.f(8, 16);
                var5.field_m = nf.a(false, param1, 16, var5.field_m);
                var5.field_h = nf.a(false, param1, 16, var5.field_h);
                var5.field_a = nf.a(false, param1, 16, var5.field_a);
                var5.field_I = nf.a(false, param1, 16, var5.field_I);
                var5.field_l = nf.a(false, param1, 16, var5.field_l);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!vg.a(74, param1)) {
                break L2;
              } else {
                var5.field_c = nf.a(false, param1, 16, var5.field_c);
                break L2;
              }
            }
            L3: {
              if (!vg.a(75, param1)) {
                break L3;
              } else {
                var5.field_N = kk.a(16, param1, var5.field_N, (byte) 99);
                var6 = 0;
                var7 = 0;
                L4: while (true) {
                  if (var5.field_N.length <= var7) {
                    if (-1 == (var6 ^ -1)) {
                      var5.field_N = null;
                      break L3;
                    } else {
                      var5.field_D = (byte)(var6 + 1);
                      break L3;
                    }
                  } else {
                    if (var6 < (var5.field_N[var7] & 255)) {
                      var6 = 255 & var5.field_N[var7];
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return var5;
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], 128 >>> ch.a(((gi) this).field_g, 7));
          ((gi) this).field_d = ((gi) this).field_d + 1;
          if (((gi) this).field_d > 32) {
            L1: while (true) {
              if (-65 >= (((gi) this).field_d ^ -1)) {
                this.a(16);
                ((gi) this).field_d = 0;
                break L0;
              } else {
                ((gi) this).field_d = ((gi) this).field_d + 1;
                ((gi) this).field_h[((gi) this).field_d] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (32 <= ((gi) this).field_d) {
            gl.a(((gi) this).field_i, 0, ((gi) this).field_h, 32, 32);
            this.a(16);
            var4 = 0;
            if (param1 == -70) {
              var5 = param0;
              L3: while (true) {
                if (-9 >= (var4 ^ -1)) {
                  return;
                } else {
                  var6 = ((gi) this).field_k[var4];
                  param2[var5] = (byte)(int)(var6 >>> 2035938616);
                  param2[1 + var5] = (byte)(int)(var6 >>> -1782182928);
                  param2[2 + var5] = (byte)(int)(var6 >>> 955900712);
                  param2[var5 + 3] = (byte)(int)(var6 >>> 2141970336);
                  param2[4 + var5] = (byte)(int)(var6 >>> -1439427048);
                  param2[var5 - -5] = (byte)(int)(var6 >>> 1621561616);
                  param2[var5 - -6] = (byte)(int)(var6 >>> 1119480776);
                  param2[var5 - -7] = (byte)(int)var6;
                  var4++;
                  var5 += 8;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            ((gi) this).field_d = ((gi) this).field_d + 1;
            ((gi) this).field_h[((gi) this).field_d] = (byte) 0;
            continue L2;
          }
        }
    }

    final static void a(byte param0, String param1, String param2) {
        ff.a(false, -109, param2, param1);
        if (param0 < 35) {
            Object var4 = null;
            sj discarded$0 = gi.a(-117, (hb) null);
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = 0;
        var6 = 8 + -((int)param0 & 7) & 7;
        var7 = 7 & ((gi) this).field_g;
        if (param1 < -51) {
          var9 = param0;
          var11 = 31;
          var12 = 0;
          L0: while (true) {
            if (-1 < (var11 ^ -1)) {
              L1: while (true) {
                if (8L >= param0) {
                  L2: {
                    if ((param0 ^ -1L) >= -1L) {
                      var8 = 0;
                      break L2;
                    } else {
                      var8 = param2[var5] << var6 & 255;
                      ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], var8 >>> var7);
                      break L2;
                    }
                  }
                  L3: {
                    if ((param0 + (long)var7 ^ -1L) <= -9L) {
                      L4: {
                        ((gi) this).field_g = ((gi) this).field_g + (-var7 + 8);
                        param0 = param0 - (long)(8 - var7);
                        ((gi) this).field_d = ((gi) this).field_d + 1;
                        if (-513 != (((gi) this).field_g ^ -1)) {
                          break L4;
                        } else {
                          this.a(16);
                          ((gi) this).field_g = 0;
                          ((gi) this).field_d = 0;
                          break L4;
                        }
                      }
                      ((gi) this).field_h[((gi) this).field_d] = (byte)ch.a(var8 << 8 + -var7, 255);
                      ((gi) this).field_g = ((gi) this).field_g + (int)param0;
                      break L3;
                    } else {
                      ((gi) this).field_g = (int)((long)((gi) this).field_g + param0);
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    var8 = param2[var5] << var6 & 255 | (param2[var5 - -1] & 255) >>> -var6 + 8;
                    if (0 > var8) {
                      break L5;
                    } else {
                      if (var8 >= 256) {
                        break L5;
                      } else {
                        L6: {
                          ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], var8 >>> var7);
                          ((gi) this).field_d = ((gi) this).field_d + 1;
                          ((gi) this).field_g = ((gi) this).field_g + (8 - var7);
                          if (512 == ((gi) this).field_g) {
                            this.a(16);
                            ((gi) this).field_d = 0;
                            ((gi) this).field_g = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((gi) this).field_h[((gi) this).field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
                        param0 = param0 - 8L;
                        var5++;
                        ((gi) this).field_g = ((gi) this).field_g + var7;
                        continue L1;
                      }
                    }
                  }
                  throw new RuntimeException("LOGIC ERROR");
                }
              }
            } else {
              var12 = var12 + ((((gi) this).field_i[var11] & 255) - -(255 & (int)var9));
              ((gi) this).field_i[var11] = (byte)var12;
              var12 = var12 >>> 8;
              var9 = var9 >>> 8;
              var11--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > var2) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        L4: {
                          if (param0 == 16) {
                            break L4;
                          } else {
                            var7 = null;
                            sj discarded$1 = gi.a(-34, (hb) null);
                            break L4;
                          }
                        }
                        return;
                      } else {
                        ((gi) this).field_k[var2] = hd.a(((gi) this).field_k[var2], hd.a(((gi) this).field_n[var2], ((gi) this).field_m[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (-9 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((gi) this).field_f[0] = hd.a(((gi) this).field_f[0], nc.field_g[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((gi) this).field_m[var3] = ((gi) this).field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((gi) this).field_b[var3] = ((gi) this).field_f[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var8 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((gi) this).field_b[var3] = hd.a(((gi) this).field_b[var3], nc.field_d[var8][ch.a(255, (int)(((gi) this).field_m[ch.a(7, var3 - var8)] >>> var5))]);
                                    var8++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((gi) this).field_f[var3] = ((gi) this).field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((gi) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            ((gi) this).field_b[var3] = hd.a(((gi) this).field_b[var3], nc.field_d[var4][ch.a((int)(((gi) this).field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
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
                ((gi) this).field_f[var2] = ((gi) this).field_k[var2];
                ((gi) this).field_m[var2] = hd.a(((gi) this).field_n[var2], ((gi) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((gi) this).field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)((gi) this).field_h[var3 - -5], 255L) << -1933703344, hd.a(hd.a(sk.a((long)((gi) this).field_h[3 + var3] << -1861031328, 1095216660480L), hd.a(hd.a(sk.a((long)((gi) this).field_h[1 + var3] << 804360944, 71776119061217280L), (long)((gi) this).field_h[var3] << 744230520), sk.a((long)((gi) this).field_h[var3 + 2] << 867267688, 280375465082880L))), sk.a((long)((gi) this).field_h[var3 + 4], 255L) << 925766488)), sk.a((long)((gi) this).field_h[var3 - -6], 255L) << 1475049800), sk.a((long)((gi) this).field_h[var3 + 7], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    gi() {
        ((gi) this).field_k = new long[8];
        ((gi) this).field_f = new long[8];
        ((gi) this).field_i = new byte[32];
        ((gi) this).field_b = new long[8];
        ((gi) this).field_d = 0;
        ((gi) this).field_n = new long[8];
        ((gi) this).field_h = new byte[64];
        ((gi) this).field_m = new long[8];
        ((gi) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = new pj();
    }
}
