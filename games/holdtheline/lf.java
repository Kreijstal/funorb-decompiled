/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    int field_h;
    int[] field_c;
    static e field_b;
    static int field_l;
    static String[] field_f;
    static String[] field_j;
    static int field_g;
    int field_k;
    static String field_d;
    static String[] field_i;
    static hj[] field_a;
    static hj field_e;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (null != ((lf) this).field_c) {
            // ifeq L24
        } else {
            return 0;
        }
        if (param1 != 1800174305) {
            int discarded$0 = ((lf) this).a((byte) -113);
        }
        for (var3 = 1; var3 < ((lf) this).field_c.length; var3++) {
            if (param0 < ((lf) this).field_c[var3] + ((lf) this).field_c[-1 + var3] >> 1800174305) {
                return var3 - 1;
            }
        }
        return -1 + ((lf) this).field_c.length;
    }

    final static void a(ei param0, ei param1, ei param2, ei param3, wd[] param4, ei param5, int param6) {
        qm var8 = null;
        qm var9 = null;
        qm var10 = null;
        qm var11 = null;
        qm var12 = null;
        int var13 = 0;
        wd var14 = null;
        Object var16_ref = null;
        int var16 = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        float var19_float = 0.0f;
        qm var19 = null;
        float var20_float = 0.0f;
        int var20 = 0;
        qm var21 = null;
        qm var22 = null;
        qm var23 = null;
        qm var24 = null;
        qm var25 = null;
        int var26 = 0;
        qm var27 = null;
        qm var28 = null;
        qm var29 = null;
        qm var30 = null;
        qm var31 = null;
        int var32 = 0;
        wd var33 = null;
        Object var34 = null;
        hn var34_ref = null;
        lb var35 = null;
        lb var36 = null;
        lb var37 = null;
        lb var38 = null;
        lb var39 = null;
        lb var40 = null;
        lb var41 = null;
        lb var42 = null;
        lb var43 = null;
        lb var44 = null;
        Object var45 = null;
        dd var45_ref = null;
        qm var46 = null;
        qm var48 = null;
        qm var49 = null;
        qm var50 = null;
        qm var51 = null;
        L0: {
          var34 = null;
          var45 = null;
          var32 = HoldTheLine.field_D;
          var33 = param4[param4.length - 1];
          var8 = var33.h(7560980);
          var9 = var33.l(8421504);
          var10 = var33.a((byte) 29);
          var11 = var33.m(-14);
          var12 = var33.a(0);
          if (param6 <= -33) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var13 = 0;
        L1: while (true) {
          L2: {
            if (param4.length <= var13) {
              break L2;
            } else {
              L3: {
                L4: {
                  var14 = param4[var13];
                  if (var14 instanceof dd) {
                    break L4;
                  } else {
                    var34_ref = (hn) (Object) var14;
                    var16_ref = null;
                    var17 = var34_ref.f(50);
                    var18_int = (int)(var17 / 5.0f) - -1;
                    var19_float = 1.0f / (float)var18_int;
                    var20_float = var19_float;
                    var21 = var8;
                    var22 = var9;
                    var23 = var10;
                    var24 = var11;
                    var25 = var12;
                    var26 = 0;
                    L5: while (true) {
                      L6: {
                        if (var26 >= -1 + var18_int) {
                          break L6;
                        } else {
                          var27 = var34_ref.a(var20_float, 255);
                          var28 = var34_ref.a(var20_float, false);
                          var29 = var34_ref.c(var20_float, 105);
                          var30 = var34_ref.a(-851, var20_float);
                          var31 = var34_ref.a(false, var20_float);
                          var35 = new lb(var21, var27, var34_ref.field_k, var34_ref.field_w, var34_ref.field_t);
                          var20_float = var20_float + var19_float;
                          param2.a((Object) (Object) var35, (byte) 6);
                          var36 = new lb(var22, var29, var34_ref.field_k, var34_ref.field_m, var34_ref.field_t);
                          param5.a((Object) (Object) var36, (byte) 6);
                          var37 = new lb(var23, var28, var34_ref.field_k, var34_ref.field_s, var34_ref.field_q);
                          param0.a((Object) (Object) var37, (byte) 6);
                          var38 = new lb(var24, var30, var34_ref.field_k, var34_ref.field_x, var34_ref.field_q);
                          param1.a((Object) (Object) var38, (byte) 6);
                          var39 = new lb(var25, var31, var34_ref.field_k, true, true);
                          var22 = var29;
                          var23 = var28;
                          var25 = var31;
                          var21 = var27;
                          var24 = var30;
                          param3.a((Object) (Object) var39, (byte) 6);
                          var26++;
                          if (0 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var40 = new lb(var21, var34_ref.h(7560980), var34_ref.field_k, var34_ref.field_w, var34_ref.field_t);
                      param2.a((Object) (Object) var40, (byte) 6);
                      var41 = new lb(var22, var34_ref.l(8421504), var34_ref.field_k, var34_ref.field_m, var34_ref.field_t);
                      param5.a((Object) (Object) var41, (byte) 6);
                      var42 = new lb(var23, var34_ref.a((byte) 29), var34_ref.field_k, var34_ref.field_s, var34_ref.field_q);
                      param0.a((Object) (Object) var42, (byte) 6);
                      var43 = new lb(var24, var34_ref.m(-14), var34_ref.field_k, var34_ref.field_x, var34_ref.field_q);
                      param1.a((Object) (Object) var43, (byte) 6);
                      var44 = new lb(var25, var34_ref.a(0), var34_ref.field_k, true, true);
                      param3.a((Object) (Object) var44, (byte) 6);
                      var8 = var34_ref.h(7560980);
                      var9 = var34_ref.l(8421504);
                      var10 = var34_ref.a((byte) 29);
                      var11 = var34_ref.m(-14);
                      var12 = var34_ref.a(0);
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    var45_ref = (dd) (Object) var14;
                    param3.a((Object) (Object) new lb(var12, var45_ref.field_P, var45_ref.field_k, true, true), (byte) 6);
                    var12 = var45_ref.field_P;
                    if (var45_ref.field_N == var45_ref.field_O) {
                      break L8;
                    } else {
                      var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                      var17 = 1.0f / (float)var16;
                      var18 = var17;
                      var19 = var8;
                      var20 = 1;
                      L9: while (true) {
                        L10: {
                          if (var16 <= var20) {
                            break L10;
                          } else {
                            var46 = var45_ref.a(var18, 255);
                            var8 = var46;
                            param2.a((Object) (Object) new lb(var19, var46, var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var46;
                            var20++;
                            if (0 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (0 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  param2.a((Object) (Object) new lb(var8, var45_ref.h(7560980), var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
                  var8 = var45_ref.h(7560980);
                  break L7;
                }
                L11: {
                  if (var45_ref.field_L != var45_ref.field_K) {
                    var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                    var17 = 1.0f / (float)var16;
                    var18 = var17;
                    var19 = var9;
                    var20 = 1;
                    L12: while (true) {
                      if (var16 <= var20) {
                        break L11;
                      } else {
                        var50 = var45_ref.c(var18, 124);
                        param5.a((Object) (Object) new lb(var19, var50, var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                        var18 = var18 + var17;
                        var19 = var50;
                        var20++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                  } else {
                    param5.a((Object) (Object) new lb(var9, var45_ref.l(8421504), var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                    var9 = var45_ref.l(8421504);
                    if (0 == 0) {
                      break L11;
                    } else {
                      var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                      var17 = 1.0f / (float)var16;
                      var18 = var17;
                      var19 = var9;
                      var20 = 1;
                      L13: while (true) {
                        if (var16 <= var20) {
                          break L11;
                        } else {
                          var51 = var45_ref.c(var18, 124);
                          param5.a((Object) (Object) new lb(var19, var51, var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                          var18 = var18 + var17;
                          var19 = var51;
                          var20++;
                          if (0 == 0) {
                            continue L13;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  L15: {
                    if (var45_ref.field_C != var45_ref.field_I) {
                      break L15;
                    } else {
                      param0.a((Object) (Object) new lb(var10, var45_ref.a((byte) 29), var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                      var10 = var45_ref.a((byte) 29);
                      if (0 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                  var17 = 1.0f / (float)var16;
                  var18 = var17;
                  var19 = var10;
                  var20 = 1;
                  L16: while (true) {
                    if (var16 <= var20) {
                      break L14;
                    } else {
                      var48 = var45_ref.a(var18, false);
                      param0.a((Object) (Object) new lb(var19, var48, var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                      var18 = var18 + var17;
                      var19 = var48;
                      var20++;
                      if (0 == 0) {
                        continue L16;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (var45_ref.field_z == var45_ref.field_A) {
                    break L17;
                  } else {
                    var16 = (int)(var45_ref.f(50) / 5.0f) + 1;
                    var17 = 1.0f / (float)var16;
                    var18 = var17;
                    var19 = var11;
                    var20 = 1;
                    L18: while (true) {
                      L19: {
                        if (var16 <= var20) {
                          break L19;
                        } else {
                          var49 = var45_ref.a(-851, var18);
                          var11 = var49;
                          param1.a((Object) (Object) new lb(var19, var49, var45_ref.field_k, var45_ref.field_x, var45_ref.field_q), (byte) 6);
                          var18 = var18 + var17;
                          var19 = var49;
                          var20++;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                param1.a((Object) (Object) new lb(var11, var45_ref.m(-14), var45_ref.field_k, var45_ref.field_x, var45_ref.field_q), (byte) 6);
                var11 = var45_ref.m(-14);
                break L3;
              }
              var13++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return;
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -100) {
          L0: {
            L1: {
              if (((lf) this).field_c == null) {
                break L1;
              } else {
                if (0 != ((lf) this).field_c.length) {
                  stackOut_6_0 = ((lf) this).field_c[-1 + ((lf) this).field_c.length];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -89;
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 != 5) {
            lf.b((byte) 11);
        }
        field_b = null;
        field_i = null;
    }

    lf(int param0, int param1, int param2) {
        ((lf) this).field_c = new int[param2 - -1];
        ((lf) this).field_h = param0;
        ((lf) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new e(4, 1, 1, 1);
        field_f = new String[]{null, "<col=2>You must win the Classic championship to unlock.</col>", "<col=2>You must win the Desert championship to unlock.</col>", "<col=2>You must win the Alpine championship to unlock.</col>"};
        field_g = 64;
        field_d = "Dune Buggy";
        field_i = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_j = new String[]{"Complete all Championships", "Complete all Championships, with a total time less than 36 minutes, 30 seconds", "Complete all Classic courses,<br>with a total time less than<br>7 minutes, 30 seconds", "Complete all Alpine courses,<br>with a total time less than<br>9 minutes, 40 seconds", "Complete all Desert courses,<br>with a total time less than<br>10 minutes, 10 seconds", "Complete all Night courses, with a total time less than<br>11 minutes, 20 seconds", "Complete three consecutive laps without hitting a wall on any Desert, Alpine or Night course", "Complete three consecutive laps without leaving the track on any Desert, Alpine or Night course", "Win a race, collecting<br>only red powerups", "Win a race, collecting<br>only green powerups", "Win a race, collecting<br>only blue powerups", "Win a race, collecting<br>no powerups", "Win a race, having been in last place when entering the final lap", "Hit three opponents with one missile", "Gain a two-lap lead over your closest competitor", "Win a Demolition match during Hallowe'en by killing 500 zombies... again"};
    }
}
