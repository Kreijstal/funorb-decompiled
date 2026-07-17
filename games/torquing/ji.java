/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_a;

    final static void a(boolean param0, uc param1, int param2, String param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = param1.a(param3);
              var7 = param1.field_t + param1.field_x;
              if (!param0) {
                break L1;
              } else {
                var14 = null;
                ji.a((rm) null, 115);
                break L1;
              }
            }
            L2: {
              var8 = 1;
              if (param4 >= var6_int) {
                break L2;
              } else {
                L3: {
                  var9 = var6_int / param4;
                  if (uf.field_q != null) {
                    break L3;
                  } else {
                    uf.field_q = new String[16];
                    break L3;
                  }
                }
                var10 = param4 + (var6_int % param4 - -var9 + -1) / var9 * 2;
                var8 = param1.a(param3, new int[1], uf.field_q);
                var7 = var7 * var8;
                var6_int = 0;
                var11 = 0;
                L4: while (true) {
                  if (var11 >= var8) {
                    break L2;
                  } else {
                    L5: {
                      var12 = param1.a(uf.field_q[var11]);
                      if (var12 <= var6_int) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var11++;
                    continue L4;
                  }
                }
              }
            }
            L6: {
              var9 = ro.field_w;
              if (ph.field_j < 6 + var9 + var6_int) {
                var9 = ph.field_j + -var6_int - 6;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var10 = 32 + -param1.field_s + ue.field_h;
              if (var7 + var10 - -6 > ph.field_d) {
                var10 = ue.field_h + (-var7 - 6);
                break L7;
              } else {
                break L7;
              }
            }
            ph.c(var9, var10, 6 + var6_int, 6 + var7, param2);
            ph.d(var9 - -1, 1 + var10, var6_int - -4, var7 + 4, 16777120);
            int discarded$1 = param1.a(param3, 3 + var9, 3 + var10, var6_int, var7, param2, -1, 0, 0, param1.field_x - -param1.field_t);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("ji.A(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param4 + 44 + 16777120 + 41);
        }
    }

    final static he[] b(int param0) {
        return new he[]{mf.field_u, h.field_l, jf.field_c};
    }

    final static void a(rm param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        short[] var7 = null;
        byte[] var8 = null;
        short[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        short[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        short[] var26 = null;
        short[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        short[] var36 = null;
        short[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        short[] var46 = null;
        short[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        short[] var56 = null;
        short[] var57 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var2_int = param0.field_f + 1;
              var48 = new int[var2_int];
              var38 = var48;
              var28 = var38;
              var18 = var28;
              var3_ref_int__ = var18;
              var49 = new int[var2_int];
              var39 = var49;
              var29 = var39;
              var19 = var29;
              var11 = var19;
              var4 = var11;
              var50 = new int[var2_int];
              var40 = var50;
              var30 = var40;
              var20 = var30;
              var12 = var20;
              var5 = var12;
              dk.a(param0.field_M, 0, var48, 0, param0.field_f);
              dk.a(param0.field_B, 0, var49, 0, param0.field_f);
              dk.a(param0.field_E, 0, var50, 0, param0.field_f);
              param0.field_B = var11;
              param0.field_E = var12;
              param0.field_f = param0.field_f + 1;
              param0.field_M = var3_ref_int__;
              var2_int = param0.field_g;
              var3 = var2_int - -1;
              var51 = new int[var3];
              var41 = var51;
              var31 = var41;
              var21 = var31;
              var13 = var21;
              var4 = var13;
              var52 = new int[var3];
              var42 = var52;
              var32 = var42;
              var22 = var32;
              var14 = var22;
              var5 = var14;
              var53 = new int[var3];
              var43 = var53;
              var33 = var43;
              var23 = var33;
              var6 = var23;
              dk.a(param0.field_o, 0, var51, 0, var2_int);
              var57 = new short[var3];
              var47 = var57;
              var37 = var47;
              var27 = var37;
              var7 = var27;
              dk.a(param0.field_y, 0, var52, 0, var2_int);
              dk.a(param0.field_q, 0, var53, 0, var2_int);
              if (null == param0.field_j) {
                break L1;
              } else {
                var54 = new byte[var3];
                var44 = var54;
                var34 = var44;
                var24 = var34;
                var15 = var24;
                var8 = var15;
                dk.a(param0.field_j, 0, var54, 0, var2_int);
                param0.field_j = var15;
                break L1;
              }
            }
            L2: {
              if (param0.field_D == null) {
                break L2;
              } else {
                var55 = new byte[var3];
                var45 = var55;
                var35 = var45;
                var25 = var35;
                var16 = var25;
                var8 = var16;
                dk.a(param0.field_D, 0, var55, 0, var2_int);
                param0.field_D = var16;
                break L2;
              }
            }
            L3: {
              if (param0.field_A != null) {
                var56 = new short[var3];
                var46 = var56;
                var36 = var46;
                var26 = var36;
                var17 = var26;
                dk.a(param0.field_A, 0, var56, 0, var2_int);
                param0.field_A = var17;
                break L3;
              } else {
                var8_array = new short[var3];
                var9 = 0;
                L4: while (true) {
                  if (var3 + -1 <= var9) {
                    param0.field_A = var8_array;
                    break L3;
                  } else {
                    var8_array[var9] = (short) -1;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            dk.a(param0.field_m, 0, var57, 0, var2_int);
            param0.field_q = var6;
            param0.field_o = var4;
            param0.field_m = var7;
            param0.field_y = var5;
            var6[param0.field_g] = param0.field_f + param1;
            var5[param0.field_g] = param0.field_f + param1;
            var4[param0.field_g] = param0.field_f + param1;
            param0.field_A[param0.field_g] = (short) -32768;
            param0.field_g = param0.field_g + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ji.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 24 / ((param0 - -45) / 42);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (11 != op.field_i) {
                break L1;
              } else {
                oc.a((byte) 105);
                break L1;
              }
            }
            L2: {
              fh.a(aj.field_E, (byte) -98, mh.field_g, ob.field_b);
              ni.a(param1, 0, 0, 122);
              if (param0 == -99) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ji.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            var12 = ln.a(qk.field_p, j.field_q, param6, 103);
            var13 = ln.a(qk.field_p, j.field_q, param3, 81);
            var14 = ln.a(qg.field_z, kn.field_e, param0, 73);
            var15 = ln.a(qg.field_z, kn.field_e, param2, 113);
            var8_int = ln.a(qk.field_p, j.field_q, param6 + param7, 103);
            var9 = ln.a(qk.field_p, j.field_q, param3 - param7, 111);
            var16 = var12;
            L1: while (true) {
              if (var8_int <= var16) {
                var16 = var13;
                L2: while (true) {
                  if (var9 >= var16) {
                    var10 = ln.a(qg.field_z, kn.field_e, param0 - -param7, 126);
                    var11 = ln.a(qg.field_z, kn.field_e, -param7 + param2, 76);
                    var16 = -88 / ((39 - param5) / 39);
                    var17 = var8_int;
                    L3: while (true) {
                      if (var17 > var9) {
                        break L0;
                      } else {
                        var23 = qd.field_a[var17];
                        di.a(var14, (byte) -98, param1, var23, var10);
                        di.a(var10, (byte) 56, param4, var23, var11);
                        di.a(var11, (byte) 66, param1, var23, var15);
                        var17++;
                        continue L3;
                      }
                    }
                  } else {
                    di.a(var14, (byte) -108, param1, qd.field_a[var16], var15);
                    var16--;
                    continue L2;
                  }
                }
              } else {
                di.a(var14, (byte) -111, param1, qd.field_a[var16], var15);
                var16++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var8, "ji.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static dn a(boolean param0) {
        if (bh.field_a == tp.field_h) {
            throw new IllegalStateException();
        }
        return null;
    }

    static {
    }
}
