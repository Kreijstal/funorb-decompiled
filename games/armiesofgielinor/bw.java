/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw {
    private long[] field_l;
    static int[][] field_m;
    private int field_c;
    private long[] field_k;
    private int field_d;
    private byte[] field_b;
    static int[] field_f;
    private long[] field_j;
    private long[] field_a;
    static je field_h;
    static boolean field_g;
    private long[] field_e;
    private byte[] field_i;

    final static void d(int param0) {
        int var2 = 0;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (rd.field_j.field_u) {
            if (0 == (1 << rd.field_j.field_q & rd.field_j.field_xb.field_i)) {
              if (-1 != (rd.field_j.field_xb.field_i ^ -1)) {
                il.field_t[12] = id.field_c;
                break L0;
              } else {
                if ((1 << rd.field_j.field_q | rd.field_j.field_hb) != (1 << rd.field_j.field_xb.field_W) + -1) {
                  il.field_t[12] = fa.field_e;
                  break L0;
                } else {
                  il.field_t[12] = ml.field_Nb;
                  break L0;
                }
              }
            } else {
              il.field_t[12] = ti.field_a;
              break L0;
            }
          } else {
            if (0 != (1 << rd.field_j.field_q & rd.field_j.field_xb.field_i)) {
              il.field_t[12] = is.field_c;
              break L0;
            } else {
              if (-1 != (rd.field_j.field_xb.field_i ^ -1)) {
                il.field_t[12] = lk.field_s;
                break L0;
              } else {
                if (-1 + (1 << rd.field_j.field_xb.field_W) != (1 << rd.field_j.field_q | rd.field_j.field_hb)) {
                  il.field_t[12] = db.field_h;
                  break L0;
                } else {
                  il.field_t[12] = ji.field_b;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == 7242) {
            break L1;
          } else {
            bw.a(119, -40, (byte) -61);
            break L1;
          }
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = 0;
          var6 = 8 + -((int)param1 & 7) & 7;
          var7 = 7 & ((bw) this).field_c;
          var9 = param1;
          if (param0 <= 0) {
            break L0;
          } else {
            bw.a(-47);
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (-1 < (var11 ^ -1)) {
            L2: while (true) {
              if (param1 <= 8L) {
                L3: {
                  if (-1L <= (param1 ^ -1L)) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param2[var5] << var6 & 255;
                    ((bw) this).field_i[((bw) this).field_d] = (byte)oe.c((int) ((bw) this).field_i[((bw) this).field_d], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (-9L >= (param1 + (long)var7 ^ -1L)) {
                    L5: {
                      ((bw) this).field_c = ((bw) this).field_c + (8 - var7);
                      param1 = param1 - (long)(8 + -var7);
                      ((bw) this).field_d = ((bw) this).field_d + 1;
                      if (-513 != (((bw) this).field_c ^ -1)) {
                        break L5;
                      } else {
                        this.c(-11);
                        ((bw) this).field_c = 0;
                        ((bw) this).field_d = 0;
                        break L5;
                      }
                    }
                    ((bw) this).field_i[((bw) this).field_d] = (byte)rn.a(255, var8 << -var7 + 8);
                    ((bw) this).field_c = ((bw) this).field_c + (int)param1;
                    break L4;
                  } else {
                    ((bw) this).field_c = (int)((long)((bw) this).field_c + param1);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param2[var5] << var6 & 255 | (255 & param2[1 + var5]) >>> -var6 + 8;
                  if (0 > var8) {
                    break L6;
                  } else {
                    if ((var8 ^ -1) > -257) {
                      L7: {
                        ((bw) this).field_i[((bw) this).field_d] = (byte)oe.c((int) ((bw) this).field_i[((bw) this).field_d], var8 >>> var7);
                        ((bw) this).field_d = ((bw) this).field_d + 1;
                        ((bw) this).field_c = ((bw) this).field_c + (8 - var7);
                        if (-513 != (((bw) this).field_c ^ -1)) {
                          break L7;
                        } else {
                          this.c(-11);
                          ((bw) this).field_c = 0;
                          ((bw) this).field_d = 0;
                          break L7;
                        }
                      }
                      ((bw) this).field_i[((bw) this).field_d] = (byte)rn.a(255, var8 << -var7 + 8);
                      var5++;
                      ((bw) this).field_c = ((bw) this).field_c + var7;
                      param1 = param1 - 8L;
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
            var12 = var12 + ((((bw) this).field_b[var11] & 255) - -(255 & (int)var9));
            ((bw) this).field_b[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        aj var4 = (aj) (Object) oj.field_r.e((byte) 110);
        while (var4 != null) {
            wr.a((byte) -71, var4, param1);
            var4 = (aj) (Object) oj.field_r.a((byte) 123);
        }
        wj var5 = (wj) (Object) lf.field_c.e((byte) 117);
        while (var5 != null) {
            gn.a(param1, var5, 0);
            var5 = (wj) (Object) lf.field_c.a((byte) 123);
        }
        if (param0 < 120) {
            field_m = null;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((bw) this).field_b[var2] = (byte) 0;
        }
        ((bw) this).field_c = 0;
        ((bw) this).field_i[0] = (byte) 0;
        if (param0 != 200) {
            ((bw) this).field_a = null;
        }
        ((bw) this).field_d = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((bw) this).field_l[var2] = 0L;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        au var6 = null;
        au var7 = null;
        bv var4 = null;
        if (!(param1 == oo.field_a)) {
            var6 = (au) (Object) qm.field_J.a((byte) -27, (long)oo.field_a);
            var7 = var6;
            oo.field_a = param1;
            if (var7 != null) {
                var7.field_jc = null;
            }
            var4 = vl.field_n;
            var4.h(param2 ^ -32211, param0);
            var4.b(1, 3);
            var4.b(1, 11);
            var4.b(true, param1);
        }
        if (param2 != -116) {
            field_m = null;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -28911) {
            return;
        }
        field_m = null;
        field_h = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > var2) {
                    L3: {
                      if (param0 == -11) {
                        break L3;
                      } else {
                        ((bw) this).b(65);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((bw) this).field_l[var2] = ue.a(((bw) this).field_l[var2], ue.a(((bw) this).field_a[var2], ((bw) this).field_k[var2]));
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
                            ((bw) this).field_j[0] = ue.a(((bw) this).field_j[0], sa.field_h[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bw) this).field_k[var3] = ((bw) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((bw) this).field_e[var3] = ((bw) this).field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var7 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((bw) this).field_e[var3] = ue.a(((bw) this).field_e[var3], sa.field_g[var7][rn.a((int)(((bw) this).field_k[rn.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bw) this).field_j[var3] = ((bw) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((bw) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((bw) this).field_e[var3] = ue.a(((bw) this).field_e[var3], sa.field_g[var4][rn.a(255, (int)(((bw) this).field_j[rn.a(7, var3 + -var4)] >>> var5))]);
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
                ((bw) this).field_j[var2] = ((bw) this).field_l[var2];
                ((bw) this).field_k[var2] = ue.a(((bw) this).field_a[var2], ((bw) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bw) this).field_a[var2] = ue.a(we.a((long)((bw) this).field_i[7 + var3], 255L), ue.a(we.a((long)((bw) this).field_i[var3 + 6], 255L) << 1481208776, ue.a(ue.a(ue.a(ue.a(ue.a((long)((bw) this).field_i[var3] << -637116744, we.a((long)((bw) this).field_i[var3 - -1] << 1579974512, 71776119061217280L)), we.a((long)((bw) this).field_i[var3 + 2], 255L) << 1120430504), we.a((long)((bw) this).field_i[3 + var3], 255L) << -486241888), we.a(255L, (long)((bw) this).field_i[4 + var3]) << 1858629272), we.a((long)((bw) this).field_i[var3 + 5], 255L) << -73153968)));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    bw() {
        ((bw) this).field_c = 0;
        ((bw) this).field_b = new byte[32];
        ((bw) this).field_l = new long[8];
        ((bw) this).field_d = 0;
        ((bw) this).field_a = new long[8];
        ((bw) this).field_j = new long[8];
        ((bw) this).field_k = new long[8];
        ((bw) this).field_e = new long[8];
        ((bw) this).field_i = new byte[64];
    }

    final void a(byte[] param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((bw) this).field_i[((bw) this).field_d] = (byte)oe.c((int) ((bw) this).field_i[((bw) this).field_d], 128 >>> rn.a(((bw) this).field_c, 7));
          ((bw) this).field_d = ((bw) this).field_d + 1;
          if (32 < ((bw) this).field_d) {
            L1: while (true) {
              if (64 <= ((bw) this).field_d) {
                this.c(-11);
                ((bw) this).field_d = 0;
                break L0;
              } else {
                ((bw) this).field_d = ((bw) this).field_d + 1;
                ((bw) this).field_i[((bw) this).field_d] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (((bw) this).field_d >= 32) {
            L3: {
              if (param2) {
                break L3;
              } else {
                bw.a(54, 79);
                break L3;
              }
            }
            vm.a(((bw) this).field_b, 0, ((bw) this).field_i, 32, 32);
            this.c(-11);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((bw) this).field_l[var4];
                param0[var5] = (byte)(int)(var6 >>> 844136504);
                param0[1 + var5] = (byte)(int)(var6 >>> 1162097584);
                param0[var5 + 2] = (byte)(int)(var6 >>> 570668392);
                param0[var5 + 3] = (byte)(int)(var6 >>> 1366312288);
                param0[4 + var5] = (byte)(int)(var6 >>> 265155352);
                param0[var5 - -5] = (byte)(int)(var6 >>> 1253311568);
                param0[6 + var5] = (byte)(int)(var6 >>> 871043208);
                param0[var5 + 7] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            ((bw) this).field_d = ((bw) this).field_d + 1;
            ((bw) this).field_i[((bw) this).field_d] = (byte) 0;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{0, 108, 28, 12, 110, 69};
        field_m = new int[][]{new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[1], new int[1], new int[1], new int[1], new int[1], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13], new int[13]};
    }
}
