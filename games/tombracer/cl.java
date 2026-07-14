/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends ci {
    static boolean field_o;
    private int field_m;
    private int field_n;

    public cl() {
        super(1, false);
        ((cl) this).field_m = 1;
        ((cl) this).field_n = 1;
    }

    final int[] c(int param0, int param1) {
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
          var14 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            int[] discarded$1 = ((cl) this).c(-10, -66);
            break L0;
          }
        }
        L1: {
          var3 = ((cl) this).field_i.a((byte) -123, param1);
          if (!((cl) this).field_i.field_d) {
            break L1;
          } else {
            var4 = ((cl) this).field_m + (((cl) this).field_m + 1);
            var5 = 65536 / var4;
            var6 = ((cl) this).field_n + (((cl) this).field_n - -1);
            var7 = 65536 / var6;
            var23 = new int[var4][];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var8 = var17;
            var9 = param1 + -((cl) this).field_m;
            L2: while (true) {
              if (var9 > ((cl) this).field_m + param1) {
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
                        var10 = var10 + var23[var11][var9];
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var10_ref_int__ = ((cl) this).c(0, -98, hba.field_b & var9);
                var22 = new int[ns.field_g];
                var20 = var22;
                var18 = var20;
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -((cl) this).field_n;
                L5: while (true) {
                  if (var13 > ((cl) this).field_n) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (var15 >= ns.field_g) {
                        var8[-param1 + (var9 + ((cl) this).field_m)] = var22;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var7 * var12 >> -1887913936;
                        var12 = var12 - var10_ref_int__[una.field_b & -((cl) this).field_n + var15];
                        var15++;
                        var12 = var12 + var10_ref_int__[var15 - -((cl) this).field_n & una.field_b];
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
          var23 = TombRacer.field_G ? 1 : 0;
          var53 = ((cl) this).field_h.a(param0, (byte) 117);
          var45 = var53;
          var37 = var45;
          var29 = var37;
          var3 = var29;
          if (param1 == -1) {
            break L0;
          } else {
            ((cl) this).field_m = -39;
            break L0;
          }
        }
        L1: {
          if (!((cl) this).field_h.field_f) {
            break L1;
          } else {
            var4 = 1 + (((cl) this).field_m - -((cl) this).field_m);
            var5 = 65536 / var4;
            var6 = ((cl) this).field_n - (-((cl) this).field_n + -1);
            var7 = 65536 / var6;
            var54 = new int[var4][][];
            var46 = var54;
            var38 = var46;
            var30 = var38;
            var8 = var30;
            var9_int = param0 + -((cl) this).field_m;
            L2: while (true) {
              if (((cl) this).field_m + param0 < var9_int) {
                var9 = var53[0];
                var10 = var53[1];
                var11 = var53[2];
                var12 = 0;
                L3: while (true) {
                  if (ns.field_g <= var12) {
                    break L1;
                  } else {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L4: while (true) {
                      if (var16 >= var4) {
                        var9[var12] = var13 * var5 >> 355519536;
                        var10[var12] = var5 * var14 >> -1041783952;
                        var11[var12] = var15 * var5 >> -1113407696;
                        var12++;
                        continue L3;
                      } else {
                        var55 = var54[var16];
                        var13 = var13 + var55[0][var12];
                        var15 = var15 + var55[2][var12];
                        var14 = var14 + var55[1][var12];
                        var16++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var48 = ((cl) this).a(hba.field_b & var9_int, 0, -1);
                var52 = new int[3][ns.field_g];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var51 = var48[0];
                var49 = var48[1];
                var50 = var48[2];
                var18_int = -((cl) this).field_n;
                L5: while (true) {
                  if (var18_int > ((cl) this).field_n) {
                    var18 = var52[0];
                    var19 = var52[1];
                    var20 = var52[2];
                    var21 = 0;
                    L6: while (true) {
                      if (ns.field_g <= var21) {
                        var8[-param0 + var9_int - -((cl) this).field_m] = var52;
                        var9_int++;
                        continue L2;
                      } else {
                        var18[var21] = var12 * var7 >> -972957328;
                        var19[var21] = var13 * var7 >> -1727724016;
                        var20[var21] = var7 * var14 >> -2048694992;
                        var22 = var21 + -((cl) this).field_n & una.field_b;
                        var13 = var13 - var49[var22];
                        var21++;
                        var12 = var12 - var51[var22];
                        var14 = var14 - var50[var22];
                        var22 = ((cl) this).field_n + var21 & una.field_b;
                        var12 = var12 + var51[var22];
                        var13 = var13 + var49[var22];
                        var14 = var14 + var50[var22];
                        continue L6;
                      }
                    }
                  } else {
                    var19_int = var18_int & una.field_b;
                    var13 = var13 + var49[var19_int];
                    var14 = var14 + var50[var19_int];
                    var12 = var12 + var51[var19_int];
                    var18_int++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 107) {
            break L0;
          } else {
            ((cl) this).field_m = -16;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (var4 != -1) {
            if (1 != var4) {
              if (-3 == var4) {
                L2: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (1 != param1.h(255)) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L2;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L2;
                  }
                }
                ((cl) this).field_g = stackIn_13_1 != 0;
                break L1;
              } else {
                break L1;
              }
            } else {
              ((cl) this).field_m = param1.h(255);
              break L1;
            }
          } else {
            ((cl) this).field_n = param1.h(255);
            break L1;
          }
        }
    }

    final static boolean a(boolean param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
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
                boolean discarded$1 = cl.a(false, (byte) -6, 50, 41);
                break L1;
              }
            }
            L2: {
              if (param2 <= param3) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L2;
              } else {
                stackOut_27_0 = 1;
                stackIn_29_0 = stackOut_27_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
