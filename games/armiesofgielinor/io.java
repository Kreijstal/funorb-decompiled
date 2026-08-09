/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends tc {
    static int field_n;
    static String field_u;
    static int field_t;
    int field_s;
    static boolean field_w;
    static String field_p;
    static wk field_z;
    byte[] field_x;
    short[] field_r;
    private int[] field_q;
    fq[] field_v;
    static String field_o;
    byte[] field_l;
    byte[] field_k;
    static wk[] field_m;
    sn[] field_y;

    final static void a(wp param0, byte param1) {
        try {
            ft.field_q = param0;
            if (param1 != -34) {
                field_m = (wk[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        field_m = null;
        if (param0 != 52) {
            return;
        }
        field_u = null;
    }

    final void a(int param0) {
        if (param0 <= 117) {
            this.field_q = (int[]) null;
        }
        this.field_q = null;
    }

    final static boolean a(int[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 106) {
                break L1;
              } else {
                var4 = (int[]) null;
                io.a((int[]) null, (byte) -31);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (-9 >= (var2_int ^ -1)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0[var2_int] == 0) {
                  var2_int++;
                  continue L2;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("io.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean a(int param0, byte[] param1, int[] param2, p param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              if (param0 == 11008) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (-129 >= (var8 ^ -1)) {
                stackIn_20_0 = var5_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param1 == null) {
                      break L4;
                    } else {
                      if (param1[var8] == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = this.field_q[var8];
                  if (-1 != (var9 ^ -1)) {
                    L5: {
                      if (var6 == var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) != 0) {
                            var7 = param3.a(param2, 36, var9 >> -634626462);
                            break L6;
                          } else {
                            var7 = param3.a(true, param2, var9 >> -1323980030);
                            break L6;
                          }
                        }
                        if (var7 != null) {
                          break L5;
                        } else {
                          var5_int = 0;
                          break L5;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L3;
                    } else {
                      this.field_y[var8] = (sn) (var7);
                      this.field_q[var8] = 0;
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
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("io.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    io(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        fq dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_205_2 = null;
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
        fq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        fq var15_ref = null;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        vh var38 = null;
        byte[] var39 = null;
        fq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        fq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        fq var48 = null;
        fq var49 = null;
        fq var50 = null;
        fq var51 = null;
        fq var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_x = new byte[128];
            this.field_y = new sn[128];
            this.field_k = new byte[128];
            this.field_r = new short[128];
            this.field_q = new int[128];
            this.field_v = new fq[128];
            this.field_l = new byte[128];
            var38 = new vh(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_o[var3 + var38.field_q] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var3++;
                    var38.field_q = var38.field_q + 1;
                    var5 = var38.field_q;
                    var38.field_q = var38.field_q + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (-1 == (var38.field_o[var6 + var38.field_q] ^ -1)) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var6++;
                            var38.field_q = var38.field_q + 1;
                            var8 = var38.field_q;
                            var38.field_q = var38.field_q + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (-1 == (var38.field_o[var9 + var38.field_q] ^ -1)) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_q = var38.field_q + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) < -2) {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.k(0);
                                              if (var15_int != 0) {
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
                                    var13 = new fq[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.k(0);
                                          if (-1 <= (var14 ^ -1)) {
                                            stackIn_39_0 = null;
                                            break L12;
                                          } else {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15 = var46;
                                          var14 = var38.k(0);
                                          if (0 < var14) {
                                            stackIn_42_0 = new byte[var14 * 2];
                                            break L13;
                                          } else {
                                            stackIn_42_0 = null;
                                            break L13;
                                          }
                                        }
                                        var58 = stackIn_42_0;
                                        var47 = var58;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (0 == var38.field_o[var38.field_q + var17]) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var17++;
                                                var38.field_q = var38.field_q + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var20) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if ((var23 ^ -1) <= -129) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (var24 >= 128) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if ((var26 ^ -1) <= -129) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_s = var38.k(0) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (null == var15) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var46.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.a((byte) 111);
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
                                                                                      if (var58.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.a((byte) 116);
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
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.k(0);
                                                                                            var15[0] = (byte)var19;
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
                                                                                                      if (var29 >= var46.length) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_l[var30] = (byte)(32 + this.field_l[var30] * var28 >> -53581754);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            this.field_l[var33] = (byte)(32 + var34 * this.field_l[var33] >> -40104826);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_l[var29] = (byte)(32 + var28 * this.field_l[var29] >> 1958956870);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 + 1 - -var38.k(0);
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (null == var16) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            var19 = var38.k(0);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var58.length <= var27) {
                                                                                                var27 = var58[0];
                                                                                                var28 = var58[1] << 620094721;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var29 >= var58.length) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28 + (this.field_x[var30] & 255);
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
                                                                                                            this.field_x[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var16[var29 - -1] << -902000799;
                                                                                                        var32 = (-var27 + var30) / 2 + var28 * (-var27 + var30);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var37 >= var30) {
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                                                              var35 = var34 + (255 & this.field_x[var37]);
                                                                                                              if (-1 >= (var35 ^ -1)) {
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
                                                                                                            this.field_x[var37] = (byte)var35;
                                                                                                            var32 = var32 + (var31 + -var28);
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28 + (255 & this.field_x[var29]);
                                                                                                      if (var30 >= 0) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if ((var30 ^ -1) >= -129) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_x[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 + 1 - -var38.k(0);
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
                                                                                                  if (var12 <= var27) {
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
                                                                                                              if (var52.field_j <= 0) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_e = var38.k(0);
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
                                                                                                          if (-1 <= (var51.field_b ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_j = var38.k(0);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_b = var38.k(0);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (var50.field_l == null) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_m = var38.k(0);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_g) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_c = var38.k(0);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (0 >= var50.field_d) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_i = var38.k(0);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_d = var38.k(0);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (null == var49.field_l) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_l.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var38.k(0) + (1 + var19);
                                                                                                var49.field_l[var29] = (byte)var19;
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
                                                                                          if (var29 >= var48.field_g.length) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.k(0);
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
                                                                                  if (null == var45.field_l) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var29 >= var45.field_l.length) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_l[var29] = var38.a((byte) -89);
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
                                                                                        var45.field_g[var29] = var38.a((byte) 103);
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
                                                                                  if (var21 >= var54.length) {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  } else {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_q[var27] ^ -1)) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.k(0) - -1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_l[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (0 == this.field_q[var26]) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
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
                                                                            this.field_v[var26] = (fq) (var25);
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
                                                                      if (-1 == (this.field_q[var25_int] ^ -1)) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var20 != 0) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_o[incrementValue$3] << 1530818946;
                                                                            if (var56.length > var21) {
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
                                                                        this.field_x[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (this.field_q[var24] == 0) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L73;
                                                                      } else {
                                                                        incrementValue$5 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_o[incrementValue$5];
                                                                        if (var21 >= var55.length) {
                                                                          var20 = -1;
                                                                          break L73;
                                                                        } else {
                                                                          incrementValue$6 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$6];
                                                                          break L73;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    this.field_k[var24] = (byte)var23;
                                                                    break L72;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L74: {
                                                              if (0 != var20) {
                                                                break L74;
                                                              } else {
                                                                L75: {
                                                                  if (var54.length <= var21) {
                                                                    var20 = -1;
                                                                    break L75;
                                                                  } else {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L75;
                                                                  }
                                                                }
                                                                var22 = var38.h(110);
                                                                break L74;
                                                              }
                                                            }
                                                            this.field_r[var23] = (short)(this.field_r[var23] + (rn.a(-1 + var22, 2) << 1552347598));
                                                            this.field_q[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.k(0);
                                                        this.field_r[var20] = (short)(this.field_r[var20] + (var19 << 815836392));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.k(0);
                                                    this.field_r[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.a((byte) -53);
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
                                        L76: {
                                          dupTemp$8 = new fq();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.k(0);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L76;
                                          } else {
                                            var15_ref.field_l = new byte[2 * var16_int];
                                            break L76;
                                          }
                                        }
                                        L77: {
                                          var16_int = var38.k(0);
                                          if (0 >= var16_int) {
                                            break L77;
                                          } else {
                                            var15_ref.field_g = new byte[2 + var16_int * 2];
                                            var40.field_g[1] = (byte)64;
                                            break L77;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.a((byte) -113);
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
                            var7[var8] = var38.a((byte) -120);
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
                    var4[var5] = var38.a((byte) 8);
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
          L78: {
            var2 = decompiledCaughtException;
            stackIn_204_0 = (RuntimeException) (var2);

            stackIn_204_1 = new StringBuilder().append("io.<init>(");

            if (param0 == null) {
              stackIn_205_0 = (RuntimeException) ((Object) stackIn_204_0);
              stackIn_205_1 = (StringBuilder) ((Object) stackIn_204_1);
              stackIn_205_2 = "null";
              break L78;
            } else {
              stackIn_205_0 = (RuntimeException) ((Object) stackIn_204_0);
              stackIn_205_1 = (StringBuilder) ((Object) stackIn_204_1);
              stackIn_205_2 = "{...}";
              break L78;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_205_0), stackIn_205_2 + ')');
        }
    }

    static {
        field_u = "This <%0> is currently carrying the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
        field_p = "Open";
        field_o = "Play Campaign";
    }
}
