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
        return tf.field_f;
    }

    final static kk a(byte param0, ml param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = Kickabout.field_G;
        try {
          var2_int = param1.l(8, 59);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          } else {
            L0: {
              int discarded$6 = -39;
              var3 = mu.a(param1) ? 1 : 0;
              int discarded$7 = -39;
              var4 = mu.a(param1) ? 1 : 0;
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
                int discarded$8 = param1.l(16, 59);
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
              int discarded$9 = -39;
              if (mu.a(param1)) {
                var5.field_o = nq.a(var5.field_o, param1, 16, 106);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              int discarded$10 = -39;
              if (!mu.a(param1)) {
                break L3;
              } else {
                int discarded$11 = 16;
                var5.field_G = bp.a(2280703, param1, var5.field_G);
                var6 = 0;
                var7 = 0;
                L4: while (true) {
                  if (var5.field_G.length <= var7) {
                    if (var6 != 0) {
                      var5.field_u = (byte)(1 + var6);
                      break L3;
                    } else {
                      var5.field_G = null;
                      break L3;
                    }
                  } else {
                    L5: {
                      if (var6 >= (var5.field_G[var7] & 255)) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("vi.I(").append(80).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int[][] param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (param2 != null) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= param2.length) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  var5 = param2[var4_int];
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var5.length) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      L3: {
                        L4: {
                          var7 = var5[var6];
                          var8 = var5[1 + var6];
                          if (var7 == -1) {
                            if (var8 == param0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            if (var8 != (255 & param3[var7])) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4_int++;
                        continue L1;
                      }
                      var6 += 2;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("vi.H(").append(param0).append(',').append(127).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static void c() {
        int var1 = 0;
        L0: {
          L1: {
            var1 = -1;
            if (null == um.field_e) {
              break L1;
            } else {
              if (um.field_e.field_A) {
                var1 = um.field_e.field_B;
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (null == sr.field_l) {
            break L0;
          } else {
            var1 = sr.field_l.f(123);
            break L0;
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
        int discarded$0 = 0;
        ((vi) this).field_p = ((vi) this).field_p + this.a();
        if (param0 != -36) {
            field_n = true;
        }
        if (!(~((vi) this).field_p <= ~((vi) this).field_v)) {
            return (-((vi) this).field_p + ((vi) this).field_v) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        ((vi) this).field_u = 0L;
        if (param0 != -1) {
            field_s = -62;
        }
        if (~((vi) this).field_v < ~((vi) this).field_p) {
            ((vi) this).field_p = ((vi) this).field_p + (-((vi) this).field_p + ((vi) this).field_v);
        }
    }

    private final long a() {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        long var2 = System.nanoTime();
        long var4 = -((vi) this).field_u + var2;
        ((vi) this).field_u = var2;
        if (var4 > -5000000000L) {
            if (5000000000L > var4) {
                ((vi) this).field_w[((vi) this).field_m] = var4;
                ((vi) this).field_m = (((vi) this).field_m + 1) % 10;
                if (((vi) this).field_r < 1) {
                    ((vi) this).field_r = ((vi) this).field_r + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((vi) this).field_r >= var8; var8++) {
            var6 = var6 + ((vi) this).field_w[(10 + ((vi) this).field_m + -var8) % 10];
        }
        return var6 / (long)((vi) this).field_r;
    }

    public static void d() {
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
              if (var5 >= 10) {
                break L1;
              } else {
                if (~((vi) this).field_v > ~((vi) this).field_p) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (~((vi) this).field_p >= ~((vi) this).field_v) {
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
