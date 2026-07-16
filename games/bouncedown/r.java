/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r implements fc {
    static int[] field_c;
    private tj field_b;
    private int field_e;
    static String field_d;
    private int field_a;

    final static int a(tj param0, String[] param1, String param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Bounce.field_N;
        var5 = param0.b(param2);
        if (param4 >= var5) {
          if (param2.indexOf("<br>") == -1) {
            param1[0] = (String) (Object) param1;
            return 1;
          } else {
            var6 = (var5 - (-param4 + param3)) / param4;
            param4 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L0: while (true) {
              if (var8 <= var9) {
                L1: {
                  if (var7 >= var8) {
                    break L1;
                  } else {
                    int incrementValue$6 = var6;
                    var6++;
                    param1[incrementValue$6] = param2.substring(var7, var8).trim();
                    break L1;
                  }
                }
                return var6;
              } else {
                L2: {
                  L3: {
                    var10 = param2.charAt(var9);
                    if (var10 == 32) {
                      break L3;
                    } else {
                      if (var10 != 45) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var11 = param2.substring(var7, 1 + var9).trim();
                  var12 = param0.b(var11);
                  if (param4 <= var12) {
                    var7 = 1 + var9;
                    int incrementValue$7 = var6;
                    var6++;
                    param1[incrementValue$7] = var11;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var10 == 62) {
                  if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                    int incrementValue$8 = var6;
                    var6++;
                    param1[incrementValue$8] = param2.substring(var7, -3 + var9).trim();
                    var7 = 1 + var9;
                    var9++;
                    continue L0;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
          }
        } else {
          var6 = (var5 - (-param4 + param3)) / param4;
          param4 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param2.length();
          var9 = 0;
          L4: while (true) {
            if (var8 <= var9) {
              L5: {
                if (var7 >= var8) {
                  break L5;
                } else {
                  int incrementValue$9 = var6;
                  var6++;
                  param1[incrementValue$9] = param2.substring(var7, var8).trim();
                  break L5;
                }
              }
              return var6;
            } else {
              L6: {
                L7: {
                  var10 = param2.charAt(var9);
                  if (var10 == 32) {
                    break L7;
                  } else {
                    if (var10 != 45) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var11 = param2.substring(var7, 1 + var9).trim();
                var12 = param0.b(var11);
                if (param4 <= var12) {
                  var7 = 1 + var9;
                  int incrementValue$10 = var6;
                  var6++;
                  param1[incrementValue$10] = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var10 == 62) {
                if (param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                  int incrementValue$11 = var6;
                  var6++;
                  param1[incrementValue$11] = param2.substring(var7, -3 + var9).trim();
                  var7 = 1 + var9;
                  var9++;
                  continue L4;
                } else {
                  var9++;
                  continue L4;
                }
              } else {
                var9++;
                continue L4;
              }
            }
          }
        }
    }

    final static rg a(int param0, boolean param1) {
        rg var2 = null;
        rg stackIn_2_0 = null;
        rg stackIn_3_0 = null;
        rg stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        rg stackOut_1_0 = null;
        rg stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        rg stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = new rg(true);
        if (param0 != 5579) {
          return null;
        } else {
          L0: {
            stackOut_1_0 = (rg) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (rg) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (rg) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          stackIn_4_0.field_a = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != 51) {
            field_d = null;
        }
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Bounce.field_N;
        var6 = -49 / ((-60 - param2) / 56);
        if (!param1.field_g) {
          if (!param1.e(1)) {
            var7 = 2188450;
            int discarded$3 = ((r) this).field_b.a("<u=" + Integer.toString(var7, 16) + ">" + param1.field_h + "</u>", param4 - -param1.field_r, param1.field_i + param0, param1.field_k, param1.field_m, var7, -1, ((r) this).field_a, ((r) this).field_e, ((r) this).field_b.field_s - -((r) this).field_b.field_x);
            if (param1.e(1)) {
              var8 = ((r) this).field_b.b(param1.field_h);
              var9 = ((r) this).field_b.field_x + ((r) this).field_b.field_s;
              var10 = param1.field_r + param4;
              if (((r) this).field_a == 2) {
                L0: {
                  var10 = var10 + (param1.field_k + -var8);
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) == -3) {
                    var11 = var11 + (param1.field_m + -var9);
                    break L0;
                  } else {
                    if (1 != ((r) this).field_e) {
                      break L0;
                    } else {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    }
                  }
                }
                ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                return;
              } else {
                if (-2 == (((r) this).field_a ^ -1)) {
                  var10 = var10 + (-var8 + param1.field_k >> -2044717503);
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) != -3) {
                    if (1 == ((r) this).field_e) {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    } else {
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    }
                  } else {
                    var11 = var11 + (param1.field_m + -var9);
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  }
                } else {
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) != -3) {
                    if (1 == ((r) this).field_e) {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    } else {
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    }
                  } else {
                    var11 = var11 + (param1.field_m + -var9);
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var7 = 3249872;
            int discarded$4 = ((r) this).field_b.a("<u=" + Integer.toString(var7, 16) + ">" + param1.field_h + "</u>", param4 - -param1.field_r, param1.field_i + param0, param1.field_k, param1.field_m, var7, -1, ((r) this).field_a, ((r) this).field_e, ((r) this).field_b.field_s - -((r) this).field_b.field_x);
            if (param1.e(1)) {
              var8 = ((r) this).field_b.b(param1.field_h);
              var9 = ((r) this).field_b.field_x + ((r) this).field_b.field_s;
              var10 = param1.field_r + param4;
              if (((r) this).field_a == 2) {
                var10 = var10 + (param1.field_k + -var8);
                var11 = param1.field_i + param0;
                if ((((r) this).field_e ^ -1) != -3) {
                  if (1 != ((r) this).field_e) {
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  } else {
                    var11 = var11 + (param1.field_m + -var9 >> 205989569);
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  }
                } else {
                  var11 = var11 + (param1.field_m + -var9);
                  ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                  return;
                }
              } else {
                if (-2 == (((r) this).field_a ^ -1)) {
                  var10 = var10 + (-var8 + param1.field_k >> -2044717503);
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) != -3) {
                    if (1 != ((r) this).field_e) {
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    } else {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    }
                  } else {
                    var11 = var11 + (param1.field_m + -var9);
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  }
                } else {
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) != -3) {
                    if (1 == ((r) this).field_e) {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    } else {
                      ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                      return;
                    }
                  } else {
                    var11 = var11 + (param1.field_m + -var9);
                    ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          var7 = 3249872;
          int discarded$5 = ((r) this).field_b.a("<u=" + Integer.toString(var7, 16) + ">" + param1.field_h + "</u>", param4 - -param1.field_r, param1.field_i + param0, param1.field_k, param1.field_m, var7, -1, ((r) this).field_a, ((r) this).field_e, ((r) this).field_b.field_s - -((r) this).field_b.field_x);
          if (param1.e(1)) {
            var8 = ((r) this).field_b.b(param1.field_h);
            var9 = ((r) this).field_b.field_x + ((r) this).field_b.field_s;
            var10 = param1.field_r + param4;
            if (((r) this).field_a == 2) {
              var10 = var10 + (param1.field_k + -var8);
              var11 = param1.field_i + param0;
              if ((((r) this).field_e ^ -1) != -3) {
                if (1 == ((r) this).field_e) {
                  var11 = var11 + (param1.field_m + -var9 >> 205989569);
                  ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                  return;
                } else {
                  ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                  return;
                }
              } else {
                var11 = var11 + (param1.field_m + -var9);
                ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                return;
              }
            } else {
              if (-2 != (((r) this).field_a ^ -1)) {
                L1: {
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) == -3) {
                    var11 = var11 + (param1.field_m + -var9);
                    break L1;
                  } else {
                    if (1 != ((r) this).field_e) {
                      break L1;
                    } else {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      break L1;
                    }
                  }
                }
                ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                return;
              } else {
                L2: {
                  var10 = var10 + (-var8 + param1.field_k >> -2044717503);
                  var11 = param1.field_i + param0;
                  if ((((r) this).field_e ^ -1) == -3) {
                    var11 = var11 + (param1.field_m + -var9);
                    break L2;
                  } else {
                    if (1 != ((r) this).field_e) {
                      break L2;
                    } else {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      break L2;
                    }
                  }
                }
                ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public r() {
        ((r) this).field_e = 1;
        ((r) this).field_b = sg.field_a;
        ((r) this).field_a = 1;
    }

    r(tj param0, int param1, int param2) {
        ((r) this).field_b = param0;
        ((r) this).field_e = param2;
        ((r) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
