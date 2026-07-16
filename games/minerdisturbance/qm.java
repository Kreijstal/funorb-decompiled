/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    private long[] field_b;
    static boolean field_f;
    private long[] field_c;
    private long[] field_e;
    private int field_i;
    static java.awt.Color field_j;
    private byte[] field_d;
    private byte[] field_k;
    private long[] field_l;
    private long[] field_m;
    static int field_a;
    private int field_o;
    static String[][] field_g;
    static bg field_h;
    static String field_n;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        ti.field_I[fb.field_c] = param2;
        an.field_a[fb.field_c] = fb.field_c;
        pi.field_h[fb.field_c] = param0;
        if (!(he.field_e <= param0)) {
            bc.field_d = param0;
        }
        if (param0 > bd.field_g) {
            v.field_c = param0;
        }
        jk.field_db[fb.field_c] = param4;
        qa.field_c[fb.field_c] = param5;
        li.field_a[fb.field_c] = param1;
        int var6 = param1 + (param5 + param4);
        int var7 = var6 == 0 ? 0 : param4 * 1000 / var6;
        cc.field_L[fb.field_c] = var7;
        if (v.field_c < var7) {
            v.field_c = var7;
        }
        if (!(bc.field_d <= var7)) {
            bc.field_d = var7;
        }
        fb.field_c = fb.field_c + 1;
        if (!param3) {
            field_f = false;
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        ((qm) this).field_k[((qm) this).field_o] = (byte)hi.a((int) ((qm) this).field_k[((qm) this).field_o], 128 >>> c.a(7, ((qm) this).field_i));
        ((qm) this).field_o = ((qm) this).field_o + 1;
        if (param2 == 8) {
          L0: {
            if (((qm) this).field_o <= 32) {
              break L0;
            } else {
              L1: while (true) {
                if (64 <= ((qm) this).field_o) {
                  this.a(-92);
                  ((qm) this).field_o = 0;
                  break L0;
                } else {
                  int fieldTemp$2 = ((qm) this).field_o;
                  ((qm) this).field_o = ((qm) this).field_o + 1;
                  ((qm) this).field_k[fieldTemp$2] = (byte) 0;
                  continue L1;
                }
              }
            }
          }
          L2: while (true) {
            if ((((qm) this).field_o ^ -1) <= -33) {
              ai.a(((qm) this).field_d, 0, ((qm) this).field_k, 32, 32);
              this.a(-63);
              var4 = 0;
              var5 = param0;
              L3: while (true) {
                if ((var4 ^ -1) <= -9) {
                  return;
                } else {
                  var6 = ((qm) this).field_b[var4];
                  param1[var5] = (byte)(int)(var6 >>> -1862299016);
                  param1[1 + var5] = (byte)(int)(var6 >>> -6291600);
                  param1[var5 + 2] = (byte)(int)(var6 >>> -984209880);
                  param1[var5 - -3] = (byte)(int)(var6 >>> 1795034528);
                  param1[4 + var5] = (byte)(int)(var6 >>> -1725666152);
                  param1[5 + var5] = (byte)(int)(var6 >>> 226944528);
                  param1[6 + var5] = (byte)(int)(var6 >>> -1746302840);
                  param1[var5 - -7] = (byte)(int)var6;
                  var4++;
                  var5 += 8;
                  continue L3;
                }
              }
            } else {
              int fieldTemp$3 = ((qm) this).field_o;
              ((qm) this).field_o = ((qm) this).field_o + 1;
              ((qm) this).field_k[fieldTemp$3] = (byte) 0;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        for (var2 = 0; 32 > var2; var2++) {
            ((qm) this).field_d[var2] = (byte) 0;
        }
        ((qm) this).field_i = 0;
        ((qm) this).field_k[0] = (byte) 0;
        ((qm) this).field_o = 0;
        var2 = 0;
        if (param0 != -29) {
            ((qm) this).field_d = null;
        }
        while ((var2 ^ -1) > -9) {
            ((qm) this).field_b[var2] = 0L;
            var2++;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = MinerDisturbance.field_ab;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    L3: {
                      if (param0 < -61) {
                        break L3;
                      } else {
                        field_n = null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((qm) this).field_b[var2] = te.a(((qm) this).field_b[var2], te.a(((qm) this).field_e[var2], ((qm) this).field_c[var2]));
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
                          if (8 <= var3) {
                            ((qm) this).field_m[0] = te.a(((qm) this).field_m[0], cb.field_f[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((qm) this).field_c[var3] = ((qm) this).field_l[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((qm) this).field_l[var3] = ((qm) this).field_m[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((qm) this).field_l[var3] = te.a(((qm) this).field_l[var3], cb.field_h[var7][c.a((int)(((qm) this).field_c[c.a(-var7 + var3, 7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((qm) this).field_m[var3] = ((qm) this).field_l[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((qm) this).field_l[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((qm) this).field_l[var3] = te.a(((qm) this).field_l[var3], cb.field_h[var4][c.a((int)(((qm) this).field_m[c.a(-var4 + var3, 7)] >>> var5), 255)]);
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
                ((qm) this).field_m[var2] = ((qm) this).field_b[var2];
                ((qm) this).field_c[var2] = te.a(((qm) this).field_e[var2], ((qm) this).field_b[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((qm) this).field_e[var2] = te.a(te.a(bf.a((long)((qm) this).field_k[6 + var3] << -1139992632, 65280L), te.a(te.a(te.a(bf.a((long)((qm) this).field_k[3 + var3], 255L) << 1435689120, te.a(te.a(bf.a((long)((qm) this).field_k[1 + var3], 255L) << 248310256, (long)((qm) this).field_k[var3] << 1930980216), bf.a((long)((qm) this).field_k[2 + var3], 255L) << -1035047704)), bf.a(255L, (long)((qm) this).field_k[4 + var3]) << 840735256), bf.a(16711680L, (long)((qm) this).field_k[var3 - -5] << 828952208))), bf.a(255L, (long)((qm) this).field_k[var3 - -7]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != -31434) {
            return;
        }
        field_j = null;
        field_h = null;
        field_n = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = MinerDisturbance.field_ab;
        var5 = 0;
        var6 = 7 & 8 + -(7 & (int)param2);
        var7 = 7 & ((qm) this).field_i;
        var9 = param2;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if ((var11 ^ -1) > -1) {
            L1: {
              if (param1 == -21816) {
                break L1;
              } else {
                ((qm) this).field_l = null;
                break L1;
              }
            }
            L2: while (true) {
              if ((param2 ^ -1L) >= -9L) {
                L3: {
                  if ((param2 ^ -1L) >= -1L) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param0[var5] << var6 & 255;
                    ((qm) this).field_k[((qm) this).field_o] = (byte)hi.a((int) ((qm) this).field_k[((qm) this).field_o], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if ((param2 + (long)var7 ^ -1L) > -9L) {
                    ((qm) this).field_i = (int)((long)((qm) this).field_i + param2);
                    break L4;
                  } else {
                    L5: {
                      ((qm) this).field_o = ((qm) this).field_o + 1;
                      ((qm) this).field_i = ((qm) this).field_i + (8 + -var7);
                      param2 = param2 - (long)(8 + -var7);
                      if ((((qm) this).field_i ^ -1) == -513) {
                        this.a(-124);
                        ((qm) this).field_i = 0;
                        ((qm) this).field_o = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((qm) this).field_k[((qm) this).field_o] = (byte)c.a(255, var8 << -var7 + 8);
                    ((qm) this).field_i = ((qm) this).field_i + (int)param2;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param0[var5] << var6 & 255 | (param0[1 + var5] & 255) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L6;
                  } else {
                    if (var8 < 256) {
                      L7: {
                        ((qm) this).field_k[((qm) this).field_o] = (byte)hi.a((int) ((qm) this).field_k[((qm) this).field_o], var8 >>> var7);
                        ((qm) this).field_o = ((qm) this).field_o + 1;
                        ((qm) this).field_i = ((qm) this).field_i + (8 - var7);
                        if (512 != ((qm) this).field_i) {
                          break L7;
                        } else {
                          this.a(param1 ^ 21770);
                          ((qm) this).field_i = 0;
                          ((qm) this).field_o = 0;
                          break L7;
                        }
                      }
                      ((qm) this).field_k[((qm) this).field_o] = (byte)c.a(var8 << 8 + -var7, 255);
                      ((qm) this).field_i = ((qm) this).field_i + var7;
                      var5++;
                      param2 = param2 - 8L;
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
            var12 = var12 + (((int)var9 & 255) + (((qm) this).field_d[var11] & 255));
            ((qm) this).field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    qm() {
        ((qm) this).field_c = new long[8];
        ((qm) this).field_e = new long[8];
        ((qm) this).field_d = new byte[32];
        ((qm) this).field_l = new long[8];
        ((qm) this).field_m = new long[8];
        ((qm) this).field_i = 0;
        ((qm) this).field_k = new byte[64];
        ((qm) this).field_b = new long[8];
        ((qm) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new java.awt.Color(10040319);
        field_a = 66;
        field_g = new String[][]{new String[3]};
        field_n = "Ranking: Magma Miner";
        field_h = new bg(11, 0, 1, 2);
    }
}
