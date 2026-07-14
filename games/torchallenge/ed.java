/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    private int[] field_g;
    static int[] field_i;
    private int field_k;
    static boolean field_e;
    private int field_f;
    static String field_h;
    static int field_c;
    static boolean field_d;
    private int field_a;
    private int[] field_b;
    private int field_l;
    static long field_j;

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        var5 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -257) {
                L2: {
                  if (param0 < -57) {
                    break L2;
                  } else {
                    this.c(75);
                    break L2;
                  }
                }
                var2 = 0;
                L3: while (true) {
                  if ((var2 ^ -1) <= -257) {
                    this.c(-26);
                    ((ed) this).field_l = 256;
                    return;
                  } else {
                    var7 = var7 + ((ed) this).field_b[4 + var2];
                    var9 = var9 + ((ed) this).field_b[6 + var2];
                    var8 = var8 + ((ed) this).field_b[var2 + 5];
                    var4 = var4 + ((ed) this).field_b[var2 - -1];
                    var3 = var3 + ((ed) this).field_b[var2];
                    var5 = var5 + ((ed) this).field_b[var2 - -2];
                    var10 = var10 + ((ed) this).field_b[7 + var2];
                    var6 = var6 + ((ed) this).field_b[var2 - -3];
                    var3 = var3 ^ var4 << -357696437;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1000765534;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 1629153512;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1560132656;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1376913642;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1361869308;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 259716168;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1091962103;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ed) this).field_b[var2] = var3;
                    ((ed) this).field_b[1 + var2] = var4;
                    ((ed) this).field_b[var2 - -2] = var5;
                    ((ed) this).field_b[var2 - -3] = var6;
                    ((ed) this).field_b[4 + var2] = var7;
                    ((ed) this).field_b[5 + var2] = var8;
                    ((ed) this).field_b[var2 - -6] = var9;
                    ((ed) this).field_b[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var8 = var8 + ((ed) this).field_g[var2 + 5];
                var5 = var5 + ((ed) this).field_g[2 + var2];
                var10 = var10 + ((ed) this).field_g[7 + var2];
                var6 = var6 + ((ed) this).field_g[var2 + 3];
                var7 = var7 + ((ed) this).field_g[4 + var2];
                var3 = var3 + ((ed) this).field_g[var2];
                var4 = var4 + ((ed) this).field_g[var2 + 1];
                var9 = var9 + ((ed) this).field_g[6 + var2];
                var3 = var3 ^ var4 << -1787126485;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -1773253086;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 2009697320;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 1782449392;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -1332188758;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -1549674332;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 476813032;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1914571031;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ed) this).field_b[var2] = var3;
                ((ed) this).field_b[1 + var2] = var4;
                ((ed) this).field_b[var2 - -2] = var5;
                ((ed) this).field_b[3 + var2] = var6;
                ((ed) this).field_b[var2 + 4] = var7;
                ((ed) this).field_b[5 + var2] = var8;
                ((ed) this).field_b[6 + var2] = var9;
                ((ed) this).field_b[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1215909813;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -66042910;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1490561176;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1603814896;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -653001398;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1383336092;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -655711480;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1063187849;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final int d(int param0) {
        int var2 = -24 % ((param0 - 75) / 51);
        if (-1 == (((ed) this).field_l ^ -1)) {
            this.c(-26);
            ((ed) this).field_l = 256;
        }
        ((ed) this).field_l = ((ed) this).field_l - 1;
        return ((ed) this).field_g[((ed) this).field_l - 1];
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 16) {
            field_d = false;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if ((o.field_l ^ -1) < -1) {
            L1: {
              if (pg.field_p != null) {
                break L1;
              } else {
                fd.a((byte) -86);
                break L1;
              }
            }
            o.field_l = o.field_l - 1;
            if (0 != o.field_l) {
              break L0;
            } else {
              ug.field_o = 0;
              df.field_O = true;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (o.field_l > 0) {
            if (wb.field_p.field_db >= -1) {
              df.field_O = true;
              o.field_l = 0;
              ug.field_o = 0;
              if (-1 != (o.field_l ^ -1)) {
                break L2;
              } else {
                if (ok.field_a == null) {
                  break L2;
                } else {
                  ri.f(127);
                  break L2;
                }
              }
            } else {
              if (-1 != o.field_l) {
                break L2;
              } else {
                if (ok.field_a == null) {
                  break L2;
                } else {
                  ri.f(127);
                  break L2;
                }
              }
            }
          } else {
            if (-1 != (o.field_l ^ -1)) {
              break L2;
            } else {
              if (ok.field_a == null) {
                break L2;
              } else {
                ri.f(127);
                break L2;
              }
            }
          }
        }
        L3: {
          if (hb.field_f > 0) {
            hb.field_f = hb.field_f - 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 > 67) {
            break L4;
          } else {
            ed.a(-124);
            break L4;
          }
        }
        var2 = 0;
        L5: while (true) {
          if (6 <= var2) {
            var2 = 0;
            L6: while (true) {
              if (var2 >= 5) {
                if (null != ea.field_g) {
                  var2 = 0;
                  L7: while (true) {
                    if (var2 >= ea.field_g.length) {
                      L8: {
                        if (!hc.field_Q) {
                          break L8;
                        } else {
                          if ((ub.field_n ^ -1) <= -1) {
                            ub.field_n = ub.field_n - 1;
                            cb.a(25, wb.field_p.field_H, (byte) 93, wb.field_p.field_o);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        t.b(true);
                        hk.a(126);
                        if (we.field_f <= 0) {
                          break L9;
                        } else {
                          we.field_f = we.field_f - 1;
                          break L9;
                        }
                      }
                      L10: {
                        if (-1 <= ii.field_i) {
                          break L10;
                        } else {
                          ii.field_i = ii.field_i - 1;
                          if (-1 != ii.field_i) {
                            break L10;
                          } else {
                            be.field_d = 0;
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (we.field_f < 0) {
                          we.field_f = 0;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (-26 > (ql.field_n ^ -1)) {
                          ql.field_n = 25;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (we.field_f == -1) {
                          ec.field_e = false;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (ql.field_n > 0) {
                          ql.field_n = ql.field_n - 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (-1 > ql.field_n) {
                          ql.field_n = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      return;
                    } else {
                      if (ea.field_g[var2] != null) {
                        if (0 != ea.field_g[var2].field_F) {
                          ea.field_g[var2] = ea.field_g[var2].c((byte) 29, param1);
                          if (ea.field_g[var2] != null) {
                            if (vg.a(ea.field_g[var2].field_F, -1)) {
                              ea.field_g[var2].l(0);
                              var2++;
                              continue L7;
                            } else {
                              var2++;
                              continue L7;
                            }
                          } else {
                            var2++;
                            continue L7;
                          }
                        } else {
                          var2++;
                          continue L7;
                        }
                      } else {
                        var2++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (0 <= kd.field_k[var2]) {
                  kd.field_k[var2] = kd.field_k[var2] - 1;
                  var2++;
                  continue L6;
                } else {
                  var2++;
                  continue L6;
                }
              }
            }
          } else {
            if (0 <= wa.field_sb[var2]) {
              wa.field_sb[var2] = wa.field_sb[var2] - 1;
              var2++;
              continue L5;
            } else {
              var2++;
              continue L5;
            }
          }
        }
    }

    ed(int[] param0) {
        int var2 = 0;
        ((ed) this).field_g = new int[256];
        ((ed) this).field_b = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((ed) this).field_g[var2] = param0[var2];
        }
        this.b(-82);
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 == -26) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        ((ed) this).field_k = ((ed) this).field_k + 1;
        ((ed) this).field_f = ((ed) this).field_f + (((ed) this).field_k + 1);
        var2 = 0;
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = ((ed) this).field_b[var2];
              if ((2 & var2) == -1) {
                if (0 == (1 & var2)) {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a << 1353002349;
                  break L2;
                } else {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a >>> -112840122;
                  break L2;
                }
              } else {
                if (-1 != (var2 & 1)) {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a >>> -1846601232;
                  break L2;
                } else {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a << -1667836510;
                  break L2;
                }
              }
            }
            ((ed) this).field_a = ((ed) this).field_a + ((ed) this).field_b[255 & 128 + var2];
            var4 = ((ed) this).field_b[jh.a(var3 >> 934083970, 255)] + ((ed) this).field_a + ((ed) this).field_f;
            ((ed) this).field_b[var2] = ((ed) this).field_b[jh.a(var3 >> 934083970, 255)] + ((ed) this).field_a + ((ed) this).field_f;
            ((ed) this).field_f = ((ed) this).field_b[jh.a(var4 >> -597170616 >> -752196126, 255)] - -var3;
            ((ed) this).field_g[var2] = ((ed) this).field_b[jh.a(var4 >> -597170616 >> -752196126, 255)] - -var3;
            var2++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_i = new int[]{6, 433, 214, 42};
    }
}
