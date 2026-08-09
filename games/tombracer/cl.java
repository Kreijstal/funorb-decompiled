/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends ci {
    static boolean field_o;
    private int field_m;
    private int field_n;

    public cl() {
        super(1, false);
        this.field_m = 1;
        this.field_n = 1;
    }

    final int[] c(int param0, int param1) {
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
          var14 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            this.c(-10, -66);
            break L0;
          }
        }
        L1: {
          var3 = this.field_i.a((byte) -123, param1);
          if (!this.field_i.field_d) {
            break L1;
          } else {
            var4 = this.field_m + (this.field_m + 1);
            var5 = 65536 / var4;
            var6 = this.field_n + (this.field_n - -1);
            var7 = 65536 / var6;
            var19 = new int[var4][];
            var17 = var19;
            var8 = var17;
            var9 = param1 + -this.field_m;
            L2: while (true) {
              if (var9 > this.field_m + param1) {
                var9 = 0;
                L3: while (true) {
                  if (ns.field_g <= var9) {
                    break L1;
                  } else {
                    var10 = 0;
                    var11 = 0;
                    L4: while (true) {
                      if (var4 <= var11) {
                        var3[var9] = var5 * var10 >> 2068838160;
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
                var10_ref_int__ = this.c(0, -98, hba.field_b & var9);
                var18 = new int[ns.field_g];
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -this.field_n;
                L5: while (true) {
                  if (var13 > this.field_n) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (var15 >= ns.field_g) {
                        var8[-param1 + (var9 + this.field_m)] = var18;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var7 * var12 >> -1887913936;
                        var12 = var12 - var10_ref_int__[una.field_b & -this.field_n + var15];
                        var15++;
                        var12 = var12 + var10_ref_int__[var15 - -this.field_n & una.field_b];
                        continue L6;
                      }
                    }
                  } else {
                    var12 = var12 + var10_ref_int__[var13 & una.field_b];
                    var13++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
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
        int[] var49 = null;
        int[] var47 = null;
        int[] var48 = null;
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
        int var23 = TombRacer.field_G ? 1 : 0;
        int[][] var37 = this.field_h.a(param0, (byte) 117);
        int[][] var29 = var37;
        int[][] var3 = var29;
        if (param1 != -1) {
            this.field_m = -39;
        }
        if (this.field_h.field_f) {
            var4 = 1 + (this.field_m - -this.field_m);
            var5 = 65536 / var4;
            var6 = this.field_n - (-this.field_n + -1);
            var7 = 65536 / var6;
            var38 = new int[var4][][];
            var30 = var38;
            var8 = var30;
            for (var9_int = param0 + -this.field_m; this.field_m + param0 >= var9_int; var9_int++) {
                var46 = this.a(hba.field_b & var9_int, 0, -1);
                var50 = new int[3][ns.field_g];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var49 = var46[0];
                var47 = var46[1];
                var48 = var46[2];
                for (var18_int = -this.field_n; var18_int <= this.field_n; var18_int++) {
                    var19_int = var18_int & una.field_b;
                    var13 = var13 + var47[var19_int];
                    var14 = var14 + var48[var19_int];
                    var12 = var12 + var49[var19_int];
                }
                var18 = var50[0];
                var19 = var50[1];
                var20 = var50[2];
                var21 = 0;
                while (ns.field_g > var21) {
                    var18[var21] = var12 * var7 >> -972957328;
                    var19[var21] = var13 * var7 >> -1727724016;
                    var20[var21] = var7 * var14 >> -2048694992;
                    var22 = var21 + -this.field_n & una.field_b;
                    var13 = var13 - var47[var22];
                    var21++;
                    var12 = var12 - var49[var22];
                    var14 = var14 - var48[var22];
                    var22 = this.field_n + var21 & una.field_b;
                    var12 = var12 + var49[var22];
                    var13 = var13 + var47[var22];
                    var14 = var14 + var48[var22];
                }
                var8[-param0 + var9_int - -this.field_m] = var50;
            }
            var9 = var37[0];
            var10 = var37[1];
            var11 = var37[2];
            for (var12 = 0; ns.field_g > var12; var12++) {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                for (var16 = 0; var16 < var4; var16++) {
                    var51 = var38[var16];
                    var13 = var13 + var51[0][var12];
                    var15 = var15 + var51[2][var12];
                    var14 = var14 + var51[1][var12];
                }
                var9[var12] = var13 * var5 >> 355519536;
                var10[var12] = var5 * var14 >> -1041783952;
                var11[var12] = var15 * var5 >> -1113407696;
            }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_m = -16;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (1 != var4_int) {
                  if (-3 == (var4_int ^ -1)) {
                    L3: {
                      stackIn_13_0 = this;

                      if (1 != param1.h(255)) {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 1;
                        break L3;
                      }
                    }
                    ((cl) (this)).field_g = stackIn_14_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  this.field_m = param1.h(255);
                  break L2;
                }
              } else {
                this.field_n = param1.h(255);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("cl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, byte param1, int param2, int param3) {
        int stackIn_29_0 = 0;
        int var4;
        int var5;
        L0: {
          if (param0) {
            if (jk.field_h[param3] >= jk.field_h[param2]) {
              if (jk.field_h[param2] >= jk.field_h[param3]) {
                if (ic.field_c[param3] >= ic.field_c[param2]) {
                  if (ic.field_c[param3] > ic.field_c[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (ic.field_c[param3] >= ic.field_c[param2]) {
              if (ic.field_c[param2] < ic.field_c[param3]) {
                return false;
              } else {
                if (jk.field_h[param2] <= jk.field_h[param3]) {
                  if (jk.field_h[param2] < jk.field_h[param3]) {
                    return false;
                  } else {
                    break L0;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        }
        var4 = bq.field_h[param3] + cu.field_o[param3] - -im.field_o[param3];
        var5 = cu.field_o[param2] + bq.field_h[param2] + im.field_o[param2];
        if (var4 >= var5) {
          if (var5 >= var4) {
            L1: {
              if (param1 >= 117) {
                break L1;
              } else {
                cl.a(false, (byte) -6, 50, 41);
                break L1;
              }
            }
            L2: {
              if (param2 <= param3) {
                stackIn_29_0 = 0;
                break L2;
              } else {
                stackIn_29_0 = 1;
                break L2;
              }
            }
            return stackIn_29_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        field_o = false;
    }
}
