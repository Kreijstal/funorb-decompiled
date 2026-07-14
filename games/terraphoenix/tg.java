/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private byte[] field_b;
    static ci field_e;
    private int field_i;
    static boolean[] field_c;
    private long[] field_g;
    private int field_f;
    private long[] field_j;
    private long[] field_a;
    private long[] field_k;
    static String field_h;
    private long[] field_d;
    private byte[] field_m;
    static int field_l;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 != -31201) {
            Object var4 = null;
            this.a((byte) 63, 54L, (byte[]) null);
        }
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((tg) this).field_m[var2] = (byte) 0;
        }
        ((tg) this).field_i = 0;
        ((tg) this).field_f = 0;
        ((tg) this).field_b[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((tg) this).field_k[var2] = 0L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Terraphoenix.field_V;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var3 = 102 / ((param0 - 85) / 38);
                    var2 = 0;
                    L3: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((tg) this).field_k[var2] = fb.a(((tg) this).field_k[var2], fb.a(((tg) this).field_g[var2], ((tg) this).field_a[var2]));
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
                          if (var3 >= 8) {
                            ((tg) this).field_j[0] = fb.a(((tg) this).field_j[0], fb.field_m[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((tg) this).field_g[var3] = ((tg) this).field_d[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((tg) this).field_d[var3] = ((tg) this).field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if ((var7 ^ -1) <= -9) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((tg) this).field_d[var3] = fb.a(((tg) this).field_d[var3], fb.field_n[var7][dg.a(255, (int)(((tg) this).field_g[dg.a(7, -var7 + var3)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((tg) this).field_j[var3] = ((tg) this).field_d[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((tg) this).field_d[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((tg) this).field_d[var3] = fb.a(((tg) this).field_d[var3], fb.field_n[var4][dg.a(255, (int)(((tg) this).field_j[dg.a(var3 - var4, 7)] >>> var5))]);
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
                ((tg) this).field_j[var2] = ((tg) this).field_k[var2];
                ((tg) this).field_g[var2] = fb.a(((tg) this).field_a[var2], ((tg) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((tg) this).field_a[var2] = fb.a(fb.a(fb.a(fb.a(wj.a(255L, (long)((tg) this).field_b[4 + var3]) << 792141400, fb.a(wj.a((long)((tg) this).field_b[var3 - -3] << -2037640864, 1095216660480L), fb.a(wj.a((long)((tg) this).field_b[2 + var3] << 1190530920, 280375465082880L), fb.a(wj.a((long)((tg) this).field_b[1 + var3], 255L) << -393618448, (long)((tg) this).field_b[var3] << -1799564552)))), wj.a((long)((tg) this).field_b[var3 + 5], 255L) << -495775984), wj.a(65280L, (long)((tg) this).field_b[6 + var3] << -392715192)), wj.a(255L, (long)((tg) this).field_b[var3 + 7]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Terraphoenix.field_V;
          ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], 128 >>> dg.a(((tg) this).field_f, 7));
          ((tg) this).field_i = ((tg) this).field_i + 1;
          if (-33 > (((tg) this).field_i ^ -1)) {
            L1: while (true) {
              if (64 <= ((tg) this).field_i) {
                this.a((byte) -17);
                ((tg) this).field_i = 0;
                break L0;
              } else {
                ((tg) this).field_i = ((tg) this).field_i + 1;
                ((tg) this).field_b[((tg) this).field_i] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if ((((tg) this).field_i ^ -1) <= -33) {
            L3: {
              ka.a(((tg) this).field_m, 0, ((tg) this).field_b, 32, 32);
              this.a((byte) -67);
              if (param1 == 4) {
                break L3;
              } else {
                this.a((byte) -79);
                break L3;
              }
            }
            var4 = 0;
            var5 = param0;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((tg) this).field_k[var4];
                param2[var5] = (byte)(int)(var6 >>> -346335112);
                param2[var5 + 1] = (byte)(int)(var6 >>> -1886621584);
                param2[var5 + 2] = (byte)(int)(var6 >>> -180057048);
                param2[var5 - -3] = (byte)(int)(var6 >>> -1406470432);
                param2[4 + var5] = (byte)(int)(var6 >>> 1613417048);
                param2[5 + var5] = (byte)(int)(var6 >>> 90317840);
                param2[var5 + 6] = (byte)(int)(var6 >>> -1788512888);
                param2[7 + var5] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            ((tg) this).field_i = ((tg) this).field_i + 1;
            ((tg) this).field_b[((tg) this).field_i] = (byte) 0;
            continue L2;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        if (param0 < 10) {
            field_h = null;
        }
    }

    private final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Terraphoenix.field_V;
        var5 = 0;
        var6 = 7 & -((int)param1 & 7) + 8;
        var7 = 7 & ((tg) this).field_f;
        var9 = param1;
        var11 = 37 % ((param0 - -35) / 47);
        var12 = 31;
        var13 = 0;
        L0: while (true) {
          if (var12 < 0) {
            L1: while (true) {
              if ((param1 ^ -1L) >= -9L) {
                L2: {
                  if (-1L <= (param1 ^ -1L)) {
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = 255 & param2[var5] << var6;
                    ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], var8 >>> var7);
                    break L2;
                  }
                }
                L3: {
                  if (((long)var7 + param1 ^ -1L) <= -9L) {
                    L4: {
                      ((tg) this).field_i = ((tg) this).field_i + 1;
                      ((tg) this).field_f = ((tg) this).field_f + (-var7 + 8);
                      param1 = param1 - (long)(8 - var7);
                      if (512 == ((tg) this).field_f) {
                        this.a((byte) -101);
                        ((tg) this).field_i = 0;
                        ((tg) this).field_f = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((tg) this).field_b[((tg) this).field_i] = (byte)dg.a(255, var8 << -var7 + 8);
                    ((tg) this).field_f = ((tg) this).field_f + (int)param1;
                    break L3;
                  } else {
                    ((tg) this).field_f = (int)((long)((tg) this).field_f + param1);
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = param2[var5] << var6 & 255 | (255 & param2[var5 - -1]) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L5;
                  } else {
                    if (var8 < 256) {
                      L6: {
                        ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], var8 >>> var7);
                        ((tg) this).field_i = ((tg) this).field_i + 1;
                        ((tg) this).field_f = ((tg) this).field_f + (-var7 + 8);
                        if (-513 != (((tg) this).field_f ^ -1)) {
                          break L6;
                        } else {
                          this.a((byte) 7);
                          ((tg) this).field_f = 0;
                          ((tg) this).field_i = 0;
                          break L6;
                        }
                      }
                      ((tg) this).field_b[((tg) this).field_i] = (byte)dg.a(var8 << -var7 + 8, 255);
                      param1 = param1 - 8L;
                      ((tg) this).field_f = ((tg) this).field_f + var7;
                      var5++;
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
            var13 = var13 + (((int)var9 & 255) + (((tg) this).field_m[var12] & 255));
            ((tg) this).field_m[var12] = (byte)var13;
            var13 = var13 >>> 8;
            var9 = var9 >>> 8;
            var12--;
            continue L0;
          }
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Terraphoenix.field_V;
        if (0 >= param2) {
            var4 = param0;
        } else {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
                var8[var5_int] = param0[var5_int + param2];
            }
        }
        tg var5 = new tg();
        var5.a(param3 + -31209);
        var5.a((byte) 104, (long)(param3 * param1), var4);
        byte[] var6 = new byte[64];
        var5.a(0, 4, var6);
        return var6;
    }

    private tg() {
        ((tg) this).field_b = new byte[64];
        ((tg) this).field_i = 0;
        ((tg) this).field_f = 0;
        ((tg) this).field_j = new long[8];
        ((tg) this).field_a = new long[8];
        ((tg) this).field_g = new long[8];
        ((tg) this).field_d = new long[8];
        ((tg) this).field_k = new long[8];
        ((tg) this).field_m = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new boolean[64];
        field_h = "Your email address is used to identify this account";
    }
}
