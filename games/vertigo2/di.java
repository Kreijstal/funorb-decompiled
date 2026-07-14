/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends ji {
    static String field_B;
    private int field_A;
    static String field_y;
    private int field_z;

    final static jp a(mi param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jp var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var2 = param0.c((byte) -120, 8);
        if ((var2 ^ -1) < -1) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param1) {
              break L0;
            } else {
              field_y = null;
              break L0;
            }
          }
          L1: {
            var3 = id.a(param0, -31980) ? 1 : 0;
            var4 = id.a(param0, -31980) ? 1 : 0;
            var5 = new jp();
            var5.field_F = (short)param0.c((byte) -96, 16);
            var5.field_I = ee.a(param0, -126, 16, var5.field_I);
            var5.field_r = ee.a(param0, -92, 16, var5.field_r);
            var5.field_m = ee.a(param0, -120, 16, var5.field_m);
            var5.field_w = (short)param0.c((byte) -114, 16);
            var5.field_p = ee.a(param0, -39, 16, var5.field_p);
            var5.field_L = ee.a(param0, -95, 16, var5.field_L);
            var5.field_c = ee.a(param0, -40, 16, var5.field_c);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_K = (short)param0.c((byte) -125, 16);
              var5.field_h = ee.a(param0, -90, 16, var5.field_h);
              var5.field_O = ee.a(param0, -34, 16, var5.field_O);
              var5.field_a = ee.a(param0, -109, 16, var5.field_a);
              var5.field_g = ee.a(param0, -105, 16, var5.field_g);
              var5.field_P = ee.a(param0, -121, 16, var5.field_P);
              var5.field_C = ee.a(param0, -30, 16, var5.field_C);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$1 = param0.c((byte) -94, 16);
              var5.field_N = ee.a(param0, -65, 16, var5.field_N);
              var5.field_d = ee.a(param0, -55, 16, var5.field_d);
              var5.field_Q = ee.a(param0, -117, 16, var5.field_Q);
              var5.field_q = ee.a(param0, -26, 16, var5.field_q);
              var5.field_e = ee.a(param0, -122, 16, var5.field_e);
              break L2;
            }
          }
          L3: {
            if (!id.a(param0, -31980)) {
              break L3;
            } else {
              var5.field_J = ee.a(param0, -42, 16, var5.field_J);
              break L3;
            }
          }
          L4: {
            if (!id.a(param0, -31980)) {
              break L4;
            } else {
              var5.field_x = oe.a(12635, var5.field_x, 16, param0);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var5.field_x.length <= var7) {
                  if (var6 == 0) {
                    var5.field_x = null;
                    break L4;
                  } else {
                    var5.field_G = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  if (var6 < (255 & var5.field_x[var7])) {
                    var6 = var5.field_x[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    public di() {
        super(1, false);
        ((di) this).field_z = 1;
        ((di) this).field_A = 1;
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
          var23 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            int[] discarded$1 = ((di) this).c(-24, 93);
            break L0;
          }
        }
        L1: {
          var53 = ((di) this).field_v.a(param1, -2);
          var45 = var53;
          var37 = var45;
          var29 = var37;
          var3 = var29;
          if (!((di) this).field_v.field_c) {
            break L1;
          } else {
            var4 = 1 + ((di) this).field_A + ((di) this).field_A;
            var5 = 65536 / var4;
            var6 = 1 + ((di) this).field_z + ((di) this).field_z;
            var7 = 65536 / var6;
            var54 = new int[var4][][];
            var46 = var54;
            var38 = var46;
            var30 = var38;
            var8 = var30;
            var9_int = -((di) this).field_A + param1;
            L2: while (true) {
              if (var9_int > ((di) this).field_A + param1) {
                var9 = var53[0];
                var10 = var53[1];
                var11 = var53[2];
                var12 = 0;
                L3: while (true) {
                  if (var12 >= we.field_M) {
                    break L1;
                  } else {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L4: while (true) {
                      if (var16 >= var4) {
                        var9[var12] = var13 * var5 >> -1618687344;
                        var10[var12] = var5 * var14 >> -386474128;
                        var11[var12] = var15 * var5 >> 841155248;
                        var12++;
                        continue L3;
                      } else {
                        var55 = var54[var16];
                        var15 = var15 + var55[2][var12];
                        var13 = var13 + var55[0][var12];
                        var14 = var14 + var55[1][var12];
                        var16++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var48 = ((di) this).c(0, 3, fk.field_x & var9_int);
                var52 = new int[3][we.field_M];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var51 = var48[0];
                var50 = var48[1];
                var49 = var48[2];
                var18_int = -((di) this).field_z;
                L5: while (true) {
                  if (var18_int > ((di) this).field_z) {
                    var18 = var52[0];
                    var19 = var52[1];
                    var20 = var52[2];
                    var21 = 0;
                    L6: while (true) {
                      if (we.field_M <= var21) {
                        var8[-param1 + var9_int + ((di) this).field_A] = var52;
                        var9_int++;
                        continue L2;
                      } else {
                        var18[var21] = var12 * var7 >> 300574480;
                        var19[var21] = var13 * var7 >> -1770570000;
                        var20[var21] = var14 * var7 >> -1146846704;
                        var22 = rm.field_z & -((di) this).field_z + var21;
                        var21++;
                        var12 = var12 - var51[var22];
                        var14 = var14 - var49[var22];
                        var13 = var13 - var50[var22];
                        var22 = var21 + ((di) this).field_z & rm.field_z;
                        var12 = var12 + var51[var22];
                        var14 = var14 + var49[var22];
                        var13 = var13 + var50[var22];
                        continue L6;
                      }
                    }
                  } else {
                    var19_int = rm.field_z & var18_int;
                    var14 = var14 + var49[var19_int];
                    var13 = var13 + var50[var19_int];
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

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        wa.field_i.b(-1);
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            l.field_b[var1] = 0L;
        }
        var1 = -12 % ((28 - param0) / 55);
        for (var2 = 0; 32 > var2; var2++) {
            hd.field_d[var2] = 0L;
        }
        tf.field_n = 0;
    }

    public static void g(int param0) {
        field_B = null;
        field_y = null;
        if (param0 != 0) {
            di.g(-78);
        }
    }

    final static void a(byte param0, long param1, String param2) {
        ea.field_b = param2;
        ui.field_g = 2;
        CharSequence var5 = (CharSequence) (Object) param2;
        sm.field_Kb = rc.a(var5, 320);
        il.field_a = true;
        if (param0 <= 14) {
            return;
        }
        ie.field_Nb = param1;
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
          var14 = Vertigo2.field_L ? 1 : 0;
          if (param1 > 91) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        L1: {
          var3 = ((di) this).field_x.a(param0, (byte) -91);
          if (((di) this).field_x.field_i) {
            var4 = ((di) this).field_A + (((di) this).field_A - -1);
            var5 = 65536 / var4;
            var6 = 1 + (((di) this).field_z - -((di) this).field_z);
            var7 = 65536 / var6;
            var23 = new int[var4][];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var8 = var17;
            var9 = param0 + -((di) this).field_A;
            L2: while (true) {
              if (var9 > ((di) this).field_A + param0) {
                var9 = 0;
                L3: while (true) {
                  if (var9 >= we.field_M) {
                    break L1;
                  } else {
                    var10 = 0;
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= var4) {
                        var3[var9] = var5 * var10 >> 47893424;
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
                var10_ref_int__ = ((di) this).a(0, -1, var9 & fk.field_x);
                var22 = new int[we.field_M];
                var20 = var22;
                var18 = var20;
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -((di) this).field_z;
                L5: while (true) {
                  if (((di) this).field_z < var13) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (var15 >= we.field_M) {
                        var8[-param0 + var9 - -((di) this).field_A] = var22;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var7 * var12 >> 1471734896;
                        var12 = var12 - var10_ref_int__[rm.field_z & -((di) this).field_z + var15];
                        var15++;
                        var12 = var12 + var10_ref_int__[rm.field_z & ((di) this).field_z + var15];
                        continue L6;
                      }
                    }
                  } else {
                    var12 = var12 + var10_ref_int__[var13 & rm.field_z];
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

    final void a(byte param0, int param1, ed param2) {
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
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 110) {
            break L0;
          } else {
            ((di) this).field_z = 86;
            break L0;
          }
        }
        L1: {
          var4 = param1;
          if (0 != var4) {
            if (-2 != (var4 ^ -1)) {
              if (var4 != 2) {
                break L1;
              } else {
                L2: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param2.h(-11) != 1) {
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
                ((di) this).field_o = stackIn_13_1 != 0;
                break L1;
              }
            } else {
              ((di) this).field_A = param2.h(-11);
              break L1;
            }
          } else {
            ((di) this).field_z = param2.h(-11);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_B = "To <%0>: ";
    }
}
