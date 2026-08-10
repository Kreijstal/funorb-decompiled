/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends ji {
    static String field_B;
    private int field_A;
    static String field_y;
    private int field_z;

    final static jp a(mi param0, boolean param1) {
        jp stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jp var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c((byte) -120, 8);
            if ((var2_int ^ -1) < -1) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_y = (String) null;
                  break L1;
                }
              }
              L2: {
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
                  break L2;
                } else {
                  var5.field_K = (short)param0.c((byte) -125, 16);
                  var5.field_h = ee.a(param0, -90, 16, var5.field_h);
                  var5.field_O = ee.a(param0, -34, 16, var5.field_O);
                  var5.field_a = ee.a(param0, -109, 16, var5.field_a);
                  var5.field_g = ee.a(param0, -105, 16, var5.field_g);
                  var5.field_P = ee.a(param0, -121, 16, var5.field_P);
                  var5.field_C = ee.a(param0, -30, 16, var5.field_C);
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  param0.c((byte) -94, 16);
                  var5.field_N = ee.a(param0, -65, 16, var5.field_N);
                  var5.field_d = ee.a(param0, -55, 16, var5.field_d);
                  var5.field_Q = ee.a(param0, -117, 16, var5.field_Q);
                  var5.field_q = ee.a(param0, -26, 16, var5.field_q);
                  var5.field_e = ee.a(param0, -122, 16, var5.field_e);
                  break L3;
                }
              }
              L4: {
                if (!id.a(param0, -31980)) {
                  break L4;
                } else {
                  var5.field_J = ee.a(param0, -42, 16, var5.field_J);
                  break L4;
                }
              }
              L5: {
                if (!id.a(param0, -31980)) {
                  break L5;
                } else {
                  var5.field_x = oe.a(12635, var5.field_x, 16, param0);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var5.field_x.length <= var7) {
                      if (var6 == 0) {
                        var5.field_x = null;
                        break L5;
                      } else {
                        var5.field_G = (byte)(1 + var6);
                        break L5;
                      }
                    } else {
                      if (var6 < (255 & var5.field_x[var7])) {
                        var6 = var5.field_x[var7] & 255;
                        var7++;
                        continue L6;
                      } else {
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              stackIn_24_0 = (jp) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("di.E(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    public di() {
        super(1, false);
        this.field_z = 1;
        this.field_A = 1;
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
        int[] var48 = null;
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
        int var23 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
            this.c(-24, 93);
        }
        int[][] var37 = this.field_v.a(param1, -2);
        int[][] var29 = var37;
        int[][] var3 = var29;
        if (this.field_v.field_c) {
            var4 = 1 + this.field_A + this.field_A;
            var5 = 65536 / var4;
            var6 = 1 + this.field_z + this.field_z;
            var7 = 65536 / var6;
            var38 = new int[var4][][];
            var30 = var38;
            var8 = var30;
            for (var9_int = -this.field_A + param1; var9_int <= this.field_A + param1; var9_int++) {
                var46 = this.c(0, 3, fk.field_x & var9_int);
                var50 = new int[3][we.field_M];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var49 = var46[0];
                var48 = var46[1];
                var47 = var46[2];
                for (var18_int = -this.field_z; var18_int <= this.field_z; var18_int++) {
                    var19_int = rm.field_z & var18_int;
                    var14 = var14 + var47[var19_int];
                    var13 = var13 + var48[var19_int];
                    var12 = var12 + var49[var19_int];
                }
                var18 = var50[0];
                var19 = var50[1];
                var20 = var50[2];
                var21 = 0;
                while (we.field_M > var21) {
                    var18[var21] = var12 * var7 >> 300574480;
                    var19[var21] = var13 * var7 >> -1770570000;
                    var20[var21] = var14 * var7 >> -1146846704;
                    var22 = rm.field_z & -this.field_z + var21;
                    var21++;
                    var12 = var12 - var49[var22];
                    var14 = var14 - var47[var22];
                    var13 = var13 - var48[var22];
                    var22 = var21 + this.field_z & rm.field_z;
                    var12 = var12 + var49[var22];
                    var14 = var14 + var47[var22];
                    var13 = var13 + var48[var22];
                }
                var8[-param1 + var9_int + this.field_A] = var50;
            }
            var9 = var37[0];
            var10 = var37[1];
            var11 = var37[2];
            for (var12 = 0; var12 < we.field_M; var12++) {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                for (var16 = 0; var16 < var4; var16++) {
                    var51 = var38[var16];
                    var15 = var15 + var51[2][var12];
                    var13 = var13 + var51[0][var12];
                    var14 = var14 + var51[1][var12];
                }
                var9[var12] = var13 * var5 >> -1618687344;
                var10[var12] = var5 * var14 >> -386474128;
                var11[var12] = var15 * var5 >> 841155248;
            }
        }
        return var3;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        try {
            wa.field_i.b(-1);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                l.field_b[var1_int] = 0L;
            }
            var1_int = -12 % ((28 - param0) / 55);
            for (var2 = 0; 32 > var2; var2++) {
                hd.field_d[var2] = 0L;
            }
            tf.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "di.A(" + param0 + ')');
        }
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
        CharSequence var5 = (CharSequence) ((Object) param2);
        sm.field_Kb = rc.a(var5, 320);
        il.field_a = true;
        if (param0 <= 14) {
            return;
        }
        try {
            ie.field_Nb = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
          var14 = Vertigo2.field_L ? 1 : 0;
          if (param1 > 91) {
            break L0;
          } else {
            field_B = (String) null;
            break L0;
          }
        }
        L1: {
          var3 = this.field_x.a(param0, (byte) -91);
          if (this.field_x.field_i) {
            var4 = this.field_A + (this.field_A - -1);
            var5 = 65536 / var4;
            var6 = 1 + (this.field_z - -this.field_z);
            var7 = 65536 / var6;
            var19 = new int[var4][];
            var17 = var19;
            var8 = var17;
            var9 = param0 + -this.field_A;
            L2: while (true) {
              if (var9 > this.field_A + param0) {
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
                        var10 = var10 + var19[var11][var9];
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var10_ref_int__ = this.a(0, -1, var9 & fk.field_x);
                var18 = new int[we.field_M];
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -this.field_z;
                L5: while (true) {
                  if (this.field_z < var13) {
                    var15 = 0;
                    var13 = var15;
                    L6: while (true) {
                      if (var15 >= we.field_M) {
                        var8[-param0 + var9 - -this.field_A] = var18;
                        var9++;
                        continue L2;
                      } else {
                        var11_ref_int__[var15] = var7 * var12 >> 1471734896;
                        var12 = var12 - var10_ref_int__[rm.field_z & -this.field_z + var15];
                        var15++;
                        var12 = var12 + var10_ref_int__[rm.field_z & this.field_z + var15];
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
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                this.field_z = 86;
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (0 != var4_int) {
                if (-2 != (var4_int ^ -1)) {
                  L3: {
                    if (var4_int != 2) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_13_0 = this;

                        if (param2.h(-11) != 1) {
                          stackIn_14_0 = this;
                          stackIn_14_1 = 0;
                          break L4;
                        } else {
                          stackIn_14_0 = this;
                          stackIn_14_1 = 1;
                          break L4;
                        }
                      }
                      ((di) (this)).field_o = stackIn_14_1 != 0;
                      break L3;
                    }
                  }
                  break L2;
                } else {
                  this.field_A = param2.h(-11);
                  break L2;
                }
              } else {
                this.field_z = param2.h(-11);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
        field_y = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_B = "To <%0>: ";
    }
}
