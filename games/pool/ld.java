/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_f;
    private byte[] field_a;
    private long[] field_o;
    static int field_c;
    static String field_h;
    static int field_g;
    private long[] field_e;
    private int field_k;
    private int field_j;
    static String field_i;
    private long[] field_l;
    private long[] field_m;
    private long[] field_n;
    private byte[] field_d;
    static int field_b;

    final void a(byte[] param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Pool.field_O;
          ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], 128 >>> rb.b(((ld) this).field_j, 7));
          ((ld) this).field_k = ((ld) this).field_k + 1;
          if (((ld) this).field_k <= 32) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 >= (((ld) this).field_k ^ -1)) {
                this.b(125);
                ((ld) this).field_k = 0;
                break L0;
              } else {
                int fieldTemp$2 = ((ld) this).field_k;
                ((ld) this).field_k = ((ld) this).field_k + 1;
                ((ld) this).field_a[fieldTemp$2] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (((ld) this).field_k >= 32) {
            L3: {
              qn.a(((ld) this).field_d, 0, ((ld) this).field_a, 32, 32);
              this.b(124);
              if (param1 > 97) {
                break L3;
              } else {
                ((ld) this).a((byte[]) null, -112, 52L);
                break L3;
              }
            }
            var4 = 0;
            var5 = param2;
            L4: while (true) {
              if (8 <= var4) {
                return;
              } else {
                var6 = ((ld) this).field_o[var4];
                param0[var5] = (byte)(int)(var6 >>> -1312186120);
                param0[1 + var5] = (byte)(int)(var6 >>> -1952948496);
                param0[var5 + 2] = (byte)(int)(var6 >>> 72860200);
                param0[3 + var5] = (byte)(int)(var6 >>> -1001506720);
                param0[var5 - -4] = (byte)(int)(var6 >>> 172481240);
                param0[5 + var5] = (byte)(int)(var6 >>> 2128842704);
                param0[var5 - -6] = (byte)(int)(var6 >>> 1386464776);
                param0[7 + var5] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((ld) this).field_k;
            ((ld) this).field_k = ((ld) this).field_k + 1;
            ((ld) this).field_a[fieldTemp$3] = (byte) 0;
            continue L2;
          }
        }
    }

    final static void a(byte param0) {
        if (em.field_P > 0) {
            em.field_P = em.field_P - 1;
        }
        if (sh.field_P.field_k != cb.field_g) {
            fd.field_J = fd.field_J + (sh.field_P.field_k + -cb.field_g);
            cb.field_g = sh.field_P.field_k;
        }
        int var1 = 37 / ((param0 - -53) / 53);
        if (0 < em.field_P) {
            wa.l(23323);
        }
    }

    final static qp a(byte param0, vh param1, int[] param2, vh param3, vh param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        qp[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        ap var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Throwable decompiledCaughtException = null;
        var12 = Pool.field_O;
        var5 = param2.length;
        var6 = new String[var5];
        var14 = new char[var5];
        var13 = var14;
        var7 = var13;
        var8 = new qp[var5];
        var9 = 49;
        try {
          L0: {
            L1: {
              if (param0 == 92) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var10_int = 0;
            L2: while (true) {
              if (var5 <= var10_int) {
                break L0;
              } else {
                var11 = o.field_x.a(127, param2[var10_int]);
                var6[var10_int] = var11.e(0);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = (Exception) (Object) decompiledCaughtException;
          return null;
        }
        return new qp(0L, param1, param3, param4, var8, param2, var6, var14);
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
        var13 = Pool.field_O;
        var5 = param1;
        var6 = 7 & 8 - ((int)param2 & 7);
        var7 = ((ld) this).field_j & 7;
        var9 = param2;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (var11 < 0) {
            L1: while (true) {
              if ((param2 ^ -1L) >= -9L) {
                L2: {
                  if (-1L > (param2 ^ -1L)) {
                    var8 = param0[var5] << var6 & 255;
                    ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (-9L >= (param2 + (long)var7 ^ -1L)) {
                    L4: {
                      param2 = param2 - (long)(8 - var7);
                      ((ld) this).field_k = ((ld) this).field_k + 1;
                      ((ld) this).field_j = ((ld) this).field_j + (8 - var7);
                      if (-513 != (((ld) this).field_j ^ -1)) {
                        break L4;
                      } else {
                        this.b(param1 ^ 120);
                        ((ld) this).field_j = 0;
                        ((ld) this).field_k = 0;
                        break L4;
                      }
                    }
                    ((ld) this).field_a[((ld) this).field_k] = (byte)rb.b(var8 << -var7 + 8, 255);
                    ((ld) this).field_j = ((ld) this).field_j + (int)param2;
                    break L3;
                  } else {
                    ((ld) this).field_j = (int)((long)((ld) this).field_j + param2);
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param0[var5] << var6 | (param0[1 + var5] & 255) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L5;
                  } else {
                    if (256 > var8) {
                      L6: {
                        ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], var8 >>> var7);
                        ((ld) this).field_k = ((ld) this).field_k + 1;
                        ((ld) this).field_j = ((ld) this).field_j + (8 + -var7);
                        if (512 == ((ld) this).field_j) {
                          this.b(119);
                          ((ld) this).field_k = 0;
                          ((ld) this).field_j = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((ld) this).field_a[((ld) this).field_k] = (byte)rb.b(var8 << 8 + -var7, 255);
                      ((ld) this).field_j = ((ld) this).field_j + var7;
                      param2 = param2 - 8L;
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
            var12 = var12 + (((int)var9 & 255) + (255 & ((ld) this).field_d[var11]));
            ((ld) this).field_d[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        for (var2 = 0; var2 < 32; var2++) {
            ((ld) this).field_d[var2] = (byte) 0;
        }
        ((ld) this).field_a[0] = (byte) 0;
        ((ld) this).field_j = 0;
        ((ld) this).field_k = 0;
        var2 = 0;
        if (param0) {
            ((ld) this).field_m = null;
        }
        while (-9 < (var2 ^ -1)) {
            ((ld) this).field_o[var2] = 0L;
            var2++;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Pool.field_O;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    L3: {
                      if (param0 > 103) {
                        break L3;
                      } else {
                        ((ld) this).field_e = null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((ld) this).field_o[var2] = im.a(((ld) this).field_o[var2], im.a(((ld) this).field_l[var2], ((ld) this).field_n[var2]));
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
                            ((ld) this).field_m[0] = im.a(((ld) this).field_m[0], n.field_Z[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ld) this).field_l[var3] = ((ld) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ld) this).field_e[var3] = ((ld) this).field_m[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var7 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ld) this).field_e[var3] = im.a(((ld) this).field_e[var3], n.field_N[var7][rb.b(255, (int)(((ld) this).field_l[rb.b(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ld) this).field_m[var3] = ((ld) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ld) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((ld) this).field_e[var3] = im.a(((ld) this).field_e[var3], n.field_N[var4][rb.b((int)(((ld) this).field_m[rb.b(7, var3 + -var4)] >>> var5), 255)]);
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
                ((ld) this).field_m[var2] = ((ld) this).field_o[var2];
                ((ld) this).field_l[var2] = im.a(((ld) this).field_n[var2], ((ld) this).field_o[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ld) this).field_n[var2] = im.a(mj.a((long)((ld) this).field_a[7 + var3], 255L), im.a(im.a(mj.a((long)((ld) this).field_a[var3 - -5], 255L) << 2126888848, im.a(mj.a((long)((ld) this).field_a[var3 - -4], 255L) << -1270663720, im.a(im.a(im.a(mj.a((long)((ld) this).field_a[1 + var3] << -210429904, 71776119061217280L), (long)((ld) this).field_a[var3] << 2142738104), mj.a((long)((ld) this).field_a[2 + var3], 255L) << -1746346136), mj.a(1095216660480L, (long)((ld) this).field_a[3 + var3] << -1019823648)))), mj.a(65280L, (long)((ld) this).field_a[var3 - -6] << 1759389576)));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_g = 75;
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 != 8) {
            field_b = 119;
        }
        field_i = null;
        field_f = null;
        field_h = null;
    }

    ld() {
        ((ld) this).field_a = new byte[64];
        ((ld) this).field_o = new long[8];
        ((ld) this).field_k = 0;
        ((ld) this).field_l = new long[8];
        ((ld) this).field_n = new long[8];
        ((ld) this).field_j = 0;
        ((ld) this).field_e = new long[8];
        ((ld) this).field_m = new long[8];
        ((ld) this).field_d = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Stripes";
        field_i = "You need a rating of <%1> to play with the current options.";
        field_c = 0;
        field_f = "Pause Menu";
    }
}
