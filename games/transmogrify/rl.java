/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= -86) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (-9 >= (var2 ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (-9 >= (var2 ^ -1)) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (-9 >= (var2 ^ -1)) {
                          return;
                        } else {
                          ((rl) this).field_e[var2] = aj.a(((rl) this).field_e[var2], aj.a(((rl) this).field_g[var2], ((rl) this).field_b[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if ((var3 ^ -1) <= -9) {
                          var3 = 0;
                          L5: while (true) {
                            if (8 <= var3) {
                              ((rl) this).field_f[0] = aj.a(((rl) this).field_f[0], dl.field_q[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (8 <= var3) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (var3 >= 8) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((rl) this).field_g[var3] = ((rl) this).field_k[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((rl) this).field_k[var3] = ((rl) this).field_f[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (-9 >= (var7 ^ -1)) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((rl) this).field_k[var3] = aj.a(((rl) this).field_k[var3], dl.field_n[var7][vg.c(255, (int)(((rl) this).field_g[vg.c(-var7 + var3, 7)] >>> var5))]);
                                      var5 -= 8;
                                      var7++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((rl) this).field_f[var3] = ((rl) this).field_k[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((rl) this).field_k[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              ((rl) this).field_k[var3] = aj.a(((rl) this).field_k[var3], dl.field_n[var4][vg.c((int)(((rl) this).field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                              var5 -= 8;
                              var4++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((rl) this).field_f[var2] = ((rl) this).field_e[var2];
                  ((rl) this).field_g[var2] = aj.a(((rl) this).field_b[var2], ((rl) this).field_e[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((rl) this).field_b[var2] = aj.a(ej.a(255L, (long)((rl) this).field_j[7 + var3]), aj.a(aj.a(ej.a((long)((rl) this).field_j[5 + var3], 255L) << -640331824, aj.a(ej.a(4278190080L, (long)((rl) this).field_j[var3 - -4] << 212529752), aj.a(aj.a(ej.a(280375465082880L, (long)((rl) this).field_j[var3 + 2] << 861818856), aj.a((long)((rl) this).field_j[var3] << -1322827016, ej.a((long)((rl) this).field_j[1 + var3] << 73813488, 71776119061217280L))), ej.a(255L, (long)((rl) this).field_j[var3 - -3]) << -1053287136))), ej.a((long)((rl) this).field_j[6 + var3] << -1986427384, 65280L)));
              var3 += 8;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != -6) {
            return 92;
        }
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
            return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var5 = param3.a((byte) -93, param0, param2);
        byte[] var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        if (param1 != 0) {
            return false;
        }
        kf.a(var5, param1 ^ 108);
        return true;
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 7) {
            field_d = null;
        }
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Transmogrify.field_A ? 1 : 0;
        if (param0 == 14027) {
          var5 = 0;
          var6 = 7 & 8 + -(7 & (int)param1);
          var7 = 7 & ((rl) this).field_h;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          L0: while (true) {
            if (var11 < 0) {
              L1: while (true) {
                if (-9L <= (param1 ^ -1L)) {
                  L2: {
                    if (param1 > 0L) {
                      var8 = param2[var5] << var6 & 255;
                      ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], var8 >>> var7);
                      break L2;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    if (8L <= param1 + (long)var7) {
                      L4: {
                        param1 = param1 - (long)(-var7 + 8);
                        ((rl) this).field_h = ((rl) this).field_h + (-var7 + 8);
                        ((rl) this).field_a = ((rl) this).field_a + 1;
                        if (((rl) this).field_h == 512) {
                          this.a((byte) -94);
                          ((rl) this).field_a = 0;
                          ((rl) this).field_h = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((rl) this).field_j[((rl) this).field_a] = (byte)vg.c(255, var8 << -var7 + 8);
                      ((rl) this).field_h = ((rl) this).field_h + (int)param1;
                      break L3;
                    } else {
                      ((rl) this).field_h = (int)((long)((rl) this).field_h + param1);
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    var8 = 255 & param2[var5] << var6 | (255 & param2[1 + var5]) >>> -var6 + 8;
                    if (var8 < 0) {
                      break L5;
                    } else {
                      if (256 > var8) {
                        L6: {
                          ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], var8 >>> var7);
                          ((rl) this).field_h = ((rl) this).field_h + (-var7 + 8);
                          ((rl) this).field_a = ((rl) this).field_a + 1;
                          if (-513 != (((rl) this).field_h ^ -1)) {
                            break L6;
                          } else {
                            this.a((byte) -97);
                            ((rl) this).field_h = 0;
                            ((rl) this).field_a = 0;
                            break L6;
                          }
                        }
                        ((rl) this).field_j[((rl) this).field_a] = (byte)vg.c(var8 << 8 + -var7, 255);
                        var5++;
                        param1 = param1 - 8L;
                        ((rl) this).field_h = ((rl) this).field_h + var7;
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
              var12 = var12 + ((((rl) this).field_c[var11] & 255) - -(255 & (int)var9));
              ((rl) this).field_c[var11] = (byte)var12;
              var9 = var9 >>> 8;
              var12 = var12 >>> 8;
              var11--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], 128 >>> vg.c(((rl) this).field_h, 7));
          ((rl) this).field_a = ((rl) this).field_a + 1;
          if (-33 <= (((rl) this).field_a ^ -1)) {
            break L0;
          } else {
            L1: while (true) {
              if (((rl) this).field_a >= 64) {
                this.a((byte) -87);
                ((rl) this).field_a = 0;
                break L0;
              } else {
                ((rl) this).field_a = ((rl) this).field_a + 1;
                ((rl) this).field_j[((rl) this).field_a] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (-33 >= (((rl) this).field_a ^ -1)) {
            ji.a(((rl) this).field_c, 0, ((rl) this).field_j, 32, 32);
            this.a((byte) -119);
            var4 = 0;
            var5 = param2;
            if (param1 > 51) {
              L3: while (true) {
                if ((var4 ^ -1) <= -9) {
                  return;
                } else {
                  var6 = ((rl) this).field_e[var4];
                  param0[var5] = (byte)(int)(var6 >>> 764252024);
                  param0[1 + var5] = (byte)(int)(var6 >>> -740567376);
                  param0[2 + var5] = (byte)(int)(var6 >>> 1386401128);
                  param0[var5 + 3] = (byte)(int)(var6 >>> -2042330144);
                  param0[4 + var5] = (byte)(int)(var6 >>> 682001624);
                  param0[5 + var5] = (byte)(int)(var6 >>> -230296944);
                  param0[6 + var5] = (byte)(int)(var6 >>> -1223563576);
                  param0[7 + var5] = (byte)(int)var6;
                  var5 += 8;
                  var4++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            ((rl) this).field_a = ((rl) this).field_a + 1;
            ((rl) this).field_j[((rl) this).field_a] = (byte) 0;
            continue L2;
          }
        }
    }

    rl() {
        ((rl) this).field_h = 0;
        ((rl) this).field_b = new long[8];
        ((rl) this).field_f = new long[8];
        ((rl) this).field_j = new byte[64];
        ((rl) this).field_e = new long[8];
        ((rl) this).field_g = new long[8];
        ((rl) this).field_k = new long[8];
        ((rl) this).field_c = new byte[32];
        ((rl) this).field_a = 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((rl) this).field_c[var2] = (byte) 0;
        }
        ((rl) this).field_a = 0;
        ((rl) this).field_h = 0;
        ((rl) this).field_j[0] = (byte) 0;
        if (param0 != 15298) {
            ((rl) this).field_g = null;
        }
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            ((rl) this).field_e[var2] = 0L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
