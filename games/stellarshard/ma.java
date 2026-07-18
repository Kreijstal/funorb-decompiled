/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends gg {
    static String field_o;
    int[] field_p;
    int field_u;
    static bh field_m;
    int field_q;
    int field_l;
    static pc field_s;
    int field_n;
    static int[] field_k;
    int field_t;
    int field_r;

    final static pb[] a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = stellarshard.field_B;
        pb[] var1 = new pb[sb.field_b];
        for (var2 = 0; sb.field_b > var2; var2++) {
            var3 = vc.field_b[var2] * ih.field_d[var2];
            var4 = ih.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = gj.field_w[sa.a((int) var4[var6], 255)];
            }
            var1[var2] = new pb(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var5);
        }
        tb.f((byte) -45);
        return var1;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param3 < -68) {
          L0: {
            L1: {
              if (param5 < param1) {
                break L1;
              } else {
                if (param6 + param1 <= param5) {
                  break L1;
                } else {
                  if (param0 < param2) {
                    break L1;
                  } else {
                    if (param2 - -param4 <= param0) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static int a(byte param0, int param1) {
        if (65536L > (long)param1) {
          if (256L > (long)param1) {
            if (param1 >= 0) {
              return ih.field_c[param1] >> 12;
            } else {
              L0: {
                if (param0 <= -109) {
                  break L0;
                } else {
                  boolean discarded$1 = ma.a(-41, 68, -104, (byte) 100, -86, 92, 34);
                  break L0;
                }
              }
              return -1;
            }
          } else {
            if ((long)param1 >= 4096L) {
              if ((long)param1 >= 16384L) {
                return ih.field_c[param1 >> 8] >> 8;
              } else {
                return ih.field_c[param1 >> 6] >> 9;
              }
            } else {
              if ((long)param1 < 1024L) {
                return ih.field_c[param1 >> 2] >> 11;
              } else {
                return ih.field_c[param1 >> 4] >> 10;
              }
            }
          }
        } else {
          if (16777216L <= (long)param1) {
            if (268435456L <= (long)param1) {
              if ((long)param1 >= 1073741824L) {
                return ih.field_c[param1 >> 24];
              } else {
                return ih.field_c[param1 >> 22] >> 1;
              }
            } else {
              if ((long)param1 >= 67108864L) {
                return ih.field_c[param1 >> 20] >> 2;
              } else {
                return ih.field_c[param1 >> 18] >> 3;
              }
            }
          } else {
            if ((long)param1 < 1048576L) {
              if ((long)param1 >= 262144L) {
                return ih.field_c[param1 >> 12] >> 6;
              } else {
                return ih.field_c[param1 >> 10] >> 7;
              }
            } else {
              if (4194304L > (long)param1) {
                return ih.field_c[param1 >> 14] >> 5;
              } else {
                return ih.field_c[param1 >> 16] >> 4;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        ((ma) this).field_u = param1;
        ((ma) this).field_l = param7;
        ((ma) this).field_r = param2;
        ((ma) this).field_q = param6;
        ((ma) this).field_p = param4;
        ((ma) this).field_n = param5;
        if (param0 != 543992579) {
            return;
        }
        try {
            ((ma) this).field_t = param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ma.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_m = null;
        field_o = null;
        field_s = null;
        field_k = null;
    }

    ma() {
    }

    final static wg a(Throwable param0, String param1) {
        wg var2 = null;
        if (param0 instanceof wg) {
            var2 = (wg) (Object) param0;
            var2.field_f = var2.field_f + ' ' + param1;
        } else {
            var2 = new wg(param0, param1);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_o = "Waiting for sound effects";
        field_m = new bh("");
    }
}
