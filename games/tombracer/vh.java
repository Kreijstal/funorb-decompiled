/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private long[] field_m;
    private long[] field_j;
    private long[] field_f;
    private byte[] field_d;
    private int field_a;
    static String field_c;
    private long[] field_i;
    static int field_g;
    private long[] field_l;
    static String field_b;
    private int field_k;
    private byte[] field_e;
    static float[] field_h;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L3: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((vh) this).field_l[var2] = oo.a(((vh) this).field_l[var2], oo.a(((vh) this).field_m[var2], ((vh) this).field_f[var2]));
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
                            ((vh) this).field_i[0] = oo.a(((vh) this).field_i[0], vka.field_H[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((vh) this).field_f[var3] = ((vh) this).field_j[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((vh) this).field_j[var3] = ((vh) this).field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((vh) this).field_j[var3] = oo.a(((vh) this).field_j[var3], vka.field_I[var7][sea.c(255, (int)(((vh) this).field_f[sea.c(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((vh) this).field_i[var3] = ((vh) this).field_j[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((vh) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((vh) this).field_j[var3] = oo.a(((vh) this).field_j[var3], vka.field_I[var4][sea.c(255, (int)(((vh) this).field_i[sea.c(-var4 + var3, 7)] >>> var5))]);
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
                ((vh) this).field_i[var2] = ((vh) this).field_l[var2];
                ((vh) this).field_f[var2] = oo.a(((vh) this).field_m[var2], ((vh) this).field_l[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((vh) this).field_m[var2] = oo.a(oo.a(oo.a(oo.a(vi.a((long)((vh) this).field_e[4 + var3] << -1477755624, 4278190080L), oo.a(vi.a(255L, (long)((vh) this).field_e[3 + var3]) << -695232672, oo.a(oo.a((long)((vh) this).field_e[var3] << -1281742984, vi.a((long)((vh) this).field_e[1 + var3] << 659222064, 71776119061217280L)), vi.a(280375465082880L, (long)((vh) this).field_e[var3 - -2] << -1133955800)))), vi.a((long)((vh) this).field_e[5 + var3], 255L) << -319200432), vi.a(255L, (long)((vh) this).field_e[6 + var3]) << -856835576), vi.a((long)((vh) this).field_e[7 + var3], 255L));
            var2++;
            var3 += 8;
            continue L1;
          }
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (param2 == -59) {
            break L0;
          } else {
            ((vh) this).field_m = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = -((int)param1 & 7) + 8 & 7;
        var7 = 7 & ((vh) this).field_a;
        var9 = param1;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (-1 < (var11 ^ -1)) {
            L2: while (true) {
              if ((param1 ^ -1L) >= -9L) {
                L3: {
                  if (-1L > (param1 ^ -1L)) {
                    var8 = param0[var5] << var6 & 255;
                    ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (-9L >= (param1 + (long)var7 ^ -1L)) {
                    L5: {
                      ((vh) this).field_a = ((vh) this).field_a + (8 + -var7);
                      param1 = param1 - (long)(-var7 + 8);
                      ((vh) this).field_k = ((vh) this).field_k + 1;
                      if (-513 != (((vh) this).field_a ^ -1)) {
                        break L5;
                      } else {
                        this.a(false);
                        ((vh) this).field_a = 0;
                        ((vh) this).field_k = 0;
                        break L5;
                      }
                    }
                    ((vh) this).field_e[((vh) this).field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                    ((vh) this).field_a = ((vh) this).field_a + (int)param1;
                    break L4;
                  } else {
                    ((vh) this).field_a = (int)((long)((vh) this).field_a + param1);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param0[var5] << var6 & 255 | (param0[var5 + 1] & 255) >>> -var6 + 8;
                  if (-1 < var8) {
                    break L6;
                  } else {
                    if (-257 > var8) {
                      L7: {
                        ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], var8 >>> var7);
                        ((vh) this).field_a = ((vh) this).field_a + (8 - var7);
                        ((vh) this).field_k = ((vh) this).field_k + 1;
                        if ((((vh) this).field_a ^ -1) == -513) {
                          this.a(false);
                          ((vh) this).field_k = 0;
                          ((vh) this).field_a = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((vh) this).field_e[((vh) this).field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                      var5++;
                      ((vh) this).field_a = ((vh) this).field_a + var7;
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
            var12 = var12 + ((255 & ((vh) this).field_d[var11]) - -((int)var9 & 255));
            ((vh) this).field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        upa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kh var14 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        var14 = vc.field_q;
        var2 = var14.h(255);
        var3 = (upa) (Object) ina.field_d.f(param0 ^ 100);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_n != var2) {
                var3 = (upa) (Object) ina.field_d.e(117);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 == null) {
            dea.a(60);
            return;
          } else {
            L2: {
              var4 = var14.h(255);
              if (param0 == -44) {
                break L2;
              } else {
                vh.a((byte) 81);
                break L2;
              }
            }
            L3: {
              if (-1 != (var4 ^ -1)) {
                bra.field_M[0] = fna.field_k;
                var5 = var3.field_k;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    dc.a(var4, var5, (byte) 47);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        ri.a(var5, (byte) 29);
                        var3.field_h = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_m = new int[2][4 * var5];
                        var7 = new int[2][4 * var5];
                        var8 = ola.field_Eb;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var9 = 0;
                            var13 = 0;
                            var10 = var13;
                            L7: while (true) {
                              if (var8 <= var9) {
                                break L3;
                              } else {
                                var11 = boa.field_n[var5 - -var9];
                                var6[1][var13] = bra.field_M[var11];
                                var7[1][4 * var13] = jk.field_h[var11];
                                var7[1][1 + var13 * 4] = cu.field_o[var11];
                                var7[1][4 * var13 - -2] = bq.field_h[var11];
                                var7[1][3 + 4 * var13] = im.field_o[var11];
                                if (ue.a(bra.field_M[var11], param0 + 44)) {
                                  if (0 == im.field_o[var11] + (bq.field_h[var11] + cu.field_o[var11])) {
                                    var6[1][var13] = null;
                                    var13--;
                                    var13++;
                                    var9++;
                                    continue L7;
                                  } else {
                                    var13++;
                                    var9++;
                                    continue L7;
                                  }
                                } else {
                                  var13++;
                                  var9++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = boa.field_n[var9];
                            var6[0][var10] = bra.field_M[var11];
                            var7[0][4 * var10] = jk.field_h[var11];
                            var7[0][1 + 4 * var10] = cu.field_o[var11];
                            var7[0][2 + 4 * var10] = bq.field_h[var11];
                            var7[0][var10 * 4 + 3] = im.field_o[var11];
                            if (ue.a(bra.field_M[var11], 0)) {
                              if (-1 == (im.field_o[var11] + cu.field_o[var11] + bq.field_h[var11] ^ -1)) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L6;
                              } else {
                                var9++;
                                var10++;
                                continue L6;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        dga.a((uia) (Object) var14, 0);
                        if (var6_int != 0) {
                          qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -90);
                          var6_int++;
                          continue L5;
                        } else {
                          var3.field_g = ir.field_a;
                          var3.field_f = kc.field_b;
                          var3.field_l = tna.field_f;
                          var3.field_j = vd.field_p;
                          qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -97);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    bra.field_M[var6_int] = var14.e((byte) -76);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.field_i = true;
            var3.p(7);
            return;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((vh) this).field_d[var2] = (byte) 0;
        }
        ((vh) this).field_a = 0;
        ((vh) this).field_k = 0;
        ((vh) this).field_e[0] = (byte) 0;
        var2 = 0;
        int var3 = 115 / ((param0 - 58) / 35);
        while (8 > var2) {
            ((vh) this).field_l[var2] = 0L;
            var2++;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -15) {
            return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], 128 >>> sea.c(((vh) this).field_a, 7));
          ((vh) this).field_k = ((vh) this).field_k + 1;
          if (((vh) this).field_k <= param1) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 >= (((vh) this).field_k ^ -1)) {
                this.a(false);
                ((vh) this).field_k = 0;
                break L0;
              } else {
                ((vh) this).field_k = ((vh) this).field_k + 1;
                ((vh) this).field_e[((vh) this).field_k] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (((vh) this).field_k >= 32) {
            lua.a(((vh) this).field_d, 0, ((vh) this).field_e, 32, 32);
            this.a(false);
            var4 = 0;
            var5 = param0;
            L3: while (true) {
              if (-9 >= (var4 ^ -1)) {
                return;
              } else {
                var6 = ((vh) this).field_l[var4];
                param2[var5] = (byte)(int)(var6 >>> -1463451784);
                param2[var5 + 1] = (byte)(int)(var6 >>> -827882896);
                param2[var5 + 2] = (byte)(int)(var6 >>> -1783396312);
                param2[var5 - -3] = (byte)(int)(var6 >>> -791915424);
                param2[var5 + 4] = (byte)(int)(var6 >>> 311221400);
                param2[var5 - -5] = (byte)(int)(var6 >>> -622824880);
                param2[6 + var5] = (byte)(int)(var6 >>> -747024504);
                param2[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L3;
              }
            }
          } else {
            ((vh) this).field_k = ((vh) this).field_k + 1;
            ((vh) this).field_e[((vh) this).field_k] = (byte) 0;
            continue L2;
          }
        }
    }

    final static boolean a(int param0, boolean param1, int param2, lj param3) {
        if (param2 != -27201) {
            field_b = null;
        }
        if (param1) {
            return param3.i((byte) 84).field_d == param0 ? true : false;
        }
        return param0 == param3.n(31974).field_d ? true : false;
    }

    vh() {
        ((vh) this).field_m = new long[8];
        ((vh) this).field_a = 0;
        ((vh) this).field_j = new long[8];
        ((vh) this).field_f = new long[8];
        ((vh) this).field_i = new long[8];
        ((vh) this).field_d = new byte[32];
        ((vh) this).field_l = new long[8];
        ((vh) this).field_e = new byte[64];
        ((vh) this).field_k = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Some objects in the game can be pushed or pulled. Walk into them holding <img=8><img=9>";
        field_h = new float[4];
        field_b = "3rd";
    }
}
