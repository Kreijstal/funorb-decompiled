/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nf {
    static int[] field_i;
    static int field_l;
    private byte[] field_h;
    private int field_g;
    private long[] field_d;
    private long[] field_m;
    private byte[] field_f;
    private int field_j;
    static int field_e;
    private long[] field_n;
    static volatile boolean field_k;
    private long[] field_c;
    private long[] field_a;
    static int[] field_b;

    public static void b(int param0) {
        if (param0 >= -92) {
            return;
        }
        field_i = null;
        field_b = null;
    }

    final static void a(int param0, byte param1) {
        try {
            if (param1 != 95) {
                Object var3 = null;
                boolean discarded$0 = nf.a(true, (String) null, (String) null, 96, (String) null, 67, (kh) null);
            }
            if (null != m.field_b) {
                // if_icmpgt L68
                // if_acmpne L60
            } else {
                d.field_b.field_g = 0;
                return;
            }
            if (-1 == (d.field_b.field_g ^ -1)) {
                if (ca.field_Y + 10000L < dd.b(57)) {
                    d.field_b.d((byte) 88, param0);
                }
            }
            if (!(d.field_b.field_g <= 0)) {
                try {
                    m.field_b.a(0, d.field_b.field_f, (byte) 87, d.field_b.field_g);
                    ca.field_Y = dd.b(84);
                } catch (IOException iOException) {
                    ec.a((byte) 27);
                }
                d.field_b.field_g = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        L0: {
          ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], 128 >>> w.a(7, ((nf) this).field_j));
          if (param1 == 494486752) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          ((nf) this).field_g = ((nf) this).field_g + 1;
          if (((nf) this).field_g > 32) {
            L2: while (true) {
              if (64 <= ((nf) this).field_g) {
                this.a(true);
                ((nf) this).field_g = 0;
                break L1;
              } else {
                ((nf) this).field_g = ((nf) this).field_g + 1;
                ((nf) this).field_f[((nf) this).field_g] = (byte) 0;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: while (true) {
          if (((nf) this).field_g >= 32) {
            ug.a(((nf) this).field_h, 0, ((nf) this).field_f, 32, 32);
            this.a(true);
            var4 = 0;
            var5 = param0;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((nf) this).field_a[var4];
                param2[var5] = (byte)(int)(var6 >>> -1249875144);
                param2[1 + var5] = (byte)(int)(var6 >>> 54069936);
                param2[var5 - -2] = (byte)(int)(var6 >>> -1424676888);
                param2[3 + var5] = (byte)(int)(var6 >>> 1267807328);
                param2[var5 - -4] = (byte)(int)(var6 >>> 1516356760);
                param2[5 + var5] = (byte)(int)(var6 >>> -195518768);
                param2[6 + var5] = (byte)(int)(var6 >>> -1219853048);
                param2[var5 + 7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((nf) this).field_g = ((nf) this).field_g + 1;
            ((nf) this).field_f[((nf) this).field_g] = (byte) 0;
            continue L3;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 5) {
            return;
        }
        while (32 > var2) {
            ((nf) this).field_h[var2] = (byte) 0;
            var2++;
        }
        ((nf) this).field_g = 0;
        ((nf) this).field_j = 0;
        ((nf) this).field_f[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((nf) this).field_a[var2] = 0L;
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > var2) {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        nf.b(-86);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((nf) this).field_a[var2] = ba.a(((nf) this).field_a[var2], ba.a(((nf) this).field_m[var2], ((nf) this).field_c[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (-9 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            ((nf) this).field_n[0] = ba.a(((nf) this).field_n[0], lj.field_b[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((nf) this).field_m[var3] = ((nf) this).field_d[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((nf) this).field_d[var3] = ((nf) this).field_n[var3];
                                var6 = 0;
                                var4 = var6;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var6) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((nf) this).field_d[var3] = ba.a(((nf) this).field_d[var3], lj.field_e[var6][w.a((int)(((nf) this).field_m[w.a(var3 - var6, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var6++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((nf) this).field_n[var3] = ((nf) this).field_d[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((nf) this).field_d[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            ((nf) this).field_d[var3] = ba.a(((nf) this).field_d[var3], lj.field_e[var4][w.a(255, (int)(((nf) this).field_n[w.a(7, -var4 + var3)] >>> var5))]);
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
                ((nf) this).field_n[var2] = ((nf) this).field_a[var2];
                ((nf) this).field_m[var2] = ba.a(((nf) this).field_c[var2], ((nf) this).field_a[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((nf) this).field_c[var2] = ba.a(r.a((long)((nf) this).field_f[7 + var3], 255L), ba.a(r.a(65280L, (long)((nf) this).field_f[6 + var3] << -1946880504), ba.a(r.a(16711680L, (long)((nf) this).field_f[var3 + 5] << -1377662256), ba.a(r.a(255L, (long)((nf) this).field_f[var3 - -4]) << 1936316248, ba.a(r.a((long)((nf) this).field_f[3 + var3] << -1184631584, 1095216660480L), ba.a(ba.a(r.a((long)((nf) this).field_f[var3 + 1], 255L) << 1223911408, (long)((nf) this).field_f[var3] << -599053960), r.a((long)((nf) this).field_f[var3 + 2], 255L) << 1052869352))))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(boolean param0, String param1, String param2, int param3, String param4, int param5, kh param6) {
        if (uh.field_k != cl.field_k) {
            return false;
        }
        if (param5 != 0) {
            nf.b(124);
        }
        ok var8 = new ok(ti.field_b, param6);
        ti.field_b.a((byte) 72, (uj) (Object) var8);
        if (!dd.a((byte) 77)) {
            uh.field_k = jl.field_a;
            qb.field_a = param3;
            jl.field_c = param2;
            wj.field_c = param4;
            gj.field_a = null;
            lh.field_D = param1;
            sk.field_b = param0 ? true : false;
            return true;
        }
        var8.p(10341);
        return true;
    }

    final void a(long param0, int param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        var5 = 0;
        var6 = 7 & -((int)param0 & 7) + 8;
        var7 = ((nf) this).field_j & 7;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (-1 < (var11 ^ -1)) {
            L1: while (true) {
              if ((param0 ^ -1L) >= -9L) {
                L2: {
                  if (0L < param0) {
                    var8 = param2[var5] << var6 & 255;
                    ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (((long)var7 - -param0 ^ -1L) <= -9L) {
                    L4: {
                      ((nf) this).field_g = ((nf) this).field_g + 1;
                      ((nf) this).field_j = ((nf) this).field_j + (-var7 + 8);
                      param0 = param0 - (long)(8 + -var7);
                      if (((nf) this).field_j == 512) {
                        this.a(true);
                        ((nf) this).field_j = 0;
                        ((nf) this).field_g = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((nf) this).field_f[((nf) this).field_g] = (byte)w.a(255, var8 << -var7 + 8);
                    ((nf) this).field_j = ((nf) this).field_j + (int)param0;
                    break L3;
                  } else {
                    ((nf) this).field_j = (int)((long)((nf) this).field_j + param0);
                    break L3;
                  }
                }
                L5: {
                  if (param1 == 614) {
                    break L5;
                  } else {
                    var13 = null;
                    ((nf) this).a(-42L, -88, (byte[]) null);
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param2[var5] << var6 & 255 | (param2[1 + var5] & 255) >>> -var6 + 8;
                  if (var8 > -1) {
                    break L6;
                  } else {
                    if (-257 > var8) {
                      L7: {
                        ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], var8 >>> var7);
                        ((nf) this).field_g = ((nf) this).field_g + 1;
                        ((nf) this).field_j = ((nf) this).field_j + (8 + -var7);
                        if ((((nf) this).field_j ^ -1) == -513) {
                          this.a(true);
                          ((nf) this).field_g = 0;
                          ((nf) this).field_j = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((nf) this).field_f[((nf) this).field_g] = (byte)w.a(255, var8 << -var7 + 8);
                      var5++;
                      ((nf) this).field_j = ((nf) this).field_j + var7;
                      param0 = param0 - 8L;
                      continue L1;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + (((int)var9 & 255) + (((nf) this).field_h[var11] & 255));
            ((nf) this).field_h[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    nf() {
        ((nf) this).field_f = new byte[64];
        ((nf) this).field_j = 0;
        ((nf) this).field_h = new byte[32];
        ((nf) this).field_n = new long[8];
        ((nf) this).field_d = new long[8];
        ((nf) this).field_g = 0;
        ((nf) this).field_a = new long[8];
        ((nf) this).field_c = new long[8];
        ((nf) this).field_m = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
    }
}
