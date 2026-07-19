/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends l {
    qd[] field_g;
    short[] field_p;
    private int[] field_m;
    static String field_i;
    byte[] field_j;
    int field_q;
    byte[] field_n;
    ml[] field_l;
    byte[] field_k;
    static il field_o;
    static String[] field_h;

    final static void d(int param0) {
        me.field_d.a(0, 18, -(ql.field_d ? 40 + (2 + (oc.field_k + 2)) : 0) + ij.field_m.field_K, (byte) -52, 0);
        wm.field_m.a(-40 + -oc.field_k + (ij.field_m.field_K + -2), 18, oc.field_k + 42, (byte) -69, 0);
        uf.field_j.a(20, -127, ij.field_m.field_K, 2, param0 + ij.field_m.field_ub, 0, oc.field_k);
    }

    final boolean a(jg param0, byte[] param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            if (param2 == 112) {
              var8 = 0;
              L1: while (true) {
                if (-129 >= (var8 ^ -1)) {
                  stackOut_22_0 = var5_int;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        if (0 == param1[var8]) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = this.field_m[var8];
                    if (var9 != 0) {
                      L4: {
                        if (var9 != var6) {
                          L5: {
                            var6 = var9;
                            var9--;
                            if (-1 != (var9 & 1 ^ -1)) {
                              var7 = param0.a(param3, var9 >> 361113794, true);
                              break L5;
                            } else {
                              var7 = param0.a(param3, var9 >> -1605739134, 0);
                              break L5;
                            }
                          }
                          if (var7 == null) {
                            var5_int = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      if (var7 == null) {
                        break L2;
                      } else {
                        this.field_l[var8] = (ml) (var7);
                        this.field_m[var8] = 0;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("rc.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if ((param0 ^ -1) < -1) {
            var2 = 1;
            if (!(-65536 <= (param0 ^ -1))) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (255 < param0) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (-16 > (param0 ^ -1)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!((param0 ^ -1) >= -4)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (65535 < (param0 ^ -1)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if ((param0 ^ -1) > 255) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if ((param0 ^ -1) > 15) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (param1 != 4) {
            rc.d(-101);
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final static void c(int param0) {
        int fieldTemp$5 = 0;
        hg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_h = (String[]) null;
                break L1;
              }
            }
            var1 = gk.field_g;
            L2: while (true) {
              if (!kf.a((byte) -74)) {
                break L0;
              } else {
                var1.g(8, 8);
                fieldTemp$5 = var1.field_l + 1;
                var1.field_l = var1.field_l + 1;
                var2 = fieldTemp$5;
                hd.a(false, var1);
                gk.field_g.b(var1.field_l + -var2, -1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "rc.F(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        int discarded$0 = 0;
        this.field_m = null;
        if (param0 >= -68) {
            discarded$0 = rc.a(-96, -3);
        }
    }

    rc(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        qd dupTemp$17 = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        qd[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        qd var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        jc var38 = null;
        byte[] var39 = null;
        qd var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        qd var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        qd var48 = null;
        qd var49 = null;
        qd var50 = null;
        qd var51 = null;
        qd var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_206_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_38_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_41_0 = null;
        byte[] stackOut_40_0 = null;
        RuntimeException stackOut_203_0 = null;
        StringBuilder stackOut_203_1 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        String stackOut_205_2 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        String stackOut_204_2 = null;
        try {
          L0: {
            this.field_p = new short[128];
            this.field_g = new qd[128];
            this.field_m = new int[128];
            this.field_l = new ml[128];
            this.field_j = new byte[128];
            this.field_k = new byte[128];
            this.field_n = new byte[128];
            var38 = new jc(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_g[var3 + var38.field_l] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var3++;
                    var38.field_l = var38.field_l + 1;
                    var5 = var38.field_l;
                    var38.field_l = var38.field_l + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (-1 == (var38.field_g[var6 + var38.field_l] ^ -1)) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var6++;
                            var38.field_l = var38.field_l + 1;
                            var8 = var38.field_l;
                            var38.field_l = var38.field_l + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (-1 == (var38.field_g[var9 + var38.field_l] ^ -1)) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var9++;
                                      var38.field_l = var38.field_l + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (var9 > 1) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.g(11132);
                                              if (-1 != (var15_int ^ -1)) {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = var9;
                                        break L7;
                                      }
                                    }
                                    var13 = new qd[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.g(11132);
                                          if (0 >= var14) {
                                            stackOut_38_0 = null;
                                            stackIn_39_0 = (byte[]) ((Object) stackOut_38_0);
                                            break L12;
                                          } else {
                                            stackOut_37_0 = new byte[2 * var14];
                                            stackIn_39_0 = stackOut_37_0;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15_array = var46;
                                          var14 = var38.g(11132);
                                          if (var14 <= 0) {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = (byte[]) ((Object) stackOut_41_0);
                                            break L13;
                                          } else {
                                            stackOut_40_0 = new byte[var14 * 2];
                                            stackIn_42_0 = stackOut_40_0;
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_g[var38.field_l + var17] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var38.field_l = var38.field_l + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var20 ^ -1)) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (var23 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if ((var24 ^ -1) <= -129) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (var26 >= 128) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (-129 >= (var27 ^ -1)) {
                                                                            this.field_q = 1 + var38.g(11132);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var46.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.a((byte) -123);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var27 >= var47.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.a((byte) -98);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          if (var15_array == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.g(11132);
                                                                                            var15_array[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var46.length <= var27) {
                                                                                                var27 = var46[0];
                                                                                                var28 = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var46.length <= var29) {
                                                                                                        var15_array = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_k[var30] = (byte)(var28 * this.field_k[var30] + 32 >> -411365850);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15_array[1 + var29];
                                                                                                        var32 = (-var27 + var30) / 2 + (var30 - var27) * var28;
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = bn.a(var32, (byte) 122, -var27 + var30);
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_k[var33] = (byte)(this.field_k[var33] * var34 - -32 >> 1330236422);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_k[var29] = (byte)(32 + var28 * this.field_k[var29] >> 1646641382);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 + (1 - -var38.g(11132));
                                                                                                var15_array[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 == null) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            var19 = var38.g(11132);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var47.length <= var27) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 90142337;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = (255 & this.field_n[var30]) + var28;
                                                                                                              if ((var31 ^ -1) <= -1) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if ((var31 ^ -1) >= -129) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_n[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[1 + var29] << -723355999;
                                                                                                        var32 = (-var27 + var30) * var28 - -((var30 + -var27) / 2);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = bn.a(var32, (byte) 126, var30 - var27);
                                                                                                              var35 = (this.field_n[var37] & 255) - -var34;
                                                                                                              if (var35 >= 0) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (128 >= var35) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_n[var37] = (byte)var35;
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28 + (this.field_n[var29] & 255);
                                                                                                      if (var30 >= 0) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if (var30 <= 128) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_n[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.g(11132) + (1 + var19);
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (0 >= var52.field_j) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_b = var38.g(11132);
                                                                                                                break L53;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L52;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var51 = var13[var27];
                                                                                                          if (0 >= var51.field_h) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_j = var38.g(11132);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_h = var38.g(11132);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (var50.field_e == null) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_a = var38.g(11132);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_k) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.g(11132);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (-1 <= (var50.field_n ^ -1)) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_l = var38.g(11132);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_n = var38.g(11132);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_e == null) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_e.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = 1 + var19 - -var38.g(11132);
                                                                                                var49.field_e[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L59;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L60: {
                                                                                      var48 = var13[var27];
                                                                                      if (null == var48.field_k) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_k.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.g(11132);
                                                                                            var48.field_k[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L61;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L62: {
                                                                                  var45 = var13[var27];
                                                                                  if (null == var45.field_e) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var29 >= var45.field_e.length) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_e[var29] = var38.a((byte) 115);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (var45.field_k == null) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var45.field_k.length + -2 <= var29) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_k[var29] = var38.a((byte) -83);
                                                                                        var29 += 2;
                                                                                        continue L65;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L66: {
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var21 < var54.length) {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L67;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_m[var27] ^ -1)) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.g(11132) + 1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_k[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (-1 == (this.field_m[var26] ^ -1)) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var57.length > var21) {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L69;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_g[var26] = (qd) (var25);
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (-1 == (this.field_m[var25_int] ^ -1)) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (0 != var20) {
                                                                            break L71;
                                                                          } else {
                                                                            L72: {
                                                                              if (var21 >= var56.length) {
                                                                                var20 = -1;
                                                                                break L72;
                                                                              } else {
                                                                                incrementValue$12 = var21;
                                                                                var21++;
                                                                                var20 = var7[incrementValue$12];
                                                                                break L72;
                                                                              }
                                                                            }
                                                                            incrementValue$13 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_g[incrementValue$13] + 16 << -1319386110;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_n[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (0 == this.field_m[var24]) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var20 != 0) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$14 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_g[incrementValue$14];
                                                                        if (var21 >= var55.length) {
                                                                          var20 = -1;
                                                                          break L74;
                                                                        } else {
                                                                          incrementValue$15 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$15];
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                    this.field_j[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (var20 != 0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.c(0);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_p[var23] = (short)(this.field_p[var23] + rb.a(32768, -1 + var22 << -1625461170));
                                                            var20--;
                                                            this.field_m[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.g(11132);
                                                        this.field_p[var20] = (short)(this.field_p[var20] + (var19 << -337695448));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(11132);
                                                    this.field_p[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.a((byte) 41);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$17 = new qd();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.g(11132);
                                          if (var16_int <= 0) {
                                            break L77;
                                          } else {
                                            var15.field_e = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.g(11132);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15.field_k = new byte[var16_int * 2 - -2];
                                            var40.field_k[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.a((byte) -82);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.a((byte) -112);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.a((byte) -115);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackOut_203_0 = (RuntimeException) (var2);
            stackOut_203_1 = new StringBuilder().append("rc.<init>(");
            stackIn_205_0 = stackOut_203_0;
            stackIn_205_1 = stackOut_203_1;
            stackIn_204_0 = stackOut_203_0;
            stackIn_204_1 = stackOut_203_1;
            if (param0 == null) {
              stackOut_205_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackOut_205_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackOut_205_2 = "null";
              stackIn_206_0 = stackOut_205_0;
              stackIn_206_1 = stackOut_205_1;
              stackIn_206_2 = stackOut_205_2;
              break L79;
            } else {
              stackOut_204_0 = (RuntimeException) ((Object) stackIn_204_0);
              stackOut_204_1 = (StringBuilder) ((Object) stackIn_204_1);
              stackOut_204_2 = "{...}";
              stackIn_206_0 = stackOut_204_0;
              stackIn_206_1 = stackOut_204_1;
              stackIn_206_2 = stackOut_204_2;
              break L79;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_206_0), stackIn_206_2 + ')');
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_o = null;
        if (param0 != -24021) {
            discarded$0 = rc.a(-32, -102);
        }
        field_h = null;
        field_i = null;
    }

    static {
        field_i = "<%0> has the most pieces";
        field_h = new String[255];
    }
}
