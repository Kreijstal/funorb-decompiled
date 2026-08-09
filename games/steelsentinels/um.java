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

    final static mg a(gh param0, gh param1, gh param2, int[] param3, int param4) {
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        mg[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ao var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_9_0 = null;
        mg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new mg[var5_int];
            var9 = 49;
            try {
              L1: {
                L2: {
                  if (param4 <= -63) {
                    break L2;
                  } else {
                    field_db = (String) null;
                    break L2;
                  }
                }
                var10_int = 0;
                L3: while (true) {
                  if (var10_int >= var5_int) {
                    break L1;
                  } else {
                    var11 = jl.field_w.a(param3[var10_int], -76);
                    var6[var10_int] = var11.i(1);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L3;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_9_0 = null;
              return (mg) ((Object) stackIn_9_0);
            }
            stackIn_11_0 = new mg(0L, param1, param2, param0, var8, param3, var6, var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("um.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ',' + param4 + ')');
        }
        return stackIn_11_0;
    }

    final static void f(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = uc.field_b.length - -7;
            var17 = ue.field_c;
            var13 = var17;
            var2 = var13;
            var15 = var2;
            var11 = var15;
            var9 = var11;
            var3 = var9;
            var4 = 0;
            L1: while (true) {
              if (var15.length <= var4) {
                L2: {
                  var10 = new byte[var1_int];
                  var18 = var10;
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
                incrementValue$0 = var4;
                var4++;
                var10[incrementValue$0] = (byte)param0;
                incrementValue$1 = var4;
                var4++;
                var10[incrementValue$1] = (byte)var5;
                incrementValue$2 = var4;
                var4++;
                var10[incrementValue$2] = (byte)dm.field_a;
                incrementValue$3 = var4;
                var4++;
                var10[incrementValue$3] = (byte)uc.field_b.length;
                var6 = 0;
                L8: while (true) {
                  if (var6 >= uc.field_b.length) {
                    var6 = 0;
                    L9: while (true) {
                      if (var17.length <= var6) {
                        L10: {
                          if (ni.b(35)) {
                            break L10;
                          } else {
                            vb.a(6, var18, (byte) -30);
                            break L10;
                          }
                        }
                        break L0;
                      } else {
                        L11: {
                          if (var17[var6] != null) {
                            incrementValue$4 = var4;
                            var4++;
                            var3_array[incrementValue$4] = (byte)var17[var6].length;
                            var7 = 0;
                            L12: while (true) {
                              if (var7 >= var17[var6].length) {
                                break L11;
                              } else {
                                incrementValue$5 = var4;
                                var4++;
                                var3_array[incrementValue$5] = (byte)var17[var6][var7];
                                var7++;
                                continue L12;
                              }
                            }
                          } else {
                            incrementValue$6 = var4;
                            var4++;
                            var3_array[incrementValue$6] = (byte) 0;
                            break L11;
                          }
                        }
                        var6++;
                        continue L9;
                      }
                    }
                  } else {
                    incrementValue$7 = var4;
                    var4++;
                    var10[incrementValue$7] = (byte)uc.field_b[var6];
                    var6++;
                    continue L8;
                  }
                }
              } else {
                L13: {
                  var16 = var15[var4];
                  var12 = var16;
                  var5_ref_int__ = var12;
                  if (var5_ref_int__ != null) {
                    var1_int = var1_int + var16.length;
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
          throw ci.a((Throwable) ((Object) var1), "um.B(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -30) {
            return 107;
        }
        if (param0 < 0 || this.field_V.a(false) <= param0) {
            return -1;
        }
        return this.field_V.c(46, param0);
    }

    final int h(int param0) {
        if (param0 != 24129) {
            return 98;
        }
        return this.field_V.a(false);
    }

    final int g(byte param0) {
        int var2 = 84 % ((-44 - param0) / 49);
        return this.field_Z;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_Y + (param3 + -param2);
                var9 = this.field_x + -(2 * this.field_Y);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 < (var8_int ^ -1)) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_Z * var8_int / var9;
                if ((param6 ^ -1) != -2) {
                  if (-3 == (param6 ^ -1)) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_V.a(false) <= var12) {
                        if ((var11 ^ -1) <= -1) {
                          this.field_V.d(-98, var11);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_V.c(50, var12);
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
                  this.field_V.a(var8_int, (byte) 22);
                  break L3;
                }
              }
              stackIn_24_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var8);

            stackIn_27_1 = new StringBuilder().append("um.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_24_0 != 0;
    }

    public static void g(int param0) {
        field_bb = null;
        field_cb = null;
        if (param0 != 32) {
            field_db = (String) null;
        }
        field_db = null;
    }

    private um() throws Throwable {
        throw new Error();
    }

    static {
        field_bb = new int[16384];
        field_db = "<%0> cannot join; the game has started.";
        field_cb = new String[]{"Moving and shooting", "Rocket combat", "Slave field test", "Thrust and energy", "Laser field test", "Targeting", "Aquila field test", "Ballistic weapons", "Ballistic field test", "Flak", "First Strike", "In Cold Blood", "Cracked Shell", "The Long Crawl", "Blue Fire", "Flashing Blade", "Crisis", "Eagle's Talon", "Hold the Line", "Firestorm", "Opening Skirmish", "The Aviary", "Laser Nest", "Venomous Reprisal", "Sting of Defeat", "Ground Zero", "Lunar Sea", "Nowhere to Run", "End of the Road", "Our Darkest Hour"};
    }
}
