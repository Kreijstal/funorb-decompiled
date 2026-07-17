/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends wf {
    al[] field_f;
    short[] field_n;
    private int[] field_g;
    byte[] field_q;
    static ej field_j;
    byte[] field_k;
    dh[] field_o;
    int field_i;
    static oo field_m;
    byte[] field_e;
    static boolean field_p;
    static float[] field_h;
    static String field_l;

    final boolean a(byte[] param0, int[] param1, ob param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param3 == 5193) {
                break L1;
              } else {
                ((ml) this).field_f = null;
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (128 <= var8) {
                stackOut_20_0 = var5_int;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param0 == null) {
                      break L4;
                    } else {
                      if (param0[var8] != 0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = ((ml) this).field_g[var8];
                  if (var9 != 0) {
                    L5: {
                      if (var9 == var6) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) == 0) {
                            var7 = (Object) (Object) param2.a(param1, var9 >> 2, (byte) 110);
                            break L6;
                          } else {
                            var7 = (Object) (Object) param2.a(var9 >> 2, param1, (byte) -92);
                            break L6;
                          }
                        }
                        if (var7 == null) {
                          var5_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L3;
                    } else {
                      ((ml) this).field_f[var8] = (al) var7;
                      ((ml) this).field_g[var8] = 0;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ml.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param3 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void a(byte param0, wf param1, wf param2) {
        try {
            if (param2.field_c != null) {
                param2.c(-126);
            }
            param2.field_a = param1;
            param2.field_c = param1.field_c;
            param2.field_c.field_a = param2;
            if (param0 != -20) {
                field_m = null;
            }
            param2.field_a.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ml.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
            ml.a(-90);
        }
        field_l = null;
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((ml) this).field_g = null;
    }

    ml(byte[] param0) {
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
        dh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        dh var15 = null;
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
        rb var38 = null;
        byte[] var39 = null;
        dh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dh var48 = null;
        dh var49 = null;
        dh var50 = null;
        dh var51 = null;
        dh var52 = null;
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
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] var71 = null;
        byte[] var72 = null;
        byte[] var73 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        byte[] stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        ((ml) this).field_g = new int[128];
        ((ml) this).field_e = new byte[128];
        ((ml) this).field_k = new byte[128];
        ((ml) this).field_f = new al[128];
        ((ml) this).field_q = new byte[128];
        ((ml) this).field_o = new dh[128];
        ((ml) this).field_n = new short[128];
        var38 = new rb(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_f[var3 + var38.field_g] == 0) {
            var69 = new byte[var3];
            var62 = var69;
            var55 = var62;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (~var5 <= ~var3) {
                var38.field_g = var38.field_g + 1;
                var3++;
                var5 = var38.field_g;
                var38.field_g = var38.field_g + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_f[var6 + var38.field_g] == 0) {
                    var70 = new byte[var6];
                    var63 = var70;
                    var56 = var63;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var6) {
                        var38.field_g = var38.field_g + 1;
                        var6++;
                        var8 = var38.field_g;
                        var38.field_g = var38.field_g + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_f[var38.field_g - -var9] == 0) {
                            var71 = new byte[var9];
                            var64 = var71;
                            var57 = var64;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (~var9 >= ~var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_g = var38.field_g + 1;
                                  var67 = new byte[var9];
                                  var60 = var67;
                                  var53 = var60;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 <= 1) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var67[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.g(-117);
                                          if (var15_int == 0) {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          } else {
                                            L9: {
                                              if (var15_int > var13_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var13 = new dh[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.g(90);
                                      if (0 < var14) {
                                        stackOut_37_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var72 = stackIn_38_0;
                                      var65 = var72;
                                      var58 = var65;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.g(82);
                                      if (var14 > 0) {
                                        stackOut_40_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var73 = stackIn_41_0;
                                    var66 = var73;
                                    var59 = var66;
                                    var47 = var59;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_f[var17 + var38.field_g] == 0) {
                                        var68 = new byte[var17];
                                        var61 = var68;
                                        var54 = var61;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var17 >= ~var19) {
                                            var38.field_g = var38.field_g + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var24) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((ml) this).field_i = 1 + var38.g(-94);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (~var27 <= ~var72.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.d(0);
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
                                                                                  if (~var27 <= ~var73.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.d(0);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (~var27 <= ~var12) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var12 >= ~var27) {
                                                                                    L29: {
                                                                                      L30: {
                                                                                        if (var15_array != null) {
                                                                                          var19 = var38.g(123);
                                                                                          var15_array[0] = (byte)var19;
                                                                                          var27 = 2;
                                                                                          L31: while (true) {
                                                                                            if (~var72.length >= ~var27) {
                                                                                              var27 = var72[0];
                                                                                              var28 = var72[1];
                                                                                              var29 = 0;
                                                                                              L32: while (true) {
                                                                                                if (var27 <= var29) {
                                                                                                  var29 = 2;
                                                                                                  L33: while (true) {
                                                                                                    if (var72.length <= var29) {
                                                                                                      var15_array = null;
                                                                                                      var30 = var27;
                                                                                                      L34: while (true) {
                                                                                                        if (var30 >= 128) {
                                                                                                          if (var16 == null) {
                                                                                                            break L29;
                                                                                                          } else {
                                                                                                            var19 = var38.g(38);
                                                                                                            var16[0] = (byte)var19;
                                                                                                            var27 = 2;
                                                                                                            L35: while (true) {
                                                                                                              if (var73.length <= var27) {
                                                                                                                break L30;
                                                                                                              } else {
                                                                                                                var19 = var19 - (-1 + -var38.g(-55));
                                                                                                                var16[var27] = (byte)var19;
                                                                                                                var27 += 2;
                                                                                                                continue L35;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          ((ml) this).field_k[var30] = (byte)(((ml) this).field_k[var30] * var28 + 32 >> 6);
                                                                                                          var30++;
                                                                                                          continue L34;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var30 = var72[var29];
                                                                                                      var31 = var15_array[var29 - -1];
                                                                                                      var32 = (-var27 + var30) / 2 + (-var27 + var30) * var28;
                                                                                                      var33 = var27;
                                                                                                      L36: while (true) {
                                                                                                        if (var30 <= var33) {
                                                                                                          var29 += 2;
                                                                                                          var28 = var31;
                                                                                                          var27 = var30;
                                                                                                          continue L33;
                                                                                                        } else {
                                                                                                          var34 = oh.a(var30 + -var27, var32, (byte) -124);
                                                                                                          var32 = var32 + (var31 + -var28);
                                                                                                          ((ml) this).field_k[var33] = (byte)(((ml) this).field_k[var33] * var34 + 32 >> 6);
                                                                                                          var33++;
                                                                                                          continue L36;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  ((ml) this).field_k[var29] = (byte)(((ml) this).field_k[var29] * var28 - -32 >> 6);
                                                                                                  var29++;
                                                                                                  continue L32;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var19 = var38.g(-95) + 1 + var19;
                                                                                              var15_array[var27] = (byte)var19;
                                                                                              var27 += 2;
                                                                                              continue L31;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          if (var16 == null) {
                                                                                            break L29;
                                                                                          } else {
                                                                                            var19 = var38.g(38);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var73.length <= var27) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                var19 = var19 - (-1 + -var38.g(-55));
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var27 = var73[0];
                                                                                      var28 = var73[1] << 1;
                                                                                      var29 = 0;
                                                                                      L38: while (true) {
                                                                                        if (~var27 >= ~var29) {
                                                                                          var29 = 2;
                                                                                          L39: while (true) {
                                                                                            if (~var73.length >= ~var29) {
                                                                                              var30 = var27;
                                                                                              L40: while (true) {
                                                                                                if (var30 >= 128) {
                                                                                                  var16 = null;
                                                                                                  break L29;
                                                                                                } else {
                                                                                                  L41: {
                                                                                                    var31 = var28 + (((ml) this).field_q[var30] & 255);
                                                                                                    if (var31 >= 0) {
                                                                                                      break L41;
                                                                                                    } else {
                                                                                                      var31 = 0;
                                                                                                      break L41;
                                                                                                    }
                                                                                                  }
                                                                                                  L42: {
                                                                                                    if (var31 <= 128) {
                                                                                                      break L42;
                                                                                                    } else {
                                                                                                      var31 = 128;
                                                                                                      break L42;
                                                                                                    }
                                                                                                  }
                                                                                                  ((ml) this).field_q[var30] = (byte)var31;
                                                                                                  var30++;
                                                                                                  continue L40;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var30 = var73[var29];
                                                                                              var31 = var16[var29 + 1] << 1;
                                                                                              var32 = (var30 - var27) * var28 - -((-var27 + var30) / 2);
                                                                                              var37 = var27;
                                                                                              var33 = var37;
                                                                                              L43: while (true) {
                                                                                                if (var37 >= var30) {
                                                                                                  var27 = var30;
                                                                                                  var28 = var31;
                                                                                                  var29 += 2;
                                                                                                  continue L39;
                                                                                                } else {
                                                                                                  L44: {
                                                                                                    var34 = oh.a(-var27 + var30, var32, (byte) 40);
                                                                                                    var35 = (((ml) this).field_q[var37] & 255) + var34;
                                                                                                    if (0 <= var35) {
                                                                                                      break L44;
                                                                                                    } else {
                                                                                                      var35 = 0;
                                                                                                      break L44;
                                                                                                    }
                                                                                                  }
                                                                                                  L45: {
                                                                                                    if (var35 <= 128) {
                                                                                                      break L45;
                                                                                                    } else {
                                                                                                      var35 = 128;
                                                                                                      break L45;
                                                                                                    }
                                                                                                  }
                                                                                                  ((ml) this).field_q[var37] = (byte)var35;
                                                                                                  var32 = var32 + (-var28 + var31);
                                                                                                  var37++;
                                                                                                  continue L43;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          L46: {
                                                                                            var30 = var28 + (((ml) this).field_q[var29] & 255);
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
                                                                                          ((ml) this).field_q[var29] = (byte)var30;
                                                                                          var29++;
                                                                                          continue L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L48: while (true) {
                                                                                      if (~var27 <= ~var12) {
                                                                                        var27 = 0;
                                                                                        L49: while (true) {
                                                                                          if (~var27 <= ~var12) {
                                                                                            var27 = 0;
                                                                                            L50: while (true) {
                                                                                              if (~var27 <= ~var12) {
                                                                                                var27 = 0;
                                                                                                L51: while (true) {
                                                                                                  if (~var12 >= ~var27) {
                                                                                                    var27 = 0;
                                                                                                    L52: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L53: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_j <= 0) {
                                                                                                            break L53;
                                                                                                          } else {
                                                                                                            var52.field_a = var38.g(59);
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
                                                                                                      if (var51.field_i <= 0) {
                                                                                                        break L54;
                                                                                                      } else {
                                                                                                        var51.field_j = var38.g(82);
                                                                                                        break L54;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L51;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_i = var38.g(-84);
                                                                                                var27++;
                                                                                                continue L50;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L55: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_g) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_h = var38.g(-88);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_e == null) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_l = var38.g(108);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (var50.field_b <= 0) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var50.field_f = var38.g(-107);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L49;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_b = var38.g(-106);
                                                                                        var27++;
                                                                                        continue L48;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L58: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_g == null) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if (var29 >= var49.field_g.length) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var19 - (-1 + -var38.g(-90));
                                                                                            var49.field_g[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L59;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L60: {
                                                                                  var48 = var13[var27];
                                                                                  if (var48.field_e == null) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if (~var48.field_e.length >= ~var29) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 1 + var19 - -var38.g(123);
                                                                                        var48.field_e[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L61;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L62: {
                                                                              var45 = var13[var27];
                                                                              if (var45.field_g == null) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if (var29 >= var45.field_g.length) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_g[var29] = var38.d(0);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (null == var45.field_e) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if (var45.field_e.length - 2 <= var29) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_e[var29] = var38.d(0);
                                                                                    var29 += 2;
                                                                                    continue L65;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (0 != var20) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if (var21 < var68.length) {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if (0 >= ((ml) this).field_g[var27]) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = var38.g(-91) + 1;
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((ml) this).field_k[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if (((ml) this).field_g[var26] == 0) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (var20 != 0) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var67[var21]];
                                                                            if (~var21 > ~var71.length) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L69;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L69;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ml) this).field_o[var26] = (dh) var25;
                                                                        var20--;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if (((ml) this).field_g[var25_int] == 0) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (0 != var20) {
                                                                        break L71;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_f[incrementValue$12] - -16 << 2;
                                                                        if (var70.length <= var21) {
                                                                          var20 = -1;
                                                                          break L71;
                                                                        } else {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L71;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((ml) this).field_q[var25_int] = (byte)var24;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (0 == ((ml) this).field_g[var24]) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (0 != var20) {
                                                                    break L73;
                                                                  } else {
                                                                    int incrementValue$14 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_f[incrementValue$14] + -1;
                                                                    if (var69.length > var21) {
                                                                      int incrementValue$15 = var21;
                                                                      var21++;
                                                                      var20 = var4[incrementValue$15];
                                                                      break L73;
                                                                    } else {
                                                                      var20 = -1;
                                                                      break L73;
                                                                    }
                                                                  }
                                                                }
                                                                ((ml) this).field_e[var24] = (byte)var23;
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
                                                          if (0 != var20) {
                                                            break L74;
                                                          } else {
                                                            L75: {
                                                              if (~var21 <= ~var68.length) {
                                                                var20 = -1;
                                                                break L75;
                                                              } else {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L75;
                                                              }
                                                            }
                                                            var22 = var38.a(127);
                                                            break L74;
                                                          }
                                                        }
                                                        ((ml) this).field_n[var23] = (short)(((ml) this).field_n[var23] + pg.a(32768, -1 + var22 << 14));
                                                        var20--;
                                                        ((ml) this).field_g[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.g(-113);
                                                    ((ml) this).field_n[var20] = (short)(((ml) this).field_n[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.g(-107);
                                                ((ml) this).field_n[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d(0);
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
                                      dh dupTemp$17 = new dh();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.g(-60);
                                      if (var16_int <= 0) {
                                        break L76;
                                      } else {
                                        var15.field_g = new byte[var16_int * 2];
                                        break L76;
                                      }
                                    }
                                    L77: {
                                      var16_int = var38.g(71);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_e = new byte[2 * var16_int - -2];
                                        var40.field_e[1] = (byte) 64;
                                        break L77;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.d(0);
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
                        var7[var8] = var38.d(0);
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
                var4[var5] = var38.d(0);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ej(15, 0, 1, 0);
        field_l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_h = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
