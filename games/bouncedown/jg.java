/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends ak {
    static int[] field_A;
    static String field_B;
    static String field_D;
    static jf field_C;
    int field_E;

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1) {
          param0 = param0 & 8191;
          if ((param0 ^ -1) > -4097) {
            L0: {
              if (2048 > param0) {
                stackOut_18_0 = lc.field_x[param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = lc.field_x[-param0 + 4096];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackOut_14_0 = -lc.field_x[-4096 + param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -lc.field_x[8192 + -param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_B = null;
          param0 = param0 & 8191;
          if ((param0 ^ -1) > -4097) {
            L2: {
              if (2048 > param0) {
                stackOut_8_0 = lc.field_x[param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = lc.field_x[-param0 + 4096];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 < 6144) {
                stackOut_4_0 = -lc.field_x[-4096 + param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -lc.field_x[8192 + -param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        tg var6 = null;
        if (0 != param0) {
          return;
        } else {
          if (((jg) this).field_x != null) {
            if (((jg) this).field_E != 0) {
              if (param2 > 33) {
                if (((jg) this).field_E == 256) {
                  ((jg) this).field_x.a(param0, param1 - -((jg) this).field_i, 87, ((jg) this).field_r + param3);
                  return;
                } else {
                  var6 = new tg(((jg) this).field_x.field_k, ((jg) this).field_x.field_m);
                  kh.a(var6, 1);
                  ((jg) this).field_x.a(param0, 0, 59, 0);
                  ve.a(-121);
                  var6.d(((jg) this).field_r + param3, param1 + ((jg) this).field_i, ((jg) this).field_E);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void j(int param0) {
        field_A = null;
        field_B = null;
        if (param0 != -32572) {
          field_B = null;
          field_C = null;
          field_D = null;
          return;
        } else {
          field_C = null;
          field_D = null;
          return;
        }
    }

    final static void k(int param0) {
        int var4 = Bounce.field_N;
        int[] var5 = ja.field_c;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    jg(lk param0) {
        super(param0.field_r, param0.field_i, param0.field_k, param0.field_m, (fc) null, (sk) null);
        param0.b(((jg) this).field_m, 80, ((jg) this).field_k, 0, 0);
        ((jg) this).field_x = param0;
        ((jg) this).field_E = 256;
    }

    public jg() {
        super(0, 0, 0, 0, (fc) null, (sk) null);
        ((jg) this).field_E = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[]{1, 2, 5, 1, 1, 2, 2, 2, 5, 10};
    }
}
