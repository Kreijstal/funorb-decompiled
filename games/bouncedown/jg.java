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
          field_B = (String) null;
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
          if (this.field_x != null) {
            if (this.field_E != 0) {
              if (param2 > 33) {
                if (this.field_E == 256) {
                  this.field_x.a(param0, param1 - -this.field_i, 87, this.field_r + param3);
                  return;
                } else {
                  var6 = new tg(this.field_x.field_k, this.field_x.field_m);
                  kh.a(var6, 1);
                  this.field_x.a(param0, 0, 59, 0);
                  ve.a(-121);
                  var6.d(this.field_r + param3, param1 + this.field_i, this.field_E);
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
          field_B = (String) null;
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
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            var5 = ja.field_c;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "jg.A(" + param0 + ')');
        }
    }

    jg(lk param0) {
        super(param0.field_r, param0.field_i, param0.field_k, param0.field_m, (fc) null, (sk) null);
        try {
            param0.b(this.field_m, 80, this.field_k, 0, 0);
            this.field_x = param0;
            this.field_E = 256;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public jg() {
        super(0, 0, 0, 0, (fc) null, (sk) null);
        this.field_E = 256;
    }

    static {
        field_A = new int[]{1, 2, 5, 1, 1, 2, 2, 2, 5, 10};
    }
}
