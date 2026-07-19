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
        this.field_o = null;
        if (param0 <= 35) {
            vi var3 = (vi) null;
            qd.a(-83, 2, (vi) null);
        }
    }

    final static void a(int param0, int param1, vi param2) {
        uc var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
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
            discarded$0 = var5.d(var4, 8600);
            var5.j(var5.field_k + -var4, -119);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "qd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 < 93) {
            return;
        }
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
              if ((var8 ^ -1) <= -129) {
                stackOut_17_0 = var5_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param0 == null) {
                      break L3;
                    } else {
                      if (-1 == (param0[var8] ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_o[var8];
                  if (0 == var9) {
                    break L2;
                  } else {
                    L4: {
                      if (var6 == var9) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var9;
                          var9--;
                          if ((var9 & 1) != 0) {
                            var7 = param3.a((byte) -21, param1, var9 >> 2096158338);
                            break L5;
                          } else {
                            var7 = param3.a((byte) -106, var9 >> 1042604130, param1);
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
                      this.field_n[var8] = (gg) (var7);
                      this.field_o[var8] = 0;
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
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("qd.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("qd.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    qd(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        gm dupTemp$17 = null;
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
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_38_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_41_0 = null;
        byte[] stackOut_40_0 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        String stackOut_206_2 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        String stackOut_205_2 = null;
        try {
          L0: {
            this.field_s = new byte[128];
            this.field_q = new gm[128];
            this.field_p = new short[128];
            this.field_o = new int[128];
            this.field_n = new gg[128];
            this.field_r = new byte[128];
            this.field_m = new byte[128];
            var38 = new dh(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_i[var3 + var38.field_k] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var38.field_k = var38.field_k + 1;
                    var3++;
                    var5 = var38.field_k;
                    var38.field_k = var38.field_k + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_i[var38.field_k + var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var38.field_k = var38.field_k + 1;
                            var6++;
                            var8 = var38.field_k;
                            var38.field_k = var38.field_k + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_i[var9 + var38.field_k] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var9++;
                                      var38.field_k = var38.field_k + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) < -2) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.a(-16384);
                                              if (-1 != (var15_int ^ -1)) {
                                                L10: {
                                                  if (var15_int > var13_int) {
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
                                    var13 = new gm[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.a(-16384);
                                          if ((var14 ^ -1) >= -1) {
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
                                          var14 = var38.a(-16384);
                                          if (-1 <= (var14 ^ -1)) {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = (byte[]) ((Object) stackOut_41_0);
                                            break L13;
                                          } else {
                                            stackOut_40_0 = new byte[2 * var14];
                                            stackIn_42_0 = stackOut_40_0;
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_i[var38.field_k - -var17] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var17++;
                                                var38.field_k = var38.field_k + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if ((var20 ^ -1) <= -129) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if ((var23 ^ -1) <= -129) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (128 <= var24) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (var25_int >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var26 ^ -1)) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (-129 >= (var27 ^ -1)) {
                                                                            this.field_k = 1 + var38.a(-16384);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var46.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.f(2);
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
                                                                                        var16[var27] = var38.f(2);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          if (var15_array == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.a(-16384);
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
                                                                                                          if (var30 >= 128) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_s[var30] = (byte)(this.field_s[var30] * var28 + 32 >> 1662190086);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15_array[var29 - -1];
                                                                                                        var32 = var28 * (-var27 + var30) - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = pc.a(-64, -var27 + var30, var32);
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_s[var33] = (byte)(32 + var34 * this.field_s[var33] >> -1127737018);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_s[var29] = (byte)(32 + var28 * this.field_s[var29] >> 1793838790);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + var19 + var38.a(-16384);
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
                                                                                            var19 = var38.a(-16384);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var47.length <= var27) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 973967425;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = (this.field_r[var30] & 255) - -var28;
                                                                                                              if ((var31 ^ -1) <= -1) {
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
                                                                                                            this.field_r[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[1 + var29] << 626180737;
                                                                                                        var32 = (var30 + -var27) / 2 + var28 * (var30 + -var27);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = pc.a(-92, var30 - var27, var32);
                                                                                                              var35 = (255 & this.field_r[var37]) - -var34;
                                                                                                              if (0 <= var35) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (-129 <= (var35 ^ -1)) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_r[var37] = (byte)var35;
                                                                                                            var32 = var32 + (var31 + -var28);
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = (255 & this.field_r[var29]) + var28;
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
                                                                                                    this.field_r[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.a(-16384) + (1 + var19);
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
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (-1 <= (var52.field_m ^ -1)) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_c = var38.a(-16384);
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
                                                                                                          if (-1 <= (var51.field_d ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_m = var38.a(-16384);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_d = var38.a(-16384);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (var50.field_h == null) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_b = var38.a(-16384);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_g) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_k = var38.a(-16384);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if ((var50.field_i ^ -1) >= -1) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_e = var38.a(-16384);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_i = var38.a(-16384);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (null == var49.field_h) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_h.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = 1 + (var19 - -var38.a(-16384));
                                                                                                var49.field_h[var29] = (byte)var19;
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
                                                                                      if (null == var48.field_g) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_g.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = var19 - -1 - -var38.a(-16384);
                                                                                            var48.field_g[var29] = (byte)var19;
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
                                                                                  if (var45.field_h == null) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var45.field_h.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_h[var29] = var38.f(2);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_g) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= var45.field_g.length - 2) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.f(2);
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
                                                                              if (var20 != 0) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var21 >= var54.length) {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  } else {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if ((this.field_o[var27] ^ -1) >= -1) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.a(-16384) - -1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_s[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (-1 == (this.field_o[var26] ^ -1)) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var57.length <= var21) {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                } else {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_q[var26] = (gm) (var25);
                                                                            var20--;
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (-1 == (this.field_o[var25_int] ^ -1)) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (0 != var20) {
                                                                            break L71;
                                                                          } else {
                                                                            L72: {
                                                                              if (var21 < var56.length) {
                                                                                incrementValue$12 = var21;
                                                                                var21++;
                                                                                var20 = var7[incrementValue$12];
                                                                                break L72;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L72;
                                                                              }
                                                                            }
                                                                            incrementValue$13 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_i[incrementValue$13] + 16 << 975808098;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_r[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (-1 == (this.field_o[var24] ^ -1)) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var20 != 0) {
                                                                        break L74;
                                                                      } else {
                                                                        L75: {
                                                                          if (var55.length > var21) {
                                                                            incrementValue$14 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$14];
                                                                            break L75;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L75;
                                                                          }
                                                                        }
                                                                        incrementValue$15 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_i[incrementValue$15] + -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    this.field_m[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L76: {
                                                              if (-1 != (var20 ^ -1)) {
                                                                break L76;
                                                              } else {
                                                                L77: {
                                                                  if (var54.length <= var21) {
                                                                    var20 = -1;
                                                                    break L77;
                                                                  } else {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L77;
                                                                  }
                                                                }
                                                                var22 = var38.i((byte) 13);
                                                                break L76;
                                                              }
                                                            }
                                                            this.field_p[var23] = (short)(this.field_p[var23] + (dg.a(2, var22 - 1) << 977587118));
                                                            var20--;
                                                            this.field_o[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.a(-16384);
                                                        this.field_p[var20] = (short)(this.field_p[var20] + (var19 << -248609688));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.a(-16384);
                                                    this.field_p[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.f(2);
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
                                        L78: {
                                          dupTemp$17 = new gm();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.a(-16384);
                                          if (var16_int <= 0) {
                                            break L78;
                                          } else {
                                            var15.field_h = new byte[var16_int * 2];
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var16_int = var38.a(-16384);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L79;
                                          } else {
                                            var15.field_g = new byte[2 + var16_int * 2];
                                            var40.field_g[1] = (byte)64;
                                            break L79;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.f(2);
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
                            var7[var8] = var38.f(2);
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
                    var4[var5] = var38.f(2);
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
          L80: {
            var2 = decompiledCaughtException;
            stackOut_204_0 = (RuntimeException) (var2);
            stackOut_204_1 = new StringBuilder().append("qd.<init>(");
            stackIn_206_0 = stackOut_204_0;
            stackIn_206_1 = stackOut_204_1;
            stackIn_205_0 = stackOut_204_0;
            stackIn_205_1 = stackOut_204_1;
            if (param0 == null) {
              stackOut_206_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackOut_206_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackOut_206_2 = "null";
              stackIn_207_0 = stackOut_206_0;
              stackIn_207_1 = stackOut_206_1;
              stackIn_207_2 = stackOut_206_2;
              break L80;
            } else {
              stackOut_205_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackOut_205_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackOut_205_2 = "{...}";
              stackIn_207_0 = stackOut_205_0;
              stackIn_207_1 = stackOut_205_1;
              stackIn_207_2 = stackOut_205_2;
              break L80;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    static {
        field_l = 50;
        field_h = new String[]{"Mission selection", "Available missions - Click to select.", "The selected mission's information.", "Start the selected mission.", "Enter the equip screen.", "Enter the research screen.", "From here you can access information about different equipment from the research screen, recruit new members into your squad and provide them with weapons from the equipment screen, and proceed into the next mission. To play a mission click on one of the mission circles to highlight it and then click on the 'select mission' button. Make sure you remember to equip your soldiers before this though!"};
        field_i = 0;
        field_j = "Squiddy Commander";
    }
}
