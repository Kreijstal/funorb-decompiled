/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends jea {
    static long[] field_xb;
    private jea field_tb;
    private jea[] field_vb;
    private jea[] field_ub;
    int field_wb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_t = param5;
        if (param4 != -25436) {
            bv.d((byte) 19);
        }
        this.field_T = param3;
        this.field_G = param2;
        this.field_qb = param6;
        this.b(param1, 32, param0);
    }

    final static void d(byte param0) {
        tra.g((byte) -113);
        int var1 = -34 % ((10 - param0) / 47);
    }

    final void e(byte param0) {
        jea dupTemp$0 = null;
        jea dupTemp$1 = null;
        int var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param0 < -97) {
            break L0;
          } else {
            this.field_wb = -14;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= this.field_ub.length) {
            return;
          } else {
            if (var2 != this.field_wb) {
              if (this.field_ub[var2].field_y != 0) {
                this.field_ub[this.field_wb].field_cb = false;
                dupTemp$0 = this.field_vb[this.field_wb];
                dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
                this.field_wb = var2;
                this.field_ub[var2].field_cb = true;
                dupTemp$1 = this.field_vb[var2];
                dupTemp$1.field_qb = dupTemp$1.field_qb - 10000;
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

    private final void b(int param0, int param1, int param2) {
        jea dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param1 == 32) {
            break L0;
          } else {
            field_xb = (long[]) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_ub.length) {
            this.field_tb.a(this.field_G, this.field_t - param2, -23776, param2, 0);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= this.field_vb.length) {
                return;
              } else {
                this.field_vb[var8].a(this.field_tb.field_G + -(param0 * 2), -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
                if (this.field_wb != var8) {
                  dupTemp$0 = this.field_vb[var8];
                  dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * this.field_G / this.field_ub.length;
            var6 = (var4 - -1) * this.field_G / this.field_ub.length;
            this.field_ub[var4].field_qb = var5;
            this.field_ub[var4].field_T = 0;
            this.field_ub[var4].field_G = -var5 + var6;
            this.field_ub[var4].field_t = param2;
            var4++;
            continue L1;
          }
        }
    }

    public static void f(int param0) {
        field_xb = null;
        if (param0 != 0) {
            bv.f(30);
        }
    }

    bv(long param0, jea param1, String[] param2, jea param3, jea[] param4, int param5) {
        super(param0, (jea) null);
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
        jea var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_ub = new jea[param2.length];
            this.field_tb = new jea(0L, param3);
            this.field_vb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.b(-128, this.field_tb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_wb = param5;
                    this.field_ub[param5].field_cb = true;
                    break L0;
                  } else {
                    this.field_tb.b(-122, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new jea(0L, param1);
                var9.field_r = param2[var8_int];
                this.field_ub[var8_int] = var9;
                this.b(-124, var9);
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

            stackIn_11_1 = new StringBuilder().append("bv.<init>(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    static {
        field_xb = new long[32];
    }
}
