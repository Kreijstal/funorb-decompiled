/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class grb extends le {
    private int field_m;
    static int[] field_l;
    static int[] field_j;
    private int field_k;
    static String field_i;

    public static void e(byte param0) {
        field_l = null;
        field_i = null;
        if (param0 > -37) {
            grb.e((byte) 94);
        }
        field_j = null;
    }

    final int[] a(int param0, boolean param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[][] var8;
        int var9;
        int var10;
        int[] var10_ref_int__;
        int var11;
        int[] var11_ref_int__;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int[][] var17;
        int[] var18;
        int[][] var19;
        L0: {
          var14 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            grb.e((byte) -21);
            break L0;
          }
        }
        L1: {
          var3 = this.field_f.a((byte) 121, param0);
          if (this.field_f.field_e) {
            var4 = 1 + (this.field_k + this.field_k);
            var5 = 65536 / var4;
            var6 = this.field_m + (this.field_m + 1);
            var7 = 65536 / var6;
            var19 = new int[var4][];
            var17 = var19;
            var8 = var17;
            var9 = param0 + -this.field_k;
            L2: while (true) {
              if (var9 > this.field_k + param0) {
                var9 = 0;
                L3: while (true) {
                  if (var9 >= hob.field_d) {
                    break L1;
                  } else {
                    var10 = 0;
                    var11 = 0;
                    L4: while (true) {
                      if (var4 <= var11) {
                        var3[var9] = var10 * var5 >> 1600430576;
                        var9++;
                        continue L3;
                      } else {
                        var10 = var10 + var19[var11][var9];
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var10_ref_int__ = this.a(0, var9 & wf.field_d, 255);
                var18 = new int[hob.field_d];
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -this.field_m;
                L5: while (true) {
                  if (var13 > this.field_m) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (hob.field_d <= var15) {
                        var8[-param0 + (var9 - -this.field_k)] = var18;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var12 * var7 >> -1845368240;
                        var12 = var12 - var10_ref_int__[gbb.field_q & var15 + -this.field_m];
                        var15++;
                        var12 = var12 + var10_ref_int__[this.field_m + var15 & gbb.field_q];
                        continue L6;
                      }
                    }
                  } else {
                    var12 = var12 + var10_ref_int__[gbb.field_q & var13];
                    var13++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    public grb() {
        super(1, false);
        this.field_m = 1;
        this.field_k = 1;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                this.field_m = param2.e((byte) -119);
                break L1;
              } else {
                if ((var4_int ^ -1) == -2) {
                  this.field_k = param2.e((byte) -123);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    L2: {
                      stackIn_9_0 = this;

                      if (-2 != (param2.e((byte) -121) ^ -1)) {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 1;
                        break L2;
                      }
                    }
                    ((grb) (this)).field_g = stackIn_10_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param1 <= -60) {
                break L3;
              } else {
                grb.e((byte) -106);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("grb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var38 = null;
        int[][][] var30 = null;
        int[][][] var8 = null;
        int var9_int = 0;
        int[][] var46 = null;
        int[][] var50 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var47 = null;
        int var18_int = 0;
        int var19_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var15 = 0;
        int var16 = 0;
        int[][] var51 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var23 = VoidHunters.field_G;
        int[][] var37 = this.field_d.a(param1, (byte) -94);
        int[][] var29 = var37;
        int[][] var3 = var29;
        if (this.field_d.field_g) {
            var4 = this.field_k + this.field_k - -1;
            var5 = 65536 / var4;
            var6 = this.field_m + this.field_m + 1;
            var7 = 65536 / var6;
            var38 = new int[var4][][];
            var30 = var38;
            var8 = var30;
            for (var9_int = -this.field_k + param1; param1 - -this.field_k >= var9_int; var9_int++) {
                var46 = this.a((byte) 110, 0, wf.field_d & var9_int);
                var50 = new int[3][hob.field_d];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var48 = var46[0];
                var49 = var46[1];
                var47 = var46[2];
                for (var18_int = -this.field_m; var18_int <= this.field_m; var18_int++) {
                    var19_int = gbb.field_q & var18_int;
                    var14 = var14 + var47[var19_int];
                    var12 = var12 + var48[var19_int];
                    var13 = var13 + var49[var19_int];
                }
                var18 = var50[0];
                var19 = var50[1];
                var20 = var50[2];
                var21 = 0;
                while (hob.field_d > var21) {
                    var18[var21] = var7 * var12 >> -2027696400;
                    var19[var21] = var7 * var13 >> -1486867408;
                    var20[var21] = var7 * var14 >> -305495184;
                    var22 = -this.field_m + var21 & gbb.field_q;
                    var21++;
                    var12 = var12 - var48[var22];
                    var13 = var13 - var49[var22];
                    var14 = var14 - var47[var22];
                    var22 = gbb.field_q & this.field_m + var21;
                    var14 = var14 + var47[var22];
                    var13 = var13 + var49[var22];
                    var12 = var12 + var48[var22];
                }
                var8[var9_int + this.field_k - param1] = var50;
            }
            var9 = var37[0];
            var10 = var37[1];
            var11 = var37[2];
            for (var12 = 0; var12 < hob.field_d; var12++) {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                for (var16 = 0; var4 > var16; var16++) {
                    var51 = var38[var16];
                    var14 = var14 + var51[1][var12];
                    var13 = var13 + var51[0][var12];
                    var15 = var15 + var51[2][var12];
                }
                var9[var12] = var5 * var13 >> -775821776;
                var10[var12] = var14 * var5 >> 109355792;
                var11[var12] = var15 * var5 >> 1070671088;
            }
        }
        if (param0 != 255) {
            return (int[][]) null;
        }
        return var3;
    }

    static {
        field_j = new int[2];
        field_i = "Laser beam";
    }
}
