/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends mc {
    private int field_m;
    private long field_u;
    private long[] field_w;
    static la[] field_t;
    private int field_r;
    private long field_v;
    private long field_p;
    static int[] field_q;
    static String field_o;
    static boolean field_n;
    static int field_s;

    final static boolean c(int param0) {
        if (param0 != 2915) {
            vi.c((byte) 16);
        }
        return tf.field_f;
    }

    final static kk a(byte param0, ml param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        var2 = param1.l(8, 59);
        if (var2 > 0) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = mu.a(param1, (byte) -39) ? 1 : 0;
            var4 = mu.a(param1, (byte) -39) ? 1 : 0;
            var5 = new kk();
            var5.field_b = (short)param1.l(16, 59);
            var5.field_f = nq.a(var5.field_f, param1, 16, -72);
            var5.field_r = nq.a(var5.field_r, param1, 16, -61);
            var5.field_P = nq.a(var5.field_P, param1, 16, -92);
            var5.field_g = (short)param1.l(16, 59);
            var5.field_n = nq.a(var5.field_n, param1, 16, 105);
            var5.field_z = nq.a(var5.field_z, param1, 16, 48);
            var5.field_T = nq.a(var5.field_T, param1, 16, 109);
            if (var3 != 0) {
              var5.field_k = (short)param1.l(16, 59);
              var5.field_F = nq.a(var5.field_F, param1, 16, -66);
              var5.field_I = nq.a(var5.field_I, param1, 16, 109);
              var5.field_v = nq.a(var5.field_v, param1, 16, -79);
              var5.field_M = nq.a(var5.field_M, param1, 16, 116);
              var5.field_U = nq.a(var5.field_U, param1, 16, -73);
              var5.field_l = nq.a(var5.field_l, param1, 16, -106);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              int discarded$1 = param1.l(16, 59);
              var5.field_p = nq.a(var5.field_p, param1, 16, 116);
              var5.field_E = nq.a(var5.field_E, param1, 16, -104);
              var5.field_N = nq.a(var5.field_N, param1, 16, -76);
              var5.field_i = nq.a(var5.field_i, param1, 16, -65);
              var5.field_K = nq.a(var5.field_K, param1, 16, -87);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (mu.a(param1, (byte) -39)) {
              var5.field_o = nq.a(var5.field_o, param1, 16, 106);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!mu.a(param1, (byte) -39)) {
              break L3;
            } else {
              var5.field_G = bp.a(2280703, param1, var5.field_G, 16);
              var6 = 0;
              var7 = 0;
              L4: while (true) {
                if (var5.field_G.length <= var7) {
                  if (-1 != (var6 ^ -1)) {
                    var5.field_u = (byte)(1 + var6);
                    break L3;
                  } else {
                    var5.field_G = null;
                    break L3;
                  }
                } else {
                  if (var6 < (var5.field_G[var7] & 255)) {
                    var6 = 255 & var5.field_G[var7];
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
          if (param0 > 54) {
            return var5;
          } else {
            return null;
          }
        }
    }

    final static boolean a(int param0, int param1, int[][] param2, byte[] param3) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (param1 >= 123) {
            break L0;
          } else {
            vi.c((byte) 59);
            break L0;
          }
        }
        if (param2 != null) {
          var4 = 0;
          L1: while (true) {
            if (var4 >= param2.length) {
              return false;
            } else {
              var5 = param2[var4];
              var6 = 0;
              L2: while (true) {
                if (var6 >= var5.length) {
                  return true;
                } else {
                  var7 = var5[var6];
                  var8 = var5[1 + var6];
                  if (0 == (var7 ^ -1)) {
                    if (var8 != param0) {
                      var6 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var6 += 2;
                      continue L2;
                    }
                  } else {
                    if (var8 == (255 & param3[var7])) {
                      var6 += 2;
                      continue L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        L0: {
          var1 = -1;
          if (param0 == -59) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == um.field_e) {
              break L2;
            } else {
              if (um.field_e.field_A) {
                var1 = um.field_e.field_B;
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (null == sr.field_l) {
            break L1;
          } else {
            var1 = sr.field_l.f(123);
            break L1;
          }
        }
        if (-1 != var1) {
          or.field_d.b(88, (byte) -46);
          or.field_d.a(127, var1);
          an.field_d = true;
          return;
        } else {
          return;
        }
    }

    final long b(byte param0) {
        ((vi) this).field_p = ((vi) this).field_p + this.a(false);
        if (param0 != -36) {
            field_n = true;
        }
        if (!((((vi) this).field_p ^ -1L) <= (((vi) this).field_v ^ -1L))) {
            return (-((vi) this).field_p + ((vi) this).field_v) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        ((vi) this).field_u = 0L;
        if (param0 != -1) {
            field_s = -62;
        }
        if ((((vi) this).field_v ^ -1L) < (((vi) this).field_p ^ -1L)) {
            ((vi) this).field_p = ((vi) this).field_p + (-((vi) this).field_p + ((vi) this).field_v);
        }
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        long var2 = System.nanoTime();
        long var4 = -((vi) this).field_u + var2;
        ((vi) this).field_u = var2;
        if (4999999999L > (var4 ^ -1L)) {
            if (5000000000L > var4) {
                ((vi) this).field_w[((vi) this).field_m] = var4;
                ((vi) this).field_m = (((vi) this).field_m + 1) % 10;
                if ((((vi) this).field_r ^ -1) > -2) {
                    ((vi) this).field_r = ((vi) this).field_r + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0) {
            return -97L;
        }
        for (var8 = 1; ((vi) this).field_r >= var8; var8++) {
            var6 = var6 + ((vi) this).field_w[(10 + ((vi) this).field_m + -var8) % 10];
        }
        return var6 / (long)((vi) this).field_r;
    }

    public static void d(int param0) {
        if (param0 < 4) {
            return;
        }
        field_t = null;
        field_q = null;
        field_o = null;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        var4 = 78 % ((param0 - 45) / 63);
        if (((vi) this).field_p < ((vi) this).field_v) {
          ((vi) this).field_u = ((vi) this).field_u + (((vi) this).field_v - ((vi) this).field_p);
          ((vi) this).field_p = ((vi) this).field_p + (-((vi) this).field_p + ((vi) this).field_v);
          ((vi) this).field_v = ((vi) this).field_v + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              ((vi) this).field_v = ((vi) this).field_v + param1;
              var5++;
              if (-11 >= (var5 ^ -1)) {
                break L1;
              } else {
                if ((((vi) this).field_v ^ -1L) > (((vi) this).field_p ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((((vi) this).field_p ^ -1L) >= (((vi) this).field_v ^ -1L)) {
                break L2;
              } else {
                ((vi) this).field_v = ((vi) this).field_p;
                break L2;
              }
            }
            return var5;
          }
        }
    }

    vi() {
        ((vi) this).field_u = 0L;
        ((vi) this).field_m = 0;
        ((vi) this).field_r = 1;
        ((vi) this).field_p = 0L;
        ((vi) this).field_v = 0L;
        ((vi) this).field_w = new long[10];
        ((vi) this).field_p = System.nanoTime();
        ((vi) this).field_v = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[4];
        field_t = new la[]{new la(0, 0, 896, 1344), new la(370, -45, 525, 1389, 0, 45)};
        field_n = false;
        field_o = "<%0>: Unread Chat";
    }
}
