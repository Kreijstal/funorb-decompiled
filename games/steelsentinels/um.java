/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends oa {
    private g field_V;
    static String field_db;
    static int field_W;
    static int[] field_bb;
    int field_Y;
    static int field_X;
    private int field_Z;
    static String[] field_cb;
    int field_ab;

    final static mg a(gh param0, gh param1, gh param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        mg[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        ao var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        Object stackIn_7_0 = null;
        mg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        mg stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var16 = new char[var5_int];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            var8 = new mg[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= var5_int) {
                    break L1;
                  } else {
                    var11 = jl.field_w.a(param3[var10_int], -76);
                    var6[var10_int] = var11.i(1);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (mg) (Object) stackIn_7_0;
            }
            stackOut_8_0 = new mg(0L, param1, param2, param0, var8, param3, var6, var16);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("um.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -90 + ')');
        }
        return stackIn_9_0;
    }

    final static void f() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[][] var2 = null;
        int[][] var3 = null;
        byte[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        byte[] var10 = null;
        int[][] var11 = null;
        int[] var12 = null;
        int[][] var13 = null;
        byte[] var14 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[][] var17 = null;
        byte[] var18 = null;
        int[][] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        byte[] var22 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[][] var25 = null;
        byte[] var26 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = uc.field_b.length - -7;
            var25 = ue.field_c;
            var21 = var25;
            var17 = var21;
            var13 = var17;
            var2 = var13;
            var23 = var2;
            var19 = var23;
            var15 = var19;
            var11 = var15;
            var9 = var11;
            var3 = var9;
            var4 = 0;
            L1: while (true) {
              if (var23.length <= var4) {
                L2: {
                  var10 = new byte[var1_int];
                  var26 = var10;
                  var22 = var26;
                  var18 = var22;
                  var14 = var18;
                  var3_array = var14;
                  var4 = 0;
                  var5 = 0;
                  if (!si.field_p) {
                    break L2;
                  } else {
                    var5 = (byte)(var5 | 1);
                    break L2;
                  }
                }
                L3: {
                  if (!ka.field_V) {
                    break L3;
                  } else {
                    var5 = (byte)(var5 | 2);
                    break L3;
                  }
                }
                L4: {
                  if (dm.field_c) {
                    var5 = (byte)(var5 | 4);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!ui.field_G) {
                    break L5;
                  } else {
                    var5 = (byte)(var5 | 8);
                    break L5;
                  }
                }
                L6: {
                  if (!ik.field_h) {
                    break L6;
                  } else {
                    var5 = (byte)(var5 | 16);
                    break L6;
                  }
                }
                L7: {
                  if (!tj.field_a) {
                    break L7;
                  } else {
                    var5 = (byte)(var5 | 32);
                    break L7;
                  }
                }
                int incrementValue$9 = var4;
                var4++;
                var10[incrementValue$9] = (byte) 3;
                int incrementValue$10 = var4;
                var4++;
                var10[incrementValue$10] = (byte)var5;
                int incrementValue$11 = var4;
                var4++;
                var10[incrementValue$11] = (byte)dm.field_a;
                int incrementValue$12 = var4;
                var4++;
                var10[incrementValue$12] = (byte)uc.field_b.length;
                var6 = 0;
                L8: while (true) {
                  if (var6 >= uc.field_b.length) {
                    var6 = 0;
                    L9: while (true) {
                      if (var25.length <= var6) {
                        L10: {
                          if (ni.b(35)) {
                            break L10;
                          } else {
                            rh discarded$13 = vb.a(6, var26, (byte) -30);
                            break L10;
                          }
                        }
                        break L0;
                      } else {
                        L11: {
                          if (var25[var6] != null) {
                            int incrementValue$14 = var4;
                            var4++;
                            var3_array[incrementValue$14] = (byte)var25[var6].length;
                            var7 = 0;
                            L12: while (true) {
                              if (var7 >= var25[var6].length) {
                                break L11;
                              } else {
                                int incrementValue$15 = var4;
                                var4++;
                                var3_array[incrementValue$15] = (byte)var25[var6][var7];
                                var7++;
                                continue L12;
                              }
                            }
                          } else {
                            int incrementValue$16 = var4;
                            var4++;
                            var3_array[incrementValue$16] = (byte) 0;
                            break L11;
                          }
                        }
                        var6++;
                        continue L9;
                      }
                    }
                  } else {
                    int incrementValue$17 = var4;
                    var4++;
                    var10[incrementValue$17] = (byte)uc.field_b[var6];
                    var6++;
                    continue L8;
                  }
                }
              } else {
                L13: {
                  var24 = var23[var4];
                  var20 = var24;
                  var16 = var20;
                  var12 = var16;
                  var5_ref_int__ = var12;
                  if (var5_ref_int__ != null) {
                    var1_int = var1_int + var24.length;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "um.B(" + 3 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 <= -30) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((um) this).field_V.a(false) > param0) {
                return ((um) this).field_V.c(46, param0);
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return 107;
        }
    }

    final int h(int param0) {
        if (param0 != 24129) {
            return 98;
        }
        return ((um) this).field_V.a(false);
    }

    final int g(byte param0) {
        int var2 = 84 % ((-44 - param0) / 49);
        return ((um) this).field_Z;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((um) this).field_Y + (param3 + -param2);
                var9 = ((um) this).field_x + -(2 * ((um) this).field_Y);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = ((um) this).field_Z * var8_int / var9;
                if (param6 != 1) {
                  if (param6 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (~((um) this).field_V.a(false) >= ~var12) {
                        if (var11 >= 0) {
                          ((um) this).field_V.d(-98, var11);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + ((um) this).field_V.c(50, var12);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((um) this).field_V.a(var8_int, (byte) 22);
                  break L3;
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("um.I(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_23_0 != 0;
    }

    public static void g() {
        field_bb = null;
        field_cb = null;
        field_db = null;
    }

    private um() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new int[16384];
        field_db = "<%0> cannot join; the game has started.";
        field_cb = new String[]{"Moving and shooting", "Rocket combat", "Slave field test", "Thrust and energy", "Laser field test", "Targeting", "Aquila field test", "Ballistic weapons", "Ballistic field test", "Flak", "First Strike", "In Cold Blood", "Cracked Shell", "The Long Crawl", "Blue Fire", "Flashing Blade", "Crisis", "Eagle's Talon", "Hold the Line", "Firestorm", "Opening Skirmish", "The Aviary", "Laser Nest", "Venomous Reprisal", "Sting of Defeat", "Ground Zero", "Lunar Sea", "Nowhere to Run", "End of the Road", "Our Darkest Hour"};
    }
}
