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
        RuntimeException var5 = null;
        int var5_int = 0;
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
                if (var8 >= 128) {
                  stackOut_22_0 = var5_int;
                  stackIn_23_0 = stackOut_22_0;
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
                    var9 = ((rc) this).field_m[var8];
                    if (var9 != 0) {
                      L4: {
                        if (var9 != var6) {
                          L5: {
                            var6 = var9;
                            var9--;
                            if ((var9 & 1) != 0) {
                              var7 = (Object) (Object) param0.a(param3, var9 >> 2, true);
                              break L5;
                            } else {
                              var7 = (Object) (Object) param0.a(param3, var9 >> 2, 0);
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
                        ((rc) this).field_l[var8] = (ml) var7;
                        ((rc) this).field_m[var8] = 0;
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
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("rc.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (param0 > 0) {
            var2 = 1;
            if (!(param0 <= 65535)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (255 < param0) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (param0 > 15) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(param0 <= 3)) {
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
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param0 < -16) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (param1 != 4) {
            rc.d(-101);
        }
        if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final static void c() {
        hg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1 = gk.field_g;
            L1: while (true) {
              if (!kf.a((byte) -74)) {
                break L0;
              } else {
                var1.g(8, 8);
                int fieldTemp$5 = var1.field_l + 1;
                var1.field_l = var1.field_l + 1;
                var2 = fieldTemp$5;
                hd.a(false, var1);
                gk.field_g.b(var1.field_l + -var2, -1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "rc.F(" + -1 + 41);
        }
    }

    final void a(byte param0) {
        ((rc) this).field_m = null;
        if (param0 >= -68) {
            int discarded$0 = rc.a(-96, -3);
        }
    }

    rc(byte[] param0) {
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
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        Object stackOut_37_0 = null;
        byte[] stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((rc) this).field_p = new short[128];
        ((rc) this).field_g = new qd[128];
        ((rc) this).field_m = new int[128];
        ((rc) this).field_l = new ml[128];
        ((rc) this).field_j = new byte[128];
        ((rc) this).field_k = new byte[128];
        ((rc) this).field_n = new byte[128];
        var38 = new jc(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_g[var3 + var38.field_l] == 0) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                var3++;
                var38.field_l = var38.field_l + 1;
                var5 = var38.field_l;
                var38.field_l = var38.field_l + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_g[var6 + var38.field_l] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var6++;
                        var38.field_l = var38.field_l + 1;
                        var8 = var38.field_l;
                        var38.field_l = var38.field_l + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_g[var9 + var38.field_l] == 0) {
                            var67 = new byte[var9];
                            var62 = var67;
                            var57 = var62;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (~var11_int <= ~var9) {
                                L6: {
                                  var9++;
                                  var38.field_l = var38.field_l + 1;
                                  var63 = new byte[var9];
                                  var58 = var63;
                                  var53 = var58;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 > 1) {
                                    var63[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (~var14 <= ~var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.g(11132);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (~var13_int > ~var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new qd[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.g(11132);
                                      if (0 >= var14) {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var46 = stackIn_38_0;
                                      var15_array = var46;
                                      var14 = var38.g(11132);
                                      if (var14 <= 0) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_g[var38.field_l + var17] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var19 <= ~var17) {
                                            var38.field_l = var38.field_l + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int >= 128) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((rc) this).field_q = 1 + var38.g(11132);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (~var27 <= ~var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var46.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.a((byte) -123);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (var27 >= var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.a((byte) -98);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var27 >= var12) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var12 >= ~var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.g(11132);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (~var46.length >= ~var27) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (~var29 <= ~var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (~var46.length >= ~var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((rc) this).field_k[var30] = (byte)(var28 * ((rc) this).field_k[var30] + 32 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (-var27 + var30) / 2 + (var30 - var27) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = bn.a(var32, (byte) 122, -var27 + var30);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((rc) this).field_k[var33] = (byte)(((rc) this).field_k[var33] * var34 - -32 >> 6);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((rc) this).field_k[var29] = (byte)(32 + var28 * ((rc) this).field_k[var29] >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.g(11132));
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 == null) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        var19 = var38.g(11132);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (~var27 >= ~var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (~var47.length >= ~var29) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((rc) this).field_n[var30]) + var28;
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if (var31 <= 128) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((rc) this).field_n[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1;
                                                                                                    var32 = (-var27 + var30) * var28 - -((var30 + -var27) / 2);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (~var30 >= ~var37) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = bn.a(var32, (byte) 126, var30 - var27);
                                                                                                          var35 = (((rc) this).field_n[var37] & 255) - -var34;
                                                                                                          if (var35 >= 0) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (128 >= var35) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((rc) this).field_n[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (((rc) this).field_n[var29] & 255);
                                                                                                  if (var30 >= 0) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (var30 <= 128) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((rc) this).field_n[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.g(11132) + (1 + var19);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (~var27 <= ~var12) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (~var12 >= ~var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (~var12 >= ~var27) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (0 >= var52.field_j) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_b = var38.g(11132);
                                                                                                            break L52;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (0 >= var51.field_h) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_j = var38.g(11132);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_h = var38.g(11132);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_e == null) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_a = var38.g(11132);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (null == var50.field_k) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_d = var38.g(11132);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_n <= 0) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_l = var38.g(11132);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_n = var38.g(11132);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_e == null) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (var29 >= var49.field_e.length) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = 1 + var19 - -var38.g(11132);
                                                                                            var49.field_e[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L58;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L59: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_k) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (var48.field_k.length <= var29) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = 1 + var19 + var38.g(11132);
                                                                                        var48.field_k[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L60;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L61: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_e) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (~var29 <= ~var45.field_e.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_e[var29] = var38.a((byte) 115);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (var45.field_k == null) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (var45.field_k.length + -2 <= var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_k[var29] = var38.a((byte) -83);
                                                                                    var29 += 2;
                                                                                    continue L64;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L65: {
                                                                          if (var20 != 0) {
                                                                            break L65;
                                                                          } else {
                                                                            L66: {
                                                                              if (var21 < var64.length) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((rc) this).field_m[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = var38.g(11132) + 1;
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((rc) this).field_k[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((rc) this).field_m[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var63[var21]];
                                                                            if (var67.length > var21) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((rc) this).field_g[var26] = (qd) var25;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (((rc) this).field_m[var25_int] == 0) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var21 >= var66.length) {
                                                                            var20 = -1;
                                                                            break L71;
                                                                          } else {
                                                                            int incrementValue$12 = var21;
                                                                            var21++;
                                                                            var20 = var7[incrementValue$12];
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        int incrementValue$13 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_g[incrementValue$13] + 16 << 2;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((rc) this).field_n[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (0 == ((rc) this).field_m[var24]) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (var20 != 0) {
                                                                    break L73;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = -1 + var38.field_g[incrementValue$14];
                                                                    if (var21 >= var65.length) {
                                                                      var20 = -1;
                                                                      break L73;
                                                                    } else {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L73;
                                                                    }
                                                                  }
                                                                }
                                                                ((rc) this).field_j[var24] = (byte)var23;
                                                                var20--;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L74: {
                                                          if (var20 != 0) {
                                                            break L74;
                                                          } else {
                                                            L75: {
                                                              if (var21 < var64.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L75;
                                                              } else {
                                                                var20 = -1;
                                                                break L75;
                                                              }
                                                            }
                                                            var22 = var38.c(0);
                                                            break L74;
                                                          }
                                                        }
                                                        ((rc) this).field_p[var23] = (short)(((rc) this).field_p[var23] + rb.a(32768, -1 + var22 << 14));
                                                        var20--;
                                                        ((rc) this).field_m[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(11132);
                                                    ((rc) this).field_p[var20] = (short)(((rc) this).field_p[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.g(11132);
                                                ((rc) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) 41);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L76: {
                                      qd dupTemp$17 = new qd();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.g(11132);
                                      if (var16_int <= 0) {
                                        break L76;
                                      } else {
                                        var15.field_e = new byte[var16_int * 2];
                                        break L76;
                                      }
                                    }
                                    L77: {
                                      var16_int = var38.g(11132);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_k = new byte[var16_int * 2 - -2];
                                        var40.field_k[1] = (byte) 64;
                                        break L77;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a((byte) -82);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.a((byte) -112);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.a((byte) -115);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -24021) {
            int discarded$0 = rc.a(-32, -102);
        }
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> has the most pieces";
        field_h = new String[255];
    }
}
