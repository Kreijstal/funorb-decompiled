/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ka {
    private ln field_r;
    static String field_p;
    private ln[] field_t;
    static boolean field_q;
    private int field_s;

    final int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_r) {
                break L1;
              } else {
                if (this.field_r.field_y == param2) {
                  stackIn_4_0 = 4;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                field_q = true;
                break L2;
              }
            }
            stackIn_8_0 = super.a(param0, param1 + 0, param2);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("sc.UA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    public final void a(byte param0) {
        int incrementValue$0 = 0;
        int var2;
        ln[] var3;
        int var4;
        int var6;
        ln[] var7;
        ln var9;
        ln var8;
        ln var10;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var7 = this.field_g.field_g.field_e;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            this.field_t = new ln[var2];
            var2 = 0;
            var3 = this.field_g.field_g.field_e;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                super.a(param0);
                return;
              } else {
                var8 = var3[var4];
                var10 = var8;
                if (var10.field_L >= 1) {
                  if (var10.field_y != this.field_n) {
                    incrementValue$0 = var2;
                    var2++;
                    this.field_t[incrementValue$0] = var8;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var9 = var7[var4];
            if ((var9.field_L ^ -1) <= -2) {
              if (this.field_n != var9.field_y) {
                var2++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final int b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fb var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 41) {
                break L1;
              } else {
                var5 = (fb) null;
                sc.a(-12, false, (fb) null, -124);
                break L1;
              }
            }
            L2: {
              if (param0.field_R != null) {
                stackIn_5_0 = param0.field_R.field_r;
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_5_0;
              var4 = this.a(-5, param0) + 2 * (param0.field_x + var3_int);
              if (var4 != 0) {
                stackIn_8_0 = var4;
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("sc.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final int c(ln param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = super.c(param0, param1);
            var4 = param0.field_p;
            var5 = 2147483647;
            var6 = this.field_t;
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                L2: {
                  if (this.field_s <= var5) {
                    break L2;
                  } else {
                    var3_int += 1000;
                    break L2;
                  }
                }
                stackIn_9_0 = var3_int;
                break L0;
              } else {
                var8 = var6[var7];
                var9 = this.field_g.field_g.field_c[var4][var8.field_p];
                if ((var5 ^ -1) < (var9 ^ -1)) {
                  var5 = var9;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("sc.NA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void f(byte param0) {
        field_p = null;
        if (param0 != 97) {
            sc.f((byte) -65);
        }
    }

    final static void a(int param0, boolean param1, fb param2, int param3) {
        sg dupTemp$0 = null;
        sg dupTemp$1 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        sg stackIn_22_0 = null;
        sg stackIn_23_0 = null;
        sg stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        sg stackIn_29_0 = null;
        sg stackIn_30_0 = null;
        sg stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        sg stackIn_69_0 = null;
        sg stackIn_70_0 = null;
        sg stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        sg stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        sg stackIn_76_0 = null;
        sg stackIn_77_0 = null;
        sg stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        sg stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        sg stackIn_89_0 = null;
        sg stackIn_90_0 = null;
        sg stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        sg stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        sg stackIn_96_0 = null;
        sg stackIn_97_0 = null;
        sg stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        sg stackIn_102_0 = null;
        boolean stackIn_102_1 = false;
        sg stackIn_103_0 = null;
        boolean stackIn_103_1 = false;
        sg stackIn_104_0 = null;
        boolean stackIn_104_1 = false;
        int stackIn_104_2 = 0;
        sg stackIn_106_0 = null;
        sg stackIn_107_0 = null;
        sg stackIn_108_0 = null;
        sg stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_113_0 = 0;
        sg stackIn_125_0 = null;
        sg stackIn_126_0 = null;
        sg stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        sg stackIn_130_0 = null;
        sg stackIn_131_0 = null;
        sg stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        sg stackIn_134_0 = null;
        sg stackIn_135_0 = null;
        sg stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        sg stackIn_138_0 = null;
        sg stackIn_139_0 = null;
        sg stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        String stackIn_156_0 = null;
        sg stackIn_159_0 = null;
        sg stackIn_160_0 = null;
        sg stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        sg stackIn_162_0 = null;
        sg stackIn_163_0 = null;
        sg stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_229_0 = 0;
        sg stackIn_327_0 = null;
        sg stackIn_328_0 = null;
        sg stackIn_329_0 = null;
        sg stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        sg stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        sg stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        sg stackIn_337_0 = null;
        boolean stackIn_337_1 = false;
        int stackIn_337_2 = 0;
        sg stackIn_339_0 = null;
        byte stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_339_3 = 0;
        sg stackIn_340_0 = null;
        sg stackIn_341_0 = null;
        sg stackIn_342_0 = null;
        int stackIn_342_1 = 0;
        sg stackIn_344_0 = null;
        sg stackIn_345_0 = null;
        sg stackIn_346_0 = null;
        sg stackIn_347_0 = null;
        int stackIn_347_1 = 0;
        RuntimeException stackIn_355_0 = null;
        StringBuilder stackIn_355_1 = null;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_357_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        sg[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        sg var18 = null;
        int var19 = 0;
        Object var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var23_int = 0;
        Object var23 = null;
        int var24 = 0;
        int var25 = 0;
        Object var26 = null;
        String var26_ref = null;
        int var27 = 0;
        int var28 = 0;
        sg var29 = null;
        sg var30 = null;
        sg[] var31 = null;
        String var32 = null;
        String var33 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!param1) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (k.field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4_int = stackIn_5_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 6: {
                    if (ip.a((byte) -92)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_12_0 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 8: {
                    if (!param2.field_Ab) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_12_0 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var4_int = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var5 = -12 / ((param0 - -47) / 49);
                    var6 = 0;
                    if (param1) {
                        statePc = 37;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var7 ^ -1) <= -6) {
                        statePc = 32;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var4_int == 0) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (fk.field_p[0][1 + var7].field_rb == 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (param2.field_nc != var7) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    param2.field_nc = var7;
                    var6 = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = fk.field_p[0][1 + var7];
                    stackIn_22_0 = stackIn_23_0;
                    if (var4_int == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (sg) ((Object) stackIn_22_0);
                    stackIn_24_1 = 1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (sg) ((Object) stackIn_23_0);
                    stackIn_24_1 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_24_0.field_s = stackIn_24_1 != 0;
                    if (ns.field_pb) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var7 == 3) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    fk.field_p[0][var7 + 1].field_s = false;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = fk.field_p[0][1 + var7];
                    stackIn_29_0 = stackIn_30_0;
                    if (param2.field_nc != var7) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (sg) ((Object) stackIn_29_0);
                    stackIn_31_1 = 1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (sg) ((Object) stackIn_30_0);
                    stackIn_31_1 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_31_0.field_bb = stackIn_31_1 != 0;
                    var7++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 32: {
                    if (fk.field_p[0][2].field_v) {
                        statePc = 34;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!ip.a((byte) -126)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    dn.field_k = po.field_c;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    dn.field_k = re.a(ef.field_b, 4371, new String[]{np.field_a.field_Xb});
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((nl.field_a.length ^ -1) > -3) {
                        statePc = 110;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (param1) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_44_0 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 40: {
                    if (0 != (ih.field_d ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_44_0 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var7 = stackIn_44_0;
                    if (var7 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var8 = ih.field_d;
                    var9_int = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var9_int >= id.field_c.length) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    id.field_c[var9_int] = (byte) 0;
                    var9_int++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 48: {
                    id.field_c[var8 / 8] = (byte)ee.a((int) id.field_c[var8 / 8], 1 << var8 % 8);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (param1) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = -1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var8 = stackIn_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var8 >= nl.field_a.length) {
                        statePc = 110;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var7 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_60_0 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 56: {
                    if (var8 != ih.field_d) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = 1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var9_int = stackIn_60_0;
                    if (var4_int == 0) {
                        statePc = 87;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 == fk.field_p[1][1 + var8].field_rb) {
                        statePc = 87;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (param1) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var10 = nl.field_a[var8];
                    if (var10 != param2.field_Eb) {
                        statePc = 65;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var6 = 1;
                    param2.field_Eb = var10;
                    statePc = 87;
                    continue stateLoop;
                }
                case 66: {
                    if (var7 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (param1) {
                        statePc = 72;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var10 = nl.field_a[var8];
                    stackIn_70_0 = fk.field_p[1][var8 - -1];
                    stackIn_69_0 = stackIn_70_0;
                    if (var10 != param2.field_Eb) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = (sg) ((Object) stackIn_69_0);
                    stackIn_71_1 = 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (sg) ((Object) stackIn_70_0);
                    stackIn_71_1 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_71_0.field_bb = stackIn_71_1 != 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 72: {
                    if (-1 == var8) {
                        statePc = 79;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = fk.field_p[1][var8 + 1];
                    stackIn_75_1 = -1;
                    stackIn_75_2 = id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (sg) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_77_0;
                    if (stackIn_75_1 == stackIn_75_2) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (sg) ((Object) stackIn_76_0);
                    stackIn_78_1 = 1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (sg) ((Object) stackIn_77_0);
                    stackIn_78_1 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_78_0.field_bb = stackIn_78_1 != 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 79: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    if (var10 >= nl.field_a.length) {
                        statePc = 105;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    dupTemp$0 = fk.field_p[1][1 + var8];
                    stackIn_103_0 = (sg) (dupTemp$0);
                    stackIn_81_0 = stackIn_103_0;
                    stackIn_103_1 = dupTemp$0.field_bb;
                    stackIn_81_1 = stackIn_103_1;
                    if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_104_0 = (sg) ((Object) stackIn_81_0);
                    stackIn_104_1 = stackIn_81_1;
                    stackIn_104_2 = 1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 82: {
                    if (var8 == -1) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    id.field_c[var8 / 8] = (byte)nc.a((int) id.field_c[var8 / 8], 1 << we.a(7, var8));
                    statePc = 87;
                    continue stateLoop;
                }
                case 84: {
                    var10 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (id.field_c.length <= var10) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    id.field_c[var10] = (byte) 0;
                    var10++;
                    statePc = 85;
                    continue stateLoop;
                }
                case 87: {
                    if (param1) {
                        statePc = 92;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var10 = nl.field_a[var8];
                    stackIn_90_0 = fk.field_p[1][var8 - -1];
                    stackIn_89_0 = stackIn_90_0;
                    if (var10 != param2.field_Eb) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_91_0 = (sg) ((Object) stackIn_89_0);
                    stackIn_91_1 = 1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = (sg) ((Object) stackIn_90_0);
                    stackIn_91_1 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    stackIn_91_0.field_bb = stackIn_91_1 != 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 92: {
                    if (-1 == var8) {
                        statePc = 99;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_95_0 = fk.field_p[1][var8 + 1];
                    stackIn_95_1 = -1;
                    stackIn_95_2 = id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_97_0 = (sg) ((Object) stackIn_95_0);
                    stackIn_96_0 = stackIn_97_0;
                    if (stackIn_95_1 == stackIn_95_2) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_98_0 = (sg) ((Object) stackIn_96_0);
                    stackIn_98_1 = 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = (sg) ((Object) stackIn_97_0);
                    stackIn_98_1 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_98_0.field_bb = stackIn_98_1 != 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 99: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var10 >= nl.field_a.length) {
                        statePc = 105;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    dupTemp$1 = fk.field_p[1][1 + var8];
                    stackIn_103_0 = (sg) (dupTemp$1);
                    stackIn_102_0 = stackIn_103_0;
                    stackIn_103_1 = dupTemp$1.field_bb;
                    stackIn_102_1 = stackIn_103_1;
                    if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_104_0 = (sg) ((Object) stackIn_102_0);
                    stackIn_104_1 = stackIn_102_1;
                    stackIn_104_2 = 1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = (sg) ((Object) stackIn_103_0);
                    stackIn_104_1 = stackIn_103_1;
                    stackIn_104_2 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_104_0.field_bb = stackIn_104_1 & stackIn_104_2 != 0;
                    var10++;
                    statePc = 100;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_108_0 = fk.field_p[1][var8 + 1];
                    stackIn_106_0 = stackIn_108_0;
                    if (var4_int == 0) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = (sg) ((Object) stackIn_106_0);
                    stackIn_107_0 = stackIn_108_0;
                    if (var9_int != 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_109_0 = (sg) ((Object) stackIn_107_0);
                    stackIn_109_1 = 1;
                    statePc = 109;
                    continue stateLoop;
                }
                case 108: {
                    stackIn_109_0 = (sg) ((Object) stackIn_108_0);
                    stackIn_109_1 = 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_109_0.field_s = stackIn_109_1 != 0;
                    var8++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 110: {
                    if (!param1) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_113_0 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 112: {
                    stackIn_113_0 = 1;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var7 = stackIn_113_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (3 <= var7) {
                        statePc = 142;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var29 = fk.field_p[2][var7];
                    if (var4_int == 0) {
                        statePc = 124;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var29.field_rb == 0) {
                        statePc = 124;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (!param1) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var7 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    rj.field_q = rj.field_q ^ var7;
                    statePc = 124;
                    continue stateLoop;
                }
                case 120: {
                    rj.field_q = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 121: {
                    if (var7 != param2.field_Fb) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var6 = 1;
                    param2.field_Fb = var7;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = (sg) (var29);
                    stackIn_125_0 = stackIn_126_0;
                    if (var4_int == 0) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_127_0 = (sg) ((Object) stackIn_125_0);
                    stackIn_127_1 = 1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = (sg) ((Object) stackIn_126_0);
                    stackIn_127_1 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_127_0.field_s = stackIn_127_1 != 0;
                    if (!param1) {
                        statePc = 137;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (0 == var7) {
                        statePc = 133;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = (sg) (var29);
                    stackIn_130_0 = stackIn_131_0;
                    if (0 == (var7 & rj.field_q)) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (sg) ((Object) stackIn_130_0);
                    stackIn_132_1 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (sg) ((Object) stackIn_131_0);
                    stackIn_132_1 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_132_0.field_bb = stackIn_132_1 != 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_135_0 = (sg) (var29);
                    stackIn_134_0 = stackIn_135_0;
                    if (0 != rj.field_q) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_136_0 = (sg) ((Object) stackIn_134_0);
                    stackIn_136_1 = 1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_136_0 = (sg) ((Object) stackIn_135_0);
                    stackIn_136_1 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_136_0.field_bb = stackIn_136_1 != 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 137: {
                    stackIn_139_0 = (sg) (var29);
                    stackIn_138_0 = stackIn_139_0;
                    if (0 == (var7 & param2.field_Fb)) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_140_0 = (sg) ((Object) stackIn_138_0);
                    stackIn_140_1 = 1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 139: {
                    stackIn_140_0 = (sg) ((Object) stackIn_139_0);
                    stackIn_140_1 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_140_0.field_bb = stackIn_140_1 != 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var7++;
                    statePc = 114;
                    continue stateLoop;
                }
                case 142: {
                    if (!param1) {
                        statePc = 165;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (mg.field_A <= 1) {
                        statePc = 165;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var7 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (var7 >= 1 + mg.field_A) {
                        statePc = 165;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var30 = fk.field_p[3][var7];
                    if (var4_int == 0) {
                        statePc = 150;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var30.field_rb != 0) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    qj.field_b = var7;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (!var30.field_v) {
                        statePc = 158;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (-1 > (var7 ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (null == ec.field_v) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_156_0 = ec.field_v[-1 + var7];
                    statePc = 156;
                    continue stateLoop;
                }
                case 155: {
                    stackIn_156_0 = null;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var9 = stackIn_156_0;
                    if (var9 == null) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    dn.field_k = var9;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    stackIn_160_0 = (sg) (var30);
                    stackIn_159_0 = stackIn_160_0;
                    if (var4_int == 0) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackIn_161_0 = (sg) ((Object) stackIn_159_0);
                    stackIn_161_1 = 1;
                    statePc = 161;
                    continue stateLoop;
                }
                case 160: {
                    stackIn_161_0 = (sg) ((Object) stackIn_160_0);
                    stackIn_161_1 = 0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    stackIn_161_0.field_s = stackIn_161_1 != 0;
                    stackIn_163_0 = (sg) (var30);
                    stackIn_162_0 = stackIn_163_0;
                    if (qj.field_b != var7) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_164_0 = (sg) ((Object) stackIn_162_0);
                    stackIn_164_1 = 1;
                    statePc = 164;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = (sg) ((Object) stackIn_163_0);
                    stackIn_164_1 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    stackIn_164_0.field_bb = stackIn_164_1 != 0;
                    var7++;
                    statePc = 145;
                    continue stateLoop;
                }
                case 165: {
                    var7 = 0;
                    var8 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (em.field_k <= var8) {
                        statePc = 349;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var31 = fk.field_p[var8 + 4];
                    var9_array = var31;
                    if (!param1) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_170_0 = -1;
                    statePc = 170;
                    continue stateLoop;
                }
                case 169: {
                    stackIn_170_0 = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var10 = stackIn_170_0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (-1 + var31.length <= var10) {
                        statePc = 348;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    if (var4_int == 0) {
                        statePc = 217;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 217;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (ji.field_D == null) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (null == ji.field_D[var8]) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (((vr.field_m ^ -1) & ji.field_D[var8][var10] ^ -1) < -1) {
                        statePc = 178;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var15 = 1;
                    var16 = db.a(107, ji.field_D[var8][var10] & (vr.field_m ^ -1));
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (td.field_E == null) {
                        statePc = 185;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (td.field_E[var8] != null) {
                        statePc = 182;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (0 < es.field_m) {
                        statePc = 185;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (!td.field_E[var8][var10]) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var11 = 1;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (null == ci.field_h) {
                        statePc = 196;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (null != ci.field_h[var8]) {
                        statePc = 188;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var17 = ci.field_h[var8][var10];
                    if (var17 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (hm.field_o) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((es.field_m ^ -1) >= -1) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var11 = 1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (-1 <= (var17 ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (var17 <= a.field_j) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var13 = 1;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (pg.field_A == null) {
                        statePc = 206;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (null == pg.field_A[var8]) {
                        statePc = 206;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var17 = pg.field_A[var8][var10];
                    if (-1 <= (var17 ^ -1)) {
                        statePc = 201;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var17 <= bh.field_h) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var12 = 1;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (var17 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (hm.field_o) {
                        statePc = 206;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (es.field_m <= 0) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var11 = 1;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (param1) {
                        statePc = 208;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackIn_216_0 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 208: {
                    if (nr.field_q != null) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackIn_216_0 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 210: {
                    if (null != nr.field_q[var8]) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_216_0 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 212: {
                    if (!nr.field_q[var8][var10]) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    stackIn_216_0 = 1;
                    statePc = 216;
                    continue stateLoop;
                }
                case 214: {
                    stackIn_216_0 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var14 = stackIn_216_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (bs.field_b < 2) {
                        statePc = 221;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (di.field_p[12]) {
                        statePc = 220;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var15 = 0;
                    var12 = 0;
                    var14 = 0;
                    var13 = 0;
                    var11 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var11 != 0) {
                        statePc = 227;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var12 != 0) {
                        statePc = 227;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (var13 != 0) {
                        statePc = 227;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (var14 != 0) {
                        statePc = 227;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (var15 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    stackIn_229_0 = 1;
                    statePc = 229;
                    continue stateLoop;
                }
                case 227: {
                    stackIn_229_0 = 1;
                    statePc = 229;
                    continue stateLoop;
                }
                case 228: {
                    stackIn_229_0 = 0;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var17 = stackIn_229_0;
                    wg.field_d = true;
                    if (var17 != 0) {
                        statePc = 248;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var10 < 0) {
                        statePc = 248;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (null == pe.field_D) {
                        statePc = 248;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (!param1) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (!k.field_i) {
                        statePc = 235;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 235: {
                    wg.field_d = false;
                    if (lr.field_c == null) {
                        statePc = 237;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 237: {
                    lr.field_c = new byte[em.field_k];
                    ek.field_F = new boolean[em.field_k];
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    qd.field_h = false;
                    var18_int = 0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (var18_int >= var8) {
                        statePc = 241;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    ek.field_F[var18_int] = false;
                    var18_int++;
                    statePc = 239;
                    continue stateLoop;
                }
                case 241: {
                    js.a(-1, 1, param2, var8, 0, param1, var10, -1);
                    if ((bs.field_b ^ -1) > -3) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (di.field_p[12]) {
                        statePc = 244;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 244: {
                    wg.field_d = true;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (!wg.field_d) {
                        statePc = 247;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var17 = 1;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    var18 = var9_array[var10 - -1];
                    if (var4_int == 0) {
                        statePc = 261;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (-1 != (var18.field_rb ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (param1) {
                        statePc = 256;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (var17 != 0) {
                        statePc = 261;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if ((byte)var10 != param2.field_dc[var8]) {
                        statePc = 255;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var6 = 1;
                    param2.field_dc[var8] = (byte)var10;
                    statePc = 261;
                    continue stateLoop;
                }
                case 256: {
                    if (var10 != -1) {
                        statePc = 260;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var19 = var7;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (var19 >= var31.length + (var7 - 1)) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    qj.field_f[var19 / 8] = (byte)we.a((int) qj.field_f[var19 / 8], 1 << we.a(var19, 7) ^ -1);
                    var19++;
                    statePc = 258;
                    continue stateLoop;
                }
                case 260: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)nc.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(var10 + var7, 7));
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (!param1) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (var17 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10) ^ -1);
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 325;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (var18.field_v) {
                        statePc = 267;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (wa.field_d == null) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (wa.field_d[var8] == null) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var19_ref = wa.field_d[var8][var10];
                    statePc = 272;
                    continue stateLoop;
                }
                case 270: {
                    var19_ref = null;
                    statePc = 272;
                    continue stateLoop;
                }
                case 271: {
                    var19_ref = null;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (ei.field_f == null) {
                        statePc = 276;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (ei.field_f[var8] == null) {
                        statePc = 275;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var20 = ei.field_f[var8][var10];
                    statePc = 277;
                    continue stateLoop;
                }
                case 275: {
                    var20 = null;
                    statePc = 277;
                    continue stateLoop;
                }
                case 276: {
                    var20 = null;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    var21 = null;
                    if (var20 == null) {
                        statePc = 280;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (((String) (var20)).equals(var19_ref)) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var21 = var20;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    var22 = null;
                    if (var14 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var22 = qh.field_D;
                    statePc = 301;
                    continue stateLoop;
                }
                case 282: {
                    if (var11 != 0) {
                        statePc = 300;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (var12 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var23_int = -bh.field_h + pg.field_A[var8][var10];
                    if (var23_int != 1) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var22 = ip.field_g;
                    statePc = 287;
                    continue stateLoop;
                }
                case 286: {
                    var22 = re.a(nc.field_n, 4371, new String[]{Integer.toString(var23_int)});
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (var13 == 0) {
                        statePc = 291;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var32 = re.a(dh.field_d, 4371, new String[]{Integer.toString(a.field_j), Integer.toString(ci.field_h[var8][var10])});
                    var23 = var32;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    var26_ref = var32;
                    var23 = var26_ref;
                    if (var22 == null) {
                        statePc = 290;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var22 = (String) (var22) + "<br>" + var32;
                    statePc = 291;
                    continue stateLoop;
                }
                case 290: {
                    var22 = var32;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    if (var15 == 0) {
                        statePc = 301;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var23 = ar.field_e;
                    if (0 >= var16) {
                        statePc = 297;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (null == qa.field_s) {
                        statePc = 297;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (var16 > qa.field_s.length) {
                        statePc = 297;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (qa.field_s[var16 + -1] == null) {
                        statePc = 297;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var23 = qa.field_s[-1 + var16][0];
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if (var22 != null) {
                        statePc = 299;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var22 = var23;
                    statePc = 301;
                    continue stateLoop;
                }
                case 299: {
                    var22 = (String) (var22) + "<br>" + (String) (var23);
                    statePc = 301;
                    continue stateLoop;
                }
                case 300: {
                    var22 = vd.field_r;
                    var23 = var22;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    var26 = var22;
                    var23 = var26;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    var23 = var26;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (var4_int == 0) {
                        statePc = 318;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (!wg.field_d) {
                        statePc = 304;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var23 = null;
                    var24 = 0;
                    if (qd.field_h) {
                        statePc = 306;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var23 = "</col>" + wl.field_b + "<col=A00000>";
                    var26 = var23;
                    var23 = var26;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    var25 = 0;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (var8 <= var25) {
                        statePc = 315;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (ek.field_F[var25]) {
                        statePc = 311;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var25++;
                    statePc = 308;
                    continue stateLoop;
                }
                case 311: {
                    var26_ref = "</col>" + gm.field_l[var25] + "<col=A00000>";
                    var23 = var26_ref;
                    var22 = var23;
                    var23 = var26_ref;
                    if (var23 == null) {
                        statePc = 313;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var23 = (String) (var23) + ", " + var26_ref;
                    var24 = 1;
                    statePc = 314;
                    continue stateLoop;
                }
                case 313: {
                    var23 = var26_ref;
                    var22 = var23;
                    var22 = var23;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    var25++;
                    statePc = 308;
                    continue stateLoop;
                }
                case 315: {
                    if (var24 == 0) {
                        statePc = 317;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    var22 = mp.field_d + (String) (var23);
                    statePc = 318;
                    continue stateLoop;
                }
                case 317: {
                    var22 = re.a(n.field_q, 4371, new String[]{(String) (var23)});
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (var22 != null) {
                        statePc = 320;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var22 = "<col=A00000>" + (String) (var22);
                    var33 = qr.a((String) (var22), (byte) -125, "<br><col=A00000>", "<br>");
                    if (var21 == null) {
                        statePc = 322;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var21 = (String) (var21) + "<br>" + var33;
                    statePc = 323;
                    continue stateLoop;
                }
                case 322: {
                    var21 = var33;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    if (var21 == null) {
                        statePc = 325;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    dn.field_k = (String) (var21);
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (param1) {
                        statePc = 331;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    stackIn_329_0 = (sg) (var18);
                    stackIn_327_0 = stackIn_329_0;
                    if (!wg.field_d) {
                        statePc = 329;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    stackIn_329_0 = (sg) ((Object) stackIn_327_0);
                    stackIn_328_0 = stackIn_329_0;
                    if (param2.field_dc[var8] != (byte)var10) {
                        statePc = 329;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    stackIn_330_0 = (sg) ((Object) stackIn_328_0);
                    stackIn_330_1 = 1;
                    statePc = 330;
                    continue stateLoop;
                }
                case 329: {
                    stackIn_330_0 = (sg) ((Object) stackIn_329_0);
                    stackIn_330_1 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    stackIn_330_0.field_bb = stackIn_330_1 != 0;
                    statePc = 343;
                    continue stateLoop;
                }
                case 331: {
                    if (0 != (var10 ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var18.field_bb = true;
                    var28 = var7;
                    var19 = var28;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (var28 >= -1 + (var31.length + var7)) {
                        statePc = 343;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    stackIn_336_0 = (sg) (var18);
                    stackIn_335_0 = stackIn_336_0;
                    stackIn_336_1 = var18.field_bb;
                    stackIn_335_1 = stackIn_336_1;
                    if (-1 != (qj.field_f[var28 / 8] & 1 << (var28 & 7) ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    stackIn_337_0 = (sg) ((Object) stackIn_335_0);
                    stackIn_337_1 = stackIn_335_1;
                    stackIn_337_2 = 1;
                    statePc = 337;
                    continue stateLoop;
                }
                case 336: {
                    stackIn_337_0 = (sg) ((Object) stackIn_336_0);
                    stackIn_337_1 = stackIn_336_1;
                    stackIn_337_2 = 0;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    stackIn_337_0.field_bb = stackIn_337_1 & stackIn_337_2 != 0;
                    var28++;
                    statePc = 333;
                    continue stateLoop;
                }
                case 338: {
                    stackIn_339_0 = (sg) (var18);
                    stackIn_339_1 = qj.field_f[(var7 + var10) / 8];
                    stackIn_339_2 = 1;
                    stackIn_339_3 = 7 & var10 + var7;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    stackIn_341_0 = (sg) ((Object) stackIn_339_0);
                    stackIn_340_0 = stackIn_341_0;
                    if ((stackIn_339_1 & stackIn_339_2 << stackIn_339_3) == 0) {
                        statePc = 341;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    stackIn_342_0 = (sg) ((Object) stackIn_340_0);
                    stackIn_342_1 = 1;
                    statePc = 342;
                    continue stateLoop;
                }
                case 341: {
                    stackIn_342_0 = (sg) ((Object) stackIn_341_0);
                    stackIn_342_1 = 0;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    stackIn_342_0.field_bb = stackIn_342_1 != 0;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    stackIn_346_0 = (sg) (var18);
                    stackIn_344_0 = stackIn_346_0;
                    if (var4_int == 0) {
                        statePc = 346;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    stackIn_346_0 = (sg) ((Object) stackIn_344_0);
                    stackIn_345_0 = stackIn_346_0;
                    if (var17 != 0) {
                        statePc = 346;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    stackIn_347_0 = (sg) ((Object) stackIn_345_0);
                    stackIn_347_1 = 1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 346: {
                    stackIn_347_0 = (sg) ((Object) stackIn_346_0);
                    stackIn_347_1 = 0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    stackIn_347_0.field_s = stackIn_347_1 != 0;
                    var10++;
                    statePc = 171;
                    continue stateLoop;
                }
                case 348: {
                    var7 = var7 + (ks.field_e[var8] & 255);
                    var8++;
                    statePc = 166;
                    continue stateLoop;
                }
                case 349: {
                    if (var6 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (!param1) {
                        statePc = 352;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 352: {
                    ti.a(param3, 0);
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int[] b(int param0) {
        int var2 = 10 % ((param0 - -48) / 61);
        return new int[]{14, 16};
    }

    sc(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 4);
        this.field_r = null;
        this.field_t = null;
    }

    final void e(byte param0) {
        Object var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        ln[] var7;
        qm var7_ref;
        int var8;
        ln var9;
        int var10;
        int var11;
        int var12;
        ln var13;
        ln[] var14;
        ln var15;
        ln var16;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 101) {
            break L0;
          } else {
            this.field_r = (ln) null;
            break L0;
          }
        }
        var2 = null;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_o) {
            if (var2 == null) {
              return;
            } else {
              var4 = ((ln) (var2)).field_p;
              var5 = null;
              var6 = 2147483647;
              var14 = this.field_t;
              var7 = var14;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var14.length) {
                  L3: {
                    if (var5 == null) {
                      var7 = this.field_t;
                      var8 = 0;
                      L4: while (true) {
                        if (var8 >= var7.length) {
                          break L3;
                        } else {
                          var16 = var7[var8];
                          var5 = var16;
                          var5 = var16;
                          var9 = var16;
                          var10 = var16.field_p;
                          if (null != this.field_r) {
                            if (this.field_r.field_R != var9.field_R) {
                              if ((this.field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                                var11 = hs.field_i[var10];
                                if (var6 > var11) {
                                  var5 = var9;
                                  var6 = var11;
                                  var8++;
                                  continue L4;
                                } else {
                                  var8++;
                                  continue L4;
                                }
                              } else {
                                var8++;
                                continue L4;
                              }
                            } else {
                              var8++;
                              continue L4;
                            }
                          } else {
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (null != var5) {
                      var7_ref = new qm(3, this.field_n, (ln) (var2), (ln) (var5));
                      lh.field_G.a((byte) -113, var7_ref);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  L6: {
                    var15 = var14[var8];
                    var5 = var15;
                    var5 = var15;
                    var9 = var15;
                    var10 = var15.field_p;
                    if (this.field_r == null) {
                      break L6;
                    } else {
                      if (this.field_r.field_R == var15.field_R) {
                        break L6;
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  if ((this.field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                    var11 = hs.field_i[var10];
                    if (var11 < var6) {
                      var5 = var15;
                      var6 = var11;
                      var8++;
                      continue L2;
                    } else {
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = this.field_g.field_g.field_e[var4];
            var2 = var13;
            var15 = var13;
            var9 = var15;
            var5 = var9;
            if (var13.field_y == this.field_n) {
              L7: {
                var6 = oe.field_i[var4];
                if (!var13.field_u) {
                  break L7;
                } else {
                  var6 = var6 * 2 - -5;
                  break L7;
                }
              }
              if (var6 > var3) {
                var2 = var13;
                var3 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object var2;
        int var3;
        int var4_int;
        qm var4;
        int var5;
        ln var6;
        int var7;
        int var8;
        int var9;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_o) {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a((byte) 23);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = new qm(2, this.field_n, (ln) (var2));
                lh.field_G.a((byte) -113, var4);
                break L2;
              }
            }
            return;
          } else {
            var5 = hs.field_i[var4_int];
            if ((var5 ^ -1) != -1) {
              L3: {
                var6 = this.field_g.field_g.field_e[var4_int];
                var2 = var6;
                var2 = var6;
                stackIn_6_0 = var6.field_x ^ -1;

                if (!var6.field_u) {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 10;
                  break L3;
                } else {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 5;
                  break L3;
                }
              }
              if (stackIn_7_0 <= (stackIn_7_1 ^ -1)) {
                L4: {
                  if (null == var6.field_y) {
                    if (-1 != (var6.field_L ^ -1)) {
                      break L4;
                    } else {
                      var4_int++;
                      continue L0;
                    }
                  } else {
                    var7 = this.field_g.field_D[var6.field_y.field_x];
                    var8 = this.field_g.field_D[this.field_n.field_x];
                    if (var7 <= var6.field_x * 4) {
                      break L4;
                    } else {
                      if (var8 <= 2 * var6.field_x) {
                        break L4;
                      } else {
                        var4_int++;
                        continue L0;
                      }
                    }
                  }
                }
                var7 = cb.field_o[var4_int];
                var8 = var5 * (var7 * var7);
                if (var3 < var8) {
                  var2 = var6;
                  var3 = var8;
                  var4_int++;
                  continue L0;
                } else {
                  var4_int++;
                  continue L0;
                }
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, sd param1, byte param2) {
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            this.field_r = null;
            this.field_s = 2147483647;
            var4 = param1.j(18229);
            while (var4 != null) {
                var5 = var4.field_p;
                var6 = this.field_t;
                for (var7 = 0; var6.length > var7; var7++) {
                    var8 = var6[var7];
                    var9 = this.field_g.field_g.field_c[var5][var8.field_p];
                    if ((var9 ^ -1) > (this.field_s ^ -1)) {
                        this.field_s = var9;
                        this.field_r = var8;
                    }
                }
                var4 = param1.h(-23410);
            }
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "sc.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_q = false;
        field_p = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
