/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    private long[] field_h;
    static String field_b;
    private byte[] field_k;
    static oha[] field_e;
    private long[] field_g;
    private long[] field_n;
    private long[] field_o;
    static String field_p;
    private byte[] field_i;
    static String field_f;
    static int field_d;
    private long[] field_a;
    private int field_l;
    private int field_c;
    static String field_m;
    static String field_j;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
            return;
        }
        for (var2 = 0; 32 > var2; var2++) {
            ((ur) this).field_k[var2] = (byte) 0;
        }
        ((ur) this).field_l = 0;
        ((ur) this).field_i[0] = (byte) 0;
        ((ur) this).field_c = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((ur) this).field_h[var2] = 0L;
        }
    }

    final void a(byte[] param0, long param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        var5 = param2;
        var6 = -(7 & (int)param1) + 8 & 7;
        var7 = 7 & ((ur) this).field_l;
        var9 = param1;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if ((var11 ^ -1) > -1) {
            L1: while (true) {
              if ((param1 ^ -1L) >= -9L) {
                L2: {
                  if (0L >= param1) {
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = param0[var5] << var6 & 255;
                    ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], var8 >>> var7);
                    break L2;
                  }
                }
                L3: {
                  if ((long)var7 + param1 >= 8L) {
                    L4: {
                      ((ur) this).field_l = ((ur) this).field_l + (8 - var7);
                      param1 = param1 - (long)(8 + -var7);
                      ((ur) this).field_c = ((ur) this).field_c + 1;
                      if (((ur) this).field_l != 512) {
                        break L4;
                      } else {
                        this.a(false);
                        ((ur) this).field_c = 0;
                        ((ur) this).field_l = 0;
                        break L4;
                      }
                    }
                    ((ur) this).field_i[((ur) this).field_c] = (byte)dda.a(255, var8 << -var7 + 8);
                    ((ur) this).field_l = ((ur) this).field_l + (int)param1;
                    break L3;
                  } else {
                    ((ur) this).field_l = (int)((long)((ur) this).field_l + param1);
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param0[var5] << var6 | (255 & param0[var5 + 1]) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L5;
                  } else {
                    if ((var8 ^ -1) > -257) {
                      L6: {
                        ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], var8 >>> var7);
                        ((ur) this).field_l = ((ur) this).field_l + (-var7 + 8);
                        ((ur) this).field_c = ((ur) this).field_c + 1;
                        if (-513 == (((ur) this).field_l ^ -1)) {
                          this.a(false);
                          ((ur) this).field_c = 0;
                          ((ur) this).field_l = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((ur) this).field_i[((ur) this).field_c] = (byte)dda.a(255, var8 << 8 + -var7);
                      var5++;
                      ((ur) this).field_l = ((ur) this).field_l + var7;
                      param1 = param1 - 8L;
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
            var12 = var12 + ((255 & ((ur) this).field_k[var11]) - -((int)var9 & 255));
            ((ur) this).field_k[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], 128 >>> dda.a(((ur) this).field_l, 7));
          ((ur) this).field_c = ((ur) this).field_c + 1;
          if ((((ur) this).field_c ^ -1) < -33) {
            L1: while (true) {
              if ((((ur) this).field_c ^ -1) <= -65) {
                this.a(false);
                ((ur) this).field_c = 0;
                break L0;
              } else {
                ((ur) this).field_c = ((ur) this).field_c + 1;
                ((ur) this).field_i[((ur) this).field_c] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if ((((ur) this).field_c ^ -1) <= -33) {
            bl.a(((ur) this).field_k, 0, ((ur) this).field_i, 32, 32);
            this.a(false);
            var6 = -122 % ((param0 - 10) / 46);
            var4 = 0;
            var5 = param1;
            L3: while (true) {
              if (-9 >= (var4 ^ -1)) {
                return;
              } else {
                var7 = ((ur) this).field_h[var4];
                param2[var5] = (byte)(int)(var7 >>> 456049912);
                param2[var5 + 1] = (byte)(int)(var7 >>> -240138256);
                param2[var5 - -2] = (byte)(int)(var7 >>> 1207010088);
                param2[var5 - -3] = (byte)(int)(var7 >>> 756204896);
                param2[var5 - -4] = (byte)(int)(var7 >>> 1232330840);
                param2[5 + var5] = (byte)(int)(var7 >>> -1992466672);
                param2[6 + var5] = (byte)(int)(var7 >>> 1799117512);
                param2[7 + var5] = (byte)(int)var7;
                var5 += 8;
                var4++;
                continue L3;
              }
            }
          } else {
            ((ur) this).field_c = ((ur) this).field_c + 1;
            ((ur) this).field_i[((ur) this).field_c] = (byte) 0;
            continue L2;
          }
        }
    }

    final static pp a(lu param0, byte param1) {
        nq var2 = qi.a(param0, (byte) 112);
        if (param1 != 120) {
            ur.a(-96);
        }
        int var3 = param0.b(param1 ^ 16711815);
        return (pp) (Object) new ela(var2, var3);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      var2 = 0;
                      if (!param0) {
                        break L3;
                      } else {
                        this.a(true);
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((ur) this).field_h[var2] = gv.a(((ur) this).field_h[var2], gv.a(((ur) this).field_n[var2], ((ur) this).field_o[var2]));
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
                            ((ur) this).field_g[0] = gv.a(((ur) this).field_g[0], hha.field_z[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ur) this).field_n[var3] = ((ur) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ur) this).field_a[var3] = ((ur) this).field_g[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ur) this).field_a[var3] = gv.a(((ur) this).field_a[var3], hha.field_v[var7][dda.a(255, (int)(((ur) this).field_n[dda.a(7, var3 - var7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ur) this).field_g[var3] = ((ur) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ur) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((ur) this).field_a[var3] = gv.a(((ur) this).field_a[var3], hha.field_v[var4][dda.a(255, (int)(((ur) this).field_g[dda.a(var3 - var4, 7)] >>> var5))]);
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
                ((ur) this).field_g[var2] = ((ur) this).field_h[var2];
                ((ur) this).field_n[var2] = gv.a(((ur) this).field_o[var2], ((ur) this).field_h[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ur) this).field_o[var2] = gv.a(gv.a(gv.a(gv.a(gv.a(gv.a(gv.a((long)((ur) this).field_i[var3] << -796745864, gda.a(255L, (long)((ur) this).field_i[var3 - -1]) << -843261328), gda.a(280375465082880L, (long)((ur) this).field_i[var3 - -2] << 239192872)), gda.a((long)((ur) this).field_i[var3 - -3] << -81887648, 1095216660480L)), gda.a(4278190080L, (long)((ur) this).field_i[var3 + 4] << 1676351896)), gda.a(255L, (long)((ur) this).field_i[5 + var3]) << -1988894576), gda.a((long)((ur) this).field_i[6 + var3] << 334326024, 65280L)), gda.a(255L, (long)((ur) this).field_i[7 + var3]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          if (param6 == 512) {
            break L0;
          } else {
            field_d = -72;
            break L0;
          }
        }
        L1: {
          L2: {
            if (eo.field_l > param1 - param0) {
              break L2;
            } else {
              if (pw.field_x < param0 + param1) {
                break L2;
              } else {
                if (an.field_q > -param0 + param2) {
                  break L2;
                } else {
                  if (param2 - -param0 <= ha.field_n) {
                    eja.a((byte) -60, param0, param3, param2, param4, param5, param1);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          pj.a(param2, param3, 170, param1, param0, param4, param5);
          break L1;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_b = null;
        if (param0 < 103) {
            return;
        }
        field_p = null;
        field_f = null;
        field_j = null;
    }

    ur() {
        ((ur) this).field_h = new long[8];
        ((ur) this).field_n = new long[8];
        ((ur) this).field_o = new long[8];
        ((ur) this).field_i = new byte[64];
        ((ur) this).field_g = new long[8];
        ((ur) this).field_a = new long[8];
        ((ur) this).field_k = new byte[32];
        ((ur) this).field_c = 0;
        ((ur) this).field_l = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Security";
        field_f = "Every player's actions are plotted at the same time, and then everyone moves at the same time. The number next to your creature indicates when it will move in the grand order of things. <br> Clicking the End Phase Button confirms your actions and ends you turn. Do this now.";
        field_j = "Don't mind";
        field_m = "Congratulations, you have evolved your first creature! You can drag creatures around to place them where you want. <br><col=BBFF00> Next</col>";
    }
}
