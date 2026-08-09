/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends kd {
    ke[] field_l;
    private int[] field_i;
    static hk field_j;
    byte[] field_n;
    static be field_s;
    byte[] field_q;
    rc[] field_h;
    int field_m;
    static int field_o;
    short[] field_k;
    static String field_p;
    byte[] field_r;

    final void a(int param0) {
        if (param0 >= -81) {
            return;
        }
        this.field_i = null;
    }

    final boolean a(byte[] param0, ja param1, byte param2, int[] param3) {
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (128 <= var8) {
                    break L3;
                  } else {
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (param0 == null) {
                            break L5;
                          } else {
                            if ((param0[var8] ^ -1) != -1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9 = this.field_i[var8];
                        if ((var9 ^ -1) == -1) {
                          break L4;
                        } else {
                          L6: {
                            if (var9 == var6) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  var6 = var9;
                                  var9--;
                                  if ((1 & var9 ^ -1) == -1) {
                                    break L8;
                                  } else {
                                    var7 = param1.a(var9 >> 1047490754, param3, true);
                                    if (var10 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var7 = param1.a(-1, param3, var9 >> -1827134814);
                                break L7;
                              }
                              if (var7 == null) {
                                var5_int = 0;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var7 != null) {
                            this.field_l[var8] = (ke) (var7);
                            this.field_i[var8] = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 >= 76) {
                  break L2;
                } else {
                  wj.c(true);
                  break L2;
                }
              }
              stackIn_22_0 = var5_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("wj.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public static void c(boolean param0) {
        field_p = null;
        field_j = null;
        if (param0) {
            wj.b(-51);
        }
        field_s = null;
    }

    final static int[] b(int param0) {
        if (param0 != 26770) {
            wj.c(true);
        }
        return new int[8];
    }

    final static void c(int param0) {
        gb.field_d = false;
        ca.field_k = false;
        ni.a(param0 ^ -6357, -1);
        ee.field_c = c.field_m;
        bk.field_c = c.field_m;
        if (param0 != -6399) {
            field_p = (String) null;
        }
    }

    wj(byte[] param0) {
        int incrementValue$0 = 0;
        rc dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        byte[] stackIn_50_0 = null;
        byte[] stackIn_53_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_127_0 = 0;
        Object stackIn_130_0 = null;
        byte[] stackIn_130_1 = null;
        Object stackIn_143_0 = null;
        byte[] stackIn_143_1 = null;
        byte[] stackIn_156_0 = null;
        byte[] stackIn_166_0 = null;
        int stackIn_186_0 = 0;
        int stackIn_193_0 = 0;
        byte[] stackIn_204_0 = null;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_239_0 = 0;
        rc stackIn_246_0 = null;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_265_0 = 0;
        int stackIn_265_1 = 0;
        rc stackIn_267_0 = null;
        RuntimeException stackIn_273_0 = null;
        StringBuilder stackIn_273_1 = null;
        RuntimeException stackIn_274_0 = null;
        StringBuilder stackIn_274_1 = null;
        RuntimeException stackIn_275_0 = null;
        StringBuilder stackIn_275_1 = null;
        String stackIn_275_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
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
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        rc var15 = null;
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
        int var28_int = 0;
        rc var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        wf var37 = null;
        byte[] var38 = null;
        rc var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        rc var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        rc var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_l = new ke[128];
                    this.field_h = new rc[128];
                    this.field_q = new byte[128];
                    this.field_n = new byte[128];
                    this.field_i = new int[128];
                    this.field_r = new byte[128];
                    this.field_k = new short[128];
                    var37 = new wf(param0);
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 == var37.field_j[var3 + var37.field_h]) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3++;
                    if (var36 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var54 = new byte[var3];
                    var41 = var54;
                    var4 = var41;
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) >= (var5 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4[var5] = var37.e(true);
                    var5++;
                    if (var36 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var36 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3++;
                    var37.field_h = var37.field_h + 1;
                    var5 = var37.field_h;
                    var37.field_h = var37.field_h + var3;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var37.field_j[var37.field_h + var6] ^ -1) == -1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6++;
                    if (var36 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var55 = new byte[var6];
                    var42 = var55;
                    var7 = var42;
                    var8 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 >= var6) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7[var8] = var37.e(true);
                    var8++;
                    if (var36 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var36 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6++;
                    var37.field_h = var37.field_h + 1;
                    var8 = var37.field_h;
                    var37.field_h = var37.field_h + var6;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((var37.field_j[var9 + var37.field_h] ^ -1) == -1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9++;
                    if (var36 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var56 = new byte[var9];
                    var43 = var56;
                    var10 = var43;
                    var11_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var9 <= var11_int) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var10[var11_int] = var37.e(true);
                    var11_int++;
                    if (var36 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var36 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var9++;
                    var37.field_h = var37.field_h + 1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var52 = new byte[var9];
                    var38 = var52;
                    var11 = var38;
                    if ((var9 ^ -1) >= -2) {
                        statePc = 36;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var52[1] = (byte) 1;
                    var12 = 2;
                    var13_int = 1;
                    var14 = 2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var14) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var15_int = var37.d(true);
                    stackIn_38_0 = var15_int;
                    stackIn_29_0 = stackIn_38_0;
                    if (var36 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var13_int ^ -1) > (var15_int ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var15_int--;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var13_int = var15_int;
                    if (var36 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    incrementValue$0 = var12;
                    var12++;
                    var13_int = incrementValue$0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11[var14] = (byte)var13_int;
                    var14++;
                    if (var36 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var36 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var12 = var9;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = var12;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13 = new rc[stackIn_38_0];
                    var14 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var13.length <= var14) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    dupTemp$1 = new rc();
                    var13[var14] = dupTemp$1;
                    var39 = dupTemp$1;
                    var15 = var39;
                    var16_int = var37.d(true);
                    stackIn_47_0 = var16_int;
                    stackIn_41_0 = stackIn_47_0;
                    if (var36 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 <= 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var15.field_c = new byte[var16_int * 2];
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var16_int = var37.d(true);
                    if ((var16_int ^ -1) >= -1) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var15.field_g = new byte[var16_int * 2 + 2];
                    var39.field_g[1] = (byte)64;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var14++;
                    if (var36 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var14 = var37.d(true);
                    stackIn_47_0 = -1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 <= (var14 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = new byte[2 * var14];
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = null;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var45 = stackIn_50_0;
                    var15_array = var45;
                    var14 = var37.d(true);
                    if (var14 <= 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = new byte[2 * var14];
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = null;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var46 = stackIn_53_0;
                    var16 = var46;
                    var17 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (-1 == (var37.field_j[var17 + var37.field_h] ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var17++;
                    if (var36 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var53 = new byte[var17];
                    var40 = var53;
                    var18 = var40;
                    var19 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var19 >= var17) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var18[var19] = var37.e(true);
                    var19++;
                    if (var36 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var36 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var17++;
                    var37.field_h = var37.field_h + 1;
                    var19 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var20 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((var20 ^ -1) <= -129) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var19 = var19 + var37.d(true);
                    this.field_k[var20] = (short)var19;
                    var20++;
                    if (var36 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var36 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var19 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var20 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (128 <= var20) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var19 = var19 + var37.d(true);
                    this.field_k[var20] = (short)(this.field_k[var20] + (var19 << 1631847880));
                    var20++;
                    if (var36 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var36 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var20 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (var23 >= 128) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_81_0 = var20;
                    stackIn_74_0 = stackIn_81_0;
                    if (var36 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (stackIn_74_0 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var53.length > var21) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    incrementValue$2 = var21;
                    var21++;
                    var20 = var18[incrementValue$2];
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var22 = var37.g((byte) -99);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    this.field_k[var23] = (short)(this.field_k[var23] + vg.a(32768, -1 + var22 << -658371602));
                    var20--;
                    this.field_i[var23] = var22;
                    var23++;
                    if (var36 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var21 = 0;
                    var20 = 0;
                    var23 = 0;
                    stackIn_81_0 = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var24 = stackIn_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (-129 >= (var24 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_92_0 = this.field_i[var24] ^ -1;
                    stackIn_84_0 = stackIn_92_0;
                    if (var36 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 == -1) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((var20 ^ -1) != -1) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    incrementValue$3 = var5;
                    var5++;
                    var23 = -1 + var37.field_j[incrementValue$3];
                    if (var21 >= var54.length) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    incrementValue$4 = var21;
                    var21++;
                    var20 = var4[incrementValue$4];
                    if (var36 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var20 = -1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    this.field_r[var24] = (byte)var23;
                    var20--;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var24++;
                    if (var36 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var20 = 0;
                    var21 = 0;
                    var24 = 0;
                    stackIn_92_0 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var25_int = stackIn_92_0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if ((var25_int ^ -1) <= -129) {
                        statePc = 103;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_104_0 = 0;
                    stackIn_95_0 = stackIn_104_0;
                    if (var36 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 != this.field_i[var25_int]) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var36 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((var20 ^ -1) != -1) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    incrementValue$5 = var8;
                    var8++;
                    var24 = var37.field_j[incrementValue$5] - -16 << -1072087262;
                    if ((var55.length ^ -1) >= (var21 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    incrementValue$6 = var21;
                    var21++;
                    var20 = var7[incrementValue$6];
                    if (var36 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var20 = -1;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    this.field_q[var25_int] = (byte)var24;
                    var20--;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var25_int++;
                    if (var36 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var21 = 0;
                    stackIn_104_0 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var20 = stackIn_104_0;
                    var25 = null;
                    var26 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var26 ^ -1) <= -129) {
                        statePc = 115;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_116_0 = this.field_i[var26] ^ -1;
                    stackIn_107_0 = stackIn_116_0;
                    if (var36 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 != -1) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var36 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (0 != var20) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var25 = var13[var52[var21]];
                    if (var21 < var56.length) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    incrementValue$7 = var21;
                    var21++;
                    var20 = var10[incrementValue$7];
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var20--;
                    this.field_h[var26] = (rc) (var25);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var26++;
                    if (var36 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var20 = 0;
                    var21 = 0;
                    var26 = 0;
                    stackIn_116_0 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var27 = stackIn_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var27 >= 128) {
                        statePc = 126;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_127_0 = var20;
                    stackIn_119_0 = stackIn_127_0;
                    if (var36 != 0) {
                        statePc = 127;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((var21 ^ -1) <= (var53.length ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    incrementValue$8 = var21;
                    var21++;
                    var20 = var18[incrementValue$8];
                    if (var36 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var20 = -1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (this.field_i[var27] <= 0) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var26 = var37.d(true) + 1;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var20--;
                    this.field_n[var27] = (byte)var26;
                    var27++;
                    if (var36 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_m = var37.d(true) - -1;
                    stackIn_127_0 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var27 = stackIn_127_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var44 = var13[var27];
                    stackIn_143_0 = null;
                    stackIn_130_0 = stackIn_143_0;
                    stackIn_143_1 = var44.field_c;
                    stackIn_130_1 = stackIn_143_1;
                    if (var36 != 0) {
                        statePc = 143;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == stackIn_130_1) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var29 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var29 >= var44.field_c.length) {
                        statePc = 135;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var44.field_c[var29] = var37.e(true);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var36 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var44.field_g == null) {
                        statePc = 140;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var29 = 3;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if ((var29 ^ -1) <= (var44.field_g.length - 2 ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var44.field_g[var29] = var37.e(true);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var36 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var27++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var36 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackIn_143_0 = null;
                    stackIn_143_1 = (byte[]) (var15_array);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 == stackIn_143_1) {
                        statePc = 148;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var27 = 1;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (var45.length <= var27) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var15_array[var27] = var37.e(true);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 153;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var36 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var16 == null) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var27 = 1;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((var27 ^ -1) <= (var46.length ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var16[var27] = var37.e(true);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var36 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var27 = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (var12 <= var27) {
                        statePc = 163;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var47 = var13[var27];
                    stackIn_204_0 = var47.field_g;
                    stackIn_156_0 = stackIn_204_0;
                    if (var36 != 0) {
                        statePc = 204;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (stackIn_156_0 == null) {
                        statePc = 161;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((var47.field_g.length ^ -1) >= (var29 ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var19 = 1 + var19 + var37.d(true);
                    var47.field_g[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var36 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var27++;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var36 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var27 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var48 = var13[var27];
                    stackIn_204_0 = var48.field_c;
                    stackIn_166_0 = stackIn_204_0;
                    if (var36 != 0) {
                        statePc = 204;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 == null) {
                        statePc = 171;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (var48.field_c.length <= var29) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = var37.d(true) + 1 + var19;
                    var48.field_c[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var36 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var27++;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (var36 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (var15_array == null) {
                        statePc = 198;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var19 = var37.d(true);
                    var15_array[0] = (byte)var19;
                    var27 = 2;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (var45.length <= var27) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var19 = var37.d(true) + var19 + 1;
                    var15_array[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var36 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var27 = var45[0];
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var28_int = var45[1];
                    var29 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if ((var29 ^ -1) <= (var27 ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.field_n[var29] = (byte)(var28_int * this.field_n[var29] - -32 >> -158679418);
                    var29++;
                    if (var36 != 0) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var36 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var29 = 2;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if ((var45.length ^ -1) >= (var29 ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var30 = var45[var29];
                    var31 = var15_array[1 + var29];
                    var32 = (-var27 + var30) * var28_int - -((-var27 + var30) / 2);
                    stackIn_193_0 = var27;
                    stackIn_186_0 = stackIn_193_0;
                    if (var36 != 0) {
                        statePc = 193;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var33 = stackIn_186_0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var34 = rl.b(-var27 + var30, var32, 25668);
                    this.field_n[var33] = (byte)(var34 * this.field_n[var33] - -32 >> 2044572166);
                    var32 = var32 + (-var28_int + var31);
                    var33++;
                    if (var36 != 0) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (var36 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var28_int = var31;
                    var27 = var30;
                    var29 += 2;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var36 == 0) {
                        statePc = 184;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    stackIn_193_0 = var27;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    var30 = stackIn_193_0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (128 <= var30) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    this.field_n[var30] = (byte)(var28_int * this.field_n[var30] + 32 >> 1870569894);
                    var30++;
                    if (var36 != 0) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (var36 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var15_array = null;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (var16 != null) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var27 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var13[var27].field_e = var37.d(true);
                    var27++;
                    if (var36 != 0) {
                        statePc = 244;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (var36 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var19 = var37.d(true);
                    stackIn_204_0 = (byte[]) (var16);
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    stackIn_204_0[0] = (byte)var19;
                    var27 = 2;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (var46.length <= var27) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var19 = var37.d(true) + var19 - -1;
                    var16[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var36 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var27 = var46[0];
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    var28_int = var46[1] << 1733682753;
                    var29 = 0;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if (var27 <= var29) {
                        statePc = 217;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var30 = (this.field_q[var29] & 255) + var28_int;
                    stackIn_219_0 = -1;
                    stackIn_212_0 = stackIn_219_0;
                    stackIn_219_1 = var30 ^ -1;
                    stackIn_212_1 = stackIn_219_1;
                    if (var36 != 0) {
                        statePc = 219;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (stackIn_212_0 >= stackIn_212_1) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var30 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (-129 <= (var30 ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var30 = 128;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    this.field_q[var29] = (byte)var30;
                    var29++;
                    if (var36 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var29 = 2;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    stackIn_219_0 = var46.length;
                    stackIn_219_1 = var29;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if (stackIn_219_0 <= stackIn_219_1) {
                        statePc = 231;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var30 = var46[var29];
                    var31 = var16[var29 - -1] << -1816063903;
                    var32 = (var30 - var27) / 2 + (var30 - var27) * var28_int;
                    stackIn_239_0 = var27;
                    stackIn_221_0 = stackIn_239_0;
                    if (var36 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var33 = stackIn_221_0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 229;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var34 = rl.b(var30 + -var27, var32, 25668);
                    var35 = (255 & this.field_q[var33]) - -var34;
                    stackIn_230_0 = var35;
                    stackIn_224_0 = stackIn_230_0;
                    if (var36 != 0) {
                        statePc = 230;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (stackIn_224_0 >= 0) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var35 = 0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (128 >= var35) {
                        statePc = 228;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var35 = 128;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    this.field_q[var33] = (byte)var35;
                    var32 = var32 + (-var28_int + var31);
                    var33++;
                    if (var36 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var28_int = var31;
                    stackIn_230_0 = var30;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    var27 = stackIn_230_0;
                    var29 += 2;
                    if (var36 == 0) {
                        statePc = 218;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var16 = null;
                    var30 = var27;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (var30 >= 128) {
                        statePc = 238;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var31 = var28_int + (255 & this.field_q[var30]);
                    if (0 <= var31) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var31 = 0;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (-129 <= (var31 ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var31 = 128;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    this.field_q[var30] = (byte)var31;
                    var30++;
                    statePc = 232;
                    continue stateLoop;
                }
                case 238: {
                    stackIn_239_0 = 0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var27 = stackIn_239_0;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var13[var27].field_e = var37.d(true);
                    var27++;
                    if (var36 != 0) {
                        statePc = 244;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (var36 == 0) {
                        statePc = 240;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var27 = 0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 253;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var49 = var13[var27];
                    stackIn_267_0 = (rc) (var49);
                    stackIn_246_0 = stackIn_267_0;
                    if (var36 != 0) {
                        statePc = 267;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (stackIn_246_0.field_c == null) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var49.field_j = var37.d(true);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (null == var49.field_g) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var49.field_l = var37.d(true);
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (-1 <= (var49.field_e ^ -1)) {
                        statePc = 252;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var49.field_b = var37.d(true);
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var27 = 0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (var12 <= var27) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var13[var27].field_d = var37.d(true);
                    var27++;
                    if (var36 != 0) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (var36 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var27 = 0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 263;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var50 = var13[var27];
                    stackIn_265_0 = 0;
                    stackIn_260_0 = stackIn_265_0;
                    stackIn_265_1 = var50.field_d;
                    stackIn_260_1 = stackIn_265_1;
                    if (var36 != 0) {
                        statePc = 265;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (stackIn_260_0 >= stackIn_260_1) {
                        statePc = 262;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var50.field_k = var37.d(true);
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var27 = 0;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    stackIn_265_0 = var27;
                    stackIn_265_1 = var12;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (stackIn_265_0 >= stackIn_265_1) {
                        statePc = 276;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    stackIn_267_0 = var13[var27];
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    var51 = stackIn_267_0;
                    var28 = var51;
                    if (var36 != 0) {
                        statePc = 277;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (-1 <= (var51.field_k ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var51.field_h = var37.d(true);
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    return;
                }
                case 277: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_o = 500;
    }
}
