/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends pg {
    static ll[] field_k;
    static String field_o;
    static String field_i;
    private int[] field_q;
    int field_r;
    byte[] field_l;
    wf[] field_p;
    byte[] field_h;
    short[] field_m;
    static String field_g;
    ba[] field_n;
    byte[] field_j;

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = bk.a(qf.field_d, 1021, ib.field_r);
              if (param1 == (var2_int ^ -1)) {
                param0 = "<img=0>" + param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var2_int != 2) {
                break L2;
              } else {
                param0 = "<img=1>" + param0;
                break L2;
              }
            }
            stackIn_6_0 = (String) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("fg.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0) {
        if (param0 != 23257) {
            field_g = (String) null;
        }
        this.field_q = null;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_g = null;
        field_i = null;
        field_k = null;
        if (!param0) {
            field_o = (String) null;
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -45) {
                break L1;
              } else {
                var3 = (String) null;
                fg.a((String) null, (byte) -82);
                break L1;
              }
            }
            stackIn_3_0 = ld.field_q.a(param0, "", -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fg.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, gi param1, int[] param2, byte[] param3) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var9 = -60 % ((-13 - param0) / 37);
            var8 = 0;
            L1: while (true) {
              if (-129 >= (var8 ^ -1)) {
                stackIn_21_0 = var5_int;
                break L0;
              } else {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (0 != param3[var8]) {
                      break L2;
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  var10 = this.field_q[var8];
                  if (var10 != 0) {
                    L4: {
                      if (var6 == var10) {
                        break L4;
                      } else {
                        L5: {
                          var6 = var10;
                          var10--;
                          if (-1 == (var10 & 1 ^ -1)) {
                            var7 = param1.a(var10 >> -1610346110, param2, -2);
                            break L5;
                          } else {
                            var7 = param1.a(param2, var10 >> -1860846366, -2);
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
                    if (var7 != null) {
                      this.field_p[var8] = (wf) (var7);
                      this.field_q[var8] = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
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
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("fg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    fg(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        ba dupTemp$8 = null;
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
        ba[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        ba var15_ref = null;
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
        ba var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        wk var38 = null;
        byte[] var39 = null;
        ba var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ba var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ba var48 = null;
        ba var49 = null;
        ba var50 = null;
        ba var51 = null;
        ba var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_j = new byte[128];
            this.field_h = new byte[128];
            this.field_l = new byte[128];
            this.field_p = new wf[128];
            this.field_n = new ba[128];
            this.field_m = new short[128];
            this.field_q = new int[128];
            var38 = new wk(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_j[var3 + var38.field_g] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var3++;
                    var38.field_g = var38.field_g + 1;
                    var5 = var38.field_g;
                    var38.field_g = var38.field_g + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_j[var38.field_g - -var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var38.field_g = var38.field_g + 1;
                            var6++;
                            var8 = var38.field_g;
                            var38.field_g = var38.field_g + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (-1 == (var38.field_j[var9 + var38.field_g] ^ -1)) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_g = var38.field_g + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) < -2) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.e((byte) -124);
                                              if (var15_int == 0) {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
                                                break L9;
                                              } else {
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
                                    var13 = new ba[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.e((byte) 125);
                                          if ((var14 ^ -1) >= -1) {
                                            stackIn_39_0 = null;
                                            break L12;
                                          } else {
                                            stackIn_39_0 = new byte[var14 * 2];
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15 = var46;
                                          var14 = var38.e((byte) 96);
                                          if (var14 > 0) {
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
                                          if (-1 == (var38.field_j[var38.field_g + var17] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var38.field_g = var38.field_g + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
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
                                                              if (-129 >= (var24 ^ -1)) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var26 ^ -1)) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_r = var38.e((byte) -111) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var46.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.o(6);
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
                                                                                      if (var27 >= var58.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.o(6);
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
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.e((byte) -102);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var46.length <= var27) {
                                                                                                var27 = var46[0];
                                                                                                var28_int = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var29 >= var46.length) {
                                                                                                        var15 = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_h[var30] = (byte)(32 + var28_int * this.field_h[var30] >> -927257402);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = var28_int * (var30 + -var27) + (-var27 + var30) / 2;
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = jg.a(var30 + -var27, -271087521, var32);
                                                                                                            this.field_h[var33] = (byte)(32 + this.field_h[var33] * var34 >> 70882790);
                                                                                                            var32 = var32 + (var31 + -var28_int);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_h[var29] = (byte)(var28_int * this.field_h[var29] + 32 >> 53246182);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 - -1 - -var38.e((byte) 31);
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
                                                                                            var19 = var38.e((byte) 51);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var58.length <= var27) {
                                                                                                var27 = var58[0];
                                                                                                var28_int = var58[1] << 640449249;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var29 >= var58.length) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = (255 & this.field_j[var30]) - -var28_int;
                                                                                                              if (0 <= var31) {
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
                                                                                                            this.field_j[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var16[1 + var29] << -550095039;
                                                                                                        var32 = (-var27 + var30) / 2 + var28_int * (-var27 + var30);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var27 = var30;
                                                                                                            var28_int = var31;
                                                                                                            var29 += 2;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = jg.a(-var27 + var30, -271087521, var32);
                                                                                                              var35 = (this.field_j[var37] & 255) + var34;
                                                                                                              if (var35 >= 0) {
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
                                                                                                            var32 = var32 + (var31 - var28_int);
                                                                                                            this.field_j[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = (255 & this.field_j[var29]) + var28_int;
                                                                                                      if (-1 >= (var30 ^ -1)) {
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
                                                                                                    this.field_j[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.e((byte) -87) + (1 + var19);
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
                                                                                                      if (var12 <= var27) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var12 <= var27) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (var52.field_j <= 0) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_d = var38.e((byte) 94);
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
                                                                                                            var51.field_j = var38.e((byte) -87);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_e = var38.e((byte) 119);
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
                                                                                                    var28.field_g = var38.e((byte) -106);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var28.field_l) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var28.field_i = var38.e((byte) -99);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (var28.field_n <= 0) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var28.field_m = var38.e((byte) -90);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_n = var38.e((byte) -102);
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
                                                                                              if (var49.field_h.length <= var29) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = 1 + (var19 - -var38.e((byte) 101));
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
                                                                                      var28 = var48;
                                                                                      if (null == var48.field_l) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_l.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.e((byte) -93));
                                                                                            var48.field_l[var29] = (byte)var19;
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
                                                                                      if (var29 >= var45.field_h.length) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_h[var29] = var38.o(6);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_l) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= var45.field_l.length - 2) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_l[var29] = var38.o(6);
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
                                                                              if (0 != var20) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var54.length <= var21) {
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
                                                                                  var26 = 1 + var38.e((byte) -125);
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_h[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (this.field_q[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 >= var57.length) {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                } else {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_n[var26] = (ba) (var25);
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (this.field_q[var25_int] == 0) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_j[incrementValue$3] << 1756243586;
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
                                                                        this.field_j[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (0 == this.field_q[var24]) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (0 != var20) {
                                                                        break L73;
                                                                      } else {
                                                                        L74: {
                                                                          if (var55.length > var21) {
                                                                            incrementValue$5 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$5];
                                                                            break L74;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L74;
                                                                          }
                                                                        }
                                                                        incrementValue$6 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_j[incrementValue$6] + -1;
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    this.field_l[var24] = (byte)var23;
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
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.a(70);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_m[var23] = (short)(this.field_m[var23] + (dg.a(2, var22 - 1) << -181601778));
                                                            var20--;
                                                            this.field_q[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.e((byte) -100);
                                                        this.field_m[var20] = (short)(this.field_m[var20] + (var19 << -926025368));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e((byte) 79);
                                                    this.field_m[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.o(6);
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
                                          dupTemp$8 = new ba();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.e((byte) -106);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L77;
                                          } else {
                                            var15_ref.field_h = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.e((byte) 101);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15_ref.field_l = new byte[var16_int * 2 - -2];
                                            var40.field_l[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.o(6);
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
                            var7[var8] = var38.o(6);
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
                    var4[var5] = var38.o(6);
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

            stackIn_205_1 = new StringBuilder().append("fg.<init>(");

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
          throw aa.a((Throwable) ((Object) stackIn_206_0), stackIn_206_2 + ')');
        }
    }

    static {
        field_o = null;
        field_g = "Only show lobby chat from my friends";
        field_i = "Lets you swim and decreases the damage done by water attacks";
    }
}
