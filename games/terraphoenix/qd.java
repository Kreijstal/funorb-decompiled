/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends uf {
    static int field_l;
    static String field_j;
    static String[] field_h;
    short[] field_p;
    gm[] field_q;
    byte[] field_m;
    gg[] field_n;
    int field_k;
    byte[] field_r;
    static volatile int field_i;
    private int[] field_o;
    byte[] field_s;

    final void d(byte param0) {
        ((qd) this).field_o = null;
        if (param0 <= 35) {
            Object var3 = null;
            qd.a(-83, 2, (vi) null);
        }
    }

    final static void a(int param0, int param1, vi param2) {
        uc var5 = null;
        int var4 = 0;
        try {
            var5 = di.field_l;
            var5.k(-17410, param0);
            var5.field_k = var5.field_k + 1;
            var4 = var5.field_k;
            var5.i(1, -95);
            var5.i(param2.field_l, -110);
            var5.a((byte) -107, param2.field_s);
            var5.e(param2.field_i, param1 ^ -15940);
            var5.e(param2.field_m, 8959);
            var5.e(param2.field_r, 8959);
            var5.e(param2.field_k, param1 ^ -15940);
            if (param1 != -7357) {
                qd.a((byte) -69, -70);
            }
            int discarded$0 = var5.d(var4, 8600);
            var5.j(var5.field_k + -var4, -119);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "qd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 15) {
            return;
        }
        if (!(eh.field_g[param1] == null)) {
            gb.field_E.a(eh.field_g[param1], 100, ua.field_e * pe.field_f[param1] / 128);
        }
    }

    final boolean a(byte[] param0, int[] param1, int param2, da param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
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
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = param2;
            L1: while (true) {
              if (var8 >= 128) {
                stackOut_17_0 = var5_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param0 == null) {
                      break L3;
                    } else {
                      if (param0[var8] == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = ((qd) this).field_o[var8];
                  if (0 == var9) {
                    break L2;
                  } else {
                    L4: {
                      if (~var6 == ~var9) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var9;
                          var9--;
                          if ((var9 & 1) != 0) {
                            var7 = (Object) (Object) param3.a((byte) -21, param1, var9 >> 2);
                            break L5;
                          } else {
                            var7 = (Object) (Object) param3.a((byte) -106, var9 >> 2, param1);
                            break L5;
                          }
                        }
                        if (var7 == null) {
                          var5_int = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L2;
                    } else {
                      ((qd) this).field_n[var8] = (gg) var7;
                      ((qd) this).field_o[var8] = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("qd.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static long a(int param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (65 > var6) {
                        break L4;
                      } else {
                        if (var6 > 90) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var6) {
                        break L5;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(-48 + var6 + 27);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if (param0 <= -46) {
                  break L6;
                } else {
                  field_l = -83;
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("qd.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    qd(byte[] param0) {
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
        gm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        gm var15 = null;
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
        dh var38 = null;
        byte[] var39 = null;
        gm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gm var48 = null;
        gm var49 = null;
        gm var50 = null;
        gm var51 = null;
        gm var52 = null;
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
        ((qd) this).field_s = new byte[128];
        ((qd) this).field_q = new gm[128];
        ((qd) this).field_p = new short[128];
        ((qd) this).field_o = new int[128];
        ((qd) this).field_n = new gg[128];
        ((qd) this).field_r = new byte[128];
        ((qd) this).field_m = new byte[128];
        var38 = new dh(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_i[var3 + var38.field_k] == 0) {
            var65 = new byte[var3];
            var60 = var65;
            var55 = var60;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (~var3 >= ~var5) {
                var38.field_k = var38.field_k + 1;
                var3++;
                var5 = var38.field_k;
                var38.field_k = var38.field_k + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_i[var38.field_k + var6] == 0) {
                    var66 = new byte[var6];
                    var61 = var66;
                    var56 = var61;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (~var8 <= ~var6) {
                        var38.field_k = var38.field_k + 1;
                        var6++;
                        var8 = var38.field_k;
                        var38.field_k = var38.field_k + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_i[var9 + var38.field_k] == 0) {
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
                                  var38.field_k = var38.field_k + 1;
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
                                      if (var14 >= var9) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.a(-16384);
                                          if (var15_int != 0) {
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
                                var13 = new gm[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (~var13.length >= ~var14) {
                                    L11: {
                                      var14 = var38.a(-16384);
                                      if (var14 <= 0) {
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
                                      var14 = var38.a(-16384);
                                      if (var14 <= 0) {
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
                                      if (var38.field_i[var38.field_k - -var17] == 0) {
                                        var64 = new byte[var17];
                                        var59 = var64;
                                        var54 = var59;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (~var17 >= ~var19) {
                                            var17++;
                                            var38.field_k = var38.field_k + 1;
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
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var24) {
                                                            var20 = 0;
                                                            var21 = 0;
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
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((qd) this).field_k = 1 + var38.a(-16384);
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var12 <= var27) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var46.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.f(2);
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
                                                                                  if (~var27 <= ~var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.f(2);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (~var12 >= ~var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (~var12 >= ~var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.a(-16384);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var46.length <= var27) {
                                                                                            var27 = var46[0];
                                                                                            var28 = var46[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var46.length <= var29) {
                                                                                                    var15_array = null;
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((qd) this).field_s[var30] = (byte)(((qd) this).field_s[var30] * var28 + 32 >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var46[var29];
                                                                                                    var31 = var15_array[var29 - -1];
                                                                                                    var32 = var28 * (-var27 + var30) - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = pc.a(-64, -var27 + var30, var32);
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((qd) this).field_s[var33] = (byte)(32 + var34 * ((qd) this).field_s[var33] >> 6);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((qd) this).field_s[var29] = (byte)(32 + var28 * ((qd) this).field_s[var29] >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.a(-16384);
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
                                                                                        var19 = var38.a(-16384);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (~var47.length >= ~var27) {
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
                                                                                                      if (128 <= var30) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (((qd) this).field_r[var30] & 255) - -var28;
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
                                                                                                        ((qd) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1;
                                                                                                    var32 = (var30 + -var27) / 2 + var28 * (var30 + -var27);
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = pc.a(-92, var30 - var27, var32);
                                                                                                          var35 = (255 & ((qd) this).field_r[var37]) - -var34;
                                                                                                          if (0 <= var35) {
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
                                                                                                        ((qd) this).field_r[var37] = (byte)var35;
                                                                                                        var32 = var32 + (var31 + -var28);
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = (255 & ((qd) this).field_r[var29]) + var28;
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
                                                                                                ((qd) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.a(-16384) + (1 + var19);
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
                                                                                          if (~var12 >= ~var27) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (~var12 >= ~var27) {
                                                                                                        return;
                                                                                                      } else {
                                                                                                        L52: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (var52.field_m <= 0) {
                                                                                                            break L52;
                                                                                                          } else {
                                                                                                            var52.field_c = var38.a(-16384);
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
                                                                                                      if (var51.field_d <= 0) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var51.field_m = var38.a(-16384);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.a(-16384);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L54: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_h == null) {
                                                                                                break L54;
                                                                                              } else {
                                                                                                var50.field_b = var38.a(-16384);
                                                                                                break L54;
                                                                                              }
                                                                                            }
                                                                                            L55: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L55;
                                                                                              } else {
                                                                                                var50.field_k = var38.a(-16384);
                                                                                                break L55;
                                                                                              }
                                                                                            }
                                                                                            L56: {
                                                                                              if (var50.field_i <= 0) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_e = var38.a(-16384);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_i = var38.a(-16384);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L57: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_h) {
                                                                                        break L57;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L58: while (true) {
                                                                                          if (var29 >= var49.field_h.length) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.a(-16384));
                                                                                            var49.field_h[var29] = (byte)var19;
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
                                                                                  if (null == var48.field_g) {
                                                                                    break L59;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L60: while (true) {
                                                                                      if (~var48.field_g.length >= ~var29) {
                                                                                        break L59;
                                                                                      } else {
                                                                                        var19 = var19 - -1 - -var38.a(-16384);
                                                                                        var48.field_g[var29] = (byte)var19;
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
                                                                              if (var45.field_h == null) {
                                                                                break L61;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L62: while (true) {
                                                                                  if (var45.field_h.length <= var29) {
                                                                                    break L61;
                                                                                  } else {
                                                                                    var45.field_h[var29] = var38.f(2);
                                                                                    var29 += 2;
                                                                                    continue L62;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L63: {
                                                                              if (null == var45.field_g) {
                                                                                break L63;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L64: while (true) {
                                                                                  if (var29 >= var45.field_g.length - 2) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var45.field_g[var29] = var38.f(2);
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
                                                                              if (~var21 <= ~var64.length) {
                                                                                var20 = -1;
                                                                                break L66;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L66;
                                                                              }
                                                                            }
                                                                            if (((qd) this).field_o[var27] <= 0) {
                                                                              break L65;
                                                                            } else {
                                                                              var26 = var38.a(-16384) - -1;
                                                                              break L65;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((qd) this).field_s[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L67: {
                                                                      if (((qd) this).field_o[var26] == 0) {
                                                                        break L67;
                                                                      } else {
                                                                        L68: {
                                                                          if (var20 != 0) {
                                                                            break L68;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var63[var21]];
                                                                            if (var67.length <= var21) {
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
                                                                        ((qd) this).field_q[var26] = (gm) var25;
                                                                        var20--;
                                                                        break L67;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L69: {
                                                                  if (((qd) this).field_o[var25_int] == 0) {
                                                                    break L69;
                                                                  } else {
                                                                    L70: {
                                                                      if (0 != var20) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (~var21 > ~var66.length) {
                                                                            int incrementValue$12 = var21;
                                                                            var21++;
                                                                            var20 = var7[incrementValue$12];
                                                                            break L71;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        int incrementValue$13 = var8;
                                                                        var8++;
                                                                        var24 = var38.field_i[incrementValue$13] + 16 << 2;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((qd) this).field_r[var25_int] = (byte)var24;
                                                                    break L69;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (((qd) this).field_o[var24] == 0) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (var20 != 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (~var65.length < ~var21) {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      } else {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_i[incrementValue$15] + -1;
                                                                    break L73;
                                                                  }
                                                                }
                                                                ((qd) this).field_m[var24] = (byte)var23;
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
                                                              if (~var64.length >= ~var21) {
                                                                var20 = -1;
                                                                break L76;
                                                              } else {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.i((byte) 13);
                                                            break L75;
                                                          }
                                                        }
                                                        ((qd) this).field_p[var23] = (short)(((qd) this).field_p[var23] + (dg.a(2, var22 - 1) << 14));
                                                        var20--;
                                                        ((qd) this).field_o[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.a(-16384);
                                                    ((qd) this).field_p[var20] = (short)(((qd) this).field_p[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.a(-16384);
                                                ((qd) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.f(2);
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
                                      gm dupTemp$17 = new gm();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.a(-16384);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_h = new byte[var16_int * 2];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.a(-16384);
                                      if (var16_int <= 0) {
                                        break L78;
                                      } else {
                                        var15.field_g = new byte[2 + var16_int * 2];
                                        var40.field_g[1] = (byte) 64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.f(2);
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
                        var7[var8] = var38.f(2);
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
                var4[var5] = var38.f(2);
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
        field_l = 50;
        field_h = new String[]{"Mission selection", "Available missions - Click to select.", "The selected mission's information.", "Start the selected mission.", "Enter the equip screen.", "Enter the research screen.", "From here you can access information about different equipment from the research screen, recruit new members into your squad and provide them with weapons from the equipment screen, and proceed into the next mission. To play a mission click on one of the mission circles to highlight it and then click on the 'select mission' button. Make sure you remember to equip your soldiers before this though!"};
        field_i = 0;
        field_j = "Squiddy Commander";
    }
}
