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
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int[][] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[][] var23 = null;
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
          var3 = ((grb) this).field_f.a((byte) 121, param0);
          if (((grb) this).field_f.field_e) {
            var4 = 1 + (((grb) this).field_k + ((grb) this).field_k);
            var5 = 65536 / var4;
            var6 = ((grb) this).field_m + (((grb) this).field_m + 1);
            var7 = 65536 / var6;
            var23 = new int[var4][];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var8 = var17;
            var9 = param0 + -((grb) this).field_k;
            L2: while (true) {
              if (var9 > ((grb) this).field_k + param0) {
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
                        var10 = var10 + var23[var11][var9];
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var10_ref_int__ = ((grb) this).a(0, var9 & wf.field_d, 255);
                var22 = new int[hob.field_d];
                var20 = var22;
                var18 = var20;
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -((grb) this).field_m;
                L5: while (true) {
                  if (var13 > ((grb) this).field_m) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (hob.field_d <= var15) {
                        var8[-param0 + (var9 - -((grb) this).field_k)] = var22;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var12 * var7 >> -1845368240;
                        var12 = var12 - var10_ref_int__[gbb.field_q & var15 + -((grb) this).field_m];
                        var15++;
                        var12 = var12 + var10_ref_int__[((grb) this).field_m + var15 & gbb.field_q];
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
        ((grb) this).field_m = 1;
        ((grb) this).field_k = 1;
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (var4 == 0) {
            ((grb) this).field_m = param2.e((byte) -119);
            break L0;
          } else {
            if ((var4 ^ -1) == -2) {
              ((grb) this).field_k = param2.e((byte) -123);
              break L0;
            } else {
              if (2 == var4) {
                L1: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-2 != (param2.e((byte) -121) ^ -1)) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L1;
                  }
                }
                ((grb) this).field_g = stackIn_9_1 != 0;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param1 <= -60) {
            break L2;
          } else {
            grb.e((byte) -106);
            break L2;
          }
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int[][] var37 = null;
        int[][][] var38 = null;
        int[][] var45 = null;
        int[][][] var46 = null;
        int[][] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[][][] var54 = null;
        int[][] var55 = null;
        L0: {
          var23 = VoidHunters.field_G;
          var53 = ((grb) this).field_d.a(param1, (byte) -94);
          var45 = var53;
          var37 = var45;
          var29 = var37;
          var3 = var29;
          if (!((grb) this).field_d.field_g) {
            break L0;
          } else {
            var4 = ((grb) this).field_k + ((grb) this).field_k - -1;
            var5 = 65536 / var4;
            var6 = ((grb) this).field_m + ((grb) this).field_m + 1;
            var7 = 65536 / var6;
            var54 = new int[var4][][];
            var46 = var54;
            var38 = var46;
            var30 = var38;
            var8 = var30;
            var9_int = -((grb) this).field_k + param1;
            L1: while (true) {
              if (param1 - -((grb) this).field_k < var9_int) {
                var9 = var53[0];
                var10 = var53[1];
                var11 = var53[2];
                var12 = 0;
                L2: while (true) {
                  if (var12 >= hob.field_d) {
                    break L0;
                  } else {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L3: while (true) {
                      if (var4 <= var16) {
                        var9[var12] = var5 * var13 >> -775821776;
                        var10[var12] = var14 * var5 >> 109355792;
                        var11[var12] = var15 * var5 >> 1070671088;
                        var12++;
                        continue L2;
                      } else {
                        var55 = var54[var16];
                        var14 = var14 + var55[1][var12];
                        var13 = var13 + var55[0][var12];
                        var15 = var15 + var55[2][var12];
                        var16++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var48 = ((grb) this).a((byte) 110, 0, wf.field_d & var9_int);
                var52 = new int[3][hob.field_d];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var50 = var48[0];
                var51 = var48[1];
                var49 = var48[2];
                var18_int = -((grb) this).field_m;
                L4: while (true) {
                  if (var18_int > ((grb) this).field_m) {
                    var18 = var52[0];
                    var19 = var52[1];
                    var20 = var52[2];
                    var21 = 0;
                    L5: while (true) {
                      if (hob.field_d <= var21) {
                        var8[var9_int + ((grb) this).field_k - param1] = var52;
                        var9_int++;
                        continue L1;
                      } else {
                        var18[var21] = var7 * var12 >> -2027696400;
                        var19[var21] = var7 * var13 >> -1486867408;
                        var20[var21] = var7 * var14 >> -305495184;
                        var22 = -((grb) this).field_m + var21 & gbb.field_q;
                        var21++;
                        var12 = var12 - var50[var22];
                        var13 = var13 - var51[var22];
                        var14 = var14 - var49[var22];
                        var22 = gbb.field_q & ((grb) this).field_m + var21;
                        var14 = var14 + var49[var22];
                        var13 = var13 + var51[var22];
                        var12 = var12 + var50[var22];
                        continue L5;
                      }
                    }
                  } else {
                    var19_int = gbb.field_q & var18_int;
                    var14 = var14 + var49[var19_int];
                    var12 = var12 + var50[var19_int];
                    var13 = var13 + var51[var19_int];
                    var18_int++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        if (param0 == 255) {
          return var3;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[2];
        field_i = "Laser beam";
    }
}
