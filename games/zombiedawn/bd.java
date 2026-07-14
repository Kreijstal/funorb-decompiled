/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_b;
    private int field_g;
    private long[] field_o;
    private byte[] field_c;
    static cg field_q;
    private long[] field_p;
    private byte[] field_k;
    static vn[][] field_i;
    private long[] field_s;
    static boolean field_r;
    static String field_h;
    private long[] field_l;
    private long[] field_n;
    static int field_d;
    static jc field_m;
    static int field_e;
    static int field_j;
    static int field_f;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            if (w.field_a[param0] != null) {
                ph.a((byte) 68, w.field_a[param0]);
            }
        }
        if (!param1) {
            field_f = -57;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_h = null;
        field_m = null;
        if (!param0) {
            field_f = -27;
        }
        field_q = null;
    }

    final static void a(vn param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        if (0 == (3 & (param0.field_t | param0.field_w | param0.field_v | param0.field_x))) {
          return;
        } else {
          var2 = (3 & param0.field_v) + param0.field_w;
          if (!param1) {
            var2 = var2 + 4 + -(3 & var2);
            var3 = param0.field_t - -(param0.field_x & 3);
            var3 = var3 + (4 - (var3 & 3));
            var4 = new int[var3 * var2];
            var5 = 0;
            var6 = var2 * (3 & param0.field_x) + (param0.field_v & 3);
            var7 = 0;
            L0: while (true) {
              if (var7 >= param0.field_t) {
                param0.field_z = var4;
                param0.field_w = var2;
                param0.field_v = param0.field_v & -4;
                param0.field_x = param0.field_x & -4;
                param0.field_t = var3;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (var8 >= param0.field_w) {
                    var6 = var6 + (-param0.field_w + var2);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param0.field_z[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        ei.field_G[46] = 72;
        ei.field_G[222] = 58;
        ei.field_G[520] = 59;
        ei.field_G[192] = 28;
        ei.field_G[47] = 73;
        ei.field_G[61] = 27;
        int var1 = 117 % ((-3 - param0) / 59);
        ei.field_G[44] = 71;
        ei.field_G[93] = 43;
        ei.field_G[92] = 74;
        ei.field_G[59] = 57;
        ei.field_G[45] = 26;
        ei.field_G[91] = 42;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        for (var2 = 0; 32 > var2; var2++) {
            ((bd) this).field_c[var2] = (byte) 0;
        }
        if (param0 != 71) {
            field_h = null;
        }
        ((bd) this).field_b = 0;
        ((bd) this).field_k[0] = (byte) 0;
        ((bd) this).field_g = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((bd) this).field_o[var2] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          ((bd) this).field_k[((bd) this).field_g] = (byte)hi.a((int) ((bd) this).field_k[((bd) this).field_g], 128 >>> eg.a(((bd) this).field_b, 7));
          ((bd) this).field_g = ((bd) this).field_g + 1;
          if (param2 <= -118) {
            break L0;
          } else {
            this.b(-71);
            break L0;
          }
        }
        L1: {
          if (((bd) this).field_g <= 32) {
            break L1;
          } else {
            L2: while (true) {
              if (((bd) this).field_g >= 64) {
                this.b(-9);
                ((bd) this).field_g = 0;
                break L1;
              } else {
                ((bd) this).field_g = ((bd) this).field_g + 1;
                ((bd) this).field_k[((bd) this).field_g] = (byte) 0;
                continue L2;
              }
            }
          }
        }
        L3: while (true) {
          if ((((bd) this).field_g ^ -1) <= -33) {
            gp.a(((bd) this).field_c, 0, ((bd) this).field_k, 32, 32);
            this.b(-9);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((bd) this).field_o[var4];
                param0[var5] = (byte)(int)(var6 >>> -838186120);
                param0[1 + var5] = (byte)(int)(var6 >>> 105566000);
                param0[2 + var5] = (byte)(int)(var6 >>> -57984344);
                param0[var5 + 3] = (byte)(int)(var6 >>> -1335309856);
                param0[4 + var5] = (byte)(int)(var6 >>> 393038744);
                param0[5 + var5] = (byte)(int)(var6 >>> -1238881904);
                param0[6 + var5] = (byte)(int)(var6 >>> -250985336);
                param0[var5 + 7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((bd) this).field_g = ((bd) this).field_g + 1;
            ((bd) this).field_k[((bd) this).field_g] = (byte) 0;
            continue L3;
          }
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        if (param1 != 9082) {
            field_d = 87;
        }
        int var2 = param0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (160 > var2) {
                var3 = fj.field_h[-128 + var2];
                if (0 == var3) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                L2: {
                  if (param0 == -9) {
                    break L2;
                  } else {
                    ((bd) this).a(-68);
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (10 < var2) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((bd) this).field_o[var2] = al.a(((bd) this).field_o[var2], al.a(((bd) this).field_p[var2], ((bd) this).field_s[var2]));
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
                            ((bd) this).field_l[0] = al.a(((bd) this).field_l[0], bn.field_g[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((bd) this).field_p[var3] = ((bd) this).field_n[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((bd) this).field_n[var3] = ((bd) this).field_l[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((bd) this).field_n[var3] = al.a(((bd) this).field_n[var3], bn.field_h[var7][eg.a((int)(((bd) this).field_p[eg.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bd) this).field_l[var3] = ((bd) this).field_n[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((bd) this).field_n[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((bd) this).field_n[var3] = al.a(((bd) this).field_n[var3], bn.field_h[var4][eg.a(255, (int)(((bd) this).field_l[eg.a(-var4 + var3, 7)] >>> var5))]);
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
                ((bd) this).field_l[var2] = ((bd) this).field_o[var2];
                ((bd) this).field_p[var2] = al.a(((bd) this).field_s[var2], ((bd) this).field_o[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bd) this).field_s[var2] = al.a(gj.a((long)((bd) this).field_k[7 + var3], 255L), al.a(al.a(al.a(al.a(gj.a((long)((bd) this).field_k[3 + var3], 255L) << 911947296, al.a(al.a(gj.a((long)((bd) this).field_k[1 + var3], 255L) << 1896266608, (long)((bd) this).field_k[var3] << -1562700104), gj.a((long)((bd) this).field_k[2 + var3], 255L) << 285159720)), gj.a((long)((bd) this).field_k[4 + var3], 255L) << 2049451480), gj.a(16711680L, (long)((bd) this).field_k[5 + var3] << -2076968816)), gj.a(65280L, (long)((bd) this).field_k[6 + var3] << -1163883576)));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final void a(boolean param0, byte[] param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        var5 = 0;
        var6 = 7 & -(7 & (int)param2) + 8;
        var7 = ((bd) this).field_b & 7;
        var9 = param2;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (0 > var11) {
            L1: while (true) {
              if (-9L <= (param2 ^ -1L)) {
                L2: {
                  if ((param2 ^ -1L) < -1L) {
                    var8 = 255 & param1[var5] << var6;
                    ((bd) this).field_k[((bd) this).field_g] = (byte)hi.a((int) ((bd) this).field_k[((bd) this).field_g], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (param0) {
                    break L3;
                  } else {
                    ((bd) this).field_l = null;
                    break L3;
                  }
                }
                L4: {
                  if (8L <= (long)var7 + param2) {
                    L5: {
                      ((bd) this).field_b = ((bd) this).field_b + (8 + -var7);
                      ((bd) this).field_g = ((bd) this).field_g + 1;
                      param2 = param2 - (long)(8 + -var7);
                      if (((bd) this).field_b != 512) {
                        break L5;
                      } else {
                        this.b(-9);
                        ((bd) this).field_g = 0;
                        ((bd) this).field_b = 0;
                        break L5;
                      }
                    }
                    ((bd) this).field_k[((bd) this).field_g] = (byte)eg.a(255, var8 << 8 + -var7);
                    ((bd) this).field_b = ((bd) this).field_b + (int)param2;
                    break L4;
                  } else {
                    ((bd) this).field_b = (int)((long)((bd) this).field_b + param2);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param1[var5] << var6 & 255 | (255 & param1[var5 + 1]) >>> -var6 + 8;
                  if (var8 < 0) {
                    break L6;
                  } else {
                    if ((var8 ^ -1) <= -257) {
                      break L6;
                    } else {
                      L7: {
                        ((bd) this).field_k[((bd) this).field_g] = (byte)hi.a((int) ((bd) this).field_k[((bd) this).field_g], var8 >>> var7);
                        ((bd) this).field_g = ((bd) this).field_g + 1;
                        ((bd) this).field_b = ((bd) this).field_b + (-var7 + 8);
                        if ((((bd) this).field_b ^ -1) != -513) {
                          break L7;
                        } else {
                          this.b(-9);
                          ((bd) this).field_b = 0;
                          ((bd) this).field_g = 0;
                          break L7;
                        }
                      }
                      ((bd) this).field_k[((bd) this).field_g] = (byte)eg.a(var8 << -var7 + 8, 255);
                      ((bd) this).field_b = ((bd) this).field_b + var7;
                      var5++;
                      param2 = param2 - 8L;
                      continue L1;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & ((bd) this).field_c[var11]) + (255 & (int)var9));
            ((bd) this).field_c[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    bd() {
        ((bd) this).field_o = new long[8];
        ((bd) this).field_p = new long[8];
        ((bd) this).field_b = 0;
        ((bd) this).field_g = 0;
        ((bd) this).field_c = new byte[32];
        ((bd) this).field_k = new byte[64];
        ((bd) this).field_s = new long[8];
        ((bd) this).field_l = new long[8];
        ((bd) this).field_n = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new vn[2][];
        field_h = "Apply";
        field_r = true;
        field_q = new cg(10, 2, 2, 0);
        field_m = null;
        field_e = 640;
        field_d = field_e / 2;
        field_f = 2;
        field_a = 2 + field_e / 24;
    }
}
