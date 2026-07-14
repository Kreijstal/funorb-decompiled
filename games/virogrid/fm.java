/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    private long[] field_f;
    private byte[] field_d;
    private byte[] field_e;
    private long[] field_a;
    private int field_h;
    private long[] field_i;
    static String field_c;
    private long[] field_g;
    private long[] field_b;
    private int field_j;

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wg var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        wg stackIn_15_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        wg stackOut_14_0 = null;
        wg stackOut_13_0 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        var1 = sh.field_rb + -dg.field_x;
        dg.field_x = mh.field_g - (var1 >> 1644553377);
        tl.field_i = kn.field_I + -(lj.field_g >> 496326913);
        sh.field_rb = var1 + dg.field_x;
        var2 = tl.field_i;
        var3 = 0;
        L0: while (true) {
          if (vg.field_F.length <= var3) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var4 = wf.field_f[var3];
              if ((var4 ^ -1) <= -1) {
                if (var4 != g.field_b.field_d) {
                  var5 = na.field_Hb;
                  break L2;
                } else {
                  var5 = la.field_k;
                  break L2;
                }
              } else {
                var5 = sf.field_I;
                break L2;
              }
            }
            L3: {
              var6 = vg.field_F[var3];
              if (var4 < 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var7 = an.a(stackIn_10_0 != 0, (byte) 47, var6);
              var8 = mh.field_g + -(var7 >> -1220127679);
              if ((var4 ^ -1) <= -1) {
                L5: {
                  var2 = var2 + hd.field_e;
                  if (var4 == g.field_b.field_d) {
                    stackOut_14_0 = tg.field_D;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = ma.field_h;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_15_0;
                  if (var9 == null) {
                    break L6;
                  } else {
                    var9.a(-dj.field_e + var8, (ng.field_P << -470539583) + di.field_o, false, (dj.field_e << -2085224479) + var7, var2);
                    break L6;
                  }
                }
                var2 = var2 + ng.field_P;
                break L4;
              } else {
                break L4;
              }
            }
            if (var4 >= 0) {
              jf.field_n.b(var6, var8, ej.field_L + var2, var5, -1);
              var2 = var2 + (di.field_o + (ng.field_P + hd.field_e));
              var3++;
              continue L0;
            } else {
              pm.field_j.b(var6, var8, eg.field_l + var2, var5, -1);
              var2 = var2 + bn.field_b;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        if (param1) {
            field_c = null;
        }
        return p.a(10, 4330, true, param0);
    }

    final void a(long param0, boolean param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          var5 = 0;
          var6 = 7 & -((int)param0 & 7) + 8;
          var7 = 7 & ((fm) this).field_j;
          var9 = param0;
          if (!param1) {
            break L0;
          } else {
            ((fm) this).field_a = null;
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (-1 < (var11 ^ -1)) {
            L2: while (true) {
              if (8L >= param0) {
                L3: {
                  if (-1L > (param0 ^ -1L)) {
                    var8 = 255 & param2[var5] << var6;
                    ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if ((param0 + (long)var7 ^ -1L) > -9L) {
                    ((fm) this).field_j = (int)((long)((fm) this).field_j + param0);
                    break L4;
                  } else {
                    L5: {
                      param0 = param0 - (long)(-var7 + 8);
                      ((fm) this).field_j = ((fm) this).field_j + (8 + -var7);
                      ((fm) this).field_h = ((fm) this).field_h + 1;
                      if (-513 == (((fm) this).field_j ^ -1)) {
                        this.b((byte) -91);
                        ((fm) this).field_h = 0;
                        ((fm) this).field_j = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((fm) this).field_e[((fm) this).field_h] = (byte)rb.a(var8 << -var7 + 8, 255);
                    ((fm) this).field_j = ((fm) this).field_j + (int)param0;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param2[var5] << var6 | (255 & param2[1 + var5]) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L6;
                  } else {
                    if (var8 < 256) {
                      L7: {
                        ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], var8 >>> var7);
                        ((fm) this).field_h = ((fm) this).field_h + 1;
                        ((fm) this).field_j = ((fm) this).field_j + (-var7 + 8);
                        if (-513 == (((fm) this).field_j ^ -1)) {
                          this.b((byte) -91);
                          ((fm) this).field_h = 0;
                          ((fm) this).field_j = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((fm) this).field_e[((fm) this).field_h] = (byte)rb.a(255, var8 << -var7 + 8);
                      param0 = param0 - 8L;
                      ((fm) this).field_j = ((fm) this).field_j + var7;
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
            var12 = var12 + ((255 & (int)var9) + (((fm) this).field_d[var11] & 255));
            ((fm) this).field_d[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 != -1369854352) {
            fm.a((byte) 80);
        }
        return kh.a((byte) 61, param0) != null ? true : false;
    }

    final static void a(int param0, int param1, int param2) {
        he var6 = null;
        he var7 = null;
        hg var4 = null;
        if (!(wl.field_b == param0)) {
            var6 = (he) (Object) ma.field_c.a((long)wl.field_b, (byte) 77);
            var7 = var6;
            wl.field_b = param0;
            if (var7 != null) {
                var7.field_Zb = null;
            }
            var4 = gk.field_g;
            var4.g(param2, 8);
            var4.a(3, -68);
            var4.a(11, -100);
            var4.a((byte) 120, param0);
        }
        if (param1 != 3) {
            field_c = null;
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], 128 >>> rb.a(((fm) this).field_j, 7));
          ((fm) this).field_h = ((fm) this).field_h + 1;
          if (((fm) this).field_h <= 32) {
            break L0;
          } else {
            L1: while (true) {
              if (64 <= ((fm) this).field_h) {
                this.b((byte) -91);
                ((fm) this).field_h = 0;
                break L0;
              } else {
                ((fm) this).field_h = ((fm) this).field_h + 1;
                ((fm) this).field_e[((fm) this).field_h] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2 == 8) {
            break L2;
          } else {
            ((fm) this).field_e = null;
            break L2;
          }
        }
        L3: while (true) {
          if ((((fm) this).field_h ^ -1) <= -33) {
            ek.a(((fm) this).field_d, 0, ((fm) this).field_e, 32, 32);
            this.b((byte) -91);
            var4 = 0;
            var5 = param0;
            L4: while (true) {
              if (8 <= var4) {
                return;
              } else {
                var6 = ((fm) this).field_i[var4];
                param1[var5] = (byte)(int)(var6 >>> 103053432);
                param1[var5 - -1] = (byte)(int)(var6 >>> -1552436240);
                param1[var5 - -2] = (byte)(int)(var6 >>> 2109029608);
                param1[3 + var5] = (byte)(int)(var6 >>> 224881056);
                param1[var5 - -4] = (byte)(int)(var6 >>> 675927704);
                param1[var5 - -5] = (byte)(int)(var6 >>> 134133520);
                param1[var5 + 6] = (byte)(int)(var6 >>> -1196988536);
                param1[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((fm) this).field_h = ((fm) this).field_h + 1;
            ((fm) this).field_e[((fm) this).field_h] = (byte) 0;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -54) {
            fm.a((byte) 0);
        }
        field_c = null;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    L3: {
                      if (param0 == -91) {
                        break L3;
                      } else {
                        var7 = null;
                        ((fm) this).a(-69L, false, (byte[]) null);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((fm) this).field_i[var2] = uh.a(((fm) this).field_i[var2], uh.a(((fm) this).field_g[var2], ((fm) this).field_a[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((fm) this).field_f[0] = uh.a(((fm) this).field_f[0], co.field_b[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((fm) this).field_a[var3] = ((fm) this).field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fm) this).field_b[var3] = ((fm) this).field_f[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 <= var8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fm) this).field_b[var3] = uh.a(((fm) this).field_b[var3], co.field_e[var8][rb.a((int)(((fm) this).field_a[rb.a(var3 - var8, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fm) this).field_f[var3] = ((fm) this).field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fm) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((fm) this).field_b[var3] = uh.a(((fm) this).field_b[var3], co.field_e[var4][rb.a((int)(((fm) this).field_f[rb.a(7, -var4 + var3)] >>> var5), 255)]);
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
                ((fm) this).field_f[var2] = ((fm) this).field_i[var2];
                ((fm) this).field_a[var2] = uh.a(((fm) this).field_g[var2], ((fm) this).field_i[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fm) this).field_g[var2] = uh.a(lm.a(255L, (long)((fm) this).field_e[7 + var3]), uh.a(lm.a(255L, (long)((fm) this).field_e[6 + var3]) << 1410754760, uh.a(uh.a(lm.a(255L, (long)((fm) this).field_e[var3 + 4]) << 679008472, uh.a(uh.a(lm.a((long)((fm) this).field_e[2 + var3] << 90913576, 280375465082880L), uh.a((long)((fm) this).field_e[var3] << -524600392, lm.a(71776119061217280L, (long)((fm) this).field_e[var3 + 1] << -1369854352))), lm.a((long)((fm) this).field_e[var3 - -3] << 1155221600, 1095216660480L))), lm.a((long)((fm) this).field_e[var3 + 5] << 702119376, 16711680L))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    fm() {
        ((fm) this).field_d = new byte[32];
        ((fm) this).field_f = new long[8];
        ((fm) this).field_e = new byte[64];
        ((fm) this).field_h = 0;
        ((fm) this).field_b = new long[8];
        ((fm) this).field_g = new long[8];
        ((fm) this).field_i = new long[8];
        ((fm) this).field_j = 0;
        ((fm) this).field_a = new long[8];
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((fm) this).field_d[var2] = (byte) 0;
        }
        var2 = -100 / ((param0 - 2) / 44);
        ((fm) this).field_h = 0;
        ((fm) this).field_e[0] = (byte) 0;
        ((fm) this).field_j = 0;
        for (var3 = 0; 8 > var3; var3++) {
            ((fm) this).field_i[var3] = 0L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for <%0> to start the game...";
    }
}
