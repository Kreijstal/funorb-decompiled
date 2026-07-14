/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private long[] field_f;
    private long[] field_g;
    private long[] field_j;
    static int[] field_k;
    private byte[] field_m;
    static af field_i;
    private int field_h;
    private long[] field_c;
    private byte[] field_l;
    private int field_d;
    static cn[] field_a;
    private long[] field_e;
    static cn field_b;

    final void a(byte param0, byte[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], 128 >>> nb.a(((ol) this).field_d, 7));
          if (param0 == -88) {
            break L0;
          } else {
            ((ol) this).b(-45);
            break L0;
          }
        }
        L1: {
          ((ol) this).field_h = ((ol) this).field_h + 1;
          if ((((ol) this).field_h ^ -1) >= -33) {
            break L1;
          } else {
            L2: while (true) {
              if ((((ol) this).field_h ^ -1) <= -65) {
                this.a(param0 + 96);
                ((ol) this).field_h = 0;
                break L1;
              } else {
                ((ol) this).field_h = ((ol) this).field_h + 1;
                ((ol) this).field_m[((ol) this).field_h] = (byte) 0;
                continue L2;
              }
            }
          }
        }
        L3: while (true) {
          if ((((ol) this).field_h ^ -1) <= -33) {
            cj.a(((ol) this).field_l, 0, ((ol) this).field_m, 32, 32);
            this.a(8);
            var4 = 0;
            var5 = param2;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((ol) this).field_g[var4];
                param1[var5] = (byte)(int)(var6 >>> -1037948552);
                param1[1 + var5] = (byte)(int)(var6 >>> 345750896);
                param1[2 + var5] = (byte)(int)(var6 >>> 882204200);
                param1[var5 + 3] = (byte)(int)(var6 >>> -1365373664);
                param1[var5 - -4] = (byte)(int)(var6 >>> -292663080);
                param1[var5 - -5] = (byte)(int)(var6 >>> 1435816912);
                param1[var5 + 6] = (byte)(int)(var6 >>> -753469560);
                param1[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((ol) this).field_h = ((ol) this).field_h + 1;
            ((ol) this).field_m[((ol) this).field_h] = (byte) 0;
            continue L3;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var4 = DungeonAssault.field_K;
        for (var2 = 0; 32 > var2; var2++) {
            ((ol) this).field_l[var2] = (byte) 0;
        }
        ((ol) this).field_d = 0;
        ((ol) this).field_m[0] = (byte) 0;
        ((ol) this).field_h = 0;
        var2 = 0;
        int var3 = 31 / ((param0 - 84) / 40);
        while (8 > var2) {
            ((ol) this).field_g[var2] = 0L;
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
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                L2: {
                  if (param0 == 8) {
                    break L2;
                  } else {
                    ((ol) this).field_j = null;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((ol) this).field_g[var2] = mn.a(((ol) this).field_g[var2], mn.a(((ol) this).field_f[var2], ((ol) this).field_j[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            ((ol) this).field_c[0] = mn.a(((ol) this).field_c[0], gh.field_a[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((ol) this).field_f[var3] = ((ol) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ol) this).field_e[var3] = ((ol) this).field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ol) this).field_e[var3] = mn.a(((ol) this).field_e[var3], gh.field_h[var7][nb.a(255, (int)(((ol) this).field_f[nb.a(7, var3 + -var7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ol) this).field_c[var3] = ((ol) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ol) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((ol) this).field_e[var3] = mn.a(((ol) this).field_e[var3], gh.field_h[var4][nb.a(255, (int)(((ol) this).field_c[nb.a(7, var3 + -var4)] >>> var5))]);
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
                ((ol) this).field_c[var2] = ((ol) this).field_g[var2];
                ((ol) this).field_f[var2] = mn.a(((ol) this).field_j[var2], ((ol) this).field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ol) this).field_j[var2] = mn.a(eg.a(255L, (long)((ol) this).field_m[7 + var3]), mn.a(eg.a((long)((ol) this).field_m[6 + var3], 255L) << -465320312, mn.a(mn.a(eg.a(255L, (long)((ol) this).field_m[4 + var3]) << 1878853272, mn.a(eg.a(255L, (long)((ol) this).field_m[var3 - -3]) << 1441222688, mn.a(eg.a((long)((ol) this).field_m[2 + var3] << 826957352, 280375465082880L), mn.a(eg.a(255L, (long)((ol) this).field_m[1 + var3]) << -713356496, (long)((ol) this).field_m[var3] << -838498248)))), eg.a((long)((ol) this).field_m[5 + var3] << 1939760336, 16711680L))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        if (param0 >= -38) {
            return;
        }
        field_k = null;
        field_b = null;
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
        var13 = DungeonAssault.field_K;
        var5 = 0;
        var6 = 7 & -(7 & (int)param0) + 8;
        var7 = 7 & ((ol) this).field_d;
        if (param1 == 17567) {
          var9 = param0;
          var11 = 31;
          var12 = 0;
          L0: while (true) {
            if (var11 < 0) {
              L1: while (true) {
                if ((param0 ^ -1L) >= -9L) {
                  L2: {
                    if ((param0 ^ -1L) >= -1L) {
                      var8 = 0;
                      break L2;
                    } else {
                      var8 = param2[var5] << var6 & 255;
                      ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], var8 >>> var7);
                      break L2;
                    }
                  }
                  L3: {
                    if ((param0 + (long)var7 ^ -1L) > -9L) {
                      ((ol) this).field_d = (int)((long)((ol) this).field_d + param0);
                      break L3;
                    } else {
                      L4: {
                        ((ol) this).field_d = ((ol) this).field_d + (-var7 + 8);
                        param0 = param0 - (long)(8 - var7);
                        ((ol) this).field_h = ((ol) this).field_h + 1;
                        if (512 == ((ol) this).field_d) {
                          this.a(8);
                          ((ol) this).field_h = 0;
                          ((ol) this).field_d = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((ol) this).field_m[((ol) this).field_h] = (byte)nb.a(255, var8 << -var7 + 8);
                      ((ol) this).field_d = ((ol) this).field_d + (int)param0;
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    var8 = 255 & param2[var5] << var6 | (param2[var5 - -1] & 255) >>> -var6 + 8;
                    if (0 > var8) {
                      break L5;
                    } else {
                      if ((var8 ^ -1) <= -257) {
                        break L5;
                      } else {
                        L6: {
                          ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], var8 >>> var7);
                          ((ol) this).field_h = ((ol) this).field_h + 1;
                          ((ol) this).field_d = ((ol) this).field_d + (8 - var7);
                          if (-513 != (((ol) this).field_d ^ -1)) {
                            break L6;
                          } else {
                            this.a(param1 + -17559);
                            ((ol) this).field_d = 0;
                            ((ol) this).field_h = 0;
                            break L6;
                          }
                        }
                        ((ol) this).field_m[((ol) this).field_h] = (byte)nb.a(var8 << -var7 + 8, 255);
                        param0 = param0 - 8L;
                        var5++;
                        ((ol) this).field_d = ((ol) this).field_d + var7;
                        continue L1;
                      }
                    }
                  }
                  throw new RuntimeException("LOGIC ERROR");
                }
              }
            } else {
              var12 = var12 + (((int)var9 & 255) + (255 & ((ol) this).field_l[var11]));
              ((ol) this).field_l[var11] = (byte)var12;
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

    final static void a(int param0, int param1) {
        int var3 = DungeonAssault.field_K;
        ue var4 = (ue) (Object) qm.field_q.e(-24172);
        while (var4 != null) {
            wd.a((byte) -69, param1, var4);
            var4 = (ue) (Object) qm.field_q.a(param0 ^ 12);
        }
        if (param0 != 8) {
            ol.a((byte) -74);
        }
        ne var2 = bg.field_s.e(param0 + -24180);
        while (var2 != null) {
            hp.a(param1, (byte) 110);
            var2 = bg.field_s.a(param0 ^ 12);
        }
    }

    ol() {
        ((ol) this).field_g = new long[8];
        ((ol) this).field_f = new long[8];
        ((ol) this).field_j = new long[8];
        ((ol) this).field_d = 0;
        ((ol) this).field_m = new byte[64];
        ((ol) this).field_c = new long[8];
        ((ol) this).field_l = new byte[32];
        ((ol) this).field_e = new long[8];
        ((ol) this).field_h = 0;
    }

    static {
    }
}
