/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends hd {
    private hd[] field_Ab;
    static String field_yb;
    static int field_Eb;
    private hd[] field_Bb;
    int field_Db;
    private hd field_Cb;
    static String field_zb;

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 63) {
                break L1;
              } else {
                kf.c(true);
                break L1;
              }
            }
            na.a(kt.field_g, true, wf.field_O, er.field_k, 1, param0, 0);
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= wf.field_O) {
                L3: {
                  na.a(lm.field_V, false, wf.field_O - -param0, vi.field_s, 1, param0 + param0, param0);
                  if (wf.field_O <= param0) {
                    break L3;
                  } else {
                    wf.field_O = param0;
                    break L3;
                  }
                }
                break L0;
              } else {
                pf.field_d[var2_int - -param0] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "kf.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_q = param6;
        this.field_mb = param1;
        this.field_s = param2;
        if (!param0) {
            this.a(79, -39, -98);
        }
        this.field_J = param5;
        this.a(param3, param4, 10000);
    }

    kf(long param0, hd param1, String[] param2, hd param3, hd[] param4, int param5) {
        super(param0, (hd) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        hd var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            this.field_Bb = new hd[param2.length];
            this.field_Cb = new hd(0L, param3);
            this.field_Ab = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a((byte) -124, this.field_Cb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    this.field_Db = param5;
                    this.field_Bb[param5].field_I = true;
                    break L0;
                  } else {
                    this.field_Cb.a((byte) -127, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new hd(0L, param1);
                var9.field_E = param2[var8_int];
                this.field_Bb[var8_int] = var9;
                this.a((byte) -109, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var8);
            stackOut_9_1 = new StringBuilder().append("kf.<init>(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Kickabout.field_G;
        var4 = 0;
        L0: while (true) {
          if (this.field_Bb.length <= var4) {
            this.field_Cb.a(true, this.field_q, 0, param0, this.field_mb + -param0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= this.field_Ab.length) {
                L2: {
                  if (param2 == 10000) {
                    break L2;
                  } else {
                    this.field_Ab = (hd[]) null;
                    break L2;
                  }
                }
                return;
              } else {
                this.field_Ab[var8].a(true, this.field_Cb.field_q - 2 * param1, param1, param1, this.field_Cb.field_mb - param1 * 2);
                if (var8 != this.field_Db) {
                  this.field_Ab[var8].field_s = this.field_Ab[var8].field_s + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * this.field_q / this.field_Bb.length;
            var6 = this.field_q * (1 + var4) / this.field_Bb.length;
            this.field_Bb[var4].field_s = var5;
            this.field_Bb[var4].field_J = 0;
            this.field_Bb[var4].field_q = var6 - var5;
            this.field_Bb[var4].field_mb = param0;
            var4++;
            continue L0;
          }
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Kickabout.field_G;
          if (param0 >= 36) {
            break L0;
          } else {
            this.a(44, -42, 25);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (this.field_Bb.length <= var2) {
            return;
          } else {
            if (this.field_Db != var2) {
              if (-1 != (this.field_Bb[var2].field_sb ^ -1)) {
                this.field_Bb[this.field_Db].field_I = false;
                this.field_Ab[this.field_Db].field_s = this.field_Ab[this.field_Db].field_s + 10000;
                this.field_Db = var2;
                this.field_Bb[var2].field_I = true;
                this.field_Ab[var2].field_s = this.field_Ab[var2].field_s - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_yb = null;
        field_zb = null;
        if (!param0) {
            kf.a(67, (byte) -66);
        }
    }

    static {
        field_yb = "Enter name of friend to delete from list";
        field_zb = "Your game";
    }
}
