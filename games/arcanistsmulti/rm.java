/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    private long[] field_j;
    static String field_d;
    private int field_n;
    private int field_h;
    static String[] field_m;
    static String field_a;
    private byte[] field_g;
    static String field_p;
    static int field_k;
    private long[] field_e;
    private long[] field_i;
    private long[] field_f;
    private long[] field_c;
    static qb[] field_o;
    private byte[] field_b;
    static String[][] field_l;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = -121 / ((81 - param0) / 42);
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L3: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((rm) this).field_i[var2] = kh.a(((rm) this).field_i[var2], kh.a(((rm) this).field_e[var2], ((rm) this).field_f[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((rm) this).field_c[0] = kh.a(((rm) this).field_c[0], mb.field_V[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((rm) this).field_f[var3] = ((rm) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((rm) this).field_j[var3] = ((rm) this).field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((rm) this).field_j[var3] = kh.a(((rm) this).field_j[var3], mb.field_L[var7][dg.a((int)(((rm) this).field_f[dg.a(7, var3 - var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((rm) this).field_c[var3] = ((rm) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((rm) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L4;
                          } else {
                            ((rm) this).field_j[var3] = kh.a(((rm) this).field_j[var3], mb.field_L[var4][dg.a(255, (int)(((rm) this).field_c[dg.a(7, -var4 + var3)] >>> var5))]);
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
                ((rm) this).field_c[var3] = ((rm) this).field_i[var3];
                ((rm) this).field_f[var3] = kh.a(((rm) this).field_e[var3], ((rm) this).field_i[var3]);
                var3++;
                continue L1;
              }
            }
          } else {
            ((rm) this).field_e[var2] = kh.a(on.a((long)((rm) this).field_b[var3 - -7], 255L), kh.a(on.a(255L, (long)((rm) this).field_b[6 + var3]) << -318237752, kh.a(kh.a(on.a(4278190080L, (long)((rm) this).field_b[4 + var3] << -483065448), kh.a(on.a(1095216660480L, (long)((rm) this).field_b[var3 - -3] << 1915977952), kh.a(kh.a((long)((rm) this).field_b[var3] << 2028571384, on.a((long)((rm) this).field_b[var3 - -1], 255L) << -1024621840), on.a((long)((rm) this).field_b[var3 - -2], 255L) << -491881944))), on.a(255L, (long)((rm) this).field_b[5 + var3]) << 1048909584)));
            var2++;
            var3 += 8;
            continue L0;
          }
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
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = 0;
        var6 = 7 & param1 + -(7 & (int)param0);
        var7 = 7 & ((rm) this).field_h;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (-1 < (var11 ^ -1)) {
            L1: while (true) {
              if ((param0 ^ -1L) >= -9L) {
                L2: {
                  if (-1L > (param0 ^ -1L)) {
                    var8 = param2[var5] << var6 & 255;
                    ((rm) this).field_b[((rm) this).field_n] = (byte)fj.b((int) ((rm) this).field_b[((rm) this).field_n], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (((long)var7 + param0 ^ -1L) > -9L) {
                    ((rm) this).field_h = (int)((long)((rm) this).field_h + param0);
                    break L3;
                  } else {
                    L4: {
                      param0 = param0 - (long)(-var7 + 8);
                      ((rm) this).field_h = ((rm) this).field_h + (-var7 + 8);
                      ((rm) this).field_n = ((rm) this).field_n + 1;
                      if ((((rm) this).field_h ^ -1) != -513) {
                        break L4;
                      } else {
                        this.d(124);
                        ((rm) this).field_h = 0;
                        ((rm) this).field_n = 0;
                        break L4;
                      }
                    }
                    ((rm) this).field_b[((rm) this).field_n] = (byte)dg.a(255, var8 << 8 + -var7);
                    ((rm) this).field_h = ((rm) this).field_h + (int)param0;
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param2[var5] << var6 | (255 & param2[var5 + 1]) >>> -var6 + 8;
                  if (var8 < 0) {
                    break L5;
                  } else {
                    if (256 > var8) {
                      L6: {
                        ((rm) this).field_b[((rm) this).field_n] = (byte)fj.b((int) ((rm) this).field_b[((rm) this).field_n], var8 >>> var7);
                        ((rm) this).field_n = ((rm) this).field_n + 1;
                        ((rm) this).field_h = ((rm) this).field_h + (-var7 + 8);
                        if (512 == ((rm) this).field_h) {
                          this.d(param1 + 116);
                          ((rm) this).field_n = 0;
                          ((rm) this).field_h = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((rm) this).field_b[((rm) this).field_n] = (byte)dg.a(255, var8 << -var7 + 8);
                      var5++;
                      param0 = param0 - 8L;
                      ((rm) this).field_h = ((rm) this).field_h + var7;
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
            var12 = var12 + ((255 & (int)var9) + (255 & ((rm) this).field_g[var11]));
            ((rm) this).field_g[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          ((rm) this).field_b[((rm) this).field_n] = (byte)fj.b((int) ((rm) this).field_b[((rm) this).field_n], 128 >>> dg.a(((rm) this).field_h, 7));
          ((rm) this).field_n = ((rm) this).field_n + 1;
          if (32 >= ((rm) this).field_n) {
            break L0;
          } else {
            L1: while (true) {
              if ((((rm) this).field_n ^ -1) <= -65) {
                this.d(127);
                ((rm) this).field_n = 0;
                break L0;
              } else {
                ((rm) this).field_n = ((rm) this).field_n + 1;
                ((rm) this).field_b[((rm) this).field_n] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((rm) this).field_n) {
            L3: {
              sf.a(((rm) this).field_g, 0, ((rm) this).field_b, 32, 32);
              if (param0 >= 73) {
                break L3;
              } else {
                ((rm) this).field_n = -98;
                break L3;
              }
            }
            this.d(1);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if (var4 >= 8) {
                return;
              } else {
                var6 = ((rm) this).field_i[var4];
                param2[var5] = (byte)(int)(var6 >>> 1487179064);
                param2[var5 + 1] = (byte)(int)(var6 >>> -449838928);
                param2[2 + var5] = (byte)(int)(var6 >>> 1283220456);
                param2[var5 - -3] = (byte)(int)(var6 >>> -768142560);
                param2[var5 + 4] = (byte)(int)(var6 >>> -235202536);
                param2[var5 - -5] = (byte)(int)(var6 >>> 1553758800);
                param2[var5 + 6] = (byte)(int)(var6 >>> -376277816);
                param2[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((rm) this).field_n = ((rm) this).field_n + 1;
            ((rm) this).field_b[((rm) this).field_n] = (byte) 0;
            continue L2;
          }
        }
    }

    final static int a(jg param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = -101 % ((param1 - 46) / 54);
          var3 = jk.field_u;
          if (2 == param0.field_m) {
            if (param0.field_i) {
              var3 = jk.field_u;
              break L0;
            } else {
              L1: {
                if (param0.field_d != 0) {
                  break L1;
                } else {
                  if (param0.field_k != 0) {
                    break L1;
                  } else {
                    var3 = wd.field_c[param0.field_m];
                    break L0;
                  }
                }
              }
              var3 = an.field_h[param0.field_m];
              break L0;
            }
          } else {
            if (4 == param0.field_m) {
              var3 = an.field_h[param0.field_m];
              break L0;
            } else {
              if (param0.field_h == qf.field_a) {
                var3 = wd.field_c[param0.field_m];
                break L0;
              } else {
                var3 = an.field_h[param0.field_m];
                break L0;
              }
            }
          }
        }
        return var3;
    }

    public static void a(int param0) {
        field_l = null;
        field_a = null;
        field_d = null;
        field_m = null;
        field_o = null;
        field_p = null;
        if (param0 != -6566) {
            Object var2 = null;
            String discarded$0 = rm.a((wk) null, 18, 22);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((rm) this).field_g[var2] = (byte) 0;
        }
        ((rm) this).field_h = 0;
        ((rm) this).field_b[0] = (byte) 0;
        ((rm) this).field_n = 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            ((rm) this).field_i[var2] = 0L;
        }
        if (param0 != -23645) {
            Object var4 = null;
            rm.a((ml) null, false);
        }
    }

    final static String a(wk param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            var3_int = param0.f(128);
            if (var3_int > param1) {
              var3_int = param1;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_g = param0.field_g + kh.field_g.a(0, (byte) -126, var4, var3_int, param0.field_j, param0.field_g);
          var5 = ba.a(0, var3_int, (byte) -124, var4);
          if (param2 < -55) {
            return (String) (Object) stackIn_5_0;
          } else {
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_6_0 = (String) var5;
          stackIn_7_0 = stackOut_6_0;
        }
        return null;
    }

    final static void a(ml param0, boolean param1) {
        qn.field_ob.a(0, 4, 0, rk.field_O.field_y / 2, 0, rk.field_O.field_y / 2, 0, -60);
        if (mj.field_p == 6) {
            field_k = 6;
        } else {
            param0.b((byte) -92, 250);
        }
        if (!param1) {
            Object var3 = null;
            int discarded$0 = rm.a((jg) null, (byte) -20);
        }
    }

    final static nc a(String param0, eg param1, String param2, int param3, eg param4) {
        if (param3 > -117) {
            field_l = null;
        }
        int var5 = param4.c(param2, -48);
        int var6 = param4.a(param0, (byte) 33, var5);
        return im.a(param4, var6, param1, 101, var5);
    }

    rm() {
        ((rm) this).field_n = 0;
        ((rm) this).field_f = new long[8];
        ((rm) this).field_e = new long[8];
        ((rm) this).field_c = new long[8];
        ((rm) this).field_j = new long[8];
        ((rm) this).field_g = new byte[32];
        ((rm) this).field_i = new long[8];
        ((rm) this).field_h = 0;
        ((rm) this).field_b = new byte[64];
    }

    final static ql[] b(int param0) {
        if (param0 != 1283220456) {
            ql[] discarded$0 = rm.b(95);
        }
        return new ql[]{ea.field_y, of.field_n, vh.field_f};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No players";
        field_a = "Hide chat";
        field_p = "Passwords must be between 5 and 20 letters and numbers";
        field_l = new String[][]{new String[7], null, new String[2]};
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
