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
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        hd var9 = null;
        int var11 = 0;
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
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("kf.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        hd dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
                if ((var8 ^ -1) != (this.field_Db ^ -1)) {
                  dupTemp$0 = this.field_Ab[var8];
                  dupTemp$0.field_s = dupTemp$0.field_s + 10000;
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
        hd dupTemp$0 = null;
        hd dupTemp$1 = null;
        int var2;
        int var3;
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
                dupTemp$0 = this.field_Ab[this.field_Db];
                dupTemp$0.field_s = dupTemp$0.field_s + 10000;
                this.field_Db = var2;
                this.field_Bb[var2].field_I = true;
                dupTemp$1 = this.field_Ab[var2];
                dupTemp$1.field_s = dupTemp$1.field_s - 10000;
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
