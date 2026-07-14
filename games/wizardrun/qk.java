/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_e;
    private long[] field_b;
    static oi field_g;
    private long[] field_c;
    static kl field_j;
    private int field_p;
    private long[] field_l;
    static String field_d;
    static String field_i;
    private long[] field_k;
    private long[] field_n;
    private byte[] field_m;
    private int field_a;
    static int[] field_f;
    private byte[] field_o;
    static String field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ec.field_c = param4;
        lc.field_a = param2;
        if (param3 != 1882) {
            qk.a((byte) 84);
        }
        ki.field_I = param1;
        si.field_f = param0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        long var6_long = 0L;
        int var8 = 0;
        L0: {
          var8 = wizardrun.field_H;
          ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], 128 >>> kl.b(7, ((qk) this).field_p));
          ((qk) this).field_a = ((qk) this).field_a + 1;
          if (((qk) this).field_a < -33) {
            L1: while (true) {
              if (-65 <= ((qk) this).field_a) {
                this.b(-42);
                ((qk) this).field_a = 0;
                break L0;
              } else {
                ((qk) this).field_a = ((qk) this).field_a + 1;
                ((qk) this).field_o[((qk) this).field_a] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (((qk) this).field_a >= 32) {
            g.a(((qk) this).field_m, 0, ((qk) this).field_o, 32, 32);
            this.b(-34);
            var4 = 0;
            var5 = param1;
            L3: while (true) {
              if (8 <= var4) {
                var6 = 88 / ((69 - param2) / 54);
                return;
              } else {
                var6_long = ((qk) this).field_l[var4];
                param0[var5] = (byte)(int)(var6_long >>> 1061438392);
                param0[1 + var5] = (byte)(int)(var6_long >>> 835982768);
                param0[2 + var5] = (byte)(int)(var6_long >>> 500545000);
                param0[3 + var5] = (byte)(int)(var6_long >>> -799877344);
                param0[4 + var5] = (byte)(int)(var6_long >>> 1527442008);
                param0[5 + var5] = (byte)(int)(var6_long >>> -781942384);
                param0[6 + var5] = (byte)(int)(var6_long >>> 44215304);
                param0[7 + var5] = (byte)(int)var6_long;
                var4++;
                var5 += 8;
                continue L3;
              }
            }
          } else {
            ((qk) this).field_a = ((qk) this).field_a + 1;
            ((qk) this).field_o[((qk) this).field_a] = (byte) 0;
            continue L2;
          }
        }
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        ne var7 = new ne(param2);
        ne var8 = new ne(param3);
        if (param5 != 0) {
            qk.a((byte) 13);
        }
        return qi.a(var7, var8, param0, param4, param1, param6, param5 ^ 27851);
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var3 = 107 % ((param0 - 19) / 44);
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((qk) this).field_l[var2] = da.a(((qk) this).field_l[var2], da.a(((qk) this).field_b[var2], ((qk) this).field_k[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((qk) this).field_n[0] = da.a(((qk) this).field_n[0], le.field_f[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (-9 >= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((qk) this).field_k[var3] = ((qk) this).field_c[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((qk) this).field_c[var3] = ((qk) this).field_n[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (-9 <= var7) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((qk) this).field_c[var3] = da.a(((qk) this).field_c[var3], le.field_A[var7][kl.b(255, (int)(((qk) this).field_k[kl.b(7, -var7 + var3)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((qk) this).field_n[var3] = ((qk) this).field_c[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((qk) this).field_c[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((qk) this).field_c[var3] = da.a(((qk) this).field_c[var3], le.field_A[var4][kl.b((int)(((qk) this).field_n[kl.b(7, var3 + -var4)] >>> var5), 255)]);
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
                ((qk) this).field_n[var2] = ((qk) this).field_l[var2];
                ((qk) this).field_k[var2] = da.a(((qk) this).field_b[var2], ((qk) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((qk) this).field_b[var2] = da.a(gf.a(255L, (long)((qk) this).field_o[var3 - -7]), da.a(gf.a((long)((qk) this).field_o[var3 - -6] << 1640923080, 65280L), da.a(da.a(gf.a((long)((qk) this).field_o[4 + var3] << 542607768, 4278190080L), da.a(da.a(da.a(gf.a((long)((qk) this).field_o[var3 - -1] << 77782640, 71776119061217280L), (long)((qk) this).field_o[var3] << -1355330440), gf.a(280375465082880L, (long)((qk) this).field_o[2 + var3] << -1219473176)), gf.a(255L, (long)((qk) this).field_o[var3 - -3]) << 855848352)), gf.a(16711680L, (long)((qk) this).field_o[var3 + 5] << 149784592))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_h = null;
        field_e = null;
        int var1 = -28 / ((-26 - param0) / 44);
    }

    final void a(long param0, byte[] param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = wizardrun.field_H;
          var5 = 0;
          if (param2 == -19) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        var6 = 8 - ((int)param0 & 7) & 7;
        var7 = ((qk) this).field_p & 7;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if ((var11 ^ -1) > -1) {
            L2: while (true) {
              if ((param0 ^ -1L) >= -9L) {
                L3: {
                  if (0L >= param0) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = 255 & param1[var5] << var6;
                    ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (8L <= param0 + (long)var7) {
                    L5: {
                      ((qk) this).field_a = ((qk) this).field_a + 1;
                      param0 = param0 - (long)(-var7 + 8);
                      ((qk) this).field_p = ((qk) this).field_p + (-var7 + 8);
                      if (((qk) this).field_p != 512) {
                        break L5;
                      } else {
                        this.b(86);
                        ((qk) this).field_a = 0;
                        ((qk) this).field_p = 0;
                        break L5;
                      }
                    }
                    ((qk) this).field_o[((qk) this).field_a] = (byte)kl.b(var8 << 8 + -var7, 255);
                    ((qk) this).field_p = ((qk) this).field_p + (int)param0;
                    break L4;
                  } else {
                    ((qk) this).field_p = (int)((long)((qk) this).field_p + param0);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param1[var5] << var6 | (param1[var5 - -1] & 255) >>> 8 - var6;
                  if ((var8 ^ -1) > -1) {
                    break L6;
                  } else {
                    if ((var8 ^ -1) <= -257) {
                      break L6;
                    } else {
                      L7: {
                        ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], var8 >>> var7);
                        ((qk) this).field_p = ((qk) this).field_p + (8 + -var7);
                        ((qk) this).field_a = ((qk) this).field_a + 1;
                        if (((qk) this).field_p != 512) {
                          break L7;
                        } else {
                          this.b(-111);
                          ((qk) this).field_p = 0;
                          ((qk) this).field_a = 0;
                          break L7;
                        }
                      }
                      ((qk) this).field_o[((qk) this).field_a] = (byte)kl.b(var8 << -var7 + 8, 255);
                      var5++;
                      ((qk) this).field_p = ((qk) this).field_p + var7;
                      param0 = param0 - 8L;
                      continue L2;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & ((qk) this).field_m[var11]) - -((int)var9 & 255));
            ((qk) this).field_m[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        for (var2 = 0; var2 < 32; var2++) {
            ((qk) this).field_m[var2] = (byte) 0;
        }
        ((qk) this).field_a = 0;
        ((qk) this).field_p = 0;
        ((qk) this).field_o[0] = (byte) 0;
        if (param0 < 56) {
            return;
        }
        for (var2 = 0; var2 < 8; var2++) {
            ((qk) this).field_l[var2] = 0L;
        }
    }

    qk() {
        ((qk) this).field_c = new long[8];
        ((qk) this).field_b = new long[8];
        ((qk) this).field_p = 0;
        ((qk) this).field_a = 0;
        ((qk) this).field_m = new byte[32];
        ((qk) this).field_k = new long[8];
        ((qk) this).field_o = new byte[64];
        ((qk) this).field_n = new long[8];
        ((qk) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading levels";
        field_d = "Password: ";
        field_i = "Music         ";
        field_h = "Create a free Account";
    }
}
