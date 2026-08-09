/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends le {
    gi[] field_o;
    static String field_q;
    byte[] field_h;
    nf[] field_s;
    byte[] field_m;
    static String field_n;
    byte[] field_t;
    static int field_r;
    static int field_k;
    static boolean field_p;
    int field_u;
    short[] field_j;
    private int[] field_l;
    static String field_i;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 < 81) {
            ma.a(false, 21, true, true);
        }
        if (param0) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        if (!(!param3)) {
            var4++;
        }
        return vl.field_p[var4];
    }

    final boolean a(boolean param0, int[] param1, ka param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ka stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            var5_int = param0 ? 1 : 0;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              if (-129 >= (var8 ^ -1)) {
                stackIn_23_0 = var5_int;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param3 == null) {
                      break L3;
                    } else {
                      if (param3[var8] == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_l[var8];
                  if (0 != var9) {
                    L4: {
                      if (var9 != var6) {
                        L5: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) != 0) {
                            var7 = param2.a(1856253636, param1, var9 >> 1375166882);
                            break L5;
                          } else {
                            L6: {
                              stackIn_13_0 = (ka) (param2);

                              stackIn_13_1 = var9 >> 1106370594;

                              if (param0) {
                                stackIn_14_0 = (ka) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = 0;
                                break L6;
                              } else {
                                stackIn_14_0 = (ka) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = 1;
                                break L6;
                              }
                            }
                            var7 = ((ka) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, param1);
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
                      this.field_o[var8] = (gi) (var7);
                      this.field_l[var8] = 0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("ma.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final static void a(oe param0, int param1, String param2, rb param3, boolean param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (!param4) {
                break L1;
              } else {
                ma.d((byte) 75);
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (param2.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param2.charAt(var7);
                  if (var8 == 60) {
                    var6 = param0.field_e[0] + ((var5_int >> 1997582664) - -param3.b(param2.substring(0, var7)));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param0.field_e[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param0.field_e[var7] = (var5_int >> -597594264) - -param0.field_e[0] + param3.b(param2.substring(0, 1 + var7)) - param3.a((char) var8);
                    break L4;
                  }
                }
                if (62 == var8) {
                  var6 = -1;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ma.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = 47 % ((param0 - -23) / 32);
        field_n = null;
        field_i = null;
        field_q = null;
    }

    ma(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        nf dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_206_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
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
        nf[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        nf var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
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
        int var28_int = 0;
        nf var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        de var38 = null;
        byte[] var39 = null;
        nf var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        nf var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        nf var48 = null;
        nf var49 = null;
        nf var50 = null;
        nf var51 = null;
        nf var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        try {
          L0: {
            this.field_o = new gi[128];
            this.field_l = new int[128];
            this.field_t = new byte[128];
            this.field_j = new short[128];
            this.field_h = new byte[128];
            this.field_s = new nf[128];
            this.field_m = new byte[128];
            var38 = new de(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_h[var38.field_j - -var3] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var3++;
                    var38.field_j = var38.field_j + 1;
                    var5 = var38.field_j;
                    var38.field_j = var38.field_j + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (0 == var38.field_h[var38.field_j - -var6]) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var38.field_j = var38.field_j + 1;
                            var6++;
                            var8 = var38.field_j;
                            var38.field_j = var38.field_j + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_h[var38.field_j + var9] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var38.field_j = var38.field_j + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) < -2) {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.d((byte) -118);
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
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
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
                                    var13 = new nf[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.d((byte) -117);
                                          if (0 < var14) {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          } else {
                                            stackIn_39_0 = null;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15 = var46;
                                          var14 = var38.d((byte) -124);
                                          if (-1 > (var14 ^ -1)) {
                                            stackIn_42_0 = new byte[2 * var14];
                                            break L13;
                                          } else {
                                            stackIn_42_0 = null;
                                            break L13;
                                          }
                                        }
                                        var59 = stackIn_42_0;
                                        var47 = var59;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_h[var38.field_j - -var17] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var17++;
                                                var38.field_j = var38.field_j + 1;
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
                                                          if (128 <= var23) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (var24 >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var26) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if ((var27 ^ -1) <= -129) {
                                                                            this.field_u = 1 + var38.d((byte) -123);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (null == var15) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var58.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.e((byte) 116);
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
                                                                                      if (var59.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.e((byte) 116);
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
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.d((byte) -115);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var58.length <= var27) {
                                                                                                var27 = var58[0];
                                                                                                var28_int = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var29 >= var58.length) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_m[var30] = (byte)(var28_int * this.field_m[var30] + 32 >> -1338554714);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15[var29 - -1];
                                                                                                        var32 = (var30 + -var27) / 2 + var28_int * (-var27 + var30);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = rm.a(-var27 + var30, var32, false);
                                                                                                            this.field_m[var33] = (byte)(var34 * this.field_m[var33] - -32 >> -1590497562);
                                                                                                            var32 = var32 + (var31 + -var28_int);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_m[var29] = (byte)(32 + var28_int * this.field_m[var29] >> -1868340218);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.d((byte) -122) + (1 + var19);
                                                                                                var15[var27] = (byte)var19;
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
                                                                                            var19 = var38.d((byte) -118);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var59.length <= var27) {
                                                                                                var27 = var59[0];
                                                                                                var28_int = var59[1] << -1563631135;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var59.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28_int + (255 & this.field_h[var30]);
                                                                                                              if (var31 >= 0) {
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
                                                                                                            this.field_h[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var59[var29];
                                                                                                        var31 = var16[var29 + 1] << 480242657;
                                                                                                        var32 = (-var27 + var30) / 2 + (var30 + -var27) * var28_int;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var29 += 2;
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = rm.a(-var27 + var30, var32, false);
                                                                                                              var35 = var34 + (this.field_h[var37] & 255);
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
                                                                                                            this.field_h[var37] = (byte)var35;
                                                                                                            var32 = var32 + (-var28_int + var31);
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = (255 & this.field_h[var29]) + var28_int;
                                                                                                      if ((var30 ^ -1) <= -1) {
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
                                                                                                    this.field_h[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 - -1 + var38.d((byte) -118);
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (0 >= var52.field_f) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_g = var38.d((byte) -119);
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
                                                                                                          if (0 >= var51.field_a) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_f = var38.d((byte) -126);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_a = var38.d((byte) -128);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  var28 = var50;
                                                                                                  if (null == var50.field_h) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var28.field_i = var38.d((byte) -118);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var28.field_b) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var28.field_e = var38.d((byte) -120);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (var28.field_j <= 0) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var28.field_c = var38.d((byte) -127);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_j = var38.d((byte) -122);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          var28 = var49;
                                                                                          if (null == var49.field_h) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_h.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var19 + 1 - -var38.d((byte) -128);
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
                                                                                      if (var48.field_b == null) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var29 >= var48.field_b.length) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.d((byte) -125));
                                                                                            var48.field_b[var29] = (byte)var19;
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
                                                                                  if (null == var45.field_h) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var45.field_h.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_h[var29] = var38.e((byte) 116);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_b) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var45.field_b.length - 2 <= var29) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_b[var29] = var38.e((byte) 116);
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
                                                                                  if (var54.length > var21) {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L67;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (0 >= this.field_l[var27]) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.d((byte) -119) + 1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_m[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (0 == this.field_l[var26]) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (0 != var20) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L69;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_s[var26] = (nf) (var25);
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
                                                                      if (0 == this.field_l[var25_int]) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var20 != 0) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_h[incrementValue$3] << 596389762;
                                                                            if (var21 < var56.length) {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L71;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L71;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_h[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (0 == this.field_l[var24]) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (var20 != 0) {
                                                                        break L73;
                                                                      } else {
                                                                        L74: {
                                                                          if (var55.length <= var21) {
                                                                            var20 = -1;
                                                                            break L74;
                                                                          } else {
                                                                            incrementValue$5 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$5];
                                                                            break L74;
                                                                          }
                                                                        }
                                                                        incrementValue$6 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_h[incrementValue$6] + -1;
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    this.field_t[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L72;
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
                                                                  if (var21 >= var54.length) {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  } else {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.b(true);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_j[var23] = (short)(this.field_j[var23] + (eg.a(2, var22 + -1) << -996372562));
                                                            this.field_l[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.d((byte) -123);
                                                        this.field_j[var20] = (short)(this.field_j[var20] + (var19 << -366464344));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) -121);
                                                    this.field_j[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.e((byte) 116);
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
                                          dupTemp$8 = new nf();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.d((byte) -125);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L77;
                                          } else {
                                            var15_ref.field_h = new byte[2 * var16_int];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.d((byte) -123);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15_ref.field_b = new byte[2 + var16_int * 2];
                                            var40.field_b[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.e((byte) 116);
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
                            var7[var8] = var38.e((byte) 116);
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
                    var4[var5] = var38.e((byte) 116);
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
            stackIn_205_0 = (RuntimeException) (var2);

            stackIn_205_1 = new StringBuilder().append("ma.<init>(");

            if (param0 == null) {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "null";
              break L79;
            } else {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "{...}";
              break L79;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_206_0), stackIn_206_2 + ')');
        }
    }

    final static int d(byte param0) {
        int var1 = 45 % ((-7 - param0) / 35);
        return eb.field_a - eb.field_c;
    }

    static {
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = "Resizable";
        field_i = "That name is not available";
    }
}
