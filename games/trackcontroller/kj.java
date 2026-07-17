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

    public static void b() {
        field_l = null;
        field_s = null;
        field_q = null;
        field_t = null;
    }

    final static ng a() {
        ng var1 = new ng(ab.field_a, qe.field_p, ka.field_f[0], vb.field_a[0], cf.field_p[0], j.field_f[0], qk.field_M[0], qe.field_z);
        ff.b(60);
        return var1;
    }

    final static void d() {
        if (-vi.field_c != fb.field_a) {
            if (-vi.field_c + 250 == fb.field_a) {
            }
        }
    }

    final static nj a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        nj stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (rk.field_X != oe.field_b) {
              L1: {
                if (param1 == 63) {
                  break L1;
                } else {
                  var3 = null;
                  nj discarded$2 = kj.a((String) null, 50);
                  break L1;
                }
              }
              L2: {
                if (rk.field_X != cj.field_e) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) vh.field_p)) {
                    rk.field_X = hf.field_f;
                    stackOut_10_0 = fh.field_c;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              vh.field_p = param0;
              fh.field_c = null;
              rk.field_X = oe.field_b;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (nj) (Object) stackIn_9_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("kj.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
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
                  if (var3 >= 8) {
                    field_q[var2] = var0;
                    var2++;
                    continue L1;
                  } else {
                    if (1L == (1L & var0)) {
                      var0 = var0 >>> 1 ^ -3932672073523589310L;
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
