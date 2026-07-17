/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static boolean[] field_m;
    static String field_O;
    short[] field_I;
    int[] field_R;
    short[] field_D;
    short[] field_k;
    short[] field_N;
    int field_t;
    int[] field_P;
    int[] field_M;
    short[] field_l;
    int field_b;
    int[] field_v;
    short[] field_o;
    short[] field_p;
    static boolean field_r;
    int[] field_y;
    int[] field_H;
    short[] field_J;
    short[] field_L;
    static double[] field_G;
    int field_g;
    short field_a;
    byte field_B;
    int field_x;
    short[] field_s;
    short[] field_h;
    static double[] field_f;
    int field_c;
    short[] field_d;
    int field_F;
    private boolean field_Q;
    short[] field_z;
    short field_A;
    static String field_e;
    short[] field_q;
    int[] field_C;
    short[] field_i;
    short[] field_E;
    byte[] field_n;
    int[] field_w;
    int[] field_u;
    short[] field_K;
    short[] field_S;
    short field_j;

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var7 = Pixelate.field_H ? 1 : 0;
        int var6 = 0;
        if (!param3) {
            field_G = null;
        }
        while (((rl) this).field_A > var6) {
            ((rl) this).field_k[var6] = (short)(param2 * ((rl) this).field_k[var6] / param4);
            ((rl) this).field_N[var6] = (short)(((rl) this).field_N[var6] * param0 / param4);
            ((rl) this).field_E[var6] = (short)(((rl) this).field_E[var6] * param1 / param4);
            var6++;
        }
        this.a(-125);
    }

    public static void c(byte param0) {
        field_O = null;
        field_e = null;
        field_m = null;
        field_f = null;
        field_G = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        if (((rl) this).field_Q) {
          return;
        } else {
          L0: {
            ((rl) this).field_Q = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            if (param0 == -17) {
              break L0;
            } else {
              ((rl) this).field_j = (short) -116;
              break L0;
            }
          }
          var8 = 0;
          L1: while (true) {
            if (((rl) this).field_A <= var8) {
              ((rl) this).field_g = var7;
              ((rl) this).field_t = var3;
              ((rl) this).field_x = var4;
              ((rl) this).field_b = var2;
              ((rl) this).field_F = var6;
              ((rl) this).field_c = var5;
              return;
            } else {
              L2: {
                var9 = ((rl) this).field_k[var8];
                var10 = ((rl) this).field_N[var8];
                var11 = ((rl) this).field_E[var8];
                if (var9 >= var2) {
                  break L2;
                } else {
                  var2 = var9;
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var5 < var9) {
                  var5 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 > var6) {
                  var6 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param3 != -83) {
            ((rl) this).a((byte) 65);
        }
        for (var5 = 0; ((rl) this).field_A > var5; var5++) {
            ((rl) this).field_k[var5] = (short)(((rl) this).field_k[var5] + param0);
            ((rl) this).field_N[var5] = (short)(((rl) this).field_N[var5] + param2);
            ((rl) this).field_E[var5] = (short)(((rl) this).field_E[var5] + param1);
        }
        this.a(-126);
    }

    private final void a(int param0) {
        if (param0 >= -122) {
            return;
        }
        ((rl) this).field_Q = false;
    }

    final static int b(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!bh.b((byte) 123)) {
                L2: {
                  mj.field_c.a(mi.a(uo.field_a, ji.field_c, (byte) -82), mi.a(uf.field_d, bg.field_k, (byte) -73), -1);
                  if (param0 > 74) {
                    break L2;
                  } else {
                    int discarded$1 = rl.b((byte) -77);
                    break L2;
                  }
                }
                L3: {
                  if (!mj.field_c.a(17)) {
                    break L3;
                  } else {
                    var1_int = 1;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L5;
                    } else {
                      if (mj.field_c.field_j >= 0) {
                        L6: {
                          var3 = jj.field_h[mj.field_c.field_j];
                          if (var3 == 2) {
                            break L6;
                          } else {
                            if (var3 != 5) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        dh.a(0);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (ha.field_h != 2) {
                      dh.a(0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L7: {
                  if (0 != var3) {
                    break L7;
                  } else {
                    if (ha.field_h == 2) {
                      var4 = hm.a(64) - pk.field_g;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 <= 0) {
                        var3 = 2;
                        bq.a(true, (byte) -65, 5);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                stackOut_30_0 = var3;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                L8: {
                  mj.field_c.a((byte) -48);
                  if (mj.field_c.a(84)) {
                    var1_int = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (ke.field_a == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "rl.B(" + param0 + 41);
        }
        return stackIn_31_0;
    }

    rl() {
        ((rl) this).field_B = (byte) 0;
        ((rl) this).field_Q = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_O = "Age:";
        field_e = "Logging in...";
        field_f = new double[65536];
        field_G = new double[65536];
        for (var0 = 0; var0 < 65536; var0++) {
            field_f[var0] = Math.sin((double)var0 * 3.141592653589793 / 32768.0);
            field_G[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
    }
}
