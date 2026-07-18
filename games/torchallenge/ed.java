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
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
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
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
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
                    continue L2;
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
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
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
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final int d(int param0) {
        int var2 = -24 % ((param0 - 75) / 51);
        if (((ed) this).field_l == 0) {
            this.c(-26);
            ((ed) this).field_l = 256;
        }
        int fieldTemp$0 = ((ed) this).field_l - 1;
        ((ed) this).field_l = ((ed) this).field_l - 1;
        return ((ed) this).field_g[fieldTemp$0];
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (o.field_l > 0) {
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
                if (wb.field_p.field_db > 0) {
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
              if (o.field_l != 0) {
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
            var2_int = 0;
            L6: while (true) {
              if (6 <= var2_int) {
                var2_int = 0;
                L7: while (true) {
                  if (var2_int >= 5) {
                    if (null != ea.field_g) {
                      var2_int = 0;
                      L8: while (true) {
                        if (~var2_int <= ~ea.field_g.length) {
                          L9: {
                            if (!hc.field_Q) {
                              break L9;
                            } else {
                              if (ub.field_n >= 0) {
                                ub.field_n = ub.field_n - 1;
                                cb.a(25, wb.field_p.field_H, (byte) 93, wb.field_p.field_o);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            t.b(true);
                            hk.a(126);
                            if (we.field_f <= 0) {
                              break L10;
                            } else {
                              we.field_f = we.field_f - 1;
                              break L10;
                            }
                          }
                          L11: {
                            if (ii.field_i <= 0) {
                              break L11;
                            } else {
                              ii.field_i = ii.field_i - 1;
                              if (ii.field_i != 0) {
                                break L11;
                              } else {
                                be.field_d = 0;
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (we.field_f < 0) {
                              we.field_f = 0;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (ql.field_n > 25) {
                              ql.field_n = 25;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (we.field_f == 0) {
                              ec.field_e = false;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (ql.field_n > 0) {
                              ql.field_n = ql.field_n - 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (ql.field_n < 0) {
                              ql.field_n = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          break L0;
                        } else {
                          L17: {
                            if (ea.field_g[var2_int] == null) {
                              break L17;
                            } else {
                              if (0 != ea.field_g[var2_int].field_F) {
                                ea.field_g[var2_int] = ea.field_g[var2_int].c((byte) 29, param1);
                                if (ea.field_g[var2_int] == null) {
                                  break L17;
                                } else {
                                  if (vg.a(ea.field_g[var2_int].field_F, -1)) {
                                    ea.field_g[var2_int].l(0);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          var2_int++;
                          continue L8;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L18: {
                      if (0 <= kd.field_k[var2_int]) {
                        kd.field_k[var2_int] = kd.field_k[var2_int] - 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    var2_int++;
                    continue L7;
                  }
                }
              } else {
                L19: {
                  if (0 <= wa.field_sb[var2_int]) {
                    wa.field_sb[var2_int] = wa.field_sb[var2_int] - 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var2_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ed.E(" + 89 + ',' + param1 + ')');
        }
    }

    ed(int[] param0) {
        int var2_int = 0;
        try {
            ((ed) this).field_g = new int[256];
            ((ed) this).field_b = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((ed) this).field_g[var2_int] = param0[var2_int];
            }
            this.b(-82);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ed.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        int fieldTemp$3 = ((ed) this).field_k + 1;
        ((ed) this).field_k = ((ed) this).field_k + 1;
        ((ed) this).field_f = ((ed) this).field_f + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((ed) this).field_b[var2];
              if ((2 & var2) == -1) {
                if (0 == (1 & var2)) {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a << 13;
                  break L1;
                } else {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a >>> 6;
                  break L1;
                }
              } else {
                if (-1 != (var2 & 1)) {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a >>> 16;
                  break L1;
                } else {
                  ((ed) this).field_a = ((ed) this).field_a ^ ((ed) this).field_a << 2;
                  break L1;
                }
              }
            }
            ((ed) this).field_a = ((ed) this).field_a + ((ed) this).field_b[255 & 128 + var2];
            int dupTemp$4 = ((ed) this).field_b[jh.a(var3 >> 2, 255)] + ((ed) this).field_a + ((ed) this).field_f;
            var4 = dupTemp$4;
            ((ed) this).field_b[var2] = dupTemp$4;
            int dupTemp$5 = ((ed) this).field_b[jh.a(var4 >> 8 >> 2, 255)] - -var3;
            ((ed) this).field_f = dupTemp$5;
            ((ed) this).field_g[var2] = dupTemp$5;
            var2++;
            continue L0;
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
