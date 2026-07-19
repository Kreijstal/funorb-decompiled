/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends o {
    private int[] field_o;
    dl[] field_r;
    int field_n;
    lm[] field_s;
    byte[] field_l;
    short[] field_p;
    byte[] field_k;
    byte[] field_q;
    static aj field_j;
    static String field_m;
    static ci field_t;
    static int field_u;

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                ph.field_j.a(param3, 12105912, var4, param0);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            L3: {
              if (param1 == 98) {
                break L3;
              } else {
                var5 = (java.awt.Canvas) null;
                kf.a(-46, (byte) 59, (java.awt.Canvas) null, -92);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 != -101) {
            kf.a(14);
        }
        field_m = null;
        field_t = null;
    }

    final boolean a(int[] param0, fe param1, byte param2, byte[] param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              if (param2 == -73) {
                break L1;
              } else {
                var11 = (byte[]) null;
                discarded$1 = this.a((int[]) null, (fe) null, (byte) -119, (byte[]) null);
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if ((var8 ^ -1) <= -129) {
                stackOut_21_0 = var5_int;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param3 == null) {
                      break L4;
                    } else {
                      if (-1 != (param3[var8] ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_o[var8];
                  if (var9 != 0) {
                    L5: {
                      if (var6 == var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if (0 == (1 & var9)) {
                            var7 = param1.a(param0, var9 >> -1873103902, param2 + 968449273);
                            break L6;
                          } else {
                            var7 = param1.a(var9 >> 414047586, param0, (byte) -48);
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
                    if (var7 != null) {
                      this.field_s[var8] = (lm) (var7);
                      this.field_o[var8] = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var8++;
                    continue L2;
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
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("kf.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final void e(int param0) {
        boolean discarded$0 = false;
        this.field_o = null;
        if (param0 <= 45) {
            byte[] var3 = (byte[]) null;
            discarded$0 = this.a((int[]) null, (fe) null, (byte) 87, (byte[]) null);
        }
    }

    kf(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        dl dupTemp$17 = null;
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
        dl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        dl var15 = null;
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
        p var38 = null;
        byte[] var39 = null;
        dl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dl var48 = null;
        dl var49 = null;
        dl var50 = null;
        dl var51 = null;
        dl var52 = null;
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
            this.field_r = new dl[128];
            this.field_q = new byte[128];
            this.field_k = new byte[128];
            this.field_o = new int[128];
            this.field_p = new short[128];
            this.field_s = new lm[128];
            this.field_l = new byte[128];
            var38 = new p(param0);
            var3 = 0;
            L1: while (true) {
              if (0 == var38.field_o[var38.field_l - -var3]) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_l = var38.field_l + 1;
                    var3++;
                    var5 = var38.field_l;
                    var38.field_l = var38.field_l + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_o[var38.field_l - -var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var38.field_l = var38.field_l + 1;
                            var6++;
                            var8 = var38.field_l;
                            var38.field_l = var38.field_l + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (0 == var38.field_o[var38.field_l - -var9]) {
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
                                      if (-2 <= (var9 ^ -1)) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.i(-77);
                                              if (var15_int != 0) {
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
                                      }
                                    }
                                    var13 = new dl[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.i(-125);
                                          if (var14 <= 0) {
                                            stackOut_38_0 = null;
                                            stackIn_39_0 = (byte[]) ((Object) stackOut_38_0);
                                            break L12;
                                          } else {
                                            stackOut_37_0 = new byte[var14 * 2];
                                            stackIn_39_0 = stackOut_37_0;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15_array = var46;
                                          var14 = var38.i(-77);
                                          if (0 >= var14) {
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
                                          if (var38.field_o[var17 + var38.field_l] == 0) {
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
                                                          if (128 <= var23) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (var24 >= 128) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var26) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_n = 1 + var38.i(-86);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var46.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.g(0);
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
                                                                                        var16[var27] = var38.g(0);
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
                                                                                            var19 = var38.i(-109);
                                                                                            var15_array[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var46.length) {
                                                                                                var27 = var46[0];
                                                                                                var28 = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var46.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            var15_array = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_k[var30] = (byte)(32 + var28 * this.field_k[var30] >> 1680097606);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15_array[1 + var29];
                                                                                                        var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var27 = var30;
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = hf.a(var32, 1022407519, var30 - var27);
                                                                                                            this.field_k[var33] = (byte)(32 + this.field_k[var33] * var34 >> 315292454);
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_k[var29] = (byte)(32 + var28 * this.field_k[var29] >> 1096502470);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.i(-106) + var19 + 1;
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
                                                                                            var19 = var38.i(-106);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << -803788031;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28 + (255 & this.field_q[var30]);
                                                                                                              if (-1 >= (var31 ^ -1)) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if (-129 <= (var31 ^ -1)) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_q[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 + 1] << -1625238687;
                                                                                                        var32 = var28 * (-var27 + var30) - -((var30 - var27) / 2);
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
                                                                                                              var34 = hf.a(var32, 1022407519, -var27 + var30);
                                                                                                              var35 = (this.field_q[var37] & 255) + var34;
                                                                                                              if (0 <= var35) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if ((var35 ^ -1) >= -129) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_q[var37] = (byte)var35;
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28 + (this.field_q[var29] & 255);
                                                                                                      if (0 <= var30) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if (128 >= var30) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_q[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + (var19 - -var38.i(-112));
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var12 <= var27) {
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
                                                                                                          if (var27 >= var12) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (var52.field_g <= 0) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_f = var38.i(-93);
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
                                                                                                          if (0 >= var51.field_e) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_g = var38.i(-108);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_e = var38.i(-112);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (null == var50.field_a) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_l = var38.i(-123);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (var50.field_k == null) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.i(-95);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if ((var50.field_b ^ -1) >= -1) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_i = var38.i(-101);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_b = var38.i(-91);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (null == var49.field_a) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_a.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var38.i(-120) + var19 + 1;
                                                                                                var49.field_a[var29] = (byte)var19;
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
                                                                                            var19 = 1 + (var19 + var38.i(-83));
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
                                                                                  if (var45.field_a == null) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var29 >= var45.field_a.length) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_a[var29] = var38.g(0);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_k) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= var45.field_k.length - 2) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_k[var29] = var38.g(0);
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
                                                                                if (-1 <= (this.field_o[var27] ^ -1)) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = 1 + var38.i(-128);
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
                                                                          if (this.field_o[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
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
                                                                            this.field_r[var26] = (dl) (var25);
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
                                                                          if (var20 != 0) {
                                                                            break L71;
                                                                          } else {
                                                                            L72: {
                                                                              if (var56.length > var21) {
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
                                                                            var24 = var38.field_o[incrementValue$13] + 16 << -1813321662;
                                                                            break L71;
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_q[var25_int] = (byte)var24;
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
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L74;
                                                                      } else {
                                                                        L75: {
                                                                          if (var55.length <= var21) {
                                                                            var20 = -1;
                                                                            break L75;
                                                                          } else {
                                                                            incrementValue$14 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$14];
                                                                            break L75;
                                                                          }
                                                                        }
                                                                        incrementValue$15 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_o[incrementValue$15] + -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    this.field_l[var24] = (byte)var23;
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
                                                              if (var20 != 0) {
                                                                break L76;
                                                              } else {
                                                                L77: {
                                                                  if (var21 >= var54.length) {
                                                                    var20 = -1;
                                                                    break L77;
                                                                  } else {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L77;
                                                                  }
                                                                }
                                                                var22 = var38.c((byte) 58);
                                                                break L76;
                                                              }
                                                            }
                                                            this.field_p[var23] = (short)(this.field_p[var23] + ce.a(32768, -1 + var22 << 553767086));
                                                            this.field_o[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.i(-98);
                                                        this.field_p[var20] = (short)(this.field_p[var20] + (var19 << 1706272360));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.i(-78);
                                                    this.field_p[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.g(0);
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
                                          dupTemp$17 = new dl();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.i(-94);
                                          if (var16_int <= 0) {
                                            break L78;
                                          } else {
                                            var15.field_a = new byte[2 * var16_int];
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var16_int = var38.i(-111);
                                          if (0 >= var16_int) {
                                            break L79;
                                          } else {
                                            var15.field_k = new byte[2 * var16_int - -2];
                                            var40.field_k[1] = (byte)64;
                                            break L79;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.g(0);
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
                            var7[var8] = var38.g(0);
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
                    var4[var5] = var38.g(0);
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
            stackOut_204_1 = new StringBuilder().append("kf.<init>(");
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
          throw fk.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    final static boolean d(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        java.awt.Canvas var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = lg.field_d;
        synchronized (var1_ref) {
          L0: {
            if (ph.field_h != ta.field_y) {
              L1: {
                vg.field_a = ag.field_a[ph.field_h];
                d.field_Ib = hj.field_a[ph.field_h];
                if (param0 == 18954) {
                  break L1;
                } else {
                  var3 = (java.awt.Canvas) null;
                  kf.a(-30, (byte) -26, (java.awt.Canvas) null, 72);
                  break L1;
                }
              }
              ph.field_h = 127 & 1 + ph.field_h;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0) {
        if (an.field_c) {
            rc.b(0);
        }
        if (param0 > -70) {
            kf.a(89);
        }
    }

    static {
        field_m = "Find opponent";
    }
}
