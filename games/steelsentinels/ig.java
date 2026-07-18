/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    private long[] field_h;
    private long[] field_k;
    private byte[] field_a;
    private long[] field_c;
    private long[] field_f;
    private byte[] field_b;
    private int field_i;
    private int field_l;
    static int field_e;
    private long[] field_j;
    static gh field_m;
    static fm field_n;
    static wk[][] field_o;
    static String field_d;
    static String[] field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        RuntimeException var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        RuntimeException decompiledCaughtException = null;
        var28 = SteelSentinels.field_G;
        try {
          L0: {
            var15_int = (param2 << 4) - param8;
            var16 = param14;
            var17 = param13;
            var18 = param7;
            var19 = param4;
            L1: while (true) {
              L2: {
                if (~var19 <= ~param10) {
                  break L2;
                } else {
                  if (var17 >= param9) {
                    break L2;
                  } else {
                    L3: {
                      var20 = (var19 << 4) + -param11;
                      var21 = (var17 << param1) / param3;
                      var22 = param5 * ff.field_kb[var21] >> 15;
                      var23 = var19 - -(131072 + var20 * var22 >> 18);
                      if (639 >= var23) {
                        break L3;
                      } else {
                        var23 = 639;
                        break L3;
                      }
                    }
                    L4: {
                      var24 = (131072 + var22 * var15_int >> 18) + param2;
                      if (var24 <= 479) {
                        break L4;
                      } else {
                        var24 = 479;
                        break L4;
                      }
                    }
                    var25 = pb.field_g[var24 * 640 + var23];
                    var26 = 64 - -(ff.field_ib[var21] * param5 >> 17);
                    if (var26 < 0) {
                      throw new Error();
                    } else {
                      var27 = var26 * (16711935 & var25);
                      var26 = var26 * (var25 & 65280);
                      var25 = (var26 & 4177920) + (var27 & 1069563840);
                      var27 = (12582912 & var26) + (-1073692672 & var27);
                      var27 = (var27 | var27 >>> 1) & 1077952512;
                      var17 = var17 + var18;
                      int incrementValue$1 = var16;
                      var16++;
                      pb.field_g[incrementValue$1] = vn.a(var27 - (var27 >>> 8), var25) >>> 6;
                      var18 = var18 + param12;
                      var19++;
                      continue L1;
                    }
                  }
                }
              }
              var16 = param14;
              var18 = param7;
              var17 = param13;
              var19 = param4 - 1;
              L5: while (true) {
                L6: {
                  if (~param6 < ~var19) {
                    break L6;
                  } else {
                    var18 = var18 - param12;
                    var17 = var17 - var18;
                    if (var17 < param9) {
                      L7: {
                        var20 = (var19 << 4) + -param11;
                        var21 = (var17 << param1) / param3;
                        var22 = param5 * ff.field_kb[var21] >> 15;
                        var23 = var19 - -(var22 * var20 + 131072 >> 18);
                        if (var23 < 0) {
                          var23 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        var24 = param2 - -(var22 * var15_int + 131072 >> 18);
                        if (var24 > 479) {
                          var24 = 479;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        var25 = pb.field_g[var24 * 640 - -var23];
                        var26 = 64 + (ff.field_ib[var21] * param5 >> 17);
                        if (var26 >= 0) {
                          break L9;
                        } else {
                          var26 = -var26;
                          break L9;
                        }
                      }
                      var27 = var26 * (var25 & 16711935);
                      var26 = var26 * (65280 & var25);
                      var25 = (var26 & 4177920) + (var27 & 1069563840);
                      var27 = (12582912 & var26) + (var27 & -1073692672);
                      var27 = 1077952512 & (var27 | var27 >>> 1);
                      var16--;
                      pb.field_g[var16] = vn.a(var25, -(var27 >>> 8) + var27) >>> 6;
                      var19--;
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L10: {
                  if (param0 == -88) {
                    break L10;
                  } else {
                    ig.a((byte) 48, -77, 97, -52, -41, 76, -64, -64, -109, 22, -123, 42, 66, -96, -39);
                    break L10;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var15, "ig.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = SteelSentinels.field_G;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((ig) this).field_f[var2] = el.a(((ig) this).field_f[var2], el.a(((ig) this).field_c[var2], ((ig) this).field_k[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((ig) this).field_h[0] = el.a(((ig) this).field_h[0], tm.field_e[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ig) this).field_c[var3] = ((ig) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((ig) this).field_j[var3] = ((ig) this).field_h[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((ig) this).field_j[var3] = el.a(((ig) this).field_j[var3], tm.field_i[var7][ec.a((int)(((ig) this).field_c[ec.a(7, -var7 + var3)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ig) this).field_h[var3] = ((ig) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((ig) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((ig) this).field_j[var3] = el.a(((ig) this).field_j[var3], tm.field_i[var4][ec.a((int)(((ig) this).field_h[ec.a(7, -var4 + var3)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((ig) this).field_h[var2] = ((ig) this).field_f[var2];
                ((ig) this).field_c[var2] = el.a(((ig) this).field_k[var2], ((ig) this).field_f[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ig) this).field_k[var2] = el.a(el.a(el.a(el.a(td.a(255L, (long)((ig) this).field_b[var3 - -4]) << 24, el.a(td.a((long)((ig) this).field_b[var3 + 3] << 32, 1095216660480L), el.a(el.a(td.a(255L, (long)((ig) this).field_b[var3 - -1]) << 48, (long)((ig) this).field_b[var3] << 56), td.a((long)((ig) this).field_b[2 + var3], 255L) << 40))), td.a((long)((ig) this).field_b[var3 + 5], 255L) << 16), td.a((long)((ig) this).field_b[var3 - -6] << 8, 65280L)), td.a((long)((ig) this).field_b[var3 - -7], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a() {
        field_g = null;
        field_d = null;
        field_o = null;
        field_m = null;
        field_n = null;
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 - (7 & (int)param1) & 7;
            var7 = 7 & ((ig) this).field_i;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                var13 = -108 % ((30 - param0) / 43);
                L2: while (true) {
                  if (param1 <= 8L) {
                    L3: {
                      if (0L < param1) {
                        var8 = param2[var5_int] << var6 & 255;
                        ((ig) this).field_b[((ig) this).field_l] = (byte)vn.a((int) ((ig) this).field_b[((ig) this).field_l], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (8L <= (long)var7 + param1) {
                        L5: {
                          ((ig) this).field_l = ((ig) this).field_l + 1;
                          param1 = param1 - (long)(8 - var7);
                          ((ig) this).field_i = ((ig) this).field_i + (8 - var7);
                          if (512 == ((ig) this).field_i) {
                            this.a(false);
                            ((ig) this).field_i = 0;
                            ((ig) this).field_l = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((ig) this).field_b[((ig) this).field_l] = (byte)ec.a(255, var8 << 8 + -var7);
                        ((ig) this).field_i = ((ig) this).field_i + (int)param1;
                        break L4;
                      } else {
                        ((ig) this).field_i = (int)((long)((ig) this).field_i + param1);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int - -1]) >>> -var6 + 8;
                      if (0 > var8) {
                        break L6;
                      } else {
                        if (var8 >= 256) {
                          break L6;
                        } else {
                          L7: {
                            ((ig) this).field_b[((ig) this).field_l] = (byte)vn.a((int) ((ig) this).field_b[((ig) this).field_l], var8 >>> var7);
                            ((ig) this).field_i = ((ig) this).field_i + (8 - var7);
                            ((ig) this).field_l = ((ig) this).field_l + 1;
                            if (((ig) this).field_i != 512) {
                              break L7;
                            } else {
                              this.a(false);
                              ((ig) this).field_l = 0;
                              ((ig) this).field_i = 0;
                              break L7;
                            }
                          }
                          ((ig) this).field_b[((ig) this).field_l] = (byte)ec.a(var8 << -var7 + 8, 255);
                          ((ig) this).field_i = ((ig) this).field_i + var7;
                          param1 = param1 - 8L;
                          var5_int++;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & ((ig) this).field_a[var11]) + (255 & (int)var9));
                ((ig) this).field_a[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ig.F(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(int param0) {
        int var3 = SteelSentinels.field_G;
        int var2 = 0;
        if (param0 != -635160440) {
            field_o = null;
        }
        while (var2 < 32) {
            ((ig) this).field_a[var2] = (byte) 0;
            var2++;
        }
        ((ig) this).field_l = 0;
        ((ig) this).field_b[0] = (byte) 0;
        ((ig) this).field_i = 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((ig) this).field_f[var2] = 0L;
        }
    }

    final void a(byte[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((ig) this).field_k = null;
                break L1;
              }
            }
            L2: {
              ((ig) this).field_b[((ig) this).field_l] = (byte)vn.a((int) ((ig) this).field_b[((ig) this).field_l], 128 >>> ec.a(((ig) this).field_i, 7));
              ((ig) this).field_l = ((ig) this).field_l + 1;
              if (((ig) this).field_l <= 32) {
                break L2;
              } else {
                L3: while (true) {
                  if (((ig) this).field_l >= 64) {
                    this.a(false);
                    ((ig) this).field_l = 0;
                    break L2;
                  } else {
                    int fieldTemp$2 = ((ig) this).field_l;
                    ((ig) this).field_l = ((ig) this).field_l + 1;
                    ((ig) this).field_b[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              }
            }
            L4: while (true) {
              if (32 <= ((ig) this).field_l) {
                ii.a(((ig) this).field_a, 0, ((ig) this).field_b, 32, 32);
                this.a(false);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((ig) this).field_f[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param0[4 + var5] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[var5 + 6] = (byte)(int)(var6 >>> 8);
                    param0[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((ig) this).field_l;
                ((ig) this).field_l = ((ig) this).field_l + 1;
                ((ig) this).field_b[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ig.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ig() {
        ((ig) this).field_h = new long[8];
        ((ig) this).field_a = new byte[32];
        ((ig) this).field_k = new long[8];
        ((ig) this).field_c = new long[8];
        ((ig) this).field_f = new long[8];
        ((ig) this).field_b = new byte[64];
        ((ig) this).field_l = 0;
        ((ig) this).field_j = new long[8];
        ((ig) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new fm(2, 4, 4, 0);
        field_d = "Cancel rematch";
        field_g = new String[]{"The Golem-class sentinel entered the war in the early stages to replace conventional armour. Even to this day it remains a strong weapons platform for supporting the larger chassis.", "Slave-class sentinels specialise in closing in and destroying targets at close range. They are fitted with powerful legs, capable of leaping onto buildings for added tactical movement in a combat situation.", "When speed and accuracy are required, the Aquila-class scout sentinel is the robot for the job. The default design is fitted with a targeting system for perfect accuracy with its lasers, and also anti-air support from its missile systems.", "Long-range fire support is granted through the Turtle-class sentinel. Fitted with multiple heavy rockets and an ordnance weapon point on its back, a constant barrage of destruction can be created while you slowly advance.", "Commando-class sentinels provide a powerful mix of EMP rockets, a long range sniper cannon and close-range support with plasma and thunder blade.", "The Hurricane-class sentinel was designed as an aerial missile platform. It leaps into the air to launch its payload while utilising its rail guns for long range sniping.", "The high-speed Scorpion-class chassis destroys targets at close range with its top-mounted ultra gun, while keeping air defences enabled with targeted laser beams.", "As the war progressed, earlier sentinels were replaced with the heavier Crusher-class. Featuring a back-mounted ordnance slot, stormhammer, thrusters and a range of weapon points, this sentinel provided well-supported power for any situation.", "The colossal Bertha-class sentinel was one of the first chassis designs to be used in the war. Low-tech, but massive in design, it relies on outlasting its opponents and dealing massive damage at long range with its heavy rocket systems.", "Only just entering operation, the Orbital-class sentinel was designed to be a space-borne weapons platform. At the last moment, however, it was converted for atmospheric use, with the addition of extra heavy guns for missile defence.", "As the most advanced sentinel within the war, the Valhalla-class design is feared by commanders throughout the systems. It contains state-of-the-art energy weapons to deal with all manner of situations, as well as the devastating fusion blade for close-range decapitation.", "The first and last Babel-class sentinel started the war. The Babel landed on Ilolian Prime, and proceeded to destroy the whole planetary defence force over weeks of fighting. Commanders throughout the systems knew at this point that the old wars had ended, and the age of the sentinel had begun."};
    }
}
