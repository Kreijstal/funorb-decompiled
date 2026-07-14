/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_a;
    private long[] field_d;
    private byte[] field_f;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_j;
    private long[] field_l;
    private long[] field_i;
    static int field_b;
    private int field_e;
    static String field_c;
    private int field_g;

    final static void b(int param0) {
        if (param0 != 18444) {
            return;
        }
        if (uga.field_d) {
            fea.a(-1);
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], 128 >>> dla.a(((fj) this).field_e, 7));
          ((fj) this).field_g = ((fj) this).field_g + 1;
          if (param2 > 37) {
            break L0;
          } else {
            fj.b(-1);
            break L0;
          }
        }
        L1: {
          if (32 < ((fj) this).field_g) {
            L2: while (true) {
              if (-65 >= (((fj) this).field_g ^ -1)) {
                this.a((byte) 66);
                ((fj) this).field_g = 0;
                break L1;
              } else {
                ((fj) this).field_g = ((fj) this).field_g + 1;
                ((fj) this).field_f[((fj) this).field_g] = (byte) 0;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: while (true) {
          if (-33 >= (((fj) this).field_g ^ -1)) {
            cua.a(((fj) this).field_k, 0, ((fj) this).field_f, 32, 32);
            this.a((byte) 66);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((fj) this).field_l[var4];
                param0[var5] = (byte)(int)(var6 >>> 411123000);
                param0[1 + var5] = (byte)(int)(var6 >>> -2044012368);
                param0[2 + var5] = (byte)(int)(var6 >>> 504499880);
                param0[var5 - -3] = (byte)(int)(var6 >>> -1570881184);
                param0[var5 + 4] = (byte)(int)(var6 >>> 1661104152);
                param0[var5 - -5] = (byte)(int)(var6 >>> -633834480);
                param0[6 + var5] = (byte)(int)(var6 >>> -682044024);
                param0[7 + var5] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            ((fj) this).field_g = ((fj) this).field_g + 1;
            ((fj) this).field_f[((fj) this).field_g] = (byte) 0;
            continue L3;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != -88) {
            ((fj) this).field_k = null;
        }
        for (var2 = 0; var2 < 32; var2++) {
            ((fj) this).field_k[var2] = (byte) 0;
        }
        ((fj) this).field_g = 0;
        ((fj) this).field_e = 0;
        ((fj) this).field_f[0] = (byte) 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((fj) this).field_l[var2] = 0L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            L1: {
              if (param0 == 66) {
                break L1;
              } else {
                this.a((byte) -86);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L3: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((fj) this).field_l[var2] = ihb.a(((fj) this).field_l[var2], ihb.a(((fj) this).field_j[var2], ((fj) this).field_d[var2]));
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
                          if (8 <= var3) {
                            ((fj) this).field_i[0] = ihb.a(((fj) this).field_i[0], gp.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((fj) this).field_d[var3] = ((fj) this).field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fj) this).field_h[var3] = ((fj) this).field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fj) this).field_h[var3] = ihb.a(((fj) this).field_h[var3], gp.field_r[var7][dla.a(255, (int)(((fj) this).field_d[dla.a(var3 + -var7, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fj) this).field_i[var3] = ((fj) this).field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fj) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((fj) this).field_h[var3] = ihb.a(((fj) this).field_h[var3], gp.field_r[var4][dla.a(255, (int)(((fj) this).field_i[dla.a(-var4 + var3, 7)] >>> var5))]);
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
                ((fj) this).field_i[var2] = ((fj) this).field_l[var2];
                ((fj) this).field_d[var2] = ihb.a(((fj) this).field_j[var2], ((fj) this).field_l[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((fj) this).field_j[var2] = ihb.a(ihb.a(hoa.a(255L, (long)((fj) this).field_f[6 + var3]) << 2087682312, ihb.a(hoa.a(255L, (long)((fj) this).field_f[5 + var3]) << 1248134288, ihb.a(hoa.a(255L, (long)((fj) this).field_f[4 + var3]) << 1291497112, ihb.a(hoa.a(255L, (long)((fj) this).field_f[3 + var3]) << -2010847392, ihb.a(hoa.a(280375465082880L, (long)((fj) this).field_f[var3 + 2] << 1646289704), ihb.a(hoa.a((long)((fj) this).field_f[1 + var3], 255L) << 2071146736, (long)((fj) this).field_f[var3] << -1726098824)))))), hoa.a((long)((fj) this).field_f[var3 - -7], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            fj.a(-54);
        }
        field_c = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          var5 = 0;
          var6 = 7 & 8 - (7 & (int)param2);
          var7 = ((fj) this).field_e & 7;
          var9 = param2;
          var11 = 31;
          if (param1 == -7) {
            break L0;
          } else {
            field_b = 81;
            break L0;
          }
        }
        var12 = 0;
        L1: while (true) {
          if (var11 < 0) {
            L2: while (true) {
              if (-9L <= (param2 ^ -1L)) {
                L3: {
                  if ((param2 ^ -1L) < -1L) {
                    var8 = param0[var5] << var6 & 255;
                    ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if ((param2 + (long)var7 ^ -1L) <= -9L) {
                    L5: {
                      param2 = param2 - (long)(-var7 + 8);
                      ((fj) this).field_e = ((fj) this).field_e + (8 - var7);
                      ((fj) this).field_g = ((fj) this).field_g + 1;
                      if ((((fj) this).field_e ^ -1) == -513) {
                        this.a((byte) 66);
                        ((fj) this).field_g = 0;
                        ((fj) this).field_e = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((fj) this).field_f[((fj) this).field_g] = (byte)dla.a(255, var8 << 8 + -var7);
                    ((fj) this).field_e = ((fj) this).field_e + (int)param2;
                    break L4;
                  } else {
                    ((fj) this).field_e = (int)((long)((fj) this).field_e + param2);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param0[var5] << var6 | (255 & param0[1 + var5]) >>> 8 + -var6;
                  if (-1 < var8) {
                    break L6;
                  } else {
                    if (-257 > var8) {
                      L7: {
                        ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], var8 >>> var7);
                        ((fj) this).field_g = ((fj) this).field_g + 1;
                        ((fj) this).field_e = ((fj) this).field_e + (8 + -var7);
                        if (((fj) this).field_e == 512) {
                          this.a((byte) 66);
                          ((fj) this).field_e = 0;
                          ((fj) this).field_g = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((fj) this).field_f[((fj) this).field_g] = (byte)dla.a(var8 << -var7 + 8, 255);
                      ((fj) this).field_e = ((fj) this).field_e + var7;
                      var5++;
                      param2 = param2 - 8L;
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
            var12 = var12 + ((255 & ((fj) this).field_k[var11]) + (255 & (int)var9));
            ((fj) this).field_k[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    fj() {
        ((fj) this).field_d = new long[8];
        ((fj) this).field_l = new long[8];
        ((fj) this).field_i = new long[8];
        ((fj) this).field_h = new long[8];
        ((fj) this).field_g = 0;
        ((fj) this).field_k = new byte[32];
        ((fj) this).field_f = new byte[64];
        ((fj) this).field_e = 0;
        ((fj) this).field_j = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email: ";
        field_b = 1;
        field_c = "Add map zone";
    }
}
