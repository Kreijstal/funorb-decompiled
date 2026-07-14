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
        int var5 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = SteelSentinels.field_G;
                    var5 = param3.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new mg[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 <= -63) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_db = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var10_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10_int >= var5) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = jl.field_w.a(param3[var10_int], -76);
                        var6[var10_int] = var11.i(1);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new mg(0L, param1, param2, param0, var8, param3, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void f(byte param0) {
        int var1 = 0;
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
        var8 = SteelSentinels.field_G;
        var1 = uc.field_b.length - -7;
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
        L0: while (true) {
          if (var23.length <= var4) {
            L1: {
              var10 = new byte[var1];
              var26 = var10;
              var22 = var26;
              var18 = var22;
              var14 = var18;
              var3_array = var14;
              var4 = 0;
              var5 = 0;
              if (!si.field_p) {
                break L1;
              } else {
                var5 = (byte)(var5 | 1);
                break L1;
              }
            }
            L2: {
              if (!ka.field_V) {
                break L2;
              } else {
                var5 = (byte)(var5 | 2);
                break L2;
              }
            }
            L3: {
              if (dm.field_c) {
                var5 = (byte)(var5 | 4);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!ui.field_G) {
                break L4;
              } else {
                var5 = (byte)(var5 | 8);
                break L4;
              }
            }
            L5: {
              if (!ik.field_h) {
                break L5;
              } else {
                var5 = (byte)(var5 | 16);
                break L5;
              }
            }
            L6: {
              if (!tj.field_a) {
                break L6;
              } else {
                var5 = (byte)(var5 | 32);
                break L6;
              }
            }
            var4++;
            var10[var4] = (byte)param0;
            var4++;
            var10[var4] = (byte)var5;
            var4++;
            var10[var4] = (byte)dm.field_a;
            var4++;
            var10[var4] = (byte)uc.field_b.length;
            var6 = 0;
            L7: while (true) {
              if (var6 >= uc.field_b.length) {
                var6 = 0;
                L8: while (true) {
                  if (var25.length <= var6) {
                    L9: {
                      if (ni.b(35)) {
                        break L9;
                      } else {
                        rh discarded$1 = vb.a(6, var26, (byte) -30);
                        break L9;
                      }
                    }
                    return;
                  } else {
                    if (var25[var6] != null) {
                      var4++;
                      var3_array[var4] = (byte)var25[var6].length;
                      var7 = 0;
                      L10: while (true) {
                        if (var7 < var25[var6].length) {
                          var4++;
                          var3_array[var4] = (byte)var25[var6][var7];
                          var7++;
                          continue L10;
                        } else {
                          var6++;
                          continue L8;
                        }
                      }
                    } else {
                      var4++;
                      var3_array[var4] = (byte) 0;
                      var6++;
                      continue L8;
                    }
                  }
                }
              } else {
                var4++;
                var10[var4] = (byte)uc.field_b[var6];
                var6++;
                continue L7;
              }
            }
          } else {
            var24 = var23[var4];
            var20 = var24;
            var16 = var20;
            var12 = var16;
            var5_ref_int__ = var12;
            if (var5_ref_int__ != null) {
              var1 = var1 + var24.length;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = SteelSentinels.field_G;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((um) this).field_Y + (param3 + -param2);
            var9 = ((um) this).field_x + -(2 * ((um) this).field_Y);
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = ((um) this).field_Z * var8 / var9;
            if (param6 != -2) {
              if (-3 == param6) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (((um) this).field_V.a(false) <= var12) {
                    if ((var11 ^ -1) <= -1) {
                      ((um) this).field_V.d(-98, var11);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = -var8 + ((um) this).field_V.c(50, var12);
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              ((um) this).field_V.a(var8, (byte) 22);
              break L2;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    public static void g(int param0) {
        field_bb = null;
        field_cb = null;
        if (param0 != 32) {
            field_db = null;
        }
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
