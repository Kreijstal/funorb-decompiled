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
        int var11 = TorChallenge.field_F ? 1 : 0;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var7 = -1640531527;
        int var9 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        for (var2 = 0; (var2 ^ -1) > -5; var2++) {
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
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var8 = var8 + this.field_g[var2 + 5];
            var5 = var5 + this.field_g[2 + var2];
            var10 = var10 + this.field_g[7 + var2];
            var6 = var6 + this.field_g[var2 + 3];
            var7 = var7 + this.field_g[4 + var2];
            var3 = var3 + this.field_g[var2];
            var4 = var4 + this.field_g[var2 + 1];
            var9 = var9 + this.field_g[6 + var2];
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
            this.field_b[var2] = var3;
            this.field_b[1 + var2] = var4;
            this.field_b[var2 - -2] = var5;
            this.field_b[3 + var2] = var6;
            this.field_b[var2 + 4] = var7;
            this.field_b[5 + var2] = var8;
            this.field_b[6 + var2] = var9;
            this.field_b[7 + var2] = var10;
        }
        if (param0 >= -57) {
            this.c(75);
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var7 = var7 + this.field_b[4 + var2];
            var9 = var9 + this.field_b[6 + var2];
            var8 = var8 + this.field_b[var2 + 5];
            var4 = var4 + this.field_b[var2 - -1];
            var3 = var3 + this.field_b[var2];
            var5 = var5 + this.field_b[var2 - -2];
            var10 = var10 + this.field_b[7 + var2];
            var6 = var6 + this.field_b[var2 - -3];
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
            this.field_b[var2] = var3;
            this.field_b[1 + var2] = var4;
            this.field_b[var2 - -2] = var5;
            this.field_b[var2 - -3] = var6;
            this.field_b[4 + var2] = var7;
            this.field_b[5 + var2] = var8;
            this.field_b[var2 - -6] = var9;
            this.field_b[7 + var2] = var10;
        }
        this.c(-26);
        this.field_l = 256;
    }

    final int d(int param0) {
        int var2 = -24 % ((param0 - 75) / 51);
        if (-1 == (this.field_l ^ -1)) {
            this.c(-26);
            this.field_l = 256;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        return this.field_g[fieldTemp$0];
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 16) {
            field_d = false;
        }
    }

    final static void a(byte param0, int param1) {
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((o.field_l ^ -1) < -1) {
                L2: {
                  if (pg.field_p != null) {
                    break L2;
                  } else {
                    fd.a((byte) -86);
                    break L2;
                  }
                }
                o.field_l = o.field_l - 1;
                if (0 != o.field_l) {
                  break L1;
                } else {
                  ug.field_o = 0;
                  df.field_O = true;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (o.field_l <= 0) {
                break L3;
              } else {
                if ((wb.field_p.field_db ^ -1) < -1) {
                  break L3;
                } else {
                  df.field_O = true;
                  o.field_l = 0;
                  ug.field_o = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (-1 != (o.field_l ^ -1)) {
                break L4;
              } else {
                if (ok.field_a == null) {
                  break L4;
                } else {
                  ri.f(127);
                  break L4;
                }
              }
            }
            L5: {
              if (hb.field_f > 0) {
                hb.field_f = hb.field_f - 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 > 67) {
                break L6;
              } else {
                ed.a(-124);
                break L6;
              }
            }
            var2_int = 0;
            L7: while (true) {
              if (6 <= var2_int) {
                var2_int = 0;
                L8: while (true) {
                  L9: {
                    if (var2_int >= 5) {
                      if (null != ea.field_g) {
                        var2_int = 0;
                        L10: while (true) {
                          if (var2_int >= ea.field_g.length) {
                            break L9;
                          } else {
                            if (ea.field_g[var2_int] != null) {
                              L11: {
                                if (0 != ea.field_g[var2_int].field_F) {
                                  ea.field_g[var2_int] = ea.field_g[var2_int].c((byte) 29, param1);
                                  if (ea.field_g[var2_int] != null) {
                                    if (vg.a(ea.field_g[var2_int].field_F, -1)) {
                                      ea.field_g[var2_int].l(0);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    var2_int++;
                                    continue L10;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              var2_int++;
                              continue L10;
                            } else {
                              var2_int++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      stackIn_30_0 = 0;

                      stackIn_30_1 = kd.field_k[var2_int];

                      L12: {
                        if (stackIn_30_0 <= stackIn_30_1) {
                          kd.field_k[var2_int] = kd.field_k[var2_int] - 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var2_int++;
                      continue L8;
                    }
                  }
                  L16: {
                    if (!hc.field_Q) {
                      break L16;
                    } else {
                      if ((ub.field_n ^ -1) <= -1) {
                        ub.field_n = ub.field_n - 1;
                        cb.a(25, wb.field_p.field_H, (byte) 93, wb.field_p.field_o);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    t.b(true);
                    hk.a(126);
                    if (we.field_f <= 0) {
                      break L17;
                    } else {
                      we.field_f = we.field_f - 1;
                      break L17;
                    }
                  }
                  L18: {
                    if (-1 <= (ii.field_i ^ -1)) {
                      break L18;
                    } else {
                      ii.field_i = ii.field_i - 1;
                      if (-1 != (ii.field_i ^ -1)) {
                        break L18;
                      } else {
                        be.field_d = 0;
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (we.field_f < 0) {
                      we.field_f = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-26 > (ql.field_n ^ -1)) {
                      ql.field_n = 25;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (we.field_f == 0) {
                      ec.field_e = false;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (ql.field_n > 0) {
                      ql.field_n = ql.field_n - 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (-1 < (ql.field_n ^ -1)) {
                      ql.field_n = 0;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L24: {
                  if (0 <= wa.field_sb[var2_int]) {
                    wa.field_sb[var2_int] = wa.field_sb[var2_int] - 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                var2_int++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ed.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ed(int[] param0) {
        int var2_int = 0;
        try {
            this.field_g = new int[256];
            this.field_b = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_g[var2_int] = param0[var2_int];
            }
            this.b(-82);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 == -26) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        int fieldTemp$0 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        this.field_f = this.field_f + fieldTemp$0;
        var2 = 0;
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = this.field_b[var2];
              if ((2 & var2) == 0) {
                if (0 == (1 & var2)) {
                  this.field_a = this.field_a ^ this.field_a << 1353002349;
                  break L2;
                } else {
                  this.field_a = this.field_a ^ this.field_a >>> -112840122;
                  break L2;
                }
              } else {
                if (-1 != (var2 & 1 ^ -1)) {
                  this.field_a = this.field_a ^ this.field_a >>> -1846601232;
                  break L2;
                } else {
                  this.field_a = this.field_a ^ this.field_a << -1667836510;
                  break L2;
                }
              }
            }
            this.field_a = this.field_a + this.field_b[255 & 128 + var2];
            dupTemp$1 = this.field_b[jh.a(var3 >> 934083970, 255)] + this.field_a + this.field_f;
            var4 = dupTemp$1;
            this.field_b[var2] = dupTemp$1;
            dupTemp$2 = this.field_b[jh.a(var4 >> -597170616 >> -752196126, 255)] - -var3;
            this.field_f = dupTemp$2;
            this.field_g[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    static {
        field_c = 0;
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_i = new int[]{6, 433, 214, 42};
    }
}
