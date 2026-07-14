/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private long[] field_b;
    private int field_i;
    private long[] field_d;
    private long[] field_g;
    private int field_h;
    private long[] field_l;
    private long[] field_a;
    static ok field_k;
    static nf field_e;
    private byte[] field_f;
    private byte[] field_c;
    static boolean field_j;

    final void a(long param0, int param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Confined.field_J ? 1 : 0;
        var5 = 0;
        var6 = param1 + -((int)param0 & 7) & 7;
        var7 = ((fd) this).field_h & 7;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if ((var11 ^ -1) > -1) {
            L1: while (true) {
              if (-9L <= (param0 ^ -1L)) {
                L2: {
                  if (0L < param0) {
                    var8 = 255 & param2[var5] << var6;
                    ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (((long)var7 + param0 ^ -1L) > -9L) {
                    ((fd) this).field_h = (int)((long)((fd) this).field_h + param0);
                    break L3;
                  } else {
                    L4: {
                      ((fd) this).field_h = ((fd) this).field_h + (-var7 + 8);
                      param0 = param0 - (long)(-var7 + 8);
                      ((fd) this).field_i = ((fd) this).field_i + 1;
                      if (512 != ((fd) this).field_h) {
                        break L4;
                      } else {
                        this.a(6704);
                        ((fd) this).field_i = 0;
                        ((fd) this).field_h = 0;
                        break L4;
                      }
                    }
                    ((fd) this).field_f[((fd) this).field_i] = (byte)va.a(var8 << -var7 + 8, 255);
                    ((fd) this).field_h = ((fd) this).field_h + (int)param0;
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param2[var5] << var6 | (param2[var5 - -1] & 255) >>> 8 - var6;
                  if (-1 < var8) {
                    break L5;
                  } else {
                    if (-257 > var8) {
                      L6: {
                        ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], var8 >>> var7);
                        ((fd) this).field_i = ((fd) this).field_i + 1;
                        ((fd) this).field_h = ((fd) this).field_h + (-var7 + 8);
                        if (((fd) this).field_h != 512) {
                          break L6;
                        } else {
                          this.a(6704);
                          ((fd) this).field_h = 0;
                          ((fd) this).field_i = 0;
                          break L6;
                        }
                      }
                      ((fd) this).field_f[((fd) this).field_i] = (byte)va.a(var8 << 8 + -var7, 255);
                      var5++;
                      ((fd) this).field_h = ((fd) this).field_h + var7;
                      param0 = param0 - 8L;
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
            var12 = var12 + (((int)var9 & 255) + (255 & ((fd) this).field_c[var11]));
            ((fd) this).field_c[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final static void c(byte param0) {
        if (param0 < 33) {
            fd.c((byte) 94);
        }
        ah.field_U = 0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_e = null;
        if (param0 >= -107) {
            fd.a((byte) -117);
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Confined.field_J ? 1 : 0;
          ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], 128 >>> va.a(((fd) this).field_h, 7));
          ((fd) this).field_i = ((fd) this).field_i + 1;
          if (32 >= ((fd) this).field_i) {
            break L0;
          } else {
            L1: while (true) {
              if ((((fd) this).field_i ^ -1) <= -65) {
                this.a(6704);
                ((fd) this).field_i = 0;
                break L0;
              } else {
                ((fd) this).field_i = ((fd) this).field_i + 1;
                ((fd) this).field_f[((fd) this).field_i] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((fd) this).field_i) {
            lj.a(((fd) this).field_c, 0, ((fd) this).field_f, 32, 32);
            this.a(param2 + 6701);
            var4 = 0;
            var5 = param1;
            L3: while (true) {
              if ((var4 ^ -1) <= -9) {
                L4: {
                  if (param2 == 3) {
                    break L4;
                  } else {
                    ((fd) this).field_f = null;
                    break L4;
                  }
                }
                return;
              } else {
                var6 = ((fd) this).field_g[var4];
                param0[var5] = (byte)(int)(var6 >>> 1947979512);
                param0[var5 + 1] = (byte)(int)(var6 >>> 196933296);
                param0[2 + var5] = (byte)(int)(var6 >>> -711917400);
                param0[var5 + 3] = (byte)(int)(var6 >>> 1167612512);
                param0[4 + var5] = (byte)(int)(var6 >>> -876856744);
                param0[5 + var5] = (byte)(int)(var6 >>> 349269200);
                param0[6 + var5] = (byte)(int)(var6 >>> -969066936);
                param0[var5 - -7] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L3;
              }
            }
          } else {
            ((fd) this).field_i = ((fd) this).field_i + 1;
            ((fd) this).field_f[((fd) this).field_i] = (byte) 0;
            continue L2;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                L2: {
                  if (param0 == 6704) {
                    break L2;
                  } else {
                    var7 = null;
                    ((fd) this).a(82L, -97, (byte[]) null);
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((fd) this).field_g[var2] = pa.a(((fd) this).field_g[var2], pa.a(((fd) this).field_b[var2], ((fd) this).field_d[var2]));
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
                          if (var3 >= 8) {
                            ((fd) this).field_l[0] = pa.a(((fd) this).field_l[0], ib.field_V[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((fd) this).field_b[var3] = ((fd) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fd) this).field_a[var3] = ((fd) this).field_l[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fd) this).field_a[var3] = pa.a(((fd) this).field_a[var3], ib.field_T[var8][va.a((int)(((fd) this).field_b[va.a(-var8 + var3, 7)] >>> var5), 255)]);
                                    var8++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fd) this).field_l[var3] = ((fd) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fd) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((fd) this).field_a[var3] = pa.a(((fd) this).field_a[var3], ib.field_T[var4][va.a(255, (int)(((fd) this).field_l[va.a(-var4 + var3, 7)] >>> var5))]);
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
                ((fd) this).field_l[var2] = ((fd) this).field_g[var2];
                ((fd) this).field_b[var2] = pa.a(((fd) this).field_d[var2], ((fd) this).field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fd) this).field_d[var2] = pa.a(kd.a((long)((fd) this).field_f[var3 - -7], 255L), pa.a(kd.a(65280L, (long)((fd) this).field_f[var3 - -6] << -709703928), pa.a(pa.a(kd.a((long)((fd) this).field_f[4 + var3], 255L) << -892733160, pa.a(pa.a(kd.a(255L, (long)((fd) this).field_f[2 + var3]) << -1184159064, pa.a(kd.a((long)((fd) this).field_f[1 + var3], 255L) << -230907792, (long)((fd) this).field_f[var3] << 1796608184)), kd.a(255L, (long)((fd) this).field_f[3 + var3]) << -1897262816)), kd.a(16711680L, (long)((fd) this).field_f[var3 - -5] << 799555088))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        fb.field_c = pm.field_B[param1];
        hc.field_s = ak.field_L[param1];
        b.field_k = th.field_eb[param1];
        if (param0 != 30177) {
            field_k = null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((fd) this).field_c[var2] = (byte) 0;
        }
        ((fd) this).field_i = 0;
        ((fd) this).field_h = 0;
        ((fd) this).field_f[0] = (byte) 0;
        var2 = 0;
        if (param0 >= -21) {
            return;
        }
        while (8 > var2) {
            ((fd) this).field_g[var2] = 0L;
            var2++;
        }
    }

    fd() {
        ((fd) this).field_i = 0;
        ((fd) this).field_h = 0;
        ((fd) this).field_l = new long[8];
        ((fd) this).field_b = new long[8];
        ((fd) this).field_g = new long[8];
        ((fd) this).field_a = new long[8];
        ((fd) this).field_d = new long[8];
        ((fd) this).field_c = new byte[32];
        ((fd) this).field_f = new byte[64];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new nf(640, 376);
        field_j = true;
    }
}
