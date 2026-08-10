/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wc extends lh {
    sf[] field_m;
    de[] field_j;
    int field_k;
    static String field_p;
    private int[] field_i;
    byte[] field_o;
    byte[] field_r;
    short[] field_l;
    byte[] field_n;
    static int field_q;

    final boolean a(ng param0, byte[] param1, boolean param2, int[] param3) {
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var11 = (int[]) null;
                this.a((ng) null, (byte[]) null, false, (int[]) null);
                break L1;
              }
            }
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (var8 >= 128) {
                stackIn_22_0 = var5_int;
                break L0;
              } else {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (param1[var8] != 0) {
                      break L3;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
                L4: {
                  var9 = this.field_i[var8];
                  if (0 != var9) {
                    L5: {
                      if (var6 == var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if (-1 == (1 & var9 ^ -1)) {
                            var7 = param0.a(param3, var9 >> 37976642, 29037);
                            break L6;
                          } else {
                            var7 = param0.a(var9 >> -1883072606, true, param3);
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
                    if (var7 != null) {
                      this.field_m[var8] = (sf) (var7);
                      this.field_i[var8] = 0;
                      break L4;
                    } else {
                      break L4;
                    }
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
          L7: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("wc.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != -24464) {
            wc.a((byte) 13);
        }
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, ce param4, int param5, String param6, boolean param7, int param8, int param9, int param10, long param11, int param12, int param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  ae.field_a = new ih(param12);
                  ud.field_b = new ih(param9);
                  be.field_b = param8;
                  if (param0 == 22986) {
                    break L1;
                  } else {
                    field_q = -30;
                    break L1;
                  }
                }
                L2: {
                  pc.field_j = param13;
                  j.field_g = param1;
                  if (!param3) {
                    stackIn_5_0 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  bk.field_e = stackIn_5_0 != 0;
                  af.field_f = param4;
                  a.field_d = param6;
                  if (!param7) {
                    stackIn_8_0 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  va.field_m = stackIn_8_0 != 0;
                  bb.field_E = param2;
                  ab.field_d = param5;
                  c.field_P = param11;
                  cj.field_b = param10;
                  if (null == af.field_f.field_k) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        ge.field_d = new k(af.field_f.field_k, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("wc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    wc(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        de dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
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
        de[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        de var15_ref = null;
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
        ni var38 = null;
        byte[] var39 = null;
        de var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        de var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        de var48 = null;
        de var49 = null;
        de var50 = null;
        de var51 = null;
        de var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        try {
          L0: {
            this.field_n = new byte[128];
            this.field_j = new de[128];
            this.field_l = new short[128];
            this.field_i = new int[128];
            this.field_o = new byte[128];
            this.field_r = new byte[128];
            this.field_m = new sf[128];
            var38 = new ni(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_k[var3 + var38.field_i] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var38.field_i = var38.field_i + 1;
                    var3++;
                    var5 = var38.field_i;
                    var38.field_i = var38.field_i + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (-1 == (var38.field_k[var6 + var38.field_i] ^ -1)) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var38.field_i = var38.field_i + 1;
                            var6++;
                            var8 = var38.field_i;
                            var38.field_i = var38.field_i + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_k[var9 + var38.field_i] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var38.field_i = var38.field_i + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (var9 > 1) {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.e(false);
                                              if (0 != var15_int) {
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
                                    var13 = new de[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.e(false);
                                          if (0 >= var14) {
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
                                          var14 = var38.e(false);
                                          if (0 >= var14) {
                                            stackIn_42_0 = null;
                                            break L13;
                                          } else {
                                            stackIn_42_0 = new byte[2 * var14];
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_k[var38.field_i + var17] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var38.field_i = var38.field_i + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var20 ^ -1)) {
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
                                                              if (128 <= var24) {
                                                                var20 = 0;
                                                                var21 = 0;
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
                                                                            this.field_k = var38.e(false) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var46.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.i(-128);
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
                                                                                      if (var47.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.i(-51);
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
                                                                                          if (null == var15) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.e(false);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var46.length) {
                                                                                                var27 = var46[0];
                                                                                                var28 = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var29 >= var46.length) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_o[var30] = (byte)(var28 * this.field_o[var30] + 32 >> 1993820390);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = (-var27 + var30) * var28 + (var30 + -var27) / 2;
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = re.a(var32, -var27 + var30, false);
                                                                                                            this.field_o[var33] = (byte)(var34 * this.field_o[var33] - -32 >> 237303782);
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_o[var29] = (byte)(this.field_o[var29] * var28 + 32 >> 1600670822);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.e(false) + (1 + var19);
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
                                                                                            var19 = var38.e(false);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << -1528934943;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
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
                                                                                                              var31 = (this.field_r[var30] & 255) + var28;
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
                                                                                                            this.field_r[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 - -1] << 811036641;
                                                                                                        var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var37 >= var30) {
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = re.a(var32, -var27 + var30, false);
                                                                                                              var35 = var34 + (this.field_r[var37] & 255);
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
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_r[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28 + (255 & this.field_r[var29]);
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
                                                                                                var19 = var19 - (-1 - var38.e(false));
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
                                                                                                              if (-1 <= (var52.field_f ^ -1)) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_m = var38.e(false);
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
                                                                                                          if (-1 <= (var51.field_g ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_f = var38.e(false);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_g = var38.e(false);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (null == var50.field_p) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.e(false);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_i) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_l = var38.e(false);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (0 >= var50.field_c) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_e = var38.e(false);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_c = var38.e(false);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (null == var49.field_p) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_p.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var19 + 1 + var38.e(false);
                                                                                                var49.field_p[var29] = (byte)var19;
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
                                                                                      if (null == var48.field_i) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_i.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = var38.e(false) + var19 - -1;
                                                                                            var48.field_i[var29] = (byte)var19;
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
                                                                                  if (var45.field_p == null) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var45.field_p.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_p[var29] = var38.i(-74);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (var45.field_i == null) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= var45.field_i.length + -2) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_i[var29] = var38.i(-127);
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
                                                                                if (this.field_i[var27] <= 0) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.e(false) + 1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_o[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (-1 == (this.field_i[var26] ^ -1)) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var57.length > var21) {
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
                                                                            this.field_j[var26] = (de) (var25);
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
                                                                      if (this.field_i[var25_int] == 0) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_k[incrementValue$3] << -2022321470;
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
                                                                        this.field_r[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (-1 == (this.field_i[var24] ^ -1)) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (0 != var20) {
                                                                        break L73;
                                                                      } else {
                                                                        L74: {
                                                                          if (var21 >= var55.length) {
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
                                                                        var23 = -1 + var38.field_k[incrementValue$6];
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    this.field_n[var24] = (byte)var23;
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
                                                                var22 = var38.b(true);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_l[var23] = (short)(this.field_l[var23] + sc.a(32768, -1 + var22 << -227044114));
                                                            this.field_i[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.e(false);
                                                        this.field_l[var20] = (short)(this.field_l[var20] + (var19 << 1890858024));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e(false);
                                                    this.field_l[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.i(-45);
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
                                          dupTemp$8 = new de();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.e(false);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L77;
                                          } else {
                                            var15_ref.field_p = new byte[2 * var16_int];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.e(false);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15_ref.field_i = new byte[2 * var16_int + 2];
                                            var40.field_i[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.i(-38);
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
                            var7[var8] = var38.i(-19);
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
                    var4[var5] = var38.i(-122);
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
            stackIn_206_0 = (RuntimeException) (var2);

            stackIn_206_1 = new StringBuilder().append("wc.<init>(");

            if (param0 == null) {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "null";
              break L79;
            } else {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "{...}";
              break L79;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    final static ke a(byte param0) {
        if (param0 > -6) {
            field_p = (String) null;
        }
        return qg.field_f;
    }

    static {
    }
}
