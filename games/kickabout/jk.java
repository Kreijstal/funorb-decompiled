/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends gn {
    private int[] field_q;
    byte[] field_p;
    static int[] field_g;
    byte[] field_k;
    static int field_f;
    static String field_i;
    static String field_o;
    static long[] field_m;
    short[] field_r;
    byte[] field_n;
    gl[] field_e;
    int field_j;
    to[] field_l;
    static int field_h;

    final static boolean b(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (param0 == 0) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        var1 = nj.a(-128);
        var3 = var1 + -pc.field_c;
        if (30000L >= var3) {
          L1: {
            var5 = 3000;
            if (cv.field_d >= 7) {
              var5 = 12000;
              break L1;
            } else {
              if (cv.field_d < 5) {
                if (cv.field_d >= 3) {
                  var5 = 6000;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var5 = 9000;
                break L1;
              }
            }
          }
          if (~(long)var5 <= ~var3) {
            return false;
          } else {
            pc.field_c = var1;
            cv.field_d = cv.field_d + 1;
            return true;
          }
        } else {
          cv.field_d = 0;
          pc.field_c = var1;
          return true;
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3_int = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        gm var11 = null;
        gm var12 = null;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (vl.field_d) {
                break L1;
              } else {
                if (bm.field_I != 0) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              var1_int = -pq.field_Q.field_o + gp.field_i;
              var2 = hq.field_d;
              if (param0 == 16777215) {
                break L2;
              } else {
                jk.a(32);
                break L2;
              }
            }
            L3: {
              pq.field_Q.b(var1_int, var2, al.a(false, (byte) 51));
              if (tb.field_w != null) {
                pt.a(1 + var1_int - -jt.field_yb, param0 ^ -16754303, 1 + var1_int, 1 + var2 - -om.field_Bb, 1 + var2);
                var3_int = 0;
                L4: while (true) {
                  if (2 <= var3_int) {
                    L5: {
                      var3 = (ob) (Object) tb.field_w.field_V;
                      var4 = var3.field_N >> 16;
                      var5 = var3.field_E >> 16;
                      if (tb.field_w.field_V.field_m == -1) {
                        break L5;
                      } else {
                        L6: {
                          var12 = (gm) (Object) tb.field_w.b((byte) -96);
                          if (!var12.b(false)) {
                            stackOut_33_0 = 40;
                            stackIn_34_0 = stackOut_33_0;
                            break L6;
                          } else {
                            stackOut_32_0 = 30;
                            stackIn_34_0 = stackOut_32_0;
                            break L6;
                          }
                        }
                        var7 = stackIn_34_0;
                        var5 = (var12.field_bb >> 16) + var12.field_n * var7;
                        var4 = var12.field_j * var7 + (var12.field_kb >> 16);
                        break L5;
                      }
                    }
                    L7: {
                      if (ia.field_c) {
                        var5 = -var5 + 1344;
                        var4 = 896 - var4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var5 = var5 * 23 >> 8;
                    var4 = var4 * 23 >> 8;
                    on.d(var4 + (1 + var1_int), var5 + (var2 + 1), 3, 16777215);
                    on.c(var4 + 1 + var1_int, 1 + (var2 - -var5), 3, 65793);
                    ta.e(125);
                    break L3;
                  } else {
                    L8: {
                      if (mk.field_c != -2) {
                        if (~var3_int != ~tb.field_w.field_g[mk.field_c].field_p) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L8;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L8;
                        }
                      } else {
                        if (var3_int != 0) {
                          stackOut_13_0 = 0;
                          stackIn_17_0 = stackOut_13_0;
                          break L8;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_17_0 = stackOut_12_0;
                          break L8;
                        }
                      }
                    }
                    var4 = stackIn_17_0;
                    var5 = 0;
                    L9: while (true) {
                      if (var5 >= 5) {
                        var3_int++;
                        continue L4;
                      } else {
                        L10: {
                          var11 = (gm) (Object) tb.field_w.field_P[var3_int][var5];
                          if (var4 != 0) {
                            stackOut_21_0 = 2271999;
                            stackIn_22_0 = stackOut_21_0;
                            break L10;
                          } else {
                            stackOut_20_0 = 16716032;
                            stackIn_22_0 = stackOut_20_0;
                            break L10;
                          }
                        }
                        L11: {
                          var7 = stackIn_22_0;
                          if (var5 == 0) {
                            var7 = 16776960;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          var8 = var11.field_kb >> 16;
                          var9 = var11.field_bb >> 16;
                          if (ia.field_c) {
                            var8 = -var8 + 896;
                            var9 = -var9 + 1344;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var9 = 23 * var9 >> 8;
                        var8 = var8 * 23 >> 8;
                        on.d(var8 + (var1_int + 1), var9 + (1 + var2), 3, var7);
                        on.c(var8 + var1_int + 1, var9 + 1 + var2, 3, 65793);
                        var5++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "jk.A(" + param0 + 41);
        }
    }

    final boolean a(rj param0, int[] param1, byte param2, byte[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 >= 103) {
                break L1;
              } else {
                ((jk) this).field_e = null;
                break L1;
              }
            }
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (var8 >= 128) {
                stackOut_12_0 = var5_int;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3[var8] != 0) {
                      break L3;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
                L4: {
                  var9 = ((jk) this).field_q[var8];
                  if (0 == var9) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("jk.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final static void a(byte param0) {
        we.field_a.a((byte) -124, (fd) (Object) new nn());
        if (param0 > -119) {
            boolean discarded$0 = jk.b(114);
        }
    }

    public static void f(byte param0) {
        field_o = null;
        field_m = null;
        field_i = null;
        field_g = null;
    }

    jk(byte[] param0) {
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
        gl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        gl var15 = null;
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
        iw var38 = null;
        byte[] var39 = null;
        gl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gl var48 = null;
        gl var49 = null;
        gl var50 = null;
        gl var51 = null;
        gl var52 = null;
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
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((jk) this).field_e = new gl[128];
        ((jk) this).field_l = new to[128];
        ((jk) this).field_n = new byte[128];
        ((jk) this).field_p = new byte[128];
        ((jk) this).field_k = new byte[128];
        ((jk) this).field_q = new int[128];
        ((jk) this).field_r = new short[128];
        var38 = new iw(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_f[var3 + var38.field_n]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_n = var38.field_n + 1;
                var5 = var38.field_n;
                var38.field_n = var38.field_n + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_f[var6 + var38.field_n] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_n = var38.field_n + 1;
                        var8 = var38.field_n;
                        var38.field_n = var38.field_n + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_f[var9 + var38.field_n] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var38.field_n = var38.field_n + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 <= 1) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (~var9 >= ~var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.h((byte) -126);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (~var15_int < ~var13_int) {
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
                                  }
                                }
                                var13 = new gl[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var13.length <= var14) {
                                    L11: {
                                      var14 = var38.h((byte) -105);
                                      if (var14 > 0) {
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
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.h((byte) -121);
                                      if (0 >= var14) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (0 == var38.field_f[var17 + var38.field_n]) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var19 <= ~var17) {
                                            var17++;
                                            var38.field_n = var38.field_n + 1;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (128 <= var20) {
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
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
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
                                                                        ((jk) this).field_j = 1 + var38.h((byte) -106);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (~var27 <= ~var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (~var27 <= ~var70.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.j((byte) -121);
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
                                                                                  if (~var47.length >= ~var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.j((byte) -82);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var12 <= var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var27 <= ~var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.h((byte) -118);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var70.length <= var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((jk) this).field_n[var30] = (byte)(var28 * ((jk) this).field_n[var30] - -32 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (var30 - var27) + (-var27 + var30) / 2;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = vc.a(var30 + -var27, var32, (byte) -72);
                                                                                                        ((jk) this).field_n[var33] = (byte)(var34 * ((jk) this).field_n[var33] - -32 >> 6);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((jk) this).field_n[var29] = (byte)(((jk) this).field_n[var29] * var28 + 32 >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + 1 + var38.h((byte) -118);
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
                                                                                        var19 = var38.h((byte) -115);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var27 >= var47.length) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var47.length <= var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = var28 + (255 & ((jk) this).field_k[var30]);
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
                                                                                                        ((jk) this).field_k[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << 1;
                                                                                                    var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (~var30 >= ~var37) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = vc.a(var30 + -var27, var32, (byte) -72);
                                                                                                          var35 = (255 & ((jk) this).field_k[var37]) - -var34;
                                                                                                          if (var35 >= 0) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (var35 <= 128) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        ((jk) this).field_k[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (((jk) this).field_k[var29] & 255) - -var28;
                                                                                                  if (var30 >= 0) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (128 >= var30) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((jk) this).field_k[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.h((byte) -115) + (1 + var19);
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
                                                                                          if (~var27 <= ~var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (~var12 >= ~var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (~var27 <= ~var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (~var12 >= ~var27) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_j <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_k = var38.h((byte) -112);
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
                                                                                                      if (var51.field_h <= 0) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_j = var38.h((byte) -114);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_h = var38.h((byte) -118);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_m == null) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_e = var38.h((byte) -120);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (var50.field_b == null) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_l = var38.h((byte) -117);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_n <= 0) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_g = var38.h((byte) -120);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_n = var38.h((byte) -111);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (var49.field_m == null) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (~var49.field_m.length >= ~var29) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = var19 - (-1 + -var38.h((byte) -107));
                                                                                            var49.field_m[var29] = (byte)var19;
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
                                                                                  if (var48.field_b == null) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (var29 >= var48.field_b.length) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = var38.h((byte) -114) + var19 - -1;
                                                                                        var48.field_b[var29] = (byte)var19;
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
                                                                              if (null == var45.field_m) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (~var29 <= ~var45.field_m.length) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_m[var29] = var38.j((byte) -47);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var45.field_b) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (-2 + var45.field_b.length <= var29) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_b[var29] = var38.j((byte) -79);
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
                                                                              if (var21 >= var66.length) {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((jk) this).field_q[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = 1 + var38.h((byte) -120);
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((jk) this).field_n[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((jk) this).field_q[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (0 != var20) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (~var21 <= ~var69.length) {
                                                                              var20 = -1;
                                                                              break L68;
                                                                            } else {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L68;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((jk) this).field_e[var26] = (gl) var25;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (((jk) this).field_q[var25_int] == 0) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var21 >= var68.length) {
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
                                                                        var24 = var38.field_f[incrementValue$13] + 16 << 2;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((jk) this).field_k[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (((jk) this).field_q[var24] == 0) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (var20 != 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (~var67.length >= ~var21) {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      } else {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_f[incrementValue$15] + -1;
                                                                    break L73;
                                                                  }
                                                                }
                                                                ((jk) this).field_p[var24] = (byte)var23;
                                                                var20--;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L75: {
                                                          if (var20 != 0) {
                                                            break L75;
                                                          } else {
                                                            L76: {
                                                              if (~var66.length < ~var21) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              } else {
                                                                var20 = -1;
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.l(-35);
                                                            break L75;
                                                          }
                                                        }
                                                        ((jk) this).field_r[var23] = (short)(((jk) this).field_r[var23] + (qj.b(-1 + var22, 2) << 14));
                                                        ((jk) this).field_q[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h((byte) -124);
                                                    ((jk) this).field_r[var20] = (short)(((jk) this).field_r[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.h((byte) -125);
                                                ((jk) this).field_r[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.j((byte) -121);
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
                                    L77: {
                                      gl dupTemp$17 = new gl();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.h((byte) -118);
                                      if (0 >= var16_int) {
                                        break L77;
                                      } else {
                                        var15.field_m = new byte[var16_int * 2];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.h((byte) -117);
                                      if (var16_int <= 0) {
                                        break L78;
                                      } else {
                                        var15.field_b = new byte[2 + 2 * var16_int];
                                        var40.field_b[1] = (byte) 64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.j((byte) -89);
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
                        var7[var8] = var38.j((byte) -124);
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
                var4[var5] = var38.j((byte) -55);
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
        field_o = "<%0> scores a goal, bringing their game against <%1> level at <%2> goal(s) each.";
        field_i = "Player names can be up to 12 letters, numbers and underscores";
        field_f = 0;
        field_g = new int[74];
        field_m = new long[]{52428L, 32768L, 63569L};
        field_g[37] = 2;
        field_g[57] = 5;
        field_g[66] = 5;
        field_g[63] = 5;
        field_g[1] = 0;
        field_g[5] = 2;
        field_g[41] = 2;
        field_g[33] = 1;
        field_g[34] = 2;
        field_g[12] = 0;
        field_g[31] = 1;
        field_g[19] = 0;
        field_g[50] = 4;
        field_g[62] = 5;
        field_g[61] = 5;
        field_g[27] = 1;
        field_g[53] = 4;
        field_g[47] = 3;
        field_g[22] = 1;
        field_g[48] = 3;
        field_g[56] = 5;
        field_g[72] = 5;
        field_g[71] = 5;
        field_g[23] = 1;
        field_g[14] = 0;
        field_g[58] = 5;
        field_g[20] = 0;
        field_g[4] = 2;
        field_g[43] = 2;
        field_g[6] = 2;
        field_g[70] = 5;
        field_g[7] = 1;
        field_g[13] = 0;
        field_g[26] = 1;
        field_g[9] = 1;
        field_g[17] = 0;
        field_g[8] = 1;
        field_g[2] = 0;
        field_g[15] = 0;
        field_g[68] = 5;
        field_g[69] = 5;
        field_g[3] = 0;
        field_g[28] = 1;
        field_g[40] = 2;
        field_g[24] = 1;
        field_g[59] = 5;
        field_g[29] = 1;
        field_g[38] = 2;
        field_g[0] = 5;
        field_g[36] = 2;
        field_g[42] = 2;
        field_g[11] = 0;
        field_g[60] = 5;
        field_g[44] = 2;
        field_g[64] = 5;
        field_g[52] = 4;
        field_g[18] = 0;
        field_g[25] = 1;
        field_g[35] = 2;
        field_g[39] = 2;
        field_g[30] = 1;
        field_g[54] = 5;
        field_g[73] = 5;
        field_g[32] = 1;
        field_g[65] = 5;
        field_g[55] = 5;
        field_g[21] = 0;
        field_g[10] = 0;
        field_g[45] = 2;
        field_g[16] = 0;
        field_g[49] = 3;
        field_g[46] = 3;
        field_g[51] = 4;
        field_g[67] = 5;
        field_h = 0;
    }
}
