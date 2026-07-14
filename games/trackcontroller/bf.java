/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    private byte[] field_n;
    private long[] field_h;
    static qj field_o;
    private byte[] field_g;
    static String field_c;
    static String field_d;
    private long[] field_m;
    static String field_f;
    static int[] field_a;
    private int field_l;
    private long[] field_b;
    private int field_i;
    static ng[] field_e;
    private long[] field_k;
    private long[] field_j;

    final void a(byte[] param0, long param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          var5 = 0;
          var6 = -((int)param1 & 7) + 8 & 7;
          var7 = 7 & ((bf) this).field_l;
          var9 = param1;
          if (param2 == 30654) {
            break L0;
          } else {
            ((bf) this).field_g = null;
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if ((var11 ^ -1) > -1) {
            L2: while (true) {
              if (param1 <= 8L) {
                L3: {
                  if (-1L <= (param1 ^ -1L)) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = 255 & param0[var5] << var6;
                    ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (-9L >= ((long)var7 - -param1 ^ -1L)) {
                    L5: {
                      ((bf) this).field_i = ((bf) this).field_i + 1;
                      param1 = param1 - (long)(8 - var7);
                      ((bf) this).field_l = ((bf) this).field_l + (-var7 + 8);
                      if (-513 != (((bf) this).field_l ^ -1)) {
                        break L5;
                      } else {
                        this.b(-2);
                        ((bf) this).field_l = 0;
                        ((bf) this).field_i = 0;
                        break L5;
                      }
                    }
                    ((bf) this).field_g[((bf) this).field_i] = (byte)tc.a(255, var8 << -var7 + 8);
                    ((bf) this).field_l = ((bf) this).field_l + (int)param1;
                    break L4;
                  } else {
                    ((bf) this).field_l = (int)((long)((bf) this).field_l + param1);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param0[var5] << var6 | (param0[var5 + 1] & 255) >>> -var6 + 8;
                  if (var8 < 0) {
                    break L6;
                  } else {
                    if (256 <= var8) {
                      break L6;
                    } else {
                      L7: {
                        ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], var8 >>> var7);
                        ((bf) this).field_i = ((bf) this).field_i + 1;
                        ((bf) this).field_l = ((bf) this).field_l + (8 - var7);
                        if (-513 != (((bf) this).field_l ^ -1)) {
                          break L7;
                        } else {
                          this.b(-2);
                          ((bf) this).field_l = 0;
                          ((bf) this).field_i = 0;
                          break L7;
                        }
                      }
                      ((bf) this).field_g[((bf) this).field_i] = (byte)tc.a(255, var8 << 8 + -var7);
                      param1 = param1 - 8L;
                      ((bf) this).field_l = ((bf) this).field_l + var7;
                      var5++;
                      continue L2;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((((bf) this).field_n[var11] & 255) - -(255 & (int)var9));
            ((bf) this).field_n[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_d = null;
        field_o = null;
        if (param0 >= -50) {
            field_d = null;
        }
        field_e = null;
        field_c = null;
    }

    final static boolean a(boolean param0, byte param1) {
        // if_acmpne L27
        ga.field_d = gf.field_o.a(79, ke.field_c, dc.field_o);
        // goto L27
        // if_icmpeq L40
        // goto L42
        return false;
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], 128 >>> tc.a(((bf) this).field_l, 7));
        ((bf) this).field_i = ((bf) this).field_i + 1;
        if (param2 == -513) {
          L0: {
            if (((bf) this).field_i > 32) {
              L1: while (true) {
                if ((((bf) this).field_i ^ -1) <= -65) {
                  this.b(-2);
                  ((bf) this).field_i = 0;
                  break L0;
                } else {
                  ((bf) this).field_i = ((bf) this).field_i + 1;
                  ((bf) this).field_g[((bf) this).field_i] = (byte) 0;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          L2: while (true) {
            if ((((bf) this).field_i ^ -1) <= -33) {
              pd.a(((bf) this).field_n, 0, ((bf) this).field_g, 32, 32);
              this.b(-2);
              var4 = 0;
              var5 = param1;
              L3: while (true) {
                if (8 <= var4) {
                  return;
                } else {
                  var6 = ((bf) this).field_k[var4];
                  param0[var5] = (byte)(int)(var6 >>> -636635080);
                  param0[1 + var5] = (byte)(int)(var6 >>> 1881326704);
                  param0[var5 + 2] = (byte)(int)(var6 >>> -1657883672);
                  param0[var5 - -3] = (byte)(int)(var6 >>> 281218208);
                  param0[var5 - -4] = (byte)(int)(var6 >>> -1031222888);
                  param0[var5 + 5] = (byte)(int)(var6 >>> -202686960);
                  param0[var5 + 6] = (byte)(int)(var6 >>> 2142168776);
                  param0[var5 - -7] = (byte)(int)var6;
                  var4++;
                  var5 += 8;
                  continue L3;
                }
              }
            } else {
              ((bf) this).field_i = ((bf) this).field_i + 1;
              ((bf) this).field_g[((bf) this).field_i] = (byte) 0;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((bf) this).field_n[var2] = (byte) 0;
        }
        ((bf) this).field_g[0] = (byte) 0;
        ((bf) this).field_i = 0;
        ((bf) this).field_l = 0;
        if (param0 != -11) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((bf) this).field_k[var2] = 0L;
        }
    }

    final static void a(byte param0, String param1) {
        kg.field_a = param1;
        if (param0 >= -23) {
            bf.a((byte) 1);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L3: while (true) {
                      if (-9 <= var2) {
                        L4: {
                          if (param0 == -2) {
                            break L4;
                          } else {
                            ((bf) this).field_i = 66;
                            break L4;
                          }
                        }
                        return;
                      } else {
                        ((bf) this).field_k[var2] = ib.a(((bf) this).field_k[var2], ib.a(((bf) this).field_h[var2], ((bf) this).field_m[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if (8 <= var3) {
                            ((bf) this).field_j[0] = ib.a(((bf) this).field_j[0], lh.field_D[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bf) this).field_m[var3] = ((bf) this).field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((bf) this).field_b[var3] = ((bf) this).field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((bf) this).field_b[var3] = ib.a(((bf) this).field_b[var3], lh.field_B[var7][tc.a((int)(((bf) this).field_m[tc.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bf) this).field_j[var3] = ((bf) this).field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((bf) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((bf) this).field_b[var3] = ib.a(((bf) this).field_b[var3], lh.field_B[var4][tc.a(255, (int)(((bf) this).field_j[tc.a(7, var3 - var4)] >>> var5))]);
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
                ((bf) this).field_j[var2] = ((bf) this).field_k[var2];
                ((bf) this).field_m[var2] = ib.a(((bf) this).field_h[var2], ((bf) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bf) this).field_h[var2] = ib.a(ib.a(ib.a(ib.a(al.a(255L, (long)((bf) this).field_g[var3 - -4]) << -1035872296, ib.a(al.a((long)((bf) this).field_g[var3 + 3], 255L) << -1835657888, ib.a(al.a(280375465082880L, (long)((bf) this).field_g[var3 - -2] << 1101055080), ib.a(al.a((long)((bf) this).field_g[var3 - -1], 255L) << -2121321744, (long)((bf) this).field_g[var3] << 1548063032)))), al.a((long)((bf) this).field_g[var3 - -5] << 1132118544, 16711680L)), al.a((long)((bf) this).field_g[var3 + 6], 255L) << -1057440056), al.a((long)((bf) this).field_g[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    bf() {
        ((bf) this).field_n = new byte[32];
        ((bf) this).field_m = new long[8];
        ((bf) this).field_h = new long[8];
        ((bf) this).field_g = new byte[64];
        ((bf) this).field_l = 0;
        ((bf) this).field_b = new long[8];
        ((bf) this).field_i = 0;
        ((bf) this).field_k = new long[8];
        ((bf) this).field_j = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Checking";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_a = new int[4];
    }
}
