/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    private byte[] field_g;
    static String field_e;
    private long[] field_d;
    private long[] field_c;
    private int field_k;
    private byte[] field_h;
    private int field_b;
    private long[] field_f;
    static long field_a;
    private long[] field_i;
    private long[] field_j;

    final static void a(byte param0) {
        if (param0 != 15) {
            field_a = -116L;
        }
        oc.field_c = new oj();
    }

    public static void b(byte param0) {
        if (param0 <= 82) {
            field_e = null;
        }
        field_e = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = stellarshard.field_B;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = param0;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L3: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((we) this).field_c[var2] = ue.a(((we) this).field_c[var2], ue.a(((we) this).field_i[var2], ((we) this).field_d[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((we) this).field_f[0] = ue.a(((we) this).field_f[0], pd.field_j[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((we) this).field_d[var3] = ((we) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((we) this).field_j[var3] = ((we) this).field_f[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((we) this).field_j[var3] = ue.a(((we) this).field_j[var3], pd.field_l[var7][sa.a((int)(((we) this).field_d[sa.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((we) this).field_f[var3] = ((we) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((we) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((we) this).field_j[var3] = ue.a(((we) this).field_j[var3], pd.field_l[var4][sa.a(255, (int)(((we) this).field_f[sa.a(-var4 + var3, 7)] >>> var5))]);
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
                ((we) this).field_f[var2] = ((we) this).field_c[var2];
                ((we) this).field_d[var2] = ue.a(((we) this).field_i[var2], ((we) this).field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((we) this).field_i[var2] = ue.a(stellarshard.a((long)((we) this).field_h[var3 - -7], 255L), ue.a(ue.a(stellarshard.a(16711680L, (long)((we) this).field_h[var3 + 5] << -91619632), ue.a(ue.a(ue.a(ue.a(stellarshard.a((long)((we) this).field_h[1 + var3], 255L) << 2114773168, (long)((we) this).field_h[var3] << 1278288952), stellarshard.a(255L, (long)((we) this).field_h[2 + var3]) << -1470274840), stellarshard.a(1095216660480L, (long)((we) this).field_h[3 + var3] << 1083292000)), stellarshard.a(255L, (long)((we) this).field_h[var3 - -4]) << -1157569192)), stellarshard.a(65280L, (long)((we) this).field_h[var3 + 6] << -148218488)));
            var3 += 8;
            var2++;
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
        L0: {
          var13 = stellarshard.field_B;
          var5 = 0;
          var6 = 8 - ((int)param0 & 7) & 7;
          if (param1 == -78) {
            break L0;
          } else {
            ((we) this).field_b = 118;
            break L0;
          }
        }
        var7 = 7 & ((we) this).field_k;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (-1 < (var11 ^ -1)) {
            L2: while (true) {
              if (-9L <= (param0 ^ -1L)) {
                L3: {
                  if (param0 <= 0L) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = 255 & param2[var5] << var6;
                    ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (param0 + (long)var7 < 8L) {
                    ((we) this).field_k = (int)((long)((we) this).field_k + param0);
                    break L4;
                  } else {
                    L5: {
                      ((we) this).field_b = ((we) this).field_b + 1;
                      ((we) this).field_k = ((we) this).field_k + (8 - var7);
                      param0 = param0 - (long)(-var7 + 8);
                      if ((((we) this).field_k ^ -1) == -513) {
                        this.a(param1 + 79);
                        ((we) this).field_b = 0;
                        ((we) this).field_k = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((we) this).field_h[((we) this).field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                    ((we) this).field_k = ((we) this).field_k + (int)param0;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param2[var5] << var6 & 255 | (255 & param2[var5 - -1]) >>> 8 + -var6;
                  if ((var8 ^ -1) > -1) {
                    break L6;
                  } else {
                    if (var8 < 256) {
                      L7: {
                        ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], var8 >>> var7);
                        ((we) this).field_k = ((we) this).field_k + (-var7 + 8);
                        ((we) this).field_b = ((we) this).field_b + 1;
                        if ((((we) this).field_k ^ -1) != -513) {
                          break L7;
                        } else {
                          this.a(param1 ^ -77);
                          ((we) this).field_b = 0;
                          ((we) this).field_k = 0;
                          break L7;
                        }
                      }
                      ((we) this).field_h[((we) this).field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                      ((we) this).field_k = ((we) this).field_k + var7;
                      var5++;
                      param0 = param0 - 8L;
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
            var12 = var12 + ((255 & ((we) this).field_g[var11]) + ((int)var9 & 255));
            ((we) this).field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        ck.field_db = true;
        ak.field_a = param0 ? true : false;
        ei.field_G = new ck(na.field_d, s.field_c, param2, gk.field_a, ak.field_a);
        if (param1 != 12757) {
            field_e = null;
        }
        na.field_d.a((byte) -108, (rj) (Object) ei.field_G);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((we) this).field_g[var2] = (byte) 0;
        }
        if (param0) {
            ((we) this).field_h = null;
        }
        ((we) this).field_b = 0;
        ((we) this).field_k = 0;
        ((we) this).field_h[0] = (byte) 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            ((we) this).field_c[var2] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = stellarshard.field_B;
          ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], 128 >>> sa.a(7, ((we) this).field_k));
          ((we) this).field_b = ((we) this).field_b + 1;
          if (((we) this).field_b <= 32) {
            break L0;
          } else {
            L1: while (true) {
              if (64 <= ((we) this).field_b) {
                this.a(1);
                ((we) this).field_b = 0;
                break L0;
              } else {
                ((we) this).field_b = ((we) this).field_b + 1;
                ((we) this).field_h[((we) this).field_b] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (((we) this).field_b >= 32) {
            ri.a(((we) this).field_g, 0, ((we) this).field_h, 32, 32);
            this.a(1);
            var4 = 0;
            var5 = param1;
            L3: while (true) {
              if (8 <= var4) {
                L4: {
                  if (param2 == 22297) {
                    break L4;
                  } else {
                    this.a(62);
                    break L4;
                  }
                }
                return;
              } else {
                var6 = ((we) this).field_c[var4];
                param0[var5] = (byte)(int)(var6 >>> -593934600);
                param0[1 + var5] = (byte)(int)(var6 >>> -283749968);
                param0[2 + var5] = (byte)(int)(var6 >>> 1207837160);
                param0[var5 + 3] = (byte)(int)(var6 >>> -268176608);
                param0[var5 - -4] = (byte)(int)(var6 >>> 2094571992);
                param0[var5 + 5] = (byte)(int)(var6 >>> 1197518160);
                param0[var5 + 6] = (byte)(int)(var6 >>> -1660682680);
                param0[var5 + 7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L3;
              }
            }
          } else {
            ((we) this).field_b = ((we) this).field_b + 1;
            ((we) this).field_h[((we) this).field_b] = (byte) 0;
            continue L2;
          }
        }
    }

    final static ub a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        ub var2 = new ub(param0, ak.field_c, vi.field_c, vc.field_b, ih.field_d, ih.field_b);
        tb.f((byte) -128);
        if (param1 != 1) {
            we.a((byte) 22);
        }
        return var2;
    }

    we() {
        ((we) this).field_g = new byte[32];
        ((we) this).field_d = new long[8];
        ((we) this).field_h = new byte[64];
        ((we) this).field_f = new long[8];
        ((we) this).field_c = new long[8];
        ((we) this).field_b = 0;
        ((we) this).field_k = 0;
        ((we) this).field_j = new long[8];
        ((we) this).field_i = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Super cannon";
    }
}
