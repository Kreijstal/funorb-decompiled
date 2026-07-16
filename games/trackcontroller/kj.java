/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends fc {
    int field_n;
    static int[] field_s;
    static int field_r;
    byte[][][] field_p;
    static int[] field_t;
    int[] field_u;
    int field_w;
    ce[] field_v;
    ce[] field_j;
    int[] field_m;
    int[] field_i;
    private static long[] field_q;
    static qj field_l;
    static int field_o;
    static int field_k;

    public static void b(boolean param0) {
        field_l = null;
        field_s = null;
        field_q = null;
        if (param0) {
            return;
        }
        field_t = null;
    }

    final static ng a(byte param0) {
        ng var1 = new ng(ab.field_a, qe.field_p, ka.field_f[0], vb.field_a[0], cf.field_p[0], j.field_f[0], qk.field_M[0], qe.field_z);
        if (param0 < 51) {
            return null;
        }
        ff.b(60);
        return var1;
    }

    final static void d(int param0) {
        if (-vi.field_c + 0 != fb.field_a) {
            if (-vi.field_c + 250 == fb.field_a) {
            }
        }
        if (param0 != 250) {
            return;
        }
        fb.field_a = fb.field_a + 1;
    }

    final static nj a(String param0, int param1) {
        Object var3 = null;
        if (rk.field_X != oe.field_b) {
          L0: {
            if (param1 == 63) {
              break L0;
            } else {
              var3 = null;
              nj discarded$2 = kj.a((String) null, 50);
              break L0;
            }
          }
          L1: {
            if (rk.field_X != cj.field_e) {
              break L1;
            } else {
              if (param0.equals((Object) (Object) vh.field_p)) {
                rk.field_X = hf.field_f;
                return fh.field_c;
              } else {
                break L1;
              }
            }
          }
          vh.field_p = param0;
          fh.field_c = null;
          rk.field_X = oe.field_b;
          return null;
        } else {
          return null;
        }
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (param0 >= -3) {
            ng discarded$0 = kj.a((byte) 117);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (!(var2 >= 160)) {
                var3 = h.field_e[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    kj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        long var0 = 0L;
        double var1 = 0.0;
        int var2 = 0;
        int var3 = 0;
        field_t = new int[104];
        field_r = 250;
        field_s = new int[104];
        var0_int = 0;
        L0: while (true) {
          if (var0_int >= 104) {
            field_q = new long[256];
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                field_o = -1;
                field_l = new qj(540, 140);
                return;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L2: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_q[var2] = var0;
                    var2++;
                    continue L1;
                  } else {
                    if (1L == (1L & var0)) {
                      var0 = var0 >>> 1709323649 ^ -3932672073523589310L;
                      var3++;
                      continue L2;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var1 = (double)var0_int * 3.141592653589793 / 52.0;
            field_s[var0_int] = (int)(13.0 * Math.sin(var1) + 0.5);
            field_t[var0_int] = (int)(13.0 * Math.cos(var1) + 0.5);
            var0_int++;
            continue L0;
          }
        }
    }
}
